package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6pR  reason: invalid class name and case insensitive filesystem */
public final class C318736pR implements C3250670x {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass711 A02;
    public final C3250770y A03 = C3250770y.MESSAGE;
    public final User A04;
    public final boolean A05;

    public C318736pR(Context context, UserSession userSession, AnonymousClass711 r4, User user, boolean z) {
        0qQ.A0B(r4, 6);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = user;
        this.A05 = z;
        this.A02 = r4;
        r4.DRZ(z);
    }

    public final String Aix() {
        return "generic";
    }

    public final C3250770y Aiv() {
        return this.A03;
    }

    public final Integer BEK() {
        if (this.A05) {
            return Integer.valueOf(R.drawable.instagram_gen_ai_pano_filled_16);
        }
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        if (this.A05) {
            C52369GPq.A03(new C52369GPq(this.A01, (String) null), 00y.A0n(10, this.A04.getId()), "profile_stardust_message_icon_click");
        }
        this.A02.DRV("message_button", false);
    }

    public final String Air() {
        String string = this.A00.getString(2131970036);
        0qQ.A07(string);
        return string;
    }
}
