package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.6PY  reason: invalid class name */
public final class AnonymousClass6PY implements C2365734g {
    public final /* synthetic */ AnonymousClass6PX A00;

    public AnonymousClass6PY(AnonymousClass6PX r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass6PX r1 = this.A00;
        View requireViewById = view.requireViewById(R.id.ctwa_story_messaging_card_container);
        0qQ.A0B(requireViewById, 0);
        r1.A01 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.ctwa_story_messaging_card);
        0qQ.A0B(requireViewById2, 0);
        r1.A00 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.ctwa_story_messaging_card_dimmer_overlay);
        0qQ.A0B(requireViewById3, 0);
        r1.A02 = requireViewById3;
        IgImageView requireViewById4 = view.requireViewById(R.id.ctwa_story_messaging_card_image_background);
        0qQ.A0B(requireViewById4, 0);
        r1.A05 = requireViewById4;
        TextView textView = (TextView) view.requireViewById(R.id.ctwa_story_messaging_card_info);
        0qQ.A0B(textView, 0);
        r1.A04 = textView;
        TextView textView2 = (TextView) view.requireViewById(R.id.ctwa_story_messaging_card_cta_text);
        0qQ.A0B(textView2, 0);
        r1.A03 = textView2;
    }
}
