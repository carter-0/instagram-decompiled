package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

public final class LGC {
    public final int A00;
    public final long A01;
    public final C61052Jvq A02;
    public final ImageUrl A03;
    public final User A04;
    public final C16669Uz5 A05;
    public final C391379sn A06;
    public final Long A07;
    public final String A08;
    public final boolean A09;

    public final boolean equals(Object obj) {
        if (!(obj instanceof LGC)) {
            return false;
        }
        LGC lgc = (LGC) obj;
        if (this.A01 == lgc.A01 && 0qQ.A0K(this.A04, lgc.A04) && this.A05 == lgc.A05 && this.A00 == lgc.A00 && 0qQ.A0K(this.A08, lgc.A08) && 0qQ.A0K(this.A02, lgc.A02) && this.A09 == lgc.A09) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 0;
        int A082 = AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A07(this.A05, (C51975G9x.A03(this.A01) + C51971G9r.A0E(this.A04)) * 31));
        C61052Jvq jvq = this.A02;
        if (jvq != null) {
            i = jvq.hashCode();
        }
        return A082 + i;
    }

    public LGC(C61052Jvq jvq, ImageUrl imageUrl, User user, C16669Uz5 uz5, C391379sn r5, Long l, String str, int i, long j, boolean z) {
        this.A01 = j;
        this.A04 = user;
        this.A03 = imageUrl;
        this.A08 = str;
        this.A05 = uz5;
        this.A06 = r5;
        this.A00 = i;
        this.A09 = z;
        this.A07 = l;
        this.A02 = jvq;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Question{id=");
        A1A.append(this.A01);
        A1A.append(", author=");
        A1A.append(this.A04);
        A1A.append(", body='");
        A1A.append(this.A08);
        A1A.append("', state=");
        A1A.append(this.A06);
        A1A.append(", source=");
        A1A.append(this.A05);
        A1A.append(", igLiveSupporterInfo =");
        A1A.append(this.A02);
        return C51967G9n.A0r(A1A, '}');
    }
}
