package X;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9DX  reason: invalid class name */
public final class AnonymousClass9DX implements AnonymousClass9DY {
    public final AnonymousClass9DW A00;

    public final Object BHw(String str) {
        String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
        AnonymousClass9DU r0 = AnonymousClass9DU.A01;
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Provider provider = Security.getProvider(strArr[i]);
            if (provider != null) {
                arrayList.add(provider);
            }
        }
        Iterator it = arrayList.iterator();
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
        return this.A00.BHx(str, (Provider) null);
    }

    public AnonymousClass9DX(AnonymousClass9DW r1) {
        this.A00 = r1;
    }
}
