package com.instagram.video.live.mvvm.viewmodel.host;

import X.05G;
import X.0eS;
import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60195JhE;
import X.C60340gF;
import X.JTR;
import X.ULD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.host.IgLiveHostNuxTutorialViewModel$viewState$1", f = "IgLiveHostNuxTutorialViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveHostNuxTutorialViewModel$viewState$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ int A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ C60195JhE A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveHostNuxTutorialViewModel$viewState$1(C60195JhE jhE, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = jhE;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        int A0M = AnonymousClass7TE.A0M(obj2);
        IgLiveHostNuxTutorialViewModel$viewState$1 igLiveHostNuxTutorialViewModel$viewState$1 = new IgLiveHostNuxTutorialViewModel$viewState$1(this.A02, (AnonymousClass4D7) obj3);
        igLiveHostNuxTutorialViewModel$viewState$1.A01 = A1a;
        igLiveHostNuxTutorialViewModel$viewState$1.A00 = A0M;
        return igLiveHostNuxTutorialViewModel$viewState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        0eS.A00(obj);
        boolean z = this.A01;
        int i2 = this.A00;
        C60195JhE jhE = this.A02;
        05G r2 = jhE.A05;
        int i3 = 2131968361;
        if (JTR.A0K(r2) == jhE.A00) {
            i3 = 2131960992;
        }
        int A0K = JTR.A0K(r2);
        if (A0K == 1) {
            i = 2131965397;
        } else if (A0K == 2) {
            i = 2131965399;
        } else if (A0K != 3) {
            i = 2131965396;
            if (A0K != 4) {
                i = 0;
            }
        } else {
            i = 2131965398;
        }
        return new ULD(z, i3, i, jhE.A00, i2);
    }
}
