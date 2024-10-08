package X;

import java.util.List;

/* renamed from: X.Jtj  reason: case insensitive filesystem */
public final class C60925Jtj extends AnonymousClass0T0 {
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final List A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60925Jtj) {
                C60925Jtj jtj = (C60925Jtj) obj;
                if (!0qQ.A0K(this.A01, jtj.A01) || !0qQ.A0K(this.A02, jtj.A02) || !0qQ.A0K(this.A03, jtj.A03) || !0qQ.A0K(this.A00, jtj.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0E(this.A01) * 31)) + AnonymousClass7TE.A0L(this.A00);
    }

    public C60925Jtj(Integer num, String str, String str2, List list) {
        AnonymousClass7TG.A1Q(str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = list;
        this.A00 = num;
    }
}
