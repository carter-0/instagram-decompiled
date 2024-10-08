package X;

import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EgU  reason: case insensitive filesystem */
public abstract class C48559EgU {
    public static final Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        UserSession A0W = DbX.A0W(r15);
        C276544tV A0M = DbW.A0M(r16, 1);
        if (A0M == null) {
            return null;
        }
        String str = "";
        String A0H = A0M.A0H();
        if (A0H != null) {
            str = A0H;
        }
        String str2 = "";
        String A0E = A0M.A0E();
        if (A0E != null) {
            str2 = A0E;
        }
        ActionButtonPartnerType actionButtonPartnerType = (ActionButtonPartnerType) ActionButtonPartnerType.A01.get(str2);
        if (actionButtonPartnerType == null) {
            actionButtonPartnerType = ActionButtonPartnerType.UNRECOGNIZED;
        }
        C274664or r4 = new C274664or(actionButtonPartnerType, "", (String) null, (String) null, (String) null, (String) null, str, "");
        String str3 = "";
        String str4 = "";
        C274664or r8 = new C274664or(r4.A00, str3, str4, (String) null, (String) null, DbV.A10(A0M, ""), r4.A06, "");
        User A0j = DbT.A0j(A0W);
        A0j.A03.ElV(r8);
        DbT.A1S(A0W, A0j);
        return null;
    }
}
