package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.6iW  reason: invalid class name and case insensitive filesystem */
public final class C314586iW {
    public final View A00;
    public final GradientSpinner A01;

    public C314586iW(View view) {
        View requireViewById = view.requireViewById(R.id.loading_overlay);
        0qQ.A07(requireViewById);
        this.A00 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.loading_overlay_spinner);
        0qQ.A07(requireViewById2);
        this.A01 = (GradientSpinner) requireViewById2;
    }
}
