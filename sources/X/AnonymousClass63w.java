package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.facebook.proxygen.LigerSamplePolicy;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.zact;
import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.63w  reason: invalid class name */
public final class AnonymousClass63w implements C3025563x, AnonymousClass63y, AnonymousClass640 {
    public int A00 = 0;
    public ConnectionResult A01 = null;
    public boolean A02;
    public final int A03;
    public final AnonymousClass647 A04;
    public final AnonymousClass63Q A05;
    public final AnonymousClass64J A06;
    public final List A07 = new ArrayList();
    public final Map A08 = new HashMap();
    public final Queue A09 = new LinkedList();
    public final zact A0A;
    public final Set A0B = new HashSet();
    public final /* synthetic */ AnonymousClass63T A0C;

    public final void D5m(ConnectionResult connectionResult) {
        A0C(connectionResult, (Exception) null);
    }

    public final void FOM(ConnectionResult connectionResult, AnonymousClass63K r3, boolean z) {
        throw null;
    }

    public AnonymousClass63w(AnonymousClass63E r20, AnonymousClass63T r21) {
        AnonymousClass63T r1 = r21;
        this.A0C = r1;
        Handler handler = r1.A06;
        Looper looper = handler.getLooper();
        AnonymousClass642 r14 = AnonymousClass642.A00;
        Set emptySet = Collections.emptySet();
        Set r6 = new 04u(0);
        r6.addAll(emptySet);
        AnonymousClass63E r2 = r20;
        Context context = r2.A01;
        String name = context.getClass().getName();
        AnonymousClass643 r13 = new AnonymousClass643(r14, context.getPackageName(), name, (Map) null, r6);
        AnonymousClass63I r7 = r2.A04.A00;
        AnonymousClass3Qk.A02(r7);
        AnonymousClass647 A002 = r7.A00(context, looper, this, this, r13, r2.A03);
        String str = r2.A08;
        if (str != null && (A002 instanceof BaseGmsClient)) {
            ((BaseGmsClient) A002).A0R = str;
        }
        this.A04 = A002;
        this.A05 = r2.A06;
        this.A06 = new AnonymousClass64J();
        this.A03 = r2.A00;
        if (A002.requiresSignIn()) {
            Context context2 = r1.A05;
            Set emptySet2 = Collections.emptySet();
            Set r0 = new 04u(0);
            r0.addAll(emptySet2);
            this.A0A = new zact(context2, handler, new AnonymousClass643(r14, context.getPackageName(), name, (Map) null, r0));
            return;
        }
        this.A0A = null;
    }

