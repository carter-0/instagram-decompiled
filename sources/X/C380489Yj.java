package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;

/* renamed from: X.9Yj  reason: invalid class name and case insensitive filesystem */
public final class C380489Yj extends C249703kE {
    public final Context A00;
    public final RoundedCornerImageView A01;
    public final MagicMediaRemixEditController A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C380489Yj(Context context, View view, MagicMediaRemixEditController magicMediaRemixEditController) {
        super(view);
        AnonymousClass7TG.A1Q(view, magicMediaRemixEditController);
        this.A00 = context;
        this.A02 = magicMediaRemixEditController;
        this.A01 = (RoundedCornerImageView) AnonymousClass7TE.A0b(view, R.id.magic_media_remix_media_selector_content_item);
    }
}
