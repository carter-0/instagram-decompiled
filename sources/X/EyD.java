package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

public final class EyD {
    public final Context A00;
    public final TextView A01;
    public final C71662eb A02;

    public EyD(View view) {
        this.A00 = view.getContext();
        this.A02 = DbY.A0T(view, R.id.fundraiser_results_summary_amount_raised_stub);
        this.A01 = DbU.A0G(view, R.id.fundraiser_results_summary_description);
    }
}
