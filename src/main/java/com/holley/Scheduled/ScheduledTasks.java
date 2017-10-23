package com.holley.Scheduled;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2017/10/23.
 */
@Component
public class ScheduledTasks {
    //输出时间格式
    private static final SimpleDateFormat format = new SimpleDateFormat("HH(hh):mm:ss S");

//    @Scheduled 的介绍
//    1. cron 表达式与 zone
//    zone：表示将解析cron表达式的时区。
//    关于 cron 表达式，可以参考一下 http://blog.csdn.net/u011244202/article/details/54382466 里面的附录。
//    2. fixedRate 的解释
//    调用固定周期（以毫秒为单位）执行方法。就是上一次开始执行时间点之后延迟执行。
//
//    3. fixedDelay 的解释
//    上次调用结束和下一次调用结束之间的固定周期（以毫秒为单位）执行方法。就是上一次执行完毕时间点之后延迟执行。
//    4. initialDelay 的解释
//    在第一次执行fixedRate（）或fixedDelay（）任务之前延迟（以毫秒为单位）

    @Scheduled(initialDelay = 5000, fixedRate = 5000)
    public void firstScheduledTasks(){
        System.out.println("定时任务执行，现在时间是 : "+format.format(new Date()));
    }
}
