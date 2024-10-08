package X;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.igds.components.faceswarm.IgdsFaceSwarm;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.Mha  reason: case insensitive filesystem */
public final class C67059Mha implements AnonymousClass3N3, C74455PvA {
    public final C71662eb A00;
    public final C71662eb A01;
    public final C71662eb A02;
    public final C252063oV A03;
    public final GradientSpinnerAvatarView A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C73918Ply(this, 2));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C73918Ply(this, 3));
    public final AnonymousClass0eM A07 = AnonymousClass1YB.A00(new C73918Ply(this, 4));

    public C67059Mha(C71662eb r3, C71662eb r4, C71662eb r5, C252063oV r6, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
        0qQ.A0B(gradientSpinnerAvatarView, 1);
        this.A04 = gradientSpinnerAvatarView;
        this.A03 = r6;
        this.A01 = r3;
        this.A02 = r4;
        this.A00 = r5;
    }

    public final void A02(AnonymousClass9IV r3, AnonymousClass0iw r4, ImageUrl imageUrl) {
        AnonymousClass7TF.A1H(imageUrl, r4);
        C66582MXn.A1G(this.A03);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A04;
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0F(r3, r4, imageUrl);
    }

    public final boolean EtJ() {
        return true;
    }

    public final void A00(Drawable drawable) {
        C252063oV r1 = this.A03;
        if (!r1.CVM() || r1.getView().getVisibility() != 0) {
            this.A04.setBottomBadgeDrawable(drawable);
        } else {
            ((IgdsFaceSwarm) r1.getView()).setBottomBadgeDrawable(drawable);
        }
    }

    public final void A01(Drawable drawable) {
        C252063oV r1 = this.A03;
        if (!r1.CVM() || r1.getView().getVisibility() != 0) {
            this.A04.setPresenceBadgeDrawable(drawable);
        } else {
            ((IgdsFaceSwarm) r1.getView()).setPresenceBadgeDrawable(drawable);
        }
    }

    public final RectF AeG() {
        return 0nA.A0F(this.A04);
    }

    public final /* bridge */ /* synthetic */ View AeY() {
        return this.A04;
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A04);
    }

    public final GradientSpinner Bkt() {
        return this.A04.A0O;
    }

    public final void CLE() {
        this.A04.setVisibility(8);
    }

    public final void DOd() {
        this.A04.A0A();
    }

    public final void DOe() {
        this.A04.A09();
    }

    public final void DQc() {
        this.A04.A0A();
    }

    public final void Eu3(AnonymousClass0iw r3) {
        this.A04.setVisibility(0);
    }

    public final void A03(List list, AnonymousClass0iw r6) {
        boolean A1X = DbW.A1X(list);
        C252063oV r2 = this.A03;
        C66580MXl.A1Q(r2, A1X ? 1 : 0);
        this.A04.setVisibility(8);
        ((IgdsFaceSwarm) r2.getView()).A08 = A1X;
        ((IgdsFaceSwarm) r2.getView()).setImageUrls(list, r6);
    }
}
