package X;

/* renamed from: X.Gpc  reason: case insensitive filesystem */
public final class C53506Gpc extends AnonymousClass0T0 implements C59550JNw {
    public final C286025Tq A00;
    public final 0sP A01;

    public C53506Gpc(C286025Tq r2, 0sP r3) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
        this.A01 = r3;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53506Gpc) {
                C53506Gpc gpc = (C53506Gpc) obj;
                if (!0qQ.A0K(this.A00, gpc.A00) || !0qQ.A0K(this.A01, gpc.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ CharSequence Bfa() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + AnonymousClass7TG.A0C(this.A01);
    }
}
