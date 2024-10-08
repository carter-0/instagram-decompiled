package com.google.android.exoplayer2.extractor.mkv;

import X.002;
import X.AnonymousClass2RN;
import X.AnonymousClass4XT;
import X.AnonymousClass4XV;
import X.AnonymousClass4XW;
import X.AnonymousClass4Y6;
import X.AnonymousClass4Y7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C11025S6c;
import X.C12527SwN;
import X.C12528SwO;
import X.C13462Tap;
import X.C256703wD;
import X.C2609347p;
import X.C265004Sd;
import X.C265994Xd;
import X.C301755zw;
import X.C51967G9n;
import X.Pxe;
import X.Pxh;
import X.SG2;
import X.SHE;
import X.SN3;
import android.util.SparseArray;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public class MatroskaExtractor implements AnonymousClass4XT {
    public static final Map A0s = Pxh.A0x(C51967G9n.A0k(), AnonymousClass7TE.A1E());
    public static final UUID A0t = new UUID(72057594037932032L, -9223371306706625679L);
    public static final byte[] A0u = "Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text".getBytes(AnonymousClass2RN.A05);
    public static final byte[] A0v = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    public static final byte[] A0w = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    public static final byte[] A0x = {87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
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
    public SparseArray A0P;
    public C265004Sd A0Q;
    public SG2 A0R;
    public C301755zw A0S;
    public C301755zw A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public int[] A0c;
    public ByteBuffer A0d;
    public boolean A0e;
    public final C13462Tap A0f;
    public final SHE A0g;
    public final AnonymousClass4XV A0h;
    public final AnonymousClass4XV A0i;
    public final AnonymousClass4XV A0j;
    public final AnonymousClass4XV A0k;
    public final AnonymousClass4XV A0l;
    public final AnonymousClass4XV A0m;
    public final AnonymousClass4XV A0n;
    public final AnonymousClass4XV A0o;
    public final AnonymousClass4XV A0p;
    public final AnonymousClass4XV A0q;
    public final boolean A0r;

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
        r7.A0F(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00e3, code lost:
        r6.A0c.EJh(r7, r7.A00);
        r15 = r15 + r7.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00ef, code lost:
        r1 = r1 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.SG2 r15, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r16, int r17, int r18, int r19, long r20) {
        /*
            r6 = r15
            r15 = r18
            X.S6c r11 = r6.A0d
            r5 = 1
            r4 = r16
            r14 = r17
            r16 = r19
            r17 = r20
            if (r11 == 0) goto L_0x001a
            X.4Xd r13 = r6.A0c
            X.4Xh r12 = r6.A0b
            r11.A02(r12, r13, r14, r15, r16, r17)
        L_0x0017:
            r4.A0e = r5
            return
        L_0x001a:
            java.lang.String r1 = r6.A0e
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
            X.2AG.A04(r7, r0)
        L_0x003f:
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r0 = r0 & r14
            if (r0 == 0) goto L_0x004e
            int r0 = r4.A03
            X.4XV r3 = r4.A0p
            if (r0 <= r5) goto L_0x0056
            r0 = 0
            r3.A0E(r0)
        L_0x004e:
            X.4Xd r12 = r6.A0c
            X.4Xh r13 = r6.A0b
            r12.EJn(r13, r14, r15, r16, r17)
            goto L_0x0017
        L_0x0056:
            int r2 = r3.A00
            X.4Xd r1 = r6.A0c
            r0 = 2
            r1.EJi(r3, r2, r0)
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
            X.4XV r7 = r4.A0o
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
            X.C256703wD.A03(r10)
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
            X.C256703wD.A03(r10)
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
            X.C256703wD.A03(r10)
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
            r7.A0F(r1)
        L_0x00e3:
            X.4Xd r1 = r6.A0c
            int r0 = r7.A00
            r1.EJh(r7, r0)
            int r0 = r7.A00
            int r15 = r15 + r0
            goto L_0x003f
        L_0x00ef:
            int r1 = r1 + 1
            goto L_0x00d6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.A03(X.SG2, com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor, int, int, int, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01bf, code lost:
        if (r8.equals(r0) == false) goto L_0x0155;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01c1, code lost:
        r25 = r7.A0S;
        r9 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x01c9, code lost:
        switch(r1) {
            case -2095576542: goto L_0x01ed;
            case -2095575984: goto L_0x01f6;
            case -1985379776: goto L_0x01ff;
            case -1784763192: goto L_0x0208;
            case -1730367663: goto L_0x0211;
            case -1482641358: goto L_0x021a;
            case -1482641357: goto L_0x0223;
            case -1373388978: goto L_0x022c;
            case -933872740: goto L_0x0235;
            case -538363189: goto L_0x023f;
            case -538363109: goto L_0x0249;
            case -425012669: goto L_0x0253;
            case -356037306: goto L_0x025d;
            case 62923557: goto L_0x0267;
            case 62923603: goto L_0x0271;
            case 62927045: goto L_0x027b;
            case 82318131: goto L_0x0285;
            case 82338133: goto L_0x028f;
            case 82338134: goto L_0x0299;
            case 99146302: goto L_0x02a2;
            case 444813526: goto L_0x02ab;
            case 542569478: goto L_0x02b4;
            case 635596514: goto L_0x02bd;
            case 725948237: goto L_0x02c6;
            case 725957860: goto L_0x02cf;
            case 738597099: goto L_0x02d8;
            case 855502857: goto L_0x02e1;
            case 1045209816: goto L_0x02ea;
            case 1422270023: goto L_0x02f3;
            case 1809237540: goto L_0x02fc;
            case 1950749482: goto L_0x0305;
            case 1950789798: goto L_0x030e;
            case 1951062397: goto L_0x0317;
            default: goto L_0x01cc;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x01cc, code lost:
        r15 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x01cd, code lost:
        r14 = ". Setting mimeType to ";
        r11 = "audio/raw";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01e3, code lost:
        switch(r15) {
            case 0: goto L_0x0323;
            case 1: goto L_0x0323;
            case 2: goto L_0x0332;
            case 3: goto L_0x038f;
            case 4: goto L_0x039a;
            case 5: goto L_0x03f3;
            case 6: goto L_0x03f6;
            case 7: goto L_0x03fe;
            case 8: goto L_0x04a1;
            case 9: goto L_0x0323;
            case 10: goto L_0x04b7;
            case 11: goto L_0x04d1;
            case com.instagram.react.modules.base.IgReactQEModule.CONFIG_KEY_OFFSET :int: goto L_0x04e1;
            case 13: goto L_0x04e5;
            case 14: goto L_0x0503;
            case 15: goto L_0x0507;
            case 16: goto L_0x050b;
            case 17: goto L_0x0510;
            case org.webrtc.EglBase14Impl.EGLExt_SDK_VERSION :int: goto L_0x0515;
            case 19: goto L_0x051a;
            case 20: goto L_0x051e;
            case 21: goto L_0x0507;
            case 22: goto L_0x0523;
            case 23: goto L_0x0536;
            case 24: goto L_0x0540;
            case 25: goto L_0x056e;
            case 26: goto L_0x057f;
            case 27: goto L_0x0598;
            case 28: goto L_0x059b;
            case com.facebook.catalyst.modules.cameraroll.CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL :int: goto L_0x059d;
            case 30: goto L_0x05a1;
            case 31: goto L_0x05a5;
            case 32: goto L_0x05b2;
            default: goto L_0x01e6;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x01ec, code lost:
        throw X.C2609347p.A00("Unrecognized codec identifier.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x01ed, code lost:
        r0 = r8.equals("V_MPEG4/ISO/AP");
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x01f6, code lost:
        r0 = r8.equals("V_MPEG4/ISO/SP");
        r15 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x01ff, code lost:
        r0 = r8.equals("A_MS/ACM");
        r15 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0208, code lost:
        r0 = r8.equals("A_TRUEHD");
        r15 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0211, code lost:
        r0 = r8.equals("A_VORBIS");
        r15 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x021a, code lost:
        r0 = r8.equals("A_MPEG/L2");
        r15 = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x0223, code lost:
        r0 = r8.equals("A_MPEG/L3");
        r15 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x022c, code lost:
        r0 = r8.equals("V_MS/VFW/FOURCC");
        r15 = 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x0235, code lost:
        r0 = r8.equals("S_DVBSUB");
        r15 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x023f, code lost:
        r0 = r8.equals("V_MPEG4/ISO/ASP");
        r15 = 9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0249, code lost:
        r0 = r8.equals("V_MPEG4/ISO/AVC");
        r15 = 10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0253, code lost:
        r0 = r8.equals("S_VOBSUB");
        r15 = 11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x025d, code lost:
        r0 = r8.equals("A_DTS/LOSSLESS");
        r15 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0267, code lost:
        r0 = r8.equals("A_AAC");
        r15 = 13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x0271, code lost:
        r0 = r8.equals("A_AC3");
        r15 = 14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x027b, code lost:
        r0 = r8.equals("A_DTS");
        r15 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0285, code lost:
        r0 = r8.equals("V_AV1");
        r15 = 16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x028f, code lost:
        r0 = r8.equals("V_VP8");
        r15 = 17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0299, code lost:
        r0 = r8.equals("V_VP9");
        r15 = 18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x02a2, code lost:
        r0 = r8.equals("S_HDMV/PGS");
        r15 = 19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x02ab, code lost:
        r0 = r8.equals("V_THEORA");
        r15 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x02b4, code lost:
        r0 = r8.equals("A_DTS/EXPRESS");
        r15 = 21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x02bd, code lost:
        r0 = r8.equals("A_PCM/FLOAT/IEEE");
        r15 = 22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x02c6, code lost:
        r0 = r8.equals("A_PCM/INT/BIG");
        r15 = 23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x02cf, code lost:
        r0 = r8.equals("A_PCM/INT/LIT");
        r15 = 24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02d8, code lost:
        r0 = r8.equals("S_TEXT/ASS");
        r15 = 25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x02e1, code lost:
        r0 = r8.equals("V_MPEGH/ISO/HEVC");
        r15 = 26;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x02ea, code lost:
        r0 = r8.equals("S_TEXT/WEBVTT");
        r15 = 27;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x02f3, code lost:
        r0 = r8.equals("S_TEXT/UTF8");
        r15 = 28;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x02fc, code lost:
        r0 = r8.equals("V_MPEG2");
        r15 = 29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0305, code lost:
        r0 = r8.equals("A_EAC3");
        r15 = 30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x030e, code lost:
        r0 = r8.equals("A_FLAC");
        r15 = 31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0317, code lost:
        r0 = r8.equals("A_OPUS");
        r15 = ' ';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x031f, code lost:
        if (r0 != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0323, code lost:
        r0 = r7.A0l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0325, code lost:
        if (r0 != null) goto L_0x032d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0327, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0328, code lost:
        r11 = "video/mp4v-es";
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x032d, code lost:
        r6 = java.util.Collections.singletonList(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0332, code lost:
        r8 = new X.AnonymousClass4XV(X.SG2.A00(r7, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:?, code lost:
        r12 = r8.A02;
        r0 = r8.A01;
        r15 = r0 + 1;
        r13 = r12[r0] & 255;
        r8.A01 = r15 + 1;
        r12 = ((r12[r15] & 255) << 8) | r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0350, code lost:
        if (r12 == 1) goto L_0x037f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0355, code lost:
        if (r12 != 65534) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0357, code lost:
        r8.A0G(24);
        r17 = r8.A06();
        r15 = A0t;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x0368, code lost:
        if (r17 != r15.getMostSignificantBits()) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0374, code lost:
        if (r8.A06() != r15.getLeastSignificantBits()) goto L_0x0377;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x0377, code lost:
        r11 = X.AnonymousClass7TE.A1A();
        r14 = "Non-PCM MS/ACM is unsupported. Setting mimeType to ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x037f, code lost:
        r8 = r7.A0D;
        r13 = com.google.android.exoplayer2.util.Util.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x0385, code lost:
        if (r13 != 0) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0387, code lost:
        r11 = X.AnonymousClass7TE.A1A();
        r0 = "Unsupported PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x038f, code lost:
        r7.A0d = new X.C11025S6c();
        r11 = "audio/true-hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x039a, code lost:
        r12 = X.SG2.A00(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x03a2, code lost:
        if (r12[0] != 2) goto L_0x108d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x03a4, code lost:
        r11 = 1;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x03a6, code lost:
        r6 = r12[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x03ac, code lost:
        if ((r6 & 255) != 255) goto L_0x03b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x03ae, code lost:
        r14 = r14 + 255;
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x03b3, code lost:
        r15 = r11 + 1;
        r14 = r14 + (r6 & 255);
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x03b8, code lost:
        r0 = r12[r15];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x03bc, code lost:
        if ((r0 & 255) != 255) goto L_0x03c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x03be, code lost:
        r6 = r6 + 255;
        r15 = r15 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x03c3, code lost:
        r11 = r15 + 1;
        r6 = r6 + (r0 & 255);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x03c9, code lost:
        if (r12[r11] != 1) goto L_0x1088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x03cb, code lost:
        r8 = new byte[r14];
        java.lang.System.arraycopy(r12, r11, r8, 0, r14);
        r11 = r11 + r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d3, code lost:
        if (r12[r11] != 3) goto L_0x1083;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d5, code lost:
        r11 = r11 + r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x03d9, code lost:
        if (r12[r11] != 5) goto L_0x107e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x03db, code lost:
        r6 = r12.length - r11;
        r0 = new byte[r6];
        java.lang.System.arraycopy(r12, r11, r0, 0, r6);
        r6 = X.DbS.A0v(2);
        r6.add(r8);
        r6.add(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x03ec, code lost:
        r11 = "audio/vorbis";
        r8 = null;
        r12 = 8192;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x03f3, code lost:
        r11 = "audio/mpeg-L2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x03f6, code lost:
        r11 = "audio/mpeg";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x03f8, code lost:
        r6 = null;
        r8 = null;
        r12 = 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x03fe, code lost:
        r0 = new X.AnonymousClass4XV(X.SG2.A00(r7, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:?, code lost:
        r0.A0H(16);
        r8 = r0.A02;
        r0 = r0.A01;
        r11 = r0 + 1;
        r14 = r11 + 1;
        r11 = r14 + 1;
        r15 = r11 + 1;
        r13 = (X.Pxe.A0D(r8, r11) << 24) | (((((long) r8[r0]) & 255) | (X.Pxe.A0D(r8, r11) << 8)) | (X.Pxe.A0D(r8, r14) << 16));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0439, code lost:
        if (r13 != 1482049860) goto L_0x0443;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x043b, code lost:
        r0 = X.Pxe.A0K("video/divx", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0448, code lost:
        if (r13 != 859189832) goto L_0x0452;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x044a, code lost:
        r0 = X.Pxe.A0K("video/3gpp", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0457, code lost:
        if (r13 != 826496599) goto L_0x048b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0459, code lost:
        r11 = r15 + 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x045b, code lost:
        r6 = r8.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x045e, code lost:
        if (r11 >= (r6 - 4)) goto L_0x1097;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0462, code lost:
        if (r8[r11] != 0) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x0468, code lost:
        if (r8[r11 + 1] != 0) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x046e, code lost:
        if (r8[r11 + 2] != 1) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0476, code lost:
        if (r8[r11 + 3] != 15) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0478, code lost:
        r0 = X.Pxe.A0K("video/wvc1", java.util.Collections.singletonList(java.util.Arrays.copyOfRange(r8, r11, r6)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x0488, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x048b, code lost:
        X.2AG.A04("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
        r0 = X.Pxe.A0K("video/x-unknown", (java.lang.Object) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0497, code lost:
        r11 = (java.lang.String) r0.first;
        r6 = (java.util.List) r0.second;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x04a1, code lost:
        r1 = new byte[4];
        java.lang.System.arraycopy(X.SG2.A00(r7, r8), 0, r1, 0, 4);
        r11 = "application/dvbsubs";
        r6 = X.AnonymousClass4R7.A00(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x04b7, code lost:
        r1 = X.AnonymousClass5h1.A00(new X.AnonymousClass4XV(X.SG2.A00(r7, r8)));
        r6 = r1.A03;
        r7.A0R = r1.A01;
        r8 = r1.A02;
        r11 = "video/avc";
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x04d1, code lost:
        r11 = "application/vobsub";
        r6 = X.AnonymousClass4R7.A00(X.SG2.A00(r7, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x04e1, code lost:
        r11 = "audio/vnd.dts.hd";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x04e5, code lost:
        r6 = java.util.Collections.singletonList(X.SG2.A00(r7, r8));
        r1 = X.C296425q2.A01(r7.A0l);
        r7.A0U = r1.A01;
        r7.A0F = r1.A00;
        r8 = r1.A02;
        r11 = "audio/mp4a-latm";
        r12 = -1;
        r13 = -1;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0503, code lost:
        r11 = "audio/ac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0507, code lost:
        r11 = "audio/vnd.dts";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x050b, code lost:
        r11 = "video/av01";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0510, code lost:
        r11 = "video/x-vnd.on2.vp8";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0515, code lost:
        r11 = "video/x-vnd.on2.vp9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x051a, code lost:
        r11 = "application/pgs";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x051e, code lost:
        r11 = "video/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0523, code lost:
        r8 = r7.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0527, code lost:
        if (r8 != 32) goto L_0x052f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x0529, code lost:
        r6 = null;
        r8 = null;
        r12 = -1;
        r13 = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x052f, code lost:
        r11 = X.AnonymousClass7TE.A1A();
        r0 = "Unsupported floating point PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0536, code lost:
        r8 = r7.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x0538, code lost:
        if (r8 != 8) goto L_0x055d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x053a, code lost:
        r6 = null;
        r8 = null;
        r12 = -1;
        r13 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x0540, code lost:
        r8 = r7.A0D;
        r13 = com.google.android.exoplayer2.util.Util.A02(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0546, code lost:
        if (r13 != 0) goto L_0x0563;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0548, code lost:
        r11 = X.AnonymousClass7TE.A1A();
        r0 = "Unsupported little endian PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x054e, code lost:
        r11.append(r0);
        r11.append(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x0554, code lost:
        X.2AG.A04("MatroskaExtractor", X.Pxg.A0s(r14, "audio/x-unknown", r11));
        r11 = "audio/x-unknown";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x055f, code lost:
        if (r8 != 16) goto L_0x0567;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0561, code lost:
        r13 = 268435456;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:244:0x0563, code lost:
        r6 = null;
        r8 = null;
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x0567, code lost:
        r11 = X.AnonymousClass7TE.A1A();
        r0 = "Unsupported big endian PCM bit depth: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x056e, code lost:
        r11 = "text/x-ssa";
        r6 = X.AnonymousClass4R7.A00(A0u, X.SG2.A00(r7, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:247:0x057f, code lost:
        r1 = X.C11201SFb.A00(new X.AnonymousClass4XV(X.SG2.A00(r7, r8)));
        r6 = r1.A06;
        r7.A0R = r1.A04;
        r8 = r1.A05;
        r11 = "video/hevc";
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x0598, code lost:
        r11 = "text/vtt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x059b, code lost:
        r11 = "application/x-subrip";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:250:0x059d, code lost:
        r11 = "video/mpeg2";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x05a1, code lost:
        r11 = "audio/eac3";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05a3, code lost:
        r6 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a5, code lost:
        r11 = "audio/flac";
        r6 = java.util.Collections.singletonList(X.SG2.A00(r7, r8));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05af, code lost:
        r8 = null;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05b0, code lost:
        r12 = -1;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x05b2, code lost:
        r6 = X.DbS.A0v(3);
        r6.add(X.SG2.A00(r7, r8));
        r0 = java.nio.ByteBuffer.allocate(8);
        r11 = java.nio.ByteOrder.LITTLE_ENDIAN;
        X.Pxi.A1N(r0.order(r11), r6, r7.A0Y);
        X.Pxi.A1N(java.nio.ByteBuffer.allocate(8).order(r11), r6, r7.A0Z);
        r11 = "audio/opus";
        r8 = null;
        r12 = 5760;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:257:0x05de, code lost:
        r13 = -1;
        r6 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x05df, code lost:
        r1 = r7.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:259:0x05e1, code lost:
        if (r1 == null) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x05e3, code lost:
        r0 = X.C11166SDd.A00(new X.AnonymousClass4XV(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x05ec, code lost:
        if (r0 == null) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:0x05ee, code lost:
        r8 = r0.A00;
        r11 = "video/dolby-vision";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x05f3, code lost:
        r1 = r7.A0h;
        r20 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x05f9, code lost:
        if (r7.A0i == false) goto L_0x05fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x05fb, code lost:
        r20 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x05fd, code lost:
        r20 = r20 | r1;
        r1 = new X.C256653w8();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x0608, code lost:
        if (X.2Kn.A04(r11) == false) goto L_0x065b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x060a, code lost:
        r1.A04 = r7.A0F;
        r1.A0E = r7.A0U;
        r1.A0A = r13;
        r9 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0615, code lost:
        r10 = r7.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0617, code lost:
        if (r10 == null) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x061f, code lost:
        if (A0s.containsKey(r10) != false) goto L_0x0625;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0621, code lost:
        r1.A0S = r7.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0625, code lost:
        r1.A0R = java.lang.Integer.toString(r25);
        r1.A0U = r11;
        r1.A09 = r12;
        r1.A0T = r7.A0f;
        r1.A0F = r20 ? 1 : 0;
        r1.A0V = r6;
        r1.A0P = r8;
        r1.A00(r7.A0a);
        r6 = new X.C256683wB(r1);
        r0 = r26.FHW(r7.A0S, r9);
        r7.A0c = r0;
        r0.AWP(r6);
        r2.A0P.put(r7.A0S, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x065f, code lost:
        if (X.2Kn.A06(r11) == false) goto L_0x07c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0663, code lost:
        if (r7.A0L != 0) goto L_0x07bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0665, code lost:
        r0 = r7.A0M;
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0668, code lost:
        if (r0 != -1) goto L_0x066c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x066a, code lost:
        r0 = r7.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x066c, code lost:
        r7.A0M = r0;
        r0 = r7.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0670, code lost:
        if (r0 != -1) goto L_0x0674;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0672, code lost:
        r0 = r7.A0N;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0674, code lost:
        r7.A0K = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x0676, code lost:
        r19 = -1.0f;
        r13 = r7.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x067a, code lost:
        if (r13 == r10) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x067c, code lost:
        r9 = r7.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x067e, code lost:
        if (r9 == r10) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0680, code lost:
        r19 = ((float) (r7.A0N * r13)) / ((float) (r7.A0X * r9));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x068e, code lost:
        if (r7.A0j == false) goto L_0x07ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x0696, code lost:
        if (r7.A06 == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x069c, code lost:
        if (r7.A07 == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x06a2, code lost:
        if (r7.A04 == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x06a8, code lost:
        if (r7.A05 == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x06ae, code lost:
        if (r7.A02 == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x06b4, code lost:
        if (r7.A03 == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x06ba, code lost:
        if (r7.A0B == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x06c0, code lost:
        if (r7.A0C == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x06c6, code lost:
        if (r7.A00 == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x06cc, code lost:
        if (r7.A01 == -1.0f) goto L_0x07b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x06ce, code lost:
        r18 = new byte[25];
        r9 = java.nio.ByteBuffer.wrap(r18).order(java.nio.ByteOrder.LITTLE_ENDIAN);
        r9.put((byte) 0);
        r9.putShort((short) ((int) ((r7.A06 * 50000.0f) + 0.5f)));
        X.Pxi.A1M(r9, r7.A07);
        X.Pxi.A1M(r9, r7.A04);
        X.Pxi.A1M(r9, r7.A05);
        X.Pxi.A1M(r9, r7.A02);
        X.Pxi.A1M(r9, r7.A03);
        X.Pxi.A1M(r9, r7.A0B);
        X.Pxi.A1M(r9, r7.A0C);
        r9.putShort((short) ((int) (r7.A00 + 0.5f)));
        r9.putShort((short) ((int) (r7.A01 + 0.5f)));
        r9.putShort((short) r7.A0P);
        r9.putShort((short) r7.A0Q);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x072e, code lost:
        r13 = new com.google.android.exoplayer2.video.ColorInfo(r7.A0H, r7.A0G, r7.A0I, r18);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0740, code lost:
        r0 = r7.A0g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0742, code lost:
        if (r0 == null) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x0744, code lost:
        r9 = A0s;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x074a, code lost:
        if (r9.containsKey(r0) == false) goto L_0x0752;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x074c, code lost:
        r10 = X.Pxg.A06(r7.A0g, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x0754, code lost:
        if (r7.A0T != 0) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x075d, code lost:
        if (java.lang.Float.compare(r7.A0A, 0.0f) != 0) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x075f, code lost:
        r9 = r7.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x0765, code lost:
        if (java.lang.Float.compare(r9, 0.0f) != 0) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x076d, code lost:
        if (java.lang.Float.compare(r7.A09, 0.0f) != 0) goto L_0x078d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x076f, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:0x0770, code lost:
        r1.A0J = r7.A0X;
        r1.A08 = r7.A0N;
        r1.A01 = r19;
        r1.A0D = r10;
        r1.A0W = r7.A0n;
        r1.A0G = r7.A0V;
        r1.A0O = r17;
        r9 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:331:0x0793, code lost:
        if (java.lang.Float.compare(r9, 90.0f) != 0) goto L_0x0798;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x0795, code lost:
        r10 = 90;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x079e, code lost:
        if (java.lang.Float.compare(r9, -180.0f) == 0) goto L_0x07b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x07a6, code lost:
        if (java.lang.Float.compare(r9, 180.0f) == 0) goto L_0x07b3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x07ae, code lost:
        if (java.lang.Float.compare(r9, -90.0f) != 0) goto L_0x0770;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x07b0, code lost:
        r10 = 270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x07b3, code lost:
        r10 = 180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x07b6, code lost:
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x07ba, code lost:
        r17 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x07bd, code lost:
        r10 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x07c4, code lost:
        if ("application/x-subrip".equals(r11) != false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x07cc, code lost:
        if ("text/x-ssa".equals(r11) != false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x07d4, code lost:
        if ("text/vtt".equals(r11) != false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x07dc, code lost:
        if ("application/vobsub".equals(r11) != false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x07e4, code lost:
        if ("application/pgs".equals(r11) != false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x07ec, code lost:
        if ("application/dvbsubs".equals(r11) != false) goto L_0x0615;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x07f4, code lost:
        throw X.C2609347p.A00("Unexpected MIME type.", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:459:0x09d3, code lost:
        if (r1 == 2) goto L_0x0d64;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:461:0x09d6, code lost:
        if (r1 == 3) goto L_0x0f75;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x09d8, code lost:
        if (r1 == 4) goto L_0x0ac9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:464:0x09db, code lost:
        if (r1 != 5) goto L_0x0abb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:465:0x09dd, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:466:0x09e3, code lost:
        if (r0 == 4) goto L_0x09fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x09e7, code lost:
        if (r0 == 8) goto L_0x09fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:469:0x09e9, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "Invalid float size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:470:0x09ef, code lost:
        r3.append(r2);
        r3.append(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:472:0x09fd, code lost:
        throw X.C2609347p.A00(r3.toString(), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:473:0x09fe, code lost:
        r9 = (int) r0;
        r12 = r6.A06;
        r11 = 0;
        r16.readFully(r12, 0, r9);
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:474:0x0a09, code lost:
        if (r11 >= r9) goto L_0x0a17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:475:0x0a0b, code lost:
        r2 = (r2 << 8) | ((long) (r12[r11] & 255));
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:476:0x0a17, code lost:
        if (r9 != 4) goto L_0x0a33;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:477:0x0a19, code lost:
        r0 = (double) java.lang.Float.intBitsToFloat((int) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:478:0x0a1f, code lost:
        r7 = ((X.C12527SwN) r7).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:479:0x0a25, code lost:
        if (r8 == 181) goto L_0x0ab2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:481:0x0a29, code lost:
        if (r8 == 17545) goto L_0x0aad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a2b, code lost:
        switch(r8) {
            case 21969: goto L_0x0aa4;
            case 21970: goto L_0x0a9b;
            case 21971: goto L_0x0a92;
            case 21972: goto L_0x0a89;
            case 21973: goto L_0x0a80;
            case 21974: goto L_0x0a77;
            case 21975: goto L_0x0a6e;
            case 21976: goto L_0x0a65;
            case 21977: goto L_0x0a5c;
            case 21978: goto L_0x0a53;
            default: goto L_0x0a2e;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:483:0x0a2e, code lost:
        switch(r8) {
            case 30323: goto L_0x0a4a;
            case 30324: goto L_0x0a41;
            case 30325: goto L_0x0a38;
            default: goto L_0x0a31;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0a33, code lost:
        r0 = java.lang.Double.longBitsToDouble(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0a38, code lost:
        X.Pxh.A0X(r7, r8).A09 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0a41, code lost:
        X.Pxh.A0X(r7, r8).A08 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0a4a, code lost:
        X.Pxh.A0X(r7, r8).A0A = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0a53, code lost:
        X.Pxh.A0X(r7, r8).A01 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0a5c, code lost:
        X.Pxh.A0X(r7, r8).A00 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0a65, code lost:
        X.Pxh.A0X(r7, r8).A0C = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0a6e, code lost:
        X.Pxh.A0X(r7, r8).A0B = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0a77, code lost:
        X.Pxh.A0X(r7, r8).A03 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0a80, code lost:
        X.Pxh.A0X(r7, r8).A02 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0a89, code lost:
        X.Pxh.A0X(r7, r8).A05 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0a92, code lost:
        X.Pxh.A0X(r7, r8).A04 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0a9b, code lost:
        X.Pxh.A0X(r7, r8).A07 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0aa4, code lost:
        X.Pxh.A0X(r7, r8).A06 = (float) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0aad, code lost:
        r7.A0I = (long) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0ab2, code lost:
        X.Pxh.A0X(r7, 181).A0U = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0abb, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r3.append("Invalid element type ");
        r3.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0d64, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0d68, code lost:
        if (r0 > 8) goto L_0x0ff8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0d6a, code lost:
        r10 = (int) r0;
        r13 = r6.A06;
        r12 = 0;
        r16.readFully(r13, 0, r10);
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0d75, code lost:
        if (r12 >= r10) goto L_0x0d83;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:621:0x0d77, code lost:
        r0 = (r0 << 8) | ((long) (r13[r12] & 255));
        r12 = r12 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0d83, code lost:
        r7 = ((X.C12527SwN) r7).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0d8b, code lost:
        if (r8 == 20529) goto L_0x0f51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0d91, code lost:
        if (r8 == 20530) goto L_0x0f46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:626:0x0d93, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0d95, code lost:
        switch(r8) {
            case 131: goto L_0x0ef7;
            case 136: goto L_0x0eea;
            case 155: goto L_0x0e62;
            case 159: goto L_0x0ee1;
            case 176: goto L_0x0ed8;
            case 179: goto L_0x0f00;
            case 186: goto L_0x0ecf;
            case 215: goto L_0x0ec6;
            case 231: goto L_0x0e5a;
            case 238: goto L_0x0e55;
            case 241: goto L_0x0e42;
            case 251: goto L_0x0e3e;
            case 16871: goto L_0x0ebd;
            case 16980: goto L_0x0f5e;
            case 17029: goto L_0x0f34;
            case 17143: goto L_0x0f29;
            case 18401: goto L_0x0f1c;
            case 18408: goto L_0x0f11;
            case 21420: goto L_0x0e37;
            case 21432: goto L_0x0e11;
            case 21680: goto L_0x0eb4;
            case 21682: goto L_0x0eab;
            case 21690: goto L_0x0ea2;
            case 21930: goto L_0x0e95;
            case 21998: goto L_0x0e8c;
            case 22186: goto L_0x0e84;
            case 22203: goto L_0x0e7c;
            case 25188: goto L_0x0e73;
            case 30114: goto L_0x0e0d;
            case 30321: goto L_0x0de9;
            case 2352003: goto L_0x0e6a;
            case 2807729: goto L_0x0de5;
            default: goto L_0x0d98;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:629:0x0d99, code lost:
        switch(r8) {
            case 21945: goto L_0x0dbf;
            case 21946: goto L_0x0daf;
            case 21947: goto L_0x0d9e;
            case 21948: goto L_0x0ddc;
            case 21949: goto L_0x0dd3;
            default: goto L_0x0d9c;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:630:0x0d9e, code lost:
        r3 = X.Pxh.A0X(r7, r8);
        r3.A0j = true;
        r0 = com.google.android.exoplayer2.video.ColorInfo.A00((int) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:631:0x0da9, code lost:
        if (r0 == -1) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:632:0x0dab, code lost:
        r3.A0H = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:633:0x0daf, code lost:
        A04(r7, r8);
        r1 = com.google.android.exoplayer2.video.ColorInfo.A01((int) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:634:0x0db7, code lost:
        if (r1 == -1) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0db9, code lost:
        r7.A0R.A0I = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:636:0x0dbf, code lost:
        A04(r7, r8);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:637:0x0dc3, code lost:
        if (r2 == 1) goto L_0x0dcd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0dc5, code lost:
        if (r2 != 2) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:639:0x0dc7, code lost:
        r7.A0R.A0G = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:640:0x0dcd, code lost:
        r7.A0R.A0G = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:641:0x0dd3, code lost:
        X.Pxh.A0X(r7, r8).A0Q = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0ddc, code lost:
        X.Pxh.A0X(r7, r8).A0P = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0de5, code lost:
        r7.A0O = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:644:0x0de9, code lost:
        A04(r7, r8);
        r2 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:645:0x0ded, code lost:
        if (r2 == 0) goto L_0x0e07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:646:0x0def, code lost:
        if (r2 == 1) goto L_0x0e01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:647:0x0df1, code lost:
        if (r2 == 2) goto L_0x0dfb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:648:0x0df3, code lost:
        if (r2 != 3) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:649:0x0df5, code lost:
        r7.A0R.A0T = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:650:0x0dfb, code lost:
        r7.A0R.A0T = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:651:0x0e01, code lost:
        r7.A0R.A0T = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:652:0x0e07, code lost:
        r7.A0R.A0T = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:653:0x0e0d, code lost:
        r7.A0E = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:654:0x0e11, code lost:
        r2 = (int) r0;
        A04(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:655:0x0e15, code lost:
        if (r2 == 0) goto L_0x0e31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:656:0x0e17, code lost:
        if (r2 == 1) goto L_0x0e2b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:657:0x0e19, code lost:
        if (r2 == 3) goto L_0x0e25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:659:0x0e1d, code lost:
        if (r2 != 15) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:660:0x0e1f, code lost:
        r7.A0R.A0V = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:661:0x0e25, code lost:
        r7.A0R.A0V = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:662:0x0e2b, code lost:
        r7.A0R.A0V = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:663:0x0e31, code lost:
        r7.A0R.A0V = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:664:0x0e37, code lost:
        r7.A0K = r0 + r7.A0M;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:665:0x0e3e, code lost:
        r7.A0U = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:667:0x0e44, code lost:
        if (r7.A0a != false) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:669:0x0e48, code lost:
        if (r7.A0T == null) goto L_0x10d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:670:0x0e4a, code lost:
        r2 = r7.A0S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:671:0x0e4c, code lost:
        if (r2 == null) goto L_0x10d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:672:0x0e4e, code lost:
        r2.A01(r0);
        r7.A0a = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:673:0x0e55, code lost:
        r7.A01 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:674:0x0e5a, code lost:
        r7.A0G = A01(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:675:0x0e62, code lost:
        r7.A0D = A01(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:676:0x0e6a, code lost:
        X.Pxh.A0X(r7, r8).A0J = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:677:0x0e73, code lost:
        X.Pxh.A0X(r7, r8).A0D = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:678:0x0e7c, code lost:
        X.Pxh.A0X(r7, r8).A0Z = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:679:0x0e84, code lost:
        X.Pxh.A0X(r7, r8).A0Y = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:680:0x0e8c, code lost:
        X.Pxh.A0X(r7, r8).A0O = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:681:0x0e95, code lost:
        r3 = X.Pxh.A0X(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:682:0x0e9b, code lost:
        if (r0 != 1) goto L_0x0e9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:683:0x0e9d, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:684:0x0e9e, code lost:
        r3.A0i = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:685:0x0ea2, code lost:
        X.Pxh.A0X(r7, r8).A0K = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:686:0x0eab, code lost:
        X.Pxh.A0X(r7, r8).A0L = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:687:0x0eb4, code lost:
        X.Pxh.A0X(r7, r8).A0M = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:688:0x0ebd, code lost:
        X.Pxh.A0X(r7, r8).A0E = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:689:0x0ec6, code lost:
        X.Pxh.A0X(r7, r8).A0S = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:690:0x0ecf, code lost:
        X.Pxh.A0X(r7, r8).A0N = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:691:0x0ed8, code lost:
        X.Pxh.A0X(r7, r8).A0X = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:692:0x0ee1, code lost:
        X.Pxh.A0X(r7, r8).A0F = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:693:0x0eea, code lost:
        r3 = X.Pxh.A0X(r7, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:694:0x0ef0, code lost:
        if (r0 != 1) goto L_0x0ef3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:695:0x0ef2, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:696:0x0ef3, code lost:
        r3.A0h = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:697:0x0ef7, code lost:
        X.Pxh.A0X(r7, r8).A0W = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:698:0x0f00, code lost:
        r3 = r7.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:699:0x0f02, code lost:
        if (r3 == null) goto L_0x10d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:701:0x0f06, code lost:
        if (r7.A0S == null) goto L_0x10d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:702:0x0f08, code lost:
        r3.A01(A01(r7, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:704:0x0f13, code lost:
        if (r0 == 1) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:705:0x0f15, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "AESSettingsCipherMode ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:707:0x0f20, code lost:
        if (r0 == 5) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:708:0x0f22, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "ContentEncAlgo ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:710:0x0f2b, code lost:
        if (r0 == 1) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:711:0x0f2d, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "EBMLReadVersion ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:713:0x0f36, code lost:
        if (r0 < 1) goto L_0x0f3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:715:0x0f3c, code lost:
        if (r0 > 2) goto L_0x0f3f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:716:0x0f3f, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "DocTypeReadVersion ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:718:0x0f48, code lost:
        if (r0 == 1) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:719:0x0f4a, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "ContentEncodingScope ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:721:0x0f55, code lost:
        if (r0 == 0) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:722:0x0f57, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "ContentEncodingOrder ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:724:0x0f62, code lost:
        if (r0 == 3) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:725:0x0f64, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "ContentCompAlgo ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:726:0x0f6a, code lost:
        r3.append(r2);
        r3.append(r0);
        r3.append(" not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:727:0x0f75, code lost:
        r0 = r6.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:728:0x0f7c, code lost:
        if (r0 > 2147483647L) goto L_0x0ff0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:729:0x0f7e, code lost:
        r3 = (int) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:730:0x0f7f, code lost:
        if (r3 != 0) goto L_0x0fd9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:731:0x0f81, code lost:
        r1 = "";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:732:0x0f83, code lost:
        r2 = ((X.C12527SwN) r7).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:733:0x0f89, code lost:
        if (r8 == 134) goto L_0x0fd2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:735:0x0f8d, code lost:
        if (r8 == 17026) goto L_0x0fad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:737:0x0f91, code lost:
        if (r8 == 17827) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:739:0x0f95, code lost:
        if (r8 == 21358) goto L_0x0fa6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:741:0x0f9a, code lost:
        if (r8 != 2274716) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:742:0x0f9c, code lost:
        X.Pxh.A0X(r2, 2274716).A0f = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:744:0x0fa6, code lost:
        X.Pxh.A0X(r2, 21358).A0g = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:746:0x0fb4, code lost:
        if ("webm".equals(r1) != false) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:748:0x0fbd, code lost:
        if ("matroska".equals(r1) != false) goto L_0x0fa2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:749:0x0fbf, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r3.append("DocType ");
        r3.append(r1);
        r3.append(" not supported");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:750:0x0fd2, code lost:
        X.Pxh.A0X(r2, 134).A0e = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x0fd9, code lost:
        r2 = new byte[r3];
        r16.readFully(r2, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x0fe0, code lost:
        if (r3 <= 0) goto L_0x0fea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:753:0x0fe2, code lost:
        r1 = r3 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:754:0x0fe6, code lost:
        if (r2[r1] != 0) goto L_0x0fea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:755:0x0fe8, code lost:
        r3 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:756:0x0fea, code lost:
        r1 = new java.lang.String(r2, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:757:0x0ff0, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "String element size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:758:0x0ff8, code lost:
        r3 = X.AnonymousClass7TE.A1A();
        r2 = "Invalid integer size: ";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:777:0x107b, code lost:
        r0 = "Error parsing MS/ACM codec private";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:781:0x1082, code lost:
        throw X.C2609347p.A00("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:783:0x1087, code lost:
        throw X.C2609347p.A00("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:785:0x108c, code lost:
        throw X.C2609347p.A00("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:787:0x1091, code lost:
        throw X.C2609347p.A00("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:790:0x1096, code lost:
        throw X.C2609347p.A00("Error parsing vorbis codec private", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:794:0x109d, code lost:
        throw X.C2609347p.A00("Failed to find FourCC VC1 initialization data", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:797:0x10a4, code lost:
        throw X.C2609347p.A00("Error parsing FourCC private data", (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:810:0x10e5, code lost:
        throw X.C2609347p.A00(X.002.A0c("Element ", " must be in a Cues", r8), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Removed duplicated region for block: B:769:0x105e  */
    /* JADX WARNING: Removed duplicated region for block: B:821:0x1051 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E68(X.AnonymousClass4Y7 r29, X.C265044Sh r30) {
        /*
            r28 = this;
            r5 = 0
            r27 = r28
            r0 = r27
            r0.A0e = r5
            r4 = 1
        L_0x0008:
            r0 = r27
            boolean r0 = r0.A0e
            if (r0 != 0) goto L_0x110b
            r0 = r27
            X.Tap r6 = r0.A0f
            X.SwO r6 = (X.C12528SwO) r6
            X.Tao r0 = r6.A03
            X.C256703wD.A01(r0)
        L_0x0019:
            java.util.ArrayDeque r11 = r6.A05
            java.lang.Object r1 = r11.peek()
            X.RsZ r1 = (X.C10458RsZ) r1
            r16 = r29
            if (r1 == 0) goto L_0x0870
            r0 = r16
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r2 = r0.A02
            long r0 = r1.A01
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 < 0) goto L_0x0870
            X.Tao r2 = r6.A03
            java.lang.Object r0 = r11.pop()
            X.RsZ r0 = (X.C10458RsZ) r0
            int r1 = r0.A00
            X.SwN r2 = (X.C12527SwN) r2
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r2 = r2.A00
            X.4Sd r0 = r2.A0Q
            r26 = r0
            X.C256703wD.A01(r26)
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 == r0) goto L_0x07f5
            r0 = 174(0xae, float:2.44E-43)
            r3 = 0
            if (r1 == r0) goto L_0x0145
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r10 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x0132
            r0 = 25152(0x6240, float:3.5245E-41)
            if (r1 == r0) goto L_0x010d
            r0 = 28032(0x6d80, float:3.9281E-41)
            if (r1 == r0) goto L_0x00fd
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r1 == r0) goto L_0x00df
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r1 == r0) goto L_0x00d2
            if (r1 != r10) goto L_0x1043
            boolean r0 = r2.A0b
            if (r0 != 0) goto L_0x103f
            X.5zw r11 = r2.A0T
            X.5zw r10 = r2.A0S
            long r0 = r2.A0M
            r7 = -1
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00c7
            long r0 = r2.A0J
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x00c7
            if (r11 == 0) goto L_0x00c7
            int r13 = r11.A00
            if (r13 == 0) goto L_0x00c7
            if (r10 == 0) goto L_0x00c7
            int r0 = r10.A00
            if (r0 != r13) goto L_0x00c7
            int[] r9 = new int[r13]
            long[] r8 = new long[r13]
            long[] r7 = new long[r13]
            long[] r6 = new long[r13]
            r12 = 0
            r14 = 0
        L_0x009b:
            if (r14 >= r13) goto L_0x00b0
            long r0 = r11.A00(r14)
            r6[r14] = r0
            long r0 = r2.A0M
            long r17 = r10.A00(r14)
            long r0 = r0 + r17
            r8[r14] = r0
            int r14 = r14 + 1
            goto L_0x009b
        L_0x00b0:
            int r10 = r13 + -1
            if (r12 >= r10) goto L_0x1000
            int r14 = r12 + 1
            r0 = r8[r14]
            r10 = r8[r12]
            long r0 = r0 - r10
            int r10 = (int) r0
            r9[r12] = r10
            r10 = r6[r14]
            r0 = r6[r12]
            long r10 = r10 - r0
            r7[r12] = r10
            r12 = r14
            goto L_0x00b0
        L_0x00c7:
            long r6 = r2.A0J
            r0 = 0
            X.SwL r10 = new X.SwL
            r10.<init>(r6, r0)
            goto L_0x1038
        L_0x00d2:
            android.util.SparseArray r0 = r2.A0P
            int r0 = r0.size()
            if (r0 == 0) goto L_0x10a8
            r26.ASU()
            goto L_0x1043
        L_0x00df:
            long r6 = r2.A0O
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x00ef
            r0 = 1000000(0xf4240, double:4.940656E-318)
            r2.A0O = r0
        L_0x00ef:
            long r0 = r2.A0I
            int r3 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r3 == 0) goto L_0x1043
            long r0 = A01(r2, r0)
            r2.A0J = r0
            goto L_0x1043
        L_0x00fd:
            X.SG2 r1 = X.Pxh.A0X(r2, r1)
            boolean r0 = r1.A0k
            if (r0 == 0) goto L_0x1043
            byte[] r0 = r1.A0o
            if (r0 == 0) goto L_0x1043
            java.lang.String r0 = "Combining encryption and compression is not supported"
            goto L_0x10aa
        L_0x010d:
            X.SG2 r7 = X.Pxh.A0X(r2, r1)
            boolean r0 = r7.A0k
            if (r0 == 0) goto L_0x1043
            X.4Xh r0 = r7.A0b
            if (r0 == 0) goto L_0x1075
            java.util.UUID r6 = X.AnonymousClass4T7.A03
            byte[] r2 = r0.A03
            java.lang.String r1 = "video/webm"
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData r0 = new com.google.android.exoplayer2.drm.DrmInitData$SchemeData
            r0.<init>(r3, r1, r6, r2)
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r1 = new com.google.android.exoplayer2.drm.DrmInitData.SchemeData[]{r0}
            com.google.android.exoplayer2.drm.DrmInitData r0 = new com.google.android.exoplayer2.drm.DrmInitData
            r0.<init>(r3, r1, r4)
            r7.A0a = r0
            goto L_0x1043
        L_0x0132:
            int r9 = r2.A0C
            r0 = -1
            if (r9 == r0) goto L_0x1078
            long r0 = r2.A0K
            r7 = -1
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x1078
            if (r9 != r10) goto L_0x1043
            r2.A0H = r0
            goto L_0x1043
        L_0x0145:
            X.SG2 r7 = r2.A0R
            X.C256703wD.A01(r7)
            java.lang.String r8 = r7.A0e
            if (r8 == 0) goto L_0x10a5
            int r1 = r8.hashCode()
            switch(r1) {
                case -2095576542: goto L_0x0159;
                case -2095575984: goto L_0x015c;
                case -1985379776: goto L_0x015f;
                case -1784763192: goto L_0x0162;
                case -1730367663: goto L_0x0165;
                case -1482641358: goto L_0x0168;
                case -1482641357: goto L_0x016b;
                case -1373388978: goto L_0x016e;
                case -933872740: goto L_0x0171;
                case -538363189: goto L_0x0174;
                case -538363109: goto L_0x0177;
                case -425012669: goto L_0x017a;
                case -356037306: goto L_0x017d;
                case 62923557: goto L_0x0180;
                case 62923603: goto L_0x0183;
                case 62927045: goto L_0x0186;
                case 82318131: goto L_0x0189;
                case 82338133: goto L_0x018c;
                case 82338134: goto L_0x018f;
                case 99146302: goto L_0x0192;
                case 444813526: goto L_0x0195;
                case 542569478: goto L_0x0198;
                case 635596514: goto L_0x019b;
                case 725948237: goto L_0x019e;
                case 725957860: goto L_0x01a1;
                case 738597099: goto L_0x01a4;
                case 855502857: goto L_0x01a7;
                case 1045209816: goto L_0x01aa;
                case 1422270023: goto L_0x01ad;
                case 1809237540: goto L_0x01b0;
                case 1950749482: goto L_0x01b3;
                case 1950789798: goto L_0x01b6;
                case 1951062397: goto L_0x01b9;
                default: goto L_0x0155;
            }
        L_0x0155:
            r2.A0R = r3
            goto L_0x1043
        L_0x0159:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            goto L_0x01bb
        L_0x015c:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            goto L_0x01bb
        L_0x015f:
            java.lang.String r0 = "A_MS/ACM"
            goto L_0x01bb
        L_0x0162:
            java.lang.String r0 = "A_TRUEHD"
            goto L_0x01bb
        L_0x0165:
            java.lang.String r0 = "A_VORBIS"
            goto L_0x01bb
        L_0x0168:
            java.lang.String r0 = "A_MPEG/L2"
            goto L_0x01bb
        L_0x016b:
            java.lang.String r0 = "A_MPEG/L3"
            goto L_0x01bb
        L_0x016e:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            goto L_0x01bb
        L_0x0171:
            java.lang.String r0 = "S_DVBSUB"
            goto L_0x01bb
        L_0x0174:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            goto L_0x01bb
        L_0x0177:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            goto L_0x01bb
        L_0x017a:
            java.lang.String r0 = "S_VOBSUB"
            goto L_0x01bb
        L_0x017d:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            goto L_0x01bb
        L_0x0180:
            java.lang.String r0 = "A_AAC"
            goto L_0x01bb
        L_0x0183:
            java.lang.String r0 = "A_AC3"
            goto L_0x01bb
        L_0x0186:
            java.lang.String r0 = "A_DTS"
            goto L_0x01bb
        L_0x0189:
            java.lang.String r0 = "V_AV1"
            goto L_0x01bb
        L_0x018c:
            java.lang.String r0 = "V_VP8"
            goto L_0x01bb
        L_0x018f:
            java.lang.String r0 = "V_VP9"
            goto L_0x01bb
        L_0x0192:
            java.lang.String r0 = "S_HDMV/PGS"
            goto L_0x01bb
        L_0x0195:
            java.lang.String r0 = "V_THEORA"
            goto L_0x01bb
        L_0x0198:
            java.lang.String r0 = "A_DTS/EXPRESS"
            goto L_0x01bb
        L_0x019b:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            goto L_0x01bb
        L_0x019e:
            java.lang.String r0 = "A_PCM/INT/BIG"
            goto L_0x01bb
        L_0x01a1:
            java.lang.String r0 = "A_PCM/INT/LIT"
            goto L_0x01bb
        L_0x01a4:
            java.lang.String r0 = "S_TEXT/ASS"
            goto L_0x01bb
        L_0x01a7:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            goto L_0x01bb
        L_0x01aa:
            java.lang.String r0 = "S_TEXT/WEBVTT"
            goto L_0x01bb
        L_0x01ad:
            java.lang.String r0 = "S_TEXT/UTF8"
            goto L_0x01bb
        L_0x01b0:
            java.lang.String r0 = "V_MPEG2"
            goto L_0x01bb
        L_0x01b3:
            java.lang.String r0 = "A_EAC3"
            goto L_0x01bb
        L_0x01b6:
            java.lang.String r0 = "A_FLAC"
            goto L_0x01bb
        L_0x01b9:
            java.lang.String r0 = "A_OPUS"
        L_0x01bb:
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x0155
            int r0 = r7.A0S
            r25 = r0
            r12 = 8
            r9 = 3
            r13 = 2
            switch(r1) {
                case -2095576542: goto L_0x01ed;
                case -2095575984: goto L_0x01f6;
                case -1985379776: goto L_0x01ff;
                case -1784763192: goto L_0x0208;
                case -1730367663: goto L_0x0211;
                case -1482641358: goto L_0x021a;
                case -1482641357: goto L_0x0223;
                case -1373388978: goto L_0x022c;
                case -933872740: goto L_0x0235;
                case -538363189: goto L_0x023f;
                case -538363109: goto L_0x0249;
                case -425012669: goto L_0x0253;
                case -356037306: goto L_0x025d;
                case 62923557: goto L_0x0267;
                case 62923603: goto L_0x0271;
                case 62927045: goto L_0x027b;
                case 82318131: goto L_0x0285;
                case 82338133: goto L_0x028f;
                case 82338134: goto L_0x0299;
                case 99146302: goto L_0x02a2;
                case 444813526: goto L_0x02ab;
                case 542569478: goto L_0x02b4;
                case 635596514: goto L_0x02bd;
                case 725948237: goto L_0x02c6;
                case 725957860: goto L_0x02cf;
                case 738597099: goto L_0x02d8;
                case 855502857: goto L_0x02e1;
                case 1045209816: goto L_0x02ea;
                case 1422270023: goto L_0x02f3;
                case 1809237540: goto L_0x02fc;
                case 1950749482: goto L_0x0305;
                case 1950789798: goto L_0x030e;
                case 1951062397: goto L_0x0317;
                default: goto L_0x01cc;
            }
        L_0x01cc:
            r15 = -1
        L_0x01cd:
            java.lang.String r24 = "application/dvbsubs"
            java.lang.String r23 = "application/pgs"
            java.lang.String r22 = "application/vobsub"
            java.lang.String r21 = "text/vtt"
            java.lang.String r19 = "text/x-ssa"
            java.lang.String r10 = "application/x-subrip"
            java.lang.String r14 = ". Setting mimeType to "
            java.lang.String r11 = "audio/raw"
            java.lang.String r6 = "MatroskaExtractor"
            java.lang.String r1 = "audio/x-unknown"
            switch(r15) {
                case 0: goto L_0x0323;
                case 1: goto L_0x0323;
                case 2: goto L_0x0332;
                case 3: goto L_0x038f;
                case 4: goto L_0x039a;
                case 5: goto L_0x03f3;
                case 6: goto L_0x03f6;
                case 7: goto L_0x03fe;
                case 8: goto L_0x04a1;
                case 9: goto L_0x0323;
                case 10: goto L_0x04b7;
                case 11: goto L_0x04d1;
                case 12: goto L_0x04e1;
                case 13: goto L_0x04e5;
                case 14: goto L_0x0503;
                case 15: goto L_0x0507;
                case 16: goto L_0x050b;
                case 17: goto L_0x0510;
                case 18: goto L_0x0515;
                case 19: goto L_0x051a;
                case 20: goto L_0x051e;
                case 21: goto L_0x0507;
                case 22: goto L_0x0523;
                case 23: goto L_0x0536;
                case 24: goto L_0x0540;
                case 25: goto L_0x056e;
                case 26: goto L_0x057f;
                case 27: goto L_0x0598;
                case 28: goto L_0x059b;
                case 29: goto L_0x059d;
                case 30: goto L_0x05a1;
                case 31: goto L_0x05a5;
                case 32: goto L_0x05b2;
                default: goto L_0x01e6;
            }
        L_0x01e6:
            java.lang.String r0 = "Unrecognized codec identifier."
            X.47p r0 = X.C2609347p.A00(r0, r3)
            throw r0
        L_0x01ed:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            boolean r0 = r8.equals(r0)
            r15 = 0
            goto L_0x031f
        L_0x01f6:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            boolean r0 = r8.equals(r0)
            r15 = 1
            goto L_0x031f
        L_0x01ff:
            java.lang.String r0 = "A_MS/ACM"
            boolean r0 = r8.equals(r0)
            r15 = 2
            goto L_0x031f
        L_0x0208:
            java.lang.String r0 = "A_TRUEHD"
            boolean r0 = r8.equals(r0)
            r15 = 3
            goto L_0x031f
        L_0x0211:
            java.lang.String r0 = "A_VORBIS"
            boolean r0 = r8.equals(r0)
            r15 = 4
            goto L_0x031f
        L_0x021a:
            java.lang.String r0 = "A_MPEG/L2"
            boolean r0 = r8.equals(r0)
            r15 = 5
            goto L_0x031f
        L_0x0223:
            java.lang.String r0 = "A_MPEG/L3"
            boolean r0 = r8.equals(r0)
            r15 = 6
            goto L_0x031f
        L_0x022c:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            boolean r0 = r8.equals(r0)
            r15 = 7
            goto L_0x031f
        L_0x0235:
            java.lang.String r0 = "S_DVBSUB"
            boolean r0 = r8.equals(r0)
            r15 = 8
            goto L_0x031f
        L_0x023f:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            boolean r0 = r8.equals(r0)
            r15 = 9
            goto L_0x031f
        L_0x0249:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            boolean r0 = r8.equals(r0)
            r15 = 10
            goto L_0x031f
        L_0x0253:
            java.lang.String r0 = "S_VOBSUB"
            boolean r0 = r8.equals(r0)
            r15 = 11
            goto L_0x031f
        L_0x025d:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            boolean r0 = r8.equals(r0)
            r15 = 12
            goto L_0x031f
        L_0x0267:
            java.lang.String r0 = "A_AAC"
            boolean r0 = r8.equals(r0)
            r15 = 13
            goto L_0x031f
        L_0x0271:
            java.lang.String r0 = "A_AC3"
            boolean r0 = r8.equals(r0)
            r15 = 14
            goto L_0x031f
        L_0x027b:
            java.lang.String r0 = "A_DTS"
            boolean r0 = r8.equals(r0)
            r15 = 15
            goto L_0x031f
        L_0x0285:
            java.lang.String r0 = "V_AV1"
            boolean r0 = r8.equals(r0)
            r15 = 16
            goto L_0x031f
        L_0x028f:
            java.lang.String r0 = "V_VP8"
            boolean r0 = r8.equals(r0)
            r15 = 17
            goto L_0x031f
        L_0x0299:
            java.lang.String r0 = "V_VP9"
            boolean r0 = r8.equals(r0)
            r15 = 18
            goto L_0x031f
        L_0x02a2:
            java.lang.String r0 = "S_HDMV/PGS"
            boolean r0 = r8.equals(r0)
            r15 = 19
            goto L_0x031f
        L_0x02ab:
            java.lang.String r0 = "V_THEORA"
            boolean r0 = r8.equals(r0)
            r15 = 20
            goto L_0x031f
        L_0x02b4:
            java.lang.String r0 = "A_DTS/EXPRESS"
            boolean r0 = r8.equals(r0)
            r15 = 21
            goto L_0x031f
        L_0x02bd:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            boolean r0 = r8.equals(r0)
            r15 = 22
            goto L_0x031f
        L_0x02c6:
            java.lang.String r0 = "A_PCM/INT/BIG"
            boolean r0 = r8.equals(r0)
            r15 = 23
            goto L_0x031f
        L_0x02cf:
            java.lang.String r0 = "A_PCM/INT/LIT"
            boolean r0 = r8.equals(r0)
            r15 = 24
            goto L_0x031f
        L_0x02d8:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r0 = r8.equals(r0)
            r15 = 25
            goto L_0x031f
        L_0x02e1:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            boolean r0 = r8.equals(r0)
            r15 = 26
            goto L_0x031f
        L_0x02ea:
            java.lang.String r0 = "S_TEXT/WEBVTT"
            boolean r0 = r8.equals(r0)
            r15 = 27
            goto L_0x031f
        L_0x02f3:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r0 = r8.equals(r0)
            r15 = 28
            goto L_0x031f
        L_0x02fc:
            java.lang.String r0 = "V_MPEG2"
            boolean r0 = r8.equals(r0)
            r15 = 29
            goto L_0x031f
        L_0x0305:
            java.lang.String r0 = "A_EAC3"
            boolean r0 = r8.equals(r0)
            r15 = 30
            goto L_0x031f
        L_0x030e:
            java.lang.String r0 = "A_FLAC"
            boolean r0 = r8.equals(r0)
            r15 = 31
            goto L_0x031f
        L_0x0317:
            java.lang.String r0 = "A_OPUS"
            boolean r0 = r8.equals(r0)
            r15 = 32
        L_0x031f:
            if (r0 != 0) goto L_0x01cd
            goto L_0x01cc
        L_0x0323:
            byte[] r0 = r7.A0l
            if (r0 != 0) goto L_0x032d
            r6 = 0
        L_0x0328:
            java.lang.String r11 = "video/mp4v-es"
            goto L_0x05af
        L_0x032d:
            java.util.List r6 = java.util.Collections.singletonList(r0)
            goto L_0x0328
        L_0x0332:
            byte[] r0 = X.SG2.A00(r7, r8)
            X.4XV r8 = new X.4XV
            r8.<init>((byte[]) r0)
            byte[] r12 = r8.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            int r0 = r8.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            int r15 = r0 + 1
            byte r0 = r12[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            r13 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r15 + 1
            r8.A01 = r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            byte r0 = r12[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r12 = r0 << 8
            r12 = r12 | r13
            if (r12 == r4) goto L_0x037f
            r0 = 65534(0xfffe, float:9.1833E-41)
            if (r12 != r0) goto L_0x0377
            r0 = 24
            r8.A0G(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            long r17 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            java.util.UUID r15 = A0t     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            long r12 = r15.getMostSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0377
            long r17 = r8.A06()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            long r12 = r15.getLeastSignificantBits()     // Catch:{ ArrayIndexOutOfBoundsException -> 0x107b }
            int r0 = (r17 > r12 ? 1 : (r17 == r12 ? 0 : -1))
            if (r0 != 0) goto L_0x0377
            goto L_0x037f
        L_0x0377:
            java.lang.StringBuilder r11 = X.AnonymousClass7TE.A1A()
            java.lang.String r14 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            goto L_0x0554
        L_0x037f:
            int r8 = r7.A0D
            int r13 = com.google.android.exoplayer2.util.Util.A02(r8)
            if (r13 != 0) goto L_0x0563
            java.lang.StringBuilder r11 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported PCM bit depth: "
            goto L_0x054e
        L_0x038f:
            X.S6c r0 = new X.S6c
            r0.<init>()
            r7.A0d = r0
            java.lang.String r11 = "audio/true-hd"
            goto L_0x05a3
        L_0x039a:
            byte[] r12 = X.SG2.A00(r7, r8)
            java.lang.String r1 = "Error parsing vorbis codec private"
            byte r0 = r12[r5]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            if (r0 != r13) goto L_0x108d
            r11 = 1
            r14 = 0
        L_0x03a6:
            byte r6 = r12[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            r0 = r6 & 255(0xff, float:3.57E-43)
            r8 = 255(0xff, float:3.57E-43)
            if (r0 != r8) goto L_0x03b3
            int r14 = r14 + 255
            int r11 = r11 + 1
            goto L_0x03a6
        L_0x03b3:
            int r15 = r11 + 1
            r6 = r6 & r8
            int r14 = r14 + r6
            r6 = 0
        L_0x03b8:
            byte r0 = r12[r15]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            r11 = r0 & 255(0xff, float:3.57E-43)
            if (r11 != r8) goto L_0x03c3
            int r6 = r6 + 255
            int r15 = r15 + 1
            goto L_0x03b8
        L_0x03c3:
            int r11 = r15 + 1
            r0 = r0 & r8
            int r6 = r6 + r0
            byte r0 = r12[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            if (r0 != r4) goto L_0x1088
            byte[] r8 = new byte[r14]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            java.lang.System.arraycopy(r12, r11, r8, r5, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            int r11 = r11 + r14
            byte r0 = r12[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            if (r0 != r9) goto L_0x1083
            int r11 = r11 + r6
            byte r6 = r12[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            r0 = 5
            if (r6 != r0) goto L_0x107e
            int r6 = r12.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            int r6 = r6 - r11
            byte[] r0 = new byte[r6]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            java.lang.System.arraycopy(r12, r11, r0, r5, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            java.util.ArrayList r6 = X.DbS.A0v(r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            r6.add(r8)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            r6.add(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            java.lang.String r11 = "audio/vorbis"
            r8 = 0
            r12 = 8192(0x2000, float:1.14794E-41)
            goto L_0x05de
        L_0x03f3:
            java.lang.String r11 = "audio/mpeg-L2"
            goto L_0x03f8
        L_0x03f6:
            java.lang.String r11 = "audio/mpeg"
        L_0x03f8:
            r6 = 0
            r8 = 0
            r12 = 4096(0x1000, float:5.74E-42)
            goto L_0x05de
        L_0x03fe:
            byte[] r1 = X.SG2.A00(r7, r8)
            X.4XV r0 = new X.4XV
            r0.<init>((byte[]) r1)
            r13 = 16
            r0.A0H(r13)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            byte[] r8 = r0.A02     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            int r0 = r0.A01     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            int r11 = r0 + 1
            byte r0 = r8[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            long r0 = (long) r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r14 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r14
            int r14 = r11 + 1
            long r17 = X.Pxe.A0D(r8, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            long r17 = r17 << r12
            long r0 = r0 | r17
            int r11 = r14 + 1
            long r14 = X.Pxe.A0D(r8, r14)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            long r14 = r14 << r13
            long r0 = r0 | r14
            int r15 = r11 + 1
            long r13 = X.Pxe.A0D(r8, r11)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r11 = 24
            long r13 = r13 << r11
            long r13 = r13 | r0
            r11 = 1482049860(0x58564944, double:7.322299212E-315)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0443
            java.lang.String r0 = "video/divx"
            android.util.Pair r0 = X.Pxe.A0K(r0, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            goto L_0x0497
        L_0x0443:
            r11 = 859189832(0x33363248, double:4.244961792E-315)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x0452
            java.lang.String r0 = "video/3gpp"
            android.util.Pair r0 = X.Pxe.A0K(r0, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            goto L_0x0497
        L_0x0452:
            r11 = 826496599(0x31435657, double:4.08343576E-315)
            int r0 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r0 != 0) goto L_0x048b
            int r11 = r15 + 20
        L_0x045b:
            int r6 = r8.length     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            int r0 = r6 + -4
            if (r11 >= r0) goto L_0x1097
            byte r0 = r8[r11]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            if (r0 != 0) goto L_0x0488
            int r0 = r11 + 1
            byte r0 = r8[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            if (r0 != 0) goto L_0x0488
            int r0 = r11 + 2
            byte r0 = r8[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            if (r0 != r4) goto L_0x0488
            int r0 = r11 + 3
            byte r1 = r8[r0]     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            r0 = 15
            if (r1 != r0) goto L_0x0488
            byte[] r0 = java.util.Arrays.copyOfRange(r8, r11, r6)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            java.lang.String r1 = "video/wvc1"
            java.util.List r0 = java.util.Collections.singletonList(r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            android.util.Pair r0 = X.Pxe.A0K(r1, r0)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            goto L_0x0497
        L_0x0488:
            int r11 = r11 + 1
            goto L_0x045b
        L_0x048b:
            java.lang.String r0 = "Unknown FourCC. Setting mimeType to video/x-unknown"
            X.2AG.A04(r6, r0)
            java.lang.String r0 = "video/x-unknown"
            android.util.Pair r0 = X.Pxe.A0K(r0, r3)
        L_0x0497:
            java.lang.Object r11 = r0.first
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r6 = r0.second
            java.util.List r6 = (java.util.List) r6
            goto L_0x05af
        L_0x04a1:
            r6 = 4
            byte[] r1 = new byte[r6]
            byte[] r0 = X.SG2.A00(r7, r8)
            java.lang.System.arraycopy(r0, r5, r1, r5, r6)
            byte[][] r0 = new byte[][]{r1}
            java.util.ArrayList r6 = X.AnonymousClass4R7.A00(r0)
            r11 = r24
            goto L_0x05af
        L_0x04b7:
            byte[] r1 = X.SG2.A00(r7, r8)
            X.4XV r0 = new X.4XV
            r0.<init>((byte[]) r1)
            X.5h1 r1 = X.AnonymousClass5h1.A00(r0)
            java.util.List r6 = r1.A03
            int r0 = r1.A01
            r7.A0R = r0
            java.lang.String r8 = r1.A02
            java.lang.String r11 = "video/avc"
            goto L_0x05b0
        L_0x04d1:
            byte[] r0 = X.SG2.A00(r7, r8)
            byte[][] r0 = new byte[][]{r0}
            java.util.ArrayList r6 = X.AnonymousClass4R7.A00(r0)
            r11 = r22
            goto L_0x05af
        L_0x04e1:
            java.lang.String r11 = "audio/vnd.dts.hd"
            goto L_0x05a3
        L_0x04e5:
            byte[] r0 = X.SG2.A00(r7, r8)
            java.util.List r6 = java.util.Collections.singletonList(r0)
            byte[] r0 = r7.A0l
            X.5q3 r1 = X.C296425q2.A01(r0)
            int r0 = r1.A01
            r7.A0U = r0
            int r0 = r1.A00
            r7.A0F = r0
            java.lang.String r8 = r1.A02
            java.lang.String r11 = "audio/mp4a-latm"
            r12 = -1
            r13 = -1
            goto L_0x05df
        L_0x0503:
            java.lang.String r11 = "audio/ac3"
            goto L_0x05a3
        L_0x0507:
            java.lang.String r11 = "audio/vnd.dts"
            goto L_0x05a3
        L_0x050b:
            java.lang.String r11 = "video/av01"
            goto L_0x05a3
        L_0x0510:
            java.lang.String r11 = "video/x-vnd.on2.vp8"
            goto L_0x05a3
        L_0x0515:
            java.lang.String r11 = "video/x-vnd.on2.vp9"
            goto L_0x05a3
        L_0x051a:
            r11 = r23
            goto L_0x05a3
        L_0x051e:
            java.lang.String r11 = "video/x-unknown"
            goto L_0x05a3
        L_0x0523:
            int r8 = r7.A0D
            r0 = 32
            if (r8 != r0) goto L_0x052f
            r6 = 0
            r8 = 0
            r12 = -1
            r13 = 4
            goto L_0x05df
        L_0x052f:
            java.lang.StringBuilder r11 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported floating point PCM bit depth: "
            goto L_0x054e
        L_0x0536:
            int r8 = r7.A0D
            if (r8 != r12) goto L_0x055d
            r6 = 0
            r8 = 0
            r12 = -1
            r13 = 3
            goto L_0x05df
        L_0x0540:
            int r8 = r7.A0D
            int r13 = com.google.android.exoplayer2.util.Util.A02(r8)
            if (r13 != 0) goto L_0x0563
            java.lang.StringBuilder r11 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported little endian PCM bit depth: "
        L_0x054e:
            r11.append(r0)
            r11.append(r8)
        L_0x0554:
            java.lang.String r0 = X.Pxg.A0s(r14, r1, r11)
            X.2AG.A04(r6, r0)
            r11 = r1
            goto L_0x05a3
        L_0x055d:
            r0 = 16
            if (r8 != r0) goto L_0x0567
            r13 = 268435456(0x10000000, float:2.5243549E-29)
        L_0x0563:
            r6 = 0
            r8 = 0
            r12 = -1
            goto L_0x05df
        L_0x0567:
            java.lang.StringBuilder r11 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unsupported big endian PCM bit depth: "
            goto L_0x054e
        L_0x056e:
            byte[] r1 = A0u
            byte[] r0 = X.SG2.A00(r7, r8)
            byte[][] r0 = new byte[][]{r1, r0}
            java.util.ArrayList r6 = X.AnonymousClass4R7.A00(r0)
            r11 = r19
            goto L_0x05af
        L_0x057f:
            byte[] r1 = X.SG2.A00(r7, r8)
            X.4XV r0 = new X.4XV
            r0.<init>((byte[]) r1)
            X.SFb r1 = X.C11201SFb.A00(r0)
            java.util.List r6 = r1.A06
            int r0 = r1.A04
            r7.A0R = r0
            java.lang.String r8 = r1.A05
            java.lang.String r11 = "video/hevc"
            goto L_0x05b0
        L_0x0598:
            r11 = r21
            goto L_0x05a3
        L_0x059b:
            r11 = r10
            goto L_0x05a3
        L_0x059d:
            java.lang.String r11 = "video/mpeg2"
            goto L_0x05a3
        L_0x05a1:
            java.lang.String r11 = "audio/eac3"
        L_0x05a3:
            r6 = 0
            goto L_0x05af
        L_0x05a5:
            byte[] r0 = X.SG2.A00(r7, r8)
            java.util.List r6 = java.util.Collections.singletonList(r0)
            java.lang.String r11 = "audio/flac"
        L_0x05af:
            r8 = 0
        L_0x05b0:
            r12 = -1
            goto L_0x05de
        L_0x05b2:
            java.util.ArrayList r6 = X.DbS.A0v(r9)
            byte[] r0 = X.SG2.A00(r7, r8)
            r6.add(r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r8 = r0.order(r11)
            long r0 = r7.A0Y
            X.Pxi.A1N(r8, r6, r0)
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r12)
            java.nio.ByteBuffer r8 = r0.order(r11)
            long r0 = r7.A0Z
            X.Pxi.A1N(r8, r6, r0)
            java.lang.String r11 = "audio/opus"
            r8 = 0
            r12 = 5760(0x1680, float:8.071E-42)
        L_0x05de:
            r13 = -1
        L_0x05df:
            byte[] r1 = r7.A0m
            if (r1 == 0) goto L_0x05f3
            X.4XV r0 = new X.4XV
            r0.<init>((byte[]) r1)
            X.SDd r0 = X.C11166SDd.A00(r0)
            if (r0 == 0) goto L_0x05f3
            java.lang.String r8 = r0.A00
            java.lang.String r11 = "video/dolby-vision"
        L_0x05f3:
            boolean r1 = r7.A0h
            boolean r0 = r7.A0i
            r20 = 0
            if (r0 == 0) goto L_0x05fd
            r20 = 2
        L_0x05fd:
            r20 = r20 | r1
            X.3w8 r1 = new X.3w8
            r1.<init>()
            boolean r0 = X.2Kn.A04(r11)
            if (r0 == 0) goto L_0x065b
            int r0 = r7.A0F
            r1.A04 = r0
            int r0 = r7.A0U
            r1.A0E = r0
            r1.A0A = r13
            r9 = 1
        L_0x0615:
            java.lang.String r10 = r7.A0g
            if (r10 == 0) goto L_0x0625
            java.util.Map r0 = A0s
            boolean r0 = r0.containsKey(r10)
            if (r0 != 0) goto L_0x0625
            java.lang.String r0 = r7.A0g
            r1.A0S = r0
        L_0x0625:
            java.lang.String r0 = java.lang.Integer.toString(r25)
            r1.A0R = r0
            r1.A0U = r11
            r1.A09 = r12
            java.lang.String r0 = r7.A0f
            r1.A0T = r0
            r0 = r20
            r1.A0F = r0
            r1.A0V = r6
            r1.A0P = r8
            com.google.android.exoplayer2.drm.DrmInitData r0 = r7.A0a
            r1.A00(r0)
            X.3wB r6 = new X.3wB
            r6.<init>(r1)
            int r1 = r7.A0S
            r0 = r26
            X.4Xd r0 = r0.FHW(r1, r9)
            r7.A0c = r0
            r0.AWP(r6)
            android.util.SparseArray r1 = r2.A0P
            int r0 = r7.A0S
            r1.put(r0, r7)
            goto L_0x0155
        L_0x065b:
            boolean r0 = X.2Kn.A06(r11)
            if (r0 == 0) goto L_0x07c0
            int r0 = r7.A0L
            if (r0 != 0) goto L_0x07bd
            int r0 = r7.A0M
            r10 = -1
            if (r0 != r10) goto L_0x066c
            int r0 = r7.A0X
        L_0x066c:
            r7.A0M = r0
            int r0 = r7.A0K
            if (r0 != r10) goto L_0x0674
            int r0 = r7.A0N
        L_0x0674:
            r7.A0K = r0
        L_0x0676:
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r13 = r7.A0M
            if (r13 == r10) goto L_0x068c
            int r9 = r7.A0K
            if (r9 == r10) goto L_0x068c
            int r0 = r7.A0N
            int r0 = r0 * r13
            float r0 = (float) r0
            r19 = r0
            int r0 = r7.A0X
            int r0 = r0 * r9
            float r0 = (float) r0
            float r19 = r19 / r0
        L_0x068c:
            boolean r0 = r7.A0j
            if (r0 == 0) goto L_0x07ba
            float r0 = r7.A06
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A07
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A04
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A05
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A02
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A03
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A0B
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A0C
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A00
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            float r0 = r7.A01
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 == 0) goto L_0x07b6
            r0 = 25
            byte[] r0 = new byte[r0]
            r18 = r0
            java.nio.ByteBuffer r9 = java.nio.ByteBuffer.wrap(r18)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            java.nio.ByteBuffer r9 = r9.order(r0)
            r9.put(r5)
            float r14 = r7.A06
            r0 = 1195593728(0x47435000, float:50000.0)
            float r14 = r14 * r0
            r13 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14 + r13
            int r0 = (int) r14
            short r0 = (short) r0
            r9.putShort(r0)
            float r0 = r7.A07
            X.Pxi.A1M(r9, r0)
            float r0 = r7.A04
            X.Pxi.A1M(r9, r0)
            float r0 = r7.A05
            X.Pxi.A1M(r9, r0)
            float r0 = r7.A02
            X.Pxi.A1M(r9, r0)
            float r0 = r7.A03
            X.Pxi.A1M(r9, r0)
            float r0 = r7.A0B
            X.Pxi.A1M(r9, r0)
            float r0 = r7.A0C
            X.Pxi.A1M(r9, r0)
            float r0 = r7.A00
            float r0 = r0 + r13
            int r0 = (int) r0
            short r0 = (short) r0
            r9.putShort(r0)
            float r0 = r7.A01
            float r0 = r0 + r13
            int r0 = (int) r0
            short r0 = (short) r0
            r9.putShort(r0)
            int r0 = r7.A0P
            short r0 = (short) r0
            r9.putShort(r0)
            int r0 = r7.A0Q
            short r0 = (short) r0
            r9.putShort(r0)
        L_0x072e:
            int r0 = r7.A0H
            r13 = r0
            int r0 = r7.A0G
            r9 = r0
            int r0 = r7.A0I
            com.google.android.exoplayer2.video.ColorInfo r17 = new com.google.android.exoplayer2.video.ColorInfo
            r15 = r13
            r14 = r18
            r13 = r17
            r13.<init>(r15, r9, r0, r14)
        L_0x0740:
            java.lang.String r0 = r7.A0g
            if (r0 == 0) goto L_0x0752
            java.util.Map r9 = A0s
            boolean r0 = r9.containsKey(r0)
            if (r0 == 0) goto L_0x0752
            java.lang.String r0 = r7.A0g
            int r10 = X.Pxg.A06(r0, r9)
        L_0x0752:
            int r0 = r7.A0T
            if (r0 != 0) goto L_0x0770
            float r0 = r7.A0A
            r13 = 0
            int r0 = java.lang.Float.compare(r0, r13)
            if (r0 != 0) goto L_0x0770
            float r9 = r7.A08
            int r0 = java.lang.Float.compare(r9, r13)
            if (r0 != 0) goto L_0x0770
            float r0 = r7.A09
            int r0 = java.lang.Float.compare(r0, r13)
            if (r0 != 0) goto L_0x078d
            r10 = 0
        L_0x0770:
            int r0 = r7.A0X
            r1.A0J = r0
            int r0 = r7.A0N
            r1.A08 = r0
            r0 = r19
            r1.A01 = r0
            r1.A0D = r10
            byte[] r0 = r7.A0n
            r1.A0W = r0
            int r0 = r7.A0V
            r1.A0G = r0
            r0 = r17
            r1.A0O = r0
            r9 = 2
            goto L_0x0615
        L_0x078d:
            r0 = 1119092736(0x42b40000, float:90.0)
            int r0 = java.lang.Float.compare(r9, r0)
            if (r0 != 0) goto L_0x0798
            r10 = 90
            goto L_0x0770
        L_0x0798:
            r0 = -1020002304(0xffffffffc3340000, float:-180.0)
            int r0 = java.lang.Float.compare(r9, r0)
            if (r0 == 0) goto L_0x07b3
            r0 = 1127481344(0x43340000, float:180.0)
            int r0 = java.lang.Float.compare(r9, r0)
            if (r0 == 0) goto L_0x07b3
            r0 = -1028390912(0xffffffffc2b40000, float:-90.0)
            int r0 = java.lang.Float.compare(r9, r0)
            if (r0 != 0) goto L_0x0770
            r10 = 270(0x10e, float:3.78E-43)
            goto L_0x0770
        L_0x07b3:
            r10 = 180(0xb4, float:2.52E-43)
            goto L_0x0770
        L_0x07b6:
            r18 = 0
            goto L_0x072e
        L_0x07ba:
            r17 = 0
            goto L_0x0740
        L_0x07bd:
            r10 = -1
            goto L_0x0676
        L_0x07c0:
            boolean r0 = r10.equals(r11)
            if (r0 != 0) goto L_0x0615
            r0 = r19
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0615
            r0 = r21
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0615
            r0 = r22
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0615
            r0 = r23
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0615
            r0 = r24
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0615
            java.lang.String r0 = "Unexpected MIME type."
            X.47p r0 = X.C2609347p.A00(r0, r3)
            throw r0
        L_0x07f5:
            int r1 = r2.A05
            r0 = 2
            if (r1 != r0) goto L_0x1043
            android.util.SparseArray r1 = r2.A0P
            int r0 = r2.A06
            java.lang.Object r8 = r1.get(r0)
            X.SG2 r8 = (X.SG2) r8
            X.4Xd r0 = r8.A0c
            r0.getClass()
            long r0 = r2.A0E
            r6 = 0
            int r3 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r3 <= 0) goto L_0x0830
            java.lang.String r1 = r8.A0e
            java.lang.String r0 = "A_OPUS"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0830
            X.4XV r6 = r2.A0p
            r0 = 8
            java.nio.ByteBuffer r3 = X.Pxg.A12(r0)
            long r0 = r2.A0E
            r3.putLong(r0)
            byte[] r1 = r3.array()
            int r0 = r1.length
            r6.A0I(r1, r0)
        L_0x0830:
            r1 = 0
            r21 = 0
        L_0x0833:
            int r0 = r2.A03
            if (r1 >= r0) goto L_0x0840
            int[] r0 = r2.A0c
            r0 = r0[r1]
            int r21 = r21 + r0
            int r1 = r1 + 1
            goto L_0x0833
        L_0x0840:
            r9 = 0
        L_0x0841:
            int r0 = r2.A03
            if (r9 >= r0) goto L_0x086c
            long r6 = r2.A0F
            int r0 = r8.A0J
            int r0 = r0 * r9
            int r0 = r0 / 1000
            long r0 = (long) r0
            long r0 = r0 + r6
            int r6 = r2.A02
            if (r9 != 0) goto L_0x0858
            boolean r3 = r2.A0U
            if (r3 != 0) goto L_0x0858
            r6 = r6 | 1
        L_0x0858:
            int[] r3 = r2.A0c
            r20 = r3[r9]
            int r21 = r21 - r20
            r17 = r8
            r18 = r2
            r19 = r6
            r22 = r0
            A03(r17, r18, r19, r20, r21, r22)
            int r9 = r9 + 1
            goto L_0x0841
        L_0x086c:
            r2.A05 = r5
            goto L_0x1043
        L_0x0870:
            int r0 = r6.A01
            r10 = 4
            if (r0 != 0) goto L_0x08e0
            X.SHE r1 = r6.A04
            r0 = r16
            long r0 = r1.A00(r0, r10, r4, r5)
            r7 = -2
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 != 0) goto L_0x08d4
            r0 = r16
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            r0.A01 = r5
        L_0x0889:
            byte[] r9 = r6.A06
            r0 = r16
            r0.E2F(r9, r5, r10)
            byte r13 = r9[r5]
            r3 = 0
        L_0x0893:
            long[] r0 = X.SHE.A03
            r12 = 8
            if (r3 >= r12) goto L_0x0904
            r14 = r0[r3]
            long r0 = (long) r13
            long r14 = r14 & r0
            r7 = 0
            int r2 = (r14 > r7 ? 1 : (r14 == r7 ? 0 : -1))
            int r3 = r3 + 1
            if (r2 == 0) goto L_0x0893
            r2 = -1
            if (r3 == r2) goto L_0x0904
            if (r3 > r10) goto L_0x0904
            r7 = 255(0xff, double:1.26E-321)
            long r0 = r0 & r7
            r2 = 1
        L_0x08ae:
            if (r2 >= r3) goto L_0x08b9
            long r0 = r0 << r12
            long r7 = X.Pxe.A0D(r9, r2)
            long r0 = r0 | r7
            int r2 = r2 + 1
            goto L_0x08ae
        L_0x08b9:
            int r2 = (int) r0
            r0 = 357149030(0x1549a966, float:4.072526E-26)
            if (r2 == r0) goto L_0x08ce
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r2 == r0) goto L_0x08ce
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r2 == r0) goto L_0x08ce
            r0 = 374648427(0x1654ae6b, float:1.718026E-25)
            if (r2 != r0) goto L_0x0904
        L_0x08ce:
            r0 = r16
            r0.Evk(r3)
            long r0 = (long) r2
        L_0x08d4:
            r7 = -1
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x10e6
            int r2 = (int) r0
            r6.A00 = r2
            r6.A01 = r4
            r0 = 1
        L_0x08e0:
            r9 = 2
            if (r0 != r4) goto L_0x08f1
            X.SHE r2 = r6.A04
            r1 = 8
            r0 = r16
            long r0 = r2.A00(r0, r1, r5, r4)
            r6.A02 = r0
            r6.A01 = r9
        L_0x08f1:
            X.Tao r7 = r6.A03
            int r8 = r6.A00
            switch(r8) {
                case 131: goto L_0x09cf;
                case 134: goto L_0x09cd;
                case 136: goto L_0x09cf;
                case 155: goto L_0x09cf;
                case 159: goto L_0x09cf;
                case 160: goto L_0x090a;
                case 161: goto L_0x0ac9;
                case 163: goto L_0x0ac9;
                case 165: goto L_0x0ac9;
                case 166: goto L_0x090a;
                case 174: goto L_0x090a;
                case 176: goto L_0x09cf;
                case 179: goto L_0x09cf;
                case 181: goto L_0x09cb;
                case 183: goto L_0x090a;
                case 186: goto L_0x09cf;
                case 187: goto L_0x090a;
                case 215: goto L_0x09cf;
                case 224: goto L_0x090a;
                case 225: goto L_0x090a;
                case 231: goto L_0x09cf;
                case 238: goto L_0x09cf;
                case 241: goto L_0x09cf;
                case 251: goto L_0x09cf;
                case 16868: goto L_0x090a;
                case 16871: goto L_0x09cf;
                case 16877: goto L_0x0ac9;
                case 16980: goto L_0x09cf;
                case 16981: goto L_0x0ac9;
                case 17026: goto L_0x09cd;
                case 17029: goto L_0x09cf;
                case 17143: goto L_0x09cf;
                case 17543: goto L_0x09c9;
                case 17545: goto L_0x09cb;
                case 17827: goto L_0x09c9;
                case 18401: goto L_0x09cf;
                case 18402: goto L_0x0ac9;
                case 18407: goto L_0x090a;
                case 18408: goto L_0x09cf;
                case 19899: goto L_0x090a;
                case 20529: goto L_0x09cf;
                case 20530: goto L_0x09cf;
                case 20532: goto L_0x090a;
                case 20533: goto L_0x090a;
                case 21358: goto L_0x09cd;
                case 21419: goto L_0x0ac9;
                case 21420: goto L_0x09cf;
                case 21432: goto L_0x09cf;
                case 21680: goto L_0x09cf;
                case 21682: goto L_0x09cf;
                case 21690: goto L_0x09cf;
                case 21930: goto L_0x09cf;
                case 21936: goto L_0x090a;
                case 21945: goto L_0x09cf;
                case 21946: goto L_0x09cf;
                case 21947: goto L_0x09cf;
                case 21948: goto L_0x09cf;
                case 21949: goto L_0x09cf;
                case 21968: goto L_0x090a;
                case 21969: goto L_0x09cb;
                case 21970: goto L_0x09cb;
                case 21971: goto L_0x09cb;
                case 21972: goto L_0x09cb;
                case 21973: goto L_0x09cb;
                case 21974: goto L_0x09cb;
                case 21975: goto L_0x09cb;
                case 21976: goto L_0x09cb;
                case 21977: goto L_0x09cb;
                case 21978: goto L_0x09cb;
                case 21998: goto L_0x09cf;
                case 22186: goto L_0x09cf;
                case 22203: goto L_0x09cf;
                case 25152: goto L_0x090a;
                case 25188: goto L_0x09cf;
                case 25506: goto L_0x0ac9;
                case 26568: goto L_0x090a;
                case 28032: goto L_0x090a;
                case 29555: goto L_0x090a;
                case 30113: goto L_0x090a;
                case 30114: goto L_0x09cf;
                case 30320: goto L_0x090a;
                case 30321: goto L_0x09cf;
                case 30322: goto L_0x0ac9;
                case 30323: goto L_0x09cb;
                case 30324: goto L_0x09cb;
                case 30325: goto L_0x09cb;
                case 2274716: goto L_0x09cd;
                case 2352003: goto L_0x09cf;
                case 2807729: goto L_0x09cf;
                case 290298740: goto L_0x090a;
                case 307544935: goto L_0x090a;
                case 357149030: goto L_0x090a;
                case 374648427: goto L_0x090a;
                case 408125543: goto L_0x090a;
                case 440786851: goto L_0x090a;
                case 475249515: goto L_0x090a;
                case 524531317: goto L_0x090a;
                default: goto L_0x08f8;
            }
        L_0x08f8:
            long r2 = r6.A02
            int r1 = (int) r2
            r0 = r16
            r0.Evk(r1)
            r6.A01 = r5
            goto L_0x0019
        L_0x0904:
            r0 = r16
            r0.Evk(r4)
            goto L_0x0889
        L_0x090a:
            r0 = r16
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r2 = r0.A02
            long r0 = r6.A02
            long r0 = r0 + r2
            X.RsZ r7 = new X.RsZ
            r7.<init>(r8, r0)
            r11.push(r7)
            X.Tao r0 = r6.A03
            int r1 = r6.A00
            long r9 = r6.A02
            X.SwN r0 = (X.C12527SwN) r0
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r11 = r0.A00
            X.4Sd r12 = r11.A0Q
            X.C256703wD.A01(r12)
            r0 = 160(0xa0, float:2.24E-43)
            if (r1 == r0) goto L_0x09c1
            r0 = 174(0xae, float:2.44E-43)
            if (r1 == r0) goto L_0x09b8
            r0 = 187(0xbb, float:2.62E-43)
            if (r1 == r0) goto L_0x09b4
            r0 = 19899(0x4dbb, float:2.7884E-41)
            r7 = -1
            if (r1 == r0) goto L_0x09ad
            r0 = 20533(0x5035, float:2.8773E-41)
            if (r1 == r0) goto L_0x09a5
            r0 = 21968(0x55d0, float:3.0784E-41)
            if (r1 == r0) goto L_0x099d
            r0 = 408125543(0x18538067, float:2.7335937E-24)
            if (r1 == r0) goto L_0x0985
            r0 = 475249515(0x1c53bb6b, float:7.0056276E-22)
            if (r1 == r0) goto L_0x0975
            r0 = 524531317(0x1f43b675, float:4.144378E-20)
            if (r1 != r0) goto L_0x0fa2
            boolean r0 = r11.A0b
            if (r0 != 0) goto L_0x0fa2
            boolean r0 = r11.A0r
            if (r0 == 0) goto L_0x0965
            long r0 = r11.A0H
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0965
            r11.A0Z = r4
            goto L_0x0fa2
        L_0x0965:
            long r2 = r11.A0J
            r0 = 0
            X.SwL r7 = new X.SwL
            r7.<init>(r2, r0)
            r12.EKx(r7)
            r11.A0b = r4
            goto L_0x0fa2
        L_0x0975:
            X.5zw r0 = new X.5zw
            r0.<init>()
            r11.A0T = r0
            X.5zw r0 = new X.5zw
            r0.<init>()
            r11.A0S = r0
            goto L_0x0fa2
        L_0x0985:
            long r0 = r11.A0M
            int r12 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r12 == 0) goto L_0x0997
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 == 0) goto L_0x0997
            r1 = 0
            java.lang.String r0 = "Multiple Segment elements not supported"
            X.47p r0 = X.C2609347p.A00(r0, r1)
            throw r0
        L_0x0997:
            r11.A0M = r2
            r11.A0N = r9
            goto L_0x0fa2
        L_0x099d:
            X.SG2 r0 = X.Pxh.A0X(r11, r0)
            r0.A0j = r4
            goto L_0x0fa2
        L_0x09a5:
            X.SG2 r0 = X.Pxh.A0X(r11, r0)
            r0.A0k = r4
            goto L_0x0fa2
        L_0x09ad:
            r0 = -1
            r11.A0C = r0
            r11.A0K = r7
            goto L_0x0fa2
        L_0x09b4:
            r11.A0a = r5
            goto L_0x0fa2
        L_0x09b8:
            X.SG2 r0 = new X.SG2
            r0.<init>()
            r11.A0R = r0
            goto L_0x0fa2
        L_0x09c1:
            r11.A0U = r5
            r0 = 0
            r11.A0E = r0
            goto L_0x0fa2
        L_0x09c9:
            r1 = 6
            goto L_0x09d0
        L_0x09cb:
            r1 = 5
            goto L_0x09d0
        L_0x09cd:
            r1 = 3
            goto L_0x09d0
        L_0x09cf:
            r1 = 2
        L_0x09d0:
            r11 = 0
            r14 = 8
            if (r1 == r9) goto L_0x0d64
            r0 = 3
            if (r1 == r0) goto L_0x0f75
            if (r1 == r10) goto L_0x0ac9
            r0 = 5
            if (r1 != r0) goto L_0x0abb
            long r0 = r6.A02
            r12 = 4
            int r2 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r2 == 0) goto L_0x09fe
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 == 0) goto L_0x09fe
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "Invalid float size: "
        L_0x09ef:
            r3.append(r2)
            r3.append(r0)
        L_0x09f5:
            java.lang.String r0 = r3.toString()
            X.47p r0 = X.C2609347p.A00(r0, r11)
            throw r0
        L_0x09fe:
            int r9 = (int) r0
            byte[] r12 = r6.A06
            r11 = 0
            r0 = r16
            r0.readFully(r12, r5, r9)
            r2 = 0
        L_0x0a09:
            if (r11 >= r9) goto L_0x0a17
            r0 = 8
            long r2 = r2 << r0
            byte r0 = r12[r11]
            r0 = r0 & 255(0xff, float:3.57E-43)
            long r0 = (long) r0
            long r2 = r2 | r0
            int r11 = r11 + 1
            goto L_0x0a09
        L_0x0a17:
            if (r9 != r10) goto L_0x0a33
            int r0 = (int) r2
            float r0 = java.lang.Float.intBitsToFloat(r0)
            double r0 = (double) r0
        L_0x0a1f:
            X.SwN r7 = (X.C12527SwN) r7
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r7 = r7.A00
            r2 = 181(0xb5, float:2.54E-43)
            if (r8 == r2) goto L_0x0ab2
            r2 = 17545(0x4489, float:2.4586E-41)
            if (r8 == r2) goto L_0x0aad
            switch(r8) {
                case 21969: goto L_0x0aa4;
                case 21970: goto L_0x0a9b;
                case 21971: goto L_0x0a92;
                case 21972: goto L_0x0a89;
                case 21973: goto L_0x0a80;
                case 21974: goto L_0x0a77;
                case 21975: goto L_0x0a6e;
                case 21976: goto L_0x0a65;
                case 21977: goto L_0x0a5c;
                case 21978: goto L_0x0a53;
                default: goto L_0x0a2e;
            }
        L_0x0a2e:
            switch(r8) {
                case 30323: goto L_0x0a4a;
                case 30324: goto L_0x0a41;
                case 30325: goto L_0x0a38;
                default: goto L_0x0a31;
            }
        L_0x0a31:
            goto L_0x0fa2
        L_0x0a33:
            double r0 = java.lang.Double.longBitsToDouble(r2)
            goto L_0x0a1f
        L_0x0a38:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A09 = r2
            goto L_0x0fa2
        L_0x0a41:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A08 = r2
            goto L_0x0fa2
        L_0x0a4a:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A0A = r2
            goto L_0x0fa2
        L_0x0a53:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A01 = r2
            goto L_0x0fa2
        L_0x0a5c:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A00 = r2
            goto L_0x0fa2
        L_0x0a65:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A0C = r2
            goto L_0x0fa2
        L_0x0a6e:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A0B = r2
            goto L_0x0fa2
        L_0x0a77:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A03 = r2
            goto L_0x0fa2
        L_0x0a80:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A02 = r2
            goto L_0x0fa2
        L_0x0a89:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A05 = r2
            goto L_0x0fa2
        L_0x0a92:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A04 = r2
            goto L_0x0fa2
        L_0x0a9b:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A07 = r2
            goto L_0x0fa2
        L_0x0aa4:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            float r2 = (float) r0
            r3.A06 = r2
            goto L_0x0fa2
        L_0x0aad:
            long r2 = (long) r0
            r7.A0I = r2
            goto L_0x0fa2
        L_0x0ab2:
            X.SG2 r3 = X.Pxh.A0X(r7, r2)
            int r2 = (int) r0
            r3.A0U = r2
            goto L_0x0fa2
        L_0x0abb:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Invalid element type "
            r3.append(r0)
            r3.append(r1)
            goto L_0x09f5
        L_0x0ac9:
            long r0 = r6.A02
            int r12 = (int) r0
            X.SwN r7 = (X.C12527SwN) r7
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r7 = r7.A00
            r1 = 161(0xa1, float:2.26E-43)
            r0 = 163(0xa3, float:2.28E-43)
            r24 = 0
            if (r8 == r1) goto L_0x0b87
            if (r8 == r0) goto L_0x0b87
            r0 = 165(0xa5, float:2.31E-43)
            if (r8 == r0) goto L_0x0b2c
            r0 = 16877(0x41ed, float:2.365E-41)
            if (r8 == r0) goto L_0x0b17
            r0 = 16981(0x4255, float:2.3795E-41)
            if (r8 == r0) goto L_0x0b0e
            r1 = 18402(0x47e2, float:2.5787E-41)
            if (r8 == r1) goto L_0x0b6c
            r0 = 21419(0x53ab, float:3.0014E-41)
            if (r8 == r0) goto L_0x0b50
            r0 = 25506(0x63a2, float:3.5742E-41)
            if (r8 == r0) goto L_0x0b05
            r0 = 30322(0x7672, float:4.249E-41)
            if (r8 != r0) goto L_0x10af
            X.SG2 r0 = X.Pxh.A0X(r7, r8)
            byte[] r1 = new byte[r12]
            r0.A0n = r1
        L_0x0afe:
            r0 = r16
            r0.readFully(r1, r5, r12)
            goto L_0x0fa2
        L_0x0b05:
            X.SG2 r0 = X.Pxh.A0X(r7, r8)
            byte[] r1 = new byte[r12]
            r0.A0l = r1
            goto L_0x0afe
        L_0x0b0e:
            X.SG2 r0 = X.Pxh.A0X(r7, r8)
            byte[] r1 = new byte[r12]
            r0.A0o = r1
            goto L_0x0afe
        L_0x0b17:
            X.SG2 r2 = X.Pxh.A0X(r7, r0)
            int r1 = r2.A0E
            r0 = 1685485123(0x64767643, float:1.8185683E22)
            if (r1 == r0) goto L_0x0b27
            r0 = 1685480259(0x64766343, float:1.8180206E22)
            if (r1 != r0) goto L_0x0b80
        L_0x0b27:
            byte[] r1 = new byte[r12]
            r2.A0m = r1
            goto L_0x0afe
        L_0x0b2c:
            int r0 = r7.A05
            if (r0 != r9) goto L_0x0fa2
            android.util.SparseArray r1 = r7.A0P
            int r0 = r7.A06
            java.lang.Object r1 = r1.get(r0)
            X.SG2 r1 = (X.SG2) r1
            int r0 = r7.A01
            if (r0 != r10) goto L_0x0b80
            java.lang.String r1 = r1.A0e
            java.lang.String r0 = "V_VP9"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0b80
            X.4XV r0 = r7.A0p
            r0.A0E(r12)
            byte[] r1 = r0.A02
            goto L_0x0afe
        L_0x0b50:
            X.4XV r3 = r7.A0n
            byte[] r0 = r3.A02
            java.util.Arrays.fill(r0, r5)
            byte[] r2 = r3.A02
            int r1 = 4 - r12
            r0 = r16
            r0.readFully(r2, r1, r12)
            r3.A0G(r5)
            long r0 = r3.A07()
            int r2 = (int) r0
            r7.A0C = r2
            goto L_0x0fa2
        L_0x0b6c:
            byte[] r2 = new byte[r12]
            r0 = r16
            r0.readFully(r2, r5, r12)
            X.SG2 r1 = X.Pxh.A0X(r7, r1)
            X.4Xh r0 = new X.4Xh
            r0.<init>(r4, r2, r5, r5)
            r1.A0b = r0
            goto L_0x0fa2
        L_0x0b80:
            r0 = r16
            r0.Evk(r12)
            goto L_0x0fa2
        L_0x0b87:
            int r0 = r7.A05
            r23 = 8
            if (r0 != 0) goto L_0x0bac
            X.SHE r3 = r7.A0g
            r1 = r23
            r0 = r16
            long r0 = r3.A00(r0, r1, r5, r4)
            int r2 = (int) r0
            r7.A06 = r2
            int r0 = r3.A00
            r7.A07 = r0
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7.A0D = r0
            r7.A05 = r4
            X.4XV r0 = r7.A0m
            r0.A0E(r5)
        L_0x0bac:
            android.util.SparseArray r1 = r7.A0P
            int r0 = r7.A06
            java.lang.Object r22 = r1.get(r0)
            r0 = r22
            X.SG2 r0 = (X.SG2) r0
            r22 = r0
            if (r0 != 0) goto L_0x0bc8
            int r0 = r7.A07
            int r12 = r12 - r0
            r0 = r16
            r0.Evk(r12)
        L_0x0bc4:
            r7.A05 = r5
            goto L_0x0fa2
        L_0x0bc8:
            X.4Xd r0 = r0.A0c
            r0.getClass()
            int r0 = r7.A05
            if (r0 != r4) goto L_0x0c22
            r15 = 3
            r0 = r16
            A02(r0, r7, r15)
            X.4XV r11 = r7.A0m
            byte[] r0 = r11.A02
            byte r0 = r0[r9]
            r3 = r0 & 6
            int r3 = r3 >> r4
            r14 = 255(0xff, float:3.57E-43)
            if (r3 != 0) goto L_0x0c61
            r7.A03 = r4
            int[] r1 = r7.A0c
            if (r1 != 0) goto L_0x0c57
            int[] r1 = new int[r4]
        L_0x0bec:
            r7.A0c = r1
            int r0 = r7.A07
            int r12 = r12 - r0
            int r12 = r12 - r15
            r1[r5] = r12
        L_0x0bf4:
            byte[] r0 = r11.A02
            byte r2 = r0[r5]
            int r2 = r2 << r23
            byte r0 = r0[r4]
            r0 = r0 & r14
            r2 = r2 | r0
            long r0 = r7.A0G
            long r2 = (long) r2
            long r2 = A01(r7, r2)
            long r0 = r0 + r2
            r7.A0F = r0
            r0 = r22
            int r0 = r0.A0W
            if (r0 == r9) goto L_0x0c1b
            r0 = 163(0xa3, float:2.28E-43)
            if (r8 != r0) goto L_0x0c55
            byte[] r0 = r11.A02
            byte r1 = r0[r9]
            r0 = 128(0x80, float:1.794E-43)
            r1 = r1 & r0
            if (r1 != r0) goto L_0x0c55
        L_0x0c1b:
            r0 = 1
        L_0x0c1c:
            r7.A02 = r0
            r7.A05 = r9
            r7.A04 = r5
        L_0x0c22:
            r0 = 163(0xa3, float:2.28E-43)
            if (r8 != r0) goto L_0x0d49
        L_0x0c26:
            int r1 = r7.A04
            int r0 = r7.A03
            if (r1 >= r0) goto L_0x0bc4
            int[] r0 = r7.A0c
            r2 = r0[r1]
            r1 = r16
            r0 = r22
            int r11 = A00(r1, r0, r7, r2)
            long r2 = r7.A0F
            int r1 = r7.A04
            int r0 = r0.A0J
            int r1 = r1 * r0
            int r0 = r1 / 1000
            long r0 = (long) r0
            long r0 = r0 + r2
            int r2 = r7.A02
            r8 = r22
            r9 = r7
            r10 = r2
            r12 = r5
            r13 = r0
            A03(r8, r9, r10, r11, r12, r13)
            int r0 = r7.A04
            int r0 = r0 + 1
            r7.A04 = r0
            goto L_0x0c26
        L_0x0c55:
            r0 = 0
            goto L_0x0c1c
        L_0x0c57:
            int r0 = r1.length
            if (r0 >= r4) goto L_0x0bec
            int r0 = java.lang.Math.max(r5, r4)
            int[] r1 = new int[r0]
            goto L_0x0bec
        L_0x0c61:
            r13 = 4
            r0 = r16
            A02(r0, r7, r10)
            byte[] r0 = r11.A02
            byte r0 = r0[r15]
            r0 = r0 & r14
            int r2 = r0 + 1
            r7.A03 = r2
            int[] r1 = r7.A0c
            if (r1 != 0) goto L_0x0c85
            int[] r1 = new int[r2]
        L_0x0c76:
            r7.A0c = r1
            r0 = r1
            if (r3 != r9) goto L_0x0c91
            int r0 = r7.A07
            int r12 = r12 - r0
            int r12 = r12 - r10
            int r12 = r12 / r2
            java.util.Arrays.fill(r1, r5, r2, r12)
            goto L_0x0bf4
        L_0x0c85:
            int r0 = r1.length
            if (r0 >= r2) goto L_0x0c76
            int r0 = r0 * 2
            int r0 = java.lang.Math.max(r0, r2)
            int[] r1 = new int[r0]
            goto L_0x0c76
        L_0x0c91:
            if (r3 != r4) goto L_0x0cc2
            r3 = 0
            r10 = 0
        L_0x0c95:
            int r2 = r7.A03
            int r1 = r2 + -1
            if (r3 >= r1) goto L_0x0cb8
            r0[r3] = r5
        L_0x0c9d:
            int r13 = r13 + 1
            r0 = r16
            A02(r0, r7, r13)
            byte[] r1 = r11.A02
            int r0 = r13 + -1
            byte r2 = r1[r0]
            r2 = r2 & r14
            int[] r0 = r7.A0c
            r1 = r0[r3]
            int r1 = r1 + r2
            r0[r3] = r1
            if (r2 == r14) goto L_0x0c9d
            int r10 = r10 + r1
            int r3 = r3 + 1
            goto L_0x0c95
        L_0x0cb8:
            int r2 = r2 - r4
            int r1 = r7.A07
            int r12 = r12 - r1
            int r12 = r12 - r13
            int r12 = r12 - r10
            r0[r2] = r12
            goto L_0x0bf4
        L_0x0cc2:
            if (r3 != r15) goto L_0x10bf
            r15 = 0
            r21 = 0
        L_0x0cc7:
            int r2 = r7.A03
            int r0 = r2 + -1
            if (r15 >= r0) goto L_0x0d3e
            r1[r15] = r5
            int r13 = r13 + 1
            r0 = r16
            A02(r0, r7, r13)
            byte[] r1 = r11.A02
            int r3 = r13 + -1
            byte r0 = r1[r3]
            if (r0 == 0) goto L_0x10bc
            r10 = 0
        L_0x0cdf:
            int r0 = 7 - r10
            int r2 = r4 << r0
            byte r0 = r1[r3]
            r0 = r0 & r2
            if (r0 == 0) goto L_0x0d09
            int r13 = r13 + r10
            r0 = r16
            A02(r0, r7, r13)
            byte[] r0 = r11.A02
            r20 = r0
            int r19 = r3 + 1
            byte r1 = r0[r3]
            r1 = r1 & r14
            r0 = r2 ^ -1
            r1 = r1 & r0
            long r2 = (long) r1
        L_0x0cfb:
            r1 = r19
            if (r1 >= r13) goto L_0x0d12
            long r2 = r2 << r23
            int r19 = r19 + 1
            byte r0 = r20[r1]
            r0 = r0 & r14
            long r0 = (long) r0
            long r2 = r2 | r0
            goto L_0x0cfb
        L_0x0d09:
            int r10 = r10 + 1
            r0 = r23
            if (r10 < r0) goto L_0x0cdf
            r2 = 0
            goto L_0x0d2d
        L_0x0d12:
            if (r15 <= 0) goto L_0x0d1f
            int r0 = r10 * 7
            int r0 = r0 + 6
            r17 = 1
            long r0 = r17 << r0
            long r0 = r0 - r17
            long r2 = r2 - r0
        L_0x0d1f:
            r17 = -2147483648(0xffffffff80000000, double:NaN)
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 < 0) goto L_0x10d0
            r17 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r0 > 0) goto L_0x10d0
        L_0x0d2d:
            int r0 = (int) r2
            int[] r1 = r7.A0c
            if (r15 == 0) goto L_0x0d37
            int r2 = r15 + -1
            r2 = r1[r2]
            int r0 = r0 + r2
        L_0x0d37:
            r1[r15] = r0
            int r21 = r21 + r0
            int r15 = r15 + 1
            goto L_0x0cc7
        L_0x0d3e:
            int r2 = r2 - r4
            int r0 = r7.A07
            int r12 = r12 - r0
            int r12 = r12 - r13
            int r12 = r12 - r21
            r1[r2] = r12
            goto L_0x0bf4
        L_0x0d49:
            int r8 = r7.A04
            int r0 = r7.A03
            if (r8 >= r0) goto L_0x0fa2
            int[] r3 = r7.A0c
            r2 = r3[r8]
            r1 = r16
            r0 = r22
            int r0 = A00(r1, r0, r7, r2)
            r3[r8] = r0
            int r0 = r7.A04
            int r0 = r0 + 1
            r7.A04 = r0
            goto L_0x0d49
        L_0x0d64:
            long r0 = r6.A02
            int r2 = (r0 > r14 ? 1 : (r0 == r14 ? 0 : -1))
            if (r2 > 0) goto L_0x0ff8
            int r10 = (int) r0
            byte[] r13 = r6.A06
            r12 = 0
            r0 = r16
            r0.readFully(r13, r5, r10)
            r0 = 0
        L_0x0d75:
            if (r12 >= r10) goto L_0x0d83
            r2 = 8
            long r0 = r0 << r2
            byte r2 = r13[r12]
            r2 = r2 & 255(0xff, float:3.57E-43)
            long r2 = (long) r2
            long r0 = r0 | r2
            int r12 = r12 + 1
            goto L_0x0d75
        L_0x0d83:
            X.SwN r7 = (X.C12527SwN) r7
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r7 = r7.A00
            r2 = 20529(0x5031, float:2.8767E-41)
            java.lang.String r10 = " not supported"
            if (r8 == r2) goto L_0x0f51
            r2 = 20530(0x5032, float:2.8769E-41)
            r13 = 1
            if (r8 == r2) goto L_0x0f46
            r12 = 0
            r3 = 3
            switch(r8) {
                case 131: goto L_0x0ef7;
                case 136: goto L_0x0eea;
                case 155: goto L_0x0e62;
                case 159: goto L_0x0ee1;
                case 176: goto L_0x0ed8;
                case 179: goto L_0x0f00;
                case 186: goto L_0x0ecf;
                case 215: goto L_0x0ec6;
                case 231: goto L_0x0e5a;
                case 238: goto L_0x0e55;
                case 241: goto L_0x0e42;
                case 251: goto L_0x0e3e;
                case 16871: goto L_0x0ebd;
                case 16980: goto L_0x0f5e;
                case 17029: goto L_0x0f34;
                case 17143: goto L_0x0f29;
                case 18401: goto L_0x0f1c;
                case 18408: goto L_0x0f11;
                case 21420: goto L_0x0e37;
                case 21432: goto L_0x0e11;
                case 21680: goto L_0x0eb4;
                case 21682: goto L_0x0eab;
                case 21690: goto L_0x0ea2;
                case 21930: goto L_0x0e95;
                case 21998: goto L_0x0e8c;
                case 22186: goto L_0x0e84;
                case 22203: goto L_0x0e7c;
                case 25188: goto L_0x0e73;
                case 30114: goto L_0x0e0d;
                case 30321: goto L_0x0de9;
                case 2352003: goto L_0x0e6a;
                case 2807729: goto L_0x0de5;
                default: goto L_0x0d98;
            }
        L_0x0d98:
            r10 = -1
            switch(r8) {
                case 21945: goto L_0x0dbf;
                case 21946: goto L_0x0daf;
                case 21947: goto L_0x0d9e;
                case 21948: goto L_0x0ddc;
                case 21949: goto L_0x0dd3;
                default: goto L_0x0d9c;
            }
        L_0x0d9c:
            goto L_0x0fa2
        L_0x0d9e:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            r3.A0j = r4
            int r2 = (int) r0
            int r0 = com.google.android.exoplayer2.video.ColorInfo.A00(r2)
            if (r0 == r10) goto L_0x0fa2
            r3.A0H = r0
            goto L_0x0fa2
        L_0x0daf:
            A04(r7, r8)
            int r2 = (int) r0
            int r1 = com.google.android.exoplayer2.video.ColorInfo.A01(r2)
            if (r1 == r10) goto L_0x0fa2
            X.SG2 r0 = r7.A0R
            r0.A0I = r1
            goto L_0x0fa2
        L_0x0dbf:
            A04(r7, r8)
            int r2 = (int) r0
            if (r2 == r4) goto L_0x0dcd
            if (r2 != r9) goto L_0x0fa2
            X.SG2 r0 = r7.A0R
            r0.A0G = r4
            goto L_0x0fa2
        L_0x0dcd:
            X.SG2 r0 = r7.A0R
            r0.A0G = r9
            goto L_0x0fa2
        L_0x0dd3:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0Q = r2
            goto L_0x0fa2
        L_0x0ddc:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0P = r2
            goto L_0x0fa2
        L_0x0de5:
            r7.A0O = r0
            goto L_0x0fa2
        L_0x0de9:
            A04(r7, r8)
            int r2 = (int) r0
            if (r2 == 0) goto L_0x0e07
            if (r2 == r4) goto L_0x0e01
            if (r2 == r9) goto L_0x0dfb
            if (r2 != r3) goto L_0x0fa2
            X.SG2 r0 = r7.A0R
            r0.A0T = r3
            goto L_0x0fa2
        L_0x0dfb:
            X.SG2 r0 = r7.A0R
            r0.A0T = r9
            goto L_0x0fa2
        L_0x0e01:
            X.SG2 r0 = r7.A0R
            r0.A0T = r4
            goto L_0x0fa2
        L_0x0e07:
            X.SG2 r0 = r7.A0R
            r0.A0T = r5
            goto L_0x0fa2
        L_0x0e0d:
            r7.A0E = r0
            goto L_0x0fa2
        L_0x0e11:
            int r2 = (int) r0
            A04(r7, r8)
            if (r2 == 0) goto L_0x0e31
            if (r2 == r4) goto L_0x0e2b
            if (r2 == r3) goto L_0x0e25
            r0 = 15
            if (r2 != r0) goto L_0x0fa2
            X.SG2 r0 = r7.A0R
            r0.A0V = r3
            goto L_0x0fa2
        L_0x0e25:
            X.SG2 r0 = r7.A0R
            r0.A0V = r4
            goto L_0x0fa2
        L_0x0e2b:
            X.SG2 r0 = r7.A0R
            r0.A0V = r9
            goto L_0x0fa2
        L_0x0e31:
            X.SG2 r0 = r7.A0R
            r0.A0V = r5
            goto L_0x0fa2
        L_0x0e37:
            long r2 = r7.A0M
            long r0 = r0 + r2
            r7.A0K = r0
            goto L_0x0fa2
        L_0x0e3e:
            r7.A0U = r4
            goto L_0x0fa2
        L_0x0e42:
            boolean r2 = r7.A0a
            if (r2 != 0) goto L_0x0fa2
            X.5zw r2 = r7.A0T
            if (r2 == 0) goto L_0x10d9
            X.5zw r2 = r7.A0S
            if (r2 == 0) goto L_0x10d9
            r2.A01(r0)
            r7.A0a = r4
            goto L_0x0fa2
        L_0x0e55:
            int r2 = (int) r0
            r7.A01 = r2
            goto L_0x0fa2
        L_0x0e5a:
            long r0 = A01(r7, r0)
            r7.A0G = r0
            goto L_0x0fa2
        L_0x0e62:
            long r0 = A01(r7, r0)
            r7.A0D = r0
            goto L_0x0fa2
        L_0x0e6a:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0J = r2
            goto L_0x0fa2
        L_0x0e73:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0D = r2
            goto L_0x0fa2
        L_0x0e7c:
            X.SG2 r2 = X.Pxh.A0X(r7, r8)
            r2.A0Z = r0
            goto L_0x0fa2
        L_0x0e84:
            X.SG2 r2 = X.Pxh.A0X(r7, r8)
            r2.A0Y = r0
            goto L_0x0fa2
        L_0x0e8c:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0O = r2
            goto L_0x0fa2
        L_0x0e95:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0e9e
            r12 = 1
        L_0x0e9e:
            r3.A0i = r12
            goto L_0x0fa2
        L_0x0ea2:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0K = r2
            goto L_0x0fa2
        L_0x0eab:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0L = r2
            goto L_0x0fa2
        L_0x0eb4:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0M = r2
            goto L_0x0fa2
        L_0x0ebd:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0E = r2
            goto L_0x0fa2
        L_0x0ec6:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0S = r2
            goto L_0x0fa2
        L_0x0ecf:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0N = r2
            goto L_0x0fa2
        L_0x0ed8:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0X = r2
            goto L_0x0fa2
        L_0x0ee1:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0F = r2
            goto L_0x0fa2
        L_0x0eea:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 != 0) goto L_0x0ef3
            r12 = 1
        L_0x0ef3:
            r3.A0h = r12
            goto L_0x0fa2
        L_0x0ef7:
            X.SG2 r3 = X.Pxh.A0X(r7, r8)
            int r2 = (int) r0
            r3.A0W = r2
            goto L_0x0fa2
        L_0x0f00:
            X.5zw r3 = r7.A0T
            if (r3 == 0) goto L_0x10d9
            X.5zw r2 = r7.A0S
            if (r2 == 0) goto L_0x10d9
            long r0 = A01(r7, r0)
            r3.A01(r0)
            goto L_0x0fa2
        L_0x0f11:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0fa2
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "AESSettingsCipherMode "
            goto L_0x0f6a
        L_0x0f1c:
            r7 = 5
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0fa2
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "ContentEncAlgo "
            goto L_0x0f6a
        L_0x0f29:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0fa2
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "EBMLReadVersion "
            goto L_0x0f6a
        L_0x0f34:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 < 0) goto L_0x0f3f
            r7 = 2
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 > 0) goto L_0x0f3f
            goto L_0x0fa2
        L_0x0f3f:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "DocTypeReadVersion "
            goto L_0x0f6a
        L_0x0f46:
            int r2 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0fa2
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "ContentEncodingScope "
            goto L_0x0f6a
        L_0x0f51:
            r7 = 0
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0fa2
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "ContentEncodingOrder "
            goto L_0x0f6a
        L_0x0f5e:
            r7 = 3
            int r2 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r2 == 0) goto L_0x0fa2
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "ContentCompAlgo "
        L_0x0f6a:
            r3.append(r2)
            r3.append(r0)
            r3.append(r10)
            goto L_0x09f5
        L_0x0f75:
            long r0 = r6.A02
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r2 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r2 > 0) goto L_0x0ff0
            int r3 = (int) r0
            if (r3 != 0) goto L_0x0fd9
            java.lang.String r1 = ""
        L_0x0f83:
            X.SwN r7 = (X.C12527SwN) r7
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r2 = r7.A00
            r0 = 134(0x86, float:1.88E-43)
            if (r8 == r0) goto L_0x0fd2
            r0 = 17026(0x4282, float:2.3859E-41)
            if (r8 == r0) goto L_0x0fad
            r0 = 17827(0x45a3, float:2.4981E-41)
            if (r8 == r0) goto L_0x0fa2
            r0 = 21358(0x536e, float:2.9929E-41)
            if (r8 == r0) goto L_0x0fa6
            r0 = 2274716(0x22b59c, float:3.187556E-39)
            if (r8 != r0) goto L_0x0fa2
            X.SG2 r0 = X.Pxh.A0X(r2, r0)
            r0.A0f = r1
        L_0x0fa2:
            r6.A01 = r5
            goto L_0x1043
        L_0x0fa6:
            X.SG2 r0 = X.Pxh.A0X(r2, r0)
            r0.A0g = r1
            goto L_0x0fa2
        L_0x0fad:
            java.lang.String r0 = "webm"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0fa2
            java.lang.String r0 = "matroska"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0fa2
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "DocType "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = " not supported"
            r3.append(r0)
            goto L_0x09f5
        L_0x0fd2:
            X.SG2 r0 = X.Pxh.A0X(r2, r0)
            r0.A0e = r1
            goto L_0x0fa2
        L_0x0fd9:
            byte[] r2 = new byte[r3]
            r0 = r16
            r0.readFully(r2, r5, r3)
        L_0x0fe0:
            if (r3 <= 0) goto L_0x0fea
            int r1 = r3 + -1
            byte r0 = r2[r1]
            if (r0 != 0) goto L_0x0fea
            r3 = r1
            goto L_0x0fe0
        L_0x0fea:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2, r5, r3)
            goto L_0x0f83
        L_0x0ff0:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "String element size: "
            goto L_0x09ef
        L_0x0ff8:
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "Invalid integer size: "
            goto L_0x09ef
        L_0x1000:
            long r0 = r2.A0M
            long r11 = r2.A0N
            long r0 = r0 + r11
            r11 = r8[r10]
            long r0 = r0 - r11
            int r11 = (int) r0
            r9[r10] = r11
            long r0 = r2.A0J
            r11 = r6[r10]
            long r0 = r0 - r11
            r7[r10] = r0
            r12 = 0
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 > 0) goto L_0x1033
            java.lang.String r11 = "Discarding last cue point with unexpected duration: "
            java.lang.String r1 = X.002.A0Q(r11, r0)
            java.lang.String r0 = "MatroskaExtractor"
            X.2AG.A04(r0, r1)
            int[] r9 = java.util.Arrays.copyOf(r9, r10)
            long[] r8 = java.util.Arrays.copyOf(r8, r10)
            long[] r7 = java.util.Arrays.copyOf(r7, r10)
            long[] r6 = java.util.Arrays.copyOf(r6, r10)
        L_0x1033:
            X.4YN r10 = new X.4YN
            r10.<init>(r9, r8, r7, r6)
        L_0x1038:
            r0 = r26
            r0.EKx(r10)
            r2.A0b = r4
        L_0x103f:
            r2.A0T = r3
            r2.A0S = r3
        L_0x1043:
            r0 = r16
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r1 = r0.A02
            r0 = r27
            boolean r0 = r0.A0Z
            r3 = r30
            if (r0 == 0) goto L_0x105e
            r0 = r27
            r0.A0L = r1
            long r0 = r0.A0H
            r3.A00 = r0
            r0 = r27
            r0.A0Z = r5
            return r4
        L_0x105e:
            r0 = r27
            boolean r0 = r0.A0b
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
        L_0x1075:
            java.lang.String r0 = "Encrypted Track found but ContentEncKeyID was not found"
            goto L_0x10aa
        L_0x1078:
            java.lang.String r0 = "Mandatory element SeekID or SeekPosition not found"
            goto L_0x10aa
        L_0x107b:
            java.lang.String r0 = "Error parsing MS/ACM codec private"
            goto L_0x10aa
        L_0x107e:
            X.47p r0 = X.C2609347p.A00(r1, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
        L_0x1083:
            X.47p r0 = X.C2609347p.A00(r1, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
        L_0x1088:
            X.47p r0 = X.C2609347p.A00(r1, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
        L_0x108d:
            X.47p r0 = X.C2609347p.A00(r1, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x1092 }
        L_0x1092:
            X.47p r0 = X.C2609347p.A00(r1, r3)
            throw r0
        L_0x1097:
            java.lang.String r0 = "Failed to find FourCC VC1 initialization data"
            X.47p r0 = X.C2609347p.A00(r0, r3)     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
            throw r0     // Catch:{ ArrayIndexOutOfBoundsException -> 0x109e }
        L_0x109e:
            java.lang.String r0 = "Error parsing FourCC private data"
            X.47p r0 = X.C2609347p.A00(r0, r3)
            throw r0
        L_0x10a5:
            java.lang.String r0 = "CodecId is missing in TrackEntry element"
            goto L_0x10aa
        L_0x10a8:
            java.lang.String r0 = "No valid tracks were found"
        L_0x10aa:
            X.47p r0 = X.C2609347p.A00(r0, r3)
            throw r0
        L_0x10af:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected id: "
            r1.append(r0)
            r1.append(r8)
            goto L_0x10cb
        L_0x10bc:
            java.lang.String r1 = "No valid varint length mask found"
            goto L_0x10d2
        L_0x10bf:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected lacing value: "
            r1.append(r0)
            r1.append(r3)
        L_0x10cb:
            java.lang.String r1 = r1.toString()
            goto L_0x10d2
        L_0x10d0:
            java.lang.String r1 = "EBML lacing sample size out of range."
        L_0x10d2:
            r0 = r24
            X.47p r0 = X.C2609347p.A00(r1, r0)
            throw r0
        L_0x10d9:
            java.lang.String r1 = "Element "
            java.lang.String r0 = " must be in a Cues"
            java.lang.String r0 = X.002.A0c(r1, r0, r8)
            X.47p r0 = X.C2609347p.A00(r0, r11)
            throw r0
        L_0x10e6:
            r0 = r27
            android.util.SparseArray r1 = r0.A0P
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x1109
            java.lang.Object r3 = r1.valueAt(r5)
            X.SG2 r3 = (X.SG2) r3
            X.4Xd r0 = r3.A0c
            r0.getClass()
            X.S6c r2 = r3.A0d
            if (r2 == 0) goto L_0x1106
            X.4Xd r1 = r3.A0c
            X.4Xh r0 = r3.A0b
            r2.A01(r0, r1)
        L_0x1106:
            int r5 = r5 + 1
            goto L_0x10e6
        L_0x1109:
            r4 = -1
            return r4
        L_0x110b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor.E68(X.4Y7, X.4Sh):int");
    }

    public MatroskaExtractor(int i) {
        C12528SwO swO = new C12528SwO();
        this.A0M = -1;
        this.A0O = -9223372036854775807L;
        this.A0I = -9223372036854775807L;
        this.A0J = -9223372036854775807L;
        this.A0H = -1;
        this.A0L = -1;
        this.A0G = -9223372036854775807L;
        this.A0f = swO;
        swO.A03 = new C12527SwN(this);
        this.A0r = AnonymousClass7TF.A1Q(i & 1);
        this.A0g = new SHE();
        this.A0P = Pxe.A0L();
        this.A0m = new AnonymousClass4XV(4);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(-1);
        this.A0q = new AnonymousClass4XV(allocate.array());
        this.A0n = new AnonymousClass4XV(4);
        this.A0k = new AnonymousClass4XV(AnonymousClass4XW.A01);
        this.A0j = new AnonymousClass4XV(4);
        this.A0l = new AnonymousClass4XV();
        this.A0o = new AnonymousClass4XV();
        this.A0h = new AnonymousClass4XV(8);
        this.A0i = new AnonymousClass4XV();
        this.A0p = new AnonymousClass4XV();
        this.A0c = new int[1];
    }

    public static int A00(AnonymousClass4Y7 r13, SG2 sg2, MatroskaExtractor matroskaExtractor, int i) {
        boolean z;
        int EJl;
        int EJl2;
        int i2;
        byte[] bArr;
        int i3 = i;
        SG2 sg22 = sg2;
        String str = sg2.A0e;
        MatroskaExtractor matroskaExtractor2 = matroskaExtractor;
        AnonymousClass4Y7 r9 = r13;
        if ("S_TEXT/UTF8".equals(str)) {
            bArr = A0w;
        } else if ("S_TEXT/ASS".equals(str)) {
            bArr = A0v;
        } else if ("S_TEXT/WEBVTT".equals(str)) {
            bArr = A0x;
        } else {
            C265994Xd r6 = sg2.A0c;
            boolean z2 = true;
            z = false;
            if (!matroskaExtractor.A0V) {
                if (sg2.A0k) {
                    matroskaExtractor.A02 &= -1073741825;
                    int i4 = 128;
                    if (!matroskaExtractor.A0Y) {
                        AnonymousClass4XV r10 = matroskaExtractor.A0m;
                        r13.readFully(r10.A02, 0, 1);
                        matroskaExtractor.A08++;
                        byte b = r10.A02[0];
                        if ((b & 128) != 128) {
                            matroskaExtractor.A00 = b;
                            matroskaExtractor.A0Y = true;
                        } else {
                            throw C2609347p.A00("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    byte b2 = matroskaExtractor.A00;
                    if ((b2 & 1) == 1) {
                        boolean A1S = AnonymousClass7TF.A1S(b2 & 2, 2);
                        matroskaExtractor2.A02 |= SN3.MAX_SIGNED_POWER_OF_TWO;
                        if (!matroskaExtractor2.A0W) {
                            AnonymousClass4XV r12 = matroskaExtractor2.A0h;
                            r13.readFully(r12.A02, 0, 8);
                            matroskaExtractor2.A08 += 8;
                            matroskaExtractor2.A0W = true;
                            AnonymousClass4XV r132 = matroskaExtractor2.A0m;
                            byte[] bArr2 = r132.A02;
                            if (!A1S) {
                                i4 = 0;
                            }
                            bArr2[0] = (byte) (i4 | 8);
                            r132.A0G(0);
                            r6.EJi(r132, 1, 1);
                            matroskaExtractor2.A09++;
                            r12.A0G(0);
                            r6.EJi(r12, 8, 1);
                            matroskaExtractor2.A09 += 8;
                        }
                        if (A1S) {
                            if (!matroskaExtractor2.A0X) {
                                AnonymousClass4XV r102 = matroskaExtractor2.A0m;
                                r9.readFully(r102.A02, 0, 1);
                                matroskaExtractor2.A08++;
                                r102.A0G(0);
                                matroskaExtractor2.A0B = r102.A02();
                                matroskaExtractor2.A0X = true;
                            }
                            int i5 = matroskaExtractor2.A0B * 4;
                            AnonymousClass4XV r14 = matroskaExtractor2.A0m;
                            r14.A0E(i5);
                            r9.readFully(r14.A02, 0, i5);
                            matroskaExtractor2.A08 += i5;
                            short s = (short) ((matroskaExtractor2.A0B / 2) + 1);
                            int i6 = (s * 6) + 2;
                            ByteBuffer byteBuffer = matroskaExtractor2.A0d;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                matroskaExtractor2.A0d = ByteBuffer.allocate(i6);
                            }
                            matroskaExtractor2.A0d.position(0);
                            matroskaExtractor2.A0d.putShort(s);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i2 = matroskaExtractor2.A0B;
                                if (i7 >= i2) {
                                    break;
                                }
                                int A042 = r14.A04();
                                int i9 = i7 % 2;
                                ByteBuffer byteBuffer2 = matroskaExtractor2.A0d;
                                int i10 = A042 - i8;
                                if (i9 == 0) {
                                    byteBuffer2.putShort((short) i10);
                                } else {
                                    byteBuffer2.putInt(i10);
                                }
                                i7++;
                                i8 = A042;
                            }
                            int i11 = (i3 - matroskaExtractor2.A08) - i8;
                            int i12 = i2 % 2;
                            ByteBuffer byteBuffer3 = matroskaExtractor2.A0d;
                            if (i12 == 1) {
                                byteBuffer3.putInt(i11);
                            } else {
                                byteBuffer3.putShort((short) i11);
                                matroskaExtractor2.A0d.putInt(0);
                            }
                            AnonymousClass4XV r103 = matroskaExtractor2.A0i;
                            r103.A0I(matroskaExtractor2.A0d.array(), i6);
                            r6.EJi(r103, i6, 1);
                            matroskaExtractor2.A09 += i6;
                        }
                    }
                } else {
                    byte[] bArr3 = sg2.A0o;
                    if (bArr3 != null) {
                        matroskaExtractor.A0l.A0I(bArr3, bArr3.length);
                    }
                }
                if (sg22.A0O > 0) {
                    matroskaExtractor2.A02 |= 268435456;
                    matroskaExtractor2.A0p.A0E(0);
                    int i13 = (matroskaExtractor2.A0l.A00 + i3) - matroskaExtractor2.A08;
                    AnonymousClass4XV r11 = matroskaExtractor2.A0m;
                    r11.A0E(4);
                    byte[] bArr4 = r11.A02;
                    Pxe.A1H(i13 >> 24, bArr4, 0);
                    Pxe.A1H(i13 >> 16, bArr4, 1);
                    Pxe.A1H(i13 >> 8, bArr4, 2);
                    Pxe.A1H(i13, bArr4, 3);
                    r6.EJi(r11, 4, 2);
                    matroskaExtractor2.A09 += 4;
                }
                matroskaExtractor2.A0V = true;
            }
            AnonymousClass4XV r104 = matroskaExtractor2.A0l;
            int i14 = r104.A00;
            int i15 = i3 + i14;
            String str2 = sg22.A0e;
            if (!"V_MPEG4/ISO/AVC".equals(str2) && !"V_MPEGH/ISO/HEVC".equals(str2)) {
                C11025S6c s6c = sg22.A0d;
                if (s6c != null) {
                    if (i14 != 0) {
                        z2 = false;
                    }
                    C256703wD.A04(z2);
                    s6c.A00(r9);
                }
                while (true) {
                    int i16 = matroskaExtractor2.A08;
                    if (i16 >= i15) {
                        break;
                    }
                    int i17 = i15 - i16;
                    int i18 = r104.A00 - r104.A01;
                    if (i18 > 0) {
                        EJl2 = Math.min(i17, i18);
                        r6.EJh(r104, EJl2);
                    } else {
                        EJl2 = r6.EJl(r9, i17, 0, false);
                    }
                    matroskaExtractor2.A08 += EJl2;
                    matroskaExtractor2.A09 += EJl2;
                }
            } else {
                AnonymousClass4XV r133 = matroskaExtractor2.A0j;
                byte[] bArr5 = r133.A02;
                bArr5[0] = 0;
                bArr5[1] = 0;
                bArr5[2] = 0;
                int i19 = sg22.A0R;
                int i20 = 4 - i19;
                while (matroskaExtractor2.A08 < i15) {
                    int i21 = matroskaExtractor2.A0A;
                    int i22 = r104.A00;
                    int i23 = r104.A01;
                    if (i21 == 0) {
                        int A043 = Pxh.A04(i22, i23, i19);
                        r9.readFully(bArr5, i20 + A043, i19 - A043);
                        if (A043 > 0) {
                            r104.A0J(bArr5, i20, A043);
                        }
                        matroskaExtractor2.A08 += i19;
                        r133.A0G(0);
                        matroskaExtractor2.A0A = r133.A04();
                        AnonymousClass4XV r0 = matroskaExtractor2.A0k;
                        r0.A0G(0);
                        r6.EJh(r0, 4);
                        matroskaExtractor2.A09 += 4;
                    } else {
                        int i24 = i22 - i23;
                        if (i24 > 0) {
                            EJl = Math.min(i21, i24);
                            r6.EJh(r104, EJl);
                        } else {
                            EJl = r6.EJl(r9, i21, 0, false);
                        }
                        matroskaExtractor2.A08 += EJl;
                        matroskaExtractor2.A09 += EJl;
                        matroskaExtractor2.A0A -= EJl;
                    }
                }
            }
            if ("A_VORBIS".equals(sg22.A0e)) {
                AnonymousClass4XV r02 = matroskaExtractor2.A0q;
                r02.A0G(0);
                r6.EJh(r02, 4);
                matroskaExtractor2.A09 += 4;
            }
            int i25 = matroskaExtractor2.A09;
            matroskaExtractor2.A08 = z ? 1 : 0;
            matroskaExtractor2.A09 = z;
            matroskaExtractor2.A0A = z;
            matroskaExtractor2.A0V = z;
            matroskaExtractor2.A0Y = z;
            matroskaExtractor2.A0X = z;
            matroskaExtractor2.A0B = z;
            matroskaExtractor2.A00 = z ? (byte) 1 : 0;
            matroskaExtractor2.A0W = z;
            matroskaExtractor2.A0l.A0E(z);
            return i25;
        }
        int length = bArr.length;
        int i26 = length + i;
        AnonymousClass4XV r2 = matroskaExtractor.A0o;
        byte[] bArr6 = r2.A02;
        z = false;
        if (bArr6.length < i26) {
            byte[] copyOf = Arrays.copyOf(bArr, i26 + i);
            r2.A0I(copyOf, copyOf.length);
        } else {
            System.arraycopy(bArr, 0, bArr6, 0, length);
        }
        r13.readFully(r2.A02, length, i3);
        r2.A0G(0);
        r2.A0F(i26);
        int i252 = matroskaExtractor2.A09;
        matroskaExtractor2.A08 = z ? 1 : 0;
        matroskaExtractor2.A09 = z;
        matroskaExtractor2.A0A = z;
        matroskaExtractor2.A0V = z;
        matroskaExtractor2.A0Y = z;
        matroskaExtractor2.A0X = z;
        matroskaExtractor2.A0B = z;
        matroskaExtractor2.A00 = z ? (byte) 1 : 0;
        matroskaExtractor2.A0W = z;
        matroskaExtractor2.A0l.A0E(z);
        return i252;
    }

    public static long A01(MatroskaExtractor matroskaExtractor, long j) {
        long j2 = matroskaExtractor.A0O;
        if (j2 != -9223372036854775807L) {
            return Util.A09(j, j2, 1000);
        }
        throw C2609347p.A00("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    public static void A02(AnonymousClass4Y7 r4, MatroskaExtractor matroskaExtractor, int i) {
        int max;
        AnonymousClass4XV r3 = matroskaExtractor.A0m;
        if (r3.A00 < i) {
            byte[] bArr = r3.A02;
            int length = bArr.length;
            if (length < i && (max = Math.max(length * 2, i)) > length) {
                bArr = Arrays.copyOf(bArr, max);
                r3.A02 = bArr;
            }
            int i2 = r3.A00;
            r4.readFully(bArr, i2, i - i2);
            r3.A0F(i);
        }
    }

    public static void A04(MatroskaExtractor matroskaExtractor, int i) {
        if (matroskaExtractor.A0R == null) {
            throw C2609347p.A00(002.A0c("Element ", " must be in a TrackEntry", i), (Throwable) null);
        }
    }

    public final void CMc(C265004Sd r1) {
        this.A0Q = r1;
    }

    public final boolean Evy(AnonymousClass4Y7 r22) {
        AnonymousClass4XV r9 = new AnonymousClass4XV(8);
        AnonymousClass4Y7 r10 = r22;
        AnonymousClass4Y6 r11 = (AnonymousClass4Y6) r10;
        long j = r11.A04;
        long j2 = 1024;
        if (j != -1 && j <= 1024) {
            j2 = j;
        }
        int i = (int) j2;
        r10.E2F(r9.A02, 0, 4);
        int i2 = 4;
        for (long A072 = r9.A07(); A072 != 440786851; A072 = ((A072 << 8) & -256) | ((long) (r9.A02[0] & 255))) {
            i2++;
            if (i2 == i) {
                return false;
            }
            r10.E2F(r9.A02, 0, 1);
        }
        int i3 = 0;
        r10.E2F(r9.A02, 0, 1);
        byte[] bArr = r9.A02;
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
        r10.E2F(bArr, 1, i5);
        while (i3 < i5) {
            i3++;
            i6 = (r9.A02[i3] & 255) + (i6 << 8);
        }
        int i7 = i2 + i5 + 1;
        long j3 = (long) i6;
        long j4 = (long) i7;
        if (j3 == Long.MIN_VALUE) {
            return false;
        }
        if (j != -1 && j4 + j3 >= j) {
            return false;
        }
        while (true) {
            long j5 = (long) i7;
            long j6 = j4 + j3;
            if (j5 < j6) {
                int i8 = 0;
                r10.E2F(r9.A02, 0, 1);
                byte[] bArr2 = r9.A02;
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
                r10.E2F(bArr2, 1, i10);
                while (i8 < i10) {
                    i8++;
                    i11 = (r9.A02[i8] & 255) + (i11 << 8);
                }
                int i12 = i7 + i10 + 1;
                if (((long) i11) == Long.MIN_VALUE) {
                    return false;
                }
                int i13 = 0;
                r10.E2F(r9.A02, 0, 1);
                byte[] bArr3 = r9.A02;
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
                r10.E2F(bArr3, 1, i15);
                while (i13 < i15) {
                    i13++;
                    i16 = (r9.A02[i13] & 255) + (i16 << 8);
                }
                i7 = i12 + i15 + 1;
                long j7 = (long) i16;
                if (j7 < 0 || j7 > 2147483647L) {
                    return false;
                }
                if (j7 != 0) {
                    int i17 = (int) j7;
                    r11.A02(i17, false);
                    i7 += i17;
                }
            } else if (j5 == j6) {
                return true;
            } else {
                return false;
            }
        }
    }

    public final void EKu(long j, long j2) {
        this.A0G = -9223372036854775807L;
        int i = 0;
        this.A05 = 0;
        C12528SwO swO = (C12528SwO) this.A0f;
        swO.A01 = 0;
        swO.A05.clear();
        SHE she = swO.A04;
        she.A01 = 0;
        she.A00 = 0;
        SHE she2 = this.A0g;
        she2.A01 = 0;
        she2.A00 = 0;
        this.A08 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0V = false;
        this.A0Y = false;
        this.A0X = false;
        this.A0B = 0;
        this.A00 = 0;
        this.A0W = false;
        this.A0l.A0E(0);
        while (true) {
            SparseArray sparseArray = this.A0P;
            if (i < sparseArray.size()) {
                C11025S6c s6c = ((SG2) sparseArray.valueAt(i)).A0d;
                if (s6c != null) {
                    s6c.A01 = false;
                    s6c.A00 = 0;
                }
                i++;
            } else {
                return;
            }
        }
    }

    public MatroskaExtractor() {
        this(0);
    }
}
