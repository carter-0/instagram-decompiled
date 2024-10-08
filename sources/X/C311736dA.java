package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.fanclub.api.FanClubApi;

/* renamed from: X.6dA  reason: invalid class name and case insensitive filesystem */
public final class C311736dA extends 2YL {
    public UserSession A00;
    public final C311756dC A01;
    public final FanClubApi A02;

    public /* synthetic */ C311736dA(Context context, UserSession userSession) {
        C311756dC A002 = C311746dB.A00(context, userSession);
        FanClubApi fanClubApi = new FanClubApi(userSession);
        0qQ.A0B(userSession, 2);
        0qQ.A0B(A002, 3);
        this.A00 = userSession;
        this.A01 = A002;
        this.A02 = fanClubApi;
    }
}
