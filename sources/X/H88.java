package X;

public final class H88 extends 0ng {
    public final /* synthetic */ 1P0 A00;
    public final /* synthetic */ AnonymousClass4Z9 A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H88(1P0 r3, AnonymousClass4Z9 r4, int i) {
        super(i, 3, false, false);
        this.A01 = r4;
        this.A00 = r3;
    }

    public final void run() {
        C268654dm r1 = this.A01.A01;
        if (r1 != null) {
            this.A00.onFailInBackground(r1);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
