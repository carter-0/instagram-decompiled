package com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram;

import X.0sK;
import X.0sL;
import X.AH4;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C252683pV;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper$renderAllFrames$2$1", f = "OdrSnapshotHelper.kt", i = {0, 0, 1}, l = {223, 241, 243}, m = "invokeSuspend", n = {"frameNo", "nextFrame", "frameNo"}, s = {"I$0", "I$2", "I$0"})
public final class OdrSnapshotHelper$renderAllFrames$2$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ OdrSnapshotHelper A04;
    public final /* synthetic */ AH4 A05;
    public final /* synthetic */ 0sK A06;
    public final /* synthetic */ C252683pV A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OdrSnapshotHelper$renderAllFrames$2$1(OdrSnapshotHelper odrSnapshotHelper, AH4 ah4, AnonymousClass4D7 r4, 0sK r5, C252683pV r6) {
        super(2, r4);
        this.A04 = odrSnapshotHelper;
        this.A06 = r5;
        this.A05 = ah4;
        this.A07 = r6;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper$renderAllFrames$2$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        return new OdrSnapshotHelper$renderAllFrames$2$1(this.A04, this.A05, r8, this.A06, this.A07);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper$renderAllFrames$2$1, java.lang.Object, X.4D7] */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:32|11|12|13|14|15|16|(2:18|38)|20|23|(3:25|(2:27|(1:29))|(0))|33|(2:35|(1:37))(2:39|40)) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0083, code lost:
        r7 = X.C41845B3m.A0c(new X.C60813Jri(X.AnonymousClass7TE.A15("Timed out while waiting for the snapshot to be taken"), X.AnonymousClass05K.A00));
     */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007c A[Catch:{ 3EF -> 0x0083 }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r7 = r16
            X.1Hj r3 = X.1Hj.A02
            int r0 = r15.A03
            r4 = 3
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0028
            if (r0 == r5) goto L_0x0021
            if (r0 == r6) goto L_0x00b6
            X.0eS.A00(r7)
        L_0x0012:
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r0 = r15.A04
            com.facebook.quicklog.QuickPerformanceLogger r2 = r0.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot/render_frame_end"
            r2.markerPoint(r1, r0)
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0021:
            int r13 = r15.A02
            int r2 = r15.A01
            int r0 = r15.A00
            goto L_0x007d
        L_0x0028:
            X.0eS.A00(r7)
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r7 = r15.A04
            com.facebook.quicklog.QuickPerformanceLogger r2 = r7.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot/render_frame_start"
            r2.markerPoint(r1, r0)
            int r2 = r7.A01
            X.LGB r0 = r7.A06
            int r0 = r0.A02
            int r2 = r2 + r0
            if (r5 > r2) goto L_0x0012
            r0 = 1
        L_0x0041:
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r9 = r15.A04
            int r1 = r9.A00
            int r13 = r1 + 1
            java.lang.String r1 = "/take_snapshot/render_frame/"
            java.lang.String r8 = X.002.A0O(r1, r13)
            com.facebook.quicklog.QuickPerformanceLogger r10 = r9.A07
            r7 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r1 = "_start"
            java.lang.String r1 = X.002.A0R(r8, r1)
            r10.markerPoint(r7, r1)
            X.0sK r8 = r15.A06     // Catch:{ 3EF -> 0x0083 }
            X.AH4 r7 = r15.A05     // Catch:{ 3EF -> 0x0083 }
            X.LGB r1 = r9.A06     // Catch:{ 3EF -> 0x0083 }
            int r11 = r1.A03     // Catch:{ 3EF -> 0x0083 }
            int r12 = r1.A02     // Catch:{ 3EF -> 0x0083 }
            boolean r14 = X.C51970G9q.A1W(r0, r12)
            X.Jtw r9 = new X.Jtw     // Catch:{ 3EF -> 0x0083 }
            r9.<init>(r10, r11, r12, r13, r14)     // Catch:{ 3EF -> 0x0083 }
            r15.A00 = r0     // Catch:{ 3EF -> 0x0083 }
            r15.A01 = r2     // Catch:{ 3EF -> 0x0083 }
            r15.A02 = r13     // Catch:{ 3EF -> 0x0083 }
            r15.A03 = r5     // Catch:{ 3EF -> 0x0083 }
            java.lang.Object r7 = r8.invoke(r7, r9, r15)     // Catch:{ 3EF -> 0x0083 }
            if (r7 != r3) goto L_0x0080
            goto L_0x00d1
        L_0x007d:
            X.0eS.A00(r7)     // Catch:{ 3EF -> 0x0083 }
        L_0x0080:
            X.3Ii r7 = (X.C239803Ii) r7     // Catch:{ 3EF -> 0x0083 }
            goto L_0x0094
        L_0x0083:
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            java.lang.String r1 = "Timed out while waiting for the snapshot to be taken"
            java.lang.RuntimeException r7 = X.AnonymousClass7TE.A15(r1)
            X.Jri r1 = new X.Jri
            r1.<init>(r7, r8)
            X.5sO r7 = X.C41845B3m.A0c(r1)
        L_0x0094:
            boolean r1 = r7 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x00c2
            X.3Ih r7 = (X.C239793Ih) r7
            java.lang.Object r8 = r7.A00
            if (r8 == 0) goto L_0x00bd
            X.3pV r7 = r15.A07
            X.0k0 r1 = new X.0k0
            r1.<init>(r13, r8)
            X.3Ih r1 = X.C41845B3m.A0d(r1)
            r15.A00 = r0
            r15.A01 = r2
            r15.A03 = r6
            java.lang.Object r1 = r7.ELH(r1, r15)
            if (r1 != r3) goto L_0x00bd
            return r3
        L_0x00b6:
            int r2 = r15.A01
            int r0 = r15.A00
            X.0eS.A00(r7)
        L_0x00bd:
            if (r0 == r2) goto L_0x0012
            int r0 = r0 + 1
            goto L_0x0041
        L_0x00c2:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00d2
            X.3pV r0 = r15.A07
            r15.A03 = r4
            java.lang.Object r0 = r0.ELH(r7, r15)
            if (r0 != r3) goto L_0x0012
            return r3
        L_0x00d1:
            return r3
        L_0x00d2:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper$renderAllFrames$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OdrSnapshotHelper$renderAllFrames$2$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
