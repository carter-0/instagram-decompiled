package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class W52 implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ VVG A04;
    public final /* synthetic */ UserSession A05;

    public W52(FragmentActivity fragmentActivity, VVG vvg, UserSession userSession, int i, int i2, int i3) {
        this.A05 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = i;
        this.A01 = i2;
        this.A00 = i3;
        this.A04 = vvg;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        UserSession userSession = this.A05;
        STD.A05((AnonymousClass0iw) null, userSession, (String) null, "av_enrollment", "av_upsell", (String) null);
        FragmentActivity fragmentActivity = this.A03;
        1ES.A00(fragmentActivity, AnonymousClass07i.A00(fragmentActivity), C48313EcW.A00(userSession, this.A02, this.A01, this.A00, 1));
        VVG vvg = this.A04;
        C277014uI r2 = vvg.A02;
        C299275ur.A00(vvg.A00, vvg.A01, r2);
    }
}
