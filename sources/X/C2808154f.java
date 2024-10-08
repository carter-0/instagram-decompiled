package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.54f  reason: invalid class name and case insensitive filesystem */
public abstract class C2808154f {
    public static final void A01(RecyclerView recyclerView, boolean z) {
        0qQ.A0B(recyclerView, 0);
        if (recyclerView.getChildCount() != 0 && recyclerView.getHeight() != 0) {
            if (z) {
                recyclerView.A0p(0);
                recyclerView.postDelayed(new AnonymousClass9Q9(recyclerView), 100);
                return;
            }
            recyclerView.A0o(0);
        }
    }

    public static final boolean A02(LinearLayoutManager linearLayoutManager) {
        0qQ.A0B(linearLayoutManager, 0);
        if (linearLayoutManager.A0T() == 0 || linearLayoutManager.A1d() == linearLayoutManager.A0U() - 1) {
            return true;
        }
        return false;
    }

    public static final boolean A03(LinearLayoutManager linearLayoutManager) {
        0qQ.A0B(linearLayoutManager, 0);
        if (linearLayoutManager.A0T() == 0 || linearLayoutManager.A1c() == 0) {
            return true;
        }
        return false;
    }

    public static final boolean A04(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        C252553pI r1 = recyclerView.A0D;
        if (r1 instanceof LinearLayoutManager) {
            return A02((LinearLayoutManager) r1);
        }
        throw new UnsupportedOperationException("Only LinearLayoutManager has a bottom");
    }

    public static final boolean A05(RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        C252553pI r1 = recyclerView.A0D;
        if (r1 instanceof LinearLayoutManager) {
            return A03((LinearLayoutManager) r1);
        }
        throw new UnsupportedOperationException("Only LinearLayoutManager has a top");
    }

    public static final int A00(View view, C252553pI r4) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
        return r4.A0W(view) - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
    }
}
