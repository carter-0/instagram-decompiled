package X;

import com.instagram.common.session.UserSession;
import com.instagram.igtv.repository.series.IGTVSeriesRepository;
import com.instagram.igtv.repository.user.UserRepository;

/* renamed from: X.Jib  reason: case insensitive filesystem */
public final class C60280Jib extends 2YL {
    public boolean A00;
    public final AnonymousClass2Fj A01 = new 2Fk(C62501Kgr.INITIALIZED);
    public final AnonymousClass2Fj A02 = JTO.A0K();
    public final AnonymousClass2Fj A03 = JTO.A0K();
    public final AnonymousClass2Fj A04 = JTO.A0K();
    public final UserSession A05;
    public final C63640L1c A06;
    public final C61292K1d A07;
    public final C66559MWn A08;
    public final C66559MWn A09;
    public final C66559MWn A0A;
    public final IGTVSeriesRepository A0B;
    public final UserRepository A0C;
    public final C63777L6j A0D;
    public final String A0E;
    public final boolean A0F;

    public static final void A00(C60280Jib jib, 0sP r6, boolean z) {
        C60280Jib jib2 = jib;
        if (!jib.A00) {
            jib.A00 = true;
            AnonymousClass7TE.A1Z(new C59673JTe(r6, jib2, (AnonymousClass4D7) null, 18, z), C318116oQ.A00(jib));
        }
    }

    public C60280Jib(UserSession userSession, C63640L1c l1c, IGTVSeriesRepository iGTVSeriesRepository, UserRepository userRepository, C63777L6j l6j, String str) {
        C51974G9v.A1S(l1c, str, userRepository, iGTVSeriesRepository, l6j);
        this.A05 = userSession;
        this.A06 = l1c;
        this.A0E = str;
        this.A0C = userRepository;
        this.A0B = iGTVSeriesRepository;
        this.A0D = l6j;
        this.A07 = new C61292K1d(C62573Ki6.SERIES, l6j.A01, l6j.A02);
        this.A0F = userSession.A06.equals(l6j.A00);
        0sP r3 = C64077LLv.A00;
        this.A09 = new C65408Lso((1Nh) r3.invoke(userSession), 1qJ.class);
        this.A08 = new C65408Lso((1Nh) r3.invoke(userSession), AnonymousClass3KA.class);
        this.A0A = new C65408Lso((1Nh) r3.invoke(userSession), C64672Lfy.class);
    }
}
