package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.List;

public final class GEP {
    public final UserSession A00;
    public final C54575HJk A01;

    public final String A00() {
        String str;
        AnonymousClass3OA A07;
        List<C267324bN> A0I = this.A01.A0I();
        if (A0I == null) {
            return null;
        }
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0e = C51970G9q.A0e(stringWriter);
            for (C267324bN r5 : A0I) {
                if (r5.A01 != C295365o2.GHOST) {
                    1Xj r1 = r5.A02;
                    Integer A002 = C52192GIj.A00(r5);
                    boolean A0F = r5.A0F();
                    int i = 0;
                    if (A0F) {
                        AnonymousClass3OA r0 = (AnonymousClass3OA) 00k.A0O((List) r5.A03().A01.A00, 0);
                        if (r0 != null) {
                            str = r0.A0S;
                        } else {
                            str = null;
                        }
                        if (str == null) {
                            str = "";
                        }
                    } else {
                        str = r5.getId();
                    }
                    if (r1 != null) {
                        r1.A0C.Eqv(true);
                    }
                    A0e.A0c();
                    A0e.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
                    if (A002 != null) {
                        i = A002.intValue();
                    }
                    A0e.A0P(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, i);
                    A0e.A0S("is_multi_ads", A0F);
                    if (182.A06(0Tu.A06, this.A00, 36315133900360720L) && (A07 = r5.A07()) != null) {
                        A0e.A0R("overlay_ad_id", A07.A0S);
                    }
                    A0e.A0Z();
                }
            }
            A0e.A0Y();
            A0e.close();
            return stringWriter.toString();
        } catch (IOException e) {
            0KC.A0F("ClipsViewStateUtil", "Failed building JSON: ", e);
            return null;
        }
    }

    public GEP(UserSession userSession, C54575HJk hJk) {
        AnonymousClass7TG.A1O(userSession, hJk);
        this.A00 = userSession;
        this.A01 = hJk;
    }
}
