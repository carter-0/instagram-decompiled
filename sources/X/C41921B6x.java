package X;

import com.facebook.react.modules.intent.IntentModule;
import com.instagram.api.schemas.AdMetadataType;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.B6x  reason: case insensitive filesystem */
public abstract /* synthetic */ class C41921B6x {
    public static Map A00(C250103ku r3) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (r3.CAK() != null) {
            AdMetadataType CAK = r3.CAK();
            0qQ.A0B(CAK, 0);
            C41845B3m.A11(CAK.A00, A1H);
        }
        if (r3.getValue() != null) {
            A1H.put(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, r3.getValue());
        }
        return 0Yt.A0B(A1H);
    }
}
