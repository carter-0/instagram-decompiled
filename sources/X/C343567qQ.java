package X;

/* renamed from: X.7qQ  reason: invalid class name and case insensitive filesystem */
public final class C343567qQ {
    public int A00;
    public final C343577qR[] A01 = new C343577qR[3];

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.7qR[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.7qR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.7qR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: X.7qR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: X.7qR} */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b7, code lost:
        if (r4.intValue() != 3) goto L_0x00b9;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C343577qR A00(X.C343337q3 r7) {
        /*
            r6 = this;
            X.7qR[] r1 = r6.A01
            int r0 = r6.A00
            r5 = r1[r0]
            if (r5 != 0) goto L_0x000f
            X.7qR r5 = new X.7qR
            r5.<init>()
            r1[r0] = r5
        L_0x000f:
            X.937 r1 = X.C343577qR.A0Q
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_INTRINSIC_CALIBRATION
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.937 r1 = X.C343577qR.A0N
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCUS_RANGE
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.937 r1 = X.C343577qR.A0O
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_ROLLING_SHUTTER_SKEW
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.937 r1 = X.C343577qR.A0M
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCAL_LENGTH
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.937 r1 = X.C343577qR.A0K
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_EXPOSURE_TIME
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.937 r1 = X.C343577qR.A0P
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_TIMESTAMP
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST
            java.lang.Object r3 = r7.A00(r0)
            java.lang.Number r3 = (java.lang.Number) r3
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.SENSOR_SENSITIVITY
            java.lang.Object r0 = r7.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0079
            X.937 r2 = X.C343577qR.A0R
            if (r3 == 0) goto L_0x0076
            int r1 = r0.intValue()
            int r0 = r3.intValue()
            int r1 = r1 * r0
            int r0 = r1 / 100
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L_0x0076:
            r5.A01(r2, r0)
        L_0x0079:
            X.937 r1 = X.C343577qR.A0F
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_APERTURE
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.937 r1 = X.C343577qR.A0G
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.CONTROL_AWB_MODE
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.937 r1 = X.C343577qR.A0T
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.JPEG_ORIENTATION
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            X.937 r1 = X.C343577qR.A0S
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.LENS_FOCUS_DISTANCE
            java.lang.Object r0 = r7.A00(r0)
            r5.A01(r1, r0)
            android.hardware.camera2.CaptureResult$Key r0 = android.hardware.camera2.CaptureResult.FLASH_STATE
            java.lang.Object r4 = r7.A00(r0)
            java.lang.Number r4 = (java.lang.Number) r4
            X.937 r3 = X.C343577qR.A0J
            r2 = 3
            if (r4 == 0) goto L_0x00b9
            int r1 = r4.intValue()
            r0 = 1
            if (r1 == r2) goto L_0x00ba
        L_0x00b9:
            r0 = 0
        L_0x00ba:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r5.A01(r3, r0)
            X.937 r0 = X.C343577qR.A0L
            r5.A01(r0, r4)
            int r0 = r6.A00
            int r0 = r0 + 1
            int r0 = r0 % r2
            r6.A00 = r0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C343567qQ.A00(X.7q3):X.7qR");
    }
}
