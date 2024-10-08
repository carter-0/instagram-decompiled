package com.instagram.common.mvvm;

import X.0eS;
import X.0sP;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.C294725mv;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.common.mvvm.SingleFlightImpl$wrapAction$1", f = "SingleFlight.kt", i = {}, l = {107}, m = "invokeSuspend", n = {}, s = {})
public final class SingleFlightImpl$wrapAction$1 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ 0sP A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SingleFlightImpl$wrapAction$1(AnonymousClass4D7 r2, 0sP r3) {
        super(1, r2);
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.mvvm.SingleFlightImpl$wrapAction$1, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r3) {
        return new SingleFlightImpl$wrapAction$1(r3, this.A01);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return new SingleFlightImpl$wrapAction$1((AnonymousClass4D7) obj, this.A01).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        1Hj r2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            0sP r0 = this.A01;
            this.A00 = 1;
            obj = r0.invoke(this);
            if (obj == r2) {
                return r2;
            }
        }
        return new C294725mv(obj);
    }
}
