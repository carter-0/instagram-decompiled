package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;

public final class FOJ implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ MusicAssetModel A02;
    public final /* synthetic */ C234502xy A03;
    public final /* synthetic */ AnonymousClass70J A04;
    public final /* synthetic */ User A05;

    public FOJ(AnonymousClass0iw r1, UserSession userSession, MusicAssetModel musicAssetModel, C234502xy r4, AnonymousClass70J r5, User user) {
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = user;
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = musicAssetModel;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(902212123);
        C234502xy r2 = this.A03;
        if (r2 != null && r2.isPlaying()) {
            r2.pause();
        }
        AnonymousClass70J r6 = this.A04;
        User user = this.A05;
        C322296vZ r22 = r6.A06;
        Dba.A1S(r22, C318116oQ.A00(r22), 30, false);
        user.A03.EYU(false);
        AnonymousClass1Nd.A00(r6.A03).A00(new 2Cy(user));
        UserSession userSession = this.A01;
        String moduleName = this.A00.getModuleName();
        MusicAssetModel musicAssetModel = this.A02;
        String str = musicAssetModel.A0E;
        0qQ.A07(str);
        long A07 = DbZ.A07(str);
        C54689HOu hOu = C54689HOu.A0u;
        String A0k = DbS.A0k();
        String str2 = musicAssetModel.A0B;
        0qQ.A07(str2);
        C56326Hwd.A00(hOu, (AnonymousClass8ZN) null, userSession, 00y.A0n(10, str2), moduleName, A0k, (String) null, A07);
        AnonymousClass0fD.A0C(359928271, A052);
    }
}
