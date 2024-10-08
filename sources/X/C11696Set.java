package X;

import android.util.SparseArray;
import androidx.media3.common.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.Set  reason: case insensitive filesystem */
public final class C11696Set implements C13809Thc {
    public static final Map A0u = Pxh.A0x(C51967G9n.A0k(), AnonymousClass7TE.A1E());
    public static final UUID A0v = new UUID(72057594037932032L, -9223371306706625679L);
    public static final byte[] A0w = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AnonymousClass2RN.A05);
    public static final byte[] A0x = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A0y = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] A0z = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
    public byte A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public int A0C;
    public long A0D;
    public long A0E;
    public long A0F;
    public long A0G;
    public long A0H;
    public long A0I;
    public long A0J;
    public long A0K;
    public long A0L;
    public long A0M;
    public long A0N;
    public long A0O;
    public C10340Rqd A0P;
    public C10340Rqd A0Q;
    public YBZ A0R;
    public SG3 A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public int[] A0b;
    public ByteBuffer A0c;
    public boolean A0d;
    public final SparseArray A0e;
    public final C11389SRd A0f;
    public final C11389SRd A0g;
    public final C11389SRd A0h;
    public final C11389SRd A0i;
    public final C11389SRd A0j;
    public final SHD A0k;
    public final boolean A0l;
    public final C11389SRd A0m;
    public final C11389SRd A0n;
    public final C11389SRd A0o;
    public final C11389SRd A0p;
    public final C11389SRd A0q;
    public final TZc A0r;
    public final C13890TjD A0s;
    public final boolean A0t;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007e, code lost:
        throw X.Pxe.A0g();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d0, code lost:
        java.lang.System.arraycopy(r2, 0, r9, r1, r2.length);
        r1 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00d8, code lost:
        if (r1 >= r7.A00) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00de, code lost:
        if (r7.A02[r1] != 0) goto L_0x00ef;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00e0, code lost:
        r7.A0N(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        r6.A0d.EJf(r7, r7.A00);
        r15 = r15 + r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.SG3 r15, X.C11696Set r16, int r17, int r18, int r19, long r20) {
        /*
            r6 = r15
            r15 = r18
            X.S6Y r11 = r6.A0e
            r5 = 1
            r4 = r16
            r14 = r17
            r16 = r19
            r17 = r20
            if (r11 == 0) goto L_0x001a
            X.TjN r13 = r6.A0d
            X.S4h r12 = r6.A0c
            r11.A02(r12, r13, r14, r15, r16, r17)
        L_0x0017:
            r4.A0d = r5
            return
        L_0x001a:
            java.lang.String r1 = r6.A0f
            java.lang.String r10 = "S_TEXT/UTF8"
            boolean r0 = r10.equals(r1)
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0034
            java.lang.String r0 = "S_TEXT/WEBVTT"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x003f
        L_0x0034:
            int r0 = r4.A03
            java.lang.String r7 = "MatroskaExtractor"
            if (r0 <= r5) goto L_0x0060
            java.lang.String r0 = "Skipping subtitle sample in laced block."
        L_0x003c:
            X.STH.A03(r7, r0)
        L_0x003f:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r14
            if (r0 == 0) goto L_0x004e
            int r0 = r4.A03
            X.SRd r3 = r4.A0j
            if (r0 <= r5) goto L_0x0056
            r0 = 0
            r3.A0M(r0)
        L_0x004e:
            X.TjN r12 = r6.A0d
            X.S4h r13 = r6.A0c
            r12.EJm(r13, r14, r15, r16, r17)
            goto L_0x0017
        L_0x0056:
            int r2 = r3.A00
            X.TjN r1 = r6.A0d
            r0 = 2
            r1.EJg(r3, r2, r0)
            int r15 = r15 + r2
            goto L_0x004e
        L_0x0060:
            long r2 = r4.A0D
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x006e
            java.lang.String r0 = "Skipping subtitle sample with no duration."
            goto L_0x003c
        L_0x006e:
            X.SRd r7 = r4.A0i
            byte[] r9 = r7.A02
            int r0 = r1.hashCode()
            r8 = 0
            switch(r0) {
                case 738597099: goto L_0x007f;
                case 1045209816: goto L_0x009b;
                case 1422270023: goto L_0x00b7;
                default: goto L_0x007a;
            }
        L_0x007a:
            java.lang.IllegalArgumentException r0 = X.Pxe.A0g()
            throw r0
        L_0x007f:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r11 = "%01d:%02d:%02d:%02d"
            r0 = 10000(0x2710, double:4.9407E-320)
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            boolean r10 = X.AnonymousClass7TF.A1P(r10)
            X.C11366SPh.A01(r10)
            byte[] r2 = X.Pxk.A0i(r11, r2, r0)
            r1 = 21
            goto L_0x00d0
        L_0x009b:
            java.lang.String r0 = "S_TEXT/WEBVTT"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x007a
            java.lang.String r11 = "%02d:%02d:%02d.%03d"
            r0 = 1000(0x3e8, double:4.94E-321)
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            boolean r10 = X.AnonymousClass7TF.A1P(r10)
            X.C11366SPh.A01(r10)
            byte[] r2 = X.Pxk.A0i(r11, r2, r0)
            r1 = 25
            goto L_0x00d0
        L_0x00b7:
            boolean r0 = r1.equals(r10)
            if (r0 == 0) goto L_0x007a
            java.lang.String r11 = "%02d:%02d:%02d,%03d"
            r0 = 1000(0x3e8, double:4.94E-321)
            int r10 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            boolean r10 = X.AnonymousClass7TF.A1P(r10)
            X.C11366SPh.A01(r10)
            byte[] r2 = X.Pxk.A0i(r11, r2, r0)
            r1 = 19
        L_0x00d0:
            int r0 = r2.length
            java.lang.System.arraycopy(r2, r8, r9, r1, r0)
            int r1 = r7.A01
        L_0x00d6:
            int r0 = r7.A00
            if (r1 >= r0) goto L_0x00e3
            byte[] r0 = r7.A02
            byte r0 = r0[r1]
            if (r0 != 0) goto L_0x00ef
            r7.A0N(r1)
        L_0x00e3:
            X.TjN r1 = r6.A0d
            int r0 = r7.A00
            r1.EJf(r7, r0)
            int r0 = r7.A00
            int r15 = r15 + r0
            goto L_0x003f
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11696Set.A04(X.SG3, X.Set, int, int, int, long):void");
    }

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01d4, code lost:
        if (r7.equals(r0) == false) goto L_0x016a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d6, code lost:
        r24 = r3.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x01e3, code lost:
        switch(r2) {
            case -2095576542: goto L_0x0208;
            case -2095575984: goto L_0x0211;
            case -1985379776: goto L_0x021a;
            case -1784763192: goto L_0x0223;
            case -1730367663: goto L_0x022c;
            case -1482641358: goto L_0x0235;
            case -1482641357: goto L_0x023e;
            case -1373388978: goto L_0x0247;
            case -933872740: goto L_0x0250;
            case -538363189: goto L_0x025a;
            case -538363109: goto L_0x0264;
            case -425012669: goto L_0x026e;
            case -356037306: goto L_0x0278;
            case 62923557: goto L_0x0282;
            case 62923603: goto L_0x028c;
            case 62927045: goto L_0x0296;
            case 82318131: goto L_0x02a0;
            case 82338133: goto L_0x02aa;
            case 82338134: goto L_0x02b4;
            case 99146302: goto L_0x02bd;
            case 444813526: goto L_0x02c6;
            case 542569478: goto L_0x02cf;
            case 635596514: goto L_0x02d8;
            case 725948237: goto L_0x02e1;
            case 725957860: goto L_0x02ea;
            case 738597099: goto L_0x02f3;
            case 855502857: goto L_0x02fc;
            case 1045209816: goto L_0x0305;
            case 1422270023: goto L_0x030e;
            case 1809237540: goto L_0x0317;
            case 1950749482: goto L_0x0320;
            case 1950789798: goto L_0x0329;
            case 1951062397: goto L_0x0332;
            default: goto L_0x01e6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01e6, code lost:
        r15 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01e7, code lost:
        r2 = ". Setting mimeType to ";
        r8 = "audio/raw";
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01fd, code lost:
        switch(r15) {
            case 0: goto L_0x034d;
            case 1: goto L_0x034d;
            case 2: goto L_0x035c;
            case 3: goto L_0x03a8;
            case 4: goto L_0x03b3;
            case 5: goto L_0x040e;
            case 6: goto L_0x0411;
            case 7: goto L_0x041a;
            case 8: goto L_0x049d;
            case 9: goto L_0x034d;
            case 10: goto L_0x04af;
            case 11: goto L_0x04cb;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x04d8;
            case 13: goto L_0x04dc;
            case 14: goto L_0x04fd;
            case 15: goto L_0x0501;
            case 16: goto L_0x0505;
            case 17: goto L_0x050a;
            case org.webrtc.EglBase14Impl.EGLExt_SDK_VERSION :int: goto L_0x050f;
            case 19: goto L_0x0514;
            case 20: goto L_0x0518;
            case 21: goto L_0x0501;
            case 22: goto L_0x051d;
            case 23: goto L_0x052d;
            case 24: goto L_0x0551;
            case 25: goto L_0x033e;
            case 26: goto L_0x0573;
            case 27: goto L_0x0590;
            case 28: goto L_0x0595;
            case com.facebook.catalyst.modules.cameraroll.CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL :int: goto L_0x0598;
            case 30: goto L_0x059c;
            case 31: goto L_0x05a1;
            case 32: goto L_0x05af;
            default: goto L_0x0200;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0207, code lost:
        throw new X.XQX("Unrecognized codec identifier.", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0208, code lost:
        r2 = r7.equals("V_MPEG4/ISO/AP");
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x0211, code lost:
        r2 = r7.equals("V_MPEG4/ISO/SP");
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x021a, code lost:
        r2 = r7.equals("A_MS/ACM");
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x0223, code lost:
        r2 = r7.equals("A_TRUEHD");
        r15 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x022c, code lost:
        r2 = r7.equals("A_VORBIS");
        r15 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x0235, code lost:
        r2 = r7.equals("A_MPEG/L2");
        r15 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x023e, code lost:
        r2 = r7.equals("A_MPEG/L3");
        r15 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0247, code lost:
        r2 = r7.equals("V_MS/VFW/FOURCC");
        r15 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0250, code lost:
        r2 = r7.equals("S_DVBSUB");
        r15 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x025a, code lost:
        r2 = r7.equals("V_MPEG4/ISO/ASP");
        r15 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0264, code lost:
        r2 = r7.equals("V_MPEG4/ISO/AVC");
        r15 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x026e, code lost:
        r2 = r7.equals("S_VOBSUB");
        r15 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0278, code lost:
        r2 = r7.equals("A_DTS/LOSSLESS");
        r15 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0282, code lost:
        r2 = r7.equals("A_AAC");
        r15 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x028c, code lost:
        r2 = r7.equals("A_AC3");
        r15 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0296, code lost:
        r2 = r7.equals("A_DTS");
        r15 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02a0, code lost:
        r2 = r7.equals("V_AV1");
        r15 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02aa, code lost:
        r2 = r7.equals("V_VP8");
        r15 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02b4, code lost:
        r2 = r7.equals("V_VP9");
        r15 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02bd, code lost:
        r2 = r7.equals("S_HDMV/PGS");
        r15 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02c6, code lost:
        r2 = r7.equals("V_THEORA");
        r15 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02cf, code lost:
        r2 = r7.equals("A_DTS/EXPRESS");
        r15 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02d8, code lost:
        r2 = r7.equals("A_PCM/FLOAT/IEEE");
        r15 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02e1, code lost:
        r2 = r7.equals("A_PCM/INT/BIG");
        r15 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02ea, code lost:
        r2 = r7.equals("A_PCM/INT/LIT");
        r15 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02f3, code lost:
        r2 = r7.equals("S_TEXT/ASS");
        r15 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x02fc, code lost:
        r2 = r7.equals("V_MPEGH/ISO/HEVC");
        r15 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0305, code lost:
        r2 = r7.equals("S_TEXT/WEBVTT");
        r15 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x030e, code lost:
        r2 = r7.equals("S_TEXT/UTF8");
        r15 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0317, code lost:
        r2 = r7.equals("V_MPEG2");
        r15 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0320, code lost:
        r2 = r7.equals("A_EAC3");
        r15 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0329, code lost:
        r2 = r7.equals("A_FLAC");
        r15 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0332, code lost:
        r2 = r7.equals("A_OPUS");
        r15 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x033a, code lost:
        if (r2 != false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x033e, code lost:
        r7 = null;
        r8 = "text/x-ssa";
        r2 = com.google.common.collect.ImmutableList.of(A0w, X.SG3.A00(r3, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x034d, code lost:
        r0 = r3.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x034f, code lost:
        if (r0 != null) goto L_0x0357;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0351, code lost:
        r2 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0352, code lost:
        r8 = "video/mp4v-es";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0357, code lost:
        r2 = java.util.Collections.singletonList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x035c, code lost:
        r1 = X.C11389SRd.A04;
        r7 = new X.C11389SRd(X.SG3.A00(r3, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:?, code lost:
        r9 = r7.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x036b, code lost:
        if (r9 == 1) goto L_0x0398;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0370, code lost:
        if (r9 != 65534) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0372, code lost:
        r7.A0O(24);
        r16 = r7.A0B();
        r1 = A0v;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0381, code lost:
        if (r16 != r1.getMostSignificantBits()) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x038d, code lost:
        if (r7.A0B() != r1.getLeastSignificantBits()) goto L_0x0390;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0390, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x0398, code lost:
        r7 = r3.A0D;
        r12 = androidx.media3.common.util.Util.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x039e, code lost:
        if (r12 != 0) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a0, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r0 = "Unsupported PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03a8, code lost:
        r3.A0e = new X.S6Y();
        r8 = "audio/true-hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03b3, code lost:
        r9 = X.SG3.A00(r3, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03bc, code lost:
        if (r9[0] != 2) goto L_0x10b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03be, code lost:
        r2 = 1;
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c0, code lost:
        r7 = r9[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03c6, code lost:
        if ((r7 & 255) != 255) goto L_0x03cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c8, code lost:
        r13 = r13 + 255;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03cd, code lost:
        r2 = r2 + 1;
        r13 = r13 + (r7 & 255);
        r12 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d2, code lost:
        r7 = r9[r2];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d6, code lost:
        if ((r7 & 255) != 255) goto L_0x03dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d8, code lost:
        r12 = r12 + 255;
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03dd, code lost:
        r2 = r2 + 1;
        r12 = r12 + (r7 & 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03e3, code lost:
        if (r9[r2] != 1) goto L_0x10af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03e5, code lost:
        r7 = new byte[r13];
        java.lang.System.arraycopy(r9, r2, r7, 0, r13);
        r2 = r2 + r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03ed, code lost:
        if (r9[r2] != 3) goto L_0x10a9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03ef, code lost:
        r2 = r2 + r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f3, code lost:
        if (r9[r2] != 5) goto L_0x10a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03f5, code lost:
        r1 = r9.length - r2;
        r0 = new byte[r1];
        java.lang.System.arraycopy(r9, r2, r0, 0, r1);
        r2 = X.DbS.A0v(2);
        r2.add(r7);
        r2.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0406, code lost:
        r8 = "audio/vorbis";
        r7 = null;
        r12 = -1;
        r9 = 8192;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x040e, code lost:
        r8 = "audio/mpeg-L2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0411, code lost:
        r8 = "audio/mpeg";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0413, code lost:
        r2 = null;
        r7 = null;
        r12 = -1;
        r9 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x041a, code lost:
        r0 = X.C11389SRd.A04;
        r8 = new X.C11389SRd(X.SG3.A00(r3, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:?, code lost:
        r8.A0P(16);
        r12 = r8.A0A();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0431, code lost:
        if (r12 != 1482049860) goto L_0x043b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0433, code lost:
        r0 = X.Pxe.A0K("video/divx", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0440, code lost:
        if (r12 != 859189832) goto L_0x044a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0442, code lost:
        r0 = X.Pxe.A0K("video/3gpp", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x044f, code lost:
        if (r12 != 826496599) goto L_0x0487;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x0451, code lost:
        r7 = r8.A01 + 20;
        r6 = r8.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0457, code lost:
        r2 = r6.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x045a, code lost:
        if (r7 >= (r2 - 4)) goto L_0x10c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x045e, code lost:
        if (r6[r7] != 0) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0464, code lost:
        if (r6[r7 + 1] != 0) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x046a, code lost:
        if (r6[r7 + 2] != 1) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0472, code lost:
        if (r6[r7 + 3] != 15) goto L_0x0484;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x0474, code lost:
        r0 = X.Pxe.A0K("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r6, r7, r2)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x0484, code lost:
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x0487, code lost:
        X.STH.A03("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        r0 = X.Pxe.A0K("video/x-unknown", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0493, code lost:
        r8 = (java.lang.String) r0.first;
        r2 = (java.util.List) r0.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x049d, code lost:
        r1 = new byte[4];
        java.lang.System.arraycopy(X.SG3.A00(r3, r7), 0, r1, 0, 4);
        r8 = "application/dvbsubs";
        r2 = com.google.common.collect.ImmutableList.of(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x04af, code lost:
        r0 = X.C11389SRd.A04;
        r1 = X.C11219SFt.A00(new X.C11389SRd(X.SG3.A00(r3, r7)));
        r2 = r1.A0B;
        r3.A0S = r1.A08;
        r7 = r1.A0A;
        r8 = "video/avc";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x04cb, code lost:
        r7 = null;
        r8 = "application/vobsub";
        r2 = com.google.common.collect.ImmutableList.of(X.SG3.A00(r3, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x04d8, code lost:
        r8 = "audio/vnd.dts.hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04dc, code lost:
        r2 = java.util.Collections.singletonList(X.SG3.A00(r3, r7));
        r1 = X.SMh.A01(new X.ST7(r3.A0m), false);
        r3.A0V = r1.A01;
        r3.A0G = r1.A00;
        r7 = r1.A02;
        r8 = "audio/mp4a-latm";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x04fd, code lost:
        r8 = "audio/ac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0501, code lost:
        r8 = "audio/vnd.dts";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0505, code lost:
        r8 = "video/av01";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x050a, code lost:
        r8 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x050f, code lost:
        r8 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x0514, code lost:
        r8 = "application/pgs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0518, code lost:
        r8 = "video/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x051d, code lost:
        r7 = r3.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x051f, code lost:
        if (r7 != 32) goto L_0x0526;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0521, code lost:
        r2 = null;
        r7 = null;
        r12 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0526, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r0 = "Unsupported floating point PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x052d, code lost:
        r7 = r3.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x052f, code lost:
        if (r7 != 8) goto L_0x0535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0531, code lost:
        r2 = null;
        r7 = null;
        r12 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0535, code lost:
        if (r7 != 16) goto L_0x053c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0537, code lost:
        r2 = null;
        r7 = null;
        r12 = 268435456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x053c, code lost:
        if (r7 != 24) goto L_0x0543;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x053e, code lost:
        r2 = null;
        r7 = null;
        r12 = 1342177280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0543, code lost:
        if (r7 != 32) goto L_0x054a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x0545, code lost:
        r2 = null;
        r7 = null;
        r12 = 1610612736;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x054a, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r0 = "Unsupported big endian PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0551, code lost:
        r7 = r3.A0D;
        r12 = androidx.media3.common.util.Util.A00(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x0557, code lost:
        if (r12 != 0) goto L_0x0570;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x0559, code lost:
        r1 = X.AnonymousClass7TE.A1A();
        r0 = "Unsupported little endian PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x055f, code lost:
        r1.append(r0);
        r1.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x0565, code lost:
        X.STH.A03("MatroskaExtractor", X.Pxg.A0s(r2, "audio/x-unknown", r1));
        r2 = null;
        r7 = null;
        r8 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x0570, code lost:
        r2 = null;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x0573, code lost:
        r0 = X.C11389SRd.A04;
        r1 = X.C11212SFm.A00(new X.C11389SRd(X.SG3.A00(r3, r7)));
        r2 = r1.A09;
        r3.A0S = r1.A07;
        r7 = r1.A08;
        r8 = "video/hevc";
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x058d, code lost:
        r12 = -1;
        r9 = -1;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x0590, code lost:
        r2 = null;
        r7 = null;
        r8 = "text/vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x0595, code lost:
        r8 = "application/x-subrip";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x0598, code lost:
        r8 = "video/mpeg2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x059c, code lost:
        r8 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x059e, code lost:
        r2 = null;
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05a1, code lost:
        r8 = "audio/flac";
        r2 = java.util.Collections.singletonList(X.SG3.A00(r3, r7));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05ab, code lost:
        r7 = null;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05ac, code lost:
        r12 = -1;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05ad, code lost:
        r9 = -1;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05af, code lost:
        r2 = X.DbS.A0v(3);
        r2.add(X.SG3.A00(r3, r7));
        r0 = java.nio.ByteBuffer.allocate(8);
        r7 = java.nio.ByteOrder.LITTLE_ENDIAN;
        X.Pxi.A1N(r0.order(r7), r2, r3.A0Z);
        X.Pxi.A1N(java.nio.ByteBuffer.allocate(8).order(r7), r2, r3.A0a);
        r8 = "audio/opus";
        r7 = null;
        r12 = -1;
        r9 = 5760;
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05dc, code lost:
        r1 = r3.A0n;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x05de, code lost:
        if (r1 == null) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x05e0, code lost:
        r0 = X.SDQ.A00(new X.C11389SRd(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x05e9, code lost:
        if (r0 == null) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x05eb, code lost:
        r7 = r0.A00;
        r8 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:271:0x05f0, code lost:
        r6 = r3.A0i;
        r14 = 0;
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x05f6, code lost:
        if (r3.A0j == false) goto L_0x05f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x05f8, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x05f9, code lost:
        r6 = r6 | r0;
        r1 = X.SOW.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0608, code lost:
        if (org.webrtc.MediaStreamTrack.AUDIO_TRACK_KIND.equals(X.SQX.A01(r8)) == false) goto L_0x0658;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x060a, code lost:
        r1.A04 = r3.A0G;
        r1.A0G = r3.A0V;
        r1.A0C = r12;
        r12 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0615, code lost:
        r13 = r3.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0617, code lost:
        if (r13 == null) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x061f, code lost:
        if (A0u.containsKey(r13) != false) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0621, code lost:
        r1.A0U = r3.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x0625, code lost:
        r1.A0T = java.lang.Integer.toString(r24);
        r1.A01(r8);
        r1.A0A = r9;
        r1.A0V = r3.A0g;
        r1.A0H = r6 ? 1 : 0;
        r1.A0X = r2;
        r1.A0R = r7;
        r1.A0O = r3.A0b;
        r2 = X.Pxe.A0O(r1);
        r0 = r25.FHV(r3.A0T, r12);
        r3.A0d = r0;
        r0.AWO(r2);
        r10.A0e.put(r3.A0T, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0663, code lost:
        if (org.webrtc.MediaStreamTrack.VIDEO_TRACK_KIND.equals(X.SQX.A01(r8)) == false) goto L_0x07cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0667, code lost:
        if (r3.A0M != 0) goto L_0x07c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x0669, code lost:
        r0 = r3.A0N;
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x066c, code lost:
        if (r0 != -1) goto L_0x0670;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x066e, code lost:
        r0 = r3.A0Y;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0670, code lost:
        r3.A0N = r0;
        r0 = r3.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0674, code lost:
        if (r0 != -1) goto L_0x0678;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0676, code lost:
        r0 = r3.A0O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x0678, code lost:
        r3.A0L = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x067a, code lost:
        r12 = -1.0f;
        r0 = r3.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x067e, code lost:
        if (r0 == r13) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0680, code lost:
        r15 = r3.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x0682, code lost:
        if (r15 == r13) goto L_0x068d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0684, code lost:
        r12 = ((float) (r3.A0O * r0)) / ((float) (r3.A0Y * r15));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x068f, code lost:
        if (r3.A0k == false) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0697, code lost:
        if (r3.A06 == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x069d, code lost:
        if (r3.A07 == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06a3, code lost:
        if (r3.A04 == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06a9, code lost:
        if (r3.A05 == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06af, code lost:
        if (r3.A02 == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06b5, code lost:
        if (r3.A03 == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x06bb, code lost:
        if (r3.A0B == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x06c1, code lost:
        if (r3.A0C == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x06c7, code lost:
        if (r3.A00 == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x06cd, code lost:
        if (r3.A01 == -1.0f) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x06cf, code lost:
        r17 = new byte[25];
        r15 = java.nio.ByteBuffer.wrap(r17).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r15.put((byte) 0);
        r15.putShort((short) ((int) ((r3.A06 * 50000.0f) + 0.5f)));
        X.Pxi.A1M(r15, r3.A07);
        X.Pxi.A1M(r15, r3.A04);
        X.Pxi.A1M(r15, r3.A05);
        X.Pxi.A1M(r15, r3.A02);
        X.Pxi.A1M(r15, r3.A03);
        X.Pxi.A1M(r15, r3.A0B);
        X.Pxi.A1M(r15, r3.A0C);
        r15.putShort((short) ((int) (r3.A00 + 0.5f)));
        r15.putShort((short) ((int) (r3.A01 + 0.5f)));
        r15.putShort((short) r3.A0Q);
        r15.putShort((short) r3.A0R);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0733, code lost:
        r15 = new X.C10962S2u();
        r15.A02 = r3.A0I;
        r15.A01 = r3.A0H;
        r15.A03 = r3.A0J;
        r15.A05 = r17;
        r0 = r3.A0E;
        r15.A04 = r0;
        r15.A00 = r0;
        r18 = r15.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0752, code lost:
        r0 = r3.A0h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x0754, code lost:
        if (r0 == null) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0756, code lost:
        r15 = A0u;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x075c, code lost:
        if (r15.containsKey(r0) == false) goto L_0x0764;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x075e, code lost:
        r13 = X.Pxg.A06(r3.A0h, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0766, code lost:
        if (r3.A0U != 0) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x076f, code lost:
        if (java.lang.Float.compare(r3.A0A, 0.0f) != 0) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x0777, code lost:
        if (java.lang.Float.compare(r3.A08, 0.0f) != 0) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x0779, code lost:
        r15 = r3.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x077f, code lost:
        if (java.lang.Float.compare(r15, 0.0f) == 0) goto L_0x078b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x0787, code lost:
        if (java.lang.Float.compare(r15, 90.0f) != 0) goto L_0x07a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0789, code lost:
        r14 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x078b, code lost:
        r1.A0L = r3.A0Y;
        r1.A09 = r3.A0O;
        r1.A01 = r12;
        r1.A0F = r14;
        r1.A0Z = r3.A0o;
        r1.A0I = r3.A0W;
        r1.A0N = r18;
        r12 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07ac, code lost:
        if (java.lang.Float.compare(r15, -180.0f) == 0) goto L_0x07c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07b4, code lost:
        if (java.lang.Float.compare(r15, 180.0f) == 0) goto L_0x07c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:344:0x07b6, code lost:
        r14 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07be, code lost:
        if (java.lang.Float.compare(r15, -90.0f) == 0) goto L_0x078b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x07c0, code lost:
        r14 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07c2, code lost:
        r14 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x07c5, code lost:
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07c9, code lost:
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07d2, code lost:
        if ("application/x-subrip".equals(r8) != false) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07da, code lost:
        if ("text/x-ssa".equals(r8) != false) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07e2, code lost:
        if ("text/vtt".equals(r8) != false) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07ea, code lost:
        if ("application/vobsub".equals(r8) != false) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x07f2, code lost:
        if ("application/pgs".equals(r8) != false) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x07fa, code lost:
        if ("application/dvbsubs".equals(r8) != false) goto L_0x0804;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0803, code lost:
        throw new X.XQX("Unexpected MIME type.", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0804, code lost:
        r12 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x09d0, code lost:
        if (r1 == 2) goto L_0x0d4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x09d3, code lost:
        if (r1 == 3) goto L_0x0f92;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x09d5, code lost:
        if (r1 == 4) goto L_0x0ab6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x09d7, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09dd, code lost:
        if (r0 == 4) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x09e1, code lost:
        if (r0 == 8) goto L_0x09f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09e3, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "Invalid float size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x09e9, code lost:
        r3.append(r2);
        r3.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x09f8, code lost:
        throw new X.XQX(r3.toString(), (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x09f9, code lost:
        r9 = (int) r0;
        r12 = r6.A06;
        r11 = 0;
        r26.readFully(r12, 0, r9);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0a04, code lost:
        if (r11 >= r9) goto L_0x0a12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a06, code lost:
        r2 = (r2 << 8) | ((long) (r12[r11] & 255));
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:480:0x0a12, code lost:
        if (r9 != 4) goto L_0x0a2e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a14, code lost:
        r0 = (double) java.lang.Float.intBitsToFloat((int) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a1a, code lost:
        r7 = ((X.C11720SfH) r7).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0a20, code lost:
        if (r8 == 181) goto L_0x0aad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0a24, code lost:
        if (r8 == 17545) goto L_0x0aa8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a26, code lost:
        switch(r8) {
            case 21969: goto L_0x0a9f;
            case 21970: goto L_0x0a96;
            case 21971: goto L_0x0a8d;
            case 21972: goto L_0x0a84;
            case 21973: goto L_0x0a7b;
            case 21974: goto L_0x0a72;
            case 21975: goto L_0x0a69;
            case 21976: goto L_0x0a60;
            case 21977: goto L_0x0a57;
            case 21978: goto L_0x0a4e;
            default: goto L_0x0a29;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0a29, code lost:
        switch(r8) {
            case 30323: goto L_0x0a45;
            case 30324: goto L_0x0a3c;
            case 30325: goto L_0x0a33;
            default: goto L_0x0a2c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a2e, code lost:
        r0 = java.lang.Double.longBitsToDouble(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a33, code lost:
        A02(r7, r8).A09 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a3c, code lost:
        A02(r7, r8).A08 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a45, code lost:
        A02(r7, r8).A0A = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a4e, code lost:
        A02(r7, r8).A01 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a57, code lost:
        A02(r7, r8).A00 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a60, code lost:
        A02(r7, r8).A0C = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a69, code lost:
        A02(r7, r8).A0B = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a72, code lost:
        A02(r7, r8).A03 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0a7b, code lost:
        A02(r7, r8).A02 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0a84, code lost:
        A02(r7, r8).A05 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0a8d, code lost:
        A02(r7, r8).A04 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0a96, code lost:
        A02(r7, r8).A07 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0a9f, code lost:
        A02(r7, r8).A06 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0aa8, code lost:
        r7.A0I = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0aad, code lost:
        A02(r7, 181).A0V = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0d4e, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0d52, code lost:
        if (r0 > 8) goto L_0x1011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0d54, code lost:
        r10 = (int) r0;
        r13 = r6.A06;
        r12 = 0;
        r26.readFully(r13, 0, r10);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:624:0x0d5f, code lost:
        if (r12 >= r10) goto L_0x0d6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0d61, code lost:
        r0 = (r0 << 8) | ((long) (r13[r12] & 255));
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0d6d, code lost:
        r7 = ((X.C11720SfH) r7).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0d75, code lost:
        if (r8 == 20529) goto L_0x0f6e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0d7b, code lost:
        if (r8 == 20530) goto L_0x0f63;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0d7d, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0d7f, code lost:
        switch(r8) {
            case 131: goto L_0x0f00;
            case 136: goto L_0x0ef3;
            case 155: goto L_0x0e6b;
            case 159: goto L_0x0eea;
            case 176: goto L_0x0ee1;
            case 179: goto L_0x0f09;
            case 186: goto L_0x0ed8;
            case 215: goto L_0x0ecf;
            case 231: goto L_0x0e63;
            case 238: goto L_0x0e5e;
            case 241: goto L_0x0e37;
            case 251: goto L_0x0e33;
            case 16871: goto L_0x0ec6;
            case 16980: goto L_0x0f7b;
            case 17029: goto L_0x0f51;
            case 17143: goto L_0x0f46;
            case 18401: goto L_0x0f39;
            case 18408: goto L_0x0f2e;
            case 21420: goto L_0x0e2c;
            case 21432: goto L_0x0e06;
            case 21680: goto L_0x0ebd;
            case 21682: goto L_0x0eb4;
            case 21690: goto L_0x0eab;
            case 21930: goto L_0x0e9e;
            case 21938: goto L_0x0dfb;
            case 21998: goto L_0x0e95;
            case 22186: goto L_0x0e8d;
            case 22203: goto L_0x0e85;
            case 25188: goto L_0x0e7c;
            case 30114: goto L_0x0df7;
            case 30321: goto L_0x0dd3;
            case 2352003: goto L_0x0e73;
            case 2807729: goto L_0x0dcf;
            default: goto L_0x0d82;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0d83, code lost:
        switch(r8) {
            case 21945: goto L_0x0da9;
            case 21946: goto L_0x0d99;
            case 21947: goto L_0x0d88;
            case 21948: goto L_0x0dc6;
            case 21949: goto L_0x0dbd;
            default: goto L_0x0d86;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0d88, code lost:
        r3 = A02(r7, r8);
        r3.A0k = true;
        r0 = X.SRQ.A00((int) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0d93, code lost:
        if (r0 == -1) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0d95, code lost:
        r3.A0I = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0d99, code lost:
        A05(r7, r8);
        r1 = X.SRQ.A01((int) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0da1, code lost:
        if (r1 == -1) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0da3, code lost:
        r7.A0S.A0J = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0da9, code lost:
        A05(r7, r8);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0dad, code lost:
        if (r2 == 1) goto L_0x0db7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0daf, code lost:
        if (r2 != 2) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0db1, code lost:
        r7.A0S.A0H = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0db7, code lost:
        r7.A0S.A0H = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0dbd, code lost:
        A02(r7, r8).A0R = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x0dc6, code lost:
        A02(r7, r8).A0Q = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0dcf, code lost:
        r7.A0O = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0dd3, code lost:
        A05(r7, r8);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0dd7, code lost:
        if (r2 == 0) goto L_0x0df1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0dd9, code lost:
        if (r2 == 1) goto L_0x0deb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0ddb, code lost:
        if (r2 == 2) goto L_0x0de5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0ddd, code lost:
        if (r2 != 3) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0ddf, code lost:
        r7.A0S.A0U = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0de5, code lost:
        r7.A0S.A0U = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x0deb, code lost:
        r7.A0S.A0U = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0df1, code lost:
        r7.A0S.A0U = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0df7, code lost:
        r7.A0E = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:658:0x0dfb, code lost:
        r3 = A02(r7, r8);
        r3.A0k = true;
        r3.A0E = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0e06, code lost:
        r2 = (int) r0;
        A05(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0e0a, code lost:
        if (r2 == 0) goto L_0x0e26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0e0c, code lost:
        if (r2 == 1) goto L_0x0e20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0e0e, code lost:
        if (r2 == 3) goto L_0x0e1a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0e12, code lost:
        if (r2 != 15) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0e14, code lost:
        r7.A0S.A0W = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:666:0x0e1a, code lost:
        r7.A0S.A0W = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0e20, code lost:
        r7.A0S.A0W = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:668:0x0e26, code lost:
        r7.A0S.A0W = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0e2c, code lost:
        r7.A0K = r0 + r7.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0e33, code lost:
        r7.A0T = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x0e39, code lost:
        if (r7.A0Z != false) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0e3d, code lost:
        if (r7.A0Q == null) goto L_0x1107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0e3f, code lost:
        r9 = r7.A0P;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0e41, code lost:
        if (r9 == null) goto L_0x1107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0e43, code lost:
        r3 = r9.A00;
        r8 = r9.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x0e48, code lost:
        if (r3 != r8.length) goto L_0x0e52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0e4a, code lost:
        r8 = java.util.Arrays.copyOf(r8, r3 * 2);
        r9.A01 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0e52, code lost:
        r3 = r9.A00;
        r9.A00 = r3 + 1;
        r8[r3] = r0;
        r7.A0Z = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0e5e, code lost:
        r7.A01 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0e63, code lost:
        r7.A0G = A01(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0e6b, code lost:
        r7.A0D = A01(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0e73, code lost:
        A02(r7, r8).A0K = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0e7c, code lost:
        A02(r7, r8).A0D = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0e85, code lost:
        A02(r7, r8).A0a = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0e8d, code lost:
        A02(r7, r8).A0Z = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0e95, code lost:
        A02(r7, r8).A0P = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0e9e, code lost:
        r3 = A02(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0ea4, code lost:
        if (r0 != 1) goto L_0x0ea7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0ea6, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0ea7, code lost:
        r3.A0j = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0eab, code lost:
        A02(r7, r8).A0L = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0eb4, code lost:
        A02(r7, r8).A0M = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0ebd, code lost:
        A02(r7, r8).A0N = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x0ec6, code lost:
        A02(r7, r8).A0F = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0ecf, code lost:
        A02(r7, r8).A0T = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x0ed8, code lost:
        A02(r7, r8).A0O = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0ee1, code lost:
        A02(r7, r8).A0Y = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:700:0x0eea, code lost:
        A02(r7, r8).A0G = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x0ef3, code lost:
        r3 = A02(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x0ef9, code lost:
        if (r0 != 1) goto L_0x0efc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:703:0x0efb, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x0efc, code lost:
        r3.A0i = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x0f00, code lost:
        A02(r7, r8).A0X = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:706:0x0f09, code lost:
        r3 = r7.A0Q;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x0f0b, code lost:
        if (r3 == null) goto L_0x1114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:709:0x0f0f, code lost:
        if (r7.A0P == null) goto L_0x1114;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0f11, code lost:
        r7 = A01(r7, r0);
        r1 = r3.A00;
        r2 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x0f1a, code lost:
        if (r1 != r2.length) goto L_0x0f24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:712:0x0f1c, code lost:
        r2 = java.util.Arrays.copyOf(r2, r1 * 2);
        r3.A01 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x0f24, code lost:
        r1 = r3.A00;
        r3.A00 = r1 + 1;
        r2[r1] = r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x0f30, code lost:
        if (r0 == 1) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x0f32, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "AESSettingsCipherMode ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x0f3d, code lost:
        if (r0 == 5) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x0f3f, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "ContentEncAlgo ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x0f48, code lost:
        if (r0 == 1) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x0f4a, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "EBMLReadVersion ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x0f53, code lost:
        if (r0 < 1) goto L_0x0f5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0f59, code lost:
        if (r0 > 2) goto L_0x0f5c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x0f5c, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "DocTypeReadVersion ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x0f65, code lost:
        if (r0 == 1) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x0f67, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "ContentEncodingScope ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x0f72, code lost:
        if (r0 == 0) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x0f74, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "ContentEncodingOrder ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x0f7f, code lost:
        if (r0 == 3) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:736:0x0f81, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "ContentCompAlgo ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x0f87, code lost:
        r3.append(r2);
        r3.append(r0);
        r3.append(" not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:738:0x0f92, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x0f99, code lost:
        if (r0 > 2147483647L) goto L_0x1009;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:740:0x0f9b, code lost:
        r3 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x0f9c, code lost:
        if (r3 != 0) goto L_0x0ff2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:0x0f9e, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:743:0x0fa0, code lost:
        r2 = ((X.C11720SfH) r7).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:0x0fa6, code lost:
        if (r8 == 134) goto L_0x0feb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x0faa, code lost:
        if (r8 == 17026) goto L_0x0fc6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x0fae, code lost:
        if (r8 == 21358) goto L_0x0fbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x0fb3, code lost:
        if (r8 != 2274716) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x0fb5, code lost:
        A02(r2, 2274716).A0g = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x0fbf, code lost:
        A02(r2, 21358).A0h = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x0fcd, code lost:
        if ("webm".equals(r1) != false) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:757:0x0fd6, code lost:
        if ("matroska".equals(r1) != false) goto L_0x0fbb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x0fd8, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r3.append("DocType ");
        r3.append(r1);
        r3.append(" not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:759:0x0feb, code lost:
        A02(r2, 134).A0f = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:760:0x0ff2, code lost:
        r2 = new byte[r3];
        r26.readFully(r2, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:761:0x0ff9, code lost:
        if (r3 <= 0) goto L_0x1003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:762:0x0ffb, code lost:
        r1 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:763:0x0fff, code lost:
        if (r2[r1] != 0) goto L_0x1003;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:764:0x1001, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:765:0x1003, code lost:
        r1 = new java.lang.String(r2, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:766:0x1009, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "String element size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:767:0x1011, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "Invalid integer size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x10a0, code lost:
        r0 = "Error parsing MS/ACM codec private";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x10a8, code lost:
        throw new X.XQX("Error parsing vorbis codec private", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:796:0x10ae, code lost:
        throw new X.XQX("Error parsing vorbis codec private", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:798:0x10b4, code lost:
        throw new X.XQX("Error parsing vorbis codec private", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:0x10ba, code lost:
        throw new X.XQX("Error parsing vorbis codec private", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:0x10c0, code lost:
        throw new X.XQX("Error parsing vorbis codec private", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:807:0x10c8, code lost:
        throw new X.XQX("Failed to find FourCC VC1 initialization data", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x10d0, code lost:
        throw new X.XQX("Error parsing FourCC private data", (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:823:0x1113, code lost:
        throw X.Pxf.A0L(X.002.A0c("Element ", " must be in a Cues", r8), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:825:0x1120, code lost:
        throw X.Pxf.A0L(X.002.A0c("Element ", " must be in a Cues", r8), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:778:0x1071  */
    /* JADX WARNING: Removed duplicated region for block: B:837:0x1064 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r29, X.C21363XYr r30) {
        /*
            r28 = this;
            r5 = 0
            r27 = r28
            r0 = r27
            r0.A0d = r5
            r4 = 1
        L_0x0008:
            r0 = r27
            boolean r0 = r0.A0d
            if (r0 != 0) goto L_0x1146
            r0 = r27
            X.TZc r6 = r0.A0r
            X.SfI r6 = (X.C11721SfI) r6
            X.TZb r0 = r6.A03
            X.C11366SPh.A00(r0)
        L_0x0019:
            java.util.ArrayDeque r11 = r6.A05
            java.lang.Object r0 = r11.peek()
            X.Rqk r0 = (X.C10347Rqk) r0
            r26 = r29
            if (r0 == 0) goto L_0x087a
            long r7 = r26.Bdl()
            long r1 = r0.A01
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x087a
            X.TZb r2 = r6.A03
            java.lang.Object r0 = r11.pop()
            X.Rqk r0 = (X.C10347Rqk) r0
            int r1 = r0.A00
            X.SfH r2 = (X.C11720SfH) r2
            X.Set r10 = r2.A00
            X.YBZ r0 = r10.A0R
            r25 = r0
            X.C11366SPh.A00(r25)
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 == r0) goto L_0x0807
            r0 = 174(0xae, float:2.44E-43)
            r11 = 0
            if (r1 == r0) goto L_0x015a
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r8 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x0147
            r0 = 25152(0x6240, float:3.5245E-41)
            if (r1 == r0) goto L_0x0122
            r0 = 28032(0x6d80, float:3.9281E-41)
            if (r1 == r0) goto L_0x0112
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r1 == r0) goto L_0x00f4
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r1 == r0) goto L_0x00e7
            if (r1 != r8) goto L_0x1058
            boolean r0 = r10.A0a
            if (r0 != 0) goto L_0x1054
            X.Rqd r0 = r10.A0Q
            r21 = r0
            X.Rqd r0 = r10.A0P
            r20 = r0
            long r6 = r10.A0M
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            long r2 = r10.A0J
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x00dc
            if (r21 == 0) goto L_0x00dc
            r0 = r21
            int r14 = r0.A00
            if (r14 == 0) goto L_0x00dc
            if (r20 == 0) goto L_0x00dc
            r0 = r20
            int r0 = r0.A00
            r22 = r0
            if (r0 != r14) goto L_0x00dc
            int[] r13 = new int[r14]
            long[] r12 = new long[r14]
            long[] r9 = new long[r14]
            long[] r8 = new long[r14]
            r1 = 0
            r15 = 0
        L_0x00a3:
            if (r15 >= r14) goto L_0x00c2
            if (r15 < 0) goto L_0x1091
            if (r15 >= r14) goto L_0x1091
            r0 = r21
            long[] r0 = r0.A01
            r16 = r0[r15]
            r8[r15] = r16
            r0 = r22
            if (r15 >= r0) goto L_0x1088
            r0 = r20
            long[] r0 = r0.A01
            r18 = r0[r15]
            long r16 = r6 + r18
            r12[r15] = r16
            int r15 = r15 + 1
            goto L_0x00a3
        L_0x00c2:
            int r0 = r14 + -1
            if (r1 >= r0) goto L_0x1019
            int r19 = r1 + 1
            r15 = r12[r19]
            r17 = r12[r1]
            long r15 = r15 - r17
            int r0 = (int) r15
            r13[r1] = r0
            r17 = r8[r19]
            r15 = r8[r1]
            long r17 = r17 - r15
            r9[r1] = r17
            r1 = r19
            goto L_0x00c2
        L_0x00dc:
            long r2 = r10.A0J
            r0 = 0
            X.Sf7 r6 = new X.Sf7
            r6.<init>(r2, r0)
            goto L_0x104d
        L_0x00e7:
            android.util.SparseArray r0 = r10.A0e
            int r0 = r0.size()
            if (r0 == 0) goto L_0x10d4
            r25.ASU()
            goto L_0x1058
        L_0x00f4:
            long r1 = r10.A0O
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0104
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r10.A0O = r0
        L_0x0104:
            long r1 = r10.A0I
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x1058
            long r0 = A01(r10, r1)
            r10.A0J = r0
            goto L_0x1058
        L_0x0112:
            X.SG3 r1 = A02(r10, r1)
            boolean r0 = r1.A0l
            if (r0 == 0) goto L_0x1058
            byte[] r0 = r1.A0p
            if (r0 == 0) goto L_0x1058
            java.lang.String r0 = "Combining encryption and compression is not supported"
            goto L_0x10d6
        L_0x0122:
            X.SG3 r6 = A02(r10, r1)
            boolean r0 = r6.A0l
            if (r0 == 0) goto L_0x1058
            X.S4h r0 = r6.A0c
            if (r0 == 0) goto L_0x109a
            java.util.UUID r3 = X.C10126Rn3.A03
            byte[] r2 = r0.A03
            java.lang.String r1 = "video/webm"
            androidx.media3.common.DrmInitData$SchemeData r0 = new androidx.media3.common.DrmInitData$SchemeData
            r0.<init>(r1, r3, r2)
            androidx.media3.common.DrmInitData$SchemeData[] r1 = new androidx.media3.common.DrmInitData.SchemeData[]{r0}
            androidx.media3.common.DrmInitData r0 = new androidx.media3.common.DrmInitData
            r0.<init>(r11, r1, r4)
            r6.A0b = r0
            goto L_0x1058
        L_0x0147:
            int r3 = r10.A0C
            r0 = -1
            if (r3 == r0) goto L_0x109d
            long r1 = r10.A0K
            r6 = -1
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 == 0) goto L_0x109d
            if (r3 != r8) goto L_0x1058
            r10.A0H = r1
            goto L_0x1058
        L_0x015a:
            X.SG3 r3 = r10.A0S
            X.C11366SPh.A00(r3)
            java.lang.String r7 = r3.A0f
            if (r7 == 0) goto L_0x10d1
            int r2 = r7.hashCode()
            switch(r2) {
                case -2095576542: goto L_0x016e;
                case -2095575984: goto L_0x0171;
                case -1985379776: goto L_0x0174;
                case -1784763192: goto L_0x0177;
                case -1730367663: goto L_0x017a;
                case -1482641358: goto L_0x017d;
                case -1482641357: goto L_0x0180;
                case -1373388978: goto L_0x0183;
                case -933872740: goto L_0x0186;
                case -538363189: goto L_0x0189;
                case -538363109: goto L_0x018c;
                case -425012669: goto L_0x018f;
                case -356037306: goto L_0x0192;
                case 62923557: goto L_0x0195;
                case 62923603: goto L_0x0198;
                case 62927045: goto L_0x019b;
                case 82318131: goto L_0x019e;
                case 82338133: goto L_0x01a1;
                case 82338134: goto L_0x01a4;
                case 99146302: goto L_0x01a7;
                case 444813526: goto L_0x01aa;
                case 542569478: goto L_0x01ad;
                case 635596514: goto L_0x01b0;
                case 725948237: goto L_0x01b3;
                case 725957860: goto L_0x01b6;
                case 738597099: goto L_0x01b9;
                case 855502857: goto L_0x01bc;
                case 1045209816: goto L_0x01bf;
                case 1422270023: goto L_0x01c2;
                case 1809237540: goto L_0x01c5;
                case 1950749482: goto L_0x01c8;
                case 1950789798: goto L_0x01cb;
                case 1951062397: goto L_0x01ce;
                default: goto L_0x016a;
            }
        L_0x016a:
            r10.A0S = r11
            goto L_0x1058
        L_0x016e:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            goto L_0x01d0
        L_0x0171:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            goto L_0x01d0
        L_0x0174:
            java.lang.String r0 = "A_MS/ACM"
            goto L_0x01d0
        L_0x0177:
            java.lang.String r0 = "A_TRUEHD"
            goto L_0x01d0
        L_0x017a:
            java.lang.String r0 = "A_VORBIS"
            goto L_0x01d0
        L_0x017d:
            java.lang.String r0 = "A_MPEG/L2"
            goto L_0x01d0
        L_0x0180:
            java.lang.String r0 = "A_MPEG/L3"
            goto L_0x01d0
        L_0x0183:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            goto L_0x01d0
        L_0x0186:
            java.lang.String r0 = "S_DVBSUB"
            goto L_0x01d0
        L_0x0189:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            goto L_0x01d0
        L_0x018c:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            goto L_0x01d0
        L_0x018f:
            java.lang.String r0 = "S_VOBSUB"
            goto L_0x01d0
        L_0x0192:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            goto L_0x01d0
        L_0x0195:
            java.lang.String r0 = "A_AAC"
            goto L_0x01d0
        L_0x0198:
            java.lang.String r0 = "A_AC3"
            goto L_0x01d0
        L_0x019b:
            java.lang.String r0 = "A_DTS"
            goto L_0x01d0
        L_0x019e:
            java.lang.String r0 = "V_AV1"
            goto L_0x01d0
        L_0x01a1:
            java.lang.String r0 = "V_VP8"
            goto L_0x01d0
        L_0x01a4:
            java.lang.String r0 = "V_VP9"
            goto L_0x01d0
        L_0x01a7:
            java.lang.String r0 = "S_HDMV/PGS"
            goto L_0x01d0
        L_0x01aa:
            java.lang.String r0 = "V_THEORA"
            goto L_0x01d0
        L_0x01ad:
            java.lang.String r0 = "A_DTS/EXPRESS"
            goto L_0x01d0
        L_0x01b0:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            goto L_0x01d0
        L_0x01b3:
            java.lang.String r0 = "A_PCM/INT/BIG"
            goto L_0x01d0
        L_0x01b6:
            java.lang.String r0 = "A_PCM/INT/LIT"
            goto L_0x01d0
        L_0x01b9:
            java.lang.String r0 = "S_TEXT/ASS"
            goto L_0x01d0
        L_0x01bc:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            goto L_0x01d0
        L_0x01bf:
            java.lang.String r0 = "S_TEXT/WEBVTT"
            goto L_0x01d0
        L_0x01c2:
            java.lang.String r0 = "S_TEXT/UTF8"
            goto L_0x01d0
        L_0x01c5:
            java.lang.String r0 = "V_MPEG2"
            goto L_0x01d0
        L_0x01c8:
            java.lang.String r0 = "A_EAC3"
            goto L_0x01d0
        L_0x01cb:
            java.lang.String r0 = "A_FLAC"
            goto L_0x01d0
        L_0x01ce:
            java.lang.String r0 = "A_OPUS"
        L_0x01d0:
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x016a
            int r0 = r3.A0T
            r24 = r0
            r0 = 24
            r12 = 16
            r14 = 32
            r9 = 8
            r1 = 3
            switch(r2) {
                case -2095576542: goto L_0x0208;
                case -2095575984: goto L_0x0211;
                case -1985379776: goto L_0x021a;
                case -1784763192: goto L_0x0223;
                case -1730367663: goto L_0x022c;
                case -1482641358: goto L_0x0235;
                case -1482641357: goto L_0x023e;
                case -1373388978: goto L_0x0247;
                case -933872740: goto L_0x0250;
                case -538363189: goto L_0x025a;
                case -538363109: goto L_0x0264;
                case -425012669: goto L_0x026e;
                case -356037306: goto L_0x0278;
                case 62923557: goto L_0x0282;
                case 62923603: goto L_0x028c;
                case 62927045: goto L_0x0296;
                case 82318131: goto L_0x02a0;
                case 82338133: goto L_0x02aa;
                case 82338134: goto L_0x02b4;
                case 99146302: goto L_0x02bd;
                case 444813526: goto L_0x02c6;
                case 542569478: goto L_0x02cf;
                case 635596514: goto L_0x02d8;
                case 725948237: goto L_0x02e1;
                case 725957860: goto L_0x02ea;
                case 738597099: goto L_0x02f3;
                case 855502857: goto L_0x02fc;
                case 1045209816: goto L_0x0305;
                case 1422270023: goto L_0x030e;
                case 1809237540: goto L_0x0317;
                case 1950749482: goto L_0x0320;
                case 1950789798: goto L_0x0329;
                case 1951062397: goto L_0x0332;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            r15 = -1
        L_0x01e7:
            java.lang.String r23 = "application/pgs"
            java.lang.String r22 = "application/vobsub"
            java.lang.String r21 = "text/vtt"
            java.lang.String r20 = "text/x-ssa"
            java.lang.String r19 = "application/x-subrip"
            java.lang.String r2 = ". Setting mimeType to "
            java.lang.String r8 = "audio/raw"
            java.lang.String r6 = "MatroskaExtractor"
            java.lang.String r13 = "audio/x-unknown"
            r18 = 0
            switch(r15) {
                case 0: goto L_0x034d;
                case 1: goto L_0x034d;
                case 2: goto L_0x035c;
                case 3: goto L_0x03a8;
                case 4: goto L_0x03b3;
                case 5: goto L_0x040e;
                case 6: goto L_0x0411;
                case 7: goto L_0x041a;
                case 8: goto L_0x049d;
                case 9: goto L_0x034d;
                case 10: goto L_0x04af;
                case 11: goto L_0x04cb;
                case 12: goto L_0x04d8;
                case 13: goto L_0x04dc;
                case 14: goto L_0x04fd;
                case 15: goto L_0x0501;
                case 16: goto L_0x0505;
                case 17: goto L_0x050a;
                case 18: goto L_0x050f;
                case 19: goto L_0x0514;
                case 20: goto L_0x0518;
                case 21: goto L_0x0501;
                case 22: goto L_0x051d;
                case 23: goto L_0x052d;
                case 24: goto L_0x0551;
                case 25: goto L_0x033e;
                case 26: goto L_0x0573;
                case 27: goto L_0x0590;
                case 28: goto L_0x0595;
                case 29: goto L_0x0598;
                case 30: goto L_0x059c;
                case 31: goto L_0x05a1;
                case 32: goto L_0x05af;
                default: goto L_0x0200;
            }
        L_0x0200:
            java.lang.String r0 = "Unrecognized codec identifier."
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r11, r4, r4)
            throw r2
        L_0x0208:
            java.lang.String r2 = "V_MPEG4/ISO/AP"
            boolean r2 = r7.equals(r2)
            r15 = 0
            goto L_0x033a
        L_0x0211:
            java.lang.String r2 = "V_MPEG4/ISO/SP"
            boolean r2 = r7.equals(r2)
            r15 = 1
            goto L_0x033a
        L_0x021a:
            java.lang.String r2 = "A_MS/ACM"
            boolean r2 = r7.equals(r2)
            r15 = 2
            goto L_0x033a
        L_0x0223:
            java.lang.String r2 = "A_TRUEHD"
            boolean r2 = r7.equals(r2)
            r15 = 3
            goto L_0x033a
        L_0x022c:
            java.lang.String r2 = "A_VORBIS"
            boolean r2 = r7.equals(r2)
            r15 = 4
            goto L_0x033a
        L_0x0235:
            java.lang.String r2 = "A_MPEG/L2"
            boolean r2 = r7.equals(r2)
            r15 = 5
            goto L_0x033a
        L_0x023e:
            java.lang.String r2 = "A_MPEG/L3"
            boolean r2 = r7.equals(r2)
            r15 = 6
            goto L_0x033a
        L_0x0247:
            java.lang.String r2 = "V_MS/VFW/FOURCC"
            boolean r2 = r7.equals(r2)
            r15 = 7
            goto L_0x033a
        L_0x0250:
            java.lang.String r2 = "S_DVBSUB"
            boolean r2 = r7.equals(r2)
            r15 = 8
            goto L_0x033a
        L_0x025a:
            java.lang.String r2 = "V_MPEG4/ISO/ASP"
            boolean r2 = r7.equals(r2)
            r15 = 9
            goto L_0x033a
        L_0x0264:
            java.lang.String r2 = "V_MPEG4/ISO/AVC"
            boolean r2 = r7.equals(r2)
            r15 = 10
            goto L_0x033a
        L_0x026e:
            java.lang.String r2 = "S_VOBSUB"
            boolean r2 = r7.equals(r2)
            r15 = 11
            goto L_0x033a
        L_0x0278:
            java.lang.String r2 = "A_DTS/LOSSLESS"
            boolean r2 = r7.equals(r2)
            r15 = 12
            goto L_0x033a
        L_0x0282:
            java.lang.String r2 = "A_AAC"
            boolean r2 = r7.equals(r2)
            r15 = 13
            goto L_0x033a
        L_0x028c:
            java.lang.String r2 = "A_AC3"
            boolean r2 = r7.equals(r2)
            r15 = 14
            goto L_0x033a
        L_0x0296:
            java.lang.String r2 = "A_DTS"
            boolean r2 = r7.equals(r2)
            r15 = 15
            goto L_0x033a
        L_0x02a0:
            java.lang.String r2 = "V_AV1"
            boolean r2 = r7.equals(r2)
            r15 = 16
            goto L_0x033a
        L_0x02aa:
            java.lang.String r2 = "V_VP8"
            boolean r2 = r7.equals(r2)
            r15 = 17
            goto L_0x033a
        L_0x02b4:
            java.lang.String r2 = "V_VP9"
            boolean r2 = r7.equals(r2)
            r15 = 18
            goto L_0x033a
        L_0x02bd:
            java.lang.String r2 = "S_HDMV/PGS"
            boolean r2 = r7.equals(r2)
            r15 = 19
            goto L_0x033a
        L_0x02c6:
            java.lang.String r2 = "V_THEORA"
            boolean r2 = r7.equals(r2)
            r15 = 20
            goto L_0x033a
        L_0x02cf:
            java.lang.String r2 = "A_DTS/EXPRESS"
            boolean r2 = r7.equals(r2)
            r15 = 21
            goto L_0x033a
        L_0x02d8:
            java.lang.String r2 = "A_PCM/FLOAT/IEEE"
            boolean r2 = r7.equals(r2)
            r15 = 22
            goto L_0x033a
        L_0x02e1:
            java.lang.String r2 = "A_PCM/INT/BIG"
            boolean r2 = r7.equals(r2)
            r15 = 23
            goto L_0x033a
        L_0x02ea:
            java.lang.String r2 = "A_PCM/INT/LIT"
            boolean r2 = r7.equals(r2)
            r15 = 24
            goto L_0x033a
        L_0x02f3:
            java.lang.String r2 = "S_TEXT/ASS"
            boolean r2 = r7.equals(r2)
            r15 = 25
            goto L_0x033a
        L_0x02fc:
            java.lang.String r2 = "V_MPEGH/ISO/HEVC"
            boolean r2 = r7.equals(r2)
            r15 = 26
            goto L_0x033a
        L_0x0305:
            java.lang.String r2 = "S_TEXT/WEBVTT"
            boolean r2 = r7.equals(r2)
            r15 = 27
            goto L_0x033a
        L_0x030e:
            java.lang.String r2 = "S_TEXT/UTF8"
            boolean r2 = r7.equals(r2)
            r15 = 28
            goto L_0x033a
        L_0x0317:
            java.lang.String r2 = "V_MPEG2"
            boolean r2 = r7.equals(r2)
            r15 = 29
            goto L_0x033a
        L_0x0320:
            java.lang.String r2 = "A_EAC3"
            boolean r2 = r7.equals(r2)
            r15 = 30
            goto L_0x033a
        L_0x0329:
            java.lang.String r2 = "A_FLAC"
            boolean r2 = r7.equals(r2)
            r15 = 31
            goto L_0x033a
        L_0x0332:
            java.lang.String r2 = "A_OPUS"
            boolean r2 = r7.equals(r2)
            r15 = 32
        L_0x033a:
            if (r2 != 0) goto L_0x01e7
            goto L_0x01e6
        L_0x033e:
            byte[] r1 = A0w
            byte[] r0 = X.SG3.A00(r3, r7)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r1, r0)
            r7 = r11
            r8 = r20
            goto L_0x05ac
        L_0x034d:
            byte[] r0 = r3.A0m
            if (r0 != 0) goto L_0x0357
            r2 = r11
        L_0x0352:
            java.lang.String r8 = "video/mp4v-es"
            goto L_0x05ab
        L_0x0357:
            java.util.List r2 = java.util.Collections.singletonList(r0)
            goto L_0x0352
        L_0x035c:
            char[] r1 = X.C11389SRd.A04
            byte[] r1 = X.SG3.A00(r3, r7)
            X.SRd r7 = new X.SRd
            r7.<init>(r1)
            int r9 = r7.A03()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10a0 }
            if (r9 == r4) goto L_0x0398
            r1 = 65534(0xfffe, float:9.1833E-41)
            if (r9 != r1) goto L_0x0390
            r7.A0O(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10a0 }
            long r16 = r7.A0B()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10a0 }
            java.util.UUID r1 = A0v     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10a0 }
            long r14 = r1.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10a0 }
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0390
            long r16 = r7.A0B()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10a0 }
            long r14 = r1.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10a0 }
            int r0 = (r16 > r14 ? 1 : (r16 == r14 ? 0 : -1))
            if (r0 != 0) goto L_0x0390
            goto L_0x0398
        L_0x0390:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            goto L_0x0565
        L_0x0398:
            int r7 = r3.A0D
            int r12 = androidx.media3.common.util.Util.A00(r7)
            if (r12 != 0) goto L_0x0570
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported PCM bit depth: "
            goto L_0x055f
        L_0x03a8:
            X.S6Y r0 = new X.S6Y
            r0.<init>()
            r3.A0e = r0
            java.lang.String r8 = "audio/true-hd"
            goto L_0x059e
        L_0x03b3:
            byte[] r9 = X.SG3.A00(r3, r7)
            java.lang.String r6 = "Error parsing vorbis codec private"
            byte r0 = r9[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r8 = 2
            if (r0 != r8) goto L_0x10b5
            r2 = 1
            r13 = 0
        L_0x03c0:
            byte r7 = r9[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r0 = r7 & 255(0xff, float:3.57E-43)
            r14 = 255(0xff, float:3.57E-43)
            if (r0 != r14) goto L_0x03cd
            int r13 = r13 + 255
            int r2 = r2 + 1
            goto L_0x03c0
        L_0x03cd:
            int r2 = r2 + 1
            r7 = r7 & r14
            int r13 = r13 + r7
            r12 = 0
        L_0x03d2:
            byte r7 = r9[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r0 = r7 & 255(0xff, float:3.57E-43)
            if (r0 != r14) goto L_0x03dd
            int r12 = r12 + 255
            int r2 = r2 + 1
            goto L_0x03d2
        L_0x03dd:
            int r2 = r2 + 1
            r7 = r7 & r14
            int r12 = r12 + r7
            byte r0 = r9[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            if (r0 != r4) goto L_0x10af
            byte[] r7 = new byte[r13]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            java.lang.System.arraycopy(r9, r2, r7, r5, r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            int r2 = r2 + r13
            byte r0 = r9[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            if (r0 != r1) goto L_0x10a9
            int r2 = r2 + r12
            byte r1 = r9[r2]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r0 = 5
            if (r1 != r0) goto L_0x10a3
            int r1 = r9.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            int r1 = r1 - r2
            byte[] r0 = new byte[r1]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            java.lang.System.arraycopy(r9, r2, r0, r5, r1)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            java.util.ArrayList r2 = X.DbS.A0v(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r2.add(r7)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r2.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            java.lang.String r8 = "audio/vorbis"
            r7 = r11
            r12 = -1
            r9 = 8192(0x2000, float:1.14794E-41)
            goto L_0x05dc
        L_0x040e:
            java.lang.String r8 = "audio/mpeg-L2"
            goto L_0x0413
        L_0x0411:
            java.lang.String r8 = "audio/mpeg"
        L_0x0413:
            r2 = r11
            r7 = r11
            r12 = -1
            r9 = 4096(0x1000, float:5.74E-42)
            goto L_0x05dc
        L_0x041a:
            char[] r0 = X.C11389SRd.A04
            byte[] r0 = X.SG3.A00(r3, r7)
            X.SRd r8 = new X.SRd
            r8.<init>(r0)
            r8.A0P(r12)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            long r12 = r8.A0A()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            r1 = 1482049860(0x58564944, double:7.322299212E-315)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x043b
            java.lang.String r0 = "video/divx"
            android.util.Pair r0 = X.Pxe.A0K(r0, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            goto L_0x0493
        L_0x043b:
            r1 = 859189832(0x33363248, double:4.244961792E-315)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x044a
            java.lang.String r0 = "video/3gpp"
            android.util.Pair r0 = X.Pxe.A0K(r0, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            goto L_0x0493
        L_0x044a:
            r1 = 826496599(0x31435657, double:4.08343576E-315)
            int r0 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0487
            int r0 = r8.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            int r7 = r0 + 20
            byte[] r6 = r8.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
        L_0x0457:
            int r2 = r6.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            int r0 = r2 + -4
            if (r7 >= r0) goto L_0x10c1
            byte r0 = r6[r7]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            if (r0 != 0) goto L_0x0484
            int r0 = r7 + 1
            byte r0 = r6[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            if (r0 != 0) goto L_0x0484
            int r0 = r7 + 2
            byte r0 = r6[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            if (r0 != r4) goto L_0x0484
            int r0 = r7 + 3
            byte r1 = r6[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            r0 = 15
            if (r1 != r0) goto L_0x0484
            byte[] r0 = java.util.Arrays.copyOfRange(r6, r7, r2)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            java.lang.String r1 = "video/wvc1"
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            android.util.Pair r0 = X.Pxe.A0K(r1, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            goto L_0x0493
        L_0x0484:
            int r7 = r7 + 1
            goto L_0x0457
        L_0x0487:
            java.lang.String r0 = "Unknown FourCC. Setting mimeType to video/x-unknown"
            X.STH.A03(r6, r0)
            java.lang.String r0 = "video/x-unknown"
            android.util.Pair r0 = X.Pxe.A0K(r0, r11)
        L_0x0493:
            java.lang.Object r8 = r0.first
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r2 = r0.second
            java.util.List r2 = (java.util.List) r2
            goto L_0x05ab
        L_0x049d:
            r2 = 4
            byte[] r1 = new byte[r2]
            byte[] r0 = X.SG3.A00(r3, r7)
            java.lang.System.arraycopy(r0, r5, r1, r5, r2)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r1)
            java.lang.String r8 = "application/dvbsubs"
            goto L_0x05ab
        L_0x04af:
            char[] r0 = X.C11389SRd.A04
            byte[] r1 = X.SG3.A00(r3, r7)
            X.SRd r0 = new X.SRd
            r0.<init>(r1)
            X.SFt r1 = X.C11219SFt.A00(r0)
            java.util.List r2 = r1.A0B
            int r0 = r1.A08
            r3.A0S = r0
            java.lang.String r7 = r1.A0A
            java.lang.String r8 = "video/avc"
            goto L_0x058d
        L_0x04cb:
            byte[] r0 = X.SG3.A00(r3, r7)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.of(r0)
            r7 = r11
            r8 = r22
            goto L_0x05ac
        L_0x04d8:
            java.lang.String r8 = "audio/vnd.dts.hd"
            goto L_0x059e
        L_0x04dc:
            byte[] r0 = X.SG3.A00(r3, r7)
            java.util.List r2 = java.util.Collections.singletonList(r0)
            byte[] r1 = r3.A0m
            X.ST7 r0 = new X.ST7
            r0.<init>(r1)
            X.RtO r1 = X.SMh.A01(r0, r5)
            int r0 = r1.A01
            r3.A0V = r0
            int r0 = r1.A00
            r3.A0G = r0
            java.lang.String r7 = r1.A02
            java.lang.String r8 = "audio/mp4a-latm"
            goto L_0x05ac
        L_0x04fd:
            java.lang.String r8 = "audio/ac3"
            goto L_0x059e
        L_0x0501:
            java.lang.String r8 = "audio/vnd.dts"
            goto L_0x059e
        L_0x0505:
            java.lang.String r8 = "video/av01"
            goto L_0x059e
        L_0x050a:
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            goto L_0x059e
        L_0x050f:
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            goto L_0x059e
        L_0x0514:
            r8 = r23
            goto L_0x059e
        L_0x0518:
            java.lang.String r8 = "video/x-unknown"
            goto L_0x059e
        L_0x051d:
            int r7 = r3.A0D
            if (r7 != r14) goto L_0x0526
            r2 = r11
            r7 = r11
            r12 = 4
            goto L_0x05ad
        L_0x0526:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported floating point PCM bit depth: "
            goto L_0x055f
        L_0x052d:
            int r7 = r3.A0D
            if (r7 != r9) goto L_0x0535
            r2 = r11
            r7 = r11
            r12 = 3
            goto L_0x05ad
        L_0x0535:
            if (r7 != r12) goto L_0x053c
            r2 = r11
            r7 = r11
            r12 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x05ad
        L_0x053c:
            if (r7 != r0) goto L_0x0543
            r2 = r11
            r7 = r11
            r12 = 1342177280(0x50000000, float:8.5899346E9)
            goto L_0x05ad
        L_0x0543:
            if (r7 != r14) goto L_0x054a
            r2 = r11
            r7 = r11
            r12 = 1610612736(0x60000000, float:3.6893488E19)
            goto L_0x05ad
        L_0x054a:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported big endian PCM bit depth: "
            goto L_0x055f
        L_0x0551:
            int r7 = r3.A0D
            int r12 = androidx.media3.common.util.Util.A00(r7)
            if (r12 != 0) goto L_0x0570
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported little endian PCM bit depth: "
        L_0x055f:
            r1.append(r0)
            r1.append(r7)
        L_0x0565:
            java.lang.String r0 = X.Pxg.A0s(r2, r13, r1)
            X.STH.A03(r6, r0)
            r2 = r11
            r7 = r11
            r8 = r13
            goto L_0x05ac
        L_0x0570:
            r2 = r11
            r7 = r11
            goto L_0x05ad
        L_0x0573:
            char[] r0 = X.C11389SRd.A04
            byte[] r1 = X.SG3.A00(r3, r7)
            X.SRd r0 = new X.SRd
            r0.<init>(r1)
            X.SFm r1 = X.C11212SFm.A00(r0)
            java.util.List r2 = r1.A09
            int r0 = r1.A07
            r3.A0S = r0
            java.lang.String r7 = r1.A08
            java.lang.String r8 = "video/hevc"
        L_0x058d:
            r12 = -1
            r9 = -1
            goto L_0x05dc
        L_0x0590:
            r2 = r11
            r7 = r11
            r8 = r21
            goto L_0x05ac
        L_0x0595:
            r8 = r19
            goto L_0x059e
        L_0x0598:
            java.lang.String r8 = "video/mpeg2"
            goto L_0x059e
        L_0x059c:
            java.lang.String r8 = "audio/eac3"
        L_0x059e:
            r2 = r11
            r7 = r11
            goto L_0x05ac
        L_0x05a1:
            byte[] r0 = X.SG3.A00(r3, r7)
            java.util.List r2 = java.util.Collections.singletonList(r0)
            java.lang.String r8 = "audio/flac"
        L_0x05ab:
            r7 = r11
        L_0x05ac:
            r12 = -1
        L_0x05ad:
            r9 = -1
            goto L_0x05dc
        L_0x05af:
            java.util.ArrayList r2 = X.DbS.A0v(r1)
            byte[] r0 = X.SG3.A00(r3, r7)
            r2.add(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteOrder r7 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r6 = r0.order(r7)
            long r0 = r3.A0Z
            X.Pxi.A1N(r6, r2, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r9)
            java.nio.ByteBuffer r6 = r0.order(r7)
            long r0 = r3.A0a
            X.Pxi.A1N(r6, r2, r0)
            java.lang.String r8 = "audio/opus"
            r7 = r11
            r12 = -1
            r9 = 5760(0x1680, float:8.071E-42)
        L_0x05dc:
            byte[] r1 = r3.A0n
            if (r1 == 0) goto L_0x05f0
            X.SRd r0 = new X.SRd
            r0.<init>(r1)
            X.SDQ r0 = X.SDQ.A00(r0)
            if (r0 == 0) goto L_0x05f0
            java.lang.String r7 = r0.A00
            java.lang.String r8 = "video/dolby-vision"
        L_0x05f0:
            boolean r6 = r3.A0i
            r14 = 0
            boolean r1 = r3.A0j
            r0 = 0
            if (r1 == 0) goto L_0x05f9
            r0 = 2
        L_0x05f9:
            r6 = r6 | r0
            X.SOW r1 = X.SOW.A00()
            java.lang.String r13 = X.SQX.A01(r8)
            java.lang.String r0 = "audio"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0658
            int r0 = r3.A0G
            r1.A04 = r0
            int r0 = r3.A0V
            r1.A0G = r0
            r1.A0C = r12
            r12 = 1
        L_0x0615:
            java.lang.String r13 = r3.A0h
            if (r13 == 0) goto L_0x0625
            java.util.Map r0 = A0u
            boolean r0 = r0.containsKey(r13)
            if (r0 != 0) goto L_0x0625
            java.lang.String r0 = r3.A0h
            r1.A0U = r0
        L_0x0625:
            java.lang.String r0 = java.lang.Integer.toString(r24)
            r1.A0T = r0
            r1.A01(r8)
            r1.A0A = r9
            java.lang.String r0 = r3.A0g
            r1.A0V = r0
            r1.A0H = r6
            r1.A0X = r2
            r1.A0R = r7
            androidx.media3.common.DrmInitData r0 = r3.A0b
            r1.A0O = r0
            X.SJM r2 = X.Pxe.A0O(r1)
            int r1 = r3.A0T
            r0 = r25
            X.TjN r0 = r0.FHV(r1, r12)
            r3.A0d = r0
            r0.AWO(r2)
            android.util.SparseArray r1 = r10.A0e
            int r0 = r3.A0T
            r1.put(r0, r3)
            goto L_0x016a
        L_0x0658:
            java.lang.String r12 = X.SQX.A01(r8)
            java.lang.String r0 = "video"
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x07cc
            int r0 = r3.A0M
            if (r0 != 0) goto L_0x07c9
            int r0 = r3.A0N
            r13 = -1
            if (r0 != r13) goto L_0x0670
            int r0 = r3.A0Y
        L_0x0670:
            r3.A0N = r0
            int r0 = r3.A0L
            if (r0 != r13) goto L_0x0678
            int r0 = r3.A0O
        L_0x0678:
            r3.A0L = r0
        L_0x067a:
            r12 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = r3.A0N
            if (r0 == r13) goto L_0x068d
            int r15 = r3.A0L
            if (r15 == r13) goto L_0x068d
            int r12 = r3.A0O
            int r12 = r12 * r0
            float r12 = (float) r12
            int r0 = r3.A0Y
            int r0 = r0 * r15
            float r0 = (float) r0
            float r12 = r12 / r0
        L_0x068d:
            boolean r0 = r3.A0k
            if (r0 == 0) goto L_0x0752
            float r0 = r3.A06
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A07
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A04
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A05
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A02
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A03
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A0B
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A0C
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A00
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            float r0 = r3.A01
            int r0 = (r0 > r15 ? 1 : (r0 == r15 ? 0 : -1))
            if (r0 == 0) goto L_0x07c5
            r0 = 25
            byte[] r0 = new byte[r0]
            r17 = r0
            java.nio.ByteBuffer r15 = java.nio.ByteBuffer.wrap(r17)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r15 = r15.order(r0)
            r15.put(r5)
            float r0 = r3.A06
            r16 = 1195593728(0x47435000, float:50000.0)
            float r0 = r0 * r16
            r16 = 1056964608(0x3f000000, float:0.5)
            float r0 = r0 + r16
            int r0 = (int) r0
            short r0 = (short) r0
            r15.putShort(r0)
            float r0 = r3.A07
            X.Pxi.A1M(r15, r0)
            float r0 = r3.A04
            X.Pxi.A1M(r15, r0)
            float r0 = r3.A05
            X.Pxi.A1M(r15, r0)
            float r0 = r3.A02
            X.Pxi.A1M(r15, r0)
            float r0 = r3.A03
            X.Pxi.A1M(r15, r0)
            float r0 = r3.A0B
            X.Pxi.A1M(r15, r0)
            float r0 = r3.A0C
            X.Pxi.A1M(r15, r0)
            float r0 = r3.A00
            float r0 = r0 + r16
            int r0 = (int) r0
            short r0 = (short) r0
            r15.putShort(r0)
            float r0 = r3.A01
            float r0 = r0 + r16
            int r0 = (int) r0
            short r0 = (short) r0
            r15.putShort(r0)
            int r0 = r3.A0Q
            short r0 = (short) r0
            r15.putShort(r0)
            int r0 = r3.A0R
            short r0 = (short) r0
            r15.putShort(r0)
        L_0x0733:
            X.S2u r15 = new X.S2u
            r15.<init>()
            int r0 = r3.A0I
            r15.A02 = r0
            int r0 = r3.A0H
            r15.A01 = r0
            int r0 = r3.A0J
            r15.A03 = r0
            r0 = r17
            r15.A05 = r0
            int r0 = r3.A0E
            r15.A04 = r0
            r15.A00 = r0
            X.SRQ r18 = r15.A00()
        L_0x0752:
            java.lang.String r0 = r3.A0h
            if (r0 == 0) goto L_0x0764
            java.util.Map r15 = A0u
            boolean r0 = r15.containsKey(r0)
            if (r0 == 0) goto L_0x0764
            java.lang.String r0 = r3.A0h
            int r13 = X.Pxg.A06(r0, r15)
        L_0x0764:
            int r0 = r3.A0U
            if (r0 != 0) goto L_0x07c0
            float r15 = r3.A0A
            r0 = 0
            int r15 = java.lang.Float.compare(r15, r0)
            if (r15 != 0) goto L_0x07c0
            float r15 = r3.A08
            int r15 = java.lang.Float.compare(r15, r0)
            if (r15 != 0) goto L_0x07c0
            float r15 = r3.A09
            int r0 = java.lang.Float.compare(r15, r0)
            if (r0 == 0) goto L_0x078b
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = java.lang.Float.compare(r15, r0)
            if (r0 != 0) goto L_0x07a6
            r14 = 90
        L_0x078b:
            int r0 = r3.A0Y
            r1.A0L = r0
            int r0 = r3.A0O
            r1.A09 = r0
            r1.A01 = r12
            r1.A0F = r14
            byte[] r0 = r3.A0o
            r1.A0Z = r0
            int r0 = r3.A0W
            r1.A0I = r0
            r0 = r18
            r1.A0N = r0
            r12 = 2
            goto L_0x0615
        L_0x07a6:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = java.lang.Float.compare(r15, r0)
            if (r0 == 0) goto L_0x07c2
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = java.lang.Float.compare(r15, r0)
            if (r0 == 0) goto L_0x07c2
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r0 = java.lang.Float.compare(r15, r0)
            r14 = 270(0x10e, float:3.78E-43)
            if (r0 == 0) goto L_0x078b
        L_0x07c0:
            r14 = r13
            goto L_0x078b
        L_0x07c2:
            r14 = 180(0xb4, float:2.52E-43)
            goto L_0x078b
        L_0x07c5:
            r17 = 0
            goto L_0x0733
        L_0x07c9:
            r13 = -1
            goto L_0x067a
        L_0x07cc:
            r0 = r19
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0804
            r0 = r20
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0804
            r0 = r21
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0804
            r0 = r22
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0804
            r0 = r23
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0804
            java.lang.String r0 = "application/dvbsubs"
            boolean r0 = r0.equals(r8)
            if (r0 != 0) goto L_0x0804
            java.lang.String r0 = "Unexpected MIME type."
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r11, r4, r4)
            throw r2
        L_0x0804:
            r12 = 3
            goto L_0x0615
        L_0x0807:
            int r1 = r10.A05
            r0 = 2
            if (r1 != r0) goto L_0x1058
            android.util.SparseArray r1 = r10.A0e
            int r0 = r10.A06
            java.lang.Object r7 = r1.get(r0)
            X.SG3 r7 = (X.SG3) r7
            X.TjN r0 = r7.A0d
            r0.getClass()
            long r1 = r10.A0E
            r8 = 0
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0842
            java.lang.String r1 = r7.A0f
            java.lang.String r0 = "A_OPUS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0842
            X.SRd r3 = r10.A0j
            r0 = 8
            java.nio.ByteBuffer r2 = X.Pxg.A12(r0)
            long r0 = r10.A0E
            r2.putLong(r0)
            byte[] r1 = r2.array()
            int r0 = r1.length
            r3.A0Q(r1, r0)
        L_0x0842:
            r1 = 0
            r13 = 0
        L_0x0844:
            int r0 = r10.A03
            if (r1 >= r0) goto L_0x0850
            int[] r0 = r10.A0b
            r0 = r0[r1]
            int r13 = r13 + r0
            int r1 = r1 + 1
            goto L_0x0844
        L_0x0850:
            r6 = 0
        L_0x0851:
            int r0 = r10.A03
            if (r6 >= r0) goto L_0x0876
            long r2 = r10.A0F
            int r0 = r7.A0K
            int r0 = r0 * r6
            int r0 = r0 / 1000
            long r0 = (long) r0
            long r0 = r0 + r2
            int r3 = r10.A02
            if (r6 != 0) goto L_0x0868
            boolean r2 = r10.A0T
            if (r2 != 0) goto L_0x0868
            r3 = r3 | 1
        L_0x0868:
            int[] r2 = r10.A0b
            r12 = r2[r6]
            int r13 = r13 - r12
            r9 = r7
            r11 = r3
            r14 = r0
            A04(r9, r10, r11, r12, r13, r14)
            int r6 = r6 + 1
            goto L_0x0851
        L_0x0876:
            r10.A05 = r5
            goto L_0x1058
        L_0x087a:
            int r0 = r6.A01
            r10 = 4
            if (r0 != 0) goto L_0x08e7
            X.SHD r1 = r6.A04
            r0 = r26
            long r0 = r1.A00(r0, r10, r4, r5)
            r7 = -2
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x08db
            r26.EI7()
        L_0x0890:
            byte[] r9 = r6.A06
            r0 = r26
            r0.E2F(r9, r5, r10)
            byte r3 = r9[r5]
            r7 = 0
        L_0x089a:
            long[] r0 = X.SHD.A03
            r12 = 8
            if (r7 >= r12) goto L_0x090b
            r15 = r0[r7]
            long r0 = (long) r3
            long r15 = r15 & r0
            r13 = 0
            int r2 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            int r7 = r7 + 1
            if (r2 == 0) goto L_0x089a
            r2 = -1
            if (r7 == r2) goto L_0x090b
            if (r7 > r10) goto L_0x090b
            r2 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r2
            r8 = 1
        L_0x08b5:
            if (r8 >= r7) goto L_0x08c0
            long r0 = r0 << r12
            long r2 = X.Pxe.A0D(r9, r8)
            long r0 = r0 | r2
            int r8 = r8 + 1
            goto L_0x08b5
        L_0x08c0:
            int r2 = (int) r0
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r2 == r0) goto L_0x08d5
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r2 == r0) goto L_0x08d5
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r2 == r0) goto L_0x08d5
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r2 != r0) goto L_0x090b
        L_0x08d5:
            r0 = r26
            r0.Evk(r7)
            long r0 = (long) r2
        L_0x08db:
            r7 = -1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x1121
            int r2 = (int) r0
            r6.A00 = r2
            r6.A01 = r4
            r0 = 1
        L_0x08e7:
            r9 = 2
            if (r0 != r4) goto L_0x08f8
            X.SHD r2 = r6.A04
            r1 = 8
            r0 = r26
            long r0 = r2.A00(r0, r1, r5, r4)
            r6.A02 = r0
            r6.A01 = r9
        L_0x08f8:
            X.TZb r7 = r6.A03
            int r8 = r6.A00
            switch(r8) {
                case 131: goto L_0x09cc;
                case 134: goto L_0x09ca;
                case 136: goto L_0x09cc;
                case 155: goto L_0x09cc;
                case 159: goto L_0x09cc;
                case 160: goto L_0x0911;
                case 161: goto L_0x0ab6;
                case 163: goto L_0x0ab6;
                case 165: goto L_0x0ab6;
                case 166: goto L_0x0911;
                case 174: goto L_0x0911;
                case 176: goto L_0x09cc;
                case 179: goto L_0x09cc;
                case 181: goto L_0x09c8;
                case 183: goto L_0x0911;
                case 186: goto L_0x09cc;
                case 187: goto L_0x0911;
                case 215: goto L_0x09cc;
                case 224: goto L_0x0911;
                case 225: goto L_0x0911;
                case 231: goto L_0x09cc;
                case 238: goto L_0x09cc;
                case 241: goto L_0x09cc;
                case 251: goto L_0x09cc;
                case 16868: goto L_0x0911;
                case 16871: goto L_0x09cc;
                case 16877: goto L_0x0ab6;
                case 16980: goto L_0x09cc;
                case 16981: goto L_0x0ab6;
                case 17026: goto L_0x09ca;
                case 17029: goto L_0x09cc;
                case 17143: goto L_0x09cc;
                case 17545: goto L_0x09c8;
                case 18401: goto L_0x09cc;
                case 18402: goto L_0x0ab6;
                case 18407: goto L_0x0911;
                case 18408: goto L_0x09cc;
                case 19899: goto L_0x0911;
                case 20529: goto L_0x09cc;
                case 20530: goto L_0x09cc;
                case 20532: goto L_0x0911;
                case 20533: goto L_0x0911;
                case 21358: goto L_0x09ca;
                case 21419: goto L_0x0ab6;
                case 21420: goto L_0x09cc;
                case 21432: goto L_0x09cc;
                case 21680: goto L_0x09cc;
                case 21682: goto L_0x09cc;
                case 21690: goto L_0x09cc;
                case 21930: goto L_0x09cc;
                case 21936: goto L_0x0911;
                case 21938: goto L_0x09cc;
                case 21945: goto L_0x09cc;
                case 21946: goto L_0x09cc;
                case 21947: goto L_0x09cc;
                case 21948: goto L_0x09cc;
                case 21949: goto L_0x09cc;
                case 21968: goto L_0x0911;
                case 21969: goto L_0x09c8;
                case 21970: goto L_0x09c8;
                case 21971: goto L_0x09c8;
                case 21972: goto L_0x09c8;
                case 21973: goto L_0x09c8;
                case 21974: goto L_0x09c8;
                case 21975: goto L_0x09c8;
                case 21976: goto L_0x09c8;
                case 21977: goto L_0x09c8;
                case 21978: goto L_0x09c8;
                case 21998: goto L_0x09cc;
                case 22186: goto L_0x09cc;
                case 22203: goto L_0x09cc;
                case 25152: goto L_0x0911;
                case 25188: goto L_0x09cc;
                case 25506: goto L_0x0ab6;
                case 28032: goto L_0x0911;
                case 30113: goto L_0x0911;
                case 30114: goto L_0x09cc;
                case 30320: goto L_0x0911;
                case 30321: goto L_0x09cc;
                case 30322: goto L_0x0ab6;
                case 30323: goto L_0x09c8;
                case 30324: goto L_0x09c8;
                case 30325: goto L_0x09c8;
                case 2274716: goto L_0x09ca;
                case 2352003: goto L_0x09cc;
                case 2807729: goto L_0x09cc;
                case 290298740: goto L_0x0911;
                case 357149030: goto L_0x0911;
                case 374648427: goto L_0x0911;
                case 408125543: goto L_0x0911;
                case 440786851: goto L_0x0911;
                case 475249515: goto L_0x0911;
                case 524531317: goto L_0x0911;
                default: goto L_0x08ff;
            }
        L_0x08ff:
            long r2 = r6.A02
            int r1 = (int) r2
            r0 = r26
            r0.Evk(r1)
            r6.A01 = r5
            goto L_0x0019
        L_0x090b:
            r0 = r26
            r0.Evk(r4)
            goto L_0x0890
        L_0x0911:
            long r2 = r26.Bdl()
            long r0 = r6.A02
            long r0 = r0 + r2
            X.Rqk r7 = new X.Rqk
            r7.<init>(r8, r0)
            r11.push(r7)
            X.TZb r0 = r6.A03
            int r1 = r6.A00
            long r9 = r6.A02
            X.SfH r0 = (X.C11720SfH) r0
            X.Set r11 = r0.A00
            X.YBZ r12 = r11.A0R
            X.C11366SPh.A00(r12)
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 == r0) goto L_0x09c0
            r0 = 174(0xae, float:2.44E-43)
            if (r1 == r0) goto L_0x09b7
            r0 = 187(0xbb, float:2.62E-43)
            if (r1 == r0) goto L_0x09b3
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r7 = -1
            if (r1 == r0) goto L_0x09ac
            r0 = 20533(0x5035, float:2.8773E-41)
            if (r1 == r0) goto L_0x09a4
            r0 = 21968(0x55d0, float:3.0784E-41)
            if (r1 == r0) goto L_0x099c
            r0 = 408125543(0x18538067, float:2.7335937E-24)
            if (r1 == r0) goto L_0x0983
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x0973
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r1 != r0) goto L_0x0fbb
            boolean r0 = r11.A0a
            if (r0 != 0) goto L_0x0fbb
            boolean r0 = r11.A0l
            if (r0 == 0) goto L_0x096a
            long r0 = r11.A0H
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x096a
            r11.A0Y = r4
            goto L_0x0fbb
        L_0x096a:
            long r0 = r11.A0J
            X.C11710Sf7.A00(r12, r0)
            r11.A0a = r4
            goto L_0x0fbb
        L_0x0973:
            X.Rqd r0 = new X.Rqd
            r0.<init>()
            r11.A0Q = r0
            X.Rqd r0 = new X.Rqd
            r0.<init>()
            r11.A0P = r0
            goto L_0x0fbb
        L_0x0983:
            long r0 = r11.A0M
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0996
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x0996
            r1 = 0
            java.lang.String r0 = "Multiple Segment elements not supported"
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r1, r4, r4)
            throw r2
        L_0x0996:
            r11.A0M = r2
            r11.A0N = r9
            goto L_0x0fbb
        L_0x099c:
            X.SG3 r0 = A02(r11, r0)
            r0.A0k = r4
            goto L_0x0fbb
        L_0x09a4:
            X.SG3 r0 = A02(r11, r0)
            r0.A0l = r4
            goto L_0x0fbb
        L_0x09ac:
            r0 = -1
            r11.A0C = r0
            r11.A0K = r7
            goto L_0x0fbb
        L_0x09b3:
            r11.A0Z = r5
            goto L_0x0fbb
        L_0x09b7:
            X.SG3 r0 = new X.SG3
            r0.<init>()
            r11.A0S = r0
            goto L_0x0fbb
        L_0x09c0:
            r11.A0T = r5
            r0 = 0
            r11.A0E = r0
            goto L_0x0fbb
        L_0x09c8:
            r1 = 5
            goto L_0x09cd
        L_0x09ca:
            r1 = 3
            goto L_0x09cd
        L_0x09cc:
            r1 = 2
        L_0x09cd:
            r11 = 0
            r14 = 8
            if (r1 == r9) goto L_0x0d4e
            r0 = 3
            if (r1 == r0) goto L_0x0f92
            if (r1 == r10) goto L_0x0ab6
            long r0 = r6.A02
            r12 = 4
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x09f9
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x09f9
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "Invalid float size: "
        L_0x09e9:
            r3.append(r2)
            r3.append(r0)
        L_0x09ef:
            java.lang.String r0 = r3.toString()
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r11, r4, r4)
            throw r2
        L_0x09f9:
            int r9 = (int) r0
            byte[] r12 = r6.A06
            r11 = 0
            r0 = r26
            r0.readFully(r12, r5, r9)
            r2 = 0
        L_0x0a04:
            if (r11 >= r9) goto L_0x0a12
            r0 = 8
            long r2 = r2 << r0
            byte r0 = r12[r11]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r2 = r2 | r0
            int r11 = r11 + 1
            goto L_0x0a04
        L_0x0a12:
            if (r9 != r10) goto L_0x0a2e
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            double r0 = (double) r0
        L_0x0a1a:
            X.SfH r7 = (X.C11720SfH) r7
            X.Set r7 = r7.A00
            r2 = 181(0xb5, float:2.54E-43)
            if (r8 == r2) goto L_0x0aad
            r2 = 17545(0x4489, float:2.4586E-41)
            if (r8 == r2) goto L_0x0aa8
            switch(r8) {
                case 21969: goto L_0x0a9f;
                case 21970: goto L_0x0a96;
                case 21971: goto L_0x0a8d;
                case 21972: goto L_0x0a84;
                case 21973: goto L_0x0a7b;
                case 21974: goto L_0x0a72;
                case 21975: goto L_0x0a69;
                case 21976: goto L_0x0a60;
                case 21977: goto L_0x0a57;
                case 21978: goto L_0x0a4e;
                default: goto L_0x0a29;
            }
        L_0x0a29:
            switch(r8) {
                case 30323: goto L_0x0a45;
                case 30324: goto L_0x0a3c;
                case 30325: goto L_0x0a33;
                default: goto L_0x0a2c;
            }
        L_0x0a2c:
            goto L_0x0fbb
        L_0x0a2e:
            double r0 = java.lang.Double.longBitsToDouble(r2)
            goto L_0x0a1a
        L_0x0a33:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A09 = r2
            goto L_0x0fbb
        L_0x0a3c:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A08 = r2
            goto L_0x0fbb
        L_0x0a45:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A0A = r2
            goto L_0x0fbb
        L_0x0a4e:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A01 = r2
            goto L_0x0fbb
        L_0x0a57:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A00 = r2
            goto L_0x0fbb
        L_0x0a60:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A0C = r2
            goto L_0x0fbb
        L_0x0a69:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A0B = r2
            goto L_0x0fbb
        L_0x0a72:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A03 = r2
            goto L_0x0fbb
        L_0x0a7b:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A02 = r2
            goto L_0x0fbb
        L_0x0a84:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A05 = r2
            goto L_0x0fbb
        L_0x0a8d:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A04 = r2
            goto L_0x0fbb
        L_0x0a96:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A07 = r2
            goto L_0x0fbb
        L_0x0a9f:
            X.SG3 r3 = A02(r7, r8)
            float r2 = (float) r0
            r3.A06 = r2
            goto L_0x0fbb
        L_0x0aa8:
            long r2 = (long) r0
            r7.A0I = r2
            goto L_0x0fbb
        L_0x0aad:
            X.SG3 r3 = A02(r7, r2)
            int r2 = (int) r0
            r3.A0V = r2
            goto L_0x0fbb
        L_0x0ab6:
            long r0 = r6.A02
            int r12 = (int) r0
            X.SfH r7 = (X.C11720SfH) r7
            X.Set r7 = r7.A00
            r1 = 161(0xa1, float:2.26E-43)
            r0 = 163(0xa3, float:2.28E-43)
            r23 = 0
            if (r8 == r1) goto L_0x0b74
            if (r8 == r0) goto L_0x0b74
            r0 = 165(0xa5, float:2.31E-43)
            if (r8 == r0) goto L_0x0b19
            r0 = 16877(0x41ed, float:2.365E-41)
            if (r8 == r0) goto L_0x0b04
            r0 = 16981(0x4255, float:2.3795E-41)
            if (r8 == r0) goto L_0x0afb
            r1 = 18402(0x47e2, float:2.5787E-41)
            if (r8 == r1) goto L_0x0b59
            r0 = 21419(0x53ab, float:3.0014E-41)
            if (r8 == r0) goto L_0x0b3d
            r0 = 25506(0x63a2, float:3.5742E-41)
            if (r8 == r0) goto L_0x0af2
            r0 = 30322(0x7672, float:4.249E-41)
            if (r8 != r0) goto L_0x10dc
            X.SG3 r0 = A02(r7, r8)
            byte[] r1 = new byte[r12]
            r0.A0o = r1
        L_0x0aeb:
            r0 = r26
            r0.readFully(r1, r5, r12)
            goto L_0x0fbb
        L_0x0af2:
            X.SG3 r0 = A02(r7, r8)
            byte[] r1 = new byte[r12]
            r0.A0m = r1
            goto L_0x0aeb
        L_0x0afb:
            X.SG3 r0 = A02(r7, r8)
            byte[] r1 = new byte[r12]
            r0.A0p = r1
            goto L_0x0aeb
        L_0x0b04:
            X.SG3 r2 = A02(r7, r0)
            int r1 = r2.A0F
            r0 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 == r0) goto L_0x0b14
            r0 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 != r0) goto L_0x0b6d
        L_0x0b14:
            byte[] r1 = new byte[r12]
            r2.A0n = r1
            goto L_0x0aeb
        L_0x0b19:
            int r0 = r7.A05
            if (r0 != r9) goto L_0x0fbb
            android.util.SparseArray r1 = r7.A0e
            int r0 = r7.A06
            java.lang.Object r1 = r1.get(r0)
            X.SG3 r1 = (X.SG3) r1
            int r0 = r7.A01
            if (r0 != r10) goto L_0x0b6d
            java.lang.String r1 = r1.A0f
            java.lang.String r0 = "V_VP9"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0b6d
            X.SRd r0 = r7.A0j
            r0.A0M(r12)
            byte[] r1 = r0.A02
            goto L_0x0aeb
        L_0x0b3d:
            X.SRd r3 = r7.A0h
            byte[] r0 = r3.A02
            java.util.Arrays.fill(r0, r5)
            byte[] r2 = r3.A02
            int r1 = 4 - r12
            r0 = r26
            r0.readFully(r2, r1, r12)
            r3.A0O(r5)
            long r1 = r3.A0C()
            int r0 = (int) r1
            r7.A0C = r0
            goto L_0x0fbb
        L_0x0b59:
            byte[] r2 = new byte[r12]
            r0 = r26
            r0.readFully(r2, r5, r12)
            X.SG3 r1 = A02(r7, r1)
            X.S4h r0 = new X.S4h
            r0.<init>(r4, r2, r5, r5)
            r1.A0c = r0
            goto L_0x0fbb
        L_0x0b6d:
            r0 = r26
            r0.Evk(r12)
            goto L_0x0fbb
        L_0x0b74:
            int r0 = r7.A05
            r22 = 8
            if (r0 != 0) goto L_0x0b99
            X.SHD r3 = r7.A0k
            r1 = r22
            r0 = r26
            long r0 = r3.A00(r0, r1, r5, r4)
            int r2 = (int) r0
            r7.A06 = r2
            int r0 = r3.A00
            r7.A07 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0D = r0
            r7.A05 = r4
            X.SRd r0 = r7.A0g
            r0.A0M(r5)
        L_0x0b99:
            android.util.SparseArray r1 = r7.A0e
            int r0 = r7.A06
            java.lang.Object r21 = r1.get(r0)
            r0 = r21
            X.SG3 r0 = (X.SG3) r0
            r21 = r0
            if (r0 != 0) goto L_0x0bb5
            int r0 = r7.A07
            int r12 = r12 - r0
            r0 = r26
            r0.Evk(r12)
        L_0x0bb1:
            r7.A05 = r5
            goto L_0x0fbb
        L_0x0bb5:
            X.TjN r0 = r0.A0d
            r0.getClass()
            int r0 = r7.A05
            if (r0 != r4) goto L_0x0c0f
            r15 = 3
            r0 = r26
            A03(r0, r7, r15)
            X.SRd r11 = r7.A0g
            byte[] r0 = r11.A02
            byte r0 = r0[r9]
            r3 = r0 & 6
            int r3 = r3 >> r4
            r14 = 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L_0x0c4e
            r7.A03 = r4
            int[] r1 = r7.A0b
            if (r1 != 0) goto L_0x0c44
            int[] r1 = new int[r4]
        L_0x0bd9:
            r7.A0b = r1
            int r0 = r7.A07
            int r12 = r12 - r0
            int r12 = r12 - r15
            r1[r5] = r12
        L_0x0be1:
            byte[] r0 = r11.A02
            byte r2 = r0[r5]
            int r2 = r2 << r22
            byte r0 = r0[r4]
            r0 = r0 & r14
            r2 = r2 | r0
            long r0 = r7.A0G
            long r2 = (long) r2
            long r2 = A01(r7, r2)
            long r0 = r0 + r2
            r7.A0F = r0
            r0 = r21
            int r0 = r0.A0X
            if (r0 == r9) goto L_0x0c08
            r0 = 163(0xa3, float:2.28E-43)
            if (r8 != r0) goto L_0x0c42
            byte[] r0 = r11.A02
            byte r1 = r0[r9]
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0c42
        L_0x0c08:
            r0 = 1
        L_0x0c09:
            r7.A02 = r0
            r7.A05 = r9
            r7.A04 = r5
        L_0x0c0f:
            r0 = 163(0xa3, float:2.28E-43)
            if (r8 != r0) goto L_0x0d33
        L_0x0c13:
            int r1 = r7.A04
            int r0 = r7.A03
            if (r1 >= r0) goto L_0x0bb1
            int[] r0 = r7.A0b
            r2 = r0[r1]
            r1 = r26
            r0 = r21
            int r11 = A00(r1, r0, r7, r2, r5)
            long r2 = r7.A0F
            int r1 = r7.A04
            int r0 = r0.A0K
            int r1 = r1 * r0
            int r0 = r1 / 1000
            long r0 = (long) r0
            long r0 = r0 + r2
            int r2 = r7.A02
            r8 = r21
            r9 = r7
            r10 = r2
            r12 = r5
            r13 = r0
            A04(r8, r9, r10, r11, r12, r13)
            int r0 = r7.A04
            int r0 = r0 + 1
            r7.A04 = r0
            goto L_0x0c13
        L_0x0c42:
            r0 = 0
            goto L_0x0c09
        L_0x0c44:
            int r0 = r1.length
            if (r0 >= r4) goto L_0x0bd9
            int r0 = java.lang.Math.max(r5, r4)
            int[] r1 = new int[r0]
            goto L_0x0bd9
        L_0x0c4e:
            r13 = 4
            r0 = r26
            A03(r0, r7, r10)
            byte[] r0 = r11.A02
            byte r0 = r0[r15]
            r0 = r0 & r14
            int r2 = r0 + 1
            r7.A03 = r2
            int[] r1 = r7.A0b
            if (r1 != 0) goto L_0x0c71
            int[] r1 = new int[r2]
        L_0x0c63:
            r7.A0b = r1
            if (r3 != r9) goto L_0x0c7d
            int r0 = r7.A07
            int r12 = r12 - r0
            int r12 = r12 - r10
            int r12 = r12 / r2
            java.util.Arrays.fill(r1, r5, r2, r12)
            goto L_0x0be1
        L_0x0c71:
            int r0 = r1.length
            if (r0 >= r2) goto L_0x0c63
            int r0 = r0 * 2
            int r0 = java.lang.Math.max(r0, r2)
            int[] r1 = new int[r0]
            goto L_0x0c63
        L_0x0c7d:
            if (r3 != r4) goto L_0x0cac
            r3 = 0
            r10 = 0
        L_0x0c81:
            int r2 = r7.A03
            int r0 = r2 + -1
            if (r3 >= r0) goto L_0x0ca4
            r1[r3] = r5
        L_0x0c89:
            int r13 = r13 + 1
            r0 = r26
            A03(r0, r7, r13)
            byte[] r1 = r11.A02
            int r0 = r13 + -1
            byte r2 = r1[r0]
            r2 = r2 & r14
            int[] r1 = r7.A0b
            r0 = r1[r3]
            int r0 = r0 + r2
            r1[r3] = r0
            if (r2 == r14) goto L_0x0c89
            int r10 = r10 + r0
            int r3 = r3 + 1
            goto L_0x0c81
        L_0x0ca4:
            int r2 = r2 - r4
            int r0 = r7.A07
            int r12 = r12 - r0
            int r12 = r12 - r13
            int r12 = r12 - r10
            goto L_0x0d2f
        L_0x0cac:
            if (r3 != r15) goto L_0x10ec
            r15 = 0
            r20 = 0
        L_0x0cb1:
            int r2 = r7.A03
            int r0 = r2 + -1
            if (r15 >= r0) goto L_0x0d28
            r1[r15] = r5
            int r13 = r13 + 1
            r0 = r26
            A03(r0, r7, r13)
            byte[] r1 = r11.A02
            int r3 = r13 + -1
            byte r0 = r1[r3]
            if (r0 == 0) goto L_0x10e9
            r10 = 0
        L_0x0cc9:
            int r0 = 7 - r10
            int r2 = r4 << r0
            byte r0 = r1[r3]
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0cf3
            int r13 = r13 + r10
            r0 = r26
            A03(r0, r7, r13)
            byte[] r0 = r11.A02
            r19 = r0
            int r18 = r3 + 1
            byte r1 = r0[r3]
            r1 = r1 & r14
            r0 = r2 ^ -1
            r1 = r1 & r0
            long r2 = (long) r1
        L_0x0ce5:
            r1 = r18
            if (r1 >= r13) goto L_0x0cfc
            long r2 = r2 << r22
            int r18 = r18 + 1
            byte r0 = r19[r1]
            r0 = r0 & r14
            long r0 = (long) r0
            long r2 = r2 | r0
            goto L_0x0ce5
        L_0x0cf3:
            int r10 = r10 + 1
            r0 = r22
            if (r10 < r0) goto L_0x0cc9
            r2 = 0
            goto L_0x0d17
        L_0x0cfc:
            if (r15 <= 0) goto L_0x0d09
            int r0 = r10 * 7
            int r0 = r0 + 6
            r16 = 1
            long r0 = r16 << r0
            long r0 = r0 - r16
            long r2 = r2 - r0
        L_0x0d09:
            r16 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x10fd
            r16 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r0 > 0) goto L_0x10fd
        L_0x0d17:
            int r10 = (int) r2
            int[] r1 = r7.A0b
            if (r15 == 0) goto L_0x0d21
            int r0 = r15 + -1
            r0 = r1[r0]
            int r10 = r10 + r0
        L_0x0d21:
            r1[r15] = r10
            int r20 = r20 + r10
            int r15 = r15 + 1
            goto L_0x0cb1
        L_0x0d28:
            int r2 = r2 - r4
            int r0 = r7.A07
            int r12 = r12 - r0
            int r12 = r12 - r13
            int r12 = r12 - r20
        L_0x0d2f:
            r1[r2] = r12
            goto L_0x0be1
        L_0x0d33:
            int r8 = r7.A04
            int r0 = r7.A03
            if (r8 >= r0) goto L_0x0fbb
            int[] r3 = r7.A0b
            r2 = r3[r8]
            r1 = r26
            r0 = r21
            int r0 = A00(r1, r0, r7, r2, r4)
            r3[r8] = r0
            int r0 = r7.A04
            int r0 = r0 + 1
            r7.A04 = r0
            goto L_0x0d33
        L_0x0d4e:
            long r0 = r6.A02
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x1011
            int r10 = (int) r0
            byte[] r13 = r6.A06
            r12 = 0
            r0 = r26
            r0.readFully(r13, r5, r10)
            r0 = 0
        L_0x0d5f:
            if (r12 >= r10) goto L_0x0d6d
            r2 = 8
            long r0 = r0 << r2
            byte r2 = r13[r12]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            long r0 = r0 | r2
            int r12 = r12 + 1
            goto L_0x0d5f
        L_0x0d6d:
            X.SfH r7 = (X.C11720SfH) r7
            X.Set r7 = r7.A00
            r2 = 20529(0x5031, float:2.8767E-41)
            java.lang.String r10 = " not supported"
            if (r8 == r2) goto L_0x0f6e
            r2 = 20530(0x5032, float:2.8769E-41)
            r13 = 1
            if (r8 == r2) goto L_0x0f63
            r12 = 0
            r3 = 3
            switch(r8) {
                case 131: goto L_0x0f00;
                case 136: goto L_0x0ef3;
                case 155: goto L_0x0e6b;
                case 159: goto L_0x0eea;
                case 176: goto L_0x0ee1;
                case 179: goto L_0x0f09;
                case 186: goto L_0x0ed8;
                case 215: goto L_0x0ecf;
                case 231: goto L_0x0e63;
                case 238: goto L_0x0e5e;
                case 241: goto L_0x0e37;
                case 251: goto L_0x0e33;
                case 16871: goto L_0x0ec6;
                case 16980: goto L_0x0f7b;
                case 17029: goto L_0x0f51;
                case 17143: goto L_0x0f46;
                case 18401: goto L_0x0f39;
                case 18408: goto L_0x0f2e;
                case 21420: goto L_0x0e2c;
                case 21432: goto L_0x0e06;
                case 21680: goto L_0x0ebd;
                case 21682: goto L_0x0eb4;
                case 21690: goto L_0x0eab;
                case 21930: goto L_0x0e9e;
                case 21938: goto L_0x0dfb;
                case 21998: goto L_0x0e95;
                case 22186: goto L_0x0e8d;
                case 22203: goto L_0x0e85;
                case 25188: goto L_0x0e7c;
                case 30114: goto L_0x0df7;
                case 30321: goto L_0x0dd3;
                case 2352003: goto L_0x0e73;
                case 2807729: goto L_0x0dcf;
                default: goto L_0x0d82;
            }
        L_0x0d82:
            r10 = -1
            switch(r8) {
                case 21945: goto L_0x0da9;
                case 21946: goto L_0x0d99;
                case 21947: goto L_0x0d88;
                case 21948: goto L_0x0dc6;
                case 21949: goto L_0x0dbd;
                default: goto L_0x0d86;
            }
        L_0x0d86:
            goto L_0x0fbb
        L_0x0d88:
            X.SG3 r3 = A02(r7, r8)
            r3.A0k = r4
            int r2 = (int) r0
            int r0 = X.SRQ.A00(r2)
            if (r0 == r10) goto L_0x0fbb
            r3.A0I = r0
            goto L_0x0fbb
        L_0x0d99:
            A05(r7, r8)
            int r2 = (int) r0
            int r1 = X.SRQ.A01(r2)
            if (r1 == r10) goto L_0x0fbb
            X.SG3 r0 = r7.A0S
            r0.A0J = r1
            goto L_0x0fbb
        L_0x0da9:
            A05(r7, r8)
            int r2 = (int) r0
            if (r2 == r4) goto L_0x0db7
            if (r2 != r9) goto L_0x0fbb
            X.SG3 r0 = r7.A0S
            r0.A0H = r4
            goto L_0x0fbb
        L_0x0db7:
            X.SG3 r0 = r7.A0S
            r0.A0H = r9
            goto L_0x0fbb
        L_0x0dbd:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0R = r2
            goto L_0x0fbb
        L_0x0dc6:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0Q = r2
            goto L_0x0fbb
        L_0x0dcf:
            r7.A0O = r0
            goto L_0x0fbb
        L_0x0dd3:
            A05(r7, r8)
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0df1
            if (r2 == r4) goto L_0x0deb
            if (r2 == r9) goto L_0x0de5
            if (r2 != r3) goto L_0x0fbb
            X.SG3 r0 = r7.A0S
            r0.A0U = r3
            goto L_0x0fbb
        L_0x0de5:
            X.SG3 r0 = r7.A0S
            r0.A0U = r9
            goto L_0x0fbb
        L_0x0deb:
            X.SG3 r0 = r7.A0S
            r0.A0U = r4
            goto L_0x0fbb
        L_0x0df1:
            X.SG3 r0 = r7.A0S
            r0.A0U = r5
            goto L_0x0fbb
        L_0x0df7:
            r7.A0E = r0
            goto L_0x0fbb
        L_0x0dfb:
            X.SG3 r3 = A02(r7, r8)
            r3.A0k = r4
            int r2 = (int) r0
            r3.A0E = r2
            goto L_0x0fbb
        L_0x0e06:
            int r2 = (int) r0
            A05(r7, r8)
            if (r2 == 0) goto L_0x0e26
            if (r2 == r4) goto L_0x0e20
            if (r2 == r3) goto L_0x0e1a
            r0 = 15
            if (r2 != r0) goto L_0x0fbb
            X.SG3 r0 = r7.A0S
            r0.A0W = r3
            goto L_0x0fbb
        L_0x0e1a:
            X.SG3 r0 = r7.A0S
            r0.A0W = r4
            goto L_0x0fbb
        L_0x0e20:
            X.SG3 r0 = r7.A0S
            r0.A0W = r9
            goto L_0x0fbb
        L_0x0e26:
            X.SG3 r0 = r7.A0S
            r0.A0W = r5
            goto L_0x0fbb
        L_0x0e2c:
            long r2 = r7.A0M
            long r0 = r0 + r2
            r7.A0K = r0
            goto L_0x0fbb
        L_0x0e33:
            r7.A0T = r4
            goto L_0x0fbb
        L_0x0e37:
            boolean r2 = r7.A0Z
            if (r2 != 0) goto L_0x0fbb
            X.Rqd r2 = r7.A0Q
            if (r2 == 0) goto L_0x1107
            X.Rqd r9 = r7.A0P
            if (r9 == 0) goto L_0x1107
            int r3 = r9.A00
            long[] r8 = r9.A01
            int r2 = r8.length
            if (r3 != r2) goto L_0x0e52
            int r2 = r3 * 2
            long[] r8 = java.util.Arrays.copyOf(r8, r2)
            r9.A01 = r8
        L_0x0e52:
            int r3 = r9.A00
            int r2 = r3 + 1
            r9.A00 = r2
            r8[r3] = r0
            r7.A0Z = r4
            goto L_0x0fbb
        L_0x0e5e:
            int r2 = (int) r0
            r7.A01 = r2
            goto L_0x0fbb
        L_0x0e63:
            long r0 = A01(r7, r0)
            r7.A0G = r0
            goto L_0x0fbb
        L_0x0e6b:
            long r0 = A01(r7, r0)
            r7.A0D = r0
            goto L_0x0fbb
        L_0x0e73:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0K = r2
            goto L_0x0fbb
        L_0x0e7c:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0D = r2
            goto L_0x0fbb
        L_0x0e85:
            X.SG3 r2 = A02(r7, r8)
            r2.A0a = r0
            goto L_0x0fbb
        L_0x0e8d:
            X.SG3 r2 = A02(r7, r8)
            r2.A0Z = r0
            goto L_0x0fbb
        L_0x0e95:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0P = r2
            goto L_0x0fbb
        L_0x0e9e:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0ea7
            r12 = 1
        L_0x0ea7:
            r3.A0j = r12
            goto L_0x0fbb
        L_0x0eab:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0L = r2
            goto L_0x0fbb
        L_0x0eb4:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0M = r2
            goto L_0x0fbb
        L_0x0ebd:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0N = r2
            goto L_0x0fbb
        L_0x0ec6:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0F = r2
            goto L_0x0fbb
        L_0x0ecf:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0T = r2
            goto L_0x0fbb
        L_0x0ed8:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0O = r2
            goto L_0x0fbb
        L_0x0ee1:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0Y = r2
            goto L_0x0fbb
        L_0x0eea:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0G = r2
            goto L_0x0fbb
        L_0x0ef3:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0efc
            r12 = 1
        L_0x0efc:
            r3.A0i = r12
            goto L_0x0fbb
        L_0x0f00:
            X.SG3 r3 = A02(r7, r8)
            int r2 = (int) r0
            r3.A0X = r2
            goto L_0x0fbb
        L_0x0f09:
            X.Rqd r3 = r7.A0Q
            if (r3 == 0) goto L_0x1114
            X.Rqd r2 = r7.A0P
            if (r2 == 0) goto L_0x1114
            long r7 = A01(r7, r0)
            int r1 = r3.A00
            long[] r2 = r3.A01
            int r0 = r2.length
            if (r1 != r0) goto L_0x0f24
            int r0 = r1 * 2
            long[] r2 = java.util.Arrays.copyOf(r2, r0)
            r3.A01 = r2
        L_0x0f24:
            int r1 = r3.A00
            int r0 = r1 + 1
            r3.A00 = r0
            r2[r1] = r7
            goto L_0x0fbb
        L_0x0f2e:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0fbb
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "AESSettingsCipherMode "
            goto L_0x0f87
        L_0x0f39:
            r7 = 5
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0fbb
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "ContentEncAlgo "
            goto L_0x0f87
        L_0x0f46:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0fbb
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "EBMLReadVersion "
            goto L_0x0f87
        L_0x0f51:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0f5c
            r7 = 2
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0f5c
            goto L_0x0fbb
        L_0x0f5c:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "DocTypeReadVersion "
            goto L_0x0f87
        L_0x0f63:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0fbb
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "ContentEncodingScope "
            goto L_0x0f87
        L_0x0f6e:
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0fbb
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "ContentEncodingOrder "
            goto L_0x0f87
        L_0x0f7b:
            r7 = 3
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0fbb
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "ContentCompAlgo "
        L_0x0f87:
            r3.append(r2)
            r3.append(r0)
            r3.append(r10)
            goto L_0x09ef
        L_0x0f92:
            long r0 = r6.A02
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x1009
            int r3 = (int) r0
            if (r3 != 0) goto L_0x0ff2
            java.lang.String r1 = ""
        L_0x0fa0:
            X.SfH r7 = (X.C11720SfH) r7
            X.Set r2 = r7.A00
            r0 = 134(0x86, float:1.88E-43)
            if (r8 == r0) goto L_0x0feb
            r0 = 17026(0x4282, float:2.3859E-41)
            if (r8 == r0) goto L_0x0fc6
            r0 = 21358(0x536e, float:2.9929E-41)
            if (r8 == r0) goto L_0x0fbf
            r0 = 2274716(0x22b59c, float:3.187556E-39)
            if (r8 != r0) goto L_0x0fbb
            X.SG3 r0 = A02(r2, r0)
            r0.A0g = r1
        L_0x0fbb:
            r6.A01 = r5
            goto L_0x1058
        L_0x0fbf:
            X.SG3 r0 = A02(r2, r0)
            r0.A0h = r1
            goto L_0x0fbb
        L_0x0fc6:
            java.lang.String r0 = "webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0fbb
            java.lang.String r0 = "matroska"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0fbb
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "DocType "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " not supported"
            r3.append(r0)
            goto L_0x09ef
        L_0x0feb:
            X.SG3 r0 = A02(r2, r0)
            r0.A0f = r1
            goto L_0x0fbb
        L_0x0ff2:
            byte[] r2 = new byte[r3]
            r0 = r26
            r0.readFully(r2, r5, r3)
        L_0x0ff9:
            if (r3 <= 0) goto L_0x1003
            int r1 = r3 + -1
            byte r0 = r2[r1]
            if (r0 != 0) goto L_0x1003
            r3 = r1
            goto L_0x0ff9
        L_0x1003:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r5, r3)
            goto L_0x0fa0
        L_0x1009:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "String element size: "
            goto L_0x09e9
        L_0x1011:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "Invalid integer size: "
            goto L_0x09e9
        L_0x1019:
            long r14 = r10.A0N
            long r6 = r6 + r14
            r14 = r12[r0]
            long r6 = r6 - r14
            int r1 = (int) r6
            r13[r0] = r1
            r6 = r8[r0]
            long r2 = r2 - r6
            r9[r0] = r2
            r6 = 0
            int r1 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x1048
            java.lang.String r1 = "Discarding last cue point with unexpected duration: "
            java.lang.String r2 = X.002.A0Q(r1, r2)
            java.lang.String r1 = "MatroskaExtractor"
            X.STH.A03(r1, r2)
            int[] r13 = java.util.Arrays.copyOf(r13, r0)
            long[] r12 = java.util.Arrays.copyOf(r12, r0)
            long[] r9 = java.util.Arrays.copyOf(r9, r0)
            long[] r8 = java.util.Arrays.copyOf(r8, r0)
        L_0x1048:
            X.Sf6 r6 = new X.Sf6
            r6.<init>(r13, r12, r9, r8)
        L_0x104d:
            r0 = r25
            r0.EKw(r6)
            r10.A0a = r4
        L_0x1054:
            r10.A0Q = r11
            r10.A0P = r11
        L_0x1058:
            long r1 = r26.Bdl()
            r0 = r27
            boolean r0 = r0.A0Y
            r3 = r30
            if (r0 == 0) goto L_0x1071
            r0 = r27
            r0.A0L = r1
            long r0 = r0.A0H
            r3.A00 = r0
            r0 = r27
            r0.A0Y = r5
            return r4
        L_0x1071:
            r0 = r27
            boolean r0 = r0.A0a
            if (r0 == 0) goto L_0x0008
            r0 = r27
            long r6 = r0.A0L
            r1 = -1
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0008
            r3.A00 = r6
            r0 = r27
            r0.A0L = r1
            return r4
        L_0x1088:
            java.lang.String r2 = "Invalid index "
            java.lang.String r1 = ", size is "
            java.lang.IndexOutOfBoundsException r0 = X.C51969G9p.A0p(r2, r1, r15, r0)
            throw r0
        L_0x1091:
            java.lang.String r1 = "Invalid index "
            java.lang.String r0 = ", size is "
            java.lang.IndexOutOfBoundsException r0 = X.C51969G9p.A0p(r1, r0, r15, r14)
            throw r0
        L_0x109a:
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            goto L_0x10d6
        L_0x109d:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            goto L_0x10d6
        L_0x10a0:
            java.lang.String r0 = "Error parsing MS/ACM codec private"
            goto L_0x10d6
        L_0x10a3:
            X.XQX r0 = new X.XQX     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r0.<init>(r6, r11, r4, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
        L_0x10a9:
            X.XQX r0 = new X.XQX     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r0.<init>(r6, r11, r4, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
        L_0x10af:
            X.XQX r0 = new X.XQX     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r0.<init>(r6, r11, r4, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
        L_0x10b5:
            X.XQX r0 = new X.XQX     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            r0.<init>(r6, r11, r4, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10bb }
        L_0x10bb:
            X.XQX r2 = new X.XQX
            r2.<init>(r6, r11, r4, r4)
            throw r2
        L_0x10c1:
            java.lang.String r1 = "Failed to find FourCC VC1 initialization data"
            X.XQX r0 = new X.XQX     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            r0.<init>(r1, r11, r4, r4)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x10c9 }
        L_0x10c9:
            java.lang.String r0 = "Error parsing FourCC private data"
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r11, r4, r4)
            throw r2
        L_0x10d1:
            java.lang.String r0 = "CodecId is missing in TrackEntry element"
            goto L_0x10d6
        L_0x10d4:
            java.lang.String r0 = "No valid tracks were found"
        L_0x10d6:
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r11, r4, r4)
            throw r2
        L_0x10dc:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected id: "
            r1.append(r0)
            r1.append(r8)
            goto L_0x10f8
        L_0x10e9:
            java.lang.String r1 = "No valid varint length mask found"
            goto L_0x10ff
        L_0x10ec:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected lacing value: "
            r1.append(r0)
            r1.append(r3)
        L_0x10f8:
            java.lang.String r1 = r1.toString()
            goto L_0x10ff
        L_0x10fd:
            java.lang.String r1 = "EBML lacing sample size out of range."
        L_0x10ff:
            X.XQX r2 = new X.XQX
            r0 = r23
            r2.<init>(r1, r0, r4, r4)
            throw r2
        L_0x1107:
            java.lang.String r1 = "Element "
            java.lang.String r0 = " must be in a Cues"
            java.lang.String r0 = X.002.A0c(r1, r0, r8)
            X.XQX r0 = X.Pxf.A0L(r0, r11)
            throw r0
        L_0x1114:
            java.lang.String r1 = "Element "
            java.lang.String r0 = " must be in a Cues"
            java.lang.String r0 = X.002.A0c(r1, r0, r8)
            X.XQX r0 = X.Pxf.A0L(r0, r11)
            throw r0
        L_0x1121:
            r0 = r27
            android.util.SparseArray r1 = r0.A0e
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x1144
            java.lang.Object r3 = r1.valueAt(r5)
            X.SG3 r3 = (X.SG3) r3
            X.TjN r0 = r3.A0d
            r0.getClass()
            X.S6Y r2 = r3.A0e
            if (r2 == 0) goto L_0x1141
            X.TjN r1 = r3.A0d
            X.S4h r0 = r3.A0c
            r2.A01(r0, r1)
        L_0x1141:
            int r5 = r5 + 1
            goto L_0x1121
        L_0x1144:
            r4 = -1
            return r4
        L_0x1146:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11696Set.E67(X.TlA, X.XYr):int");
    }

    public static int A00(C13910TlA tlA, SG3 sg3, C11696Set set, int i, boolean z) {
        boolean z2;
        int EJe;
        int EJe2;
        int i2;
        byte[] bArr;
        int i3 = i;
        SG3 sg32 = sg3;
        String str = sg3.A0f;
        C11696Set set2 = set;
        C13910TlA tlA2 = tlA;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0y;
        } else if ("S_TEXT/ASS".equals(str)) {
            bArr = A0x;
        } else if ("S_TEXT/WEBVTT".equals(str)) {
            bArr = A0z;
        } else {
            C13900TjN tjN = sg3.A0d;
            boolean z3 = true;
            z2 = false;
            if (!set.A0U) {
                if (sg3.A0l) {
                    set.A02 &= -1073741825;
                    int i4 = 128;
                    if (!set.A0X) {
                        C11389SRd sRd = set.A0g;
                        tlA.readFully(sRd.A02, 0, 1);
                        set.A08++;
                        byte b = sRd.A02[0];
                        if ((b & 128) != 128) {
                            set.A00 = b;
                            set.A0X = true;
                        } else {
                            throw new XQX("Extension bit is set in signal byte", (Throwable) null, 1, true);
                        }
                    }
                    byte b2 = set.A00;
                    if ((b2 & 1) == 1) {
                        boolean A1S = AnonymousClass7TF.A1S(b2 & 2, 2);
                        set2.A02 |= SN3.MAX_SIGNED_POWER_OF_TWO;
                        if (!set2.A0V) {
                            C11389SRd sRd2 = set2.A0m;
                            tlA.readFully(sRd2.A02, 0, 8);
                            set2.A08 += 8;
                            set2.A0V = true;
                            C11389SRd sRd3 = set2.A0g;
                            byte[] bArr2 = sRd3.A02;
                            if (!A1S) {
                                i4 = 0;
                            }
                            bArr2[0] = (byte) (i4 | 8);
                            sRd3.A0O(0);
                            tjN.EJg(sRd3, 1, 1);
                            set2.A09++;
                            sRd2.A0O(0);
                            tjN.EJg(sRd2, 8, 1);
                            set2.A09 += 8;
                        }
                        if (A1S) {
                            if (!set2.A0W) {
                                C11389SRd sRd4 = set2.A0g;
                                tlA2.readFully(sRd4.A02, 0, 1);
                                set2.A08++;
                                sRd4.A0O(0);
                                set2.A0B = sRd4.A05();
                                set2.A0W = true;
                            }
                            int i5 = set2.A0B * 4;
                            C11389SRd sRd5 = set2.A0g;
                            sRd5.A0M(i5);
                            tlA2.readFully(sRd5.A02, 0, i5);
                            set2.A08 += i5;
                            short s = (short) ((set2.A0B / 2) + 1);
                            int i6 = (s * 6) + 2;
                            ByteBuffer byteBuffer = set2.A0c;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                set2.A0c = ByteBuffer.allocate(i6);
                            }
                            set2.A0c.position(0);
                            set2.A0c.putShort(s);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i2 = set2.A0B;
                                if (i7 >= i2) {
                                    break;
                                }
                                int A072 = sRd5.A07();
                                int i9 = i7 % 2;
                                ByteBuffer byteBuffer2 = set2.A0c;
                                int i10 = A072 - i8;
                                if (i9 == 0) {
                                    byteBuffer2.putShort((short) i10);
                                } else {
                                    byteBuffer2.putInt(i10);
                                }
                                i7++;
                                i8 = A072;
                            }
                            int i11 = (i3 - set2.A08) - i8;
                            int i12 = i2 % 2;
                            ByteBuffer byteBuffer3 = set2.A0c;
                            if (i12 == 1) {
                                byteBuffer3.putInt(i11);
                            } else {
                                byteBuffer3.putShort((short) i11);
                                set2.A0c.putInt(0);
                            }
                            C11389SRd sRd6 = set2.A0n;
                            sRd6.A0Q(set2.A0c.array(), i6);
                            tjN.EJg(sRd6, i6, 1);
                            set2.A09 += i6;
                        }
                    }
                } else {
                    byte[] bArr3 = sg3.A0p;
                    if (bArr3 != null) {
                        set.A0f.A0Q(bArr3, bArr3.length);
                    }
                }
                if (!"A_OPUS".equals(sg32.A0f) ? sg32.A0P > 0 : z) {
                    set2.A02 |= 268435456;
                    set2.A0j.A0M(0);
                    int i13 = (set2.A0f.A00 + i3) - set2.A08;
                    C11389SRd sRd7 = set2.A0g;
                    sRd7.A0M(4);
                    byte[] bArr4 = sRd7.A02;
                    Pxe.A1H(i13 >> 24, bArr4, 0);
                    Pxe.A1H(i13 >> 16, bArr4, 1);
                    Pxe.A1H(i13 >> 8, bArr4, 2);
                    Pxe.A1H(i13, bArr4, 3);
                    tjN.EJg(sRd7, 4, 2);
                    set2.A09 += 4;
                }
                set2.A0U = true;
            }
            C11389SRd sRd8 = set2.A0f;
            int i14 = sRd8.A00;
            int i15 = i3 + i14;
            String str2 = sg32.A0f;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                S6Y s6y = sg32.A0e;
                if (s6y != null) {
                    if (i14 != 0) {
                        z3 = false;
                    }
                    C11366SPh.A02(z3);
                    s6y.A00(tlA2);
                }
                while (true) {
                    int i16 = set2.A08;
                    if (i16 >= i15) {
                        break;
                    }
                    int i17 = i15 - i16;
                    int A062 = Pxe.A06(sRd8);
                    if (A062 > 0) {
                        EJe2 = Math.min(i17, A062);
                        tjN.EJf(sRd8, EJe2);
                    } else {
                        EJe2 = tjN.EJe(tlA2, i17, false);
                    }
                    set2.A08 += EJe2;
                    set2.A09 += EJe2;
                }
            } else {
                C11389SRd sRd9 = set2.A0o;
                byte[] bArr5 = sRd9.A02;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i18 = sg32.A0S;
                int i19 = 4 - i18;
                while (set2.A08 < i15) {
                    int i20 = set2.A0A;
                    int A063 = Pxe.A06(sRd8);
                    if (i20 == 0) {
                        int min = Math.min(i18, A063);
                        tlA2.readFully(bArr5, i19 + min, i18 - min);
                        if (min > 0) {
                            sRd8.A0R(bArr5, i19, min);
                        }
                        set2.A08 += i18;
                        set2.A0A = Pxe.A07(sRd9, 0);
                        C11389SRd sRd10 = set2.A0p;
                        sRd10.A0O(0);
                        tjN.EJf(sRd10, 4);
                        set2.A09 += 4;
                    } else {
                        if (A063 > 0) {
                            EJe = Math.min(i20, A063);
                            tjN.EJf(sRd8, EJe);
                        } else {
                            EJe = tjN.EJe(tlA2, i20, false);
                        }
                        set2.A08 += EJe;
                        set2.A09 += EJe;
                        set2.A0A -= EJe;
                    }
                }
            }
            if ("A_VORBIS".equals(sg32.A0f)) {
                C11389SRd sRd11 = set2.A0q;
                sRd11.A0O(0);
                tjN.EJf(sRd11, 4);
                set2.A09 += 4;
            }
            int i21 = set2.A09;
            set2.A08 = z2 ? 1 : 0;
            set2.A09 = z2;
            set2.A0A = z2;
            set2.A0U = z2;
            set2.A0X = z2;
            set2.A0W = z2;
            set2.A0B = z2;
            set2.A00 = z2 ? (byte) 1 : 0;
            set2.A0V = z2;
            set2.A0f.A0M(z2);
            return i21;
        }
        int length = bArr.length;
        int i22 = length + i;
        C11389SRd sRd12 = set.A0i;
        byte[] bArr6 = sRd12.A02;
        z2 = false;
        if (bArr6.length < i22) {
            byte[] copyOf = Arrays.copyOf(bArr, i22 + i);
            sRd12.A0Q(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr6, 0, length);
        }
        tlA.readFully(sRd12.A02, length, i3);
        sRd12.A0O(0);
        sRd12.A0N(i22);
        int i212 = set2.A09;
        set2.A08 = z2 ? 1 : 0;
        set2.A09 = z2;
        set2.A0A = z2;
        set2.A0U = z2;
        set2.A0X = z2;
        set2.A0W = z2;
        set2.A0B = z2;
        set2.A00 = z2 ? (byte) 1 : 0;
        set2.A0V = z2;
        set2.A0f.A0M(z2);
        return i212;
    }

    public static long A01(C11696Set set, long j) {
        long j2 = set.A0O;
        if (j2 != -9223372036854775807L) {
            return Util.A06(j, j2, 1000);
        }
        throw Pxf.A0L("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    public static void A03(C13910TlA tlA, C11696Set set, int i) {
        C11389SRd sRd = set.A0g;
        if (sRd.A00 < i) {
            int length = sRd.A02.length;
            if (length < i) {
                sRd.A0L(Math.max(length * 2, i));
            }
            byte[] bArr = sRd.A02;
            int i2 = sRd.A00;
            tlA.readFully(bArr, i2, i - i2);
            sRd.A0N(i);
        }
    }

    public static void A05(C11696Set set, int i) {
        if (set.A0S == null) {
            throw Pxf.A0L(002.A0c("Element ", " must be in a TrackEntry", i), (Throwable) null);
        }
    }

    public final void CMU(YBZ ybz) {
        this.A0R = ybz;
        if (this.A0t) {
            ybz = new C11703Sf0(ybz, this.A0s);
        }
        this.A0R = ybz;
    }

    public final boolean Evx(C13910TlA tlA) {
        C11389SRd A0P2 = Pxe.A0P(8);
        C13910TlA tlA2 = tlA;
        long length = tlA2.getLength();
        long j = 1024;
        if (length != -1 && length <= 1024) {
            j = length;
        }
        int i = (int) j;
        tlA2.E2F(A0P2.A02, 0, 4);
        int i2 = 4;
        for (long A0C2 = A0P2.A0C(); A0C2 != 440786851; A0C2 = ((A0C2 << 8) & -256) | ((long) (A0P2.A02[0] & 255))) {
            i2++;
            if (i2 == i) {
                return false;
            }
            tlA2.E2F(A0P2.A02, 0, 1);
        }
        int i3 = 0;
        tlA2.E2F(A0P2.A02, 0, 1);
        byte[] bArr = A0P2.A02;
        byte b = bArr[0] & 255;
        if (b == 0) {
            return false;
        }
        int i4 = 128;
        int i5 = 0;
        while ((b & i4) == 0) {
            i4 >>= 1;
            i5++;
        }
        int i6 = b & (i4 ^ -1);
        tlA2.E2F(bArr, 1, i5);
        while (i3 < i5) {
            i3++;
            i6 = (A0P2.A02[i3] & 255) + (i6 << 8);
        }
        int i7 = i2 + i5 + 1;
        long j2 = (long) i6;
        long j3 = (long) i7;
        if (j2 == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j3 + j2 >= length) {
            return false;
        }
        while (true) {
            long j4 = (long) i7;
            long j5 = j3 + j2;
            if (j4 < j5) {
                int i8 = 0;
                tlA2.E2F(A0P2.A02, 0, 1);
                byte[] bArr2 = A0P2.A02;
                byte b2 = bArr2[0] & 255;
                if (b2 == 0) {
                    return false;
                }
                int i9 = 128;
                int i10 = 0;
                while ((b2 & i9) == 0) {
                    i9 >>= 1;
                    i10++;
                }
                int i11 = b2 & (i9 ^ -1);
                tlA2.E2F(bArr2, 1, i10);
                while (i8 < i10) {
                    i8++;
                    i11 = (A0P2.A02[i8] & 255) + (i11 << 8);
                }
                int i12 = i7 + i10 + 1;
                if (((long) i11) == Long.MIN_VALUE) {
                    return false;
                }
                int i13 = 0;
                tlA2.E2F(A0P2.A02, 0, 1);
                byte[] bArr3 = A0P2.A02;
                byte b3 = bArr3[0] & 255;
                if (b3 == 0) {
                    return false;
                }
                int i14 = 128;
                int i15 = 0;
                while ((b3 & i14) == 0) {
                    i14 >>= 1;
                    i15++;
                }
                int i16 = b3 & (i14 ^ -1);
                tlA2.E2F(bArr3, 1, i15);
                while (i13 < i15) {
                    i13++;
                    i16 = (A0P2.A02[i13] & 255) + (i16 << 8);
                }
                i7 = i12 + i15 + 1;
                long j6 = (long) i16;
                if (j6 < 0 || j6 > 2147483647L) {
                    return false;
                }
                if (j6 != 0) {
                    int i17 = (int) j6;
                    tlA2.AAu(i17);
                    i7 += i17;
                }
            } else if (j4 == j5) {
                return true;
            } else {
                return false;
            }
        }
    }

    public C11696Set(TZc tZc, C13890TjD tjD, int i) {
        this.A0M = -1;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1;
        this.A0L = -1;
        this.A0G = -9223372036854775807L;
        this.A0r = tZc;
        ((C11721SfI) tZc).A03 = new C11720SfH(this);
        this.A0s = tjD;
        boolean z = false;
        this.A0l = AnonymousClass7TF.A1Q(i & 1);
        this.A0t = (i & 2) == 0 ? true : z;
        this.A0k = new SHD();
        this.A0e = Pxe.A0L();
        this.A0g = Pxe.A0P(4);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(-1);
        this.A0q = new C11389SRd(allocate.array());
        this.A0h = Pxe.A0P(4);
        this.A0p = new C11389SRd(SS3.A01);
        this.A0o = Pxe.A0P(4);
        this.A0f = new C11389SRd();
        this.A0i = new C11389SRd();
        this.A0m = Pxe.A0P(8);
        this.A0n = new C11389SRd();
        this.A0j = new C11389SRd();
        this.A0b = new int[1];
    }

    public static SG3 A02(C11696Set set, int i) {
        A05(set, i);
        return set.A0S;
    }

    public final void EKu(long j, long j2) {
        this.A0G = -9223372036854775807L;
        int i = 0;
        this.A05 = 0;
        C11721SfI sfI = (C11721SfI) this.A0r;
        sfI.A01 = 0;
        sfI.A05.clear();
        SHD shd = sfI.A04;
        shd.A01 = 0;
        shd.A00 = 0;
        SHD shd2 = this.A0k;
        shd2.A01 = 0;
        shd2.A00 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0U = false;
        this.A0X = false;
        this.A0W = false;
        this.A0B = 0;
        this.A00 = 0;
        this.A0V = false;
        this.A0f.A0M(0);
        while (true) {
            SparseArray sparseArray = this.A0e;
            if (i < sparseArray.size()) {
                S6Y s6y = ((SG3) sparseArray.valueAt(i)).A0e;
                if (s6y != null) {
                    s6y.A01 = false;
                    s6y.A00 = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    @Deprecated
    public C11696Set() {
        this(new C11721SfI(), C13890TjD.A00, 2);
    }
}
