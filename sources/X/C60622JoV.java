package X;

import android.text.TextWatcher;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.JoV  reason: case insensitive filesystem */
public final class C60622JoV extends C249703kE {
    public TextWatcher A00;
    public final EditText A01;
    public final IgTextView A02;

    public C60622JoV(IgTextView igTextView, boolean z) {
        super(igTextView);
        this.A01 = (EditText) igTextView.findViewById(R.id.description_edit_view);
        IgTextView igTextView2 = null;
        igTextView = !(z ^ true) ? null : igTextView;
        this.A02 = igTextView instanceof IgTextView ? igTextView : igTextView2;
    }
}
