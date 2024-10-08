package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P2g  reason: case insensitive filesystem */
public final class C72341P2g implements C74394PuA {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final Context A02;
    public final N4P A03;
    public final boolean A04;

    public C72341P2g(Context context, FragmentActivity fragmentActivity, UserSession userSession, N4P n4p, boolean z) {
        0qQ.A0B(userSession, 2);
        this.A02 = context;
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = n4p;
        this.A04 = z;
    }

    public final List getItems() {
        boolean z = this.A04;
        Context context = this.A02;
        return AnonymousClass7TE.A1I(new JV5(13, (Object) new C46685DjE(AnonymousClass7TE.A16(context, 2131963542), this, 0), (Object) new C46685DjE(AnonymousClass7TE.A16(context, 2131963726), this, 0), z));
    }

    public final boolean isEnabled() {
        N4P n4p = this.A03;
        if (!n4p.A0v || !N4P.A05(n4p)) {
            return false;
        }
        return true;
    }
}
