package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.JiD  reason: case insensitive filesystem */
public final class C60256JiD extends 2YL {
    public final UserSession A00;
    public final AnonymousClass0t1 A01;
    public final M0W A02;
    public final IgLiveCobroadcastRepository A03;
    public final IgLiveBroadcastInfoManager A04;
    public final L9O A05;
    public final C59720JVe A06;
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;

    public C60256JiD(UserSession userSession, AnonymousClass0t1 r7, M0W m0w, IgLiveCobroadcastRepository igLiveCobroadcastRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, L9O l9o, C59720JVe jVe) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A0d(3, l9o, igLiveBroadcastInfoManager, jVe, m0w);
        0qQ.A0B(r7, 7);
        this.A00 = userSession;
        this.A03 = igLiveCobroadcastRepository;
        this.A05 = l9o;
        this.A04 = igLiveBroadcastInfoManager;
        this.A06 = jVe;
        this.A02 = m0w;
        this.A01 = r7;
        1HR A0o = JTQ.A0o();
        this.A07 = A0o;
        this.A08 = 0u9.A04(A0o);
        JTS.A13(this, new MGD(this, (AnonymousClass4D7) null, 35), jVe.A00);
        JTS.A13(this, new MHK(this, (AnonymousClass4D7) null, 1), l9o.A04);
    }

    public final void A00(boolean z) {
        Object value = this.A04.A06.getValue();
        if (value != null) {
            AnonymousClass7TE.A1Z(new C59674JTf(value, (Object) this, (AnonymousClass4D7) null, 20, z), C318116oQ.A00(this));
        }
    }

    public final void onCleared() {
        C313776gz.A0K.A01(this.A00, C313666go.GUEST);
    }
}
