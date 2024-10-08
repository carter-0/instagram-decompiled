package X;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ecf  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48322Ecf {
    public static Map A00(C51947G8q g8q) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (g8q.BIP() != null) {
            List<C51954G8x> BIP = g8q.BIP();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C51954G8x g8x : BIP) {
                if (g8x != null) {
                    A1C.add(g8x.FHC());
                }
            }
            A1H.put("interests", A1C);
        }
        return 0Yt.A0B(A1H);
    }
}
