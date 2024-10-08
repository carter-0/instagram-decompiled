package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.50R  reason: invalid class name */
public final class AnonymousClass50R implements AnonymousClass17B, AnonymousClass171 {
    public ImageUrl A00;
    public String A01;

    public final ImageUrl Bh3() {
        ImageUrl imageUrl = this.A00;
        if (imageUrl != null) {
            return imageUrl;
        }
        0qQ.A0F("profilePicUrl");
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getId() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        0qQ.A0F("_id");
        throw AnonymousClass00P.createAndThrow();
    }
}
