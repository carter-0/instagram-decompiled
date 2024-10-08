package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* renamed from: X.Lio  reason: case insensitive filesystem */
public final class C64828Lio implements AnonymousClass0lh {
    public final UserSession A00;
    public final FEX A01;
    public final Map A02 = AnonymousClass7TE.A1H();
    public final C262224Cq A03;

    public final Object A00(Context context, Integer num, String str, String str2, AnonymousClass4D7 r15) {
        FEX fex = this.A01;
        1IW A0q = C51973G9u.A0q(r15);
        fex.A01.A02(((T7R) fex.A05.getValue()).A00(context, FEX.A06), new C51140FpC(num, fex, A0q, str, str2, 2));
        A0q.CO0(new J6H(fex, 0));
        return A0q.A0E();
    }

    public final void onSessionWillEnd() {
        FEX fex = this.A01;
        fex.A01.A01();
        ((T7R) fex.A05.getValue()).A01();
        19E.A05((CancellationException) null, this.A03);
    }

    public C64828Lio(AnonymousClass12V r2, UserSession userSession, FEX fex) {
        AnonymousClass7TG.A1P(userSession, r2);
        this.A00 = userSession;
        this.A01 = fex;
        this.A03 = 19E.A02(((AnonymousClass12U) r2).A04);
    }
}
