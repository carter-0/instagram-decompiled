package X;

import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.EgV  reason: case insensitive filesystem */
public abstract class C48560EgV {
    public static final Object A00(C307896Rx r16, AnonymousClass6Tm r17) {
        C274664or r9;
        C276544tV r4;
        UserSession A0Z = DbT.A0Z(r16);
        Object A01 = r17.A01();
        if (!(A01 instanceof C276544tV) || (r4 = (C276544tV) A01) == null || r4.A0D() == null) {
            r9 = null;
        } else {
            String str = "";
            String A10 = DbV.A10(r4, str);
            String str2 = str;
            String A0I = r4.A0I();
            if (A0I != null) {
                str2 = A0I;
            }
            String str3 = str;
            String A0G = r4.A0G();
            if (A0G != null) {
                str3 = A0G;
            }
            ActionButtonPartnerType actionButtonPartnerType = (ActionButtonPartnerType) ActionButtonPartnerType.A01.get(str3);
            if (actionButtonPartnerType == null) {
                actionButtonPartnerType = ActionButtonPartnerType.UNRECOGNIZED;
            }
            String str4 = str;
            String A0J = r4.A0J();
            if (A0J != null) {
                str4 = A0J;
            }
            C274664or r5 = new C274664or(actionButtonPartnerType, A10, (String) null, (String) null, (String) null, (String) null, str2, str4);
            String str5 = r5.A01;
            String str6 = r5.A06;
            ActionButtonPartnerType actionButtonPartnerType2 = r5.A00;
            String str7 = r5.A07;
            String str8 = str;
            String A0F = r4.A0F();
            if (A0F != null) {
                str8 = A0F;
            }
            String A0H = r4.A0H();
            if (A0H != null) {
                str = A0H;
            }
            r9 = new C274664or(actionButtonPartnerType2, str5, (String) null, str8, str, (String) null, str6, str7);
        }
        User A0j = DbT.A0j(A0Z);
        A0j.A03.ElT(r9);
        DbT.A1S(A0Z, A0j);
        return null;
    }
}
