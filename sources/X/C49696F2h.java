package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;

/* renamed from: X.F2h  reason: case insensitive filesystem */
public final class C49696F2h {
    public RectF A00;
    public RectF A01;
    public RectF A02;
    public final Activity A03;
    public final UserSession A04;
    public final Product A05;

    public final void A00() {
        Activity activity = this.A03;
        ImageInfo imageInfo = this.A05.A07;
        imageInfo.getClass();
        LTL.A04(activity, 1iI.A01(activity, imageInfo), new FZB(this, 4), 2RR.A01(), DbU.A01(activity), false);
    }

    public C49696F2h(Activity activity, UserSession userSession, Product product) {
        this.A04 = userSession;
        this.A03 = activity;
        this.A05 = product;
    }
}
