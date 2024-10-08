package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Vcb  reason: case insensitive filesystem */
public final class C17706Vcb {
    public AnonymousClass3V7 A00;
    public final View A01;
    public final View A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final TextView A08;
    public final IgView A09;
    public final HorizontalRecyclerPager A0A;
    public final List A0B = new ArrayList();

    public C17706Vcb(View view) {
        this.A02 = view;
        this.A01 = view.requireViewById(R.id.header);
        this.A08 = DbU.A0G(view, R.id.netego_title);
        this.A05 = DbU.A0G(view, R.id.header_dot);
        this.A06 = DbU.A0G(view, R.id.netego_cta);
        this.A03 = DbU.A0F(view, R.id.netego_overflow);
        this.A07 = DbU.A0G(view, R.id.netego_cta_wrapped);
        this.A0A = (HorizontalRecyclerPager) view.requireViewById(R.id.netego_carousel_view);
        this.A09 = (IgView) view.requireViewById(R.id.footer_space);
        this.A04 = (LinearLayout) view.requireViewById(R.id.follow_requests_container);
    }
}
