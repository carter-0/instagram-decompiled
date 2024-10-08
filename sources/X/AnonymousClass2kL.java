package X;

import java.util.Locale;

/* renamed from: X.2kL  reason: invalid class name */
public final class AnonymousClass2kL {
    public 0k8 A00;
    public boolean A01 = true;
    public final 02m A02;
    public final String A03;

    public AnonymousClass2kL(02m r2, String str) {
        0qQ.A0B(str, 2);
        this.A03 = str;
        this.A02 = r2;
    }

    public static final void A00(AnonymousClass2kL r3, Integer num) {
        if (r3.A01) {
            String lowerCase = C227932kN.A00(num).toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            String A0R = 002.A0R(lowerCase, "_end");
            02m r2 = r3.A02;
            if (r2 != null) {
                r2.markerPoint(694561158, A0R);
            }
            0k8 r0 = r3.A00;
            if (r0 != null) {
                r0.CmM(A0R);
            }
            if (num == AnonymousClass05K.A0Y) {
                if (r2 != null) {
                    r2.markerEnd(694561158, 2);
                }
                r3.A01 = false;
            }
        }
    }

    public static final void A01(AnonymousClass2kL r4, Integer num) {
        02m r3;
        if (r4.A01) {
            if (num == AnonymousClass05K.A00 && (r3 = r4.A02) != null) {
                r3.markerStart(694561158);
                r3.markerAnnotate(694561158, "fragment", r4.A03);
                r3.markerAnnotate(694561158, "version", 1);
            }
            String lowerCase = C227932kN.A00(num).toLowerCase(Locale.ROOT);
            0qQ.A07(lowerCase);
            String A0R = 002.A0R(lowerCase, "_start");
            02m r1 = r4.A02;
            if (r1 != null) {
                r1.markerPoint(694561158, A0R);
            }
            0k8 r0 = r4.A00;
            if (r0 != null) {
                r0.CmM(A0R);
            }
        }
    }
}
