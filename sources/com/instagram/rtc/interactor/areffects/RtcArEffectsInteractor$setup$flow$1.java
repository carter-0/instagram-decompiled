package com.instagram.rtc.interactor.areffects;

import X.0eS;
import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C60340gF;
import X.C69138NfJ;
import X.N9H;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.interactor.areffects.RtcArEffectsInteractor$setup$flow$1", f = "RtcArEffectsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcArEffectsInteractor$setup$flow$1 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ Object A00;
    public final /* synthetic */ C69138NfJ A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcArEffectsInteractor$setup$flow$1(C69138NfJ nfJ, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A01 = nfJ;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        RtcArEffectsInteractor$setup$flow$1 rtcArEffectsInteractor$setup$flow$1 = new RtcArEffectsInteractor$setup$flow$1(this.A01, (AnonymousClass4D7) obj4);
        rtcArEffectsInteractor$setup$flow$1.A00 = obj3;
        return rtcArEffectsInteractor$setup$flow$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        this.A01.A0C = ((N9H) this.A00).A06;
        return C60340gF.A00;
    }
}
