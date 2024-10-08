package com.instagram.wellbeing.limitsplus.viewmodel;

import X.0eS;
import X.0sL;
import X.1Hj;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60145JgQ;
import X.C60340gF;
import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.limitsplus.viewmodel.LimitsPlusViewModel$savePreviouslyFetchedData$1", f = "LimitsPlusViewModel.kt", i = {}, l = {44}, m = "invokeSuspend", n = {}, s = {})
public final class LimitsPlusViewModel$savePreviouslyFetchedData$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ C60145JgQ A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;
    public final /* synthetic */ boolean A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LimitsPlusViewModel$savePreviouslyFetchedData$1(C60145JgQ jgQ, AnonymousClass4D7 r3, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(2, r3);
        this.A03 = jgQ;
        this.A05 = z;
        this.A09 = z2;
        this.A07 = z3;
        this.A08 = z4;
        this.A01 = j;
        this.A02 = j2;
        this.A0A = z5;
        this.A06 = z6;
        this.A04 = z7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.wellbeing.limitsplus.viewmodel.LimitsPlusViewModel$savePreviouslyFetchedData$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r16) {
        return new LimitsPlusViewModel$savePreviouslyFetchedData$1(this.A03, r16, this.A01, this.A02, this.A05, this.A09, this.A07, this.A08, this.A0A, this.A06, this.A04);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.wellbeing.limitsplus.viewmodel.LimitsPlusViewModel$savePreviouslyFetchedData$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            LimitsPlusRepository limitsPlusRepository = this.A03.A02;
            boolean z = this.A05;
            boolean z2 = this.A09;
            boolean z3 = this.A07;
            boolean z4 = this.A08;
            long j = this.A01;
            long j2 = this.A02;
            boolean z5 = this.A0A;
            boolean z6 = this.A06;
            boolean z7 = this.A04;
            this.A00 = 1;
            if (limitsPlusRepository.A04(this, j, j2, z, z2, z3, z4, z5, z6, z7) == obj2) {
                return obj2;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((LimitsPlusViewModel$savePreviouslyFetchedData$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
