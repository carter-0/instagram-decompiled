package X;

import android.os.Handler;

/* renamed from: X.7rq  reason: invalid class name and case insensitive filesystem */
public abstract class C344427rq {
    public static final Handler A00(C343837qt r5) {
        String str;
        Handler handler = (Handler) r5.Apu(C343737qi.A0I);
        if (handler != null) {
            return handler;
        }
        C343917r1 Apf = r5.Apf(C343927r2.A00);
        0qQ.A07(Apf);
        C343927r2 r4 = (C343927r2) Apf;
        if (0qQ.A0K(r5.Apu(C343737qi.A0K), true)) {
            str = "Lite-Urgent-SurfacePipe-Thread";
            C343897qz.A01().A00(str, -8);
        } else {
            str = "Lite-SurfacePipe-Thread";
        }
        if (0qQ.A0K(r5.Apu(C343737qi.A0M), true)) {
            str = 002.A0O("OC-", r5.hashCode());
            C343897qz.A01().A00(str, 0);
        }
        Handler BAM = r4.BAM(str);
        0qQ.A07(BAM);
        return BAM;
    }
}
