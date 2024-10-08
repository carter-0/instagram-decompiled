package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class EyR {
    public final ViewGroup A00;
    public final IgTextView A01;
    public final SpinnerImageView A02;

    public EyR(View view) {
        ViewGroup A0C = DbU.A0C(view, R.id.row_search_for_x_container);
        this.A00 = A0C;
        A0C.setVisibility(0);
        IgTextView A0a = DbT.A0a(view, R.id.row_search_for_x_textview);
        this.A01 = A0a;
        this.A02 = (SpinnerImageView) view.requireViewById(R.id.search_loading_spinner);
        A0a.A00 = true;
    }
}
