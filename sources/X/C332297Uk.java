package X;

import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Uk  reason: invalid class name and case insensitive filesystem */
public final class C332297Uk implements C332307Ul {
    public RecyclerView A00;
    public C330577Nj A01;
    public C330617Nn A02;
    public final AnonymousClass4DH A03;
    public final UserSession A04;
    public final C62320sa A05;

    public C332297Uk(AnonymousClass4DH r2, UserSession userSession, C62320sa r4) {
        0qQ.A0B(r2, 1);
        0qQ.A0B(r4, 3);
        this.A03 = r2;
        this.A04 = userSession;
        this.A05 = r4;
    }

    public final void Ewv(AnonymousClass7EF r6, MessageIdentifier messageIdentifier, String str) {
        C330617Nn r1;
        String str2;
        AnonymousClass7ZY BSN = ((C333517Zg) this.A05.invoke()).BSN();
        String str3 = null;
        if (messageIdentifier != null && ((str3 = messageIdentifier.A00()) == null || str3.length() <= 0 || str3.equals("null"))) {
            str3 = messageIdentifier.A01;
        }
        int CMC = BSN.CMC(str3);
        if (CMC != -1) {
            RecyclerView recyclerView = this.A00;
            if (recyclerView == null) {
                str2 = "messageRecyclerView";
            } else {
                C249703kE A0W = recyclerView.A0W(CMC);
                if ((A0W instanceof AnonymousClass7Pe) && (r1 = this.A02) != null) {
                    AnonymousClass7EF Bjp = ((AnonymousClass7Pe) A0W).Bjp();
                    r1.setVisibility(0);
                    C17345VRy vRy = new C17345VRy(20, A2U.A00);
                    C330577Nj r12 = this.A01;
                    if (r12 == null) {
                        str2 = "emitterAnimationCanvasRenderer";
                    } else {
                        C395139zH.A00(r12, vRy, new WVW(r6, Bjp, this), str);
                        return;
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str2);
            throw AnonymousClass00P.createAndThrow();
        }
    }
}
