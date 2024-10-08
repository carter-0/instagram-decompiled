package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.search.SearchController;
import com.instagram.user.model.User;

/* renamed from: X.Ucr  reason: case insensitive filesystem */
public final class C15441Ucr extends C18783W1j {
    public final /* synthetic */ Uh4 A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15441Ucr(Context context, AnonymousClass07i r10, C18068Vku vku, X8O x8o, Uh4 uh4, AnonymousClass0iw r14, UserSession userSession, String str) {
        super(context, r10, vku, x8o, r14, userSession, str);
        this.A00 = uh4;
    }

    public final void A06(User user) {
        View view;
        Uh4 uh4 = this.A00;
        SearchController searchController = uh4.A02;
        if (searchController.A03 == AnonymousClass05K.A0C && (view = (View) uh4.A03.get()) != null) {
            searchController.A01(AnonymousClass05K.A00, 0.0f, (float) view.getHeight(), true);
        }
        super.A06(user);
    }
}
