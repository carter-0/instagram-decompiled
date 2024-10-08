package X;

import android.view.View;

/* renamed from: X.3B9  reason: invalid class name */
public final class AnonymousClass3B9 {
    public int A00;
    public int A01;
    public AnonymousClass3BB A02;
    public boolean A03;
    public boolean A04;

    public final void A00() {
        this.A01 = -1;
        this.A00 = AnonymousClass972.MUTABLE_FLAG_MASK;
        this.A03 = false;
        this.A04 = false;
    }

    public final void A01(View view, int i) {
        int min;
        int A0D;
        int A012 = this.A02.A01();
        if (A012 >= 0) {
            boolean z = this.A03;
            AnonymousClass3BB r0 = this.A02;
            if (z) {
                A0D = r0.A08(view) + this.A02.A01();
            } else {
                A0D = r0.A0D(view);
            }
            this.A00 = A0D;
            this.A01 = i;
            return;
        }
        this.A01 = i;
        boolean z2 = this.A03;
        AnonymousClass3BB r02 = this.A02;
        if (z2) {
            int A032 = (r02.A03() - A012) - this.A02.A08(view);
            this.A00 = this.A02.A03() - A032;
            if (A032 > 0) {
                int A0B = this.A00 - this.A02.A0B(view);
                int A06 = this.A02.A06();
                int min2 = A0B - (A06 + Math.min(this.A02.A0D(view) - A06, 0));
                if (min2 < 0) {
                    min = this.A00 + Math.min(A032, -min2);
                } else {
                    return;
                }
            } else {
                return;
            }
        } else {
            int A0D2 = r02.A0D(view);
            int A062 = A0D2 - this.A02.A06();
            this.A00 = A0D2;
            if (A062 > 0) {
                int A033 = (this.A02.A03() - Math.min(0, (this.A02.A03() - A012) - this.A02.A08(view))) - (A0D2 + this.A02.A0B(view));
                if (A033 < 0) {
                    min = this.A00 - Math.min(A062, -A033);
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.A00 = min;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C66579MXk.A00(480));
        sb.append(this.A01);
        sb.append(C66579MXk.A00(436));
        sb.append(this.A00);
        sb.append(C66579MXk.A00(437));
        sb.append(this.A03);
        sb.append(", mValid=");
        sb.append(this.A04);
        sb.append('}');
        return sb.toString();
    }

    public AnonymousClass3B9() {
        A00();
    }
}
