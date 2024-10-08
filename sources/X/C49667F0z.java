package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.feed.ui.text.LinkTextView;

/* renamed from: X.F0z  reason: case insensitive filesystem */
public final class C49667F0z {
    public final View A00;
    public final View A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final C71662eb A05;
    public final C71662eb A06;
    public final C71662eb A07;
    public final C71662eb A08;
    public final LinkTextView A09;

    public C49667F0z(View view) {
        this.A01 = view;
        this.A09 = (LinkTextView) view.requireViewById(R.id.row_profile_header_textview_biography);
        this.A02 = DbU.A0G(view, R.id.row_profile_header_textview_biography_translation_link);
        this.A00 = view.requireViewById(R.id.biography_translation_spinner);
        this.A03 = DbU.A0G(view, R.id.row_profile_header_textview_fullname);
        this.A06 = DbY.A0T(view, R.id.row_profile_header_business_category_stub);
        this.A07 = DbY.A0T(view, R.id.profile_chats_links_view);
        this.A05 = DbY.A0T(view, R.id.row_profile_header_textview_business_address_stub);
        this.A04 = DbU.A0G(view, R.id.row_profile_header_textview_context);
        this.A08 = DbY.A0T(view, R.id.row_profile_header_restrict_indicator_stub);
    }
}
