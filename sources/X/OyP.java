package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

public final class OyP implements AnonymousClass0lh {
    public static final long A07;
    public static final C71042OaK A08 = new Object();
    public static final Map A09 = AnonymousClass7TE.A1H();
    public static final long A0A;
    public C251073mW A00;
    public boolean A01;
    public final UserSession A02;
    public final File A03;
    public final File A04 = A00(this, "spans");
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new C73661Pha(this, 46));
    public final 11T A06;

    public OyP(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A02 = userSession;
        C7894QcM A002 = RDK.A01.A00(C51966G9m.A0P(userSession));
        this.A06 = A002;
        OOC ooc = new OOC();
        String A0R = 002.A0R(A002.A00, "/ae-media");
        String str = userSession.A06;
        0qQ.A0B(A0R, 0);
        ooc.A04(A002, new File(A0R, str), false);
        this.A03 = ooc.A00();
        if (!AnonymousClass45R.A00(userSession)) {
            return;
        }
        if (2Aj.A02(userSession)) {
            this.A01 = true;
            AnonymousClass1F2.A00().AXT(A01(), 1307688829);
            return;
        }
        C69901Nu3.A00(userSession, AnonymousClass05K.A1F).A06(new C59110J6s(this, 11));
    }

    public static final 1LJ A01() {
        1Fg r2 = new 1Fg(1209600, false);
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put(r2.A00(), r2);
        long j = A0A;
        1Ff r4 = new 1Ff(j, j, j, -1, false, false);
        A1E.put(r4.A00(), r4);
        return new 1LJ((1B7) null, (File) null, (Map) null, A1E);
    }

    public final synchronized C251073mW A02() {
        C251073mW r0;
        r0 = this.A00;
        if (r0 == null) {
            r0 = C71042OaK.A00(A08, this.A04, this.A01);
            this.A00 = r0;
        }
        return r0;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.OaK] */
    static {
        long j;
        0Tu r6 = 0Tu.A05;
        if (1AW.A06(r6, 18308779862928356L)) {
            j = 1AW.A01(r6, 18590254839698514L);
        } else {
            j = 512;
        }
        long j2 = j * 1024 * 1024;
        A07 = j2;
        A0A = j2 + (1AW.A01(r6, 18590254839764051L) * 1024 * 1024);
    }

    public static final Ni4 A00(OyP oyP, String str) {
        File file = oyP.A03;
        if (!file.exists()) {
            file.mkdirs();
        }
        OOC ooc = new OOC();
        11T r2 = (11T) oyP.A05.getValue();
        AnonymousClass7TF.A1B(str, 1, r2);
        ooc.A04(r2, JTO.A0s(file, str), true);
        return ooc.A00();
    }

    public final void onSessionWillEnd() {
        C71042OaK oaK = A08;
        File file = this.A04;
        synchronized (oaK) {
            String path = file.getPath();
            Map map = A09;
            C12538Swo swo = (C12538Swo) map.get(path);
            if (swo != null) {
                swo.release();
                map.remove(path);
            }
        }
    }
}
