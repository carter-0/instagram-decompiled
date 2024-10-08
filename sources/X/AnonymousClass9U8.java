package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.9U8  reason: invalid class name */
public final class AnonymousClass9U8 {
    public IgImageView A00;
    public final ImageView A01;
    public final ImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;

    public AnonymousClass9U8(View view) {
        0qQ.A0B(view, 1);
        this.A00 = AnonymousClass7TF.A0F(view, R.id.toast_circular_thumbnail_image);
        this.A04 = AnonymousClass7TF.A0F(view, R.id.toast_message_title);
        this.A03 = AnonymousClass7TF.A0F(view, R.id.toast_message_subtitle);
        this.A01 = (ImageView) AnonymousClass7TF.A0F(view, R.id.toast_action_icon);
        this.A02 = (ImageView) AnonymousClass7TF.A0F(view, R.id.album_art_preview_button_icon);
    }
}
