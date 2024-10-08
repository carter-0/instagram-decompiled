package X;

import android.content.Context;
import android.graphics.Rect;
import java.lang.ref.WeakReference;

/* renamed from: X.IcI  reason: case insensitive filesystem */
public final class C57530IcI implements AnonymousClass2hP {
    public final WeakReference A00;

    public final boolean CFf(Rect rect, Rect rect2, Rect rect3) {
        boolean A1b = C51973G9u.A1b(rect, rect2, rect3);
        C268064ch r7 = (C268064ch) this.A00.get();
        if (r7 != null && r7.COx()) {
            AnonymousClass5VN CgV = C289425dZ.A02(r7).CgV(r7, A1b);
            float f = CgV.A01;
            float f2 = CgV.A02;
            if (f < f2) {
                float f3 = CgV.A03;
                float f4 = CgV.A00;
                if (f3 < f4) {
                    rect.set(AnonymousClass1GB.A01(f), AnonymousClass1GB.A01(f3), AnonymousClass1GB.A01(f2), AnonymousClass1GB.A01(f4));
                    if (rect.intersect(rect3)) {
                        int i = rect.left;
                        int i2 = rect.top;
                        long Bwh = r7.Bwh();
                        rect2.set(i, i2, i + C51965G9l.A04(Bwh), C289005cr.A00(Bwh) + i2);
                        return A1b;
                    }
                }
            }
            rect.setEmpty();
            rect2.setEmpty();
        }
        return false;
    }

    public final Context getContext() {
        return null;
    }

    public C57530IcI(C268064ch r2) {
        this.A00 = C51965G9l.A0v(r2);
    }
}
