package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

public final class KHR extends IgLinearLayout {
    public final IgSimpleImageView A00 = ((IgSimpleImageView) findViewById(R.id.pinnables_footer_button_icon));
    public final IgTextView A01 = JTO.A0X(this, R.id.pinnables_footer_button_label);

    public KHR(Context context) {
        super(context, (AttributeSet) null, 0);
        LayoutInflater.from(context).inflate(R.layout.pinnables_footer_button, this, true);
    }

    public final void setLabel(Integer num) {
        IgSimpleImageView igSimpleImageView;
        LinearLayout.LayoutParams layoutParams;
        if (num != null) {
            IgTextView igTextView = this.A01;
            DbT.A18(getContext(), igTextView, num.intValue());
            igTextView.setVisibility(0);
            igSimpleImageView = this.A00;
            layoutParams = new LinearLayout.LayoutParams(igSimpleImageView.getLayoutParams());
            layoutParams.setMargins(AnonymousClass7TE.A0B(getResources()), 0, 0, 0);
        } else {
            IgTextView igTextView2 = this.A01;
            DbS.A1C(igTextView2);
            igTextView2.setVisibility(8);
            igSimpleImageView = this.A00;
            layoutParams = new LinearLayout.LayoutParams(igSimpleImageView.getLayoutParams());
            Resources resources = getResources();
            layoutParams.setMargins(resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), 0, resources.getDimensionPixelSize(R.dimen.action_bar_item_spacing_right), 0);
        }
        igSimpleImageView.setLayoutParams(layoutParams);
    }

    public final void setIcon(int i) {
        this.A00.setImageResource(i);
    }
}
