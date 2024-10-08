package X;

import java.util.ArrayList;
import java.util.List;

public final class CGM extends 1XP implements 1XU, AnonymousClass1XV {
    public long A00 = -1;
    public long A01 = -1;
    public C276104sZ A02 = null;
    public List A03 = null;
    public final ArrayList A04 = AnonymousClass7TE.A1C();

    public final /* synthetic */ void EQF(String str) {
    }

    public final long AjJ() {
        return this.A00;
    }

    public final long AjP() {
        return this.A01;
    }

    public final boolean CP6() {
        C276104sZ r0 = this.A02;
        if (r0 != null) {
            return r0.A01;
        }
        return false;
    }

    public final boolean CPJ() {
        return false;
    }

    public final boolean CPt() {
        return AnonymousClass7TF.A1P((this.A01 > -1 ? 1 : (this.A01 == -1 ? 0 : -1)));
    }

    public final String getNextMaxId() {
        C276104sZ r0 = this.A02;
        if (r0 != null) {
            return r0.A00;
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
