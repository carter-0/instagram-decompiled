package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public final class IWA implements C51911G7f {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public IWA(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void DZM() {
        if (this.A00 != 0) {
            UserSession userSession = ((GU9) this.A03).A00;
            Context context = (Context) this.A01;
            LRh lRh = new LRh(userSession, context);
            C54689HOu hOu = C54689HOu.OPEN_CAROUSEL_TURN_ON_FROM_BANNER;
            1Xj r2 = (1Xj) this.A02;
            lRh.A04(hOu, r2.A2n());
            I0v.A00(context, r2, new I0v(userSession), true);
            return;
        }
        C53990GxY.A00(C51969G9p.A0L(this.A02), (C53990GxY) this.A03, (LRh) this.A01);
    }

    public final void Di5() {
        if (this.A00 == 0) {
            C53990GxY.A04((C53990GxY) this.A03, (LRh) this.A01);
        }
    }

    public final void Dvq() {
        if (this.A00 == 0) {
            C53990GxY.A00(C51969G9p.A0L(this.A02), (C53990GxY) this.A03, (LRh) this.A01);
        }
    }
}
