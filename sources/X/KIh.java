package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class KIh extends 0ng {
    public final /* synthetic */ C64724Lh1 A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIh(C64724Lh1 lh1, List list) {
        super(787, 3, false, false);
        this.A00 = lh1;
        this.A01 = list;
    }

    public final void run() {
        LED led;
        Map map;
        int i;
        C64724Lh1 lh1 = this.A00;
        List list = this.A01;
        C66540MVu mVu = lh1.A06;
        if (mVu != null) {
            led = mVu.BJn();
        } else {
            led = null;
        }
        C63914LBz lBz = lh1.A0M;
        0qQ.A0B(list, 0);
        lBz.A00 = list;
        lh1.A09 = AnonymousClass05K.A0C;
        UserSession userSession = lh1.A0I;
        boolean A06 = 182.A06(0Tu.A05, userSession, 36323715243650478L);
        Context context = lh1.A0F;
        if (led == null || (map = led.A00()) == null) {
            map = 0Yt.A0E();
        }
        List A002 = lBz.A00(map);
        C66540MVu mVu2 = lh1.A06;
        if (mVu2 != null) {
            i = mVu2.C8i(context);
        } else {
            i = 0;
        }
        C347017w8 A003 = C18192Vn6.A00(context, userSession, A002, i, lh1.A0N.A1X(), A06);
        lh1.A04 = A003;
        11Z.A02(new C66018M8d(A003, lh1, A06));
    }
}
