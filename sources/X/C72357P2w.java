package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.P2w  reason: case insensitive filesystem */
public final class C72357P2w implements C74394PuA {
    public static final C70732OIp A05 = new Object();
    public final Context A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final String A03;
    public final N4P A04;

    public C72357P2w(Context context, FragmentActivity fragmentActivity, UserSession userSession, N4P n4p, String str) {
        0qQ.A0B(userSession, 4);
        this.A00 = context;
        this.A01 = fragmentActivity;
        this.A04 = n4p;
        this.A02 = userSession;
        this.A03 = str;
    }

    public final List getItems() {
        C50989Fmc fmc = new C50989Fmc((Context) this.A01, (View.OnClickListener) new FP8((Object) this, 34), (CharSequence) this.A00.getString(2131951989));
        fmc.A03 = R.drawable.instagram_info_pano_outline_24;
        return AnonymousClass7TE.A1I(fmc);
    }

    public final boolean isEnabled() {
        return A05.A00(this.A02, this.A04, true);
    }
}
