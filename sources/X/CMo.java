package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;
import java.util.List;

public final class CMo extends 17P implements C46255DSk {
    /* JADX WARNING: type inference failed for: r3v0, types: [com.facebook.pando.TreeJNI, X.CMo, X.DSk] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getMediaId() != null) {
            C41845B3m.A13(getMediaId(), A1H);
        }
        if (Ba5() != null) {
            A1H.put("pac_ad_media_ids", Ba5());
        }
        return C41845B3m.A0S(this, 0Yt.A0B(A1H));
    }

    public final List Ba5() {
        List A0n = A0n(-774319794);
        if (A0n == null) {
            return 0sn.A00;
        }
        return A0n;
    }

    public final C42055BFi F7N() {
        return new C42055BFi(A0k(-900774058), Ba5());
    }

    public final String getMediaId() {
        return A0k(-900774058);
    }
}
