package X;

import android.os.SystemClock;
import java.util.ArrayList;

/* renamed from: X.Xux  reason: case insensitive filesystem */
public abstract class C22071Xux implements C13909Tl9 {
    public int A00;
    public SH8 A01;
    public final ArrayList A02 = new ArrayList(1);
    public final boolean A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: X.XaF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v13, resolved type: X.XaF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v14, resolved type: X.XaF} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02() {
        /*
            r18 = this;
            r7 = 0
        L_0x0001:
            r1 = r18
            int r0 = r1.A00
            if (r7 >= r0) goto L_0x011a
            java.util.ArrayList r0 = r1.A02
            java.lang.Object r12 = r0.get(r7)
            X.Y7s r12 = (X.C22521Y7s) r12
            boolean r0 = r1.A03
            X.Xuy r12 = (X.C22072Xuy) r12
            monitor-enter(r12)
            if (r0 == 0) goto L_0x0112
            int r0 = r12.A01     // Catch:{ all -> 0x0117 }
            r6 = 1
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            X.C11366SPh.A02(r0)     // Catch:{ all -> 0x0117 }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0117 }
            long r2 = r12.A04     // Catch:{ all -> 0x0117 }
            long r0 = r4 - r2
            int r13 = (int) r0     // Catch:{ all -> 0x0117 }
            long r2 = r12.A06     // Catch:{ all -> 0x0117 }
            long r0 = (long) r13     // Catch:{ all -> 0x0117 }
            long r2 = r2 + r0
            r12.A06 = r2     // Catch:{ all -> 0x0117 }
            long r2 = r12.A05     // Catch:{ all -> 0x0117 }
            long r0 = r12.A03     // Catch:{ all -> 0x0117 }
            long r2 = r2 + r0
            r12.A05 = r2     // Catch:{ all -> 0x0117 }
            if (r13 <= 0) goto L_0x00f1
            float r3 = (float) r0     // Catch:{ all -> 0x0117 }
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r3 = r3 * r2
            float r2 = (float) r13     // Catch:{ all -> 0x0117 }
            float r3 = r3 / r2
            X.XnG r2 = r12.A09     // Catch:{ all -> 0x0117 }
            double r8 = (double) r0     // Catch:{ all -> 0x0117 }
            double r0 = java.lang.Math.sqrt(r8)     // Catch:{ all -> 0x0117 }
            int r8 = (int) r0     // Catch:{ all -> 0x0117 }
            int r0 = r2.A00     // Catch:{ all -> 0x0117 }
            if (r0 == r6) goto L_0x0053
            java.util.ArrayList r1 = r2.A04     // Catch:{ all -> 0x0117 }
            java.util.Comparator r0 = X.XnG.A06     // Catch:{ all -> 0x0117 }
            java.util.Collections.sort(r1, r0)     // Catch:{ all -> 0x0117 }
            r2.A00 = r6     // Catch:{ all -> 0x0117 }
        L_0x0053:
            int r10 = r2.A02     // Catch:{ all -> 0x0117 }
            if (r10 <= 0) goto L_0x009e
            X.XaF[] r0 = r2.A05     // Catch:{ all -> 0x0117 }
            int r10 = r10 + -1
            r2.A02 = r10     // Catch:{ all -> 0x0117 }
            r9 = r0[r10]     // Catch:{ all -> 0x0117 }
        L_0x005f:
            int r1 = r2.A01     // Catch:{ all -> 0x0117 }
            int r0 = r1 + 1
            r2.A01 = r0     // Catch:{ all -> 0x0117 }
            r9.A01 = r1     // Catch:{ all -> 0x0117 }
            r9.A02 = r8     // Catch:{ all -> 0x0117 }
            r9.A00 = r3     // Catch:{ all -> 0x0117 }
            java.util.ArrayList r3 = r2.A04     // Catch:{ all -> 0x0117 }
            r3.add(r9)     // Catch:{ all -> 0x0117 }
            int r9 = r2.A03     // Catch:{ all -> 0x0117 }
            int r9 = r9 + r8
        L_0x0073:
            r2.A03 = r9     // Catch:{ all -> 0x0117 }
        L_0x0075:
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r9 <= r0) goto L_0x00a4
            int r11 = r9 - r0
            r1 = 0
            java.lang.Object r8 = r3.get(r1)     // Catch:{ all -> 0x0117 }
            X.XaF r8 = (X.C21407XaF) r8     // Catch:{ all -> 0x0117 }
            int r0 = r8.A02     // Catch:{ all -> 0x0117 }
            if (r0 > r11) goto L_0x0099
            int r9 = r9 - r0
            r2.A03 = r9     // Catch:{ all -> 0x0117 }
            r3.remove(r1)     // Catch:{ all -> 0x0117 }
            r1 = r10
            r0 = 5
            if (r10 >= r0) goto L_0x0075
            X.XaF[] r0 = r2.A05     // Catch:{ all -> 0x0117 }
            int r10 = r10 + 1
            r2.A02 = r10     // Catch:{ all -> 0x0117 }
            r0[r1] = r8     // Catch:{ all -> 0x0117 }
            goto L_0x0075
        L_0x0099:
            int r0 = r0 - r11
            r8.A02 = r0     // Catch:{ all -> 0x0117 }
            int r9 = r9 - r11
            goto L_0x0073
        L_0x009e:
            X.XaF r9 = new X.XaF     // Catch:{ all -> 0x0117 }
            r9.<init>()     // Catch:{ all -> 0x0117 }
            goto L_0x005f
        L_0x00a4:
            long r0 = r12.A06     // Catch:{ all -> 0x0117 }
            r9 = 2000(0x7d0, double:9.88E-321)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 >= 0) goto L_0x00b5
            long r0 = r12.A05     // Catch:{ all -> 0x0117 }
            r9 = 524288(0x80000, double:2.590327E-318)
            int r8 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r8 < 0) goto L_0x00e2
        L_0x00b5:
            r9 = 1056964608(0x3f000000, float:0.5)
            int r0 = r2.A00     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x00c3
            java.util.Comparator r0 = X.XnG.A07     // Catch:{ all -> 0x0117 }
            java.util.Collections.sort(r3, r0)     // Catch:{ all -> 0x0117 }
            r0 = 0
            r2.A00 = r0     // Catch:{ all -> 0x0117 }
        L_0x00c3:
            int r0 = r2.A03     // Catch:{ all -> 0x0117 }
            float r0 = (float) r0     // Catch:{ all -> 0x0117 }
            float r9 = r9 * r0
            r8 = 0
            r2 = 0
        L_0x00c9:
            int r0 = r3.size()     // Catch:{ all -> 0x0117 }
            if (r8 >= r0) goto L_0x00fa
            java.lang.Object r1 = r3.get(r8)     // Catch:{ all -> 0x0117 }
            X.XaF r1 = (X.C21407XaF) r1     // Catch:{ all -> 0x0117 }
            int r0 = r1.A02     // Catch:{ all -> 0x0117 }
            int r2 = r2 + r0
            float r0 = (float) r2     // Catch:{ all -> 0x0117 }
            int r0 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r0 < 0) goto L_0x00f7
            float r0 = r1.A00     // Catch:{ all -> 0x0117 }
        L_0x00df:
            long r0 = (long) r0     // Catch:{ all -> 0x0117 }
            r12.A02 = r0     // Catch:{ all -> 0x0117 }
        L_0x00e2:
            long r14 = r12.A03     // Catch:{ all -> 0x0117 }
            long r0 = r12.A02     // Catch:{ all -> 0x0117 }
            r16 = r0
            X.C22072Xuy.A01(r12, r13, r14, r16)     // Catch:{ all -> 0x0117 }
            r12.A04 = r4     // Catch:{ all -> 0x0117 }
            r0 = 0
            r12.A03 = r0     // Catch:{ all -> 0x0117 }
        L_0x00f1:
            int r0 = r12.A01     // Catch:{ all -> 0x0117 }
            int r0 = r0 - r6
            r12.A01 = r0     // Catch:{ all -> 0x0117 }
            goto L_0x0112
        L_0x00f7:
            int r8 = r8 + 1
            goto L_0x00c9
        L_0x00fa:
            boolean r0 = r3.isEmpty()     // Catch:{ all -> 0x0117 }
            if (r0 == 0) goto L_0x0103
            r0 = 2143289344(0x7fc00000, float:NaN)
            goto L_0x00df
        L_0x0103:
            int r0 = r3.size()     // Catch:{ all -> 0x0117 }
            int r0 = r0 + -1
            java.lang.Object r0 = r3.get(r0)     // Catch:{ all -> 0x0117 }
            X.XaF r0 = (X.C21407XaF) r0     // Catch:{ all -> 0x0117 }
            float r0 = r0.A00     // Catch:{ all -> 0x0117 }
            goto L_0x00df
        L_0x0112:
            monitor-exit(r12)
            int r7 = r7 + 1
            goto L_0x0001
        L_0x0117:
            r0 = move-exception
            monitor-exit(r12)
            throw r0
        L_0x011a:
            r0 = 0
            r1.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22071Xux.A02():void");
    }

    public final void A03() {
        for (int i = 0; i < this.A00; i++) {
            this.A02.get(i);
        }
    }

    public final void A04(int i) {
        for (int i2 = 0; i2 < this.A00; i2++) {
            boolean z = this.A03;
            C22072Xuy xuy = (C22072Xuy) ((C22521Y7s) this.A02.get(i2));
            synchronized (xuy) {
                if (z) {
                    xuy.A03 += (long) i;
                }
            }
        }
    }

    public final void A05(SH8 sh8) {
        this.A01 = sh8;
        for (int i = 0; i < this.A00; i++) {
            boolean z = this.A03;
            C22072Xuy xuy = (C22072Xuy) ((C22521Y7s) this.A02.get(i));
            synchronized (xuy) {
                if (z) {
                    int i2 = xuy.A01;
                    if (i2 == 0) {
                        xuy.A04 = SystemClock.elapsedRealtime();
                    }
                    xuy.A01 = i2 + 1;
                }
            }
        }
    }

    public C22071Xux(boolean z) {
        this.A03 = z;
    }

    public final void AAa(C22521Y7s y7s) {
        y7s.getClass();
        ArrayList arrayList = this.A02;
        if (!arrayList.contains(y7s)) {
            arrayList.add(y7s);
            this.A00++;
        }
    }
}
