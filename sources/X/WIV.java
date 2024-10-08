package X;

import android.graphics.Rect;
import com.facebook.mediastreaming.opt.encoder.video.encoding.VideoEncoderConfig;

public final class WIV implements X7U {
    public volatile Rect A00;

    /* JADX WARNING: Removed duplicated region for block: B:151:0x031a A[Catch:{ all -> 0x03a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x0324 A[Catch:{ all -> 0x03a3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.nio.ByteBuffer CIi(java.nio.ByteBuffer r27) {
        /*
            r26 = this;
            r10 = 0
            r0 = r26
            android.graphics.Rect r7 = r0.A00
            if (r7 == 0) goto L_0x0017
            int r0 = r7.left
            if (r0 != 0) goto L_0x0018
            int r0 = r7.right
            if (r0 != 0) goto L_0x0018
            int r0 = r7.top
            if (r0 != 0) goto L_0x0018
            int r0 = r7.bottom
            if (r0 != 0) goto L_0x0018
        L_0x0017:
            return r27
        L_0x0018:
            android.os.SystemClock.elapsedRealtime()
            java.nio.ByteBuffer r1 = r27.duplicate()     // Catch:{ Exception -> 0x03eb }
            X.0qQ.A07(r1)     // Catch:{ Exception -> 0x03eb }
            r1.getShort()     // Catch:{ Exception -> 0x03eb }
            byte r0 = r1.get()     // Catch:{ Exception -> 0x03eb }
            if (r0 != 0) goto L_0x0041
            r1.getShort()     // Catch:{ Exception -> 0x03eb }
        L_0x002e:
            java.nio.ByteBuffer r4 = r1.duplicate()     // Catch:{ Exception -> 0x03eb }
            r4.flip()     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r3 = r1.slice()     // Catch:{ Exception -> 0x03eb }
            int r0 = r3.limit()     // Catch:{ Exception -> 0x03eb }
            int r5 = r0 + -4
            r2 = 0
            goto L_0x0045
        L_0x0041:
            r1.get()     // Catch:{ Exception -> 0x03eb }
            goto L_0x002e
        L_0x0045:
            if (r2 >= r5) goto L_0x0048
            goto L_0x0057
        L_0x0048:
            X.Ve6 r0 = X.C18445Vrs.A02     // Catch:{ Exception -> 0x03eb }
            X.Vrs r1 = r0.A00(r4, r3)     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r10)     // Catch:{ Exception -> 0x03eb }
            android.util.Pair r3 = android.util.Pair.create(r1, r0)     // Catch:{ Exception -> 0x03eb }
            goto L_0x0088
        L_0x0057:
            byte r0 = r3.get(r2)     // Catch:{ Exception -> 0x03eb }
            if (r0 != 0) goto L_0x00e5
            int r0 = r2 + 1
            byte r0 = r3.get(r0)     // Catch:{ Exception -> 0x03eb }
            if (r0 != 0) goto L_0x00e5
            int r1 = r2 + 2
            byte r0 = r3.get(r1)     // Catch:{ Exception -> 0x03eb }
            if (r0 == 0) goto L_0x0074
            byte r1 = r3.get(r1)     // Catch:{ Exception -> 0x03eb }
            r0 = 1
            if (r1 != r0) goto L_0x00e5
        L_0x0074:
            r3.position(r2)     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r1 = r3.slice()     // Catch:{ Exception -> 0x03eb }
            r3.flip()     // Catch:{ Exception -> 0x03eb }
            X.Ve6 r0 = X.C18445Vrs.A02     // Catch:{ Exception -> 0x03eb }
            X.Vrs r0 = r0.A00(r4, r3)     // Catch:{ Exception -> 0x03eb }
            android.util.Pair r3 = android.util.Pair.create(r0, r1)     // Catch:{ Exception -> 0x03eb }
        L_0x0088:
            X.0qQ.A07(r3)     // Catch:{ Exception -> 0x03eb }
            java.lang.Object r9 = r3.first     // Catch:{ Exception -> 0x03eb }
            X.Vrs r9 = (X.C18445Vrs) r9     // Catch:{ Exception -> 0x03eb }
            java.lang.Object r15 = r3.second     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r15 = (java.nio.ByteBuffer) r15     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r1 = r9.A00     // Catch:{ Exception -> 0x03eb }
            int r0 = r1.limit()     // Catch:{ Exception -> 0x03eb }
            int r0 = r0 + -1
            byte r0 = r1.get(r0)     // Catch:{ Exception -> 0x03eb }
            r1 = r0 & 31
            r14 = 1
            r0 = 7
            if (r1 != r0) goto L_0x03c8
            java.lang.Object r0 = r3.first     // Catch:{ Exception -> 0x03eb }
            X.Vrs r0 = (X.C18445Vrs) r0     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r0 = r0.A01     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r0 = r0.duplicate()     // Catch:{ Exception -> 0x03eb }
            X.0qQ.A07(r0)     // Catch:{ Exception -> 0x03eb }
            X.Vvf r11 = new X.Vvf     // Catch:{ Exception -> 0x03eb }
            r11.<init>(r0)     // Catch:{ Exception -> 0x03eb }
            int r0 = r11.A00     // Catch:{ Exception -> 0x03eb }
            if (r0 <= 0) goto L_0x00be
            X.C18640Vvf.A00(r11)     // Catch:{ Exception -> 0x03eb }
        L_0x00be:
            int r1 = X.C18640Vvf.A00(r11)     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r1)     // Catch:{ Exception -> 0x03eb }
            int r0 = r11.A00     // Catch:{ Exception -> 0x03eb }
            if (r0 <= 0) goto L_0x00cc
            X.C18640Vvf.A00(r11)     // Catch:{ Exception -> 0x03eb }
        L_0x00cc:
            int r0 = X.C18640Vvf.A00(r11)     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            int r0 = r11.A00     // Catch:{ Exception -> 0x03eb }
            if (r0 <= 0) goto L_0x00da
            X.C18640Vvf.A00(r11)     // Catch:{ Exception -> 0x03eb }
        L_0x00da:
            int r0 = X.C18640Vvf.A00(r11)     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            goto L_0x00e9
        L_0x00e5:
            int r2 = r2 + 1
            goto L_0x0045
        L_0x00e9:
            r0 = 44
            r8 = 3
            if (r1 == r0) goto L_0x011d
            r0 = 83
            if (r1 == r0) goto L_0x011d
            r0 = 86
            if (r1 == r0) goto L_0x011d
            r0 = 100
            if (r1 == r0) goto L_0x011d
            r0 = 110(0x6e, float:1.54E-43)
            if (r1 == r0) goto L_0x011d
            r0 = 118(0x76, float:1.65E-43)
            if (r1 == r0) goto L_0x011d
            r0 = 122(0x7a, float:1.71E-43)
            if (r1 == r0) goto L_0x011d
            r0 = 128(0x80, float:1.794E-43)
            if (r1 == r0) goto L_0x011d
            r0 = 134(0x86, float:1.88E-43)
            if (r1 == r0) goto L_0x011d
            r0 = 244(0xf4, float:3.42E-43)
            if (r1 == r0) goto L_0x011d
            r0 = 138(0x8a, float:1.93E-43)
            if (r1 == r0) goto L_0x011d
            r0 = 139(0x8b, float:1.95E-43)
            if (r1 == r0) goto L_0x011d
            r6 = 1
            r5 = 0
            goto L_0x0163
        L_0x011d:
            int r6 = r11.A02()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r6)     // Catch:{ Exception -> 0x03eb }
            if (r6 != r8) goto L_0x0127
            goto L_0x0129
        L_0x0127:
            r5 = 0
            goto L_0x0130
        L_0x0129:
            int r5 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r5)     // Catch:{ Exception -> 0x03eb }
        L_0x0130:
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            int r0 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            int r0 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            if (r0 != r14) goto L_0x0163
            r0 = 12
            if (r6 == r8) goto L_0x014c
            r0 = 8
        L_0x014c:
            int r0 = r11.A03(r0)     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            long r0 = (long) r0     // Catch:{ Exception -> 0x03eb }
            r3 = 0
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0163
            java.lang.String r0 = "SPS contains scaling lists, which are unsupported."
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ Exception -> 0x03eb }
            r1.<init>(r0)     // Catch:{ Exception -> 0x03eb }
            goto L_0x03ea
        L_0x0163:
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            int r0 = r11.A02()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            if (r0 == 0) goto L_0x018e
            if (r0 != r14) goto L_0x0191
            int r0 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            int r1 = r11.A02()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r1)     // Catch:{ Exception -> 0x03eb }
            r0 = 0
        L_0x0186:
            if (r0 >= r1) goto L_0x0191
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            int r0 = r0 + 1
            goto L_0x0186
        L_0x018e:
            A00(r11)     // Catch:{ Exception -> 0x03eb }
        L_0x0191:
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            int r0 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            A00(r11)     // Catch:{ Exception -> 0x03eb }
            int r16 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r16)     // Catch:{ Exception -> 0x03eb }
            if (r16 != 0) goto L_0x01b1
            int r0 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
        L_0x01b1:
            int r0 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r0)     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r0 = r11.A02     // Catch:{ Exception -> 0x03eb }
            int r2 = r0.position()     // Catch:{ Exception -> 0x03eb }
            int r1 = r11.A00     // Catch:{ Exception -> 0x03eb }
            X.VQt r3 = new X.VQt     // Catch:{ Exception -> 0x03eb }
            r3.<init>(r2, r1)     // Catch:{ Exception -> 0x03eb }
            int r1 = r11.A01()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r1)     // Catch:{ Exception -> 0x03eb }
            if (r1 != r14) goto L_0x01cf
            goto L_0x01d4
        L_0x01cf:
            r1 = 0
            r12 = 0
            r4 = 0
            r2 = 0
            goto L_0x01f0
        L_0x01d4:
            int r12 = r11.A02()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r12)     // Catch:{ Exception -> 0x03eb }
            int r4 = r11.A02()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r4)     // Catch:{ Exception -> 0x03eb }
            int r2 = r11.A02()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r2)     // Catch:{ Exception -> 0x03eb }
            int r1 = r11.A02()     // Catch:{ Exception -> 0x03eb }
            X.V62.A00(r1)     // Catch:{ Exception -> 0x03eb }
        L_0x01f0:
            int r13 = r0.position()     // Catch:{ Exception -> 0x03eb }
            int r11 = r11.A00     // Catch:{ Exception -> 0x03eb }
            X.VQt r24 = new X.VQt     // Catch:{ Exception -> 0x03eb }
            r0 = r24
            r0.<init>(r13, r11)     // Catch:{ Exception -> 0x03eb }
            r23 = 2
            int r22 = 2 - r16
            if (r5 == r14) goto L_0x0223
            if (r6 == 0) goto L_0x0223
            if (r5 != 0) goto L_0x020f
            if (r6 <= 0) goto L_0x020f
            if (r6 == r14) goto L_0x0214
            r0 = r23
            if (r6 == r0) goto L_0x0214
        L_0x020f:
            r21 = 1
        L_0x0211:
            r22 = 1
            goto L_0x0229
        L_0x0214:
            int r12 = r12 * 2
            int r4 = r4 * 2
            r21 = 2
            if (r6 != r14) goto L_0x0211
            int r2 = r2 * 2
            int r1 = r1 * 2
            r22 = 2
            goto L_0x0229
        L_0x0223:
            int r1 = r1 * r22
            int r2 = r2 * r22
            r21 = 1
        L_0x0229:
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x03eb }
            r0.<init>(r12, r2, r4, r1)     // Catch:{ Exception -> 0x03eb }
            X.0qQ.A0A(r9)     // Catch:{ Exception -> 0x03eb }
            X.0qQ.A0A(r15)     // Catch:{ Exception -> 0x03eb }
            X.0qQ.A0A(r3)     // Catch:{ Exception -> 0x03eb }
            X.0qQ.A0A(r24)     // Catch:{ Exception -> 0x03eb }
            X.0qQ.A0A(r0)     // Catch:{ Exception -> 0x03eb }
            r1 = r23
            X.0qQ.A0B(r15, r1)     // Catch:{ Exception -> 0x03eb }
            int r6 = r7.left     // Catch:{ Exception -> 0x03eb }
            int r1 = r6 % r21
            boolean r1 = X.AnonymousClass7TF.A1Q(r1)
            java.lang.String r11 = "Check failed."
            if (r1 == 0) goto L_0x03c2
            int r5 = r7.right     // Catch:{ Exception -> 0x03eb }
            int r1 = r5 % r21
            if (r1 != 0) goto L_0x03bc
            int r4 = r7.top     // Catch:{ Exception -> 0x03eb }
            int r1 = r4 % r22
            if (r1 != 0) goto L_0x03b6
            int r2 = r7.bottom     // Catch:{ Exception -> 0x03eb }
            int r1 = r2 % r22
            if (r1 != 0) goto L_0x03b0
            int r13 = r0.left     // Catch:{ Exception -> 0x03eb }
            int r13 = r13 + r6
            int r12 = r0.right     // Catch:{ Exception -> 0x03eb }
            int r12 = r12 + r5
            int r11 = r0.top     // Catch:{ Exception -> 0x03eb }
            int r11 = r11 + r4
            int r7 = r0.bottom     // Catch:{ Exception -> 0x03eb }
            int r7 = r7 + r2
            r20 = 8
            java.nio.ByteBuffer r0 = r9.A01     // Catch:{ Exception -> 0x03eb }
            r25 = r0
            int r0 = r25.limit()     // Catch:{ Exception -> 0x03eb }
            int r0 = r0 + 5
            X.Vl3 r6 = new X.Vl3     // Catch:{ Exception -> 0x03eb }
            r6.<init>(r0)     // Catch:{ Exception -> 0x03eb }
            X.Vvf r5 = new X.Vvf     // Catch:{ Exception -> 0x03eb }
            r0 = r25
            r5.<init>(r0)     // Catch:{ Exception -> 0x03eb }
            r2 = 0
            int r0 = r3.A01     // Catch:{ all -> 0x03a5 }
            int r1 = r0 + -1
        L_0x0289:
            if (r2 >= r1) goto L_0x029c
            int r0 = r5.A00     // Catch:{ all -> 0x03a5 }
            if (r0 <= 0) goto L_0x0292
            X.C18640Vvf.A00(r5)     // Catch:{ all -> 0x03a5 }
        L_0x0292:
            int r0 = X.C18640Vvf.A00(r5)     // Catch:{ all -> 0x03a5 }
            r6.A02(r0)     // Catch:{ all -> 0x03a5 }
            int r2 = r2 + 1
            goto L_0x0289
        L_0x029c:
            int r4 = r3.A00     // Catch:{ all -> 0x03a5 }
            if (r4 <= 0) goto L_0x02bd
            int r1 = r5.A03(r4)     // Catch:{ all -> 0x03a5 }
            int r0 = 8 - r4
            int r1 = r1 << r0
            long r2 = (long) r1
            long r18 = r2 >> r20
            r16 = 0
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.String r0 = "out of range: %s"
            X.17k.A05(r2, r0, r1)     // Catch:{ all -> 0x03a5 }
            int r0 = (int) r2     // Catch:{ all -> 0x03a5 }
            byte r0 = (byte) r0     // Catch:{ all -> 0x03a5 }
            r6.A00 = r0     // Catch:{ all -> 0x03a5 }
            r6.A01 = r4     // Catch:{ all -> 0x03a5 }
        L_0x02bd:
            r5.A01 = r10     // Catch:{ Exception -> 0x03eb }
            r5.A00 = r10     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r0 = r5.A02     // Catch:{ Exception -> 0x03eb }
            r0.reset()     // Catch:{ Exception -> 0x03eb }
            if (r13 > 0) goto L_0x02cf
            if (r12 > 0) goto L_0x02cf
            if (r11 > 0) goto L_0x02cf
            if (r7 > 0) goto L_0x02cf
            goto L_0x02e7
        L_0x02cf:
            r6.A01(r14)     // Catch:{ Exception -> 0x03eb }
            int r13 = r13 / r21
            r6.A03(r13)     // Catch:{ Exception -> 0x03eb }
            int r12 = r12 / r21
            r6.A03(r12)     // Catch:{ Exception -> 0x03eb }
            int r11 = r11 / r22
            r6.A03(r11)     // Catch:{ Exception -> 0x03eb }
            int r7 = r7 / r22
            r6.A03(r7)     // Catch:{ Exception -> 0x03eb }
            goto L_0x02ea
        L_0x02e7:
            r6.A01(r10)     // Catch:{ Exception -> 0x03eb }
        L_0x02ea:
            X.Vvf r3 = new X.Vvf     // Catch:{ Exception -> 0x03eb }
            r0 = r25
            r3.<init>(r0)     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r4 = r3.A02     // Catch:{ all -> 0x03a3 }
            r0 = r24
            int r0 = r0.A01     // Catch:{ all -> 0x03a3 }
            r4.position(r0)     // Catch:{ all -> 0x03a3 }
            int r0 = r0 + -1
            byte r0 = r4.get(r0)     // Catch:{ all -> 0x03a3 }
            r0 = r0 & 255(0xff, float:3.57E-43)
            r3.A01 = r0     // Catch:{ all -> 0x03a3 }
            r0 = r24
            int r0 = r0.A00     // Catch:{ all -> 0x03a3 }
            r3.A00 = r0     // Catch:{ all -> 0x03a3 }
            if (r0 <= 0) goto L_0x0316
            int r2 = 8 - r0
            int r0 = r3.A03(r2)     // Catch:{ all -> 0x03a3 }
            long r0 = (long) r0     // Catch:{ all -> 0x03a3 }
        L_0x0313:
            r6.A04(r2, r0)     // Catch:{ all -> 0x03a3 }
        L_0x0316:
            int r0 = r3.A00     // Catch:{ all -> 0x03a3 }
            if (r0 <= 0) goto L_0x031d
            X.C18640Vvf.A00(r3)     // Catch:{ all -> 0x03a3 }
        L_0x031d:
            int r1 = X.C18640Vvf.A00(r3)     // Catch:{ all -> 0x03a3 }
            r0 = -1
            if (r1 == r0) goto L_0x0328
            long r0 = (long) r1     // Catch:{ all -> 0x03a3 }
            r2 = r20
            goto L_0x0313
        L_0x0328:
            r3.A01 = r10     // Catch:{ Exception -> 0x03eb }
            r3.A00 = r10     // Catch:{ Exception -> 0x03eb }
            r4.reset()     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r2 = r9.A00     // Catch:{ Exception -> 0x03eb }
            r6.A00()     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r1 = r6.A02     // Catch:{ Exception -> 0x03eb }
            r1.flip()     // Catch:{ Exception -> 0x03eb }
            X.Vrs r0 = new X.Vrs     // Catch:{ Exception -> 0x03eb }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r2 = r0.A00     // Catch:{ Exception -> 0x03eb }
            int r1 = r2.limit()     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r4 = r0.A01     // Catch:{ Exception -> 0x03eb }
            int r0 = r4.limit()     // Catch:{ Exception -> 0x03eb }
            int r0 = r0 * 2
            int r1 = r1 + r0
            X.Vl3 r3 = new X.Vl3     // Catch:{ Exception -> 0x03eb }
            r3.<init>(r1)     // Catch:{ Exception -> 0x03eb }
            r3.A05(r2)     // Catch:{ Exception -> 0x03eb }
            r4.mark()     // Catch:{ Exception -> 0x03eb }
        L_0x0358:
            r2 = 0
        L_0x0359:
            int r1 = r4.position()     // Catch:{ Exception -> 0x03eb }
            int r0 = r4.limit()     // Catch:{ Exception -> 0x03eb }
            if (r1 >= r0) goto L_0x037b
            byte r0 = r4.get()     // Catch:{ Exception -> 0x03eb }
            r1 = r0 & 255(0xff, float:3.57E-43)
            if (r1 > r8) goto L_0x0373
            r0 = r23
            if (r2 < r0) goto L_0x0373
            r3.A02(r8)     // Catch:{ Exception -> 0x03eb }
            r2 = 0
        L_0x0373:
            r3.A02(r1)     // Catch:{ Exception -> 0x03eb }
            int r2 = r2 + 1
            if (r1 == 0) goto L_0x0359
            goto L_0x0358
        L_0x037b:
            r4.reset()     // Catch:{ Exception -> 0x03eb }
            r3.A00()     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r2 = r3.A02     // Catch:{ Exception -> 0x03eb }
            r2.flip()     // Catch:{ Exception -> 0x03eb }
            int r1 = r2.limit()     // Catch:{ Exception -> 0x03eb }
            int r0 = r15.limit()     // Catch:{ Exception -> 0x03eb }
            int r1 = r1 + r0
            X.Vl3 r0 = new X.Vl3     // Catch:{ Exception -> 0x03eb }
            r0.<init>(r1)     // Catch:{ Exception -> 0x03eb }
            r0.A05(r2)     // Catch:{ Exception -> 0x03eb }
            r0.A05(r15)     // Catch:{ Exception -> 0x03eb }
            r0.A00()     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r0 = r0.A02     // Catch:{ Exception -> 0x03eb }
            r0.flip()     // Catch:{ Exception -> 0x03eb }
            goto L_0x03f6
        L_0x03a3:
            r1 = move-exception
            goto L_0x03e1
        L_0x03a5:
            r1 = move-exception
            r5.A01 = r10     // Catch:{ Exception -> 0x03eb }
            r5.A00 = r10     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r0 = r5.A02     // Catch:{ Exception -> 0x03eb }
            r0.reset()     // Catch:{ Exception -> 0x03eb }
            goto L_0x03ea
        L_0x03b0:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x03eb }
            r1.<init>(r11)     // Catch:{ Exception -> 0x03eb }
            goto L_0x03ea
        L_0x03b6:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x03eb }
            r1.<init>(r11)     // Catch:{ Exception -> 0x03eb }
            goto L_0x03ea
        L_0x03bc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x03eb }
            r1.<init>(r11)     // Catch:{ Exception -> 0x03eb }
            goto L_0x03ea
        L_0x03c2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ Exception -> 0x03eb }
            r1.<init>(r11)     // Catch:{ Exception -> 0x03eb }
            goto L_0x03ea
        L_0x03c8:
            java.lang.String r2 = "Not SPS, NALU type = "
            java.lang.Object r0 = r3.first     // Catch:{ Exception -> 0x03eb }
            X.Vrs r0 = (X.C18445Vrs) r0     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r1 = r0.A00     // Catch:{ Exception -> 0x03eb }
            int r0 = r1.limit()     // Catch:{ Exception -> 0x03eb }
            int r0 = r0 + -1
            byte r0 = r1.get(r0)     // Catch:{ Exception -> 0x03eb }
            r0 = r0 & 31
            java.lang.IllegalArgumentException r1 = X.DbW.A0a(r2, r0)     // Catch:{ Exception -> 0x03eb }
            goto L_0x03ea
        L_0x03e1:
            r3.A01 = r10     // Catch:{ Exception -> 0x03eb }
            r3.A00 = r10     // Catch:{ Exception -> 0x03eb }
            java.nio.ByteBuffer r0 = r3.A02     // Catch:{ Exception -> 0x03eb }
            r0.reset()     // Catch:{ Exception -> 0x03eb }
        L_0x03ea:
            throw r1     // Catch:{ Exception -> 0x03eb }
        L_0x03eb:
            r3 = move-exception
            java.lang.Class<X.WIV> r2 = X.WIV.class
            java.lang.String r1 = "Failed to rewrite SPS"
            java.lang.Object[] r0 = new java.lang.Object[r10]     // Catch:{ all -> 0x03fc }
            X.0KC.A07(r2, r1, r3, r0)     // Catch:{ all -> 0x03fc }
            goto L_0x03f8
        L_0x03f6:
            r27 = r0
        L_0x03f8:
            android.os.SystemClock.elapsedRealtime()
            return r27
        L_0x03fc:
            r0 = move-exception
            android.os.SystemClock.elapsedRealtime()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WIV.CIi(java.nio.ByteBuffer):java.nio.ByteBuffer");
    }

    public final VideoEncoderConfig CJQ(VideoEncoderConfig videoEncoderConfig) {
        VideoEncoderConfig videoEncoderConfig2 = videoEncoderConfig;
        int i = videoEncoderConfig2.width;
        int i2 = i;
        int i3 = videoEncoderConfig2.height;
        int i4 = i3;
        if (i % 16 != 0) {
            i = ((i / 16) + 1) * 16;
        }
        if (i3 % 16 != 0) {
            i3 = ((i3 / 16) + 1) * 16;
        }
        this.A00 = new Rect(0, i3 - i4, i - i2, 0);
        return new VideoEncoderConfig(i, i3, videoEncoderConfig2.bitRate, videoEncoderConfig2.frameRate, videoEncoderConfig2.videoProfile, videoEncoderConfig2.videoBitrateMode, videoEncoderConfig2.iFrameInterval, videoEncoderConfig2.enableAndroidEncoderLowLatencyControl, videoEncoderConfig2.keyLatency, videoEncoderConfig2.keyPriority);
    }

    public final int BnR() {
        return 2;
    }

    public static void A00(C18640Vvf vvf) {
        V62.A00(vvf.A02());
    }
}
