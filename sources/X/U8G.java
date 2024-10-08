package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class U8G extends AnonymousClass9YH {
    public final AnonymousClass0iw A00;
    public final UserSession A01;
    public final String A02;

    public final 2YL A02(C319836rJ r20, Class cls, String str) {
        C18027Vk5 A002;
        C319836rJ r1 = r20;
        boolean A1b = C51973G9u.A1b(str, cls, r1);
        String str2 = (String) r1.A00("formID");
        WYW wyw = null;
        if (!(str2 == null || (A002 = C18544Vtw.A01.A00(str2)) == null)) {
            UserSession userSession = this.A01;
            AnonymousClass0iw r6 = this.A00;
            String str3 = (String) r1.A00("adID");
            String str4 = (String) r1.A00("trackingToken");
            String str5 = (String) r1.A00("ad_creation_source");
            if (str5 == null) {
                str5 = "UNKNOWN";
            }
            wyw = new WYW(r6, userSession, str3, str4, str2, str5, C13991Tnr.A0f(r1), (String) r1.A00("advertiser_fbidv2"), this.A02, C18809W3g.A06(A002), A002.A02(), AnonymousClass7TF.A1V(A002.A00.A00), AnonymousClass7TF.A1Y(r1.A00("is_form_extension"), A1b));
        }
        return new C14777U8n(r1, this.A01, wyw);
    }

    public U8G(Bundle bundle, AnonymousClass0g9 r3, AnonymousClass0iw r4) {
        super(bundle, r3);
        this.A00 = r4;
        this.A01 = DbS.A0U(bundle);
        this.A02 = C18809W3g.A02(bundle);
    }
}
