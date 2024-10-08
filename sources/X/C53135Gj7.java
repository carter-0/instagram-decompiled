package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Gj7  reason: case insensitive filesystem */
public final class C53135Gj7 extends C249703kE {
    public final ImageView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C53135Gj7(ViewGroup viewGroup, Integer num) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        this.A03 = AnonymousClass7TE.A0b(viewGroup, R.id.merchant_avatar);
        this.A01 = DbW.A0B(viewGroup, R.id.merchant_username);
        this.A02 = DbW.A0B(viewGroup, R.id.subtitle);
        this.A00 = (ImageView) AnonymousClass7TE.A0b(viewGroup, R.id.chevron);
        0nA.A0V(viewGroup, DbU.A05(viewGroup).getDimensionPixelSize(num == AnonymousClass05K.A00 ? R.dimen.add_to_story_dual_destination_share_sheet_story_row_height : R.dimen.action_button_min_width));
    }
}
