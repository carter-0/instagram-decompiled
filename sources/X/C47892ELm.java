package X;

import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.ELm  reason: case insensitive filesystem */
public final class C47892ELm extends AnonymousClass2xK {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ C48106EVy A01;
    public final /* synthetic */ VZO A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ Product A05;
    public final /* synthetic */ String A06;

    public final boolean Ds8(AnonymousClass5Gv r29) {
        String str;
        0qQ.A0B(r29, 0);
        int ordinal = this.A01.ordinal();
        if (ordinal != 1) {
            if (ordinal == 0) {
                C249713kF r5 = C249713kF.A00;
                FragmentActivity context = this.A00.getContext();
                DbS.A1X(context);
                FragmentActivity fragmentActivity = context;
                Product product = this.A05;
                User user = product.A0B;
                if (user != null) {
                    str = AnonymousClass3ZA.A00(user);
                } else {
                    str = null;
                }
                0qQ.A0A(str);
                r5.A0m(fragmentActivity, V1Z.UNKNOWN, V1W.UNKNOWN, V1Y.UNKNOWN, V1X.UNKNOWN, this.A03, (Long) null, str, this.A02.A02, this.A04.getModuleName(), "global_cart_icon", (String) null, (String) null, (String) null, (String) null, (String) null, product.A0H, (String) null, (String) null, this.A06, (HashMap) null, false);
                return true;
            } else if (ordinal != 2) {
                throw AnonymousClass7TE.A1K();
            }
        }
        return true;
    }

    public C47892ELm(ImageView imageView, C48106EVy eVy, VZO vzo, UserSession userSession, AnonymousClass4DU r5, Product product, String str) {
        this.A01 = eVy;
        this.A00 = imageView;
        this.A05 = product;
        this.A03 = userSession;
        this.A02 = vzo;
        this.A04 = r5;
        this.A06 = str;
    }
}
