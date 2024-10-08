package X;

import java.util.List;

public final class A9Y {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof A9Y) && 0qQ.A0K(this.A00, ((A9Y) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public A9Y(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("AiOutputSpec(types=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
