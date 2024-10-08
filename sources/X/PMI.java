package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.instagram.android.R;
import com.instagram.ui.widget.slideouticon.SlideInAndOutIconView;

public final class PMI implements C74361Ptb {
    public OK5 A00;
    public final C252063oV A01;
    public final C252063oV A02;
    public final C70519O9s A03;
    public final AnonymousClass0eM A04 = C73896PlX.A00(this, 33);
    public final AnonymousClass0eM A05 = C73896PlX.A00(this, 34);
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07 = C73896PlX.A00(this, 36);
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C = C73896PlX.A00(this, 41);
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F = C73896PlX.A00(this, 44);
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I = C73896PlX.A00(this, 47);

    /* renamed from: A00 */
    public final void ADN(C68295N9i n9i) {
        AnonymousClass0eM r0;
        AnonymousClass0eM r02;
        AnonymousClass0eM r03;
        AnonymousClass0eM r04;
        0qQ.A0B(n9i, 0);
        int i = 0;
        if (!n9i.A0Z || !n9i.A0S) {
            ((C70776OKw) this.A06.getValue()).A00(false);
        } else {
            ((C70776OKw) this.A06.getValue()).A00(true);
            boolean z = n9i.A0V;
            AnonymousClass0eM r3 = this.A07;
            ImageView imageView = (ImageView) r3.getValue();
            if (z) {
                r0 = this.A0A;
            } else {
                r0 = this.A08;
            }
            imageView.setImageDrawable(JTO.A0D(r0));
            View A0c = AnonymousClass7TE.A0c(r3);
            if (z) {
                r02 = this.A0B;
            } else {
                r02 = this.A09;
            }
            A0c.setContentDescription(DbS.A0t(r02));
            boolean z2 = n9i.A0Q;
            AnonymousClass0eM r32 = this.A04;
            DbW.A1R(r32, 0);
            SlideInAndOutIconView slideInAndOutIconView = (SlideInAndOutIconView) r32.getValue();
            if (z2) {
                r03 = this.A0E;
            } else {
                r03 = this.A0D;
            }
            slideInAndOutIconView.setIcon(JTO.A0D(r03));
            View A0c2 = AnonymousClass7TE.A0c(r32);
            if (z2) {
                r04 = this.A0G;
            } else {
                r04 = this.A0H;
            }
            A0c2.setContentDescription(DbS.A0t(r04));
        }
        if (n9i.A0c) {
            AnonymousClass0eM r1 = this.A0I;
            DbW.A1R(r1, 0);
            Integer num = n9i.A0A;
            if (num != null) {
                ((ProgressBar) r1.getValue()).setProgress(num.intValue());
            }
        } else if (this.A02.CVM()) {
            C51969G9p.A1M(this.A0I.getValue());
        }
        if (n9i.A0M) {
            i = 4;
        }
        DbW.A1R(this.A07, i);
        DbW.A1R(this.A0F, i);
        DbW.A1R(this.A0C, i);
    }

    public PMI(View view, C70519O9s o9s) {
        this.A03 = o9s;
        this.A01 = C66581MXm.A0T(view, R.id.player_controls_bottom_stub);
        this.A02 = C66581MXm.A0T(view, R.id.player_controls_volume_slider_stub);
        this.A0G = C73896PlX.A00(view, 45);
        this.A0H = C73896PlX.A00(view, 46);
        this.A09 = C73896PlX.A00(view, 38);
        this.A0B = C73896PlX.A00(view, 40);
        this.A0D = C73896PlX.A00(view, 42);
        this.A0E = C73896PlX.A00(view, 43);
        this.A08 = C73896PlX.A00(view, 37);
        this.A0A = C73896PlX.A00(view, 39);
        this.A06 = C73896PlX.A00(this, 35);
    }
}
