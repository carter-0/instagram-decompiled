package androidx.compose.foundation.gestures.snapping;

import X.0sL;
import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass6H1;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1", f = "SnapFlingBehavior.kt", i = {0}, l = {142, 161}, m = "invokeSuspend", n = {"remainingScrollOffset"}, s = {"L$0"})
public final class SnapFlingBehavior$fling$result$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ AnonymousClass6H1 A03;
    public final /* synthetic */ SnapFlingBehavior A04;
    public final /* synthetic */ 0sP A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SnapFlingBehavior$fling$result$1(AnonymousClass6H1 r2, SnapFlingBehavior snapFlingBehavior, AnonymousClass4D7 r4, 0sP r5, float f) {
        super(2, r4);
        this.A04 = snapFlingBehavior;
        this.A02 = f;
        this.A05 = r5;
        this.A03 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        SnapFlingBehavior snapFlingBehavior = this.A04;
        float f = this.A02;
        return new SnapFlingBehavior$fling$result$1(this.A03, snapFlingBehavior, r8, this.A05, f);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.4D7] */
    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x009e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1Hj r3 = X.1Hj.A02
            r9 = r13
            int r0 = r13.A00
            r2 = 2
            r6 = 1
            if (r0 == 0) goto L_0x000f
            if (r0 == r6) goto L_0x005a
            X.0eS.A00(r14)
        L_0x000e:
            return r14
        L_0x000f:
            X.0eS.A00(r14)
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r8 = r13.A04
            X.6HR r1 = r8.A02
            r0 = 0
            float r12 = r13.A02
            float r1 = X.C54734HQp.A00(r1, r0, r12)
            X.6Ez r0 = r8.A03
            float r4 = r0.AEt(r12, r1)
            boolean r0 = java.lang.Float.isNaN(r4)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00a5
            X.0rh r1 = new X.0rh
            r1.<init>()
            float r5 = java.lang.Math.abs(r4)
            float r0 = java.lang.Math.signum(r12)
            float r5 = r5 * r0
            r1.A00 = r5
            X.0sP r4 = r13.A05
            java.lang.Float r0 = X.C51965G9l.A0q(r5)
            r4.invoke(r0)
            X.6H1 r7 = r13.A03
            float r11 = r1.A00
            r0 = 20
            X.J6U r10 = new X.J6U
            r10.<init>(r0, r4, r1)
            r13.A01 = r1
            r13.A00 = r6
            java.lang.Object r14 = androidx.compose.foundation.gestures.snapping.SnapFlingBehavior.A01(r7, r8, r9, r10, r11, r12)
            if (r14 != r3) goto L_0x0061
            return r3
        L_0x005a:
            java.lang.Object r1 = r13.A01
            X.0rh r1 = (X.0rh) r1
            X.0eS.A00(r14)
        L_0x0061:
            X.5b5 r14 = (X.C287955b5) r14
            androidx.compose.foundation.gestures.snapping.SnapFlingBehavior r6 = r13.A04
            X.6Ez r4 = r6.A03
            java.lang.Object r0 = r14.A00()
            float r0 = X.AnonymousClass7TE.A04(r0)
            float r11 = r4.AF8(r0)
            boolean r0 = java.lang.Float.isNaN(r11)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x009e
            r1.A00 = r11
            X.6H1 r8 = r13.A03
            r4 = 0
            r0 = 30
            r5 = 0
            X.5b5 r7 = X.GQU.A01(r14, r4, r4, r0)
            X.5b9 r6 = r6.A01
            X.0sP r4 = r13.A05
            r0 = 19
            X.J6U r10 = new X.J6U
            r10.<init>(r0, r4, r1)
            r13.A01 = r5
            r13.A00 = r2
            r12 = r11
            java.lang.Object r14 = androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt.A00(r6, r7, r8, r9, r10, r11, r12)
            if (r14 != r3) goto L_0x000e
            return r3
        L_0x009e:
            java.lang.String r0 = "calculateSnapOffset returned NaN. Please use a valid value."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x00a5:
            java.lang.String r0 = "calculateApproachOffset returned NaN. Please use a valid value."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.snapping.SnapFlingBehavior$fling$result$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((SnapFlingBehavior$fling$result$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
