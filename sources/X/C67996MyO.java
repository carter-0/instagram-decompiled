package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.MyO  reason: case insensitive filesystem */
public final class C67996MyO extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final RoundedCornerImageView A02;
    public final RoundedCornerImageView A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C67996MyO(View view) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = DbW.A0B(view, R.id.media_duration_text);
        this.A03 = (RoundedCornerImageView) view.findViewById(R.id.media_transparent_overlay);
        this.A00 = AnonymousClass7TE.A0d(view, R.id.media_additional_count);
        this.A02 = (RoundedCornerImageView) AnonymousClass7TE.A0b(view, R.id.feed_media_preview_item);
    }
}
