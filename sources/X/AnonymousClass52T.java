package X;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.52T  reason: invalid class name */
public abstract class AnonymousClass52T {
    public int A00 = -1;
    public View A01;
    public C252553pI A02;
    public RecyclerView A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final AnonymousClass52U A07;

    public final void A01() {
        VUP vup;
        AnonymousClass52S r1 = (AnonymousClass52S) this;
        if ((r1 instanceof AnonymousClass52V) && (vup = ((AnonymousClass52V) r1).A02) != null) {
            vup.A01.A07((RecyclerView) null);
        }
    }

    public abstract void A03();

    public abstract void A05(View view, AnonymousClass52U r2, AnonymousClass3AW r3);

    public abstract void A06(AnonymousClass52U r1, AnonymousClass3AW r2, int i, int i2);

    public PointF A00(int i) {
        C252553pI r1 = this.A02;
        if (r1 instanceof C252563pJ) {
            return ((C252563pJ) r1).AIp(i);
        }
        Log.w("RecyclerView", 002.A0R("You should override computeScrollVectorForPosition when the LayoutManager does not implement ", C252563pJ.class.getCanonicalName()));
        return null;
    }

    public final void A02() {
        if (this.A05) {
            this.A05 = false;
            A03();
            this.A03.mState.A06 = -1;
            this.A01 = null;
            this.A00 = -1;
            this.A04 = false;
            C252553pI r1 = this.A02;
            if (r1.A06 == this) {
                r1.A06 = null;
            }
            this.A02 = null;
            this.A03 = null;
        }
    }

    public final void A04(int i, int i2) {
        PointF A002;
        RecyclerView recyclerView = this.A03;
        if (this.A00 == -1 || recyclerView == null) {
            A02();
        }
        if (this.A04 && this.A01 == null && this.A02 != null && (A002 = A00(this.A00)) != null) {
            float f = A002.x;
            if (!(f == 0.0f && A002.y == 0.0f)) {
                recyclerView.A0x((int) Math.signum(f), (int[]) null, (int) Math.signum(A002.y));
            }
        }
        this.A04 = false;
        View view = this.A01;
        if (view != null) {
            if (RecyclerView.A04(view) == this.A00) {
                View view2 = this.A01;
                AnonymousClass3AW r1 = recyclerView.mState;
                AnonymousClass52U r0 = this.A07;
                A05(view2, r0, r1);
                r0.A01(recyclerView);
                A02();
            } else {
                Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                this.A01 = null;
            }
        }
        if (this.A05) {
            AnonymousClass3AW r02 = recyclerView.mState;
            AnonymousClass52U r2 = this.A07;
            A06(r2, r02, i, i2);
            boolean z = false;
            if (r2.A04 >= 0) {
                z = true;
            }
            r2.A01(recyclerView);
            if (z && this.A05) {
                this.A04 = true;
                recyclerView.mViewFlinger.A00();
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.52U] */
    public AnonymousClass52T() {
        ? obj = new Object();
        obj.A04 = -1;
        obj.A06 = false;
        obj.A00 = 0;
        obj.A02 = 0;
        obj.A03 = 0;
        obj.A01 = AnonymousClass972.MUTABLE_FLAG_MASK;
        obj.A05 = null;
        this.A07 = obj;
    }
}
