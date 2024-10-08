package X;

/* renamed from: X.Jjc  reason: case insensitive filesystem */
public final class C60333Jjc extends C63569KzI {
    public final Throwable A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60333Jjc(Throwable th) {
        super(false);
        0qQ.A0B(th, 1);
        this.A00 = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C60333Jjc) {
            C60333Jjc jjc = (C60333Jjc) obj;
            if (this.A00 != jjc.A00 || !0qQ.A0K(this.A00, jjc.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        if (this.A00) {
            i = 1231;
        }
        return AnonymousClass7TE.A0N(this.A00, i);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Error(endOfPaginationReached=");
        A1A.append(this.A00);
        A1A.append(", error=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
