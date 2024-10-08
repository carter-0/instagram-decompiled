package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Mb2  reason: case insensitive filesystem */
public final class C66695Mb2 extends C69597Nof {
    public final ImageUrl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C66695Mb2) && 0qQ.A0K(this.A00, ((C66695Mb2) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }

    public C66695Mb2(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Single(url=");
        return AnonymousClass7TG.A0n(this.A00, A1A);
    }
}
