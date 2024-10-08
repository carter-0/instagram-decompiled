package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.direct.ui.thumbnailgrid.ThumbnailGridView;

/* renamed from: X.O7k  reason: case insensitive filesystem */
public final class C70459O7k {
    public final ThumbnailGridView A00;

    public C70459O7k(View view, boolean z, boolean z2) {
        int A002;
        0qQ.A0B(view, 1);
        ThumbnailGridView thumbnailGridView = (ThumbnailGridView) AnonymousClass7TF.A0F(view, R.id.message_content_thumbnail_grid);
        this.A00 = thumbnailGridView;
        if (!z || z2) {
            A002 = AnonymousClass7PV.A00(AnonymousClass7TE.A0S(view), false) / 3;
        } else {
            A002 = view.getResources().getDimensionPixelSize(R.dimen.direct_standard_xma_grid_view_height);
        }
        thumbnailGridView.setThumbnailHeight(A002);
    }
}
