package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;

/* renamed from: X.QvW  reason: case insensitive filesystem */
public final class C8484QvW extends C8492Qve {
    public Integer A00;
    public boolean A01;
    public boolean A02;
    public final AlarmManager A03 = ((AlarmManager) this.A00.A00.getSystemService("alarm"));

    public final void A0K() {
        this.A02 = false;
        AlarmManager alarmManager = this.A03;
        Context context = this.A00.A00;
        alarmManager.cancel(PendingIntent.getBroadcast(context, 0, Pxe.A0G("com.google.android.gms.analytics.ANALYTICS_DISPATCH").setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsReceiver")), 0));
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        Integer num = this.A00;
        if (num == null) {
            num = Integer.valueOf(Pxh.A0l("analytics", context.getPackageName()).hashCode());
            this.A00 = num;
        }
        int intValue = num.intValue();
        A0E("Cancelling job. JobID", Integer.valueOf(intValue));
        jobScheduler.cancel(intValue);
    }

    public C8484QvW(C11381SQt sQt) {
        super(sQt);
    }
}
