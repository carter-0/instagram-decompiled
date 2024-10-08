package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Dpa  reason: case insensitive filesystem */
public final class C47040Dpa extends C249703kE implements AnonymousClass3N3 {
    public final int A00;
    public final View.OnClickListener A01;
    public final View.OnClickListener A02;
    public final View A03;
    public final TextView A04;
    public final TextView A05;
    public final CircularImageView A06;
    public final C252063oV A07;
    public final GradientSpinner A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47040Dpa(View view, G9Z g9z, int i) {
        super(view);
        0qQ.A0B(view, 1);
        this.A03 = AnonymousClass7TF.A0G(view, R.id.icon);
        this.A06 = DbX.A0a(view, R.id.avatar_image_view);
        this.A08 = (GradientSpinner) AnonymousClass7TF.A0F(view, R.id.seen_state);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.row_title);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.row_subtitle);
        Context context = view.getContext();
        this.A00 = context.getColor(2Yu.A07(context));
        this.A07 = DbU.A0Z(view, R.id.reel_glyph_stub);
        this.A01 = new FPA(i, 1, (Object) g9z, (Object) this);
        this.A02 = new FPE(37, (Object) g9z, (Object) this);
    }

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final RectF AeG() {
        return 0nA.A0F(this.A06);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ View AeY() {
        return this.A06;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A06);
    }

    public final GradientSpinner Bkt() {
        return this.A08;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A06.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A06.setVisibility(0);
    }
}
