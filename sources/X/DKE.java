package X;

import com.instagram.api.schemas.AudioBrowserCategoryType;

public final class DKE extends 0Yg implements 0sP {
    public static final DKE A00 = new DKE();

    public DKE() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = AudioBrowserCategoryType.A01.get(obj);
        if (obj2 == null) {
            return AudioBrowserCategoryType.UNRECOGNIZED;
        }
        return obj2;
    }
}
