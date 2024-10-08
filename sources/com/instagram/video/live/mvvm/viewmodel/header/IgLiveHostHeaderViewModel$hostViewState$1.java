package com.instagram.video.live.mvvm.viewmodel.header;

import X.0eS;
import X.0sK;
import X.1G0;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C61046Jvk;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.header.IgLiveHostHeaderViewModel$hostViewState$1", f = "IgLiveHostHeaderViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveHostHeaderViewModel$hostViewState$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ long A00;
    public /* synthetic */ boolean A01;

    public IgLiveHostHeaderViewModel$hostViewState$1(AnonymousClass4D7 r2) {
        super(3, r2);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        long A0R = AnonymousClass7TE.A0R(obj2);
        IgLiveHostHeaderViewModel$hostViewState$1 igLiveHostHeaderViewModel$hostViewState$1 = new IgLiveHostHeaderViewModel$hostViewState$1((AnonymousClass4D7) obj3);
        igLiveHostHeaderViewModel$hostViewState$1.A01 = A1a;
        igLiveHostHeaderViewModel$hostViewState$1.A00 = A0R;
        return igLiveHostHeaderViewModel$hostViewState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        return new C61046Jvk(1G0.A02(this.A00), 17, this.A01);
    }
}
