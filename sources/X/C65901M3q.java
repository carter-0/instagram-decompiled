package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.M3q  reason: case insensitive filesystem */
public final class C65901M3q implements Runnable {
    public final /* synthetic */ C61868KPh A00;

    public C65901M3q(C61868KPh kPh) {
        this.A00 = kPh;
    }

    public final void run() {
        C61868KPh kPh = this.A00;
        View view = kPh.mView;
        if (view != null) {
            DbX.A1B(view, R.id.scrubber_spinner);
            View view2 = kPh.mView;
            0qQ.A0A(view2);
            JTR.A1D(view2, R.id.scrubber_content);
        }
    }
}
