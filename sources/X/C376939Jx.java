package X;

/* renamed from: X.9Jx  reason: invalid class name and case insensitive filesystem */
public final class C376939Jx extends AnonymousClass1Ek implements 0sK {
    public Object A00;
    public boolean A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C376939Jx(int i, AnonymousClass4D7 r3) {
        super(3, r3);
        this.A02 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C376939Jx r1;
        if (this.A02 != 0) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            r1 = new C376939Jx(1, (AnonymousClass4D7) obj3);
            r1.A01 = booleanValue;
            r1.A00 = obj2;
        } else {
            boolean booleanValue2 = ((Boolean) obj2).booleanValue();
            r1 = new C376939Jx(0, (AnonymousClass4D7) obj3);
            r1.A00 = obj;
            r1.A01 = booleanValue2;
        }
        return r1.invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        if (r2 == X.AnonymousClass2g6.VISIBLE) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.A02
            if (r0 == 0) goto L_0x0018
            X.0eS.A00(r4)
            boolean r0 = r3.A01
            java.lang.Object r2 = r3.A00
            if (r0 == 0) goto L_0x0012
            X.2g6 r1 = X.AnonymousClass2g6.VISIBLE
            r0 = 1
            if (r2 != r1) goto L_0x0013
        L_0x0012:
            r0 = 0
        L_0x0013:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            return r2
        L_0x0018:
            X.0eS.A00(r4)
            java.lang.Object r1 = r3.A00
            boolean r0 = r3.A01
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.0eP r2 = new X.0eP
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C376939Jx.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
