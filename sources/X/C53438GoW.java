package X;

import java.util.List;

/* renamed from: X.GoW  reason: case insensitive filesystem */
public final class C53438GoW extends AnonymousClass0T0 implements JRW {
    public final String A00;
    public final String A01;
    public final List A02;
    public final List A03;
    public final String A04;

    public C53438GoW(String str, String str2, String str3, List list, List list2) {
        0qQ.A0B(str2, 3);
        this.A02 = list;
        this.A04 = str;
        this.A00 = str2;
        this.A01 = str3;
        this.A03 = list2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53438GoW) {
                C53438GoW goW = (C53438GoW) obj;
                if (!0qQ.A0K(this.A02, goW.A02) || !0qQ.A0K(this.A04, goW.A04) || !0qQ.A0K(this.A00, goW.A00) || !0qQ.A0K(this.A01, goW.A01) || !0qQ.A0K(this.A03, goW.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A08(this.A00, ((AnonymousClass7TG.A0C(this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }
}
