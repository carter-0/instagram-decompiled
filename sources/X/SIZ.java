package X;

import android.preference.PreferenceManager;
import com.facebook.browser.lite.pixelrequestbuffer.igpixelrequestbuffer.IGPixelRequestBuffer;
import java.io.File;

public final class SIZ {
    public 1NU A00;
    public Integer A01;
    public String A02;
    public String A03;
    public final 1Fc A04 = new 1Fc();

    public static AnonymousClass1QX A00(SIZ siz) {
        siz.A01.getClass();
        1Fc r5 = siz.A04;
        r5.A05("access_token", siz.A02);
        String A0R = 002.A0R(0mp.A06("https://graph.%s/", new Object[]{PreferenceManager.getDefaultSharedPreferences(C60960kU.A00).getString("com.instagram.common.api.facebook.FacebookURLBuilder.KEY_FACEBOOK_ENDPOINT", IGPixelRequestBuffer.URL_PREFIX)}), siz.A03);
        1Pq A0S = Pxf.A0S();
        A0S.A01(siz.A01);
        int intValue = siz.A01.intValue();
        if (intValue == 3 || intValue == 4) {
            A0S.A02(r5.A01(A0R));
        } else if (intValue == 1) {
            A0S.A02(A0R);
            A0S.A00 = r5.A00(true);
        } else {
            throw C66580MXl.A11();
        }
        1QS A002 = A0S.A00();
        AnonymousClass1QT A0E = JTQ.A0E();
        A0E.A03 = 1Fe.A03;
        A0E.A0A = "FacebookGraphApi";
        return Pxf.A0R(A002, A0E);
    }

    public final 1OC A01() {
        this.A03.getClass();
        this.A00.getClass();
        AnonymousClass1O8 r2 = new AnonymousClass1O8();
        C239203Fj A022 = 1GK.A06.A00(new TNH(this, 8), 223, 2, false, true).A02(new 1QY(r2.A00), 349, 2, true, true).A02(this.A00, 350, 2, false, true);
        String str = this.A03;
        0qQ.A0B(str, 3);
        return new 1OC(r2, AnonymousClass3Fk.A00(A022), "FacebookGraphApi", str);
    }

    public final void A02(Class cls) {
        C375889Fq r0 = C375889Fq.A00;
        15p r3 = AnonymousClass15o.A00;
        0qQ.A08(r3);
        this.A00 = new 1NT(r3, new 1NX((File) null), cls, false);
    }
}
