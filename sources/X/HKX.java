package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class HKX extends C53110Gii {
    public final TextView A00;
    public final TextView A01;
    public final IgImageView A02;
    public final /* synthetic */ C53079GiC A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HKX(View view, C53079GiC giC) {
        super(view);
        0qQ.A0B(view, 2);
        this.A03 = giC;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.primary_text);
        this.A00 = A0R;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        this.A02 = DbX.A0b(view, R.id.image);
        AnonymousClass4Ed.A04(A0R);
    }
}
