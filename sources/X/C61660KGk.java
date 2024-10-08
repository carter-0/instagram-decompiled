package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KGk  reason: case insensitive filesystem */
public final class C61660KGk extends C232232tF {
    public final float A00;
    public final C63599Kzm A01;
    public final AnonymousClass0iw A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60529Jn0(DbT.A0D(layoutInflater, viewGroup, R.layout.media_grid_item_layout, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        C321546uM r0;
        C321556uN r02;
        C64801LiL liL = (C64801LiL) r10;
        C60529Jn0 jn0 = (C60529Jn0) r11;
        AnonymousClass7TG.A1N(liL, jn0);
        String str = liL.A03;
        ImageUrl imageUrl = liL.A02;
        C16528UwY uwY = liL.A01;
        boolean z = liL.A04;
        AnonymousClass0iw r03 = this.A02;
        C63599Kzm kzm = this.A01;
        AnonymousClass7TG.A1R(r03, kzm);
        IgImageView igImageView = jn0.A00;
        igImageView.setUrl(imageUrl, r03);
        int ordinal = uwY.ordinal();
        if (ordinal == 3) {
            r0 = C321546uM.A0N;
            igImageView.setIcon(r0);
        } else if (ordinal != 9) {
            igImageView.A0H();
        } else {
            r0 = C321546uM.A08;
            igImageView.setIcon(r0);
        }
        if (z) {
            r02 = C321556uN.SELECTED;
        } else {
            r02 = null;
        }
        igImageView.setMediaOverlay(r02);
        AnonymousClass0fU.A00(new LXV(kzm, imageUrl, str, 1), igImageView);
    }

    public final Class modelClass() {
        return C64801LiL.class;
    }

    public C61660KGk(C63599Kzm kzm, AnonymousClass0iw r2, float f) {
        this.A02 = r2;
        this.A01 = kzm;
        this.A00 = f;
    }
}
