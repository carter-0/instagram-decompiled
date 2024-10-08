package X;

import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import java.util.List;

/* renamed from: X.WYe  reason: case insensitive filesystem */
public final class C19411WYe implements X4I {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19411WYe(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void CvW(LeadGenFormBaseQuestion leadGenFormBaseQuestion, String str) {
        switch (this.A00) {
            case 0:
                boolean A1U = AnonymousClass7TF.A1U(0, leadGenFormBaseQuestion, str);
                C18077Vl6 vl6 = (C18077Vl6) this.A01;
                vl6.A05(leadGenFormBaseQuestion, str, false);
                C13990Tnq.A0R(vl6.A00).A04(leadGenFormBaseQuestion);
                List list = leadGenFormBaseQuestion.A0C;
                boolean z = true;
                if (list == null || list.contains(str) != A1U) {
                    z = false;
                }
                vl6.A06(!z);
                C14898UEa uEa = (C14898UEa) this.A02;
                IgdsBottomButtonLayout igdsBottomButtonLayout = uEa.A09;
                if (igdsBottomButtonLayout != null) {
                    igdsBottomButtonLayout.setVisibility(0);
                    igdsBottomButtonLayout.setPrimaryAction(DbS.A07(uEa).getString(2131964674), new WB2(4, (Object) vl6, z));
                    return;
                }
                return;
            case 1:
                boolean A1U2 = AnonymousClass7TF.A1U(0, leadGenFormBaseQuestion, str);
                ((C18077Vl6) this.A01).A05(leadGenFormBaseQuestion, str, false);
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                IgdsBottomButtonLayout igdsBottomButtonLayout2 = ((C14898UEa) this.A02).A09;
                if (igdsBottomButtonLayout2 != null) {
                    igdsBottomButtonLayout2.setPrimaryButtonEnabled(A1U2);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
