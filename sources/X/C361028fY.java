package X;

import android.util.JsonReader;
import java.io.StringReader;

/* renamed from: X.8fY  reason: invalid class name and case insensitive filesystem */
public final class C361028fY {
    public C276464tN A00;
    public String A01;

    public static C361028fY A00(C276424tJ r3) {
        String str;
        C361028fY A002 = C361038fZ.A00((C276484tP) null, r3);
        if (A002 == null || (str = A002.A01) == null) {
            return A002;
        }
        C361008fW r0 = new C361008fW(new JsonReader(new StringReader(str)));
        r0.Crg();
        return C361038fZ.A00((C276484tP) null, r0);
    }
}
