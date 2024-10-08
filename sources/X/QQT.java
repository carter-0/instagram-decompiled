package X;

import android.content.Context;
import android.content.ServiceConnection;
import java.util.concurrent.atomic.AtomicReference;

public final class QQT extends SJG {
    public final Context A00;
    public final ServiceConnection A01 = new SVZ(this, 0);
    public final SBK A02;
    public final C10214RoV A03 = new C10214RoV(this);
    public final C10806RyS A04;
    public final C13771Tgk A05;
    public final AtomicReference A06 = new AtomicReference();

    public static final void A00(QQT qqt) {
        qqt.A05(RE5.UNKNOWN, C8896REo.FAILED_INSTALL, "FAILED_INSTALL", C8951RIq.ERROR_SERVICE_UNAVAILABLE.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QQT(Context context, C10806RyS ryS) {
        super(context, ryS, "digital_turbine_store");
        String packageName = context.getPackageName();
        0qQ.A07(packageName);
        C10317RqF rqF = ryS.A04;
        SBK sbk = SBK.A00;
        QQR qqr = new QQR(sbk, rqF, packageName);
        0qQ.A0B(sbk, 4);
        this.A00 = context;
        this.A04 = ryS;
        this.A05 = qqr;
        this.A02 = sbk;
        this.A00 = 0;
    }
}
