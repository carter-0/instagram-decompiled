package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.NaN  reason: case insensitive filesystem */
public final class C68885NaN extends C69611Not {
    public final ImageUrl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C68885NaN) && 0qQ.A0K(this.A00, ((C68885NaN) obj).A00));
    }

    public C68885NaN(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, C54732HQn.A00() * 31);
    }
}
