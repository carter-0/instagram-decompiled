package X;

import com.instagram.model.showreelnative.IgShowreelNativeAsset;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.HbT  reason: case insensitive filesystem */
public abstract /* synthetic */ class C55058HbT {
    public static Map A00(IgShowreelNativeAsset igShowreelNativeAsset) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (igShowreelNativeAsset.BCu() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, igShowreelNativeAsset.BCu());
        }
        if (igShowreelNativeAsset.getUrl() != null) {
            A1H.put("url", igShowreelNativeAsset.getUrl());
        }
        if (igShowreelNativeAsset.CGY() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, igShowreelNativeAsset.CGY());
        }
        return 0Yt.A0B(A1H);
    }
}
