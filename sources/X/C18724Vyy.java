package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.Vyy  reason: case insensitive filesystem */
public final class C18724Vyy {
    public final C58840Ae A00;

    public static final String A00(String str, String str2, Throwable th, List list) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(TraceFieldType.AdhocEventName, str);
        if (str2 != null) {
            jSONObject.put(DialogModule.KEY_MESSAGE, str2);
        }
        if (list != null) {
            jSONObject.put("event_types", list);
        }
        if (th != null) {
            jSONObject.put("exception", th.toString());
        }
        return DbT.A10(jSONObject);
    }

    public static final void A01(String str, String str2, C18724Vyy vyy) {
        0Aj A0d = C51969G9p.A0d(vyy.A00, "attribution_sdk_debug");
        if (A0d.isSampled()) {
            A0d.AAJ("log_level", str2);
            A0d.AAJ(DialogModule.KEY_MESSAGE, str);
            A0d.Cgf();
        }
    }

    public C18724Vyy(C58840Ae r1) {
        this.A00 = r1;
    }
}
