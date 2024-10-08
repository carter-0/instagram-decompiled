package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4D {
    public static Map A00(AnonymousClass1eQ r3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.AYZ() != null) {
            linkedHashMap.put("action_type", r3.AYZ());
        }
        r3.getShouldHaveInformTreatment();
        linkedHashMap.put("should_have_inform_treatment", Boolean.valueOf(r3.getShouldHaveInformTreatment()));
        if (r3.getText() != null) {
            linkedHashMap.put("text", r3.getText());
        }
        if (r3.getUrl() != null) {
            linkedHashMap.put("url", r3.getUrl());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
