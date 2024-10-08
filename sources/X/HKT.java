package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

public final class HKT extends C53110Gii {
    public final TextView A00;
    public final RoundedCornerImageView A01;
    public final /* synthetic */ C53079GiC A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HKT(View view, C53079GiC giC) {
        super(view);
        0qQ.A0B(view, 2);
        this.A02 = giC;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.primary_text);
        this.A00 = A0R;
        this.A01 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.square_image);
        AnonymousClass4Ed.A04(A0R);
    }
}
