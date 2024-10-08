package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class IVL implements C74474PvU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public IVL(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A05 = obj5;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A04 = obj;
        this.A01 = obj4;
    }

    public final void DZL() {
        String AnX;
        String str;
        AFI_TYPE afi_type;
        if (this.A00 != 0) {
            1Xj r2 = (1Xj) this.A02;
            AnonymousClass3W1 r1 = (AnonymousClass3W1) this.A03;
            C52029GCb.A07((MediaControlEventSourceEnum) this.A01, r2, r1, (C52029GCb) this.A05);
            return;
        }
        C55822Ho5 ho5 = ((C55642Hl1) this.A05).A00;
        C230662pz r10 = ho5.A04;
        FragmentActivity fragmentActivity = ho5.A00;
        1Xj r8 = ho5.A01;
        C54077Gz1 gz1 = ho5.A03;
        AnonymousClass3DY r5 = ho5.A02;
        IntentAwareAdPivotState intentAwareAdPivotState = new IntentAwareAdPivotState();
        intentAwareAdPivotState.A02 = -2;
        List A002 = C230662pz.A00(gz1, r10);
        ArrayList A0r = AnonymousClass7TG.A0r(A002);
        Iterator it = A002.iterator();
        while (it.hasNext()) {
            String A0v = C51971G9r.A0v(it);
            if (A0v != null) {
                A0r.add(A0v);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C14005To7 to7 = new C14005To7();
        UserSession userSession = r10.A00;
        to7.A02(C55032Hb3.A00(userSession, intentAwareAdPivotState, gz1));
        C46424Del A003 = C49262Es5.A00("feed_contextual_ads_chain");
        A003.A06 = AnonymousClass000.A00(966);
        A003.A07 = fragmentActivity.getString(2131973898);
        A003.A0A = r10.A01.A01;
        A003.A09(AnonymousClass7TE.A1D(A0r));
        A003.A08 = r8.getId();
        A003.A08(to7);
        A003.A01 = C55031Hb2.A00(userSession, r8, intentAwareAdPivotState, r5, gz1);
        Dba.A12(A003.A07(), DbS.A0M(fragmentActivity, userSession));
        JR4 jr4 = (JR4) this.A02;
        C275524qU r12 = (C275524qU) this.A03;
        if (!"view_similar".equals("view_similar")) {
            return;
        }
        if (r12 == null || (AnX = r12.AnX()) == null) {
            throw AnonymousClass7TE.A0y();
        }
        IL3 il3 = (IL3) jr4;
        0Aj A0e = AnonymousClass7TE.A0e(il3.A00, "instagram_ads_feedback_interface_view_similar");
        if (A0e.isSampled()) {
            C57282IVr iVr = il3.A02;
            C53263GlB glB = iVr.A06;
            LinkedHashMap A004 = IL3.A00(iVr, false);
            IL3.A01(A0e, glB, il3);
            A0e.AAJ("afi_id", il3.A04);
            C53278GlQ glQ = glB.A01;
            if (glQ == null || (afi_type = glQ.A00) == null || (str = afi_type.A00) == null) {
                str = "";
            }
            C51971G9r.A19(A0e, C56194HuN.A00(A0e, glQ, iVr, str, A004), AnX);
            IL3.A02(A0e, il3, (long) iVr.A00);
            A0e.Cgf();
        }
    }

    public final void Di4() {
        if (this.A00 != 0) {
            ((C52029GCb) this.A05).A0b.DkW((1Xj) this.A02, (AnonymousClass3W1) this.A03, C54973Ha6.A00((Integer) this.A04), true, false);
            return;
        }
        C56653I6i.A03((JR4) this.A02, (C275524qU) this.A03, (C53278GlQ) this.A01);
    }

    public final void onDismiss() {
    }

    public final void onShow() {
        String AnX;
        String str;
        AFI_TYPE afi_type;
        if (this.A00 == 0) {
            JR4 jr4 = (JR4) this.A02;
            C275524qU r1 = (C275524qU) this.A03;
            if (!"view_similar".equals("view_similar")) {
                return;
            }
            if (r1 == null || (AnX = r1.AnX()) == null) {
                throw AnonymousClass7TE.A0y();
            }
            IL3 il3 = (IL3) jr4;
            0Aj A0e = AnonymousClass7TE.A0e(il3.A00, "instagram_ads_feedback_interface_view_similar_impression");
            if (A0e.isSampled()) {
                C57282IVr iVr = il3.A02;
                C53263GlB glB = iVr.A06;
                LinkedHashMap A002 = IL3.A00(iVr, false);
                IL3.A01(A0e, glB, il3);
                A0e.AAJ("afi_id", il3.A04);
                C53278GlQ glQ = glB.A01;
                if (glQ == null || (afi_type = glQ.A00) == null || (str = afi_type.A00) == null) {
                    str = "";
                }
                C51971G9r.A19(A0e, C56194HuN.A00(A0e, glQ, iVr, str, A002), AnX);
                IL3.A02(A0e, il3, (long) iVr.A00);
                A0e.Cgf();
            }
        }
    }
}
