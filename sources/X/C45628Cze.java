package X;

import com.instagram.api.schemas.StickerTraySurface;

/* renamed from: X.Cze  reason: case insensitive filesystem */
public abstract class C45628Cze {
    public static StickerTraySurface A00(Object obj) {
        return A01((String) obj);
    }

    public static final StickerTraySurface A01(String str) {
        StickerTraySurface stickerTraySurface = (StickerTraySurface) StickerTraySurface.A01.get(str);
        if (stickerTraySurface == null) {
            return StickerTraySurface.UNRECOGNIZED;
        }
        return stickerTraySurface;
    }
}
