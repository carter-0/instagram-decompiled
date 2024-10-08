package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class FEX {
    public static final C61046Jvk A06 = new C61046Jvk("INSTAGRAM_FAN_SUBS", 0);
    public final Context A00;
    public final 1a8 A01 = 1a8.A00();
    public final UserSession A02;
    public final 1X5 A03;
    public final C62010KVj A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C51798G2h(this, 37));

    public static final void A00(FragmentActivity fragmentActivity, C7610QOs qOs, FEX fex, C252683pV r11) {
        r11.FIG(C47865EKl.A00);
        fex.A01.A02(((T7R) fex.A05.getValue()).A00(fragmentActivity, A06), new C51138FpA(1, qOs, r11, fex, fragmentActivity));
    }

    public FEX(Context context, UserSession userSession, 1X5 r5, C62010KVj kVj) {
        AnonymousClass7TG.A1U(userSession, kVj, context);
        this.A02 = userSession;
        this.A04 = kVj;
        this.A00 = context;
        this.A03 = r5;
    }
}
