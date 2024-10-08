package X;

import android.view.View;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.spinner.SpinnerImageView;

public final class WAA implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ C20962X6p A03;
    public final /* synthetic */ SpinnerImageView A04;
    public final /* synthetic */ boolean A05;

    public WAA(Reel reel, C20962X6p x6p, SpinnerImageView spinnerImageView, int i, int i2, boolean z) {
        this.A05 = z;
        this.A04 = spinnerImageView;
        this.A03 = x6p;
        this.A02 = reel;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-1641911319);
        if (!this.A05) {
            this.A04.setVisibility(0);
        }
        C20962X6p x6p = this.A03;
        if (x6p != null) {
            x6p.Dcc(this.A04, JTP.A0r(this.A02), 0, this.A00, this.A01);
        }
        AnonymousClass0fD.A0C(-35092826, A052);
    }
}
