package com.facebook.fbavatar.cdsavatareditor.liveediting.common;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.AH4;
import X.AnonymousClass00P;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C18741VzM;
import X.C60340gF;
import X.C64164LRf;
import X.C64301LZb;
import android.view.View;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.fbavatar.cdsavatareditor.liveediting.common.CommonLiveEditingProvider$setRichAvatarViewAlpha$1", f = "CommonLiveEditingProvider.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommonLiveEditingProvider$setRichAvatarViewAlpha$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ float A00;
    public final /* synthetic */ C18741VzM A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommonLiveEditingProvider$setRichAvatarViewAlpha$1(C18741VzM vzM, AnonymousClass4D7 r3, float f) {
        super(2, r3);
        this.A01 = vzM;
        this.A00 = f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.fbavatar.cdsavatareditor.liveediting.common.CommonLiveEditingProvider$setRichAvatarViewAlpha$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new CommonLiveEditingProvider$setRichAvatarViewAlpha$1(this.A01, r5, this.A00);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommonLiveEditingProvider$setRichAvatarViewAlpha$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        C64301LZb lZb = this.A01.A08;
        if (lZb != null) {
            float f = this.A00;
            C64164LRf lRf = lZb.A00;
            if (lRf == null) {
                0qQ.A0F("provider");
                throw AnonymousClass00P.createAndThrow();
            }
            AH4 ah4 = lRf.A04;
            if (ah4 != null) {
                View Bf9 = ah4.A0E.Bf9();
                0qQ.A07(Bf9);
                Bf9.setAlpha(f);
            }
        }
        return C60340gF.A00;
    }
}
