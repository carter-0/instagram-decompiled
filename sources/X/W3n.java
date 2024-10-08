package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Range;
import android.util.Size;

public abstract class W3n {
    public static final String A00 = new C343047pa(0, 0).toString();

    public static C343047pa A06(Size[] sizeArr) {
        int length;
        if (sizeArr == null || (length = sizeArr.length) == 0) {
            return new C343047pa(0, 0);
        }
        Size size = sizeArr[0];
        for (int i = 1; i < length; i++) {
            Size size2 = sizeArr[i];
            if (size2.getWidth() * size2.getHeight() > size.getWidth() * size.getHeight()) {
                size = size2;
            }
        }
        return new C343047pa(size.getWidth(), size.getHeight());
    }

    public static long A01(Context context, SharedPreferences sharedPreferences, C17304VQf vQf) {
        String str = vQf.A01;
        if (!sharedPreferences.contains(str)) {
            A07(context, sharedPreferences);
        }
        return sharedPreferences.getLong(str, -2);
    }

    public static Vk8 A03(Context context, SharedPreferences sharedPreferences, C17304VQf vQf) {
        int i;
        int indexOf;
        int i2;
        String str = vQf.A01;
        String string = sharedPreferences.getString(str, "com.facebook.devicesegmentation.NOT_STORED");
        string.getClass();
        if (!string.equals("com.facebook.devicesegmentation.NOT_STORED") && (indexOf = string.indexOf(120)) > 0 && string.length() > (i2 = indexOf + 1)) {
            return new Vk8(Float.parseFloat(string.substring(0, indexOf)), Float.parseFloat(string.substring(i2)));
        }
        A07(context, sharedPreferences);
        String string2 = sharedPreferences.getString(str, "com.facebook.devicesegmentation.NOT_STORED");
        string2.getClass();
        try {
            int indexOf2 = string2.indexOf(120);
            if (indexOf2 > 0 && string2.length() > (i = indexOf2 + 1)) {
                return new Vk8(Float.parseFloat(string2.substring(0, indexOf2)), Float.parseFloat(string2.substring(i)));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static C343047pa A04(Context context, SharedPreferences sharedPreferences, C17304VQf vQf) {
        String str = vQf.A01;
        String string = sharedPreferences.getString(str, "com.facebook.devicesegmentation.NOT_STORED");
        string.getClass();
        if (!string.equals("com.facebook.devicesegmentation.NOT_STORED")) {
            try {
                return C343047pa.A01(string);
            } catch (NumberFormatException unused) {
            }
        }
        A07(context, sharedPreferences);
        try {
            return C343047pa.A01(sharedPreferences.getString(str, "com.facebook.devicesegmentation.NOT_STORED"));
        } catch (NumberFormatException unused2) {
            return null;
        }
    }

    public static void A07(Context context, SharedPreferences sharedPreferences) {
        Object systemService = context.getSystemService("camera");
        systemService.getClass();
        CameraManager cameraManager = (CameraManager) systemService;
        try {
            String[] cameraIdList = cameraManager.getCameraIdList();
            int length = cameraIdList.length;
            CameraCharacteristics cameraCharacteristics = null;
            CameraCharacteristics cameraCharacteristics2 = null;
            int i = 0;
            while (true) {
                if (i < length) {
                    CameraCharacteristics cameraCharacteristics3 = cameraManager.getCameraCharacteristics(cameraIdList[i]);
                    Object obj = cameraCharacteristics3.get(CameraCharacteristics.LENS_FACING);
                    obj.getClass();
                    if (AnonymousClass7TE.A0M(obj) == 0) {
                        if (cameraCharacteristics2 == null) {
                            cameraCharacteristics2 = cameraCharacteristics3;
                        }
                        if (cameraCharacteristics != null) {
                            break;
                        }
                    } else {
                        if (cameraCharacteristics == null) {
                            cameraCharacteristics = cameraCharacteristics3;
                        }
                        if (cameraCharacteristics2 != null) {
                            break;
                        }
                    }
                    i++;
                } else if (cameraCharacteristics2 != null) {
                }
            }
            A08(context, sharedPreferences, cameraCharacteristics2, false);
            if (cameraCharacteristics != null) {
                A08(context, sharedPreferences, cameraCharacteristics, true);
            }
        } catch (CameraAccessException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0060, code lost:
        if (A0C(android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION, r6, 1) != false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0074, code lost:
        if (r0.intValue() != 1) goto L_0x0076;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(android.content.Context r45, android.content.SharedPreferences r46, android.hardware.camera2.CameraCharacteristics r47, boolean r48) {
        /*
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE
            r6 = r47
            java.lang.Object r0 = r6.get(r0)
            r0.getClass()
            android.util.Size r0 = (android.util.Size) r0
            int r2 = r0.getWidth()
            int r1 = r0.getHeight()
            X.7pa r43 = new X.7pa
            r0 = r43
            r0.<init>(r2, r1)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE
            java.lang.Object r42 = r6.get(r0)
            r42.getClass()
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r12 = r6.get(r0)
            r12.getClass()
            android.hardware.camera2.params.StreamConfigurationMap r12 = (android.hardware.camera2.params.StreamConfigurationMap) r12
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r0 = r6.get(r0)
            android.util.Range[] r0 = (android.util.Range[]) r0
            float r41 = A00(r0)
            r0 = 35
            X.7pa r40 = A05(r12, r0)
            r0 = r40
            int r1 = r0.A02
            int r0 = r0.A01
            int r1 = r1 * r0
            float r0 = (float) r1
            float r0 = r0 * r41
            int r0 = (int) r0
            r44 = r0
            java.util.HashSet r0 = X.C348147xx.A02
            boolean r0 = X.C348137xw.A02(r0)
            r5 = 1
            if (r0 != 0) goto L_0x0062
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION
            boolean r0 = A0C(r0, r6, r5)
            r39 = 0
            if (r0 == 0) goto L_0x0064
        L_0x0062:
            r39 = 1
        L_0x0064:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE
            java.lang.Object r0 = r6.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0076
            int r0 = r0.intValue()
            r37 = 1
            if (r0 == r5) goto L_0x0078
        L_0x0076:
            r37 = 0
        L_0x0078:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.STATISTICS_INFO_AVAILABLE_FACE_DETECT_MODES
            boolean r36 = A0C(r0, r6, r5)
            r4 = 2
            boolean r35 = A0C(r0, r6, r4)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.STATISTICS_INFO_MAX_FACE_COUNT
            java.lang.Object r34 = r6.get(r0)
            r0 = r34
            java.lang.Number r0 = (java.lang.Number) r0
            r34 = r0
            int r38 = android.os.Build.VERSION.SDK_INT
            r8 = 1120403456(0x42c80000, float:100.0)
            r7 = 0
            java.lang.Float r2 = java.lang.Float.valueOf(r7)
            r1 = 30
            r0 = r38
            if (r0 >= r1) goto L_0x0144
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM
            java.lang.Object r0 = r6.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0179
            float r3 = r0.floatValue()
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0179
            java.lang.Float r1 = java.lang.Float.valueOf(r8)
            float r3 = r3 * r8
            java.lang.Float r0 = java.lang.Float.valueOf(r3)
            android.util.Range r24 = android.util.Range.create(r1, r0)
        L_0x00bd:
            java.lang.Comparable r0 = r24.getLower()
            float r0 = X.AnonymousClass7TE.A04(r0)
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            boolean r32 = X.AnonymousClass7TF.A1R(r0)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_SENSITIVITY_RANGE
            java.lang.Object r10 = r6.get(r0)
            android.util.Range r10 = (android.util.Range) r10
            boolean r21 = X.AnonymousClass7TF.A1V(r10)
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_EXPOSURE_TIME_RANGE
            java.lang.Object r2 = r6.get(r0)
            android.util.Range r2 = (android.util.Range) r2
            r0 = 0
            if (r2 == 0) goto L_0x013d
            java.lang.Comparable r3 = r2.getLower()
            long r16 = X.AnonymousClass7TE.A0R(r3)
            java.lang.Comparable r2 = r2.getUpper()
            long r18 = X.AnonymousClass7TE.A0R(r2)
            r20 = 1
        L_0x00f5:
            r27 = r46
            android.content.SharedPreferences$Editor r3 = r27.edit()
            r14 = 12
            int[] r13 = new int[r14]
            r13 = {18, 6, 16, 11, 4, 7, 17, 8, 5, 13, 19, 9} // fill-array
            java.util.HashMap r11 = new java.util.HashMap
            r11.<init>()
            r9 = 0
            r7 = 0
        L_0x0109:
            r2 = r13[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.DbU.A1Y(r2, r11, r9)
            int r7 = r7 + 1
            if (r7 < r14) goto L_0x0109
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES
            java.lang.Object r8 = r6.get(r2)
            r8.getClass()
            int[] r8 = (int[]) r8
            int r15 = r8.length
            r7 = 0
        L_0x0123:
            if (r7 >= r15) goto L_0x017f
            r2 = r8[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r2 = r11.containsKey(r2)
            if (r2 == 0) goto L_0x013a
            r2 = r8[r7]
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            X.DbU.A1Y(r2, r11, r5)
        L_0x013a:
            int r7 = r7 + 1
            goto L_0x0123
        L_0x013d:
            r16 = 0
            r18 = 0
            r20 = 0
            goto L_0x00f5
        L_0x0144:
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_ZOOM_RATIO_RANGE
            java.lang.Object r1 = r6.get(r0)
            android.util.Range r1 = (android.util.Range) r1
            if (r1 == 0) goto L_0x0179
            java.lang.Comparable r0 = r1.getLower()
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Comparable r1 = r1.getUpper()
            java.lang.Number r1 = (java.lang.Number) r1
            if (r0 == 0) goto L_0x0179
            if (r1 == 0) goto L_0x0179
            float r0 = r0.floatValue()
            float r0 = r0 * r8
            java.lang.Float r2 = java.lang.Float.valueOf(r0)
            float r0 = r1.floatValue()
            float r0 = r0 * r8
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
            android.util.Range r24 = new android.util.Range
            r0 = r24
            r0.<init>(r2, r1)
            goto L_0x00bd
        L_0x0179:
            android.util.Range r24 = android.util.Range.create(r2, r2)
            goto L_0x00bd
        L_0x017f:
            boolean[] r8 = new boolean[r14]
        L_0x0181:
            r2 = r13[r9]
            java.lang.Object r2 = X.C51968G9o.A0z(r11, r2)
            r2.getClass()
            boolean r2 = X.AnonymousClass7TE.A1a(r2)
            r8[r9] = r2
            int r9 = r9 + 1
            if (r9 < r14) goto L_0x0181
            r13 = 0
            boolean r2 = r8[r13]
            if (r2 == 0) goto L_0x01b7
            r7 = 33
            r2 = r38
            if (r2 < r7) goto L_0x01b7
            android.hardware.camera2.CameraCharacteristics$Key r2 = android.hardware.camera2.CameraCharacteristics.REQUEST_AVAILABLE_DYNAMIC_RANGE_PROFILES
            java.lang.Object r2 = r6.get(r2)
            android.hardware.camera2.params.DynamicRangeProfiles r2 = (android.hardware.camera2.params.DynamicRangeProfiles) r2
            if (r2 == 0) goto L_0x01b7
            java.util.Set r7 = r2.getSupportedProfiles()
            r13 = 2
            java.lang.Long r2 = java.lang.Long.valueOf(r13)
            boolean r13 = r7.contains(r2)
        L_0x01b7:
            r26 = 11
            r25 = 10
            r23 = 9
            r22 = 8
            r15 = 7
            r14 = 6
            r9 = 5
            r7 = 4
            r2 = 3
            if (r48 == 0) goto L_0x0658
            java.lang.String r11 = "camera_back_hlg_hdr_video_supported"
            r3.putBoolean(r11, r13)
            java.lang.String r13 = "camera_back_burst_capture_supported"
            boolean r11 = r8[r5]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_ultra_high_resolution_sensor_supported"
            boolean r11 = r8[r4]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_logical_multi_camera_supported"
            boolean r11 = r8[r2]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_zsl_private_reprocessing_supported"
            boolean r11 = r8[r7]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_zsl_yuv_reprocessing_supported"
            boolean r11 = r8[r9]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_remosaic_reprocessing_supported"
            boolean r11 = r8[r14]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_depth_output_supported"
            boolean r11 = r8[r15]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_read_sensor_settings_supported"
            boolean r11 = r8[r22]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_secure_image_data_supported"
            boolean r11 = r8[r23]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_back_stream_use_case_supported"
            boolean r11 = r8[r25]
            r3.putBoolean(r13, r11)
            X.VQf r11 = X.W2z.A0I
        L_0x0213:
            java.lang.String r11 = r11.A01
            boolean r8 = r8[r26]
            r3.putBoolean(r11, r8)
            if (r48 == 0) goto L_0x0654
            X.VQf r8 = X.W2z.A0I
        L_0x021e:
            java.lang.String r13 = r8.A01
            r8 = 0
            r11 = r27
            boolean r33 = r11.getBoolean(r13, r8)
            java.lang.String r14 = A00
            if (r33 == 0) goto L_0x0650
            android.util.Size[] r11 = r12.getHighSpeedVideoSizes()
            X.7pa r11 = A06(r11)
            java.lang.String r14 = r11.toString()
            android.util.Range[] r11 = r12.getHighSpeedVideoFpsRanges()
            float r31 = A00(r11)
        L_0x023f:
            java.lang.Boolean r13 = java.lang.Boolean.TRUE
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_LOCK_AVAILABLE
            java.lang.Object r11 = r6.get(r11)
            boolean r30 = r13.equals(r11)
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.CONTROL_AWB_LOCK_AVAILABLE
            java.lang.Object r11 = r6.get(r11)
            boolean r29 = r13.equals(r11)
            android.hardware.camera2.CameraCharacteristics$Key r11 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_AVAILABLE_APERTURES
            java.lang.Object r13 = r6.get(r11)
            float[] r13 = (float[]) r13
            r11 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r13 == 0) goto L_0x064a
            int r11 = r13.length
            boolean r28 = X.C51970G9q.A1W(r11, r5)
            r27 = r13[r8]
            int r11 = r11 - r5
            r11 = r13[r11]
        L_0x026b:
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AF
            java.lang.Object r13 = r6.get(r13)
            r13.getClass()
            int r26 = X.AnonymousClass7TE.A0M(r13)
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AE
            java.lang.Object r13 = r6.get(r13)
            r13.getClass()
            int r25 = X.AnonymousClass7TE.A0M(r13)
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.CONTROL_MAX_REGIONS_AWB
            java.lang.Object r13 = r6.get(r13)
            r13.getClass()
            int r23 = X.AnonymousClass7TE.A0M(r13)
            android.hardware.camera2.CameraCharacteristics$Key r13 = android.hardware.camera2.CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL
            java.lang.Object r13 = r6.get(r13)
            r13.getClass()
            int r13 = X.AnonymousClass7TE.A0M(r13)
            boolean r22 = X.Pxf.A1R(r13)
            if (r48 == 0) goto L_0x0480
            java.lang.String r15 = "camera_back_sensor_resolution"
            java.lang.String r13 = r43.toString()
            r3.putString(r15, r13)
            java.lang.String r15 = "camera_back_sensor_physical_size_mm"
            java.lang.String r13 = r42.toString()
            r3.putString(r15, r13)
            java.lang.String r15 = "camera_back_jpeg_photo_max_pixel_resolution"
            r13 = 256(0x100, float:3.59E-43)
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_back_raw_photo_max_pixel_resolution"
            r13 = 32
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_back_raw10_photo_max_pixel_resolution"
            r13 = 37
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_back_raw12_photo_max_pixel_resolution"
            r13 = 38
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_back_heic_photo_max_pixel_resolution"
            r13 = 1212500294(0x48454946, float:202021.1)
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_back_ultra_hdr_photo_max_pixel_resolution"
            r13 = 4101(0x1005, float:5.747E-42)
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_back_preview_stream_max_pixel_resolution"
            java.lang.Class<android.graphics.SurfaceTexture> r13 = android.graphics.SurfaceTexture.class
            A0A(r3, r12, r13, r15)
            java.lang.String r15 = "camera_back_video_stream_max_pixel_resolution"
            java.lang.Class<android.media.MediaRecorder> r13 = android.media.MediaRecorder.class
            A0A(r3, r12, r13, r15)
            java.lang.String r15 = "camera_back_cpu_stream_max_pixel_resolution"
            java.lang.String r13 = r40.toString()
            r3.putString(r15, r13)
            java.lang.String r13 = "camera_back_constrained_high_speed_video_max_pixel_resolution"
            r3.putString(r13, r14)
            java.lang.String r14 = "camera_back_constrained_high_speed_video_max_fps"
            r13 = r31
            r3.putFloat(r14, r13)
            java.lang.String r13 = "camera_back_constrained_high_speed_video_max_throughput_pps"
            if (r33 == 0) goto L_0x030d
            long r0 = A02(r12)
        L_0x030d:
            r3.putLong(r13, r0)
            java.lang.String r1 = "camera_back_max_fps"
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r0 = r6.get(r0)
            r0.getClass()
            android.util.Range[] r0 = (android.util.Range[]) r0
            float r0 = A00(r0)
            r3.putFloat(r1, r0)
            r0 = r41
            r3.putFloat(r1, r0)
            java.lang.String r12 = "camera_back_max_throughput_pps"
            r0 = r44
            long r0 = (long) r0
            r3.putLong(r12, r0)
            java.lang.String r12 = "camera_back_preview_stabilization_supported"
            r1 = 1
            r13 = 33
            r0 = r38
            if (r0 < r13) goto L_0x0464
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            boolean r0 = A0C(r0, r6, r4)
            if (r0 == 0) goto L_0x0464
        L_0x0342:
            r3.putBoolean(r12, r1)
            java.lang.String r1 = "camera_back_optical_stabilization_supported"
            r0 = r39
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_realtime_timestamp_supported"
            r0 = r37
            r3.putBoolean(r1, r0)
            java.lang.String r0 = "camera_back_high_quality_noise_reduction_supported"
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES
            A09(r3, r1, r6, r0, r4)
            java.lang.String r0 = "camera_back_zsl_noise_reduction_supported"
            A09(r3, r1, r6, r0, r7)
            java.lang.String r0 = "camera_back_minimal_noise_reduction_supported"
            A09(r3, r1, r6, r0, r2)
            java.lang.String r0 = "camera_back_fast_noise_reduction_supported"
            A09(r3, r1, r6, r0, r5)
            java.lang.String r0 = "camera_back_high_quality_tonemap_mode_supported"
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.TONEMAP_AVAILABLE_TONE_MAP_MODES
            A09(r3, r1, r6, r0, r4)
            java.lang.String r0 = "camera_back_fast_tonemap_mode_supported"
            A09(r3, r1, r6, r0, r5)
            java.lang.String r0 = "camera_back_contrast_curve_tonemap_mode_supported"
            A09(r3, r1, r6, r0, r8)
            java.lang.String r0 = "camera_back_gamma_value_tonemap_mode_supported"
            A09(r3, r1, r6, r0, r2)
            java.lang.String r0 = "camera_back_preset_curve_tonemap_mode_supported"
            A09(r3, r1, r6, r0, r7)
            java.lang.String r1 = "camera_back_face_detection_mode_simple_supported"
            r0 = r36
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_face_detection_mode_full_supported"
            r0 = r35
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_face_detection_max_face_count"
            if (r34 != 0) goto L_0x045e
            r0 = 0
        L_0x0397:
            r3.putInt(r1, r0)
            java.lang.String r1 = "camera_back_zoom_supported"
            r0 = r32
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_smooth_zoom_support"
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_zoom_min_ratio"
            java.lang.Comparable r0 = r24.getLower()
            float r0 = X.AnonymousClass7TE.A04(r0)
            r3.putFloat(r1, r0)
            java.lang.String r1 = "camera_back_zoom_max_ratio"
            java.lang.Comparable r0 = r24.getUpper()
            float r0 = X.AnonymousClass7TE.A04(r0)
            r3.putFloat(r1, r0)
            java.lang.String r1 = "camera_back_iso_sensitivity_control_supported"
            r0 = r21
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_min_iso_sensitivity"
            if (r10 == 0) goto L_0x045b
            java.lang.Comparable r0 = r10.getLower()
            int r0 = X.AnonymousClass7TE.A0M(r0)
        L_0x03d3:
            r3.putInt(r1, r0)
            java.lang.String r0 = "camera_back_max_iso_sensitivity"
            if (r10 == 0) goto L_0x0459
            int r1 = X.Pxg.A03(r10)
        L_0x03de:
            r3.putInt(r0, r1)
            java.lang.String r1 = "camera_back_exposure_control_supported"
            r0 = r20
            r3.putBoolean(r1, r0)
            java.lang.String r10 = "camera_back_min_exposure_time_nanoseconds"
            r0 = r16
            r3.putLong(r10, r0)
            java.lang.String r10 = "camera_back_max_exposure_time_nanoseconds"
            r0 = r18
            r3.putLong(r10, r0)
            java.lang.String r0 = "camera_back_focus_mode_off_supported"
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            A09(r3, r1, r6, r0, r8)
            java.lang.String r0 = "camera_back_focus_mode_auto_supported"
            A09(r3, r1, r6, r0, r5)
            java.lang.String r0 = "camera_back_focus_mode_macro_supported"
            A09(r3, r1, r6, r0, r4)
            java.lang.String r0 = "camera_back_focus_mode_edof_supported"
            A09(r3, r1, r6, r0, r9)
            java.lang.String r0 = "camera_back_focus_mode_continuous_picture_supported"
            A09(r3, r1, r6, r0, r7)
            java.lang.String r0 = "camera_back_focus_mode_continuous_video_supported"
            A09(r3, r1, r6, r0, r2)
            java.lang.String r1 = "camera_back_auto_exposure_lock_supported"
            r0 = r30
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_auto_white_balance_lock_supported"
            r0 = r29
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_variable_aperture_supported"
            r0 = r28
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_back_min_aperture_f"
            r0 = r27
            r3.putFloat(r1, r0)
            java.lang.String r0 = "camera_back_max_aperture_f"
            r3.putFloat(r0, r11)
            java.lang.String r1 = "camera_back_max_num_focus_areas"
            r0 = r26
            r3.putInt(r1, r0)
            java.lang.String r1 = "camera_back_max_num_exposure_metering_areas"
            r0 = r25
            r3.putInt(r1, r0)
            java.lang.String r1 = "camera_back_max_num_white_balance_metering_areas"
            r0 = r23
            r3.putInt(r1, r0)
            X.VQf r0 = X.W2z.A1B
        L_0x044e:
            java.lang.String r1 = r0.A01
            r0 = r22
            r3.putBoolean(r1, r0)
            r3.commit()
            return
        L_0x0459:
            r1 = 0
            goto L_0x03de
        L_0x045b:
            r0 = 0
            goto L_0x03d3
        L_0x045e:
            int r0 = r34.intValue()
            goto L_0x0397
        L_0x0464:
            android.content.pm.PackageManager r13 = r45.getPackageManager()
            r13.getClass()
            java.util.HashSet r0 = X.C343077pd.A05
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 != 0) goto L_0x047d
            java.lang.String r0 = "vendor.android.hardware.camera.preview-dis.back"
            boolean r0 = r13.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x047d
            goto L_0x0342
        L_0x047d:
            r1 = 0
            goto L_0x0342
        L_0x0480:
            java.lang.String r15 = "camera_front_sensor_resolution"
            java.lang.String r13 = r43.toString()
            r3.putString(r15, r13)
            java.lang.String r15 = "camera_front_sensor_physical_size_mm"
            java.lang.String r13 = r42.toString()
            r3.putString(r15, r13)
            java.lang.String r15 = "camera_front_jpeg_photo_max_pixel_resolution"
            r13 = 256(0x100, float:3.59E-43)
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_front_raw_photo_max_pixel_resolution"
            r13 = 32
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_front_raw10_photo_max_pixel_resolution"
            r13 = 37
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_front_raw12_photo_max_pixel_resolution"
            r13 = 38
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_front_heic_photo_max_pixel_resolution"
            r13 = 1212500294(0x48454946, float:202021.1)
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_front_ultra_hdr_photo_max_pixel_resolution"
            r13 = 4101(0x1005, float:5.747E-42)
            A0B(r3, r12, r15, r13)
            java.lang.String r15 = "camera_front_preview_stream_max_pixel_resolution"
            java.lang.Class<android.graphics.SurfaceTexture> r13 = android.graphics.SurfaceTexture.class
            A0A(r3, r12, r13, r15)
            java.lang.String r15 = "camera_front_video_stream_max_pixel_resolution"
            java.lang.Class<android.media.MediaRecorder> r13 = android.media.MediaRecorder.class
            A0A(r3, r12, r13, r15)
            java.lang.String r15 = "camera_front_cpu_stream_max_pixel_resolution"
            java.lang.String r13 = r40.toString()
            r3.putString(r15, r13)
            java.lang.String r13 = "camera_front_constrained_high_speed_video_max_pixel_resolution"
            r3.putString(r13, r14)
            java.lang.String r14 = "camera_front_constrained_high_speed_video_max_fps"
            r13 = r31
            r3.putFloat(r14, r13)
            java.lang.String r13 = "camera_front_constrained_high_speed_video_max_throughput_pps"
            if (r33 == 0) goto L_0x04e8
            long r0 = A02(r12)
        L_0x04e8:
            r3.putLong(r13, r0)
            java.lang.String r1 = "camera_front_max_fps"
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES
            java.lang.Object r0 = r6.get(r0)
            r0.getClass()
            android.util.Range[] r0 = (android.util.Range[]) r0
            float r0 = A00(r0)
            r3.putFloat(r1, r0)
            r0 = r41
            r3.putFloat(r1, r0)
            java.lang.String r12 = "camera_front_max_throughput_pps"
            r0 = r44
            long r0 = (long) r0
            r3.putLong(r12, r0)
            java.lang.String r12 = "camera_front_preview_stabilization_supported"
            r1 = 1
            r13 = 33
            r0 = r38
            if (r0 < r13) goto L_0x062e
            android.hardware.camera2.CameraCharacteristics$Key r0 = android.hardware.camera2.CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES
            boolean r0 = A0C(r0, r6, r4)
            if (r0 == 0) goto L_0x062e
        L_0x051d:
            r3.putBoolean(r12, r1)
            java.lang.String r1 = "camera_front_optical_stabilization_supported"
            r0 = r37
            r3.putBoolean(r1, r0)
            java.lang.String r0 = "camera_front_high_quality_noise_reduction_supported"
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.NOISE_REDUCTION_AVAILABLE_NOISE_REDUCTION_MODES
            A09(r3, r1, r6, r0, r4)
            java.lang.String r0 = "camera_front_zsl_noise_reduction_supported"
            A09(r3, r1, r6, r0, r7)
            java.lang.String r0 = "camera_front_minimal_noise_reduction_supported"
            A09(r3, r1, r6, r0, r2)
            java.lang.String r0 = "camera_front_fast_noise_reduction_supported"
            A09(r3, r1, r6, r0, r5)
            java.lang.String r0 = "camera_front_high_quality_tonemap_mode_supported"
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.TONEMAP_AVAILABLE_TONE_MAP_MODES
            A09(r3, r1, r6, r0, r4)
            java.lang.String r0 = "camera_front_fast_tonemap_mode_supported"
            A09(r3, r1, r6, r0, r5)
            java.lang.String r0 = "camera_front_contrast_curve_tonemap_mode_supported"
            A09(r3, r1, r6, r0, r8)
            java.lang.String r0 = "camera_front_gamma_value_tonemap_mode_supported"
            A09(r3, r1, r6, r0, r2)
            java.lang.String r0 = "camera_front_preset_curve_tonemap_mode_supported"
            A09(r3, r1, r6, r0, r7)
            java.lang.String r1 = "camera_front_face_detection_mode_simple_supported"
            r0 = r36
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_front_face_detection_mode_full_supported"
            r0 = r35
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_front_face_detection_max_face_count"
            if (r34 != 0) goto L_0x0628
            r0 = 0
        L_0x056b:
            r3.putInt(r1, r0)
            java.lang.String r1 = "camera_front_zoom_supported"
            r0 = r32
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_front_smooth_zoom_support"
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_front_zoom_min_ratio"
            java.lang.Comparable r0 = r24.getLower()
            float r0 = X.AnonymousClass7TE.A04(r0)
            r3.putFloat(r1, r0)
            java.lang.String r1 = "camera_front_zoom_max_ratio"
            java.lang.Comparable r0 = r24.getUpper()
            float r0 = X.AnonymousClass7TE.A04(r0)
            r3.putFloat(r1, r0)
            java.lang.String r1 = "camera_front_iso_sensitivity_control_supported"
            r0 = r21
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_front_min_iso_sensitivity"
            if (r10 == 0) goto L_0x0626
            java.lang.Comparable r0 = r10.getLower()
            int r0 = X.AnonymousClass7TE.A0M(r0)
        L_0x05a7:
            r3.putInt(r1, r0)
            java.lang.String r1 = "camera_front_max_iso_sensitivity"
            if (r10 == 0) goto L_0x0624
            int r0 = X.Pxg.A03(r10)
        L_0x05b2:
            r3.putInt(r1, r0)
            java.lang.String r1 = "camera_front_exposure_control_supported"
            r0 = r20
            r3.putBoolean(r1, r0)
            java.lang.String r10 = "camera_front_min_exposure_time_nanoseconds"
            r0 = r16
            r3.putLong(r10, r0)
            java.lang.String r10 = "camera_front_max_exposure_time_nanoseconds"
            r0 = r18
            r3.putLong(r10, r0)
            java.lang.String r0 = "camera_front_focus_mode_off_supported"
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            A09(r3, r1, r6, r0, r8)
            java.lang.String r0 = "camera_front_focus_mode_auto_supported"
            A09(r3, r1, r6, r0, r5)
            java.lang.String r0 = "camera_front_focus_mode_macro_supported"
            A09(r3, r1, r6, r0, r4)
            java.lang.String r0 = "camera_front_focus_mode_edof_supported"
            A09(r3, r1, r6, r0, r9)
            java.lang.String r0 = "camera_front_focus_mode_continuous_picture_supported"
            A09(r3, r1, r6, r0, r7)
            java.lang.String r0 = "camera_front_focus_mode_continuous_video_supported"
            A09(r3, r1, r6, r0, r2)
            java.lang.String r1 = "camera_front_auto_exposure_lock_supported"
            r0 = r30
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_front_auto_white_balance_lock_supported"
            r0 = r29
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_front_variable_aperture_supported"
            r0 = r28
            r3.putBoolean(r1, r0)
            java.lang.String r1 = "camera_front_min_aperture_f"
            r0 = r27
            r3.putFloat(r1, r0)
            java.lang.String r0 = "camera_front_max_aperture_f"
            r3.putFloat(r0, r11)
            java.lang.String r1 = "camera_front_max_num_focus_areas"
            r0 = r26
            r3.putInt(r1, r0)
            java.lang.String r1 = "camera_front_max_num_exposure_metering_areas"
            r0 = r25
            r3.putInt(r1, r0)
            java.lang.String r1 = "camera_front_max_num_white_balance_metering_areas"
            r0 = r23
            r3.putInt(r1, r0)
            X.VQf r0 = X.W2z.A2K
            goto L_0x044e
        L_0x0624:
            r0 = 0
            goto L_0x05b2
        L_0x0626:
            r0 = 0
            goto L_0x05a7
        L_0x0628:
            int r0 = r34.intValue()
            goto L_0x056b
        L_0x062e:
            android.content.pm.PackageManager r13 = r45.getPackageManager()
            r13.getClass()
            java.util.HashSet r0 = X.C343077pd.A05
            boolean r0 = X.C348137xw.A02(r0)
            if (r0 != 0) goto L_0x0647
            java.lang.String r0 = "vendor.android.hardware.camera.preview-dis.front"
            boolean r0 = r13.hasSystemFeature(r0)
            if (r0 == 0) goto L_0x0647
            goto L_0x051d
        L_0x0647:
            r1 = 0
            goto L_0x051d
        L_0x064a:
            r28 = 0
            r27 = -1082130432(0xffffffffbf800000, float:-1.0)
            goto L_0x026b
        L_0x0650:
            r31 = 0
            goto L_0x023f
        L_0x0654:
            X.VQf r8 = X.W2z.A1R
            goto L_0x021e
        L_0x0658:
            java.lang.String r11 = "camera_front_hlg_hdr_video_supported"
            r3.putBoolean(r11, r13)
            java.lang.String r13 = "camera_front_burst_capture_supported"
            boolean r11 = r8[r5]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_ultra_high_resolution_sensor_supported"
            boolean r11 = r8[r4]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_logical_multi_camera_supported"
            boolean r11 = r8[r2]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_zsl_private_reprocessing_supported"
            boolean r11 = r8[r7]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_zsl_yuv_reprocessing_supported"
            boolean r11 = r8[r9]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_remosaic_reprocessing_supported"
            boolean r11 = r8[r14]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_depth_output_supported"
            boolean r11 = r8[r15]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_read_sensor_settings_supported"
            boolean r11 = r8[r22]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_secure_image_data_supported"
            boolean r11 = r8[r23]
            r3.putBoolean(r13, r11)
            java.lang.String r13 = "camera_front_stream_use_case_supported"
            boolean r11 = r8[r25]
            r3.putBoolean(r13, r11)
            X.VQf r11 = X.W2z.A1R
            goto L_0x0213
        */
        throw new UnsupportedOperationException("Method not decompiled: X.W3n.A08(android.content.Context, android.content.SharedPreferences, android.hardware.camera2.CameraCharacteristics, boolean):void");
    }

    public static float A00(Range[] rangeArr) {
        int intValue;
        rangeArr.getClass();
        int length = rangeArr.length;
        if (length == 0) {
            return 0.0f;
        }
        Number number = (Number) rangeArr[0].getUpper();
        Number number2 = (Number) rangeArr[0].getLower();
        for (int i = 1; i < length; i++) {
            Number number3 = (Number) rangeArr[i].getUpper();
            if (number3.intValue() > number.intValue()) {
                number = number3;
            }
            Number number4 = (Number) rangeArr[i].getLower();
            if (number4.intValue() < number2.intValue()) {
                number2 = number4;
            }
        }
        if (number2.intValue() < 1000 || (intValue = number.intValue()) < 1000) {
            return (float) number.intValue();
        }
        return ((float) intValue) / 1000.0f;
    }

    public static long A02(StreamConfigurationMap streamConfigurationMap) {
        Size[] highSpeedVideoSizes = streamConfigurationMap.getHighSpeedVideoSizes();
        highSpeedVideoSizes.getClass();
        long j = 0;
        for (Size size : highSpeedVideoSizes) {
            Range[] highSpeedVideoFpsRangesFor = streamConfigurationMap.getHighSpeedVideoFpsRangesFor(size);
            highSpeedVideoFpsRangesFor.getClass();
            long width = (long) (((float) (size.getWidth() * size.getHeight())) * A00(highSpeedVideoFpsRangesFor));
            if (width > j) {
                j = width;
            }
        }
        return j;
    }

    public static C343047pa A05(StreamConfigurationMap streamConfigurationMap, int i) {
        Size[] highResolutionOutputSizes = streamConfigurationMap.getHighResolutionOutputSizes(i);
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(i);
        if (highResolutionOutputSizes == null) {
            highResolutionOutputSizes = null;
            if (outputSizes != null) {
                highResolutionOutputSizes = outputSizes;
            }
        } else if (outputSizes != null) {
            int length = highResolutionOutputSizes.length;
            int length2 = outputSizes.length;
            Size[] sizeArr = new Size[(length + length2)];
            System.arraycopy(highResolutionOutputSizes, 0, sizeArr, 0, length);
            System.arraycopy(outputSizes, 0, sizeArr, length, length2);
            highResolutionOutputSizes = sizeArr;
        }
        return A06(highResolutionOutputSizes);
    }

    public static void A09(SharedPreferences.Editor editor, CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics, String str, int i) {
        editor.putBoolean(str, A0C(key, cameraCharacteristics, i));
    }

    public static void A0A(SharedPreferences.Editor editor, StreamConfigurationMap streamConfigurationMap, Class cls, String str) {
        editor.putString(str, A06(streamConfigurationMap.getOutputSizes(cls)).toString());
    }

    public static void A0B(SharedPreferences.Editor editor, StreamConfigurationMap streamConfigurationMap, String str, int i) {
        editor.putString(str, A05(streamConfigurationMap, i).toString());
    }

    public static boolean A0C(CameraCharacteristics.Key key, CameraCharacteristics cameraCharacteristics, int i) {
        int[] iArr = (int[]) cameraCharacteristics.get(key);
        if (iArr == null) {
            return false;
        }
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }
}
