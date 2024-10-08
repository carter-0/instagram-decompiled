package X;

import com.facebook.proxygen.TraceFieldType;
import com.instagram.api.schemas.UpcomingEventIDType;
import java.io.IOException;

/* renamed from: X.D1s  reason: case insensitive filesystem */
public final class C45693D1s {
    public static CGC parseFromJson(16F r4) {
        0qQ.A0B(r4, 0);
        try {
            CGC cgc = new CGC();
            if (r4.A11() != 16L.A0D) {
                r4.A0z();
                return null;
            }
            while (r4.A1J() != 16L.A09) {
                String A0q = r4.A0q();
                if (C41846B3n.A1Y(r4, A0q)) {
                    cgc.A08 = AnonymousClass7TG.A0l(r4);
                } else if ("upcoming_event_id_type".equals(A0q)) {
                    UpcomingEventIDType upcomingEventIDType = (UpcomingEventIDType) UpcomingEventIDType.A01.get(AnonymousClass7TG.A0l(r4));
                    if (upcomingEventIDType == null) {
                        upcomingEventIDType = UpcomingEventIDType.UNRECOGNIZED;
                    }
                    cgc.A01 = upcomingEventIDType;
                } else if (C41845B3m.A1E(A0q)) {
                    cgc.A09 = AnonymousClass7TG.A0l(r4);
                } else if (TraceFieldType.StartTime.equals(A0q)) {
                    cgc.A07 = AnonymousClass7TF.A0Z(r4);
                } else if ("last_notification_time".equals(A0q)) {
                    cgc.A06 = AnonymousClass7TF.A0Z(r4);
                } else if ("end_time".equals(A0q)) {
                    cgc.A05 = AnonymousClass7TF.A0Z(r4);
                } else if ("reminder_enabled".equals(A0q)) {
                    cgc.A0A = r4.A0d();
                } else if ("live_metadata".equals(A0q)) {
                    cgc.A03 = C45143Cr1.parseFromJson(r4);
                } else if ("event_page_metadata".equals(A0q)) {
                    cgc.A00 = CXS.parseFromJson(r4);
                } else if (C41845B3m.A1D(A0q)) {
                    cgc.A02 = C45694D1t.parseFromJson(r4);
                } else if ("owner".equals(A0q)) {
                    cgc.A04 = C41845B3m.A0a(r4, false);
                } else {
                    1XY.A01(r4, cgc, A0q);
                }
                r4.A0z();
            }
            return cgc;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
