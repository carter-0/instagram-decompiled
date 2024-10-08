package com.instagram.nux.aymh.viewmodel;

import X.0sL;
import X.AnonymousClass0aP;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C60937Jtv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2", f = "AymhViewModel.kt", i = {}, l = {266, 278, 278}, m = "invokeSuspend", n = {}, s = {})
public final class AymhViewModel$login$2 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ AnonymousClass0aP A03;
    public final /* synthetic */ C60937Jtv A04;
    public final /* synthetic */ AymhViewModel A05;
    public final /* synthetic */ Integer A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AymhViewModel$login$2(AnonymousClass0aP r2, C60937Jtv jtv, AymhViewModel aymhViewModel, Integer num, AnonymousClass4D7 r6, int i, boolean z) {
        super(2, r6);
        this.A05 = aymhViewModel;
        this.A04 = jtv;
        this.A03 = r2;
        this.A07 = z;
        this.A06 = num;
        this.A02 = i;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        AymhViewModel aymhViewModel = this.A05;
        C60937Jtv jtv = this.A04;
        return new AymhViewModel$login$2(this.A03, jtv, aymhViewModel, this.A06, r10, this.A02, this.A07);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0086 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            r7 = r14
            X.1Hj r0 = X.1Hj.A02
            int r3 = r13.A00
            r2 = 3
            r1 = 2
            r5 = 1
            if (r3 == 0) goto L_0x0014
            if (r3 == r5) goto L_0x0049
            if (r3 == r1) goto L_0x006e
            X.0eS.A00(r14)
        L_0x0011:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0014:
            X.0eS.A00(r14)
            com.instagram.nux.aymh.viewmodel.AymhViewModel r3 = r13.A05
            X.FB7 r4 = r3.A03
            X.Jtv r3 = r13.A04
            X.G63 r7 = r4.A00(r3)
            java.lang.Object r9 = r3.A02
            X.0aP r8 = r13.A03
            r12 = 0
            r13.A00 = r5
            X.0wX r3 = r8.getDeviceSession()
            android.content.Context r3 = r3.A06()
            java.lang.String r10 = X.0qv.A00(r3)
            X.0qv r4 = X.0qv.A02
            X.0wX r3 = r8.getDeviceSession()
            android.content.Context r3 = r3.A06()
            java.lang.String r11 = r4.A05(r3)
            java.lang.Object r7 = r7.ClM(r8, r9, r10, r11, r12, r13)
            if (r7 != r0) goto L_0x004c
            return r0
        L_0x0049:
            X.0eS.A00(r14)
        L_0x004c:
            X.3Ii r7 = (X.C239803Ii) r7
            com.instagram.nux.aymh.viewmodel.AymhViewModel r4 = r13.A05
            X.Jtv r6 = r13.A04
            X.0aP r5 = r13.A03
            r11 = 0
            boolean r12 = r13.A07
            java.lang.Integer r8 = r13.A06
            int r9 = r13.A02
            r10 = 3584(0xe00, float:5.022E-42)
            com.instagram.nux.aymh.responsehandlers.HandlerExecutorAndBuilder r3 = X.C49029Eo5.A00(r5, r6, r7, r8, r9, r10, r11, r12)
            X.3ju r4 = r4.A0B
            r13.A01 = r4
            r13.A00 = r1
            java.lang.Object r7 = r3.A01(r13)
            if (r7 != r0) goto L_0x0075
            return r0
        L_0x006e:
            java.lang.Object r4 = r13.A01
            X.3jv r4 = (X.C249523jv) r4
            X.0eS.A00(r14)
        L_0x0075:
            X.FEy r7 = (X.C49923FEy) r7
            java.lang.Object r3 = r7.A02()
            r1 = 0
            r13.A01 = r1
            r13.A00 = r2
            java.lang.Object r1 = r4.ELH(r3, r13)
            if (r1 != r0) goto L_0x0011
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.nux.aymh.viewmodel.AymhViewModel$login$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AymhViewModel$login$2) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
