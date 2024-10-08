package X;

/* renamed from: X.Jjr  reason: case insensitive filesystem */
public final class C60346Jjr extends C62693Kkt {
    public final Throwable A00;

    public C60346Jjr(Throwable th) {
        0qQ.A0B(th, 1);
        this.A00 = th;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C60346Jjr) && 0qQ.A0K(this.A00, ((C60346Jjr) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoadResult.Error(\n                    |   throwable: ");
        A1A.append(this.A00);
        return 0rw.A0u(AnonymousClass7TF.A0l("\n                    |) ", A1A), "|");
    }
}
