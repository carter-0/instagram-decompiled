package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.List;

/* renamed from: X.AYb  reason: case insensitive filesystem */
public final class C40262AYb implements AnonymousClass67Q {
    public final /* synthetic */ C333537Zi A00;
    public final /* synthetic */ OCA A01;
    public final /* synthetic */ MessageIdentifier A02;
    public final /* synthetic */ C254743sy A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public C40262AYb(C333537Zi r1, OCA oca, MessageIdentifier messageIdentifier, C254743sy r4, String str, List list, boolean z) {
        this.A03 = r4;
        this.A00 = r1;
        this.A05 = list;
        this.A02 = messageIdentifier;
        this.A06 = z;
        this.A04 = str;
        this.A01 = oca;
    }

    public final void Eyr(AnonymousClass67Z r40) {
        Boolean bool;
        AnonymousClass67Z r5 = r40;
        0qQ.A0B(r5, 0);
        DirectThreadKey A032 = C66647MaG.A03(this.A03);
        C333537Zi r3 = this.A00;
        List list = this.A05;
        MessageIdentifier messageIdentifier = this.A02;
        boolean z = this.A06;
        String str = this.A04;
        OCA oca = this.A01;
        String A033 = C333537Zi.A03(r3, false);
        UserSession userSession = r3.A03;
        C70621ODs A002 = OQO.A00(userSession, A032);
        if (A002 != null) {
            bool = Boolean.valueOf(C70054NwW.A00(A002));
        } else {
            bool = null;
        }
        UserSession userSession2 = userSession;
        boolean A003 = AnonymousClass796.A02(userSession2, A032, bool, AnonymousClass05K.A0A, z, false, false).A00();
        C66665MaY A042 = C66669Mac.A04(userSession2, OQO.A00(userSession, A032), 1fi.class, str, (String) null, z);
        String str2 = A042.A03;
        DirectThreadKey directThreadKey = A032;
        C333537Zi.A08(r3, directThreadKey, str2, A033, (String) null, 15, list.size(), z, A003);
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        DirectThreadKey directThreadKey2 = A032;
        1fi r11 = new 1fi((AnonymousClass9JH) null, (C254933tI) null, A042, oca, (C69343Nji) null, LTU.A04(userSession, directThreadKey, ShareType.DIRECT_SHARE, 1ua.A0G.A01(r3.A02, userSession), Integer.valueOf(str2.hashCode()), list, A003), directThreadKey2, messageIdentifier2, false, OQO.A01(userSession, A032), (String) null, AnonymousClass7TG.A0H(), false);
        if (AnonymousClass7TE.A1b(list)) {
            String A062 = r11.A06();
            String str3 = A032.A00;
            int i = 2;
            if (((L4P) list.get(0)).A01) {
                i = 4;
            }
            C333537Zi.A09(r3, (Integer) null, A033, A062, str3, i, list.size(), 0, 0, 0, z, A003);
        }
        1Ou.A01(userSession).A0A(r11);
        r5.A02(new C72175Oxk(0));
        r5.A00();
    }
}
