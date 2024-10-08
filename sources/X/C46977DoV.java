package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.DoV  reason: case insensitive filesystem */
public final class C46977DoV extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final IgSimpleImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46977DoV(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = DbX.A0Y(view, R.id.new_release_notification_item_image_view);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.new_release_notification_item_track_name);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.new_release_notification_item_artist_name);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.new_release_notification_item_camera_button);
    }
}
