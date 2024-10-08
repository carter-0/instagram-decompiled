package X;

import android.graphics.Bitmap;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;

public final class KGS extends C232232tF {
    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60555JnQ(DbU.A09(layoutInflater, viewGroup, R.layout.magic_media_remix_template_item_layout, false));
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.widget.ImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C64764Lhg lhg = (C64764Lhg) r4;
        C60555JnQ jnQ = (C60555JnQ) r5;
        AnonymousClass7TG.A1N(lhg, jnQ);
        Bitmap bitmap = lhg.A00;
        ? r0 = jnQ.A00;
        r0.setImageBitmap(bitmap);
        r0.setVisibility(0);
    }

    public final Class modelClass() {
        return C64764Lhg.class;
    }
}
