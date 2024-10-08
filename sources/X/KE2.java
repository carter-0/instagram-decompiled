package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveCobroadcastRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

public final class KE2 extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C62423KfY A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        C62242Kcc A012 = LKG.A01(userSession);
        C62176KbY A013 = C64139LPo.A01(this.A01, userSession);
        LES A022 = A012.A02();
        C59720JVe A032 = A012.A03();
        Context context = this.A00;
        IgLiveCobroadcastRepository A002 = A012.A00(context, userSession);
        L9O l9o = A012.A00;
        IgLiveBroadcastInfoManager A014 = A012.A01();
        C313816h4 r11 = A012.A03;
        M0X A015 = A013.A01(context);
        0qQ.A0B(context, 0);
        LRP lrp = A013.A00;
        if (lrp == null) {
            lrp = new LRP(context, A013.A00, A013.A01);
            A013.A00 = lrp;
        }
        C62423KfY kfY = this.A03;
        0Tu A0J = DbS.A0J(userSession, 0);
        return new C60302Jj0(userSession, A015, lrp, A002, A014, r11, l9o, A022, A032, kfY, 182.A01(A0J, userSession, 36599525158293068L), 182.A01(A0J, userSession, 36599525158686286L), 182.A06(A0J, userSession, 36312393712010339L), 182.A06(A0J, userSession, 36318050181519154L));
    }

    public KE2(Context context, AnonymousClass0iw r2, UserSession userSession, C62423KfY kfY) {
        C51974G9v.A1M(r2, context, kfY);
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = kfY;
    }
}
