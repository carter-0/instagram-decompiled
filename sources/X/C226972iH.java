package X;

import com.instagram.common.typedurl.ExpirableImageUrl;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.2iH  reason: invalid class name and case insensitive filesystem */
public abstract class C226972iH {
    public static final ImageUrl A00(ImageUrl imageUrl) {
        if (!(imageUrl instanceof ExpirableImageUrl)) {
            return imageUrl;
        }
        AnonymousClass16c A00 = AnonymousClass3OT.A00((AnonymousClass16c) imageUrl);
        0qQ.A0A(A00);
        return (ImageUrl) A00;
    }
}
