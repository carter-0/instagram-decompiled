package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.banner.IgdsInsetBanner;

/* renamed from: X.EAi  reason: case insensitive filesystem */
public final class C47622EAi extends C231632rz {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final String getBinderGroupName() {
        return "AutoFollowBackBannerBinderGroup";
    }

    public final int getViewTypeCount() {
        return 1;
    }

    public C47622EAi(Context context, AnonymousClass0iw r2, UserSession userSession) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void bindView(int i, View view, Object obj, Object obj2) {
        C46914DnU dnU;
        IgdsInsetBanner igdsInsetBanner;
        int A03 = AnonymousClass0fD.A03(-1853370173);
        0qQ.A0B(view, 1);
        Object tag = view.getTag();
        if (tag instanceof C46914DnU) {
            dnU = (C46914DnU) tag;
        } else {
            dnU = null;
        }
        UserSession userSession = this.A02;
        AnonymousClass0iw r5 = this.A01;
        Context context = this.A00;
        DbZ.A0t(1, userSession, r5, context);
        if (C49966FGz.A00.A08(userSession)) {
            FEU feu = new FEU(r5, userSession);
            0Aj A002 = FEU.A00(feu);
            Dbb.A1A(C48138EZg.BANNER, A002);
            FEU.A01(A002, feu);
            if (!(dnU == null || (igdsInsetBanner = dnU.A00) == null)) {
                igdsInsetBanner.A00 = new C50471FcJ(context, r5, userSession, dnU, feu);
            }
        } else if (dnU != null) {
            AnonymousClass7TH.A0R(dnU.A00);
        }
        AnonymousClass0fD.A0A(144772664, A03);
    }

    public final View createView(int i, ViewGroup viewGroup) {
        int A04 = DbX.A04(viewGroup, 587931397);
        View A09 = DbU.A09(DbT.A0B(this.A00), viewGroup, R.layout.auto_follow_back_banner_row, false);
        A09.setTag(new C46914DnU(A09));
        AnonymousClass0fD.A0A(-977404784, A04);
        return A09;
    }

    public final /* bridge */ /* synthetic */ void buildRowViewTypes(C232672uC r1, Object obj, Object obj2) {
        DbW.A1I(r1);
    }
}
