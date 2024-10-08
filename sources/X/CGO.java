package X;

import java.util.List;

public final class CGO extends 1XP implements 1XU, AnonymousClass1XV, C66446MSa {
    public long A00 = -1;
    public long A01 = -1;
    public BB1 A02;
    public String A03;
    public String A04;
    public List A05 = AnonymousClass7TE.A1C();

    public final /* synthetic */ void EQF(String str) {
    }

    public final CGO F04() {
        return this;
    }

    public final boolean A00() {
        BB1 bb1 = this.A02;
        if (bb1 == null || !bb1.A01 || getNextMaxId() == null) {
            return false;
        }
        return true;
    }

    public final long AjJ() {
        return this.A00;
    }

    public final long AjP() {
        return this.A01;
    }

    public final boolean CP6() {
        return true;
    }

    public final boolean CPJ() {
        return false;
    }

    public final boolean CPt() {
        return AnonymousClass7TF.A1P((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1)));
    }

    public final String getNextMaxId() {
        BB1 bb1 = this.A02;
        if (bb1 != null) {
            return bb1.A00;
        }
        return null;
    }

    public final void EQE(long j) {
        this.A00 = j;
    }

    public final void EQG(long j) {
        this.A01 = j;
    }
}
