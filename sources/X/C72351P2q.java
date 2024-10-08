package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* renamed from: X.P2q  reason: case insensitive filesystem */
public final class C72351P2q implements C74394PuA {
    public final FragmentActivity A00;
    public final AnonymousClass0iw A01;
    public final 0wc A02;
    public final UserSession A03;
    public final Capabilities A04;
    public final N4P A05;
    public final Context A06;

    public C72351P2q(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r4, 0wc r5, UserSession userSession, Capabilities capabilities, N4P n4p) {
        0qQ.A0B(userSession, 3);
        this.A06 = context;
        this.A00 = fragmentActivity;
        this.A03 = userSession;
        this.A05 = n4p;
        this.A04 = capabilities;
        this.A01 = r4;
        this.A02 = r5;
    }

    public final List getItems() {
        C50989Fmc fmc = new C50989Fmc(this.A06, new C71395Oju(this, 23), 2131972171, 2Yu.A03(this.A00));
        fmc.A0B = true;
        fmc.A03 = R.drawable.instagram_report_pano_outline_24;
        return AnonymousClass7TE.A1I(fmc);
    }

    public final boolean isEnabled() {
        N4P n4p = this.A05;
        if (!n4p.A0v || !N4P.A05(n4p) || !this.A04.A00(C376179Gx.BLOCK)) {
            return false;
        }
        return true;
    }
}
