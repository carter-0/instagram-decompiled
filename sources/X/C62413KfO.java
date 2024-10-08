package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.KfO  reason: case insensitive filesystem */
public final class C62413KfO extends C60255JiC {
    public final 2Fk A00;
    public final boolean A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62413KfO(IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, C59720JVe jVe, boolean z) {
        super((C313716gt) null, igLiveBroadcastInfoManager, les, jVe);
        C51974G9v.A1P(igLiveHeartbeatManager, jVe, igLiveQuestionSubmissionsRepository, igLiveBroadcastInfoManager);
        0qQ.A0B(les, 5);
        this.A01 = z;
        this.A00 = DbT.A0G(AnonymousClass10H.A00(new C73570Pfy(this, (AnonymousClass4D7) null, 7), igLiveHeartbeatManager.A08, igLiveQuestionSubmissionsRepository.A06, igLiveBroadcastInfoManager.A06));
    }
}
