package X;

import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CYH {
    public static Map A00(GrowthFrictionInterventionButton growthFrictionInterventionButton) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (growthFrictionInterventionButton.AYH() != null) {
            A1H.put("action", growthFrictionInterventionButton.AYH());
        }
        if (growthFrictionInterventionButton.CZp() != null) {
            A1H.put("is_primary", growthFrictionInterventionButton.CZp());
        }
        if (growthFrictionInterventionButton.getText() != null) {
            C41845B3m.A10(growthFrictionInterventionButton.getText(), A1H);
        }
        if (growthFrictionInterventionButton.getUrl() != null) {
            C41845B3m.A0y(growthFrictionInterventionButton.getUrl(), A1H);
        }
        return 0Yt.A0B(A1H);
    }
}
