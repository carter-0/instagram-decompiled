package X;

/* renamed from: X.6W1  reason: invalid class name */
public final class AnonymousClass6W1 implements 1UV {
    public final /* synthetic */ AnonymousClass6W0 A00;

    public AnonymousClass6W1(AnonymousClass6W0 r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        for (1UV apply : this.A00.A01) {
            if (!apply.apply(obj)) {
                return false;
            }
        }
        return true;
    }
}
