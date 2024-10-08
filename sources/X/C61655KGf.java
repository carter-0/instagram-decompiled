package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KGf  reason: case insensitive filesystem */
public final class C61655KGf extends C232232tF {
    public final AnonymousClass0iw A00;
    public final C61408K6f A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60637Jok(DbT.A0D(layoutInflater, viewGroup, R.layout.gallery_grid_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        C64811LiW liW = (C64811LiW) r6;
        C60637Jok jok = (C60637Jok) r7;
        AnonymousClass7TF.A1H(liW, jok);
        IgImageView igImageView = jok.A02;
        igImageView.setUrl(liW.A00(), this.A00);
        int i = 0;
        jok.A01.setVisibility(0);
        View view = jok.A00;
        if (liW.A00 == -1) {
            i = 8;
        }
        view.setVisibility(i);
        jok.A03.A00(liW.A00);
        LYG.A02(igImageView, 65, this, liW);
    }

    public final Class modelClass() {
        return C64811LiW.class;
    }

    public C61655KGf(AnonymousClass0iw r1, C61408K6f k6f) {
        this.A00 = r1;
        this.A01 = k6f;
    }
}
