package X;

import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Nsh  reason: case insensitive filesystem */
public abstract class C69820Nsh {
    public static final ImageCacheKey A00(ImageUrl imageUrl) {
        List<ImageCacheKey> BwW = imageUrl.BwW();
        ImageCacheKey imageCacheKey = null;
        if (BwW != null) {
            for (ImageCacheKey imageCacheKey2 : BwW) {
                int i = imageCacheKey2.A01;
                int height = imageUrl.getHeight();
                if (i > height && imageCacheKey2.A00 > height) {
                    if (imageCacheKey == null || i < imageCacheKey.A01) {
                        imageCacheKey = imageCacheKey2;
                    }
                }
            }
        }
        return imageCacheKey;
    }
}
