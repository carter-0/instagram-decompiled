package com.instagram.debug.devoptions.intf;

import X.AnonymousClass07i;
import X.AnonymousClass4DH;
import X.C250563lf;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.List;

public class DeveloperOptionsSectionStatic {
    public static List getItems(int i, UserSession userSession, FragmentActivity fragmentActivity, AnonymousClass4DH r3, AnonymousClass07i r4) {
        return C250563lf.A0K(i, userSession, fragmentActivity, r3, r4);
    }

    public static int[] getKeys() {
        return C250563lf.A0s();
    }

    public static int getTitleRes(int i) {
        return C250563lf.A00(i);
    }
}
