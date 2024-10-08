package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.KDh  reason: case insensitive filesystem */
public final class C61580KDh extends C228042kh {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public final /* bridge */ /* synthetic */ 2YL create() {
        UserSession userSession = this.A02;
        C62242Kcc A012 = LKG.A01(userSession);
        AnonymousClass0iw r4 = this.A01;
        C62176KbY A013 = C64139LPo.A01(r4, userSession);
        IgLiveModerationRepository A0f = JTP.A0f(A012);
        C59720JVe A03 = A012.A03();
        IgLiveBroadcastSettingsRepository igLiveBroadcastSettingsRepository = (IgLiveBroadcastSettingsRepository) A012.A00.getValue();
        IgLiveHeartbeatManager igLiveHeartbeatManager = A012.A04;
        LES A022 = A012.A02();
        return new C60292Jip(r4, userSession, A013.A01(this.A00), (LF6) A013.A05.getValue(), igLiveBroadcastSettingsRepository, (IgLiveCommentsRepository) A012.A06.getValue(), (IgLiveJoinRequestsRepository) A012.A02.getValue(), A0f, (IgLiveQuestionSubmissionsRepository) A012.A0C.getValue(), (IgLiveShareRepository) A012.A0E.getValue(), (IgLiveBroadcastInfoManager) A012.A05.getValue(), igLiveHeartbeatManager, A022, A03, C278264wZ.A04(userSession), C278264wZ.A03(userSession), 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 2342166277780548649L));
    }

    public C61580KDh(Context context, AnonymousClass0iw r2, UserSession userSession) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A00 = context;
    }
}
