package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CoD  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44974CoD {
    public static Map A00(C46294DTx dTx) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTx.getAmount() != null) {
            A1H.put("amount", dTx.getAmount());
        }
        if (dTx.C7Y() != null) {
            A1H.put("timestamp", dTx.C7Y());
        }
        C41846B3n.A1J(dTx.CCd(), A1H);
        return 0Yt.A0B(A1H);
    }
}
