package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;

public final class L8D {
    public AnonymousClass3W1 A00;
    public final AnonymousClass3TS A01;
    public final ReboundViewPager A02;
    public final C255913uv A03;

    public L8D(View view) {
        this.A01 = new AnonymousClass3TS(DbU.A0D(view, R.id.audio_icon_view_stub));
        this.A02 = (ReboundViewPager) AnonymousClass7TF.A0F(view, R.id.carousel_viewpager);
        this.A03 = (C255913uv) AnonymousClass7TF.A0F(view, R.id.carousel_page_indicator);
    }
}
