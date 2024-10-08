package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.Dod  reason: case insensitive filesystem */
public final class C46985Dod extends C249703kE {
    public C266444Yx A00 = JUH.A00("");
    public final View A01;
    public final IgTextView A02;
    public final CircularImageView A03;

    public C46985Dod(View view) {
        super(view);
        this.A01 = view;
        this.A03 = DbX.A0a(view, R.id.social_channel_item_avatar);
        this.A02 = DbX.A0Z(view, R.id.social_channel_item_title);
    }
}
