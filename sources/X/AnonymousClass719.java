package X;

import android.content.Context;
import com.instagram.api.schemas.SellerShoppableFeedType;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.719  reason: invalid class name */
public final class AnonymousClass719 implements C3250670x {
    public final Context A00;
    public final UserSession A01;
    public final User A02;
    public final boolean A03;
    public final C319866rM A04;
    public final C3250770y A05 = C3250770y.SHOP;

    public AnonymousClass719(Context context, UserSession userSession, C319866rM r4, User user, boolean z) {
        0qQ.A0B(r4, 2);
        this.A00 = context;
        this.A04 = r4;
        this.A02 = user;
        this.A01 = userSession;
        this.A03 = z;
    }

    public final String Air() {
        return A00(this, false);
    }

    public final String Aix() {
        return "shop";
    }

    public static final String A00(AnonymousClass719 r4, boolean z) {
        Context context;
        int i;
        User user = r4.A02;
        UserSession userSession = r4.A01;
        if (C324476zN.A0A(userSession, user) == AnonymousClass05K.A0N) {
            context = r4.A00;
            i = 2131952349;
        } else if (user.A0B() == SellerShoppableFeedType.A09) {
            context = r4.A00;
            i = 2131976644;
        } else if (!r4.A03) {
            return Eq9.A00(r4.A00, userSession, user, z);
        } else {
            context = r4.A00;
            i = 2131970069;
        }
        String string = context.getString(i);
        0qQ.A0A(string);
        return string;
    }

    public final C3250770y Aiv() {
        return this.A05;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        this.A04.Czd(this.A02, "button_tray");
    }
}
