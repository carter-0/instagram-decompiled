package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.HKb  reason: case insensitive filesystem */
public final class C54592HKb extends C53110Gii {
    public final Drawable A00;
    public final TextView A01;
    public final TextView A02;
    public final TextView A03;
    public final TextView A04;
    public final IgCheckBox A05;
    public final IgImageView A06;
    public final IgImageView A07;
    public final IgImageView A08;
    public final RoundedCornerImageView A09;
    public final /* synthetic */ C53079GiC A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54592HKb(View view, C53079GiC giC, int i) {
        super(view);
        RoundedCornerImageView roundedCornerImageView;
        0qQ.A0B(view, 2);
        this.A0A = giC;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.primary_text);
        this.A02 = A0R;
        this.A03 = AnonymousClass7TG.A0R(view, R.id.secondary_text);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.tertiary_text);
        this.A01 = AnonymousClass7TG.A0R(view, R.id.dot);
        this.A07 = DbX.A0b(view, R.id.image);
        IgImageView igImageView = null;
        if (i == 1) {
            roundedCornerImageView = (RoundedCornerImageView) view.requireViewById(R.id.square_image);
        } else {
            roundedCornerImageView = null;
        }
        this.A09 = roundedCornerImageView;
        this.A05 = (IgCheckBox) AnonymousClass7TF.A0F(view, R.id.save_button);
        this.A06 = giC.A0B ? DbT.A0b(view, R.id.chevron_button) : igImageView;
        this.A08 = DbX.A0b(view, R.id.trending_arrow);
        Context A0S = AnonymousClass7TE.A0S(view);
        this.A00 = AnonymousClass4Ed.A01(A0S, R.drawable.music_explicit, 2Yu.A09(A0S));
        AnonymousClass4Ed.A04(A0R);
    }
}
