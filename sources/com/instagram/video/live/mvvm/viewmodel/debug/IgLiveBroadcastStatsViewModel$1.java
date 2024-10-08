package com.instagram.video.live.mvvm.viewmodel.debug;

import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60126Jg7;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.debug.IgLiveBroadcastStatsViewModel$1", f = "IgLiveBroadcastStatsViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveBroadcastStatsViewModel$1 extends AnonymousClass1Ek implements 0sJ {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public final /* synthetic */ C60126Jg7 A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveBroadcastStatsViewModel$1(C60126Jg7 jg7, AnonymousClass4D7 r3, boolean z) {
        super(4, r3);
        this.A03 = jg7;
        this.A04 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj3);
        IgLiveBroadcastStatsViewModel$1 igLiveBroadcastStatsViewModel$1 = new IgLiveBroadcastStatsViewModel$1(this.A03, (AnonymousClass4D7) obj4, this.A04);
        igLiveBroadcastStatsViewModel$1.A01 = A1a;
        igLiveBroadcastStatsViewModel$1.A00 = obj2;
        igLiveBroadcastStatsViewModel$1.A02 = A1a2;
        return igLiveBroadcastStatsViewModel$1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        if (r1 != false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.0eS.A00(r6)
            boolean r3 = r5.A01
            java.lang.Object r2 = r5.A00
            boolean r1 = r5.A02
            X.Jg7 r0 = r5.A03
            X.05G r4 = r0.A00
            boolean r0 = r5.A04
            if (r0 == 0) goto L_0x0016
            if (r3 == 0) goto L_0x0016
            r3 = 1
            if (r1 == 0) goto L_0x0017
        L_0x0016:
            r3 = 0
        L_0x0017:
            java.lang.String r2 = r2.toString()
            r1 = 16
            X.Jvk r0 = new X.Jvk
            r0.<init>((java.lang.String) r2, (int) r1, (boolean) r3)
            r4.Epw(r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.debug.IgLiveBroadcastStatsViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
