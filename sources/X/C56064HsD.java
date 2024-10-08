package X;

import java.util.List;

/* renamed from: X.HsD  reason: case insensitive filesystem */
public final class C56064HsD {
    public final List A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C56064HsD) && 0qQ.A0K(this.A00, ((C56064HsD) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C56064HsD(List list) {
        this.A00 = list;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ImagineCreateResponse(images=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
