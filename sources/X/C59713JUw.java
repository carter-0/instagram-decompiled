package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.JUw  reason: case insensitive filesystem */
public final class C59713JUw implements C74486Pvg {
    public View A00;
    public RecyclerView A01;
    public WW4 A02;
    public C59824JZz A03;
    public C60111Jfs A04;
    public int A05;
    public C231302rO A06;
    public final ViewTreeObserver.OnGlobalLayoutListener A07 = new LZ0(this, 8);

    public final void D71(ViewGroup viewGroup, Fragment fragment, UserSession userSession) {
        ViewTreeObserver viewTreeObserver;
        0qQ.A0B(viewGroup, 2);
        View inflate = DbV.A0E(fragment).inflate(R.layout.explore_pill_bar_view_holder, viewGroup);
        this.A00 = inflate;
        if (!(inflate == null || (viewTreeObserver = inflate.getViewTreeObserver()) == null)) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A07);
        }
        View view = this.A00;
        RecyclerView recyclerView = null;
        if (view != null) {
            recyclerView = DbZ.A0F(view, R.id.pill_bar_rv);
        }
        this.A01 = recyclerView;
        if (recyclerView != null) {
            C59824JZz jZz = this.A03;
            if (jZz != null) {
                recyclerView.setAdapter(jZz);
                Context context = recyclerView.getContext();
                DbV.A1A(context, recyclerView);
                recyclerView.A11(new C59825Ja0(context.getResources().getDimension(R.dimen.account_discovery_bottom_gap)));
                C60473Jm5.A00(recyclerView, this, 13);
            }
            0qQ.A0F("adapter");
            throw AnonymousClass00P.createAndThrow();
        }
        C59824JZz jZz2 = this.A03;
        if (jZz2 != null) {
            jZz2.registerAdapterDataObserver(new C60448Jlg(0, fragment, this));
            C60473Jm5.A00(DbZ.A0F(fragment.requireView(), R.id.recycler_view), this, 14);
            C51645Fy4.A01(this, DbV.A0J(fragment), 40);
            return;
        }
        0qQ.A0F("adapter");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void FKY(C231302rO r4, float f) {
        0qQ.A0B(r4, 1);
        this.A06 = r4;
        View view = this.A00;
        if (view != null) {
            DbX.A1C(view, view.getPaddingLeft(), (int) f);
            A00(this);
        }
    }

    public final void onDestroyView() {
        this.A01 = null;
        this.A00 = null;
        this.A06 = null;
    }

    public static final void A00(C59713JUw jUw) {
        C231302rO r2;
        View view = jUw.A00;
        if (view != null && (r2 = jUw.A06) != null) {
            int height = view.getHeight();
            if (height > 0) {
                r2.EZ4(height);
                jUw.A05 = height;
                return;
            }
            int i = jUw.A05;
            if (i <= 0) {
                i = (int) view.getContext().getResources().getDimension(R.dimen.alt_text_carousel_card_width);
            }
            r2.EZ4(i);
        }
    }

    public final Integer C9n() {
        return AnonymousClass05K.A00;
    }

    public final void D6Z(UserSession userSession, WW4 ww4, C60111Jfs jfs) {
        this.A02 = ww4;
        this.A04 = jfs;
        this.A03 = new C59824JZz(ww4);
    }
}
