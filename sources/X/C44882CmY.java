package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CmY  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44882CmY {
    public static Map A00(C294075lo r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        r3.getHeight();
        A1H.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(r3.getHeight()));
        if (r3.getScansProfile() != null) {
            A1H.put("scans_profile", r3.getScansProfile());
        }
        if (r3.getUrl() != null) {
            C41845B3m.A0y(r3.getUrl(), A1H);
        }
        r3.getWidth();
        return C41845B3m.A0u(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(r3.getWidth()), A1H);
    }
}
