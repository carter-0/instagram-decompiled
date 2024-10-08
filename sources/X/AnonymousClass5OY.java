package X;

import java.util.Comparator;

/* renamed from: X.5OY  reason: invalid class name */
public final class AnonymousClass5OY implements Comparator {
    public final /* synthetic */ AnonymousClass5OT A00;
    public final /* synthetic */ String A01;

    public AnonymousClass5OY(AnonymousClass5OT r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r1.equals("meta.dav1d.av1.decoder") == false) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A00(X.2Km r7) {
        /*
            r6 = this;
            X.5OT r3 = r6.A00
            boolean r0 = r3.A03
            r1 = 0
            if (r0 == 0) goto L_0x000c
            boolean r0 = r7.A07
            if (r0 == 0) goto L_0x000c
            r1 = 1
        L_0x000c:
            java.lang.String r2 = r6.A01
            java.lang.String r0 = "video/av01"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0040
            boolean r5 = r3.A04
            boolean r2 = r3.A02
            java.lang.String r1 = r7.A03
            r4 = 0
            java.lang.String r0 = "c2.android.av1-dav1d.decoder"
            boolean r0 = r1.equals(r0)
            r3 = 0
            if (r0 == 0) goto L_0x0027
            r3 = 1
        L_0x0027:
            if (r2 == 0) goto L_0x0032
            java.lang.String r0 = "meta.dav1d.av1.decoder"
            boolean r0 = r1.equals(r0)
            r2 = 1
            if (r0 != 0) goto L_0x0033
        L_0x0032:
            r2 = 0
        L_0x0033:
            boolean r0 = r7.A07
            r1 = 0
            if (r0 == 0) goto L_0x0039
            r1 = 3
        L_0x0039:
            if (r5 == r3) goto L_0x003c
            r4 = 2
        L_0x003c:
            int r1 = r1 + r4
            r0 = r2 ^ 1
            int r1 = r1 + r0
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5OY.A00(X.2Km):int");
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return A00((2Km) obj) - A00((2Km) obj2);
    }
}
