package com.wutian.springcloud;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

/**
 * @author telson
 */
public class NettyServer {
    private static final int PORT = 8888;

    public static void main(String[] args) throws InterruptedException {
        EventLoopGroup bossGroup; // 用于处理连接请求
        bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup; // 用于处理网络I/O操作
        workerGroup = new NioEventLoopGroup();

        try {
            ServerBootstrap b = new ServerBootstrap();
            b.group(bossGroup, workerGroup)
                    // 使用Nio传输
                    .channel(NioServerSocketChannel.class)
                    // 设置线程队列得到连接个数
                    .option(ChannelOption.SO_BACKLOG, 128)
                    // 设置保持活动连接状态
                    .childOption(ChannelOption.SO_KEEPALIVE, true)
                    .childHandler(new ChannelInitializer<SocketChannel>() {
                        @Override
                        protected void initChannel(SocketChannel ch) throws Exception {
                            ch.pipeline().addLast(new SimpleServerHandler()); // 添加自定义的处理器
                        }
                    });

            // 绑定端口，开始接收进来的连接
            ChannelFuture f = b.bind(PORT).sync();
            f.channel().closeFuture().sync(); // 等待直到服务器 Socket 被关闭
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }
}