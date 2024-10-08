package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.Hoo  reason: case insensitive filesystem */
public final class C55867Hoo {
    public C55732HmT A00;
    public final View A01;
    public final View A02;
    public final TextView A03;
    public final TextView A04;
    public final TextView A05;
    public final ColorFilterAlphaImageView A06;
    public final HorizontalRecyclerPager A07;

    public C55867Hoo(Context context, View view) {
        this.A01 = view.requireViewById(R.id.netego_carousel_header);
        this.A02 = view.requireViewById(R.id.top_divider);
        this.A05 = DbU.A0G(view, R.id.netego_carousel_title);
        this.A04 = DbU.A0G(view, R.id.netego_carousel_subtitle);
        HorizontalRecyclerPager horizontalRecyclerPager = (HorizontalRecyclerPager) view.requireViewById(R.id.netego_carousel_view);
        this.A07 = horizontalRecyclerPager;
        int A032 = AnonymousClass7TG.A03(context);
        horizontalRecyclerPager.A11(new AnonymousClass3V7(A032, A032));
        horizontalRecyclerPager.A01 = C51972G9s.A08(context);
        ViewStub A0D = DbU.A0D(view, R.id.netego_carousel_cta);
        A0D.setLayoutResource(R.layout.netego_carousel_text_cta);
        TextView textView = (TextView) A0D.inflate();
        this.A03 = textView;
        textView.setVisibility(4);
        ViewStub A0D2 = DbU.A0D(view, R.id.netego_button_stub);
        A0D2.setLayoutResource(R.layout.netego_carousel_more_button);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) A0D2.inflate();
        this.A06 = colorFilterAlphaImageView;
        colorFilterAlphaImageView.setVisibility(8);
    }
}
