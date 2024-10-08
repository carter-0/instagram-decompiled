package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.controller.magicmediaremix.MagicMediaRemixEditController;

/* renamed from: X.9jS  reason: invalid class name and case insensitive filesystem */
public final class C385739jS extends C232232tF {
    public final MagicMediaRemixEditController A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        View inflate = layoutInflater.inflate(R.layout.magic_media_remix_media_selector_item_layout, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        Context A0S = AnonymousClass7TE.A0S(viewGroup);
        0qQ.A0A(inflate);
        return new C380489Yj(A0S, inflate, this.A00);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        int A02;
        AYO ayo = (AYO) r6;
        C380489Yj r72 = (C380489Yj) r7;
        AnonymousClass7TG.A1N(ayo, r72);
        int i = 0;
        ? r4 = r72.A01;
        r4.setImageBitmap(ayo.A00);
        r4.setVisibility(0);
        AnonymousClass0fU.A00(new AOW(10, ayo, r72), r4);
        if (ayo.A02) {
            Context context = r72.A00;
            i = AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_yellow);
            r4.setAlpha(1.0f);
            A02 = AnonymousClass7TF.A02(context, R.dimen.feed_delayed_skip_toast_countdown_ring_width);
        } else {
            r4.setAlpha(0.3f);
            A02 = AnonymousClass7TF.A02(r72.A00, R.dimen.abc_control_corner_material);
        }
        r4.setStrokeWidth(A02);
        r4.setStrokeColor(i);
    }

    public final Class modelClass() {
        return AYO.class;
    }

    public C385739jS(MagicMediaRemixEditController magicMediaRemixEditController) {
        this.A00 = magicMediaRemixEditController;
    }
}
