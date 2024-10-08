package X;

import com.instagram.common.session.UserSession;

public final class I66 {
    public static final I66 A00 = new Object();

    public static final AnonymousClass2Q8 A01(AnonymousClass07Z r3, UserSession userSession, String str) {
        AnonymousClass07V lifecycle;
        if (str == null || (lifecycle = r3.getLifecycle()) == null) {
            return null;
        }
        AnonymousClass0xx A002 = C71772f0.A00(lifecycle);
        return 1Eo.A02(19B.A00, new C58082IlT(userSession, str, (AnonymousClass4D7) null, 11), A002);
    }

    public static final AnonymousClass2Q8 A02(AnonymousClass07Z r2, UserSession userSession, String str, String str2) {
        AnonymousClass07V lifecycle = r2.getLifecycle();
        if (lifecycle == null) {
            return null;
        }
        AnonymousClass0xx A002 = C71772f0.A00(lifecycle);
        return 1Eo.A02(19B.A00, new C58083IlZ(userSession, str, str2, (AnonymousClass4D7) null), A002);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDj, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00be, code lost:
        if (r0 == r5) goto L_0x00c0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.common.session.UserSession r8, X.I66 r9, java.lang.String r10, java.lang.String r11, X.AnonymousClass4D7 r12) {
        /*
            r3 = 26
            boolean r0 = X.C66131MDj.A01(r3, r12)
            if (r0 == 0) goto L_0x00c1
            r6 = r12
            X.MDj r6 = (X.C66131MDj) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c1
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A03
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r7 = 1
            if (r1 == 0) goto L_0x0087
            if (r1 != r7) goto L_0x00cd
            java.lang.Object r11 = r6.A02
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r10 = r6.A01
            java.lang.String r10 = (java.lang.String) r10
            X.0eS.A00(r0)
        L_0x002c:
            r5 = r0
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r5 = (X.C239793Ih) r5
            java.lang.Object r0 = r5.A00
            X.CDA r0 = (X.CDA) r0
            X.BAf r0 = r0.A00
            if (r0 != 0) goto L_0x004e
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0045:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0054
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x004e:
            X.1s8 r0 = r0.A00
            X.3Ih r5 = X.C41845B3m.A0d(r0)
        L_0x0054:
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00c0
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c8
            X.5sO r5 = (X.C297815sO) r5
            java.lang.Object r4 = r5.A00
            X.0wj r3 = X.0wj.A01
            r2 = 245701013(0xea51995, float:4.0700275E-30)
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "error toast shown for mediaId: "
            r1.append(r0)
            r1.append(r10)
            java.lang.String r0 = " from source "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = ". Failure: "
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r4, r0, r1)
            X.DbT.A1Q(r3, r0, r2)
            X.5sO r5 = X.DbU.A0f()
            return r5
        L_0x0087:
            X.0eS.A00(r0)
            X.1NY r2 = X.DbU.A0M(r8)
            java.lang.String r0 = "clips/get_mashup_info_for_media/"
            r2.A0A(r0)
            r2.A04()
            java.lang.Class<X.CDA> r1 = X.CDA.class
            java.lang.Class<X.Cyk> r0 = X.C45572Cyk.class
            r4 = 0
            r2.A0Q(r1, r0)
            r2.A0R = r7
            java.lang.String r0 = "media_id"
            X.1OC r3 = X.DbT.A0T(r2, r0, r10)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36601462188609738(0x8208d6000310ca, double:3.210250298110753E-306)
            int r1 = X.DbS.A04(r2, r8, r0)
            r6.A01 = r10
            r6.A02 = r11
            r6.A00 = r7
            r0 = 110868677(0x69bb8c5, float:5.8576014E-35)
            java.lang.Object r0 = r3.A02(r6, r0, r1, r4)
            if (r0 != r5) goto L_0x002c
        L_0x00c0:
            return r5
        L_0x00c1:
            X.MDj r6 = new X.MDj
            r6.<init>(r9, r12, r3)
            goto L_0x0016
        L_0x00c8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I66.A00(com.instagram.common.session.UserSession, X.I66, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }
}
