package X;

import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;

/* renamed from: X.KfP  reason: case insensitive filesystem */
public final class C62414KfP extends C60255JiC {
    public boolean A00;
    public final 2Fk A01;
    public final 1Av A02;
    public final C249513ju A03;
    public final AnonymousClass0r6 A04;
    public final 05G A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62414KfP(1Av r9, IgLiveJoinRequestsRepository igLiveJoinRequestsRepository, IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, LES les, C59720JVe jVe, boolean z) {
        super((C313716gt) null, igLiveBroadcastInfoManager, les, jVe);
        0qQ.A0B(igLiveJoinRequestsRepository, 1);
        C51974G9v.A1S(jVe, igLiveQuestionSubmissionsRepository, igLiveBroadcastInfoManager, les, r9);
        this.A02 = r9;
        this.A06 = z;
        1HR A1G = JTO.A1G(0);
        this.A03 = A1G;
        this.A04 = 0u9.A04(A1G);
        02z A10 = C51970G9q.A10(false);
        this.A05 = A10;
        AnonymousClass0Ud r3 = igLiveJoinRequestsRepository.A09;
        AnonymousClass0Ud r4 = igLiveJoinRequestsRepository.A0C;
        AnonymousClass0Ud r5 = igLiveQuestionSubmissionsRepository.A06;
        AnonymousClass0Ud r6 = igLiveBroadcastInfoManager.A06;
        0pp A022 = AnonymousClass10H.A02(new MI6(this, (AnonymousClass4D7) null, 1), r3, r4, r5, r6, A10);
        19B r42 = 19B.A00;
        this.A01 = C226292g8.A00(r42, A022);
        JTR.A1H(this, new C59734JVs(les, (AnonymousClass4D7) null), les.A0j, les.A0l, r6);
        JTS.A13(this, new MGB(this, (AnonymousClass4D7) null, 16), les.A0q);
        1Eo.A05(r42, new C66169MGg(jVe, this, (AnonymousClass4D7) null, 45), C318116oQ.A00(this));
    }

    public final String getFormattedBadgeCount(int i, int i2) {
        if (i <= i2) {
            return String.valueOf(i);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(i2);
        return C51967G9n.A0r(A1A, '+');
    }
}
