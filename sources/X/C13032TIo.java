package X;

import android.graphics.Bitmap;
import java.util.Map;

/* renamed from: X.TIo  reason: case insensitive filesystem */
public final class C13032TIo implements Runnable {
    public final /* synthetic */ C53394GnR A00;
    public final /* synthetic */ AnonymousClass8MA A01;
    public final /* synthetic */ SOP A02;

    public C13032TIo(C53394GnR gnR, AnonymousClass8MA r2, SOP sop) {
        this.A02 = sop;
        this.A00 = gnR;
        this.A01 = r2;
    }

    public final void run() {
        C60340gF r0;
        AnonymousClass8MA r02 = this.A01;
        C53394GnR gnR = this.A00;
        try {
            r02.AWm(gnR);
            r0 = C60340gF.A00;
        } catch (Throwable th) {
            r0 = JTO.A1B(th);
        }
        SOP sop = this.A02;
        Throwable A002 = 0eR.A00(r0);
        if (A002 != null) {
            sop.A03.A01(AnonymousClass05K.A0j, (Integer) null, (Long) null, (String) null, (String) null, "Effect burning failed for Feed photo", A002, (Map) null, (Map) null);
        }
        SOP.A00((Bitmap) gnR.A01, sop, AnonymousClass05K.A0C, DbY.A0p("snapshot_type", "image", AnonymousClass7TE.A1L("capture_latency_ms", String.valueOf(0))), 0);
    }
}
