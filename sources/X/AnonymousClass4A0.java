package X;

import android.os.HandlerThread;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;

/* renamed from: X.4A0  reason: invalid class name */
public final class AnonymousClass4A0 implements C61110lV, AnonymousClass0lh {
    public long A00;
    public long A01;
    public long A02;
    public 1OC A03;
    public boolean A04;
    public final 1NW A05;
    public final 1a8 A06;
    public final UserSession A07;
    public final Runnable A08;
    public final Map A09;
    public final boolean A0A;
    public final boolean A0B;
    public final HandlerThread A0C;
    public final C61410nE A0D;
    public final 27P A0E;
    public final boolean A0F;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x004d, code lost:
        if (X.182.A06(r2, r6, 36314034387814777L) != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4A0(com.instagram.common.session.UserSession r6, X.C61410nE r7, X.27P r8) {
        /*
            r5 = this;
            r0 = 1
            X.0qQ.A0B(r6, r0)
            r0 = 3
            X.0qQ.A0B(r7, r0)
            r5.<init>()
            r5.A07 = r6
            r5.A0E = r8
            r5.A0D = r7
            java.lang.Class r0 = r5.getClass()
            java.lang.String r1 = r0.getSimpleName()
            android.os.HandlerThread r0 = new android.os.HandlerThread
            r0.<init>(r1)
            X.AnonymousClass0fe.A00(r0)
            r0.start()
            r5.A0C = r0
            android.os.Looper r1 = r0.getLooper()
            X.0qQ.A07(r1)
            X.1NW r0 = new X.1NW
            r0.<init>(r1)
            r5.A05 = r0
            X.0Tu r2 = X.0Tu.A05
            r0 = 36314034387093878(0x81036c00010976, double:3.0284797990532643E-306)
            boolean r4 = X.182.A06(r2, r6, r0)
            r5.A0A = r4
            if (r4 == 0) goto L_0x004f
            r0 = 36314034387814777(0x81036c000c0979, double:3.028479799509164E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r3 = 1
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            r5.A0B = r3
            r0 = 36314034387683704(0x81036c000a0978, double:3.0284797994262727E-306)
            boolean r0 = X.182.A06(r2, r6, r0)
            r5.A0F = r0
            X.4A1 r0 = new X.4A1
            r0.<init>(r5)
            r5.A08 = r0
            r1 = 0
            X.1a8 r0 = new X.1a8
            r0.<init>(r1)
            r5.A06 = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r5.A09 = r0
            if (r4 == 0) goto L_0x0080
            r0 = 36595509364000918(0x82036c00040896, double:3.2064857078580345E-306)
            long r0 = X.182.A01(r2, r6, r0)
            r5.A01 = r0
        L_0x0080:
            if (r3 == 0) goto L_0x0098
            r0 = 180000(0x2bf20, double:8.8932E-319)
            r5.A02 = r0
            r0 = 36609626921637759(0x8210430006177f, double:3.2154137081544145E-306)
            long r3 = X.182.A01(r2, r6, r0)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0098
            r5.A02 = r3
        L_0x0098:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4A0.<init>(com.instagram.common.session.UserSession, X.0nE, X.27P):void");
    }

    public static final 1OC A00(UserSession userSession, String... strArr) {
        1NY r3 = new 1NY(userSession, -2);
        r3.A08(AnonymousClass05K.A01);
        r3.A0A("direct_v2/fetch_and_subscribe_presence/");
        r3.A0A = "direct_v2/fetch_and_subscribe_presence/";
        r3.A07(AnonymousClass05K.A0Y);
        r3.A01 = 900000;
        r3.A0O((15p) null, AnonymousClass945.class, AnonymousClass946.class, false);
        r3.A9m("request_data", StringFormatUtil.formatStrLocaleSafe("[%s]", 03t.A07(",", "", "", (0sP) null, strArr)));
        r3.A0H("subscriptions_off", 182.A06(0Tu.A05, userSession, 36313274177947497L));
        return r3.A0M();
    }

    public static final synchronized void A01(1OC r6, AnonymousClass4A0 r7, C62320sa r8, boolean z, boolean z2) {
        AnonymousClass4A0 r2 = r7;
        synchronized (r2) {
            r6.A00 = new AnonymousClass947(r7.A07, r2, r8, z, z2);
            1ES.A03(r6);
            r7.A03 = r6;
        }
    }

    public static final synchronized void A02(AnonymousClass4A0 r1) {
        synchronized (r1) {
            1OC r0 = r1.A03;
            if (r0 != null) {
                r0.cancel();
                r1.A03 = null;
            }
            r1.A06.A01();
        }
    }

    public static final synchronized void A04(AnonymousClass4A0 r6, boolean z) {
        boolean z2;
        C62320sa r4;
        1OC r1;
        boolean z3;
        synchronized (r6) {
            if (r6.A03 == null) {
                UserSession userSession = r6.A07;
                if (1Au.A00(userSession).A21()) {
                    if (!C265504Uf.A00(userSession)) {
                        if (z) {
                            r4 = null;
                            1NY r2 = new 1NY(userSession, -2);
                            r2.A08(AnonymousClass05K.A0N);
                            r2.A0A("direct_v2/get_presence_active_now/");
                            r2.A0A = "direct_v2/get_presence_active_now/";
                            r2.A07(AnonymousClass05K.A0Y);
                            r2.A01 = 900000;
                            z2 = false;
                            r2.A0O((15p) null, AnonymousClass945.class, AnonymousClass946.class, false);
                            r2.A9m("suggested_followers_limit", String.valueOf(r6.A01));
                            r2.A9m("recent_thread_limit", "0");
                            r1 = r2.A0M();
                            z3 = false;
                        } else {
                            r4 = null;
                            1NY r22 = new 1NY(userSession, -2);
                            r22.A08(AnonymousClass05K.A0N);
                            r22.A0A("direct_v2/get_presence/");
                            r22.A0A = "direct_v2/get_presence/";
                            r22.A07(AnonymousClass05K.A0Y);
                            r22.A01 = 900000;
                            z2 = false;
                            r22.A0O((15p) null, AnonymousClass945.class, AnonymousClass946.class, false);
                            if (r6.A0A) {
                                r22.A9m("suggested_followers_limit", String.valueOf(r6.A01));
                            }
                            r1 = r22.A0M();
                            z3 = true;
                        }
                        A01(r1, r6, r4, z3, z2);
                    } else if (!r6.A04) {
                        0nY.A00().ATE(new NS7(r6, z));
                        r6.A04 = true;
                    }
                    if (z || 182.A06(0Tu.A05, userSession, 36328285088922818L)) {
                        r6.A00 = System.currentTimeMillis();
                    }
                }
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public static final void A03(AnonymousClass4A0 r3, Map map, boolean z, boolean z2) {
        if (z) {
            27P r0 = r3.A0E;
            Lock lock = r0.A05;
            lock.lock();
            try {
                r0.A00 = map;
                r0.A03.accept(new HashMap(map));
                lock.unlock();
                C294045ll.A00(r3.A07).A02(map);
            } catch (Throwable th) {
                lock.unlock();
                throw th;
            }
        } else if (z2) {
            C294045ll.A00(r3.A07).A02(map);
            for (C251053mU A022 : map.values()) {
                r3.A0E.A02(A022);
            }
        } else {
            27P r1 = r3.A0E;
            Lock lock2 = r1.A05;
            lock2.lock();
            try {
                if (!r1.A01) {
                    r1.A00.putAll(map);
                    r1.A03.accept(new HashMap(r1.A00));
                }
            } finally {
                lock2.unlock();
            }
        }
    }

    public final void A05(Integer num) {
        Integer num2;
        if (this.A0F) {
            num2 = AnonymousClass05K.A00;
        } else {
            num2 = AnonymousClass05K.A01;
        }
        if (num == num2 || num == AnonymousClass05K.A0C) {
            if (!14i.A08()) {
                onAppForegrounded();
            }
            14i.A03(15Y.A03, this);
            UserSession userSession = this.A07;
            if (AnonymousClass72B.A01(userSession)) {
                AnonymousClass72C A002 = AnonymousClass72B.A00(userSession);
                AnonymousClass0gd A003 = AnonymousClass0gd.A00();
                Object value = A002.A04.getValue();
                if (value != null) {
                    A003.A00.add(value);
                }
            }
        }
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(1296165127);
        this.A05.removeCallbacksAndMessages((Object) null);
        A02(this);
        AnonymousClass0fD.A0A(1545798174, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(-309433543);
        A04(this, false);
        if (this.A0B && !C265504Uf.A00(this.A07)) {
            this.A05.A02(this.A08, 2032156175, this.A02);
        }
        AnonymousClass0fD.A0A(1599335000, A032);
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
        A02(this);
    }
}
