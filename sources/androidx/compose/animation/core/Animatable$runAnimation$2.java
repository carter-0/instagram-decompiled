package androidx.compose.animation.core;

import X.0sP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5b4;
import X.C3025964g;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.animation.core.Animatable$runAnimation$2", f = "Animatable.kt", i = {0, 0}, l = {312}, m = "invokeSuspend", n = {"endState", "clampingNeeded"}, s = {"L$0", "L$1"})
public final class Animatable$runAnimation$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ long A03;
    public final /* synthetic */ AnonymousClass5b4 A04;
    public final /* synthetic */ C3025964g A05;
    public final /* synthetic */ Object A06;
    public final /* synthetic */ 0sP A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Animatable$runAnimation$2(AnonymousClass5b4 r2, C3025964g r3, Object obj, AnonymousClass4D7 r5, 0sP r6, long j) {
        super(1, r5);
        this.A04 = r2;
        this.A06 = obj;
        this.A05 = r3;
        this.A03 = j;
        this.A07 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [androidx.compose.animation.core.Animatable$runAnimation$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r9) {
        AnonymousClass5b4 r1 = this.A04;
        Object obj = this.A06;
        return new Animatable$runAnimation$2(r1, this.A05, obj, r9, this.A07, this.A03);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((Animatable$runAnimation$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: X.0r1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: X.0r1} */
    /* JADX WARNING: type inference failed for: r12v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            X.1Hj r4 = X.1Hj.A02
            r5 = r23
            int r0 = r5.A00
            r3 = 1
            if (r0 == 0) goto L_0x0012
            java.lang.Object r8 = r5.A02
            X.0r1 r8 = (X.0r1) r8
            java.lang.Object r9 = r5.A01
            X.5b5 r9 = (X.C287955b5) r9
            goto L_0x0083
        L_0x0012:
            X.0eS.A00(r24)
            X.5b4 r2 = r5.A04     // Catch:{ CancellationException -> 0x009b }
            X.5b5 r1 = r2.A04     // Catch:{ CancellationException -> 0x009b }
            X.5an r0 = r2.A07     // Catch:{ CancellationException -> 0x009b }
            X.5am r0 = (X.C287795am) r0     // Catch:{ CancellationException -> 0x009b }
            X.0sP r6 = r0.A01     // Catch:{ CancellationException -> 0x009b }
            java.lang.Object r0 = r5.A06     // Catch:{ CancellationException -> 0x009b }
            java.lang.Object r0 = r6.invoke(r0)     // Catch:{ CancellationException -> 0x009b }
            X.5af r0 = (X.C287725af) r0     // Catch:{ CancellationException -> 0x009b }
            r1.A02 = r0     // Catch:{ CancellationException -> 0x009b }
            X.64g r6 = r5.A05     // Catch:{ CancellationException -> 0x009b }
            java.lang.Object r7 = r6.C4T()     // Catch:{ CancellationException -> 0x009b }
            X.5Oz r0 = r2.A09     // Catch:{ CancellationException -> 0x009b }
            r0.Epw(r7)     // Catch:{ CancellationException -> 0x009b }
            X.5Oz r7 = r2.A08     // Catch:{ CancellationException -> 0x009b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)     // Catch:{ CancellationException -> 0x009b }
            r7.Epw(r0)     // Catch:{ CancellationException -> 0x009b }
            r18 = 0
            r15 = -9223372036854775808
            X.5Oz r0 = r1.A05     // Catch:{ CancellationException -> 0x009b }
            java.lang.Object r12 = r0.getValue()     // Catch:{ CancellationException -> 0x009b }
            X.5af r0 = r1.A02     // Catch:{ CancellationException -> 0x009b }
            X.5af r10 = X.AnonymousClass6GZ.A00(r0)     // Catch:{ CancellationException -> 0x009b }
            long r13 = r1.A01     // Catch:{ CancellationException -> 0x009b }
            boolean r0 = r1.A03     // Catch:{ CancellationException -> 0x009b }
            X.5an r11 = r1.A04     // Catch:{ CancellationException -> 0x009b }
            X.5b5 r9 = new X.5b5     // Catch:{ CancellationException -> 0x009b }
            r17 = r0
            r9.<init>(r10, r11, r12, r13, r15, r17)     // Catch:{ CancellationException -> 0x009b }
            X.0r1 r8 = new X.0r1     // Catch:{ CancellationException -> 0x009b }
            r8.<init>()     // Catch:{ CancellationException -> 0x009b }
            long r0 = r5.A03     // Catch:{ CancellationException -> 0x009b }
            X.0sP r7 = r5.A07     // Catch:{ CancellationException -> 0x009b }
            X.9MQ r17 = new X.9MQ     // Catch:{ CancellationException -> 0x009b }
            r21 = r9
            r22 = r8
            r19 = r7
            r20 = r2
            r17.<init>(r18, r19, r20, r21, r22)     // Catch:{ CancellationException -> 0x009b }
            r5.A01 = r9     // Catch:{ CancellationException -> 0x009b }
            r5.A02 = r8     // Catch:{ CancellationException -> 0x009b }
            r5.A00 = r3     // Catch:{ CancellationException -> 0x009b }
            r11 = r9
            r12 = r5
            r13 = r17
            r14 = r0
            r10 = r6
            java.lang.Object r0 = androidx.compose.animation.core.SuspendAnimationKt.A01(r10, r11, r12, r13, r14)     // Catch:{ CancellationException -> 0x009b }
            if (r0 != r4) goto L_0x0086
            return r4
        L_0x0083:
            X.0eS.A00(r24)     // Catch:{ CancellationException -> 0x009b }
        L_0x0086:
            boolean r0 = r8.A00     // Catch:{ CancellationException -> 0x009b }
            if (r0 == 0) goto L_0x0097
            java.lang.Integer r1 = X.AnonymousClass05K.A00     // Catch:{ CancellationException -> 0x009b }
        L_0x008c:
            X.5b4 r0 = r5.A04     // Catch:{ CancellationException -> 0x009b }
            X.AnonymousClass5b4.A01(r0)     // Catch:{ CancellationException -> 0x009b }
            X.5mK r4 = new X.5mK     // Catch:{ CancellationException -> 0x009b }
            r4.<init>(r9, r1)     // Catch:{ CancellationException -> 0x009b }
            goto L_0x009a
        L_0x0097:
            java.lang.Integer r1 = X.AnonymousClass05K.A01     // Catch:{ CancellationException -> 0x009b }
            goto L_0x008c
        L_0x009a:
            return r4
        L_0x009b:
            r1 = move-exception
            X.5b4 r0 = r5.A04
            X.AnonymousClass5b4.A01(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.Animatable$runAnimation$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
