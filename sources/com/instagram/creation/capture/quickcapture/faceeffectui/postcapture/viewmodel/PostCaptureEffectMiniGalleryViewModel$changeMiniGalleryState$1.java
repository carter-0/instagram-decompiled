package com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C61752KKr;
import X.C61753KKs;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1", f = "PostCaptureEffectMiniGalleryViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ boolean A00;

    public PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1(AnonymousClass4D7 r2) {
        super(2, r2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.creation.capture.quickcapture.faceeffectui.postcapture.viewmodel.PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? postCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1 = new PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1(r4);
        postCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1.A00 = AnonymousClass7TE.A1a(obj);
        return postCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PostCaptureEffectMiniGalleryViewModel$changeMiniGalleryState$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        if (this.A00) {
            return C61753KKs.A00;
        }
        return C61752KKr.A00;
    }
}
