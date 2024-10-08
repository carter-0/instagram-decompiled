package X;

import com.instagram.api.schemas.SMBPartnerType;

/* renamed from: X.3qx  reason: invalid class name and case insensitive filesystem */
public abstract class C253543qx {
    public static final SMBPartnerType A00(String str) {
        SMBPartnerType sMBPartnerType = (SMBPartnerType) SMBPartnerType.A01.get(str);
        if (sMBPartnerType == null) {
            return SMBPartnerType.UNRECOGNIZED;
        }
        return sMBPartnerType;
    }
}
