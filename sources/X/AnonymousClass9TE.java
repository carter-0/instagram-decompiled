package X;

/* renamed from: X.9TE  reason: invalid class name */
public final /* synthetic */ class AnonymousClass9TE implements Runnable {
    public final /* synthetic */ AnonymousClass8LU A00;
    public final /* synthetic */ boolean A01;

    public /* synthetic */ AnonymousClass9TE(AnonymousClass8LU r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }

    public final void run() {
        int i;
        AnonymousClass8LU r3 = this.A00;
        boolean z = this.A01;
        C378369Pn r0 = r3.A0B;
        if (r0 != null && (i = r0.A03) != -1 && i > 0 && !z) {
            AnonymousClass8LU.A0A(r3, i);
        }
        if (C305756Jk.A01(r3.A0c)) {
            ((C3503584i) r3.A0Z.A00.A00()).EHz();
        }
        r3.A0I = true;
        for (C3506985v Dxa : r3.A11) {
            Dxa.Dxa();
        }
    }
}
