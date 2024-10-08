package X;

import java.util.List;

/* renamed from: X.8cK  reason: invalid class name and case insensitive filesystem */
public final class C359238cK extends C359248cL {
    public final long A00;
    public final C359218cI A01;
    public final Integer A02;
    public final String A03;
    public final List A04;
    public final boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C359238cK(C359218cI r2, Integer num, String str, List list, long j, boolean z) {
        super(r2);
        0qQ.A0B(r2, 2);
        this.A03 = str;
        this.A01 = r2;
        this.A04 = list;
        this.A00 = j;
        this.A05 = z;
        this.A02 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C359238cK) {
                C359238cK r8 = (C359238cK) obj;
                if (!0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A01, r8.A01) || !0qQ.A0K(this.A04, r8.A04) || this.A00 != r8.A00 || this.A05 != r8.A05 || !0qQ.A0K(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.A03;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        long j = this.A00;
        int hashCode2 = ((((((((hashCode * 31) + this.A01.hashCode()) * 31) + this.A04.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + 1231) * 31;
        int i2 = 1237;
        if (this.A05) {
            i2 = 1231;
        }
        int i3 = (hashCode2 + i2) * 31;
        Integer num = this.A02;
        if (num != null) {
            i = num.hashCode();
        }
        return i3 + i;
    }
}
