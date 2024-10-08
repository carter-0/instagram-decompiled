package com.airbnb.lottie.compose;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C284945Oz;
import X.C56867IFo;
import X.C60340gF;
import X.S7N;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3", f = "animateLottieCompositionAsState.kt", i = {}, l = {73, 78}, m = "invokeSuspend", n = {}, s = {})
public final class AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C284945Oz A03;
    public final /* synthetic */ S7N A04;
    public final /* synthetic */ C56867IFo A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(C284945Oz r2, S7N s7n, C56867IFo iFo, Integer num, AnonymousClass4D7 r6, float f, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        super(2, r6);
        this.A07 = z;
        this.A08 = z2;
        this.A05 = iFo;
        this.A04 = s7n;
        this.A02 = i;
        this.A09 = z3;
        this.A01 = f;
        this.A06 = num;
        this.A0A = z4;
        this.A03 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        boolean z = this.A07;
        boolean z2 = this.A08;
        C56867IFo iFo = this.A05;
        S7N s7n = this.A04;
        int i = this.A02;
        boolean z3 = this.A09;
        float f = this.A01;
        return new AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3(this.A03, s7n, iFo, this.A06, r14, f, i, z, z2, z3, this.A0A);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.4D7, com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3] */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0040, code lost:
        if (r6 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0075, code lost:
        if (r6 == null) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0077, code lost:
        r10 = 0.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007b, code lost:
        if (r5 >= 0.0f) goto L_0x0077;
     */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x008a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            X.1Hj r1 = X.1Hj.A02
            int r3 = r15.A00
            r2 = 2
            r11 = 1
            if (r3 == 0) goto L_0x0010
            if (r3 == r11) goto L_0x007e
            X.0eS.A00(r16)
        L_0x000d:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0010:
            X.0eS.A00(r16)
            boolean r3 = r15.A07
            if (r3 == 0) goto L_0x0081
            X.5Oz r3 = r15.A03
            boolean r3 = X.C51971G9r.A1W(r3)
            if (r3 != 0) goto L_0x0081
            boolean r3 = r15.A08
            if (r3 == 0) goto L_0x0081
            X.IFo r8 = r15.A05
            r15.A00 = r11
            X.5Oz r7 = r8.A02
            java.lang.Object r6 = r7.getValue()
            X.5Oz r3 = r8.A01
            r3.getValue()
            r9 = 0
            X.5Oz r3 = r8.A0A
            float r5 = X.C51971G9r.A02(r3)
            r10 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0075
            if (r6 != 0) goto L_0x0079
        L_0x0042:
            java.lang.Object r7 = r7.getValue()
            X.S7N r7 = (X.S7N) r7
            X.5Oz r3 = r8.A07
            float r3 = X.C51971G9r.A02(r3)
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            boolean r3 = X.AnonymousClass7TF.A1Q(r3)
            r12 = r3 ^ 1
            X.6H2 r5 = r8.A00
            com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2 r6 = new com.airbnb.lottie.compose.LottieAnimatableImpl$snapTo$2
            r6.<init>(r7, r8, r9, r10, r11, r12)
            X.HKs r4 = X.C54609HKs.A01
            r8 = 0
            X.JVZ r3 = new X.JVZ
            r7 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r3 = X.19E.A00(r15, r3)
            if (r3 == r1) goto L_0x006e
            X.0gF r3 = X.C60340gF.A00
        L_0x006e:
            if (r3 == r1) goto L_0x0072
            X.0gF r3 = X.C60340gF.A00
        L_0x0072:
            if (r3 != r1) goto L_0x0081
            return r1
        L_0x0075:
            if (r6 != 0) goto L_0x0079
        L_0x0077:
            r10 = 0
            goto L_0x0042
        L_0x0079:
            int r3 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r3 >= 0) goto L_0x0077
            goto L_0x0042
        L_0x007e:
            X.0eS.A00(r16)
        L_0x0081:
            X.5Oz r4 = r15.A03
            boolean r3 = r15.A07
            X.C51967G9n.A16(r4, r3)
            if (r3 == 0) goto L_0x000d
            X.IFo r5 = r15.A05
            X.S7N r4 = r15.A04
            int r11 = r15.A02
            boolean r12 = r15.A09
            float r8 = r15.A01
            X.5Oz r3 = r5.A07
            float r9 = X.C51971G9r.A02(r3)
            java.lang.Integer r6 = r15.A06
            boolean r13 = r15.A0A
            r7 = 0
            r15.A00 = r2
            X.5Oz r2 = r5.A04
            int r10 = X.C51971G9r.A0B(r2)
            r14 = 0
            X.6H2 r2 = r5.A00
            com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2 r3 = new com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            X.HKs r9 = X.C54609HKs.A01
            X.JVZ r8 = new X.JVZ
            r10 = r2
            r11 = r3
            r12 = r7
            r13 = r14
            r8.<init>(r9, r10, r11, r12, r13)
            java.lang.Object r0 = X.19E.A00(r15, r8)
            if (r0 == r1) goto L_0x00c2
            X.0gF r0 = X.C60340gF.A00
        L_0x00c2:
            if (r0 != r1) goto L_0x000d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.compose.AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnimateLottieCompositionAsStateKt$animateLottieCompositionAsState$3) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
