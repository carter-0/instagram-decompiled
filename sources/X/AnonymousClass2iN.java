package X;

import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.2iN  reason: invalid class name */
public final class AnonymousClass2iN {
    public final ImageUrl A00;
    public final boolean A01;
    public final boolean A02;

    public AnonymousClass2iN(ImageUrl imageUrl, boolean z, boolean z2) {
        0qQ.A0B(imageUrl, 1);
        this.A00 = imageUrl;
        this.A02 = z;
        this.A01 = z2;
    }

    public final String A00() {
        String str = ((ImageCacheKey) this.A00.AjH()).A03;
        0qQ.A07(str);
        return str;
    }
}
