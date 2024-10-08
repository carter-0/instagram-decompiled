package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.7FO  reason: invalid class name */
public abstract class AnonymousClass7FO {
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0057, code lost:
        if (r1 == com.instagram.api.schemas.IGAIAgentVisibilityStatus.A05) goto L_0x0059;
     */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A00(com.instagram.common.session.UserSession r5, X.C254703su r6, X.C327687Bu r7, java.lang.Integer r8, java.util.List r9, int r10, boolean r11) {
        /*
            r1 = 2
            X.0qQ.A0B(r7, r1)
            r0 = 6
            X.0qQ.A0B(r9, r0)
            java.lang.String r0 = r6.A0g()
            if (r0 == 0) goto L_0x00ab
            boolean r0 = r7.AFq(r5, r6)
            if (r0 == 0) goto L_0x00ab
            if (r11 == 0) goto L_0x0022
            r0 = 29
            if (r10 != r0) goto L_0x0022
            if (r8 == 0) goto L_0x0078
            int r0 = r8.intValue()
            if (r0 != r1) goto L_0x0078
        L_0x0022:
            java.lang.String r4 = r6.A1u
            X.0qQ.A07(r4)
            r0 = 1012(0x3f4, float:1.418E-42)
            if (r10 == r0) goto L_0x0059
            r0 = 1014(0x3f6, float:1.421E-42)
            if (r10 != r0) goto L_0x007c
            java.util.Iterator r3 = r9.iterator()
        L_0x0033:
            boolean r0 = r3.hasNext()
            r1 = 0
            if (r0 == 0) goto L_0x007a
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = X.0qQ.A0K(r0, r4)
            if (r0 == 0) goto L_0x0033
        L_0x004b:
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L_0x0055
            X.4Cl r0 = r2.A03
            com.instagram.api.schemas.IGAIAgentVisibilityStatus r1 = r0.AaY()
        L_0x0055:
            com.instagram.api.schemas.IGAIAgentVisibilityStatus r0 = com.instagram.api.schemas.IGAIAgentVisibilityStatus.PUBLIC
            if (r1 != r0) goto L_0x007c
        L_0x0059:
            java.lang.String r1 = r5.A06
            java.lang.String r0 = r6.BsI()
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007c
            boolean r0 = X.AnonymousClass9B8.A07(r5)
            if (r0 == 0) goto L_0x007c
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320077406150601(0x8108eb00021fc9, double:3.0323014286380206E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x007c
        L_0x0078:
            r0 = 1
            return r0
        L_0x007a:
            r2 = r1
            goto L_0x004b
        L_0x007c:
            java.lang.String r1 = X.C3262475z.A00(r5)
            java.lang.String r0 = r6.A1u
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ab
            X.7AG r0 = r6.A0Q
            if (r0 == 0) goto L_0x00ab
            boolean r0 = X.AnonymousClass9B8.A07(r5)
            if (r0 == 0) goto L_0x00ab
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320077406150601(0x8108eb00021fc9, double:3.0323014286380206E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00ab
            r0 = 36325613619786843(0x810df4000e345b, double:3.035802552434123E-306)
            boolean r0 = X.182.A06(r2, r5, r0)
            if (r0 == 0) goto L_0x00ab
            goto L_0x0078
        L_0x00ab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7FO.A00(com.instagram.common.session.UserSession, X.3su, X.7Bu, java.lang.Integer, java.util.List, int, boolean):boolean");
    }

    public static final boolean A01(UserSession userSession, C254703su r4, Integer num, List list, int i, boolean z) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(list, 5);
        1at A00 = C327657Br.A00();
        2FW r0 = r4.A10;
        0qQ.A07(r0);
        return A00(userSession, r4, A00.A01(r0), num, list, i, z);
    }
}
