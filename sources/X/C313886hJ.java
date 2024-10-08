package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionSubmissionsRepository;
import com.instagram.video.live.mvvm.model.repository.IgLiveQuestionsRepository;
import com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6hJ  reason: invalid class name and case insensitive filesystem */
public final class C313886hJ extends 2YL {
    public final 2Fk A00;
    public final AnonymousClass2Fj A01;
    public final AnonymousClass2Fj A02 = new 2Fk(C313896hK.A00);
    public final AnonymousClass2Fj A03 = new 2Fk();
    public final UserSession A04;
    public final C313666go A05;
    public final C313726gu A06;
    public final IgLiveQuestionSubmissionsRepository A07;
    public final IgLiveQuestionsRepository A08;
    public final IgLiveBroadcastInfoManager A09;
    public final 1a8 A0A = new 1a8(C318146oT.A01);
    public final C313876hI A0B;

    public C313886hJ(UserSession userSession, C313666go r7, C313726gu r8, C313876hI r9, IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository, IgLiveQuestionsRepository igLiveQuestionsRepository, IgLiveBroadcastInfoManager igLiveBroadcastInfoManager) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r7, 2);
        0qQ.A0B(igLiveBroadcastInfoManager, 3);
        0qQ.A0B(igLiveQuestionsRepository, 4);
        0qQ.A0B(igLiveQuestionSubmissionsRepository, 5);
        0qQ.A0B(r9, 6);
        this.A04 = userSession;
        this.A05 = r7;
        this.A09 = igLiveBroadcastInfoManager;
        this.A08 = igLiveQuestionsRepository;
        this.A07 = igLiveQuestionSubmissionsRepository;
        this.A0B = r9;
        this.A06 = r8;
        this.A00 = C226292g8.A00(19B.A00, AnonymousClass10H.A03(new AnonymousClass9KC(this, (AnonymousClass4D7) null, 3), igLiveQuestionSubmissionsRepository.A06, r9.A06));
        this.A01 = new 2Fk(C313916hM.A00);
    }

    public final void A03(C313546gc r21, String str) {
        C313546gc r4 = r21;
        0qQ.A0B(r4, 1);
        C313876hI r3 = this.A0B;
        String str2 = str;
        r3.A02 = str2;
        if (r3.A00 == null) {
            C19220WQa wQa = new C19220WQa(r3);
            WQZ wqz = new WQZ(r3);
            2IS r8 = new 2IS();
            2IS r7 = new 2IS();
            0Df A022 = GraphQlCallInput.A02.A02();
            0Df.A00(A022, str2, TraceFieldType.BroadcastId);
            r8.A00.A02().A0E(A022, "input");
            AnonymousClass2IY r1 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "LiveActiveQuestionSubscribe", r8.getParamsCopy(), r7.getParamsCopy(), C43025Bqp.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_active_question_event"), 0, (String) null, "xdt_live_active_question_event", new ArrayList());
            r3.A00 = 1vm.A01(r3.A03).A01(DF8.A00, new DFO(wQa, wqz), pandoGraphQLRequest);
        }
        C19252WRl wRl = new C19252WRl(new C19251WRk(r3), TimeUnit.MILLISECONDS);
        C18013Vjp vjp = new C18013Vjp(r4);
        r3.A01 = vjp;
        vjp.A01 = new C17293VPu(wRl);
    }

    public final void A05(String str, boolean z) {
        0qQ.A0B(str, 0);
        C318136oS A002 = C318116oQ.A00(this);
        1Eo.A05(19B.A00, new MEW(this, str, (AnonymousClass4D7) null, 16, z), A002);
    }

    public static final void A00(C313886hJ r6) {
        LGC lgc;
        AnonymousClass2Fj r5 = r6.A02;
        IgLiveQuestionsRepository igLiveQuestionsRepository = r6.A08;
        Long l = igLiveQuestionsRepository.A02;
        if (l != null) {
            lgc = (LGC) igLiveQuestionsRepository.A08.get(l);
        } else {
            lgc = null;
        }
        r5.A0B(new C62379Keq(lgc, igLiveQuestionsRepository.A08(), igLiveQuestionsRepository.A07()));
    }

    public static final void A01(C313886hJ r15, int i, long j, boolean z) {
        HashMap hashMap = r15.A08.A08;
        Long valueOf = Long.valueOf(j);
        LGC lgc = (LGC) hashMap.get(valueOf);
        if (lgc != null) {
            boolean z2 = z;
            if (z2 != lgc.A09) {
                long j2 = lgc.A01;
                User user = lgc.A04;
                ImageUrl imageUrl = lgc.A03;
                String str = lgc.A08;
                Long l = lgc.A07;
                lgc = new LGC(lgc.A02, imageUrl, user, lgc.A05, lgc.A06, l, str, lgc.A00 + i, j2, z2);
            }
            hashMap.put(valueOf, lgc);
        }
        A00(r15);
    }

    public final void A02() {
        IgLiveQuestionsRepository igLiveQuestionsRepository = this.A08;
        igLiveQuestionsRepository.A02 = null;
        0sn r0 = 0sn.A00;
        igLiveQuestionsRepository.A04 = r0;
        igLiveQuestionsRepository.A03 = r0;
        igLiveQuestionsRepository.A08.clear();
        igLiveQuestionsRepository.A01 = 0;
        igLiveQuestionsRepository.A00 = 0;
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = this.A07;
        AnonymousClass1EO r02 = igLiveQuestionSubmissionsRepository.A01;
        if (r02 != null) {
            r02.cancel();
        }
        igLiveQuestionSubmissionsRepository.A01 = null;
        igLiveQuestionSubmissionsRepository.A01();
        05G r3 = igLiveQuestionSubmissionsRepository.A05;
        r3.Epw(new AnonymousClass9I5(false, ((AnonymousClass9I5) r3.getValue()).A00, 2));
        igLiveQuestionSubmissionsRepository.A02 = null;
        C313876hI r2 = this.A0B;
        AnonymousClass1EO r03 = r2.A00;
        if (r03 != null) {
            r03.cancel();
            r2.A00 = null;
        }
        C18013Vjp vjp = r2.A01;
        if (vjp != null) {
            if (vjp.A00 != null) {
                vjp.A04.EqI((C17291VPs) null);
                vjp.A00 = null;
            }
            vjp.A05.clear();
            vjp.A03.removeCallbacksAndMessages((Object) null);
        }
        C18013Vjp vjp2 = r2.A01;
        if (vjp2 != null) {
            vjp2.A01 = null;
        }
        r2.A01 = null;
        r2.A05.Epw((Object) null);
        r2.A02 = null;
        this.A0A.A01();
    }

    public final void A04(String str) {
        IgLiveQuestionSubmissionsRepository igLiveQuestionSubmissionsRepository = this.A07;
        String str2 = str;
        igLiveQuestionSubmissionsRepository.A02 = str2;
        if (igLiveQuestionSubmissionsRepository.A01 == null) {
            AYB ayb = new AYB(igLiveQuestionSubmissionsRepository);
            2IS r6 = new 2IS();
            2IS r5 = new 2IS();
            0Df A022 = GraphQlCallInput.A02.A02();
            0Df.A00(A022, str2, TraceFieldType.BroadcastId);
            r6.A00.A02().A0E(A022, "input");
            AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "LiveQuestionSubmissionStatusSubscribe", r6.getParamsCopy(), r5.getParamsCopy(), C43034Bqy.class, false, PandoRealtimeInfoJNI.forSubscription("xdt_live_question_submission_status_event"), 0, (String) null, "xdt_live_question_submission_status_event", new ArrayList());
            igLiveQuestionSubmissionsRepository.A01 = 1vm.A01(igLiveQuestionSubmissionsRepository.A03).A01(C64393LbA.A00, new DFL(ayb), pandoGraphQLRequest);
        }
    }
}
