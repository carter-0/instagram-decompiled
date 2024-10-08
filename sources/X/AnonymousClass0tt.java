package X;

/* renamed from: X.0tt  reason: invalid class name */
public final class AnonymousClass0tt {
    public long A00;
    public long A01;
    public long A02;
    public long A03;
    public final AnonymousClass0JR A04;
    public final C62520ts A05;
    public final C62520ts A06;
    public final C62520ts A07;
    public final C62520ts A08;

    /*  JADX ERROR: Method load error
        jadx.core.utils.exceptions.DecodeException: Load method exception: null in method: X.0tt.toString():java.lang.String, dex: classes.dex
        	at jadx.core.dex.nodes.MethodNode.load(MethodNode.java:151)
        	at jadx.core.dex.nodes.ClassNode.load(ClassNode.java:286)
        	at jadx.core.ProcessClass.process(ProcessClass.java:36)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:58)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:273)
        Caused by: java.lang.ArrayIndexOutOfBoundsException
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: null in method: X.0tt.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0tt.toString():java.lang.String");
    }

    private void A00(long j) {
        C62520ts r0 = this.A05;
        long A002 = r0.A00(j);
        r0.A01 = 0;
        this.A00 = Math.max(A002, this.A00);
        C62520ts r02 = this.A06;
        long A003 = r02.A00(j);
        r02.A01 = 0;
        this.A01 = Math.max(A003, this.A01);
        C62520ts r03 = this.A07;
        long A004 = r03.A00(j);
        r03.A01 = 0;
        this.A02 = Math.max(A004, this.A02);
        C62520ts r04 = this.A08;
        long A005 = r04.A00(j);
        r04.A01 = 0;
        this.A03 = Math.max(A005, this.A03);
    }

    public final long A01() {
        return Math.max(this.A07.A00(this.A04.now()), this.A02);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 != false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(float r5, long r6) {
        /*
            r4 = this;
            X.0ts r0 = r4.A05
            boolean r1 = r0.A01(r5, r6)
            X.0ts r0 = r4.A06
            boolean r0 = r0.A01(r5, r6)
            r3 = 0
            if (r0 != 0) goto L_0x0012
            r2 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            X.0ts r0 = r4.A07
            boolean r0 = r0.A01(r5, r6)
            if (r0 != 0) goto L_0x001e
            r1 = 0
            if (r2 == 0) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            X.0ts r0 = r4.A08
            boolean r0 = r0.A01(r5, r6)
            if (r0 != 0) goto L_0x0029
            if (r1 == 0) goto L_0x002d
        L_0x0029:
            r3 = 1
            r4.A00(r6)
        L_0x002d:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0tt.A02(float, long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r1 != false) goto L_0x0012;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r2 != false) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(long r5) {
        /*
            r4 = this;
            X.0ts r0 = r4.A05
            boolean r1 = r0.A02(r5)
            X.0ts r0 = r4.A06
            boolean r0 = r0.A02(r5)
            r3 = 0
            if (r0 != 0) goto L_0x0012
            r2 = 0
            if (r1 == 0) goto L_0x0013
        L_0x0012:
            r2 = 1
        L_0x0013:
            X.0ts r0 = r4.A07
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L_0x001e
            r1 = 0
            if (r2 == 0) goto L_0x001f
        L_0x001e:
            r1 = 1
        L_0x001f:
            X.0ts r0 = r4.A08
            boolean r0 = r0.A02(r5)
            if (r0 != 0) goto L_0x0029
            if (r1 == 0) goto L_0x002a
        L_0x0029:
            r3 = 1
        L_0x002a:
            r4.A00(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0tt.A03(long):boolean");
    }

    public AnonymousClass0tt(AnonymousClass0tt r3) {
        this.A04 = r3.A04;
        this.A00 = r3.A00;
        this.A01 = r3.A01;
        this.A02 = r3.A02;
        this.A03 = r3.A03;
        this.A05 = new C62520ts(r3.A05);
        this.A06 = new C62520ts(r3.A06);
        this.A07 = new C62520ts(r3.A07);
        this.A08 = new C62520ts(r3.A08);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.0ts, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.0ts, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [X.0ts, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.0ts, java.lang.Object] */
    public AnonymousClass0tt() {
        this.A04 = C62510tr.A00();
        ? obj = new Object();
        obj.A02 = -1;
        obj.A00 = 0.1f;
        this.A05 = obj;
        ? obj2 = new Object();
        obj2.A02 = -1;
        obj2.A00 = 0.25f;
        this.A06 = obj2;
        ? obj3 = new Object();
        obj3.A02 = -1;
        obj3.A00 = 0.5f;
        this.A07 = obj3;
        ? obj4 = new Object();
        obj4.A02 = -1;
        obj4.A00 = 0.75f;
        this.A08 = obj4;
    }
}
