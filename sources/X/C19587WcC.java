package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.WcC  reason: case insensitive filesystem */
public final class C19587WcC implements C20981X7w {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C3504784u A02;
    public final /* synthetic */ Product A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void DwB(List list) {
        0qQ.A0B(list, 0);
        C3504784u r4 = this.A02;
        if (r4.A0A.isVisible()) {
            if (AnonymousClass7TE.A1b(list)) {
                C18695Vwt.A02(((C20927X4s) list.get(0)).BRw(this.A00, r4.A0B), 0, 002.A0R(this.A05, "_product_add_to_cart_failure"));
            } else {
                throw DbT.A0m();
            }
        }
        UserSession userSession = r4.A0B;
        String str = this.A05;
        String str2 = this.A07;
        String A0r = C13989Tnp.A0r(this.A04);
        String str3 = this.A06;
        String str4 = r4.A0G;
        W2s.A05(r4, userSession, C3504784u.A00(r4), (ShoppingGuideLoggingInfo) null, this.A03, str, str2, A0r, str3, str4);
    }

    public C19587WcC(Context context, FragmentActivity fragmentActivity, C3504784u r3, Product product, User user, String str, String str2, String str3) {
        this.A02 = r3;
        this.A01 = fragmentActivity;
        this.A04 = user;
        this.A06 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A03 = product;
        this.A00 = context;
    }

    public final void DTp(String str) {
        C3504784u r1 = this.A02;
        if (r1.A0A.isVisible()) {
            C18695Vwt.A01(this.A00);
        }
        UserSession userSession = r1.A0B;
        String str2 = this.A05;
        String str3 = this.A07;
        String A0r = C13989Tnp.A0r(this.A04);
        String str4 = this.A06;
        String str5 = r1.A0G;
        W2s.A05(r1, userSession, C3504784u.A00(r1), (ShoppingGuideLoggingInfo) null, this.A03, str2, str3, A0r, str4, str5);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String A002;
        String str;
        W0O w0o = (W0O) obj;
        0qQ.A0B(w0o, 0);
        C3504784u r6 = this.A02;
        UserSession userSession = r6.A0B;
        1Au.A00(userSession).A0Q();
        String str2 = "";
        if (r6.A0A.isVisible()) {
            C249713kF r11 = C249713kF.A00;
            FragmentActivity fragmentActivity = this.A01;
            User user = this.A04;
            if (user == null || (str = AnonymousClass3ZA.A00(user)) == null) {
                str = str2;
            }
            String str3 = r6.A0G;
            r11.A01(fragmentActivity, userSession, str, str3, "instagram_shopping_camera", "shopping_camera", this.A06, w0o.A04());
        }
        C323486xZ r5 = C323426xT.A00(userSession).A07;
        0qQ.A07(r5);
        String str4 = this.A05;
        String str5 = this.A07;
        User user2 = this.A04;
        String A0r = C13989Tnp.A0r(user2);
        String str6 = this.A06;
        String str7 = r6.A0G;
        String str8 = r5.A01;
        if (str8 != null) {
            if (!(user2 == null || (A002 = AnonymousClass3ZA.A00(user2)) == null)) {
                str2 = A002;
            }
            String A09 = r5.A09(str2);
            if (A09 != null) {
                W2s.A04(r6, userSession, C3504784u.A00(r6), (ShoppingGuideLoggingInfo) null, w0o, str4, str5, A0r, str6, str7, "instagram_shopping_camera", str8, A09, (String) null, (String) null, this.A03.A04());
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
