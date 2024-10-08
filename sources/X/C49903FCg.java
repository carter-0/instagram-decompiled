package X;

import android.os.Bundle;

/* renamed from: X.FCg  reason: case insensitive filesystem */
public final class C49903FCg {
    public static final /* synthetic */ C49903FCg A00 = new Object();

    public static final void A00(Bundle bundle, C51946G8p g8p) {
        String BVX = g8p.BVX();
        boolean equals = BVX.equals("screen_query");
        if (equals || BVX.equals("legacy_screen")) {
            bundle.putString("__nav_data_type", BVX);
            if (!equals) {
                if (BVX.equals("legacy_screen")) {
                    C46645DiQ.A02(bundle, (C46645DiQ) g8p, false);
                    return;
                }
                throw DbZ.A0Z(BVX);
            } else if (g8p instanceof C18972WEz) {
                ((C18972WEz) g8p).A00(bundle, false);
            } else {
                throw DbT.A0m();
            }
        } else {
            throw DbW.A0c("No bundler found to write navigation data of type: ", BVX);
        }
    }
}
