package X;

public final class LOQ {
    public static final LOQ A00 = new Object();

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A01(com.instagram.common.session.UserSession r5, java.lang.String r6, boolean r7) {
        /*
            r4 = this;
            r0 = 0
            X.0qQ.A0B(r5, r0)
            r3 = 0
            boolean r0 = X.2R8.A05(r5, r6)
            if (r7 == 0) goto L_0x0024
            if (r0 == 0) goto L_0x001c
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321108199154800(0x8109db000f2470, double:3.032953306284546E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x001c
        L_0x001a:
            r3 = 1
        L_0x001b:
            return r3
        L_0x001c:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321108199285874(0x8109db00112472, double:3.032953306367438E-306)
            goto L_0x003b
        L_0x0024:
            if (r0 == 0) goto L_0x0034
            X.0Tu r2 = X.0Tu.A06
            r0 = 36321108198499430(0x8109db00052466, double:3.0329533058700877E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 != 0) goto L_0x0034
            goto L_0x001a
        L_0x0034:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36321108198237282(0x8109db00012462, double:3.032953305704304E-306)
        L_0x003b:
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x001b
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOQ.A01(com.instagram.common.session.UserSession, java.lang.String, boolean):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        if (r8 != null) goto L_0x0020;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002c, code lost:
        if (r9.isEmpty() == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0086, code lost:
        if (r1.equals(r4) == false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0090, code lost:
        if (X.0qQ.A0K(r1.A00, r4.A00) != false) goto L_0x0057;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00(java.util.List r8, java.util.List r9, java.util.List r10, java.util.List r11) {
        /*
            r7 = this;
            boolean r0 = r10.isEmpty()
            if (r0 == 0) goto L_0x002e
            if (r11 == 0) goto L_0x000e
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x002e
        L_0x000e:
            if (r8 == 0) goto L_0x0016
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0020
        L_0x0016:
            if (r9 == 0) goto L_0x001e
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x002e
        L_0x001e:
            if (r8 == 0) goto L_0x0051
        L_0x0020:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0051
            if (r9 == 0) goto L_0x002e
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x0053
        L_0x002e:
            java.io.StringWriter r5 = X.JTO.A0v()
            X.17W r4 = X.AnonymousClass7TF.A0K(r5)
            java.lang.String r0 = "removed"
            r4.A0q(r0)
            java.util.Iterator r1 = X.JTP.A0v(r4, r10)
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0093
            java.lang.Object r0 = r1.next()
            com.instagram.model.fbusertag.FBUserTag r0 = (com.instagram.model.fbusertag.FBUserTag) r0
            java.lang.String r0 = r0.A03
            r4.A0t(r0)
            goto L_0x003f
        L_0x0051:
            if (r9 == 0) goto L_0x015a
        L_0x0053:
            java.util.Iterator r5 = r9.iterator()
        L_0x0057:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x015a
            java.lang.Object r4 = r5.next()
            com.instagram.model.fbusertag.FBUserTag r4 = (com.instagram.model.fbusertag.FBUserTag) r4
            java.lang.String r3 = r4.A03
            X.0qQ.A07(r3)
            if (r8 == 0) goto L_0x002e
            java.util.Iterator r2 = r8.iterator()
        L_0x006e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x002e
            java.lang.Object r1 = r2.next()
            com.instagram.model.fbusertag.FBUserTag r1 = (com.instagram.model.fbusertag.FBUserTag) r1
            java.lang.String r0 = r1.A03
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r1.equals(r4)
            if (r0 == 0) goto L_0x002e
            android.graphics.PointF r1 = r1.A00
            android.graphics.PointF r0 = r4.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0057
            goto L_0x002e
        L_0x0093:
            r4.A0Y()
            java.lang.String r0 = "added"
            r4.A0q(r0)
            r4.A0b()
            if (r11 == 0) goto L_0x00b6
            java.util.Iterator r1 = r11.iterator()
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r1.next()
            com.instagram.model.fbusertag.FBUserTag r0 = (com.instagram.model.fbusertag.FBUserTag) r0
            java.lang.String r0 = r0.A03
            r4.A0t(r0)
            goto L_0x00a4
        L_0x00b6:
            r4.A0Y()
            java.lang.String r0 = "in"
            r4.A0q(r0)
            r4.A0b()
            if (r9 == 0) goto L_0x014f
            java.util.Iterator r6 = r9.iterator()
        L_0x00c7:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x014f
            java.lang.Object r2 = r6.next()
            com.instagram.model.fbusertag.FBUserTag r2 = (com.instagram.model.fbusertag.FBUserTag) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            r4.A0c()
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "tag_id"
            r4.A0R(r0, r1)
            boolean r1 = r2.A04
            r0 = 1082(0x43a, float:1.516E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0S(r0, r1)
            android.graphics.PointF r0 = r2.A00
            X.JTT.A0y(r0, r4)
            com.instagram.api.schemas.FBTagType r0 = r2.A01
            if (r0 == 0) goto L_0x014d
            java.lang.String r1 = r0.A00
        L_0x00f7:
            java.lang.String r0 = "fb_tag_type"
            r4.A0R(r0, r1)
            java.lang.String r0 = "fb_user"
            r4.A0q(r0)
            r4.A0c()
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r2.A02
            java.lang.String r1 = r0.A01
            java.lang.String r0 = "full_name"
            r4.A0R(r0, r1)
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r2.A02
            java.lang.String r1 = r0.A03
            r0 = 40
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0R(r0, r1)
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r2.A02
            java.lang.String r1 = r0.A04
            r0 = 5144(0x1418, float:7.208E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0R(r0, r1)
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r2.A02
            java.lang.String r1 = r0.A02
            r0 = 5137(0x1411, float:7.198E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0R(r0, r1)
            com.instagram.model.fbusertag.FBUserTag$FBUserInfo r0 = r2.A02
            java.lang.String r3 = r0.A06
            r2 = 19
            r1 = 8
            r0 = 78
            java.lang.String r0 = X.C46325Dbt.A00(r2, r1, r0)
            r4.A0R(r0, r3)
            r4.A0Z()
            r4.A0Z()
            goto L_0x00c7
        L_0x014d:
            r1 = 0
            goto L_0x00f7
        L_0x014f:
            r4.A0Y()
            java.lang.String r0 = X.AnonymousClass7TG.A0k(r4, r5)
            X.0qQ.A07(r0)
            return r0
        L_0x015a:
            java.lang.String r0 = ""
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LOQ.A00(java.util.List, java.util.List, java.util.List, java.util.List):java.lang.String");
    }
}
