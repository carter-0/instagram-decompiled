package X;

import android.graphics.Rect;

/* renamed from: X.3d3  reason: invalid class name and case insensitive filesystem */
public final class C245523d3 {
    public boolean A00;
    public Rect A01;
    public final int A02;
    public final long A03;
    public final Rect A04;
    public final C245523d3 A05;

    public static void A00(C245523d3 r2) {
        if (r2.A01 == null) {
            r2.A01 = new Rect(r2.A04);
        }
    }

    public static void A01(C245523d3 r5, C245523d3 r6) {
        if (r6 != null) {
            Rect rect = r5.A04;
            Rect rect2 = r6.A04;
            boolean z = false;
            if (r5.A00) {
                r6.A00 = true;
                z = true;
            }
            if (rect.top < rect2.top) {
                A00(r6);
                rect2.top = rect.top;
                z = true;
            }
            if (rect.bottom > rect2.bottom) {
                A00(r6);
                rect2.bottom = rect.bottom;
                z = true;
            }
            if (rect.left < rect2.left) {
                A00(r6);
                rect2.left = rect.left;
                z = true;
            }
            if (rect.right > rect2.right) {
                A00(r6);
                rect2.right = rect.right;
            } else if (!z) {
                return;
            }
            A01(r6, r6.A05);
        }
    }

    public C245523d3(Rect rect, C245523d3 r3, int i, long j, boolean z) {
        this.A03 = j;
        this.A02 = i;
        this.A04 = new Rect(rect);
        this.A05 = r3;
        this.A00 = z;
        if (r3 != null) {
            A01(this, r3);
        }
    }
}
