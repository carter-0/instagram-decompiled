package X;

import android.content.Context;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.user.model.User;

/* renamed from: X.FgQ  reason: case insensitive filesystem */
public final class C50665FgQ implements C3250670x, CallerContextable {
    public static final String __redex_internal_original_name = "ProfileActionWhatsAppButton";
    public final Context A00;
    public final C319866rM A01;
    public final C3250770y A02 = C3250770y.WHATSAPP;
    public final User A03;

    public C50665FgQ(Context context, C319866rM r3, User user) {
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = user;
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        User user = this.A03;
        if (user.A1d()) {
            this.A01.FKA(C50665FgQ.class, user.getId());
        }
        return AnonymousClass7TE.A16(this.A00, 2131976852);
    }

    public final C3250770y Aiv() {
        return this.A02;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final /* synthetic */ boolean DP6() {
        return false;
    }

    public final void onClick() {
        this.A01.CzS(this.A00, this.A03, "button_tray");
    }
}
