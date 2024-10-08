package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Mae  reason: case insensitive filesystem */
public abstract class C66671Mae {
    public static final void A01(N4G n4g, UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        C66665MaY A08 = C66669Mac.A08(userSession, C65971iV.class);
        int i = n4g.A00;
        String str2 = n4g.A01;
        1OS r0 = new 1OS(A08);
        r0.A02 = str;
        r0.A00 = i;
        r0.A01 = str2;
        C66580MXl.A1P(userSession, r0);
    }

    public static final void A02(AnonymousClass0iw r8, UserSession userSession, String str, int i) {
        0qQ.A0B(str, 1);
        C66665MaY A08 = C66669Mac.A08(userSession, C65811gt.class);
        boolean z = false;
        AnonymousClass0iw r5 = r8;
        if (i <= 0) {
            if (i != 0) {
                z = true;
            }
            1Ou A01 = 1Ou.A01(userSession);
            1OS r0 = new 1OS(A08);
            r0.A01 = str;
            r0.A02 = z;
            A01.A0A(r0);
            C70129Nxj.A00(userSession).A03(r8, C66580MXl.A0g(str), false, z);
            return;
        }
        1Ou A012 = 1Ou.A01(userSession);
        1OS r1 = new 1OS(A08);
        r1.A01 = str;
        r1.A02 = true;
        r1.A00 = Integer.valueOf(i);
        A012.A0A(r1);
        C70129Nxj.A00(userSession).A01(r5, C66580MXl.A0g(str), false, (long) i);
    }

    public static final void A03(AnonymousClass0iw r7, UserSession userSession, String str, int i) {
        C66665MaY A08 = C66669Mac.A08(userSession, C65851hB.class);
        boolean z = false;
        AnonymousClass0iw r4 = r7;
        if (i <= 0) {
            if (i != 0) {
                z = true;
            }
            1Ou A01 = 1Ou.A01(userSession);
            1OS r0 = new 1OS(A08);
            r0.A01 = str;
            r0.A02 = z;
            A01.A0A(r0);
            C70129Nxj.A00(userSession).A05(r7, C66580MXl.A0g(str), false, z);
            return;
        }
        1Ou A012 = 1Ou.A01(userSession);
        1OS r1 = new 1OS(A08);
        r1.A01 = str;
        r1.A02 = true;
        r1.A00 = Integer.valueOf(i);
        A012.A0A(r1);
        C70129Nxj.A00(userSession).A02(r4, C66580MXl.A0g(str), false, (long) i);
    }

    public static final void A06(AnonymousClass0iw r4, UserSession userSession, String str, boolean z) {
        1Ou A01 = 1Ou.A01(userSession);
        1OS r0 = new 1OS(C66669Mac.A08(userSession, C65851hB.class));
        r0.A01 = str;
        r0.A02 = z;
        A01.A0A(r0);
        C70129Nxj.A00(userSession).A05(r4, C66580MXl.A0g(str), false, z);
    }

