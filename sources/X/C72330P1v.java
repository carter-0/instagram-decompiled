package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.reels.Reel;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

/* renamed from: X.P1v  reason: case insensitive filesystem */
public final class C72330P1v implements C330047Lf {
    public final int A00;
    public final FragmentActivity A01;
    public final UserSession A02;
    public final Capabilities A03;
    public final C254793t3 A04;
    public final boolean A05;

    public C72330P1v(FragmentActivity fragmentActivity, UserSession userSession, Capabilities capabilities, C254793t3 r5, int i, boolean z) {
        DbW.A1O(userSession, 1, capabilities);
        this.A02 = userSession;
        this.A01 = fragmentActivity;
        this.A05 = z;
        this.A04 = r5;
        this.A00 = i;
        this.A03 = capabilities;
    }

    public final void CnZ(View view, View view2, View view3, View view4, View view5, View view6, View view7, View view8, View view9, View view10) {
    }

    public final void CuD() {
    }

    public final void Cup() {
    }

    public final void Cuq() {
    }

    public final void Cuv() {
    }

    public final void CxX() {
    }

    public final void CyL() {
    }

    public final void D0S() {
    }

    public final void D4M(View view) {
    }

    public final void DTQ(boolean z) {
    }

    public final void DWq() {
    }

    public final void DcA(Reel reel, GradientSpinnerAvatarView gradientSpinnerAvatarView) {
    }

    public final void Djt() {
    }

    public final void Dju() {
    }

    public final void DmI() {
    }

    public final void DmO(boolean z) {
    }

    public final void Dmg(boolean z) {
    }

    public final void Dqj() {
    }

    public final void Dqs() {
    }

    public final void DwG(MessagingUser messagingUser) {
    }

    public static final void A00(Bundle bundle, Fragment fragment, C72330P1v p1v) {
        C331157Pu r2;
        AnonymousClass37E r0 = AnonymousClass37D.A00;
        FragmentActivity fragmentActivity = p1v.A01;
        AnonymousClass37D A012 = r0.A01(fragmentActivity);
        if (p1v.A05) {
            if (A012 != null) {
                r2 = C48943Emh.A00(A012);
            } else {
                r2 = null;
            }
            fragment.setArguments(bundle);
            if (r2 != null) {
                C331127Pr A002 = C69861NtP.A00(p1v.A02);
                A002.A0u = true;
                r2.A0F(fragment, A002);
                return;
            }
            return;
        }
        if (A012 != null) {
            A012.A0B();
        }
        Dba.A0w(bundle, fragment, DbS.A0M(fragmentActivity, p1v.A02));
    }

    public final void DrD(String str) {
        A00(1as.A04.A01.A02(this.A03, this.A04, (Integer) null, this.A00, false, true, false), new NJY(), this);
    }
}
