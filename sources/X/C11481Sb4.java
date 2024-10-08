package X;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import com.facebook.browser.lite.chrome.container.IGWatchAndBrowseLiteChrome;

/* renamed from: X.Sb4  reason: case insensitive filesystem */
public final class C11481Sb4 implements View.OnClickListener {
    public long A00;
    public final int A01;
    public final Object A02;

    public C11481Sb4(Object obj, int i) {
        this.A01 = i;
        this.A02 = obj;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        if (this.A01 != 0) {
            A05 = AnonymousClass0fD.A05(1545538882);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - this.A00 > 1000) {
                this.A00 = elapsedRealtime;
                SRY.A00().A07((Bundle) this.A02, AnonymousClass7TF.A0w("action", "ACTION_OPEN_LINK_HISTORY"));
            }
            i = 277428813;
        } else {
            A05 = AnonymousClass0fD.A05(1953431527);
            long elapsedRealtime2 = SystemClock.elapsedRealtime();
            if (elapsedRealtime2 - this.A00 > 1000) {
                this.A00 = elapsedRealtime2;
                SRY.A00().A07(((IGWatchAndBrowseLiteChrome) this.A02).A01, AnonymousClass7TF.A0w("action", "ACTION_OPEN_LINK_HISTORY"));
            }
            i = -427319054;
        }
        AnonymousClass0fD.A0C(i, A05);
    }
}
