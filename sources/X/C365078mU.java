package X;

import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;

/* renamed from: X.8mU  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C365078mU implements Runnable {
    public final /* synthetic */ C364988mL A00;
    public final /* synthetic */ C364838m6 A01;
    public final /* synthetic */ AnonymousClass8KS A02;
    public final /* synthetic */ SurfaceCropFilter A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C365078mU(C364988mL r1, C364838m6 r2, AnonymousClass8KS r3, SurfaceCropFilter surfaceCropFilter, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A04 = z;
        this.A03 = surfaceCropFilter;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x013c, code lost:
        if (r4.A0M == false) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0144, code lost:
        if (r4.A0M == false) goto L_0x0146;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r31 = this;
            r2 = r31
            X.8m6 r4 = r2.A01
            X.8KS r0 = r2.A02
            r30 = r0
            boolean r1 = r2.A04
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r11 = r2.A03
            X.8mL r3 = r2.A00
            java.lang.String r17 = "OneCameraArImageRenderController"
            r6 = 0
            r4.A0A = r6
            r4.A06 = r0
            r2 = 1
            X.8my r0 = r4.A07     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r16 = -1
            if (r0 == 0) goto L_0x0020
            boolean r0 = r4.A0B     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            if (r0 == 0) goto L_0x009f
        L_0x0020:
            X.8mI r10 = r4.A0J     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8m2 r0 = r10.A08     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r19 = r0
            java.lang.String r13 = r19.AvM()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            if (r1 == 0) goto L_0x0057
            if (r13 == 0) goto L_0x0057
            com.instagram.creation.base.CropInfo r1 = r10.A01     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8mJ r9 = r10.A07     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            java.lang.String r0 = "_gpu_"
            java.lang.String r0 = X.002.A0R(r0, r13)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r8 = r0.hashCode()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.02m r7 = r9.A00     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r5 = 17633132(0x10d0f6c, float:2.5908675E-38)
            r7.markerStart(r5, r8)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            java.lang.String r0 = "GPU Loader"
            r9.A01(r8, r0)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r0.<init>()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r4.A02 = r0     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            boolean r0 = r10.A09     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            if (r0 == 0) goto L_0x0079
            if (r1 == 0) goto L_0x0079
            goto L_0x005e
        L_0x0057:
            X.8my r0 = r10.A05(r11, r6)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r4.A07 = r0     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            goto L_0x009d
        L_0x005e:
            java.lang.String r0 = "GPU loader Crop"
            r9.A01(r8, r0)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader r0 = r4.A02     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r15 = r0
            android.graphics.Rect r1 = r1.A02     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r0 = r1.left     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r14 = r0
            int r0 = r1.top     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r12 = r0
            int r0 = r1.right     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r18 = r0
            int r0 = r1.bottom     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r1 = r18
            r15.setCropInformation(r14, r12, r1, r0)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
        L_0x0079:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader r0 = r4.A02     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture r13 = r0.loadImageToGPU(r13)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            if (r13 == 0) goto L_0x008f
            int r1 = r13.getTarget()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r0 = r16
            if (r1 != r0) goto L_0x010a
            int r1 = r13.getHandle()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            if (r1 != r0) goto L_0x010a
        L_0x008f:
            java.lang.String r0 = "GPU loader Failed"
            r9.A01(r8, r0)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r9.A00()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8my r0 = r10.A05(r11, r6)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r4.A07 = r0     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
        L_0x009d:
            r4.A0B = r6     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
        L_0x009f:
            X.8my r0 = r4.A07     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r0.getClass()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8my r0 = r4.A07     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r8 = r0.getWidth()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r7 = r0.getHeight()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8mI r0 = r4.A0J     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r5 = r0.A00     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r1 = r30.getWidth()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r0 = r30.getHeight()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            float r10 = (float) r8     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            float r7 = (float) r7     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            float r10 = r10 / r7
            android.content.Context r7 = r4.A0E     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r7 = X.AnonymousClass0Ke.A00(r7)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int[] r7 = X.C367168qI.A01(r1, r0, r7)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r9 = r7[r6]     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r8 = r7[r2]     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r7 = r5 % 180
            if (r7 != 0) goto L_0x0105
            int[] r9 = X.C367168qI.A00(r10, r9, r8)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
        L_0x00d3:
            r21 = r9[r6]     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r22 = r9[r2]     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r8 = r4.A0D     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8mz r20 = new X.8mz     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r23 = r6
            r24 = r6
            r25 = r6
            r26 = r8
            r20.<init>(r21, r22, r23, r24, r25, r26)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8n0 r19 = X.C365378n0.ENABLE     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r22 = 0
            X.8mb r21 = X.C365138mb.A01     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            java.lang.Object r23 = X.C343747qj.A06     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8n2 r8 = new X.8n2     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r24 = r17
            r26 = r6
            r27 = r2
            r28 = r2
            r29 = r6
            r18 = r8
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r4.A03 = r8     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r3.A08(r8)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            goto L_0x0137
        L_0x0105:
            int[] r9 = X.C367168qI.A00(r10, r8, r9)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            goto L_0x00d3
        L_0x010a:
            r19.AvM()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            java.lang.String r15 = r19.getTitle()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r14 = r13.getHandle()     // Catch:{ Exception -> 0x0170 }
            int r12 = r13.getWidth()     // Catch:{ Exception -> 0x0170 }
            int r1 = r13.getHeight()     // Catch:{ Exception -> 0x0170 }
            r0 = 0
            X.8mx r12 = X.C365338mw.A01(r0, r14, r12, r1)     // Catch:{ Exception -> 0x0170 }
            int r1 = r10.A00     // Catch:{ Exception -> 0x0170 }
            X.C364958mI.A03(r13, r10, r11, r15, r1)     // Catch:{ Exception -> 0x0170 }
            r10.A06()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r4.A07 = r12     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            java.lang.String r0 = "GPU loader success"
            r9.A01(r8, r0)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r0 = 2
            r7.markerEnd(r5, r0)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            goto L_0x009d
        L_0x0137:
            if (r7 != 0) goto L_0x013e
            boolean r8 = r4.A0M     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r10 = 1
            if (r8 != 0) goto L_0x0146
        L_0x013e:
            r10 = 0
            if (r7 == 0) goto L_0x0146
            boolean r7 = r4.A0M     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r11 = 0
            if (r7 != 0) goto L_0x0147
        L_0x0146:
            r11 = 1
        L_0x0147:
            r7 = r9[r6]     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r8 = r9[r2]     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r5 = -r5
            r6 = r3
            r9 = r5
            r6.A06(r7, r8, r9, r10, r11)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            int r7 = r4.A01     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r5 = r16
            if (r7 == r5) goto L_0x015d
            int r6 = r4.A00     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            if (r6 == r5) goto L_0x015d
            r1 = r7
            r0 = r6
        L_0x015d:
            r5 = r30
            r3.A05 = r5     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            X.8md r6 = new X.8md     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r6.<init>(r5, r3)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r3.A0C(r6)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r3.A05(r1, r0)     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            r4.EEp()
            return
        L_0x0170:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0177 }
            r0.<init>(r1)     // Catch:{ all -> 0x0177 }
            throw r0     // Catch:{ all -> 0x0177 }
        L_0x0177:
            r0 = move-exception
            r10.A06()     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
            throw r0     // Catch:{ NullPointerException -> 0x018f, Exception -> 0x017c }
        L_0x017c:
            r5 = move-exception
            r4.A0A = r2
            java.lang.String r1 = "Error in OneCameraArImageRenderController#setTextureViewOutput"
            r0 = r17
            r3.A0D(r1, r0, r5)
            X.0kD.A0H(r1, r5)
            X.8m9 r0 = r4.A0I
            r0.DGu(r1)
            return
        L_0x018f:
            r6 = move-exception
            com.instagram.common.session.UserSession r7 = r4.A0G
            X.0Tu r5 = X.0Tu.A05
            r0 = 36328959398395591(0x8110ff00003ec7, double:3.0379184362986643E-306)
            boolean r0 = X.182.A06(r5, r7, r0)
            if (r0 == 0) goto L_0x01a7
            X.Ajr r0 = new X.Ajr
            r0.<init>(r4)
            X.11Z.A02(r0)
        L_0x01a7:
            r4.A0A = r2
            java.lang.String r5 = "NullPointerException in OneCameraArImageRenderController#setTextureViewOutput"
            r0 = r17
            r3.A0D(r5, r0, r6)
            X.0wj r2 = X.0wj.A01
            r1 = 817893068(0x30c00ecc, float:1.3974044E-9)
            X.0f9 r3 = r2.AEf(r0, r1)
            android.app.ActivityManager$MemoryInfo r2 = new android.app.ActivityManager$MemoryInfo
            r2.<init>()
            android.content.Context r1 = r4.A0E
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r1.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 == 0) goto L_0x01cd
            r0.getMemoryInfo(r2)
        L_0x01cd:
            long r1 = r2.availMem
            java.lang.String r0 = "availableMemory"
            r3.ABP(r0, r1)
            r3.ERJ(r6)
            r3.report()
            X.8m9 r0 = r4.A0I
            r0.DGu(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365078mU.run():void");
    }
}
