package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import java.util.List;

/* renamed from: X.P2t  reason: case insensitive filesystem */
public final class C72354P2t implements C74394PuA {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final N4P A04;
    public final boolean A05;
    public final 1a8 A06;
    public final Capabilities A07;

    public C72354P2t(Context context, FragmentActivity fragmentActivity, AnonymousClass0iw r4, 1a8 r5, UserSession userSession, Capabilities capabilities, N4P n4p, boolean z) {
        AnonymousClass7TF.A1G(userSession, 3, r5);
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = userSession;
        this.A04 = n4p;
        this.A07 = capabilities;
        this.A05 = z;
        this.A02 = r4;
        this.A06 = r5;
    }

    public final List getItems() {
        C50989Fmc fmc = new C50989Fmc(this.A00, new C71395Oju(this, 24), 2131972171, 2Yu.A03(this.A01));
        fmc.A0B = true;
        fmc.A03 = R.drawable.instagram_report_pano_outline_24;
        return AnonymousClass7TE.A1I(fmc);
    }

    public final boolean isEnabled() {
        return C69951Nur.A00(this.A03, this.A07, this.A04);
    }
}
