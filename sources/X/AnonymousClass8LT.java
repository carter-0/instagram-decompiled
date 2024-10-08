package X;

/* renamed from: X.8LT  reason: invalid class name */
public final class AnonymousClass8LT implements AnonymousClass4DR {
    public final /* synthetic */ AnonymousClass80R A00;

    public AnonymousClass8LT(AnonymousClass80R r1) {
        this.A00 = r1;
    }

    public final boolean onBackPressed() {
        AnonymousClass80R r2 = this.A00;
        AnonymousClass85X r1 = r2.A0n;
        if (!r1.A09) {
            return r2.A0m.onBackPressed();
        }
        r1.A0C();
        return true;
    }
}
