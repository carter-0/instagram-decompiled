package com.instagram.rtc.interactor.areffects;

import X.0eS;
import X.0sL;
import X.AnonymousClass05E;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C349177zi;
import X.C359218cI;
import X.C60340gF;
import X.C66168MGf;
import X.LEN;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.rtc.interactor.areffects.RtcArEffectsManager$getCollectionsFlow$2", f = "RtcArEffectsManager.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class RtcArEffectsManager$getCollectionsFlow$2 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C359218cI A01;
    public final /* synthetic */ LEN A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RtcArEffectsManager$getCollectionsFlow$2(C359218cI r2, LEN len, AnonymousClass4D7 r4, long j, boolean z, boolean z2) {
        super(2, r4);
        this.A02 = len;
        this.A01 = r2;
        this.A00 = j;
        this.A03 = z;
        this.A04 = z2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.rtc.interactor.areffects.RtcArEffectsManager$getCollectionsFlow$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        return new RtcArEffectsManager$getCollectionsFlow$2(this.A01, this.A02, r10, this.A00, this.A03, this.A04);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((RtcArEffectsManager$getCollectionsFlow$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        return new AnonymousClass05E(new C66168MGf((Object) this.A02.A09.A07(new C349177zi(this.A01, (Integer) null, (String) null, this.A00, this.A03, true, this.A04, true, false)), (AnonymousClass4D7) null, 0, 42));
    }
}
