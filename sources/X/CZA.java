package X;

import com.instagram.api.schemas.EventVisibilityType;
import com.instagram.api.schemas.IGLocalEventDictImpl;
import java.io.IOException;

public abstract class CZA {
    public static IGLocalEventDictImpl parseFromJson(16F r5) {
        String str;
        0qQ.A0B(r5, 0);
        try {
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            String str2 = null;
            EventVisibilityType eventVisibilityType = null;
            while (r5.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r5);
                if ("ig_event_time_string".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r5.A1P();
                    }
                } else if ("ig_event_visibility".equals(A17)) {
                    if (r5.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r5.A1P();
                    }
                    eventVisibilityType = (EventVisibilityType) EventVisibilityType.A01.get(str);
                    if (eventVisibilityType == null) {
                        eventVisibilityType = EventVisibilityType.UNRECOGNIZED;
                    }
                }
                r5.A0z();
            }
            return new IGLocalEventDictImpl(eventVisibilityType, str2);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
