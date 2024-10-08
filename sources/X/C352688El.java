package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.8El  reason: invalid class name and case insensitive filesystem */
public final class C352688El implements C352698Em {
    public String A00;
    public String A01;
    public String A02;
    public C348057xo A03;
    public C348057xo A04;
    public Map A05;
    public C348037xm A06;
    public final CountDownLatch A07 = new CountDownLatch(1);
    public final AnonymousClass8CN A08;

    public C352688El(AnonymousClass8CN r3) {
        this.A08 = r3;
    }

    public final List C8T(List list) {
        0qQ.A0B(list, 0);
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            if (next instanceof AnonymousClass9ZD) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next2 : arrayList) {
            Float f = ((AnonymousClass9ZD) next2).A00;
            if (f != null && f.floatValue() > 1.0E-6f) {
                arrayList2.add(next2);
            }
        }
        return arrayList2;
    }

    /* JADX WARNING: type inference failed for: r1v25, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v26, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (CaO() == false) goto L_0x0021;
     */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01cb  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x0169 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta E3V(X.A9Y r24, java.util.List r25, X.0sP r26) {
        /*
            r23 = this;
            r10 = 0
            r9 = 1
            r5 = 2
            r7 = r23
            boolean r0 = r7.CaO()
            r6 = r26
            if (r0 != 0) goto L_0x002c
            X.9s7 r0 = X.C390959s7.LOADING_MODEL
            r6.invoke(r0)
            java.util.concurrent.CountDownLatch r3 = r7.A07
            r0 = 2
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            r3.await(r0, r2)
            boolean r0 = r7.CaO()
            if (r0 != 0) goto L_0x002c
        L_0x0021:
            X.XUJ r1 = new X.XUJ
            r1.<init>()
            X.XHE r0 = new X.XHE
            r0.<init>(r1)
            return r0
        L_0x002c:
            X.7xm r0 = r7.A06
            if (r0 != 0) goto L_0x0038
            A00(r7)     // Catch:{ Exception -> 0x02ac }
            X.9s7 r0 = X.C390959s7.CONCEPT_MAP_READY     // Catch:{ Exception -> 0x02ac }
            r6.invoke(r0)     // Catch:{ Exception -> 0x02ac }
        L_0x0038:
            X.7xm r2 = r7.A06
            if (r2 == 0) goto L_0x0021
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            X.9s7 r0 = X.C390959s7.PREPARING_INPUT_TENSOR
            r6.invoke(r0)
            java.util.List r0 = X.C39631A2v.A00
            r0 = r25
            java.lang.Object r1 = r0.get(r10)
            r0 = 330(0x14a, float:4.62E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0C(r1, r0)
            X.XH4 r1 = (X.XH4) r1
            android.graphics.Bitmap r4 = r1.A00
            X.0qQ.A0B(r4, r10)
            int r0 = r4.getWidth()
            r1 = 224(0xe0, float:3.14E-43)
            if (r0 == r1) goto L_0x009c
            int r0 = r4.getHeight()
            if (r0 == r1) goto L_0x009c
            int r12 = r4.getWidth()
            int r11 = r4.getHeight()
            r3 = 1130364928(0x43600000, float:224.0)
            float r0 = (float) r12
            float r1 = r3 / r0
            float r0 = (float) r11
            float r3 = r3 / r0
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r0.postScale(r1, r3)
            X.0fO.A03(r4)
            r13 = r4
            r14 = r10
            r15 = r10
            r16 = r12
            r17 = r11
            r18 = r0
            r19 = r10
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r13, r14, r15, r16, r17, r18, r19)
            X.0qQ.A07(r0)
            r4.recycle()
            r4 = r0
        L_0x009c:
            int r3 = r4.getWidth()
            int r12 = r4.getHeight()
            int r14 = r12 * r3
            int[] r13 = new int[r14]
            r19 = r10
            r20 = r10
            r21 = r3
            r22 = r12
            r17 = r10
            r18 = r3
            r15 = r4
            r16 = r13
            r15.getPixels(r16, r17, r18, r19, r20, r21, r22)
            int r17 = r14 * 2
            int r0 = r3 * 3
            int r0 = r0 * r12
            java.nio.FloatBuffer r11 = org.pytorch.Tensor.allocateFloatBuffer(r0)
            r4 = 0
        L_0x00c4:
            if (r4 >= r14) goto L_0x00ed
            r1 = r13[r4]
            int r0 = r1 >> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            float r0 = (float) r0
            r16 = 1132396544(0x437f0000, float:255.0)
            float r0 = r0 / r16
            int r15 = r1 >> 8
            r15 = r15 & 255(0xff, float:3.57E-43)
            float r15 = (float) r15
            float r15 = r15 / r16
            r1 = r1 & 255(0xff, float:3.57E-43)
            float r1 = (float) r1
            float r1 = r1 / r16
            r11.put(r4, r0)
            int r0 = r14 + r4
            r11.put(r0, r15)
            int r0 = r17 + r4
            r11.put(r0, r1)
            int r4 = r4 + 1
            goto L_0x00c4
        L_0x00ed:
            r0 = 4
            long[] r4 = new long[r0]
            r0 = 1
            r4[r10] = r0
            r0 = 3
            r4[r9] = r0
            long r0 = (long) r12
            r4[r5] = r0
            long r0 = (long) r3
            r3 = 3
            r4[r3] = r0
            X.XF6 r0 = X.XF6.CONTIGUOUS
            org.pytorch.Tensor r1 = org.pytorch.Tensor.fromBlob((java.nio.FloatBuffer) r11, (long[]) r4, (X.XF6) r0)
            X.9s7 r0 = X.C390959s7.INPUT_TENSOR_READY
            r6.invoke(r0)
            org.pytorch.IValue r0 = org.pytorch.IValue.from((org.pytorch.Tensor) r1)
            org.pytorch.IValue[] r1 = new org.pytorch.IValue[]{r0}
            X.8EJ r0 = r2.A00
            org.pytorch.IValue r4 = r0.forward(r1)
            X.7xr r1 = X.C348087xr.A0A
            X.7xo r0 = r7.A04
            X.0eP r3 = new X.0eP
            r3.<init>(r1, r0)
            X.7xr r2 = X.C348087xr.A06
            X.7xo r1 = r7.A03
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r1)
            X.0eP[] r0 = new X.0eP[]{r3, r0}
            java.util.LinkedHashMap r7 = X.0Yt.A06(r0)
            X.9s7 r0 = X.C390959s7.OUTPUT_TENSOR_READY
            r6.invoke(r0)
            X.0qQ.A0A(r4)
            r0 = r24
            java.util.List r2 = r0.A00
            r6 = 15
            X.0qQ.A0B(r4, r10)
            X.0qQ.A0B(r7, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            boolean r0 = r4.isTuple()
            if (r0 == 0) goto L_0x029d
            org.pytorch.IValue[] r1 = r4.toTuple()
            X.0qQ.A07(r1)
            int r0 = r1.length
            if (r0 == 0) goto L_0x029d
            r0 = r1[r10]
            if (r0 == 0) goto L_0x029d
            org.pytorch.IValue[] r14 = r0.toTuple()
            if (r14 == 0) goto L_0x029d
            java.util.Iterator r13 = r2.iterator()
        L_0x0169:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x029d
            java.lang.Object r0 = r13.next()
            java.lang.String r0 = (java.lang.String) r0
            X.7xr r3 = X.C348087xr.valueOf(r0)
            X.7xs r12 = r3.A01
            X.0sm r2 = X.0Yt.A0E()
            int r0 = r3.ordinal()
            switch(r0) {
                case 0: goto L_0x01a2;
                case 1: goto L_0x01a2;
                case 2: goto L_0x01b6;
                case 3: goto L_0x01b6;
                case 4: goto L_0x01b6;
                case 5: goto L_0x018c;
                default: goto L_0x0186;
            }
        L_0x0186:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x018c:
            r4 = 0
            int r0 = r3.A00
            r0 = r14[r0]
            org.pytorch.Tensor r0 = r0.toTensor()
            float[] r1 = r0.getDataAsFloatArray()
            X.9ZD r0 = new X.9ZD
            r0.<init>(r12, r4, r4, r1)
            r5.add(r0)
            goto L_0x01c7
        L_0x01a2:
            java.lang.Object r0 = r7.get(r3)
            if (r0 != 0) goto L_0x01a9
            r0 = 0
        L_0x01a9:
            X.7xo r0 = (X.C348057xo) r0
            if (r0 == 0) goto L_0x0169
            X.7xq r0 = r0.A00
            if (r0 == 0) goto L_0x0169
            java.util.Map r2 = r0.A00
            if (r2 != 0) goto L_0x01c7
            goto L_0x0169
        L_0x01b6:
            java.lang.String r2 = r3.A02
            if (r2 == 0) goto L_0x0169
            java.lang.Integer r1 = java.lang.Integer.valueOf(r10)
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r1)
            java.util.Map r2 = X.0se.A0M(r0)
        L_0x01c7:
            X.7xr r0 = X.C348087xr.A07
            if (r3 == r0) goto L_0x0169
            int r0 = r3.A00
            r1 = r14[r0]
            boolean r0 = r1.isTensor()
            if (r0 == 0) goto L_0x0169
            org.pytorch.Tensor r0 = r1.toTensor()
            float[] r3 = r0.getDataAsFloatArray()
            int r0 = r2.size()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
            java.util.Set r0 = r2.entrySet()
            java.util.Iterator r11 = r0.iterator()
        L_0x01ee:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x0224
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r2 = r0.getKey()
            X.0qQ.A0A(r3)
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            X.0qQ.A0B(r3, r10)
            if (r1 < 0) goto L_0x0222
            int r0 = r3.length
            if (r1 >= r0) goto L_0x0222
            r0 = r3[r1]
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x0219:
            X.0eP r0 = new X.0eP
            r0.<init>(r2, r1)
            r4.add(r0)
            goto L_0x01ee
        L_0x0222:
            r1 = 0
            goto L_0x0219
        L_0x0224:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r4.iterator()
        L_0x022d:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0251
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.0eP r0 = (X.0eP) r0
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x022d
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x024d
            float r0 = r0.floatValue()
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 != r9) goto L_0x024d
            goto L_0x022d
        L_0x024d:
            r3.add(r1)
            goto L_0x022d
        L_0x0251:
            X.ArD r0 = new X.ArD
            r0.<init>()
            java.util.List r0 = X.00k.A0g(r3, r0)
            java.util.List r1 = X.00k.A0d(r0, r6)
            r0 = 10
            int r0 = X.0Yv.A1E(r1, r0)
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x026d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x028b
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
            goto L_0x026d
        L_0x028b:
            java.util.Iterator r1 = r11.iterator()
        L_0x028f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0169
            java.lang.Object r0 = r1.next()
            r5.add(r0)
            goto L_0x028f
        L_0x029d:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0021
            r8.addAll(r5)
            X.9ZE r0 = new X.9ZE
            r0.<init>(r8)
            return r0
        L_0x02ac:
            r2 = move-exception
            X.9s7 r0 = X.C390959s7.UNABLE_TO_LOAD_MODEL
            r6.invoke(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r0 = 455(0x1c7, float:6.38E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.append(r0)
            r1.append(r2)
            r1.toString()
            X.XUJ r1 = new X.XUJ
            r1.<init>()
            X.XHE r0 = new X.XHE
            r0.<init>(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352688El.E3V(X.A9Y, java.util.List, X.0sP):X.9ta");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        X.1zE.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C352688El r4) {
        /*
            java.lang.String r0 = r4.A01     // Catch:{ Exception -> 0x008b }
            X.7xm r0 = X.C347997xi.A00(r0)     // Catch:{ Exception -> 0x008b }
            r4.A06 = r0     // Catch:{ Exception -> 0x008b }
            java.lang.String r0 = r4.A02     // Catch:{ Exception -> 0x008b }
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r0 == 0) goto L_0x0039
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x008b }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ all -> 0x0065 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0065 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0065 }
            boolean r0 = r1 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x002f
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ all -> 0x0065 }
        L_0x0020:
            java.lang.String r0 = X.1r9.A00(r1)     // Catch:{ all -> 0x0065 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ all -> 0x0065 }
            X.7xo r0 = X.C348047xn.parseFromJson(r0)     // Catch:{ all -> 0x0065 }
            r4.A04 = r0     // Catch:{ all -> 0x0065 }
            goto L_0x0036
        L_0x002f:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0065 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0065 }
            r1 = r0
            goto L_0x0020
        L_0x0036:
            r2.close()     // Catch:{ Exception -> 0x008b }
        L_0x0039:
            java.lang.String r0 = r4.A00     // Catch:{ Exception -> 0x008b }
            if (r0 == 0) goto L_0x006f
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ Exception -> 0x008b }
            r2.<init>(r0)     // Catch:{ Exception -> 0x008b }
            java.nio.charset.Charset r0 = X.AnonymousClass15Q.A05     // Catch:{ all -> 0x0065 }
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch:{ all -> 0x0065 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x0065 }
            boolean r0 = r1 instanceof java.io.BufferedReader     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x005e
            java.io.BufferedReader r1 = (java.io.BufferedReader) r1     // Catch:{ all -> 0x0065 }
        L_0x004f:
            java.lang.String r0 = X.1r9.A00(r1)     // Catch:{ all -> 0x0065 }
            X.16F r0 = X.16P.A00(r0)     // Catch:{ all -> 0x0065 }
            X.7xo r0 = X.C348047xn.parseFromJson(r0)     // Catch:{ all -> 0x0065 }
            r4.A03 = r0     // Catch:{ all -> 0x0065 }
            goto L_0x006c
        L_0x005e:
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch:{ all -> 0x0065 }
            r0.<init>(r1, r3)     // Catch:{ all -> 0x0065 }
            r1 = r0
            goto L_0x004f
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.1zE.A00(r2, r1)     // Catch:{ Exception -> 0x008b }
            throw r0     // Catch:{ Exception -> 0x008b }
        L_0x006c:
            r2.close()     // Catch:{ Exception -> 0x008b }
        L_0x006f:
            X.7xr r1 = X.C348087xr.A0A     // Catch:{ Exception -> 0x008b }
            X.7xo r0 = r4.A04     // Catch:{ Exception -> 0x008b }
            X.0eP r3 = new X.0eP     // Catch:{ Exception -> 0x008b }
            r3.<init>(r1, r0)     // Catch:{ Exception -> 0x008b }
            X.7xr r2 = X.C348087xr.A06     // Catch:{ Exception -> 0x008b }
            X.7xo r1 = r4.A03     // Catch:{ Exception -> 0x008b }
            X.0eP r0 = new X.0eP     // Catch:{ Exception -> 0x008b }
            r0.<init>(r2, r1)     // Catch:{ Exception -> 0x008b }
            X.0eP[] r0 = new X.0eP[]{r3, r0}     // Catch:{ Exception -> 0x008b }
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)     // Catch:{ Exception -> 0x008b }
            r4.A05 = r0     // Catch:{ Exception -> 0x008b }
        L_0x008b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352688El.A00(X.8El):void");
    }

    public final boolean CaO() {
        if (this.A07.getCount() == 0) {
            return true;
        }
        return false;
    }

    public final void CgM() {
        this.A08.AUy(new C352708En(this), false);
    }
}
