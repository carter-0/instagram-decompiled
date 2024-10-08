package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.6BY  reason: invalid class name */
public final class AnonymousClass6BY extends AnonymousClass0T0 {
    public final ImageUrl A00;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof AnonymousClass6BY) && 0qQ.A0K(this.A00, ((AnonymousClass6BY) obj).A00));
    }

    public final int hashCode() {
        ImageUrl imageUrl = this.A00;
        if (imageUrl == null) {
            return 0;
        }
        return imageUrl.hashCode();
    }

    public AnonymousClass6BY(ImageUrl imageUrl) {
        this.A00 = imageUrl;
    }
}
