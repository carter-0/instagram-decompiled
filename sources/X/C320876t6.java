package X;

/* renamed from: X.6t6  reason: invalid class name and case insensitive filesystem */
public abstract class C320876t6 implements C232262tL {
    public final C267324bN A00;
    public final String A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public int A01() {
        return 0;
    }

    public abstract C295365o2 A02();

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C320876t6 r4 = (C320876t6) obj;
        if (r4 != null) {
            str = r4.A01;
        } else {
            str = null;
        }
        if (!0qQ.A0K(str, this.A01) || r4.A01() != A01()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004b, code lost:
        if (r4.A06().A07() == false) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0037, code lost:
        if (r4.A06().A08() == false) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C320876t6(X.C267324bN r4) {
        /*
            r3 = this;
            r3.<init>()
            r3.A00 = r4
            X.5o2 r1 = r4.A01
            X.5o2 r0 = r3.A02()
            r2 = 1
            if (r1 != r0) goto L_0x006f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r0 = 95
            r1.append(r0)
            java.lang.String r0 = r4.getId()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r3.A01 = r0
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x0039
            X.3OA r0 = r4.A06()
            boolean r1 = r0.A08()
            r0 = 1
            if (r1 != 0) goto L_0x003a
        L_0x0039:
            r0 = 0
        L_0x003a:
            r3.A04 = r0
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x004d
            X.3OA r0 = r4.A06()
            boolean r1 = r0.A07()
            r0 = 1
            if (r1 != 0) goto L_0x004e
        L_0x004d:
            r0 = 0
        L_0x004e:
            r3.A02 = r0
            boolean r0 = r4.CcK()
            if (r0 == 0) goto L_0x006d
            X.3OA r0 = r4.A06()
            boolean r0 = r0.A07()
            if (r0 != 0) goto L_0x006d
            X.3OA r0 = r4.A06()
            boolean r0 = r0.A08()
            if (r0 != 0) goto L_0x006d
        L_0x006a:
            r3.A03 = r2
            return
        L_0x006d:
            r2 = 0
            goto L_0x006a
        L_0x006f:
            java.lang.String r1 = "Failed requirement."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320876t6.<init>(X.4bN):void");
    }
}
