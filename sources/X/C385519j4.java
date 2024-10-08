package X;

/* renamed from: X.9j4  reason: invalid class name and case insensitive filesystem */
public final class C385519j4 extends C360018dr {
    public final Throwable A00;
    public final C361118fh A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C385519j4) {
                C385519j4 r5 = (C385519j4) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A01, AnonymousClass7TE.A0K(this.A00));
    }

    public C385519j4(C361118fh r1, Throwable th) {
        super(r1);
        this.A00 = th;
        this.A01 = r1;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Failure(exception=");
        A1A.append(this.A00);
        A1A.append(", fetchSummaryData=");
        return AnonymousClass7TG.A0n(this.A01, A1A);
    }
}
