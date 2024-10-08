package X;

import android.content.Context;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class OGP {
    public Context A00;
    public TextView A01;
    public TextView A02;
    public GradientSpinnerAvatarView[] A03 = new GradientSpinnerAvatarView[9];
    public final C252063oV A04;

    public OGP(Context context, ViewStub viewStub) {
        0qQ.A0B(context, 2);
        this.A00 = context;
        C252063oV A002 = 2b1.A00(viewStub);
        this.A04 = A002;
        A002.EeU(new C72245OzD(this, 6));
    }
}
