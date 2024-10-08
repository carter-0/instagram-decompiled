package com.instagram.barcelonaig.fragment;

import X.0sL;
import X.2EG;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C52955Gg8;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelonaig.fragment.BarcelonaIgViewModel$handleWebLinkClick$1", f = "BarcelonaIgViewModel.kt", i = {}, l = {35}, m = "invokeSuspend", n = {}, s = {})
public final class BarcelonaIgViewModel$handleWebLinkClick$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C52955Gg8 A02;
    public final /* synthetic */ 2EG A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BarcelonaIgViewModel$handleWebLinkClick$1(C52955Gg8 gg8, 2EG r3, String str, String str2, String str3, AnonymousClass4D7 r7, long j) {
        super(2, r7);
        this.A02 = gg8;
        this.A06 = str;
        this.A05 = str2;
        this.A03 = r3;
        this.A01 = j;
        this.A04 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.barcelonaig.fragment.BarcelonaIgViewModel$handleWebLinkClick$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        C52955Gg8 gg8 = this.A02;
        String str = this.A06;
        String str2 = this.A05;
        return new BarcelonaIgViewModel$handleWebLinkClick$1(gg8, this.A03, str, str2, this.A04, r11, this.A01);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1Hj r2 = X.1Hj.A02
            r9 = r12
            int r0 = r12.A00
            r1 = 1
            if (r0 == 0) goto L_0x000e
            X.0eS.A00(r13)
        L_0x000b:
            X.0gF r2 = X.C60340gF.A00
            return r2
        L_0x000e:
            X.0eS.A00(r13)
            X.Gg8 r0 = r12.A02
            com.instagram.barcelona.weblink.WebLinkUseCase r3 = r0.A00
            android.app.Application r0 = r0.A0D()
            android.content.Context r4 = X.DbT.A05(r0)
            java.lang.String r6 = r12.A06
            java.lang.String r7 = r12.A05
            X.2EG r5 = r12.A03
            long r10 = r12.A01
            java.lang.String r8 = r12.A04
            r12.A00 = r1
            java.lang.Object r0 = r3.A00(r4, r5, r6, r7, r8, r9, r10)
            if (r0 != r2) goto L_0x000b
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.barcelonaig.fragment.BarcelonaIgViewModel$handleWebLinkClick$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((BarcelonaIgViewModel$handleWebLinkClick$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
