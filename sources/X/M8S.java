package X;

import android.content.Context;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

public final class M8S implements Runnable {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ ImageUrl A02;

    public M8S(Context context, UserSession userSession, ImageUrl imageUrl) {
        this.A01 = userSession;
        this.A00 = context;
        this.A02 = imageUrl;
    }

    public final void run() {
        2MD A012 = 2MD.A01();
        UserSession userSession = this.A01;
        OIS A002 = OU0.A00(userSession.A06);
        A002.A0G = "promote_sent_for_approval_rebranding";
        A002.A0H = this.A00.getString(2131970753);
        A002.A04 = this.A02;
        A002.A0I = false;
        A002.A03 = PushChannelType.LOCAL;
        A002.A08 = new C65352Lrs(userSession, 1);
        JTT.A1O(A002, A012);
    }
}
