package X;

/* renamed from: X.Gb3  reason: case insensitive filesystem */
public final class C52691Gb3 extends HPH {
    public final Runnable A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C52691Gb3) && 0qQ.A0K(this.A00, ((C52691Gb3) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C52691Gb3(Runnable runnable) {
        this.A00 = runnable;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Subscription(cancelToken=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
