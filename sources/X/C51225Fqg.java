package X;

import java.util.List;

/* renamed from: X.Fqg  reason: case insensitive filesystem */
public final class C51225Fqg implements Runnable {
    public final /* synthetic */ E25 A00;

    public C51225Fqg(E25 e25) {
        this.A00 = e25;
    }

    public final void run() {
        String str;
        E25 e25 = this.A00;
        AnonymousClass0aP r5 = e25.A06;
        if (r5 == null) {
            str = "loggedOutSession";
        } else {
            String str2 = e25.A0H;
            if (str2 == null) {
                str = Dbq.A03();
            } else {
                String A0i = DbZ.A0i(e25);
                String str3 = e25.A0G;
                if (str3 == null) {
                    str = "twoFacIdentifier";
                } else {
                    C49924FEz fEz = e25.A09;
                    if (fEz == null) {
                        str = "twoFacSecureNonceManager";
                    } else {
                        String str4 = e25.A0E;
                        if (str4 == null) {
                            str = "pk";
                        } else {
                            1OC A002 = C49235Ere.A00(r5, str2, A0i, str3, (List) fEz.A01.get(str4));
                            A002.A00 = e25.A0S;
                            e25.schedule(A002);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
