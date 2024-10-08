package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6Pf  reason: invalid class name and case insensitive filesystem */
public final class C307206Pf implements C2365734g {
    public final /* synthetic */ C307196Pe A00;

    public C307206Pf(C307196Pe r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        C307196Pe r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.generic_card_container);
        0qQ.A0B(requireViewById, 0);
        r1.A00 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.generic_card_sticker);
        0qQ.A0B(requireViewById2, 0);
        r1.A04 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.generic_card_dimmer_overlay);
        0qQ.A0B(requireViewById3, 0);
        r1.A02 = requireViewById3;
        IgImageView requireViewById4 = view.requireViewById(R.id.generic_card_avatar_image);
        0qQ.A0B(requireViewById4, 0);
        r1.A0A = requireViewById4;
        TextView textView = (TextView) view.requireViewById(R.id.generic_card_avatar_subtitle);
        0qQ.A0B(textView, 0);
        r1.A05 = textView;
        TextView textView2 = (TextView) view.requireViewById(R.id.generic_card_avatar_url);
        0qQ.A0B(textView2, 0);
        r1.A06 = textView2;
        r1.A07 = (TextView) view.requireViewById(R.id.generic_card_signal_body);
        r1.A08 = (TextView) view.requireViewById(R.id.generic_card_signal_bottom);
        r1.A03 = view.requireViewById(R.id.generic_card_signals_divider);
        r1.A01 = view.requireViewById(R.id.generic_card_cta_section_divider);
        TextView textView3 = (TextView) view.requireViewById(R.id.generic_card_cta_section);
        0qQ.A0B(textView3, 0);
        r1.A09 = textView3;
    }
}
