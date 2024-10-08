package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgFrameLayout;

/* renamed from: X.KGm  reason: case insensitive filesystem */
public final class C61662KGm extends C232232tF {
    public final int A00;
    public final int A01;
    public final C63618L0g A02;

    public final /* bridge */ /* synthetic */ void bind(C232262tL r8, C249703kE r9) {
        C64761Lhd lhd = (C64761Lhd) r8;
        C60550JnL jnL = (C60550JnL) r9;
        AnonymousClass7TG.A1N(lhd, jnL);
        C63618L0g l0g = this.A02;
        int i = this.A01;
        int i2 = this.A00;
        0qQ.A0B(l0g, 2);
        String str = lhd.A00;
        C64610Leu leu = new C64610Leu(jnL);
        boolean z = 1MF.A02;
        0nY.A00().ATE(new KJ3(leu, str, i, i2));
        LYG.A02(jnL.A00, 31, jnL, l0g);
    }

    public final Class modelClass() {
        return C64761Lhd.class;
    }

    public C61662KGm(C63618L0g l0g, int i, int i2) {
        this.A02 = l0g;
        this.A01 = i;
        this.A00 = i2;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = this.A01;
        int i2 = this.A00;
        View inflate = layoutInflater.inflate(R.layout.share_photo_media_preview_layout, viewGroup, false);
        0qQ.A0C(inflate, "null cannot be cast to non-null type com.instagram.common.ui.base.IgFrameLayout");
        IgFrameLayout igFrameLayout = (IgFrameLayout) inflate;
        JTQ.A0w(igFrameLayout, i, i2);
        igFrameLayout.setTag(new C60550JnL(igFrameLayout));
        Object tag = igFrameLayout.getTag();
        0qQ.A0C(tag, "null cannot be cast to non-null type com.instagram.creation.fragment.sharepreview.SharePhotoMediaPreviewViewBinder.Companion.Holder");
        return (C249703kE) tag;
    }
}
