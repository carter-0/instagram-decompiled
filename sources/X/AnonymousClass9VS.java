package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.9VS  reason: invalid class name */
public final class AnonymousClass9VS {
    public C299205uk A00;
    public C299205uk A01;
    public Float A02;
    public Integer A03;

    public final int[] A03(View view, C252553pI r7) {
        int[] iArr = new int[2];
        if (r7.A1X()) {
            C299205uk r1 = this.A00;
            if (r1 == null || r1.A01 != r7) {
                r1 = new C299205uk(new AnonymousClass3BC(r7), r7);
                this.A00 = r1;
            }
            AnonymousClass3BB r0 = r1.A00;
            iArr[0] = A00(view, r0) - A01(r0, r7);
        } else {
            iArr[0] = 0;
        }
        if (r7.A1Y()) {
            C299205uk r12 = this.A01;
            if (r12 == null || r12.A01 != r7) {
                r12 = new C299205uk(new C238673Cy(r7), r7);
                this.A01 = r12;
            }
            AnonymousClass3BB r02 = r12.A00;
            iArr[1] = A00(view, r02) - A01(r02, r7);
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    private int A00(View view, AnonymousClass3BB r6) {
        Integer num = this.A03;
        int intValue = num.intValue();
        if (intValue == 0) {
            return r6.A0D(view);
        }
        if (intValue == 1) {
            return r6.A0D(view) + (r6.A0B(view) / 2);
        }
        if (intValue == 2) {
            return r6.A08(view);
        }
        throw AnonymousClass7TF.A0W("Invalid gravity :", C16922VAz.A00(num));
    }

    private int A01(AnonymousClass3BB r4, C252553pI r5) {
        int i;
        Integer num = this.A03;
        int intValue = num.intValue();
        if (intValue == 0) {
            Float f = this.A02;
            RecyclerView recyclerView = r5.A07;
            if (recyclerView == null || !recyclerView.A0O) {
                return 0;
            }
            return r4.A06() + Math.round(f.floatValue());
        } else if (intValue == 1) {
            RecyclerView recyclerView2 = r5.A07;
            if (recyclerView2 == null || !recyclerView2.A0O) {
                i = 0;
            } else {
                i = r4.A06();
            }
            return i + (r4.A07() / 2);
        } else if (intValue == 2) {
            RecyclerView recyclerView3 = r5.A07;
            if (recyclerView3 == null || !recyclerView3.A0O) {
                return r4.A02();
            }
            return r4.A03();
        } else {
            throw AnonymousClass7TF.A0W("Invalid gravity :", C16922VAz.A00(num));
        }
    }

    public final View A02(C252553pI r9) {
        C299205uk r1;
        if (r9.A1X()) {
            r1 = this.A00;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C299205uk(new AnonymousClass3BC(r9), r9);
                this.A00 = r1;
            }
        } else {
            r1 = this.A01;
            if (r1 == null || r1.A01 != r9) {
                r1 = new C299205uk(new C238673Cy(r9), r9);
                this.A01 = r1;
            }
        }
        AnonymousClass3BB r6 = r1.A00;
        int A0T = r9.A0T();
        View view = null;
        if (A0T == 0) {
            return null;
        }
        int i = 0;
        if (this.A03 == AnonymousClass05K.A01 && (r9 instanceof LinearLayoutManager)) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r9;
            if (linearLayoutManager.A1c() != 0) {
                if (linearLayoutManager.A1d() == r9.A0U() - 1) {
                    i = r9.A0T() - 1;
                }
            }
            return r9.A0X(i);
        }
        int i2 = Integer.MAX_VALUE;
        int A012 = A01(r6, r9);
        while (i < A0T) {
            View A0X = r9.A0X(i);
            int abs = Math.abs(A00(A0X, r6) - A012);
            if (abs < i2) {
                view = A0X;
                i2 = abs;
            }
            i++;
        }
        return view;
    }
}
