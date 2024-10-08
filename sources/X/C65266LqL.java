package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.store.PendingMediaStore;
import java.util.List;

/* renamed from: X.LqL  reason: case insensitive filesystem */
public final class C65266LqL implements AnonymousClass7IA {
    public final L89 A00;

    public final boolean CbZ(int i) {
        return true;
    }

    public final void DX3(C53401GnY gnY, C381779cJ r21, AnonymousClass3Q2 r22, C352218Cl r23, Long l, int i, boolean z) {
        boolean z2;
        L89 l89 = this.A00;
        C65282Lqb lqb = l89.A01;
        AnonymousClass7IF r2 = lqb.A01;
        int i2 = l89.A00.A05;
        AnonymousClass3Q2 r12 = l89.A03;
        C352218Cl r14 = r23;
        r2.EKH(r14, r12.A35, i2);
        DirectThreadKey directThreadKey = l89.A02;
        UserSession userSession = lqb.A00;
        AnonymousClass3U9 B33 = 2L2.A00(userSession).B33(directThreadKey);
        boolean z3 = false;
        if (B33 != null) {
            z2 = B33.CVE();
            z3 = B33.Axj();
        } else {
            z2 = false;
        }
        AnonymousClass797 A02 = AnonymousClass796.A02(userSession, directThreadKey, Boolean.valueOf(z3), AnonymousClass05K.A0N, z2, false, false);
        ShareType shareType = ShareType.DIRECT_SHARE;
        1ua r3 = lqb.A02;
        Integer valueOf = Integer.valueOf(String.valueOf(AnonymousClass0HN.A00()).hashCode());
        0qQ.A0B(userSession, 0);
        DbW.A1N(A02, 2, r3);
        AnonymousClass3Q2 A08 = LTU.A08(r12, shareType, r14, valueOf, (String) null, (String) null, A02.A00());
        A08.A5h = true;
        A08.A1Q = new LM7(true);
        PendingMediaStore A002 = 28K.A00(userSession);
        A002.A07.add(A08.A35);
        LTU.A0A(userSession, directThreadKey, A08, r14);
        r3.A0E(A08);
        r3.A0I(A08, true, true);
        C63326Kv9.A00(A08);
    }

    public final void Dj8(MessageIdentifier messageIdentifier, List list) {
    }

    public final void DjA(C53401GnY gnY, Long l, List list) {
    }

    public final void Dxz(C53401GnY gnY, C381779cJ r2, ClipInfo clipInfo, Long l, String str, int i, boolean z) {
    }

    public C65266LqL(L89 l89) {
        this.A00 = l89;
    }
}
