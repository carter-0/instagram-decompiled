package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class LmO implements MTY {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass3Q2 A02;

    public LmO(Context context, UserSession userSession, AnonymousClass3Q2 r3) {
        this.A01 = userSession;
        this.A02 = r3;
        this.A00 = context;
    }

    public final void Dvm() {
        C59797JYq.A07(this.A00, this.A01, this.A02, "photo_prepare_failed_for_one_tap_send");
    }

    public final /* bridge */ /* synthetic */ void Dvn(Object obj) {
        L6I l6i = (L6I) obj;
        UserSession userSession = this.A01;
        AnonymousClass3Q2 r3 = this.A02;
        C59797JYq.A0D(userSession, l6i.A02, r3);
        int i = l6i.A01;
        int i2 = l6i.A00;
        C59797JYq.A0F(userSession, r3, i, i2);
        AnonymousClass3Q2 r0 = new C59794JYn(r3).A01;
        r0.A0H = i;
        r0.A0G = i2;
    }
}
