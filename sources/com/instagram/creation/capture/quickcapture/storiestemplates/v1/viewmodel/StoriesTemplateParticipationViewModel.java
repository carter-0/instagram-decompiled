package com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel;

import X.02z;
import X.05G;
import X.0qQ;
import X.106;
import X.19B;
import X.2Fk;
import X.2YL;
import X.AnonymousClass0Ud;
import X.C226292g8;
import X.C250973mM;
import X.C310376au;
import X.C310416b1;
import X.C310426b2;
import com.instagram.common.session.UserSession;
import com.instagram.feed.media.CreativeConfigIntf;
import com.instagram.reels.prompt.model.PromptStickerModel;

public final class StoriesTemplateParticipationViewModel extends 2YL {
    public CreativeConfigIntf A00 = null;
    public C250973mM A01 = null;
    public PromptStickerModel A02 = null;
    public C310416b1 A03 = null;
    public final 2Fk A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;
    public final UserSession A07;
    public final C310376au A08;

    public StoriesTemplateParticipationViewModel(UserSession userSession, C310376au r4) {
        0qQ.A0B(userSession, 1);
        this.A07 = userSession;
        this.A08 = r4;
        02z A012 = 106.A01(C310426b2.A00);
        this.A05 = A012;
        this.A06 = A012;
        this.A04 = C226292g8.A00(19B.A00, A012);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if ((!r0.isEmpty()) != true) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(com.instagram.feed.media.CreativeConfigIntf r10, com.instagram.reels.prompt.model.PromptStickerModel r11, X.C310416b1 r12, boolean r13) {
        /*
            r9 = this;
            r0 = 0
            r3 = r11
            X.0qQ.A0B(r11, r0)
            r1 = 1
            r5 = r9
            r9.A02 = r11
            r4 = r12
            r9.A03 = r12
            r6 = r10
            r9.A00 = r10
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r11.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C1M()
            if (r0 == 0) goto L_0x0026
            java.util.List r0 = r0.C0B()
            if (r0 == 0) goto L_0x0026
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r2 = 1
            if (r0 == r1) goto L_0x0027
        L_0x0026:
            r2 = 0
        L_0x0027:
            X.6au r0 = r9.A08
            com.instagram.avatars.store.AvatarStore r0 = r0.A01
            X.27E r0 = r0.A01
            X.27H r1 = r0.A00
            X.5vi r0 = X.C299715vi.A00
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r2 == 0) goto L_0x0046
            if (r0 != 0) goto L_0x0053
            X.05G r2 = r9.A05
            if (r13 == 0) goto L_0x0043
            X.6k8 r1 = X.C315576k8.A00
        L_0x003f:
            r2.Epw(r1)
            return
        L_0x0043:
            X.6k5 r1 = X.C315546k5.A00
            goto L_0x003f
        L_0x0046:
            X.05G r2 = r9.A05
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            X.6k6 r1 = new X.6k6
            r1.<init>(r10, r11, r12, r0)
            goto L_0x003f
        L_0x0053:
            X.6oS r1 = X.C318116oQ.A00(r9)
            r7 = 0
            r8 = 48
            X.MHG r2 = new X.MHG
            r2.<init>(r3, r4, r5, r6, r7, r8)
            X.19B r0 = X.19B.A00
            X.1Eo.A05(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel.A01(com.instagram.feed.media.CreativeConfigIntf, com.instagram.reels.prompt.model.PromptStickerModel, X.6b1, boolean):void");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0111  */
    /* JADX WARNING: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.feed.media.CreativeConfigIntf r18, com.instagram.reels.prompt.model.PromptStickerModel r19, X.C310416b1 r20, X.AnonymousClass4D7 r21) {
        /*
            r17 = this;
            r4 = r18
            r2 = r19
            r3 = r20
            r8 = 12
            r9 = r21
            boolean r0 = X.ME0.A02(r8, r9)
            r7 = r17
            if (r0 == 0) goto L_0x0036
            r6 = r9
            X.ME0 r6 = (X.ME0) r6
            int r5 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r5 & r1
            if (r0 == 0) goto L_0x0036
            int r5 = r5 - r1
            r6.A00 = r5
        L_0x0020:
            java.lang.Object r10 = r6.A05
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r8 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0051
            if (r0 == r9) goto L_0x003c
            if (r0 == r8) goto L_0x003c
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0036:
            X.ME0 r6 = new X.ME0
            r6.<init>(r7, r9, r8)
            goto L_0x0020
        L_0x003c:
            java.lang.Object r4 = r6.A04
            com.instagram.feed.media.CreativeConfigIntf r4 = (com.instagram.feed.media.CreativeConfigIntf) r4
            java.lang.Object r3 = r6.A03
            X.6b1 r3 = (X.C310416b1) r3
            java.lang.Object r2 = r6.A02
            com.instagram.reels.prompt.model.PromptStickerModel r2 = (com.instagram.reels.prompt.model.PromptStickerModel) r2
            java.lang.Object r0 = r6.A01
            com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel r0 = (com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel) r0
            X.0eS.A00(r10)
            goto L_0x0100
        L_0x0051:
            X.0eS.A00(r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            com.instagram.common.session.UserSession r11 = r7.A07
            X.0Tu r10 = X.0Tu.A05
            r0 = 36328920743755440(0x8110f600013eb0, double:3.037893990948583E-306)
            boolean r1 = X.182.A06(r10, r11, r0)
            r10 = 10
            com.instagram.api.schemas.StoryPromptTappableDataIntf r0 = r2.A00
            com.instagram.api.schemas.StoryTemplateDictIntf r0 = r0.C1M()
            if (r1 == 0) goto L_0x00a4
            if (r0 == 0) goto L_0x00d5
            java.util.List r1 = r0.C0B()
            if (r1 == 0) goto L_0x00d5
            int r0 = X.0Yv.A1E(r1, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x008a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict r0 = (com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict) r0
            java.lang.String r0 = r0.B2z()
            r10.add(r0)
            goto L_0x008a
        L_0x009e:
            java.util.List r1 = X.00k.A0X(r10)
            r0 = r13
            goto L_0x00d2
        L_0x00a4:
            if (r0 == 0) goto L_0x00d5
            java.util.List r1 = r0.C0B()
            if (r1 == 0) goto L_0x00d5
            int r0 = X.0Yv.A1E(r1, r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>(r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x00b9:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r0 = r1.next()
            com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict r0 = (com.instagram.api.schemas.StoryTemplateAvatarStickerOverlayDict) r0
            java.lang.String r0 = r0.BI3()
            r10.add(r0)
            goto L_0x00b9
        L_0x00cd:
            java.util.List r1 = X.00k.A0X(r10)
            r0 = r12
        L_0x00d2:
            r0.addAll(r1)
        L_0x00d5:
            boolean r0 = r13.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0111
            X.6au r12 = r7.A08
            r6.A01 = r7
            r6.A02 = r2
            r6.A03 = r3
            r6.A04 = r4
            r6.A00 = r9
            X.4Cq r0 = r12.A01
            X.4Cc r0 = r0.ArX()
            r14 = 0
            r15 = 8
        L_0x00f2:
            r16 = 42
            X.MHJ r11 = new X.MHJ
            r11.<init>((java.lang.Object) r12, (java.lang.Object) r13, (X.AnonymousClass4D7) r14, (int) r15, (int) r16)
            java.lang.Object r10 = X.1Eo.A00(r6, r0, r11)
            if (r10 == r5) goto L_0x0110
            r0 = r7
        L_0x0100:
            java.util.Map r10 = (java.util.Map) r10
            if (r10 == 0) goto L_0x0131
            X.05G r1 = r0.A05
            X.6k6 r0 = new X.6k6
            r0.<init>(r4, r2, r3, r10)
        L_0x010b:
            r1.Epw(r0)
            X.0gF r5 = X.C60340gF.A00
        L_0x0110:
            return r5
        L_0x0111:
            r13 = r12
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0130
            X.6au r12 = r7.A08
            r6.A01 = r7
            r6.A02 = r2
            r6.A03 = r3
            r6.A04 = r4
            r6.A00 = r8
            X.4Cq r0 = r12.A01
            X.4Cc r0 = r0.ArX()
            r14 = 0
            r15 = 9
            goto L_0x00f2
        L_0x0130:
            r0 = r7
        L_0x0131:
            X.05G r1 = r0.A05
            X.6k7 r0 = X.C315566k7.A00
            goto L_0x010b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.storiestemplates.v1.viewmodel.StoriesTemplateParticipationViewModel.A00(com.instagram.feed.media.CreativeConfigIntf, com.instagram.reels.prompt.model.PromptStickerModel, X.6b1, X.4D7):java.lang.Object");
    }
}
