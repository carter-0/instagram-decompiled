package X;

import android.graphics.PointF;
import android.view.View;

/* renamed from: X.2le  reason: invalid class name and case insensitive filesystem */
public class C228422le extends C228432lf {
    public AnonymousClass3BB A00;
    public AnonymousClass3BB A01;

    public int A02(C252553pI r14, int i, int i2) {
        AnonymousClass3BB r8;
        PointF AIp;
        int A0U = r14.A0U();
        if (A0U != 0) {
            if (r14.A1Y()) {
                r8 = this.A01;
                if (r8 == null || r8.A02 != r14) {
                    r8 = new C238673Cy(r14);
                    this.A01 = r8;
                }
            } else if (r14.A1X()) {
                r8 = this.A00;
                if (r8 == null || r8.A02 != r14) {
                    r8 = new AnonymousClass3BC(r14);
                    this.A00 = r8;
                }
            }
            int i3 = AnonymousClass972.MUTABLE_FLAG_MASK;
            int i4 = Integer.MAX_VALUE;
            int A0T = r14.A0T();
            View view = null;
            View view2 = null;
            for (int i5 = 0; i5 < A0T; i5++) {
                View A0X = r14.A0X(i5);
                if (A0X != null) {
                    int A0D = (r8.A0D(A0X) + (r8.A0B(A0X) / 2)) - (r8.A06() + (r8.A07() / 2));
                    if (A0D <= 0) {
                        if (A0D > i3) {
                            view2 = A0X;
                            i3 = A0D;
                        }
                        if (A0D < 0) {
                        }
                    }
                    if (A0D < i4) {
                        view = A0X;
                        i4 = A0D;
                    }
                }
            }
            boolean z = true;
            if (!r14.A1X() ? i2 <= 0 : i <= 0) {
                z = false;
            }
            if (z) {
                if (view != null) {
                    return C252553pI.A06(view);
                }
                view = view2;
            } else if (view2 != null) {
                return C252553pI.A06(view2);
            }
            if (view != null) {
                int A06 = C252553pI.A06(view);
                int A0U2 = r14.A0U();
                boolean z2 = false;
                if ((r14 instanceof C252563pJ) && (AIp = ((C252563pJ) r14).AIp(A0U2 - 1)) != null && (AIp.x < 0.0f || AIp.y < 0.0f)) {
                    z2 = true;
                }
                int i6 = 1;
                if (z2 == z) {
                    i6 = -1;
                }
                int i7 = A06 + i6;
                if (i7 < 0 || i7 >= A0U) {
                    return -1;
                }
                return i7;
            }
        }
        return -1;
    }

    public View A03(C252553pI r10) {
        AnonymousClass3BB r8;
        if (r10.A1Y()) {
            r8 = this.A01;
            if (r8 == null || r8.A02 != r10) {
                r8 = new C238673Cy(r10);
                this.A01 = r8;
            }
        } else if (!r10.A1X()) {
            return null;
        } else {
            r8 = this.A00;
            if (r8 == null || r8.A02 != r10) {
                r8 = new AnonymousClass3BC(r10);
                this.A00 = r8;
            }
        }
        int A0T = r10.A0T();
        View view = null;
        if (A0T == 0) {
            return null;
        }
        int A06 = r8.A06() + (r8.A07() / 2);
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0T; i2++) {
            View A0X = r10.A0X(i2);
            int abs = Math.abs((r8.A0D(A0X) + (r8.A0B(A0X) / 2)) - A06);
            if (abs < i) {
                view = A0X;
                i = abs;
            }
        }
        return view;
    }
}
