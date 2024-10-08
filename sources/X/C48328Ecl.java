package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.api.schemas.GrowthFrictionInterventionButton;
import com.instagram.api.schemas.GrowthFrictionInterventionDetail;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ecl  reason: case insensitive filesystem */
public abstract /* synthetic */ class C48328Ecl {
    public static Map A00(GrowthFrictionInterventionDetail growthFrictionInterventionDetail) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (growthFrictionInterventionDetail.AYH() != null) {
            A1H.put("action", growthFrictionInterventionDetail.AYH());
        }
        if (growthFrictionInterventionDetail.Aj1() != null) {
            List<GrowthFrictionInterventionButton> Aj1 = growthFrictionInterventionDetail.Aj1();
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (GrowthFrictionInterventionButton growthFrictionInterventionButton : Aj1) {
                if (growthFrictionInterventionButton != null) {
                    A1C.add(growthFrictionInterventionButton.FHC());
                }
            }
            A1H.put("buttons", A1C);
        }
        if (growthFrictionInterventionDetail.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, growthFrictionInterventionDetail.getDescription());
        }
        if (growthFrictionInterventionDetail.BIY() != null) {
            A1H.put("intervention_name", growthFrictionInterventionDetail.BIY());
        }
        if (growthFrictionInterventionDetail.getTitle() != null) {
            A1H.put(DialogModule.KEY_TITLE, growthFrictionInterventionDetail.getTitle());
        }
        if (growthFrictionInterventionDetail.getUrl() != null) {
            A1H.put("url", growthFrictionInterventionDetail.getUrl());
        }
        return 0Yt.A0B(A1H);
    }
}
