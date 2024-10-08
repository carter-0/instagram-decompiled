package com.instagram.debug.devoptions.zero;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C60340gF;
import X.C71079Oay;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1", f = "ZeroHeadersDevOptionsFragment.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
public final class ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C71079Oay $manager;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1(C71079Oay oay, AnonymousClass4D7 r3) {
        super(2, r3);
        this.$manager = oay;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        return new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1(this.$manager, r4);
    }

    public final Object invoke(C262224Cq r3, AnonymousClass4D7 r4) {
        return new ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1(this.$manager, r4).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.debug.devoptions.zero.ZeroHeadersDevOptionsFragment$onStartHeadersFlow$deferredEntry$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r3 = 1Hj.A02;
        int i = this.label;
        if (i == 0) {
            0eS.A00(obj);
            C71079Oay oay = this.$manager;
            this.label = 1;
            obj = oay.A03("test", "", this);
            if (obj == r3) {
                return r3;
            }
        } else if (i == 1) {
            0eS.A00(obj);
        } else {
            throw AnonymousClass7TE.A0x();
        }
        return obj;
    }
}
