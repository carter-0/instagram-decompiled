package X;

import android.content.DialogInterface;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class IB5 implements View.OnClickListener {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C262794Ga A01;
    public final /* synthetic */ 1Xj A02;

    public IB5(UserSession userSession, C262794Ga r2, 1Xj r3) {
        this.A01 = r2;
        this.A00 = userSession;
        this.A02 = r3;
    }

    public final void onClick(View view) {
        Integer num;
        int A05 = AnonymousClass0fD.A05(1152306196);
        C55922Hpj hpj = new C55922Hpj(AnonymousClass7TE.A0S(AnonymousClass7TH.A06(this.A01.A03)));
        UserSession userSession = this.A00;
        1Xj r2 = this.A02;
        if (r2.A6S(userSession)) {
            num = AnonymousClass05K.A0N;
        } else {
            Integer A002 = C263014Gw.A00(r2);
            if (A002 == null || A002.intValue() < C56645I6a.A00(userSession)) {
                num = AnonymousClass05K.A0u;
            } else {
                num = AnonymousClass05K.A0Y;
            }
        }
        hpj.A00((DialogInterface.OnClickListener) null, userSession, r2, num);
        AnonymousClass0fD.A0C(-1901129909, A05);
    }
}
