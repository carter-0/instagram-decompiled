package X;

import android.media.MediaCodecInfo;
import android.util.Range;
import java.util.List;

public abstract class SSg {
    public static void A04(C11354SOn sOn, float f, int i) {
        int i2;
        if (f > 1.0f) {
            sOn.A0C = i;
            i2 = (int) (((float) i) / f);
            sOn.A0A = i2;
        } else {
            sOn.A0A = i;
            i2 = i;
            i = (int) (((float) i) * f);
            sOn.A0C = i;
        }
        int i3 = i;
        int i4 = i % 16;
        if (i4 != 0) {
            i3 = i + (16 - i4);
        }
        int i5 = (int) (((float) i2) * (((float) i3) / ((float) i)));
        sOn.A0A = i5;
        sOn.A0C = i3;
        int i6 = i5 % 16;
        if (i6 != 0) {
            i5 += 16 - i6;
        }
        sOn.A0A = i5;
    }

    public static MediaCodecInfo.CodecCapabilities A00() {
        for (MediaCodecInfo mediaCodecInfo : Pxg.A1Z(1)) {
            if (mediaCodecInfo.isEncoder()) {
                for (String str : mediaCodecInfo.getSupportedTypes()) {
                    if (str.equalsIgnoreCase("video/avc")) {
                        return mediaCodecInfo.getCapabilitiesForType(str);
                    }
                }
                continue;
            }
        }
        return null;
    }

    public static Range A01(int i) {
        MediaCodecInfo.CodecCapabilities A00 = A00();
        if (A00 == null || A00.getVideoCapabilities() == null) {
            return Range.create(32, 720);
        }
        return A00.getVideoCapabilities().getSupportedWidthsFor(i);
    }

    public static C11354SOn A03(C7232Q0d q0d, C11326SNc sNc, List list) {
        int i;
        C11354SOn A00 = C11354SOn.A00(q0d, sNc, list);
        int max = Math.max(q0d.A05, q0d.A03);
        int i2 = sNc.A01;
        int min = Math.min(max, i2);
        A04(A00, ((float) A00.A0C) / ((float) A00.A0A), min);
        if (min >= i2) {
            i = sNc.A00;
        } else {
            i = ((int) ((((double) ((((float) (A00.A0C * A00.A0A)) * ((float) A00.A02)) * 1.3f)) * 0.07d) / 1000.0d)) * 1024;
        }
        A00.A01 = i;
        return A00;
    }

