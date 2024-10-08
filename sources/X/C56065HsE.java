package X;

import java.util.List;

/* renamed from: X.HsE  reason: case insensitive filesystem */
public final class C56065HsE {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56065HsE) && 0qQ.A0K(this.A00, ((C56065HsE) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C56065HsE(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("SpotlightItem(spotlightMediaList=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
