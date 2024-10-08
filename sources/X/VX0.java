package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;

public final class VX0 {
    public final TextView A00;
    public final TextView A01;
    public final ClickableTextContainer A02;

    public VX0(View view) {
        ClickableTextContainer clickableTextContainer = (ClickableTextContainer) AnonymousClass7TE.A0b(view, R.id.labels_container);
        this.A02 = clickableTextContainer;
        this.A00 = DbW.A0B(clickableTextContainer, R.id.product_name_label);
        TextView A0B = DbW.A0B(clickableTextContainer, R.id.secondary_labels);
        this.A01 = A0B;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        03v.A0B(clickableTextContainer, new U7B(3));
        DbT.A1H(A0B);
        0mq.A03(A0B, dimensionPixelSize);
    }
}
