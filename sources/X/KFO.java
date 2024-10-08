package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.model.mediasize.ExtendedImageUrl;

public final class KFO extends C232222tE {
    public final K5B A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60642Jop(DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_selected_media_item, false), this.A00);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        HC0 hc0 = (HC0) r5;
        C60642Jop jop = (C60642Jop) r6;
        AnonymousClass7TG.A1N(hc0, jop);
        C65443LtR ltR = hc0.A00;
        ExtendedImageUrl A1n = ltR.A00.A1n(JTQ.A06(jop));
        if (A1n != null) {
            jop.A01.setUrl(A1n, jop.A00);
        }
        LY7.A00(jop.A02, 21, ltR, jop);
        LY7.A00(jop.A01, 22, ltR, jop);
    }

    public final Class modelClass() {
        return HC0.class;
    }

    public KFO(K5B k5b) {
        this.A00 = k5b;
    }
}
