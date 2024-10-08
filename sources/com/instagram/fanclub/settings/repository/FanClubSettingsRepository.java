package com.instagram.fanclub.settings.repository;

import X.02z;
import X.05G;
import X.AnonymousClass0Ud;
import X.C314996jB;
import X.C51970G9q;
import X.C51974G9v;
import X.C64829Lip;
import X.JTQ;
import com.instagram.fanclub.api.FanClubApi;
import com.instagram.monetization.repository.MonetizationRepository;

public final class FanClubSettingsRepository {
    public final FanClubApi A00;
    public final C64829Lip A01;
    public final FanClubSettingsRecommendationsRepository A02;
    public final MonetizationRepository A03;
    public final C314996jB A04;
    public final AnonymousClass0Ud A05;
    public final AnonymousClass0Ud A06;
    public final String A07;
    public final 05G A08;
    public final 05G A09;

    public FanClubSettingsRepository(FanClubApi fanClubApi, C64829Lip lip, FanClubSettingsRecommendationsRepository fanClubSettingsRecommendationsRepository, MonetizationRepository monetizationRepository, C314996jB r7, String str) {
        C51974G9v.A0d(3, monetizationRepository, fanClubSettingsRecommendationsRepository, r7, lip);
        this.A07 = str;
        this.A00 = fanClubApi;
        this.A03 = monetizationRepository;
        this.A02 = fanClubSettingsRecommendationsRepository;
        this.A04 = r7;
        this.A01 = lip;
        02z A10 = C51970G9q.A10(false);
        this.A09 = A10;
        this.A06 = A10;
        02z A0r = JTQ.A0r(0);
        this.A08 = A0r;
        this.A05 = A0r;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.JUN, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005b, code lost:
        if (r0.A00(r3, r10) != r5) goto L_0x0065;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r9, boolean r10) {
        /*
            r8 = this;
            r4 = 4
            boolean r0 = X.JUN.A00(r4, r9)
            if (r0 == 0) goto L_0x0089
            r3 = r9
            X.JUN r3 = (X.JUN) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0089
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r0 = r3.A02
            X.1Hj r5 = X.1Hj.A02
            int r1 = r3.A00
            r7 = 3
            r4 = 2
            r2 = 1
            if (r1 == 0) goto L_0x003d
            if (r1 == r2) goto L_0x0033
            if (r1 == r4) goto L_0x005e
            if (r1 != r7) goto L_0x008f
            java.lang.Object r6 = r3.A01
            X.05G r6 = (X.05G) r6
            X.0eS.A00(r0)
        L_0x002d:
            r6.Epw(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0033:
            boolean r10 = r3.A04
            java.lang.Object r1 = r3.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r1 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r1
            X.0eS.A00(r0)
            goto L_0x0051
        L_0x003d:
            X.0eS.A00(r0)
            com.instagram.monetization.repository.MonetizationRepository r1 = r8.A03
            com.instagram.api.schemas.UserMonetizationProductType r0 = com.instagram.api.schemas.UserMonetizationProductType.FAN_CLUB_CREATOR
            r3.A01 = r8
            r3.A04 = r10
            r3.A00 = r2
            java.lang.Object r0 = r1.A00(r0, r3)
            if (r0 == r5) goto L_0x005d
            r1 = r8
        L_0x0051:
            com.instagram.fanclub.settings.repository.FanClubSettingsRecommendationsRepository r0 = r1.A02
            r3.A01 = r1
            r3.A00 = r4
            java.lang.Object r0 = r0.A00(r3, r10)
            if (r0 != r5) goto L_0x0065
        L_0x005d:
            return r5
        L_0x005e:
            java.lang.Object r1 = r3.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r1 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r1
            X.0eS.A00(r0)
        L_0x0065:
            X.Lip r0 = r1.A01
            r0.A00()
            X.05G r6 = r1.A09
            com.instagram.monetization.repository.MonetizationRepository r4 = r1.A03
            r3.A01 = r6
            r3.A00 = r7
            X.3Pl r3 = X.JTQ.A0m(r3)
            X.EXJ r2 = X.EXJ.A07
            r1 = 34
            X.JJR r0 = new X.JJR
            r0.<init>(r3, r1)
            X.FCM.A02(r2, r4, r0)
            java.lang.Object r0 = r3.A00()
            if (r0 != r5) goto L_0x002d
            return r5
        L_0x0089:
            X.JUN r3 = new X.JUN
            r3.<init>(r8, r9, r4)
            goto L_0x0015
        L_0x008f:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.settings.repository.FanClubSettingsRepository.A01(X.4D7, boolean):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MDp] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r13) {
        /*
            r12 = this;
            r3 = 10
            boolean r0 = X.C66137MDp.A02(r3, r13)
            if (r0 == 0) goto L_0x0084
            r4 = r13
            X.MDp r4 = (X.C66137MDp) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0084
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r4.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x006b
            if (r0 != r5) goto L_0x0089
            java.lang.Object r4 = r4.A01
            com.instagram.fanclub.settings.repository.FanClubSettingsRepository r4 = (com.instagram.fanclub.settings.repository.FanClubSettingsRepository) r4
            X.0eS.A00(r2)
        L_0x0028:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0062
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            X.C7k r0 = (X.C43740C7k) r0
            if (r0 == 0) goto L_0x005f
            X.C7j r0 = r0.A0E()
            if (r0 == 0) goto L_0x005f
            X.C7i r3 = r0.A0E()
            if (r3 == 0) goto L_0x005f
            java.lang.Class<X.Bjp> r2 = X.C42843Bjp.class
            r0 = 2708(0xa94, float:3.795E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1827495145(0xffffffff9312a317, float:-1.85082E-27)
            X.3lr r2 = r3.getOptionalTreeField(r5, r1, r2, r0)
            if (r2 == 0) goto L_0x005f
            r1 = 0
            java.lang.String r0 = "count"
            int r1 = r2.getCoercedIntField(r1, r0)
            X.05G r0 = r4.A08
            X.JTQ.A1N(r0, r1)
        L_0x005f:
            X.0gF r1 = X.C60340gF.A00
        L_0x0061:
            return r1
        L_0x0062:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x005f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x006b:
            X.0eS.A00(r2)
            com.instagram.fanclub.api.FanClubApi r2 = r12.A00
            java.lang.String r3 = r12.A07
            r4.A01 = r12
            r4.A00 = r5
            r6 = 0
            r7 = r6
            r8 = r6
            r9 = r6
            r10 = r6
            r11 = r6
            java.lang.Object r2 = r2.A0J(r3, r4, r5, r6, r7, r8, r9, r10, r11)
            if (r2 == r1) goto L_0x0061
            r4 = r12
            goto L_0x0028
        L_0x0084:
            X.MDp r4 = X.C66137MDp.A00(r12, r13, r3)
            goto L_0x0016
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.fanclub.settings.repository.FanClubSettingsRepository.A00(X.4D7):java.lang.Object");
    }
}
