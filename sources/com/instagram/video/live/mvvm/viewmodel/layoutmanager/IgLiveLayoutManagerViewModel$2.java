package com.instagram.video.live.mvvm.viewmodel.layoutmanager;

import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60279Jia;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.layoutmanager.IgLiveLayoutManagerViewModel$2", f = "IgLiveLayoutManagerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveLayoutManagerViewModel$2 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ float A00;
    public /* synthetic */ float A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C60279Jia A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveLayoutManagerViewModel$2(C60279Jia jia, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A03 = jia;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        float A04 = AnonymousClass7TE.A04(obj2);
        float A042 = AnonymousClass7TE.A04(obj3);
        IgLiveLayoutManagerViewModel$2 igLiveLayoutManagerViewModel$2 = new IgLiveLayoutManagerViewModel$2(this.A03, (AnonymousClass4D7) obj4);
        igLiveLayoutManagerViewModel$2.A02 = A1a;
        igLiveLayoutManagerViewModel$2.A00 = A04;
        igLiveLayoutManagerViewModel$2.A01 = A042;
        return igLiveLayoutManagerViewModel$2.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001b, code lost:
        if (X.C60279Jia.A00(r8) < r8.A01) goto L_0x001d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.0eS.A00(r12)
            boolean r10 = r11.A02
            float r9 = r11.A00
            float r2 = r11.A01
            X.Jia r8 = r11.A03
            X.05G r4 = r8.A03
            X.6go r7 = r8.A02
            X.6go r6 = X.C313666go.VIEWER
            r5 = 0
            if (r7 == r6) goto L_0x001d
            int r1 = r8.A01
            int r0 = X.C60279Jia.A00(r8)
            r3 = 0
            if (r0 >= r1) goto L_0x001e
        L_0x001d:
            r3 = 1
        L_0x001e:
            if (r10 == 0) goto L_0x005e
            boolean r0 = r8.A07
            if (r0 == 0) goto L_0x005e
            float r1 = r8.A00
        L_0x0026:
            float r0 = java.lang.Math.max(r9, r2)
            float r2 = java.lang.Math.max(r1, r0)
            if (r7 == r6) goto L_0x0041
            int r1 = r8.A01
            int r0 = X.C60279Jia.A00(r8)
            if (r0 >= r1) goto L_0x0058
            int r0 = X.C60279Jia.A00(r8)
        L_0x003c:
            if (r0 >= r5) goto L_0x003f
            r0 = 0
        L_0x003f:
            int r5 = r0 / 2
        L_0x0041:
            float r0 = (float) r5
            float r2 = r2 - r0
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0049
            r2 = 0
        L_0x0049:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r2 = r2 * r0
            r1 = 1
            X.Jum r0 = new X.Jum
            r0.<init>(r1, r2, r3)
            r4.Epw(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0058:
            int r0 = X.C60279Jia.A00(r8)
            int r0 = r0 - r1
            goto L_0x003c
        L_0x005e:
            r1 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.layoutmanager.IgLiveLayoutManagerViewModel$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
