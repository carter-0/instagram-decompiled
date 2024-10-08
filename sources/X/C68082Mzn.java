package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.common.staggeredgrid.HorizontalStaggeredLayoutManager;
import java.util.List;
import java.util.concurrent.CancellationException;

/* renamed from: X.Mzn  reason: case insensitive filesystem */
public final class C68082Mzn extends RecyclerView {
    public int A00;
    public boolean A01;
    public C262204Co A02;
    public final long A03;
    public final long A04;
    public final Context A05;
    public final List A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68082Mzn(Context context, List list, int i, long j, long j2, boolean z) {
        super(context, (AttributeSet) null);
        0qQ.A0B(list, 4);
        this.A05 = context;
        this.A00 = i;
        this.A01 = z;
        this.A06 = list;
        this.A04 = j;
        this.A03 = j2;
        setLayoutManager(new HorizontalStaggeredLayoutManager(context, new C61065Jw3(list, AnonymousClass7TG.A05(context), DbY.A01(context), 1), i));
    }

    public static final void A00(C68082Mzn mzn) {
        if (mzn.A01) {
            C262204Co r1 = mzn.A02;
            1Er r0 = null;
            if (r1 != null) {
                r1.AG7((CancellationException) null);
            }
            AnonymousClass07Z A002 = C71362ch.A00(mzn);
            if (A002 != null) {
                r0 = C51966G9m.A1L(new MG5(mzn, (AnonymousClass4D7) null, 45), DbW.A0E(A002));
            }
            mzn.A02 = r0;
        }
    }

    public final int getRowCount() {
        return this.A00;
    }

    public final void setIsScrollAnimationEnabled(boolean z) {
        boolean z2 = this.A01;
        this.A01 = z;
        if (!z2 && z) {
            A00(this);
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1017596271);
        super.onAttachedToWindow();
        setOnTouchListener(new C71439Oke((Object) this, 16));
        A00(this);
        AnonymousClass0fD.A0D(85768917, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(1240686372);
        super.onDetachedFromWindow();
        C262204Co r1 = this.A02;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        this.A02 = null;
        setOnTouchListener((View.OnTouchListener) null);
        AnonymousClass0fD.A0D(-964732344, A062);
    }

    public final void setRowCount(int i) {
        this.A00 = i;
    }

    public final void setScrollAnimationEnabled(boolean z) {
        this.A01 = z;
    }
}
