package com.instagram.creation.capture.quickcapture.sundial.api;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C3514989c;
import X.C60340gF;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.sundial.api.ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1", f = "ClipsAssetRecommendationService.kt", i = {0}, l = {42, 52, 63, 68}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
public final class ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C3514989c A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1(UserSession userSession, C3514989c r3, String str, String str2, String str3, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A03 = r3;
        this.A02 = userSession;
        this.A04 = str;
        this.A05 = str2;
        this.A06 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.capture.quickcapture.sundial.api.ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        ? clipsAssetRecommendationService$fetchEffectAssetRecommendation$1 = new ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1(this.A02, this.A03, this.A04, this.A05, this.A06, r9);
        clipsAssetRecommendationService$fetchEffectAssetRecommendation$1.A01 = obj;
        return clipsAssetRecommendationService$fetchEffectAssetRecommendation$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.creation.capture.quickcapture.sundial.api.ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            X.1Hj r7 = X.1Hj.A02
            int r0 = r15.A00
            r2 = 4
            r3 = 3
            r9 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0014
            if (r0 == r5) goto L_0x007f
            X.0eS.A00(r1)
        L_0x0011:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0014:
            X.0eS.A00(r1)
            java.lang.Object r8 = r15.A01
            X.02o r8 = (X.02o) r8
            com.instagram.common.session.UserSession r0 = r15.A02
            java.lang.String r13 = r15.A04
            com.instagram.api.schemas.AssetRecommendationType r14 = com.instagram.api.schemas.AssetRecommendationType.AUDIO
            java.lang.String r10 = r15.A05
            java.lang.String r11 = r15.A06
            com.instagram.api.schemas.AssetRecommendationType r1 = com.instagram.api.schemas.AssetRecommendationType.EFFECT
            r4 = 0
            X.0qQ.A0B(r0, r4)
            X.1NY r6 = X.AnonymousClass7TG.A0a(r0)
            r6.A02()
            java.lang.String r0 = "api/v1/clips/camera_contextual_asset_recommendation/"
            r6.A0A(r0)
            java.lang.Class<X.CD8> r12 = X.CD8.class
            java.lang.Class<X.Cyg> r0 = X.C45568Cyg.class
            r6.A0Q(r12, r0)
            java.lang.String r12 = r14.A00
            java.lang.String r0 = "input_asset_type"
            r6.A9m(r0, r12)
            if (r13 == 0) goto L_0x004c
            java.lang.String r0 = "audio_cluster_id"
            r6.A9m(r0, r13)
        L_0x004c:
            if (r11 == 0) goto L_0x0057
            r0 = 3707(0xe7b, float:5.195E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.A9m(r0, r11)
        L_0x0057:
            if (r10 == 0) goto L_0x005e
            java.lang.String r0 = "music_canonical_id"
            r6.A9m(r0, r10)
        L_0x005e:
            java.lang.String r1 = r1.A00
            java.lang.String r0 = "output_asset_type"
            r6.A9m(r0, r1)
            java.lang.String r0 = "num_to_fetch"
            r6.A0C(r0, r5)
            X.1OC r1 = r6.A0M()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.HttpRequestTask<com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetContextualAssetRecommendationResponse>, com.instagram.api.response.IgApiResponse<com.instagram.api.schemas.GetContextualAssetRecommendationResponse>>"
            X.0qQ.A0C(r1, r0)
            r15.A01 = r8
            r15.A00 = r5
            r0 = -5
            java.lang.Object r1 = r1.A02(r15, r0, r3, r4)
            if (r1 != r7) goto L_0x0086
            return r7
        L_0x007f:
            java.lang.Object r8 = r15.A01
            X.02o r8 = (X.02o) r8
            X.0eS.A00(r1)
        L_0x0086:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            r6 = 0
            if (r0 == 0) goto L_0x00f0
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.371 r0 = (X.AnonymousClass371) r0
            java.lang.Object r0 = r0.FH3()
            X.BAd r0 = (X.C42003BAd) r0
            X.4gn r0 = r0.A00
            if (r0 == 0) goto L_0x00e5
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x00e5
            java.lang.Object r2 = X.00k.A0J(r0)
            X.DU4 r2 = (X.DU4) r2
            if (r2 == 0) goto L_0x00e5
            com.instagram.api.schemas.AssetRecommendationType r1 = r2.Acj()
            com.instagram.api.schemas.AssetRecommendationType r0 = com.instagram.api.schemas.AssetRecommendationType.EFFECT
            if (r1 != r0) goto L_0x00e5
            java.lang.String r5 = r2.getAssetName()
            java.lang.String r4 = r2.getExtra()
            com.instagram.common.typedurl.ImageUrl r3 = r2.Arq()
            java.lang.String r2 = r2.getAssetId()
            if (r5 == 0) goto L_0x00e3
            if (r4 == 0) goto L_0x00e3
            if (r3 == 0) goto L_0x00e3
            X.8JL r1 = X.AnonymousClass8JL.EFFECT
            com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem r0 = new com.instagram.creation.capture.quickcapture.sundial.toast.model.ClipsPreloadedSettingItem
            r0.<init>(r1, r3, r5, r4)
            r0.A02 = r2
            r0.A01 = r6
            r0.A00 = r6
        L_0x00d4:
            X.3Ih r0 = X.C41845B3m.A0d(r0)
            r15.A01 = r6
            r15.A00 = r9
        L_0x00dc:
            java.lang.Object r0 = r8.emit(r0, r15)
            if (r0 != r7) goto L_0x0011
            return r7
        L_0x00e3:
            r0 = 0
            goto L_0x00d4
        L_0x00e5:
            X.D8V r0 = X.D8V.A00
            X.5sO r0 = X.C41845B3m.A0c(r0)
            r15.A01 = r6
            r15.A00 = r3
            goto L_0x00dc
        L_0x00f0:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ff
            X.D8V r0 = X.D8V.A00
            X.5sO r0 = X.C41845B3m.A0c(r0)
            r15.A01 = r6
            r15.A00 = r2
            goto L_0x00dc
        L_0x00ff:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.sundial.api.ClipsAssetRecommendationService$fetchEffectAssetRecommendation$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
