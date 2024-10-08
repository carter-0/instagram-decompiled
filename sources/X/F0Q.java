package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.collection.ProductCollectionShareInfo;

public final class F0Q {
    public RectF A00;
    public RectF A01;
    public final Activity A02;
    public final UserSession A03;
    public final ProductCollectionShareInfo A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C73901Plc(this, 36));

    public F0Q(Activity activity, UserSession userSession, ProductCollectionShareInfo productCollectionShareInfo) {
        AnonymousClass7TG.A1P(userSession, productCollectionShareInfo);
        this.A03 = userSession;
        this.A02 = activity;
        this.A04 = productCollectionShareInfo;
    }
}
