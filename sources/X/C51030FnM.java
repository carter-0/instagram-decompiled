package X;

import com.instagram.user.model.User;

/* renamed from: X.FnM  reason: case insensitive filesystem */
public final class C51030FnM implements G7P {
    public final /* synthetic */ FV7 A00;

    public final void Dc5(User user, boolean z) {
    }

    public C51030FnM(FV7 fv7) {
        this.A00 = fv7;
    }

    public final void Dc4() {
        String str;
        FV7 fv7 = this.A00;
        if (fv7.A0C.A1w()) {
            str = "hide_story";
        } else {
            str = "unhide_story";
        }
        FV7.A01(fv7, str);
    }
}
