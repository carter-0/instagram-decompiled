package X;

import com.instagram.debug.log.DLog;
import com.instagram.debug.log.tags.DLogTag$DIRECT_HTTP;
import java.util.List;

/* renamed from: X.77Y  reason: invalid class name */
public final class AnonymousClass77Y implements AnonymousClass77Z {
    public final void Doh(List list) {
        0qQ.A0B(list, 0);
        DLog.d(DLogTag$DIRECT_HTTP.INSTANCE, "Successfully refreshed %d messages", new Object[]{Integer.valueOf(list.size())});
    }

    public final void DEc(String str) {
        DLog.d(DLogTag$DIRECT_HTTP.INSTANCE, "Unable to refresh messages reason: %s", new Object[]{str});
    }
}
