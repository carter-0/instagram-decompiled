package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;

public final class GXC extends C252233om {
    public C295825oy A00;
    public boolean A01;
    public boolean A02;
    public final FragmentActivity A03;
    public final UserSession A04;
    public final String A05;
    public final Fragment A06;
    public final C229352nF A07;
    public final C229372nH A08 = new C52315GNh(this, 0);
    public final C55488HiW A09;

    public final void A00(C270634h3 r12, C296925qs r13, boolean z, boolean z2) {
        C295825oy r3 = r13.A01;
        this.A00 = r3;
        1Xj BPf = r13.BPf();
        if (BPf.A4R()) {
            String A30 = BPf.A30();
            if (A30 != null) {
                1ES.A03(C3724090s.A05(this.A04, A30, "explore_1x2", (String) null));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        C229352nF r4 = this.A07;
        String str = this.A05;
        C229372nH r0 = this.A08;
        r4.A05(r0, str);
        UserSession userSession = this.A04;
        r4.A03(r3.A03, C294895nD.DEFAULT, str, r3.A03(userSession), true, false);
        if (z) {
            r4.A04(r0, str);
        }
        FragmentActivity fragmentActivity = this.A03;
        r12.A1F = str;
        ClipsViewerConfig A002 = r12.A00();
        if (z2) {
            C250563lf.A0Y(fragmentActivity, A002, userSession);
        } else {
            C250563lf.A0X(fragmentActivity, A002, userSession);
        }
    }

    public final void onDestroy() {
        this.A07.A07(this.A05);
    }

    public final void onResume() {
        Bundle bundle;
        C295825oy r2 = this.A00;
        C55488HiW hiW = this.A09;
        if (!(hiW == null || r2 == null || !this.A01)) {
            this.A01 = false;
            C14074TpO tpO = hiW.A00.A06;
            if (tpO == null) {
                0qQ.A0F("grid");
                throw AnonymousClass00P.createAndThrow();
            }
            tpO.A08(r2.A0A);
        }
        this.A07.A05(this.A08, this.A05);
        if (!this.A02) {
            Fragment fragment = this.A06;
            if (fragment.isResumed() && (bundle = fragment.mArguments) != null && bundle.getBoolean("ClipsConstants.ARG_AUTO_LAUNCH_EXPLORE_CLIPS_VIEWER", false)) {
                11Z.A04(new C57828Ih7(bundle, this), 750);
                this.A02 = true;
            }
        }
    }

    public GXC(Fragment fragment, FragmentActivity fragmentActivity, UserSession userSession, C55488HiW hiW, String str) {
        AnonymousClass7TG.A1U(str, userSession, fragmentActivity);
        this.A05 = str;
        this.A04 = userSession;
        this.A03 = fragmentActivity;
        this.A06 = fragment;
        this.A09 = hiW;
        this.A07 = C51967G9n.A0Y(userSession);
    }
}
