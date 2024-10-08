package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6PM  reason: invalid class name */
public final class AnonymousClass6PM implements C2365734g {
    public final /* synthetic */ AnonymousClass6PL A00;

    public AnonymousClass6PM(AnonymousClass6PL r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6PL r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.lead_gen_card_container);
        0qQ.A0B(requireViewById, 0);
        r1.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.lead_gen_card);
        0qQ.A0B(requireViewById2, 0);
        r1.A00 = requireViewById2;
        IgImageView requireViewById3 = view.requireViewById(R.id.lead_gen_card_image_background);
        0qQ.A0B(requireViewById3, 0);
        r1.A08 = requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.lead_gen_card_dimmer_overlay);
        0qQ.A0B(requireViewById4, 0);
        r1.A02 = requireViewById4;
        TextView textView = (TextView) view.requireViewById(R.id.lead_gen_card_subtitle);
        0qQ.A0B(textView, 0);
        r1.A07 = textView;
        TextView textView2 = (TextView) view.requireViewById(R.id.lead_gen_card_subtitle_enlarged);
        0qQ.A0B(textView2, 0);
        r1.A06 = textView2;
        TextView textView3 = (TextView) view.requireViewById(R.id.lead_gen_card_info);
        0qQ.A0B(textView3, 0);
        r1.A05 = textView3;
        View requireViewById5 = view.requireViewById(R.id.lead_gen_card_divider);
        0qQ.A0B(requireViewById5, 0);
        r1.A03 = requireViewById5;
        TextView textView4 = (TextView) view.requireViewById(R.id.lead_gen_card_cta_text);
        0qQ.A0B(textView4, 0);
        r1.A04 = textView4;
    }
}
