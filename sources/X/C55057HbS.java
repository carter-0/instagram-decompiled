package X;

import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.HbS  reason: case insensitive filesystem */
public abstract /* synthetic */ class C55057HbS {
    public static Map A00(IgShowreelComposition igShowreelComposition) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (igShowreelComposition.Acn() != null) {
            List<IgShowreelCompositionAssetInfoIntf> Acn = igShowreelComposition.Acn();
            ArrayList arrayList = null;
            if (Acn != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (IgShowreelCompositionAssetInfoIntf igShowreelCompositionAssetInfoIntf : Acn) {
                    if (igShowreelCompositionAssetInfoIntf != null) {
                        arrayList.add(igShowreelCompositionAssetInfoIntf.FHC());
                    }
                }
            }
            A1H.put("assets_info", arrayList);
        }
        if (igShowreelComposition.Anf() != null) {
            A1H.put("client_name", igShowreelComposition.Anf());
        }
        if (igShowreelComposition.AqT() != null) {
            A1H.put("content", igShowreelComposition.AqT());
        }
        if (igShowreelComposition.C4b() != null) {
            A1H.put("template_name", igShowreelComposition.C4b());
        }
        return 0Yt.A0B(A1H);
    }
}
