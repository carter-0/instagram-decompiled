package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.datasource.api.IgLiveFollowStatusApi;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.video.live.mvvm.viewmodel.optionsdialog.IgLiveOptionsDialogViewModel;

public final class KE9 extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C313666go A03;

    public KE9(Context context, AnonymousClass0iw r3, UserSession userSession, C313666go r5) {
        0qQ.A0B(r5, 2);
        this.A02 = userSession;
        this.A03 = r5;
        this.A01 = r3;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        M0X m0x;
        C313696gr r2;
        C62176KbY kbY;
        C313786h0 r0 = C313776gz.A0K;
        UserSession userSession = this.A02;
        C313666go r9 = this.A03;
        C313776gz A002 = r0.A00(userSession, r9);
        C313656gn r02 = C313646gm.A0A;
        AnonymousClass0iw r6 = this.A01;
        C313646gm A003 = r02.A00(r6, userSession, r9);
        IgLiveCommentsRepository igLiveCommentsRepository = (IgLiveCommentsRepository) A002.A06.getValue();
        IgLiveBroadcastInfoManager A012 = A002.A01();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A002.A04;
        C59720JVe A032 = A002.A03();
        IgLiveModerationRepository A0f = JTP.A0f(A002);
        LES A022 = A002.A02();
        C313816h4 r03 = A002.A03;
        IgLiveFollowStatusApi igLiveFollowStatusApi = new IgLiveFollowStatusApi(userSession);
        C313716gt r13 = null;
        if (!(A003 instanceof C62176KbY) || (kbY = (C62176KbY) A003) == null) {
            m0x = null;
        } else {
            m0x = kbY.A01(this.A00);
        }
        if ((A003 instanceof C313696gr) && (r2 = (C313696gr) A003) != null) {
            r13 = (C313716gt) r2.A05.getValue();
        }
        return new IgLiveOptionsDialogViewModel(r6, userSession, igLiveFollowStatusApi, r9, (L7I) A003.A03.getValue(), m0x, (LF6) A003.A05.getValue(), r13, igLiveCommentsRepository, A0f, A012, r03, igLiveHeartbeatManager, A022, A032);
    }
}
