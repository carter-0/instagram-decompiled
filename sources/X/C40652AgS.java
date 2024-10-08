package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.AgS  reason: case insensitive filesystem */
public final /* synthetic */ class C40652AgS implements C13678Ten {
    public final /* synthetic */ C322456vr A00;

    public /* synthetic */ C40652AgS(C322456vr r1) {
        this.A00 = r1;
    }

    public final void Cxg() {
        C322456vr r5 = this.A00;
        if (System.currentTimeMillis() - -1 < 300) {
            AnonymousClass2S0.A01.A05(14);
            UserSession userSession = r5.A05;
            AnonymousClass0BO.A00(userSession).CIe(r5.A04.requireContext(), userSession, "double_tap_tab_bar_profile_action_bar");
        }
    }
}
