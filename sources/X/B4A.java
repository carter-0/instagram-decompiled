package X;

import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class B4A {
    public static Map A00(C65251bZ r3) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (r3.AgC() != null) {
            linkedHashMap.put("bloks_app_url", r3.AgC());
        }
        if (r3.BtY() != null) {
            linkedHashMap.put("sharing_friction_payload", r3.BtY());
        }
        r3.getShouldHaveSharingFriction();
        linkedHashMap.put("should_have_sharing_friction", Boolean.valueOf(r3.getShouldHaveSharingFriction()));
        return 0Yt.A0B(linkedHashMap);
    }
}
