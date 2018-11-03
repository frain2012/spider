/**
 * @Title: JobFactory
 * @Package com.frain.spider.job
 */
package com.frain.spider.job;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.JobBuilder.newJob;
import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.TriggerBuilder.newTrigger;

/**
 * @Description: TODO(job)
 * @author frain.gui
 * @create 2018/9/5 17:30
 * @version v1.0
 */
public class JobFactory {
    private static Scheduler scheduler;

    static {
        try{
            scheduler = StdSchedulerFactory.getDefaultScheduler();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void addJob(){
        JobDetail job = newJob(MpJob.class).withIdentity("job1", "group1").build();
        // Trigger the job to run now, and then repeat every 40 seconds
        Trigger trigger = newTrigger().withIdentity("trigger1", "group1").startNow().withSchedule(simpleSchedule().withIntervalInSeconds(40).repeatForever()).build();
        try {
            scheduler.scheduleJob(job, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public static void modifyJob(String jobKey){

    }

    public static void DeleteJob(String jobKey){

    }
}
