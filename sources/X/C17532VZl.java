package X;

import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.VZl  reason: case insensitive filesystem */
public final class C17532VZl {
    public IgSimpleImageView A00;
    public final View A01;
    public final ViewStub A02;
    public final TextView A03;
    public final CircularImageView A04;

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public C17532VZl(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.row_search_map_query_title);
        this.A03 = A0R;
        ? A0a = DbX.A0a(view, R.id.row_search_icon);
        this.A04 = A0a;
        this.A02 = JTR.A0X(view, R.id.dismiss_button_stub);
        C13988Tno.A16(A0R, true);
        C13990Tnq.A0n(view.getResources(), DbX.A0G(A0a));
    }
}
