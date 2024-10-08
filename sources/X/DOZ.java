package X;

import com.instagram.api.schemas.StoryAdKeywordTypeEnum;

public final class DOZ extends 0Yg implements 0sP {
    public static final DOZ A00 = new DOZ();

    public DOZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = StoryAdKeywordTypeEnum.A01.get(obj);
        if (obj2 == null) {
            return StoryAdKeywordTypeEnum.UNRECOGNIZED;
        }
        return obj2;
    }
}
