package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.AbstractMap;
import java.util.HashMap;

public final class GU1 implements C46207DQk {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final Fragment A02;

    public GU1(Fragment fragment, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(r3, 3);
        this.A01 = userSession;
        this.A02 = fragment;
        this.A00 = r3;
    }

    public static void A00(1Xj r1, Object obj, AbstractMap abstractMap) {
        abstractMap.put("post_igid", obj);
        if (r1.A0C.BFi() != null) {
            AnonymousClass1eb BFi = r1.A0C.BFi();
            0qQ.A0A(BFi);
            abstractMap.put("product_id", String.valueOf(BFi.BEV()));
        }
    }

    public final void DJg(C254073rt r7, 1Xj r8, AnonymousClass3W1 r9) {
        if (r8.A0C.BFi() != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            String id = r8.getId();
            if (id != null) {
                A1E.put("ig_post_id", id);
                FragmentActivity requireActivity = this.A02.requireActivity();
                UserSession userSession = this.A01;
                C309516Yo A0M = DbS.A0M(requireActivity, userSession);
                A0M.A0D(C49891FBs.A02(DbS.A0N(userSession), C46649DiU.A04(C66579MXk.A00(57), A1E)));
                A0M.A04();
                HashMap A1E2 = AnonymousClass7TE.A1E();
                String id2 = r8.getId();
                if (id2 != null) {
                    A00(r8, id2, A1E2);
                    User A2A = r8.A2A(userSession);
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A00, userSession), "ig_ads_conversion_funnel");
                    DbS.A1F(C62666KkS.BIO_IG_POST, A0e);
                    A0e.AAJ("consumer_igid", userSession.A06);
                    C51969G9p.A1E(A0e, "seller_igid", DbX.A0r(A2A), A1E2);
                    DbS.A1I(A0e, "buyer_click_inquiry_cta");
                    A0e.Cgf();
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void EBf(View view, 1Xj r8) {
        if (r8.A0C.BFi() != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            String id = r8.getId();
            if (id != null) {
                A00(r8, id, A1E);
                UserSession userSession = this.A01;
                User A2A = r8.A2A(userSession);
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A00, userSession), "ig_ads_conversion_funnel");
                DbS.A1F(C62666KkS.BIO_IG_POST, A0e);
                A0e.AAJ("consumer_igid", userSession.A06);
                C51969G9p.A1E(A0e, "seller_igid", DbX.A0r(A2A), A1E);
                DbS.A1I(A0e, "buyer_view_inquiry_cta");
                A0e.Cgf();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
