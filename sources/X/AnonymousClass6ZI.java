package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.6ZI  reason: invalid class name */
public final class AnonymousClass6ZI {
    public final /* synthetic */ AnonymousClass6Z5 A00;

    public AnonymousClass6ZI(AnonymousClass6Z5 r1) {
        this.A00 = r1;
    }

    public final void A00(boolean z) {
        Context context;
        AnonymousClass6Z5 r5 = this.A00;
        UserSession userSession = r5.A09;
        if (userSession != null) {
            0xY AR4 = 1Au.A00(userSession).A01.AR4();
            AR4.E5T("live_viewer_picture_in_picture_enabled", z);
            AR4.apply();
            UserSession userSession2 = r5.A09;
            if (userSession2 != null) {
                1Av A002 = 1Au.A00(userSession2);
                A002.A6P.Epx(A002, false, 1Av.A8a[119]);
                r5.A17.EHd();
                Fragment fragment = (Fragment) r5.A1A.get();
                if (fragment != null && (context = fragment.getContext()) != null) {
                    int i = 2131965451;
                    if (z) {
                        i = 2131965452;
                    }
                    C59689JTv.A09(context, context.getString(i));
                    return;
                }
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }
}
