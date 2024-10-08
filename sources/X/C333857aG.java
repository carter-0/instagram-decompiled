package X;

import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.7aG  reason: invalid class name and case insensitive filesystem */
public final class C333857aG extends C333827aD {
    public final C376579In A00;
    public final Set A01;

    public final boolean equals(Object obj) {
        return this == obj || ((obj instanceof C333857aG) && 0qQ.A0K(this.A00, ((C333857aG) obj).A00));
    }

    public final int hashCode() {
        return (this.A00.hashCode() * 31) + C54732HQn.A00();
    }

    public C333857aG(C376579In r2) {
        super("pending_comment_head_loading_state_");
        this.A00 = r2;
        ConcurrentHashMap.KeySetView newKeySet = ConcurrentHashMap.newKeySet();
        0qQ.A07(newKeySet);
        this.A01 = newKeySet;
    }
}
