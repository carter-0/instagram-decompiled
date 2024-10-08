package X;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.common.session.UserSession;

/* renamed from: X.WXj  reason: case insensitive filesystem */
public final class C19392WXj implements G76 {
    public final int A00;
    public final Object A01;

    public C19392WXj(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onActionClicked() {
        switch (this.A00) {
            case 0:
                UYo uYo = new UYo();
                C15323UaV uaV = (C15323UaV) this.A01;
                PromoteData promoteData = uaV.A08;
                if (promoteData == null) {
                    0qQ.A0F("promoteData");
                    throw AnonymousClass00P.createAndThrow();
                }
                UserSession userSession = promoteData.A0y;
                0qQ.A06(userSession);
                C331157Pu A0T = DbW.A0T(userSession);
                C13990Tnq.A0M(uaV.A0T).A0F(C16678UzE.BUDGET_DURATION, "similar_advertiser_budget_recommendation_banner");
                A0T.A02(uaV.requireActivity(), uYo);
                return;
            case 1:
                C15397Uc0 uc0 = ((C15463UdE) this.A01).A08;
                FragmentActivity activity = uc0.getActivity();
                if (activity != null) {
                    C309516Yo r2 = new C309516Yo(activity, uc0.A03);
                    r2.A0E(Eq6.A00(C21251XQw.TAGS_AND_MENTIONS, (String) null));
                    r2.A04();
                    return;
                }
                return;
            default:
                C15397Uc0 uc02 = ((C15463UdE) this.A01).A08;
                Context context = uc02.getContext();
                if (context != null) {
                    String string = uc02.getString(2131957531);
                    String string2 = uc02.getString(2131969436);
                    C358248ab r3 = new C358248ab(context);
                    r3.A0r(true);
                    r3.A0s(true);
                    r3.A09(2131957534);
                    r3.A0Y(new C18833W4v(12, uc02, context), C358278ae.RED_BOLD, string, true);
                    r3.A0b((DialogInterface.OnClickListener) null, string2);
                    DbT.A1V(r3);
                    return;
                }
                return;
        }
    }

    public final /* synthetic */ void onBannerDismissed() {
    }
}
