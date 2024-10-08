package X;

import com.instagram.user.model.UpcomingEvent;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6ak  reason: invalid class name and case insensitive filesystem */
public final class C310286ak implements AnonymousClass0lh {
    public final Map A00 = new LinkedHashMap();
    public final Set A01 = new LinkedHashSet();

    public final UpcomingEvent A00(String str) {
        0qQ.A0B(str, 0);
        if (this.A01.contains(str)) {
            return null;
        }
        return (UpcomingEvent) this.A00.get(str);
    }

    public final void A01(UpcomingEvent upcomingEvent) {
        0qQ.A0B(upcomingEvent, 0);
        this.A00.put(upcomingEvent.getId(), upcomingEvent);
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
        this.A01.clear();
    }
}
