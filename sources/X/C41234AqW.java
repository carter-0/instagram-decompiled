package X;

import com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter;

/* renamed from: X.AqW  reason: case insensitive filesystem */
public final /* synthetic */ class C41234AqW implements Runnable {
    public final /* synthetic */ C364988mL A00;
    public final /* synthetic */ C40437Ac8 A01;
    public final /* synthetic */ AnonymousClass8KS A02;
    public final /* synthetic */ SurfaceCropFilter A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C41234AqW(C364988mL r1, C40437Ac8 ac8, AnonymousClass8KS r3, SurfaceCropFilter surfaceCropFilter, boolean z) {
        this.A01 = ac8;
        this.A02 = r3;
        this.A04 = z;
        this.A03 = surfaceCropFilter;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fd, code lost:
        if (r5.A0O != false) goto L_0x0101;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0121 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0184 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0199 A[Catch:{ Exception -> 0x01fa }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01ac A[Catch:{ Exception -> 0x01fa }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r35 = this;
            r0 = r35
            X.Ac8 r5 = r0.A01
            X.8KS r4 = r0.A02
            boolean r8 = r0.A04
            com.instagram.creation.photo.edit.surfacecropfilter.SurfaceCropFilter r14 = r0.A03
            X.8mL r3 = r0.A00
            r2 = 0
            r5.A0E = r2
            r5.A0B = r4
            r18 = 0
            r17 = 1
            X.8my r0 = r5.A0C     // Catch:{ Exception -> 0x01fa }
            r1 = -1
            if (r0 == 0) goto L_0x001e
            boolean r0 = r5.A0F     // Catch:{ Exception -> 0x01fa }
            if (r0 == 0) goto L_0x0074
        L_0x001e:
            X.8mI r11 = r5.A0N     // Catch:{ Exception -> 0x01fa }
            X.8m2 r6 = r11.A08     // Catch:{ Exception -> 0x01fa }
            java.lang.String r7 = r6.AvM()     // Catch:{ Exception -> 0x01fa }
            if (r8 == 0) goto L_0x002b
            if (r7 == 0) goto L_0x002b
            goto L_0x0032
        L_0x002b:
            X.8my r0 = r11.A05(r14, r2)     // Catch:{ Exception -> 0x01fa }
            r5.A0C = r0     // Catch:{ Exception -> 0x01fa }
            goto L_0x0072
        L_0x0032:
            X.8mJ r13 = r11.A07     // Catch:{ Exception -> 0x01fa }
            java.lang.String r0 = "_gpu_"
            java.lang.String r0 = X.002.A0R(r0, r7)     // Catch:{ Exception -> 0x01fa }
            int r12 = r0.hashCode()     // Catch:{ Exception -> 0x01fa }
            X.02m r10 = r13.A00     // Catch:{ Exception -> 0x01fa }
            r9 = 17633132(0x10d0f6c, float:2.5908675E-38)
            r10.markerStart(r9, r12)     // Catch:{ Exception -> 0x01fa }
            java.lang.String r0 = "GPU Loader"
            r13.A01(r12, r0)     // Catch:{ Exception -> 0x01fa }
            com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.gpuimageloader.impl.instagram.IgGPUImageLoader     // Catch:{ Exception -> 0x01fa }
            r0.<init>()     // Catch:{ Exception -> 0x01fa }
            r5.A05 = r0     // Catch:{ Exception -> 0x01fa }
            com.facebook.onecamera.components.mediapipeline.gl.context.igl.IglTexture r8 = r0.loadImageToGPU(r7)     // Catch:{ Exception -> 0x01fa }
            if (r8 == 0) goto L_0x0064
            int r0 = r8.getTarget()     // Catch:{ Exception -> 0x01fa }
            if (r0 != r1) goto L_0x00c7
            int r0 = r8.getHandle()     // Catch:{ Exception -> 0x01fa }
            if (r0 != r1) goto L_0x00c7
        L_0x0064:
            java.lang.String r0 = "GPU loader Failed"
            r13.A01(r12, r0)     // Catch:{ Exception -> 0x01fa }
            r13.A00()     // Catch:{ Exception -> 0x01fa }
            X.8my r0 = r11.A05(r14, r2)     // Catch:{ Exception -> 0x01fa }
            r5.A0C = r0     // Catch:{ Exception -> 0x01fa }
        L_0x0072:
            r5.A0F = r2     // Catch:{ Exception -> 0x01fa }
        L_0x0074:
            X.8my r0 = r5.A0C     // Catch:{ Exception -> 0x01fa }
            r0.getClass()     // Catch:{ Exception -> 0x01fa }
            X.8my r0 = r5.A0C     // Catch:{ Exception -> 0x01fa }
            int r10 = r0.getWidth()     // Catch:{ Exception -> 0x01fa }
            int r11 = r0.getHeight()     // Catch:{ Exception -> 0x01fa }
            X.8mI r0 = r5.A0N     // Catch:{ Exception -> 0x01fa }
            int r8 = r0.A00     // Catch:{ Exception -> 0x01fa }
            int r7 = r4.getWidth()     // Catch:{ Exception -> 0x01fa }
            int r0 = r4.getHeight()     // Catch:{ Exception -> 0x01fa }
            X.8mz r21 = new X.8mz     // Catch:{ Exception -> 0x01fa }
            r9 = r21
            r12 = r2
            r13 = r2
            r14 = r2
            r15 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x01fa }
            r34 = 0
            X.8n0 r20 = X.C365378n0.ENABLE     // Catch:{ Exception -> 0x01fa }
            java.lang.String r25 = "OneCameraImageRenderController"
            X.8mb r22 = X.C365138mb.A01     // Catch:{ Exception -> 0x01fa }
            java.lang.Object r24 = X.C343747qj.A06     // Catch:{ Exception -> 0x01fa }
            X.8n2 r6 = new X.8n2     // Catch:{ Exception -> 0x01fa }
            r23 = r18
            r26 = r2
            r27 = r2
            r28 = r17
            r29 = r17
            r30 = r2
            r19 = r6
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x01fa }
            r5.A07 = r6     // Catch:{ Exception -> 0x01fa }
            r3.A08(r6)     // Catch:{ Exception -> 0x01fa }
            int r6 = r8 % 180
            if (r6 != 0) goto L_0x00f7
            boolean r9 = r5.A0O     // Catch:{ Exception -> 0x01fa }
            r33 = 1
            if (r9 != 0) goto L_0x00ff
            goto L_0x00f7
        L_0x00c7:
            r6.AvM()     // Catch:{ Exception -> 0x01fa }
            java.lang.String r16 = r6.getTitle()     // Catch:{ Exception -> 0x01fa }
            int r15 = r8.getHandle()     // Catch:{ Exception -> 0x01ee }
            int r7 = r8.getWidth()     // Catch:{ Exception -> 0x01ee }
            int r6 = r8.getHeight()     // Catch:{ Exception -> 0x01ee }
            r0 = r18
            X.8mx r7 = X.C365338mw.A01(r0, r15, r7, r6)     // Catch:{ Exception -> 0x01ee }
            int r6 = r11.A00     // Catch:{ Exception -> 0x01ee }
            r0 = r16
            X.C364958mI.A03(r8, r11, r14, r0, r6)     // Catch:{ Exception -> 0x01ee }
            r11.A06()     // Catch:{ Exception -> 0x01fa }
            r5.A0C = r7     // Catch:{ Exception -> 0x01fa }
            java.lang.String r0 = "GPU loader success"
            r13.A01(r12, r0)     // Catch:{ Exception -> 0x01fa }
            r0 = 2
            r10.markerEnd(r9, r0)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0072
        L_0x00f7:
            r33 = 0
            if (r6 == 0) goto L_0x00ff
            boolean r9 = r5.A0O     // Catch:{ Exception -> 0x01fa }
            if (r9 != 0) goto L_0x0101
        L_0x00ff:
            r34 = 1
        L_0x0101:
            int r15 = -r8
            r29 = r3
            r32 = r15
            r30 = r10
            r31 = r11
            r29.A06(r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x01fa }
            X.8my r8 = r5.A0C     // Catch:{ Exception -> 0x01fa }
            X.8qj r8 = r8.B8o()     // Catch:{ Exception -> 0x01fa }
            r10 = 1065353216(0x3f800000, float:1.0)
            r5.A00 = r10     // Catch:{ Exception -> 0x01fa }
            if (r8 == 0) goto L_0x0184
            X.80G r9 = r4.A04     // Catch:{ Exception -> 0x01fa }
            boolean r9 = r9.A0A()     // Catch:{ Exception -> 0x01fa }
            if (r9 == 0) goto L_0x0184
            int r14 = r8.A03     // Catch:{ Exception -> 0x01fa }
            int r11 = r8.A01     // Catch:{ Exception -> 0x01fa }
            X.8mz r21 = new X.8mz     // Catch:{ Exception -> 0x01fa }
            r26 = r21
            r27 = r14
            r28 = r11
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32)     // Catch:{ Exception -> 0x01fa }
            X.8n2 r9 = new X.8n2     // Catch:{ Exception -> 0x01fa }
            r26 = r2
            r27 = r2
            r28 = r17
            r29 = r17
            r19 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ Exception -> 0x01fa }
            r5.A06 = r9     // Catch:{ Exception -> 0x01fa }
            X.7v0 r12 = r8.getTexture()     // Catch:{ Exception -> 0x01fa }
            r9.A02 = r12     // Catch:{ Exception -> 0x01fa }
            X.8n2 r13 = r5.A06     // Catch:{ Exception -> 0x01fa }
            X.8mP r12 = r3.A0E     // Catch:{ Exception -> 0x01fa }
            X.7sK r9 = r3.A0C     // Catch:{ Exception -> 0x01fa }
            X.7sH r9 = r9.A00     // Catch:{ Exception -> 0x01fa }
            r12.A01(r13, r9)     // Catch:{ Exception -> 0x01fa }
            r29 = r12
            r30 = r14
            r31 = r11
            r32 = r15
            r29.A00(r30, r31, r32, r33, r34)     // Catch:{ Exception -> 0x01fa }
            X.0r1 r9 = r8.A04     // Catch:{ Exception -> 0x01fa }
            boolean r11 = r9.A00     // Catch:{ Exception -> 0x01fa }
            if (r11 == 0) goto L_0x0171
            X.0rh r9 = r8.A05     // Catch:{ Exception -> 0x01fa }
            float r9 = r9.A00     // Catch:{ Exception -> 0x01fa }
            r5.A00 = r9     // Catch:{ Exception -> 0x01fa }
        L_0x0171:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter r9 = r5.A04     // Catch:{ Exception -> 0x01fa }
            if (r9 == 0) goto L_0x0193
            if (r11 == 0) goto L_0x018e
            X.C367428qj.A00(r9, r8)     // Catch:{ Exception -> 0x01fa }
            X.0rh r8 = r8.A05     // Catch:{ Exception -> 0x01fa }
            float r8 = r8.A00     // Catch:{ Exception -> 0x01fa }
            r9.A05 = r8     // Catch:{ Exception -> 0x01fa }
            r8 = 2
            r9.A09 = r8     // Catch:{ Exception -> 0x01fa }
            goto L_0x0190
        L_0x0184:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter r8 = r5.A04     // Catch:{ Exception -> 0x01fa }
            if (r8 == 0) goto L_0x0193
            r8.A09 = r2     // Catch:{ Exception -> 0x01fa }
            r8.A01(r2)     // Catch:{ Exception -> 0x01fa }
            goto L_0x0193
        L_0x018e:
            r9.A09 = r2     // Catch:{ Exception -> 0x01fa }
        L_0x0190:
            r9.A01(r2)     // Catch:{ Exception -> 0x01fa }
        L_0x0193:
            float r8 = r5.A00     // Catch:{ Exception -> 0x01fa }
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 <= 0) goto L_0x019a
            r2 = 1
        L_0x019a:
            X.80G r8 = r4.A04     // Catch:{ Exception -> 0x01fa }
            r8.A0A = r2     // Catch:{ Exception -> 0x01fa }
            int r8 = r5.A03     // Catch:{ Exception -> 0x01fa }
            if (r8 == r1) goto L_0x01a8
            int r2 = r5.A02     // Catch:{ Exception -> 0x01fa }
            if (r2 == r1) goto L_0x01a8
            r7 = r8
            r0 = r2
        L_0x01a8:
            com.instagram.creation.base.CropInfo r8 = r5.A0A     // Catch:{ Exception -> 0x01fa }
            if (r8 == 0) goto L_0x01dd
            if (r6 != 0) goto L_0x01bb
            android.graphics.Rect r1 = r8.A02     // Catch:{ Exception -> 0x01fa }
            int r2 = r1.width()     // Catch:{ Exception -> 0x01fa }
            android.graphics.Rect r1 = r8.A02     // Catch:{ Exception -> 0x01fa }
            int r1 = r1.height()     // Catch:{ Exception -> 0x01fa }
            goto L_0x01c7
        L_0x01bb:
            android.graphics.Rect r1 = r8.A02     // Catch:{ Exception -> 0x01fa }
            int r2 = r1.height()     // Catch:{ Exception -> 0x01fa }
            android.graphics.Rect r1 = r8.A02     // Catch:{ Exception -> 0x01fa }
            int r1 = r1.width()     // Catch:{ Exception -> 0x01fa }
        L_0x01c7:
            float r8 = (float) r2     // Catch:{ Exception -> 0x01fa }
            float r1 = (float) r1     // Catch:{ Exception -> 0x01fa }
            float r8 = r8 / r1
            float r6 = (float) r7     // Catch:{ Exception -> 0x01fa }
            float r2 = (float) r0     // Catch:{ Exception -> 0x01fa }
            float r1 = r6 / r2
            int r1 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r1 <= 0) goto L_0x01d3
            goto L_0x01d8
        L_0x01d3:
            int r7 = X.AnonymousClass7TE.A05(r2, r8)     // Catch:{ Exception -> 0x01fa }
            goto L_0x01dd
        L_0x01d8:
            float r6 = r6 / r8
            int r0 = java.lang.Math.round(r6)     // Catch:{ Exception -> 0x01fa }
        L_0x01dd:
            r3.A05 = r4     // Catch:{ Exception -> 0x01fa }
            X.8md r1 = new X.8md     // Catch:{ Exception -> 0x01fa }
            r1.<init>(r4, r3)     // Catch:{ Exception -> 0x01fa }
            r3.A0C(r1)     // Catch:{ Exception -> 0x01fa }
            r3.A05(r7, r0)     // Catch:{ Exception -> 0x01fa }
            r5.EEp()
            return
        L_0x01ee:
            r1 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x01f5 }
            r0.<init>(r1)     // Catch:{ all -> 0x01f5 }
            throw r0     // Catch:{ all -> 0x01f5 }
        L_0x01f5:
            r0 = move-exception
            r11.A06()     // Catch:{ Exception -> 0x01fa }
            throw r0     // Catch:{ Exception -> 0x01fa }
        L_0x01fa:
            r2 = move-exception
            r0 = r17
            r5.A0E = r0
            r0 = r18
            r5.A0B = r0
            java.lang.String r1 = "Error in OneCameraImageRenderController#setTextureViewOutput"
            java.lang.String r0 = "OneCameraImageRenderController"
            r3.A0D(r1, r0, r2)
            X.0kD.A0H(r1, r2)
            X.8m9 r0 = r5.A0M
            r0.DGu(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41234AqW.run():void");
    }
}