    public static final void A08(UserSession userSession, C242373Tu r6, String str, int i, boolean z, boolean z2) {
        Integer num;
        UserSession userSession2 = userSession;
        String str2 = str;
        DbY.A1S(userSession2, str);
        int i2 = null;
        C66665MaY A07 = C66669Mac.A07(userSession2, 1lX.class);
        boolean z3 = z;
        if (z) {
            num = Integer.valueOf(C308556Us.A00(userSession2, r6));
            if (z2) {
                i2 = 86400;
            }
        } else {
            num = null;
        }
        C66580MXl.A1P(userSession2, new 1lX(userSession2, A07, num, i2, str2, i, z3));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Nac, X.3Sa] */
    public static final void A09(UserSession userSession, C254703su r17, DirectThreadKey directThreadKey) {
        String A0f;
        C70567OBp oBp;
        String str;
        DirectThreadKey directThreadKey2 = directThreadKey;
        0qQ.A0B(directThreadKey2, 1);
        Class<C65751gX> cls = C65751gX.class;
        C254703su r8 = r17;
        boolean z = r8.A2P;
        C70621ODs A0M = r8.A0M();
        if (r8.A1S()) {
            A0f = null;
        } else {
            A0f = r8.A0f();
        }
        UserSession userSession2 = userSession;
        C66665MaY A04 = C66669Mac.A04(userSession2, A0M, cls, (String) null, A0f, z);
        boolean A1S = r8.A1S();
        N4L n4l = r8.A0D;
        boolean z2 = true;
        if (n4l == null || !n4l.A06) {
            z2 = false;
        }
        C271374ik r0 = r8.A0e;
        if (r0 != null) {
            oBp = r0.A02;
        } else {
            oBp = null;
        }
        String str2 = "";
        if (oBp != null) {
            str = oBp.A01;
            str2 = oBp.A00;
        } else {
            str = str2;
        }
        String str3 = directThreadKey2.A00;
        String A0g = r8.A0g();
        0qQ.A0A(A0g);
        String A0f2 = r8.A0f();
        0qQ.A0B(A0g, 2);
        ? r2 = new C241953Sa(str3, A0g, A0f2);
        boolean z3 = r8.A2P;
        1OS r02 = new 1OS(A04);
        r02.A05 = z3;
        r02.A03 = A1S;
        r02.A04 = z2;
        r02.A00 = r2;
        r02.A02 = str;
        r02.A01 = str2;
        C66580MXl.A1P(userSession2, r02);
    }

    public static final void A0A(UserSession userSession, C254763t0 r7, String str, boolean z) {
        String str2;
        C66665MaY A08 = C66669Mac.A08(userSession, C66441n3.class);
        String str3 = r7.A00;
        int A02 = DbW.A02(1, A08, str3);
        1OS r0 = new 1OS(A08);
        r0.A01 = str3;
        r0.A00 = z ? 1 : 0;
        C66580MXl.A1P(userSession, r0);
        0Tu A0G = C66581MXm.A0G();
        A0G.A02 = true;
        boolean A06 = 182.A06(A0G, userSession, 36320902039741376L);
        StringBuilder A0n = AnonymousClass7TF.A0n(str);
        A0n.append(" isLockedChatONFromMC: ");
        A0n.append(A06);
        A0n.append(" src: ");
        A0n.append(A0G.A00.A00.getSource());
        String obj = A0n.toString();
        0qQ.A0B(obj, A02);
        0Aj A0B = C66584MXp.A0B(userSession);
        boolean isSampled = A0B.isSampled();
        if (z) {
            if (isSampled) {
                str2 = "toggle_thread_lock_on";
            } else {
                return;
            }
        } else if (isSampled) {
            str2 = "toggle_thread_lock_off";
        } else {
            return;
        }
        C66584MXp.A0x(A0B, str2, obj, str3);
    }

    public static final void A0B(UserSession userSession, C254763t0 r5, String str, boolean z) {
        0qQ.A0B(str, 3);
        C66665MaY A08 = C66669Mac.A08(userSession, C66001id.class);
        String str2 = r5.A00;
        String str3 = userSession.A06;
        1OS r0 = new 1OS(A08);
        r0.A00 = str2;
        r0.A03 = z;
        r0.A02 = str3;
        r0.A01 = str;
        C66580MXl.A1P(userSession, r0);
    }

    public static final void A0C(UserSession userSession, DirectThreadKey directThreadKey) {
        0qQ.A0B(directThreadKey, 1);
        C66665MaY A08 = C66669Mac.A08(userSession, C65881hd.class);
        0qQ.A0B(A08, 1);
        1OS r0 = new 1OS(A08);
        r0.A00 = directThreadKey;
        C66580MXl.A1P(userSession, r0);
    }

    public static final void A0E(UserSession userSession, DirectThreadKey directThreadKey, boolean z) {
        0qQ.A0B(directThreadKey, 1);
        1OS r0 = new 1OS(C66669Mac.A08(userSession, C65791gn.class));
        r0.A00 = directThreadKey;
        r0.A01 = z;
        C66580MXl.A1P(userSession, r0);
    }

