package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.common.session.UserSession;
import java.util.Collection;

public final class ITG implements AnonymousClass9FV {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;

    public ITG(UserSession userSession, Context context) {
        this.A01 = userSession;
        this.A00 = context;
    }

    public final void Dfb(Collection collection) {
        0qQ.A0B(collection, 0);
        if (!collection.isEmpty()) {
            UserSession userSession = this.A01;
            if (!182.A06(0Tu.A05, userSession, 36328250729970829L) && !182.A06(0Tu.A06, userSession, 36331089703158677L)) {
                return;
            }
        }
        C243473Yx.A05.A09(this.A01, this.A00, ClipsPrefetchTriggerType.BACKGROUND_COLD.A00);
    }
}
