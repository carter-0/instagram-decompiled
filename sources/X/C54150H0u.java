package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;

/* renamed from: X.H0u  reason: case insensitive filesystem */
public final class C54150H0u extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "CreatorAiPreparationFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);
    public final AnonymousClass0eM A02;

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        r2.Eu4(false);
        r2.setTitle("");
    }

    public final String getModuleName() {
        return "creator_ai_preparation_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        H2Y h2y = (H2Y) this.A02.getValue();
        CreatorAIAgentCreationRepository creatorAIAgentCreationRepository = h2y.A00;
        if (creatorAIAgentCreationRepository.A00 == null) {
            1vn r2 = creatorAIAgentCreationRepository.A04;
            1Ef freshCacheAgeMs = new PandoGraphQLRequest(C41845B3m.A05(), "CreatorAIAgentCreationProgressLiveQuery", C41845B3m.A04().getParamsCopy(), C41845B3m.A04().getParamsCopy(), C42589Bf9.class, false, PandoRealtimeInfoJNI.forLiveQuery("ig_creator_ai_import_progress"), 0, (String) null, "me", AnonymousClass7TE.A1C()).setMaxToleratedCacheAgeMs(0).setFreshCacheAgeMs(0);
            creatorAIAgentCreationRepository.A00 = r2.A01(new C64394LbB(creatorAIAgentCreationRepository, 13), new C45926DFg(creatorAIAgentCreationRepository, 4), freshCacheAgeMs);
        }
        C318136oS A002 = C318116oQ.A00(h2y);
        C58102ImO imO = new C58102ImO(h2y, (AnonymousClass4D7) null, 28);
        19B r1 = 19B.A00;
        1Eo.A05(r1, imO, A002);
        07U r8 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        1Eo.A05(r1, new C66171MGi(viewLifecycleOwner, r8, this, (AnonymousClass4D7) null, 16), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(C54150H0u h0u) {
        C52369GPq gPq = (C52369GPq) h0u.A00.getValue();
        C52369GPq.A02(C54688HOt.A0c, gPq, gPq.A00);
        1pC A002 = C69997Nvb.A00();
        Context requireContext = h0u.requireContext();
        h0u.A01.getValue();
        A002.A00(requireContext, h0u, "all");
        DbX.A1I(h0u);
        CreatorAIAgentCreationRepository creatorAIAgentCreationRepository = ((H2Y) h0u.A02.getValue()).A00;
        AnonymousClass7TE.A1Z(new C66162MFz(creatorAIAgentCreationRepository, (AnonymousClass4D7) null, 11), creatorAIAgentCreationRepository.A01);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public C54150H0u() {
        C58702IwB A012 = C58702IwB.A01(this, 11);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, C58702IwB.A01(C58702IwB.A01(this, 8), 9));
        this.A02 = DbS.A0I(C58702IwB.A01(A002, 10), A012, new C58689Ivy(19, A002, (Object) null), DbS.A0z(H2Y.class));
        this.A00 = C58702IwB.A00(this, 7);
    }

    public final boolean onBackPressed() {
        A00(this);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-763007193);
        ComposeView A0H = DbV.A0H(this, C59342JFu.A00(this, 32), 1570215955);
        AnonymousClass0fD.A09(406503956, A022);
        return A0H;
    }
}
