package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Kcj  reason: case insensitive filesystem */
public final class C62249Kcj extends K8D implements C273494mf {
    public static final String __redex_internal_original_name = "IgLiveIgdsHeaderAvatarGridFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);
    public final AnonymousClass0eM A01;
    public final String A02;

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public C62249Kcj() {
        String A16 = C51968G9o.A16(this);
        0qQ.A07(A16);
        this.A02 = A16;
        MM8 mm8 = new MM8(this, 14);
        AnonymousClass0eM A002 = MM8.A00(new MM8(this, 11), 0eO.A02, 12);
        this.A01 = C66304MMn.A00(A002, new MM8(A002, 13), mm8, DbS.A0z(C62302Kda.class), 12);
    }

    public final boolean isScrolledToTop() {
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView.getChildCount() == 0 || recyclerView.computeVerticalScrollOffset() == 0) {
            return true;
        }
        return false;
    }
}
