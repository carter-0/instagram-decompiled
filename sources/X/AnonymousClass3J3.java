package X;

import com.facebook.tigon.iface.TigonErrorCode;

/* renamed from: X.3J3  reason: invalid class name */
public final class AnonymousClass3J3 {
    public final TigonErrorCode fromValue(int i) {
        TigonErrorCode tigonErrorCode = (TigonErrorCode) TigonErrorCode.NUMERIC_TO_ERROR_CODE.get(Integer.valueOf(i));
        if (tigonErrorCode == null) {
            return TigonErrorCode.NONE;
        }
        return tigonErrorCode;
    }
}
