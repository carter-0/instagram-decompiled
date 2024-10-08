package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.MxM  reason: case insensitive filesystem */
public final class C67936MxM extends C249703kE {
    public final View A00;
    public final IgTextView A01;

    public C67936MxM(View view) {
        super(view);
        this.A00 = view;
        IgTextView requireViewById = view.requireViewById(R.id.text_view);
        IgTextView igTextView = requireViewById;
        DbT.A1H(igTextView);
        0qQ.A07(requireViewById);
        this.A01 = igTextView;
    }
}
