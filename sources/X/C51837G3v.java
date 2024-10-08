package X;

import android.content.Intent;

/* renamed from: X.G3v  reason: case insensitive filesystem */
public final class C51837G3v extends 0Yg implements 0sP {
    public static final C51837G3v A00 = new C51837G3v();

    public C51837G3v() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Intent intent = (Intent) obj;
        0qQ.A0B(intent, 0);
        String stringExtra = intent.getStringExtra(Dbe.A01());
        if (stringExtra != null) {
            return 002.A0R(C66579MXk.A00(884), stringExtra);
        }
        return "https://www.instagram.com/stories";
    }
}
