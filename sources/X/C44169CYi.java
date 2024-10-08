package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdScreenshotURLDataDict;
import com.instagram.api.schemas.IGProjectPortalInfoDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CYi  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44169CYi {
    public static Map A00(IGAdScreenshotURLDataDict iGAdScreenshotURLDataDict) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (iGAdScreenshotURLDataDict.getDominantColor() != null) {
            A1H.put("dominant_color", iGAdScreenshotURLDataDict.getDominantColor());
        }
        if (iGAdScreenshotURLDataDict.BCu() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, iGAdScreenshotURLDataDict.BCu());
        }
        if (iGAdScreenshotURLDataDict.BPk() != null) {
            IGProjectPortalInfoDict BPk = iGAdScreenshotURLDataDict.BPk();
            if (BPk != null) {
                treeUpdaterJNI = BPk.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("media_background", treeUpdaterJNI);
        }
        if (iGAdScreenshotURLDataDict.getUrl() != null) {
            C41845B3m.A0y(iGAdScreenshotURLDataDict.getUrl(), A1H);
        }
        if (iGAdScreenshotURLDataDict.CGY() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, iGAdScreenshotURLDataDict.CGY());
        }
        return 0Yt.A0B(A1H);
    }
}
