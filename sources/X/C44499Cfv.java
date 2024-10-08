package X;

import com.instagram.api.schemas.TIFUAppDestinationEnum;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cfv  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44499Cfv {
    public static Map A00(C274504oT r3) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.BKS() != null) {
            TIFUAppDestinationEnum BKS = r3.BKS();
            if (BKS != null) {
                str = BKS.A00;
            } else {
                str = null;
            }
            A1H.put(C273654mx.A00(2965), str);
        }
        if (r3.getUrl() != null) {
            C41845B3m.A0y(r3.getUrl(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
