package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.Nax  reason: case insensitive filesystem */
public final class C68920Nax extends PC9 {
    public final AnonymousClass9HC A00;
    public final AnonymousClass7IK A01;
    public final AnonymousClass7L2 A02;
    public final List A03 = 0sr.A1P(new 2FW[]{2FW.A1g, 2FW.A17, 2FW.A0K, 2FW.A1b, 2FW.A1k, 2FW.A1A});
    public final List A04 = 0sn.A00;

    public C68920Nax(Context context, UserSession userSession, AnonymousClass9HO r11, AnonymousClass9HC r12, AnonymousClass7L2 r13) {
        super(context, userSession, r11, r12, r13);
        this.A02 = r13;
        this.A00 = r12;
        this.A01 = new AnonymousClass7IK(userSession);
    }

    public final boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        Integer BmO;
        0qQ.A0B(pwl, 0);
        if (!super.AFT(pwa, pwl, i) || (BmO = pwl.BmO(i)) == null || BmO.intValue() != 3) {
            return false;
        }
        return true;
    }
}
