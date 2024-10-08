package com.instagram.video.live.mvvm.viewmodel.stickers;

import X.05G;
import X.0eS;
import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60198JhH;
import X.C60340gF;
import X.C61042Jvg;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.stickers.IgLiveTextStickersViewModel$2", f = "IgLiveTextStickersViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveTextStickersViewModel$2 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C60198JhH A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveTextStickersViewModel$2(C60198JhH jhH, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A03 = jhH;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        boolean A1a3 = AnonymousClass7TE.A1a(obj3);
        IgLiveTextStickersViewModel$2 igLiveTextStickersViewModel$2 = new IgLiveTextStickersViewModel$2(this.A03, (AnonymousClass4D7) obj4);
        igLiveTextStickersViewModel$2.A00 = A1a;
        igLiveTextStickersViewModel$2.A01 = A1a2;
        igLiveTextStickersViewModel$2.A02 = A1a3;
        return igLiveTextStickersViewModel$2.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        boolean z = this.A00;
        boolean z2 = this.A01;
        boolean z3 = this.A02;
        05G r3 = this.A03.A03;
        boolean z4 = true;
        boolean z5 = !z;
        if (!z2 || z3) {
            z4 = false;
        }
        C61042Jvg.A00(r3, 20, z5, z4);
        return C60340gF.A00;
    }
}
