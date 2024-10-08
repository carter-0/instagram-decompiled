package X;

import android.content.Context;
import com.instagram.user.model.User;

public final class DcH implements C3250670x {
    public final Context A00;
    public final C319866rM A01;
    public final C3250770y A02 = C3250770y.A0A;
    public final User A03;

    public DcH(Context context, C319866rM r3, User user) {
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = user;
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        return AnonymousClass7TE.A16(this.A00, 2131961566);
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
        this.A01.CzO(this.A03, "button_tray");
    }
}
