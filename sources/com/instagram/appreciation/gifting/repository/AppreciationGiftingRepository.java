package com.instagram.appreciation.gifting.repository;

import X.C51972G9s;
import X.C63047Kqc;

public final class AppreciationGiftingRepository {
    public final AppreciationGiftingDataSource A00;
    public final C63047Kqc A01;
    public final String A02;
    public final String A03;

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r18, X.AnonymousClass4D7 r19) {
        /*
            r17 = this;
            r4 = 36
            r5 = r19
            boolean r0 = X.C66144MDw.A02(r4, r5)
            r6 = r17
            if (r0 == 0) goto L_0x00b1
            r3 = r5
            X.MDw r3 = (X.C66144MDw) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00b1
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r4 = 1
            if (r0 == 0) goto L_0x009d
            if (r0 != r4) goto L_0x00bd
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x003c
            X.5sO r1 = (X.C297815sO) r1
            java.lang.Object r0 = r1.A00
            X.JTj r0 = X.C59678JTj.A00(r0)
        L_0x0036:
            X.0rr r2 = new X.0rr
            r2.<init>(r0)
            return r2
        L_0x003c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00b8
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r7 = r1.A00
            X.Ju8 r7 = (X.C60950Ju8) r7
            r0 = 0
            X.0qQ.A0B(r7, r0)
            int r6 = r7.A00
            java.util.List r0 = r7.A03
            java.util.ArrayList r5 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x0056:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0081
            java.lang.Object r8 = r9.next()
            X.JuC r8 = (X.C60954JuC) r8
            long r2 = r7.A01
            long r0 = r8.A01
            java.lang.String r11 = java.lang.String.valueOf(r0)
            int r15 = r8.A00
            java.lang.String r12 = r8.A04
            java.lang.String r13 = r8.A03
            java.lang.String r14 = r8.A02
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            boolean r16 = X.AnonymousClass7TF.A1Q(r8)
            X.Ju3 r10 = new X.Ju3
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r5.add(r10)
            goto L_0x0056
        L_0x0081:
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r1 = r7.A02
            com.instagram.api.schemas.ContentAppreciationDisclaimerType r0 = com.instagram.api.schemas.ContentAppreciationDisclaimerType.PAYOUT
            if (r1 != r0) goto L_0x009a
            X.Kg0 r8 = X.C62450Kg0.ELIGIBLE_FOR_PAYOUT
        L_0x0089:
            boolean r0 = r7.A04
            X.Gn3 r7 = new X.Gn3
            r11 = r4
            r12 = r0
            r10 = r6
            r9 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            X.JTj r0 = new X.JTj
            r0.<init>(r7, r4)
            goto L_0x0036
        L_0x009a:
            X.Kg0 r8 = X.C62450Kg0.INELIGIBLE_FOR_PAYOUT
            goto L_0x0089
        L_0x009d:
            X.0eS.A00(r1)
            com.instagram.appreciation.gifting.repository.AppreciationGiftingDataSource r1 = r6.A00
            java.lang.String r0 = r6.A03
            r3.A01 = r6
            r3.A00 = r4
            r5 = r18
            java.lang.Object r1 = r1.A01(r5, r0, r3)
            if (r1 != r2) goto L_0x0028
            return r2
        L_0x00b1:
            X.MDw r3 = new X.MDw
            r3.<init>(r6, r5, r4)
            goto L_0x001a
        L_0x00b8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bd:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.appreciation.gifting.repository.AppreciationGiftingRepository.A00(java.lang.String, X.4D7):java.lang.Object");
    }

    public AppreciationGiftingRepository(AppreciationGiftingDataSource appreciationGiftingDataSource, C63047Kqc kqc, String str, String str2) {
        C51972G9s.A1D(str, str2);
        this.A00 = appreciationGiftingDataSource;
        this.A01 = kqc;
        this.A03 = str;
        this.A02 = str2;
    }
}
