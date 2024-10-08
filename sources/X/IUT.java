package X;

import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.wellbeing.safetyecosystem.mutedwords.util.MutedWordsApiUtil;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class IUT implements JOF {
    public final /* synthetic */ C267324bN A00;
    public final /* synthetic */ JOG A01;
    public final /* synthetic */ GBE A02;
    public final /* synthetic */ GD6 A03;
    public final /* synthetic */ HK5 A04;

    public final void Cyi(Set set, boolean z) {
        ConfirmationStyle confirmationStyle;
        AnonymousClass1eD Anw;
        0qQ.A0B(set, 1);
        HK5 hk5 = this.A04;
        C267324bN r6 = this.A00;
        GD6 gd6 = this.A03;
        List A0K = gd6.A0A.A0K(C295365o2.ORGANIC);
        Iterator it = A0K.iterator();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (!C51969G9p.A1Y(r6, C51971G9r.A0u(it))) {
                i2++;
            } else if (i2 >= 0) {
                i = i2;
            }
        }
        List A0v = C51969G9p.A0v(A0K, i);
        if (z) {
            GBE gbe = this.A02;
            1Xj r0 = r6.A02;
            if (r0 == null || (Anw = r0.A0C.Anw()) == null) {
                confirmationStyle = null;
            } else {
                confirmationStyle = Anw.Apx();
            }
            if (confirmationStyle == ConfirmationStyle.BOTTOMSHEET) {
                GBE.A02(r6, gbe);
                11Z.A03(new C57784IgP(hk5.A02));
            }
            UserSession userSession = hk5.A01;
            1OC A012 = MutedWordsApiUtil.A01(userSession, 00k.A0a(set));
            A012.A00 = new H4N(4, gbe, r6, hk5, A0v);
            1ES.A03(A012);
            C55016Han.A00(hk5.A00, userSession);
            return;
        }
        JOG jog = this.A01;
        if (jog != null) {
            jog.DGZ(true, false);
        }
    }

    public IUT(C267324bN r1, JOG jog, GBE gbe, GD6 gd6, HK5 hk5) {
        this.A04 = hk5;
        this.A00 = r1;
        this.A03 = gd6;
        this.A02 = gbe;
        this.A01 = jog;
    }
}
