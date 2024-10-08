package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5EX  reason: invalid class name */
public abstract class AnonymousClass5EX {
    public static final String A00(UserSession userSession, Collection collection, boolean z) {
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
            A0A.A0b();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                AnonymousClass5EW r5 = (AnonymousClass5EW) it.next();
                A0A.A0c();
                A0A.A0R("item_id", r5.A04);
                A0A.A0P("item_type", r5.A00);
                A0A.A0R(AnonymousClass9NJ.A00(51, 10, 54), r5.A05);
                A0A.A0R("container_module", r5.A02);
                A0A.A0R("inventory_source", r5.A03);
                A0A.A0P("multi_ads_type", r5.A01);
                A0A.A0q("seen_states");
                List<AnonymousClass5EV> list = r5.A06;
                A0A.A0b();
                for (AnonymousClass5EV r2 : list) {
                    A0A.A0c();
                    A0A.A0R("media_id", r2.A09);
                    A0A.A0q("media_time_spent");
                    A0A.A0b();
                    for (Number longValue : r2.A0B) {
                        A0A.A0h(longValue.longValue());
                    }
                    A0A.A0Y();
                    A0A.A0Q("impression_timestamp", r2.A00);
                    A0A.A0O("media_percent_visible", r2.A01);
                    0Tu r52 = 0Tu.A05;
                    if (182.A06(r52, userSession, 36320670111507210L) && (z || 182.A06(r52, userSession, 36320670111638284L))) {
                        A0A.A0P("gap_to_last_ad", r2.A04);
                        A0A.A0P("gap_to_last_netego", r2.A05);
                        A0A.A0P("client_insertion_position", r2.A03);
                    }
                    if (182.A06(r52, userSession, 36320670111572747L)) {
                        if (z || 182.A06(r52, userSession, 36320670111703821L)) {
                            A0A.A0P("reel_gap_to_last_ad", r2.A08);
                            A0A.A0P("ad_consumed_media_gap", r2.A02);
                            A0A.A0P("num_media_consumed_in_ad", r2.A07);
                        } else {
                            A0A.A0Z();
                        }
                    }
                    if (z) {
                        if (182.A06(r52, userSession, 36321322946536719L)) {
                            A0A.A0R("tracking_token", r2.A0A);
                        }
                        A0A.A0P("imp_signature", r2.A06);
                    }
                    A0A.A0Z();
                }
                A0A.A0Y();
                A0A.A0Z();
            }
            A0A.A0Y();
            A0A.close();
            return stringWriter.toString();
        } catch (IOException e) {
            0KC.A0H("SeenStateItemRealtimeInfo", "Unable to serialize collection.", e);
            return "";
        }
    }
}
