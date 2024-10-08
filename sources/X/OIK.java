package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.ListView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.widget.search.ImeBackButtonHandlerFrameLayout;
import com.instagram.ui.widget.searchedittext.SearchEditText;

public final class OIK {
    public ListView A00;
    public RecyclerView A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final ImageView A09;
    public final C249403jg A0A;
    public final IgSimpleImageView A0B;
    public final IgSimpleImageView A0C;
    public final ColorFilterAlphaImageView A0D;
    public final ImeBackButtonHandlerFrameLayout A0E;
    public final SearchEditText A0F;

    public OIK(C249383je r7, ImeBackButtonHandlerFrameLayout imeBackButtonHandlerFrameLayout, C70598OCv oCv, boolean z) {
        this.A0E = imeBackButtonHandlerFrameLayout;
        this.A03 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_background_view);
        this.A08 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_underline);
        this.A07 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_shadow);
        this.A06 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_rounded_background);
        View requireViewById = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_field_container);
        this.A04 = requireViewById;
        SearchEditText searchEditText = (SearchEditText) imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_bar_real_field);
        this.A0F = searchEditText;
        this.A09 = DbU.A0F(imeBackButtonHandlerFrameLayout, R.id.dismiss_button);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) imeBackButtonHandlerFrameLayout.requireViewById(R.id.back_arrow);
        this.A0D = colorFilterAlphaImageView;
        this.A05 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_results_container);
        this.A02 = imeBackButtonHandlerFrameLayout.requireViewById(R.id.search_loading_spinner);
        this.A0B = JTP.A0T(imeBackButtonHandlerFrameLayout, R.id.meta_ai_search_btn);
        this.A0C = JTP.A0T(imeBackButtonHandlerFrameLayout, R.id.meta_ai_share_button);
        ViewStub A0D2 = DbU.A0D(imeBackButtonHandlerFrameLayout, R.id.search_overlay_list_stub);
        if (z) {
            RecyclerView recyclerView = (RecyclerView) JTP.A0H(A0D2, R.layout.search_recycler_view);
            this.A01 = recyclerView;
            recyclerView.setNestedScrollingEnabled(false);
            if (r7 != null) {
                this.A0A = r7;
                this.A01.A15(r7);
            }
        } else {
            ListView listView = (ListView) JTP.A0H(A0D2, R.layout.layout_listview);
            this.A00 = listView;
            if (r7 != null) {
                listView.setOnScrollListener(r7);
            }
        }
        if (oCv != null) {
            Integer num = oCv.A00;
            if (num != null) {
                colorFilterAlphaImageView.setVisibility(4);
                requireViewById.setPadding(num.intValue(), 0, 0, 0);
            }
            Integer num2 = oCv.A01;
            if (num2 != null) {
                searchEditText.setHint(num2.intValue());
            }
        }
    }
}
