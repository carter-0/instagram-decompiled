package X;

import java.util.List;

/* renamed from: X.9ZE  reason: invalid class name */
public final class AnonymousClass9ZE extends C391749ta {
    public final List A00;

    public AnonymousClass9ZE(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass9ZE) && 0qQ.A0K(this.A00, ((AnonymousClass9ZE) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Success(aiOutputs=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
