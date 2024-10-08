package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class FQf implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ Context A00;

    public FQf(Context context) {
        this.A00 = context;
    }

    public final View makeView() {
        Context context = this.A00;
        IgTextView igTextView = new IgTextView(context);
        igTextView.setTextSize(0, context.getResources().getDimension(R.dimen.abc_text_size_menu_header_material));
        DbT.A17(context, igTextView, R.color.canvas_bottom_sheet_description_text_color);
        igTextView.setGravity(16);
        igTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return igTextView;
    }
}
