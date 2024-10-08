package X;

import java.util.List;

/* renamed from: X.Jtr  reason: case insensitive filesystem */
public final class C60933Jtr extends AnonymousClass0T0 {
    public final BB1 A00;
    public final List A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public C60933Jtr(BB1 bb1, String str, String str2, List list, List list2) {
        DbW.A1N(list, 3, bb1);
        this.A02 = str;
        this.A03 = str2;
        this.A01 = list;
        this.A04 = list2;
        this.A00 = bb1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60933Jtr) {
                C60933Jtr jtr = (C60933Jtr) obj;
                if (!0qQ.A0K(this.A02, jtr.A02) || !0qQ.A0K(this.A03, jtr.A03) || !0qQ.A0K(this.A01, jtr.A01) || !0qQ.A0K(this.A04, jtr.A04) || !0qQ.A0K(this.A00, jtr.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        List list = this.A01;
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TF.A07(list, ((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A04)) * 31);
    }
}
