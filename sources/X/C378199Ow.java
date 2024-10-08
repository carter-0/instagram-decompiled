package X;

import com.instagram.api.schemas.ACRType;

/* renamed from: X.9Ow  reason: invalid class name and case insensitive filesystem */
public abstract class C378199Ow {
    public static final ACRType A00(String str) {
        ACRType aCRType = (ACRType) ACRType.A01.get(str);
        if (aCRType == null) {
            return ACRType.UNRECOGNIZED;
        }
        return aCRType;
    }
}
