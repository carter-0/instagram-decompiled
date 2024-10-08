package X;

import java.util.List;

/* renamed from: X.7xI  reason: invalid class name and case insensitive filesystem */
public final class C347737xI {
    public final C347297wa A00;
    public final C347727xH A01;
    public final List A02;
    public final List A03;
    public final List A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C347737xI) {
                C347737xI r5 = (C347737xI) obj;
                if (this.A00 != r5.A00 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || this.A01 != r5.A01 || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int hashCode = ((((this.A00.hashCode() * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31;
        C347727xH r0 = this.A01;
        if (r0 != null) {
            i = r0.hashCode();
        }
        return ((hashCode + i) * 31) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FeatureConfig(appName=");
        sb.append(this.A00);
        sb.append(", surfaces=");
        sb.append(this.A04);
        sb.append(", contentTypes=");
        sb.append(this.A03);
        sb.append(", behavior=");
        sb.append(this.A01);
        sb.append(", additionalEligibilityRules=");
        sb.append(this.A02);
        sb.append(')');
        return sb.toString();
    }

    public C347737xI(C347297wa r1, C347727xH r2, List list, List list2, List list3) {
        this.A00 = r1;
        this.A04 = list;
        this.A03 = list2;
        this.A01 = r2;
        this.A02 = list3;
    }
}
