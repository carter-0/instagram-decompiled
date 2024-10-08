package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.Jpp  reason: case insensitive filesystem */
public final class C60704Jpp extends C249703kE implements AnonymousClass3NL, XC0 {
    public AnonymousClass3NL A00;
    public final float A01;
    public final IgSimpleImageView A02;
    public final IgSimpleImageView A03;
    public final IgSimpleImageView A04;
    public final IgTextView A05;
    public final IgImageView A06;
    public final C59973Jci A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final int A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60704Jpp(View view) {
        super(view);
        0qQ.A0B(view, 1);
        Context A0S = AnonymousClass7TE.A0S(view);
        float A002 = 0nA.A00(A0S, 16.0f);
        this.A01 = A002;
        this.A02 = DbX.A0Y(view, R.id.card);
        this.A06 = DbX.A0b(view, R.id.unseen_badge);
        this.A05 = DbX.A0Z(view, R.id.label);
        this.A04 = DbX.A0Y(view, R.id.overlay_icon);
        this.A03 = DbX.A0Y(view, R.id.loading_spinner);
        0eO r3 = 0eO.A02;
        this.A08 = AnonymousClass0eN.A00(r3, new MJ8(37, view, this));
        this.A09 = AnonymousClass0eN.A00(r3, new MJ8(38, view, this));
        this.A07 = new C59973Jci(A0S, A002, false, false);
        this.A0A = A0S.getResources().getDimensionPixelOffset(R.dimen.abc_button_padding_horizontal_material) / 2;
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(view);
        A0m.A06 = true;
        A0m.A04 = this;
        A0m.A02 = 0.95f;
        A0m.A00();
    }

    public final void A00(boolean z, boolean z2) {
        int i;
        int i2 = 0;
        if (z) {
            i = this.A0A;
        } else {
            i = 0;
        }
        if (z2) {
            i2 = this.A0A;
        }
        0nA.A0d(JTO.A0F(this), i);
        0nA.A0U(JTO.A0F(this), i2);
    }

    public final void DP5(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass3NL r0 = this.A00;
        if (r0 != null) {
            r0.DP5(view);
        }
    }

    public final boolean Dqe(View view) {
        0qQ.A0B(view, 0);
        AnonymousClass3NL r0 = this.A00;
        if (r0 == null || !r0.Dqe(view)) {
            return false;
        }
        return true;
    }

    public final void Eui(boolean z) {
        IgSimpleImageView igSimpleImageView = this.A03;
        if (z) {
            igSimpleImageView.setVisibility(0);
            ((C338507i4) this.A09.getValue()).start();
            C60005JdE jdE = (C60005JdE) this.A08.getValue();
            jdE.A04 = true;
            jdE.invalidateSelf();
            this.A02.setSelected(true);
            return;
        }
        igSimpleImageView.setVisibility(4);
        ((C338507i4) this.A09.getValue()).stop();
        IgSimpleImageView igSimpleImageView2 = this.A02;
        igSimpleImageView2.setSelected(false);
        C60005JdE jdE2 = (C60005JdE) this.A08.getValue();
        jdE2.A04 = false;
        jdE2.invalidateSelf();
        igSimpleImageView2.setSelected(false);
    }

    public final void CLk() {
        this.itemView.setVisibility(4);
    }

    public final void Ev3() {
        this.itemView.setVisibility(0);
    }

    /* renamed from: Beu */
    public final RectF AhX() {
        View A0F = JTO.A0F(this);
        RectF rectF = 0nA.A01;
        RectF A0Y = AnonymousClass7TE.A0Y();
        0nA.A0L(A0Y, A0F);
        A0Y.left = A0Y.centerX();
        A0Y.top = A0Y.centerY();
        A0Y.right = A0Y.centerX();
        A0Y.bottom = A0Y.centerY();
        return A0Y;
    }
}
