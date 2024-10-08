package X;

/* renamed from: X.2gP  reason: invalid class name */
public final class AnonymousClass2gP extends AnonymousClass2gQ implements AnonymousClass0hF {
    public final AnonymousClass07Z A00;
    public final /* synthetic */ 2Fk A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass2gP(AnonymousClass07Z r1, 2Fk r2, AnonymousClass2gO r3) {
        super(r2, r3);
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void A00() {
        this.A00.getLifecycle().A0A(this);
    }

    public final boolean A02() {
        if (this.A00.getLifecycle().A07().compareTo(07U.A05) >= 0) {
            return true;
        }
        return false;
    }

    public final void Dms(07T r5, AnonymousClass07Z r6) {
        AnonymousClass07Z r3 = this.A00;
        07U A07 = r3.getLifecycle().A07();
        if (A07 == 07U.A02) {
            this.A01.A08(this.A02);
            return;
        }
        07U r1 = null;
        while (r1 != A07) {
            A01(A02());
            r1 = A07;
            A07 = r3.getLifecycle().A07();
        }
    }
}
