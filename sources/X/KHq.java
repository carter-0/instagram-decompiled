package X;

import android.view.View;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.session.UserSession;

public final class KHq extends AnonymousClass3NK {
    public final int A00;
    public final Object A01;
    public final String A02;

    public KHq(String str, Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = str;
    }

    public final boolean Dqe(View view) {
        switch (this.A00) {
            case 0:
                NametagController nametagController = (NametagController) this.A01;
                UserSession userSession = nametagController.A0D;
                C22031Xty.A0D(nametagController.A0C, userSession, userSession.A06, nametagController.A0F, "copy_link");
                String str = this.A02;
                NametagController.A02(new Lc4(this, 2), nametagController, AnonymousClass05K.A00, str);
                return true;
            case 1:
                NametagController nametagController2 = (NametagController) this.A01;
                UserSession userSession2 = nametagController2.A0D;
                C22031Xty.A0D(nametagController2.A0C, userSession2, userSession2.A06, nametagController2.A0F, "system_share_sheet");
                String str2 = this.A02;
                C64287LYn lYn = nametagController2.A09.A0J;
                if (lYn.A05()) {
                    lYn.A03(false);
                }
                SQH.A02(nametagController2.A0B.getParentFragmentManager());
                nametagController2.A08.post(new C65956M5t(nametagController2, str2));
                return true;
            default:
                ((0sP) this.A01).invoke(this.A02);
                return true;
        }
    }
}
