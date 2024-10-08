package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.GjE  reason: case insensitive filesystem */
public final class C53142GjE extends C249703kE {
    public final View A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;

    public C53142GjE(View view) {
        super(view);
        this.A04 = AnonymousClass7TE.A0d(view, R.id.position);
        this.A03 = AnonymousClass7TE.A0d(view, R.id.item_type);
        this.A02 = AnonymousClass7TE.A0d(view, R.id.item_source_type);
        this.A01 = AnonymousClass7TE.A0d(view, R.id.id_text);
        this.A00 = view.findViewById(R.id.debug_overlay_item_row);
    }
}
