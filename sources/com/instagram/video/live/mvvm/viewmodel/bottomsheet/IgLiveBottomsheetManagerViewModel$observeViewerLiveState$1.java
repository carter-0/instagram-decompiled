package com.instagram.video.live.mvvm.viewmodel.bottomsheet;

import X.0eS;
import X.0sK;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass3NV;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C249513ju;
import X.C51965G9l;
import X.C60248Ji5;
import X.C60340gF;
import X.C60985Juh;
import X.C61013JvD;
import X.C62269Kd3;
import X.DbS;
import X.DbT;
import X.GKO;
import X.JTP;
import X.JTQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.bottomsheet.IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1", f = "IgLiveBottomsheetManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ boolean A00;
    public /* synthetic */ boolean A01;
    public final /* synthetic */ C60248Ji5 A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1(C60248Ji5 ji5, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = ji5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1 igLiveBottomsheetManagerViewModel$observeViewerLiveState$1 = new IgLiveBottomsheetManagerViewModel$observeViewerLiveState$1(this.A02, (AnonymousClass4D7) obj3);
        igLiveBottomsheetManagerViewModel$observeViewerLiveState$1.A00 = A1a;
        igLiveBottomsheetManagerViewModel$observeViewerLiveState$1.A01 = A1a2;
        return igLiveBottomsheetManagerViewModel$observeViewerLiveState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        Boolean bool;
        0eS.A00(obj);
        boolean z = this.A00;
        boolean z2 = this.A01;
        if (z && !z2) {
            C60248Ji5 ji5 = this.A02;
            C61013JvD A0Q = JTQ.A0Q(ji5.A07);
            C60985Juh A0e = JTP.A0e(ji5.A09);
            C249513ju r3 = ji5.A0C;
            Integer num = AnonymousClass05K.A02;
            GKO A0Q2 = DbS.A0Q(new Object[0], 2131965182);
            Boolean A0v = AnonymousClass7TE.A0v();
            Float A0q = C51965G9l.A0q(0.6f);
            Boolean A0l = DbT.A0l(ji5.A0G);
            Float A0i = JTP.A0i();
            if (A0Q != null) {
                str = A0Q.A08;
            } else {
                str = null;
            }
            if (A0e != null) {
                bool = Boolean.valueOf(A0e.A0E);
            } else {
                bool = null;
            }
            r3.FIG(new C62269Kd3(A0Q2, (AnonymousClass3NV) null, A0v, (Boolean) null, A0l, A0v, false, (Boolean) null, (Boolean) null, bool, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, A0q, A0i, num, (Long) null, (Long) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false, false));
        }
        return C60340gF.A00;
    }
}
