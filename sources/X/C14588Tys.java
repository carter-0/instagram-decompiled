package X;

import android.view.View;

/* renamed from: X.Tys  reason: case insensitive filesystem */
public final class C14588Tys {
    public final int A00;
    public final C360308eN A01;

    public final int A01(int i) {
        C360308eN r0;
        C360308eN r5 = new C360308eN(i);
        int i2 = this.A00;
        C360308eN r3 = new C360308eN(i2);
        C360308eN r02 = this.A01;
        if (r02 == null) {
            r0 = null;
        } else {
            int i3 = r02.A00;
            int i4 = i2 ^ AnonymousClass972.MUTABLE_FLAG_MASK;
            int i5 = Integer.MIN_VALUE ^ i3;
            if (i4 != i5 && i4 < i5) {
                i2 = i3;
            }
            r0 = new C360308eN(i2);
        }
        return ((C360308eN) C229632nm.A08(r5, r3, r0)).A00;
    }

    public final boolean A02() {
        C360308eN r0 = this.A01;
        if (r0 == null || this.A00 != r0.A00) {
            return false;
        }
        return true;
    }

    public C14588Tys(C360308eN r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final int A00() {
        int i;
        int i2;
        if (A02()) {
            i = this.A00;
            int i3 = AnonymousClass3XX.A00;
            i2 = SN3.MAX_SIGNED_POWER_OF_TWO;
        } else {
            C360308eN r0 = this.A01;
            if (r0 == null) {
                return AnonymousClass3XX.A00;
            }
            i = r0.A00;
            int i4 = AnonymousClass3XX.A00;
            i2 = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return View.MeasureSpec.makeMeasureSpec(i, i2);
    }
}
