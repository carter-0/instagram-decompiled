package com.instagram.gpslocation.impl;

import X.09i;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C13673Tei;
import X.C51974G9v;
import X.C63905LBm;
import X.C8779R9f;
import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;

public final class GPSLocationLibraryImpl extends C63905LBm {
    public final UserSession A00;

    public C8779R9f createGooglePlayLocationSettingsController(Activity activity, UserSession userSession, C13673Tei tei, String str, String str2) {
        0qQ.A0B(activity, 0);
        C51974G9v.A1M(tei, str, str2);
        return new C8779R9f(activity, this.A00, tei, str, str2);
    }

    public GPSLocationLibraryImpl(String str) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str);
        this.A00 = 09i.A0A.A06(A0a);
    }
}