    public static final void A0F(UserSession userSession, DirectThreadKey directThreadKey, boolean z) {
        0qQ.A0B(userSession, 0);
        C66665MaY A08 = C66669Mac.A08(userSession, C66271lR.class);
        0qQ.A0B(A08, 1);
        1OS r0 = new 1OS(A08);
        r0.A00 = directThreadKey;
        r0.A01 = z;
        C66580MXl.A1P(userSession, r0);
    }

    public static final void A0G(UserSession userSession, C254743sy r10, String str, boolean z) {
        UserSession userSession2 = userSession;
        DbY.A1S(userSession, str);
        if (C66647MaG.A04(r10) != null) {
            C66665MaY A04 = C66669Mac.A04(userSession2, OQO.A00(userSession, C66647MaG.A03(r10)), C66021il.class, (String) null, (String) null, z);
            String A09 = C66647MaG.A09(r10);
            if (A09 != null) {
                1OS r0 = new 1OS(A04);
                r0.A02 = A09;
                r0.A01 = str;
                r0.A00 = null;
                C66580MXl.A1P(userSession, r0);
                return;
            }
            throw AnonymousClass7TE.A0y();
        } else if (C66647MaG.A07(r10) != null) {
            C68313NAa A00 = C70113NxT.A00(userSession);
            long A002 = C66647MaG.A00(r10);
            long parseLong = Long.parseLong(str);
            AnonymousClass68L ASa = A00.mMailboxApiHandleMetaProvider.ASa(0);
            MailboxFutureImpl A0G = C66580MXl.A0G(ASa);
            C66582MXn.A1E(ASa, new C71678Oox(1, A002, parseLong, 5, A0G, A00), A0G);
        }
    }

    public static final void A0H(UserSession userSession, Integer num, String str, int i, int i2) {
        UserSession userSession2 = userSession;
        DbY.A1S(userSession2, str);
        C66665MaY A08 = C66669Mac.A08(userSession2, 1lX.class);
        C66580MXl.A1P(userSession2, new 1lX(userSession2, A08, Integer.valueOf(i2), num, str, i, AnonymousClass7TF.A1R(i2)));
    }

