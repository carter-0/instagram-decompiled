package X;

import android.view.View;
import com.facebook.browser.lite.extensions.autofill.model.AutofillConstants$PaymentAutofillSoftKeyboardVariant;
import com.instagram.common.session.UserSession;
import java.util.Set;

public final class TR3 extends Thread {
    public final /* synthetic */ C7580QKv A00;

    public TR3(C7580QKv qKv) {
        this.A00 = qKv;
    }

    public final void run() {
        C340027ka r0;
        0hq r4;
        C7580QKv qKv = this.A00;
        UserSession userSession = qKv.A0d;
        if (userSession != null && qKv.A06 == null) {
            qKv.A06 = new C10377RrE(userSession);
        }
        AnonymousClass07Z A03 = qKv.A03();
        C10377RrE rrE = qKv.A06;
        if (!(rrE == null || A03 == null)) {
            if (qKv.A04 == null) {
                qKv.A04 = C11649Sdr.A00(qKv, 17);
            }
            C10492Rt7 rt7 = rrE.A00;
            SRr.A00(new C8764R8p((Object) rt7, 4), rt7.A01);
            SB5.A00(new TIR(A03, rt7.A00, qKv));
        }
        if (qKv.A02 != null && qKv.A07 != null && (r0 = qKv.A03) != null) {
            r0.getParentFragmentManager();
            Set set = AutofillConstants$PaymentAutofillSoftKeyboardVariant.A00;
            C270254gR r5 = qKv.A0b;
            if (set.contains(Pxe.A0w(0Tu.A06, r5.A04.A00, 36885810498634400L))) {
                View view = qKv.A02;
                STY sty = qKv.A07;
                C340027ka r02 = qKv.A03;
                if (r02 != null) {
                    r4 = r02.getParentFragmentManager();
                } else {
                    r4 = null;
                }
                qKv.A08 = new S55(view, r4, r5, qKv, sty, userSession);
            }
        }
    }
}
