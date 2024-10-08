package X;

import com.instagram.api.schemas.XIGIGBoostDestination;

/* renamed from: X.V8h  reason: case insensitive filesystem */
public abstract class C16852V8h {
    public static final XIGIGBoostDestination A00(String str) {
        XIGIGBoostDestination xIGIGBoostDestination = (XIGIGBoostDestination) XIGIGBoostDestination.A01.get(str);
        if (xIGIGBoostDestination == null) {
            return XIGIGBoostDestination.UNRECOGNIZED;
        }
        return xIGIGBoostDestination;
    }
}
