package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Jpu  reason: case insensitive filesystem */
public final class C60709Jpu extends C249703kE implements AnonymousClass3N3 {
    public K71 A00;
    public C62947Koz A01;
    public Reel A02;
    public final TextView A03;
    public final TextView A04;
    public final C60005JdE A05;
    public final IgImageView A06;
    public final GradientSpinner A07;

    public final void CLE() {
    }

    public final boolean EtJ() {
        return false;
    }

    public final void Eu3(AnonymousClass0iw r1) {
    }

    public final RectF AeG() {
        return 0nA.A0F(this.itemView);
    }

    public final View AeY() {
        return this.itemView;
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.itemView);
    }

    public final GradientSpinner Bkt() {
        return this.A07;
    }

    public C60709Jpu(View view) {
        super(view);
        Context context = view.getContext();
        this.A04 = DbU.A0G(view, R.id.profile_view_effects_ar_effect_title);
        this.A03 = DbU.A0G(view, R.id.profile_view_effects_ar_effect_creator);
        IgImageView A0b = DbT.A0b(view, R.id.profile_view_effects_ar_effect_icon);
        this.A06 = A0b;
        C60005JdE jdE = new C60005JdE(context, 0.5f, 0.6f, 0.0f, 0.2f, 0.2f, 0, 0, 0, true, false);
        this.A05 = jdE;
        this.A07 = new GradientSpinner(context);
        view.setBackground(jdE);
        C64286LYm.A00(view, 9, this);
        LY0.A00(view, 37, this);
        A0b.A0I = new C64868LjU(this, 1);
    }
}
