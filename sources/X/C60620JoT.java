package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.JoT  reason: case insensitive filesystem */
public final class C60620JoT extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final IgSimpleImageView A02;

    public C60620JoT(View view) {
        super(view);
        this.A02 = DbX.A0Y(view, R.id.mk_info_sheet_item_icon);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.mk_info_sheet_item_title);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.mk_info_sheet_item_description);
    }
}
