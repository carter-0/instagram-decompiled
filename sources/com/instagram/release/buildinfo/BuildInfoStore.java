package com.instagram.release.buildinfo;

import X.0qQ;
import X.0xa;
import X.19B;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass19S;
import X.AnonymousClass1HX;
import X.AnonymousClass4D7;
import X.AnonymousClass9FK;
import X.AnonymousClass9J7;
import X.C376909Ju;
import X.C61410nE;
import com.instagram.common.session.UserSession;

public final class BuildInfoStore {
    public long A00 = this.A03.getLong("RecommendedBuildLastUpdated", 0);
    public AnonymousClass9J7 A01;
    public final UserSession A02;
    public final 0xa A03;
    public final C61410nE A04;
    public final BuildInfoApi A05;
    public final AnonymousClass9FK A06;

    public BuildInfoStore(UserSession userSession, C61410nE r8, 0xa r9, BuildInfoApi buildInfoApi, AnonymousClass9FK r11) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r8, 5);
        this.A02 = userSession;
        this.A03 = r9;
        this.A05 = buildInfoApi;
        this.A06 = r11;
        this.A04 = r8;
        this.A01 = new AnonymousClass9J7(r9.C1q("RecommendedVersionName"), r9.getInt("RecommendedBuildNumber", 0), r9.getInt("RecommendedPublishDate", 0), 1, r9.C1q("RecommendedDownloadUrl"));
    }

    public final void A01() {
        AnonymousClass19S A012 = AnonymousClass1HX.A01(2053690886, 3);
        C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 33);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A012);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 39
            boolean r0 = X.C66138MDq.A02(r3, r6)
            if (r0 == 0) goto L_0x008c
            r4 = r6
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x007b
            if (r0 != r1) goto L_0x0098
            java.lang.Object r4 = r4.A01
            com.instagram.release.buildinfo.BuildInfoStore r4 = (com.instagram.release.buildinfo.BuildInfoStore) r4
            X.0eS.A00(r3)
        L_0x0028:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0072
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            X.9J7 r2 = (X.AnonymousClass9J7) r2
            r4.A01 = r2
            long r0 = java.lang.System.currentTimeMillis()
            r4.A00 = r0
            X.0xa r0 = r4.A03
            X.0xY r3 = r0.AR4()
            int r1 = r2.A01
            java.lang.String r0 = "RecommendedBuildNumber"
            r3.E5Z(r0, r1)
            int r1 = r2.A02
            java.lang.String r0 = "RecommendedPublishDate"
            r3.E5Z(r0, r1)
            java.lang.String r1 = r2.A04
            java.lang.String r0 = "RecommendedVersionName"
            r3.E5g(r0, r1)
            java.lang.String r1 = r2.A03
            java.lang.String r0 = "RecommendedDownloadUrl"
            r3.E5g(r0, r1)
            long r1 = r4.A00
            java.lang.String r0 = "RecommendedBuildLastUpdated"
            r3.E5c(r0, r1)
            r3.apply()
            X.9FK r1 = r4.A06
            java.lang.String r0 = "build_info_api_success"
        L_0x006c:
            r1.A00(r0)
            X.0gF r2 = X.C60340gF.A00
        L_0x0071:
            return r2
        L_0x0072:
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0092
            X.9FK r1 = r4.A06
            java.lang.String r0 = "build_info_api_failure"
            goto L_0x006c
        L_0x007b:
            X.0eS.A00(r3)
            com.instagram.release.buildinfo.BuildInfoApi r0 = r5.A05
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A00(r4)
            if (r3 == r2) goto L_0x0071
            r4 = r5
            goto L_0x0028
        L_0x008c:
            X.MDq r4 = new X.MDq
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x0092:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0098:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.buildinfo.BuildInfoStore.A00(X.4D7):java.lang.Object");
    }
}
