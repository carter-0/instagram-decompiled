package X;

import com.facebook.common.dextricks.DexOptimization;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;

/* renamed from: X.SEq  reason: case insensitive filesystem */
public final class C11190SEq {
    public final UserSession A00;
    public final AnonymousClass0iw A01;
    public final C9135RQk A02;

    public static final 0xI A00(C11190SEq sEq, String str) {
        String str2;
        int A04;
        UserSession userSession = sEq.A00;
        String BcN = C60510iO.A00(userSession).BcN();
        if (BcN == null || (A04 = 00l.A04(BcN, '.', 0)) <= 0) {
            str2 = null;
        } else {
            str2 = C51967G9n.A0q(BcN, 0, A04);
        }
        0xI A002 = 0xI.A00(sEq.A01, 002.A0R("payflows_", str));
        A002.A0C("client_app_user_id", userSession.A06);
        A002.A0C(AnonymousClass000.A00(2792), str2);
        C9135RQk rQk = sEq.A02;
        String str3 = rQk.A01;
        0qQ.A07(str3);
        A002.A0C("product", C66582MXn.A0w(str3));
        A002.A0C("other_profile_id", rQk.A03);
        A002.A0C("flow_name", rQk.A02);
        A002.A0C(Dbj.A02(), rQk.A00);
        A002.A0C(TraceFieldType.AdhocEventName, str);
        A002.A0C("event_type", DexOptimization.OPT_KEY_CLIENT);
        return A002;
    }

    public C11190SEq(AnonymousClass0iw r1, UserSession userSession, C9135RQk rQk) {
        AnonymousClass7TG.A1O(userSession, r1);
        this.A00 = userSession;
        this.A01 = r1;
        this.A02 = rQk;
    }
}
