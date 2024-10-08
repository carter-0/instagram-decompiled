package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.IceBreakerMessageIntf;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.V7c  reason: case insensitive filesystem */
public abstract /* synthetic */ class C16821V7c {
    public static Map A00(IceBreakerMessageIntf iceBreakerMessageIntf) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (iceBreakerMessageIntf.getActionUrl() != null) {
            linkedHashMap.put("actionUrl", iceBreakerMessageIntf.getActionUrl());
        }
        if (iceBreakerMessageIntf.getMessage() != null) {
            linkedHashMap.put(DialogModule.KEY_MESSAGE, iceBreakerMessageIntf.getMessage());
        }
        if (iceBreakerMessageIntf.BSH() != null) {
            linkedHashMap.put("messageKey", iceBreakerMessageIntf.BSH());
        }
        return 0Yt.A0B(linkedHashMap);
    }
}
