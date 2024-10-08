package X;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.util.Pair;
import java.util.List;
import java.util.Map;

/* renamed from: X.4x0  reason: invalid class name and case insensitive filesystem */
public abstract class C278514x0 {
    public static final Object A00 = new Object();
    public static volatile Map A01;

    public static Pair A01() {
        String str;
        String[] strArr = C278564x7.A01;
        double parseDouble = Double.parseDouble(strArr[0]);
        0tS A002 = 0tS.A00();
        if (((Boolean) A002.A0x.CDM(A002, 0tS.A4G[108])).booleanValue()) {
            str = String.valueOf(196);
        } else {
            str = strArr[42];
        }
        return new Pair(Double.valueOf(parseDouble), Double.valueOf(Double.parseDouble(str)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d0, code lost:
        if (r4.A01 >= 8) goto L_0x00d2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList A02(android.content.Context r5, X.C278504wz r6) {
        /*
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.lang.String r0 = "faceTracker"
            r3.add(r0)
            X.0lg r4 = r6.A00
            boolean r0 = X.C278524x1.A01(r4)
            if (r0 == 0) goto L_0x0017
            java.lang.String r0 = "segmentation"
            r3.add(r0)
        L_0x0017:
            java.lang.String r0 = "hairSegmentation"
            r3.add(r0)
            int r1 = X.C278524x1.A00(r4)
            r0 = 15
            if (r1 > r0) goto L_0x002e
            android.content.Context r0 = X.C60960kU.A00
            int r1 = X.AnonymousClass0Ke.A00(r0)
            r0 = 2016(0x7e0, float:2.825E-42)
            if (r1 < r0) goto L_0x0033
        L_0x002e:
            java.lang.String r0 = "worldTracker"
            r3.add(r0)
        L_0x0033:
            boolean r0 = X.C278534x2.A00(r5)
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = "realScaleEstimation"
            r3.add(r0)
        L_0x003e:
            boolean r0 = X.C278534x2.A00(r5)
            if (r0 == 0) goto L_0x0056
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314030092061045(0x81036b00000975, double:3.028477082857206E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "sceneDepth"
            r3.add(r0)
        L_0x0056:
            boolean r0 = X.C278534x2.A00(r5)
            if (r0 == 0) goto L_0x0061
            java.lang.String r0 = "geoanchor"
            r3.add(r0)
        L_0x0061:
            boolean r0 = X.C278534x2.A00(r5)
            if (r0 == 0) goto L_0x0079
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314639977417453(0x8103f900000aed, double:3.0288627768124097E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0079
            java.lang.String r0 = "multiplane"
            r3.add(r0)
        L_0x0079:
            boolean r0 = X.C278534x2.A00(r5)
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "worldTracking"
            r3.add(r0)
        L_0x0084:
            java.lang.String r0 = "bodyTracking"
            r3.add(r0)
            java.lang.String r0 = "bodyTracking3D"
            r3.add(r0)
            boolean r0 = A04(r5)
            if (r0 == 0) goto L_0x0099
            java.lang.String r0 = "deviceMotion"
            r3.add(r0)
        L_0x0099:
            X.4x5 r4 = X.C278544x5.A06
            r2 = 1
            X.C278544x5.A00(r4, r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = "halfFloatRenderPass"
            r3.add(r0)
        L_0x00a8:
            X.C278544x5.A00(r4, r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00b4
            java.lang.String r0 = "depthShaderRead"
            r3.add(r0)
        L_0x00b4:
            X.C278544x5.A00(r4, r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x00c0
            java.lang.String r0 = "multipleRenderTargets"
            r3.add(r0)
        L_0x00c0:
            X.4x5 r0 = X.C278544x5.A05
            X.C278544x5.A00(r0, r2)
            int r0 = r0.A01
            r1 = 8
            if (r0 >= r1) goto L_0x00d2
            X.C278544x5.A00(r4, r2)
            int r0 = r4.A01
            if (r0 < r1) goto L_0x00d7
        L_0x00d2:
            java.lang.String r0 = "vertexTextureFetch"
            r3.add(r0)
        L_0x00d7:
            boolean r0 = X.C278474ww.A05()
            if (r0 == 0) goto L_0x00e2
            java.lang.String r0 = "renderSettingsHigh"
            r3.add(r0)
        L_0x00e2:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278514x0.A02(android.content.Context, X.4wz):java.util.ArrayList");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r4.equals(r8.get(r3)) != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.Map A03(android.content.Context r6, X.C278504wz r7, java.util.Map r8) {
        /*
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            java.lang.String r3 = "etc2_compression"
            java.lang.Object r0 = r8.get(r3)
            boolean r0 = r4.equals(r0)
            java.lang.String r1 = "compression"
            if (r0 != 0) goto L_0x0021
            java.lang.String r3 = "pvr_compression"
            java.lang.Object r0 = r8.get(r3)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0024
        L_0x0021:
            r2.put(r1, r3)
        L_0x0024:
            boolean r0 = A04(r6)
            if (r0 == 0) goto L_0x0189
            java.lang.String r1 = "gyroscope_enabled"
        L_0x002c:
            java.lang.String r0 = "gyroscope"
            r2.put(r0, r1)
            java.lang.String[] r0 = X.C278564x7.A01
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r3 = ","
            java.lang.String r1 = android.text.TextUtils.join(r3, r0)
            java.lang.String r0 = "supported_sdk_versions"
            r2.put(r0, r1)
            r0 = 189(0xbd, float:2.65E-43)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 191(0xbf, float:2.68E-43)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r4 = 1
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r1 = android.text.TextUtils.join(r3, r0)
            java.lang.String r0 = "supported_beta_sdk_versions"
            r2.put(r0, r1)
            X.0lg r5 = r7.A00
            int r1 = X.C278524x1.A00(r5)
            r0 = 15
            if (r1 > r0) goto L_0x0185
            android.content.Context r0 = X.C60960kU.A00
            int r1 = X.AnonymousClass0Ke.A00(r0)
            r0 = 2016(0x7e0, float:2.825E-42)
            if (r1 >= r0) goto L_0x0185
            java.lang.String r1 = "world_tracker_disabled"
        L_0x0076:
            java.lang.String r0 = "world_tracker"
            r2.put(r0, r1)
            boolean r0 = X.C278534x2.A00(r6)
            if (r0 == 0) goto L_0x0181
            java.lang.String r1 = "real_scale_estimation_enabled"
        L_0x0083:
            java.lang.String r0 = "real_scale_estimation"
            r2.put(r0, r1)
            boolean r0 = X.C278534x2.A00(r6)
            if (r0 == 0) goto L_0x017d
            X.0Tu r3 = X.0Tu.A05
            r0 = 36314030092061045(0x81036b00000975, double:3.028477082857206E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x017d
            java.lang.String r1 = "scene_depth_enabled"
        L_0x009d:
            java.lang.String r0 = "scene_depth"
            r2.put(r0, r1)
            boolean r0 = X.C278534x2.A00(r6)
            if (r0 == 0) goto L_0x0179
            java.lang.String r1 = "geoanchor_enabled"
        L_0x00aa:
            java.lang.String r0 = "geoanchor"
            r2.put(r0, r1)
            boolean r0 = X.C278534x2.A00(r6)
            if (r0 == 0) goto L_0x0175
            X.0Tu r3 = X.0Tu.A05
            r0 = 36314639977417453(0x8103f900000aed, double:3.0288627768124097E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x0175
            java.lang.String r1 = "multiplane_enabled"
        L_0x00c4:
            java.lang.String r0 = "multiplane"
            r2.put(r0, r1)
            boolean r0 = X.C278534x2.A00(r6)
            if (r0 == 0) goto L_0x0171
            java.lang.String r1 = "world_tracking_enabled"
        L_0x00d1:
            java.lang.String r0 = "world_tracking"
            r2.put(r0, r1)
            boolean r0 = X.C278524x1.A01(r5)
            if (r0 == 0) goto L_0x016d
            java.lang.String r1 = "segmentation_enabled"
        L_0x00de:
            java.lang.String r0 = "segmentation"
            r2.put(r0, r1)
            java.lang.String r1 = "hair_segmentation_enabled"
            java.lang.String r0 = "hair_segmentation"
            r2.put(r0, r1)
            boolean r0 = X.C278474ww.A05()
            if (r0 == 0) goto L_0x00f7
            java.lang.String r1 = "render_settings_high"
            java.lang.String r0 = "render_settings_high_enabled"
            r2.put(r1, r0)
        L_0x00f7:
            java.lang.String r1 = "hand_tracking_disabled"
            java.lang.String r0 = "hand_tracking"
            r2.put(r0, r1)
            java.lang.String r1 = "xray_disabled"
            java.lang.String r0 = "xray"
            r2.put(r0, r1)
            java.lang.String r1 = "body_tracking_enabled"
            java.lang.String r0 = "body_tracking"
            r2.put(r0, r1)
            X.4x5 r3 = X.C278544x5.A06
            X.C278544x5.A00(r3, r4)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x016a
            java.lang.String r1 = "half_float_render_pass_enabled"
        L_0x0117:
            java.lang.String r0 = "half_float_render_pass"
            r2.put(r0, r1)
            X.C278544x5.A00(r3, r4)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0167
            java.lang.String r1 = "depth_shader_read_enabled"
        L_0x0125:
            java.lang.String r0 = "depth_shader_read"
            r2.put(r0, r1)
            X.C278544x5.A00(r3, r4)
            boolean r0 = r3.A02
            if (r0 == 0) goto L_0x0164
            java.lang.String r1 = "multiple_render_targets_enabled"
        L_0x0133:
            java.lang.String r0 = "multiple_render_targets"
            r2.put(r0, r1)
            X.4x5 r0 = X.C278544x5.A05
            X.C278544x5.A00(r0, r4)
            int r0 = r0.A01
            r1 = 8
            if (r0 >= r1) goto L_0x0161
            X.C278544x5.A00(r3, r4)
            int r0 = r3.A01
            if (r0 >= r1) goto L_0x0161
            java.lang.String r1 = "vertex_texture_fetch_disabled"
        L_0x014c:
            java.lang.String r0 = "vertex_texture_fetch"
            r2.put(r0, r1)
            r0 = 14
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "face_tracker_version"
            r2.put(r0, r1)
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r2)
            return r0
        L_0x0161:
            java.lang.String r1 = "vertex_texture_fetch_enabled"
            goto L_0x014c
        L_0x0164:
            java.lang.String r1 = "multiple_render_targets_disabled"
            goto L_0x0133
        L_0x0167:
            java.lang.String r1 = "depth_shader_read_disabled"
            goto L_0x0125
        L_0x016a:
            java.lang.String r1 = "half_float_render_pass_disabled"
            goto L_0x0117
        L_0x016d:
            java.lang.String r1 = "segmentation_disabled"
            goto L_0x00de
        L_0x0171:
            java.lang.String r1 = "world_tracking_disabled"
            goto L_0x00d1
        L_0x0175:
            java.lang.String r1 = "multiplane_disabled"
            goto L_0x00c4
        L_0x0179:
            java.lang.String r1 = "geoanchor_disabled"
            goto L_0x00aa
        L_0x017d:
            java.lang.String r1 = "scene_depth_disabled"
            goto L_0x009d
        L_0x0181:
            java.lang.String r1 = "real_scale_estimation_disabled"
            goto L_0x0083
        L_0x0185:
            java.lang.String r1 = "world_tracker_enabled"
            goto L_0x0076
        L_0x0189:
            java.lang.String r1 = "gyroscope_disabled"
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C278514x0.A03(android.content.Context, X.4wz, java.util.Map):java.util.Map");
    }

    public static boolean A04(Context context) {
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        if (sensorManager == null) {
            return false;
        }
        List<Sensor> sensorList = sensorManager.getSensorList(11);
        List<Sensor> sensorList2 = sensorManager.getSensorList(15);
        List<Sensor> sensorList3 = sensorManager.getSensorList(20);
        if (!sensorList.isEmpty() || !sensorList2.isEmpty() || !sensorList3.isEmpty()) {
            return true;
        }
        return false;
    }

    public static Pair A00() {
        return new Pair(Double.valueOf(189.0d), Double.valueOf(191.0d));
    }
}
