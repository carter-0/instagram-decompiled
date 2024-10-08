package X;

import java.util.LinkedHashSet;

/* renamed from: X.Jvc  reason: case insensitive filesystem */
public final class C61038Jvc extends AnonymousClass0T0 {
    public Object A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final int A05;

    public C61038Jvc(Boolean bool, String str, String str2, String str3, boolean z) {
        this.A05 = 1;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = str3;
        this.A00 = bool;
        this.A04 = z;
    }

    public final boolean equals(Object obj) {
        int i;
        C61038Jvc jvc;
        Object obj2;
        Object obj3;
        switch (this.A05) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            case 2:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C61038Jvc)) {
                    return false;
                }
                C61038Jvc jvc2 = (C61038Jvc) obj;
                if (jvc2.A05 != 2 || !0qQ.A0K(this.A02, jvc2.A02) || !0qQ.A0K(this.A03, jvc2.A03) || this.A04 != jvc2.A04 || !0qQ.A0K(this.A01, jvc2.A01) || !0qQ.A0K(this.A00, jvc2.A00)) {
                    return false;
                }
                return true;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C61038Jvc) {
                    jvc = (C61038Jvc) obj;
                    if (jvc.A05 == 3 && 0qQ.A0K(this.A01, jvc.A01) && 0qQ.A0K(this.A02, jvc.A02) && 0qQ.A0K(this.A00, jvc.A00)) {
                        obj2 = this.A03;
                        obj3 = jvc.A03;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!(obj instanceof C61038Jvc)) {
            return false;
        }
        jvc = (C61038Jvc) obj;
        if (jvc.A05 != i || !0qQ.A0K(this.A02, jvc.A02) || !0qQ.A0K(this.A01, jvc.A01) || !0qQ.A0K(this.A03, jvc.A03)) {
            return false;
        }
        obj2 = this.A00;
        obj3 = jvc.A00;
        if (!0qQ.A0K(obj2, obj3) || this.A04 != jvc.A04) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0020, code lost:
        r1 = r1 + r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0021, code lost:
        r2 = r1 * 31;
        r0 = 1237;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0027, code lost:
        if (r3.A04 == false) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0029, code lost:
        r0 = 1231;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002c, code lost:
        return r2 + r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int hashCode() {
        /*
            r3 = this;
            int r0 = r3.A05
            switch(r0) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0052;
                case 2: goto L_0x002d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.String r0 = r3.A01
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TF.A08(r0, r1)
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TG.A0C(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.C41845B3m.A00(r0)
        L_0x0020:
            int r1 = r1 + r0
        L_0x0021:
            int r2 = r1 * 31
            boolean r1 = r3.A04
            r0 = 1237(0x4d5, float:1.733E-42)
            if (r1 == 0) goto L_0x002b
            r0 = 1231(0x4cf, float:1.725E-42)
        L_0x002b:
            int r2 = r2 + r0
            return r2
        L_0x002d:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            boolean r0 = r3.A04
            int r1 = X.AnonymousClass7TF.A09(r0, r1)
            java.lang.String r0 = r3.A01
            int r0 = X.C41845B3m.A00(r0)
            int r1 = r1 + r0
            int r2 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = r0.hashCode()
            goto L_0x002b
        L_0x0052:
            java.lang.String r0 = r3.A02
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r0 * 31
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r0 = X.AnonymousClass7TE.A0L(r0)
            goto L_0x0020
        L_0x0073:
            java.lang.String r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0O(r0)
            java.lang.String r0 = r3.A01
            int r0 = X.AnonymousClass7TG.A0E(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.A03
            int r0 = X.C41845B3m.A00(r0)
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.Object r0 = r3.A00
            int r1 = X.AnonymousClass7TE.A0N(r0, r1)
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61038Jvc.hashCode():int");
    }

    public C61038Jvc(String str, String str2) {
        this.A05 = 0;
        LinkedHashSet A0y = DbS.A0y();
        this.A05 = 0;
        this.A02 = str;
        this.A01 = str2;
        this.A03 = null;
        this.A00 = A0y;
        this.A04 = false;
    }

    public C61038Jvc(C61079JwH jwH, String str, String str2, String str3, boolean z) {
        this.A05 = 2;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = z;
        this.A01 = str3;
        this.A00 = jwH;
    }

    public C61038Jvc() {
        this.A05 = 3;
        this.A05 = 3;
        this.A01 = "$0";
        this.A02 = "0";
        this.A00 = 0;
        this.A03 = "$0";
        this.A04 = false;
    }
}
