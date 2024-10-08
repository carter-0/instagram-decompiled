package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.share.ShopShareInfo;

public final class F0R {
    public RectF A00;
    public RectF A01;
    public final Activity A02;
    public final UserSession A03;
    public final ShopShareInfo A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C73901Plc(this, 39));

    public F0R(Activity activity, UserSession userSession, ShopShareInfo shopShareInfo) {
        AnonymousClass7TG.A1P(userSession, shopShareInfo);
        this.A03 = userSession;
        this.A02 = activity;
        this.A04 = shopShareInfo;
    }
}
