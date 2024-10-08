package X;

import java.util.List;

/* renamed from: X.GlK  reason: case insensitive filesystem */
public final class C53272GlK extends AnonymousClass0T0 {
    public final int A00;
    public final String A01;
    public final List A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53272GlK) {
                C53272GlK glK = (C53272GlK) obj;
                if (!0qQ.A0K(this.A03, glK.A03) || !0qQ.A0K(this.A01, glK.A01) || this.A00 != glK.A00 || !0qQ.A0K(this.A02, glK.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, (((AnonymousClass7TE.A0K(this.A03) + AnonymousClass7TG.A0E(this.A01)) * 31) + this.A00) * 31);
    }

    public C53272GlK(String str, List list, List list2, int i) {
        C51972G9s.A1B(list, list2);
        this.A03 = list;
        this.A01 = str;
        this.A00 = i;
        this.A02 = list2;
    }
}
