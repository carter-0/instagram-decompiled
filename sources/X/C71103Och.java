package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Och  reason: case insensitive filesystem */
public final class C71103Och {
    public static final C71103Och A00 = new Object();

    public static final Integer A00(UserSession userSession, int i) {
        long j = (long) i;
        0Tu r9 = 0Tu.A05;
        long A01 = 182.A01(r9, userSession, 36601792902009179L);
        long seconds = TimeUnit.MINUTES.toSeconds(1);
        if (A01 < seconds) {
            A01 = seconds;
        }
        if (j < A01) {
            return AnonymousClass05K.A00;
        }
        long A012 = 182.A01(r9, userSession, 36601792902074716L);
        long seconds2 = TimeUnit.HOURS.toSeconds(1);
        if (A012 < seconds2) {
            A012 = seconds2;
        }
        if (j < A012) {
            return AnonymousClass05K.A01;
        }
        long A013 = 182.A01(r9, userSession, 36601792902140253L);
        long seconds3 = TimeUnit.DAYS.toSeconds(1);
        if (A013 < seconds3) {
            A013 = seconds3;
        }
        if (j < A013) {
            return AnonymousClass05K.A0C;
        }
        return AnonymousClass05K.A0N;
    }

    public static final List A01(UserSession userSession) {
        List A0x = DbX.A0x(182.A04(0Tu.A05, userSession, 36888615112934186L));
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = A0x.iterator();
        while (it.hasNext()) {
            ODT A002 = C69886Nto.A00(AnonymousClass7TE.A18(it));
            if (A002 != null) {
                A1C.add(A002);
            }
        }
        return A1C;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r1.length() == 0) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.util.List A02(com.instagram.common.session.UserSession r4, X.C242373Tu r5) {
        /*
            boolean r0 = X.C308556Us.A0I(r4, r5)
            r3 = 0
            if (r0 == 0) goto L_0x0018
            X.0Tu r2 = X.0Tu.A05
            r0 = 36888615112409897(0x830e0000080329, double:3.3918469633939886E-306)
            java.lang.String r1 = X.182.A04(r2, r4, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0026
        L_0x0018:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36883267880419826(0x830923002b01f2, double:3.388465352351893E-306)
            java.lang.String r1 = X.182.A04(r2, r4, r0)
            X.0qQ.A0A(r1)
        L_0x0026:
            java.lang.String r0 = ","
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r5 = 0
            java.util.List r0 = X.00l.A0R(r1, r0, r3)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x0039:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.String r0 = X.AnonymousClass7TE.A18(r1)
            java.lang.Integer r0 = X.00y.A0l(r0)
            if (r0 == 0) goto L_0x0039
            r2.add(r0)
            goto L_0x0039
        L_0x004d:
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r2)
            java.util.Iterator r3 = r2.iterator()
        L_0x0055:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x006d
            int r2 = X.AnonymousClass7TG.A0F(r3)
            r0 = -1
            boolean r1 = X.C51970G9q.A1W(r2, r0)
            X.ODT r0 = new X.ODT
            r0.<init>(r5, r2, r1)
            r4.add(r0)
            goto L_0x0055
        L_0x006d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71103Och.A02(com.instagram.common.session.UserSession, X.3Tu):java.util.List");
    }

    public final boolean A03(UserSession userSession, C242373Tu r5, Integer num, int i) {
        List<ODT> A02 = A02(userSession, r5);
        ArrayList A0p = AnonymousClass7TF.A0p(A02);
        for (ODT odt : A02) {
            AnonymousClass7TF.A1M(A0p, odt.A00);
        }
        if (!C66581MXm.A1W(i, A0p)) {
            return false;
        }
        if (num == null) {
            return true;
        }
        List<ODT> A01 = A01(userSession);
        ArrayList A0p2 = AnonymousClass7TF.A0p(A01);
        for (ODT odt2 : A01) {
            AnonymousClass7TF.A1M(A0p2, odt2.A01);
        }
        if (A0p2.contains(num)) {
            return true;
        }
        return false;
    }
}
