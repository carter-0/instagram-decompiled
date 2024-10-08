package com.instagram.video.live.mvvm.viewmodel.state;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C255773uh;
import X.C313556gd;
import X.C60310JjB;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$onEnteringBroadcast$1", f = "IgLiveViewerStateViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveViewerStateViewModel$onEnteringBroadcast$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ boolean A00;
    public final /* synthetic */ C255773uh A01;
    public final /* synthetic */ C313556gd A02;
    public final /* synthetic */ C60310JjB A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveViewerStateViewModel$onEnteringBroadcast$1(C255773uh r2, C313556gd r3, C60310JjB jjB, String str, String str2, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A03 = jjB;
        this.A01 = r2;
        this.A04 = str;
        this.A05 = str2;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.4D7, com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$onEnteringBroadcast$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        C60310JjB jjB = this.A03;
        ? igLiveViewerStateViewModel$onEnteringBroadcast$1 = new IgLiveViewerStateViewModel$onEnteringBroadcast$1(this.A01, this.A02, jjB, this.A04, this.A05, r10);
        igLiveViewerStateViewModel$onEnteringBroadcast$1.A00 = AnonymousClass7TE.A1a(obj);
        return igLiveViewerStateViewModel$onEnteringBroadcast$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((IgLiveViewerStateViewModel$onEnteringBroadcast$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        if (r0.CVs() != true) goto L_0x007a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ac, code lost:
        if (r0.A00() == true) goto L_0x00ae;
     */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0097  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.0eS.A00(r20)
            r1 = r19
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0094
            X.JjB r8 = r1.A03
            X.3uh r6 = r1.A01
            java.lang.String r10 = r1.A04
            java.lang.String r9 = r1.A05
            X.6gd r7 = r1.A02
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r2 = r8.A0D
            X.6go r1 = r2.A04
            X.6go r0 = X.C313666go.BROADCASTER
            r11 = 0
            if (r1 != r0) goto L_0x002d
            com.instagram.reels.store.ReelStore r1 = r2.A01
            X.05G r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            X.JvD r0 = (X.C61013JvD) r0
            if (r0 == 0) goto L_0x00c3
            java.lang.String r0 = r0.A08
        L_0x002a:
            r1.A0c(r0)
        L_0x002d:
            X.05G r0 = r2.A05
            r0.Epw(r11)
            X.6h4 r5 = r8.A0E
            X.6h5 r4 = r5.A01
            r2 = 0
            r4.A00 = r2
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            r4.A01 = r0
            r4.A02 = r11
            r4.A03 = r11
            r5.A00 = r11
            X.05G r1 = r5.A04
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.Epw(r0)
            X.4gL r3 = r6.A0c
            if (r3 == 0) goto L_0x00c1
            X.3NV r1 = r3.A0A
            if (r1 != 0) goto L_0x0058
            X.3NV r1 = X.AnonymousClass3NV.A08
        L_0x0058:
            X.3NV r0 = X.AnonymousClass3NV.A04
            r4 = 1
            if (r1 != r0) goto L_0x0079
            X.1Av r5 = r8.A05
            X.0s0 r2 = r5.A6N
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 112(0x70, float:1.57E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r5, r2, r1, r0)
            if (r0 != 0) goto L_0x0079
            X.4w0 r0 = r3.A02
            if (r0 == 0) goto L_0x007a
            X.4vt r0 = r0.A0A
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.CVs()
            if (r0 != r4) goto L_0x007a
        L_0x0079:
            r4 = 0
        L_0x007a:
            r2 = 1
            if (r4 == 0) goto L_0x0097
            r8.A03 = r2
            X.6oS r0 = X.C318116oQ.A00(r8)
            r12 = 13
            X.JVS r5 = new X.JVS
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            X.AnonymousClass7TE.A1Z(r5, r0)
        L_0x008d:
            X.4Co r0 = r8.A02
            if (r0 == 0) goto L_0x0094
            r0.AG7(r11)
        L_0x0094:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0097:
            if (r3 == 0) goto L_0x00bf
            java.lang.String r1 = r3.A0X
            r1.getClass()
        L_0x009e:
            r18 = 1
            if (r3 == 0) goto L_0x00bd
            X.4wI r0 = r3.A06
            if (r0 != 0) goto L_0x00a8
            X.4wI r0 = X.C278114wI.UNKNOWN
        L_0x00a8:
            boolean r0 = r0.A00()
            if (r0 != r2) goto L_0x00bd
        L_0x00ae:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r2)
            r12 = r7
            r13 = r8
            r15 = r1
            r16 = r10
            r17 = r9
            X.C60310JjB.A00(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x008d
        L_0x00bd:
            r2 = 0
            goto L_0x00ae
        L_0x00bf:
            r1 = 0
            goto L_0x009e
        L_0x00c1:
            r1 = 0
            goto L_0x0058
        L_0x00c3:
            r0 = r11
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$onEnteringBroadcast$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
