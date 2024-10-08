package X;

import android.net.Uri;
import com.google.common.util.concurrent.SettableFuture;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.OdG  reason: case insensitive filesystem */
public final class C71122OdG {
    public static final C71122OdG A00 = new Object();
    public static final String A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final String A06;
    public static final String A07;
    public static final String A08;

    public static final void A01(Uri uri, Uri uri2, UserSession userSession, LP8 lp8, AnonymousClass4D7 r8) {
        Uri uri3 = uri;
        AnonymousClass7TG.A1Q(uri, uri2);
        String str = lp8.A0D.A3p;
        OXH.A02(new C74189PqV((Object) new C64415LbW(1, userSession, lp8, r8), (Object) uri2, (Object) uri3, str, 34), userSession);
    }

    public final void A04(UserSession userSession, String str) {
        AnonymousClass6AQ r3 = AnonymousClass6AN.A02(userSession, AnonymousClass61K.ARMADILLO_EXPRESS_OUTBOX, true).A00;
        try {
            0Tu r4 = 0Tu.A05;
            if (182.A06(r4, userSession, 2342161901214898868L)) {
                SettableFuture settableFuture = r3.A0A;
                if (settableFuture.isDone()) {
                    r3.A04 = 0;
                } else {
                    int i = r3.A04;
                    r3.A04 = i + 1;
                    if (i < 6) {
                        A02(r4, settableFuture, r3);
                    }
                }
            }
            if (182.A06(r4, userSession, 36323195553197047L)) {
                SettableFuture settableFuture2 = r3.A09;
                if (settableFuture2.isDone()) {
                    r3.A03 = 0;
                    return;
                }
                int i2 = r3.A03;
                r3.A03 = i2 + 1;
                if (i2 < 6) {
                    A02(r4, settableFuture2, r3);
                }
            }
        } catch (Exception unused) {
            List A1P = 0sr.A1P(new Long[]{DbS.A0j(r3.A01), DbS.A0j(r3.A00)});
            List A0J = 03t.A0J(r3.A0I);
            ArrayList A0r = AnonymousClass7TG.A0r(A0J);
            Iterator it = A0J.iterator();
            while (it.hasNext()) {
                AnonymousClass7TE.A1Y(A0r, (long) AnonymousClass7TG.A0F(it));
            }
            A03(userSession, (Integer) null, str, 00k.A0S(A0r, A1P), 7026);
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.OdG, java.lang.Object] */
    static {
        AnonymousClass681 r1 = NAY.A00;
        String A0u = C66580MXl.A0u(r1, 22);
        0qQ.A07(A0u);
        A06 = A0u;
        String A0u2 = C66580MXl.A0u(r1, 16);
        0qQ.A07(A0u2);
        A03 = A0u2;
        String A0u3 = C66580MXl.A0u(r1, 19);
        0qQ.A07(A0u3);
        A04 = A0u3;
        String A0u4 = C66580MXl.A0u(r1, 11);
        0qQ.A07(A0u4);
        A02 = A0u4;
        String A0u5 = C66580MXl.A0u(r1, 10);
        0qQ.A07(A0u5);
        A01 = A0u5;
        String A0u6 = C66580MXl.A0u(r1, 21);
        0qQ.A07(A0u6);
        A05 = A0u6;
        String A0u7 = C66580MXl.A0u(r1, 24);
        0qQ.A07(A0u7);
        A08 = A0u7;
        String A0u8 = C66580MXl.A0u(r1, 25);
        0qQ.A07(A0u8);
        A07 = A0u8;
    }

    public static void A02(0Tu r6, 1K2 r7, AnonymousClass6AQ r8) {
        r7.get(C229632nm.A07(new AnonymousClass5F4(5, 30), 182.A01(r6, r8.A0F, 36604670529967189L)), TimeUnit.SECONDS);
    }

    public static final Object A00(UserSession userSession, Integer num, Integer num2, String str, String str2, AnonymousClass4D7 r15, long j) {
        C241503Pl A0m = JTQ.A0m(r15);
        Uri A09 = JTQ.A09(str);
        0qQ.A07(A09);
        0qQ.A0B(num, 1);
        OXH.A02(new C73963Pmh(new C71646OoR(str, A0m, j), num2, num, A09, str2, 12), userSession);
        return A0m.A00();
    }

    public static final void A03(UserSession userSession, Integer num, String str, List list, int i) {
        0qQ.A07(C282375Cv.A00(userSession));
        if (str != null) {
            C282375Cv.A03(str, list, 15, i, DbX.A01(num));
        }
    }
}
