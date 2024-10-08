package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.List;

public final class GHJ implements JRF {
    public final /* synthetic */ AnonymousClass3Y5 A00;
    public final /* synthetic */ 2Wa A01;
    public final /* synthetic */ GG8 A02;

    public final void D7O(C267324bN r9, List list) {
        boolean A1U = AnonymousClass7TF.A1U(0, r9, list);
        GG8 gg8 = this.A02;
        C267324bN r1 = gg8.A00;
        if (!r9.equals(r1)) {
            0f9 AEf = 0wj.A01.AEf("ClipsVideoSubtitlesCuingMismatch", 817902720);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "Cue caught for wrong media id in Litho impl.");
            AEf.report();
            return;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (AnonymousClass7TE.A1b(list) && AnonymousClass3WP.A0B(r1.A02)) {
            UserSession userSession = gg8.A02;
            0qQ.A0B(userSession, 0);
            1Av A002 = 1Au.A00(userSession);
            0s0 r0 = A002.A2M;
            AnonymousClass0YZ[] r4 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(A002, r0, r4, 30)) {
                A1A.insert(0, C49937FFq.A00(C243803a8.A00(this.A00), userSession));
                1Av A003 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A003, A003.A2M, r4, 30, A1U);
            }
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            CharSequence charSequence = (CharSequence) it.next();
            if (A1A.length() > 0) {
                A1A.append("\n");
            }
            A1A.append(charSequence);
        }
        this.A01.A01(A1A);
    }

    public GHJ(AnonymousClass3Y5 r1, 2Wa r2, GG8 gg8) {
        this.A02 = gg8;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Dzs() {
    }

    public final void DaP(C52078GDy gDy, boolean z) {
    }

    public final void Dxg(C267324bN r1, int i) {
    }

    public final void Dxi(C267324bN r1, int i) {
    }

    public final void DxZ(C267324bN r1, int i, int i2) {
    }

    public final void Dxm(C267324bN r1, Integer num, int i) {
    }

    public final void Dzr(C267324bN r1, JRO jro, boolean z) {
    }

    public final void DaS(C267324bN r1, int i, int i2, boolean z) {
    }

    public final void Dxl(C267324bN r1, C52058GDe gDe, C52019GBq gBq, C52078GDy gDy, boolean z) {
    }
}
