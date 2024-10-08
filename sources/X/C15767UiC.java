package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.UiC  reason: case insensitive filesystem */
public final class C15767UiC extends C232222tE {
    public final AnonymousClass0iw A00;
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C14871UCz(DbT.A0D(layoutInflater, viewGroup, R.layout.row_appreciation_gift_feed_filter_button, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        WSW wsw = (WSW) r6;
        C14871UCz uCz = (C14871UCz) r7;
        AnonymousClass7TF.A1H(wsw, uCz);
        String str = wsw.A03;
        IgTextView igTextView = uCz.A01;
        if (str == null) {
            igTextView.setVisibility(8);
        } else {
            igTextView.setText(str);
            igTextView.setSelected(wsw.A04);
            igTextView.setVisibility(0);
        }
        ImageUrl imageUrl = wsw.A01;
        IgImageView igImageView = uCz.A02;
        if (imageUrl == null) {
            igImageView.setVisibility(8);
        } else {
            igImageView.setUrl(imageUrl, this.A00);
            igImageView.setVisibility(0);
        }
        ConstraintLayout constraintLayout = uCz.A00;
        constraintLayout.setSelected(wsw.A04);
        WBH.A01(constraintLayout, 8, wsw, this);
        constraintLayout.setContentDescription(wsw.A02);
    }

    public final Class modelClass() {
        return WSW.class;
    }

    public C15767UiC(AnonymousClass0iw r1, 0sP r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
