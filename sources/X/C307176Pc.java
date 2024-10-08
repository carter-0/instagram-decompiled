package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6Pc  reason: invalid class name and case insensitive filesystem */
public final class C307176Pc implements C2365734g {
    public final /* synthetic */ C307156Pa A00;

    public C307176Pc(C307156Pa r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C307156Pa r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.generic_card_container_revamp);
        0qQ.A0B(requireViewById, 0);
        r1.A00 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.generic_card_sticker_revamp);
        0qQ.A0B(requireViewById2, 0);
        r1.A03 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.generic_card_dimmer_overlay_revamp);
        0qQ.A0B(requireViewById3, 0);
        r1.A02 = requireViewById3;
        IgImageView requireViewById4 = view.requireViewById(R.id.generic_card_avatar_image_revamp);
        0qQ.A0B(requireViewById4, 0);
        r1.A08 = requireViewById4;
        TextView textView = (TextView) view.requireViewById(R.id.generic_card_avatar_subtitle_revamp);
        0qQ.A0B(textView, 0);
        r1.A04 = textView;
        r1.A05 = (TextView) view.requireViewById(R.id.generic_card_signal_body_revamp);
        r1.A06 = (TextView) view.requireViewById(R.id.generic_card_signal_bottom_revamp);
        r1.A01 = view.requireViewById(R.id.generic_card_cta_section_divider_revamp);
        TextView textView2 = (TextView) view.requireViewById(R.id.generic_card_cta_section_revamp);
        0qQ.A0B(textView2, 0);
        r1.A07 = textView2;
    }
}
