package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class S77 {
    public int A00;
    public int A01;
    public Q6I A02;
    public RE3 A03;
    public C13892TjF A04;
    public C11856Shi A05;
    public C10112Rmo A06;
    public S10 A07;
    public Class A08;
    public Class A09;
    public Object A0A;
    public Map A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final List A0G = AnonymousClass7TE.A1C();
    public final List A0H = AnonymousClass7TE.A1C();

    public final C13916TlI A00(Class cls) {
        C13916TlI tlI = (C13916TlI) this.A0B.get(cls);
        if (tlI != null) {
            return tlI;
        }
        Iterator A0u = AnonymousClass7TF.A0u(this.A0B);
        while (true) {
            if (!A0u.hasNext()) {
                break;
            }
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (((Class) A1J.getKey()).isAssignableFrom(cls)) {
                C13916TlI tlI2 = (C13916TlI) A1J.getValue();
                if (tlI2 != null) {
                    return tlI2;
                }
            }
        }
        if (!this.A0B.isEmpty() || !this.A0F) {
            return C11880SiD.A00;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Missing transformation for ");
        A1A.append(cls);
        throw Pxg.A0d(". If you wish to ignore unknown resource types, use the optional transformation methods.", A1A);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: X.S5t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v37, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v38, resolved type: X.S5t} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v39, resolved type: X.S5t} */
    /* JADX WARNING: type inference failed for: r0v11, types: [X.S5t, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C10924S1c A01(java.lang.Class r27) {
        /*
            r26 = this;
            r0 = r26
            X.S7e r13 = X.C13882Tj5.A00(r0)
            java.lang.Class r9 = r0.A08
            java.lang.Class r8 = r0.A09
            X.SEN r2 = r13.A05
            java.util.concurrent.atomic.AtomicReference r1 = r2.A01
            r12 = 0
            java.lang.Object r0 = r1.getAndSet(r12)
            X.S5t r0 = (X.S5t) r0
            if (r0 != 0) goto L_0x001c
            X.S5t r0 = new X.S5t
            r0.<init>()
        L_0x001c:
            r10 = r27
            r0.A00 = r10
            r0.A01 = r9
            r0.A02 = r8
            X.0yf r7 = r2.A00
            monitor-enter(r7)
            java.lang.Object r2 = r7.get(r0)     // Catch:{ all -> 0x0142 }
            X.S1c r2 = (X.C10924S1c) r2     // Catch:{ all -> 0x0142 }
            monitor-exit(r7)     // Catch:{ all -> 0x0142 }
            r1.set(r0)
            X.S1c r6 = X.SEN.A02
            boolean r0 = r6.equals(r2)
            if (r0 != 0) goto L_0x0141
            if (r2 != 0) goto L_0x0140
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            X.S12 r5 = r13.A07
            java.util.ArrayList r0 = r5.A00(r10, r9)
            java.util.Iterator r18 = r0.iterator()
        L_0x0049:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0111
            java.lang.Object r4 = r18.next()
            java.lang.Class r4 = (java.lang.Class) r4
            X.S09 r3 = r13.A02
            java.util.ArrayList r0 = r3.A00(r4, r8)
            java.util.Iterator r17 = r0.iterator()
        L_0x005f:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0049
            java.lang.Object r2 = r17.next()
            java.lang.Class r2 = (java.lang.Class) r2
            monitor-enter(r5)
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x010e }
            java.util.List r0 = r5.A00     // Catch:{ all -> 0x010e }
            java.util.Iterator r16 = r0.iterator()     // Catch:{ all -> 0x010e }
        L_0x0076:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x00ae
            java.lang.String r1 = X.AnonymousClass7TE.A18(r16)     // Catch:{ all -> 0x010e }
            java.util.Map r0 = r5.A01     // Catch:{ all -> 0x010e }
            java.util.List r0 = X.C66580MXl.A13(r1, r0)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x0076
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x010e }
        L_0x008c:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x0076
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x010e }
            X.Rtk r1 = (X.C10531Rtk) r1     // Catch:{ all -> 0x010e }
            java.lang.Class r0 = r1.A01     // Catch:{ all -> 0x010e }
            boolean r0 = r0.isAssignableFrom(r10)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x008c
            java.lang.Class r0 = r1.A02     // Catch:{ all -> 0x010e }
            boolean r0 = r4.isAssignableFrom(r0)     // Catch:{ all -> 0x010e }
            if (r0 == 0) goto L_0x008c
            X.Tf9 r0 = r1.A00     // Catch:{ all -> 0x010e }
            r14.add(r0)     // Catch:{ all -> 0x010e }
            goto L_0x008c
        L_0x00ae:
            monitor-exit(r5)
            monitor-enter(r3)
            boolean r0 = r2.isAssignableFrom(r4)     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00b9
            X.Sju r15 = X.C11979Sju.A00     // Catch:{ all -> 0x010b }
            goto L_0x00dd
        L_0x00b9:
            java.util.List r0 = r3.A00     // Catch:{ all -> 0x010b }
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x010b }
        L_0x00bf:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00f8
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x010b }
            X.Rtj r1 = (X.C10530Rtj) r1     // Catch:{ all -> 0x010b }
            java.lang.Class r0 = r1.A01     // Catch:{ all -> 0x010b }
            boolean r0 = r0.isAssignableFrom(r4)     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00bf
            java.lang.Class r0 = r1.A02     // Catch:{ all -> 0x010b }
            boolean r0 = r2.isAssignableFrom(r0)     // Catch:{ all -> 0x010b }
            if (r0 == 0) goto L_0x00bf
            X.TcA r15 = r1.A00     // Catch:{ all -> 0x010b }
        L_0x00dd:
            monitor-exit(r3)
            X.02U r1 = r13.A00
            X.S2e r0 = new X.S2e
            r23 = r4
            r24 = r2
            r25 = r14
            r19 = r0
            r20 = r1
            r21 = r15
            r22 = r10
            r19.<init>(r20, r21, r22, r23, r24, r25)
            r11.add(r0)
            goto L_0x005f
        L_0x00f8:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()     // Catch:{ all -> 0x010b }
            java.lang.String r0 = "No transcoder registered to transcode from "
            r1.append(r0)     // Catch:{ all -> 0x010b }
            r1.append(r4)     // Catch:{ all -> 0x010b }
            java.lang.String r0 = " to "
            java.lang.IllegalArgumentException r0 = X.C51973G9u.A0g(r2, r0, r1)     // Catch:{ all -> 0x010b }
            throw r0     // Catch:{ all -> 0x010b }
        L_0x010b:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x010e:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        L_0x0111:
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x011b
            r2 = r12
        L_0x0118:
            r1 = r2
            monitor-enter(r7)
            goto L_0x012a
        L_0x011b:
            X.02U r0 = r13.A00
            X.S1c r2 = new X.S1c
            r14 = r9
            r15 = r8
            r16 = r11
            r11 = r2
            r12 = r0
            r13 = r10
            r11.<init>(r12, r13, r14, r15, r16)
            goto L_0x0118
        L_0x012a:
            X.S5t r0 = new X.S5t     // Catch:{ all -> 0x013d }
            r0.<init>()     // Catch:{ all -> 0x013d }
            r0.A00 = r10     // Catch:{ all -> 0x013d }
            r0.A01 = r9     // Catch:{ all -> 0x013d }
            r0.A02 = r8     // Catch:{ all -> 0x013d }
            if (r2 != 0) goto L_0x0138
            r1 = r6
        L_0x0138:
            r7.put(r0, r1)     // Catch:{ all -> 0x013d }
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            return r2
        L_0x013d:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x013d }
            throw r0
        L_0x0140:
            return r2
        L_0x0141:
            return r12
        L_0x0142:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0142 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.S77.A01(java.lang.Class):X.S1c");
    }

    public final List A02() {
        if (!this.A0C) {
            this.A0C = true;
            List list = this.A0G;
            list.clear();
            List A032 = A03();
            int size = A032.size();
            for (int i = 0; i < size; i++) {
                C10528Rth rth = (C10528Rth) A032.get(i);
                if (!list.contains(rth.A00)) {
                    list.add(rth.A00);
                }
                for (int i2 = 0; i2 < rth.A02.size(); i2++) {
                    if (!list.contains(rth.A02.get(i2))) {
                        list.add(rth.A02.get(i2));
                    }
                }
            }
        }
        return this.A0G;
    }

    public final List A03() {
        if (!this.A0D) {
            this.A0D = true;
            List list = this.A0H;
            list.clear();
            List A022 = C13882Tj5.A00(this).A02(this.A0A);
            int size = A022.size();
            for (int i = 0; i < size; i++) {
                C10528Rth AEZ = ((C13698TfG) A022.get(i)).AEZ(this.A05, this.A0A, this.A01, this.A00);
                if (AEZ != null) {
                    list.add(AEZ);
                }
            }
        }
        return this.A0H;
    }
}
