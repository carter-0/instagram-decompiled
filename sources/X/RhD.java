package X;

import android.net.Uri;
import android.util.Base64;
import java.net.URLConnection;

public abstract class RhD {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        IllegalArgumentException illegalArgumentException;
        byte[] bArr;
        String A0h = DbY.A0h(r10, 0);
        C277014uI A0P = DbW.A0P(r10, 1);
        C277014uI r2 = ((C280064zw) r10.A00()).A00;
        try {
            AnonymousClass6QE r0 = AnonymousClass6QE.A02;
            Uri A01 = AnonymousClass6QJ.A01(DbT.A09(A0h), true);
            String path = A01.getPath();
            if (path != null) {
                0Tu r6 = 0Tu.A05;
                0qQ.A08(r6);
                if (1AW.A06(r6, 18313074830227922L)) {
                    OOC ooc = new OOC();
                    ooc.A06(path);
                    ooc.A07("image/");
                    bArr = C272134kB.A03(ooc.A00());
                } else {
                    String guessContentTypeFromName = URLConnection.guessContentTypeFromName(path);
                    0qQ.A0A(guessContentTypeFromName);
                    if (00p.A0k(guessContentTypeFromName, "image/", false)) {
                        bArr = C272134kB.A03(AnonymousClass7TE.A0t(path));
                    } else {
                        illegalArgumentException = AnonymousClass7TE.A0w("File is not an image.");
                    }
                }
                String encodeToString = Base64.encodeToString(bArr, 0);
                0qQ.A0A(encodeToString);
                0qQ.A0B(encodeToString, 1);
                C299275ur.A00(r9, DbY.A0Q(encodeToString), A0P);
                return null;
            }
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("URI ");
            A1A.append(A01);
            illegalArgumentException = Pxg.A0d(" has no path", A1A);
            throw illegalArgumentException;
        } catch (Exception e) {
            String message = e.getMessage();
            if (message != null) {
                C299275ur.A00(r9, DbY.A0Q(message), r2);
            }
            throw e;
        }
    }
}
