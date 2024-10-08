package com.instagram.monetization.onboarding.repository;

import X.AnonymousClass0lh;
import X.C297815sO;
import X.C47184Drz;
import com.instagram.api.schemas.UserMonetizationProductType;
import com.instagram.monetization.api.MonetizationApi;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public final class OnboardingRepository implements AnonymousClass0lh {
    public final HashMap A00;
    public final MonetizationApi A01;

    public static Exception A00(Object obj) {
        if (obj instanceof C297815sO) {
            return new IOException("Onboarding network request failed");
        }
        return new RuntimeException();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(com.instagram.api.schemas.UserMonetizationProductType r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 43
            boolean r0 = X.ME3.A03(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x004a
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.monetization.api.MonetizationApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A02(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            r0 = 42
            X.ME3 r4 = new X.ME3
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0016
        L_0x0045:
            java.lang.Exception r0 = A00(r3)
            throw r0
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A01(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0119  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0029  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.api.schemas.UserMonetizationProductType r15, X.AnonymousClass4D7 r16) {
        /*
            r14 = this;
            r3 = 8
            r4 = r16
            boolean r0 = X.ME9.A03(r3, r4)
            if (r0 == 0) goto L_0x0091
            r5 = r4
            X.ME9 r5 = (X.ME9) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0091
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0018:
            java.lang.Object r9 = r5.A03
            X.1Hj r4 = X.1Hj.A02
            int r1 = r5.A00
            r10 = 0
            r8 = 3
            r7 = 7
            r6 = 2
            r3 = 9
            r2 = 1
            r0 = 11
            if (r1 == 0) goto L_0x006c
            if (r1 == r2) goto L_0x00d3
            if (r1 == r6) goto L_0x010a
            if (r1 != r8) goto L_0x00aa
            java.lang.Object r15 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.monetization.onboarding.repository.OnboardingRepository r1 = (com.instagram.monetization.onboarding.repository.OnboardingRepository) r1
            X.0eS.A00(r9)
        L_0x0038:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a1
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r0 = r9.A00
            X.CFR r0 = (X.CFR) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r4 = r0.iterator()
        L_0x004a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0141
            java.lang.Object r3 = r4.next()
            X.CvT r3 = (X.C45387CvT) r3
            java.util.HashMap r2 = r1.A00
            com.instagram.api.schemas.UserMonetizationProductType r0 = r3.A00
            if (r0 == 0) goto L_0x0097
            java.util.List r9 = r3.A03
            java.lang.String r11 = r3.A01
            java.lang.String r12 = r3.A02
            r13 = 6
            X.Drz r8 = new X.Drz
            r8.<init>((java.util.List) r9, (int) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13)
            r2.put(r0, r8)
            goto L_0x004a
        L_0x006c:
            X.0eS.A00(r9)
            int r1 = r15.ordinal()
            if (r1 == r0) goto L_0x00c1
            if (r1 == r3) goto L_0x00c1
            if (r1 == r7) goto L_0x00c1
            r0 = 13
            if (r1 == r0) goto L_0x00af
            r0 = 10
            if (r1 == r0) goto L_0x00af
            com.instagram.monetization.api.MonetizationApi r0 = r14.A01
            r5.A01 = r14
            r5.A02 = r15
            r5.A00 = r8
            java.lang.Object r9 = r0.A07(r5)
            if (r9 == r4) goto L_0x0153
            r1 = r14
            goto L_0x0038
        L_0x0091:
            X.ME9 r5 = new X.ME9
            r5.<init>(r14, r4, r3)
            goto L_0x0018
        L_0x0097:
            java.lang.String r0 = "productType"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a1:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0141
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00aa:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00af:
            com.instagram.monetization.api.MonetizationApi r1 = r14.A01
            java.lang.String r0 = r15.A00
            r5.A01 = r14
            r5.A02 = r15
            r5.A00 = r6
            java.lang.Object r9 = r1.A06(r0, r5)
            if (r9 == r4) goto L_0x0153
            r1 = r14
            goto L_0x0113
        L_0x00c1:
            com.instagram.monetization.api.MonetizationApi r1 = r14.A01
            java.lang.String r0 = r15.A00
            r5.A01 = r14
            r5.A02 = r15
            r5.A00 = r2
            java.lang.Object r9 = r1.A06(r0, r5)
            if (r9 == r4) goto L_0x0153
            r1 = r14
            goto L_0x00dc
        L_0x00d3:
            java.lang.Object r15 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.monetization.onboarding.repository.OnboardingRepository r1 = (com.instagram.monetization.onboarding.repository.OnboardingRepository) r1
            X.0eS.A00(r9)
        L_0x00dc:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0101
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r2 = r9.A00
            X.DrW r2 = (X.C47155DrW) r2
            java.util.HashMap r4 = r1.A00
            com.instagram.api.schemas.UserMonetizationProductType r0 = r2.A01
            java.lang.String r0 = r0.A00
            com.instagram.api.schemas.UserMonetizationProductType r3 = X.C272504kq.A00(r0)
            java.util.List r0 = r2.A02
            java.util.List r2 = X.F6S.A01(r0)
            X.Drz r0 = new X.Drz
            r0.<init>(r2)
            r4.put(r3, r0)
            goto L_0x0141
        L_0x0101:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0141
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x010a:
            java.lang.Object r15 = r5.A02
            java.lang.Object r1 = r5.A01
            com.instagram.monetization.onboarding.repository.OnboardingRepository r1 = (com.instagram.monetization.onboarding.repository.OnboardingRepository) r1
            X.0eS.A00(r9)
        L_0x0113:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r0 = r9 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x014a
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r4 = r9.A00
            X.DrW r4 = (X.C47155DrW) r4
            java.util.HashMap r3 = r1.A00
            com.instagram.api.schemas.UserMonetizationProductType r0 = r4.A01
            java.lang.String r0 = r0.A00
            com.instagram.api.schemas.UserMonetizationProductType r2 = X.C272504kq.A00(r0)
            java.util.List r0 = r4.A02
            java.util.List r9 = X.F6S.A01(r0)
            X.DrK r0 = r4.A00
            r12 = 0
            if (r0 == 0) goto L_0x0148
            java.lang.String r11 = r0.A00
            java.lang.String r12 = r0.A01
        L_0x0138:
            r13 = 6
            X.Drz r8 = new X.Drz
            r8.<init>((java.util.List) r9, (int) r10, (java.lang.String) r11, (java.lang.String) r12, (int) r13)
            r3.put(r2, r8)
        L_0x0141:
            java.util.HashMap r0 = r1.A00
            java.lang.Object r0 = r0.get(r15)
            return r0
        L_0x0148:
            r11 = r12
            goto L_0x0138
        L_0x014a:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0141
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0153:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A02(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.api.schemas.UserMonetizationProductType r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 44
            boolean r0 = X.ME3.A03(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x004a
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.monetization.api.MonetizationApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A03(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            r0 = 42
            X.ME3 r4 = new X.ME3
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0016
        L_0x0045:
            java.lang.Exception r0 = A00(r3)
            throw r0
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A03(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.api.schemas.UserMonetizationProductType r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 45
            boolean r0 = X.ME3.A03(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x004a
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.monetization.api.MonetizationApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            r0 = 42
            X.ME3 r4 = new X.ME3
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0016
        L_0x0045:
            java.lang.Exception r0 = A00(r3)
            throw r0
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A04(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(com.instagram.api.schemas.UserMonetizationProductType r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 46
            boolean r0 = X.ME3.A03(r3, r7)
            if (r0 == 0) goto L_0x003d
            r4 = r7
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x003d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r1) goto L_0x004a
            X.0eS.A00(r3)
        L_0x0024:
            X.3Ii r3 = (X.C239803Ii) r3
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0045
            X.3Ih r3 = (X.C239793Ih) r3
            java.lang.Object r2 = r3.A00
            return r2
        L_0x002f:
            X.0eS.A00(r3)
            com.instagram.monetization.api.MonetizationApi r0 = r5.A01
            r4.A00 = r1
            java.lang.Object r3 = r0.A05(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x003d:
            r0 = 42
            X.ME3 r4 = new X.ME3
            r4.<init>(r5, r7, r3, r0)
            goto L_0x0016
        L_0x0045:
            java.lang.Exception r0 = A00(r3)
            throw r0
        L_0x004a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.onboarding.repository.OnboardingRepository.A05(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    public final List A06(UserMonetizationProductType userMonetizationProductType) {
        C47184Drz drz = (C47184Drz) this.A00.get(userMonetizationProductType);
        if (drz != null) {
            return (List) drz.A01;
        }
        return null;
    }

    public final void A07(UserMonetizationProductType userMonetizationProductType, int i) {
        C47184Drz drz = (C47184Drz) this.A00.get(userMonetizationProductType);
        if (drz != null) {
            drz.A00 = i;
        }
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }

    public OnboardingRepository(MonetizationApi monetizationApi, HashMap hashMap) {
        this.A01 = monetizationApi;
        this.A00 = hashMap;
    }
}
