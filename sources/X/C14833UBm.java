package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.UBm  reason: case insensitive filesystem */
public final class C14833UBm extends C249703kE {
    public final RoundedCornerImageView A00;

    /* JADX WARNING: type inference failed for: r2v1, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14833UBm(View view, boolean z) {
        super(view);
        0qQ.A0B(view, 1);
        ? r2 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.campaign_controls_media_thumbnail);
        this.A00 = r2;
        if (z) {
            ViewGroup.LayoutParams layoutParams = r2.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = (layoutParams.height * 9) / 16;
                r2.setLayoutParams(layoutParams);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
