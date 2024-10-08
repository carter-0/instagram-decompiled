package X;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;

/* renamed from: X.7qS  reason: invalid class name and case insensitive filesystem */
public abstract class C343587qS {
    public static int A00(CameraManager cameraManager, CaptureRequest.Builder builder, C342707p2 r7, C342687p0 r8, String str, int i) {
        CaptureRequest.Key key;
        if (r7 == null || r8 == null) {
            throw new IllegalStateException("Trying to update builder after camera closed.");
        }
        int i2 = 0;
        if (i != 0) {
            Object A02 = r7.A02(C342717p3.A0z);
            A02.getClass();
            int intValue = ((Number) A02).intValue();
            if (intValue == -1) {
                return intValue;
            }
            if (intValue == 1 && ((Boolean) r8.A01(C342687p0.A0E)).booleanValue()) {
                i2 = 1;
            }
            key = CaptureRequest.CONTROL_AWB_MODE;
        } else {
            Object A022 = r7.A02(C342717p3.A0D);
            A022.getClass();
            int intValue2 = ((Number) A022).intValue();
            if (intValue2 == 4) {
                if (((Boolean) r8.A01(C342687p0.A0C)).booleanValue()) {
                    i2 = 4;
                }
            } else if (intValue2 == 3) {
                if (((Boolean) r8.A01(C342687p0.A0D)).booleanValue()) {
                    i2 = 3;
                }
            } else if (intValue2 == 1) {
                if (((Boolean) r8.A01(C342687p0.A0B)).booleanValue()) {
                    i2 = 1;
                }
            } else if (intValue2 == 0 && ((Boolean) r8.A01(C342687p0.A0N)).booleanValue()) {
                Object A023 = r7.A02(C342717p3.A0d);
                A023.getClass();
                Number number = (Number) A023;
                float floatValue = number.floatValue();
                CameraCharacteristics.Key key2 = CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE;
                if (str != null) {
                    Object obj = C342647ow.A00(cameraManager, str).get(key2);
                    obj.getClass();
                    if (floatValue >= ((Number) obj).floatValue()) {
                        builder.set(CaptureRequest.LENS_FOCUS_DISTANCE, number);
                    }
                } else {
                    throw new RuntimeException("Camera ID must be provided to check supported modes.");
                }
            }
            key = CaptureRequest.CONTROL_AF_MODE;
        }
        builder.set(key, Integer.valueOf(i2));
        return i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:102:0x02ec, code lost:
        X.C340577lU.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x02ef, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0048, code lost:
        r8.set(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x032e, code lost:
        r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x033c, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x03af, code lost:
        r8.set(r1, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x03b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a9, code lost:
        if (r2 != 0) goto L_0x00ab;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01bb, code lost:
        if (((java.lang.Number) r0).intValue() != 3) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01f4, code lost:
        if (r0 != false) goto L_0x0249;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0249, code lost:
        r2 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0261, code lost:
        r2 = r9.A02(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x02ca, code lost:
        if (((java.lang.Number) r0).intValue() != 3) goto L_0x02cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(android.hardware.camera2.CaptureRequest.Builder r8, X.C342707p2 r9, X.C342687p0 r10, int r11) {
        /*
            if (r9 == 0) goto L_0x03bf
            if (r10 == 0) goto L_0x03bf
            r2 = 3
            r6 = 2
            r5 = 1
            r7 = 0
            switch(r11) {
                case 0: goto L_0x0341;
                case 1: goto L_0x024f;
                case 2: goto L_0x029b;
                case 3: goto L_0x0065;
                case 4: goto L_0x0228;
                case 5: goto L_0x02f0;
                case 6: goto L_0x01d5;
                case 7: goto L_0x018c;
                case 8: goto L_0x0171;
                case 9: goto L_0x0057;
                case 10: goto L_0x0142;
                case 11: goto L_0x0107;
                case 12: goto L_0x00f3;
                case 13: goto L_0x00c0;
                case 14: goto L_0x01f7;
                default: goto L_0x000b;
            }
        L_0x000b:
            X.7p4 r0 = X.C342717p3.A0n
            java.lang.Object r2 = r9.A02(r0)
            int[] r2 = (int[]) r2
            X.7p1 r0 = X.C342687p0.A12
            java.lang.Object r0 = r10.A01(r0)
            java.util.List r0 = (java.util.List) r0
            boolean r0 = X.C340837lu.A03(r0, r2)
            if (r0 == 0) goto L_0x004b
            r2.getClass()
            X.7p1 r0 = X.C342687p0.A0m
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r1 = r0.booleanValue()
            r0 = r2[r7]
            if (r1 == 0) goto L_0x004c
            int r0 = r0 / 1000
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r2[r5]
            int r0 = r0 / 1000
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0042:
            android.util.Range r1 = android.util.Range.create(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
        L_0x0048:
            r8.set(r0, r1)
        L_0x004b:
            return
        L_0x004c:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = r2[r5]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L_0x0042
        L_0x0057:
            java.util.HashSet r0 = X.C348147xx.A01
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 != 0) goto L_0x004b
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            X.7p4 r0 = X.C342717p3.A08
            goto L_0x0261
        L_0x0065:
            java.util.HashSet r0 = X.C348147xx.A01
            boolean r0 = X.C348137xw.A02(r0)
            X.7p4 r2 = X.C342717p3.A0s
            java.lang.Object r1 = r9.A02(r2)
            r1.getClass()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r0 != 0) goto L_0x0267
            int r2 = r1.intValue()
            r0 = 17
            if (r2 != r0) goto L_0x00a9
            X.7p4 r0 = X.C342717p3.A0W
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ab
            X.7p1 r0 = X.C342687p0.A0K
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00ab
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            r0 = 18
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            goto L_0x03af
        L_0x00a9:
            if (r2 == 0) goto L_0x00bc
        L_0x00ab:
            X.7p1 r0 = X.C342687p0.A17
            java.lang.Object r0 = r10.A01(r0)
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x00bc
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x0048
        L_0x00bc:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            goto L_0x0249
        L_0x00c0:
            X.7p1 r0 = X.C342687p0.A0A
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            X.7p4 r0 = X.C342717p3.A05
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x004b
            X.7p4 r0 = X.C342717p3.A06
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            int[] r0 = (int[]) r0
            android.hardware.camera2.params.ColorSpaceTransform r2 = new android.hardware.camera2.params.ColorSpaceTransform
            r2.<init>(r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_TRANSFORM
            goto L_0x03af
        L_0x00f3:
            X.7p1 r0 = X.C342687p0.A0A
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_MODE
            X.7p4 r0 = X.C342717p3.A05
            goto L_0x0261
        L_0x0107:
            X.7p1 r0 = X.C342687p0.A0A
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            X.7p4 r0 = X.C342717p3.A05
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 != 0) goto L_0x004b
            X.7p4 r0 = X.C342717p3.A04
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            float[] r0 = (float[]) r0
            r4 = r0[r7]
            r3 = r0[r5]
            r1 = r0[r6]
            r0 = r0[r2]
            android.hardware.camera2.params.RggbChannelVector r2 = new android.hardware.camera2.params.RggbChannelVector
            r2.<init>(r4, r3, r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.COLOR_CORRECTION_GAINS
            goto L_0x03af
        L_0x0142:
            X.7p1 r0 = X.C342687p0.A0Z
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            X.7p4 r1 = X.C342717p3.A08
            java.lang.Object r0 = r9.A02(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x028c
            java.lang.Object r0 = r9.A02(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x028c
            return
        L_0x0171:
            X.7p4 r0 = X.C342717p3.A00
            java.lang.Object r1 = r9.A02(r0)
            r1.getClass()
            X.7p1 r0 = X.C342687p0.A0q
            java.lang.Object r0 = r10.A01(r0)
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x004b
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE
            goto L_0x0048
        L_0x018c:
            X.7p4 r0 = X.C342717p3.A0O
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01d3
            X.7p4 r1 = X.C342717p3.A08
            java.lang.Object r0 = r9.A02(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x01d3
            java.lang.Object r0 = r9.A02(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x01d3
        L_0x01bd:
            X.7p1 r0 = X.C342687p0.A0L
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0296
            if (r5 != 0) goto L_0x0296
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SENSOR_SENSITIVITY
            X.7p4 r0 = X.C342717p3.A0L
            goto L_0x0261
        L_0x01d3:
            r5 = 0
            goto L_0x01bd
        L_0x01d5:
            X.7p1 r0 = X.C342687p0.A0Q
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            X.7p4 r0 = X.C342717p3.A0X
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            if (r0 == 0) goto L_0x033c
            goto L_0x0249
        L_0x01f7:
            X.7p1 r0 = X.C342687p0.A03
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0210
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_LOCK
            X.7p4 r0 = X.C342717p3.A0P
            java.lang.Object r0 = r9.A02(r0)
            r8.set(r1, r0)
        L_0x0210:
            X.7p1 r0 = X.C342687p0.A06
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AWB_LOCK
            X.7p4 r0 = X.C342717p3.A0R
            java.lang.Object r2 = r9.A02(r0)
            goto L_0x03af
        L_0x0228:
            X.7p1 r0 = X.C342687p0.A0b
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            X.7p4 r0 = X.C342717p3.A0Z
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x032e
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
        L_0x0249:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            goto L_0x03af
        L_0x024f:
            X.7p1 r0 = X.C342687p0.A0G
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004b
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION
            X.7p4 r0 = X.C342717p3.A09
        L_0x0261:
            java.lang.Object r2 = r9.A02(r0)
            goto L_0x03af
        L_0x0267:
            int r0 = r1.intValue()
            if (r0 == 0) goto L_0x0331
            X.7p1 r0 = X.C342687p0.A0K
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0331
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
            r8.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
            java.lang.Object r2 = r9.A02(r2)
            goto L_0x03af
        L_0x028c:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.LENS_APERTURE
            X.7p4 r0 = X.C342717p3.A01
            java.lang.Object r2 = r9.A02(r0)
            goto L_0x03af
        L_0x0296:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "ISO_RANGE not supported or AE on"
            goto L_0x02ec
        L_0x029b:
            X.7p4 r0 = X.C342717p3.A0O
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02e6
            X.7p4 r1 = X.C342717p3.A08
            java.lang.Object r0 = r9.A02(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == 0) goto L_0x02e6
            java.lang.Object r0 = r9.A02(r1)
            r0.getClass()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r0 == r2) goto L_0x02e6
        L_0x02cc:
            X.7p1 r0 = X.C342687p0.A0H
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x02e8
            if (r5 != 0) goto L_0x02e8
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SENSOR_EXPOSURE_TIME
            X.7p4 r0 = X.C342717p3.A0A
            java.lang.Object r2 = r9.A02(r0)
            goto L_0x03af
        L_0x02e6:
            r5 = 0
            goto L_0x02cc
        L_0x02e8:
            java.lang.String r1 = "CaptureRequestHelper"
            java.lang.String r0 = "EXPOSURE_TIME not supported or AE on"
        L_0x02ec:
            X.C340577lU.A03(r1, r0)
            return
        L_0x02f0:
            X.7p4 r0 = X.C342717p3.A0Y
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x032e
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 33
            if (r1 < r0) goto L_0x031d
            X.7p1 r0 = X.C342687p0.A0R
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x031d
        L_0x0315:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            goto L_0x03af
        L_0x031d:
            X.7p1 r0 = X.C342687p0.A0S
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = 0
            if (r0 == 0) goto L_0x0315
            r6 = 1
            goto L_0x0315
        L_0x032e:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            goto L_0x033c
        L_0x0331:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            r8.set(r1, r0)
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_SCENE_MODE
        L_0x033c:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r7)
            goto L_0x03af
        L_0x0341:
            X.7p4 r0 = X.C342717p3.A0O
            java.lang.Object r0 = r9.A02(r0)
            r0.getClass()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            X.7p4 r0 = X.C342717p3.A0B
            java.lang.Object r3 = r9.A02(r0)
            r3.getClass()
            java.lang.Number r3 = (java.lang.Number) r3
            int r1 = r3.intValue()
            X.7p1 r0 = X.C342687p0.A0v
            java.lang.Object r0 = r10.A01(r0)
            java.util.List r0 = (java.util.List) r0
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L_0x037e
            if (r1 == 0) goto L_0x03b8
            if (r1 == r5) goto L_0x039e
            if (r1 == r6) goto L_0x0390
            if (r1 != r2) goto L_0x037e
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)
        L_0x037b:
            r8.set(r1, r0)
        L_0x037e:
            r2 = r4
        L_0x037f:
            if (r4 != 0) goto L_0x03a9
            X.7p1 r0 = X.C342687p0.A02
            java.lang.Object r0 = r10.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x03a9
            return
        L_0x0390:
            r2 = 0
            if (r4 == 0) goto L_0x0394
            r2 = 2
        L_0x0394:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r8.set(r1, r0)
            goto L_0x037f
        L_0x039e:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            if (r4 == 0) goto L_0x03b3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r8.set(r1, r0)
        L_0x03a9:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
        L_0x03af:
            r8.set(r1, r2)
            return
        L_0x03b3:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            goto L_0x037b
        L_0x03b8:
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            goto L_0x037b
        L_0x03bf:
            java.lang.String r1 = "Trying to update builder after camera closed."
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343587qS.A01(android.hardware.camera2.CaptureRequest$Builder, X.7p2, X.7p0, int):void");
    }
}
