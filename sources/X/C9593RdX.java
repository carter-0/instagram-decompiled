package X;

import android.util.Pair;

/* renamed from: X.RdX  reason: case insensitive filesystem */
public abstract class C9593RdX {
    public static final C10570RuP A00(N4L n4l) {
        C53368Gms gms = (C53368Gms) n4l.A03;
        Pair A0K = Pxf.A0K(Integer.valueOf(gms.A01), gms.A00);
        C53368Gms gms2 = (C53368Gms) n4l.A02;
        Pair A0K2 = Pxf.A0K(Integer.valueOf(gms2.A01), gms2.A00);
        C53368Gms gms3 = (C53368Gms) n4l.A00;
        return new C10570RuP(Pxf.A0K(Integer.valueOf(gms3.A01), gms3.A00), A0K2, A0K);
    }
}
