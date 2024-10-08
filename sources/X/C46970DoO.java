package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.DoO  reason: case insensitive filesystem */
public final class C46970DoO extends C249703kE {
    public final AnonymousClass0iw A00;
    public final IgTextView A01;
    public final CircularImageView A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46970DoO(View view, AnonymousClass0iw r6) {
        super(view);
        0qQ.A0B(r6, 2);
        this.A00 = r6;
        CircularImageView circularImageView = (CircularImageView) AnonymousClass7TE.A0b(view, R.id.quick_snap_reaction_item_avatar);
        this.A02 = circularImageView;
        this.A01 = Dba.A0E(view, R.id.quick_snap_reaction_item_emoji);
        Context context = view.getContext();
        int A002 = I7E.A00(context, R.dimen.account_recs_header_image_margin);
        0qQ.A07(context);
        circularImageView.A0H(A002, AnonymousClass7TF.A03(context, R.attr.igds_color_icon_on_media));
        circularImageView.setStrokeAlpha(38);
    }
}
