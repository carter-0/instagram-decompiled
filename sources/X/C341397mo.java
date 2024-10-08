package X;

import android.os.Build;
import android.text.TextUtils;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7mo  reason: invalid class name and case insensitive filesystem */
public final class C341397mo implements C340557lS {
    public static boolean A04 = true;
    public static int A05;
    public static Boolean A06;
    public static String A07;
    public static final HashMap A08 = new HashMap();
    public static final HashMap A09 = new HashMap();
    public C342077o0 A00;
    public final C344037rD A01;
    public final C340227ku A02;
    public final AtomicBoolean A03 = new AtomicBoolean(false);

    public static HashMap A00(int i, long j) {
        HashMap hashMap = new HashMap(3);
        hashMap.put("update_description", "SETTINGS");
        hashMap.put("timestamp", String.valueOf(j));
        hashMap.put("settings_update_id", String.valueOf(i));
        return hashMap;
    }

    public final void D08(long j, String str, String str2) {
        C344037rD r1 = this.A01;
        Map A7G = r1.A7G();
        A7G.put("previous_product_name", str);
        A7G.put("new_product_name", str2);
        r1.ChM((long) hashCode(), "camera_evicted", "CameraEventLoggerImpl", A7G);
        r1.ECg(A7G);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        if (r3 >= 31) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D5b(X.C343367q6 r13, int r14, int r15, long r16) {
        /*
            r12 = this;
            X.7rD r6 = r12.A01
            X.7rK r2 = r6.Ajt()
            r1 = 1
            if (r15 == 0) goto L_0x00bc
            r0 = 0
            if (r15 == r1) goto L_0x000d
            r0 = -1
        L_0x000d:
            r2.EQO(r0)
            java.util.Map r11 = r6.A7G()
            java.lang.String r1 = java.lang.String.valueOf(r16)
            java.lang.String r0 = "timestamp"
            r11.put(r0, r1)
            X.7p0 r2 = r13.A02
            X.7p1 r0 = X.C342687p0.A00
            java.lang.Object r1 = r2.A01(r0)
            X.7l0 r0 = X.C340277l0.CAMERA2
            if (r1 != r0) goto L_0x00b8
            java.lang.String r1 = "2"
        L_0x002b:
            java.lang.String r0 = "camera_api"
            r11.put(r0, r1)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 33
            if (r3 < r4) goto L_0x00b3
            X.7p1 r0 = X.C342687p0.A0J
            java.lang.Object r0 = r2.A01(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "hdr_hlg_supported"
            r11.put(r0, r1)
            X.7p1 r0 = X.C342687p0.A18
            java.lang.Object r5 = r2.A01(r0)
            java.util.List r5 = (java.util.List) r5
            r0 = 5
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.contains(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "stream_use_case_video_call_supported"
            r11.put(r0, r1)
        L_0x0060:
            X.7p1 r0 = X.C342687p0.A08
            java.lang.Object r0 = r2.A01(r0)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "night_extension_supported"
            r11.put(r0, r1)
            if (r3 < r4) goto L_0x00a3
            X.7p1 r0 = X.C342687p0.A0R
            java.lang.Object r0 = r2.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0088
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "preview_stabilization_api33_supported"
            r11.put(r0, r1)
        L_0x0088:
            r0 = 34
            if (r3 < r0) goto L_0x00a3
            X.7p1 r0 = X.C342687p0.A0Y
            java.lang.Object r0 = r2.A01(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00a3
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "hdr_jpegr_supported"
            r11.put(r0, r1)
        L_0x00a3:
            java.lang.String r10 = "CameraEventLoggerImpl"
            int r0 = r12.hashCode()
            long r7 = (long) r0
            java.lang.String r9 = "camera_connect_finished"
            r6.ChM(r7, r9, r10, r11)
            r6.ECg(r11)
            return
        L_0x00b3:
            r0 = 31
            if (r3 < r0) goto L_0x00a3
            goto L_0x0060
        L_0x00b8:
            java.lang.String r1 = "1"
            goto L_0x002b
        L_0x00bc:
            r0 = 1
            goto L_0x000d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341397mo.D5b(X.7q6, int, int, long):void");
    }

    public final void D5d(long j) {
        int i;
        String str;
        C344037rD r7 = this.A01;
        String activeSessionId = r7.getActiveSessionId();
        HashMap hashMap = A08;
        if (hashMap.get(activeSessionId) != null) {
            i = ((Number) hashMap.get(activeSessionId)).intValue() + 1;
        } else {
            i = 1;
        }
        hashMap.put(activeSessionId, Integer.valueOf(i));
        HashMap hashMap2 = A09;
        if (!hashMap2.containsKey(activeSessionId)) {
            hashMap2.put(activeSessionId, 0);
        }
        Map A7G = r7.A7G();
        A7G.put("session_connect_count", String.valueOf(hashMap.get(activeSessionId)));
        A7G.put("session_disconnect_count", String.valueOf(hashMap2.get(activeSessionId)));
        int i2 = A05;
        A05 = i2 + 1;
        A7G.put("open_connections_count", String.valueOf(i2));
        AtomicBoolean atomicBoolean = this.A03;
        A7G.put("has_connect_request", String.valueOf(atomicBoolean.get()));
        Boolean bool = A06;
        if (bool == null) {
            try {
                Class.forName("androidx.camera.extensions.impl.ExtensionVersionImpl", false, getClass().getClassLoader());
                bool = true;
                A06 = bool;
            } catch (ClassNotFoundException | NoClassDefFoundError unused) {
                bool = false;
                A06 = bool;
            }
        }
        A7G.put("has_camera_extensions", String.valueOf(bool.booleanValue()));
        if (Build.VERSION.SDK_INT > 30) {
            if (A07 == null) {
                try {
                    str = (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"ro.camerax.extensions.enabled"});
                } catch (Exception unused2) {
                    str = null;
                }
                A07 = str;
                if (TextUtils.isEmpty(str)) {
                    A07 = NetInfoModule.CONNECTION_TYPE_NONE;
                }
            }
            A7G.put("has_camera_extensions_prop", A07);
        }
        A7G.put("timestamp", String.valueOf(j));
        r7.ChM((long) hashCode(), "camera_connect_started", "CameraEventLoggerImpl", A7G);
        atomicBoolean.set(true);
        r7.ECg(A7G);
    }

    public C341397mo(C344037rD r3, C340227ku r4) {
        this.A01 = r3;
        this.A02 = r4;
    }
}
