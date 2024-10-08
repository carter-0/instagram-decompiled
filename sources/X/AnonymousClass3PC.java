package X;

import com.instagram.model.reels.Reel;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.3PC  reason: invalid class name */
public final class AnonymousClass3PC implements AnonymousClass0lh {
    public final Map A00 = new LinkedHashMap();

    public final void A00(Reel reel) {
        if (reel.A1a && reel.A0n()) {
            this.A00.put(reel.getId(), reel);
        }
    }

    public final void onSessionWillEnd() {
        this.A00.clear();
    }
}
