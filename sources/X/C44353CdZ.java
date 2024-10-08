package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.CdZ  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44353CdZ {
    public static Map A00(C46285DTo dTo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dTo.getHeight();
        A1H.put(IgReactMediaPickerNativeModule.HEIGHT, Integer.valueOf(dTo.getHeight()));
        if (dTo.CAh() != null) {
            C41845B3m.A11(dTo.CAh(), A1H);
        }
        if (dTo.getUrl() != null) {
            C41845B3m.A0y(dTo.getUrl(), A1H);
        }
        dTo.getWidth();
        return C41845B3m.A0u(IgReactMediaPickerNativeModule.WIDTH, Integer.valueOf(dTo.getWidth()), A1H);
    }
}
