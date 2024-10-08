package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

/* renamed from: X.WdC  reason: case insensitive filesystem */
public final class C19648WdC implements C21000X8x {
    public Product A00;
    public final Activity A01;
    public final UserSession A02;
    public final String A03;
    public final String A04;

    public final void DkK(C268654dm r1, boolean z) {
    }

    public final void DkL() {
    }

    public final boolean isEmpty() {
        return true;
    }

    public final 1NY Abz() {
        1NY A0b = AnonymousClass7TG.A0b(this.A02);
        A0b.A0K("commerce/products/%s/details/", new Object[]{this.A04});
        A0b.A9m("merchant_id", this.A03);
        A0b.A9m("device_width", String.valueOf(AnonymousClass0nB.A01(this.A01)));
        A0b.A9m("shopping_bag_enabled", "false");
        A0b.A0Q(CGR.class, C45703D2c.class);
        return A0b;
    }

    public final /* bridge */ /* synthetic */ void DkM(AnonymousClass1XV r7, boolean z, boolean z2) {
        CGR cgr = (CGR) r7;
        0qQ.A0B(cgr, 0);
        UserSession userSession = this.A02;
        this.A00 = C45020Cox.A00(userSession, cgr, (X9L) null).Bft();
        Activity activity = this.A01;
        int A012 = AnonymousClass0nB.A01(activity);
        float A002 = (float) AnonymousClass0nB.A00(activity);
        RectF rectF = new RectF(0.0f, A002, (float) A012, A002);
        Product product = this.A00;
        if (product != null) {
            C49696F2h f2h = new C49696F2h(activity, userSession, product);
            f2h.A01 = rectF;
            f2h.A00();
        }
    }

    public C19648WdC(Activity activity, UserSession userSession, String str, String str2) {
        AnonymousClass7TG.A1P(userSession, str);
        this.A02 = userSession;
        this.A01 = activity;
        this.A04 = str;
        this.A03 = str2;
    }
}
