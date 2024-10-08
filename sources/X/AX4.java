package X;

import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

public final class AX4 implements AnonymousClass9DY {
    public final AnonymousClass9DW A00;

    public final Object BHw(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL", "Conscrypt"};
        AnonymousClass9DU r0 = AnonymousClass9DU.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (int i = 0; i < 3; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                A1C.add(provider);
            }
        }
        Iterator it = A1C.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return this.A00.BHx(str, (Provider) it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    public AX4(AnonymousClass9DW r1) {
        this.A00 = r1;
    }
}
