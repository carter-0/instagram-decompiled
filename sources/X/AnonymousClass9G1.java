package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9G1  reason: invalid class name */
public abstract class AnonymousClass9G1 {
    /* JADX WARNING: type inference failed for: r4v0, types: [X.9G2, java.lang.Object] */
    public static AnonymousClass9G2 A00(C276484tP r5, C276424tJ r6, String str) {
        String Eyf;
        AnonymousClass9G2 r4;
        C276484tP r3 = new C276484tP(r5);
        ? obj = new Object();
        if (r6.E2K() != AnonymousClass05K.A0C) {
            r6.Evn();
            r4 = null;
        } else {
            while (r6.Crg() != AnonymousClass05K.A0N) {
                String E2H = r6.E2H();
                boolean z = false;
                if (C276474tO.A00(E2H) >= 32) {
                    z = true;
                }
                r6.Crg();
                if (!z) {
                    if (PublicKeyCredentialControllerUtility.JSON_KEY_ID.equals(E2H)) {
                        if (r6.E2L().isNull()) {
                            Eyf = null;
                        } else {
                            Eyf = r6.E2L().Eyf();
                        }
                        obj.A01 = Eyf;
                    } else if ("payload".equals(E2H)) {
                        obj.A00 = C361038fZ.A00(r3, r6);
                    }
                }
                r6.Evn();
            }
            r4 = obj;
        }
        if (str != null) {
            018.A18(r3.A03, new String[]{str, r4.A01});
        }
        return r4;
    }
}
