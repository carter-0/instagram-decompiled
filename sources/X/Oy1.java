package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class Oy1 implements AnonymousClass0lh {
    public final Context A00;
    public final 1wn A01 = C71932OtG.A00(this, 33);
    public final UserSession A02;

    public final void onSessionWillEnd() {
        AnonymousClass1Nd.A00(this.A02).A02(this.A01, 2Kb.class);
    }

    public Oy1(Context context, UserSession userSession) {
        this.A00 = context;
        this.A02 = userSession;
    }
}
