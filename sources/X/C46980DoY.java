package X;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.DoY  reason: case insensitive filesystem */
public final class C46980DoY extends C249703kE {
    public final TextView A00;
    public final TextView A01;
    public final RecyclerView A02;
    public final IgImageView A03;

    public C46980DoY(View view) {
        super(view);
        this.A01 = DbW.A0B(view, R.id.section_title);
        this.A00 = DbW.A0B(view, R.id.section_description);
        this.A03 = AnonymousClass7TE.A0b(view, R.id.image);
        this.A02 = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.value_props_list_recycle_view);
    }
}
