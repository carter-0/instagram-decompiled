package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

public final class KIi extends 0ng {
    public final /* synthetic */ C64724Lh1 A00;
    public final /* synthetic */ List A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIi(C64724Lh1 lh1, List list) {
        super(787, 3, false, false);
        this.A00 = lh1;
        this.A01 = list;
    }

    public final void run() {
        Map map;
        int i;
        LED BJn;
        LED BJn2;
        C64724Lh1 lh1 = this.A00;
        List list = this.A01;
        C63914LBz lBz = lh1.A0M;
        0qQ.A0B(list, 0);
        lBz.A00 = list;
        if (lh1.A04 == null) {
            Context context = lh1.A0F;
            UserSession userSession = lh1.A0I;
            C66540MVu mVu = lh1.A06;
            if (mVu == null || (BJn2 = mVu.BJn()) == null || (map = BJn2.A00()) == null) {
                map = 0Yt.A0E();
            }
            List A002 = lBz.A00(map);
            C66540MVu mVu2 = lh1.A06;
            if (mVu2 != null) {
                i = mVu2.C8i(context);
            } else {
                i = 0;
            }
            lh1.A04 = C18192Vn6.A00(context, userSession, A002, i, lh1.A0N.A1X(), 182.A06(0Tu.A05, userSession, 36323715243650478L));
            C66540MVu mVu3 = lh1.A06;
            if (!(mVu3 == null || (BJn = mVu3.BJn()) == null)) {
                lh1.A0B(BJn.A00, true);
                C347017w8 r1 = lh1.A04;
                if (r1 != null) {
                    r1.A0B(BJn.A02);
                }
                C64724Lh1.A07(lh1, BJn.A03);
            }
        }
        C66540MVu mVu4 = lh1.A06;
        if (mVu4 != null && mVu4.BJn() != null) {
            11Z.A03(new C65863M2e(lh1));
        }
    }
}
