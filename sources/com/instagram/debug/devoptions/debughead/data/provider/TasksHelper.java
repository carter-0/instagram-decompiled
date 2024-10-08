package com.instagram.debug.devoptions.debughead.data.provider;

import X.AnonymousClass7TF;
import android.os.Handler;
import com.instagram.debug.devoptions.debughead.data.delegates.TasksEventDelegate;

public class TasksHelper {
    public static final TasksHelper INSTANCE = new TasksHelper();
    public TasksEventDelegate mDelegate;
    public final Handler mHandler = AnonymousClass7TF.A0D();

    public static TasksHelper getInstance() {
        return INSTANCE;
    }

    public void updateQueueSize(final int i) {
        final TasksEventDelegate tasksEventDelegate = this.mDelegate;
        if (tasksEventDelegate != null) {
            this.mHandler.post(new Runnable() {
                public void run() {
                    tasksEventDelegate.onTasksQueueSizeUpdated(i);
                }
            });
        }
    }

    public void setDelegate(TasksEventDelegate tasksEventDelegate) {
        this.mDelegate = tasksEventDelegate;
    }
}
