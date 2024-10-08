package X;

import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import org.json.JSONObject;

/* renamed from: X.7rH  reason: invalid class name and case insensitive filesystem */
public final class C344077rH implements C312156dv {
    public final QuickPerformanceLogger A00;
    public final UserFlowLoggerImpl A01;

    public final long start(int i, C342147o7 r9, long j) {
        long generateNewFlowId = this.A01.generateNewFlowId(i);
        startWithFlowInstanceId(generateNewFlowId, r9, j);
        return generateNewFlowId;
    }

    public final void annotate(long j, String str, String str2, String str3) {
        throw new RuntimeException(AnonymousClass000.A00(115));
    }

    public final void endCancel(long j, String str) {
        this.A01.flowEndCancel(j, str);
    }

    public final void endFail(long j, String str, int i, String str2, String str3) {
        String str4 = str2;
        0qQ.A0B(str4, 3);
        String str5 = str3;
        0qQ.A0B(str5, 4);
        UserFlowLoggerImpl userFlowLoggerImpl = this.A01;
        userFlowLoggerImpl.flowAnnotate(j, "domain", "renderer");
        int i2 = i;
        userFlowLoggerImpl.flowAnnotate(j, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, i2);
        userFlowLoggerImpl.flowAnnotate(j, DialogModule.KEY_MESSAGE, str4);
        userFlowLoggerImpl.flowAnnotate(j, "error_json", new JSONObject(0Yt.A06(new 0eP[]{new 0eP("domain", "renderer"), new 0eP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, Integer.valueOf(i2)), new 0eP(DialogModule.KEY_MESSAGE, str4)})).toString());
        userFlowLoggerImpl.flowEndFail(j, "", (String) null, str5);
    }

    public final void endSuccess(long j) {
        this.A01.flowEndSuccess(j);
    }

    public final long getInstanceIdWithString(int i, String str) {
        int i2;
        UserFlowLoggerImpl userFlowLoggerImpl = this.A01;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        return userFlowLoggerImpl.generateFlowId(i, i2);
    }

    public final void markPoint(long j, int i) {
        UserFlowLoggerImpl userFlowLoggerImpl = this.A01;
        String A002 = C342177oA.A00(i);
        userFlowLoggerImpl.flowMarkPoint(j, A002);
        userFlowLoggerImpl.flowAnnotate(j, 002.A0R("cp_", A002), this.A00.currentMonotonicTimestamp());
    }

    public final void startWithFlowInstanceId(long j, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        throw new RuntimeException(AnonymousClass000.A00(115));
    }

    public C344077rH() {
        QuickPerformanceLogger qPLInstance = QuickPerformanceLoggerProvider.getQPLInstance();
        if (qPLInstance != null) {
            this.A00 = qPLInstance;
            this.A01 = new UserFlowLoggerImpl(qPLInstance, true, false);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void annotate(long j, String str, String str2) {
        0qQ.A0B(str2, 2);
        if (str.length() != 0 && str2.length() != 0) {
            this.A01.flowAnnotate(j, str, str2);
        }
    }

    public final void endFail(long j, String str, int i, String str2) {
        String str3 = str2;
        0qQ.A0B(str3, 3);
        UserFlowLoggerImpl userFlowLoggerImpl = this.A01;
        userFlowLoggerImpl.flowAnnotate(j, "domain", str);
        int i2 = i;
        userFlowLoggerImpl.flowAnnotate(j, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, i2);
        userFlowLoggerImpl.flowAnnotate(j, DialogModule.KEY_MESSAGE, str3);
        userFlowLoggerImpl.flowAnnotate(j, "error_json", new JSONObject(0Yt.A06(new 0eP[]{new 0eP("domain", str), new 0eP(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE, Integer.valueOf(i2)), new 0eP(DialogModule.KEY_MESSAGE, str3)})).toString());
        userFlowLoggerImpl.flowEndFail(j, "", (String) null, (String) null);
    }

    public final void markPoint(long j, int i, String str) {
        UserFlowLoggerImpl userFlowLoggerImpl = this.A01;
        String A002 = C342177oA.A00(i);
        userFlowLoggerImpl.flowMarkPoint(j, A002, str);
        userFlowLoggerImpl.flowAnnotate(j, 002.A0R("cp_", A002), this.A00.currentMonotonicTimestamp(), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a4, code lost:
        if (r7.isEmpty() != false) goto L_0x00a6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void startWithFlowInstanceId(long r11, X.C342147o7 r13, long r14) {
        /*
            r10 = this;
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r5 = r10.A01
            java.lang.String r2 = "arfx"
            r0 = 1000(0x3e8, double:4.94E-321)
            long r14 = r14 * r0
            r1 = 0
            com.facebook.quicklog.reliability.UserFlowConfig r0 = new com.facebook.quicklog.reliability.UserFlowConfig
            r0.<init>(r2, r1)
            r0.mTtlMs = r14
            r5.flowStart(r11, r0)
            X.7o6 r13 = (X.C342137o6) r13
            r6 = 3
            java.lang.String r1 = r13.A08
            java.lang.String r0 = "onecamera_active_session_id"
            X.0eP r7 = new X.0eP
            r7.<init>(r0, r1)
            java.lang.String r1 = r13.A0A
            if (r1 != 0) goto L_0x0024
            java.lang.String r1 = ""
        L_0x0024:
            java.lang.String r0 = "product_session_id"
            X.0eP r3 = new X.0eP
            r3.<init>(r0, r1)
            r4 = 2
            java.lang.String r2 = r13.A09
            java.lang.String r1 = "product_name"
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            X.0eP[] r0 = new X.0eP[]{r7, r3, r0}
            java.util.LinkedHashMap r7 = X.0Yt.A07(r0)
            java.lang.String r1 = r13.A05
            if (r1 == 0) goto L_0x004c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "entry_point"
            r7.put(r0, r1)
        L_0x004c:
            java.util.List r3 = r13.A0D
            if (r3 == 0) goto L_0x0064
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x0064
            java.lang.String r2 = "|"
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r1 = X.00k.A0P(r2, r0, r0, r3, r1)
            java.lang.String r0 = "effect_session_ids"
            r7.put(r0, r1)
        L_0x0064:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0088
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.flowAnnotateWithCrucialData(r11, r1, r0)
            goto L_0x006c
        L_0x0088:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            int r0 = r13.A00
            r2 = -1
            if (r0 == r2) goto L_0x009b
            if (r0 == 0) goto L_0x0166
            java.lang.String r1 = "Back"
        L_0x0096:
            java.lang.String r0 = "camera_facing"
            r3.put(r0, r1)
        L_0x009b:
            java.util.List r7 = r13.A0B
            if (r7 == 0) goto L_0x00a6
            boolean r1 = r7.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x00a7
        L_0x00a6:
            r0 = 1
        L_0x00a7:
            java.lang.String r8 = "|"
            if (r0 != 0) goto L_0x00b7
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r1 = X.00k.A0P(r8, r0, r0, r7, r1)
            java.lang.String r0 = "effect_ids"
            r3.put(r0, r1)
        L_0x00b7:
            java.util.List r7 = r13.A0C
            if (r7 == 0) goto L_0x00cd
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x00cd
            r1 = 0
            java.lang.String r0 = ""
            java.lang.String r1 = X.00k.A0P(r8, r0, r0, r7, r1)
            java.lang.String r0 = "effect_instance_ids"
            r3.put(r0, r1)
        L_0x00cd:
            long r0 = r13.A03
            r8 = 0
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00de
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "available_memory_mb"
            r3.put(r0, r1)
        L_0x00de:
            long r0 = r13.A04
            int r7 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r7 <= 0) goto L_0x00ed
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "total_memory_mb"
            r3.put(r0, r1)
        L_0x00ed:
            int r1 = r13.A02
            if (r1 == r2) goto L_0x0101
            if (r1 == 0) goto L_0x0163
            r0 = 1
            if (r1 == r0) goto L_0x0160
            if (r1 == r4) goto L_0x015d
            if (r1 == r6) goto L_0x015a
            java.lang.String r1 = "NativeLowLightPhoto"
        L_0x00fc:
            java.lang.String r0 = "photo_capture_type"
            r3.put(r0, r1)
        L_0x0101:
            java.lang.String r1 = r13.A06
            int r0 = r1.length()
            if (r0 == 0) goto L_0x010e
            java.lang.String r0 = "is_camera_cold_start"
            r3.put(r0, r1)
        L_0x010e:
            int r1 = r13.A01
            if (r1 == 0) goto L_0x0120
            r0 = 1
            if (r1 == r0) goto L_0x0157
            if (r1 == r4) goto L_0x0154
            if (r1 == r6) goto L_0x0151
            java.lang.String r1 = "OneCamera"
        L_0x011b:
            java.lang.String r0 = "camera_type"
            r3.put(r0, r1)
        L_0x0120:
            java.lang.String r1 = r13.A07
            int r0 = r1.length()
            if (r0 == 0) goto L_0x012d
            java.lang.String r0 = "is_power_save_mode"
            r3.put(r0, r1)
        L_0x012d:
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r2 = r0.iterator()
        L_0x0135:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x016a
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r5.flowAnnotate(r11, r1, r0)
            goto L_0x0135
        L_0x0151:
            java.lang.String r1 = "LiteCamera"
            goto L_0x011b
        L_0x0154:
            java.lang.String r1 = "ARKCaptureSession"
            goto L_0x011b
        L_0x0157:
            java.lang.String r1 = "MultiCaptureManager"
            goto L_0x011b
        L_0x015a:
            java.lang.String r1 = "NativeFullSizeFile"
            goto L_0x00fc
        L_0x015d:
            java.lang.String r1 = "NativeViewSizePhoto"
            goto L_0x00fc
        L_0x0160:
            java.lang.String r1 = "PreviewBitmap"
            goto L_0x00fc
        L_0x0163:
            java.lang.String r1 = "PreviewPhoto"
            goto L_0x00fc
        L_0x0166:
            java.lang.String r1 = "Front"
            goto L_0x0096
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344077rH.startWithFlowInstanceId(long, X.7o7, long):void");
    }
}
