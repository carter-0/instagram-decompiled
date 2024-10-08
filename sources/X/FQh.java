package X;

import android.content.res.Resources;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.instagram.android.R;

public final class FQh implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ Resources A00;
    public final /* synthetic */ E3s A01;

    public FQh(Resources resources, E3s e3s) {
        this.A01 = e3s;
        this.A00 = resources;
    }

    public final View makeView() {
        E3s e3s = this.A01;
        TextView textView = new TextView(e3s.getContext());
        Resources resources = this.A00;
        int A0F = AnonymousClass7TE.A0F(resources);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -1);
        layoutParams.gravity = 1;
        textView.setLayoutParams(layoutParams);
        textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.instagram_facebook_circle_filled_16, 0, 0, 0);
        textView.setCompoundDrawablePadding(DbV.A05(e3s).getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        textView.setPadding(A0F, 0, A0F, 0);
        textView.setGravity(17);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        DbT.A17(e3s.getContext(), textView, R.color.design_dark_default_color_on_background);
        textView.setTextSize(0, resources.getDimension(R.dimen.abc_text_size_menu_header_material));
        textView.setTypeface((Typeface) null, 1);
        C49948FGd.A02(textView, R.color.design_dark_default_color_on_background);
        return textView;
    }
}
