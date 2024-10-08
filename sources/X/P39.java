package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.List;

public final class P39 implements AnonymousClass7IA {
    public final UserSession A00;
    public final OBH A01;
    public final AnonymousClass8K7 A02;
    public final LD4 A03;
    public final AnonymousClass7L7 A04;
    public final AnonymousClass7L9 A05;
    public final AnonymousClass8KZ A06;
    public final DirectShareTarget A07;
    public final C381779cJ A08;
    public final String A09;

    public final boolean CbZ(int i) {
        return true;
    }

    public final void Dj8(MessageIdentifier messageIdentifier, List list) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DjA(X.C53401GnY r11, java.lang.Long r12, java.util.List r13) {
        /*
            r10 = this;
            r5 = r13
            int r1 = r13.size()
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            r8 = 0
            java.lang.String r7 = r10.A00(r8, r0, r1)
            X.7L9 r4 = r10.A05
            r6 = r11
            if (r4 == 0) goto L_0x0051
            com.instagram.common.session.UserSession r3 = r10.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342166634264145233(0x20810c2500162d51, double:4.0686596155156675E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0051
            r9 = 2
            X.Pmi r3 = new X.Pmi
            r3.<init>(r4, r5, r6, r7, r8, r9)
            r0 = 3303(0xce7, float:4.628E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.AnonymousClass7L9.A00(r4, r0, r3)
        L_0x002f:
            X.OBH r2 = r10.A01
            int r0 = r13.size()
            int r1 = r2.A00
            int r1 = r1 + r0
            r2.A00 = r1
            int r0 = r2.A01
            if (r1 != r0) goto L_0x0050
            X.8K7 r2 = r10.A02
            if (r2 == 0) goto L_0x0050
            java.lang.String r0 = X.JTQ.A0Z()
            X.A3r r1 = new X.A3r
            r1.<init>(r0)
            X.LD4 r0 = r10.A03
            r2.DQm(r1, r0)
        L_0x0050:
            return
        L_0x0051:
            X.7L7 r0 = r10.A04
            r0.A04(r11, r7, r8, r13)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P39.DjA(X.GnY, java.lang.Long, java.util.List):void");
    }

    public final void Dxz(C53401GnY gnY, C381779cJ r15, ClipInfo clipInfo, Long l, String str, int i, boolean z) {
        C254933tI r7;
        String str2;
        ClipInfo clipInfo2 = clipInfo;
        0qQ.A0B(clipInfo2, 0);
        UserSession userSession = this.A00;
        if (r15 == null || (str2 = r15.A02) == null) {
            r7 = null;
        } else {
            r7 = C254933tI.A00(0c9.A04.A01(userSession, str2));
        }
        String A002 = A00(r7, AnonymousClass05K.A0N, i);
        AnonymousClass7L9 r6 = this.A05;
        C53401GnY gnY2 = gnY;
        String str3 = str;
        if (r6 == null || !182.A06(0Tu.A05, userSession, 2342166634264145233L)) {
            AnonymousClass7L7 r4 = this.A04;
            boolean z2 = false;
            if (r15 != null && r15.A07) {
                z2 = true;
            }
            r4.A02(gnY2, r7, clipInfo2, str3, A002, this.A09, (String) null, z2);
        } else {
            AnonymousClass7L9.A00(r6, "sendVideo", new C73974Pms(gnY2, r6, r7, clipInfo2, A002, str3, this.A09, (String) null));
        }
        AnonymousClass8K7 r2 = this.A02;
        if (r2 != null) {
            r2.DQm(new C39651A3r(JTQ.A0Z()), this.A03);
        }
    }

    public /* synthetic */ P39(UserSession userSession, OBH obh, AnonymousClass8K7 r4, LD4 ld4, AnonymousClass7L7 r6, AnonymousClass7L9 r7, DirectShareTarget directShareTarget, C381779cJ r9, String str) {
        AnonymousClass8KZ r0 = new AnonymousClass8KZ(userSession);
        AnonymousClass7TG.A1R(str, userSession);
        this.A04 = r6;
        this.A05 = r7;
        this.A08 = r9;
        this.A09 = str;
        this.A00 = userSession;
        this.A02 = r4;
        this.A03 = ld4;
        this.A07 = directShareTarget;
        this.A01 = obh;
        this.A06 = r0;
    }

    public final void DX3(C53401GnY gnY, C381779cJ r14, AnonymousClass3Q2 r15, C352218Cl r16, Long l, int i, boolean z) {
        C254933tI r6;
        String str;
        UserSession userSession = this.A00;
        if (r14 == null || (str = r14.A02) == null) {
            r6 = null;
        } else {
            r6 = C254933tI.A00(0c9.A04.A01(userSession, str));
        }
        String A002 = A00(r6, AnonymousClass05K.A0C, i);
        AnonymousClass7L9 r5 = this.A05;
        C53401GnY gnY2 = gnY;
        AnonymousClass3Q2 r7 = r15;
        C352218Cl r8 = r16;
        if (r5 == null || !182.A06(0Tu.A05, userSession, 2342166634264145233L)) {
            this.A04.A03(gnY, r6, r7, r8, A002, this.A09, (String) null);
        } else {
            AnonymousClass7L9.A00(r5, "sendPhoto", new C73978Pmw(gnY2, userSession, r5, r6, r7, r8, A002, this.A09, (String) null));
        }
        AnonymousClass8K7 r2 = this.A02;
        if (r2 != null) {
            r2.DQm(new C39651A3r(JTQ.A0Z()), this.A03);
        }
    }

    private final String A00(C254933tI r20, Integer num, int i) {
        Boolean bool;
        Integer num2;
        Boolean bool2;
        Boolean bool3;
        String A0s = DbV.A0s();
        DirectShareTarget directShareTarget = this.A07;
        String A082 = directShareTarget.A08();
        AnonymousClass8KZ r3 = this.A06;
        AnonymousClass3U9 A002 = r3.A00(A082);
        if (A002 != null) {
            bool = Boolean.valueOf(A002.CVE());
        } else {
            bool = null;
        }
        Long A012 = r3.A01(A082);
        AnonymousClass3U9 A003 = r3.A00(A082);
        if (A003 != null) {
            num2 = Integer.valueOf(A003.C6a());
        } else {
            num2 = null;
        }
        AnonymousClass3U9 A004 = r3.A00(A082);
        if (A004 != null) {
            bool2 = Boolean.valueOf(A004.CVa(r3.A00));
        } else {
            bool2 = null;
        }
        AnonymousClass3U9 A005 = r3.A00(A082);
        if (A005 != null) {
            bool3 = Boolean.valueOf(A005.Axj());
        } else {
            bool3 = null;
        }
        UserSession userSession = this.A00;
        C254933tI r7 = r20;
        Integer num3 = num;
        int i2 = i;
        ((A8r) userSession.A01(A8r.class, C73911Plm.A00(userSession, 46))).A00(r7, directShareTarget, num2, num3, A012, A0s, i2, AnonymousClass7TG.A1X(bool), false, false, C51972G9s.A1Z(bool3), C51972G9s.A1Z(bool2));
        return A0s;
    }
}
