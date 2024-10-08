package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Cfn  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44491Cfn {
    public static Map A00(C46289DTs dTs) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (dTs.CSq() != null) {
            A1H.put("is_exclusive", dTs.CSq());
        }
        if (dTs.BXD() != null) {
            A1H.put("num_responders", dTs.BXD());
        }
        if (dTs.getText() != null) {
            C41845B3m.A10(dTs.getText(), A1H);
        }
        if (dTs.getValue() != null) {
            A1H.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, dTs.getValue());
        }
        return 0Yt.A0B(A1H);
    }
}
