package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.IXd  reason: case insensitive filesystem */
public final class C57320IXd implements 0Js {
    public final /* bridge */ /* synthetic */ void ATN(UserSession userSession, 0Jv r18, Object obj) {
        C53300Glm glm = (C53300Glm) obj;
        UserSession userSession2 = userSession;
        0Jv r3 = r18;
        AnonymousClass7TG.A1T(userSession2, glm, r3);
        1E8 A00 = 1E7.A00(userSession2);
        1Xj r1 = glm.A02;
        1Xj A02 = A00.A02(r1.getId());
        if (A02 == null) {
            String id = r1.getId();
            1Xx parseFromJson = AnonymousClass1Xw.parseFromJson(16P.A00("{}"));
            0qQ.A07(parseFromJson);
            1Xj A022 = 1Xv.A02(parseFromJson);
            if (A022 != null) {
                A022.A4G(id);
                A02 = A00.A01(A022, true, false);
                if (A02 == null) {
                    return;
                }
            } else {
                return;
            }
        }
        String str = glm.A04;
        boolean z = glm.A07;
        int i = glm.A00;
        HVE.A00(glm.A01, userSession2, new C57199ISm(r3), A02, glm.A03, str, glm.A06, glm.A05, i, z, false);
    }
}
