package X;

import com.instagram.api.schemas.ClipsTextEmphasisMode;

public final class DNT extends 0Yg implements 0sP {
    public static final DNT A00 = new DNT();

    public DNT() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = ClipsTextEmphasisMode.A01.get(obj);
        if (obj2 == null) {
            return ClipsTextEmphasisMode.UNRECOGNIZED;
        }
        return obj2;
    }
}
