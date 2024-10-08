package X;

import com.instagram.api.schemas.UrpRendererType;
import com.instagram.model.showreel.IgShowreelCompositionAssetInfoIntf;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cgs  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44558Cgs {
    public static Map A00(DUE due) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (due.Ace() != null) {
            List<IgShowreelCompositionAssetInfoIntf> Ace = due.Ace();
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
        if (due.BOF() != null) {
            A1H.put("logging_info", due.BOF());
        }
        if (due.Blw() != null) {
            UrpRendererType Blw = due.Blw();
            0qQ.A0B(Blw, 0);
            A1H.put("renderer_type", Blw.A00);
        }
        if (due.Bm0() != null) {
            A1H.put("rendering_spec", due.Bm0());
        }
        if (due.C4Z() != null) {
            A1H.put("template_id", due.C4Z());
        }
        return 0Yt.A0B(A1H);
    }
}
