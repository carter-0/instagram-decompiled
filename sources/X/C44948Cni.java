package X;

import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import com.instagram.model.showreel.IgShowreelCompositionAssetType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cni  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44948Cni {
    public static Map A00(IgShowreelCompositionAssetInfoIntf igShowreelCompositionAssetInfoIntf) {
        String str;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (igShowreelCompositionAssetInfoIntf.CAb() != null) {
            IgShowreelCompositionAssetType CAb = igShowreelCompositionAssetInfoIntf.CAb();
            if (CAb != null) {
                str = CAb.A00;
            } else {
                str = null;
            }
            C41845B3m.A11(str, A1H);
        }
        if (igShowreelCompositionAssetInfoIntf.getUrl() != null) {
            C41845B3m.A0y(igShowreelCompositionAssetInfoIntf.getUrl(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
