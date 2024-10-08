package com.instagram.video.live.mvvm.viewmodel.state;

import X.0sJ;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60310JjB;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$1", f = "IgLiveViewerStateViewModel.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveViewerStateViewModel$1 extends AnonymousClass1Ek implements 0sJ {
    public int A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ boolean A03;
    public final /* synthetic */ C60310JjB A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveViewerStateViewModel$1(C60310JjB jjB, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A04 = jjB;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$1, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1 == null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            X.1Hj r8 = X.1Hj.A02
            int r0 = r9.A00
            r7 = 1
            if (r0 == 0) goto L_0x000d
            X.0eS.A00(r10)
        L_0x000a:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x000d:
            X.0eS.A00(r10)
            boolean r6 = r9.A03
            java.lang.Object r5 = r9.A01
            X.JvD r5 = (X.C61013JvD) r5
            java.lang.Object r1 = r9.A02
            X.JjB r0 = r9.A04
            X.0V2 r4 = r0.A0I
            if (r5 == 0) goto L_0x0021
            r3 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r3 = 0
        L_0x0022:
            r2 = 0
            if (r5 == 0) goto L_0x0037
            java.lang.String r1 = r5.A08
        L_0x0027:
            X.Kf7 r0 = new X.Kf7
            r0.<init>(r6, r3, r1)
            r9.A01 = r2
            r9.A00 = r7
            java.lang.Object r0 = r4.emit(r0, r9)
            if (r0 != r8) goto L_0x000a
            return r8
        L_0x0037:
            r1 = r2
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        IgLiveViewerStateViewModel$1 igLiveViewerStateViewModel$1 = new IgLiveViewerStateViewModel$1(this.A04, (AnonymousClass4D7) obj4);
        igLiveViewerStateViewModel$1.A03 = A1a;
        igLiveViewerStateViewModel$1.A01 = obj2;
        igLiveViewerStateViewModel$1.A02 = obj3;
        return igLiveViewerStateViewModel$1.invokeSuspend(C60340gF.A00);
    }
}
