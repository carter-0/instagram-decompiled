package X;

import com.instagram.user.model.User;

public final class M0U implements MVW {
    public int A00 = 2;
    public int A01;
    public long A02 = JTR.A0L();
    public QP8 A03 = null;
    public User A04 = null;
    public Ki4 A05;
    public String A06;
    public String A07 = null;
    public String A08 = null;
    public String A09 = null;

    public M0U() {
        Ki4 ki4 = Ki4.UNKNOWN;
        boolean A1X = DbW.A1X(ki4);
        this.A05 = ki4;
        this.A01 = A1X ? 1 : 0;
    }

    public final long AsD() {
        return this.A02;
    }

    public final C62584KiH BNP() {
        switch (this.A05.ordinal()) {
            case 0:
                if (this.A01 > 1) {
                    return C62584KiH.A08;
                }
                return C62584KiH.A0G;
            case 1:
                return C62584KiH.A0H;
            case 2:
                return C62584KiH.A0I;
            case 4:
                return C62584KiH.A0M;
            case 7:
                return C62584KiH.A0B;
            case 8:
                return C62584KiH.A05;
            case 9:
                return C62584KiH.A0L;
            case 10:
                return C62584KiH.A0O;
            case 11:
                return C62584KiH.A07;
            default:
                return C62584KiH.A0K;
        }
    }

    public final User CCd() {
        return this.A04;
    }

    public final String getPk() {
        return this.A06;
    }

    public final String getText() {
        return this.A09;
    }
}
