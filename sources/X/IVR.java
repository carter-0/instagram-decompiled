package X;

import android.content.Context;
import android.view.View;
import android.widget.PopupWindow;
import com.instagram.common.session.UserSession;
import com.instagram.creator.agent.onboarding.repository.CreatorAIAgentCreationRepository;
import com.instagram.explore.topiccluster.ExploreTopicCluster;

public final class IVR implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public IVR(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onButtonClick(View view) {
        C62320sa r0;
        Object obj;
        long j;
        String A2n;
        Long A10;
        switch (this.A00) {
            case 0:
                ((C7580QKv) this.A01).A05();
                return;
            case 1:
                C52369GPq.A01(C54688HOt.A0U, ((CreatorAIAgentCreationRepository) this.A02).A03);
                obj = this.A01;
                break;
            case 2:
                ((WW4) this.A02).A0M((ExploreTopicCluster) this.A01, false);
                return;
            case 3:
                I10.A00((I10) this.A01, AnonymousClass05K.A0u, AnonymousClass7TE.A1H());
                obj = this.A02;
                break;
            case 4:
                r0 = ((C70663OFk) this.A01).A03;
                if (r0 == null) {
                    return;
                }
                break;
            case 5:
                int intValue = ((C53571Gqm) this.A01).A03.intValue();
                if (intValue == 0) {
                    return;
                }
                if (intValue == 1) {
                    1Y8 A002 = C55115HcO.A00();
                    C227232is r02 = (C227232is) this.A02;
                    A002.A05(r02.requireActivity(), C227232is.A01(r02));
                    return;
                }
                throw AnonymousClass7TE.A1K();
            default:
                C227232is r3 = (C227232is) this.A02;
                UserSession A012 = C227232is.A01(r3);
                GBE gbe = r3.A09;
                if (gbe == null) {
                    0qQ.A0F("clipsViewerFragmentViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                C51979GAc gAc = gbe.A19;
                boolean A1Z = AnonymousClass7TG.A1Z(A012, gAc);
                1Xj r5 = ((C267324bN) this.A01).A02;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc, A012), "ig_creators_originality_dr_toast_click");
                if (A0e.isSampled()) {
                    DbS.A1O(A0e, gAc.getModuleName());
                    A0e.A9F("user_igid", DbV.A0q(A012.A06));
                    if (r5 == null || (A2n = r5.A2n()) == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    A0e.A9F("oc_clip_igid", Long.valueOf(j));
                    C51965G9l.A19(HO9.LEARN_MORE, A0e);
                    A0e.Cgf();
                }
                Context requireContext = r3.requireContext();
                UserSession A013 = C227232is.A01(r3);
                String A04 = 182.A04(C51965G9l.A0Z(A013, A1Z ? 1 : 0), A013, 36888653766591276L);
                2EG r1 = 2EG.A0q;
                if (A04.length() != 0) {
                    Dbb.A0k(requireContext, A013, r1, A04);
                    return;
                }
                return;
        }
        r0 = (C62320sa) obj;
        r0.invoke();
    }

    public final void onDismiss() {
        if (4 - this.A00 == 0) {
            ((PopupWindow) this.A02).dismiss();
        }
    }

    public final void onShow() {
        long j;
        String A2n;
        Long A10;
        switch (this.A00) {
            case 0:
                RRP rrp = (RRP) this.A02;
                if (rrp != null) {
                    rrp.A0I = "AUTOMATIC_AUTOFILL_TOAST_SHOWN";
                    C11265SHz A002 = rrp.A00();
                    C7580QKv qKv = (C7580QKv) this.A01;
                    SUR.A0A(qKv.A02(), qKv.A0b, A002);
                    return;
                }
                return;
            case 1:
                C52369GPq.A01(C54688HOt.A0T, ((CreatorAIAgentCreationRepository) this.A02).A03);
                return;
            case 6:
                C227232is r0 = (C227232is) this.A02;
                UserSession A012 = C227232is.A01(r0);
                GBE gbe = r0.A09;
                if (gbe == null) {
                    0qQ.A0F("clipsViewerFragmentViewModel");
                    throw AnonymousClass00P.createAndThrow();
                }
                C51979GAc gAc = gbe.A19;
                AnonymousClass7TG.A1N(A012, gAc);
                1Xj r3 = ((C267324bN) this.A01).A02;
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(gAc, A012), "ig_creators_originality_dr_toast_impression");
                if (A0e.isSampled()) {
                    DbS.A1O(A0e, gAc.getModuleName());
                    A0e.A9F("user_igid", DbV.A0q(A012.A06));
                    if (r3 == null || (A2n = r3.A2n()) == null || (A10 = AnonymousClass7TE.A10(A2n)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    A0e.A9F("oc_clip_igid", Long.valueOf(j));
                    A0e.Cgf();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final /* synthetic */ void onTextClick(View view) {
        if (2 - this.A00 == 0) {
            ((WW4) this.A02).A0J((ExploreTopicCluster) this.A01);
        }
    }
}
