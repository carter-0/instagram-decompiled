package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;

/* renamed from: X.Kqy  reason: case insensitive filesystem */
public abstract class C63069Kqy {
    public static final Object A00(C307896Rx r11, AnonymousClass6Tm r12) {
        Object A03 = r12.A03(0);
        DbS.A1Y(A03);
        String str = (String) A03;
        boolean A01 = Q0A.A01(r12.A03(1));
        C277014uI r4 = ((C280064zw) r12.A00()).A00;
        String A0Q = 002.A0Q("", System.currentTimeMillis());
        UserSession A0B = C308206Td.A0B(r11);
        if (!(A0B instanceof UserSession)) {
            C308276Tl r1 = new C308276Tl();
            r1.A03("failure", 0);
            r1.A03("", 1);
            C299275ur.A00(r11, r1.A00(), r4);
            return null;
        }
        AnonymousClass6QE r0 = AnonymousClass6QE.A02;
        Uri A012 = AnonymousClass6QJ.A01(DbT.A09(str), true);
        0Tu r5 = 0Tu.A05;
        if (1AW.A06(r5, 18309565842271878L)) {
            if (182.A06(r5, A0B, 36327469044873681L) && !LHW.A01(A012, AnonymousClass0kN.A02(A0B))) {
                throw new SecurityException("Invalid MimeType");
            } else if (LHW.A00(A012)) {
                throw new SecurityException("E2EE file path detected");
            }
        }
        EDL edl = new EDL(r4, r11, A0Q, 1);
        Context context = C64361Kj.A00().A00;
        UserSession userSession = A0B;
        0qQ.A0B(userSession, 1);
        String valueOf = String.valueOf(System.currentTimeMillis());
        C290815g0 A013 = C49736F4b.A01(context, A012, userSession, valueOf, 1);
        1Fc r2 = new 1Fc();
        r2.A05("share_to_feed", String.valueOf(A01));
        A013.A00 = new EHP(edl, r2, userSession, valueOf);
        1ES.A01().schedule(A013);
        return null;
    }
}
