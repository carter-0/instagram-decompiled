package X;

/* renamed from: X.7Et  reason: invalid class name and case insensitive filesystem */
public final class C328427Et {
    public 0eP A00;

    public final void A00(int i) {
        0eP r0;
        Object obj;
        0eP r2 = this.A00;
        if (r2 != null) {
            if (i <= ((Number) r2.A00).intValue()) {
                obj = Integer.valueOf(i);
            } else if (i >= ((Number) r2.A01).intValue()) {
                r0 = new 0eP(r2.A00, Integer.valueOf(i));
            } else {
                obj = r2.A00;
            }
            r0 = new 0eP(obj, Integer.valueOf(((Number) r2.A01).intValue() + 1));
        } else {
            Integer valueOf = Integer.valueOf(i);
            r0 = new 0eP(valueOf, valueOf);
        }
        this.A00 = r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002f, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(int r4) {
        /*
            r3 = this;
            X.0eP r1 = r3.A00
            if (r1 == 0) goto L_0x0031
            java.lang.Object r0 = r1.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r4 > r0) goto L_0x001c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
            java.lang.Object r0 = r1.A01
        L_0x0014:
            X.0eP r1 = new X.0eP
            r1.<init>(r2, r0)
        L_0x0019:
            r3.A00 = r1
            return
        L_0x001c:
            java.lang.Object r0 = r1.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            if (r4 < r0) goto L_0x002d
            java.lang.Object r2 = r1.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            goto L_0x0014
        L_0x002d:
            X.0eP r1 = r3.A00
            if (r1 != 0) goto L_0x0019
        L_0x0031:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r4)
            X.0eP r1 = new X.0eP
            r1.<init>(r0, r0)
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C328427Et.A01(int):void");
    }

    public final void A02(int i) {
        0eP r1;
        int max;
        Integer valueOf;
        Object obj;
        Integer num;
        0eP r12 = this.A00;
        if (r12 != null) {
            if (i <= ((Number) r12.A00).intValue()) {
                Integer valueOf2 = Integer.valueOf(i);
                max = Math.max(i, ((Number) r12.A01).intValue() - 1);
                num = valueOf2;
            } else {
                Number number = (Number) r12.A01;
                int intValue = number.intValue();
                Object obj2 = r12.A00;
                if (i >= intValue) {
                    valueOf = Integer.valueOf(i);
                    obj = obj2;
                    r1 = new 0eP(obj, valueOf);
                } else {
                    max = Math.max(((Number) obj2).intValue(), number.intValue() - 1);
                    num = obj2;
                }
            }
            valueOf = Integer.valueOf(max);
            obj = num;
            r1 = new 0eP(obj, valueOf);
        } else {
            Integer valueOf3 = Integer.valueOf(i);
            r1 = new 0eP(valueOf3, valueOf3);
        }
        this.A00 = r1;
    }
}
