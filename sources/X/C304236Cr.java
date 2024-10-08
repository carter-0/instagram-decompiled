package X;

import com.instagram.api.schemas.LineType;

/* renamed from: X.6Cr  reason: invalid class name and case insensitive filesystem */
public abstract class C304236Cr {
    public static final Integer A00(LineType lineType, Integer num) {
        int intValue = num.intValue();
        if (intValue != 1 && intValue != 2 && intValue != 4) {
            int ordinal = lineType.ordinal();
            if (ordinal == 3) {
                return AnonymousClass05K.A0N;
            }
            if (ordinal == 1) {
                return AnonymousClass05K.A0C;
            }
            if (!(ordinal == 2 || ordinal == 0)) {
                throw new RuntimeException();
            }
        } else if (lineType != LineType.NONE) {
            return num;
        }
        return AnonymousClass05K.A00;
    }
}
