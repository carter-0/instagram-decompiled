package X;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.FXp  reason: case insensitive filesystem */
public final class C50310FXp implements 1DN {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C307896Rx A02;
    public final /* synthetic */ C277014uI A03;
    public final /* synthetic */ C277014uI A04;
    public final /* synthetic */ UserSession A05;

    public C50310FXp(Activity activity, Fragment fragment, C307896Rx r3, C277014uI r4, C277014uI r5, UserSession userSession) {
        this.A00 = activity;
        this.A05 = userSession;
        this.A01 = fragment;
        this.A02 = r3;
        this.A04 = r4;
        this.A03 = r5;
    }

    public final void DWm(Map map) {
        C299275ur r3;
        C277014uI r2;
        if (C346927vz.GRANTED.equals(map.get("android.permission.READ_CONTACTS"))) {
            Activity activity = this.A00;
            UserSession userSession = this.A05;
            1ES.A00(activity, AnonymousClass07i.A00(this.A01), FGQ.A00(activity, userSession, FFE.A01(false, FFE.A02(activity, userSession, false, false)), "find_friends_contacts", "ci", false, false));
            r3 = new C299275ur(this.A02);
            r2 = this.A04;
        } else {
            r3 = new C299275ur(this.A02);
            r2 = this.A03;
        }
        C299275ur.A00(r3.A00, AnonymousClass6Tm.A01, r2);
    }
}
