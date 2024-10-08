package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FuM  reason: case insensitive filesystem */
public final class C51452FuM implements Runnable {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ C319406qX A02;

    public C51452FuM(Fragment fragment, UserSession userSession, C319406qX r3) {
        this.A00 = fragment;
        this.A01 = userSession;
        this.A02 = r3;
    }

    public final void run() {
        Fragment fragment = this.A00;
        if (fragment.isVisible()) {
            C51127Foz foz = new C51127Foz(4);
            1Z9 A002 = C48920EmK.A00();
            UserSession userSession = this.A01;
            A002.A01(fragment, userSession, foz).A06("ig_profile_photo_change_chaining", C317816nt.A00(userSession).A08("ig_profile_photo_change_chaining"));
            this.A02.A00 = true;
            if (182.A06(0Tu.A05, userSession, 36319746694323807L)) {
                new C46402DeP(userSession).A01("IG_PROFILE_PHOTO_CHANGE_CHAINING");
            } else {
                0xY A0N = AnonymousClass7TF.A0N(userSession);
                A0N.E5T(AnonymousClass000.A00(612), true);
                A0N.apply();
            }
            FFL.A02(C48152EZu.A0K, userSession, "upsell_impressions", (Map) null, 2);
        }
    }
}
