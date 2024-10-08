package X;

import com.instagram.api.schemas.MetaGalleryNetegoInStoryMediaType;

public final class DLE extends 0Yg implements 0sP {
    public static final DLE A00 = new DLE();

    public DLE() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = MetaGalleryNetegoInStoryMediaType.A01.get(obj);
        if (obj2 == null) {
            return MetaGalleryNetegoInStoryMediaType.UNRECOGNIZED;
        }
        return obj2;
    }
}
