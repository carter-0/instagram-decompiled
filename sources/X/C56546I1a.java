package X;

import java.util.List;

/* renamed from: X.I1a  reason: case insensitive filesystem */
public final class C56546I1a {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56546I1a) && 0qQ.A0K(this.A00, ((C56546I1a) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C56546I1a(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("WriteWithAIFetchPromptSuggestionsResponse(result=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }

    public C56546I1a() {
        this(0sn.A00);
    }
}
