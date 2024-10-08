package X;

import com.instagram.api.schemas.UpcomingEventIDType;
import com.instagram.upcomingevents.common.model.UpcomingEventReminderAction;
import java.io.IOException;

/* renamed from: X.Cqm  reason: case insensitive filesystem */
public abstract class C45128Cqm {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.Cwy, java.lang.Object] */
    public static C45465Cwy parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            ? obj = new Object();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r4);
                if ("upcoming_event_id".equals(A17)) {
                    String A0l = AnonymousClass7TG.A0l(r4);
                    0qQ.A0B(A0l, 0);
                    obj.A03 = A0l;
                } else if (AnonymousClass000.A00(1316).equals(A17)) {
                    UpcomingEventIDType upcomingEventIDType = (UpcomingEventIDType) UpcomingEventIDType.A01.get(AnonymousClass7TG.A0l(r4));
                    if (upcomingEventIDType == null) {
                        upcomingEventIDType = UpcomingEventIDType.UNRECOGNIZED;
                    }
                    obj.A00 = upcomingEventIDType;
                } else if (AnonymousClass000.A00(3875).equals(A17)) {
                    String A0l2 = AnonymousClass7TG.A0l(r4);
                    UpcomingEventReminderAction upcomingEventReminderAction = (UpcomingEventReminderAction) UpcomingEventReminderAction.A01.get(A0l2);
                    if (upcomingEventReminderAction != null) {
                        obj.A01 = upcomingEventReminderAction;
                    } else {
                        throw new IllegalArgumentException(002.A0R("Unsupported event reminder action: ", A0l2));
                    }
                } else if ("media_pk".equals(A17)) {
                    obj.A02 = AnonymousClass7TG.A0l(r4);
                }
                r4.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
