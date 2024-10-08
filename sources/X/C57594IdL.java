package X;

import java.util.List;

/* renamed from: X.IdL  reason: case insensitive filesystem */
public final class C57594IdL implements JMY {
    public final List A00;

    public C57594IdL(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C57594IdL) && 0qQ.A0K(this.A00, ((C57594IdL) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("FBVideoCreationInput(mediaUrls=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
