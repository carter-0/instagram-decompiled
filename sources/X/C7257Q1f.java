package X;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.webrtc.HardwareVideoEncoder;

/* renamed from: X.Q1f  reason: case insensitive filesystem */
public final class C7257Q1f {
    public static final List A01;
    public static final Map A02;
    public static final Set A03;
    public static final Set A04;
    public SMQ A00 = SMQ.A00;

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.Q17 A00(android.media.MediaCodec r14, android.media.MediaFormat r15, android.view.Surface r16, X.C7334Q4k r17) {
        /*
            r8 = r14
            r5 = r17
            java.lang.String r1 = r14.getName()
            java.lang.String r0 = "OMX.Exynos.avc.dec"
            boolean r0 = r1.equals(r0)
            r6 = r15
            if (r0 == 0) goto L_0x001b
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 31
            if (r1 < r0) goto L_0x001b
            java.lang.String r0 = "color-range"
            r15.removeKey(r0)
        L_0x001b:
            r7 = 1
            boolean r4 = r5 instanceof X.C7967QeF
            if (r4 == 0) goto L_0x0038
            r0 = r5
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326708835530678(0x810ef3000037b6, double:3.036495171280604E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "priority"
            r15.setInteger(r0, r7)
        L_0x0038:
            r14.getName()     // Catch:{ IllegalStateException -> 0x00ca }
            r9 = 0
            r14 = 0
            r15 = -1826708405(0xffffffff931ea44b, float:-2.0023406E-27)
            r13 = r16
            r10 = r8
            r11 = r9
            r12 = r6
            X.0fX.A07(r10, r11, r12, r13, r14, r15)     // Catch:{ IllegalStateException -> 0x00ca }
            java.util.Locale r2 = java.util.Locale.US     // Catch:{ all -> 0x005a }
            java.lang.String r1 = "media codec:%s, format:%s"
            java.lang.String r0 = A03(r8, r6)     // Catch:{ all -> 0x005a }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r6}     // Catch:{ all -> 0x005a }
            java.lang.String r11 = java.lang.String.format(r2, r1, r0)     // Catch:{ all -> 0x005a }
            goto L_0x005c
        L_0x005a:
            java.lang.String r11 = ""
        L_0x005c:
            boolean r14 = X.AnonymousClass7TF.A1V(r13)
            boolean r6 = r5 instanceof X.C7964QeC
            if (r6 == 0) goto L_0x00c8
            r1 = r5
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x00c8
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r15 = r0.A0M
        L_0x0073:
            if (r6 == 0) goto L_0x00b3
            r1 = r5
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x00c6
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r2 = r0.A1A
        L_0x0084:
            if (r6 == 0) goto L_0x009e
            X.QeC r5 = (X.C7964QeC) r5
            int r0 = r5.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x00b0
            java.lang.Object r0 = r5.A01
            X.SJN r0 = (X.SJN) r0
            long r12 = r0.A07
        L_0x0094:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.Q17 r7 = new X.Q17
            r16 = r2
            r7.<init>(r8, r9, r10, r11, r12, r14, r15, r16)
            return r7
        L_0x009e:
            if (r4 == 0) goto L_0x00b0
            X.QeF r5 = (X.C7967QeF) r5
            com.instagram.common.session.UserSession r4 = r5.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36598146474773619(0x8205d200110c73, double:3.2081534273294833E-306)
            long r12 = X.182.A01(r3, r4, r0)
            goto L_0x0094
        L_0x00b0:
            r12 = 10
            goto L_0x0094
        L_0x00b3:
            if (r4 == 0) goto L_0x00c6
            r0 = r5
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316671498130010(0x8105d20012125a, double:3.030147518691308E-306)
            boolean r2 = X.182.A06(r2, r3, r0)
            goto L_0x0084
        L_0x00c6:
            r2 = 0
            goto L_0x0084
        L_0x00c8:
            r15 = 0
            goto L_0x0073
        L_0x00ca:
            r2 = move-exception
            java.lang.String r1 = "codec name:"
            java.lang.String r0 = r8.getName()
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.IllegalStateException r0 = X.Pxe.A0j(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7257Q1f.A00(android.media.MediaCodec, android.media.MediaFormat, android.view.Surface, X.Q4k):X.Q17");
    }

    /* JADX WARNING: Removed duplicated region for block: B:61:0x016c A[SYNTHETIC, Splitter:B:61:0x016c] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.Q17 A02(android.media.MediaFormat r22, X.RDj r23, X.C7334Q4k r24, java.lang.String r25, java.lang.String r26) {
        /*
            r6 = r24
            java.lang.String r0 = "video/avc"
            r7 = r25
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "video/hevc"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "video/av01"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "audio/mp4a"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = "Unsupported codec for "
            java.lang.String r0 = X.002.A0R(r0, r7)
            X.Qe1 r1 = new X.Qe1
            r1.<init>(r0)
            throw r1
        L_0x003b:
            r2 = 0
            r0 = -2068293139(0xffffffff84b859ed, float:-4.3340776E-36)
            r3 = r22
            r15 = r23
            android.media.MediaCodec r2 = X.0fX.A02(r7, r0)     // Catch:{ Exception -> 0x0197 }
            X.RDj r10 = X.RDj.SURFACE     // Catch:{ Exception -> 0x0197 }
            r9 = 0
            r8 = 1
            r18 = 0
            if (r24 == 0) goto L_0x00bd
            boolean r0 = r6 instanceof X.C7967QeF     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x00bd
            r0 = r6
            X.QeF r0 = (X.C7967QeF) r0     // Catch:{ Exception -> 0x0197 }
            X.0qQ.A0B(r2, r9)     // Catch:{ Exception -> 0x0197 }
            com.instagram.common.session.UserSession r11 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.0Tu r0 = X.0Tu.A06     // Catch:{ Exception -> 0x0197 }
            r4 = 36600959677370435(0x82086100021043, double:3.2099325079795674E-306)
            long r16 = X.182.A01(r0, r11, r4)     // Catch:{ Exception -> 0x0197 }
            r12 = -1
            int r0 = (r16 > r12 ? 1 : (r16 == r12 ? 0 : -1))
            if (r0 > 0) goto L_0x007f
            android.util.Range r0 = X.C7967QeF.A01(r2, r3)     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x00bd
            X.0Tu r12 = X.0Tu.A05     // Catch:{ Exception -> 0x0197 }
            r0 = 36319484700532158(0x81086100001dbe, double:3.031926599218283E-306)
            boolean r0 = X.182.A06(r12, r11, r0)     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x00bd
        L_0x007f:
            r14 = 0
            X.0Tu r12 = X.0Tu.A05     // Catch:{ Exception -> 0x0197 }
            int r1 = X.DbS.A04(r12, r11, r4)     // Catch:{ Exception -> 0x0197 }
            r0 = -1
            if (r1 > r0) goto L_0x00b8
            android.util.Range r13 = X.C7967QeF.A01(r2, r3)     // Catch:{ Exception -> 0x0197 }
            if (r13 == 0) goto L_0x00b7
            r0 = 37163909630722351(0x8408610001012f, double:3.565944325296833E-306)
            double r11 = X.182.A00(r12, r11, r0)     // Catch:{ Exception -> 0x0197 }
            java.lang.Comparable r0 = r13.getLower()     // Catch:{ Exception -> 0x0197 }
            double r4 = X.JTO.A00(r0)     // Catch:{ Exception -> 0x0197 }
            int r1 = X.Pxg.A03(r13)     // Catch:{ Exception -> 0x0197 }
            java.lang.Comparable r0 = r13.getLower()     // Catch:{ Exception -> 0x0197 }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x0197 }
            int r0 = X.AnonymousClass7TE.A0M(r0)     // Catch:{ Exception -> 0x0197 }
            int r1 = r1 - r0
            double r0 = (double) r1     // Catch:{ Exception -> 0x0197 }
            double r0 = r0 * r11
            double r4 = r4 + r0
            int r14 = X.AnonymousClass1GB.A00(r4)     // Catch:{ Exception -> 0x0197 }
        L_0x00b7:
            r1 = r14
        L_0x00b8:
            java.lang.String r0 = "complexity"
            r3.setInteger(r0, r1)     // Catch:{ Exception -> 0x0197 }
        L_0x00bd:
            java.lang.String r1 = r2.getName()     // Catch:{ Exception -> 0x0197 }
            java.lang.String r0 = "c2.google.av1.encoder"
            boolean r0 = r0.equals(r1)     // Catch:{ Exception -> 0x0197 }
            java.lang.String r4 = "priority"
            if (r0 == 0) goto L_0x0114
            r6.getClass()     // Catch:{ Exception -> 0x0197 }
            boolean r5 = r6 instanceof X.C7967QeF     // Catch:{ Exception -> 0x0197 }
            if (r5 == 0) goto L_0x00ec
            r0 = r6
            X.QeF r0 = (X.C7967QeF) r0     // Catch:{ Exception -> 0x0197 }
            com.instagram.common.session.UserSession r12 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.0Tu r11 = X.0Tu.A05     // Catch:{ Exception -> 0x0197 }
            r0 = 36601582447694071(0x8208f2000310f7, double:3.2103263504399296E-306)
            int r1 = X.DbS.A04(r11, r12, r0)     // Catch:{ Exception -> 0x0197 }
            r0 = -1
            if (r1 == r0) goto L_0x00ec
            java.lang.String r0 = "vendor.google-av1enc.encoding-preset.int32.value"
            r3.setInteger(r0, r1)     // Catch:{ Exception -> 0x0197 }
        L_0x00ec:
            java.lang.String r12 = "bitrate"
            int r11 = r3.getInteger(r12)     // Catch:{ Exception -> 0x0197 }
            if (r5 == 0) goto L_0x0111
            r0 = r6
            X.QeF r0 = (X.C7967QeF) r0     // Catch:{ Exception -> 0x0197 }
            com.instagram.common.session.UserSession r14 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.0Tu r13 = X.0Tu.A05     // Catch:{ Exception -> 0x0197 }
            r0 = 37164532401176909(0x8408f20004014d, double:3.566338167839991E-306)
            double r0 = X.182.A00(r13, r14, r0)     // Catch:{ Exception -> 0x0197 }
            float r13 = (float) r0     // Catch:{ Exception -> 0x0197 }
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0111
            float r0 = (float) r11     // Catch:{ Exception -> 0x0197 }
            float r0 = r0 * r13
            int r0 = (int) r0     // Catch:{ Exception -> 0x0197 }
            r3.setInteger(r12, r0)     // Catch:{ Exception -> 0x0197 }
        L_0x0111:
            if (r5 == 0) goto L_0x012c
            goto L_0x0117
        L_0x0114:
            if (r24 == 0) goto L_0x0145
            goto L_0x012c
        L_0x0117:
            r0 = r6
            X.QeF r0 = (X.C7967QeF) r0     // Catch:{ Exception -> 0x0197 }
            com.instagram.common.session.UserSession r11 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.0Tu r5 = X.0Tu.A05     // Catch:{ Exception -> 0x0197 }
            r0 = 36320107471118304(0x8108f200051fe0, double:3.032320441844658E-306)
            boolean r0 = X.182.A06(r5, r11, r0)     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x012c
            r3.setInteger(r4, r8)     // Catch:{ Exception -> 0x0197 }
        L_0x012c:
            boolean r0 = r6 instanceof X.C7967QeF     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0145
            r0 = r6
            X.QeF r0 = (X.C7967QeF) r0     // Catch:{ Exception -> 0x0197 }
            com.instagram.common.session.UserSession r11 = r0.A00     // Catch:{ Exception -> 0x0197 }
            X.0Tu r5 = X.0Tu.A05     // Catch:{ Exception -> 0x0197 }
            r0 = 36326708835596215(0x810ef3000137b7, double:3.03649517132205E-306)
            boolean r0 = X.182.A06(r5, r11, r0)     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0145
            r3.setInteger(r4, r8)     // Catch:{ Exception -> 0x0197 }
        L_0x0145:
            r2.getName()     // Catch:{ Exception -> 0x0197 }
            r22 = -382843607(0xffffffffe92e4529, float:-1.3167481E25)
            r17 = r2
            r19 = r3
            r20 = r18
            r21 = r8
            X.0fX.A07(r17, r18, r19, r20, r21, r22)     // Catch:{ Exception -> 0x0197 }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x0168 }
            java.lang.String r1 = "media codec:%s, format:%s, input type:%s"
            java.lang.String r0 = A03(r2, r3)     // Catch:{ all -> 0x0168 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0, r3, r15}     // Catch:{ all -> 0x0168 }
            java.lang.String r20 = java.lang.String.format(r4, r1, r0)     // Catch:{ all -> 0x0168 }
            goto L_0x016a
        L_0x0168:
            java.lang.String r20 = ""
        L_0x016a:
            if (r15 != r10) goto L_0x0170
            android.view.Surface r18 = r2.createInputSurface()     // Catch:{ Exception -> 0x0197 }
        L_0x0170:
            if (r24 == 0) goto L_0x0187
            boolean r0 = r6 instanceof X.C7964QeC     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0187
            X.QeC r6 = (X.C7964QeC) r6     // Catch:{ Exception -> 0x0197 }
            int r0 = r6.A00     // Catch:{ Exception -> 0x0197 }
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0187
            java.lang.Object r0 = r6.A01     // Catch:{ Exception -> 0x0197 }
            X.SJN r0 = (X.SJN) r0     // Catch:{ Exception -> 0x0197 }
            boolean r0 = r0.A0M     // Catch:{ Exception -> 0x0197 }
            if (r0 == 0) goto L_0x0187
            r9 = 1
        L_0x0187:
            java.lang.Integer r19 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x0197 }
            r23 = 0
            r21 = -1
            X.Q17 r16 = new X.Q17     // Catch:{ Exception -> 0x0197 }
            r24 = r9
            r25 = r23
            r16.<init>(r17, r18, r19, r20, r21, r23, r24, r25)     // Catch:{ Exception -> 0x0197 }
            return r16
        L_0x0197:
            r5 = move-exception
            java.util.Locale r4 = java.util.Locale.US
            java.lang.String r12 = "null"
            if (r2 == 0) goto L_0x01c4
            java.lang.String r8 = A03(r2, r3)
        L_0x01a3:
            boolean r0 = r5 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x01ae
            r0 = r5
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r12 = X.C266784aL.A02(r0)
        L_0x01ae:
            r13 = r26
            r9 = r3
            r10 = r15
            r11 = r7
            java.lang.Object[] r1 = new java.lang.Object[]{r8, r9, r10, r11, r12, r13}
            java.lang.String r0 = "media codec:%s, format:%s, input type:%s, mimeType:%s, mediaCodecException:%s, debugInfo:"
            java.lang.String r0 = java.lang.String.format(r4, r0, r1)
            X.Qe2 r1 = new X.Qe2
            r1.<init>(r0, r5)
            throw r1
        L_0x01c4:
            r8 = r12
            goto L_0x01a3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7257Q1f.A02(android.media.MediaFormat, X.RDj, X.Q4k, java.lang.String, java.lang.String):X.Q17");
    }

    static {
        HashSet A1F = AnonymousClass7TE.A1F();
        A03 = A1F;
        A1F.add("OMX.ittiam.video.encoder.avc");
        A1F.add("OMX.Exynos.avc.enc");
        HashMap A1E = AnonymousClass7TE.A1E();
        A02 = A1E;
        A1E.put("OMX.qcom.video.encoder.avc", 21);
        HashSet A1F2 = AnonymousClass7TE.A1F();
        A04 = A1F2;
        A1F2.add("GT-S6812i");
        A1F2.add("GT-I8552");
        A1F2.add("GT-I8552B");
        A1F2.add("GT-I8262B");
        ArrayList A1C = AnonymousClass7TE.A1C();
        A01 = A1C;
        A1C.add("OMX.SEC.AVC.Encoder");
        A1C.add("OMX.SEC.avc.enc");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0019, code lost:
        if (r0 != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.Q17 A01(android.media.MediaFormat r4, android.view.Surface r5, X.C7334Q4k r6, java.lang.String r7) {
        /*
            boolean r0 = A04(r7)
            if (r0 != 0) goto L_0x001b
            boolean r0 = r6 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x001f
            r1 = r6
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0044
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A11
        L_0x0019:
            if (r0 == 0) goto L_0x0044
        L_0x001b:
            r0 = -1041164561(0xffffffffc1f116ef, float:-30.136198)
            goto L_0x0034
        L_0x001f:
            boolean r0 = r6 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0044
            r0 = r6
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316190462709807(0x8105620020102f, double:3.0298433099545975E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0019
        L_0x0034:
            android.media.MediaCodec r0 = X.0fX.A01(r7, r0)     // Catch:{ IOException -> 0x003d }
            X.Q17 r0 = A00(r0, r4, r5, r6)     // Catch:{ IOException -> 0x003d }
            return r0
        L_0x003d:
            r1 = move-exception
            X.Qe1 r0 = new X.Qe1
            r0.<init>(r1)
            throw r0
        L_0x0044:
            java.lang.String r0 = "Unsupported codec for "
            java.lang.String r1 = X.002.A0R(r0, r7)
            X.Qe1 r0 = new X.Qe1
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7257Q1f.A01(android.media.MediaFormat, android.view.Surface, X.Q4k, java.lang.String):X.Q17");
    }

    public static String A03(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        boolean z;
        int[] iArr;
        boolean z2;
        MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        C66580MXl.A1V("name=", codecInfo.getName(), A1A);
        Pxf.A1N(" is encoder=", A1A, codecInfo.isEncoder());
        C66580MXl.A1V(" supported types=", Arrays.toString(codecInfo.getSupportedTypes()), A1A);
        if (Build.VERSION.SDK_INT >= 29) {
            Pxf.A1N(" is vendor=", A1A, codecInfo.isVendor());
            Pxf.A1N(" is alias=", A1A, codecInfo.isAlias());
            Pxf.A1N(" is software only=", A1A, codecInfo.isSoftwareOnly());
        }
        MediaCodecInfo.CodecCapabilities capabilitiesForType = codecInfo.getCapabilitiesForType(mediaFormat.getString("mime"));
        try {
            i = mediaFormat.getInteger("color-format");
        } catch (Exception unused) {
            i = -1;
        }
        if (i > 0 && (iArr = capabilitiesForType.colorFormats) != null) {
            int length = iArr.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    z2 = false;
                    break;
                } else if (iArr[i9] == i) {
                    z2 = true;
                    break;
                } else {
                    i9++;
                }
            }
            Pxf.A1N(" color format supported=", A1A, z2);
        }
        try {
            i2 = mediaFormat.getInteger("profile");
        } catch (Exception unused2) {
            i2 = -1;
        }
        try {
            i3 = mediaFormat.getInteger("level");
        } catch (Exception unused3) {
            i3 = -1;
        }
        A1A.append(002.A02(i2, i3, " Checking for profile=", " level="));
        if (i2 > 0 && i3 > 0 && (codecProfileLevelArr = capabilitiesForType.profileLevels) != null) {
            int length2 = codecProfileLevelArr.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length2) {
                    z = false;
                    break;
                }
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = codecProfileLevelArr[i10];
                int i11 = codecProfileLevel.profile;
                A1A.append(002.A02(i11, codecProfileLevel.level, " codecProfileLevel.profile=", " codecProfileLevel.level="));
                if (i11 == i2 && codecProfileLevel.level == i3) {
                    z = true;
                    break;
                }
                i10++;
            }
            Pxf.A1N(" profile level supported=", A1A, z);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = capabilitiesForType.getEncoderCapabilities();
        MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
        try {
            i4 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.WIDTH);
        } catch (Exception unused4) {
            i4 = -1;
        }
        try {
            i5 = mediaFormat.getInteger(IgReactMediaPickerNativeModule.HEIGHT);
        } catch (Exception unused5) {
            i5 = -1;
        }
        boolean isSizeSupported = videoCapabilities.isSizeSupported(i4, i5);
        Pxf.A1N(" size supported=", A1A, isSizeSupported);
        if (isSizeSupported) {
            try {
                i8 = mediaFormat.getInteger("frame-rate");
            } catch (Exception unused6) {
                i8 = -1;
            }
            double d = (double) i8;
            if (d > 0.0d) {
                Pxf.A1N(" frame-rate supported=", A1A, videoCapabilities.getSupportedFrameRatesFor(i4, i5).contains(Double.valueOf(d)));
            }
            A1A.append(String.format(Locale.US, " supported frame-rates for %d x %d = [%.2f, %.2f]", new Object[]{Integer.valueOf(i4), Integer.valueOf(i5), videoCapabilities.getSupportedFrameRatesFor(i4, i5).getLower(), videoCapabilities.getSupportedFrameRatesFor(i4, i5).getUpper()}));
        }
        A1A.append(002.A0O(" width alignment=", videoCapabilities.getWidthAlignment()));
        A1A.append(002.A0O(" height alignment=", videoCapabilities.getHeightAlignment()));
        try {
            i6 = mediaFormat.getInteger(TraceFieldType.Bitrate);
        } catch (Exception unused7) {
            i6 = -1;
        }
        if (i6 > 0) {
            Pxf.A1N(" bitrate supported=", A1A, videoCapabilities.getBitrateRange().contains(Integer.valueOf(i6)));
        }
        try {
            i7 = mediaFormat.getInteger(HardwareVideoEncoder.KEY_BITRATE_MODE);
        } catch (Exception unused8) {
            i7 = -1;
        }
        if (i7 > 0) {
            encoderCapabilities.getClass();
            Pxf.A1N(" bitrate mode supported=", A1A, encoderCapabilities.isBitrateModeSupported(i7));
        }
        return AnonymousClass7TF.A0l(String.format(Locale.US, " supported widths=[%d, %d] supported heights=[%d, %d] supported bitrate=[%d, %d]", new Object[]{videoCapabilities.getSupportedWidths().getLower(), videoCapabilities.getSupportedWidths().getUpper(), videoCapabilities.getSupportedHeights().getLower(), videoCapabilities.getSupportedHeights().getUpper(), videoCapabilities.getBitrateRange().getLower(), videoCapabilities.getBitrateRange().getUpper()}), A1A);
    }

    public static boolean A04(String str) {
        if (str.equals("video/avc") || str.equals("video/hevc") || str.equals("video/av01") || str.equals("video/3gpp") || str.equals("video/mp4v-es") || str.equals("video/x-vnd.on2.vp8") || str.equals("video/mp4")) {
            return true;
        }
        return false;
    }

    public final Q17 A05(MediaFormat mediaFormat, Surface surface, C7334Q4k q4k, List list, boolean z) {
        String string = mediaFormat.getString("mime");
        string.getClass();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder() && Arrays.asList(codecInfoAt.getSupportedTypes()).contains(string)) {
                String name = codecInfoAt.getName();
                if ((list.isEmpty() || !list.contains(name)) && (!z || Build.VERSION.SDK_INT < 29 || codecInfoAt.isSoftwareOnly())) {
                    MediaCodec A002 = 0fX.A00(name, 924315838);
                    mediaFormat.setInteger("max-input-size", 0);
                    return A00(A002, mediaFormat, surface, q4k);
                }
            }
        }
        C266784aL.A06(false, (String) null);
        throw AnonymousClass00P.createAndThrow();
    }
}
