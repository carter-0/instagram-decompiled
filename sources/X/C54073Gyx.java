package X;

/* renamed from: X.Gyx  reason: case insensitive filesystem */
public abstract class C54073Gyx extends 1XP implements 1XU, AnonymousClass1XV {
    public long A00 = -1;
    public String A01 = "";
    public long A02 = -1;

    public final boolean CPJ() {
        return false;
    }

    public final /* synthetic */ void EQF(String str) {
    }

    public final long AjJ() {
        return this.A02;
    }

    public final long AjP() {
        return this.A00;
    }

    public final boolean CP6() {
        if (this instanceof HE8) {
            return ((HE8) this).A02;
        }
        return true;
    }

    public final boolean CPt() {
        return AnonymousClass7TF.A1P((this.A00 > -1 ? 1 : (this.A00 == -1 ? 0 : -1)));
    }

    public final String getNextMaxId() {
        return this.A01;
    }

    public final void EQE(long j) {
        this.A02 = j;
    }

    public final void EQG(long j) {
        this.A00 = j;
    }
}
