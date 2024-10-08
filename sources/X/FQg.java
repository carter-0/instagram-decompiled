package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ViewSwitcher;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;

public final class FQg implements ViewSwitcher.ViewFactory {
    public final /* synthetic */ Context A00;

    public FQg(Context context) {
        this.A00 = context;
    }

    public final View makeView() {
        Context context = this.A00;
        IgTextView igTextView = new IgTextView(context);
        igTextView.setTextSize(0, context.getResources().getDimension(R.dimen.direct_row_message_emoji_text_size));
        igTextView.setGravity(81);
        igTextView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return igTextView;
    }
}
