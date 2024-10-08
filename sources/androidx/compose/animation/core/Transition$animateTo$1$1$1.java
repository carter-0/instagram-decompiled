package androidx.compose.animation.core;

import X.0eS;
import X.0sL;
import X.19E;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C3026564t;
import X.C56606I4f;
import X.C58733Iwg;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Transition$animateTo$1$1$1", f = "Transition.kt", i = {0, 0}, l = {1227}, m = "invokeSuspend", n = {"$this$launch", "durationScale"}, s = {"L$0", "F$0"})
public final class Transition$animateTo$1$1$1 extends AnonymousClass1Ek implements 0sL {
    public float A00;
    public int A01;
    public /* synthetic */ Object A02;
    public final /* synthetic */ C56606I4f A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Transition$animateTo$1$1$1(C56606I4f i4f, AnonymousClass4D7 r3) {
        super(2, r3);
        this.A03 = i4f;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.animation.core.Transition$animateTo$1$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? transition$animateTo$1$1$1 = new Transition$animateTo$1$1$1(this.A03, r4);
        transition$animateTo$1$1$1.A02 = obj;
        return transition$animateTo$1$1$1;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [androidx.compose.animation.core.Transition$animateTo$1$1$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        float f;
        C262224Cq r1;
        1Hj r6 = 1Hj.A02;
        if (this.A01 != 0) {
            f = this.A00;
            r1 = (C262224Cq) this.A02;
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            r1 = (C262224Cq) this.A02;
            f = SuspendAnimationKt.A00(r1.ArX());
        }
        while (19E.A07(r1)) {
            C58733Iwg iwg = new C58733Iwg(this.A03, f, 0);
            this.A02 = r1;
            this.A00 = f;
            this.A01 = 1;
            if (C3026564t.A01(this, iwg) == r6) {
                return r6;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((Transition$animateTo$1$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
