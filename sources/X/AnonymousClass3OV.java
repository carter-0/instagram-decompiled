package X;

import android.os.Build;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.debug.quickexperiment.dumper.QuickExperimentDumperPlugin;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3OV  reason: invalid class name */
public final class AnonymousClass3OV {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 0;
    public int A05 = 0;
    public long A06 = -1;
    public long A07 = -1;
    public long A08 = -1;
    public C247863h2 A09;
    public Integer A0A = 0;
    public Integer A0B = AnonymousClass05K.A0j;
    public String A0C;
    public String A0D;
    public String A0E;
    public AtomicInteger A0F;
    public boolean A0G = false;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J = false;
    public boolean A0K = false;
    public final int A0L;
    public final int A0M;
    public final Handler A0N;
    public final AnonymousClass0JR A0O;
    public final C246573ep A0P;
    public final C246583eq A0Q;
    public final 02m A0R;
    public final UserSession A0S;
    public final ImageUrl A0T;
    public final Integer A0U;
    public final Integer A0V;
    public final String A0W;
    public final boolean A0X;
    public final boolean A0Y;
    public final boolean A0Z;
    public final boolean A0a;

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0224, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A01.A00, 36321529105098233L) == false) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0226, code lost:
        r10.markerAnnotate(r11, r12, "MEDIA_ID", r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x022f, code lost:
        switch(r7.intValue()) {
            case 1: goto L_0x02fa;
            case 2: goto L_0x02fe;
            case 3: goto L_0x0302;
            case 4: goto L_0x0306;
            default: goto L_0x0232;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0232, code lost:
        r1 = "UNKOWN";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0234, code lost:
        r10.markerAnnotate(r11, r12, "IMAGE_TYPE", r1);
        r10.markerAnnotate(r11, r12, "IS_GRID_VIEW", false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0243, code lost:
        if (r5.A0B != X.AnonymousClass05K.A0N) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0245, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0246, code lost:
        r10.markerAnnotate(r11, r12, "RENDERED", r3);
        r10.markerAnnotate(r11, r12, "IS_CAROUSEL", r22);
        r10.markerAnnotate(r11, r12, "LOGGING_FRAMEWORK", "self_logging");
        r1 = r5.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004e, code lost:
        r1 = X.C66579MXk.A00(1036);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x025b, code lost:
        if (r1 == null) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x025d, code lost:
        r10.markerAnnotate(r11, r12, "LOAD_SOURCE", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0262, code lost:
        r1 = r5.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x0264, code lost:
        if (r1 == 0) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0266, code lost:
        r10.markerAnnotate(r11, r12, "VIEW_WIDTH", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x026b, code lost:
        r1 = r5.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x026d, code lost:
        if (r1 == 0) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x026f, code lost:
        r10.markerAnnotate(r11, r12, "VIEW_HEIGHT", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0274, code lost:
        r10.markerAnnotate(r11, r12, "IS_AD", r5.A0Y);
        r10.markerAnnotate(r11, r12, "AD_TYPE", X.AnonymousClass5MO.A00(r5.A0U));
        r1 = r2.C91();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x028a, code lost:
        if (r1 == null) goto L_0x0291;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0054, code lost:
        r10.markerAnnotate(r11, r12, "media_type", r1);
        r1 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x028c, code lost:
        r10.markerAnnotate(r11, r12, "TRACE_TOKEN", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0291, code lost:
        r1 = X.AnonymousClass5MP.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0296, code lost:
        if (r1 == -1) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0298, code lost:
        r10.markerAnnotate(r11, r12, "TARGET_SCAN", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x029d, code lost:
        r0 = r5.A0F;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x029f, code lost:
        if (r0 == null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02a1, code lost:
        r10.markerAnnotate(r11, r12, "SCAN_NUMBER", r0.get());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02aa, code lost:
        r1 = r5.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x02ac, code lost:
        if (r1 == null) goto L_0x02b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02ae, code lost:
        r10.markerAnnotate(r11, r12, "FAILURE_ERROR_MESSAGE", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005b, code lost:
        if (r1 == null) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02b3, code lost:
        r1 = r5.A0A.intValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x02b9, code lost:
        if (r1 == 0) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x02bb, code lost:
        r10.markerAnnotate(r11, r12, "FAILURE_ERROR_CODE", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02c0, code lost:
        r1 = r5.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02c2, code lost:
        if (r1 == null) goto L_0x02c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02c4, code lost:
        r10.markerAnnotate(r11, r12, "FAILURE_ERROR_DOMAIN", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02c9, code lost:
        r10.markerAnnotate(r11, r12, com.facebook.react.modules.statusbar.StatusBarModule.HEIGHT_KEY, r5.A01);
        r10.markerAnnotate(r11, r12, "WIDTH", r5.A02);
        r10.markerAnnotate(r11, r12, "IS_VIDEO_COVER", r5.A0J);
        r1 = r5.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02e0, code lost:
        if (r1 <= 0) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02e2, code lost:
        r10.markerAnnotate(r11, r12, "BYTE_SIZE", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02e7, code lost:
        r1 = r5.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        r10.markerAnnotate(r11, r12, "open_thread_id", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e9, code lost:
        if (r1 <= 0) goto L_0x02f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02eb, code lost:
        r10.markerAnnotate(r11, r12, "ENCODED_BYTE_SIZE", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f0, code lost:
        r6 = X.1Bh.A00();
        r14 = r6.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f8, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02fa, code lost:
        r1 = "MEDIA";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x02fe, code lost:
        r1 = "SHOPPING_PRODUCT_CARD";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0302, code lost:
        r1 = "SHOPPING_CONTENT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0306, code lost:
        r1 = "SHOPPING_SHORTCUT_BUTTON";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x030c, code lost:
        if (r6.A06 != true) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0062, code lost:
        r1 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:?, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0312, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0313, code lost:
        monitor-enter(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r2 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0316, code lost:
        monitor-exit(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x031b, code lost:
        if (r14 == -1.0d) goto L_0x032e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x031d, code lost:
        r10.markerAnnotate(r11, r12, "BANDWIDTH_KBPS", r14);
        r10.markerAnnotate(r11, r12, "ESTIMATED_BANDWIDTH_TOTAL_BYTES_B", r0);
        r10.markerAnnotate(r11, r12, "ESTIMATED_BANDWIDTH_TOTAL_TIME_MS", r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0064, code lost:
        if (r1 == null) goto L_0x006b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x032e, code lost:
        r3 = r5.A0B.intValue();
        r13 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0338, code lost:
        if (r3 == 0) goto L_0x0355;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x033a, code lost:
        if (r3 == 1) goto L_0x0353;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x033c, code lost:
        if (r3 == 2) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x033e, code lost:
        if (r3 == 4) goto L_0x034d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0341, code lost:
        if (r3 == 3) goto L_0x0345;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0343, code lost:
        r13 = 51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0345, code lost:
        r10.markerEnd(r11, r12, r13, r20, java.util.concurrent.TimeUnit.NANOSECONDS);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x034c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0066, code lost:
        r10.markerAnnotate(r11, r12, com.facebook.proxygen.TraceFieldType.TransportType, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x034d, code lost:
        r13 = 11306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x0350, code lost:
        r13 = 477;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x0353, code lost:
        r13 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0355, code lost:
        r13 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        r1 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r1 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006f, code lost:
        r10.markerAnnotate(r11, r12, "persistent_id", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0074, code lost:
        r1 = r5.A0G;
        r2 = r5.A0T;
        r7 = r2.getUrl();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        if (r5.A0X == false) goto L_0x00ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0080, code lost:
        if (r7 == null) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0088, code lost:
        if (r7.contains("stp=dst-jpegr") == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        r8 = true;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0092, code lost:
        if (r7.contains("se=-1") == false) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0095, code lost:
        r0 = X.C240053Jk.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0099, code lost:
        if (r1 == false) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x009b, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x009c, code lost:
        if (r0 != false) goto L_0x009f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x009e, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009f, code lost:
        r10.markerAnnotate(r11, r12, "stored_image_has_gain_map", r8);
        r10.markerAnnotate(r11, r12, "fetched_image_has_gain_map", r4);
        r10.markerAnnotate(r11, r12, "rendered_image_is_hdr", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        if (r7 == null) goto L_0x01ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r8 = android.net.Uri.parse(r7);
        r9 = r8.getPath();
        r4 = X.0sr.A1P(new java.lang.String[]{"ccb", "edm", "stp", "se"});
        r1 = X.0se.A0L(X.0Yv.A1E(r4, 10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d4, code lost:
        if (r1 >= 16) goto L_0x00d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d6, code lost:
        r1 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d8, code lost:
        r7 = new java.util.LinkedHashMap(r1);
        r4 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        if (r4.hasNext() == false) goto L_0x018a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e7, code lost:
        r1 = r4.next();
        r7.put(r1, r8.getQueryParameter((java.lang.String) r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f6, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00f8, code lost:
        r1 = "permanent_video_cover";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00fc, code lost:
        r1 = X.C66579MXk.A00(821);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        r1 = "ephemeral_video_cover";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0108, code lost:
        r1 = X.AnonymousClass000.A00(1745);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0110, code lost:
        r1 = X.AnonymousClass000.A00(3122);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0118, code lost:
        r1 = X.C273654mx.A00(974);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0120, code lost:
        r1 = X.AnonymousClass000.A00(797);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        switch(r0.intValue()) {
            case 0: goto L_0x015c;
            case 1: goto L_0x0150;
            case 2: goto L_0x0158;
            default: goto L_0x0024;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0128, code lost:
        r1 = X.AnonymousClass000.A00(1851);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0130, code lost:
        r1 = "story_other";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0134, code lost:
        r1 = "stacks_image";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0138, code lost:
        r1 = "stacks_video_cover";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x013c, code lost:
        r1 = X.C66579MXk.A00(348);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0144, code lost:
        r1 = "xma_other";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0148, code lost:
        r1 = "other";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x014c, code lost:
        r1 = "avatar_sticker";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0150, code lost:
        r1 = X.AnonymousClass000.A00(5331);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0158, code lost:
        r1 = "full_view";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        r1 = "other";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015c, code lost:
        r1 = "chat_thread";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0178, code lost:
        if (r1.equals(r0) == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x017a, code lost:
        r0 = X.AnonymousClass05K.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0026, code lost:
        r10.markerAnnotate(r11, r12, "interface_identifier", r1);
        r6 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0184, code lost:
        if (r1.equals(r0) == false) goto L_0x001b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0186, code lost:
        r0 = X.AnonymousClass05K.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x018a, code lost:
        r8 = new android.net.Uri.Builder();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x018f, code lost:
        if (r9 == null) goto L_0x0194;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0191, code lost:
        r8.path(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0194, code lost:
        r7 = r7.entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01a0, code lost:
        if (r7.hasNext() == false) goto L_0x01be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002d, code lost:
        if (r17 == null) goto L_0x0074;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01a2, code lost:
        r4 = (java.util.Map.Entry) r7.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ac, code lost:
        if (r4.getValue() == null) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ae, code lost:
        r8.appendQueryParameter((java.lang.String) r4.getKey(), (java.lang.String) r4.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01be, code lost:
        r1 = r8.toString();
        X.0qQ.A07(r1);
        r10.markerAnnotate(r11, r12, "normalized_url", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ca, code lost:
        r7 = r5.A0V;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01ce, code lost:
        if (r7 != X.AnonymousClass05K.A01) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01d0, code lost:
        r8 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x01d2, code lost:
        if (r18 == null) goto L_0x022b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x01d4, code lost:
        r4 = r5.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x01d7, code lost:
        if (r17 != null) goto L_0x030a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002f, code lost:
        r10.markerAnnotate(r11, r12, "is_vm", r6.A07);
        r10.markerAnnotate(r11, r12, "is_instamadillo", r6.A05);
        r10.markerAnnotate(r11, r12, "ephemeral_lifetime_ms", r6.A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01e3, code lost:
        if (X.0qQ.A0K(r16.getModuleName(), "direct_thread") != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01ef, code lost:
        if (X.0qQ.A0K(r16.getModuleName(), "direct_story_viewer_fragment") != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01fb, code lost:
        if (X.0qQ.A0K(r16.getModuleName(), "direct_aggregated_media_viewer") != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0207, code lost:
        if (X.0qQ.A0K(r16.getModuleName(), "direct_thread_shared_media") != false) goto L_0x0215;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0213, code lost:
        if (X.0qQ.A0K(r16.getModuleName(), "direct_thread_shared_posts") == false) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x004b, code lost:
        switch(r6.A01.intValue()) {
            case 1: goto L_0x00f8;
            case 2: goto L_0x00fc;
            case 3: goto L_0x0104;
            case 4: goto L_0x0108;
            case 5: goto L_0x0110;
            case 6: goto L_0x0118;
            case 7: goto L_0x0120;
            case 8: goto L_0x0128;
            case 9: goto L_0x0130;
            case 10: goto L_0x0134;
            case 11: goto L_0x0138;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x013c;
            case 13: goto L_0x0144;
            case 14: goto L_0x0148;
            case 15: goto L_0x014c;
            default: goto L_0x004e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.AnonymousClass3OV r15, X.AnonymousClass0iw r16, X.AnonymousClass4KO r17, java.lang.String r18, int r19, long r20, boolean r22) {
        /*
            r3 = 0
            r5 = r15
            X.02m r10 = r15.A0R
            int r12 = r15.A0M
            long r0 = r15.A06
            java.lang.String r13 = "TIME_ON_VIEWPORT"
            r11 = r19
            r14 = r0
            r10.markerAnnotate(r11, r12, r13, r14)
            java.lang.String r1 = r16.getModuleName()
            int r0 = r1.hashCode()
            switch(r0) {
                case -1676348739: goto L_0x017e;
                case -1255147959: goto L_0x0172;
                case -1252064712: goto L_0x016f;
                case -676534496: goto L_0x0163;
                case -437765135: goto L_0x0160;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x001d:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x015c;
                case 1: goto L_0x0150;
                case 2: goto L_0x0158;
                default: goto L_0x0024;
            }
        L_0x0024:
            java.lang.String r1 = "other"
        L_0x0026:
            java.lang.String r0 = "interface_identifier"
            r10.markerAnnotate(r11, r12, r0, r1)
            r6 = r17
            if (r17 == 0) goto L_0x0074
            boolean r1 = r6.A07
            java.lang.String r0 = "is_vm"
            r10.markerAnnotate(r11, r12, r0, r1)
            boolean r1 = r6.A05
            java.lang.String r0 = "is_instamadillo"
            r10.markerAnnotate(r11, r12, r0, r1)
            long r0 = r6.A00
            java.lang.String r13 = "ephemeral_lifetime_ms"
            r14 = r0
            r10.markerAnnotate(r11, r12, r13, r14)
            java.lang.Integer r0 = r6.A01
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x00f8;
                case 2: goto L_0x00fc;
                case 3: goto L_0x0104;
                case 4: goto L_0x0108;
                case 5: goto L_0x0110;
                case 6: goto L_0x0118;
                case 7: goto L_0x0120;
                case 8: goto L_0x0128;
                case 9: goto L_0x0130;
                case 10: goto L_0x0134;
                case 11: goto L_0x0138;
                case 12: goto L_0x013c;
                case 13: goto L_0x0144;
                case 14: goto L_0x0148;
                case 15: goto L_0x014c;
                default: goto L_0x004e;
            }
        L_0x004e:
            r0 = 1036(0x40c, float:1.452E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
        L_0x0054:
            java.lang.String r0 = "media_type"
            r10.markerAnnotate(r11, r12, r0, r1)
            java.lang.String r1 = r6.A02
            if (r1 == 0) goto L_0x0062
            java.lang.String r0 = "open_thread_id"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x0062:
            java.lang.String r1 = r6.A04
            if (r1 == 0) goto L_0x006b
            java.lang.String r0 = "transport_type"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x006b:
            java.lang.String r1 = r6.A03
            if (r1 == 0) goto L_0x0074
            java.lang.String r0 = "persistent_id"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x0074:
            boolean r1 = r5.A0G
            com.instagram.common.typedurl.ImageUrl r2 = r5.A0T
            java.lang.String r7 = r2.getUrl()
            boolean r0 = r5.A0X
            if (r0 == 0) goto L_0x00ae
            if (r7 == 0) goto L_0x00f6
            java.lang.String r0 = "stp=dst-jpegr"
            boolean r0 = r7.contains(r0)
            if (r0 == 0) goto L_0x00f6
            r8 = 1
            java.lang.String r0 = "se=-1"
            boolean r0 = r7.contains(r0)
            r4 = 1
            if (r0 == 0) goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            boolean r0 = X.C240053Jk.A01()
            if (r1 == 0) goto L_0x009e
            r1 = 1
            if (r0 != 0) goto L_0x009f
        L_0x009e:
            r1 = 0
        L_0x009f:
            java.lang.String r0 = "stored_image_has_gain_map"
            r10.markerAnnotate(r11, r12, r0, r8)
            java.lang.String r0 = "fetched_image_has_gain_map"
            r10.markerAnnotate(r11, r12, r0, r4)
            java.lang.String r0 = "rendered_image_is_hdr"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x00ae:
            if (r7 == 0) goto L_0x01ca
            android.net.Uri r8 = android.net.Uri.parse(r7)
            java.lang.String r9 = r8.getPath()
            java.lang.String r7 = "ccb"
            java.lang.String r4 = "edm"
            java.lang.String r1 = "stp"
            java.lang.String r0 = "se"
            java.lang.String[] r0 = new java.lang.String[]{r7, r4, r1, r0}
            java.util.List r4 = X.0sr.A1P(r0)
            r0 = 10
            int r0 = X.0Yv.A1E(r4, r0)
            int r1 = X.0se.A0L(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x00d8
            r1 = 16
        L_0x00d8:
            java.util.LinkedHashMap r7 = new java.util.LinkedHashMap
            r7.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x00e1:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x018a
            java.lang.Object r1 = r4.next()
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = r8.getQueryParameter(r0)
            r7.put(r1, r0)
            goto L_0x00e1
        L_0x00f6:
            r8 = 0
            goto L_0x0094
        L_0x00f8:
            java.lang.String r1 = "permanent_video_cover"
            goto L_0x0054
        L_0x00fc:
            r0 = 821(0x335, float:1.15E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            goto L_0x0054
        L_0x0104:
            java.lang.String r1 = "ephemeral_video_cover"
            goto L_0x0054
        L_0x0108:
            r0 = 1745(0x6d1, float:2.445E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x0054
        L_0x0110:
            r0 = 3122(0xc32, float:4.375E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x0054
        L_0x0118:
            r0 = 974(0x3ce, float:1.365E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            goto L_0x0054
        L_0x0120:
            r0 = 797(0x31d, float:1.117E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x0054
        L_0x0128:
            r0 = 1851(0x73b, float:2.594E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x0054
        L_0x0130:
            java.lang.String r1 = "story_other"
            goto L_0x0054
        L_0x0134:
            java.lang.String r1 = "stacks_image"
            goto L_0x0054
        L_0x0138:
            java.lang.String r1 = "stacks_video_cover"
            goto L_0x0054
        L_0x013c:
            r0 = 348(0x15c, float:4.88E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            goto L_0x0054
        L_0x0144:
            java.lang.String r1 = "xma_other"
            goto L_0x0054
        L_0x0148:
            java.lang.String r1 = "other"
            goto L_0x0054
        L_0x014c:
            java.lang.String r1 = "avatar_sticker"
            goto L_0x0054
        L_0x0150:
            r0 = 5331(0x14d3, float:7.47E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            goto L_0x0026
        L_0x0158:
            java.lang.String r1 = "full_view"
            goto L_0x0026
        L_0x015c:
            java.lang.String r1 = "chat_thread"
            goto L_0x0026
        L_0x0160:
            java.lang.String r0 = "direct_aggregated_media_viewer"
            goto L_0x0180
        L_0x0163:
            java.lang.String r0 = "direct_thread"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x001d
        L_0x016f:
            java.lang.String r0 = "direct_thread_shared_posts"
            goto L_0x0174
        L_0x0172:
            java.lang.String r0 = "direct_thread_shared_media"
        L_0x0174:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            goto L_0x001d
        L_0x017e:
            java.lang.String r0 = "direct_story_viewer_fragment"
        L_0x0180:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            goto L_0x001d
        L_0x018a:
            android.net.Uri$Builder r8 = new android.net.Uri$Builder
            r8.<init>()
            if (r9 == 0) goto L_0x0194
            r8.path(r9)
        L_0x0194:
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r7 = r0.iterator()
        L_0x019c:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x01be
            java.lang.Object r4 = r7.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getValue()
            if (r0 == 0) goto L_0x019c
            java.lang.Object r1 = r4.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r4.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r8.appendQueryParameter(r1, r0)
            goto L_0x019c
        L_0x01be:
            java.lang.String r1 = r8.toString()
            X.0qQ.A07(r1)
            java.lang.String r0 = "normalized_url"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x01ca:
            java.lang.Integer r7 = r5.A0V
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r7 != r0) goto L_0x022b
            r8 = r18
            if (r18 == 0) goto L_0x022b
            X.3h2 r4 = r5.A09
            r1 = 1
            if (r17 != 0) goto L_0x030a
            java.lang.String r1 = r16.getModuleName()
            java.lang.String r0 = "direct_thread"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0215
            java.lang.String r1 = r16.getModuleName()
            java.lang.String r0 = "direct_story_viewer_fragment"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0215
            java.lang.String r1 = r16.getModuleName()
            java.lang.String r0 = "direct_aggregated_media_viewer"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0215
            java.lang.String r1 = r16.getModuleName()
            java.lang.String r0 = "direct_thread_shared_media"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x0215
            java.lang.String r1 = r16.getModuleName()
            java.lang.String r0 = "direct_thread_shared_posts"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0226
        L_0x0215:
            X.3h3 r0 = r4.A01
            com.instagram.common.session.UserSession r6 = r0.A00
            X.0Tu r4 = X.0Tu.A05
            r0 = 36321529105098233(0x810a3d000225f9, double:3.0332194888980255E-306)
            boolean r0 = X.182.A06(r4, r6, r0)
            if (r0 == 0) goto L_0x022b
        L_0x0226:
            java.lang.String r0 = "MEDIA_ID"
            r10.markerAnnotate(r11, r12, r0, r8)
        L_0x022b:
            int r0 = r7.intValue()
            switch(r0) {
                case 1: goto L_0x02fa;
                case 2: goto L_0x02fe;
                case 3: goto L_0x0302;
                case 4: goto L_0x0306;
                default: goto L_0x0232;
            }
        L_0x0232:
            java.lang.String r1 = "UNKOWN"
        L_0x0234:
            java.lang.String r0 = "IMAGE_TYPE"
            r10.markerAnnotate(r11, r12, r0, r1)
            java.lang.String r0 = "IS_GRID_VIEW"
            r10.markerAnnotate(r11, r12, r0, r3)
            java.lang.Integer r1 = r5.A0B
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            r4 = 0
            if (r1 != r0) goto L_0x0246
            r3 = 1
        L_0x0246:
            java.lang.String r0 = "RENDERED"
            r10.markerAnnotate(r11, r12, r0, r3)
            java.lang.String r0 = "IS_CAROUSEL"
            r1 = r22
            r10.markerAnnotate(r11, r12, r0, r1)
            java.lang.String r1 = "self_logging"
            java.lang.String r0 = "LOGGING_FRAMEWORK"
            r10.markerAnnotate(r11, r12, r0, r1)
            java.lang.String r1 = r5.A0E
            if (r1 == 0) goto L_0x0262
            java.lang.String r0 = "LOAD_SOURCE"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x0262:
            int r1 = r5.A05
            if (r1 == 0) goto L_0x026b
            java.lang.String r0 = "VIEW_WIDTH"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x026b:
            int r1 = r5.A04
            if (r1 == 0) goto L_0x0274
            java.lang.String r0 = "VIEW_HEIGHT"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x0274:
            boolean r1 = r5.A0Y
            java.lang.String r0 = "IS_AD"
            r10.markerAnnotate(r11, r12, r0, r1)
            java.lang.Integer r0 = r5.A0U
            java.lang.String r1 = X.AnonymousClass5MO.A00(r0)
            java.lang.String r0 = "AD_TYPE"
            r10.markerAnnotate(r11, r12, r0, r1)
            java.lang.String r1 = r2.C91()
            if (r1 == 0) goto L_0x0291
            java.lang.String r0 = "TRACE_TOKEN"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x0291:
            int r1 = X.AnonymousClass5MP.A00(r2)
            r0 = -1
            if (r1 == r0) goto L_0x029d
            java.lang.String r0 = "TARGET_SCAN"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x029d:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.A0F
            if (r0 == 0) goto L_0x02aa
            int r1 = r0.get()
            java.lang.String r0 = "SCAN_NUMBER"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x02aa:
            java.lang.String r1 = r5.A0D
            if (r1 == 0) goto L_0x02b3
            java.lang.String r0 = "FAILURE_ERROR_MESSAGE"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x02b3:
            java.lang.Integer r0 = r5.A0A
            int r1 = r0.intValue()
            if (r1 == 0) goto L_0x02c0
            java.lang.String r0 = "FAILURE_ERROR_CODE"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x02c0:
            java.lang.String r1 = r5.A0C
            if (r1 == 0) goto L_0x02c9
            java.lang.String r0 = "FAILURE_ERROR_DOMAIN"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x02c9:
            int r1 = r5.A01
            java.lang.String r0 = "HEIGHT"
            r10.markerAnnotate(r11, r12, r0, r1)
            int r1 = r5.A02
            java.lang.String r0 = "WIDTH"
            r10.markerAnnotate(r11, r12, r0, r1)
            boolean r1 = r5.A0J
            java.lang.String r0 = "IS_VIDEO_COVER"
            r10.markerAnnotate(r11, r12, r0, r1)
            int r1 = r5.A03
            if (r1 <= 0) goto L_0x02e7
            java.lang.String r0 = "BYTE_SIZE"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x02e7:
            int r1 = r5.A00
            if (r1 <= 0) goto L_0x02f0
            java.lang.String r0 = "ENCODED_BYTE_SIZE"
            r10.markerAnnotate(r11, r12, r0, r1)
        L_0x02f0:
            X.1Bh r6 = X.1Bh.A00()
            double r14 = r6.A01()
            monitor-enter(r6)
            goto L_0x0310
        L_0x02fa:
            java.lang.String r1 = "MEDIA"
            goto L_0x0234
        L_0x02fe:
            java.lang.String r1 = "SHOPPING_PRODUCT_CARD"
            goto L_0x0234
        L_0x0302:
            java.lang.String r1 = "SHOPPING_CONTENT"
            goto L_0x0234
        L_0x0306:
            java.lang.String r1 = "SHOPPING_SHORTCUT_BUTTON"
            goto L_0x0234
        L_0x030a:
            boolean r0 = r6.A06
            if (r0 != r1) goto L_0x0215
            goto L_0x022b
        L_0x0310:
            long r0 = r6.A02     // Catch:{ all -> 0x0357 }
            monitor-exit(r6)
            monitor-enter(r6)
            long r2 = r6.A03     // Catch:{ all -> 0x0357 }
            monitor-exit(r6)
            r7 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r6 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x032e
            java.lang.String r13 = "BANDWIDTH_KBPS"
            r10.markerAnnotate(r11, r12, r13, r14)
            java.lang.String r13 = "ESTIMATED_BANDWIDTH_TOTAL_BYTES_B"
            r14 = r0
            r10.markerAnnotate(r11, r12, r13, r14)
            java.lang.String r13 = "ESTIMATED_BANDWIDTH_TOTAL_TIME_MS"
            r14 = r2
            r10.markerAnnotate(r11, r12, r13, r14)
        L_0x032e:
            java.lang.Integer r0 = r5.A0B
            int r3 = r0.intValue()
            r2 = 4
            r1 = 2
            r13 = 2
            r0 = 1
            if (r3 == r4) goto L_0x0355
            if (r3 == r0) goto L_0x0353
            if (r3 == r1) goto L_0x0350
            if (r3 == r2) goto L_0x034d
            r0 = 3
            if (r3 == r0) goto L_0x0345
            r13 = 51
        L_0x0345:
            java.util.concurrent.TimeUnit r16 = java.util.concurrent.TimeUnit.NANOSECONDS
            r14 = r20
            r10.markerEnd(r11, r12, r13, r14, r16)
            return
        L_0x034d:
            r13 = 11306(0x2c2a, float:1.5843E-41)
            goto L_0x0345
        L_0x0350:
            r13 = 477(0x1dd, float:6.68E-43)
            goto L_0x0345
        L_0x0353:
            r13 = 3
            goto L_0x0345
        L_0x0355:
            r13 = 4
            goto L_0x0345
        L_0x0357:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3OV.A04(X.3OV, X.0iw, X.4KO, java.lang.String, int, long, boolean):void");
    }

    public final void A08(String str, long j) {
        boolean z = this.A0a;
        String str2 = str;
        long j2 = j;
        if (z) {
            C247903h6 r2 = new C247903h6(this, str2, 23410213, j2);
            if (this.A0Z) {
                A05(this, r2, 427135662);
            } else {
                r2.run();
            }
        }
        if (this.A0Q.A00(z)) {
            A05(this, new C247903h6(this, str2, 23399201, j2), 1492230029);
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.0JR] */
    public AnonymousClass3OV(C246573ep r5, C246583eq r6, UserSession userSession, ImageUrl imageUrl, Integer num, Integer num2, boolean z, boolean z2) {
        String str;
        ? obj = new Object();
        boolean z3 = false;
        this.A0J = z2;
        this.A0U = num2;
        this.A0Z = r5.A03;
        this.A0S = userSession;
        this.A0T = imageUrl;
        this.A0V = num;
        this.A0O = obj;
        int hashCode = imageUrl.CCJ().hashCode();
        this.A0M = hashCode;
        this.A0Y = z;
        this.A0P = r5;
        this.A0Q = r6;
        this.A0a = r5.A00(hashCode);
        if (r5.A02 || AnonymousClass20W.A02()) {
            str = QuickExperimentDumperPlugin.NAME;
        } else if (AnonymousClass20W.A02()) {
            str = "transient_analysis";
        } else {
            str = null;
        }
        this.A0W = str;
        0Tu r3 = 0Tu.A05;
        this.A0L = Long.valueOf(182.A01(r3, userSession, 36592283843297676L)).intValue();
        if (Build.VERSION.SDK_INT >= 34 && 182.A06(r3, userSession, 36321945716795238L)) {
            z3 = true;
        }
        this.A0X = z3;
        this.A0N = new Handler(C64021Cb.A00());
        this.A0R = 02m.A0p;
        this.A09 = new C247863h2(userSession);
    }

    public static void A01(AnonymousClass3OV r4, int i, long j) {
        String str;
        Integer num = r4.A0B;
        if (num == AnonymousClass05K.A0N) {
            A02(r4, i, j);
            str = "END_RENDER";
        } else if (num == AnonymousClass05K.A0Y) {
            A03(r4, i, j);
            str = "FALLBACK_RENDER";
        } else {
            str = "ENTER_VIEWPORT";
        }
        r4.A0R.markerAnnotate(i, r4.A0M, "MEDIA_STATUS_ON_ENTER_VIEW_PORT", str);
    }

    public static void A02(AnonymousClass3OV r9, int i, long j) {
        02m r2 = r9.A0R;
        int i2 = r9.A0M;
        r2.markerPoint(i, i2, "END_RENDER", j, TimeUnit.NANOSECONDS);
        r2.markerAnnotate(i, i2, "IS_VITO", r9.A0K);
    }

    public static void A03(AnonymousClass3OV r6, int i, long j) {
        r6.A0R.markerPoint(i, r6.A0M, "FALLBACK_RENDER", j, TimeUnit.NANOSECONDS);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3h5, java.lang.Runnable] */
    public static void A05(AnonymousClass3OV r2, Runnable runnable, int i) {
        r2.A0N.post(new C247893h5(r2, runnable, i));
    }

    public static void A06(AnonymousClass3OV r9, String str, String str2, int i, long j) {
        02m r3 = r9.A0R;
        int i2 = r9.A0M;
        r3.markerStart(i, i2, j, TimeUnit.NANOSECONDS);
        if (str != null) {
            r3.markerAnnotate(i, i2, "LOGGING_REASON", str);
        }
        r3.markerAnnotate(i, i2, "MODULE", str2);
        ImageUrl imageUrl = r9.A0T;
        r3.markerAnnotate(i, i2, "CDN_CONTENT_TYPE", imageUrl.AmO().A00);
        r3.markerAnnotate(i, i2, "DISK_CACHE_KEY", 1NK.A00().A0L(imageUrl));
        r3.markerAnnotate(i, i2, "CACHE_KEY", ((ImageCacheKey) imageUrl.AjH()).A03);
        r3.markerAnnotate(i, i2, "APP_STARTUP_TYPE", C64031Cc.A09.toString());
        r3.markerAnnotate(i, i2, "APP_STARTUP_TIME_BUCKET", C64031Cc.A00());
    }

    public final /* synthetic */ void A07(int i, String str, long j) {
        this.A0R.markerPoint(i, this.A0M, str, j, TimeUnit.NANOSECONDS);
    }

    public static void A00(AnonymousClass3OV r5, int i) {
        if (AnonymousClass20W.A02()) {
            String url = r5.A0T.getUrl();
            int indexOf = url.indexOf(63);
            if (indexOf > 0) {
                url = url.substring(0, indexOf);
            }
            r5.A0R.markerAnnotate(i, r5.A0M, "URI_HASH", url.hashCode());
        }
    }
}
