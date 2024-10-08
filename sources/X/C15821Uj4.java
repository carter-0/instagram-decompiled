package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uj4  reason: case insensitive filesystem */
public final class C15821Uj4 extends C232232tF {
    public final C329207Hz A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C14837UBr uBr = (C14837UBr) r5;
        0qQ.A0B(uBr, 1);
        C329207Hz r2 = this.A00;
        0qQ.A0B(r2, 2);
        C15848UjY.A00(new AnonymousClass3NG(uBr.A00), r2, 23);
    }

    public final Class modelClass() {
        return C19258WRr.class;
    }

    public C15821Uj4(UserSession userSession, C329207Hz r2) {
        this.A01 = userSession;
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C14837UBr(DbT.A0D(layoutInflater, viewGroup, R.layout.see_more_direct_star_tab_item, false));
    }
}
