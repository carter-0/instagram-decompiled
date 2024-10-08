package X;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

public final class KKU extends C60536Jn7 {
    public boolean A00;
    public final ImageView A01 = DbS.A0G(this.itemView, R.id.album_filter_icon);
    public final TextView A02 = AnonymousClass7TE.A0d(this.itemView, R.id.filter_media_count_view);
    public final TextView A03 = AnonymousClass7TE.A0d(this.itemView, R.id.album_filter_title);
    public final C361518gM A04;

    public KKU(ViewGroup viewGroup, C361518gM r5) {
        super(DbT.A0D(DbV.A0D(viewGroup), viewGroup, R.layout.filter_media_type_layout, false), (C63913LBy) null);
        this.A04 = r5;
    }
}
