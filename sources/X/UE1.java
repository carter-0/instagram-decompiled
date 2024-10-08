package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

public final class UE1 extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final IgImageView A04;
    public final Context A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UE1(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A05 = AnonymousClass7TE.A0S(view);
        this.A03 = DbW.A0B(view, R.id.title_text);
        this.A02 = DbW.A0B(view, R.id.subtitle_text);
        this.A01 = DbW.A0B(view, R.id.button_text);
        this.A04 = JTR.A0i(view, R.id.chevron);
    }
}
