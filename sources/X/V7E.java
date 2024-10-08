package X;

import com.instagram.api.schemas.GreetingAttachmentIntf;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class V7E {
    public static Map A00(GreetingAttachmentIntf greetingAttachmentIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (greetingAttachmentIntf.BCu() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.HEIGHT, greetingAttachmentIntf.BCu());
        }
        if (greetingAttachmentIntf.getUrl() != null) {
            linkedHashMap.put("url", greetingAttachmentIntf.getUrl());
        }
        if (greetingAttachmentIntf.CGY() != null) {
            linkedHashMap.put(IgReactMediaPickerNativeModule.WIDTH, greetingAttachmentIntf.CGY());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
