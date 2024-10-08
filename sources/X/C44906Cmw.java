package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cmw  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44906Cmw {
    public static Map A00(DUI dui) {
        TreeUpdaterJNI treeUpdaterJNI;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dui.AlW() != null) {
            C269824fk AlW = dui.AlW();
            if (AlW != null) {
                treeUpdaterJNI = AlW.FHC();
            } else {
                treeUpdaterJNI = null;
            }
            A1H.put("caption_info", treeUpdaterJNI);
        }
        if (dui.BCu() != null) {
            A1H.put(IgReactMediaPickerNativeModule.HEIGHT, dui.BCu());
        }
        if (dui.Byw() != null) {
            A1H.put("start_x_position", dui.Byw());
        }
        if (dui.Byy() != null) {
            A1H.put("start_y_position", dui.Byy());
        }
        if (dui.CGY() != null) {
            A1H.put(IgReactMediaPickerNativeModule.WIDTH, dui.CGY());
        }
        return 0Yt.A0B(A1H);
    }
}
