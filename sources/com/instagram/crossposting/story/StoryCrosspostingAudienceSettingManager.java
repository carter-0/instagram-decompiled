package com.instagram.crossposting.story;

import X.0qQ;
import X.19B;
import X.19E;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass12T;
import X.AnonymousClass19S;
import X.AnonymousClass4D7;
import X.AnonymousClass9K1;
import X.C295035nS;
import com.instagram.common.session.UserSession;

public final class StoryCrosspostingAudienceSettingManager {
    public String A00;
    public boolean A01;
    public final UserSession A02;

    public StoryCrosspostingAudienceSettingManager(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDh, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: type inference failed for: r4v7 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r19) {
        /*
            r18 = this;
            r3 = 19
            r6 = r19
            boolean r0 = X.C66129MDh.A01(r3, r6)
            r5 = r18
            if (r0 == 0) goto L_0x00ec
            r4 = r6
            X.MDh r4 = (X.C66129MDh) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00ec
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x00a2
            if (r0 != r2) goto L_0x00f6
            java.lang.Object r5 = r4.A01
            com.instagram.crossposting.story.StoryCrosspostingAudienceSettingManager r5 = (com.instagram.crossposting.story.StoryCrosspostingAudienceSettingManager) r5
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0098
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r7 = r0.A01
            X.5wJ r7 = (X.C299965wJ) r7
            r6 = 0
            if (r7 == 0) goto L_0x0096
            X.5nT r4 = r7.A0E()
            if (r4 == 0) goto L_0x0096
            X.5nU r3 = X.C295055nU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            java.lang.String r0 = "audience"
            java.lang.Enum r0 = r4.getOptionalEnumField(r1, r0, r3)
            if (r0 == 0) goto L_0x0096
            java.lang.String r0 = r0.toString()
        L_0x0054:
            r5.A00 = r0
            if (r7 == 0) goto L_0x007f
            X.5nT r4 = r7.A0E()
            if (r4 == 0) goto L_0x007f
            X.5nU r3 = X.C295055nU.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 0
            java.lang.String r0 = "audience"
            java.lang.Enum r0 = r4.getOptionalEnumField(r1, r0, r3)
            if (r0 == 0) goto L_0x006d
            java.lang.String r6 = r0.toString()
        L_0x006d:
            r5.A00 = r6
            java.lang.String r1 = "has_hidden_friends"
            boolean r0 = r4.hasFieldValue(r1)
            if (r0 == 0) goto L_0x0094
            boolean r0 = r4.getCoercedBooleanField(r2, r1)
            if (r0 == 0) goto L_0x0094
        L_0x007d:
            r5.A01 = r2
        L_0x007f:
            X.0gF r0 = X.C60340gF.A00
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0086:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x00f3
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00f3
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0094:
            r2 = 0
            goto L_0x007d
        L_0x0096:
            r0 = r6
            goto L_0x0054
        L_0x0098:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0086
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00a2:
            X.0eS.A00(r1)
            r13 = 0
            X.2IS r6 = new X.2IS
            r6.<init>()
            X.2IS r1 = new X.2IS
            r1.<init>()
            X.2IY r0 = com.facebook.pando.PandoGraphQLRequest.Companion
            X.1vR r7 = X.AnonymousClass1vS.A00()
            java.util.Map r9 = r6.getParamsCopy()
            java.util.Map r10 = r1.getParamsCopy()
            java.lang.Class<X.5wJ> r11 = X.C299965wJ.class
            java.util.ArrayList r17 = new java.util.ArrayList
            r17.<init>()
            java.lang.String r8 = "CXPFbStoriesCurrentPrivacyQuery"
            r12 = 0
            java.lang.String r16 = "xcxp_fb_stories_current_privacy"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r0 = 0
            X.1Ef r6 = r6.setFreshCacheAgeMs(r0)
            X.1Ef r1 = r6.setMaxToleratedCacheAgeMs(r0)
            com.instagram.common.session.UserSession r0 = r5.A02
            X.1vn r0 = X.1vm.A01(r0)
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = r0.A04(r1, r4)
            if (r1 != r3) goto L_0x002c
            return r3
        L_0x00ec:
            X.MDh r4 = new X.MDh
            r4.<init>(r5, r6, r3)
            goto L_0x001a
        L_0x00f3:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x00f6:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.crossposting.story.StoryCrosspostingAudienceSettingManager.A00(X.4D7):java.lang.Object");
    }

    public final void A01(C295035nS r6) {
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.CO6(789230856, 3));
        AnonymousClass9K1 r2 = new AnonymousClass9K1((Object) r6, (Object) this, (AnonymousClass4D7) null, 0);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A022);
    }
}
