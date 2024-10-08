package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Mjc  reason: case insensitive filesystem */
public final class C67180Mjc extends C232232tF {
    public final C67166MjO A00;
    public final UserSession A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C68032Myy(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_contact_sync_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C68032Myy myy = (C68032Myy) r5;
        0qQ.A0B(myy, 1);
        Context context = myy.A00.getContext();
        DbT.A18(context, myy.A04, 2131956530);
        DbT.A18(context, myy.A03, 2131956511);
        DbU.A13(context, myy.A02, R.drawable.instagram_contacts_pano_outline_24);
        C71395Oju.A00(myy.A05, 33, this);
        C71405Ok4.A01(myy.A01, 65, myy, this);
    }

    public final Class modelClass() {
        return C71953Ote.class;
    }

    public C67180Mjc(UserSession userSession, C67166MjO mjO) {
        this.A01 = userSession;
        this.A00 = mjO;
    }
}
