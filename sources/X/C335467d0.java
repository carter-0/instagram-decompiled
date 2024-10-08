package X;

import android.view.View;
import androidx.fragment.app.Fragment;

/* renamed from: X.7d0  reason: invalid class name and case insensitive filesystem */
public final class C335467d0 implements View.OnClickListener {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C331127Pr A01;

    public C335467d0(Fragment fragment, C331127Pr r2) {
        this.A01 = r2;
        this.A00 = fragment;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-274280639);
        C273494mf r0 = this.A01.A0T;
        if (r0 != null) {
            if (!r0.isScrolledToTop()) {
                C227252iu r1 = this.A00;
                0qQ.A0C(r1, AnonymousClass000.A00(331));
                r1.EKl();
            }
            AnonymousClass0fD.A0C(1760856843, A05);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        AnonymousClass0fD.A0C(-1904366777, A05);
        throw illegalStateException;
    }
}
