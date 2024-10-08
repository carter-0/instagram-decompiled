package com.airbnb.lottie.compose;

import X.0eS;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C51967G9n;
import X.C56867IFo;
import X.C60340gF;
import X.S7N;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2", f = "LottieAnimatable.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class LottieAnimatableImpl$snapTo$2 extends AnonymousClass1Ek implements 0sP {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ S7N A02;
    public final /* synthetic */ C56867IFo A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$snapTo$2(S7N s7n, C56867IFo iFo, AnonymousClass4D7 r4, float f, int i, boolean z) {
        super(1, r4);
        this.A03 = iFo;
        this.A02 = s7n;
        this.A00 = f;
        this.A01 = i;
        this.A04 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r8) {
        return new LottieAnimatableImpl$snapTo$2(this.A02, this.A03, r8, this.A00, this.A01, this.A04);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((LottieAnimatableImpl$snapTo$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        C56867IFo iFo = this.A03;
        iFo.A02.Epw(this.A02);
        C56867IFo.A00(iFo, this.A00);
        C51967G9n.A15(iFo.A04, this.A01);
        C51967G9n.A16(iFo.A03, false);
        if (this.A04) {
            iFo.A06.Epw(Long.MIN_VALUE);
        }
        return C60340gF.A00;
    }
}
