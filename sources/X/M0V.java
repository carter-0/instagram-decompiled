package X;

import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.user.model.User;

public final class M0V implements MVW {
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public C61052Jvq A05;
    public LiveUserPaySupportTier A06;
    public C252883pr A07 = C252883pr.Success;
    public User A08;
    public Boolean A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;

    public final long AsD() {
        return this.A03;
    }

    public final C62584KiH BNP() {
        return C62584KiH.A0A;
    }

    public final User CCd() {
        return this.A08;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof M0V) {
            M0V m0v = (M0V) obj;
            if (0qQ.A0K(getPk(), m0v.getPk()) && this.A06 == m0v.A06 && this.A01 == m0v.A01 && this.A02 == m0v.A02) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final String getPk() {
        String str = this.A0A;
        if (str == null) {
            return String.valueOf(super.hashCode());
        }
        return str;
    }

    public final String getText() {
        return this.A0D;
    }

    public final int hashCode() {
        return JTR.A0G(this.A0A);
    }
}
