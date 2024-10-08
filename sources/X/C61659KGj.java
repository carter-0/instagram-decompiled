package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.KGj  reason: case insensitive filesystem */
public final class C61659KGj extends C232232tF {
    public final float A00;
    public final C63598Kzl A01;
    public final AnonymousClass0iw A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60527Jmy(DbT.A0D(layoutInflater, viewGroup, R.layout.ab_test_media_grid_item_layout, false), this.A00);
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r11, C249703kE r12) {
        C321546uM r0;
        String str;
        C64801LiL liL = (C64801LiL) r11;
        C60527Jmy jmy = (C60527Jmy) r12;
        AnonymousClass7TG.A1N(liL, jmy);
        String str2 = liL.A03;
        ImageUrl imageUrl = liL.A02;
        C16528UwY uwY = liL.A01;
        boolean z = liL.A04;
        int i = liL.A00;
        AnonymousClass0iw r02 = this.A02;
        C63598Kzl kzl = this.A01;
        AnonymousClass7TG.A1S(r02, kzl);
        IgImageView igImageView = jmy.A00;
        igImageView.setUrl(imageUrl, r02);
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
            igImageView.setMediaOverlay(C321556uN.SELECTED);
            str = String.valueOf((char) (i + 65));
        } else {
            str = null;
            igImageView.setMediaOverlay((C321556uN) null);
        }
        igImageView.setAlphabet(str);
        AnonymousClass0fU.A00(new LXV(kzl, imageUrl, str2, 0), igImageView);
    }

    public final Class modelClass() {
        return C64801LiL.class;
    }

    public C61659KGj(C63598Kzl kzl, AnonymousClass0iw r2, float f) {
        this.A02 = r2;
        this.A01 = kzl;
        this.A00 = f;
    }
}
