package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Nw3  reason: case insensitive filesystem */
public abstract class C70025Nw3 {
    public static final 1OO A00(Context context, UserSession userSession, ImageUrl imageUrl, C254703su r7, 1Xj r8, String str, int i) {
        boolean A1Z = DbW.A1Z(str);
        if (r7.A0Z(userSession, Integer.valueOf(i)).booleanValue() && r7.A0Y().booleanValue()) {
            C66829MdN mdN = new C66829MdN(context.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height));
            float A0l = r8.A0l();
            int i2 = mdN.A00;
            int i3 = (int) (A0l * ((float) i2));
            C17844Vgx vgx = C17844Vgx.A03;
            if (vgx == null) {
                vgx = new C17844Vgx(userSession);
                C17844Vgx.A03 = vgx;
            }
            imageUrl = vgx.A00(imageUrl, i3, i2);
        }
        1OO A0J = 1NK.A00().A0J(imageUrl, str);
        A0J.A0I = A1Z;
        A0J.A05 = userSession;
        A0J.A0K = r8.CeS();
        r8.A17();
        return A0J;
    }
}
