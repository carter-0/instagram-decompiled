package androidx.compose.animation.core;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.InfiniteTransition$run$1$1$3", f = "InfiniteTransition.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class InfiniteTransition$run$1$1$3 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ float A00;

    public InfiniteTransition$run$1$1$3(AnonymousClass4D7 r2) {
        super(2, r2);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [androidx.compose.animation.core.InfiniteTransition$run$1$1$3, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r4) {
        ? infiniteTransition$run$1$1$3 = new InfiniteTransition$run$1$1$3(r4);
        infiniteTransition$run$1$1$3.A00 = AnonymousClass7TE.A04(obj);
        return infiniteTransition$run$1$1$3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((InfiniteTransition$run$1$1$3) create(Float.valueOf(AnonymousClass7TE.A04(obj)), (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        return Boolean.valueOf(AnonymousClass7TF.A1R((this.A00 > 0.0f ? 1 : (this.A00 == 0.0f ? 0 : -1))));
    }
}
