package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

public final class UDL extends C249703kE {
    public final ViewGroup A00;
    public final TextView A01;
    public final TextView A02;
    public final RoundedCornerImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDL(ViewGroup viewGroup) {
        super(viewGroup);
        0qQ.A0B(viewGroup, 1);
        this.A00 = viewGroup;
        this.A02 = AnonymousClass7TG.A0R(viewGroup, R.id.row_section_title);
        this.A01 = AnonymousClass7TG.A0R(viewGroup, R.id.row_section_subtitle);
        this.A03 = (RoundedCornerImageView) AnonymousClass7TF.A0F(viewGroup, R.id.row_section_thumbnail);
    }
}
