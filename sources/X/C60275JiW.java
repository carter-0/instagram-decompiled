package X;

import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.JiW  reason: case insensitive filesystem */
public final class C60275JiW extends 2YL {
    public final UserSession A00;
    public final 1Av A01;
    public final AnonymousClass0t1 A02;
    public final LAV A03;
    public final C313736gv A04;
    public final IgLiveViewerJoinFlowRepository A05;
    public final IgLiveBroadcastInfoManager A06;
    public final IgLiveHeartbeatManager A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final boolean A0A;

    public static final int A00(AnonymousClass3NV r1, C60275JiW jiW, Integer num, String str) {
        if (r1 == AnonymousClass3NV.A07) {
            return 2131965248;
        }
        if (r1 == AnonymousClass3NV.A05) {
            return 2131965246;
        }
        if (r1 == AnonymousClass3NV.A04) {
            if (jiW.A0A) {
                return 2131965246;
            }
            return 2131965245;
        } else if (str != null && str.length() != 0) {
            return 2131965232;
        } else {
            Integer A0N = jiW.A02.A00().A0N();
            Integer num2 = AnonymousClass05K.A0C;
            if (A0N == num2 && num == num2) {
                return 2131965254;
            }
            return 2131965253;
        }
    }

    public /* synthetic */ C60275JiW(UserSession userSession, LAV lav, C313736gv r9, IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, C59720JVe jVe, boolean z) {
        AnonymousClass0t1 A002 = 0eE.A00(userSession);
        1Av A003 = 1Au.A00(userSession);
        C51974G9v.A1S(jVe, igLiveBroadcastInfoManager, igLiveHeartbeatManager, igLiveViewerJoinFlowRepository, lav);
        C51973G9u.A0u(7, r9, A002, A003);
        this.A00 = userSession;
        this.A06 = igLiveBroadcastInfoManager;
        this.A07 = igLiveHeartbeatManager;
        this.A05 = igLiveViewerJoinFlowRepository;
        this.A03 = lav;
        this.A04 = r9;
        this.A0A = z;
        this.A02 = A002;
        this.A01 = A003;
        1HR A0o = JTQ.A0o();
        this.A08 = A0o;
        this.A09 = 0u9.A04(A0o);
        JTS.A13(this, new MHK(this, (AnonymousClass4D7) null, 18), jVe.A00);
        JTR.A1H(this, new MHr(this, (AnonymousClass4D7) null, 8), igLiveBroadcastInfoManager.A06, igLiveHeartbeatManager.A08, igLiveViewerJoinFlowRepository.A06);
    }
}
