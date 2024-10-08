package X;

import android.graphics.Rect;
import android.view.View;
import com.instagram.common.session.UserSession;

public final class JW3 implements C250603lj {
    public final /* synthetic */ View A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C378479Py A02;
    public final /* synthetic */ C343317q1 A03;

    public JW3(View view, UserSession userSession, C378479Py r3, C343317q1 r4) {
        this.A00 = view;
        this.A03 = r4;
        this.A02 = r3;
        this.A01 = userSession;
    }

    public final void ATF(AnonymousClass30Y r4, C252093oY r5) {
        C343317q1 r1;
        int intValue = r5.CEk(r4).intValue();
        if (intValue == 0) {
            Rect rect = new Rect();
            this.A00.getGlobalVisibleRect(rect);
            C343317q1 r12 = this.A03;
            if (r12 != null) {
                r12.A00(rect, ((JW4) r4.A03).A00);
            }
            JX8.A02(((JW4) r4.A03).A00, this.A01, this.A02);
        } else if (intValue == 2 && (r1 = this.A03) != null) {
            r1.A01(((JW4) r4.A03).A00);
        }
    }
}
