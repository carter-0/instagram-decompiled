package com.instagram.direct.fragment.thread.infra.open;

import X.05G;
import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass2Ep;
import X.AnonymousClass4D7;
import X.AnonymousClass7LZ;
import X.C329967Kx;
import X.C333427Yx;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.fragment.thread.infra.open.DirectThreadHeaderRepository$updateViewModel$1", f = "DirectThreadHeaderRepository.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class DirectThreadHeaderRepository$updateViewModel$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ C333427Yx A00;
    public final /* synthetic */ C329967Kx A01;
    public final /* synthetic */ AnonymousClass2Ep A02;
    public final /* synthetic */ boolean A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DirectThreadHeaderRepository$updateViewModel$1(C333427Yx r2, C329967Kx r3, AnonymousClass2Ep r4, AnonymousClass4D7 r5, boolean z) {
        super(2, r5);
        this.A00 = r2;
        this.A03 = z;
        this.A02 = r4;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.fragment.thread.infra.open.DirectThreadHeaderRepository$updateViewModel$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        C333427Yx r1 = this.A00;
        boolean z = this.A03;
        return new DirectThreadHeaderRepository$updateViewModel$1(r1, this.A01, this.A02, r8, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DirectThreadHeaderRepository$updateViewModel$1) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        AnonymousClass7LZ A002;
        0eS.A00(obj);
        C333427Yx r3 = this.A00;
        05G r2 = r3.A0C;
        if (this.A03) {
            A002 = r3.A00;
        } else {
            A002 = C333427Yx.A00(r3, this.A01, this.A02);
        }
        r2.Epw(A002);
        return C60340gF.A00;
    }
}
