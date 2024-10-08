package X;

import android.content.Context;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.PregenerateSdpWrapper;
import com.facebook.rp.platform.metaai.rsys.pregeneratesdp.gen.PregenerateSdp;
import com.instagram.common.session.UserSession;

public final class OVH {
    public static final C331537Rj A03 = C331537Rj.DIRECT_META_AI_THREAD_VIEW_AUDIO_BUTTON;
    public final UserSession A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;

    public OVH(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A00 = userSession;
        AnonymousClass95K.A00();
        0eO r2 = 0eO.A04;
        this.A01 = AnonymousClass0eN.A00(r2, new C73912Pln(this, 1));
        this.A02 = AnonymousClass0eN.A00(r2, new C73912Pln(this, 2));
    }

    public final void A00(Context context) {
        UserSession userSession = this.A00;
        0Tu r4 = 0Tu.A05;
        if (182.A06(r4, userSession, 36327447570758088L)) {
            ((C71769OqV) userSession.A01(C71769OqV.class, C73925Pm5.A01(userSession, 26))).getValues();
        }
        if (((OL3) this.A01.getValue()).A00()) {
            synchronized (PregenerateSdpWrapper.A01) {
                if (!PregenerateSdpWrapper.A02) {
                    C71004OWb.A00.A00("PregenerateSdpWrapper", 002.A0R("Initialized PregenerateSdp class: ", PregenerateSdp.Companion.toString()));
                    PregenerateSdpWrapper.A02 = true;
                }
            }
        }
        if (182.A06(r4, userSession, 36327447570561477L)) {
            C66953Mfm.A00(C51966G9m.A0P(userSession), userSession).A00();
        }
        if (182.A06(r4, userSession, 36327447570627014L)) {
            Xm7.A00(context, C51965G9l.A0l(), C70320O1y.A00(userSession));
        }
    }
}
