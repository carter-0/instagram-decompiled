package X;

import java.util.List;

public final class P2M implements C74394PuA {
    public final C67350MmR A00;
    public final List A01;

    public final boolean isEnabled() {
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0024, code lost:
        if (r1 == X.C67350MmR.FOLLOWERS) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List getItems() {
        /*
            r20 = this;
            r4 = r20
            java.util.List r0 = r4.A01
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r2 = r0.iterator()
        L_0x000c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0044
            java.lang.Object r6 = r2.next()
            com.instagram.user.model.User r6 = (com.instagram.user.model.User) r6
            X.MmR r1 = r4.A00
            X.MmR r0 = X.C67350MmR.MUTUAL_FOLLOWERS
            r18 = 0
            if (r1 == r0) goto L_0x0026
            X.MmR r0 = X.C67350MmR.FOLLOWERS
            r17 = 0
            if (r1 != r0) goto L_0x0028
        L_0x0026:
            r17 = 1
        L_0x0028:
            X.MmR r0 = X.C67350MmR.CREATORS
            if (r1 != r0) goto L_0x002e
            r18 = 1
        L_0x002e:
            r7 = 0
            r8 = 0
            X.N9q r5 = new X.N9q
            r9 = r8
            r10 = r8
            r11 = r8
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r8
            r19 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3.add(r5)
            goto L_0x000c
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P2M.getItems():java.util.List");
    }

    public P2M(C67350MmR mmR, List list) {
        this.A01 = list;
        this.A00 = mmR;
    }
}
