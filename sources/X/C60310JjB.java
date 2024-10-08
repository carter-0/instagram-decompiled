package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.realtimeclient.requeststream.SubscriptionHandler;
import com.instagram.video.live.mvvm.model.repository.IgLiveCommentsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveViewerJoinFlowRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveHeartbeatManager;
import com.instagram.video.live.mvvm.viewmodel.state.IgLiveViewerStateViewModel$1;
import java.util.concurrent.CancellationException;

/* renamed from: X.JjB  reason: case insensitive filesystem */
public final class C60310JjB extends 2YL {
    public C262204Co A00;
    public C262204Co A01;
    public C262204Co A02;
    public boolean A03;
    public final UserSession A04;
    public final 1Av A05;
    public final C313716gt A06;
    public final IgLiveCommentsRepository A07;
    public final C63921LDa A08;
    public final L8Y A09;
    public final L5P A0A;
    public final IgLiveViewerJoinFlowRepository A0B;
    public final L5Q A0C;
    public final IgLiveBroadcastInfoManager A0D;
    public final C313816h4 A0E;
    public final IgLiveHeartbeatManager A0F;
    public final LES A0G;
    public final C59720JVe A0H;
    public final 0V2 A0I;
    public final 05G A0J;
    public final C61770pa A0K;

    public static final void A00(C313556gd r20, C60310JjB jjB, Boolean bool, String str, String str2, String str3, boolean z) {
        C60310JjB jjB2 = jjB;
        if (!jjB2.A03 && JTR.A1a(jjB2.A08.A02)) {
            if (bool != null) {
                AnonymousClass7TF.A1O(jjB2.A0G.A0H, bool.booleanValue());
            }
            String str4 = str;
            boolean z2 = z;
            if (str != null) {
                AnonymousClass7TE.A1Z(new MEl(jjB2, str4, str2, str3, (AnonymousClass4D7) null, 1, z2), C318116oQ.A00(jjB2));
                L8Y l8y = jjB2.A09;
                if (l8y.A00 == null) {
                    2IS A042 = C41845B3m.A04();
                    l8y.A00 = 1vm.A01(l8y.A01).A01((2Kw) null, new C64397LbE(l8y, 19), new PandoGraphQLRequest(C41847B3o.A04(C41845B3m.A03(GraphQlCallInput.A02, str4, TraceFieldType.BroadcastId), A042, "input"), "LiveBadgeSettingSubsribe", A042.getParamsCopy(), C41845B3m.A04().getParamsCopy(), C43027Bqr.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_badge_setting_subscribe"), 0, (String) null, "xdt_live_badge_setting_subscribe", AnonymousClass7TE.A1C()));
                }
            }
            jjB2.A0E.A00 = r20;
            if (z) {
                jjB2.A01 = JTQ.A0n(jjB2.A01);
            }
            if (jjB2.A01 == null) {
                jjB2.A01 = C51966G9m.A1L(new MGB(jjB2, (AnonymousClass4D7) null, 15, z2), C318116oQ.A00(jjB2));
            }
            AnonymousClass7TF.A1O(jjB2.A0J, true);
            182.A06(0Tu.A05, jjB2.A04, 36318883407338036L);
        }
    }

    public static final boolean A02(C60310JjB jjB) {
        C277794vk r1;
        C61013JvD A0Q = JTQ.A0Q(jjB.A0D);
        boolean z = false;
        if (A0Q == null) {
            return false;
        }
        C277954w0 r12 = A0Q.A03;
        if (!(r12 == null || (r1 = r12.A05) == null || !r1.CPf())) {
            z = true;
        }
        boolean z2 = A0Q.A0M;
        if (!z || z2) {
            return false;
        }
        return true;
    }

    public final void A03(String str) {
        String str2;
        C262204Co r0 = this.A02;
        if (r0 != null) {
            r0.AG7((CancellationException) null);
        }
        C61013JvD A0Q = JTQ.A0Q(this.A0D);
        if (A0Q != null) {
            str2 = A0Q.A08;
        } else {
            str2 = null;
        }
        if (0qQ.A0K(str, str2)) {
            DbX.A1W(this, str, C318116oQ.A00(this), 40);
            this.A0J.Epw(false);
            C262204Co r02 = this.A01;
            if (r02 != null) {
                r02.AG7((CancellationException) null);
            }
            this.A01 = null;
            this.A0F.A00.Epw((Object) null);
            A01(this, false);
            this.A07.A0I();
            LES les = this.A0G;
            les.A0U.Epw(C62515Kh5.UNKNOWN);
            les.A0T.Epw(C62491Kgh.NORMAL);
            les.A06.Epw(C62635Kj6.UNKNOWN);
            les.A0G.Epw(false);
            05G r5 = les.A0K;
            C313666go r7 = les.A03;
            boolean z = true;
            AnonymousClass7TF.A1O(r5, C51969G9p.A1a(r7, C313666go.BROADCASTER));
            les.A0H.Epw(false);
            05G r52 = les.A0J;
            if (r7 != C313666go.GUEST) {
                z = false;
            }
            AnonymousClass7TF.A1O(r52, z);
            les.A0O.Epw(false);
            05G r03 = les.A0A;
            0sl r53 = 0sl.A00;
            r03.Epw(r53);
            les.A05.Epw(r53);
            les.A0N.Epw(false);
            les.A0M.Epw(false);
            JTP.A1W(les.A07, 0);
            les.A0E.Epw(false);
            les.A0L.Epw(false);
            les.A0P.Epw(false);
            les.A0C.Epw(false);
            les.A0Q.Epw(false);
            les.A08.Epw(false);
            les.A0F.Epw(false);
            les.A09.Epw(false);
            les.A0D.Epw(false);
            this.A0C.A00.Epw(false);
            L8Y l8y = this.A09;
            AnonymousClass1EO r04 = l8y.A00;
            if (r04 != null) {
                r04.cancel();
            }
            l8y.A00 = null;
            l8y.A02.Epw((Object) null);
            this.A0A.A00.Epw(C62521KhC.A04);
            C63921LDa lDa = this.A08;
            C250973mM r05 = lDa.A00;
            if (r05 != null) {
                r05.A0C = false;
            }
            lDa.A00 = null;
            lDa.A01.Epw(false);
        }
    }

    public /* synthetic */ C60310JjB(UserSession userSession, C313716gt r9, IgLiveCommentsRepository igLiveCommentsRepository, C63921LDa lDa, L8Y l8y, L5P l5p, IgLiveViewerJoinFlowRepository igLiveViewerJoinFlowRepository, L5Q l5q, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager, C313816h4 r17, IgLiveHeartbeatManager igLiveHeartbeatManager, LES les, C59720JVe jVe) {
        1Av A002 = 1Au.A00(userSession);
        0qQ.A0B(userSession, 1);
        IgLiveHeartbeatManager igLiveHeartbeatManager2 = igLiveHeartbeatManager;
        LES les2 = les;
        C313816h4 r6 = r17;
        IgLiveBroadcastInfoManager igLiveBroadcastInfoManager2 = igLiveBroadcastInfoManager;
        C51974G9v.A1S(igLiveBroadcastInfoManager2, r6, igLiveCommentsRepository, igLiveHeartbeatManager2, les2);
        C59720JVe jVe2 = jVe;
        C51974G9v.A1Q(l5q, l8y, igLiveViewerJoinFlowRepository, jVe2);
        C51974G9v.A1R(l5p, lDa, r9, A002);
        this.A04 = userSession;
        this.A0D = igLiveBroadcastInfoManager2;
        this.A0E = r6;
        this.A07 = igLiveCommentsRepository;
        this.A0F = igLiveHeartbeatManager2;
        this.A0G = les2;
        this.A0C = l5q;
        this.A09 = l8y;
        this.A0B = igLiveViewerJoinFlowRepository;
        this.A0H = jVe2;
        this.A0A = l5p;
        this.A08 = lDa;
        this.A06 = r9;
        this.A05 = A002;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 1, 0);
        this.A0I = A012;
        this.A0K = new 0V1((C262204Co) null, A012);
        02z A10 = C51970G9q.A10(false);
        this.A0J = A10;
        AnonymousClass0Ud r3 = igLiveBroadcastInfoManager2.A06;
        JTR.A1H(this, new IgLiveViewerStateViewModel$1(this, (AnonymousClass4D7) null), A10, r3, les2.A0V);
        JTR.A1G(this, new C66192MHi((Object) this, (AnonymousClass4D7) null, 16), r3, igLiveHeartbeatManager2.A08);
    }

    public static final void A01(C60310JjB jjB, boolean z) {
        if (!A02(jjB)) {
            jjB.A00 = JTQ.A0n(jjB.A00);
        } else if (!z) {
            IgLiveCommentsRepository igLiveCommentsRepository = jjB.A07;
            SubscriptionHandler subscriptionHandler = igLiveCommentsRepository.A06;
            if (subscriptionHandler != null) {
                subscriptionHandler.cancel();
            }
            igLiveCommentsRepository.A06 = null;
            SubscriptionHandler subscriptionHandler2 = igLiveCommentsRepository.A05;
            if (subscriptionHandler2 != null) {
                subscriptionHandler2.cancel();
            }
            igLiveCommentsRepository.A05 = null;
        }
    }
}
