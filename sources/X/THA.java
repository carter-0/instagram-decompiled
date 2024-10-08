package X;

import com.google.android.gms.internal.gtm.zzce;

public final class THA implements Runnable {
    public final /* synthetic */ SVX A00;
    public final /* synthetic */ zzce A01;

    public THA(SVX svx, zzce zzce) {
        this.A00 = svx;
        this.A01 = zzce;
    }

    public final void run() {
        C8487QvZ qvZ = this.A00.A02;
        C11200SFa.A00();
        qvZ.A0J();
        if (qvZ.A00 == null) {
            ST5.A0B(qvZ, "Connected to service after a timeout", 3);
            zzce zzce = this.A01;
            C11200SFa.A00();
            qvZ.A00 = zzce;
            C8487QvZ.A00(qvZ);
            C8481QvT qvT = qvZ.A00.A06;
            C11381SQt.A02(qvT);
            C11200SFa.A00();
            qvT.A00.A0K();
        }
    }
}
