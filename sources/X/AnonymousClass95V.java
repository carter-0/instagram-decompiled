package X;

import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.95V  reason: invalid class name */
public final class AnonymousClass95V {
    public C58840Ae A00;
    public AnonymousClass95W A01;
    public AnonymousClass1BJ A02;
    public final C61410nE A03;

    public AnonymousClass95V(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        AnonymousClass1BJ A002 = AnonymousClass1F2.A00();
        0wc A012 = AnonymousClass0kN.A01(new 0xG("IGRTCEngine"), userSession);
        AnonymousClass95W r4 = AnonymousClass95W.A02;
        AnonymousClass1BJ A003 = AnonymousClass1F2.A00();
        AnonymousClass95W.A01 = A003;
        AnonymousClass95X r2 = AnonymousClass95X.A01;
        File file = null;
        try {
            file = A003.AXT((1LJ) null, 384226697);
        } catch (Exception unused) {
        }
        AnonymousClass95X.A00 = file;
        AnonymousClass95W.A00 = r2;
        0qQ.A0B(r4, 3);
        this.A03 = C61410nE.A00;
        this.A02 = A002;
        this.A00 = A012;
        this.A01 = r4;
    }
}
