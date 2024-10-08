package X;

import java.util.List;

/* renamed from: X.NWo  reason: case insensitive filesystem */
public final class C68779NWo extends C69597Nof {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68779NWo) && 0qQ.A0K(this.A00, ((C68779NWo) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C68779NWo(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Faceswarm(urls=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
