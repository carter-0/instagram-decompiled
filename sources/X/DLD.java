package X;

import com.instagram.api.schemas.MetaGalleryAlbumType;

public final class DLD extends 0Yg implements 0sP {
    public static final DLD A00 = new DLD();

    public DLD() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MetaGalleryAlbumType.A01.get(obj);
        if (obj2 == null) {
            return MetaGalleryAlbumType.UNRECOGNIZED;
        }
        return obj2;
    }
}
