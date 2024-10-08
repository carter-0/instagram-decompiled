package X;

import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class ECI extends 1P0 {
    public final /* synthetic */ C229352nF A00;
    public final /* synthetic */ C307896Rx A01;
    public final /* synthetic */ C277014uI A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ C270394gf A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    public ECI(C229352nF r1, C307896Rx r2, C277014uI r3, UserSession userSession, C270394gf r5, String str, String str2, boolean z) {
        this.A00 = r1;
        this.A05 = str;
        this.A01 = r2;
        this.A03 = userSession;
        this.A06 = str2;
        this.A07 = z;
        this.A04 = r5;
        this.A02 = r3;
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(-520900686);
        ECI.super.onFinish();
        C49933FFm.A00.set(false);
        AnonymousClass0fD.A0A(-1977776747, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(422909366);
        1XO r13 = (1XO) obj;
        int A033 = AnonymousClass0fD.A03(2007645257);
        0qQ.A0B(r13, 0);
        List list = r13.A06;
        0qQ.A07(list);
        1Xj r0 = (1Xj) 00k.A0J(list);
        if (r0 == null) {
            i = -617900672;
        } else {
            C229352nF r5 = this.A00;
            String str = this.A05;
            List A1I = AnonymousClass7TE.A1I(C295375o3.A02(r0));
            C298855u9 A002 = C276114sa.A00.A00(false);
            A002.A00 = null;
            r5.A03(A002.A00(), C294895nD.DEFAULT, str, A1I, true, false);
            C307896Rx r6 = this.A01;
            C308206Td.A0K(r6, new C50300FXf(r5, r6, str, 1));
            UserSession userSession = this.A03;
            C270634h3 r1 = new C270634h3(ClipsViewerSource.ACTIVITY_CENTER, userSession);
            r1.A1C = this.A06;
            r1.A1B = userSession.A06;
            r1.A1F = str;
            r1.A1S = this.A07;
            C270394gf r02 = this.A04;
            0qQ.A0B(r02, 0);
            r1.A0O = r02;
            ClipsViewerConfig A003 = r1.A00();
            AnonymousClass6SO.A01 = new C51072Fo2(r6, this.A02);
            C243473Yx.A06(C308206Td.A04(r6), A003, userSession, 1005);
            i = 176355886;
        }
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(849379371, A032);
    }
}
