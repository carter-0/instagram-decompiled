package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Status;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Sxe  reason: case insensitive filesystem */
public final class C12553Sxe implements C13841TiG {
    public int A00 = 0;
    public Bundle A01;
    public ConnectionResult A02 = null;
    public ConnectionResult A03 = null;
    public boolean A04 = false;
    public final Context A05;
    public final AnonymousClass647 A06;
    public final QpU A07;
    public final C12554Sxf A08;
    public final C12554Sxf A09;
    public final Map A0A;
    public final Lock A0B;
    public final Looper A0C;
    public final Set A0D = Collections.newSetFromMap(new WeakHashMap());

    public final void FOb() {
        this.A00 = 2;
        this.A04 = false;
        this.A03 = null;
        this.A02 = null;
        this.A08.FOb();
        this.A09.FOb();
    }

    public final void FOc() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0;
        this.A08.FOc();
        this.A09.FOc();
        A00();
    }

    private final void A00() {
        Set<C13469Taw> set = this.A0D;
        for (C13469Taw taw : set) {
            ((QDZ) taw).A00.release();
        }
        set.clear();
    }

    private final void A01(ConnectionResult connectionResult) {
        int i = this.A00;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.A00 = 0;
            }
            this.A07.FOL(connectionResult);
        }
        A00();
        this.A00 = 0;
    }

    public static /* bridge */ /* synthetic */ void A02(C12553Sxe sxe) {
        ConnectionResult connectionResult = sxe.A02;
        if (connectionResult != null) {
            int i = connectionResult.A01;
            ConnectionResult connectionResult2 = sxe.A03;
            if (i == 0) {
                if (connectionResult2 != null) {
                    int i2 = connectionResult2.A01;
                    if (AnonymousClass7TF.A1Q(i2) || i2 == 4) {
                        int i3 = sxe.A00;
                        if (i3 != 1) {
                            if (i3 != 2) {
                                Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", Pxe.A0d());
                                sxe.A00 = 0;
                            }
                            QpU qpU = sxe.A07;
                            AnonymousClass3Qk.A02(qpU);
                            qpU.FOO(sxe.A01);
                        }
                        sxe.A00();
                        sxe.A00 = 0;
                    } else if (sxe.A00 == 1) {
                        sxe.A00();
                    } else {
                        sxe.A01(connectionResult2);
                        sxe.A08.FOc();
                    }
                }
            } else if (connectionResult2 != null) {
                if (connectionResult2.A01 == 0) {
                    sxe.A09.FOc();
                    connectionResult = sxe.A02;
                    AnonymousClass3Qk.A02(connectionResult);
                } else {
                    if (sxe.A09.A00 < sxe.A08.A00) {
                        connectionResult = connectionResult2;
                    }
                }
                sxe.A01(connectionResult);
            }
        }
    }

    public final C8412Qts FOT(C8412Qts qts) {
        PendingIntent activity;
        Object obj = this.A0A.get(qts.A00);
        AnonymousClass3Qk.A03(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C12554Sxf sxf = this.A09;
        if (obj.equals(sxf)) {
            ConnectionResult connectionResult = this.A03;
            if (connectionResult != null && connectionResult.A01 == 4) {
                AnonymousClass647 r1 = this.A06;
                if (r1 == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), r1.BwH(), C9992Rkm.A00 | 134217728);
                }
                qts.A0A(new Status(activity, (ConnectionResult) null, (String) null, 4));
                return qts;
            }
        } else {
            sxf = this.A08;
        }
        sxf.FOT(qts);
        return qts;
    }

    public final C8412Qts FOW(C8412Qts qts) {
        PendingIntent activity;
        Object obj = this.A0A.get(qts.A00);
        AnonymousClass3Qk.A03(obj, "GoogleApiClient is not configured to use the API required for this call.");
        C12554Sxf sxf = this.A09;
        if (obj.equals(sxf)) {
            ConnectionResult connectionResult = this.A03;
            if (connectionResult != null && connectionResult.A01 == 4) {
                AnonymousClass647 r1 = this.A06;
                if (r1 == null) {
                    activity = null;
                } else {
                    activity = PendingIntent.getActivity(this.A05, System.identityHashCode(this.A07), r1.BwH(), C9992Rkm.A00 | 134217728);
                }
                qts.A0A(new Status(activity, (ConnectionResult) null, (String) null, 4));
                return qts;
            }
        } else {
            sxf = this.A08;
        }
        return sxf.FOW(qts);
    }

    public final void FOe() {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            boolean A1S = AnonymousClass7TF.A1S(this.A00, 2);
            lock.unlock();
            this.A09.FOc();
            this.A03 = new ConnectionResult(4);
            if (A1S) {
                new C3024063e(this.A0C).post(new TDM(this));
            } else {
                A00();
            }
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        if (r5.A00 == 1) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean FOf() {
        /*
            r5 = this;
            java.util.concurrent.locks.Lock r4 = r5.A0B
            r4.lock()
            X.Sxf r0 = r5.A08     // Catch:{ all -> 0x002a }
            X.TiF r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.SxZ     // Catch:{ all -> 0x002a }
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0026
            X.Sxf r0 = r5.A09     // Catch:{ all -> 0x002a }
            X.TiF r0 = r0.A0E     // Catch:{ all -> 0x002a }
            boolean r0 = r0 instanceof X.SxZ     // Catch:{ all -> 0x002a }
            if (r0 != 0) goto L_0x0025
            com.google.android.gms.common.ConnectionResult r0 = r5.A03     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0021
            int r1 = r0.A01     // Catch:{ all -> 0x002a }
            r0 = 4
            if (r1 != r0) goto L_0x0021
            goto L_0x0025
        L_0x0021:
            int r0 = r5.A00     // Catch:{ all -> 0x002a }
            if (r0 != r2) goto L_0x0026
        L_0x0025:
            r3 = 1
        L_0x0026:
            r4.unlock()
            return r3
        L_0x002a:
            r0 = move-exception
            r4.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12553Sxe.FOf():boolean");
    }

    public final boolean FOg(C13469Taw taw) {
        Lock lock = this.A0B;
        lock.lock();
        try {
            lock.lock();
            boolean A1S = AnonymousClass7TF.A1S(this.A00, 2);
            lock.unlock();
            boolean z = true;
            if (A1S || FOf()) {
                C12554Sxf sxf = this.A09;
                if (!(sxf.A0E instanceof SxZ)) {
                    this.A0D.add(taw);
                    if (this.A00 == 0) {
                        this.A00 = 1;
                    }
                    this.A03 = null;
                    sxf.FOb();
                    return z;
                }
            }
            z = false;
            return z;
        } catch (Throwable th) {
            throw th;
        } finally {
            lock.unlock();
        }
    }

    public final void FOd(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("authClient").println(":");
        this.A09.FOd(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
        printWriter.append(str).append("anonClient").println(":");
        this.A08.FOd(String.valueOf(str).concat("  "), fileDescriptor, printWriter, strArr);
    }

    public C12553Sxe(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, AnonymousClass63I r31, AnonymousClass647 r32, QpU qpU, AnonymousClass643 r34, ArrayList arrayList, ArrayList arrayList2, Map map, Map map2, Map map3, Map map4, Lock lock) {
        Context context2 = context;
        this.A05 = context2;
        QpU qpU2 = qpU;
        this.A07 = qpU2;
        Lock lock2 = lock;
        this.A0B = lock2;
        Looper looper2 = looper;
        this.A0C = looper2;
        this.A06 = r32;
        Map map5 = map2;
        GoogleApiAvailabilityLight googleApiAvailabilityLight2 = googleApiAvailabilityLight;
        this.A08 = new C12554Sxf(context2, looper2, googleApiAvailabilityLight2, (AnonymousClass63I) null, qpU2, new C12551Sxc(this), (AnonymousClass643) null, arrayList2, map5, map4, lock2);
        Map map6 = map;
        Context context3 = context2;
        Looper looper3 = looper2;
        GoogleApiAvailabilityLight googleApiAvailabilityLight3 = googleApiAvailabilityLight2;
        QpU qpU3 = qpU2;
        C12552Sxd sxd = new C12552Sxd(this);
        this.A09 = new C12554Sxf(context3, looper3, googleApiAvailabilityLight3, r31, qpU3, sxd, r34, arrayList, map6, map3, lock2);
        0yf A0N = Pxe.A0N(0);
        Iterator A16 = DbV.A16(map5);
        while (A16.hasNext()) {
            A0N.put(A16.next(), this.A08);
        }
        Iterator A162 = DbV.A16(map6);
        while (A162.hasNext()) {
            A0N.put(A162.next(), this.A09);
        }
        this.A0A = Collections.unmodifiableMap(A0N);
    }
}
