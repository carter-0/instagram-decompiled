package X;

import java.util.List;

/* renamed from: X.4nO  reason: invalid class name and case insensitive filesystem */
public final class C273914nO {
    public int A00;
    public C273924nP A01;
    public Boolean A02;
    public String A03;
    public String A04 = "";
    public String A05 = "";
    public List A06;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0020, code lost:
        if (r1.equals(r0) == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0044
            boolean r0 = r5 instanceof X.C273914nO
            r2 = 0
            if (r0 == 0) goto L_0x0022
            X.4nO r5 = (X.C273914nO) r5
            int r1 = r4.A00
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0022
            X.4nP r1 = r4.A01
            X.4nP r0 = r5.A01
            if (r1 != r0) goto L_0x0022
            java.lang.String r1 = r4.A04
            java.lang.String r0 = r5.A04
            if (r1 == 0) goto L_0x0023
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0026
        L_0x0022:
            return r2
        L_0x0023:
            if (r0 == 0) goto L_0x0026
            return r2
        L_0x0026:
            java.lang.String r1 = r4.A05
            java.lang.String r0 = r5.A05
            if (r1 == 0) goto L_0x0033
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0036
            return r2
        L_0x0033:
            if (r0 == 0) goto L_0x0036
            return r2
        L_0x0036:
            java.util.List r1 = r4.A06
            java.util.List r0 = r5.A06
            if (r1 == 0) goto L_0x0041
            boolean r3 = r1.equals(r0)
            return r3
        L_0x0041:
            if (r0 == 0) goto L_0x0044
            r3 = 0
        L_0x0044:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C273914nO.equals(java.lang.Object):boolean");
    }

    public final String A00() {
        List list = this.A06;
        if (list == null || this.A00 >= list.size()) {
            return "";
        }
        return (String) this.A06.get(this.A00);
    }

    public final void A01(int i) {
        List list = this.A06;
        if (list == null || i >= list.size()) {
            0wb.A03("ReelAsset", "Invalid index specified for setSelectedIndex");
        }
        this.A00 = i;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        C273924nP r0 = this.A01;
        int i4 = 0;
        if (r0 != null) {
            i = r0.hashCode();
        } else {
            i = 0;
        }
        int i5 = i * 31;
        List list = this.A06;
        if (list != null) {
            i2 = list.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        String str = this.A04;
        if (str != null) {
            i3 = str.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        String str2 = this.A05;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return ((i7 + i4) * 31) + this.A00;
    }
}
