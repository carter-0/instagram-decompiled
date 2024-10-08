package X;

/* renamed from: X.5IA  reason: invalid class name */
public final class AnonymousClass5IA extends 0ng {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ AnonymousClass4Z9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5IA(1P0 r3, AnonymousClass4Z9 r4, int i) {
        super(i, 3, false, false);
        this.A01 = r4;
        this.A00 = r3;
    }

    public final void run() {
        1XR r1 = this.A01.A03;
        if (r1 != null) {
            this.A00.onSuccessInBackground(r1);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
