package X;

import android.view.View;
import android.view.ViewStub;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.TxK  reason: case insensitive filesystem */
public final class C14498TxK {
    public IgSimpleImageView A00;
    public IgSimpleImageView A01;
    public final View A02;
    public final ViewStub A03;
    public final ViewStub A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final CircularImageView A07;

    /* JADX WARNING: type inference failed for: r0v10, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public C14498TxK(View view) {
        0qQ.A0B(view, 1);
        this.A02 = view;
        this.A06 = DbX.A0Z(view, R.id.row_search_keyword_title);
        this.A05 = DbX.A0Z(view, R.id.row_search_keyword_subtitle);
        this.A03 = JTR.A0X(view, R.id.dismiss_button_stub);
        this.A04 = JTR.A0X(view, R.id.icon_stub);
        ? A0a = DbX.A0a(view, R.id.row_search_profile_image);
        this.A07 = A0a;
        C13990Tnq.A0n(view.getResources(), DbX.A0G(A0a));
    }
}
