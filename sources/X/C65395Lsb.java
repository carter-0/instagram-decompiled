package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* renamed from: X.Lsb  reason: case insensitive filesystem */
public final class C65395Lsb implements MSS, C66399MQf {
    public static final C65395Lsb A00 = new Object();

    public final Fragment B7q(Object obj) {
        0qQ.A0B(obj, 0);
        KTE kte = (KTE) obj;
        String str = kte.A01;
        UserSession userSession = kte.A00;
        1Av A002 = 1Au.A00(userSession);
        Bundle A003 = Q21.A00(AnonymousClass7TH.A0h("IgReactFragment.ARGUMENT_SHOULD_INSET_ACTION_BAR_HEIGHT", true, AnonymousClass7TE.A1L("settingType", "feed"), AnonymousClass7TE.A1L("enableGeoGating", Boolean.valueOf(A002.A24("feed"))), AnonymousClass7TE.A1L("selectedRegions", AnonymousClass7TE.A1D(A002.A0I("feed")))));
        1WM.getInstance().getFragmentFactory();
        1WM.getInstance();
        T8B t8b = new T8B(userSession, "IgMediaGeoGatingSettingsApp");
        t8b.A07 = str;
        t8b.A00(A003);
        Bundle AEV = t8b.AEV();
        R8S r8s = new R8S();
        r8s.setArguments(AEV);
        return r8s;
    }
}
