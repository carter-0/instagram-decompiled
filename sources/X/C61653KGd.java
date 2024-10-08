package X;

import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.reels.Reel;

/* renamed from: X.KGd  reason: case insensitive filesystem */
public final class C61653KGd extends C232232tF {
    public final AnonymousClass0iw A00;
    public final L0N A01;

    public C61653KGd(AnonymousClass0iw r2, L0N l0n) {
        0qQ.A0B(l0n, 2);
        this.A00 = r2;
        this.A01 = l0n;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60658Jp5(DbU.A09(layoutInflater, viewGroup, R.layout.recipient_picker_share_to_highlight_row, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        Drawable drawable;
        C64776Lhs lhs = (C64776Lhs) r5;
        C60658Jp5 jp5 = (C60658Jp5) r6;
        AnonymousClass7TG.A1N(lhs, jp5);
        Reel reel = lhs.A00;
        ImageUrl A07 = reel.A07();
        if (A07 != null) {
            jp5.A05.setUrl(A07, this.A00);
        }
        jp5.A04.setText(reel.A0r);
        boolean z = lhs.A01;
        IgSimpleImageView igSimpleImageView = jp5.A03;
        if (z) {
            drawable = jp5.A00;
        } else {
            drawable = jp5.A01;
        }
        igSimpleImageView.setImageDrawable(drawable);
        LY8.A00(jp5.A02, 67, lhs, this);
    }

    public final Class modelClass() {
        return C64776Lhs.class;
    }
}
