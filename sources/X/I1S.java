package X;

public final class I1S {
    public final C284945Oz A00;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof I1S)) {
            return false;
        }
        return C51969G9p.A1U(this.A00, ((I1S) obj).A00.getValue());
    }

    public final int hashCode() {
        return this.A00.getValue().hashCode();
    }

    public I1S(HP4 hp4) {
        this.A00 = C51970G9q.A0S(hp4);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ContextMenuState(status=");
        return AnonymousClass7TG.A0n(this.A00.getValue(), A1A);
    }

    public I1S() {
        this(C52887GeN.A00);
    }
}
