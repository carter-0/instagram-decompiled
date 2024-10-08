package X;

import android.os.Bundle;

/* renamed from: X.El7  reason: case insensitive filesystem */
public abstract class C48845El7 {
    public static final EV0 A00(Bundle bundle) {
        String string = bundle.getString("InterestBasedChannelType");
        if (string != null) {
            return EV0.valueOf(string);
        }
        throw AnonymousClass7TE.A0y();
    }
}
