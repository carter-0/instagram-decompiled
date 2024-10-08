package X;

import com.facebook.phonenumbers.PhoneNumberUtil;

/* renamed from: X.79w  reason: invalid class name and case insensitive filesystem */
public final class C3272179w implements C3271979u {
    public final char AWt(char c, char c2) {
        char AWt = PhoneNumberUtil.A0H.AWt(c, 55296);
        if (AWt == 55296 && (AWt = PhoneNumberUtil.A0J.AWt(c, 55296)) == 55296) {
            return 55296;
        }
        return AWt;
    }
}