    private final void A00(ConnectionResult connectionResult) {
        Set set = this.A0B;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            if (SA1.A01(connectionResult, ConnectionResult.A04)) {
                BaseGmsClient baseGmsClient = (BaseGmsClient) this.A04;
                if (!baseGmsClient.isConnected() || baseGmsClient.A09 == null) {
                    throw new RuntimeException("Failed to connect when checking package");
                }
            }
            throw new NullPointerException("zac");
        }
        set.clear();
    }

    public static final void A01(Status status, AnonymousClass63w r3) {
        AnonymousClass3Qk.A01(r3.A0C.A06);
        r3.A02(status, (Exception) null, false);
    }

    private final void A02(Status status, Exception exc, boolean z) {
        AnonymousClass3Qk.A01(this.A0C.A06);
        boolean z2 = false;
        boolean z3 = true;
        if (status != null) {
            z3 = false;
        }
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.A09.iterator();
            while (it.hasNext()) {
                C11033S6l s6l = (C11033S6l) it.next();
                if (!z || s6l.A00 == 2) {
                    if (status != null) {
                        s6l.A00(status);
                    } else {
                        s6l.A03(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    public static final void A03(AnonymousClass63w r6) {
        Queue queue = r6.A09;
        ArrayList arrayList = new ArrayList(queue);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C11033S6l s6l = (C11033S6l) arrayList.get(i);
            if (r6.A04.isConnected()) {
                if (r6.A08(s6l)) {
                    queue.remove(s6l);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public static final void A04(AnonymousClass63w r4) {
        Handler handler = r4.A0C.A06;
        AnonymousClass3Qk.A01(handler);
        r4.A01 = null;
        r4.A00(ConnectionResult.A04);
        if (r4.A02) {
            AnonymousClass63Q r1 = r4.A05;
            handler.removeMessages(11, r1);
            handler.removeMessages(9, r1);
            r4.A02 = false;
        }
        Iterator it = r4.A08.values().iterator();
        while (it.hasNext()) {
            C10601Ruv ruv = ((C10600Ruu) it.next()).A00;
            try {
                ruv.A02.A01.accept(r4.A04, new C365498nD());
            } catch (DeadObjectException unused) {
                r4.D5q(3);
                r4.A04.APT("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                it.remove();
            }
        }
        A03(r4);
        A05(r4);
    }

    public static final void A05(AnonymousClass63w r3) {
        AnonymousClass63Q r2 = r3.A05;
        AnonymousClass63T r1 = r3.A0C;
        Handler handler = r1.A06;
        handler.removeMessages(12, r2);
        handler.sendMessageDelayed(handler.obtainMessage(12, r2), r1.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006b A[LOOP:0: B:7:0x0065->B:9:0x006b, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(X.AnonymousClass63w r7, int r8) {
        /*
            X.63T r5 = r7.A0C
            android.os.Handler r4 = r5.A06
            X.AnonymousClass3Qk.A01(r4)
            r0 = 0
            r7.A01 = r0
            r6 = 1
            r7.A02 = r6
            X.647 r0 = r7.A04
            com.google.android.gms.common.internal.BaseGmsClient r0 = (com.google.android.gms.common.internal.BaseGmsClient) r0
            java.lang.String r2 = r0.A0S
            X.64J r3 = r7.A06
            java.lang.String r0 = "The connection to Google Play services was lost"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            if (r8 != r6) goto L_0x0077
            java.lang.String r0 = " due to service disconnection."
        L_0x0020:
            r1.append(r0)
        L_0x0023:
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = " Last reason for disconnect: "
            r1.append(r0)
            r1.append(r2)
        L_0x002d:
            java.lang.String r2 = r1.toString()
            r1 = 20
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r1, r2)
            X.AnonymousClass64J.A00(r0, r3, r6)
            X.63Q r3 = r7.A05
            r0 = 9
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 11
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            X.63f r0 = r5.A08
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            java.util.Map r0 = r7.A08
            java.util.Collection r0 = r0.values()
            java.util.Iterator r1 = r0.iterator()
        L_0x0065:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x007d
            java.lang.Object r0 = r1.next()
            X.Ruu r0 = (X.C10600Ruu) r0
            java.lang.Runnable r0 = r0.A02
            r0.run()
            goto L_0x0065
        L_0x0077:
            r0 = 3
            if (r8 != r0) goto L_0x0023
            java.lang.String r0 = " due to dead object exception."
            goto L_0x0020
        L_0x007d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass63w.A06(X.63w, int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001e, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A07(com.google.android.gms.common.ConnectionResult r5) {
        /*
            r4 = this;
            java.lang.Object r3 = X.AnonymousClass63T.A0I
            monitor-enter(r3)
            X.63T r2 = r4.A0C     // Catch:{ all -> 0x0020 }
            X.63b r0 = r2.A01     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001d
            java.util.Set r1 = r2.A0A     // Catch:{ all -> 0x0020 }
            X.63Q r0 = r4.A05     // Catch:{ all -> 0x0020 }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x001d
            X.63b r1 = r2.A01     // Catch:{ all -> 0x0020 }
            int r0 = r4.A03     // Catch:{ all -> 0x0020 }
            r1.A0B(r5, r0)     // Catch:{ all -> 0x0020 }
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            r0 = 1
            return r0
        L_0x001d:
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            r0 = 0
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0020 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass63w.A07(com.google.android.gms.common.ConnectionResult):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0005, code lost:
        r7 = (X.C8384Qpp) r15;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean A08(X.C11033S6l r15) {
        /*
            r14 = this;
            boolean r0 = r15 instanceof X.C8384Qpp
            r6 = 1
            if (r0 == 0) goto L_0x00f4
            r7 = r15
            X.Qpp r7 = (X.C8384Qpp) r7
            com.google.android.gms.common.Feature[] r12 = r7.A05(r14)
            if (r12 == 0) goto L_0x00f4
            int r11 = r12.length
            if (r11 == 0) goto L_0x00f4
            X.647 r10 = r14.A04
            r0 = r10
            com.google.android.gms.common.internal.BaseGmsClient r0 = (com.google.android.gms.common.internal.BaseGmsClient) r0
            com.google.android.gms.common.internal.zzk r0 = r0.A0Q
            if (r0 != 0) goto L_0x003b
            r13 = 0
        L_0x001b:
            r5 = 0
            if (r13 != 0) goto L_0x0020
            com.google.android.gms.common.Feature[] r13 = new com.google.android.gms.common.Feature[r5]
        L_0x0020:
            int r9 = r13.length
            X.0yf r1 = new X.0yf
            r1.<init>(r9)
            r8 = 0
        L_0x0027:
            if (r8 >= r9) goto L_0x0040
            r0 = r13[r8]
            java.lang.String r4 = r0.A00
            long r2 = r0.A00()
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r1.put(r4, r0)
            int r8 = r8 + 1
            goto L_0x0027
        L_0x003b:
            com.google.android.gms.common.Feature[] r13 = r0.A03
            goto L_0x001b
        L_0x003e:
            if (r5 >= r11) goto L_0x00f4
        L_0x0040:
            r2 = r12[r5]
            java.lang.String r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x005b
            long r8 = r0.longValue()
            long r3 = r2.A00()
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x005b
            int r5 = r5 + 1
            goto L_0x003e
        L_0x005b:
            java.lang.Class r0 = r10.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r5 = r2.A00
            long r3 = r2.A00()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " could not execute call because it requires feature ("
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", "
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = ")."
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "GoogleApiManager"
            android.util.Log.w(r0, r1)
            X.63T r5 = r14.A0C
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r7.A04(r14)
            if (r0 == 0) goto L_0x00eb
            X.63Q r0 = r14.A05
            r6 = 0
            X.A9c r7 = new X.A9c
            r7.<init>(r2, r0)
            java.util.List r3 = r14.A07
            int r0 = r3.indexOf(r7)
            r1 = 5000(0x1388, double:2.4703E-320)
            r4 = 15
            if (r0 < 0) goto L_0x00c1
            java.lang.Object r0 = r3.get(r0)
            android.os.Handler r3 = r5.A06
            r3.removeMessages(r4, r0)
            android.os.Message r0 = android.os.Message.obtain(r3, r4, r0)
            r3.sendMessageDelayed(r0, r1)
        L_0x00bf:
            r6 = 0
            return r6
        L_0x00c1:
            r3.add(r7)
            android.os.Handler r3 = r5.A06
            android.os.Message r0 = android.os.Message.obtain(r3, r4, r7)
            r3.sendMessageDelayed(r0, r1)
            r0 = 16
            android.os.Message r2 = android.os.Message.obtain(r3, r0, r7)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r3.sendMessageDelayed(r2, r0)
            r0 = 2
            com.google.android.gms.common.ConnectionResult r1 = new com.google.android.gms.common.ConnectionResult
            r1.<init>(r0, r6)
            boolean r0 = r14.A07(r1)
            if (r0 != 0) goto L_0x00bf
            int r0 = r14.A03
            r5.A09(r1, r0)
            goto L_0x00bf
        L_0x00eb:
            X.TRT r0 = new X.TRT
            r0.<init>(r2)
            r7.A03(r0)
            return r6
        L_0x00f4:
            X.64J r2 = r14.A06
            X.647 r1 = r14.A04
            boolean r0 = r1.requiresSignIn()
            r15.A01(r2, r0)
            r15.A02(r14)     // Catch:{ DeadObjectException -> 0x0103 }
            goto L_0x010c
        L_0x0103:
            r14.D5q(r6)
            java.lang.String r0 = "DeadObjectException thrown while running ApiCallRunner."
            r1.APT(r0)
            return r6
        L_0x010c:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass63w.A08(X.S6l):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.TmH, X.647] */
    public final void A09() {
        int i;
        AnonymousClass63T r3 = this.A0C;
        AnonymousClass3Qk.A01(r3.A06);
        AnonymousClass647 r5 = this.A04;
        if (!r5.isConnected() && !r5.CQT()) {
            try {
                int A002 = r3.A08.A00(r3.A05, r5);
                if (A002 != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(A002, (PendingIntent) null);
                    Log.w("GoogleApiManager", 002.A0u("The service for ", r5.getClass().getName(), " is not available: ", connectionResult.toString()));
                    A0C(connectionResult, (Exception) null);
                    return;
                }
                AnonymousClass64P r4 = new AnonymousClass64P(r5, this.A05, r3);
                if (r5.requiresSignIn()) {
                    zact zact = this.A0A;
                    AnonymousClass3Qk.A02(zact);
                    int A032 = AnonymousClass0fD.A03(-32086994);
                    C13954TmH tmH = zact.A01;
                    if (tmH != null) {
                        tmH.disconnect();
                    }
                    AnonymousClass643 r11 = zact.A05;
                    r11.A00 = Integer.valueOf(System.identityHashCode(zact));
                    AnonymousClass63I r6 = zact.A04;
                    Context context = zact.A02;
                    Handler handler = zact.A03;
                    zact.A01 = r6.A00(context, handler.getLooper(), zact, zact, r11, r11.A01);
                    zact.A00 = r4;
                    Set set = zact.A06;
                    if (set == null || set.isEmpty()) {
                        handler.post(new TDL(zact));
                        i = 741814066;
                    } else {
                        BaseGmsClient baseGmsClient = (BaseGmsClient) zact.A01;
                        baseGmsClient.AJG(new C12555Sxg(baseGmsClient));
                        i = -1918310273;
                    }
                    AnonymousClass0fD.A0A(i, A032);
                }
                try {
                    r5.AJG(r4);
                } catch (SecurityException e) {
                    A0C(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                A0C(new ConnectionResult(10), e2);
            }
        }
    }

    public final void A0A() {
        AnonymousClass3Qk.A01(this.A0C.A06);
        Status status = AnonymousClass63T.A0G;
        A01(status, this);
        AnonymousClass64J.A00(status, this.A06, false);
        for (S41 qpo : (S41[]) this.A08.keySet().toArray(new S41[0])) {
            A0D(new C8383Qpo(qpo, new C365498nD()));
        }
        A00(new ConnectionResult(4));
        if (this.A04.isConnected()) {
            C10265RpP rpP = new C10265RpP(this);
            rpP.A00.A0C.A06.post(new TDK(rpP));
        }
    }

    public final void A0B(ConnectionResult connectionResult) {
        AnonymousClass3Qk.A01(this.A0C.A06);
        AnonymousClass647 r4 = this.A04;
        r4.APT(002.A0u("onSignInFailed for ", r4.getClass().getName(), " with ", String.valueOf(connectionResult)));
        A0C(connectionResult, (Exception) null);
    }

    public final void A0C(ConnectionResult connectionResult, Exception exc) {
        Status A002;
        int i;
        AnonymousClass63T r5 = this.A0C;
        Handler handler = r5.A06;
        AnonymousClass3Qk.A01(handler);
        zact zact = this.A0A;
        if (zact != null) {
            int A032 = AnonymousClass0fD.A03(1292349397);
            C13954TmH tmH = zact.A01;
            if (tmH != null) {
                tmH.disconnect();
                i = -762160796;
            } else {
                i = 1129041158;
            }
            AnonymousClass0fD.A0A(i, A032);
        }
        AnonymousClass3Qk.A01(handler);
        this.A01 = null;
        r5.A08.A01.clear();
        A00(connectionResult);
        if ((this.A04 instanceof C8399Qq4) && connectionResult.A01 != 24) {
            r5.A03 = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        int i2 = connectionResult.A01;
        if (i2 == 4) {
            A002 = AnonymousClass63T.A0H;
        } else {
            Queue queue = this.A09;
            if (queue.isEmpty()) {
                this.A01 = connectionResult;
                return;
            } else if (exc != null) {
                AnonymousClass3Qk.A01(handler);
                A02((Status) null, exc, false);
                return;
            } else {
                boolean z = r5.A0E;
                AnonymousClass63Q r1 = this.A05;
                if (z) {
                    A02(AnonymousClass63T.A00(connectionResult, r1), (Exception) null, true);
                    if (!queue.isEmpty() && !A07(connectionResult) && !r5.A09(connectionResult, this.A03)) {
                        if (i2 == 18) {
                            this.A02 = true;
                        }
                        if (this.A02) {
                            handler.sendMessageDelayed(Message.obtain(handler, 9, r1), LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                A002 = AnonymousClass63T.A00(connectionResult, r1);
            }
        }
        A01(A002, this);
    }

    public final void A0D(C11033S6l s6l) {
        AnonymousClass3Qk.A01(this.A0C.A06);
        if (!this.A04.isConnected()) {
            this.A09.add(s6l);
            ConnectionResult connectionResult = this.A01;
            if (connectionResult == null || connectionResult.A01 == 0 || connectionResult.A02 == null) {
                A09();
            } else {
                A0C(connectionResult, (Exception) null);
            }
        } else if (A08(s6l)) {
            A05(this);
        } else {
            this.A09.add(s6l);
        }
    }

    public final void D5e(Bundle bundle) {
        AnonymousClass63T r0 = this.A0C;
        Looper myLooper = Looper.myLooper();
        Handler handler = r0.A06;
        if (myLooper == handler.getLooper()) {
            A04(this);
        } else {
            handler.post(new TDJ(this));
        }
    }

    public final void D5q(int i) {
        AnonymousClass63T r0 = this.A0C;
        Looper myLooper = Looper.myLooper();
        Handler handler = r0.A06;
        if (myLooper == handler.getLooper()) {
            A06(this, i);
        } else {
            handler.post(new TH4(this, i));
        }
    }
}
