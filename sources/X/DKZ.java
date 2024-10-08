package X;

import com.instagram.api.schemas.CreatorViewerInsightType;

public final class DKZ extends 0Yg implements 0sP {
    public static final DKZ A00 = new DKZ();

    public DKZ() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = CreatorViewerInsightType.A01.get(obj);
        if (obj2 == null) {
            return CreatorViewerInsightType.UNRECOGNIZED;
        }
        return obj2;
    }
}