    public static boolean A05(int i, int i2) {
        MediaCodecInfo.CodecCapabilities A00 = A00();
        if (A00 == null || A00.getVideoCapabilities() == null) {
            return true;
        }
        return A00.getVideoCapabilities().isSizeSupported(i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03bd, code lost:
        if (r17 != false) goto L_0x03bf;
     */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x04bf  */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x04e5  */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x04ec  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0118  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C11354SOn A02(X.C7232Q0d r26, X.C11354SOn r27, X.C11326SNc r28, com.facebook.videolite.transcoder.base.composition.MediaComposition r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34) {
        /*
            android.graphics.RectF r9 = X.C11354SOn.A0P
            java.lang.Integer r25 = X.AnonymousClass05K.A00
            r10 = r28
            int r0 = r10.A03
            r28 = r0
            r1 = r27
            if (r27 == 0) goto L_0x0425
            int r13 = r1.A05
            android.graphics.RectF r9 = r1.A0E
            java.lang.Integer r0 = r1.A0H
            r25 = r0
            X.SJA r0 = r1.A0G
            r23 = r0
            float r2 = r1.A00
            int r0 = r1.A0D
            r22 = r0
            boolean r0 = r1.A0M
            r21 = r0
            int r0 = r1.A03
            r28 = r0
            java.util.List r0 = r1.A0J
            r24 = r0
            if (r0 == 0) goto L_0x0034
            boolean r0 = r24.isEmpty()
            if (r0 == 0) goto L_0x0048
        L_0x0034:
            r0 = r29
            if (r29 == 0) goto L_0x0421
            X.4aE r1 = X.C266714aE.VIDEO
            java.util.HashMap r0 = r0.A00
            java.util.List r0 = X.Pxe.A1B(r1, r0)
            if (r0 == 0) goto L_0x0421
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0421
        L_0x0048:
            r17 = 1
        L_0x004a:
            r12 = r26
            int r15 = r12.A04
            r7 = 90
            if (r15 == r7) goto L_0x0417
            r0 = 270(0x10e, float:3.78E-43)
            if (r15 == r0) goto L_0x0417
            int r1 = r12.A05
            r26 = r1
            int r0 = r12.A03
            r27 = r0
        L_0x005e:
            float r8 = (float) r1
            float r1 = r9.width()
            float r6 = r8 * r1
            float r5 = (float) r0
            float r0 = r9.height()
            float r3 = r5 * r0
            int r0 = (int) r6
            int r4 = (int) r3
            float r1 = r6 / r3
            r11 = 0
            int r11 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r11 <= 0) goto L_0x0414
            boolean r11 = X.RV5.A00(r2, r1)
            if (r11 != 0) goto L_0x0414
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0410
            float r1 = r6 / r2
            int r4 = (int) r1
        L_0x0082:
            r14 = 1
        L_0x0083:
            int r2 = r10.A02
            r1 = -1
            if (r2 != r1) goto L_0x03e5
            if (r0 <= r4) goto L_0x03da
            int r1 = r10.A01
            if (r0 <= r1) goto L_0x03da
            int r4 = r4 * r1
            int r4 = r4 / r0
            r0 = r1
        L_0x0091:
            boolean r1 = r10.A04
            if (r1 == 0) goto L_0x009e
            int r1 = r10.A01
            if (r0 <= r4) goto L_0x03d3
            if (r0 >= r1) goto L_0x009e
            int r4 = r4 * r1
            int r4 = r4 / r0
            r0 = r1
        L_0x009e:
            if (r30 == 0) goto L_0x03cd
            android.media.MediaCodecInfo$CodecCapabilities r2 = A00()
            if (r2 == 0) goto L_0x03c9
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            if (r1 == 0) goto L_0x03c9
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            int r20 = r1.getWidthAlignment()
        L_0x00b4:
            android.media.MediaCodecInfo$CodecCapabilities r2 = A00()
            if (r2 == 0) goto L_0x03cf
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            if (r1 == 0) goto L_0x03cf
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            int r19 = r1.getHeightAlignment()
        L_0x00c8:
            if (r33 != 0) goto L_0x00ef
            int r1 = r0 % r20
            if (r1 == 0) goto L_0x00d8
            int r2 = r20 - r1
            int r2 = r2 + r0
            float r4 = (float) r4
            float r1 = (float) r2
            float r0 = (float) r0
            float r1 = r1 / r0
            float r4 = r4 * r1
            int r4 = (int) r4
            r0 = r2
        L_0x00d8:
            int r1 = r4 % r19
            if (r1 == 0) goto L_0x00df
            int r1 = r19 - r1
            int r4 = r4 + r1
        L_0x00df:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            android.util.Pair r1 = X.Pxf.A0K(r0, r4)
            int r0 = X.Pxf.A05(r1)
            int r4 = X.Pxf.A04(r1)
        L_0x00ef:
            float r1 = (float) r0
            float r16 = r1 / r6
            float r2 = (float) r4
            float r11 = r2 / r3
            float r3 = r9.left
            float r6 = r9.top
            float r16 = r16 * r8
            float r1 = r1 / r16
            float r1 = r1 + r3
            float r11 = r11 * r5
            float r2 = r2 / r11
            float r5 = r6 + r2
            android.graphics.RectF r18 = new android.graphics.RectF
            r2 = r18
            r2.<init>(r3, r6, r1, r5)
            if (r31 == 0) goto L_0x03bc
            if (r4 <= r0) goto L_0x03bc
            if (r17 != 0) goto L_0x03bf
            if (r14 != 0) goto L_0x03bc
            r11 = 90
            r1 = r4
            r4 = r0
            r0 = r1
        L_0x0116:
            if (r33 == 0) goto L_0x04bf
            android.media.MediaCodecInfo$CodecCapabilities r2 = A00()
            if (r2 == 0) goto L_0x03aa
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            if (r1 == 0) goto L_0x03aa
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            android.util.Range r17 = r1.getSupportedWidths()
        L_0x012c:
            android.media.MediaCodecInfo$CodecCapabilities r2 = A00()
            if (r2 == 0) goto L_0x0398
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            if (r1 == 0) goto L_0x0398
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            android.util.Range r16 = r1.getSupportedHeights()
        L_0x0140:
            X.SOn r9 = new X.SOn
            r9.<init>()
            java.lang.StringBuilder r8 = X.AnonymousClass7TE.A1A()
            java.lang.String r2 = "getCorrectedResolution: Input targetWidth="
            java.lang.String r1 = " targetHeight = "
            java.lang.String r1 = X.002.A02(r0, r4, r2, r1)
            r8.append(r1)
            if (r4 == 0) goto L_0x0158
            if (r0 != 0) goto L_0x0161
        L_0x0158:
            java.lang.String r0 = "getCorrectedResolution-1"
            r8.append(r0)
            r4 = 1280(0x500, float:1.794E-42)
            r0 = 720(0x2d0, float:1.009E-42)
        L_0x0161:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x0179
            boolean r1 = A05(r4, r0)
            if (r1 == 0) goto L_0x0179
            if (r31 == 0) goto L_0x0179
            java.lang.String r1 = "getCorrectedResolution-2"
            r8.append(r1)
            r9.A0B = r7
            r1 = r4
            r4 = r0
            r0 = r1
        L_0x0179:
            r6 = 1
            r5 = r0
            r1 = r4
            int r2 = r0 % r20
            if (r2 == 0) goto L_0x0189
            int r5 = r20 - r2
            int r5 = r5 + r0
            float r3 = (float) r4
            float r2 = (float) r5
            float r1 = (float) r0
            float r2 = r2 / r1
            float r3 = r3 * r2
            int r1 = (int) r3
        L_0x0189:
            int r2 = r1 % r19
            if (r2 == 0) goto L_0x0190
            int r2 = r19 - r2
            int r1 = r1 + r2
        L_0x0190:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            android.util.Pair r3 = X.Pxf.A0K(r2, r1)
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x01b9
            int r2 = X.Pxf.A05(r3)
            int r1 = X.Pxf.A04(r3)
            boolean r1 = A05(r2, r1)
            if (r1 == 0) goto L_0x01b9
            java.lang.String r0 = "getCorrectedResolution-3"
            r8.append(r0)
            int r0 = X.Pxf.A05(r3)
            int r4 = X.Pxf.A04(r3)
        L_0x01b9:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x01de
            int r2 = X.Pxf.A04(r3)
            int r1 = X.Pxf.A05(r3)
            boolean r1 = A05(r2, r1)
            if (r1 == 0) goto L_0x01de
            if (r31 == 0) goto L_0x01de
            java.lang.String r0 = "getCorrectedResolution-4"
            r8.append(r0)
            int r0 = X.Pxf.A04(r3)
            int r4 = X.Pxf.A05(r3)
            r9.A0B = r7
        L_0x01de:
            r5 = r0
            r1 = r4
            int r2 = r0 % r20
            if (r2 == 0) goto L_0x01ec
            int r5 = r0 - r2
            float r3 = (float) r4
            float r2 = (float) r5
            float r1 = (float) r0
            float r2 = r2 / r1
            float r3 = r3 * r2
            int r1 = (int) r3
        L_0x01ec:
            int r2 = r1 % r19
            if (r2 == 0) goto L_0x01f1
            int r1 = r1 - r2
        L_0x01f1:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            android.util.Pair r3 = X.Pxf.A0K(r2, r1)
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x021a
            int r2 = X.Pxf.A05(r3)
            int r1 = X.Pxf.A04(r3)
            boolean r1 = A05(r2, r1)
            if (r1 == 0) goto L_0x021a
            java.lang.String r0 = "getCorrectedResolution-5"
            r8.append(r0)
            int r0 = X.Pxf.A05(r3)
            int r4 = X.Pxf.A04(r3)
        L_0x021a:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x023f
            int r2 = X.Pxf.A04(r3)
            int r1 = X.Pxf.A05(r3)
            boolean r1 = A05(r2, r1)
            if (r1 == 0) goto L_0x023f
            if (r31 == 0) goto L_0x023f
            java.lang.String r0 = "getCorrectedResolution-6"
            r8.append(r0)
            int r0 = X.Pxf.A04(r3)
            int r4 = X.Pxf.A05(r3)
            r9.A0B = r7
        L_0x023f:
            boolean r3 = X.C51970G9q.A1W(r4, r0)
            int r2 = X.Pxg.A03(r16)
            int r1 = X.Pxg.A03(r17)
            if (r2 > r1) goto L_0x024e
            r6 = 0
        L_0x024e:
            if (r3 == r6) goto L_0x0334
            if (r31 == 0) goto L_0x0334
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x0277
            int r1 = X.Pxg.A03(r17)
            if (r4 <= r1) goto L_0x0277
            java.lang.String r1 = "getCorrectedResolution-7"
            r8.append(r1)
            double r5 = (double) r0
            double r0 = (double) r4
            double r5 = r5 / r0
            int r0 = X.Pxg.A03(r17)
            int r1 = X.Pxg.A03(r17)
            double r1 = (double) r1
            double r5 = r5 * r1
            int r4 = (int) r5
            int r4 = r4 / r19
            int r4 = r4 * r19
            r9.A0B = r7
        L_0x0277:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x029c
            int r1 = X.Pxg.A03(r16)
            if (r0 <= r1) goto L_0x029c
            java.lang.String r1 = "getCorrectedResolution-8"
            r8.append(r1)
            double r2 = (double) r4
            double r0 = (double) r0
            double r2 = r2 / r0
            int r4 = X.Pxg.A03(r16)
            int r0 = X.Pxg.A03(r16)
            double r0 = (double) r0
            double r2 = r2 * r0
            int r0 = (int) r2
            int r0 = r0 / r20
            int r0 = r0 * r20
            r9.A0B = r7
        L_0x029c:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x02cb
            java.lang.Comparable r1 = r16.getLower()
            int r1 = X.AnonymousClass7TE.A0M(r1)
            if (r4 >= r1) goto L_0x02cb
            java.lang.String r1 = "getCorrectedResolution-11"
            r8.append(r1)
            double r1 = (double) r0
            double r3 = (double) r4
            double r1 = r1 / r3
            java.lang.Comparable r0 = r16.getLower()
            int r4 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Comparable r0 = r16.getLower()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            double r5 = (double) r0
            double r1 = r1 * r5
            int r0 = (int) r1
            int r0 = r0 / r20
            int r0 = r0 * r20
        L_0x02cb:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x02fa
            java.lang.Comparable r1 = r17.getLower()
            int r1 = X.AnonymousClass7TE.A0M(r1)
            if (r0 >= r1) goto L_0x02fa
            java.lang.String r1 = "getCorrectedResolution-12"
            r8.append(r1)
            double r1 = (double) r4
            double r3 = (double) r0
            double r1 = r1 / r3
            java.lang.Comparable r0 = r17.getLower()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Comparable r3 = r17.getLower()
            int r3 = X.AnonymousClass7TE.A0M(r3)
            double r3 = (double) r3
            double r1 = r1 * r3
            int r4 = (int) r1
            int r4 = r4 / r19
            int r4 = r4 * r19
        L_0x02fa:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x0433
            java.lang.String r0 = "getCorrectedResolution-13"
            r8.append(r0)
            int r0 = X.Pxg.A03(r17)
            android.media.MediaCodecInfo$CodecCapabilities r2 = A00()
            if (r2 == 0) goto L_0x0323
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            if (r1 == 0) goto L_0x0323
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()
            android.util.Range r1 = r1.getSupportedHeightsFor(r0)
        L_0x031d:
            int r4 = X.Pxg.A03(r1)
            goto L_0x0433
        L_0x0323:
            r1 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Range r1 = android.util.Range.create(r2, r1)
            goto L_0x031d
        L_0x0334:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x0373
            int r1 = X.Pxg.A03(r16)
            if (r4 <= r1) goto L_0x0373
            java.lang.String r1 = "getCorrectedResolution-9"
            r8.append(r1)
            double r2 = (double) r0
            double r0 = (double) r4
            double r2 = r2 / r0
            int r4 = X.Pxg.A03(r16)
            int r0 = X.Pxg.A03(r16)
            double r0 = (double) r0
            double r2 = r2 * r0
            int r1 = (int) r2
            int r1 = r1 / r20
            int r1 = r1 * r20
            android.util.Range r0 = A01(r4)
            java.lang.Comparable r0 = r0.getLower()
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r1 = java.lang.Math.max(r1, r0)
            android.util.Range r0 = A01(r4)
            int r0 = X.Pxg.A03(r0)
            int r0 = java.lang.Math.min(r1, r0)
        L_0x0373:
            boolean r1 = A05(r0, r4)
            if (r1 != 0) goto L_0x029c
            int r1 = X.Pxg.A03(r17)
            if (r0 <= r1) goto L_0x029c
            java.lang.String r1 = "getCorrectedResolution-10"
            r8.append(r1)
            double r1 = (double) r4
            double r3 = (double) r0
            double r1 = r1 / r3
            int r0 = X.Pxg.A03(r17)
            int r3 = X.Pxg.A03(r17)
            double r3 = (double) r3
            double r1 = r1 * r3
            int r4 = (int) r1
            int r4 = r4 / r19
            int r4 = r4 * r19
            goto L_0x029c
        L_0x0398:
            r1 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Range r16 = android.util.Range.create(r2, r1)
            goto L_0x0140
        L_0x03aa:
            r1 = 32
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r1 = 1280(0x500, float:1.794E-42)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            android.util.Range r17 = android.util.Range.create(r2, r1)
            goto L_0x012c
        L_0x03bc:
            r11 = 0
            if (r17 == 0) goto L_0x0116
        L_0x03bf:
            int r1 = r13 % 180
            if (r1 == 0) goto L_0x03c6
            r1 = r4
            r4 = r0
            r0 = r1
        L_0x03c6:
            int r11 = -r13
            goto L_0x0116
        L_0x03c9:
            r20 = 16
            goto L_0x00b4
        L_0x03cd:
            r20 = 16
        L_0x03cf:
            r19 = 16
            goto L_0x00c8
        L_0x03d3:
            if (r4 >= r1) goto L_0x009e
            int r0 = r0 * r1
            int r0 = r0 / r4
            r4 = r1
            goto L_0x009e
        L_0x03da:
            if (r4 <= r0) goto L_0x0091
            int r1 = r10.A01
            if (r4 <= r1) goto L_0x0091
            int r0 = r0 * r1
            int r0 = r0 / r4
            r4 = r1
            goto L_0x0091
        L_0x03e5:
            if (r0 >= r4) goto L_0x03f9
            if (r0 <= r2) goto L_0x03f9
            int r4 = r4 * r2
            int r4 = r4 / r0
            r0 = r2
        L_0x03ec:
            boolean r1 = r10.A04
            if (r1 == 0) goto L_0x009e
            if (r0 >= r4) goto L_0x0409
            if (r0 >= r2) goto L_0x009e
            int r4 = r4 * r2
            int r4 = r4 / r0
            r0 = r2
            goto L_0x009e
        L_0x03f9:
            if (r4 >= r0) goto L_0x0401
            if (r4 <= r2) goto L_0x0401
            int r0 = r0 * r2
            int r0 = r0 / r4
        L_0x03ff:
            r4 = r2
            goto L_0x03ec
        L_0x0401:
            if (r0 != r4) goto L_0x03ec
            if (r0 <= r2) goto L_0x03ec
            if (r34 == 0) goto L_0x03ec
            r0 = r2
            goto L_0x03ff
        L_0x0409:
            if (r4 >= r2) goto L_0x009e
            int r0 = r0 * r2
            int r0 = r0 / r4
            r4 = r2
            goto L_0x009e
        L_0x0410:
            float r2 = r2 * r3
            int r0 = (int) r2
            goto L_0x0082
        L_0x0414:
            r14 = 0
            goto L_0x0083
        L_0x0417:
            int r1 = r12.A03
            r27 = r1
            int r0 = r12.A05
            r26 = r0
            goto L_0x005e
        L_0x0421:
            r17 = 0
            goto L_0x004a
        L_0x0425:
            r17 = 0
            r13 = 0
            r21 = 0
            r24 = 0
            r23 = 0
            r2 = 0
            r22 = -1
            goto L_0x004a
        L_0x0433:
            java.lang.StringBuilder r5 = X.AnonymousClass7TE.A1A()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            java.lang.String r1 = "getSupportedFrameRatesFor ="
            r5.append(r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            android.media.MediaCodecInfo$CodecCapabilities r2 = A00()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            if (r2 == 0) goto L_0x0496
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            if (r1 == 0) goto L_0x0496
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            android.util.Range r1 = r1.getSupportedFrameRatesFor(r0, r4)     // Catch:{ IllegalArgumentException -> 0x04a7 }
        L_0x0450:
            r5.append(r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            X.Pxf.A1O(r8, r5)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            java.lang.String r1 = "getBitrateRange ="
            r3.append(r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            android.media.MediaCodecInfo$CodecCapabilities r2 = A00()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            if (r2 == 0) goto L_0x0486
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            if (r1 == 0) goto L_0x0486
            android.media.MediaCodecInfo$VideoCapabilities r1 = r2.getVideoCapabilities()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            android.util.Range r1 = r1.getBitrateRange()     // Catch:{ IllegalArgumentException -> 0x04a7 }
        L_0x0473:
            r3.append(r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            X.Pxf.A1O(r8, r3)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            java.lang.String r2 = "mediaTranscodeParams.targetRotationDegreesClockwise = "
            int r1 = r9.A0B     // Catch:{ IllegalArgumentException -> 0x04a7 }
            java.lang.String r1 = X.002.A0O(r2, r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            r8.append(r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            goto L_0x04b1
        L_0x0486:
            java.lang.Integer r2 = X.C51967G9n.A0k()     // Catch:{ IllegalArgumentException -> 0x04a7 }
            r1 = 500000(0x7a120, float:7.00649E-40)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            android.util.Range r1 = android.util.Range.create(r2, r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            goto L_0x0473
        L_0x0496:
            r1 = 0
            java.lang.Double r3 = java.lang.Double.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            r1 = 4629137466983448576(0x403e000000000000, double:30.0)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            android.util.Range r1 = android.util.Range.create(r3, r1)     // Catch:{ IllegalArgumentException -> 0x04a7 }
            goto L_0x0450
        L_0x04a7:
            r1 = move-exception
            java.lang.String r2 = "exception = "
            java.lang.String r1 = r1.getMessage()
            X.C66580MXl.A1V(r2, r1, r8)
        L_0x04b1:
            r9.A0C = r0
            r9.A0A = r4
            java.lang.String r2 = r8.toString()
            r9.A0I = r2
            int r1 = r9.A0B
            int r11 = r11 + r1
            goto L_0x04c0
        L_0x04bf:
            r2 = 0
        L_0x04c0:
            X.SOn r1 = new X.SOn
            r1.<init>()
            r3 = r27
            r1.A06 = r3
            r3 = r26
            r1.A08 = r3
            r1.A07 = r15
            r1.A05 = r13
            r1.A0O = r14
            r1.A0B = r11
            r1.A0A = r4
            r1.A0C = r0
            r0 = r18
            r1.A0E = r0
            r0 = r25
            r1.A0H = r0
            int r0 = r10.A00
            if (r0 > 0) goto L_0x04e8
            long r3 = r12.A06
            int r0 = (int) r3
        L_0x04e8:
            r1.A01 = r0
            if (r32 == 0) goto L_0x04ee
            r1.A04 = r0
        L_0x04ee:
            r0 = 1106247680(0x41f00000, float:30.0)
            int r0 = java.lang.Math.round(r0)
            r1.A02 = r0
            r0 = r28
            r1.A03 = r0
            r0 = r23
            r1.A0G = r0
            r0 = r24
            r1.A0J = r0
            r0 = r22
            r1.A0D = r0
            r1.A0I = r2
            r0 = r21
            r1.A0M = r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SSg.A02(X.Q0d, X.SOn, X.SNc, com.facebook.videolite.transcoder.base.composition.MediaComposition, boolean, boolean, boolean, boolean, boolean):X.SOn");
    }
}
