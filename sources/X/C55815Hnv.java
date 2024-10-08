package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Hnv  reason: case insensitive filesystem */
public final class C55815Hnv {
    public final TextView A00;
    public final TextView A01;
    public final TextView A02;
    public final IgImageView A03;
    public final IgImageView A04;

    public C55815Hnv(View view) {
        0qQ.A0B(view, 1);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.save_collection_header_title);
        this.A00 = AnonymousClass7TG.A0R(view, R.id.save_collection_header_primary_subtitle);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.save_collection_header_secondary_subtitle);
        this.A03 = DbX.A0b(view, R.id.direct_share_button);
        this.A04 = DbX.A0b(view, R.id.save_collection_header_facepile);
    }
}
