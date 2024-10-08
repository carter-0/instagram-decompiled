package com.instagram.release.buildinfo;

import X.0oI;
import X.0qQ;
import X.1vm;
import X.1vn;
import X.AnonymousClass9FJ;
import X.C60960kU;
import com.instagram.common.session.UserSession;

public final class BuildInfoApi {
    public final 1vn A00;
    public final AnonymousClass9FJ A01;
    public final boolean A02;

    public BuildInfoApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        AnonymousClass9FJ r3 = new AnonymousClass9FJ();
        1vn A012 = 1vm.A01(userSession);
        boolean A09 = 0oI.A09(C60960kU.A00);
        0qQ.A0B(A012, 2);
        this.A01 = r3;
        this.A00 = A012;
        this.A02 = A09;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r5v8 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b2, code lost:
        if (r3 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r10) {
        /*
            r9 = this;
            r3 = 9
            boolean r0 = X.MEA.A03(r3, r10)
            if (r0 == 0) goto L_0x00ec
            r5 = r10
            X.MEA r5 = (X.MEA) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ec
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r7 = 1
            if (r0 == 0) goto L_0x00bf
            if (r0 != r7) goto L_0x00fb
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b5
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r3 = r0.A01
            X.3lr r3 = (X.C250663lr) r3
            r6 = 0
            if (r3 == 0) goto L_0x00b1
            java.lang.Class<X.9ew> r2 = X.C383049ew.class
            java.lang.String r1 = "xfb_mobile_build_ios_self_update(app_id:$app_id)"
            r0 = 1828575240(0x6cfdd808, float:2.4550273E27)
            X.3lr r2 = r3.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x00b1
            r1 = 3
            r0 = 1146(0x47a, float:1.606E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r5 = r2.getCoercedIntField(r1, r0)
        L_0x004f:
            java.lang.Class<X.9ew> r2 = X.C383049ew.class
            java.lang.String r1 = "xfb_mobile_build_ios_self_update(app_id:$app_id)"
            r0 = 1828575240(0x6cfdd808, float:2.4550273E27)
            X.3lr r2 = r3.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x0063
            r1 = 4
            java.lang.String r0 = "publish_date"
            int r6 = r2.getCoercedIntField(r1, r0)
        L_0x0063:
            r4 = 0
            if (r3 == 0) goto L_0x007a
            java.lang.Class<X.9ew> r2 = X.C383049ew.class
            java.lang.String r1 = "xfb_mobile_build_ios_self_update(app_id:$app_id)"
            r0 = 1828575240(0x6cfdd808, float:2.4550273E27)
            X.3lr r2 = r3.A03(r2, r1, r0)
            if (r2 == 0) goto L_0x007a
            r1 = 6
            java.lang.String r0 = "version_name"
            java.lang.String r4 = r2.getOptionalStringField(r1, r0)
        L_0x007a:
            java.lang.String r8 = ""
            if (r4 != 0) goto L_0x007f
            r4 = r8
        L_0x007f:
            if (r3 == 0) goto L_0x0097
            java.lang.Class<X.9ew> r2 = X.C383049ew.class
            java.lang.String r1 = "xfb_mobile_build_ios_self_update(app_id:$app_id)"
            r0 = 1828575240(0x6cfdd808, float:2.4550273E27)
            X.3lr r1 = r3.A03(r2, r1, r0)
            if (r1 == 0) goto L_0x0097
            java.lang.String r0 = "download_url"
            java.lang.String r0 = r1.getOptionalStringField(r7, r0)
            if (r0 == 0) goto L_0x0097
            r8 = r0
        L_0x0097:
            X.9J7 r3 = new X.9J7
            r3.<init>(r4, r5, r6, r7, r8)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r3)
        L_0x00a1:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00b0
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00f5
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x00b0:
            return r1
        L_0x00b1:
            r5 = 0
            if (r3 == 0) goto L_0x0063
            goto L_0x004f
        L_0x00b5:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a1
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00bf:
            X.0eS.A00(r1)
            boolean r0 = r9.A02
            if (r0 == 0) goto L_0x00e9
            r0 = 2068(0x814, float:2.898E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
        L_0x00cc:
            X.9FJ r2 = r9.A01
            X.2IS r1 = r2.A00
            java.lang.String r0 = "app_id"
            r1.A04(r0, r3)
            r2.A02 = r7
            X.1Ef r1 = r2.build()
            X.1vn r0 = r9.A00
            X.0qQ.A0A(r1)
            r5.A00 = r7
            java.lang.Object r1 = r0.A04(r1, r5)
            if (r1 != r4) goto L_0x0024
            return r4
        L_0x00e9:
            java.lang.String r3 = "124024574287414"
            goto L_0x00cc
        L_0x00ec:
            r0 = 42
            X.MEA r5 = new X.MEA
            r5.<init>(r9, r10, r3, r0)
            goto L_0x0016
        L_0x00f5:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00fb:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.buildinfo.BuildInfoApi.A00(X.4D7):java.lang.Object");
    }
}
