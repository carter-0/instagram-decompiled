package X;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.LjG  reason: case insensitive filesystem */
public abstract class C64854LjG implements AnonymousClass3NL {
    public AnonymousClass4DH A00;
    public C60239Jhw A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final TextView A08;
    public final TextView A09;
    public final TextView A0A;
    public final TextView A0B;
    public final ConstraintLayout A0C;
    public final AnonymousClass2gO A0D;
    public final AnonymousClass0iw A0E;
    public final UserSession A0F;
    public final IgImageView A0G;
    public final IgImageView A0H;
    public final C240913Nc A0I;
    public final AnonymousClass0eM A0J = AnonymousClass1YB.A00(new MM8(this, 6));
    public final View A0K;
    public final View A0L;

    public final void DP5(View view) {
        C60239Jhw jhw;
        0qQ.A0B(view, 0);
        if (!view.equals(this.A08)) {
            return;
        }
        if (this instanceof C62255Kcp) {
            C60239Jhw jhw2 = this.A01;
            if ((jhw2 instanceof C62309Kdh) && jhw2 != null) {
                JTU.A1P(jhw2.A03.A00);
            }
        } else if ((this instanceof C62253Kcn) && (jhw = this.A01) != null) {
            JTU.A1P(jhw.A03.A00);
        }
    }

    public final boolean Dqe(View view) {
        C60239Jhw jhw;
        C318136oS A002;
        int i;
        C62309Kdh kdh;
        0qQ.A0B(view, 0);
        if (!view.equals(this.A08)) {
            if (view.equals(this.A06)) {
                jhw = this.A01;
                if (jhw == null) {
                    return true;
                }
                A002 = C318116oQ.A00(jhw);
                i = 37;
            } else if (view.equals(this.A04)) {
                jhw = this.A01;
                if (jhw == null) {
                    return true;
                }
                A002 = C318116oQ.A00(jhw);
                i = 36;
            } else if (!view.equals(this.A02) || (jhw = this.A01) == null) {
                return true;
            } else {
                A002 = C318116oQ.A00(jhw);
                i = 34;
            }
            C66184MGv.A02(jhw, A002, i);
            return true;
        } else if (!(this instanceof C62255Kcp)) {
            return true;
        } else {
            C60239Jhw jhw2 = this.A01;
            if (!(jhw2 instanceof C62309Kdh) || (kdh = (C62309Kdh) jhw2) == null) {
                return true;
            }
            JTU.A1P(kdh.A01);
            return true;
        }
    }

    public C64854LjG(View view, AnonymousClass4DH r5, UserSession userSession, C60239Jhw jhw) {
        this.A0F = userSession;
        this.A05 = view;
        this.A00 = r5;
        this.A01 = jhw;
        this.A0E = r5;
        View A0G2 = AnonymousClass7TF.A0G(view, R.id.iglive_header_layout);
        this.A03 = A0G2;
        this.A0L = AnonymousClass7TF.A0G(view, R.id.iglive_header_text_container);
        this.A0K = AnonymousClass7TF.A0G(view, R.id.iglive_header_avatar_text_container);
        this.A0G = DbX.A0b(view, R.id.reel_viewer_profile_picture);
        this.A09 = AnonymousClass7TG.A0R(view, R.id.iglive_header_main_text);
        this.A0A = AnonymousClass7TG.A0R(view, R.id.iglive_header_main_text_marquee);
        this.A0I = C240903Nb.A00(view, R.id.iglive_header_secondary_text_stub);
        this.A0C = (ConstraintLayout) AnonymousClass7TF.A0F(view, R.id.iglive_label_layout);
        this.A08 = AnonymousClass7TG.A0R(view, R.id.iglive_label);
        this.A06 = AnonymousClass7TF.A0G(view, R.id.iglive_view_count_container);
        this.A0H = DbX.A0b(view, R.id.iglive_view_count_avatar);
        this.A07 = AnonymousClass7TF.A0G(view, R.id.iglive_view_count_icon);
        this.A0B = AnonymousClass7TG.A0R(view, R.id.iglive_view_count);
        this.A04 = AnonymousClass7TF.A0G(view, R.id.iglive_header_options);
        this.A02 = AnonymousClass7TF.A0G(view, R.id.iglive_header_close);
        this.A0D = new C64317LZr(this, 24);
        LY5.A01(A0G2, 41, this);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(this.A08);
        A0m.A04 = this;
        Integer num = AnonymousClass05K.A01;
        A0m.A05 = num;
        A0m.A00();
        AnonymousClass3NG A0m2 = AnonymousClass7TE.A0m(this.A06);
        A0m2.A04 = this;
        A0m2.A05 = num;
        A0m2.A00();
        AnonymousClass3NG A0m3 = AnonymousClass7TE.A0m(this.A04);
        A0m3.A04 = this;
        A0m3.A05 = num;
        A0m3.A00();
        AnonymousClass3NG A0m4 = AnonymousClass7TE.A0m(this.A02);
        A0m4.A04 = this;
        A0m4.A05 = num;
        A0m4.A00();
    }
}
