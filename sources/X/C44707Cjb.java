package X;

import com.instagram.api.schemas.SocialContextType;
import com.instagram.direct.model.DirectForwardingParams;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.Cjb  reason: case insensitive filesystem */
public abstract class C44707Cjb {
    public static AnonymousClass1dS A00(SocialContextType socialContextType, DirectForwardingParams directForwardingParams, C66665MaY maY, 1Xj r11, DirectThreadKey directThreadKey, Integer num, Long l, String str, String str2, long j, boolean z, boolean z2, boolean z3) {
        String str3;
        AnonymousClass9JI r2 = new AnonymousClass9JI(r11, num, str2, str, (String) null);
        if (socialContextType != null) {
            str3 = socialContextType.A00;
        } else {
            str3 = null;
        }
        1bp r3 = new 1bp(maY, directThreadKey, l, j);
        r3.A03 = false;
        r3.A04 = false;
        r3.A05 = false;
        r3.A00 = r2;
        r3.A01 = directForwardingParams;
        r3.A03 = z;
        r3.A04 = z2;
        r3.A02 = str3;
        r3.A05 = z3;
        return r3;
    }
}
