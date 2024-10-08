package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;

/* renamed from: X.VhL  reason: case insensitive filesystem */
public final class C17868VhL {
    public final VPF A00;
    public final Context A01;
    public final UserSession A02;
    public final ProductGroup A03;

    public final void A00(AnonymousClass07i r9) {
        String A002;
        String str;
        UZF uzf = this.A00.A00;
        RefreshSpinner refreshSpinner = uzf.A06;
        if (refreshSpinner == null) {
            str = "refreshSpinner";
        } else {
            refreshSpinner.setVisibility(0);
            LinearLayout linearLayout = uzf.A01;
            if (linearLayout == null) {
                str = "errorContainer";
            } else {
                linearLayout.setVisibility(8);
                LinearLayout linearLayout2 = uzf.A00;
                if (linearLayout2 == null) {
                    str = "contentContainer";
                } else {
                    linearLayout2.setVisibility(8);
                    Product product = (Product) this.A03.A00().get(0);
                    Context context = this.A01;
                    UserSession userSession = this.A02;
                    String str2 = product.A0H;
                    User user = product.A0B;
                    if (user == null || (A002 = AnonymousClass3ZA.A00(user)) == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                    C18262VoT.A01(context, r9, userSession, new C19593WcI(this, 0), str2, A002);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public C17868VhL(Context context, UserSession userSession, ProductGroup productGroup, VPF vpf) {
        C51972G9s.A1C(userSession, vpf);
        this.A01 = context;
        this.A02 = userSession;
        this.A03 = productGroup;
        this.A00 = vpf;
    }
}
