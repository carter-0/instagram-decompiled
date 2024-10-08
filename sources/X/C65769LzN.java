package X;

import android.view.View;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.LzN  reason: case insensitive filesystem */
public final class C65769LzN implements MVV {
    public LG7 A00;
    public final UserSession A01;
    public final /* synthetic */ KHO A02;

    public final void Ev1(View view) {
        0qQ.A0B(view, 0);
        FrameLayout frameLayout = this.A02.A04;
        frameLayout.removeAllViews();
        view.setImportantForAccessibility(1);
        frameLayout.addView(view);
        A00();
    }

    public C65769LzN(UserSession userSession, KHO kho) {
        this.A02 = kho;
        this.A01 = userSession;
    }

    private final void A00() {
        KHO kho = this.A02;
        C294975nL A0c = JTP.A0c(kho.A04, 0);
        A0c.A04 = 0;
        C294975nL A0E = A0c.A0E(KHO.A06);
        A0E.A0T((float) kho.A05.getBottom(), kho.getResources().getDimension(R.dimen.asset_picker_redesign_sticker_height));
        C65724Lye.A00(A0E, kho, 28);
    }

    public final void CLg() {
        KHO kho = this.A02;
        C294975nL A0b = JTP.A0b(kho.A04);
        A0b.A03 = 8;
        C294975nL A0E = A0b.A0E(KHO.A06);
        A0E.A0K((float) kho.A05.getBottom());
        C65724Lye.A00(A0E, kho, 27);
    }

    public final boolean onBackPressed() {
        LPF lpf;
        LG7 lg7 = this.A00;
        if (lg7 == null) {
            return false;
        }
        KKN kkn = lg7.A01;
        if ((kkn == null || !kkn.onBackPressed()) && (lpf = this.A02.A01) != null) {
            return lpf.A06();
        }
        return false;
    }

    public final void CLB() {
        CLg();
        this.A00 = null;
    }

    public final void Etw() {
        A00();
        C63705L3p l3p = new C63705L3p(true, true);
        KHO kho = this.A02;
        LG7 lg7 = new LG7(AnonymousClass7TE.A0S(kho), this.A01, l3p);
        this.A00 = lg7;
        Fragment fragment = kho.A00;
        if (fragment != null) {
            FrameLayout frameLayout = kho.A04;
            0hq childFragmentManager = fragment.getChildFragmentManager();
            0qQ.A07(childFragmentManager);
            lg7.A00(frameLayout, childFragmentManager, new C64974LlD(kho, 3));
        }
    }
}
