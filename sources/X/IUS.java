package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil;
import java.util.List;
import java.util.Set;

public final class IUS implements JOF {
    public final /* synthetic */ C2363033f A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ JOG A02;
    public final /* synthetic */ AnonymousClass3W1 A03;

    public final void Cyi(Set set, boolean z) {
        0qQ.A0B(set, 1);
        if (z) {
            C2363033f r6 = this.A00;
            1Ux r0 = r6.A04;
            if (r0 != null) {
                r0.AHa();
            }
            1Xj r7 = this.A01;
            List CBH = r6.A03.CBH();
            0qQ.A07(CBH);
            int indexOf = CBH.indexOf(r7);
            if (indexOf == -1) {
                indexOf = 0;
            }
            List A0v = C51969G9p.A0v(CBH, indexOf);
            UserSession userSession = r6.A01;
            AnonymousClass4D6 r3 = r6.A00;
            AnonymousClass4D6 r2 = r3;
            H51 h51 = new H51(4, (Object) A0v, (Object) r6);
            0qQ.A0B(r2, 1);
            1OC A012 = MutedWordsApiUtil.A01(userSession, 00k.A0a(set));
            A012.A00 = h51;
            r2.schedule(A012);
            C55016Han.A00(r3.requireActivity(), userSession);
            ((C57239IUa) ((C2357230y) r6.A02).A1V.getValue()).CLj(r7, this.A03, (String) null, (String) null, 0, true, false);
            return;
        }
        JOG jog = this.A02;
        if (jog != null) {
            jog.DGZ(true, false);
        }
    }

    public IUS(C2363033f r1, 1Xj r2, JOG jog, AnonymousClass3W1 r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A03 = r4;
        this.A02 = jog;
    }
}
