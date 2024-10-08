package X;

import java.util.Map;

/* renamed from: X.54c  reason: invalid class name */
public final class AnonymousClass54c implements Map.Entry {
    public int A00;
    public AnonymousClass54c A01;
    public AnonymousClass54c A02;
    public AnonymousClass54c A03;
    public AnonymousClass54c A04;
    public AnonymousClass54c A05;
    public Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX WARNING: Removed duplicated region for block: B:8:0x001b A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            boolean r0 = r4 instanceof java.util.Map.Entry
            r2 = 0
            if (r0 == 0) goto L_0x001c
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r1 = r3.A07
            java.lang.Object r0 = r4.getKey()
            if (r1 != 0) goto L_0x0024
            if (r0 != 0) goto L_0x001c
        L_0x0011:
            java.lang.Object r1 = r3.A06
            java.lang.Object r0 = r4.getValue()
            if (r1 != 0) goto L_0x001d
            if (r0 != 0) goto L_0x001c
        L_0x001b:
            r2 = 1
        L_0x001c:
            return r2
        L_0x001d:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            goto L_0x001b
        L_0x0024:
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x001c
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass54c.equals(java.lang.Object):boolean");
    }

    public final Object getKey() {
        return this.A07;
    }

    public final Object getValue() {
        return this.A06;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.A07;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        Object obj2 = this.A06;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        if (obj != null || this.A08) {
            Object obj2 = this.A06;
            this.A06 = obj;
            return obj2;
        }
        throw new NullPointerException("value == null");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A07);
        sb.append("=");
        sb.append(this.A06);
        return sb.toString();
    }

    public AnonymousClass54c(boolean z) {
        this.A07 = null;
        this.A08 = z;
        this.A04 = this;
        this.A02 = this;
    }

    public AnonymousClass54c(AnonymousClass54c r2, AnonymousClass54c r3, AnonymousClass54c r4, Object obj, boolean z) {
        this.A03 = r2;
        this.A07 = obj;
        this.A08 = z;
        this.A00 = 1;
        this.A02 = r3;
        this.A04 = r4;
        r4.A02 = this;
        r3.A04 = this;
    }
}
