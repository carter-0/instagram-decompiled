package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.Date;

public final class P03 implements C74441Puw {
    public final /* synthetic */ OVO A00;
    public final /* synthetic */ C331157Pu A01;
    public final /* synthetic */ DirectThreadKey A02;
    public final /* synthetic */ Integer A03;

    public final void D9d() {
    }

    public P03(OVO ovo, C331157Pu r2, DirectThreadKey directThreadKey, Integer num) {
        this.A00 = ovo;
        this.A02 = directThreadKey;
        this.A01 = r2;
        this.A03 = num;
    }

    public final void D7r(Date date) {
        this.A01.A0Q(AnonymousClass7TF.A1V(date));
    }

    public final void D9n(Date date) {
        if (date != null) {
            OVO ovo = this.A00;
            UserSession userSession = ovo.A04;
            AnonymousClass0iw r2 = ovo.A03;
            DirectThreadKey directThreadKey = this.A02;
            OQ6.A01(r2, userSession, directThreadKey, "reminder_option_done_tap", AnonymousClass7TE.A1E());
            this.A01.A07();
            OVO.A00(ovo, directThreadKey, this.A03, date.getTime());
        }
    }
}
