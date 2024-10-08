package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PBi  reason: case insensitive filesystem */
public final class C72577PBi implements C328007Db, C328017Dc, C3263976p {
    public C328087Dj A00;
    public final ImageView A01;
    public final LinearLayout A02;
    public final ConstraintLayout A03;
    public final C252063oV A04;
    public final C252063oV A05;
    public final C252063oV A06;
    public final IgProgressImageView A07;
    public final AnonymousClass0eM A08;
    public final ImageView A09;
    public final C252063oV A0A;
    public final C252063oV A0B;
    public final C252063oV A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;

    public C72577PBi(View view) {
        0qQ.A0B(view, 1);
        this.A02 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.layered_xma_item_view);
        this.A0C = C66581MXm.A0T(view, R.id.legibility_gradient_header_stub);
        this.A03 = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.media_constraint_layout);
        View findViewById = view.findViewById(R.id.layered_xma_mention_reshare_cta_button_stub);
        this.A0A = findViewById != null ? 2b1.A00(findViewById) : null;
        IgProgressImageView igProgressImageView = (IgProgressImageView) AnonymousClass7TF.A0F(view, R.id.image);
        this.A07 = igProgressImageView;
        this.A0B = DbU.A0Z(view, R.id.placeholder_layered_xma_reaction);
        this.A04 = DbU.A0Z(view, R.id.gradient_spinner_stub);
        this.A05 = DbU.A0Z(view, R.id.direct_persisted_layered_xma_label_stub);
        this.A06 = DbU.A0Z(view, R.id.layered_xma_text);
        this.A09 = DbX.A0J(view, R.id.doubletap_heart);
        this.A01 = DbX.A0J(view, R.id.top_icon);
        this.A0E = C73909Plk.A00(this, 28);
        this.A08 = C73909Plk.A00(this, 29);
        this.A0D = C73916Plr.A00(view, this, 39);
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
    }

    public final ImageView Afl() {
        return this.A09;
    }

    public final View BJd() {
        return this.A02;
    }

    public final C328087Dj BY0() {
        return this.A00;
    }

    public final void EeT(C328087Dj r1) {
        this.A00 = r1;
    }
}
