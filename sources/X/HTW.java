package X;

import com.instagram.api.schemas.ClipsMidCardSubtype;

public abstract class HTW {
    public static final ClipsMidCardSubtype A00(String str) {
        ClipsMidCardSubtype clipsMidCardSubtype = (ClipsMidCardSubtype) ClipsMidCardSubtype.A01.get(str);
        if (clipsMidCardSubtype == null) {
            return ClipsMidCardSubtype.A0v;
        }
        return clipsMidCardSubtype;
    }
}
