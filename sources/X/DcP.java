package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class DcP extends C392289uY implements G76 {
    public C49469EwA A00;
    public AnonymousClass2Ep A01;
    public final UserSession A02;
    public final AnonymousClass4kA A03;
    public final FragmentActivity A04;

    public final View A06(Context context) {
        0qQ.A0B(context, 0);
        C49469EwA ewA = new C49469EwA(context, this);
        this.A00 = ewA;
        return ewA.A00;
    }

    public final void A07(C39761A8b a8b, C74401PuH puH, AnonymousClass2Ep r7, boolean z) {
        String BA0;
        0qQ.A0B(puH, 1);
        if (!(r7 == null || !r7.CUG() || !AnonymousClass48O.A01(r7.C6a()) || r7.BHS() == 8 || !r7.CUJ() || (BA0 = r7.BA0()) == null || BA0.length() == 0)) {
            if (182.A06(0Tu.A05, this.A02, 36315881222966926L)) {
                0xa r3 = this.A03.A00;
                if (!r3.getBoolean("discoverable_chats_has_seen_link_sharing_banner", false) && r3.getInt(C273654mx.A00(2286), 0) >= 2 && r3.getBoolean(AnonymousClass000.A00(3021), false)) {
                    this.A01 = r7;
                    puH.DoM(this);
                    return;
                }
            }
        }
        puH.onFailure();
    }

    public final /* synthetic */ void onBannerDismissed() {
    }

    public final void A04(boolean z) {
        0xY AR4 = this.A03.A00.AR4();
        AR4.E5T("discoverable_chats_has_seen_link_sharing_banner", true);
        AR4.apply();
    }

    public final void onActionClicked() {
        String BA0;
        AnonymousClass2Ep r0 = this.A01;
        if (r0 != null && (BA0 = r0.BA0()) != null) {
            FragmentActivity fragmentActivity = this.A04;
            C48300EcJ.A00(fragmentActivity, BA0);
            C59689JTv.A07(fragmentActivity, 2131963179);
            C49469EwA ewA = this.A00;
            if (ewA != null) {
                ewA.A00.setVisibility(8);
            }
        }
    }

    public DcP(FragmentActivity fragmentActivity, UserSession userSession) {
        this.A04 = fragmentActivity;
        this.A02 = userSession;
        this.A03 = AnonymousClass4k9.A00(userSession);
    }
}
