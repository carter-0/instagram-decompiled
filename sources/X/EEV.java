package X;

import android.app.Activity;
import com.instagram.simplewebview.SimpleWebViewActivity;

public final class EEV extends 0wY {
    public final /* synthetic */ FZ1 A00;

    public EEV(FZ1 fz1) {
        this.A00 = fz1;
    }

    public final void Ctf(Activity activity) {
        FZ1 fz1 = this.A00;
        if (fz1.A04 && (activity instanceof SimpleWebViewActivity)) {
            fz1.A01();
        }
    }

    public final void Cth(Activity activity) {
        this.A00.A03 = false;
    }

    public final void Ctm(Activity activity) {
        this.A00.A03 = true;
    }
}
