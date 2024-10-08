package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class UII extends C19023WGz {
    public UIM A00;
    public final C17400VUb A01;
    public final C17399VUa A02;
    public final C17399VUa A03;
    public final HashMap A04 = new HashMap();
    public final int[] A05;
    public final W2K[] A06;

    public final C18556Vu8[] Aqy() {
        return this.A02.A02;
    }

    public final C18556Vu8[] BU2() {
        C17399VUa vUa = this.A03;
        if (vUa != null) {
            return vUa.A02;
        }
        return null;
    }

    public final int BaR(String str) {
        Number A14 = C51966G9m.A14("min_bitrate", this.A01.A01);
        if (A14 == null) {
            return -1;
        }
        return A14.intValue();
    }

    /* JADX WARNING: type inference failed for: r0v11, types: [java.lang.Object, X.V3H] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r1 == -1) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C10384RrL EIR(X.VXH r22) {
        /*
            r21 = this;
            r15 = r21
            X.VUa r0 = r15.A02
            int r12 = r0.A00
            X.VLQ[] r5 = r0.A01
            r3 = r22
            X.W2K[] r16 = X.C16776V5j.A00(r0, r3)
            int[] r7 = new int[r12]
            r4 = 0
            r14 = 0
        L_0x0012:
            r8 = -1
            if (r4 >= r12) goto L_0x0045
            r6 = r16[r4]
            if (r6 == 0) goto L_0x0044
            r0 = r5[r4]
            java.util.List r0 = r0.A00
            java.util.Iterator r2 = r0.iterator()
            r1 = 0
        L_0x0022:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r0 = r2.next()
            X.X5s r0 = (X.X5s) r0
            boolean r0 = r0.CmQ(r6)
            if (r0 == 0) goto L_0x0041
            if (r1 == r8) goto L_0x0044
            r7[r4] = r1
            int[] r0 = r15.A05
            r0 = r0[r4]
            int r14 = r14 * r0
            int r14 = r14 + r1
            int r4 = r4 + 1
            goto L_0x0012
        L_0x0041:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x0044:
            r14 = -1
        L_0x0045:
            r17 = 0
            X.VUa r0 = r15.A03
            if (r0 == 0) goto L_0x004f
            X.W2K[] r17 = X.C16776V5j.A00(r0, r3)
        L_0x004f:
            if (r14 < 0) goto L_0x00c5
            java.util.HashMap r6 = r15.A04
            monitor-enter(r6)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x00c2 }
            java.lang.Object r0 = r6.get(r5)     // Catch:{ all -> 0x00c2 }
            X.V3H r0 = (X.V3H) r0     // Catch:{ all -> 0x00c2 }
            monitor-exit(r6)     // Catch:{ all -> 0x00c2 }
            if (r0 != 0) goto L_0x00ce
            X.VUb r11 = r15.A01
            int r10 = r11.A00
            X.UIM r0 = r15.A00
            java.util.List r9 = r0.A03
            java.util.List r8 = r0.A00
            X.W2K[] r4 = new X.W2K[r10]
            r13 = 0
            r3 = 0
        L_0x006f:
            if (r3 >= r10) goto L_0x0086
            int r0 = r14 * r10
            int r0 = r0 + r3
            java.lang.String r2 = X.AnonymousClass7TE.A19(r9, r0)
            java.lang.String[] r0 = r11.A02
            r1 = r0[r3]
            X.W2K r0 = new X.W2K
            r0.<init>(r1, r2)
            r4[r3] = r0
            int r3 = r3 + 1
            goto L_0x006f
        L_0x0086:
            java.lang.String[] r3 = new java.lang.String[r12]
            java.util.Iterator r2 = r8.iterator()
        L_0x008c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00b0
            java.lang.Object r0 = r2.next()
            X.VsN r0 = (X.C18471VsN) r0
            java.util.List r1 = r0.A03
            if (r1 == 0) goto L_0x00ad
            r0 = r7[r13]
            java.lang.Object r0 = r1.get(r0)
            X.VUc r0 = (X.VUc) r0
            if (r0 == 0) goto L_0x00ad
            java.lang.String r0 = r0.A00
        L_0x00a8:
            r3[r13] = r0
            int r13 = r13 + 1
            goto L_0x008c
        L_0x00ad:
            java.lang.String r0 = ""
            goto L_0x00a8
        L_0x00b0:
            X.V3H r0 = new X.V3H
            r0.<init>()
            r0.A00 = r4
            r0.A01 = r3
            monitor-enter(r6)
            r6.put(r5, r0)     // Catch:{ all -> 0x00bf }
            monitor-exit(r6)     // Catch:{ all -> 0x00bf }
            goto L_0x00ce
        L_0x00bf:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00bf }
            throw r0
        L_0x00c2:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00c2 }
            throw r0
        L_0x00c5:
            X.W2K[] r2 = r15.A06
            java.lang.String r0 = "n/a"
            java.lang.String[] r1 = new java.lang.String[]{r0}
            goto L_0x00d2
        L_0x00ce:
            X.W2K[] r2 = r0.A00
            java.lang.String[] r1 = r0.A01
        L_0x00d2:
            X.X5t r14 = r15.A06
            int r0 = r15.A00
            r18 = r2
            r19 = r1
            r20 = r0
            r14.EAs(r15, r16, r17, r18, r19, r20)
            X.RrL r0 = new X.RrL
            r0.<init>(r15, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UII.EIR(X.VXH):X.RrL");
    }

    public UII(S7E s7e, X5t x5t, UIM uim, 0kX r13) {
        super(s7e, x5t, uim);
        C17399VUa vUa;
        this.A00 = uim;
        C17399VUa A002 = W0W.A00(r13, uim.A00);
        this.A02 = A002;
        List list = uim.A01;
        if (list == null || list.isEmpty()) {
            vUa = null;
        } else {
            vUa = W0W.A00(r13, uim.A01);
        }
        this.A03 = vUa;
        C17400VUb A012 = W0W.A01(uim.A02);
        this.A01 = A012;
        List list2 = uim.A04;
        int i = A012.A00;
        W2K[] w2kArr = new W2K[i];
        if (list2 == null || list2.size() != i) {
            throw new Exception("Missing default value");
        }
        int i2 = 0;
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            w2kArr[i2] = new W2K(A012.A02[i2], AnonymousClass7TE.A18(it));
            i2++;
        }
        this.A06 = w2kArr;
        int i3 = A002.A00;
        if (uim.A03 != null) {
            this.A05 = new int[i3];
            int i4 = 0;
            int i5 = 1;
            for (C18471VsN vsN : uim.A00) {
                List list3 = vsN.A03;
                if (list3 == null || list3.isEmpty()) {
                    throw new C16687V1q("Missing buckets", vsN.A00);
                }
                this.A05[i4] = vsN.A03.size();
                i5 *= this.A05[i4];
                i4++;
            }
            if (uim.A03.size() != i5 * i) {
                throw new Exception("Results vector size mismatch");
            }
            return;
        }
        throw new Exception("Missing vector");
    }
}
