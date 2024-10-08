package X;

/* renamed from: X.6Ib  reason: invalid class name and case insensitive filesystem */
public final class C305456Ib {
    public final C285045Pl A00 = new C285045Pl(new AnonymousClass6Ic[16]);

    public final void A00(Throwable th) {
        C285045Pl r5 = this.A00;
        int i = r5.A00;
        1IX[] r3 = new 1IX[i];
        for (int i2 = 0; i2 < i; i2++) {
            r3[i2] = ((AnonymousClass6Ic) r5.A02[i2]).A01;
        }
        for (int i3 = 0; i3 < i; i3++) {
            r3[i3].AG9(th);
        }
        if (r5.A00 != 0) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }
}
