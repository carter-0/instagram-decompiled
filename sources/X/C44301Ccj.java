package X;

import com.facebook.react.modules.intent.IntentModule;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Ccj  reason: case insensitive filesystem */
public abstract /* synthetic */ class C44301Ccj {
    public static Map A00(DTP dtp) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        dtp.getCount();
        A1H.put("count", Integer.valueOf(dtp.getCount()));
        if (dtp.getName() != null) {
            C41845B3m.A0z(dtp.getName(), A1H);
        }
        if (dtp.getValue() != null) {
            A1H.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, dtp.getValue());
        }
        return 0Yt.A0B(A1H);
    }
}
