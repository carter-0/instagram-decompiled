package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

public final class UEP extends C249703kE {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final TextView A06;
    public final TextView A07;
    public final CircularImageView A08;
    public final IgBouncyUfiButtonImageView A09;
    public final C300835xz A0A = new C300835xz();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEP(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = view;
        this.A08 = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.question_avatar);
        this.A04 = DbW.A0B(view, R.id.question_body);
        this.A06 = DbW.A0B(view, R.id.question_like_count);
        this.A05 = DbW.A0B(view, R.id.question_delete_button);
        this.A07 = DbW.A0B(view, R.id.question_report_button);
        this.A09 = (IgBouncyUfiButtonImageView) AnonymousClass7TE.A0b(view, R.id.question_like_button);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.question_sub_items);
        this.A00 = AnonymousClass7TE.A0b(view, R.id.question_like_button_click_area);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.question_like_indication);
    }
}
