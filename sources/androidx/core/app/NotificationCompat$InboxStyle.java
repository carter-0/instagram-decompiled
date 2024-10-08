package androidx.core.app;

import X.AA2;
import X.AnonymousClass7TE;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;

public final class NotificationCompat$InboxStyle extends AA2 {
    public ArrayList A00 = AnonymousClass7TE.A1C();

    public final void A01(Bundle bundle) {
        super.A01(bundle);
        bundle.remove("android.textLines");
    }

    public final void A05(Bundle bundle) {
        super.A05(bundle);
        ArrayList arrayList = this.A00;
        arrayList.clear();
        if (bundle.containsKey("android.textLines")) {
            Collections.addAll(arrayList, bundle.getCharSequenceArray("android.textLines"));
        }
    }
}
