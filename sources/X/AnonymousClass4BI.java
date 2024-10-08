package X;

/* renamed from: X.4BI  reason: invalid class name */
public final class AnonymousClass4BI implements 1UV {
    public final /* synthetic */ AnonymousClass48S A00;

    public AnonymousClass4BI(AnonymousClass48S r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ boolean apply(Object obj) {
        boolean z;
        C254703su r4 = (C254703su) obj;
        AnonymousClass48S r2 = this.A00;
        synchronized (r2) {
            AnonymousClass3SZ Aue = r2.A0I.Aue(r2.A0H.A06);
            if (r4.A2D || !r2.A04.apply(r4) || (Aue != null && !r4.A1o(Aue.A02))) {
                z = false;
            } else {
                z = true;
            }
        }
        return z;
    }
}
