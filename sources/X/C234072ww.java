package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.2ww  reason: invalid class name and case insensitive filesystem */
public final class C234072ww {
    public C249763kK A00;
    public final C60640iu A01;
    public final 0wc A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;

    public C234072ww(UserSession userSession, AnonymousClass4DU r3, C249763kK r4) {
        0qQ.A0B(r3, 1);
        0qQ.A0B(userSession, 2);
        this.A04 = r3;
        this.A03 = userSession;
        this.A00 = r4;
        this.A01 = C60510iO.A00(userSession);
        this.A02 = AnonymousClass0kN.A01(r3, userSession);
    }

    public static final 0xI A00(C234072ww r9, C247733gp r10, 1Xl r11, String str) {
        String str2;
        UserSession userSession = r9.A03;
        AnonymousClass4DU r5 = r9.A04;
        0xI A002 = C254513sb.A03(userSession, r11, r5, str).A00();
        1Xj BPf = r11.BPf();
        A002.A0C("c_pk", r10.A0G);
        User user = r10.A08;
        String str3 = null;
        if (user != null) {
            str2 = user.getId();
        } else {
            str2 = null;
        }
        if (str2 != null) {
            A002.A0C("ca_pk", str2);
        }
        String str4 = r10.A0F;
        if (str4 != null) {
            A002.A0C("parent_c_pk", str4);
        }
        String str5 = r10.A0c;
        if (str5 != null) {
            A002.A0C("replied_c_pk", str5);
        }
        int ordinal = BPf.BR7().ordinal();
        int i = 2;
        if (ordinal == 0) {
            i = 1;
        } else if (ordinal != 1) {
            i = -1;
        }
        A002.A08(Integer.valueOf(i), "m_t");
        A002.A0C("inventory_source", BPf.A0C.BIl());
        C249763kK r0 = r9.A00;
        if (r0 != null) {
            str3 = r0.getSessionId();
        }
        String A003 = C46476Dff.A00();
        if (str3 != null) {
            A002.A0C(A003, str3);
        }
        A002.A09("is_media_organic", Boolean.valueOf(r5.isOrganicEligible()));
        return A002;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        if (com.instagram.api.schemas.CommentRestrictStatus.A05 == r7.A0U) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C254523sc A01(X.C247733gp r7, java.lang.Boolean r8) {
        /*
            r6 = this;
            X.1Xj r4 = r7.A07
            if (r4 == 0) goto L_0x009d
            X.4DU r5 = r6.A04
            java.lang.String r0 = "comment_impression"
            X.3sc r1 = new X.3sc
            r1.<init>(r5, r0)
            java.lang.String r0 = r7.A0G
            r1.A4o = r0
            java.lang.String r0 = r4.getId()
            r1.A5u = r0
            int r0 = r7.A02
            long r2 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.A3c = r0
            boolean r0 = r5.isOrganicEligible()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1e = r0
            boolean r0 = r7.A0n
            if (r0 == 0) goto L_0x0039
            boolean r0 = r7.A0l
            if (r0 != 0) goto L_0x0039
            com.instagram.api.schemas.CommentRestrictStatus r3 = com.instagram.api.schemas.CommentRestrictStatus.PENDING
            com.instagram.api.schemas.CommentRestrictStatus r2 = r7.A0U
            r0 = 1
            if (r3 != r2) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1H = r0
            X.1Xy r0 = r4.A0C
            java.lang.String r0 = r0.getMezqlToken()
            r1.A60 = r0
            com.instagram.user.model.User r0 = r7.A08
            r3 = 0
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r0.getId()
        L_0x0051:
            r1.A4q = r0
            com.instagram.common.session.UserSession r2 = r6.A03
            com.instagram.user.model.User r0 = r4.A2A(r2)
            if (r0 == 0) goto L_0x005f
            java.lang.String r3 = r0.getId()
        L_0x005f:
            r1.A4W = r3
            java.lang.String r0 = r7.A0F
            r1.A6J = r0
            java.lang.String r0 = r7.A0B
            r1.A4p = r0
            r1.A6K = r0
            java.lang.String r0 = r7.A0A
            r1.A4h = r0
            boolean r0 = r7.A0m
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1r = r0
            r1.A0G(r2, r4)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = X.0qQ.A0K(r8, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1m = r0
            r0 = 0
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1.A1t = r0
            X.1QJ r0 = X.AnonymousClass1QI.A00
            X.1QM r0 = r0.A02
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x009a
            r1.A65 = r0
        L_0x009a:
            return r1
        L_0x009b:
            r0 = r3
            goto L_0x0051
        L_0x009d:
            java.lang.String r1 = "Required value was null."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234072ww.A01(X.3gp, java.lang.Boolean):X.3sc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (com.instagram.api.schemas.CommentRestrictStatus.A05 == r7.A0U) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C247733gp r7, X.1Xj r8) {
        /*
            r6 = this;
            com.instagram.user.model.User r0 = r7.A08
            r2 = 0
            if (r0 == 0) goto L_0x0157
            java.lang.String r0 = r0.getId()
            X.4Ny r3 = X.C263944Ny.A00(r0)
        L_0x000d:
            if (r8 == 0) goto L_0x0154
            com.instagram.common.session.UserSession r0 = r6.A03
            com.instagram.user.model.User r0 = r8.A2A(r0)
            if (r0 == 0) goto L_0x0154
            java.lang.String r0 = r0.getId()
            X.4Ny r5 = X.C263944Ny.A00(r0)
        L_0x001f:
            X.0wc r4 = r6.A02
            java.lang.String r1 = "comment_impression"
            X.0kJ r0 = r4.A00
            X.0Aj r4 = r4.A00(r0, r1)
            java.lang.String r0 = r7.A0G
            long r0 = java.lang.Long.parseLong(r0)
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "c_pk"
            r4.A9F(r0, r1)
            if (r8 == 0) goto L_0x0151
            java.lang.String r1 = r8.getId()
        L_0x003e:
            java.lang.String r0 = "m_pk"
            r4.AAJ(r0, r1)
            if (r5 == 0) goto L_0x014e
            java.lang.Long r1 = r5.A00
        L_0x0047:
            java.lang.String r0 = "a_pk"
            r4.A9F(r0, r1)
            int r0 = r7.A02
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "like_count"
            r4.A9F(r0, r1)
            if (r3 == 0) goto L_0x014b
            java.lang.Long r1 = r3.A00
        L_0x005c:
            java.lang.String r0 = "ca_pk"
            r4.A9F(r0, r1)
            r1 = 0
            if (r8 == 0) goto L_0x006b
            boolean r0 = r8.CcK()
            if (r0 != 0) goto L_0x006b
            r1 = 1
        L_0x006b:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            java.lang.String r0 = "is_media_organic"
            r4.A7p(r0, r1)
            boolean r0 = r7.A0n
            if (r0 == 0) goto L_0x0083
            boolean r0 = r7.A0l
            if (r0 != 0) goto L_0x0083
            com.instagram.api.schemas.CommentRestrictStatus r3 = com.instagram.api.schemas.CommentRestrictStatus.PENDING
            com.instagram.api.schemas.CommentRestrictStatus r1 = r7.A0U
            r0 = 1
            if (r3 != r1) goto L_0x0084
        L_0x0083:
            r0 = 0
        L_0x0084:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_covered"
            r4.A7p(r0, r1)
            if (r8 == 0) goto L_0x0148
            java.lang.String r1 = r8.C9L()
        L_0x0093:
            java.lang.String r0 = "tracking_token"
            r4.AAJ(r0, r1)
            if (r8 == 0) goto L_0x0145
            X.1Xy r0 = r8.A0C
            java.lang.String r1 = r0.getMezqlToken()
        L_0x00a0:
            java.lang.String r0 = "mezql_token"
            r4.AAJ(r0, r1)
            boolean r0 = r7.A0p
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "has_subscriber_badge"
            r4.A7p(r0, r1)
            com.instagram.common.session.UserSession r5 = r6.A03
            X.0Tu r3 = X.0Tu.A06
            r0 = 36313437386704865(0x8102e1000207e1, double:3.028102253603325E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.String r0 = "is_merlin_double_logging_enabled"
            r4.A7p(r0, r1)
            if (r8 == 0) goto L_0x0143
            X.1Xy r0 = r8.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
        L_0x00ce:
            java.lang.String r0 = "ranking_info_token"
            r4.AAJ(r0, r1)
            if (r8 == 0) goto L_0x0141
            X.1Xy r0 = r8.A0C
            java.lang.String r1 = r0.getLoggingInfoToken()
        L_0x00db:
            java.lang.String r0 = "media_ranking_info_token"
            r4.AAJ(r0, r1)
            r0 = 36324149035085652(0x810c9f00012f54, double:3.0348763431716806E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0123
            if (r8 == 0) goto L_0x013f
            java.lang.String r0 = r8.getId()
            if (r0 == 0) goto L_0x013f
            java.lang.Integer r0 = X.C271444ir.A00(r0)
            if (r0 == 0) goto L_0x013f
            int r0 = r0.intValue()
            long r0 = (long) r0
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
        L_0x0102:
            java.lang.String r0 = "client_position"
            r4.A9F(r0, r1)
            if (r8 == 0) goto L_0x011e
            java.lang.String r0 = r8.getId()
            if (r0 == 0) goto L_0x011e
            java.lang.Long r0 = X.C271444ir.A01(r0)
            if (r0 == 0) goto L_0x011e
            long r2 = r0.longValue()
            double r0 = (double) r2
            java.lang.Double r2 = java.lang.Double.valueOf(r0)
        L_0x011e:
            java.lang.String r0 = "vpv_duration"
            r4.A8D(r0, r2)
        L_0x0123:
            java.lang.String r1 = r7.A0F
            if (r1 == 0) goto L_0x0132
            r0 = 10
            java.lang.Long r1 = X.00y.A0n(r0, r1)
            java.lang.String r0 = "parent_c_pk"
            r4.A9F(r0, r1)
        L_0x0132:
            java.lang.String r1 = r7.A0B
            if (r1 == 0) goto L_0x013b
            java.lang.String r0 = "c_index"
            r4.AAJ(r0, r1)
        L_0x013b:
            r4.Cgf()
            return
        L_0x013f:
            r1 = r2
            goto L_0x0102
        L_0x0141:
            r1 = r2
            goto L_0x00db
        L_0x0143:
            r1 = r2
            goto L_0x00ce
        L_0x0145:
            r1 = r2
            goto L_0x00a0
        L_0x0148:
            r1 = r2
            goto L_0x0093
        L_0x014b:
            r1 = r2
            goto L_0x005c
        L_0x014e:
            r1 = r2
            goto L_0x0047
        L_0x0151:
            r1 = r2
            goto L_0x003e
        L_0x0154:
            r5 = r2
            goto L_0x001f
        L_0x0157:
            r3 = r2
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234072ww.A02(X.3gp, X.1Xj):void");
    }
}
