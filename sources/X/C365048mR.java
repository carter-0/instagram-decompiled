package X;

/* renamed from: X.8mR  reason: invalid class name and case insensitive filesystem */
public abstract class C365048mR {
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003c, code lost:
        if (r3.A0D == true) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0042, code lost:
        if (r3 == false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0071, code lost:
        if (r4.A01 == null) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f1, code lost:
        throw new java.lang.UnsupportedOperationException(X.002.A0R("BackgroundGradientEnum not supported: ", r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0123, code lost:
        r8.A01("gradient_color", r6);
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01a2, code lost:
        if (r20 != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(com.instagram.common.session.UserSession r14, X.0v6 r15, X.C3499582p r16, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel r17, boolean r18, boolean r19, boolean r20) {
        /*
            r2 = 0
            r0 = r17
            X.0qQ.A0B(r0, r2)
            r7 = 4
            X.0qQ.A0B(r14, r7)
            r1 = 1
            r5 = r16
            if (r16 == 0) goto L_0x001f
            X.82o r3 = r5.A02
            X.82Y r3 = r3.A01
            boolean r3 = r3.A08()
            if (r3 != 0) goto L_0x001f
            r1 = 8
            r0.EWl(r1, r2)
            return
        L_0x001f:
            r4 = r15
            if (r18 != 0) goto L_0x002c
            if (r16 == 0) goto L_0x012c
            X.82o r3 = r5.A02
            boolean r3 = r3.A0I()
            if (r3 != r1) goto L_0x012c
        L_0x002c:
            if (r19 != 0) goto L_0x01a2
            if (r16 == 0) goto L_0x01a4
            X.82o r3 = r5.A02
            X.82Y r3 = r3.A01
            X.802 r3 = r3.A02()
            if (r3 == 0) goto L_0x01a4
            boolean r3 = r3.A0D
            if (r3 != r1) goto L_0x01a4
        L_0x003e:
            r3 = 1
        L_0x003f:
            if (r18 != 0) goto L_0x0044
            r10 = 1
            if (r3 != 0) goto L_0x0045
        L_0x0044:
            r10 = 0
        L_0x0045:
            r6 = 0
            if (r15 != 0) goto L_0x005a
            java.lang.String r3 = "FreeTransformUtil_setupTextModeGradientFilter"
            java.lang.String r2 = "textModeGradientColors is null"
            X.0kD.A0C(r3, r2, r6)
        L_0x004f:
            r3 = 8
            if (r19 == 0) goto L_0x0056
            if (r20 == 0) goto L_0x0056
            r1 = 0
        L_0x0056:
            r0.EWl(r3, r1)
            return
        L_0x005a:
            r5 = 8
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r8 = r0.B5u(r5)
            if (r8 == 0) goto L_0x0129
            java.lang.String r9 = r8.getFilterName()
        L_0x0066:
            java.lang.String r3 = "multi_color_gradient"
            boolean r9 = X.0qQ.A0K(r9, r3)
            r15 = 0
            if (r9 == 0) goto L_0x0097
            java.lang.String r9 = r4.A01
            if (r9 != 0) goto L_0x0097
        L_0x0073:
            java.lang.String r2 = r8.getFilterName()
            boolean r2 = X.0qQ.A0K(r2, r3)
            if (r2 == 0) goto L_0x004f
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r8 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel) r8
            X.AGv r3 = X.AGv.A00
            java.util.List r2 = r4.A02
            r3.A01(r8, r2)
            if (r10 == 0) goto L_0x008a
            r15 = 1065353216(0x3f800000, float:1.0)
        L_0x008a:
            java.lang.String r2 = "photoAlpha"
            r8.A00(r2, r15)
            int r3 = r4.A00
            java.lang.String r2 = "displayType"
            r8.A01(r2, r3)
            goto L_0x004f
        L_0x0097:
            java.lang.String r9 = r4.A01
            if (r9 != 0) goto L_0x00c7
            int[] r7 = new int[r7]
            r7 = {0, 0, 0, 0} // fill-array
            java.lang.Integer r12 = X.AnonymousClass05K.A01
            r14 = 1065353216(0x3f800000, float:1.0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r11 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r13 = r12
            r16 = r15
            r17 = r15
            r18 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r8 = 46
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r8 = X.C369418uZ.A00(r11, r3, r6, r8)
            java.lang.String r6 = "displayType"
            r8.A01(r6, r2)
            java.lang.String r2 = "photoAlpha"
            r8.A00(r2, r15)
            X.AGv.A00(r8, r7)
        L_0x00c3:
            r0.EWj(r8, r5)
            goto L_0x0073
        L_0x00c7:
            java.lang.Integer r12 = X.AnonymousClass05K.A0C
            r14 = 1065353216(0x3f800000, float:1.0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r11 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams
            r13 = r12
            r16 = r15
            r17 = r15
            r18 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r7 = "multi_color_gradient_v2"
            r2 = 46
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r8 = X.C369418uZ.A00(r11, r7, r6, r2)
            int r2 = r9.hashCode()
            switch(r2) {
                case -1955522002: goto L_0x011a;
                case -1923613764: goto L_0x0110;
                case 2041946: goto L_0x0106;
                case 2455926: goto L_0x00fc;
                case 1691559318: goto L_0x00f2;
                default: goto L_0x00e6;
            }
        L_0x00e6:
            java.lang.String r0 = "BackgroundGradientEnum not supported: "
            java.lang.String r0 = X.002.A0R(r0, r9)
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x00f2:
            java.lang.String r2 = "RAINBOW"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x00e6
            r6 = 4
            goto L_0x0123
        L_0x00fc:
            java.lang.String r2 = "PINK"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x00e6
            r6 = 1
            goto L_0x0123
        L_0x0106:
            java.lang.String r2 = "BLUE"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x00e6
            r6 = 3
            goto L_0x0123
        L_0x0110:
            java.lang.String r2 = "PURPLE"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x00e6
            r6 = 2
            goto L_0x0123
        L_0x011a:
            java.lang.String r2 = "ORANGE"
            boolean r2 = r9.equals(r2)
            if (r2 == 0) goto L_0x00e6
            r6 = 0
        L_0x0123:
            java.lang.String r2 = "gradient_color"
            r8.A01(r2, r6)
            goto L_0x00c3
        L_0x0129:
            r9 = r6
            goto L_0x0066
        L_0x012c:
            if (r19 != 0) goto L_0x01a2
            r7 = 8
            r3 = 8
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r5 = r0.B5u(r7)
            if (r5 == 0) goto L_0x0144
            java.lang.String r6 = r5.getFilterName()
            java.lang.String r5 = "gradient_transform"
            boolean r5 = X.0qQ.A0K(r6, r5)
            if (r5 == 0) goto L_0x0056
        L_0x0144:
            if (r15 != 0) goto L_0x0150
            java.lang.String r5 = "FreeTransformUtilsetupGradientBackgroundFilter"
            java.lang.String r4 = "textModeGradientColors is null"
            r2 = 0
            X.0kD.A0C(r5, r4, r2)
            goto L_0x0056
        L_0x0150:
            com.instagram.common.util.gradient.BackgroundGradientColors r4 = X.0oY.A00(r15)
            if (r4 == 0) goto L_0x01a7
            int r9 = r4.A01
            int r8 = r4.A00
            X.0Tu r6 = X.0Tu.A05
            r4 = 36324243525021604(0x810cb5000b2fa4, double:3.034936098987657E-306)
            boolean r4 = X.182.A06(r6, r14, r4)
            if (r4 == 0) goto L_0x018f
            float[] r9 = X.C369398uX.A00(r9)
            float[] r10 = X.C369398uX.A00(r8)
            r11 = 0
            r12 = r11
            r13 = r11
            r14 = r2
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel r8 = X.C369408uY.A02(r9, r10, r11, r12, r13, r14)
        L_0x0177:
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel r8 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel) r8
            r0.EWj(r8, r7)
            r8 = 0
            r12 = 63
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter r7 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter
            r9 = r8
            r10 = r8
            r7.<init>(r8, r9, r10, r11, r12)
            r7.A0A = r2
            r2 = 28
            r0.EWj(r7, r2)
            goto L_0x0056
        L_0x018f:
            float[] r9 = X.C366558pG.A00(r9)
            float[] r10 = X.C366558pG.A00(r8)
            r11 = 0
            r14 = 8188(0x1ffc, float:1.1474E-41)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter
            r12 = r11
            r13 = r11
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x0177
        L_0x01a2:
            if (r20 != 0) goto L_0x003e
        L_0x01a4:
            r3 = 0
            goto L_0x003f
        L_0x01a7:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C365048mR.A00(com.instagram.common.session.UserSession, X.0v6, X.82p, com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel, boolean, boolean, boolean):void");
    }
}
