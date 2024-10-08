package X;

import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cdb  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44355Cdb {
    public static Map A00(DUQ duq) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (duq.AZ4() != null) {
            A1H.put("ad_id", duq.AZ4());
        }
        if (duq.Ace() != null) {
            List<IgShowreelCompositionAssetInfoIntf> Ace = duq.Ace();
            ArrayList arrayList = null;
            if (Ace != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (IgShowreelCompositionAssetInfoIntf igShowreelCompositionAssetInfoIntf : Ace) {
                    if (igShowreelCompositionAssetInfoIntf != null) {
                        arrayList.add(igShowreelCompositionAssetInfoIntf.FHC());
                    }
                }
            }
            A1H.put("asset_infos", arrayList);
        }
        if (duq.Anf() != null) {
            A1H.put("client_name", duq.Anf());
        }
        if (duq.Blx() != null) {
            A1H.put("renderer_type", duq.Blx());
        }
        if (duq.Bm0() != null) {
            A1H.put("rendering_spec", duq.Bm0());
        }
        if (duq.C4Z() != null) {
            A1H.put("template_id", duq.C4Z());
        }
        return 0Yt.A0B(A1H);
    }
}
