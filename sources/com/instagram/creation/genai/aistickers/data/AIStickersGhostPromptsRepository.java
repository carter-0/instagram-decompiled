package com.instagram.creation.genai.aistickers.data;

import X.0qQ;
import X.AnonymousClass43D;
import X.C252733pa;
import com.instagram.common.session.UserSession;

public final class AIStickersGhostPromptsRepository extends C252733pa {
    public final UserSession A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AIStickersGhostPromptsRepository(UserSession userSession) {
        super("AIStickers", AnonymousClass43D.A00(678177204));
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.ME8, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v2, types: [X.CsL, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: type inference failed for: r4v6 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r19) {
        /*
            r18 = this;
            r3 = 41
            r5 = r19
            boolean r0 = X.ME8.A03(r3, r5)
            r6 = r18
            if (r0 == 0) goto L_0x0097
            r4 = r5
            X.ME8 r4 = (X.ME8) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0097
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r5 = 1
            if (r0 == 0) goto L_0x005e
            if (r0 != r5) goto L_0x00b6
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00a0
            X.3lr r4 = X.C41846B3n.A0R(r1)
            if (r4 == 0) goto L_0x00a9
            java.lang.Class<X.Be1> r3 = X.C42520Be1.class
            r2 = 0
            java.lang.String r1 = "xfb_ig_ai_stickers_ghost_prompts_json"
            r0 = 696197213(0x297f205d, float:5.6649445E-14)
            X.3lr r1 = r4.getOptionalTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x00a9
            java.lang.String r0 = "ghost_prompts_json"
            java.lang.String r2 = r1.getOptionalStringField(r2, r0)
            if (r2 == 0) goto L_0x00a9
            java.lang.String r1 = "{\"prompts\":"
            r0 = 125(0x7d, float:1.75E-43)
            java.lang.String r0 = X.002.A0S(r1, r2, r0)
            X.16F r0 = X.16P.A00(r0)
            X.CsL r3 = X.C44632CiA.parseFromJson(r0)
            X.0qQ.A07(r3)
            return r3
        L_0x005e:
            X.0eS.A00(r1)
            com.instagram.common.session.UserSession r0 = r6.A00
            X.1vn r2 = X.1vm.A01(r0)
            r13 = 0
            X.2IS r1 = X.C41845B3m.A04()
            X.2IS r0 = X.C41845B3m.A04()
            X.1vR r7 = X.C41845B3m.A05()
            java.util.Map r9 = r1.getParamsCopy()
            java.util.Map r10 = r0.getParamsCopy()
            java.lang.Class<X.Be2> r11 = X.C42521Be2.class
            java.util.ArrayList r17 = X.AnonymousClass7TE.A1C()
            java.lang.String r8 = "IGAIStickersGhostPromptsJSONQuery"
            r12 = 0
            java.lang.String r16 = "xfb_ig_ai_stickers_ghost_prompts_json"
            com.facebook.pando.PandoGraphQLRequest r6 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r15 = r13
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            r4.A00 = r5
            java.lang.Object r1 = r2.A04(r6, r4)
            if (r1 != r3) goto L_0x0028
            return r3
        L_0x0097:
            r0 = 42
            X.ME8 r4 = new X.ME8
            r4.<init>(r6, r5, r3, r0)
            goto L_0x001a
        L_0x00a0:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00a9
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00a9:
            X.0sn r0 = X.0sn.A00
            X.0qQ.A0B(r0, r5)
            X.CsL r3 = new X.CsL
            r3.<init>()
            r3.A00 = r0
            return r3
        L_0x00b6:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.aistickers.data.AIStickersGhostPromptsRepository.A00(X.4D7):java.lang.Object");
    }
}
