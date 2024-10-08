package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.71B  reason: invalid class name */
public final class AnonymousClass71B implements C3250670x {
    public final Context A00;
    public final AnonymousClass710 A01;
    public final C3250770y A02 = C3250770y.SHARE_PROFILE;
    public final User A03;

    public AnonymousClass71B(Context context, AnonymousClass710 r3, User user) {
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = user;
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        String string = this.A00.getString(2131973504);
        0qQ.A07(string);
        return string;
    }

    public final C3250770y Aiv() {
        return this.A02;
    }

    public final /* synthetic */ Integer BEK() {
        return null;
    }

    public final boolean DP6() {
        return this.A01.DPN(this.A03);
    }

    public final void onClick() {
        this.A01.D39(this.A03);
    }
}
