package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.4h5  reason: invalid class name and case insensitive filesystem */
public final class C270654h5 extends C270664h6 {
    public Runnable A00;
    public final UserSession A01;

    public final void D3u(C52263GLe gLe) {
        Runnable runnable;
        0qQ.A0B(gLe, 0);
        if ((!1KU.A03(this.A01) || gLe.A0C) && (runnable = this.A00) != null) {
            runnable.run();
        }
    }

    public final String A00() {
        try {
            AnonymousClass2fL A002 = AnonymousClass2fL.A00(this.A01);
            ArrayList A0L = A002.A0L();
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            Iterator it = A0L.iterator();
            while (it.hasNext()) {
                A0A.A0c();
                A0A.A0R(PublicKeyCredentialControllerUtility.JSON_KEY_ID, (String) it.next());
                A0A.A0Z();
            }
            A0A.A0Y();
            A0A.close();
            this.A00 = new AnonymousClass93N(A002, new HashSet(A002.A02.keySet()), new HashSet(A002.A01.A02));
            String obj = stringWriter.toString();
            0qQ.A07(obj);
            return obj;
        } catch (IOException unused) {
            return "[]";
        }
    }

    public C270654h5(UserSession userSession) {
        this.A01 = userSession;
    }
}
