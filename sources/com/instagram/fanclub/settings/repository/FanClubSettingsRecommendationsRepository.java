package com.instagram.fanclub.settings.repository;

import X.02z;
import X.05G;
import X.10b;
import X.AnonymousClass0Ud;
import X.JTO;
import com.instagram.fanclub.api.FanClubApi;

public final class FanClubSettingsRecommendationsRepository {
    public final FanClubApi A00;
    public final AnonymousClass0Ud A01;
    public final 05G A02;

    /* JADX WARNING: type inference failed for: r5v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r7, boolean r8) {
        /*
            r6 = this;
            r3 = 9
            boolean r0 = X.C66137MDp.A02(r3, r7)
            if (r0 == 0) goto L_0x0060
            r5 = r7
            X.MDp r5 = (X.C66137MDp) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0060
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 != r2) goto L_0x0065
            java.lang.Object r1 = r5.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository r1 = (com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository) r1
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0040
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.YBH r0 = (X.YBH) r0
            X.05G r1 = r1.A02
            X.JxG r0 = (X.JxG) r0
            java.util.List r0 = r0.A00
            r1.Epw(r0)
        L_0x003d:
            X.0gF r3 = X.C60340gF.A00
        L_0x003f:
            return r3
        L_0x0040:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003d
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0049:
            X.0eS.A00(r4)
            com.instagram.fanclub.api.FanClubApi r1 = r6.A00
            if (r8 == 0) goto L_0x005e
            java.lang.String r0 = "settings"
        L_0x0052:
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r1.A0D(r0, r5)
            if (r4 == r3) goto L_0x003f
            r1 = r6
            goto L_0x0028
        L_0x005e:
            r0 = 0
            goto L_0x0052
        L_0x0060:
            X.MDp r5 = X.C66137MDp.A00(r6, r7, r3)
            goto L_0x0016
        L_0x0065:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository.A00(X.4D7, boolean):java.lang.Object");
    }

    public FanClubSettingsRecommendationsRepository(FanClubApi fanClubApi) {
        this.A00 = fanClubApi;
        02z A1J = JTO.A1J();
        this.A02 = A1J;
        this.A01 = 10b.A03(A1J);
    }
}
