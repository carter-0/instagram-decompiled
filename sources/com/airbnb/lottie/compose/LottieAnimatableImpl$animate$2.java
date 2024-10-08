package com.airbnb.lottie.compose;

import X.0eS;
import X.0sP;
import X.19B;
import X.1Eo;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass5H8;
import X.AnonymousClass7TE;
import X.C284945Oz;
import X.C51967G9n;
import X.C51971G9r;
import X.C56867IFo;
import X.C60340gF;
import X.C64871Wv;
import X.C66175MGm;
import X.MDE;
import X.S7N;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2", f = "LottieAnimatable.kt", i = {}, l = {269}, m = "invokeSuspend", n = {}, s = {})
public final class LottieAnimatableImpl$animate$2 extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final /* synthetic */ float A01;
    public final /* synthetic */ float A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ S7N A05;
    public final /* synthetic */ C56867IFo A06;
    public final /* synthetic */ Integer A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LottieAnimatableImpl$animate$2(S7N s7n, C56867IFo iFo, Integer num, AnonymousClass4D7 r5, float f, float f2, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(1, r5);
        this.A06 = iFo;
        this.A03 = i;
        this.A04 = i2;
        this.A09 = z;
        this.A02 = f;
        this.A05 = s7n;
        this.A01 = f2;
        this.A0A = z2;
        this.A08 = z3;
        this.A07 = num;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r13) {
        C56867IFo iFo = this.A06;
        int i = this.A03;
        int i2 = this.A04;
        boolean z = this.A09;
        float f = this.A02;
        return new LottieAnimatableImpl$animate$2(this.A05, iFo, this.A07, r13, f, this.A01, i, i2, z, this.A0A, this.A08);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((LottieAnimatableImpl$animate$2) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.airbnb.lottie.compose.LottieAnimatableImpl$animate$2, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        C56867IFo iFo;
        19B r1;
        Object obj2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
            C64871Wv.A02(getContext());
            iFo = this.A06;
            C51967G9n.A16(iFo.A03, false);
        } else {
            0eS.A00(obj);
            iFo = this.A06;
            int i = this.A03;
            C284945Oz r6 = iFo.A04;
            C51967G9n.A15(r6, i);
            int i2 = this.A04;
            C284945Oz r0 = iFo.A05;
            Integer valueOf = Integer.valueOf(i2);
            r0.Epw(valueOf);
            C51967G9n.A16(iFo.A09, this.A09);
            float f = this.A02;
            C51967G9n.A14(iFo.A0A, f);
            iFo.A01.Epw((Object) null);
            S7N s7n = this.A05;
            iFo.A02.Epw(s7n);
            C56867IFo.A00(iFo, this.A01);
            C51967G9n.A16(iFo.A0B, this.A0A);
            if (!this.A08) {
                iFo.A06.Epw(Long.MIN_VALUE);
            }
            if (s7n != null) {
                if (Float.isInfinite(f)) {
                    C56867IFo.A00(iFo, C51971G9r.A03(iFo.A0C));
                    C51967G9n.A16(iFo.A03, false);
                    r6.Epw(valueOf);
                } else {
                    C51967G9n.A16(iFo.A03, true);
                    try {
                        Integer num = this.A07;
                        int intValue = num.intValue();
                        if (intValue == 1) {
                            r1 = MDE.A00;
                        } else if (intValue == 0) {
                            r1 = 19B.A00;
                        } else {
                            throw AnonymousClass7TE.A1K();
                        }
                        C66175MGm mGm = new C66175MGm((Object) AnonymousClass5H8.A00(getContext()), (Object) iFo, (Object) num, (AnonymousClass4D7) null, i2, i, 0);
                        this.A00 = 1;
                        if (1Eo.A00(this, r1, mGm) == obj2) {
                            return obj2;
                        }
                        C64871Wv.A02(getContext());
                        iFo = this.A06;
                    } catch (Throwable th) {
                        C51967G9n.A16(this.A06.A03, false);
                        throw th;
                    }
                }
            }
            C51967G9n.A16(iFo.A03, false);
        }
        return C60340gF.A00;
    }
}
