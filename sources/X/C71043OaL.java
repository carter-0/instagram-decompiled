package X;

import com.instagram.user.model.User;

/* renamed from: X.OaL  reason: case insensitive filesystem */
public abstract class C71043OaL {
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006a, code lost:
        if (r8.length() == 0) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0071 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A00(X.O65 r9, java.lang.Object r10) {
        /*
            boolean r4 = r10 instanceof X.ODS
            r6 = r10
            if (r4 == 0) goto L_0x0009
            X.ODS r6 = (X.ODS) r6
            java.lang.Object r6 = r6.A00
        L_0x0009:
            boolean r0 = r6 instanceof X.1Xj
            r2 = 0
            if (r0 == 0) goto L_0x00b8
            r5 = r6
            X.1Xj r5 = (X.1Xj) r5
            java.lang.String r0 = r5.A2k()
            if (r0 != 0) goto L_0x0033
            java.lang.String r3 = r5.A2R()
            if (r3 == 0) goto L_0x0029
            r1 = 95
            java.lang.String r0 = r5.Bi3()
            java.lang.String r0 = X.002.A0T(r3, r0, r1)
            if (r0 != 0) goto L_0x0033
        L_0x0029:
            com.instagram.user.model.User r0 = X.C51966G9m.A11(r5)
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = r0.getId()
        L_0x0033:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r6, r0)
        L_0x0037:
            java.lang.Object r1 = r0.A00
            X.1Xj r1 = (X.1Xj) r1
            java.lang.Object r5 = r0.A01
            java.lang.String r5 = (java.lang.String) r5
            if (r4 == 0) goto L_0x00ab
            X.ODS r10 = (X.ODS) r10
            X.0eM r0 = r10.A01
            java.lang.Object r6 = r0.getValue()
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
        L_0x004b:
            if (r6 == 0) goto L_0x00b3
            java.lang.String r8 = r6.getUsername()
        L_0x0051:
            if (r1 == 0) goto L_0x00a9
            java.lang.String r7 = r1.A2n()
        L_0x0057:
            if (r5 != 0) goto L_0x005f
            if (r6 == 0) goto L_0x00a7
            java.lang.String r5 = r6.getId()
        L_0x005f:
            X.0bY r4 = X.DbW.A0G()
            if (r8 == 0) goto L_0x006c
            int r1 = r8.length()
            r0 = 0
            if (r1 != 0) goto L_0x006d
        L_0x006c:
            r0 = 1
        L_0x006d:
            java.lang.String r3 = ""
            if (r0 != 0) goto L_0x00a6
            if (r7 == 0) goto L_0x00a6
            int r0 = r7.length()
            if (r0 == 0) goto L_0x00a6
            java.lang.String r1 = "https://www.instagram.com/stories/"
            r0 = 47
            java.lang.String r1 = X.002.A0i(r1, r8, r7, r0)
            boolean r0 = r9.A00
            if (r0 == 0) goto L_0x00de
            android.net.Uri r0 = X.0cp.A01(r4, r1)
            if (r0 == 0) goto L_0x00a6
            android.net.Uri$Builder r1 = r0.buildUpon()
            java.lang.String r0 = "reel_id"
            r1.appendQueryParameter(r0, r5)
            if (r6 == 0) goto L_0x009a
            java.lang.String r2 = r6.getId()
        L_0x009a:
            java.lang.String r0 = "reel_owner_id"
            r1.appendQueryParameter(r0, r2)
            java.lang.String r3 = r1.toString()
            X.0qQ.A0A(r3)
        L_0x00a6:
            return r3
        L_0x00a7:
            r5 = r2
            goto L_0x005f
        L_0x00a9:
            r7 = r2
            goto L_0x0057
        L_0x00ab:
            if (r1 == 0) goto L_0x00b2
            com.instagram.user.model.User r6 = X.C51966G9m.A11(r1)
            goto L_0x004b
        L_0x00b2:
            r6 = r2
        L_0x00b3:
            r8 = r2
            goto L_0x0051
        L_0x00b5:
            r0 = r2
            goto L_0x0033
        L_0x00b8:
            boolean r0 = r6 instanceof X.AnonymousClass7FN
            if (r0 == 0) goto L_0x00c8
            X.7FN r6 = (X.AnonymousClass7FN) r6
            X.1Xj r1 = r6.A02
            java.lang.String r0 = r6.A08
        L_0x00c2:
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            goto L_0x0037
        L_0x00c8:
            boolean r0 = r6 instanceof X.AnonymousClass7FJ
            if (r0 == 0) goto L_0x00d3
            X.7FJ r6 = (X.AnonymousClass7FJ) r6
            X.1Xj r1 = r6.A01
            java.lang.String r0 = r6.A07
            goto L_0x00c2
        L_0x00d3:
            boolean r0 = r6 instanceof X.C381429bk
            if (r0 == 0) goto L_0x00df
            X.9bk r6 = (X.C381429bk) r6
            X.1Xj r1 = r6.A00
            java.lang.String r0 = r6.A0H
            goto L_0x00c2
        L_0x00de:
            return r1
        L_0x00df:
            java.lang.String r1 = "Expected either Media, DirectReelMedia, DirectStoryShareMedia, or DirectReelShareParams received "
            java.lang.String r0 = X.C66581MXm.A0y(r6)
            java.lang.IllegalStateException r0 = X.DbW.A0c(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71043OaL.A00(X.O65, java.lang.Object):java.lang.String");
    }

    public static final String A01(Object obj) {
        String str;
        1Xj r2;
        if (obj instanceof AnonymousClass77X) {
            r2 = ((AnonymousClass77X) obj).A01;
        } else if (obj instanceof 1Xj) {
            r2 = (1Xj) obj;
        } else if (obj instanceof C39798A9t) {
            str = ((C39798A9t) obj).A04;
            return 002.A0R("https://www.instagram.com/reel/", str);
        } else {
            throw C66582MXn.A0k(obj, "Expected either DirectClipsShare or Media, found: ", AnonymousClass7TE.A1A());
        }
        str = r2.A2Z();
        return 002.A0R("https://www.instagram.com/reel/", str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0074, code lost:
        if (r0 != null) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.String A02(java.lang.Object r4) {
        /*
            boolean r0 = r4 instanceof X.OBM
            r3 = 0
            if (r0 == 0) goto L_0x004c
            X.OBM r4 = (X.OBM) r4
            X.0eM r0 = r4.A01
            java.lang.Object r1 = r0.getValue()
            java.lang.String r0 = r4.A00
            X.59G r2 = new X.59G
            r2.<init>(r1, r0, r3)
        L_0x0014:
            java.lang.Object r4 = r2.A00
            java.lang.String r4 = (java.lang.String) r4
            java.lang.Object r3 = r2.A01
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.A02
            java.lang.String r2 = (java.lang.String) r2
            if (r4 == 0) goto L_0x003d
            if (r3 == 0) goto L_0x003d
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "https://www.instagram.com/"
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "/live/"
            r1.append(r0)
            r1.append(r3)
        L_0x0038:
            java.lang.String r0 = r1.toString()
            return r0
        L_0x003d:
            if (r2 == 0) goto L_0x0077
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "https://www.instagram.com/tv/"
            r1.append(r0)
            r1.append(r2)
            goto L_0x0038
        L_0x004c:
            boolean r0 = r4 instanceof X.C45425Cw5
            if (r0 == 0) goto L_0x007a
            X.Cw5 r4 = (X.C45425Cw5) r4
            X.4gL r0 = r4.A01
            if (r0 == 0) goto L_0x0072
            com.instagram.user.model.User r0 = r0.A03()
        L_0x005a:
            java.lang.String r3 = r0.getUsername()
        L_0x005e:
            X.4gL r0 = r4.A01
            if (r0 == 0) goto L_0x006f
            java.lang.String r1 = r0.A0X
            r1.getClass()
        L_0x0067:
            java.lang.String r0 = r4.A05
            X.59G r2 = new X.59G
            r2.<init>(r3, r1, r0)
            goto L_0x0014
        L_0x006f:
            java.lang.String r1 = r4.A03
            goto L_0x0067
        L_0x0072:
            com.instagram.user.model.User r0 = r4.A02
            if (r0 == 0) goto L_0x005e
            goto L_0x005a
        L_0x0077:
            java.lang.String r0 = ""
            return r0
        L_0x007a:
            java.lang.String r0 = "Expected either LiveDeeplinkModel or DirectLiveViewerInvite"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71043OaL.A02(java.lang.Object):java.lang.String");
    }

    public static final String A03(Object obj) {
        0eP A1L;
        String str;
        User A11;
        if (obj instanceof 1Xj) {
            A1L = AnonymousClass7TE.A1L(obj, ((1Xj) obj).A0C.Am5());
        } else if (AnonymousClass9JI.A00(2, obj)) {
            AnonymousClass9JI r4 = (AnonymousClass9JI) obj;
            1Xj r1 = (1Xj) r4.A00;
            String str2 = r4.A02;
            if (str2 == null) {
                str2 = r1.A0C.Am5();
            }
            A1L = AnonymousClass7TE.A1L(r1, str2);
        } else {
            throw C66582MXn.A0k(obj, "Expected either Media or DirectMediaShare, received ", AnonymousClass7TE.A1A());
        }
        1Xj r42 = (1Xj) A1L.A00;
        String str3 = (String) A1L.A01;
        StringBuilder sb = new StringBuilder("https://www.instagram.com");
        if (!(r42 == null || (A11 = C51966G9m.A11(r42)) == null)) {
            sb.append(002.A0D(A11.getId(), '/'));
        }
        if (r42 != null) {
            str = r42.A2Z();
        } else {
            str = null;
        }
        C66580MXl.A1V("/p/", str, sb);
        if (str3 != null) {
            C66580MXl.A1V("?carousel_share_child_media_id=", str3, sb);
        }
        return DbT.A10(sb);
    }
}
