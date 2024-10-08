package X;

import android.util.JsonReader;
import android.util.Pair;
import java.io.StringReader;
import java.util.List;

/* renamed from: X.Q3k  reason: case insensitive filesystem */
public final class C7308Q3k {
    public List A00;

    public static Pair A00(C276424tJ r3) {
        String str;
        Integer E2K = r3.E2K();
        if (E2K != AnonymousClass05K.A0j) {
            if (E2K != null) {
                str = C9817Rhf.A00(E2K);
            } else {
                str = "null";
            }
            1Kn.A02(002.A0R("Expected string while parsing string-encoded component payload, got ", str), "BloksComponentQueryPayload");
            return null;
        }
        String Eyf = r3.E2L().Eyf();
        C361008fW r0 = new C361008fW(new JsonReader(new StringReader(Eyf)));
        r0.Crg();
        return Pxe.A0K(Eyf, C7307Q3j.A00(r0));
    }
}
