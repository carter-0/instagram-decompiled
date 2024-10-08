package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;

public final class IMV implements JSp {
    public final C270654h5 A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final boolean A04;

    public final 1OC Aez(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        return HWJ.A00(userSession, this.A01, this.A03, this.A02, str, A00(), false);
    }

    public final 1OC BCc(UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 0);
        return HWJ.A00(userSession, this.A01, this.A03, this.A02, (String) null, A00(), this.A04);
    }

    public final 1OC C42(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        return HWJ.A00(userSession, this.A01, this.A03, this.A02, str, A00(), this.A04);
    }

    public final boolean CTp(boolean z) {
        return z;
    }

    public final /* synthetic */ void ES0(GEP gep) {
    }

    public final /* synthetic */ void ESn(Context context) {
    }

    public final /* synthetic */ void EiB(String str) {
    }

    public final /* synthetic */ void Elk(C290515fR r1) {
    }

    private final String A00() {
        C270654h5 r1 = this.A00;
        try {
            String str = (String) AnonymousClass2fL.A00(r1.A01).A0M().get(this.A01);
            if (str == null) {
                return "[]";
            }
            StringWriter stringWriter = new StringWriter();
            17W A0e = C51970G9q.A0e(stringWriter);
            Iterator it = 00l.A0R(str, new String[]{","}, 0).iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                A0e.A0c();
                A0e.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A18);
                A0e.A0Z();
            }
            A0e.A0Y();
            A0e.close();
            return DbT.A10(stringWriter);
        } catch (IOException unused) {
            return "[]";
        }
    }

    public IMV(C270654h5 r1, String str, String str2, String str3, boolean z) {
        this.A01 = str;
        this.A03 = str2;
        this.A02 = str3;
        this.A04 = z;
        this.A00 = r1;
    }
}
