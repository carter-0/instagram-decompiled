package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9Yz  reason: invalid class name and case insensitive filesystem */
public final class C380649Yz extends C228432lf {
    public AnonymousClass3BB A00;
    public AnonymousClass3BB A01;
    public C252553pI A02;
    public C252553pI A03;
    public RecyclerView A04;
    public final int A05 = 1;
    public final int A06;

    public C380649Yz(int i) {
        this.A06 = i;
    }

    public final int[] A09(View view, C252553pI r8) {
        int[] iArr = new int[2];
        if (r8.A1X()) {
            AnonymousClass3BB r2 = this.A00;
            if (r2 == null || this.A02 != r8) {
                r2 = new AnonymousClass3BC(r8);
                this.A00 = r2;
                this.A02 = r8;
            }
            iArr[0] = (r2.A0D(view) - r2.A06()) - this.A06;
        } else {
            iArr[0] = 0;
        }
        if (r8.A1Y()) {
            AnonymousClass3BB r22 = this.A01;
            if (r22 == null || this.A03 != r8) {
                r22 = new C238673Cy(r8);
                this.A01 = r22;
                this.A03 = r8;
            }
            iArr[1] = (r22.A0D(view) - r22.A06()) - this.A06;
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    public final AnonymousClass52S A04(C252553pI r4) {
        if (!(r4 instanceof C252563pJ)) {
            return null;
        }
        return new C67603Mqb(this.A04.getContext(), this, 0);
    }

    public final void A07(RecyclerView recyclerView) {
        this.A04 = recyclerView;
        super.A07(recyclerView);
    }

    public final int A02(C252553pI r13, int i, int i2) {
        AnonymousClass3BB r9;
        int A062;
        boolean z;
        boolean z2;
        int i3;
        PointF AIp;
        int A0U = r13.A0U();
        if (A0U != 0) {
            boolean A1X = r13.A1X();
            if (A1X) {
                r9 = this.A00;
                if (r9 == null || this.A02 != r13) {
                    r9 = new AnonymousClass3BC(r13);
                    this.A00 = r9;
                    this.A02 = r13;
                }
            } else {
                r9 = this.A01;
                if (r9 == null || this.A03 != r13) {
                    r9 = new C238673Cy(r13);
                    this.A01 = r9;
                    this.A03 = r13;
                }
            }
            int A0T = r13.A0T();
            View view = null;
            if (A0T != 0) {
                int A063 = r9.A06();
                int i4 = Integer.MAX_VALUE;
                for (int i5 = 0; i5 < A0T; i5++) {
                    View A0X = r13.A0X(i5);
                    int A0D = r9.A0D(A0X);
                    int abs = Math.abs(A0D - A063);
                    if (A0D < A063 && abs < i4) {
                        view = A0X;
                        i4 = abs;
                    }
                }
                if (!(view == null || (A062 = C252553pI.A06(view)) == -1)) {
                    int i6 = 0;
                    if (!A1X ? i2 <= 0 : i <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (!(r13 instanceof C252563pJ) || (AIp = ((C252563pJ) r13).AIp(A0U - 1)) == null || (AIp.x >= 0.0f && AIp.y >= 0.0f)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z) {
                        if (r13 instanceof GridLayoutManager) {
                            int i7 = ((GridLayoutManager) r13).A00;
                            if (z2) {
                                i3 = (A062 - i7) / this.A05;
                            } else {
                                i3 = (A062 + i7) * this.A05;
                            }
                        } else {
                            int i8 = this.A05;
                            i3 = A062 + i8;
                            if (z2) {
                                i3 = A062 - i8;
                            }
                        }
                        A062 = i3;
                    }
                    if (A062 >= 0) {
                        i6 = A062;
                    }
                    if (i6 >= A0U) {
                        return A0U - 1;
                    }
                    return i6;
                }
            }
        }
        return -1;
    }

    public final View A03(C252553pI r9) {
        AnonymousClass3BB r7;
        if (r9.A1Y()) {
            r7 = this.A01;
            if (r7 == null || this.A03 != r9) {
                r7 = new C238673Cy(r9);
                this.A01 = r7;
                this.A03 = r9;
            }
        } else if (!r9.A1X()) {
            return null;
        } else {
            r7 = this.A00;
            if (r7 == null || this.A02 != r9) {
                r7 = new AnonymousClass3BC(r9);
                this.A00 = r7;
                this.A02 = r9;
            }
        }
        int A0T = r9.A0T();
        View view = null;
        if (A0T == 0) {
            return null;
        }
        int A062 = r7.A06();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < A0T; i2++) {
            View A0X = r9.A0X(i2);
            int abs = Math.abs(r7.A0D(A0X) - A062);
            if (abs < i) {
                view = A0X;
                i = abs;
            }
        }
        return view;
    }
}
