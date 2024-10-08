package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.9mk  reason: invalid class name and case insensitive filesystem */
public final class C387769mk extends AnonymousClass9YS {
    public AnonymousClass3NM A00;
    public C387339m3 A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final 0sP A04;

    public C387769mk(View view, 0sP r5) {
        super(view);
        this.A04 = r5;
        this.A03 = AnonymousClass7TF.A0F(view, R.id.group_mention_suggestion_title_label);
        this.A02 = (IgSimpleImageView) AnonymousClass7TF.A0F(view, R.id.group_mention_suggestion_image);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A07 = true;
        this.A00 = C386359kT.A00(A0m, this, 13);
    }
}
