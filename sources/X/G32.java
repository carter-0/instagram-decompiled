package X;

import com.instagram.api.schemas.GalleryMediaFolderEnum;

public final class G32 extends 0Yg implements 0sP {
    public static final G32 A00 = new G32();

    public G32() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = GalleryMediaFolderEnum.A01.get(obj);
        if (obj2 == null) {
            return GalleryMediaFolderEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
