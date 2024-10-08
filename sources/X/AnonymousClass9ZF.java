package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.9ZF  reason: invalid class name */
public final class AnonymousClass9ZF extends C22025XtK implements C352698Em {
    public String A00;
    public String A01;
    public String A02;
    public C348057xo A03;
    public C348057xo A04;
    public Map A05;
    public C39660A4a A06;
    public final AnonymousClass0eM A07 = AnonymousClass0eN.A00(0eO.A02, C41581Awv.A00);
    public final AnonymousClass8CN A08;

    public final List C8T(List list) {
        ArrayList A0q = AnonymousClass7TF.A0q(list, 0);
        for (Object next : list) {
            if (next instanceof AnonymousClass9ZD) {
                A0q.add(next);
            }
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next2 : A0q) {
            Float f = ((AnonymousClass9ZD) next2).A00;
            if (f != null && f.floatValue() > 1.0E-6f) {
                A1C.add(next2);
            }
        }
        return A1C;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0157  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00f5 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta E3V(X.A9Y r26, java.util.List r27, X.0sP r28) {
        /*
            r25 = this;
            r10 = 0
            r16 = 1
            r5 = r25
            java.lang.String r0 = r5.A01
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            if (r0 == 0) goto L_0x01f6
            A00(r5)
            X.A4a r2 = r5.A06
            if (r2 == 0) goto L_0x01f6
            X.0eM r4 = r5.A07
            r4.getValue()
            r0 = r27
            java.lang.Object r1 = r0.get(r10)
            r0 = 330(0x14a, float:4.62E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.XH4 r1 = (X.XH4) r1
            android.graphics.Bitmap r3 = r1.A00
            X.0qQ.A0B(r3, r10)
            int r0 = r3.getWidth()
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 == r1) goto L_0x0041
            int r0 = r3.getHeight()
            if (r0 == r1) goto L_0x0041
            android.graphics.Bitmap r3 = X.AnonymousClass7TG.A0K(r3)
        L_0x0041:
            r4.getValue()
            int r8 = r3.getWidth()
            int r9 = r3.getHeight()
            int r12 = r9 * r8
            int[] r11 = new int[r12]
            r6 = 0
            r21 = r10
            r22 = r10
            r23 = r8
            r24 = r9
            r19 = r10
            r20 = r8
            r17 = r3
            r18 = r11
            r17.getPixels(r18, r19, r20, r21, r22, r23, r24)
            int r15 = r12 * 2
            int r0 = r8 * 3
            int r0 = r0 * r9
            int r0 = r0 * 4
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r1.order(r0)
            java.nio.FloatBuffer r7 = r0.asFloatBuffer()
        L_0x007b:
            r3 = 2
            if (r6 >= r12) goto L_0x00a2
            r1 = r11[r6]
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r13 = (float) r0
            r14 = 1132396544(0x437f0000, float:255.0)
            float r13 = r13 / r14
            int r0 = r1 >> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r3 = (float) r0
            float r3 = r3 / r14
            r0 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r0
            float r1 = r1 / r14
            r7.put(r6, r13)
            int r0 = r12 + r6
            r7.put(r0, r3)
            int r0 = r15 + r6
            r7.put(r0, r1)
            int r6 = r6 + 1
            goto L_0x007b
        L_0x00a2:
            r0 = 4
            long[] r6 = new long[r0]
            r0 = 1
            r6[r10] = r0
            r0 = 3
            r6[r16] = r0
            long r0 = (long) r9
            r6[r3] = r0
            long r0 = (long) r8
            r9 = 3
            r6[r9] = r0
            org.pytorch.executorch.Tensor r0 = org.pytorch.executorch.Tensor.fromBlob((java.nio.FloatBuffer) r7, (long[]) r6)
            org.pytorch.executorch.EValue r0 = org.pytorch.executorch.EValue.from((org.pytorch.executorch.Tensor) r0)
            org.pytorch.executorch.EValue[] r1 = new org.pytorch.executorch.EValue[]{r0}
            org.pytorch.executorch.NativePeer r0 = r2.A00
            org.pytorch.executorch.EValue[] r8 = r0.forward(r1)
            X.9sW r1 = X.C391209sW.A0A
            X.7xo r0 = r5.A04
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r0)
            X.9sW r1 = X.C391209sW.A06
            X.7xo r0 = r5.A03
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)
            X.0eP[] r0 = new X.0eP[]{r2, r0}
            java.util.LinkedHashMap r7 = X.0Yt.A06(r0)
            r4.getValue()
            X.0qQ.A0A(r8)
            r0 = r26
            java.util.List r0 = r0.A00
            r6 = 15
            X.0qQ.A0B(r8, r10)
            java.util.ArrayList r5 = X.AnonymousClass7TF.A0q(r7, r3)
            java.util.Iterator r13 = r0.iterator()
        L_0x00f5:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x01f0
            java.lang.String r0 = X.AnonymousClass7TE.A18(r13)
            X.9sW r4 = X.C391209sW.valueOf(r0)
            X.7xs r12 = r4.A01
            X.0sm r2 = X.0Yt.A0E()
            int r0 = r4.A00
            java.lang.Object r0 = X.03t.A06(r8, r0)
            org.pytorch.executorch.EValue r0 = (org.pytorch.executorch.EValue) r0
            if (r0 == 0) goto L_0x00f5
            org.pytorch.executorch.Tensor r0 = r0.toTensor()
            if (r0 == 0) goto L_0x00f5
            float[] r3 = r0.getDataAsFloatArray()
            int r0 = r4.ordinal()
            switch(r0) {
                case 0: goto L_0x0136;
                case 1: goto L_0x0136;
                case 2: goto L_0x0129;
                case 3: goto L_0x0129;
                case 4: goto L_0x0129;
                case 5: goto L_0x014a;
                default: goto L_0x0124;
            }
        L_0x0124:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0129:
            java.lang.String r0 = r4.A02
            if (r0 == 0) goto L_0x00f5
            X.0eP r0 = X.AnonymousClass7TF.A0x(r0, r10)
            java.util.Map r2 = X.0se.A0M(r0)
            goto L_0x0153
        L_0x0136:
            java.lang.Object r0 = r7.get(r4)
            if (r0 != 0) goto L_0x013d
            r0 = 0
        L_0x013d:
            X.7xo r0 = (X.C348057xo) r0
            if (r0 == 0) goto L_0x00f5
            X.7xq r0 = r0.A00
            if (r0 == 0) goto L_0x00f5
            java.util.Map r2 = r0.A00
            if (r2 != 0) goto L_0x0153
            goto L_0x00f5
        L_0x014a:
            r1 = 0
            X.9ZD r0 = new X.9ZD
            r0.<init>(r12, r1, r1, r3)
            r5.add(r0)
        L_0x0153:
            X.9sW r0 = X.C391209sW.A07
            if (r4 == r0) goto L_0x00f5
            int r0 = r2.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Iterator r11 = X.AnonymousClass7TF.A0u(r2)
        L_0x0164:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x018e
            java.util.Map$Entry r0 = X.AnonymousClass7TE.A1J(r11)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            int r1 = X.AnonymousClass7TE.A0M(r0)
            X.0qQ.A0B(r3, r10)
            if (r1 < 0) goto L_0x018c
            int r0 = r3.length
            if (r1 >= r0) goto L_0x018c
            r0 = r3[r1]
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
        L_0x0188:
            X.AnonymousClass7TF.A1I(r2, r0, r4)
            goto L_0x0164
        L_0x018c:
            r0 = 0
            goto L_0x0188
        L_0x018e:
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r4.iterator()
        L_0x0196:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01ab
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0196
            r3.add(r1)
            goto L_0x0196
        L_0x01ab:
            X.TLw r0 = new X.TLw
            r0.<init>(r9)
            java.util.List r0 = X.00k.A0g(r3, r0)
            java.util.List r0 = X.00k.A0d(r0, r6)
            java.util.ArrayList r11 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r4 = r0.iterator()
        L_0x01c0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x01de
            java.lang.Object r0 = r4.next()
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r3 = r0.A00
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r0.A01
            java.lang.Float r2 = (java.lang.Float) r2
            r1 = 0
            X.9ZD r0 = new X.9ZD
            r0.<init>(r12, r2, r3, r1)
            r11.add(r0)
            goto L_0x01c0
        L_0x01de:
            java.util.Iterator r1 = r11.iterator()
        L_0x01e2:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00f5
            java.lang.Object r0 = r1.next()
            r5.add(r0)
            goto L_0x01e2
        L_0x01f0:
            X.9ZE r0 = new X.9ZE
            r0.<init>(r5)
            return r0
        L_0x01f6:
            X.XUJ r1 = new X.XUJ
            r1.<init>()
            X.XHE r0 = new X.XHE
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZF.E3V(X.A9Y, java.util.List, X.0sP):X.9ta");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0079, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007d, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.AnonymousClass9ZF r4) {
        /*
            X.A4a r0 = r4.A06
            if (r0 != 0) goto L_0x009b
            boolean r0 = r4.A08()
            if (r0 == 0) goto L_0x009b
            java.lang.String r1 = r4.A01     // Catch:{ Exception -> 0x009b }
            r0 = 1
            X.A4a r2 = X.C39660A4a.A00(r1, r0)     // Catch:{ Exception -> 0x009b }
            java.lang.String r1 = "forward"
            org.pytorch.executorch.NativePeer r0 = r2.A00     // Catch:{ Exception -> 0x009b }
            r0.loadMethod(r1)     // Catch:{ Exception -> 0x009b }
            r4.A06 = r2     // Catch:{ Exception -> 0x009b }
            java.lang.String r0 = r4.A02     // Catch:{ Exception -> 0x009b }
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x004b
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x009b }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ all -> 0x0077 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0077 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0077 }
            boolean r0 = r1 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0041
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ all -> 0x0077 }
        L_0x0032:
            java.lang.String r0 = X.1r9.A00(r1)     // Catch:{ all -> 0x0077 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ all -> 0x0077 }
            X.7xo r0 = X.C348047xn.parseFromJson(r0)     // Catch:{ all -> 0x0077 }
            r4.A04 = r0     // Catch:{ all -> 0x0077 }
            goto L_0x0048
        L_0x0041:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0077 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0077 }
            r1 = r0
            goto L_0x0032
        L_0x0048:
            r2.close()     // Catch:{ Exception -> 0x009b }
        L_0x004b:
            java.lang.String r0 = r4.A00     // Catch:{ Exception -> 0x009b }
            if (r0 == 0) goto L_0x0081
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x009b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x009b }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ all -> 0x0077 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0077 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0077 }
            boolean r0 = r1 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0070
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ all -> 0x0077 }
        L_0x0061:
            java.lang.String r0 = X.1r9.A00(r1)     // Catch:{ all -> 0x0077 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ all -> 0x0077 }
            X.7xo r0 = X.C348047xn.parseFromJson(r0)     // Catch:{ all -> 0x0077 }
            r4.A03 = r0     // Catch:{ all -> 0x0077 }
            goto L_0x007e
        L_0x0070:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0077 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0077 }
            r1 = r0
            goto L_0x0061
        L_0x0077:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0079 }
        L_0x0079:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ Exception -> 0x009b }
            throw r0     // Catch:{ Exception -> 0x009b }
        L_0x007e:
            r2.close()     // Catch:{ Exception -> 0x009b }
        L_0x0081:
            X.9sW r1 = X.C391209sW.A0A     // Catch:{ Exception -> 0x009b }
            X.7xo r0 = r4.A04     // Catch:{ Exception -> 0x009b }
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r0)     // Catch:{ Exception -> 0x009b }
            X.9sW r1 = X.C391209sW.A06     // Catch:{ Exception -> 0x009b }
            X.7xo r0 = r4.A03     // Catch:{ Exception -> 0x009b }
            X.0eP r0 = X.AnonymousClass7TE.A1L(r1, r0)     // Catch:{ Exception -> 0x009b }
            X.0eP[] r0 = new X.0eP[]{r2, r0}     // Catch:{ Exception -> 0x009b }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x009b }
            r4.A05 = r0     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9ZF.A00(X.9ZF):void");
    }

    public final boolean CaO() {
        return AnonymousClass7TF.A1V(this.A01);
    }

    public final void CgM() {
        this.A08.AUy(new C22130Xvu(this, 2), true);
    }

    public AnonymousClass9ZF(AnonymousClass8CN r3) {
        this.A08 = r3;
    }
}
