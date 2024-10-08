package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.related.model.RelatedItem;
import com.instagram.model.hashtag.HashtagImpl;

/* renamed from: X.Vgi  reason: case insensitive filesystem */
public final class C17829Vgi {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;

    public C17829Vgi(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        this.A01 = r3;
        this.A00 = fragmentActivity;
    }

    public final void A00(RelatedItem relatedItem) {
        C309516Yo r4;
        Fragment CrC;
        int intValue = relatedItem.A00().intValue();
        if (intValue != 0) {
            if (intValue == 1) {
                1Wr r0 = 1Wr.A00;
                if (r0 != null) {
                    CrC = r0.getFragmentFactory().CrC(relatedItem.A03);
                    r4 = new C309516Yo(this.A00, this.A02);
                } else {
                    return;
                }
            } else if (intValue == 2) {
                FragmentActivity fragmentActivity = this.A00;
                UserSession userSession = this.A02;
                r4 = new C309516Yo(fragmentActivity, userSession);
                1a1 A022 = C46447Df9.A02();
                String str = relatedItem.A05;
                0qQ.A07(str);
                CrC = A022.A02(userSession, C46548Dgp.A02(userSession, str, "related_user", this.A01.getModuleName()).A04());
            } else {
                return;
            }
            r4.A0D(CrC);
        } else {
            FragmentActivity fragmentActivity2 = this.A00;
            UserSession userSession2 = this.A02;
            r4 = new C309516Yo(fragmentActivity2, userSession2);
            String str2 = relatedItem.A05;
            0qQ.A07(str2);
            HashtagImpl A002 = C281965Ag.A00(str2);
            String moduleName = this.A01.getModuleName();
            String A003 = AnonymousClass000.A00(3872);
            Fragment A012 = W0l.A01(userSession2);
            A012.setArguments(W0l.A00(A002, moduleName, A003));
            r4.A0D(A012);
            r4.A0B = "related_hashtag";
        }
        r4.A04();
    }
}
