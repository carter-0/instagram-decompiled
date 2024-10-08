package X;

import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.2lf  reason: invalid class name and case insensitive filesystem */
public abstract class C228432lf extends C228442lg {
    public RecyclerView A00;
    public Scroller A01;
    public final C249403jg mScrollListener = new C228452lh(this);

    public abstract int A02(C252553pI r1, int i, int i2);

    public abstract View A03(C252553pI r1);

    public int[] A09(View view, C252553pI r10) {
        C228422le r6 = (C228422le) this;
        int[] iArr = new int[2];
        if (r10.A1X()) {
            AnonymousClass3BB r3 = r6.A00;
            if (r3 == null || r3.A02 != r10) {
                r3 = new AnonymousClass3BC(r10);
                r6.A00 = r3;
            }
            iArr[0] = (r3.A0D(view) + (r3.A0B(view) / 2)) - (r3.A06() + (r3.A07() / 2));
        } else {
            iArr[0] = 0;
        }
        if (r10.A1Y()) {
            AnonymousClass3BB r32 = r6.A01;
            if (r32 == null || r32.A02 != r10) {
                r32 = new C238673Cy(r10);
                r6.A01 = r32;
            }
            iArr[1] = (r32.A0D(view) + (r32.A0B(view) / 2)) - (r32.A06() + (r32.A07() / 2));
            return iArr;
        }
        iArr[1] = 0;
        return iArr;
    }

    @Deprecated
    public AnonymousClass52S A04(C252553pI r3) {
        if (!(r3 instanceof C252563pJ)) {
            return null;
        }
        return new C67781Mul(this.A00.getContext(), this);
    }

    public AnonymousClass52T A05(C252553pI r4) {
        if (!(this instanceof C228422le)) {
            return A04(r4);
        }
        C228422le r2 = (C228422le) this;
        if (!(r4 instanceof C252563pJ)) {
            return null;
        }
        return new C67786Muq(r2.A00.getContext(), r2);
    }

    public final void A06() {
        C252553pI r1;
        View A03;
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null && (r1 = recyclerView.A0D) != null && (A03 = A03(r1)) != null) {
            int[] A09 = A09(A03, r1);
            int i = A09[0];
            if (i != 0 || A09[1] != 0) {
                this.A00.A0u(i, A09[1]);
            }
        }
    }

    public void A07(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.A00;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                recyclerView2.A16(this.mScrollListener);
                this.A00.A0E = null;
            }
            this.A00 = recyclerView;
            if (recyclerView == null) {
                return;
            }
            if (recyclerView.A0E == null) {
                recyclerView.A15(this.mScrollListener);
                RecyclerView recyclerView3 = this.A00;
                recyclerView3.A0E = this;
                this.A01 = new Scroller(recyclerView3.getContext(), new DecelerateInterpolator());
                A06();
                return;
            }
            throw new IllegalStateException("An instance of OnFlingListener already set.");
        }
    }

    public int[] A08(int i, int i2) {
        this.A01.fling(0, 0, i, i2, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE, AnonymousClass972.MUTABLE_FLAG_MASK, Integer.MAX_VALUE);
        return new int[]{this.A01.getFinalX(), this.A01.getFinalY()};
    }
}
