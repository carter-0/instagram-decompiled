package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.Ihx  reason: case insensitive filesystem */
public final class C57880Ihx implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C56042Hrp A01;

    public C57880Ihx(Fragment fragment, C56042Hrp hrp) {
        this.A01 = hrp;
        this.A00 = fragment;
    }

    public final void run() {
        boolean z;
        C56042Hrp hrp = this.A01;
        C331157Pu r0 = hrp.A03;
        if (r0 != null) {
            z = r0.A02.A1G;
        } else {
            z = false;
        }
        hrp.A00((View) null, this.A00, hrp.A07, z);
    }
}
