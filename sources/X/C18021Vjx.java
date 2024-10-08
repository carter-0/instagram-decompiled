package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.Vjx  reason: case insensitive filesystem */
public final class C18021Vjx {
    public final AnonymousClass4DH A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final W03 A03;
    public final W1W A04;
    public final C18782W1i A05;
    public final ShoppingGuideLoggingInfo A06;
    public final X9C A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public C18021Vjx(AnonymousClass4DH r2, UserSession userSession, AnonymousClass4DU r4, W03 w03, W1W w1w, C18782W1i w1i, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, X9C x9c, String str, String str2, String str3, String str4, String str5, String str6) {
        DbW.A1N(userSession, 3, w1w);
        C51973G9u.A0t(7, w1i, str, str2);
        this.A00 = r2;
        this.A02 = r4;
        this.A01 = userSession;
        this.A07 = x9c;
        this.A04 = w1w;
        this.A03 = w03;
        this.A05 = w1i;
        this.A08 = str;
        this.A0C = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A06 = shoppingGuideLoggingInfo;
        this.A09 = str5;
        this.A0D = str6;
    }

    public final void A00(Product product, String str, String str2, String str3) {
        String A002;
        Product product2 = product;
        User user = product2.A0B;
        X9C x9c = this.A07;
        C18588Vuf Bz5 = x9c.Bz5();
        W2j w2j = new W2j(Bz5);
        C18502Vsx vsx = Bz5.A02;
        C16605Uxz uxz = vsx.A03;
        boolean z = vsx.A06;
        C16605Uxz uxz2 = vsx.A04;
        C16605Uxz uxz3 = vsx.A05;
        w2j.A02 = new C18502Vsx(C16605Uxz.LOADING, vsx.A01, vsx.A02, uxz, uxz2, uxz3, z);
        C18588Vuf.A00(x9c, w2j);
        AnonymousClass4DU r4 = this.A02;
        UserSession userSession = this.A01;
        String str4 = null;
        if (user != null) {
            str4 = AnonymousClass3ZA.A00(user);
        }
        String str5 = str;
        String str6 = str2;
        String str7 = str3;
        W2s.A06(r4, userSession, x9c.Bxm(), this.A06, product2, str6, str7, str5, str4, this.A08, this.A0C, this.A09);
        C323486xZ r2 = C323426xT.A00(userSession).A07;
        if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
            throw AnonymousClass7TE.A0y();
        }
        r2.A0D(new C19586WcB(this, product2, str5, str6, str7), product2, A002, this.A0D);
    }

    public final void A01(String str) {
        String A002;
        X9C x9c = this.A07;
        C18588Vuf Bz5 = x9c.Bz5();
        Product product = Bz5.A09;
        if (product != null) {
            Product product2 = Bz5.A08;
            if (product2 != null) {
                W1L w1l = Bz5.A04;
                UserSession userSession = this.A01;
                if (!w1l.A05.containsKey(W1L.A00(userSession, product)) || 0qQ.A0K(product2.A0H, product.A0H)) {
                    System.currentTimeMillis();
                    W2j A003 = W2j.A00(x9c);
                    C18502Vsx vsx = x9c.Bz5().A02;
                    C16605Uxz uxz = vsx.A03;
                    boolean z = vsx.A06;
                    C16605Uxz uxz2 = vsx.A00;
                    C16605Uxz uxz3 = vsx.A04;
                    C16605Uxz uxz4 = vsx.A05;
                    A003.A02 = new C18502Vsx(uxz2, C16605Uxz.LOADING, vsx.A02, uxz, uxz3, uxz4, z);
                    C18588Vuf.A00(x9c, A003);
                    Fragment fragment = this.A00;
                    Context requireContext = fragment.requireContext();
                    0gy A004 = AnonymousClass07i.A00(fragment);
                    String str2 = product2.A0H;
                    User user = product.A0B;
                    if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    C17065VGn.A00(requireContext, A004, userSession, new C19592WcH(this, product), product, str2, A002, str, Bz5.A03.A03, true);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
