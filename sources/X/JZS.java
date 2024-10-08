package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

public final class JZS {
    public C60004JdD A00;
    public final View A01;
    public final AnonymousClass0eM A02 = AnonymousClass1YB.A00(new C73927Pm7(this, 12));
    public final AnonymousClass0eM A03 = AnonymousClass1YB.A00(new C73927Pm7(this, 14));
    public final AnonymousClass0eM A04 = AnonymousClass1YB.A00(new C73927Pm7(this, 15));
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C73927Pm7(this, 16));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C73927Pm7(this, 17));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C73927Pm7(this, 18));
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(new C73927Pm7(this, 13));

    public JZS(View view) {
        0qQ.A0B(view, 1);
        View A0V = JTR.A0V(view, R.id.iglive_error_viewstub);
        0qQ.A07(A0V);
        this.A01 = A0V;
        A00().setGradientColors((int) R.style.ViewerLoadingGradientStyle);
    }

    public final GradientSpinner A00() {
        return (GradientSpinner) AnonymousClass7TE.A14(this.A08);
    }
}
