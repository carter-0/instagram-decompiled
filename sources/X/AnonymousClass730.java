package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.emptystate.IgdsEmptyState;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.730  reason: invalid class name */
public final class AnonymousClass730 extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgdsEmptyState A02;
    public final SpinnerImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass730(View view) {
        super(view);
        0qQ.A0B(view, 1);
        View requireViewById = view.requireViewById(R.id.empty_state_view_loading_spinner);
        0qQ.A07(requireViewById);
        this.A03 = (SpinnerImageView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.empty_state_headline_component);
        0qQ.A07(requireViewById2);
        this.A02 = (IgdsEmptyState) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.empty_state_view_privacy_link);
        0qQ.A07(requireViewById3);
        this.A00 = (TextView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.empty_state_under_button_text);
        0qQ.A07(requireViewById4);
        this.A01 = (TextView) requireViewById4;
    }
}
