package X;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import com.instagram.android.R;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.DhP  reason: case insensitive filesystem */
public final class C46583DhP {
    public G8K A00 = null;
    public C359978dn A01 = null;
    public C360008dq A02 = null;
    public final F3Z A03;
    public final C46582DhO A04;
    public final C46645DiQ A05;
    public final C276954uB A06;
    public final C359628dE A07;
    public final AtomicLong A08 = new AtomicLong();
    public final AtomicReference A09 = new AtomicReference(C361118fh.A02);
    public final AtomicReference A0A = new AtomicReference();
    public final C276894u5 A0B;

    public static C46583DhP A00(Context context, SparseArray sparseArray, C46645DiQ diQ, C3034368u r11, C229392nJ r12, C359628dE r13) {
        SparseArray clone = diQ.A04.clone();
        for (int i = 0; i < sparseArray.size(); i++) {
            clone.put(sparseArray.keyAt(i), sparseArray.valueAt(i));
        }
        clone.put(R.id.bk_context_key_app_id, diQ.A09);
        Map map = diQ.A0G;
        int i2 = diQ.A00;
        HashMap A1E = AnonymousClass7TE.A1E();
        if (map != null) {
            A1E.putAll(map);
        }
        String valueOf = String.valueOf(i2);
        A1E.put("ttrc_instance_id", valueOf);
        Map map2 = diQ.A0F;
        HashMap A1E2 = AnonymousClass7TE.A1E();
        if (map2 != null) {
            A1E2.putAll(map2);
        }
        A1E2.put("ttrc_instance_id", valueOf);
        return new C46583DhP(new C46582DhO(context, clone, r11, r12, A1E, A1E2), diQ, r13);
    }

    public static C46645DiQ A01(Bundle bundle) {
        if (bundle == null) {
            return new C46645DiQ((SparseArray) null, (Object) null, (String) null, (String) null, (String) null, (HashMap) null, AnonymousClass7TE.A1C(), (Map) null, (Map) null, (Map) null, 0, false);
        }
        C46645DiQ A012 = C46645DiQ.A01(bundle);
        if (A012 != null) {
            return A012;
        }
        throw AnonymousClass7TE.A0w("BloksSurfaceProps is missing from Fragment argument.");
    }

