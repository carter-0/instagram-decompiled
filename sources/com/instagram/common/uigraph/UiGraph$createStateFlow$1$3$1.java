package com.instagram.common.uigraph;

import X.0sK;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.common.uigraph.UiGraph$createStateFlow$1$3$1", f = "UiGraph.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class UiGraph$createStateFlow$1$3$1 extends AnonymousClass1Ek implements 0sK {
    public /* synthetic */ int A00;
    public /* synthetic */ Object A01;
    public final /* synthetic */ UiGraph A02;
    public final /* synthetic */ String A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UiGraph$createStateFlow$1$3$1(UiGraph uiGraph, String str, AnonymousClass4D7 r4) {
        super(3, r4);
        this.A02 = uiGraph;
        this.A03 = str;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int A0M = AnonymousClass7TE.A0M(obj2);
        UiGraph$createStateFlow$1$3$1 uiGraph$createStateFlow$1$3$1 = new UiGraph$createStateFlow$1$3$1(this.A02, this.A03, (AnonymousClass4D7) obj3);
        uiGraph$createStateFlow$1$3$1.A01 = obj;
        uiGraph$createStateFlow$1$3$1.A00 = A0M;
        return uiGraph$createStateFlow$1$3$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r4 == Integer.MAX_VALUE) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.0eS.A00(r11)
            java.lang.Object r2 = r10.A01
            X.9IV r2 = (X.AnonymousClass9IV) r2
            int r7 = r10.A00
            com.instagram.common.uigraph.UiGraph r0 = r10.A02
            java.lang.String r6 = r10.A03
            java.util.Map r3 = r0.A04
            monitor-enter(r3)
            java.util.Collection r0 = r3.values()     // Catch:{ all -> 0x00a6 }
            r5 = 0
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x00a6 }
        L_0x0019:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x00a6 }
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x00a6 }
            X.3Vc r0 = (X.C242593Vc) r0     // Catch:{ all -> 0x00a6 }
            X.0Ud r0 = r0.A08     // Catch:{ all -> 0x00a6 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00a6 }
            int r0 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ all -> 0x00a6 }
            int r5 = r5 + r0
            goto L_0x0019
        L_0x0031:
            monitor-exit(r3)
            r9 = 0
            X.AnonymousClass7TF.A1H(r2, r6)
            java.lang.Object r1 = r2.A00
            java.util.Set r1 = (java.util.Set) r1
            boolean r0 = r1.isEmpty()
            r8 = 2147483647(0x7fffffff, float:NaN)
            if (r0 == 0) goto L_0x0078
            java.lang.Object r0 = r2.A01
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0075
            java.lang.Object r1 = r0.get()
            X.3Vh r1 = (X.C242643Vh) r1
            if (r1 == 0) goto L_0x0075
            boolean r0 = r1 instanceof X.C242733Vs
            if (r0 == 0) goto L_0x0075
            X.3Vs r1 = (X.C242733Vs) r1
            if (r1 == 0) goto L_0x0075
            int r4 = r1.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            if (r0 == 0) goto L_0x0075
            r3 = r4
        L_0x0062:
            if (r4 != r8) goto L_0x0065
        L_0x0064:
            r4 = 0
        L_0x0065:
            int r0 = java.lang.Math.max(r3, r9)
            X.N3x r2 = new X.N3x
            r2.<init>(r6, r7, r4, r0)
            r1 = 5
            X.JwA r0 = new X.JwA
            r0.<init>((int) r5, (int) r1, (java.lang.Object) r2)
            return r0
        L_0x0075:
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x0064
        L_0x0078:
            java.util.Iterator r2 = r1.iterator()
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 2147483647(0x7fffffff, float:NaN)
        L_0x0081:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0062
            java.lang.Object r1 = r2.next()
            X.3Vh r1 = (X.C242643Vh) r1
            boolean r0 = r1 instanceof X.C242733Vs
            if (r0 == 0) goto L_0x0081
            X.3Vs r1 = (X.C242733Vs) r1
            if (r1 == 0) goto L_0x0081
            int r1 = r1.A06
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            if (r0 == 0) goto L_0x0081
            int r4 = java.lang.Math.min(r4, r1)
            int r3 = java.lang.Math.max(r3, r1)
            goto L_0x0081
        L_0x00a6:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.uigraph.UiGraph$createStateFlow$1$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
