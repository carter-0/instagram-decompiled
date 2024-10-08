package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveBroadcastSettingsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveJoinRequestsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveShareRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;

/* renamed from: X.Jip  reason: case insensitive filesystem */
public final class C60292Jip extends 2YL {
    public boolean A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final M0X A03;
    public final IgLiveBroadcastSettingsRepository A04;
    public final IgLiveCommentsRepository A05;
    public final IgLiveJoinRequestsRepository A06;
    public final IgLiveModerationRepository A07;
    public final IgLiveQuestionSubmissionsRepository A08;
    public final IgLiveShareRepository A09;
    public final IgLiveBroadcastInfoManager A0A;
    public final IgLiveHeartbeatManager A0B;
    public final LES A0C;
    public final C59720JVe A0D;
    public final C249513ju A0E;
    public final AnonymousClass0r6 A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final LF6 A0I;
    public final boolean A0J;

    public C60292Jip(AnonymousClass0iw r14, UserSession userSession, M0X m0x, LF6 lf6, IgLiveBroadcastSettingsRepository igLiveBroadcastSettingsRepository, IgLiveCommentsRepository igLiveCommentsRepository, IgLiveJoinRequestsRepository igLiveJoinRequestsRepository, IgLiveModerationRepository igLiveModerationRepository, IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, IgLiveShareRepository igLiveShareRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, C59720JVe jVe, boolean z, boolean z2, boolean z3) {
        C59720JVe jVe2 = jVe;
        IgLiveModerationRepository igLiveModerationRepository2 = igLiveModerationRepository;
        IgLiveJoinRequestsRepository igLiveJoinRequestsRepository2 = igLiveJoinRequestsRepository;
        IgLiveCommentsRepository igLiveCommentsRepository2 = igLiveCommentsRepository;
        C51974G9v.A1S(r14, igLiveModerationRepository2, jVe2, igLiveCommentsRepository2, igLiveJoinRequestsRepository2);
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository2 = igLiveQuestionSubmissionsRepository;
        IgLiveBroadcastSettingsRepository igLiveBroadcastSettingsRepository2 = igLiveBroadcastSettingsRepository;
        AnonymousClass7TF.A1F(igLiveQuestionSubmissionsRepository2, 7, igLiveBroadcastSettingsRepository2);
        IgLiveShareRepository igLiveShareRepository2 = igLiveShareRepository;
        0qQ.A0B(igLiveShareRepository2, 9);
        IgLiveHeartbeatManager igLiveHeartbeatManager2 = igLiveHeartbeatManager;
        IgLiveBroadcastInfoManager igLiveBroadcastInfoManager2 = igLiveBroadcastInfoManager;
        C51972G9s.A1F(igLiveBroadcastInfoManager2, igLiveHeartbeatManager2);
        LES les2 = les;
        LF6 lf62 = lf6;
        C51969G9p.A1P(les2, 12, lf62);
        this.A02 = userSession;
        this.A01 = r14;
        this.A07 = igLiveModerationRepository2;
        this.A0D = jVe2;
        this.A05 = igLiveCommentsRepository2;
        this.A06 = igLiveJoinRequestsRepository2;
        this.A08 = igLiveQuestionSubmissionsRepository2;
        this.A04 = igLiveBroadcastSettingsRepository2;
        this.A09 = igLiveShareRepository2;
        this.A0A = igLiveBroadcastInfoManager2;
        this.A0B = igLiveHeartbeatManager2;
        this.A0C = les2;
        this.A03 = m0x;
        this.A0I = lf62;
        this.A0J = z;
        this.A0G = z2;
        this.A0H = z3;
        1HR A0o = JTQ.A0o();
        this.A0E = A0o;
        this.A0F = 0u9.A04(A0o);
        JTS.A13(this, new C66169MGg(this, (AnonymousClass4D7) null, 9), jVe2.A00);
    }

    public static final void A00(C60292Jip jip, int i) {
        if (jip.A0J) {
            AnonymousClass7TE.A1Z(new C66184MGv(jip, (AnonymousClass4D7) null, i), C318116oQ.A00(jip));
        }
    }

    public final void A01() {
        String str;
        String str2;
        String str3;
        User user;
        LF6 lf6 = this.A0I;
        AnonymousClass0Ud r1 = this.A0A.A06;
        C61013JvD A0r = JTO.A0r(r1);
        if (A0r != null) {
            str = A0r.A08;
        } else {
            str = null;
        }
        C61013JvD A0r2 = JTO.A0r(r1);
        if (A0r2 == null || (user = A0r2.A05) == null) {
            str2 = null;
        } else {
            str2 = user.getId();
        }
        C61013JvD A0r3 = JTO.A0r(r1);
        if (A0r3 != null) {
            str3 = A0r3.A09;
        } else {
            str3 = null;
        }
        lf6.A01("add_moderator_impression", (String) null, str, str2, str3, "ufi_action_sheet");
    }

    public final void A02() {
        long j;
        Long A0n;
        M0X m0x = this.A03;
        0Aj A0d = C51969G9p.A0d(m0x.A0N, C273654mx.A00(2835));
        JTP.A1G(A0d);
        int A002 = M0X.A00(A0d, m0x);
        String str = m0x.A08;
        if (str == null || (A0n = 00y.A0n(A002, str)) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        JTQ.A10(A0d, j);
        M0X.A06(A0d, m0x, "container_module", m0x.A0O.getModuleName());
        A0d.Cgf();
        AnonymousClass7TE.A1Z(new C66169MGg(this, (AnonymousClass4D7) null, A002), C318116oQ.A00(this));
    }

    public final void A03() {
        long j;
        Long A0n;
        M0X m0x = this.A03;
        0Aj A0d = C51969G9p.A0d(m0x.A0N, C273654mx.A00(2836));
        JTP.A1G(A0d);
        int A002 = M0X.A00(A0d, m0x);
        String str = m0x.A08;
        if (str == null || (A0n = 00y.A0n(A002, str)) == null) {
            j = 0;
        } else {
            j = A0n.longValue();
        }
        JTQ.A10(A0d, j);
        M0X.A06(A0d, m0x, "container_module", m0x.A0O.getModuleName());
        A0d.Cgf();
        AnonymousClass7TE.A1Z(new C66169MGg(this, (AnonymousClass4D7) null, 11), C318116oQ.A00(this));
    }
}
