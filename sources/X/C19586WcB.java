package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.WcB  reason: case insensitive filesystem */
public final class C19586WcB implements C20981X7w {
    public final /* synthetic */ C18021Vjx A00;
    public final /* synthetic */ Product A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public final void DwB(List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        C18021Vjx vjx = this.A00;
        Product product = this.A01;
        String str = this.A03;
        String str2 = this.A04;
        User user = product.A0B;
        X9C x9c = vjx.A07;
        C18588Vuf Bz5 = x9c.Bz5();
        W2j w2j = new W2j(Bz5);
        C18502Vsx vsx = Bz5.A02;
        C16605Uxz uxz = vsx.A03;
        boolean z = vsx.A06;
        C16605Uxz uxz2 = vsx.A04;
        C16605Uxz uxz3 = vsx.A05;
        C16605Uxz uxz4 = vsx.A01;
        w2j.A02 = new C18502Vsx(C16605Uxz.FAILED, uxz4, vsx.A02, uxz, uxz2, uxz3, z);
        C18588Vuf.A00(x9c, w2j);
        AnonymousClass4DU r8 = vjx.A02;
        UserSession userSession = vjx.A01;
        String A0r = C13989Tnp.A0r(user);
        String str3 = vjx.A08;
        String str4 = str3;
        W2s.A05(r8, userSession, x9c.Bxm(), vjx.A06, product, str, str2, A0r, str4, vjx.A0C);
        C20927X4s x4s = (C20927X4s) list2.get(0);
        Context context = vjx.A00.getContext();
        if (context != null) {
            C18695Vwt.A02(x4s.BRw(context, userSession), 0, "product_details_add_to_cart_failure");
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C19586WcB(C18021Vjx vjx, Product product, String str, String str2, String str3) {
        this.A00 = vjx;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = product;
    }

    public final void DTp(String str) {
        C18021Vjx vjx = this.A00;
        Product product = this.A01;
        String str2 = this.A03;
        String str3 = this.A04;
        User user = product.A0B;
        X9C x9c = vjx.A07;
        C18588Vuf Bz5 = x9c.Bz5();
        W2j w2j = new W2j(Bz5);
        C18502Vsx vsx = Bz5.A02;
        C16605Uxz uxz = vsx.A03;
        boolean z = vsx.A06;
        C16605Uxz uxz2 = vsx.A04;
        C16605Uxz uxz3 = vsx.A05;
        C16605Uxz uxz4 = vsx.A01;
        C16605Uxz uxz5 = uxz4;
        C16605Uxz uxz6 = vsx.A02;
        w2j.A02 = new C18502Vsx(C16605Uxz.FAILED, uxz5, uxz6, uxz, uxz2, uxz3, z);
        C18588Vuf.A00(x9c, w2j);
        W2s.A05(vjx.A02, vjx.A01, x9c.Bxm(), vjx.A06, product, str2, str3, C13989Tnp.A0r(user), vjx.A08, vjx.A0C);
        AnonymousClass4DH r1 = vjx.A00;
        if (r1.isVisible()) {
            Context context = r1.getContext();
            if (context != null) {
                C18695Vwt.A01(context);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        String A002;
        String A09;
        W0O w0o = (W0O) obj;
        0qQ.A0B(w0o, 0);
        C18021Vjx vjx = this.A00;
        String str2 = this.A02;
        String str3 = this.A03;
        String str4 = this.A04;
        Product product = this.A01;
        User user = product.A0B;
        X9C x9c = vjx.A07;
        C18588Vuf Bz5 = x9c.Bz5();
        UserSession userSession = vjx.A01;
        1Au.A00(userSession).A0Q();
        W2j w2j = new W2j(Bz5);
        C18502Vsx vsx = Bz5.A02;
        C16605Uxz uxz = vsx.A03;
        boolean z = vsx.A06;
        C16605Uxz uxz2 = vsx.A04;
        C16605Uxz uxz3 = vsx.A05;
        w2j.A02 = new C18502Vsx(C16605Uxz.LOADED, vsx.A01, vsx.A02, uxz, uxz2, uxz3, z);
        C18588Vuf.A00(x9c, w2j);
        C323486xZ r11 = C323426xT.A00(userSession).A07;
        0qQ.A07(r11);
        AnonymousClass4DU r12 = vjx.A02;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        } else {
            str = null;
        }
        String str5 = vjx.A08;
        String str6 = vjx.A0C;
        String str7 = r11.A01;
        if (str7 == null) {
            throw new IllegalStateException("Required value was null.");
        } else if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null || (A09 = r11.A09(A002)) == null) {
            throw new IllegalStateException("Required value was null.");
        } else {
            boolean A042 = product.A04();
            UserSession userSession2 = userSession;
            W2s.A04(r12, userSession2, x9c.Bxm(), vjx.A06, w0o, str3, str4, str, str5, str6, str2, str7, A09, (String) null, vjx.A09, A042);
        }
    }
}
