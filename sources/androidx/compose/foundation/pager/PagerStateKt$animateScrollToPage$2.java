package androidx.compose.foundation.pager;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5b9;
import X.AnonymousClass7TE;
import X.C305196Gx;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2", f = "PagerState.kt", i = {}, l = {953}, m = "invokeSuspend", n = {}, s = {})
public final class PagerStateKt$animateScrollToPage$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ AnonymousClass5b9 A04;
    public final /* synthetic */ C305196Gx A05;
    public final /* synthetic */ 0sL A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PagerStateKt$animateScrollToPage$2(AnonymousClass5b9 r2, C305196Gx r3, AnonymousClass4D7 r4, 0sL r5, float f, int i) {
        super(2, r4);
        this.A06 = r5;
        this.A03 = i;
        this.A05 = r3;
        this.A02 = f;
        this.A04 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        0sL r4 = this.A06;
        int i = this.A03;
        ? pagerStateKt$animateScrollToPage$2 = new PagerStateKt$animateScrollToPage$2(this.A04, this.A05, r9, r4, this.A02, i);
        pagerStateKt$animateScrollToPage$2.A01 = obj;
        return pagerStateKt$animateScrollToPage$2;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.1Hj r2 = X.1Hj.A02
            r10 = r15
            int r0 = r15.A00
            r4 = 1
            if (r0 == 0) goto L_0x000e
            X.0eS.A00(r16)
        L_0x000b:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x000e:
            X.0eS.A00(r16)
            java.lang.Object r3 = r15.A01
            X.6H1 r3 = (X.AnonymousClass6H1) r3
            X.0sL r1 = r15.A06
            int r8 = r15.A03
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r8)
            r1.invoke(r3, r0)
            X.6Gx r7 = r15.A05
            int r0 = r7.B6I()
            r6 = 0
            boolean r9 = X.C51970G9q.A1W(r8, r0)
            int r1 = r7.BLP()
            int r0 = r7.B6I()
            int r1 = r1 - r0
            int r5 = r1 + 1
            if (r9 == 0) goto L_0x005e
            int r0 = r7.BLP()
            if (r8 > r0) goto L_0x0064
        L_0x003f:
            float r13 = r7.AEw(r8)
            float r0 = r15.A02
            float r13 = r13 + r0
            X.0rh r1 = new X.0rh
            r1.<init>()
            X.5b9 r9 = r15.A04
            r0 = 5
            X.JGF r11 = new X.JGF
            r11.<init>(r0, r3, r1)
            r15.A00 = r4
            r12 = 0
            r14 = r12
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A03(r9, r10, r11, r12, r13, r14)
            if (r0 != r2) goto L_0x000b
            return r2
        L_0x005e:
            int r0 = r7.B6I()
            if (r8 >= r0) goto L_0x003f
        L_0x0064:
            int r0 = r7.B6I()
            int r0 = r8 - r0
            int r1 = java.lang.Math.abs(r0)
            r0 = 3
            if (r1 < r0) goto L_0x003f
            if (r9 == 0) goto L_0x0080
            int r1 = r8 - r5
            int r0 = r7.B6I()
            if (r1 >= r0) goto L_0x007c
        L_0x007b:
            r1 = r0
        L_0x007c:
            r7.Evv(r3, r1, r6)
            goto L_0x003f
        L_0x0080:
            int r1 = r8 + r5
            int r0 = r7.B6I()
            if (r1 <= r0) goto L_0x007c
            goto L_0x007b
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.pager.PagerStateKt$animateScrollToPage$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PagerStateKt$animateScrollToPage$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
