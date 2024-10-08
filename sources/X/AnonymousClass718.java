package X;

import android.content.Context;
import com.instagram.user.model.User;

/* renamed from: X.718  reason: invalid class name */
public final class AnonymousClass718 implements C3250670x {
    public final Context A00;
    public final AnonymousClass710 A01;
    public final C3250770y A02 = C3250770y.EDIT_PROFILE;
    public final User A03;

    public AnonymousClass718(Context context, AnonymousClass710 r3, User user) {
        0qQ.A0B(r3, 2);
        this.A00 = context;
        this.A01 = r3;
        this.A03 = user;
    }

    public final String Aix() {
        return "generic";
    }

    public final String Air() {
        String string = this.A00.getString(2131961474);
        0qQ.A07(string);
        return string;
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
        String str;
        AnonymousClass710 r1 = this.A01;
        if (this.A03.CPm()) {
            str = "profile_header_button";
        } else {
            str = null;
        }
        r1.D2R(str);
    }
}
