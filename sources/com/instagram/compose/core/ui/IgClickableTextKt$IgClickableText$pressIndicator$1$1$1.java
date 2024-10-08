package com.instagram.compose.core.ui;

import X.0sL;
import X.0sP;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C267894cP;
import X.C284945Oz;
import X.C286025Tq;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.compose.core.ui.IgClickableTextKt$IgClickableText$pressIndicator$1$1$1", f = "IgClickableText.kt", i = {0, 1, 1, 1, 2}, l = {70, 96, 102}, m = "invokeSuspend", n = {"$this$awaitEachGesture", "$this$awaitEachGesture", "down", "upOrCancel", "upOrCancel"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0"})
public final class IgClickableTextKt$IgClickableText$pressIndicator$1$1$1 extends C267894cP implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ C284945Oz A05;
    public final /* synthetic */ C286025Tq A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgClickableTextKt$IgClickableText$pressIndicator$1$1$1(C284945Oz r2, C286025Tq r3, AnonymousClass4D7 r4, 0sP r5, 0sP r6, boolean z) {
        super(2, r4);
        this.A09 = z;
        this.A05 = r2;
        this.A08 = r5;
        this.A06 = r3;
        this.A07 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.compose.core.ui.IgClickableTextKt$IgClickableText$pressIndicator$1$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        boolean z = this.A09;
        AnonymousClass4D7 r3 = r9;
        ? igClickableTextKt$IgClickableText$pressIndicator$1$1$1 = new IgClickableTextKt$IgClickableText$pressIndicator$1$1$1(this.A05, this.A06, r3, this.A08, this.A07, z);
        igClickableTextKt$IgClickableText$pressIndicator$1$1$1.A04 = obj;
        return igClickableTextKt$IgClickableText$pressIndicator$1$1$1;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.compose.core.ui.IgClickableTextKt$IgClickableText$pressIndicator$1$1$1, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a3, code lost:
        if (r0 == false) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d5 A[Catch:{ TSe -> 0x00e9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00e4 A[Catch:{ TSe -> 0x00eb }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1Hj r6 = X.1Hj.A02
            int r0 = r10.A00
            r7 = 3
            r3 = 2
            r5 = 0
            r2 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 == r2) goto L_0x0062
            if (r0 == r3) goto L_0x003c
            java.lang.Object r2 = r10.A04
            X.0rm r2 = (X.0rm) r2
            X.0eS.A00(r11)
        L_0x0015:
            java.lang.Object r0 = r2.A00
            if (r0 == 0) goto L_0x0039
            X.5Oz r0 = r10.A05
            java.lang.Object r4 = r0.getValue()
            X.62f r4 = (X.C3022462f) r4
            if (r4 == 0) goto L_0x0039
            X.0sP r3 = r10.A07
            java.lang.Object r0 = r2.A00
            X.GPU r0 = (X.GPU) r0
            long r1 = r0.A06
            X.62d r0 = r4.A03
            int r1 = r0.A08(r1)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r3.invoke(r0)
        L_0x0039:
            X.0gF r6 = X.C60340gF.A00
        L_0x003b:
            return r6
        L_0x003c:
            java.lang.Object r8 = r10.A03
            X.0rm r8 = (X.0rm) r8
            java.lang.Object r2 = r10.A02
            X.0rm r2 = (X.0rm) r2
            java.lang.Object r1 = r10.A01
            X.GPU r1 = (X.GPU) r1
            java.lang.Object r4 = r10.A04
            X.6GK r4 = (X.AnonymousClass6GK) r4
            goto L_0x00d9
        L_0x004e:
            X.0eS.A00(r11)
            java.lang.Object r4 = r10.A04
            X.6GK r4 = (X.AnonymousClass6GK) r4
            r10.A04 = r4
            r10.A00 = r2
            X.GWN r0 = X.GWN.Main
            java.lang.Object r11 = androidx.compose.foundation.gestures.TapGestureDetectorKt.A01(r4, r0, r10, r2)
            if (r11 != r6) goto L_0x0068
            return r6
        L_0x0062:
            java.lang.Object r0 = r10.A04
            X.6GK r4 = X.C51965G9l.A0O(r0, r11)
        L_0x0068:
            X.GPU r11 = (X.GPU) r11
            boolean r0 = r10.A09
            if (r0 == 0) goto L_0x00a6
            X.5Oz r0 = r10.A05
            java.lang.Object r9 = r0.getValue()
            X.62f r9 = (X.C3022462f) r9
            r0 = 0
            if (r9 == 0) goto L_0x00a3
            X.5Tq r8 = r10.A06
            long r0 = r11.A06
            X.62d r9 = r9.A03
            int r1 = r9.A08(r0)
            java.util.List r0 = r8.A03(r1, r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x00a2
            java.util.List r0 = r8.A05(r1, r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x00a2
            java.util.List r0 = r8.A04(r1, r1)
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
            if (r0 != 0) goto L_0x00a2
            r2 = 0
        L_0x00a2:
            r0 = r2
        L_0x00a3:
            if (r0 != 0) goto L_0x00a6
            goto L_0x0039
        L_0x00a6:
            r11.A01()
            X.0sP r0 = r10.A08
            if (r0 == 0) goto L_0x00ba
            X.5RG r0 = r4.CEf()
            long r0 = r0.BOW()
        L_0x00b5:
            X.0rm r8 = X.C51965G9l.A11()
            goto L_0x00c0
        L_0x00ba:
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            goto L_0x00b5
        L_0x00c0:
            X.IlA r2 = new X.IlA     // Catch:{ TSe -> 0x00e9 }
            r2.<init>(r3, r5)     // Catch:{ TSe -> 0x00e9 }
            r10.A04 = r4     // Catch:{ TSe -> 0x00e9 }
            r10.A01 = r11     // Catch:{ TSe -> 0x00e9 }
            r10.A02 = r8     // Catch:{ TSe -> 0x00e9 }
            r10.A03 = r8     // Catch:{ TSe -> 0x00e9 }
            r10.A00 = r3     // Catch:{ TSe -> 0x00e9 }
            java.lang.Object r0 = r4.FNY(r10, r2, r0)     // Catch:{ TSe -> 0x00e9 }
            if (r0 == r6) goto L_0x003b
            r1 = r11
            r11 = r0
            r2 = r8
            goto L_0x00dc
        L_0x00d9:
            X.0eS.A00(r11)     // Catch:{ TSe -> 0x00eb }
        L_0x00dc:
            r8.A00 = r11     // Catch:{ TSe -> 0x00eb }
            java.lang.Object r0 = r2.A00     // Catch:{ TSe -> 0x00eb }
            X.GPU r0 = (X.GPU) r0     // Catch:{ TSe -> 0x00eb }
            if (r0 == 0) goto L_0x0015
            r0.A01()     // Catch:{ TSe -> 0x00eb }
            goto L_0x0015
        L_0x00e9:
            r1 = r11
            goto L_0x00ec
        L_0x00eb:
            r8 = r2
        L_0x00ec:
            X.5Oz r0 = r10.A05
            java.lang.Object r0 = r0.getValue()
            X.62f r0 = (X.C3022462f) r0
            if (r0 == 0) goto L_0x010a
            X.0sP r3 = r10.A08
            if (r3 == 0) goto L_0x010a
            long r1 = r1.A06
            X.62d r0 = r0.A03
            int r1 = r0.A08(r1)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r1)
            r3.invoke(r0)
        L_0x010a:
            r10.A04 = r8
            r10.A01 = r5
            r10.A02 = r5
            r10.A03 = r5
            r10.A00 = r7
            java.lang.Object r0 = com.instagram.compose.core.ui.IgClickableTextKt.A00(r4, r10)
            if (r0 == r6) goto L_0x003b
            r2 = r8
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.compose.core.ui.IgClickableTextKt$IgClickableText$pressIndicator$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgClickableTextKt$IgClickableText$pressIndicator$1$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
