package androidx.compose.foundation.lazy.layout;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C268024cd;
import X.C305196Gx;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2", f = "LazyAnimateScroll.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 1}, l = {174, 272}, m = "invokeSuspend", n = {"$this$scroll", "loop", "anim", "loops", "targetDistancePx", "boundDistancePx", "minDistancePx", "forward", "$this$scroll"}, s = {"L$0", "L$1", "L$2", "L$3", "F$0", "F$1", "F$2", "I$0", "L$0"})
public final class LazyAnimateScrollKt$animateScrollToItem$2 extends AnonymousClass1Ek implements 0sL {
    public float A00;
    public float A01;
    public float A02;
    public int A03;
    public int A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public /* synthetic */ Object A08;
    public final /* synthetic */ int A09;
    public final /* synthetic */ int A0A;
    public final /* synthetic */ int A0B;
    public final /* synthetic */ C305196Gx A0C;
    public final /* synthetic */ C268024cd A0D;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LazyAnimateScrollKt$animateScrollToItem$2(C305196Gx r2, C268024cd r3, AnonymousClass4D7 r4, int i, int i2, int i3) {
        super(2, r4);
        this.A09 = i;
        this.A0D = r3;
        this.A0C = r2;
        this.A0B = i2;
        this.A0A = i3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        int i = this.A09;
        ? lazyAnimateScrollKt$animateScrollToItem$2 = new LazyAnimateScrollKt$animateScrollToItem$2(this.A0C, this.A0D, r9, i, this.A0B, this.A0A);
        lazyAnimateScrollKt$animateScrollToItem$2.A08 = obj;
        return lazyAnimateScrollKt$animateScrollToItem$2;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7] */
    /* JADX WARNING: type inference failed for: r21v0, types: [java.lang.Object, X.0rh] */
    /* JADX WARNING: type inference failed for: r31v0, types: [X.4D7] */
    /* JADX WARNING: type inference failed for: r1v8, types: [X.0r1, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r6v5, types: [java.lang.Object, X.0rk] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0098 A[Catch:{ Ikm -> 0x0158 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            r34 = this;
            X.1Hj r4 = X.1Hj.A02
            r5 = r34
            int r0 = r5.A04
            r15 = 2
            r7 = 0
            r9 = 1
            if (r0 == 0) goto L_0x003a
            if (r0 == r9) goto L_0x0020
            java.lang.Object r2 = r5.A08
            X.6H1 r2 = (X.AnonymousClass6H1) r2
            X.0eS.A00(r35)
        L_0x0014:
            X.6Gx r3 = r5.A0C
            int r1 = r5.A09
            int r0 = r5.A0B
            r3.Evv(r2, r1, r0)
        L_0x001d:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0020:
            int r0 = r5.A03
            float r11 = r5.A02
            float r14 = r5.A01
            float r8 = r5.A00
            java.lang.Object r6 = r5.A07
            X.0rk r6 = (X.0rk) r6
            java.lang.Object r3 = r5.A06
            X.0rm r3 = (X.0rm) r3
            java.lang.Object r1 = r5.A05
            X.0r1 r1 = (X.0r1) r1
            java.lang.Object r2 = r5.A08
            X.6H1 r2 = (X.AnonymousClass6H1) r2
            goto L_0x013b
        L_0x003a:
            X.0eS.A00(r35)
            java.lang.Object r2 = r5.A08
            X.6H1 r2 = (X.AnonymousClass6H1) r2
            int r6 = r5.A09
            float r0 = (float) r6
            int r1 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r0 = 0
            if (r1 < 0) goto L_0x004a
            r0 = 1
        L_0x004a:
            if (r0 == 0) goto L_0x019e
            X.4cd r1 = r5.A0D     // Catch:{ Ikm -> 0x0158 }
            r0 = 1159479296(0x451c4000, float:2500.0)
            float r8 = r1.F06(r0)     // Catch:{ Ikm -> 0x0158 }
            r0 = 1153138688(0x44bb8000, float:1500.0)
            float r14 = r1.F06(r0)     // Catch:{ Ikm -> 0x0158 }
            r0 = 1112014848(0x42480000, float:50.0)
            float r11 = r1.F06(r0)     // Catch:{ Ikm -> 0x0158 }
            X.0r1 r1 = new X.0r1     // Catch:{ Ikm -> 0x0158 }
            r1.<init>()     // Catch:{ Ikm -> 0x0158 }
            r1.A00 = r9     // Catch:{ Ikm -> 0x0158 }
            X.0rm r3 = X.C51965G9l.A11()     // Catch:{ Ikm -> 0x0158 }
            X.5b5 r0 = X.GQU.A00(r7, r7)     // Catch:{ Ikm -> 0x0158 }
            r3.A00 = r0     // Catch:{ Ikm -> 0x0158 }
            X.6Gx r13 = r5.A0C     // Catch:{ Ikm -> 0x0158 }
            int r12 = r13.B6I()     // Catch:{ Ikm -> 0x0158 }
            int r10 = r13.BLP()     // Catch:{ Ikm -> 0x0158 }
            r0 = 0
            if (r6 > r10) goto L_0x0083
            if (r12 > r6) goto L_0x0083
            r0 = 1
        L_0x0083:
            if (r0 != 0) goto L_0x0146
            int r0 = r13.B6I()     // Catch:{ Ikm -> 0x0158 }
            boolean r0 = X.C51970G9q.A1W(r6, r0)
            X.0rk r6 = new X.0rk     // Catch:{ Ikm -> 0x0158 }
            r6.<init>()     // Catch:{ Ikm -> 0x0158 }
            r6.A00 = r9     // Catch:{ Ikm -> 0x0158 }
        L_0x0094:
            boolean r10 = r1.A00     // Catch:{ Ikm -> 0x0158 }
            if (r10 == 0) goto L_0x001d
            X.6Gx r10 = r5.A0C     // Catch:{ Ikm -> 0x0158 }
            r20 = r10
            int r10 = r20.getItemCount()     // Catch:{ Ikm -> 0x0158 }
            if (r10 <= 0) goto L_0x001d
            int r10 = r5.A09     // Catch:{ Ikm -> 0x0158 }
            r19 = r10
            r12 = r20
            float r12 = r12.AEw(r10)     // Catch:{ Ikm -> 0x0158 }
            int r10 = r5.A0B     // Catch:{ Ikm -> 0x0158 }
            r18 = r10
            float r10 = (float) r10     // Catch:{ Ikm -> 0x0158 }
            float r12 = r12 + r10
            float r12 = java.lang.Math.abs(r12)     // Catch:{ Ikm -> 0x0158 }
            int r10 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r10 >= 0) goto L_0x00c2
            float r10 = java.lang.Math.max(r12, r11)     // Catch:{ Ikm -> 0x0158 }
            if (r0 != 0) goto L_0x00c6
            float r10 = -r10
            goto L_0x00c6
        L_0x00c2:
            float r10 = -r8
            if (r0 == 0) goto L_0x00c6
            r10 = r8
        L_0x00c6:
            java.lang.Object r13 = r3.A00     // Catch:{ Ikm -> 0x0158 }
            X.5b5 r13 = (X.C287955b5) r13     // Catch:{ Ikm -> 0x0158 }
            r12 = 30
            r16 = 0
            X.5b5 r12 = X.GQU.A01(r13, r7, r7, r12)     // Catch:{ Ikm -> 0x0158 }
            r3.A00 = r12     // Catch:{ Ikm -> 0x0158 }
            X.0rh r21 = new X.0rh     // Catch:{ Ikm -> 0x0158 }
            r21.<init>()     // Catch:{ Ikm -> 0x0158 }
            java.lang.Object r12 = r3.A00     // Catch:{ Ikm -> 0x0158 }
            X.5b5 r12 = (X.C287955b5) r12     // Catch:{ Ikm -> 0x0158 }
            java.lang.Float r30 = X.C51965G9l.A0q(r10)     // Catch:{ Ikm -> 0x0158 }
            java.lang.Object r13 = r3.A00     // Catch:{ Ikm -> 0x0158 }
            X.5b5 r13 = (X.C287955b5) r13     // Catch:{ Ikm -> 0x0158 }
            java.lang.Object r13 = r13.A00()     // Catch:{ Ikm -> 0x0158 }
            float r13 = X.AnonymousClass7TE.A04(r13)     // Catch:{ Ikm -> 0x0158 }
            int r13 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            boolean r13 = X.AnonymousClass7TF.A1Q(r13)
            r33 = 0
            if (r13 != 0) goto L_0x00f9
            r33 = 1
        L_0x00f9:
            boolean r29 = X.AnonymousClass7TF.A1P(r0)
            int r13 = r5.A0A     // Catch:{ Ikm -> 0x0158 }
            X.IyG r17 = new X.IyG     // Catch:{ Ikm -> 0x0158 }
            r23 = r3
            r24 = r10
            r25 = r14
            r26 = r19
            r27 = r13
            r28 = r18
            r18 = r2
            r19 = r20
            r20 = r1
            r22 = r6
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ Ikm -> 0x0158 }
            r5.A08 = r2     // Catch:{ Ikm -> 0x0158 }
            r5.A05 = r1     // Catch:{ Ikm -> 0x0158 }
            r5.A06 = r3     // Catch:{ Ikm -> 0x0158 }
            r5.A07 = r6     // Catch:{ Ikm -> 0x0158 }
            r5.A00 = r8     // Catch:{ Ikm -> 0x0158 }
            r5.A01 = r14     // Catch:{ Ikm -> 0x0158 }
            r5.A02 = r11     // Catch:{ Ikm -> 0x0158 }
            r5.A03 = r0     // Catch:{ Ikm -> 0x0158 }
            r5.A04 = r9     // Catch:{ Ikm -> 0x0158 }
            X.5b7 r28 = X.C51972G9s.A0J(r16)     // Catch:{ Ikm -> 0x0158 }
            r29 = r12
            r31 = r5
            r32 = r17
            java.lang.Object r10 = androidx.compose.animation.core.SuspendAnimationKt.A02(r28, r29, r30, r31, r32, r33)     // Catch:{ Ikm -> 0x0158 }
            if (r10 != r4) goto L_0x013e
            goto L_0x019d
        L_0x013b:
            X.0eS.A00(r35)     // Catch:{ Ikm -> 0x0158 }
        L_0x013e:
            int r10 = r6.A00     // Catch:{ Ikm -> 0x0158 }
            int r10 = r10 + 1
            r6.A00 = r10     // Catch:{ Ikm -> 0x0158 }
            goto L_0x0094
        L_0x0146:
            float r0 = r13.AEw(r6)     // Catch:{ Ikm -> 0x0158 }
            int r6 = X.AnonymousClass1GB.A01(r0)     // Catch:{ Ikm -> 0x0158 }
            java.lang.Object r1 = r3.A00     // Catch:{ Ikm -> 0x0158 }
            X.5b5 r1 = (X.C287955b5) r1     // Catch:{ Ikm -> 0x0158 }
            X.Ikm r0 = new X.Ikm     // Catch:{ Ikm -> 0x0158 }
            r0.<init>(r1, r6)     // Catch:{ Ikm -> 0x0158 }
            throw r0     // Catch:{ Ikm -> 0x0158 }
        L_0x0158:
            r3 = move-exception
            X.5b5 r1 = r3.A01
            r0 = 30
            r6 = 0
            X.5b5 r8 = X.GQU.A01(r1, r7, r7, r0)
            int r1 = r3.A00
            int r0 = r5.A0B
            int r1 = r1 + r0
            float r3 = (float) r1
            X.0rh r1 = new X.0rh
            r1.<init>()
            java.lang.Float r9 = X.C51965G9l.A0q(r3)
            java.lang.Object r0 = r8.A00()
            float r0 = X.AnonymousClass7TE.A04(r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            r12 = r0 ^ 1
            X.Iwv r0 = new X.Iwv
            r0.<init>(r2, r1, r3, r15)
            r5.A08 = r2
            r5.A05 = r6
            r5.A06 = r6
            r5.A07 = r6
            r5.A04 = r15
            X.5b7 r7 = X.C51972G9s.A0J(r6)
            r10 = r5
            r11 = r0
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A02(r7, r8, r9, r10, r11, r12)
            if (r0 != r4) goto L_0x0014
            return r4
        L_0x019d:
            return r4
        L_0x019e:
            r0 = 488(0x1e8, float:6.84E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            java.lang.String r0 = X.G9w.A0j(r0, r6)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.layout.LazyAnimateScrollKt$animateScrollToItem$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LazyAnimateScrollKt$animateScrollToItem$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
