package com.instagram.creator.agent.settings.audience;

import X.02z;
import X.05G;
import X.0pp;
import X.0qQ;
import X.106;
import X.10b;
import X.AnonymousClass0Ud;
import X.AnonymousClass10A;
import X.AnonymousClass10H;
import X.AnonymousClass4D7;
import X.C247303g7;
import X.C51970G9q;
import X.C51972G9s;
import X.C53357Gmh;
import X.C54617HLa;
import X.C57143IQg;
import X.DbS;
import X.HNK;
import X.JUH;
import com.instagram.creator.agent.settings.repository.CreatorAiSettingsRepository;

public final class AudienceUseCase extends C247303g7 {
    public boolean A00 = true;
    public final AudienceRepository A01;
    public final CreatorAiSettingsRepository A02;
    public final String A03;
    public final 05G A04;
    public final 05G A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final 05G A0C;
    public final 05G A0D;

    public AudienceUseCase(AudienceRepository audienceRepository, CreatorAiSettingsRepository creatorAiSettingsRepository, String str, 05G r22, 05G r23, 05G r24, 05G r25) {
        String str2 = str;
        0qQ.A0B(str2, 1);
        05G r14 = r24;
        05G r0 = r25;
        C51972G9s.A1E(r14, r0);
        this.A03 = str2;
        this.A01 = audienceRepository;
        this.A02 = creatorAiSettingsRepository;
        05G r13 = r22;
        this.A09 = r13;
        this.A08 = r23;
        this.A0C = r14;
        this.A0D = r0;
        02z A012 = 106.A01(C57143IQg.A00);
        this.A04 = A012;
        this.A0A = 10b.A03(A012);
        C54617HLa hLa = C54617HLa.LOADING;
        02z A10 = DbS.A10(hLa);
        this.A05 = A10;
        02z A102 = C51970G9q.A10(false);
        this.A07 = A102;
        HNK hnk = HNK.NOBODY;
        02z A103 = DbS.A10(hnk);
        this.A06 = A103;
        0pp A022 = AnonymousClass10H.A02(new AudienceUseCase$uiState$1((AnonymousClass4D7) null), r13, r14, A10, A102, A103);
        this.A0B = 10b.A02(new C53357Gmh(JUH.A00(""), hLa, hnk, 2131975590, true, false), A03(), A022, AnonymousClass10A.A01);
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.creator.agent.settings.audience.AudienceUseCase r6, X.AnonymousClass4D7 r7) {
        /*
            r3 = 0
            boolean r0 = X.C66129MDh.A01(r3, r7)
            if (r0 == 0) goto L_0x006b
            r5 = r7
            X.MDh r5 = (X.C66129MDh) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006b
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0015:
            java.lang.Object r4 = r5.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x005b
            if (r0 != r3) goto L_0x0071
            java.lang.Object r6 = r5.A01
            com.instagram.creator.agent.settings.audience.AudienceUseCase r6 = (com.instagram.creator.agent.settings.audience.AudienceUseCase) r6
            X.0eS.A00(r4)
        L_0x0027:
            X.JZA r4 = (X.JZA) r4
            if (r4 == 0) goto L_0x0059
            X.05G r0 = r6.A08
            r0.Epw(r4)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0048
            X.05G r2 = r6.A09
            java.lang.Object r1 = r2.getValue()
            X.HNK r0 = X.HNK.NOBODY
            if (r1 != r0) goto L_0x0048
            X.HNK r0 = X.HNK.ANYBODY_CREATOR_DOES_NOT_FOLLOW
        L_0x0040:
            r2.Epw(r0)
        L_0x0043:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            return r0
        L_0x0048:
            boolean r0 = r4.A01
            if (r0 == 0) goto L_0x0043
            X.05G r2 = r6.A09
            java.lang.Object r1 = r2.getValue()
            X.HNK r0 = X.HNK.NOBODY
            if (r1 != r0) goto L_0x0043
            X.HNK r0 = X.HNK.FOLLOWERS_CREATOR_DOES_NOT_FOLLOW
            goto L_0x0040
        L_0x0059:
            r3 = 0
            goto L_0x0043
        L_0x005b:
            X.0eS.A00(r4)
            com.instagram.creator.agent.settings.audience.AudienceRepository r0 = r6.A01
            r5.A01 = r6
            r5.A00 = r3
            java.lang.Object r4 = r0.A05(r5)
            if (r4 != r1) goto L_0x0027
            return r1
        L_0x006b:
            X.MDh r5 = new X.MDh
            r5.<init>(r6, r7, r3)
            goto L_0x0015
        L_0x0071:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.audience.AudienceUseCase.A00(com.instagram.creator.agent.settings.audience.AudienceUseCase, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v6 */
    /* JADX WARNING: type inference failed for: r3v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.creator.agent.settings.audience.AudienceUseCase r7, X.AnonymousClass4D7 r8) {
        /*
            r4 = 1
            boolean r0 = X.C66129MDh.A01(r4, r8)
            if (r0 == 0) goto L_0x0062
            r3 = r8
            X.MDh r3 = (X.C66129MDh) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0062
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0015:
            java.lang.Object r6 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r5 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 != r4) goto L_0x0095
            java.lang.Object r7 = r3.A01
            com.instagram.creator.agent.settings.audience.AudienceUseCase r7 = (com.instagram.creator.agent.settings.audience.AudienceUseCase) r7
            X.0eS.A00(r6)
        L_0x0027:
            java.util.List r6 = (java.util.List) r6
            if (r6 == 0) goto L_0x008f
            X.05G r4 = r7.A0C
            r0 = 10
            int r0 = X.0Yv.A1E(r6, r0)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r3 = X.DbS.A0x(r0)
            java.util.Iterator r2 = r6.iterator()
        L_0x003f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.JwB r0 = (X.C61073JwB) r0
            java.lang.String r0 = r0.A02
            r3.put(r0, r1)
            goto L_0x003f
        L_0x0052:
            X.0eS.A00(r6)
            com.instagram.creator.agent.settings.audience.AudienceRepository r0 = r7.A01
            r3.A01 = r7
            r3.A00 = r4
            java.lang.Object r6 = r0.A06(r3)
            if (r6 != r1) goto L_0x0027
            return r1
        L_0x0062:
            X.MDh r3 = new X.MDh
            r3.<init>(r7, r8, r4)
            goto L_0x0015
        L_0x0068:
            r4.Epw(r3)
            X.05G r3 = r7.A0D
            java.util.ArrayList r2 = X.AnonymousClass7TF.A0p(r6)
            java.util.Iterator r1 = r6.iterator()
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0087
            java.lang.Object r0 = r1.next()
            X.JwB r0 = (X.C61073JwB) r0
            java.lang.String r0 = r0.A02
            r2.add(r0)
            goto L_0x0075
        L_0x0087:
            java.util.Set r0 = X.00k.A0k(r2)
            r3.Epw(r0)
            goto L_0x0090
        L_0x008f:
            r5 = 0
        L_0x0090:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r5)
            return r1
        L_0x0095:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.settings.audience.AudienceUseCase.A01(com.instagram.creator.agent.settings.audience.AudienceUseCase, X.4D7):java.lang.Object");
    }
}
