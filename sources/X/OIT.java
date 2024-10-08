package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

public final class OIT {
    public AnonymousClass7DW A00;
    public 1iA A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final Activity A05;
    public final C72499P8i A06;
    public final C72520P9d A07;
    public final PA2 A08;
    public final UserSession A09;
    public final C70846ONz A0A;
    public final C68495NKo A0B;
    public final C72524P9h A0C;
    public final C67759MuF A0D;
    public final AnonymousClass7DS A0E = new P88(this, 0);
    public final AnonymousClass7DU A0F = new P8P(this);
    public final AnonymousClass7X4 A0G;
    public final AnonymousClass7XA A0H;
    public final AnonymousClass7ST A0I;
    public final DirectThreadKey A0J;
    public final String A0K;
    public final AnonymousClass0eK A0L;
    public final boolean A0M;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.0iw, java.lang.Object] */
    public OIT(Activity activity, UserSession userSession, C68495NKo nKo, C67759MuF muF, AnonymousClass7X4 r16, AnonymousClass7XA r17, AnonymousClass7ST r18, DirectThreadKey directThreadKey, String str, AnonymousClass0eK r21) {
        0Tu r2;
        long j;
        boolean A062;
        String str2;
        0qQ.A0B(userSession, 3);
        this.A0B = nKo;
        this.A05 = activity;
        this.A09 = userSession;
        DirectThreadKey directThreadKey2 = directThreadKey;
        this.A0J = directThreadKey2;
        this.A0D = muF;
        this.A0L = r21;
        this.A0H = r17;
        AnonymousClass7ST r9 = r18;
        this.A0I = r9;
        this.A0G = r16;
        this.A0K = str;
        this.A00 = new P8W(0, activity, userSession, nKo, this, r9, directThreadKey2);
        AnonymousClass3U9 C5z = 1bJ.A00(userSession).C5z(this.A0J);
        if (C5z == null || C5z.C6a() != 29) {
            r2 = 0Tu.A06;
            j = 36316448159240571L;
            A062 = 182.A06(r2, userSession, j);
        } else {
            String str3 = this.A0K;
            if (str3 != null) {
                int hashCode = str3.hashCode();
                if (hashCode != -892498197) {
                    if (hashCode != -76391525) {
                        str2 = hashCode == 531959920 ? "challenges" : str2;
                    } else {
                        str2 = "challenge_winner";
                    }
                    if (str3.equals(str2)) {
                        A062 = C5z.COP();
                    }
                } else if (str3.equals("stacks")) {
                    r2 = 0Tu.A05;
                    j = 36316512585322947L;
                    A062 = 182.A06(r2, userSession, j);
                }
            }
            A062 = true;
        }
        this.A0M = A062;
        this.A0A = new C70846ONz(new Object(), userSession);
        this.A07 = new C72520P9d(this, 0);
        this.A08 = new PA2(this, 0);
        this.A06 = new C72499P8i(this, 0);
        this.A0C = new C72524P9h(this);
    }
}
