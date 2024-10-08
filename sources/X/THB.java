package X;

import android.content.ComponentName;

public final class THB implements Runnable {
    public final /* synthetic */ ComponentName A00;
    public final /* synthetic */ SVX A01;

    public THB(ComponentName componentName, SVX svx) {
        this.A01 = svx;
        this.A00 = componentName;
    }

    public final void run() {
        C8487QvZ qvZ = this.A01.A02;
        ComponentName componentName = this.A00;
        C11200SFa.A00();
        if (qvZ.A00 != null) {
            qvZ.A00 = null;
            qvZ.A0E("Disconnected from device AnalyticsService", componentName);
            C8481QvT qvT = qvZ.A00.A06;
            C11381SQt.A02(qvT);
            qvT.A0J();
            C11200SFa.A00();
            C8490Qvc qvc = qvT.A00;
            C11200SFa.A00();
            qvc.A0J();
            ST5.A0B(qvc, "Service disconnected", 2);
        }
    }
}
