package com.instagram.creator.agent.suggestedreplies.settings.repository;

import X.02z;
import X.05G;
import X.1vm;
import X.1vn;
import X.AnonymousClass0Ud;
import X.AnonymousClass0lh;
import X.AnonymousClass43D;
import X.C252733pa;
import X.C262204Co;
import X.C51970G9q;
import com.instagram.common.session.UserSession;

public final class CreatorAgentSuggestedRepliesSettingsRepository extends C252733pa implements AnonymousClass0lh {
    public C262204Co A00;
    public final AnonymousClass0Ud A01;
    public final 1vn A02;
    public final 05G A03;

    public CreatorAgentSuggestedRepliesSettingsRepository(UserSession userSession) {
        super("AISuggestedReplies", AnonymousClass43D.A00(1216442747));
        this.A02 = 1vm.A01(userSession);
        02z A10 = C51970G9q.A10(false);
        this.A03 = A10;
        this.A01 = A10;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r15, X.AnonymousClass4D7 r16) {
        /*
            r1 = r15
            r5 = 15
            r6 = r16
            boolean r0 = X.C66129MDh.A01(r5, r6)
            if (r0 == 0) goto L_0x00b4
            r4 = r6
            X.MDh r4 = (X.C66129MDh) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x00b4
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x0019:
            java.lang.Object r5 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0079
            if (r0 != r2) goto L_0x00c0
            java.lang.Object r1 = r4.A01
            com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r1 = (com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository) r1
            X.0eS.A00(r5)
        L_0x002b:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0064
            X.05G r7 = r1.A03
        L_0x0033:
            java.lang.Object r6 = r7.getValue()
            X.3lr r4 = X.C41846B3n.A0R(r5)
            if (r4 == 0) goto L_0x0062
            java.lang.Class<X.BgX> r3 = X.C42674BgX.class
            r2 = 0
            r0 = 1971(0x7b3, float:2.762E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1213210711(0x48502057, float:213121.36)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = "enabled"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L_0x0055:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r7.AIY(r6, r0)
            if (r0 == 0) goto L_0x0033
        L_0x005f:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0062:
            r0 = 0
            goto L_0x0055
        L_0x0064:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00bb
            X.05G r2 = r1.A03
        L_0x006a:
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x006a
            goto L_0x005f
        L_0x0079:
            X.0eS.A00(r5)
            r12 = 0
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r6 = X.C41845B3m.A05()
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r0.getParamsCopy()
            java.lang.Class<X.BgY> r10 = X.C42675BgY.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "GetIsCreatorAgentSuggestedRepliesEnabledQuery"
            r11 = 0
            r0 = 1971(0x7b3, float:2.762E-42)
            java.lang.String r15 = X.AnonymousClass000.A00(r0)
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r13 = r11
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r0 = r1.A02
            r4.A01 = r1
            r4.A00 = r2
            java.lang.Object r5 = r0.A04(r5, r4)
            if (r5 != r3) goto L_0x002b
            return r3
        L_0x00b4:
            X.MDh r4 = new X.MDh
            r4.<init>(r15, r6, r5)
            goto L_0x0019
        L_0x00bb:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00c0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository.A00(com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v6 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r15, X.AnonymousClass4D7 r16, boolean r17) {
        /*
            r4 = 16
            r5 = r16
            boolean r0 = X.C66129MDh.A01(r4, r5)
            if (r0 == 0) goto L_0x00c7
            r2 = r5
            X.MDh r2 = (X.C66129MDh) r2
            int r3 = r2.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r1
            if (r0 == 0) goto L_0x00c7
            int r3 = r3 - r1
            r2.A00 = r3
        L_0x0018:
            java.lang.Object r5 = r2.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r2.A00
            r9 = 1
            if (r0 == 0) goto L_0x0083
            if (r0 != r9) goto L_0x00d3
            java.lang.Object r15 = r2.A01
            com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository r15 = (com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository) r15
            X.0eS.A00(r5)
        L_0x002a:
            X.3Ii r5 = (X.C239803Ii) r5
            boolean r0 = r5 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006a
            X.05G r8 = r15.A03
        L_0x0032:
            java.lang.Object r7 = r8.getValue()
            boolean r6 = X.AnonymousClass7TE.A1a(r7)
            X.3lr r4 = X.C41846B3n.A0R(r5)
            if (r4 == 0) goto L_0x0065
            java.lang.Class<X.BgZ> r3 = X.C42676BgZ.class
            r2 = 0
            r0 = 4280(0x10b8, float:5.998E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 565641481(0x21b70109, float:1.2400836E-18)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0065
            java.lang.String r0 = "enabled"
            boolean r0 = r1.getCoercedBooleanField(r2, r0)
        L_0x0058:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r8.AIY(r7, r0)
            if (r0 == 0) goto L_0x0032
        L_0x0062:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0065:
            boolean r0 = X.AnonymousClass7TF.A1Q(r6)
            goto L_0x0058
        L_0x006a:
            boolean r0 = r5 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ce
            X.05G r2 = r15.A03
        L_0x0070:
            java.lang.Object r1 = r2.getValue()
            boolean r0 = X.AnonymousClass7TE.A1a(r1)
            java.lang.Boolean r0 = X.DbT.A0l(r0)
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x0070
            goto L_0x0062
        L_0x0083:
            X.0eS.A00(r5)
            r10 = 0
            X.2IS r6 = X.C41845B3m.A04()
            X.2IS r5 = X.C41845B3m.A04()
            X.0K0 r4 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r17)
            java.lang.String r0 = "enabled"
            X.0Df r3 = X.C41845B3m.A03(r4, r3, r0)
            java.lang.String r0 = "input"
            X.1vR r4 = X.C41847B3o.A04(r3, r6, r0)
            java.util.Map r6 = r6.getParamsCopy()
            java.util.Map r7 = r5.getParamsCopy()
            java.lang.Class<X.Bga> r8 = X.C42677Bga.class
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.lang.String r5 = "ToggleCreatorAgentSuggestedReplies"
            r11 = 0
            java.lang.String r13 = "xig_ig_suggested_replies_set_enabled_mutation"
            com.facebook.pando.PandoGraphQLRequest r3 = new com.facebook.pando.PandoGraphQLRequest
            r12 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.1vn r0 = r15.A02
            r2.A01 = r15
            r2.A00 = r9
            java.lang.Object r5 = r0.A04(r3, r2)
            if (r5 != r1) goto L_0x002a
            return r1
        L_0x00c7:
            X.MDh r2 = new X.MDh
            r2.<init>(r15, r5, r4)
            goto L_0x0018
        L_0x00ce:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d3:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository.A01(com.instagram.creator.agent.suggestedreplies.settings.repository.CreatorAgentSuggestedRepliesSettingsRepository, X.4D7, boolean):java.lang.Object");
    }

    public final void onSessionWillEnd() {
        C51970G9q.A1S(this.A00);
    }
}
