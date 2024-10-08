package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CXb  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44136CXb {
    public static Map A00(C46277DTg dTg) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dTg.getLength();
        A1H.put("length", Integer.valueOf(dTg.getLength()));
        dTg.getOffset();
        A1H.put("offset", Integer.valueOf(dTg.getOffset()));
        if (dTg.Bgr() != null) {
            A1H.put("profile_deeplink", dTg.Bgr());
        }
        if (dTg.BhP() != null) {
            A1H.put("profile_www_link", dTg.BhP());
        }
        return 0Yt.A0B(A1H);
    }
}
