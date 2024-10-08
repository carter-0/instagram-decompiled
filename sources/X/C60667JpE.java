package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.JpE  reason: case insensitive filesystem */
public final class C60667JpE extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgImageView A05;
    public final IgImageView A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60667JpE(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A00 = view;
        this.A06 = JTR.A0i(view, R.id.background_imageview);
        this.A05 = JTR.A0i(view, R.id.avatar_imageview);
        this.A01 = DbW.A0B(view, R.id.event_date_text);
        this.A02 = DbW.A0B(view, R.id.event_owner_text);
        this.A03 = DbW.A0B(view, R.id.event_title_text);
        this.A04 = DbW.A0B(view, R.id.remind_me_button);
    }
}