    public static final void A0I(UserSession userSession, String str, int i, boolean z) {
        XSN xsn;
        C66665MaY A08 = C66669Mac.A08(userSession, AnonymousClass1mC.class);
        0qQ.A0B(A08, 1);
        1OS r0 = new 1OS(A08);
        r0.A01 = str;
        r0.A00 = userSession;
        r0.A02 = z;
        C66580MXl.A1P(userSession, r0);
        C254763t0 A0g = C66580MXl.A0g(str);
        0Aj A0e = AnonymousClass7TE.A0e(((C70553OBb) userSession.A01(C70553OBb.class, new C73659PhY(userSession, 1))).A00, "direct_thread_pin_button");
        if (A0e.isSampled()) {
            C66581MXm.A1H(A0e, false);
            DbS.A1J(A0e, "click");
            DbS.A1N(A0e, "long_press");
            C66583MXo.A16(A0e, A0g);
            A0e.A7p("is_pin_thread", DbT.A0l(z));
            XSN[] values = XSN.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    xsn = null;
                    break;
                }
                xsn = values[i2];
                if (((int) xsn.A00) == i) {
                    break;
                }
                i2++;
            }
            A0e.A8M(xsn, "thread_subtype");
            A0e.Cgf();
        }
    }

    public static final void A0K(UserSession userSession, String str, boolean z) {
        C66665MaY A08 = C66669Mac.A08(userSession, C66201kf.class);
        0qQ.A0B(A08, 1);
        1OS r0 = new 1OS(A08);
        r0.A00 = str;
        r0.A01 = z;
        C66580MXl.A1P(userSession, r0);
    }

    public static final void A05(AnonymousClass0iw r3, UserSession userSession, String str, boolean z) {
        C66665MaY A08 = C66669Mac.A08(userSession, C65831h5.class);
        0qQ.A0B(A08, 1);
        1OS r0 = new 1OS(A08);
        r0.A00 = str;
        r0.A01 = z;
        C66580MXl.A1P(userSession, r0);
        0Aj A0d = C51969G9p.A0d(C70129Nxj.A00(userSession).A00, "direct_thread_mute_reactions_button");
        if (A0d.isSampled()) {
            A0d.A7p("to_mute", Boolean.valueOf(z));
            C66580MXl.A1J(A0d, str);
            DbW.A15(A0d, r3);
            A0d.Cgf();
        }
    }

    public static final void A0D(UserSession userSession, DirectThreadKey directThreadKey) {
        C66665MaY A08 = C66669Mac.A08(userSession, C66321m0.class);
        0qQ.A0B(A08, 1);
        1OS r0 = new 1OS(A08);
        r0.A00 = directThreadKey;
        C66580MXl.A1P(userSession, r0);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.3Sc, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v1, types: [X.3Sa, X.3SZ, java.lang.Object] */
    public static final void A00(AnonymousClass9JD r8, UserSession userSession, String str, String str2, String str3, String str4, long j, boolean z) {
        C241973Sc r2;
        AnonymousClass7TG.A1Q(str2, str3);
        1Ou A01 = 1Ou.A01(userSession);
        if (str4 == null) {
            r2 = null;
        } else {
            ? obj = new Object();
            obj.A01 = str4;
            obj.A00 = j;
            r2 = obj;
        }
        C66665MaY A07 = C66669Mac.A07(userSession, C65721gN.class);
        String str5 = A07.A03;
        long micros = TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
        ? obj2 = new Object();
        obj2.A04 = str;
        obj2.A02 = str2;
        obj2.A03 = null;
        obj2.A01 = str5;
        obj2.A00 = micros;
        obj2.A02 = r2;
        obj2.A01 = r8;
        String A0R = 002.A0R("mark_thread_seen-", str);
        synchronized (A01) {
            boolean z2 = true;
            if (A0R == null) {
                z2 = false;
            }
            17k.A0E(z2);
            1Ou.A03((C74338PtE) null, A01, (String) null, A0R);
        }
        1OS r22 = new 1OS(A07);
        r22.A03 = true;
        r22.A00 = obj2;
        r22.A02 = str3;
        r22.A08.add(002.A0R("mark_thread_seen-", obj2.A04));
        r22.A01 = str4;
        r22.A03 = z;
        C66580MXl.A1P(userSession, r22);
    }

    public static final void A04(AnonymousClass0iw r4, UserSession userSession, String str, boolean z) {
        boolean A1X = DbW.A1X(str);
        1OS r0 = new 1OS(C66669Mac.A08(userSession, C65811gt.class));
        r0.A01 = str;
        r0.A02 = z;
        C66580MXl.A1P(userSession, r0);
        C70129Nxj.A00(userSession).A03(r4, C66580MXl.A0g(str), Boolean.valueOf(A1X), z);
    }

    public static final void A07(AnonymousClass0iw r4, UserSession userSession, String str, boolean z, boolean z2) {
        boolean A1X = DbW.A1X(str);
        1OS r0 = new 1OS(C66669Mac.A08(userSession, AnonymousClass1gz.class));
        r0.A00 = str;
        r0.A01 = z;
        C66580MXl.A1P(userSession, r0);
        C71005OWe A00 = C70129Nxj.A00(userSession);
        C254763t0 A0g = C66580MXl.A0g(str);
        if (z2) {
            0Aj A0d = C51969G9p.A0d(A00.A00, "direct_thread_mute_mentions_and_replies_button");
            if (A0d.isSampled()) {
                A0d.A7p("to_mute", Boolean.valueOf(z));
                C66580MXl.A1J(A0d, C300965yF.A06(A0g));
                DbW.A15(A0d, r4);
                A0d.Cgf();
                return;
            }
            return;
        }
        A00.A04(r4, A0g, Boolean.valueOf(A1X), z);
    }

    public static final void A0J(UserSession userSession, String str, String str2) {
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, str);
        C66665MaY A08 = C66669Mac.A08(userSession, C65991ia.class);
        0qQ.A0B(A08, A1Z ? 1 : 0);
        1OS r0 = new 1OS(A08);
        r0.A00 = str;
        r0.A01 = str2;
        C66580MXl.A1P(userSession, r0);
    }
}
