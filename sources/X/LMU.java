package X;

import java.util.concurrent.atomic.AtomicBoolean;

public final class LMU {
    public final AtomicBoolean A00 = JTQ.A0k();
    public final /* synthetic */ LD6 A01;
    public final /* synthetic */ Integer A02;

    public LMU(LD6 ld6, Integer num) {
        this.A01 = ld6;
        this.A02 = num;
    }

    public static final void A00(LMU lmu, String str) {
        String str2;
        if (!lmu.A00.getAndSet(true)) {
            02m r3 = lmu.A01.A01;
            if (lmu.A02.intValue() != 0) {
                str2 = "assets_download";
            } else {
                str2 = "artefacts_request";
            }
            r3.markerPoint(1064965959, 002.A0R(str2, "_end"), DbV.A12(str));
        }
    }
}
