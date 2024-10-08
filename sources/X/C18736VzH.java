package X;

import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.VzH  reason: case insensitive filesystem */
public final class C18736VzH {
    public int A00;
    public final BaseFragmentActivity A01;
    public final UserSession A02;
    public final String A03;
    public final AnonymousClass0eM A04 = C20703Wxa.A01(this, 33);
    public final C61080JwI A05;
    public final X3K A06;

    public C18736VzH(C61080JwI jwI, BaseFragmentActivity baseFragmentActivity, X3K x3k, UserSession userSession, String str) {
        0qQ.A0B(baseFragmentActivity, 1);
        this.A01 = baseFragmentActivity;
        this.A02 = userSession;
        this.A03 = str;
        this.A05 = jwI;
        this.A06 = x3k;
    }

    public static final void A00(C18736VzH vzH) {
        C59721JVf jVf = (C59721JVf) 00k.A0O((List) vzH.A05.A00, vzH.A00);
        if (jVf == null) {
            A01(vzH, C15417UcT.A00);
            return;
        }
        Integer num = (Integer) jVf.A01;
        0qQ.A0B(num, 0);
        VVM vvm = new VVM((0wc) vzH.A04.getValue(), num, vzH.A03);
        int intValue = num.intValue();
        if (intValue == 0) {
            VZG vzg = new VZG(vzH.A01, vvm, vzH.A02);
            WOM wom = new WOM(vzH);
            if (((C13997Tnz) jVf.A00).A02) {
                C18794W2b.A03(vzg.A00, (AnonymousClass07i) AnonymousClass7TE.A14(vzg.A04), new C19183WOp(new WOK(jVf, vzg, wom)), vzg.A02);
                return;
            }
            C18791W1x.A01(jVf, vzg, wom);
        } else if (intValue == 1) {
            vzH.A00++;
            A00(vzH);
        } else {
            throw new RuntimeException();
        }
    }

    public static final void A01(C18736VzH vzH, C17322VRb vRb) {
        String str;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(vzH.A02), "promote_client_token_returned");
        A0e.AAJ("event", "promote_client_token_returned");
        A0e.AAJ("flow", "ig_professional_access_token_library");
        DbS.A1N(A0e, vzH.A03);
        int intValue = vRb.A00.intValue();
        if (intValue == 0) {
            str = "business_user_access_token";
        } else if (intValue == 1) {
            str = null;
        } else {
            throw new RuntimeException();
        }
        A0e.AAJ("token_type", str);
        A0e.Cgf();
        vzH.A06.DfU(vRb);
    }
}
