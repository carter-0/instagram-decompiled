package X;

import java.util.List;

/* renamed from: X.5bm  reason: invalid class name and case insensitive filesystem */
public final class C288355bm {
    public C268064ch A00;
    public Integer A01;
    public final /* synthetic */ C288335bk A02;

    public C288355bm(C288335bk r2) {
        this.A02 = r2;
        this.A01 = AnonymousClass05K.A00;
    }

    public static final void A00(C304926Ft r7, C288355bm r8) {
        boolean z;
        List list = r7.A03;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                z = false;
                break;
            } else if (((GPU) list.get(i)).A02()) {
                z = true;
                break;
            } else {
                i++;
            }
        }
        if (z) {
            if (r8.A01 == AnonymousClass05K.A01) {
                C268064ch r2 = r8.A00;
                if (r2 != null) {
                    HRT.A00(r7, new AnonymousClass9L6(r8.A02, 47), r2.CgY(0), true);
                } else {
                    throw new IllegalStateException("layoutCoordinates not set");
                }
            }
            r8.A01 = AnonymousClass05K.A0C;
            return;
        }
        C268064ch r22 = r8.A00;
        if (r22 != null) {
            long CgY = r22.CgY(0);
            C288335bk r4 = r8.A02;
            HRT.A00(r7, new C377469Ly(12, (Object) r4, (Object) r8), CgY, false);
            if (r8.A01 == AnonymousClass05K.A01) {
                int size2 = list.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((GPU) list.get(i2)).A01();
                }
                GPV gpv = r7.A02;
                if (gpv != null) {
                    gpv.A00 = !r4.A02;
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("layoutCoordinates not set");
    }

    public C288355bm() {
    }
}
