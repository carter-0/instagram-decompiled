package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.Jox  reason: case insensitive filesystem */
public final class C60650Jox extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final RoundedCornerImageView A04;

    public C60650Jox(View view) {
        super(view);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.scheduled_content_item_container);
        this.A04 = (RoundedCornerImageView) AnonymousClass7TF.A0F(view, R.id.scheduled_content_image);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.scheduled_content_caption);
        this.A03 = AnonymousClass7TG.A0R(view, R.id.scheduled_content_scheduled_publish_time);
        this.A01 = DbX.A0J(view, R.id.scheduled_content_scheduled_more_button);
    }
}
