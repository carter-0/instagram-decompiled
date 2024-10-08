package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WVp  reason: case insensitive filesystem */
public final class C19348WVp implements C21052XBu {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ 0wc A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ Hashtag A04;

    public final void Di2(N3M n3m) {
    }

    public final boolean EtL(N3M n3m) {
        return false;
    }

    public C19348WVp(FragmentActivity fragmentActivity, AnonymousClass0iw r2, 0wc r3, UserSession userSession, Hashtag hashtag) {
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = r3;
        this.A04 = hashtag;
        this.A01 = r2;
    }

    public final void DKY(N3M n3m) {
        String str = n3m.A02;
        if (str == null || str.isEmpty()) {
            C13990Tnq.A0y(this.A00, this.A03);
            return;
        }
        String str2 = n3m.A05;
        if (!(str2 == null && n3m.A06 == null)) {
            1Ln A0G = 1Ln.A0G(this.A02);
            if (DbT.A1Y(A0G)) {
                C13989Tnp.A1J(A0G, n3m, str2);
                Hashtag hashtag = this.A04;
                if (hashtag.getId() != null) {
                    A0G.A0Q("hashtag_id", DbV.A0q(hashtag.getId()));
                    C13990Tnq.A13(A0G, hashtag);
                }
                A0G.Cgf();
            }
        }
        FragmentActivity fragmentActivity = this.A00;
        UserSession userSession = this.A03;
        AnonymousClass0iw r1 = this.A01;
        if (!FH7.A0B(fragmentActivity, userSession, str, r1.getModuleName())) {
            FHB.A04(fragmentActivity, userSession, 2EG.A1w, str, r1.getModuleName());
        }
    }
}
