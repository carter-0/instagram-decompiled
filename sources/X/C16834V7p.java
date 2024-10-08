package X;

import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7p  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16834V7p {
    public static Map A00(C21035XAo xAo) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (xAo.Ah8() != null) {
            linkedHashMap.put("border_color", xAo.Ah8());
        }
        if (xAo.AhA() != null) {
            linkedHashMap.put("border_width_float", AnonymousClass7TH.A0D(xAo.AhA()));
        }
        if (xAo.ArU() != null) {
            linkedHashMap.put("corner_radius", AnonymousClass7TH.A0D(xAo.ArU()));
        }
        if (xAo.BCu() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, xAo.BCu());
        }
        if (xAo.getUrl() != null) {
            linkedHashMap.put("url", xAo.getUrl());
        }
        if (xAo.CGY() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, xAo.CGY());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
