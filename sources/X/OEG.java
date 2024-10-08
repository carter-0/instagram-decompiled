package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

public final class OEG {
    public final TextView A00;
    public final TextView A01;
    public final ReboundViewPager A02;

    public OEG(View view) {
        0qQ.A0B(view, 1);
        this.A01 = DbU.A0G(view, R.id.suggested_user_carousel_title);
        this.A00 = DbU.A0G(view, R.id.suggested_user_carousel_subtitle);
        this.A02 = (ReboundViewPager) view.requireViewById(R.id.netego_rebound_view_pager);
    }
}
