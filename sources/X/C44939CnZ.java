package X;

import com.instagram.model.shopping.reels.ReelMultiProductLinkIntf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.CnZ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44939CnZ {
    public static Map A00(ReelMultiProductLinkIntf reelMultiProductLinkIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (reelMultiProductLinkIntf.Bga() != null) {
            List Bga = reelMultiProductLinkIntf.Bga();
            ArrayList arrayList = null;
            if (Bga != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = Bga.iterator();
                while (it.hasNext()) {
                    C41848B3p.A1W(arrayList, it);
                }
            }
            A1H.put("products", arrayList);
        }
        return 0Yt.A0B(A1H);
    }
}
