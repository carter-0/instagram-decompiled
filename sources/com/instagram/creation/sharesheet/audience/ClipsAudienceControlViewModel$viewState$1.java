package com.instagram.creation.sharesheet.audience;

import X.0eS;
import X.0sI;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60259JiG;
import X.C60340gF;
import X.C60935Jtt;
import X.C62442Kfs;
import X.C62483KgY;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.sharesheet.audience.ClipsAudienceControlViewModel$viewState$1", f = "ClipsAudienceControlViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsAudienceControlViewModel$viewState$1 extends AnonymousClass1Ek implements 0sI {
    public /* synthetic */ int A00;
    public /* synthetic */ int A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public final /* synthetic */ C60259JiG A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsAudienceControlViewModel$viewState$1(C60259JiG jiG, AnonymousClass4D7 r3) {
        super(5, r3);
        this.A04 = jiG;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int A0M = AnonymousClass7TE.A0M(obj);
        int A0M2 = AnonymousClass7TE.A0M(obj4);
        ClipsAudienceControlViewModel$viewState$1 clipsAudienceControlViewModel$viewState$1 = new ClipsAudienceControlViewModel$viewState$1(this.A04, (AnonymousClass4D7) obj5);
        clipsAudienceControlViewModel$viewState$1.A00 = A0M;
        clipsAudienceControlViewModel$viewState$1.A02 = obj2;
        clipsAudienceControlViewModel$viewState$1.A03 = obj3;
        clipsAudienceControlViewModel$viewState$1.A01 = A0M2;
        return clipsAudienceControlViewModel$viewState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        int i = this.A00;
        return new C60935Jtt((C62483KgY) this.A03, (C62442Kfs) this.A02, i, this.A01, this.A04.A0A);
    }
}
