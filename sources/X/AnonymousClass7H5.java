package X;

/* renamed from: X.7H5  reason: invalid class name */
public final class AnonymousClass7H5 implements C328897Gr {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public AnonymousClass7H5(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public final boolean onBackPressed() {
        NIE nie = this.A00.A0L;
        if (nie == null || !nie.isVisible() || nie.A02.A0G) {
            return false;
        }
        return nie.onBackPressed();
    }
}
