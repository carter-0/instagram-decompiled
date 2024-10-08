package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class U6j extends ConstraintLayout {
    public final IgTextView A00 = DbT.A0a(this, R.id.trust_signal_item_text);
    public final IgImageView A01 = DbT.A0b(this, R.id.trust_signal_item_icon);

    public U6j(Context context) {
        super(context, (AttributeSet) null, 0);
        View.inflate(context, R.layout.lead_gen_view_profile_content_trust_signal_item, this);
    }
}
