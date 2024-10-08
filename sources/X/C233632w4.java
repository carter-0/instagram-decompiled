package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.2w4  reason: invalid class name and case insensitive filesystem */
public final class C233632w4 extends AnonymousClass0T0 {
    public static final C233632w4 A05 = new C233632w4(0sn.A00, 0, 0, false);
    public boolean A00;
    public final int A01;
    public final int A02;
    public final List A03;
    public final List A04;

    public C233632w4(List list, int i, int i2, boolean z) {
        0qQ.A0B(list, 3);
        this.A02 = i;
        this.A01 = i2;
        this.A04 = list;
        this.A00 = z;
        List unmodifiableList = Collections.unmodifiableList(list);
        0qQ.A07(unmodifiableList);
        this.A03 = unmodifiableList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C233632w4) {
                C233632w4 r5 = (C233632w4) obj;
                if (!(this.A02 == r5.A02 && this.A01 == r5.A01 && 0qQ.A0K(this.A04, r5.A04) && this.A00 == r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("EntryCriteria(initialContentIndex=");
        sb.append(this.A02);
        sb.append(", entryPointIndex=");
        sb.append(this.A01);
        sb.append(", reelTrayIds=");
        sb.append(this.A04);
        sb.append(", isHpAdSensitive=");
        sb.append(this.A00);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = ((((this.A02 * 31) + this.A01) * 31) + this.A04.hashCode()) * 31;
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return hashCode + i;
    }
}
