package X;

import android.content.Context;
import android.os.SystemClock;
import android.util.SparseIntArray;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14Impl;

/* renamed from: X.7rB  reason: invalid class name and case insensitive filesystem */
public abstract class C344017rB extends C344027rC {
    public static final SparseIntArray A05;
    public boolean A00;
    public final C344057rF A01;
    public final Context A02;
    public volatile long A03;
    public volatile C368758tH A04;

    public final void Cjf(int i, int i2) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        this.A01.onPostCaptureEvent(i, this.A03, this.A01, this.A00, 0);
        this.A03 += SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(12);
        sparseIntArray.put(7, 11272208);
        sparseIntArray.put(16, 11272224);
        sparseIntArray.put(17, 11272227);
        sparseIntArray.put(18, 11272228);
        sparseIntArray.put(19, 11272235);
        sparseIntArray.put(20, 11272236);
        sparseIntArray.put(21, 11276595);
        sparseIntArray.put(22, 11287468);
        sparseIntArray.put(24, 11283980);
        sparseIntArray.put(25, 11287836);
        sparseIntArray.put(26, 11275520);
        sparseIntArray.put(27, 11280956);
        sparseIntArray.put(28, 11276921);
        A05 = sparseIntArray;
    }

    public static int A02(int i) {
        int i2 = A05.get(i);
        if (i2 != 0) {
            return i2;
        }
        throw new IllegalArgumentException(002.A0c("Event ", " is not part of FbCameraLogger.FbCameraEvent", 0));
    }

    public static int A03(String str, String str2) {
        String str3 = str;
        char c = 65535;
        switch (str3.hashCode()) {
            case -1771728128:
                if (str3.equals("recording_finished")) {
                    c = 0;
                    break;
                }
                break;
            case -1655512013:
                if (str3.equals("recording_started")) {
                    c = 1;
                    break;
                }
                break;
            case -1449690740:
                if (str3.equals("camera_connect_failed")) {
                    c = 2;
                    break;
                }
                break;
            case -1366347905:
                if (str3.equals("recording_stop_requested")) {
                    c = 3;
                    break;
                }
                break;
            case -610698305:
                if (str3.equals("camera_connect_requested")) {
                    c = 4;
                    break;
                }
                break;
            case -291368050:
                if (str3.equals("camera_evicted")) {
                    c = 5;
                    break;
                }
                break;
            case -279952167:
                if (str3.equals("camera_update_failed")) {
                    c = 6;
                    break;
                }
                break;
            case -151308056:
                if (str3.equals("photo_capture_requested")) {
                    c = 7;
                    break;
                }
                break;
            case -8190024:
                if (str3.equals("photo_capture_finished")) {
                    c = 8;
                    break;
                }
                break;
            case 148122000:
                if (str3.equals("camera_first_frame_rendered")) {
                    c = 9;
                    break;
                }
                break;
            case 199801358:
                if (str3.equals("camera_update_finished")) {
                    c = 10;
                    break;
                }
                break;
            case 470340763:
                if (str3.equals("camera_disconnect_finished")) {
                    c = 11;
                    break;
                }
                break;
            case 1013585568:
                if (str3.equals("recording_requested")) {
                    c = 12;
                    break;
                }
                break;
            case 1219670603:
                if (str3.equals("recording_failed")) {
                    c = 13;
                    break;
                }
                break;
            case 1362464257:
                if (str3.equals("camera_connect_finished")) {
                    c = 14;
                    break;
                }
                break;
            case 1487228098:
                if (str3.equals("camera_swipe_to_open_finished")) {
                    c = 15;
                    break;
                }
                break;
            case 1493632274:
                if (str3.equals("camera_connect_started")) {
                    c = 16;
                    break;
                }
                break;
            case 1570108675:
                if (str3.equals("photo_capture_failed")) {
                    c = 17;
                    break;
                }
                break;
            case 2001457490:
                if (str3.equals("camera_update_requested")) {
                    c = 18;
                    break;
                }
                break;
        }
        String str4 = str2;
        switch (c) {
            case 0:
                return 15;
            case 1:
                return 12;
            case 2:
                return 3;
            case 3:
                return 13;
            case 4:
                return 0;
            case 5:
                return 6;
            case 6:
                if ("SWITCH".equals(str4)) {
                    return 17;
                }
                break;
            case 7:
                return 8;
            case 8:
                return 10;
            case 9:
                return 4;
            case 10:
                if ("SWITCH".equals(str4)) {
                    return 18;
                }
                break;
            case 11:
                return 7;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return 11;
            case 13:
                return 14;
            case 14:
                return 2;
            case 15:
                return 5;
            case 16:
                return 1;
            case 17:
                return 9;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                if ("SWITCH".equals(str4)) {
                    return 16;
                }
                break;
        }
        return 24;
    }

    public final C368758tH BY6() {
        if (this.A04 == null) {
            synchronized (C344017rB.class) {
                if (this.A04 == null) {
                    this.A04 = this.A01.createOneCameraARXLogger();
                }
            }
        }
        return this.A04;
    }

    public final void CvU(int i, String str, String str2) {
        this.A05.BiP().markerAnnotate(A02(i), str, str2);
    }

    public final void DD3(int i) {
        this.A05.BiP().markerEnd(A02(i), 3);
    }

    public final void DD4(int i) {
        this.A05.BiP().markerEnd(A02(i), 2);
    }

    public final void DD5(Map map, int i, long j) {
        map.put("product_name", this.A00);
        long j2 = j;
        this.A05.BiP().markerGenerateWithAnnotations(A02(27), 2, j2, TimeUnit.NANOSECONDS, map);
    }

    public final void DD7(int i, String str) {
        this.A05.BiP().markerPoint(A02(i), str);
    }

    public final void destroy() {
        if (this.A03 > 0) {
            this.A05.BiP().markerGenerate(11279864, 2, this.A03, TimeUnit.NANOSECONDS);
            this.A03 = 0;
        }
    }

    public final String getActiveSessionId() {
        return this.A01.getActiveSessionId();
    }

    @Deprecated
    public C344017rB(C343997r9 r3, C344057rF r4, String str, String str2) {
        super(r3, str, str2);
        Context context;
        try {
            context = this.A00.getContext();
        } catch (RuntimeException unused) {
            context = null;
        }
        this.A02 = context;
        this.A03 = 0;
        this.A00 = false;
        this.A01 = r4;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0073, code lost:
        if (java.lang.Boolean.parseBoolean((java.lang.String) r7.get("is_cold_start")) == false) goto L_0x0075;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r5.equals("recording_finished") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        if (r5.equals("recording_started") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009c, code lost:
        if (r5.equals("camera_connect_failed") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a5, code lost:
        if (r5.equals("recording_stop_requested") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r5.equals("camera_connect_requested") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b8, code lost:
        if (r5.equals("camera_evicted") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00c2, code lost:
        if (r5.equals("camera_update_failed") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cc, code lost:
        if (r5.equals("photo_capture_requested") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d6, code lost:
        if (r5.equals("photo_capture_finished") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e0, code lost:
        if (r5.equals("camera_first_frame_rendered") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ea, code lost:
        if (r5.equals("camera_update_finished") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00f4, code lost:
        if (r5.equals("recording_requested") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00fe, code lost:
        if (r5.equals("recording_failed") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0108, code lost:
        if (r5.equals("camera_connect_finished") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0112, code lost:
        if (r5.equals("camera_swipe_to_open_finished") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x011c, code lost:
        if (r5.equals("camera_connect_started") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0126, code lost:
        if (r5.equals("photo_capture_failed") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x012a, code lost:
        r11 = r10.A01.onFailureEvent(r9, r2, r4, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0138, code lost:
        if (r5.equals("camera_update_requested") == false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x013e, code lost:
        if (r10.A02 == null) goto L_0x0146;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0140, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0144, code lost:
        if (r10.A00 == false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0148, code lost:
        r19 = r10.A01;
        r21 = r10.A03;
        r15 = r10.A01;
        r14 = r10.A00;
        r13 = r10.A04;
        r0 = r10.A06;
        r7 = r0.A00;
        r6 = r0.A05;
        r5 = r0.A06;
        r4 = r0.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0160, code lost:
        if (r16 == false) goto L_0x01e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0162, code lost:
        r2 = (long) X.C342127o5.A00(r10.A00.getContext(), false);
        r0 = (long) X.C342127o5.A00(r10.A00.getContext(), true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0178, code lost:
        if (r12 == null) goto L_0x0181;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x017e, code lost:
        switch(r12.hashCode()) {
            case -779044650: goto L_0x01b1;
            case -85671418: goto L_0x01ba;
            case 371328422: goto L_0x01c3;
            case 440515259: goto L_0x01cc;
            case 1266396786: goto L_0x01d5;
            default: goto L_0x0181;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0181, code lost:
        r35 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0183, code lost:
        if (r16 == false) goto L_0x0193;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0185, code lost:
        r38 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0191, code lost:
        if (X.C342127o5.A01(r10.A00.getContext()) != false) goto L_0x0195;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0193, code lost:
        r38 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0195, code lost:
        r11 = r19.onEvent(r9, r21, r15, r14, r13, r7, r6, r5, r4, r29, r2, r0, r35, r36, false, r38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01b1, code lost:
        r11 = r12.equals("NATIVE_LOW_LIGHT_PHOTO");
        r35 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01ba, code lost:
        r11 = r12.equals("NATIVE_VIEW_SIZE_PHOTO");
        r35 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c3, code lost:
        r11 = r12.equals("PREVIEW_BITMAP");
        r35 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01cc, code lost:
        r11 = r12.equals("PREVIEW_PHOTO");
        r35 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01d5, code lost:
        r11 = r12.equals("NATIVE_FULL_SIZE_FILE");
        r35 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01dd, code lost:
        if (r11 != false) goto L_0x0183;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01e0, code lost:
        r2 = -1;
        r0 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A07(java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.util.Map r44, int r45) {
        /*
            r39 = this;
            long r17 = android.os.SystemClock.elapsedRealtimeNanos()
            r10 = r39
            r5 = r40
            r0 = r41
            r4 = r42
            r3 = r43
            r7 = r44
            r2 = r45
            r11 = r5
            r12 = r0
            r13 = r4
            r14 = r3
            r15 = r7
            r16 = r2
            super.A07(r11, r12, r13, r14, r15, r16)
            int r9 = A03(r5, r0)
            r0 = 24
            if (r9 != r0) goto L_0x0036
            X.7rF r0 = r10.A01
            java.lang.String r11 = r0.getActiveSessionId()
        L_0x002a:
            long r2 = r10.A03
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            long r0 = r0 - r17
            long r2 = r2 + r0
            r10.A03 = r2
            return r11
        L_0x0036:
            if (r44 == 0) goto L_0x0081
            java.lang.String r1 = "timestamp"
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Object r0 = r7.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            long r29 = java.lang.Long.parseLong(r0)
        L_0x004a:
            r11 = 0
            if (r44 == 0) goto L_0x007f
            java.lang.String r1 = "photo_capture_type"
            boolean r0 = r7.containsKey(r1)
            if (r0 == 0) goto L_0x007f
            java.lang.Object r12 = r7.get(r1)
            java.lang.String r12 = (java.lang.String) r12
        L_0x005b:
            r1 = 1
            r8 = 0
            if (r44 == 0) goto L_0x0075
            java.lang.String r6 = "is_cold_start"
            boolean r0 = r7.containsKey(r6)
            if (r0 == 0) goto L_0x0075
            java.lang.Object r0 = r7.get(r6)
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = java.lang.Boolean.parseBoolean(r0)
            r36 = 1
            if (r0 != 0) goto L_0x0077
        L_0x0075:
            r36 = 0
        L_0x0077:
            int r0 = r5.hashCode()
            switch(r0) {
                case -1771728128: goto L_0x0084;
                case -1655512013: goto L_0x008d;
                case -1449690740: goto L_0x0096;
                case -1366347905: goto L_0x009f;
                case -610698305: goto L_0x00a8;
                case -291368050: goto L_0x00b2;
                case -279952167: goto L_0x00bc;
                case -151308056: goto L_0x00c6;
                case -8190024: goto L_0x00d0;
                case 148122000: goto L_0x00da;
                case 199801358: goto L_0x00e4;
                case 1013585568: goto L_0x00ee;
                case 1219670603: goto L_0x00f8;
                case 1362464257: goto L_0x0102;
                case 1487228098: goto L_0x010c;
                case 1493632274: goto L_0x0116;
                case 1570108675: goto L_0x0120;
                case 2001457490: goto L_0x0132;
                default: goto L_0x007e;
            }
        L_0x007e:
            goto L_0x002a
        L_0x007f:
            r12 = r11
            goto L_0x005b
        L_0x0081:
            r29 = -1
            goto L_0x004a
        L_0x0084:
            java.lang.String r0 = "recording_finished"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x008d:
            java.lang.String r0 = "recording_started"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x0096:
            java.lang.String r0 = "camera_connect_failed"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x012a
            goto L_0x002a
        L_0x009f:
            java.lang.String r0 = "recording_stop_requested"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x00a8:
            java.lang.String r0 = "camera_connect_requested"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x00b2:
            java.lang.String r0 = "camera_evicted"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x00bc:
            java.lang.String r0 = "camera_update_failed"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x012a
            goto L_0x002a
        L_0x00c6:
            java.lang.String r0 = "photo_capture_requested"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x00d0:
            java.lang.String r0 = "photo_capture_finished"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x00da:
            java.lang.String r0 = "camera_first_frame_rendered"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x00e4:
            java.lang.String r0 = "camera_update_finished"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x00ee:
            java.lang.String r0 = "recording_requested"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x00f8:
            java.lang.String r0 = "recording_failed"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x012a
            goto L_0x002a
        L_0x0102:
            java.lang.String r0 = "camera_connect_finished"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x010c:
            java.lang.String r0 = "camera_swipe_to_open_finished"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x0116:
            java.lang.String r0 = "camera_connect_started"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x0120:
            java.lang.String r0 = "photo_capture_failed"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x012a
            goto L_0x002a
        L_0x012a:
            X.7rF r0 = r10.A01
            java.lang.String r11 = r0.onFailureEvent(r9, r2, r4, r3)
            goto L_0x002a
        L_0x0132:
            java.lang.String r0 = "camera_update_requested"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x013c
            goto L_0x002a
        L_0x013c:
            android.content.Context r0 = r10.A02
            if (r0 == 0) goto L_0x0146
            boolean r0 = r10.A00
            r16 = 1
            if (r0 == 0) goto L_0x0148
        L_0x0146:
            r16 = 0
        L_0x0148:
            X.7rF r0 = r10.A01
            r19 = r0
            int r0 = r10.A03
            r21 = r0
            java.lang.String r15 = r10.A01
            java.lang.String r14 = r10.A00
            java.lang.String r13 = r10.A04
            X.7rJ r0 = r10.A06
            int r7 = r0.A00
            java.util.List r6 = r0.A05
            java.util.List r5 = r0.A06
            java.util.List r4 = r0.A07
            if (r16 == 0) goto L_0x01e0
            X.7qt r0 = r10.A00
            android.content.Context r0 = r0.getContext()
            int r0 = X.C342127o5.A00(r0, r8)
            long r2 = (long) r0
            X.7qt r0 = r10.A00
            android.content.Context r0 = r0.getContext()
            int r0 = X.C342127o5.A00(r0, r1)
            long r0 = (long) r0
        L_0x0178:
            if (r12 == 0) goto L_0x0181
            int r11 = r12.hashCode()
            switch(r11) {
                case -779044650: goto L_0x01b1;
                case -85671418: goto L_0x01ba;
                case 371328422: goto L_0x01c3;
                case 440515259: goto L_0x01cc;
                case 1266396786: goto L_0x01d5;
                default: goto L_0x0181;
            }
        L_0x0181:
            r35 = -1
        L_0x0183:
            if (r16 == 0) goto L_0x0193
            X.7qt r11 = r10.A00
            android.content.Context r11 = r11.getContext()
            boolean r11 = X.C342127o5.A01(r11)
            r38 = 1
            if (r11 != 0) goto L_0x0195
        L_0x0193:
            r38 = 0
        L_0x0195:
            r31 = r2
            r33 = r0
            r37 = r8
            r22 = r15
            r23 = r14
            r24 = r13
            r25 = r7
            r26 = r6
            r27 = r5
            r28 = r4
            r20 = r9
            java.lang.String r11 = r19.onEvent(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37, r38)
            goto L_0x002a
        L_0x01b1:
            java.lang.String r11 = "NATIVE_LOW_LIGHT_PHOTO"
            boolean r11 = r12.equals(r11)
            r35 = 4
            goto L_0x01dd
        L_0x01ba:
            java.lang.String r11 = "NATIVE_VIEW_SIZE_PHOTO"
            boolean r11 = r12.equals(r11)
            r35 = 2
            goto L_0x01dd
        L_0x01c3:
            java.lang.String r11 = "PREVIEW_BITMAP"
            boolean r11 = r12.equals(r11)
            r35 = 1
            goto L_0x01dd
        L_0x01cc:
            java.lang.String r11 = "PREVIEW_PHOTO"
            boolean r11 = r12.equals(r11)
            r35 = 0
            goto L_0x01dd
        L_0x01d5:
            java.lang.String r11 = "NATIVE_FULL_SIZE_FILE"
            boolean r11 = r12.equals(r11)
            r35 = 3
        L_0x01dd:
            if (r11 != 0) goto L_0x0183
            goto L_0x0181
        L_0x01e0:
            r2 = -1
            r0 = -1
            goto L_0x0178
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344017rB.A07(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.Map, int):java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r2.A00 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        if (X.C342127o5.A01(r2.A00.getContext()) == false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0E(java.lang.String r31, java.util.Map r32, java.lang.String r33) {
        /*
            r30 = this;
            long r8 = android.os.SystemClock.elapsedRealtimeNanos()
            r2 = r30
            r7 = r31
            r3 = r32
            r4 = r33
            super.A0E(r7, r3, r4)
            java.lang.String r0 = "camera_disconnect_finished"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0084
            r5 = 0
            if (r32 == 0) goto L_0x0092
            java.lang.String r1 = "evicted_during_disconnect"
            boolean r0 = r3.containsKey(r1)
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            boolean r28 = java.lang.Boolean.parseBoolean(r0)
        L_0x002c:
            android.content.Context r0 = r2.A02
            r6 = 1
            if (r0 == 0) goto L_0x0036
            boolean r0 = r2.A00
            r3 = 1
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            r3 = 0
        L_0x0037:
            X.7rF r10 = r2.A01
            int r11 = A03(r7, r4)
            int r12 = r2.A03
            java.lang.String r13 = r2.A01
            java.lang.String r14 = r2.A00
            java.lang.String r15 = r2.A04
            r17 = 0
            r0 = -1
            if (r3 == 0) goto L_0x008f
            X.7qt r0 = r2.A00
            android.content.Context r0 = r0.getContext()
            int r0 = X.C342127o5.A00(r0, r5)
            long r3 = (long) r0
            X.7qt r0 = r2.A00
            android.content.Context r0 = r0.getContext()
            int r0 = X.C342127o5.A00(r0, r6)
            long r0 = (long) r0
            X.7qt r6 = r2.A00
            android.content.Context r6 = r6.getContext()
            boolean r6 = X.C342127o5.A01(r6)
            r29 = 1
            if (r6 != 0) goto L_0x0071
        L_0x006f:
            r29 = 0
        L_0x0071:
            r16 = -1
            r20 = -1
            r18 = r17
            r19 = r17
            r22 = r3
            r24 = r0
            r26 = r16
            r27 = r5
            r10.onEvent(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r22, r24, r26, r27, r28, r29)
        L_0x0084:
            long r3 = r2.A03
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            long r0 = r0 - r8
            long r3 = r3 + r0
            r2.A03 = r3
            return
        L_0x008f:
            r3 = -1
            goto L_0x006f
        L_0x0092:
            r28 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344017rB.A0E(java.lang.String, java.util.Map, java.lang.String):void");
    }

    public final void DD9(int i) {
        int A022 = A02(i);
        C343997r9 r1 = this.A05;
        r1.BiP().markerStart(A022);
        QuickPerformanceLogger BiP = r1.BiP();
        BiP.markerTag(A022, 002.A0R("product_name:", this.A00));
        BiP.markerAnnotate(A022, "product_name", this.A00);
        String str = this.A01;
        if (str != null && !str.isEmpty()) {
            BiP.markerTag(A022, 002.A0R("product_session_id:", str));
            BiP.markerAnnotate(A022, "product_session_id", this.A01);
        }
        C344097rJ r4 = this.A06;
        boolean z = !r4.A05.isEmpty();
        BiP.markerTag(A022, 002.A1D("enabled_effects:", z));
        BiP.markerAnnotate(A022, "enabled_effects", z);
        String str2 = (String) this.A07.A00.get(C344137rN.A01);
        if (str2 != null) {
            BiP.markerTag(A022, 002.A0R("media_pipeline_session_id:", str2));
            BiP.markerAnnotate(A022, "media_pipeline_session_id", str2);
        }
        BiP.markerAnnotate(A022, "enabled_effect_ids", C239023El.A00(',').A02(r4.A05));
    }

    public C344017rB(C343837qt r3, C343997r9 r4, C344057rF r5) {
        super(r3, r4);
        Context context;
        try {
            context = this.A00.getContext();
        } catch (RuntimeException unused) {
            context = null;
        }
        this.A02 = context;
        this.A03 = 0;
        this.A00 = false;
        this.A01 = r5;
    }
}
