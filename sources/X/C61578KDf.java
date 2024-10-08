package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.KDf  reason: case insensitive filesystem */
public final class C61578KDf extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C61578KDf(Context context, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        C357488Yc A012;
        UserSession userSession = this.A02;
        C62242Kcc A013 = LKG.A01(userSession);
        C62176KbY A014 = C64139LPo.A01(this.A01, userSession);
        IgLiveBroadcastInfoManager A015 = A013.A01();
        C313816h4 r9 = A013.A03;
        IgLiveHeartbeatManager igLiveHeartbeatManager = A013.A04;
        LES A022 = A013.A02();
        C59720JVe A03 = A013.A03();
        1Av A002 = 1Au.A00(userSession);
        Context context = this.A00;
        M0X A016 = A014.A01(context);
        0Tu A0H = AnonymousClass7TF.A0H(userSession);
        boolean A06 = 182.A06(A0H, userSession, 36320927809545173L);
        long A017 = 182.A01(A0H, userSession, 36602402786316925L);
        W0T w0t = null;
        if (C362988ir.A01(context.getApplicationContext(), userSession) && (A012 = C357488Yc.A03.A01(userSession)) != null) {
            w0t = A012.A00();
        }
        return new C60249Ji6(A002, w0t, A016, A015, r9, igLiveHeartbeatManager, A022, A03, A017, A06, 182.A06(A0H, userSession, 36325347330896779L));
    }
}
