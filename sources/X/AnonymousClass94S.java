package X;

import android.content.Context;
import com.facebook.odin.prediction.litennmodelparams.DynamicNNModelParams;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.Collections;
import java.util.List;

/* renamed from: X.94S  reason: invalid class name */
public final class AnonymousClass94S implements AnonymousClass94T {
    public final AnonymousClass0JP A00;
    public final AnonymousClass40N A01;
    public final C258743zZ A02;
    public final C2604745u A03;
    public final AnonymousClass40J A04;
    public final UserSession A05;
    public final AnonymousClass94Y A06;
    public final AnonymousClass94U A07;

    public final void CN8() {
        long j;
        Object obj;
        AnonymousClass411 r1;
        C258743zZ r4 = this.A02;
        if (!r4.CZg()) {
            cleanup();
            return;
        }
        AnonymousClass94Y r12 = this.A06;
        List singletonList = Collections.singletonList(r4);
        0qQ.A07(singletonList);
        r12.A00(singletonList);
        if (C64031Cc.A09 == 1CS.A03) {
            this.A03.A05("last_cold_start_key", C64031Cc.A08);
        }
        C60400gq r5 = this.A04.A00;
        if (r5 == null || !r5.Agw(36317779599365640L)) {
            AnonymousClass40N r3 = this.A01;
            if (r5 != null) {
                j = r5.BON(36599254576139736L);
            } else {
                j = 0;
            }
            r3.CfI((int) j);
        } else {
            this.A01.EDJ();
        }
        if (r4.BeZ() == AnonymousClass05K.A01 && r4.Bux()) {
            UserSession userSession = this.A05;
            0qQ.A0B(userSession, 0);
            Class<C39893ADv> cls = C39893ADv.class;
            File A002 = C39893ADv.A00((C39893ADv) userSession.A01(cls, new TTN(r4, 41)));
            if (!A002.exists() || !A002.canRead()) {
                S4A A003 = C9265RVq.A00(userSession);
                0qQ.A0B(A003, 2);
                AnonymousClass40G A004 = SKQ.A00(A003, r4, AnonymousClass0eN.A01(C41585Awz.A00));
                if (!(!A004.A02 || (obj = A004.A00) == null || (r1 = (AnonymousClass411) obj) == null)) {
                    try {
                        ((C39893ADv) userSession.A01(cls, new TTN(r4, 41))).A02((DynamicNNModelParams) r1);
                    } catch (Exception unused) {
                    }
                }
            }
        }
        if (r4.CdU()) {
            UserSession userSession2 = this.A05;
            0qQ.A0B(userSession2, 0);
            AnonymousClass404 r13 = (AnonymousClass404) ((AnonymousClass951) userSession2.A01(AnonymousClass951.class, new C13350TVx(userSession2, 5))).A02.getValue();
            List Aao = r13.Aao();
            if (!Aao.isEmpty()) {
                new AnonymousClass953(1vm.A01(userSession2)).A00(AnonymousClass05K.A0N, r4.CCP(), r4.CCS(), Aao, (C62320sa) null, (0sP) null, this.A00.now());
                r13.EDD();
            }
        }
    }

    public final void cleanup() {
        AnonymousClass385.A00(((C39875ACw) this.A07.A02.getValue()).A00).A05("IG_STORY_ADS_PREFETCH_WORKER");
        this.A03.A03("last_cold_start_key");
        this.A01.EDJ();
        UserSession userSession = this.A05;
        0qQ.A0B(userSession, 0);
        ((AnonymousClass404) ((AnonymousClass951) userSession.A01(AnonymousClass951.class, new C13350TVx(userSession, 5))).A02.getValue()).EDD();
    }

    public AnonymousClass94S(UserSession userSession, Context context) {
        this.A05 = userSession;
        this.A03 = (C2604745u) C2604645t.A00(userSession).A02.getValue();
        this.A02 = new C258733zY(userSession);
        this.A04 = new AnonymousClass40J(userSession);
        0qQ.A0B(userSession, 0);
        0qQ.A0B(context, 1);
        this.A07 = (AnonymousClass94U) userSession.A01(AnonymousClass94U.class, new TTP(16, context, userSession));
        this.A01 = (AnonymousClass40N) ((AnonymousClass40I) userSession.A01(AnonymousClass40I.class, new C13350TVx(userSession, 12))).A03.getValue();
        this.A06 = ((AnonymousClass94V) userSession.A01(AnonymousClass94V.class, new TTP(9, context, userSession))).A01;
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A00 = r0;
    }
}
