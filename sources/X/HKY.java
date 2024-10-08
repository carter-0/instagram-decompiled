package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class HKY extends C53110Gii {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;
    public final /* synthetic */ C53079GiC A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HKY(View view, C53079GiC giC) {
        super(view);
        0qQ.A0B(view, 2);
        this.A05 = giC;
        this.A01 = AnonymousClass7TG.A0R(view, R.id.primary_text);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.tertiary_text);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.dot);
        this.A04 = DbX.A0b(view, R.id.image);
    }
}
