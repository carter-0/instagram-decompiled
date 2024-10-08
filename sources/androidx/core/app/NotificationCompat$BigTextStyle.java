package androidx.core.app;

import X.AA2;
import X.AnonymousClass9T8;
import android.os.Bundle;

public final class NotificationCompat$BigTextStyle extends AA2 {
    public CharSequence A00;

    public final void A01(Bundle bundle) {
        super.A01(bundle);
        bundle.remove("android.bigText");
    }

    public final void A05(Bundle bundle) {
        super.A05(bundle);
        this.A00 = bundle.getCharSequence("android.bigText");
    }

    public final void A07(CharSequence charSequence) {
        this.A00 = AnonymousClass9T8.A00(charSequence);
    }
}
