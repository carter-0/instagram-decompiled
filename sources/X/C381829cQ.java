package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.9cQ  reason: invalid class name and case insensitive filesystem */
public final class C381829cQ extends AnonymousClass0T0 {
    public final int A00 = 2;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;
    public final boolean A06;

    public C381829cQ(ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, String str, boolean z) {
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A05 = z;
        this.A04 = str;
        this.A03 = num;
        this.A06 = true;
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        C381829cQ r3;
        switch (this.A00) {
            case 0:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C381829cQ)) {
                    return false;
                }
                r3 = (C381829cQ) obj;
                if (r3.A00 != 0 || !0qQ.A0K(this.A03, r3.A03) || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02) || this.A06 != r3.A06 || !0qQ.A0K(this.A04, r3.A04)) {
                    return false;
                }
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C381829cQ) {
                    C381829cQ r32 = (C381829cQ) obj;
                    if (r32.A00 == 1 && 0qQ.A0K(this.A01, r32.A01) && 0qQ.A0K(this.A02, r32.A02) && this.A05 == r32.A05 && 0qQ.A0K(this.A04, r32.A04) && 0qQ.A0K(this.A03, r32.A03)) {
                        z = this.A06;
                        z2 = r32.A06;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
            default:
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C381829cQ)) {
                    return false;
                }
                r3 = (C381829cQ) obj;
                if (r3.A00 != 2 || !0qQ.A0K(this.A01, r3.A01) || !0qQ.A0K(this.A02, r3.A02) || !0qQ.A0K(this.A04, r3.A04) || this.A06 != r3.A06 || this.A03 != r3.A03) {
                    return false;
                }
        }
        z = this.A05;
        z2 = r3.A05;
        if (z != z2) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A09;
        int hashCode;
        int A08;
        boolean z;
        switch (this.A00) {
            case 0:
                A09 = AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A01, AnonymousClass7TE.A0K(this.A03))));
                hashCode = this.A04.hashCode();
                break;
            case 1:
                A08 = (AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A09(this.A05, ((AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31)) + AnonymousClass7TE.A0L(this.A03)) * 31;
                z = this.A06;
                break;
            default:
                int A0K = AnonymousClass7TE.A0K(this.A01);
                A09 = AnonymousClass7TF.A09(this.A06, (AnonymousClass7TF.A07(this.A02, A0K) + AnonymousClass7TG.A0E(this.A04)) * 31);
                hashCode = this.A03.hashCode();
                break;
        }
        A08 = (A09 + hashCode) * 31;
        z = this.A05;
        int i = 1237;
        if (z) {
            i = 1231;
        }
        return A08 + i;
    }

    public C381829cQ(AnonymousClass5OB r4, C267324bN r5, C52058GDe gDe) {
        this.A01 = r5;
        this.A02 = gDe;
        this.A04 = null;
        this.A06 = false;
        this.A03 = r4;
        this.A05 = false;
    }

    public C381829cQ(DQT dqt, Hashtag hashtag, AnonymousClass3ZT r4, String str, boolean z, boolean z2) {
        0qQ.A0B(dqt, 3);
        this.A03 = r4;
        this.A01 = hashtag;
        this.A02 = dqt;
        this.A06 = z;
        this.A04 = str;
        this.A05 = z2;
    }
}
