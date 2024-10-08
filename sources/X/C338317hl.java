package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.7hl  reason: invalid class name and case insensitive filesystem */
public final class C338317hl {
    public int A00;
    public int A01;
    public boolean A02;
    public int A03;
    public int A04;
    public int A05;
    public final C338327hm A06 = new C338327hm(this);
    public final List A07;
    public final C338117hR A08;

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0051, code lost:
        r1 = r2.size();
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        if (r0 >= r1) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0058, code lost:
        ((X.C338237hd) r2.get(r0)).FN5(r4, r5, r6, r7, r8);
        r0 = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(int r10) {
        /*
            r9 = this;
            X.7hR r0 = r9.A08
            int r4 = r0.AVG()
            int r5 = r0.AVK()
            int r6 = r0.AVF()
            int r7 = r0.AVJ()
            int r1 = r0.getItemCount()
            if (r4 < 0) goto L_0x0032
            if (r5 < 0) goto L_0x0032
            int r0 = r9.A00
            r8 = r10
            if (r4 != r0) goto L_0x0033
            int r0 = r9.A01
            if (r5 != r0) goto L_0x0033
            int r0 = r9.A03
            if (r6 != r0) goto L_0x0033
            int r0 = r9.A04
            if (r7 != r0) goto L_0x0033
            int r0 = r9.A05
            if (r1 != r0) goto L_0x0033
            r0 = 1
            if (r10 == r0) goto L_0x0033
        L_0x0032:
            return
        L_0x0033:
            r9.A00 = r4
            r9.A01 = r5
            r9.A03 = r6
            r9.A04 = r7
            r9.A05 = r1
            r0 = 0
            r9.A02 = r0
            monitor-enter(r9)
            java.util.List r1 = r9.A07     // Catch:{ all -> 0x0065 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x004b
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            goto L_0x0064
        L_0x004b:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0065 }
            r2.<init>(r1)     // Catch:{ all -> 0x0065 }
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            int r1 = r2.size()
            r0 = 0
        L_0x0056:
            if (r0 >= r1) goto L_0x0032
            java.lang.Object r3 = r2.get(r0)
            X.7hd r3 = (X.C338237hd) r3
            r3.FN5(r4, r5, r6, r7, r8)
            int r0 = r0 + 1
            goto L_0x0056
        L_0x0064:
            return
        L_0x0065:
            r0 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x0065 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C338317hl.A00(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0005, code lost:
        if (r2 != false) goto L_0x0007;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(boolean r2) {
        /*
            r1 = this;
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0007
            r0 = 0
            if (r2 == 0) goto L_0x0008
        L_0x0007:
            r0 = 1
        L_0x0008:
            r1.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C338317hl.A01(boolean):void");
    }

    public final boolean A02() {
        if (this.A00 < 0 || this.A01 < 0 || this.A02) {
            return true;
        }
        return false;
    }

    public C338317hl(C338117hR r3, int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r3.AVF();
        this.A04 = r3.AVJ();
        this.A05 = r3.getItemCount();
        this.A08 = r3;
        this.A07 = new ArrayList(2);
    }

    public final boolean A03(int i, int i2) {
        if (A02() || i2 == -1 || i <= Math.max((this.A00 + i2) - 1, this.A01)) {
            return true;
        }
        return false;
    }
}
