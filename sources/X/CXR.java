package X;

import com.instagram.api.schemas.EventPageNavigationMetadata;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract /* synthetic */ class CXR {
    public static Map A00(EventPageNavigationMetadata eventPageNavigationMetadata) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (eventPageNavigationMetadata.getDescription() != null) {
            A1H.put(DevServerEntity.COLUMN_DESCRIPTION, eventPageNavigationMetadata.getDescription());
        }
        if (eventPageNavigationMetadata.BlS() != null) {
            A1H.put("reminder_count", eventPageNavigationMetadata.BlS());
        }
        if (eventPageNavigationMetadata.getSubtitle() != null) {
            A1H.put("subtitle", eventPageNavigationMetadata.getSubtitle());
        }
        return 0Yt.A0B(A1H);
    }
}
