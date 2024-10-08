package X;

import android.content.res.Resources;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.ui.recyclerpager.HorizontalRecyclerPager;

/* renamed from: X.49r  reason: invalid class name and case insensitive filesystem */
public final class C2614649r {
    public final IgTextView A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final HorizontalRecyclerPager A03;

    public C2614649r(View view) {
        IgTextView findViewById = view.findViewById(R.id.channels_header_title);
        0qQ.A07(findViewById);
        this.A02 = findViewById;
        IgTextView findViewById2 = view.findViewById(R.id.channels_header_subtitle);
        0qQ.A07(findViewById2);
        this.A01 = findViewById2;
        View findViewById3 = view.findViewById(R.id.channels_carousel_view);
        0qQ.A07(findViewById3);
        HorizontalRecyclerPager horizontalRecyclerPager = (HorizontalRecyclerPager) findViewById3;
        this.A03 = horizontalRecyclerPager;
        IgTextView findViewById4 = view.findViewById(R.id.channels_see_all_button);
        0qQ.A07(findViewById4);
        this.A00 = findViewById4;
        Resources resources = view.getContext().getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
        horizontalRecyclerPager.A11(new AnonymousClass3V7(dimensionPixelSize, dimensionPixelSize));
        horizontalRecyclerPager.A01 = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        horizontalRecyclerPager.A0S = false;
    }
}
