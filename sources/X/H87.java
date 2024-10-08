package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.common.session.UserSession;

public final class H87 extends 0ng {
    public final /* synthetic */ AnonymousClass14L A00;
    public final /* synthetic */ UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H87(AnonymousClass14L r4, UserSession userSession) {
        super(201, 2, true, true);
        this.A00 = r4;
        this.A01 = userSession;
    }

    public final void run() {
        Context context = this.A00.A00;
        UserSession userSession = this.A01;
        1w8.A01(context, userSession);
        1wC.A01(userSession);
        C243473Yx.A05.A09(userSession, context, ClipsPrefetchTriggerType.COLD_START.A00);
    }
}