    public static String A02(String str, int i) {
        String str2;
        if (i == 0 || i == 2) {
            str2 = "cc_";
        } else {
            str2 = "nc_";
        }
        return 002.A0R(str2, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        if (r1 != 2) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ee, code lost:
        if (r6.A03 < r7.A05.A02) goto L_0x00f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f0, code lost:
        r14.AEs(r6.A02, "bloks_query", true, r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00f9, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A03(X.C46583DhP r20, X.G8K r21, X.C361118fh r22) {
        /*
            r7 = r20
            X.4uB r0 = r7.A06
            long r19 = r0.now()
            r8 = r22
            X.8fg r6 = r8.A01
            boolean r0 = r6.A05
            r14 = r21
            if (r0 == 0) goto L_0x00cd
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            r12 = 0
            java.lang.String r1 = "gql_server_end"
            long r4 = r6.A04
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r9.put(r1, r0)
        L_0x0027:
            long r2 = r6.A03
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0034
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r9.put(r1, r0)
        L_0x0034:
            java.util.Iterator r10 = X.AnonymousClass7TF.A0s(r9)
        L_0x0038:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0058
            java.lang.Object r0 = r10.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r9 = r0.getKey()
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = r0.longValue()
            r14.CmN(r9, r0)
            goto L_0x0038
        L_0x0058:
            java.util.HashMap r9 = X.AnonymousClass7TE.A1E()
            java.lang.String r1 = ""
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x006d
            r0 = 731(0x2db, float:1.024E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r9.put(r0, r1)
        L_0x006d:
            int r0 = (r4 > r12 ? 1 : (r4 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x0091
            long r0 = r6.A01
            r10 = -1
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0082
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "disk_cache_response_time_ms"
            r9.put(r0, r1)
        L_0x0082:
            long r0 = r6.A00
            int r4 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0091
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "disk_cache_read_latency_ms"
            r9.put(r0, r1)
        L_0x0091:
            int r0 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ad
            r0 = 0
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "parsed_bytes"
            r9.put(r0, r2)
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r0 = "additive_parse_time"
            r9.put(r0, r1)
            java.lang.String r0 = "network_attempts"
            r9.put(r0, r2)
        L_0x00ad:
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r9)
        L_0x00b1:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00cd
            java.lang.Object r0 = r2.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r14.CmF(r1, r0)
            goto L_0x00b1
        L_0x00cd:
            int r1 = r8.A00
            r8 = 1
            java.lang.String r5 = "bloks_query"
            if (r1 == 0) goto L_0x00db
            r0 = 2
            if (r1 == r0) goto L_0x00f0
        L_0x00d7:
            r14.Cqw(r5, r8)
            return
        L_0x00db:
            java.util.concurrent.atomic.AtomicLong r0 = r7.A08
            long r0 = r0.get()
            java.lang.String r2 = "prefetched_data_ready_at"
            r14.CmE(r2, r0)
            long r3 = r6.A03
            X.DiQ r0 = r7.A05
            long r1 = r0.A02
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d7
        L_0x00f0:
            long r15 = r6.A02
            r17 = r5
            r18 = r8
            r14.AEs(r15, r17, r18, r19)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46583DhP.A03(X.DhP, X.G8K, X.8fh):void");
    }

    /* JADX INFO: finally extract failed */
    public final Pair A04(Context context) {
        boolean z;
        try {
            C46582DhO dhO = this.A04;
            C273694n2 r1 = new C273694n2(context);
            dhO.A00 = r1;
            AnonymousClass6NS r0 = dhO.A01;
            if (r0 != null) {
                z = true;
                r0.A07(r1);
            } else {
                z = false;
                if (dhO.A0A.compareAndSet(false, true)) {
                    C360018dr r2 = dhO.A06;
                    if (r2 == null) {
                        C46582DhO.A00(dhO, 0);
                    } else {
                        C46582DhO.A00(dhO, 1);
                        C46582DhO.A01(dhO, (C361128fi) r2, 2, 3);
                    }
                }
            }
            Pair create = Pair.create(dhO.A00, Boolean.valueOf(z));
            C359978dn r02 = this.A01;
            if (r02 != null) {
                r02.EEE(dhO);
                C46420Deh deh = new C46420Deh(0, this, dhO);
                this.A02 = deh;
                this.A01.A9V(deh);
            }
            return create;
        } catch (Throwable th) {
            C359978dn r03 = this.A01;
            if (r03 != null) {
                C46582DhO dhO2 = this.A04;
                r03.EEE(dhO2);
                C46420Deh deh2 = new C46420Deh(0, this, dhO2);
                this.A02 = deh2;
                this.A01.A9V(deh2);
            }
            throw th;
        }
    }

    public final Throwable A05() {
        C360018dr r1 = (C360018dr) this.A0A.get();
        if (r1 instanceof C385519j4) {
            return ((C385519j4) r1).A00;
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0031, code lost:
        r1 = r0.A02();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06() {
        /*
            r4 = this;
            X.DiQ r0 = r4.A05
            java.lang.Object r1 = r0.A07
            boolean r0 = r1 instanceof X.C276544tV
            if (r0 == 0) goto L_0x0040
            X.4tV r1 = (X.C276544tV) r1
            if (r1 == 0) goto L_0x0040
            boolean r0 = X.C46611Dhr.A0E(r1)
            if (r0 == 0) goto L_0x0040
            X.4uI r3 = X.C46611Dhr.A04(r1)
            if (r3 == 0) goto L_0x0040
            X.6Tl r2 = X.DbS.A0P()
            X.DhO r1 = r4.A04
            X.6NS r0 = r1.A01
            if (r0 == 0) goto L_0x0060
            X.6Rm r0 = r0.A02()
        L_0x0026:
            r2.A01(r0)
            X.6Tm r2 = r2.A00()
            X.6NS r0 = r1.A01
            if (r0 == 0) goto L_0x0040
            X.6Rm r1 = r0.A02()
            X.6Qd r0 = X.C307476Qg.A02(r1)
            if (r0 == 0) goto L_0x0040
            X.4tV r0 = r0.A06
            X.C307886Rw.A03(r1, r0, r2, r3)
        L_0x0040:
            X.8dn r0 = r4.A01
            if (r0 == 0) goto L_0x0047
            r0.destroy()
        L_0x0047:
            r2 = 0
            r4.A01 = r2
            X.DhO r1 = r4.A04
            X.6NS r0 = r1.A01
            if (r0 == 0) goto L_0x0053
            r0.A03()
        L_0x0053:
            r1.A01 = r2
            java.util.concurrent.atomic.AtomicReference r0 = r1.A0B
            r0.set(r2)
            java.util.concurrent.atomic.AtomicReference r0 = r4.A0A
            r0.set(r2)
            return
        L_0x0060:
            r0 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C46583DhP.A06():void");
    }

    public final void A07() {
        try {
            C360008dq r1 = this.A02;
            if (r1 != null) {
                C359978dn r0 = this.A01;
                if (r0 != null) {
                    r0.EEE(r1);
                }
                this.A02 = null;
            }
        } finally {
            G8K g8k = this.A00;
            if (g8k != null) {
                g8k.Cft("BloksSurfaceController_onDestroyView");
            }
        }
    }

    public final boolean A08(Context context, AnonymousClass3M5 r14) {
        boolean z;
        G8K Exe;
        if (this.A00 == null) {
            F3Z f3z = this.A03;
            C276894u5 r6 = this.A0B;
            C46645DiQ diQ = this.A05;
            if (diQ.A0H) {
                Exe = r6.Exf(diQ.A01, diQ.A00, diQ.A02);
            } else {
                Exe = r6.Exe(diQ.A09, diQ.A01, diQ.A00, diQ.A02);
                Map map = diQ.A0E;
                if (map != null) {
                    Iterator A0u = AnonymousClass7TF.A0u(map);
                    while (A0u.hasNext()) {
                        Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                        C46591DhX.A01(Exe, A1J.getValue(), DbT.A13(A1J));
                    }
                }
                for (C49500Ewf ewf : diQ.A0D) {
                    boolean z2 = false;
                    int andSet = 1Y5.A02.getAndSet(0);
                    if (andSet > 0) {
                        z2 = true;
                    }
                    Exe.CmG("prefetch_checkout_info_attempt", z2);
                    Exe.CmD("prefetch_attempt_count", andSet);
                    Exe.CmF(AnonymousClass000.A00(4132), ewf.A01);
                }
            }
            this.A00 = Exe;
            Exe.CmN("surface_core_created_at", f3z.A00);
        }
        G8K g8k = this.A00;
        C46645DiQ diQ2 = this.A05;
        String str = diQ2.A09;
        if (str == null || diQ2.A0I) {
            g8k.AAI("initial_content_step");
        } else {
            g8k.A9w("bloks_query", TimeUnit.SECONDS, diQ2.A03);
        }
        if (this.A01 == null) {
            if (diQ2.A0I || str == null) {
                z = false;
                C46582DhO dhO = this.A04;
                dhO.A0B.set(new C46581DhN(this, r14, g8k));
                return z;
            }
            HashMap hashMap = diQ2.A0C;
            Context context2 = context;
            this.A01 = C359638dF.A00(context2, this.A07, str, diQ2.A0A, hashMap, 0);
        }
        z = true;
        C46582DhO dhO2 = this.A04;
        dhO2.A0B.set(new C46581DhN(this, r14, g8k));
        return z;
    }

    public C46583DhP(C46582DhO dhO, C46645DiQ diQ, C359628dE r6) {
        C276894u5 r0 = C64361Kj.A00().A01;
        this.A0B = r0;
        C276954uB C3g = r0.C3g();
        this.A06 = C3g;
        this.A04 = dhO;
        this.A05 = diQ;
        this.A07 = r6;
        this.A03 = new F3Z(C3g.now());
    }
}
