package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Nxq  reason: case insensitive filesystem */
public abstract class C70136Nxq {
    public static final C72624PDd A00(AnonymousClass4DH r12, UserSession userSession, C74564PxD pxD, C74321Psx psx) {
        Object obj;
        Context requireContext = r12.requireContext();
        UserSession userSession2 = userSession;
        2Dm A00 = 2L2.A00(userSession);
        Mi5 A002 = Mi4.A00(userSession);
        0qQ.A0B(A00, 1);
        1bO A003 = 1bO.A00(userSession);
        0qQ.A07(A003);
        C66741Mbm mbm = new C66741Mbm(psx, A003, A00);
        C66687Mau mau = new C66687Mau(requireContext, userSession, A002, C251033mS.A00(userSession));
        C67107MiR miR = new C67107MiR((C2366634p) null);
        if (182.A06(0Tu.A05, userSession, 36325579259458624L)) {
            obj = new P3R(userSession);
        } else {
            obj = new Object();
        }
        mau.A01 = pxD;
        mau.A03 = miR;
        mau.A00 = (C74548Pwh) obj;
        AnonymousClass2EU r9 = AnonymousClass2EU.A00;
        C2611948q r11 = C2611948q.ALL;
        return new C72624PDd(mbm, new C67014Mgn(requireContext, C66582MXn.A0O(userSession2, AnonymousClass436.A00), userSession2, mau, r9, 1bJ.A00(userSession2), r11, C251033mS.A00(userSession2), false, false, false));
    }
}
