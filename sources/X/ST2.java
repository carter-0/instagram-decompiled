package X;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicLong;

public final class ST2 {
    public final S3D A00;
    public final C10334RqX A01;
    public final ConcurrentMap A02 = new ConcurrentHashMap();
    public final Context A03;
    public final AnonymousClass3RV A04;
    public final RealtimeSinceBootClock A05;
    public final AnonymousClass458 A06;
    public final C13575Td0 A07;
    public final C10936S1p A08;
    public final SJJ A09;
    public final C11248SHi A0A;
    public final String A0B;
    public final HashMap A0C;
    public final HashMap A0D;
    public final boolean A0E;
    public volatile Integer A0F;
    public volatile String A0G;
    public volatile String A0H;
    public volatile String A0I;
    public volatile String A0J;
    public volatile String A0K;

    public static synchronized AtomicLong A04(C8860RDb rDb, ST2 st2) {
        AtomicLong atomicLong;
        synchronized (st2) {
            HashMap hashMap = st2.A0C;
            if (!hashMap.containsKey(rDb)) {
                hashMap.put(rDb, new AtomicLong());
            }
            atomicLong = (AtomicLong) hashMap.get(rDb);
        }
        return atomicLong;
    }

    public final synchronized C13440TaT A05(Class cls) {
        String name;
        HashMap hashMap;
        Object obj;
        try {
            name = cls.getName();
            hashMap = this.A0D;
            if (!hashMap.containsKey(name)) {
                if (cls == C7866Qbq.class) {
                    Context context = this.A03;
                    String str = this.A0B;
                    obj = new C12250Sq4(context, this.A05, this.A06, str, "du", this.A0E);
                } else if (cls == C7868Qbs.class) {
                    Context context2 = this.A03;
                    String str2 = this.A0B;
                    obj = new C12250Sq4(context2, this.A05, this.A06, str2, "ts", this.A0E);
                } else if (cls == C7867Qbr.class) {
                    Context context3 = this.A03;
                    String str3 = this.A0B;
                    obj = new C12250Sq4(context3, this.A05, this.A06, str3, "tp", this.A0E);
                } else {
                    obj = (C13440TaT) cls.newInstance();
                }
                hashMap.put(name, obj);
            }
        } catch (Exception e) {
            throw Pxe.A0u("Incorrect stat category used:", e);
        }
        return (C13440TaT) hashMap.get(name);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00f2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C7863Qbn A00(X.ST2 r7) {
        /*
            java.lang.Class<X.Qbn> r0 = X.C7863Qbn.class
            X.TaT r2 = r7.A05(r0)
            X.Qbn r2 = (X.C7863Qbn) r2
            X.RJ3 r1 = X.RJ3.ServiceName
            java.lang.String r0 = r7.A0B
            r2.A03(r1, r0)
            X.RJ3 r1 = X.RJ3.ClientCoreName
            java.lang.String r0 = r7.A0G
            r2.A03(r1, r0)
            X.RJ3 r1 = X.RJ3.NotificationStoreName
            java.lang.String r0 = r7.A0I
            r2.A03(r1, r0)
            X.3RV r6 = r7.A04
            android.content.Context r3 = r7.A03
            java.lang.String r0 = "analytics"
            X.45J r5 = X.Pxf.A0N(r3, r6, r0)
            X.RJ3 r1 = X.RJ3.YearClass
            java.lang.String r0 = "year_class"
            r4 = 0
            int r0 = r5.getInt(r0, r4)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.A03(r1, r0)
            java.lang.String r0 = "gk"
            X.45J r0 = X.Pxf.A0N(r3, r6, r0)
            X.RJ3 r1 = X.RJ3.MqttGKs
            java.util.Map r0 = r0.getAll()
            java.lang.String r0 = A03(r0)
            r2.A03(r1, r0)
            java.lang.String r0 = "flags"
            X.45J r0 = X.Pxf.A0N(r3, r6, r0)
            X.RJ3 r1 = X.RJ3.MqttFlags
            java.util.Map r0 = r0.getAll()
            java.lang.String r0 = A03(r0)
            r2.A03(r1, r0)
            X.Td0 r0 = r7.A07
            if (r0 == 0) goto L_0x0073
            X.RJ3 r1 = X.RJ3.AppState
            java.lang.Object r0 = r0.get()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x010c
            java.lang.String r0 = "fg"
        L_0x0070:
            r2.A03(r1, r0)
        L_0x0073:
            X.RJ3 r1 = X.RJ3.ScreenState
            X.SHi r0 = r7.A0A
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0108
            java.lang.String r0 = "1"
        L_0x007f:
            r2.A03(r1, r0)
            X.S1p r3 = r7.A08
            java.lang.Class<android.telephony.TelephonyManager> r1 = android.telephony.TelephonyManager.class
            java.lang.String r0 = "phone"
            X.T9D r3 = r3.A00(r1, r0)
            X.RJ3 r1 = X.RJ3.Country
            boolean r0 = r3 instanceof X.C7860Qbk
            if (r0 == 0) goto L_0x00fa
            java.lang.String r0 = ""
        L_0x0095:
            java.lang.String r0 = r0.toUpperCase()
        L_0x0099:
            r2.A03(r1, r0)
            X.RJ3 r3 = X.RJ3.NetworkType
            X.SJJ r1 = r7.A09
            X.S2M r0 = r1.A03()
            java.lang.Integer r0 = r0.A02
            java.lang.String r0 = X.C9557Rcu.A00(r0)
            java.lang.String r0 = r0.toUpperCase()
            r2.A03(r3, r0)
            X.RJ3 r3 = X.RJ3.NetworkSubtype
            android.net.NetworkInfo r1 = r1.A02()
            if (r1 == 0) goto L_0x00f2
            java.lang.String r0 = r1.getSubtypeName()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00f2
            java.lang.String r0 = r1.getSubtypeName()
            if (r0 != 0) goto L_0x00f5
            r0 = 0
        L_0x00ca:
            r2.A03(r3, r0)
            X.RJ3 r1 = X.RJ3.IsEmployee
            java.lang.String r0 = "is_employee"
            boolean r0 = r5.getBoolean(r0, r4)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A03(r1, r0)
            X.RJ3 r1 = X.RJ3.ValidCompatibleApps
            java.lang.String r0 = r7.A0K
            r2.A03(r1, r0)
            X.RJ3 r1 = X.RJ3.EnabledCompatibleApps
            java.lang.String r0 = r7.A0H
            r2.A03(r1, r0)
            X.RJ3 r1 = X.RJ3.RegisteredApps
            java.lang.String r0 = r7.A0J
            r2.A03(r1, r0)
            return r2
        L_0x00f2:
            java.lang.String r0 = "none"
        L_0x00f5:
            java.lang.String r0 = r0.toUpperCase()
            goto L_0x00ca
        L_0x00fa:
            java.lang.Object r0 = r3.A01()
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            java.lang.String r0 = r0.getNetworkCountryIso()
            if (r0 != 0) goto L_0x0095
            r0 = 0
            goto L_0x0099
        L_0x0108:
            java.lang.String r0 = "0"
            goto L_0x007f
        L_0x010c:
            java.lang.String r0 = "bg"
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST2.A00(X.ST2):X.Qbn");
    }

    public static C7865Qbp A01(ST2 st2, long j) {
        C7865Qbp qbp = (C7865Qbp) st2.A05(C7865Qbp.class);
        ((AtomicLong) qbp.A01(RJ2.MqttDurationMs)).set(j);
        AtomicLong atomicLong = (AtomicLong) qbp.A01(RJ2.NetworkDurationMs);
        SJJ sjj = st2.A09;
        AtomicLong atomicLong2 = sjj.A06;
        long j2 = atomicLong2.get();
        long j3 = 0;
        if (j2 != 0) {
            j3 = Pxe.A0C(j2);
        }
        atomicLong.set(j3);
        AtomicLong atomicLong3 = (AtomicLong) qbp.A01(RJ2.NetworkTotalDurationMs);
        long j4 = sjj.A05.get();
        long j5 = atomicLong2.get();
        long j6 = 0;
        if (j5 != 0) {
            j6 = Pxe.A0C(j5);
        }
        atomicLong3.set(j4 + j6);
        ((AtomicLong) qbp.A01(RJ2.ServiceDurationMs)).set(SystemClock.elapsedRealtime() - A04(C8860RDb.A01, st2).get());
        return qbp;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0053, code lost:
        if (r11 != false) goto L_0x0055;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(java.lang.String r13, java.lang.String r14, java.lang.String r15, boolean r16) {
        /*
            r12 = this;
            X.Td0 r0 = r12.A07
            if (r0 != 0) goto L_0x00d4
            r11 = 0
        L_0x0005:
            X.SES r4 = X.SES.A02
            long r5 = android.os.SystemClock.elapsedRealtime()
            long r0 = r4.A00
            long r5 = r5 - r0
            r1 = 17000(0x4268, double:8.399E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            boolean r2 = X.AnonymousClass7TF.A1R(r0)
            java.lang.String r1 = r4.A01
            if (r1 == 0) goto L_0x0024
            if (r16 != 0) goto L_0x00c4
            java.lang.String r0 = "PINGREQ"
            boolean r0 = r0.equals(r13)
            if (r0 != 0) goto L_0x00cc
        L_0x0024:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            if (r11 == 0) goto L_0x00bd
            r1.append(r13)
            java.lang.String r0 = "_FG"
        L_0x002f:
            java.lang.String r6 = X.AnonymousClass7TF.A0l(r0, r1)
            java.lang.String r9 = "fg"
            java.lang.String r8 = "bg"
            java.lang.String r7 = "tc"
            r5 = 1
            if (r2 == 0) goto L_0x0093
            java.lang.String r10 = "rw"
            if (r11 == 0) goto L_0x0084
            java.lang.Class<X.Qbs> r0 = X.C7868Qbs.class
            X.TaT r3 = r12.A05(r0)
            X.Sq4 r3 = (X.C12250Sq4) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r9, r10, r15}
            r0 = 1
        L_0x0050:
            r3.A03(r2, r0)
            if (r11 == 0) goto L_0x00bb
        L_0x0055:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "/"
            boolean r0 = r14.startsWith(r0)
            if (r0 == 0) goto L_0x0082
            java.lang.String r6 = r14.substring(r5)
        L_0x0067:
            java.lang.Class<X.Qbr> r0 = X.C7867Qbr.class
            X.TaT r3 = r12.A05(r0)
            X.Sq4 r3 = (X.C12250Sq4) r3
            java.lang.String[] r2 = new java.lang.String[]{r6, r9}
            r0 = 1
            r3.A03(r2, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r4.A00 = r0
            java.lang.System.currentTimeMillis()
            return
        L_0x0082:
            r6 = r14
            goto L_0x0067
        L_0x0084:
            r0 = 1
            java.lang.Class<X.Qbs> r2 = X.C7868Qbs.class
            X.TaT r3 = r12.A05(r2)
            X.Sq4 r3 = (X.C12250Sq4) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r8, r10, r15}
            goto L_0x0050
        L_0x0093:
            java.lang.String r10 = "nw"
            if (r11 == 0) goto L_0x00aa
            java.lang.Class<X.Qbs> r0 = X.C7868Qbs.class
            X.TaT r3 = r12.A05(r0)
            X.Sq4 r3 = (X.C12250Sq4) r3
            java.lang.String[] r2 = new java.lang.String[]{r7, r9, r10, r15}
            r0 = 1
            r3.A03(r2, r0)
            goto L_0x0055
        L_0x00aa:
            r1 = 1
            java.lang.Class<X.Qbs> r0 = X.C7868Qbs.class
            X.TaT r3 = r12.A05(r0)
            X.Sq4 r3 = (X.C12250Sq4) r3
            java.lang.String[] r0 = new java.lang.String[]{r7, r8, r10, r15}
            r3.A03(r0, r1)
        L_0x00bb:
            r9 = r8
            goto L_0x0055
        L_0x00bd:
            r1.append(r13)
            java.lang.String r0 = "_BG"
            goto L_0x002f
        L_0x00c4:
            java.lang.String r0 = "PINGRESP"
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x0024
        L_0x00cc:
            java.lang.String r0 = "_"
            java.lang.String r13 = X.002.A0g(r13, r0, r1)
            goto L_0x0024
        L_0x00d4:
            java.lang.Object r0 = r0.get()
            boolean r11 = X.AnonymousClass7TE.A1a(r0)
            goto L_0x0005
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ST2.A06(java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    public ST2(Context context, AnonymousClass3RV r3, RealtimeSinceBootClock realtimeSinceBootClock, AnonymousClass458 r5, C13575Td0 td0, C10936S1p s1p, SJJ sjj, C11248SHi sHi, String str, boolean z) {
        C10334RqX rqX = C10334RqX.A01;
        if (rqX == null) {
            rqX = new C10334RqX();
            C10334RqX.A01 = rqX;
        }
        this.A01 = rqX;
        this.A0G = "";
        this.A0I = "";
        this.A0K = "";
        this.A0H = "";
        this.A0J = "";
        this.A03 = context;
        this.A08 = s1p;
        this.A0B = str;
        this.A09 = sjj;
        this.A0A = sHi;
        this.A00 = new S3D(context, realtimeSinceBootClock);
        this.A06 = r5;
        this.A05 = realtimeSinceBootClock;
        this.A07 = td0;
        this.A0C = AnonymousClass7TE.A1E();
        this.A0D = AnonymousClass7TE.A1E();
        this.A0E = z;
        this.A04 = r3;
    }

    public static String A02(List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            Object next = listIterator.next();
            Map map = ((AnonymousClass3RX) AnonymousClass3RD.A00).A06;
            if (map.containsKey(next)) {
                listIterator.set(Pxf.A0j(next, map));
            } else {
                0KC.A0P("MqttHealthStatsHelper", "appPkgName %s not found in encoding map", new Object[]{next});
            }
        }
        return TextUtils.join(";", list);
    }

    public static String A03(Map map) {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        Iterator A0u = AnonymousClass7TF.A0u(map);
        boolean z = true;
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (z) {
                z = false;
            } else {
                A1A.append(";");
            }
            Pxg.A1S(A1A, A1J);
            A1A.append("|");
            A1A.append(A1J.getValue());
        }
        return A1A.toString();
    }
}
