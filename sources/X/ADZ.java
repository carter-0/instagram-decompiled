package X;

import com.google.common.collect.ImmutableList;

public final class ADZ {
    public static final ADZ A00 = new Object();
    public static final ImmutableList A01;

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.ADZ] */
    static {
        ImmutableList of = ImmutableList.of("blur_transition", "flare_transition", "glitch_transition", "spin_transition", "warp_transition", "zoom_transition");
        0qQ.A07(of);
        A01 = of;
    }

    /* JADX WARNING: type inference failed for: r0v1 */
    /* JADX WARNING: type inference failed for: r7v15, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter] */
    /* JADX WARNING: type inference failed for: r7v16, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter] */
    /* JADX WARNING: type inference failed for: r7v17, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter] */
    /* JADX WARNING: type inference failed for: r7v18, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter] */
    /* JADX WARNING: type inference failed for: r7v19, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter] */
    /* JADX WARNING: type inference failed for: r7v20, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter] */
    /* JADX WARNING: type inference failed for: r7v21, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C39785A9f A00(X.C365998o1 r21, X.C366518pA r22, java.lang.Float r23, java.lang.Float r24, java.lang.Integer r25, java.lang.String r26, int r27, int r28, long r29, long r31, boolean r33) {
        /*
            r20 = this;
            r1 = r26
            r15 = r29
            r17 = r31
            if (r26 == 0) goto L_0x000f
            int r0 = r1.hashCode()
            switch(r0) {
                case -936195220: goto L_0x0011;
                case -123266003: goto L_0x003a;
                case 139481759: goto L_0x0093;
                case 717581682: goto L_0x00bb;
                case 1296567617: goto L_0x00e3;
                case 2000782950: goto L_0x010e;
                default: goto L_0x000f;
            }
        L_0x000f:
            r1 = 0
            return r1
        L_0x0011:
            java.lang.String r0 = "warp_transition"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r5 = 0
            float[] r9 = X.C366498p3.A00()
            float[] r10 = X.C366498p3.A00()
            r12 = 1
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter
            r7 = r0
            r8 = r1
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0135
        L_0x003a:
            java.lang.String r0 = "blur_transition"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            if (r23 == 0) goto L_0x006f
            if (r24 == 0) goto L_0x006f
            float r12 = r23.floatValue()
            float r13 = r24.floatValue()
            r5 = 0
            float[] r9 = X.C366498p3.A00()
            float[] r10 = X.C366498p3.A00()
            r14 = 1
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter
            r7 = r0
            r8 = r1
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0135
        L_0x006f:
            r5 = 0
            r12 = 1103101952(0x41c00000, float:24.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float[] r9 = X.C366498p3.A00()
            float[] r10 = X.C366498p3.A00()
            r14 = 1
            r8 = 0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter
            r7 = r0
            r8 = r1
            r11 = r5
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0135
        L_0x0093:
            java.lang.String r0 = "glitch_transition"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r5 = 0
            float[] r9 = X.C366498p3.A00()
            float[] r10 = X.C366498p3.A00()
            r12 = 1
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter
            r7 = r0
            r8 = r1
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0135
        L_0x00bb:
            java.lang.String r0 = "spin_transition"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r5 = 0
            float[] r9 = X.C366498p3.A00()
            float[] r10 = X.C366498p3.A00()
            r12 = 1
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter
            r7 = r0
            r8 = r1
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12)
            goto L_0x0135
        L_0x00e3:
            java.lang.String r0 = "zoom_transition"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r5 = 0
            r12 = 1098907648(0x41800000, float:16.0)
            r4 = 1065353216(0x3f800000, float:1.0)
            float[] r9 = X.C366498p3.A00()
            float[] r10 = X.C366498p3.A00()
            r14 = 1
            r8 = 0
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter
            r7 = r0
            r8 = r1
            r11 = r5
            r13 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            goto L_0x0135
        L_0x010e:
            java.lang.String r0 = "flare_transition"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            r5 = 0
            float[] r9 = X.C366498p3.A00()
            float[] r10 = X.C366498p3.A00()
            r12 = 1
            r8 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r1 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r3 = r2
            r6 = r5
            r7 = r5
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter r0 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter
            r7 = r0
            r8 = r1
            r11 = r5
            r7.<init>(r8, r9, r10, r11, r12)
        L_0x0135:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter r0 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TransitionFilter) r0
            if (r0 == 0) goto L_0x000f
            r3 = r25
            if (r3 != r2) goto L_0x018f
            r1 = r27
            long r1 = (long) r1
            long r17 = r29 + r1
        L_0x0142:
            r5 = 0
            r10 = 0
            r9 = -1
            r13 = 1
            X.8o6 r4 = new X.8o6
            r6 = r21
            r11 = r33
            r7 = r5
            r8 = r5
            r12 = r10
            r14 = r10
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = r22
            X.8pF r1 = r1.A00(r0)
            r4.A03 = r1
            X.8o9 r2 = r4.A06
            int r1 = r3.intValue()
            if (r1 == 0) goto L_0x018a
            r13 = 0
            int r1 = 1 - r1
            if (r1 != 0) goto L_0x018c
            r14 = 1056964608(0x3f000000, float:0.5)
        L_0x016a:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            boolean r19 = X.AnonymousClass7TF.A1W(r3, r1)
            java.util.ArrayList r2 = r2.A00
            X.A7q r1 = new X.A7q
            r11 = r1
            r12 = r0
            r11.<init>(r12, r13, r14, r15, r17, r19)
            r2.add(r1)
            java.util.concurrent.TimeUnit r14 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.4aF r0 = new X.4aF
            r13 = r0
            r13.<init>(r14, r15, r17)
            X.A9f r1 = new X.A9f
            r1.<init>(r4, r0)
            return r1
        L_0x018a:
            r13 = 1056964608(0x3f000000, float:0.5)
        L_0x018c:
            r14 = 1065353216(0x3f800000, float:1.0)
            goto L_0x016a
        L_0x018f:
            r1 = r28
            long r1 = (long) r1
            long r15 = r31 - r1
            goto L_0x0142
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ADZ.A00(X.8o1, X.8pA, java.lang.Float, java.lang.Float, java.lang.Integer, java.lang.String, int, int, long, long, boolean):X.A9f");
    }
}
