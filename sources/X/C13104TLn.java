package X;

import java.util.Comparator;

/* renamed from: X.TLn  reason: case insensitive filesystem */
public final class C13104TLn implements Comparator {
    public final /* synthetic */ C12533SwU A00;
    public final /* synthetic */ String A01;

    public C13104TLn(C12533SwU swU, String str) {
        this.A00 = swU;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0039, code lost:
        if (r1.equals(X.AnonymousClass000.A00(5050)) == false) goto L_0x003b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.2Km r7) {
        /*
            r6 = this;
            X.SwU r3 = r6.A00
            boolean r0 = r3.A01
            r1 = 0
            if (r0 == 0) goto L_0x000c
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x000c
            r1 = 1
        L_0x000c:
            java.lang.String r2 = r6.A01
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0049
            boolean r5 = r3.A02
            boolean r2 = r3.A00
            java.lang.String r1 = r7.A03
            r4 = 0
            r0 = 2120(0x848, float:2.971E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r1.equals(r0)
            boolean r3 = X.AnonymousClass7TF.A1P(r0)
            if (r2 == 0) goto L_0x003b
            r0 = 5050(0x13ba, float:7.077E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x003c
        L_0x003b:
            r2 = 0
        L_0x003c:
            boolean r0 = r7.A07
            r1 = 3
            if (r0 == 0) goto L_0x0042
            r1 = 0
        L_0x0042:
            if (r5 == r3) goto L_0x0045
            r4 = 2
        L_0x0045:
            int r1 = r1 + r4
            r0 = r2 ^ 1
            int r1 = r1 + r0
        L_0x0049:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13104TLn.A00(X.2Km):int");
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((2Km) obj) - A00((2Km) obj2);
    }
}
