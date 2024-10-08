package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.user.model.User;

/* renamed from: X.OTp  reason: case insensitive filesystem */
public final class C70968OTp {
    public ViewGroup A00;
    public final int A01;
    public final FragmentActivity A02;
    public final AnonymousClass4DJ A03;
    public final UserSession A04;
    public final Capabilities A05;
    public final OZD A06;
    public final AnonymousClass7SX A07;
    public final AnonymousClass0eM A08 = AnonymousClass1YB.A00(C73822PkL.A00);

    public static final void A00(2Er r5, C70968OTp oTp, Integer num, boolean z) {
        String str;
        oTp.A07.D8D(r5.BJz(), num, C66640Ma9.A05(r5.BRZ(), r5.CUG()), z);
        if (1Wj.A00 != null) {
            1Wj A002 = DcL.A00();
            FragmentActivity fragmentActivity = oTp.A02;
            UserSession userSession = oTp.A04;
            User BSJ = r5.BSJ();
            if (BSJ != null) {
                str = BSJ.getId();
            } else {
                str = "";
            }
            A002.A00(fragmentActivity, userSession, "687473233153548", C70342O2u.A00(str));
        }
    }

    public C70968OTp(FragmentActivity fragmentActivity, AnonymousClass4DJ r4, UserSession userSession, Capabilities capabilities, AnonymousClass7SX r7) {
        this.A04 = userSession;
        this.A02 = fragmentActivity;
        this.A03 = r4;
        this.A07 = r7;
        this.A05 = capabilities;
        Context applicationContext = fragmentActivity.getApplicationContext();
        this.A06 = O0R.A00(applicationContext);
        this.A01 = applicationContext.getColor(2Yu.A03(applicationContext));
    }
}
