package X;

import android.view.ViewStub;
import com.facebook.litho.LithoView;

/* renamed from: X.3TY  reason: invalid class name */
public final class AnonymousClass3TY implements AnonymousClass2xU {
    public ViewStub A00;
    public LithoView A01;
    public AnonymousClass3W1 A02;

    public final void DQp(AnonymousClass3W1 r4, int i) {
        LithoView lithoView;
        boolean z;
        0qQ.A0B(r4, 0);
        if (r4.equals(this.A02) && (lithoView = this.A01) != null) {
            int i2 = 8;
            if (i == 10) {
                z = r4.A1z;
            } else if (i == 58) {
                z = r4.A20;
            } else {
                return;
            }
            if (!z) {
                i2 = 0;
            }
            lithoView.setVisibility(i2);
        }
    }
}
