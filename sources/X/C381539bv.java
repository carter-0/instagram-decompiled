package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.9bv  reason: invalid class name and case insensitive filesystem */
public final class C381539bv extends AnonymousClass0T0 {
    public long A00 = 0;
    public ImageUrl A01 = null;
    public String A02 = null;
    public String A03 = null;
    public String A04 = null;
    public String A05 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C381539bv) {
                C381539bv r8 = (C381539bv) obj;
                if (this.A00 != r8.A00 || !0qQ.A0K(this.A05, r8.A05) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A01, r8.A01) || !0qQ.A0K(this.A02, r8.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A00;
        int i = 0;
        int A0E = ((((((((((int) (j ^ (j >>> 32))) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31;
        String str = this.A02;
        if (str != null) {
            i = str.hashCode();
        }
        return A0E + i;
    }
}
