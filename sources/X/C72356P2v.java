package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* renamed from: X.P2v  reason: case insensitive filesystem */
public final class C72356P2v implements C74394PuA {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass07i A02;
    public final AnonymousClass0iw A03;
    public final 0wc A04;
    public final UserSession A05;
    public final C66965Mfy A06;
    public final N4P A07;
    public final G87 A08;
    public final Capabilities A09;

    public C72356P2v(Context context, FragmentActivity fragmentActivity, AnonymousClass07i r4, AnonymousClass0iw r5, 0wc r6, UserSession userSession, Capabilities capabilities, C66965Mfy mfy, N4P n4p, G87 g87) {
        0qQ.A0B(userSession, 3);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A05 = userSession;
        this.A07 = n4p;
        this.A09 = capabilities;
        this.A04 = r6;
        this.A02 = r4;
        this.A08 = g87;
        this.A06 = mfy;
        this.A03 = r5;
    }

    public final List getItems() {
        Context context = this.A00;
        C68303N9q n9q = (C68303N9q) AnonymousClass7TE.A13(JTO.A15(this.A07.A0c));
        0qQ.A0B(n9q, 1);
        int i = 2131972302;
        if (n9q.A00.isRestricted()) {
            i = 2131975971;
        }
        C50989Fmc fmc = new C50989Fmc(context, (View.OnClickListener) new C71395Oju(this, 25), (CharSequence) AnonymousClass7TE.A16(context, i));
        fmc.A03 = R.drawable.instagram_restrict_pano_outline_24;
        return AnonymousClass7TE.A1I(fmc);
    }

    public final boolean isEnabled() {
        C68303N9q n9q;
        N4P n4p = this.A07;
        if (N4P.A05(n4p) || (n9q = (C68303N9q) 00k.A0N(JTO.A15(n4p.A0c))) == null || !C69952Nus.A00(this.A05, this.A09, n4p, n9q)) {
            return false;
        }
        return true;
    }
}
