package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class OVR {
    public C227052iZ A00;
    public final 0fA A01;
    public final 0jG A02;
    public final AnonymousClass1Nu A03;
    public final AnonymousClass2iL A04;
    public final 1zH A05;
    public final UserSession A06;
    public final ImageUrl A07;

    public static final void A00(OVR ovr, String str, String str2, int i) {
        String str3;
        AnonymousClass2iL r2 = ovr.A04;
        ImageUrl imageUrl = ovr.A07;
        String Aqe = imageUrl.Aqe();
        if (str == null) {
            str3 = "null";
        } else {
            str3 = str;
        }
        r2.A0D((C227052iZ) null, Aqe, str3, 0, 0, false, false);
        0jG r0 = ovr.A02;
        if (r0 != null) {
            r0.Cih(imageUrl, str, str2, i);
        }
        ovr.A00 = null;
    }

    public final void finalize() {
        if (this.A00 != null) {
            throw new IllegalThreadStateException("byte array not cleaned up");
        }
    }

    public OVR(0fA r1, 0jG r2, AnonymousClass1Nu r3, AnonymousClass2iL r4, 1zH r5, C227052iZ r6, UserSession userSession, ImageUrl imageUrl) {
        this.A06 = userSession;
        this.A03 = r3;
        this.A04 = r4;
        this.A07 = imageUrl;
        this.A00 = r6;
        this.A02 = r2;
        this.A05 = r5;
        this.A01 = r1;
    }
}
