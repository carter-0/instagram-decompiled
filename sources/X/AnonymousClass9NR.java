package X;

import java.util.List;

/* renamed from: X.9NR  reason: invalid class name */
public final class AnonymousClass9NR extends AnonymousClass0T0 {
    public final C376459Ib A00;
    public final String A01;
    public final String A02;
    public final List A03;
    public final boolean A04;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass9NR) {
                AnonymousClass9NR r5 = (AnonymousClass9NR) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A01, r5.A01) || this.A04 != r5.A04 || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A00, r5.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A08 = AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A02));
        return AnonymousClass7TE.A0N(this.A00, (AnonymousClass7TF.A09(this.A04, A08) + AnonymousClass7TG.A0C(this.A03)) * 31);
    }

    public AnonymousClass9NR(C376459Ib r1, String str, String str2, List list, boolean z) {
        this.A02 = str;
        this.A01 = str2;
        this.A04 = z;
        this.A03 = list;
        this.A00 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("MediaInteractiveUiState(mediaId=");
        A1A.append(this.A02);
        A1A.append(", deliveryClass=");
        A1A.append(this.A01);
        A1A.append(AnonymousClass000.A00(847));
        A1A.append(this.A04);
        A1A.append(", reelInteractives=");
        A1A.append(this.A03);
        A1A.append(", actions=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
