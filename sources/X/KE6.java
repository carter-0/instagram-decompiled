package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

public final class KE6 extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C313666go A03;

    public KE6(Context context, AnonymousClass0iw r3, UserSession userSession, C313666go r5) {
        0qQ.A0B(r5, 4);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = r5;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        AnonymousClass6h3 r0;
        C313786h0 r02 = C313776gz.A0K;
        UserSession userSession = this.A02;
        C313666go r8 = this.A03;
        C313776gz A002 = r02.A00(userSession, r8);
        AnonymousClass0iw r2 = this.A01;
        C313696gr A003 = C313636gl.A00(r2, userSession);
        Context context = this.A00;
        C313816h4 r13 = A002.A03;
        LES A022 = A002.A02();
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) A002.A06.getValue();
        IgLiveBroadcastInfoManager A012 = A002.A01();
        C63921LDa lDa = null;
        if ((A002 instanceof AnonymousClass6h3) && (r0 = (AnonymousClass6h3) A002) != null) {
            lDa = (C63921LDa) r0.A00.getValue();
        }
        C59720JVe A032 = A002.A03();
        return new C60291Jio(context, AnonymousClass0kN.A01(r2, userSession), userSession, A003.A00, r8, (LM9) A003.A08.getValue(), igLiveCommentsRepository, lDa, A012, r13, A022, A032, C278264wZ.A04(userSession));
    }
}
