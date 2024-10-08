package com.instagram.video.live.mvvm.viewmodel.ufi;

import X.0sG;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C62415KfQ;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.ufi.IgLiveViewerUfiViewModel$viewState$1", f = "IgLiveViewerUfiViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveViewerUfiViewModel$viewState$1 extends AnonymousClass1Ek implements 0sG {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;
    public /* synthetic */ boolean A05;
    public final /* synthetic */ C62415KfQ A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveViewerUfiViewModel$viewState$1(C62415KfQ kfQ, AnonymousClass4D7 r3) {
        super(7, r3);
        this.A06 = kfQ;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj6);
        IgLiveViewerUfiViewModel$viewState$1 igLiveViewerUfiViewModel$viewState$1 = new IgLiveViewerUfiViewModel$viewState$1(this.A06, (AnonymousClass4D7) obj7);
        igLiveViewerUfiViewModel$viewState$1.A04 = A1a;
        igLiveViewerUfiViewModel$viewState$1.A00 = obj2;
        igLiveViewerUfiViewModel$viewState$1.A01 = obj3;
        igLiveViewerUfiViewModel$viewState$1.A02 = obj4;
        igLiveViewerUfiViewModel$viewState$1.A03 = obj5;
        igLiveViewerUfiViewModel$viewState$1.A05 = A1a2;
        return igLiveViewerUfiViewModel$viewState$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0063, code lost:
        if (r5 == X.AnonymousClass3NV.A05) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r4.A08 == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            r24 = this;
            X.0eS.A00(r25)
            r0 = r24
            boolean r11 = r0.A04
            java.lang.Object r7 = r0.A00
            X.Juh r7 = (X.C60985Juh) r7
            java.lang.Object r10 = r0.A01
            X.9I5 r10 = (X.AnonymousClass9I5) r10
            java.lang.Object r9 = r0.A02
            java.lang.Object r8 = r0.A03
            X.JvD r8 = (X.C61013JvD) r8
            boolean r1 = r0.A05
            X.KfQ r4 = r0.A06
            java.util.List r3 = r4.A04
            r3.clear()
            X.KhJ r6 = X.C62527KhJ.HEART
            r3.add(r6)
            X.KhJ r2 = X.C62527KhJ.SHARE
            r3.add(r2)
            r5 = 1
            if (r9 != 0) goto L_0x00c0
            if (r8 == 0) goto L_0x0037
            boolean r0 = r8.A0M
            if (r0 != r5) goto L_0x0037
        L_0x0031:
            if (r7 == 0) goto L_0x00b9
            boolean r0 = r7.A0B
            if (r0 != r5) goto L_0x00b9
        L_0x0037:
            boolean r0 = r10.A01
            if (r0 == 0) goto L_0x0040
            X.KhJ r0 = X.C62527KhJ.QA
            r3.add(r0)
        L_0x0040:
            if (r7 == 0) goto L_0x004b
            boolean r0 = r7.A0F
            if (r0 != r5) goto L_0x004b
            X.KhJ r0 = X.C62527KhJ.ROOMS
            r3.add(r0)
        L_0x004b:
            boolean r0 = r4.A07
            if (r0 != 0) goto L_0x0054
            X.KhJ r0 = X.C62527KhJ.OPTIONS
            r3.add(r0)
        L_0x0054:
            r5 = 0
            if (r8 == 0) goto L_0x00b7
            X.3NV r7 = r8.A06
        L_0x0059:
            X.3NV r0 = X.AnonymousClass3NV.A04
            if (r7 == r0) goto L_0x0065
            if (r8 == 0) goto L_0x0061
            X.3NV r5 = r8.A06
        L_0x0061:
            X.3NV r0 = X.AnonymousClass3NV.A05
            if (r5 != r0) goto L_0x0068
        L_0x0065:
            r3.remove(r2)
        L_0x0068:
            int r0 = r3.size()
            r5 = 4
            if (r0 > r5) goto L_0x0072
            r4.A01()
        L_0x0072:
            X.KhJ r0 = X.C62527KhJ.BADGES
            boolean r12 = r4.isButtonVisible(r0, r3, r11)
            int r0 = r3.size()
            boolean r13 = X.C51970G9q.A1W(r0, r5)
            boolean r14 = r4.isButtonVisible(r6, r3, r11)
            X.KhJ r0 = X.C62527KhJ.OPTIONS
            boolean r16 = r4.isButtonVisible(r0, r3, r11)
            X.KhJ r0 = X.C62527KhJ.QA
            boolean r0 = r4.isButtonVisible(r0, r3, r11)
            if (r0 == 0) goto L_0x0098
            boolean r0 = r4.A08
            r17 = 1
            if (r0 != 0) goto L_0x009a
        L_0x0098:
            r17 = 0
        L_0x009a:
            X.KhJ r0 = X.C62527KhJ.ROOMS
            boolean r18 = r4.isButtonVisible(r0, r3, r11)
            boolean r19 = r4.isButtonVisible(r2, r3, r11)
            r10 = 0
            java.lang.String r8 = ""
            X.JvC r7 = new X.JvC
            r9 = r8
            r15 = r10
            r20 = r10
            r21 = r10
            r22 = r10
            r23 = r1
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r7
        L_0x00b7:
            r7 = r5
            goto L_0x0059
        L_0x00b9:
            X.KhJ r0 = X.C62527KhJ.BADGES
            r3.add(r0)
            goto L_0x0037
        L_0x00c0:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r5)
            boolean r0 = r9.equals(r0)
            if (r0 == 0) goto L_0x0037
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.ufi.IgLiveViewerUfiViewModel$viewState$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
