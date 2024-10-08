package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.FOb  reason: case insensitive filesystem */
public final class C50086FOb implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ C47032DpO A05;
    public final /* synthetic */ C67058MhZ A06;
    public final /* synthetic */ C294875nB A07;
    public final /* synthetic */ DirectShareTarget A08;
    public final /* synthetic */ Reel A09;

    public C50086FOb(C47032DpO dpO, C67058MhZ mhZ, C294875nB r3, DirectShareTarget directShareTarget, Reel reel, int i, int i2, int i3, int i4, int i5) {
        this.A07 = r3;
        this.A09 = reel;
        this.A05 = dpO;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = i3;
        this.A03 = i4;
        this.A08 = directShareTarget;
        this.A02 = i5;
        this.A06 = mhZ;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1231190655);
        C294875nB r2 = this.A07;
        Reel reel = this.A09;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A05.A08.A04;
        int i = this.A00;
        int i2 = this.A01;
        int i3 = this.A04;
        int i4 = this.A03;
        r2.Dnr(this.A06, this.A08, reel, gradientSpinnerAvatarView, i, i2, i3, i4, this.A02);
        AnonymousClass0fD.A0C(909008930, A052);
    }
}
