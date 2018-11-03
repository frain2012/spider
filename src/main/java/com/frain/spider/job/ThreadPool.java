/**
 * @Title: ThreadPool
 * @Package com.frain.spider.job
 */
package com.frain.spider.job;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @Description: TODO(线程池)
 * @author frain.gui
 * @create 2018/9/3 16:52
 * @version v1.0
 */
public class ThreadPool {
    private static ExecutorService threadpool;

    static {
        threadpool = Executors.newCachedThreadPool();
    }

    public void execute(Runnable runnable){
        threadpool.execute(runnable);
    }

    public Future submit(Runnable runnable){
        return threadpool.submit(runnable);
    }
}
