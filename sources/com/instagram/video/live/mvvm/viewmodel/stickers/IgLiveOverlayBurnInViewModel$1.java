package com.instagram.video.live.mvvm.viewmodel.stickers;

import X.0rm;
import X.0sH;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60210JhT;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.stickers.IgLiveOverlayBurnInViewModel$1", f = "IgLiveOverlayBurnInViewModel.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveOverlayBurnInViewModel$1 extends AnonymousClass1Ek implements 0sH {
    public int A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;
    public /* synthetic */ boolean A05;
    public final /* synthetic */ C60210JhT A06;
    public final /* synthetic */ 0rm A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveOverlayBurnInViewModel$1(C60210JhT jhT, AnonymousClass4D7 r3, 0rm r4) {
        super(6, r3);
        this.A06 = jhT;
        this.A07 = r4;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [com.instagram.video.live.mvvm.viewmodel.stickers.IgLiveOverlayBurnInViewModel$1, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0025, code lost:
        if (r10.A06.A07 == false) goto L_0x0027;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1Hj r6 = X.1Hj.A02
            int r0 = r10.A00
            r7 = 1
            if (r0 == 0) goto L_0x000d
            X.0eS.A00(r11)
        L_0x000a:
            X.0gF r6 = X.C60340gF.A00
            return r6
        L_0x000d:
            X.0eS.A00(r11)
            boolean r2 = r10.A01
            boolean r9 = r10.A02
            boolean r8 = r10.A03
            boolean r1 = r10.A04
            boolean r0 = r10.A05
            if (r2 != 0) goto L_0x001e
            if (r1 == 0) goto L_0x0027
        L_0x001e:
            if (r0 != 0) goto L_0x0027
            X.JhT r0 = r10.A06
            boolean r0 = r0.A07
            r3 = 1
            if (r0 != 0) goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            X.JhT r5 = r10.A06
            X.05G r2 = r5.A05
            r1 = 18
            X.JTb r0 = new X.JTb
            r0.<init>(r3, r1)
            r2.Epw(r0)
            r4 = 0
            if (r3 == 0) goto L_0x0059
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0041
            if (r9 != 0) goto L_0x0041
            if (r8 == 0) goto L_0x0059
        L_0x0041:
            X.0rm r3 = r10.A07
            java.lang.Object r0 = r3.A00
            if (r0 != 0) goto L_0x000a
            X.6oS r2 = X.C318116oQ.A00(r5)
            r1 = 10
            X.MG2 r0 = new X.MG2
            r0.<init>(r5, r4, r1)
            X.1Er r0 = X.C51966G9m.A1L(r0, r2)
            r3.A00 = r0
            goto L_0x000a
        L_0x0059:
            X.0rm r1 = r10.A07
            java.lang.Object r0 = r1.A00
            X.4Co r0 = (X.C262204Co) r0
            if (r0 == 0) goto L_0x0064
            r0.AG7(r4)
        L_0x0064:
            r1.A00 = r4
            X.3ju r4 = r5.A03
            android.graphics.Bitmap$Config r3 = r5.A02
            double r1 = r5.A00
            X.KfG r0 = new X.KfG
            r0.<init>(r3, r1)
            r10.A00 = r7
            java.lang.Object r0 = r4.ELH(r0, r10)
            if (r0 != r6) goto L_0x000a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.stickers.IgLiveOverlayBurnInViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        boolean A1a3 = AnonymousClass7TE.A1a(obj3);
        boolean A1a4 = AnonymousClass7TE.A1a(obj4);
        boolean A1a5 = AnonymousClass7TE.A1a(obj5);
        IgLiveOverlayBurnInViewModel$1 igLiveOverlayBurnInViewModel$1 = new IgLiveOverlayBurnInViewModel$1(this.A06, (AnonymousClass4D7) obj6, this.A07);
        igLiveOverlayBurnInViewModel$1.A01 = A1a;
        igLiveOverlayBurnInViewModel$1.A02 = A1a2;
        igLiveOverlayBurnInViewModel$1.A03 = A1a3;
        igLiveOverlayBurnInViewModel$1.A04 = A1a4;
        igLiveOverlayBurnInViewModel$1.A05 = A1a5;
        return igLiveOverlayBurnInViewModel$1.invokeSuspend(C60340gF.A00);
    }
}
