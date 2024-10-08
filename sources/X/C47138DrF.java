package X;

/* renamed from: X.DrF  reason: case insensitive filesystem */
public final class C47138DrF extends AnonymousClass0T0 {
    public final C47185DsX A00;
    public final C47191Dsd A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47138DrF) {
                C47138DrF drF = (C47138DrF) obj;
                if (!0qQ.A0K(this.A01, drF.A01) || !0qQ.A0K(this.A00, drF.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0C(this.A01) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public C47138DrF(C47185DsX dsX, C47191Dsd dsd) {
        this.A01 = dsd;
        this.A00 = dsX;
    }
}
