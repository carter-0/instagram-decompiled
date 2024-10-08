package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.FgJ  reason: case insensitive filesystem */
public final class C50658FgJ implements C3250670x {
    public final Context A00;
    public final C319866rM A01;
    public final C3250770y A02 = C3250770y.OTHER;
    public final User A03;

    public C50658FgJ(Context context, C319866rM r3, User user) {
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = user;
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        String str;
        User user = this.A03;
        String B4i = user.A03.B4i();
        C267544bj B4O = user.A03.B4O();
        if (B4O != null) {
            str = B4O.AqF();
        } else {
            str = null;
        }
        if (B4i != null && B4i.length() != 0) {
            return B4i;
        }
        if (str == null || str.length() == 0) {
            return AnonymousClass7TE.A16(this.A00, 2131953943);
        }
        return str;
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
        this.A01.CzK(this.A03, "button_tray");
    }
}
