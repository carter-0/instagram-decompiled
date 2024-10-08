package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.shopping.widget.clickabletext.ClickableTextContainer;

public final class VX4 {
    public final int A00;
    public final TextView A01;
    public final ClickableTextContainer A02;

    public VX4(View view) {
        ClickableTextContainer clickableTextContainer = (ClickableTextContainer) AnonymousClass7TE.A0b(view, R.id.labels_container);
        this.A02 = clickableTextContainer;
        TextView A0B = DbW.A0B(clickableTextContainer, R.id.labels);
        this.A01 = A0B;
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.account_group_management_row_text_size);
        this.A00 = dimensionPixelSize;
        03v.A0B(clickableTextContainer, new U7B(4));
        DbT.A1H(A0B);
        0mq.A03(A0B, dimensionPixelSize);
    }
}
