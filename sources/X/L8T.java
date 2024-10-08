package X;

import android.view.View;
import android.widget.ImageButton;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

public final class L8T {
    public final ImageButton A00;
    public final IgTextView A01;
    public final IgTextView A02;
    public final RoundedCornerImageView A03;

    public L8T(View view) {
        0qQ.A0B(view, 1);
        this.A02 = DbX.A0Z(view, R.id.shopping_item_name);
        this.A01 = DbX.A0Z(view, R.id.shopping_item_details);
        this.A03 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.shopping_item_image);
        this.A00 = (ImageButton) AnonymousClass7TF.A0F(view, R.id.shopping_item_delete_button);
    }
}
