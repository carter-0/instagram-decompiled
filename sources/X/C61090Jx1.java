package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Jx1  reason: case insensitive filesystem */
public final class C61090Jx1 extends AnonymousClass0T0 implements C66378MPk {
    public final ImageUrl A00;

    public C61090Jx1(ImageUrl imageUrl) {
        0qQ.A0B(imageUrl, 1);
        this.A00 = imageUrl;
    }

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C61090Jx1) && 0qQ.A0K(this.A00, ((C61090Jx1) obj).A00));
    }

    public final int hashCode() {
        return this.A00.hashCode();
    }
}
