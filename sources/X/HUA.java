package X;

import com.instagram.api.schemas.WhatsAppAttributionInfo;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class HUA {
    public static Map A00(WhatsAppAttributionInfo whatsAppAttributionInfo) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (whatsAppAttributionInfo.AYR() != null) {
            A1H.put("actionLink", whatsAppAttributionInfo.AYR());
        }
        if (whatsAppAttributionInfo.AZI() != null) {
            A1H.put("adWhatsAppNumber", whatsAppAttributionInfo.AZI());
        }
        return 0Yt.A0B(A1H);
    }
}
