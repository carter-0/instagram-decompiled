package X;

/* renamed from: X.9Jo  reason: invalid class name and case insensitive filesystem */
public final class C376849Jo extends AnonymousClass1Ek implements 0sK {
    public boolean A00;
    public boolean A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376849Jo(int i, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2 = this.A02;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        boolean booleanValue2 = ((Boolean) obj2).booleanValue();
        AnonymousClass4D7 r7 = (AnonymousClass4D7) obj3;
        switch (i2) {
            case 0:
                i = 0;
                break;
            case 1:
                i = 1;
                break;
            case 2:
                i = 2;
                break;
            default:
                i = 3;
                break;
        }
        C376849Jo r1 = new C376849Jo(i, r7);
        r1.A00 = booleanValue;
        r1.A01 = booleanValue2;
        return r1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r0 == false) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
        if (r1 != false) goto L_0x0030;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002a, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return java.lang.Boolean.valueOf(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0018, code lost:
        if (r0 != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r0 != false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            X.0eS.A00(r4)
            switch(r0) {
                case 0: goto L_0x0012;
                case 1: goto L_0x001b;
                case 2: goto L_0x0022;
                default: goto L_0x0008;
            }
        L_0x0008:
            boolean r2 = r3.A00
            boolean r1 = r3.A01
            X.7GY r0 = new X.7GY
            r0.<init>(r2, r1)
            return r0
        L_0x0012:
            boolean r1 = r3.A00
            boolean r0 = r3.A01
            if (r1 != 0) goto L_0x0030
            if (r0 == 0) goto L_0x0030
            goto L_0x002a
        L_0x001b:
            boolean r0 = r3.A00
            boolean r1 = r3.A01
            if (r0 == 0) goto L_0x0030
            goto L_0x0028
        L_0x0022:
            boolean r0 = r3.A00
            boolean r1 = r3.A01
            if (r0 != 0) goto L_0x0030
        L_0x0028:
            if (r1 != 0) goto L_0x0030
        L_0x002a:
            r0 = 1
        L_0x002b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x0030:
            r0 = 0
            goto L_0x002b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376849Jo.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
