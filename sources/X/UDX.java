package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;

public final class UDX extends C249703kE {
    public final View A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final C252063oV A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UDX(View view, boolean z) {
        super(view);
        0qQ.A0B(view, 1);
        this.A01 = (FrameLayout) AnonymousClass7TE.A0b(view, R.id.non_visual_variant_item_background);
        this.A03 = C66581MXm.A0T(view, R.id.non_visual_variant_item_selected_overlay_stub);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.non_visual_variant_item_text);
        this.A02 = A0R;
        C13988Tno.A16(A0R, true);
        View requireViewById = view.requireViewById(R.id.non_visual_variant_item_sold_out_slash);
        this.A00 = requireViewById;
        C14682U1d u1d = new C14682U1d(AnonymousClass7TE.A0S(view), z);
        u1d.A00 = R.dimen.abc_action_bar_elevation_material;
        requireViewById.setBackground(u1d);
    }
}
