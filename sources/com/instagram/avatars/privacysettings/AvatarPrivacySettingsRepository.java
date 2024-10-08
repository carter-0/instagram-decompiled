package com.instagram.avatars.privacysettings;

import X.1Ng;
import X.1wn;
import X.AnonymousClass1Nd;
import X.AnonymousClass27X;
import X.AnonymousClass27b;
import X.AnonymousClass43D;
import X.AnonymousClass7TA;
import X.AnonymousClass7TB;
import X.AnonymousClass7TC;
import X.C252733pa;
import X.C61081JwJ;
import com.instagram.common.session.UserSession;

public final class AvatarPrivacySettingsRepository extends C252733pa {
    public C61081JwJ A00;
    public final AnonymousClass7TA A01;
    public final 1wn A02;
    public final 1wn A03;
    public final UserSession A04;

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(java.lang.String r20, java.lang.String r21, X.AnonymousClass4D7 r22) {
        /*
            r19 = this;
            r5 = 5
            r6 = r22
            boolean r0 = X.C66128MDg.A01(r5, r6)
            r3 = r19
            if (r0 == 0) goto L_0x00f3
            r2 = r6
            X.MDg r2 = (X.C66128MDg) r2
            int r4 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r4 & r1
            if (r0 == 0) goto L_0x00f3
            int r4 = r4 - r1
            r2.A00 = r4
        L_0x0019:
            java.lang.Object r4 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r13 = 1
            if (r0 == 0) goto L_0x0092
            if (r0 != r13) goto L_0x00fa
            java.lang.Object r6 = r2.A01
            com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository r6 = (com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository) r6
            X.0eS.A00(r4)
        L_0x002b:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            r2 = 0
            if (r0 == 0) goto L_0x0088
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r4 = r0.A01
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0086
            java.lang.Class<X.Bo5> r3 = X.Bo5.class
            r7 = 0
            java.lang.String r1 = "xig_update_usability_avatar_privacy_setting(data:{\"avatar_privacy_setting_id\":$avatar_settings_id,\"client_mutation_id\":1,\"usability\":$usability})"
            r0 = 772651384(0x2e0db978, float:3.2224418E-11)
            X.3lr r4 = r4.getOptionalTreeField(r7, r1, r3, r0)
            if (r4 == 0) goto L_0x0086
            java.lang.Class<X.Bo4> r3 = X.Bo4.class
            java.lang.String r1 = "avatar_privacy_setting"
            r0 = -888810264(0xffffffffcb05d4e8, float:-8770792.0)
            X.3lr r5 = r4.getOptionalTreeField(r7, r1, r3, r0)
            if (r5 == 0) goto L_0x0086
            java.lang.String r0 = "strong_id__"
            java.lang.String r4 = r5.getOptionalStringField(r7, r0)
            r3 = 0
            if (r4 == 0) goto L_0x0073
            X.EWs r1 = X.C48126EWs.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "usability"
            java.lang.Enum r0 = r5.getOptionalEnumField(r13, r0, r1)
            X.EWs r0 = (X.C48126EWs) r0
            if (r0 == 0) goto L_0x0073
            X.JwJ r3 = new X.JwJ
            r3.<init>((X.C48126EWs) r0, (java.lang.String) r4)
        L_0x0073:
            X.3Ih r4 = new X.3Ih
            r4.<init>(r3)
        L_0x0078:
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0085
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r2 = r4.A00
            r0 = r2
            X.JwJ r0 = (X.C61081JwJ) r0
            r6.A00 = r0
        L_0x0085:
            return r2
        L_0x0086:
            r3 = r2
            goto L_0x0073
        L_0x0088:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0078
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0092:
            X.0eS.A00(r4)
            X.7TA r4 = r3.A01
            r2.A01 = r3
            r2.A00 = r13
            r14 = 0
            X.2IS r7 = new X.2IS
            r7.<init>()
            X.2IS r6 = new X.2IS
            r6.<init>()
            java.lang.String r0 = "avatar_settings_id"
            r8 = r20
            r7.A04(r0, r8)
            r5 = 0
            if (r20 == 0) goto L_0x00b1
            r5 = 1
        L_0x00b1:
            java.lang.String r0 = "usability"
            r8 = r21
            r7.A04(r0, r8)
            r0 = 0
            if (r21 == 0) goto L_0x00bc
            r0 = 1
        L_0x00bc:
            X.17k.A0E(r5)
            X.17k.A0E(r0)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r8 = X.AnonymousClass1vS.A00()
            java.util.Map r10 = r7.getParamsCopy()
            java.util.Map r11 = r6.getParamsCopy()
            java.lang.Class<X.Bo6> r12 = X.Bo6.class
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.lang.String r9 = "IGAvatarPrivacySettingsUpdateSettings"
            r15 = 0
            java.lang.String r17 = "xig_update_usability_avatar_privacy_setting"
            com.facebook.pando.PandoGraphQLRequest r7 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            com.instagram.common.session.UserSession r0 = r4.A00
            X.1vn r0 = X.1vm.A01(r0)
            java.lang.Object r4 = r0.A04(r7, r2)
            if (r4 != r1) goto L_0x00f0
            return r1
        L_0x00f0:
            r6 = r3
            goto L_0x002b
        L_0x00f3:
            X.MDg r2 = new X.MDg
            r2.<init>(r3, r6, r5)
            goto L_0x0019
        L_0x00fa:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository.A00(java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v11 */
    /* JADX WARNING: type inference failed for: r4v12 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r21) {
        /*
            r20 = this;
            r3 = 4
            r6 = r21
            boolean r0 = X.C66128MDg.A01(r3, r6)
            r5 = r20
            if (r0 == 0) goto L_0x00f6
            r4 = r6
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00f6
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0019:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x009f
            if (r0 != r2) goto L_0x00fd
            java.lang.Object r7 = r4.A01
            com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository r7 = (com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository) r7
            X.0eS.A00(r1)
        L_0x002b:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r3 = 0
            if (r0 == 0) goto L_0x0095
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r5 = r0.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0093
            java.lang.Class<X.Bo2> r4 = X.Bo2.class
            r8 = 0
            java.lang.String r1 = "fetch__IGUser(igid:$user_id)"
            r0 = 1012005617(0x3c51faf1, float:0.012816177)
            X.3lr r5 = r5.getOptionalTreeField(r8, r1, r4, r0)
            if (r5 == 0) goto L_0x0093
            java.lang.Class<X.Bo1> r4 = X.Bo1.class
            java.lang.String r1 = "user_avatar"
            r0 = -1310753997(0xffffffffb1df7b33, float:-6.5041603E-9)
            X.3lr r5 = r5.getOptionalTreeField(r8, r1, r4, r0)
            if (r5 == 0) goto L_0x0093
            java.lang.Class<X.Bo0> r4 = X.Bo0.class
            java.lang.String r1 = "avatar_settings"
            r0 = 911332566(0x3651d4d6, float:3.1267314E-6)
            X.3lr r6 = r5.getOptionalTreeField(r8, r1, r4, r0)
            if (r6 == 0) goto L_0x0093
            java.lang.String r0 = "strong_id__"
            java.lang.String r5 = r6.getOptionalStringField(r8, r0)
            r4 = 0
            if (r5 == 0) goto L_0x0080
            X.EWs r1 = X.C48126EWs.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "usability"
            java.lang.Enum r0 = r6.getOptionalEnumField(r2, r0, r1)
            X.EWs r0 = (X.C48126EWs) r0
            if (r0 == 0) goto L_0x0080
            X.JwJ r4 = new X.JwJ
            r4.<init>((X.C48126EWs) r0, (java.lang.String) r5)
        L_0x0080:
            X.3Ih r1 = new X.3Ih
            r1.<init>(r4)
        L_0x0085:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0092
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r3 = r1.A00
            r0 = r3
            X.JwJ r0 = (X.C61081JwJ) r0
            r7.A00 = r0
        L_0x0092:
            return r3
        L_0x0093:
            r4 = r3
            goto L_0x0080
        L_0x0095:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0085
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x009f:
            X.0eS.A00(r1)
            X.7TA r0 = r5.A01
            r4.A01 = r5
            r4.A00 = r2
            r15 = 0
            X.2IS r8 = new X.2IS
            r8.<init>()
            X.2IS r7 = new X.2IS
            r7.<init>()
            com.instagram.common.session.UserSession r6 = r0.A00
            java.lang.String r1 = r6.A06
            java.lang.String r0 = "user_id"
            r8.A04(r0, r1)
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r9 = X.AnonymousClass1vS.A00()
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.Bo3> r13 = X.Bo3.class
            java.util.ArrayList r19 = new java.util.ArrayList
            r19.<init>()
            java.lang.String r10 = "IGAvatarPrivacySettingsGetUsability"
            r14 = 0
            java.lang.String r18 = "fetch__IGUser"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 0
            X.1Ef r7 = r8.setFreshCacheAgeMs(r0)
            X.1Ef r1 = r7.setMaxToleratedCacheAgeMs(r0)
            X.1vn r0 = X.1vm.A01(r6)
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 == r3) goto L_0x0092
            r7 = r5
            goto L_0x002b
        L_0x00f6:
            X.MDg r4 = new X.MDg
            r4.<init>(r5, r6, r3)
            goto L_0x0019
        L_0x00fd:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.avatars.privacysettings.AvatarPrivacySettingsRepository.A01(X.4D7):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AvatarPrivacySettingsRepository(UserSession userSession) {
        super("AvatarPrivacySettings", AnonymousClass43D.A01(1212525389, 3));
        AnonymousClass7TA r2 = new AnonymousClass7TA(userSession);
        1Ng A002 = AnonymousClass1Nd.A00(userSession);
        this.A04 = userSession;
        this.A01 = r2;
        AnonymousClass7TB r22 = new AnonymousClass7TB(this);
        this.A02 = r22;
        AnonymousClass7TC r1 = new AnonymousClass7TC(this);
        this.A03 = r1;
        A002.A01(r1, AnonymousClass27X.class);
        A002.A01(r22, AnonymousClass27b.class);
    }
}
