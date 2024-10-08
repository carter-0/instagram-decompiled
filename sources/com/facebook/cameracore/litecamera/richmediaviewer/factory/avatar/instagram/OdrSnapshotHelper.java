package com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram;

import X.0sP;
import X.JTQ;
import X.LGB;
import android.content.Context;
import com.facebook.avatar.expresso.webp.WebPEncoderImpl;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

public final class OdrSnapshotHelper {
    public int A00;
    public int A01;
    public WebPEncoderImpl A02;
    public File A03;
    public Integer A04;
    public Integer A05;
    public final LGB A06;
    public final QuickPerformanceLogger A07;
    public final Context A08;
    public final AtomicBoolean A09 = JTQ.A0k();
    public final 0sP A0A;

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r7, java.io.File r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 25
            boolean r0 = X.C66144MDw.A02(r3, r9)
            if (r0 == 0) goto L_0x0051
            r6 = r9
            X.MDw r6 = (X.C66144MDw) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0051
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r6.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r6.A00
            r3 = 1
            if (r0 == 0) goto L_0x0037
            if (r0 != r3) goto L_0x0057
            java.lang.Object r7 = r6.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r7 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r7
            X.0eS.A00(r5)
        L_0x0028:
            boolean r0 = r5 instanceof X.C60813Jri
            if (r0 != 0) goto L_0x0036
            com.facebook.quicklog.QuickPerformanceLogger r2 = r7.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot/encode_and_write_to_disk_end"
            r2.markerPoint(r1, r0)
        L_0x0036:
            return r5
        L_0x0037:
            X.0eS.A00(r5)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r7.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot/encode_and_write_to_disk_start"
            r2.markerPoint(r1, r0)
            com.facebook.avatar.expresso.webp.WebPEncoderImpl r0 = r7.A02
            r6.A01 = r7
            r6.A00 = r3
            java.lang.Object r5 = r0.A00(r2, r8, r6, r1)
            if (r5 != r4) goto L_0x0028
            return r4
        L_0x0051:
            X.MDw r6 = new X.MDw
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0057:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A00(com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper, java.io.File, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r8, X.0k0 r9, X.AnonymousClass4D7 r10, X.0sL r11) {
        /*
            r3 = 12
            boolean r0 = X.C66146MDy.A02(r3, r10)
            if (r0 == 0) goto L_0x005d
            r7 = r10
            X.MDy r7 = (X.C66146MDy) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x005d
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            java.lang.String r5 = "/take_snapshot/encode_frame/"
            r4 = 603995461(0x24003d45, float:2.7807473E-17)
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 != r3) goto L_0x0063
            java.lang.Object r9 = r7.A02
            X.0k0 r9 = (X.0k0) r9
            java.lang.Object r8 = r7.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r8 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r8
            X.0eS.A00(r1)
        L_0x0031:
            com.facebook.quicklog.QuickPerformanceLogger r2 = r8.A07
            int r1 = r9.A00
            java.lang.String r0 = "_end"
            java.lang.String r0 = X.002.A0c(r5, r0, r1)
            r2.markerPoint(r4, r0)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0041:
            X.0eS.A00(r1)
            com.facebook.quicklog.QuickPerformanceLogger r2 = r8.A07
            int r1 = r9.A00
            java.lang.String r0 = "_start"
            java.lang.String r0 = X.002.A0c(r5, r0, r1)
            r2.markerPoint(r4, r0)
            java.lang.Object r0 = r9.A01
            X.C66146MDy.A00(r8, r9, r7, r3)
            java.lang.Object r0 = r11.invoke(r0, r7)
            if (r0 != r6) goto L_0x0031
            return r6
        L_0x005d:
            X.MDy r7 = new X.MDy
            r7.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x0063:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A01(com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper, X.0k0, X.4D7, X.0sL):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r9v1, types: [X.4D7] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0024  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AH4 r17, X.AnonymousClass4D7 r18) {
        /*
            r16 = this;
            r3 = 24
            r4 = r18
            boolean r0 = X.C66144MDw.A02(r3, r4)
            r13 = r16
            if (r0 == 0) goto L_0x00fc
            r5 = r4
            X.MDw r5 = (X.C66144MDw) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00fc
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0043
            if (r0 != r2) goto L_0x0103
            java.lang.Object r4 = r5.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r4 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r4
            X.0eS.A00(r1)
        L_0x002d:
            com.facebook.quicklog.QuickPerformanceLogger r2 = r4.A07
            r1 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.String r0 = "/take_snapshot_end"
            r2.markerPoint(r1, r0)
            r2.markerEnd(r1, r3)
            java.util.concurrent.atomic.AtomicBoolean r1 = r4.A09
            r0 = 0
            r1.set(r0)
        L_0x0040:
            X.0gF r4 = X.C60340gF.A00
        L_0x0042:
            return r4
        L_0x0043:
            X.0eS.A00(r1)
            java.util.concurrent.atomic.AtomicBoolean r8 = r13.A09
            boolean r0 = r8.get()
            if (r0 != 0) goto L_0x0040
            com.facebook.avatar.expresso.webp.WebPEncoderImpl r7 = r13.A02
            java.lang.Integer r0 = r13.A05
            r1 = 400(0x190, float:5.6E-43)
            if (r0 == 0) goto L_0x00f8
            int r6 = r0.intValue()
        L_0x005a:
            java.lang.Integer r0 = r13.A04
            int r1 = X.C51967G9n.A04(r0, r1)
            com.facebook.onecamera.modules.videoencoding.webp.WebPEncoder r0 = r7.A01
            int r0 = r0.prepare(r6, r1, r2)
            if (r0 != 0) goto L_0x007a
            X.0sP r7 = r13.A0A
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            java.lang.String r0 = "Webp encoder preparation failed"
            java.lang.RuntimeException r1 = X.AnonymousClass7TE.A15(r0)
            X.Jri r0 = new X.Jri
            r0.<init>(r1, r6)
            r7.invoke(r0)
        L_0x007a:
            android.content.Context r1 = r13.A08
            java.lang.String r0 = "snapshots"
            java.io.File r0 = r1.getExternalFilesDir(r0)
            r14 = 0
            if (r0 == 0) goto L_0x00f6
            java.lang.String r7 = r0.getPath()
        L_0x0089:
            com.facebook.quicklog.QuickPerformanceLogger r10 = r13.A07
            r9 = 603995461(0x24003d45, float:2.7807473E-17)
            java.lang.Runtime r0 = java.lang.Runtime.getRuntime()
            long r0 = r0.totalMemory()
            java.lang.Runtime r6 = java.lang.Runtime.getRuntime()
            long r11 = r6.freeMemory()
            long r0 = r0 - r11
            float r6 = (float) r0
            r0 = 1149239296(0x44800000, float:1024.0)
            float r6 = r6 / r0
            double r0 = (double) r6
            java.lang.String r6 = "memory_usage_before_snapshot_save"
            r10.markerAnnotate(r9, r6, r0)
            java.lang.String r0 = "/take_snapshot_start"
            r10.markerPoint(r9, r0)
            java.io.File r6 = r13.A03
            if (r6 != 0) goto L_0x00c1
            java.lang.String r6 = "snapshot_"
            int r1 = r13.A00
            java.lang.String r0 = ".webp"
            java.lang.String r0 = X.002.A0c(r6, r0, r1)
            java.io.File r6 = new java.io.File
            r6.<init>(r7, r0)
        L_0x00c1:
            r8.set(r2)
            r0 = 0
            X.MIp r11 = new X.MIp
            r11.<init>(r13, r0)
            r12 = r17
            X.0qQ.A0B(r12, r0)
            r15 = 6
            X.MGj r10 = new X.MGj
            r10.<init>(r11, r12, r13, r14, r15)
            X.05S r11 = X.AnonymousClass0Zq.A01(r10)
            r5.A01 = r13
            r5.A00 = r2
            X.LGB r0 = r13.A06
            int r2 = r0.A00
            r1 = 10
            X.JTi r0 = new X.JTi
            r0.<init>(r13, r14, r1)
            r7 = r13
            r8 = r6
            r9 = r5
            r10 = r0
            r12 = r2
            java.lang.Object r0 = r7.A03(r8, r9, r10, r11, r12)
            if (r0 == r4) goto L_0x0042
            r4 = r13
            goto L_0x002d
        L_0x00f6:
            r7 = r14
            goto L_0x0089
        L_0x00f8:
            r6 = 400(0x190, float:5.6E-43)
            goto L_0x005a
        L_0x00fc:
            X.MDw r5 = new X.MDw
            r5.<init>(r13, r4, r3)
            goto L_0x001a
        L_0x0103:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A02(X.AH4, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        if (r2 == r6) goto L_0x0084;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.io.File r10, X.AnonymousClass4D7 r11, X.0sL r12, X.AnonymousClass0r6 r13, int r14) {
        /*
            r9 = this;
            r8 = 11
            boolean r0 = X.C66146MDy.A02(r8, r11)
            if (r0 == 0) goto L_0x009e
            r5 = r11
            X.MDy r5 = (X.C66146MDy) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009e
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r5.A03
            X.1Hj r6 = X.1Hj.A02
            int r0 = r5.A00
            r7 = 1
            r4 = 2
            r3 = 0
            if (r0 == 0) goto L_0x0034
            if (r0 == r7) goto L_0x006a
            if (r0 != r4) goto L_0x00a5
            java.lang.Object r7 = r5.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r7 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r7
            X.0eS.A00(r2)
        L_0x002c:
            X.0sP r0 = r7.A0A
            r0.invoke(r2)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x0034:
            X.0eS.A00(r2)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.0r6 r2 = X.11M.A00(r0, r13, r14)
            r0 = 3
            X.0ic r1 = new X.0ic
            r1.<init>(r2, r0)
            X.JTi r0 = new X.JTi
            r0.<init>(r9, r3, r8)
            X.0pz r1 = X.JTO.A1I(r0, r1)
            r0 = 4
            X.MC9 r1 = X.MC9.A00(r1, r0)
            r0 = 40
            X.MHP r0 = X.MHP.A01(r9, r12, r3, r0)
            X.0pz r0 = X.JTO.A1I(r0, r1)
            X.0ro r0 = X.C66191MHh.A00(r9, r0, r4)
            X.C66146MDy.A00(r9, r10, r5, r7)
            java.lang.Object r2 = X.AnonymousClass10c.A05(r5, r0)
            if (r2 == r6) goto L_0x0084
            r7 = r9
            goto L_0x0075
        L_0x006a:
            java.lang.Object r10 = r5.A02
            java.io.File r10 = (java.io.File) r10
            java.lang.Object r7 = r5.A01
            com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper r7 = (com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper) r7
            X.0eS.A00(r2)
        L_0x0075:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0085
            X.C66146MDy.A00(r7, r3, r5, r4)
            java.lang.Object r2 = A00(r7, r10, r5)
            if (r2 != r6) goto L_0x002c
        L_0x0084:
            return r6
        L_0x0085:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x008e
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r2 = r2.A00
            goto L_0x002c
        L_0x008e:
            if (r2 != 0) goto L_0x00aa
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.String r0 = "No frames are encoded"
            java.lang.RuntimeException r0 = X.AnonymousClass7TE.A15(r0)
            X.Jri r2 = new X.Jri
            r2.<init>(r0, r1)
            goto L_0x002c
        L_0x009e:
            X.MDy r5 = new X.MDy
            r5.<init>(r9, r11, r8)
            goto L_0x0016
        L_0x00a5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00aa:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.litecamera.richmediaviewer.factory.avatar.instagram.OdrSnapshotHelper.A03(java.io.File, X.4D7, X.0sL, X.0r6, int):java.lang.Object");
    }

    public OdrSnapshotHelper(Context context, LGB lgb, 0sP r4) {
        this.A08 = context;
        this.A06 = lgb;
        this.A0A = r4;
        this.A07 = lgb.A05;
        this.A03 = lgb.A06;
        this.A01 = lgb.A01;
        this.A02 = lgb.A04;
        this.A05 = lgb.A08;
        this.A04 = lgb.A07;
    }
}
