package X;

import com.instagram.api.schemas.UserMonetizationProductType;

/* renamed from: X.4kq  reason: invalid class name and case insensitive filesystem */
public abstract class C272504kq {
    public static final UserMonetizationProductType A00(String str) {
        UserMonetizationProductType userMonetizationProductType = (UserMonetizationProductType) UserMonetizationProductType.A01.get(str);
        if (userMonetizationProductType == null) {
            return UserMonetizationProductType.UNRECOGNIZED;
        }
        return userMonetizationProductType;
    }
}
