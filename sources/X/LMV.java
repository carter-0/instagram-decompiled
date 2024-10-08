package X;

import java.util.concurrent.atomic.AtomicBoolean;

public final class LMV {
    public final AtomicBoolean A00 = JTQ.A0k();
    public final /* synthetic */ AnonymousClass7T4 A01;
    public final /* synthetic */ Integer A02;

    public LMV(AnonymousClass7T4 r2, Integer num) {
        this.A01 = r2;
        this.A02 = num;
    }

    public static final void A00(LMV lmv, String str) {
        String str2;
        if (!lmv.A00.getAndSet(true)) {
            02m r3 = lmv.A01.A01;
            if (lmv.A02.intValue() != 0) {
                str2 = "assets_download";
            } else {
                str2 = "artefacts_request";
            }
            r3.markerPoint(125763585, 002.A0R(str2, "_end"), DbV.A12(str));
        }
    }
}
