package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Collections;
import java.util.List;

/* renamed from: X.94u  reason: invalid class name and case insensitive filesystem */
public final class C3732994u implements AnonymousClass94T {
    public final AnonymousClass0JP A00;
    public final C258743zZ A01;
    public final UserSession A02;
    public final AnonymousClass94Y A03;

    public final void CN8() {
        C258743zZ r4 = this.A01;
        if (!r4.CZg()) {
            cleanup();
            return;
        }
        if (r4.CCa()) {
            AnonymousClass94Y r1 = this.A03;
            List singletonList = Collections.singletonList(r4);
            0qQ.A07(singletonList);
            r1.A00(singletonList);
        }
        if (r4.CdU()) {
            UserSession userSession = this.A02;
            0qQ.A0B(userSession, 0);
            AnonymousClass404 r12 = (AnonymousClass404) ((C298105st) userSession.A01(C298105st.class, new C13350TVx(userSession, 17))).A01.getValue();
            List Aao = r12.Aao();
            if (!Aao.isEmpty()) {
                new AnonymousClass953(1vm.A01(userSession)).A00(AnonymousClass05K.A0N, r4.CCP(), r4.CCS(), Aao, (C62320sa) null, (0sP) null, this.A00.now());
                r12.EDD();
            }
        }
    }

    public final void cleanup() {
        UserSession userSession = this.A02;
        0qQ.A0B(userSession, 0);
        ((AnonymousClass404) ((C298105st) userSession.A01(C298105st.class, new C13350TVx(userSession, 17))).A01.getValue()).EDD();
    }

    public C3732994u(UserSession userSession, Context context) {
        this.A02 = userSession;
        this.A01 = new AnonymousClass94R(userSession);
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        this.A03 = ((AnonymousClass94V) userSession.A01(AnonymousClass94V.class, new TTP(9, context, userSession))).A01;
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A00 = r0;
    }
}
