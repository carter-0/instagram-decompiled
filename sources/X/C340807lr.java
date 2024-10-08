package X;

/* renamed from: X.7lr  reason: invalid class name and case insensitive filesystem */
public final class C340807lr {
    public boolean A00;
    public final C340757lm A01;

    public final void A00(String str) {
        A01(002.A0R("Can only check if prepared on the Optic thread. ", str));
        if (!this.A00) {
            throw new IllegalStateException(002.A0u("Not prepared: ", str, " Current thread: ", Thread.currentThread().getName()));
        }
    }

    public final void A01(String str) {
        if (!this.A01.A09()) {
            throw new RuntimeException(002.A0g(str, " Current thread: ", Thread.currentThread().getName()));
        }
    }

    public final void A02(boolean z, String str) {
        A01(002.A0R("Can only set the prepared state on the Optic thread. ", str));
        this.A00 = z;
    }

    public C340807lr(C340757lm r1) {
        this.A01 = r1;
    }
}
