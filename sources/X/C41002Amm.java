package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Amm  reason: case insensitive filesystem */
public final /* synthetic */ class C41002Amm implements Runnable {
    public final /* synthetic */ AnonymousClass8BA A00;
    public final /* synthetic */ C3499082j A01;

    public /* synthetic */ C41002Amm(AnonymousClass8BA r1, C3499082j r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8BA r8 = this.A00;
        C3499082j r10 = this.A01;
        C317876nz r0 = C317876nz.A0a;
        C317876nz A012 = C317886o0.A01();
        UserSession userSession = r8.A0v;
        Context A0T = AnonymousClass7TE.A0T(r8);
        TargetViewSizeProvider targetViewSizeProvider = r8.A0z;
        AnonymousClass7TG.A1N(userSession, A0T);
        0qQ.A0B(targetViewSizeProvider, 3);
        List A1P = 0sr.A1P(new String[]{"standalone_fundraiser_sticker_id", "multiple_avatar_standalone_sticker_id"});
        if (182.A06(0Tu.A05, userSession, 36316624252572189L)) {
            Collections.rotate(A1P, -1);
        }
        C347017w8 A002 = ABT.A00(A0T, userSession, targetViewSizeProvider, r10, A1P);
        C39890ADo A003 = C39890ADo.A00();
        A003.A0Q = true;
        AnonymousClass8BG.A00(A002, A012, r8, A003);
    }
}
