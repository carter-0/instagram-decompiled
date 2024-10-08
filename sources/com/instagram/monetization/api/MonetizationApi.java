package com.instagram.monetization.api;

import X.0qQ;
import X.15p;
import X.1NY;
import X.1OC;
import X.AnonymousClass05K;
import X.AnonymousClass4D7;
import X.C272344kY;
import X.C272354kZ;
import X.C376829Jm;
import X.JUM;
import X.MCA;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class MonetizationApi {
    public final UserSession A00;

    public MonetizationApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    public static final 1OC A00(UserSession userSession, List list) {
        0qQ.A0B(list, 1);
        String join = TextUtils.join(",", list);
        0qQ.A07(join);
        1NY r5 = new 1NY(userSession, -2);
        r5.A08(AnonymousClass05K.A0N);
        r5.A02();
        r5.A0A("api/v1/creators/partner_program/get_monetization_products_gating/");
        r5.A0O((15p) null, C272344kY.class, C272354kZ.class, false);
        r5.A9m("product_types", join);
        1OC A0M = r5.A0M();
        0qQ.A0C(A0M, "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductGatingResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductGatingResponse>>");
        return A0M;
    }

    public final MCA A01(List list) {
        return JUM.A01(new C376829Jm(1, (AnonymousClass4D7) null), A00(this.A00, list).A05(352238759, 3));
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(com.instagram.api.schemas.UserMonetizationProductType r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 37
            boolean r0 = X.ME3.A03(r3, r9)
            if (r0 == 0) goto L_0x008d
            r4 = r9
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008d
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r3) goto L_0x009b
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0053
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.1XR r0 = (X.1XR) r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x003a
            r5 = 1
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0043:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0052
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0095
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x0052:
            return r1
        L_0x0053:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0043
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x005d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A04()
            java.lang.String r0 = "creators/onboarding/accept_tos/"
            r2.A0A(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r4.A00 = r3
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x008d:
            r0 = 42
            X.ME3 r4 = new X.ME3
            r4.<init>(r7, r9, r3, r0)
            goto L_0x0016
        L_0x0095:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A02(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(com.instagram.api.schemas.UserMonetizationProductType r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 40
            boolean r0 = X.ME3.A03(r3, r9)
            if (r0 == 0) goto L_0x008e
            r4 = r9
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r3) goto L_0x009c
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0053
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.1XR r0 = (X.1XR) r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x003a
            r5 = 1
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0043:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0052
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0096
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x0052:
            return r1
        L_0x0053:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0043
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x005d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A04()
            java.lang.String r0 = "creators/onboarding/mark_checklist_screen_seen/"
            r2.A0A(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r4.A00 = r3
            r0 = 490845545(0x1d41b569, float:2.5637124E-21)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x008e:
            r0 = 42
            X.ME3 r4 = new X.ME3
            r4.<init>(r7, r9, r3, r0)
            goto L_0x0016
        L_0x0096:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A03(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(com.instagram.api.schemas.UserMonetizationProductType r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 41
            boolean r0 = X.ME3.A03(r3, r9)
            if (r0 == 0) goto L_0x008e
            r4 = r9
            X.ME3 r4 = (X.ME3) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r3) goto L_0x009c
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0053
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.1XR r0 = (X.1XR) r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x003a
            r5 = 1
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0043:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0052
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0096
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x0052:
            return r1
        L_0x0053:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0043
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x005d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A04()
            java.lang.String r0 = "creators/onboarding/mark_confirmation_screen_done/"
            r2.A0A(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r4.A00 = r3
            r0 = 490845545(0x1d41b569, float:2.5637124E-21)
            java.lang.Object r1 = r1.A00(r0, r4)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x008e:
            r0 = 42
            X.ME3 r4 = new X.ME3
            r4.<init>(r7, r9, r3, r0)
            goto L_0x0016
        L_0x0096:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A04(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(com.instagram.api.schemas.UserMonetizationProductType r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 42
            boolean r0 = X.ME3.A03(r3, r9)
            if (r0 == 0) goto L_0x008e
            r5 = r9
            X.ME3 r5 = (X.ME3) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x005d
            if (r0 != r3) goto L_0x009a
            X.0eS.A00(r1)
        L_0x0025:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0053
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.1XR r0 = (X.1XR) r0
            if (r0 == 0) goto L_0x003a
            boolean r0 = r0.isOk()
            if (r0 == 0) goto L_0x003a
            r4 = 1
        L_0x003a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0043:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0052
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0094
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x0052:
            return r1
        L_0x0053:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0043
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x005d:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            r0 = -2
            X.1NY r2 = new X.1NY
            r2.<init>(r1, r0)
            r2.A04()
            java.lang.String r0 = "creators/onboarding/mark_preview_screen_seen/"
            r2.A0A(r0)
            java.lang.String r1 = r8.A00
            java.lang.String r0 = "product_type"
            r2.A9m(r0, r1)
            java.lang.Class<X.1XP> r1 = X.1XP.class
            java.lang.Class<X.1XY> r0 = X.1XY.class
            r2.A0Q(r1, r0)
            X.1OC r1 = r2.A0M()
            r5.A00 = r3
            r0 = 490845545(0x1d41b569, float:2.5637124E-21)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r6) goto L_0x0025
            return r6
        L_0x008e:
            X.ME3 r5 = new X.ME3
            r5.<init>(r7, r9, r3, r3)
            goto L_0x0016
        L_0x0094:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A05(com.instagram.api.schemas.UserMonetizationProductType, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A06(java.lang.String r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r3 = 39
            boolean r0 = X.ME3.A03(r3, r9)
            if (r0 == 0) goto L_0x008c
            r5 = r9
            X.ME3 r5 = (X.ME3) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x008c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r4 = 1
            if (r0 == 0) goto L_0x0053
            if (r0 != r4) goto L_0x009a
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0049
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r0 = r0.FH3()
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0039:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0048
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0094
            X.0gF r0 = X.C60340gF.A00
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x0048:
            return r1
        L_0x0049:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0039
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0053:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r1 = r7.A00
            X.0qQ.A0B(r8, r4)
            r0 = -2
            X.1NY r3 = new X.1NY
            r3.<init>(r1, r0)
            java.lang.String r2 = "product_type"
            r3.A05()
            r3.A02()
            java.lang.String r0 = "api/v1/creators/onboarding/get_monetization_products_onboarding_data/"
            r3.A0A(r0)
            java.lang.Class<X.CEZ> r1 = X.CEZ.class
            java.lang.Class<X.Cz8> r0 = X.C45596Cz8.class
            r3.A0Q(r1, r0)
            r3.A9m(r2, r8)
            X.1OC r1 = r3.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductsOnboardingData>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.MonetizationProductsOnboardingData>>"
            X.0qQ.A0C(r1, r0)
            r5.A00 = r4
            r0 = 210(0xd2, float:2.94E-43)
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r6) goto L_0x0024
            return r6
        L_0x008c:
            r0 = 42
            X.ME3 r5 = new X.ME3
            r5.<init>(r7, r9, r3, r0)
            goto L_0x0016
        L_0x0094:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x009a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A06(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME3, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    @kotlin.Deprecated(message = "use fetchProductOnboardingEligibilityNew which fetchs from the onboarding endpoint")
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A07(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 38
            boolean r0 = X.ME3.A03(r3, r8)
            if (r0 == 0) goto L_0x005d
            r6 = r8
            X.ME3 r6 = (X.ME3) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005d
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r1 = r6.A00
            r4 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r4) goto L_0x006b
            X.0eS.A00(r0)
        L_0x0024:
            r5 = r0
            boolean r1 = r0 instanceof X.C239793Ih
            if (r1 != 0) goto L_0x0034
            boolean r0 = r0 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0065
            X.0gF r0 = X.C60340gF.A00
            X.5sO r5 = new X.5sO
            r5.<init>(r0)
        L_0x0034:
            return r5
        L_0x0035:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r0 = r7.A00
            r3 = 210(0xd2, float:2.94E-43)
            X.1NY r2 = new X.1NY
            r2.<init>(r0, r3)
            r2.A05()
            java.lang.String r0 = "business/eligibility/get_monetization_products_onboarding_eligibility_data/"
            r2.A0A(r0)
            java.lang.Class<X.CFR> r1 = X.CFR.class
            java.lang.Class<X.D1u> r0 = X.C45695D1u.class
            r2.A0Q(r1, r0)
            X.1OC r0 = r2.A0M()
            r6.A00 = r4
            java.lang.Object r0 = r0.A00(r3, r6)
            if (r0 != r5) goto L_0x0024
            return r5
        L_0x005d:
            r0 = 42
            X.ME3 r6 = new X.ME3
            r6.<init>(r7, r8, r3, r0)
            goto L_0x0016
        L_0x0065:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x006b:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.monetization.api.MonetizationApi.A07(X.4D7):java.lang.Object");
    }
}
