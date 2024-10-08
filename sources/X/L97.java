package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class L97 {
    public final View A00;
    public final View A01;
    public final View A02;
    public final RecyclerView A03;
    public final SpinnerImageView A04;

    public L97(View view) {
        this.A00 = view;
        this.A02 = AnonymousClass7TF.A0G(view, R.id.loading_indicator);
        this.A04 = (SpinnerImageView) AnonymousClass7TF.A0F(view, R.id.loading_spinner);
        this.A01 = AnonymousClass7TF.A0G(view, R.id.hashtag_suggestions_title);
        this.A03 = JTR.A0c(view, R.id.hashtag_suggestions_recycler_view);
    }
}
