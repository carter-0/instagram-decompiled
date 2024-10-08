package X;

import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Cnj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44949Cnj {
    public static Map A00(IgShowreelNativeAnimationIntf igShowreelNativeAnimationIntf) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (igShowreelNativeAnimationIntf.Abk() != null) {
            A1H.put("animation_payload", igShowreelNativeAnimationIntf.Abk());
        }
        if (igShowreelNativeAnimationIntf.Acl() != null) {
            A1H.put("assets", igShowreelNativeAnimationIntf.Acl());
        }
        if (igShowreelNativeAnimationIntf.Acn() != null) {
            List<IgShowreelNativeAsset> Acn = igShowreelNativeAnimationIntf.Acn();
            ArrayList arrayList = null;
            if (Acn != null) {
                arrayList = AnonymousClass7TE.A1C();
                for (IgShowreelNativeAsset igShowreelNativeAsset : Acn) {
                    if (igShowreelNativeAsset != null) {
                        arrayList.add(igShowreelNativeAsset.FHC());
                    }
                }
            }
            A1H.put("assets_info", arrayList);
        }
        if (igShowreelNativeAnimationIntf.Anf() != null) {
            A1H.put("client_name", igShowreelNativeAnimationIntf.Anf());
        }
        if (igShowreelNativeAnimationIntf.AqT() != null) {
            A1H.put("content", igShowreelNativeAnimationIntf.AqT());
        }
        if (igShowreelNativeAnimationIntf.BCu() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, igShowreelNativeAnimationIntf.BCu());
        }
        if (igShowreelNativeAnimationIntf.C4b() != null) {
            A1H.put("template_name", igShowreelNativeAnimationIntf.C4b());
        }
        if (igShowreelNativeAnimationIntf.CGY() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, igShowreelNativeAnimationIntf.CGY());
        }
        return 0Yt.A0B(A1H);
    }
}
