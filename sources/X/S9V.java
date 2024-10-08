package X;

import android.net.Uri;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class S9V {
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x014a, code lost:
        if (r8.A05 != null) goto L_0x014c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C7232Q0d A00(X.C13725Tfv r35, X.C13725Tfv r36, com.facebook.videolite.transcoder.base.composition.MediaComposition r37, boolean r38, boolean r39, boolean r40) {
        /*
            java.lang.String r0 = "MediaCompositionMetadataExtractor.extractVideoMetadata"
            X.C349257zq.A03(r0)
            X.4aE r2 = X.C266714aE.VIDEO
            r10 = r37
            java.util.HashMap r0 = r10.A07(r2)
            if (r0 == 0) goto L_0x0189
            r9 = r2
        L_0x0010:
            r21 = r36
            r0 = r21
            long r19 = X.Q1Z.A00(r0, r9, r10)
            java.util.HashMap r12 = X.AnonymousClass7TE.A1E()
            r22 = r35
            r1 = r22
            A01(r1, r0, r2, r10, r12)
            X.4aE r3 = X.C266714aE.AUDIO
            A01(r1, r0, r3, r10, r12)
            r11 = 0
            if (r9 != r3) goto L_0x011b
            java.lang.Object r0 = r12.get(r3)
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r12.get(r3)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            r2 = 0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto L_0x0118
            java.lang.Object r0 = r12.get(r3)
            java.util.AbstractMap r0 = (java.util.AbstractMap) r0
            java.util.List r0 = X.Pxe.A1B(r1, r0)
            java.lang.Object r4 = r0.get(r2)
            X.Q0d r4 = (X.C7232Q0d) r4
        L_0x0052:
            if (r39 == 0) goto L_0x0191
            java.util.HashMap r0 = r10.A07(r9)
            if (r0 != 0) goto L_0x010e
            r14 = 0
        L_0x005b:
            r13 = 0
            if (r40 == 0) goto L_0x0088
            java.util.HashMap r0 = r10.A06(r9)
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r0)
        L_0x0066:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x010a
            java.lang.Object r0 = X.C51971G9r.A0p(r2)
            java.util.Iterator r1 = X.C51966G9m.A1H(r0)
        L_0x0074:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r1.next()
            X.SIO r0 = (X.SIO) r0
            com.facebook.videolite.transcoder.base.composition.MediaEffect r0 = r0.A01
            boolean r0 = r0.Esg()
            if (r0 == 0) goto L_0x0074
        L_0x0088:
            r18 = 0
        L_0x008a:
            r16 = 0
            r11 = 0
        L_0x008d:
            if (r11 >= r14) goto L_0x018d
            java.util.List r0 = r10.A08(r9, r11)
            r0.getClass()
            java.lang.Object r2 = r0.get(r13)
            X.4aI r2 = (X.C266754aI) r2
            boolean r0 = r2.A01(r13)
            r1 = r21
            if (r0 == 0) goto L_0x00a6
            r1 = r22
        L_0x00a6:
            r1.getClass()
            java.io.File r0 = r2.A04
            if (r0 == 0) goto L_0x0100
            java.io.File r0 = r2.A04
            java.lang.String r0 = r0.getCanonicalPath()
            android.net.Uri r0 = X.JTQ.A09(r0)
            X.Q0d r1 = r1.AU7(r0)
        L_0x00bb:
            if (r1 == 0) goto L_0x00e6
            boolean r0 = r2.A01(r13)
            long r7 = r1.A08
            if (r0 == 0) goto L_0x00e4
            if (r18 == 0) goto L_0x00ec
            long r0 = r2.A02
            int r15 = r2.A00
            long r2 = X.C10076RmE.A01
            long r0 = r0 - r2
            r5 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 >= 0) goto L_0x00d5
            r5 = r0
        L_0x00d5:
            if (r15 <= 0) goto L_0x00e9
            double r2 = X.Pxg.A00()
            double r0 = (double) r15
            double r2 = r2 / r0
            long r0 = (long) r2
        L_0x00de:
            long r5 = r5 / r0
            int r0 = (int) r5
            int r0 = r0 + 2
            long r0 = (long) r0
        L_0x00e3:
            long r7 = r7 * r0
        L_0x00e4:
            long r16 = r16 + r7
        L_0x00e6:
            int r11 = r11 + 1
            goto L_0x008d
        L_0x00e9:
            long r0 = X.C10076RmE.A00
            goto L_0x00de
        L_0x00ec:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            long r0 = r2.A02
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            long r2 = r3.convert(r0, r2)
            r0 = 1
            long r0 = java.lang.Math.max(r2, r0)
            long r7 = r7 * r0
            r0 = 30
            goto L_0x00e3
        L_0x0100:
            java.net.URL r0 = r2.A05
            X.C266784aL.A05(r0)
            X.Q0d r1 = r1.AU8(r0)
            goto L_0x00bb
        L_0x010a:
            r18 = 1
            goto L_0x008a
        L_0x010e:
            java.util.HashMap r0 = r10.A07(r9)
            int r14 = r0.size()
            goto L_0x005b
        L_0x0118:
            r4 = r11
            goto L_0x0052
        L_0x011b:
            java.util.HashMap r0 = r10.A07(r9)
            r0.getClass()
            int r7 = r0.size()
            r6 = 0
            r4 = 0
            r5 = -1
            r3 = 0
        L_0x012a:
            if (r3 >= r7) goto L_0x0177
            java.util.List r0 = r10.A08(r9, r3)
            r0.getClass()
            java.lang.Object r8 = r0.get(r6)
            X.4aI r8 = (X.C266754aI) r8
            boolean r0 = r8.A01(r6)
            r1 = r21
            if (r0 == 0) goto L_0x0143
            r1 = r22
        L_0x0143:
            java.io.File r0 = r8.A04
            if (r0 != 0) goto L_0x014c
            java.net.URL r0 = r8.A05
            r2 = 0
            if (r0 == 0) goto L_0x014d
        L_0x014c:
            r2 = 1
        L_0x014d:
            java.lang.String r0 = "file and url is null"
            X.C266784aL.A06(r2, r0)
            r1.getClass()
            java.io.File r0 = r8.A04
            if (r0 == 0) goto L_0x017f
            java.io.File r0 = r8.A04
            java.lang.String r0 = r0.getCanonicalPath()
            android.net.Uri r0 = X.JTQ.A09(r0)
            X.Q0d r2 = r1.AU7(r0)
        L_0x0167:
            if (r2 == 0) goto L_0x017c
            int r1 = r2.A05
            int r0 = r2.A03
            int r0 = java.lang.Math.min(r1, r0)
            if (r0 <= r5) goto L_0x0175
            r4 = r2
            r5 = r0
        L_0x0175:
            if (r38 != 0) goto L_0x017c
        L_0x0177:
            r4.getClass()
            goto L_0x0052
        L_0x017c:
            int r3 = r3 + 1
            goto L_0x012a
        L_0x017f:
            java.net.URL r0 = r8.A05
            X.C266784aL.A05(r0)
            X.Q0d r2 = r1.AU8(r0)
            goto L_0x0167
        L_0x0189:
            X.4aE r9 = X.C266714aE.AUDIO
            goto L_0x0010
        L_0x018d:
            java.lang.Long r11 = java.lang.Long.valueOf(r16)
        L_0x0191:
            r4.getClass()
            if (r11 == 0) goto L_0x01fd
            long r0 = r11.longValue()
        L_0x019a:
            r5 = 1000(0x3e8, double:4.94E-321)
            long r34 = r19 / r5
            int r2 = r4.A05
            r21 = r2
            int r2 = r4.A03
            r18 = r2
            int r2 = r4.A04
            r17 = r2
            int r15 = r4.A02
            int r14 = r4.A01
            r36 = 8
            long r36 = r36 * r0
            long r36 = r36 * r5
            long r36 = r36 * r5
            long r36 = r36 / r19
            int r13 = r4.A00
            com.facebook.videolite.transcoder.base.SphericalMetadata r11 = r4.A09
            java.lang.String r10 = r4.A0E
            java.lang.String r9 = r4.A0I
            java.lang.String r8 = r4.A0C
            java.lang.String r7 = r4.A0G
            java.lang.String r6 = r4.A0F
            java.lang.String r5 = r4.A0B
            java.lang.String r3 = r4.A0A
            r40 = 0
            java.lang.String r2 = r4.A0D
            java.lang.String r4 = r4.A0H
            X.Q0d r16 = new X.Q0d
            r25 = r2
            r26 = r4
            r27 = r12
            r28 = r21
            r29 = r18
            r30 = r17
            r31 = r15
            r32 = r14
            r33 = r13
            r38 = r0
            r18 = r10
            r19 = r9
            r20 = r8
            r21 = r7
            r22 = r6
            r23 = r5
            r24 = r3
            r17 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40)
            X.C349257zq.A01()
            return r16
        L_0x01fd:
            long r0 = r4.A08
            goto L_0x019a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S9V.A00(X.Tfv, X.Tfv, com.facebook.videolite.transcoder.base.composition.MediaComposition, boolean, boolean, boolean):X.Q0d");
    }

    public static void A01(C13725Tfv tfv, C13725Tfv tfv2, C266714aE r10, MediaComposition mediaComposition, HashMap hashMap) {
        C7232Q0d AU8;
        HashMap A07 = mediaComposition.A07(r10);
        if (A07 != null) {
            HashMap A1E = AnonymousClass7TE.A1E();
            hashMap.put(r10, A1E);
            Iterator A0s = AnonymousClass7TF.A0s(A07);
            while (A0s.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                ArrayList A1C = AnonymousClass7TE.A1C();
                A1E.put(A1J.getKey(), A1C);
                Iterator A16 = Pxg.A16(((C266794aM) A1J.getValue()).A04);
                while (A16.hasNext()) {
                    C266754aI r3 = (C266754aI) A16.next();
                    File file = r3.A04;
                    URL url = r3.A05;
                    if (r3.A01(false)) {
                        C266784aL.A06(AnonymousClass7TF.A1V(file), (String) null);
                        tfv.getClass();
                        C266784aL.A05(file);
                        AU8 = tfv.AU7(Uri.fromFile(file));
                    } else {
                        tfv2.getClass();
                        if (file != null) {
                            AU8 = tfv2.AU7(Uri.fromFile(file));
                        } else if (url != null) {
                            AU8 = tfv2.AU8(url);
                        }
                    }
                    A1C.add(AU8);
                }
            }
        }
    }
}
