package androidx.compose.foundation.gestures;

import X.0eS;
import X.0rh;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass6H1;
import X.AnonymousClass6HR;
import X.AnonymousClass6IU;
import X.AnonymousClass7TE;
import X.C287955b5;
import X.C51965G9l;
import X.C58769IxG;
import X.C60340gF;
import X.GQU;
import androidx.compose.animation.core.SuspendAnimationKt;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", i = {0, 0}, l = {893}, m = "invokeSuspend", n = {"velocityLeft", "animationState"}, s = {"L$0", "L$1"})
public final class DefaultFlingBehavior$performFling$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ float A03;
    public final /* synthetic */ AnonymousClass6IU A04;
    public final /* synthetic */ AnonymousClass6H1 A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DefaultFlingBehavior$performFling$2(AnonymousClass6IU r2, AnonymousClass6H1 r3, AnonymousClass4D7 r4, float f) {
        super(2, r4);
        this.A03 = f;
        this.A04 = r2;
        this.A05 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r6) {
        return new DefaultFlingBehavior$performFling$2(this.A04, this.A05, r6, this.A03);
    }

    /* JADX WARNING: type inference failed for: r9v2, types: [java.lang.Object, X.0rh] */
    public final Object invokeSuspend(Object obj) {
        float f;
        0rh r9;
        0rh r92;
        C287955b5 r2;
        Object obj2 = 1Hj.A02;
        if (this.A00 != 0) {
            r2 = (C287955b5) this.A02;
            0rh r93 = (0rh) this.A01;
            try {
                r92 = r93;
                0eS.A00(obj);
                r92 = r93;
                r9 = r93;
            } catch (CancellationException unused) {
                r92.A00 = AnonymousClass7TE.A04(r2.A00());
                r9 = r92;
            }
        } else {
            0eS.A00(obj);
            f = this.A03;
            if (Math.abs(f) > 1.0f) {
                ? obj3 = new Object();
                obj3.A00 = f;
                Object obj4 = new Object();
                r2 = GQU.A00(0.0f, f);
                r92 = obj3;
                AnonymousClass6IU r8 = this.A04;
                AnonymousClass6HR r0 = r8.A01;
                C58769IxG ixG = new C58769IxG(2, this.A05, r8, obj3, obj4);
                this.A01 = obj3;
                this.A02 = r2;
                this.A00 = 1;
                r9 = obj3;
                if (SuspendAnimationKt.A04(r2, r0, this, ixG, false) == obj2) {
                    return obj2;
                }
            }
            return C51965G9l.A0q(f);
        }
        f = r9.A00;
        return C51965G9l.A0q(f);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DefaultFlingBehavior$performFling$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
