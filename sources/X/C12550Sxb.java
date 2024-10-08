package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.internal.base.zaa;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Sxb  reason: case insensitive filesystem */
public final class C12550Sxb implements C13840TiF {
    public IAccountAccessor A00;
    public C13954TmH A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public int A07;
    public int A08 = 0;
    public int A09;
    public ConnectionResult A0A;
    public final Context A0B;
    public final GoogleApiAvailabilityLight A0C;
    public final C12554Sxf A0D;
    public final AnonymousClass643 A0E;
    public final ArrayList A0F = AnonymousClass7TE.A1C();
    public final Lock A0G;
    public final Bundle A0H = AnonymousClass7TE.A0a();
    public final AnonymousClass63I A0I;
    public final Map A0J;
    public final Set A0K = AnonymousClass7TE.A1F();

    public static final void A03(C12550Sxb sxb) {
        sxb.A03 = false;
        C12554Sxf sxf = sxb.A0D;
        sxf.A05.A03 = Collections.emptySet();
        for (Object next : sxb.A0K) {
            Map map = sxf.A0A;
            if (!map.containsKey(next)) {
                map.put(next, new ConnectionResult(17, (PendingIntent) null));
            }
        }
    }

    public final void FOU() {
    }

    public final void FOX(Bundle bundle) {
        if (A07(this, 1)) {
            if (bundle != null) {
                this.A0H.putAll(bundle);
            }
            if (A06(this)) {
                A00();
            }
        }
    }

    public final void FOY(ConnectionResult connectionResult, AnonymousClass63K r3, boolean z) {
        if (A07(this, 1)) {
            A01(connectionResult, r3, this, z);
            if (A06(this)) {
                A00();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    private final void A00() {
        IBinder iBinder;
        C12554Sxf sxf = this.A0D;
        Lock lock = sxf.A0D;
        lock.lock();
        try {
            sxf.A05.A0H();
            sxf.A0E = new SxZ(sxf);
            sxf.A0E.FOR();
            sxf.A0C.signalAll();
            lock.unlock();
            C9986Rkf.A00.execute(new TDH(this));
            C13954TmH tmH = this.A01;
            if (tmH != null) {
                if (this.A05) {
                    IAccountAccessor iAccountAccessor = this.A00;
                    AnonymousClass3Qk.A02(iAccountAccessor);
                    boolean z = this.A06;
                    C8405QqA qqA = (C8405QqA) tmH;
                    try {
                        zaa zaa = (zaa) qqA.A03();
                        Integer num = qqA.A00;
                        AnonymousClass3Qk.A02(num);
                        int intValue = num.intValue();
                        int A032 = AnonymousClass0fD.A03(-1016209369);
                        Parcel A002 = zaa.A00();
                        if (iAccountAccessor == null) {
                            iBinder = null;
                        } else {
                            iBinder = iAccountAccessor.asBinder();
                        }
                        A002.writeStrongBinder(iBinder);
                        A002.writeInt(intValue);
                        A002.writeInt(z ? 1 : 0);
                        zaa.A01(A002, 9);
                        AnonymousClass0fD.A0A(-1790750157, A032);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                A05(false);
            }
            Iterator A16 = DbV.A16(sxf.A0A);
            while (A16.hasNext()) {
                Object obj = sxf.A09.get(A16.next());
                AnonymousClass3Qk.A02(obj);
                ((AnonymousClass647) obj).disconnect();
            }
            Bundle bundle = this.A0H;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            sxf.A07.FOO(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0020, code lost:
        if (r5.A02 == null) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(com.google.android.gms.common.ConnectionResult r5, X.C12550Sxb r6) {
        /*
            java.util.ArrayList r4 = r6.A0F
            int r3 = r4.size()
            r2 = 0
        L_0x0007:
            if (r2 >= r3) goto L_0x0016
            java.lang.Object r1 = r4.get(r2)
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r0 = 1
            r1.cancel(r0)
            int r2 = r2 + 1
            goto L_0x0007
        L_0x0016:
            r4.clear()
            int r0 = r5.A01
            if (r0 == 0) goto L_0x0022
            android.app.PendingIntent r1 = r5.A02
            r0 = 1
            if (r1 != 0) goto L_0x0023
        L_0x0022:
            r0 = 0
        L_0x0023:
            r0 = r0 ^ 1
            r6.A05(r0)
            X.Sxf r0 = r6.A0D
            r0.A00(r5)
            X.Th0 r0 = r0.A07
            r0.FOL(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12550Sxb.A02(com.google.android.gms.common.ConnectionResult, X.Sxb):void");
    }

    public static final void A04(C12550Sxb sxb) {
        if (sxb.A09 != 0) {
            return;
        }
        if (!sxb.A03 || sxb.A04) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            sxb.A08 = 1;
            C12554Sxf sxf = sxb.A0D;
            Map map = sxf.A09;
            sxb.A09 = map.size();
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                Object next = A16.next();
                if (!sxf.A0A.containsKey(next)) {
                    A1C.add(map.get(next));
                } else if (A06(sxb)) {
                    sxb.A00();
                }
            }
            if (!A1C.isEmpty()) {
                sxb.A0F.add(C9986Rkf.A00.submit(new C8373Qpe(sxb, A1C)));
            }
        }
    }

    private final void A05(boolean z) {
        C13954TmH tmH = this.A01;
        if (tmH != null) {
            if (tmH.isConnected() && z) {
                C8405QqA qqA = (C8405QqA) tmH;
                try {
                    zaa zaa = (zaa) qqA.A03();
                    Integer num = qqA.A00;
                    AnonymousClass3Qk.A02(num);
                    int intValue = num.intValue();
                    int A032 = AnonymousClass0fD.A03(-886822658);
                    Parcel A002 = zaa.A00();
                    A002.writeInt(intValue);
                    zaa.A01(A002, 7);
                    AnonymousClass0fD.A0A(1596129880, A032);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            tmH.disconnect();
            AnonymousClass3Qk.A02(this.A0E);
            this.A00 = null;
        }
    }

    public static final boolean A06(C12550Sxb sxb) {
        ConnectionResult connectionResult;
        int i = sxb.A09 - 1;
        sxb.A09 = i;
        if (i <= 0) {
            if (i < 0) {
                QpU qpU = sxb.A0D.A05;
                StringWriter stringWriter = new StringWriter();
                qpU.A0E("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
                Log.w("GACConnecting", stringWriter.toString());
                Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                connectionResult = new ConnectionResult(8, (PendingIntent) null);
            } else {
                connectionResult = sxb.A0A;
                if (connectionResult == null) {
                    return true;
                }
                sxb.A0D.A00 = sxb.A07;
            }
            A02(connectionResult, sxb);
        }
        return false;
    }

    public static final boolean A07(C12550Sxb sxb, int i) {
        String str;
        String str2;
        if (sxb.A08 == i) {
            return true;
        }
        QpU qpU = sxb.A0D.A05;
        StringWriter stringWriter = new StringWriter();
        qpU.A0E("", (FileDescriptor) null, new PrintWriter(stringWriter), (String[]) null);
        Log.w("GACConnecting", stringWriter.toString());
        Log.w("GACConnecting", "Unexpected callback in ".concat(sxb.toString()));
        Log.w("GACConnecting", 002.A0O("mRemainingConnections=", sxb.A09));
        if (sxb.A08 != 0) {
            str = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        if (i != 0) {
            str2 = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        Log.e("GACConnecting", 002.A0u("GoogleApiClient connecting is in step ", str, " but received callback for step ", str2), new Exception());
        A02(new ConnectionResult(8, (PendingIntent) null), sxb);
        return false;
    }

    public final C8412Qts FOK(C8412Qts qts) {
        this.A0D.A05.A0F.add(qts);
        return qts;
    }

    public final C8412Qts FON(C8412Qts qts) {
        throw AnonymousClass7TE.A0z("GoogleApiClient is not connected yet.");
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.TmH, X.647] */
    public final void FOR() {
        C12554Sxf sxf = this.A0D;
        sxf.A0A.clear();
        this.A03 = false;
        this.A0A = null;
        this.A08 = 0;
        this.A02 = true;
        this.A04 = false;
        this.A05 = false;
        HashMap A1E = AnonymousClass7TE.A1E();
        Map map = this.A0J;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            AnonymousClass63K r6 = (AnonymousClass63K) A16.next();
            AnonymousClass63G r5 = r6.A01;
            Object obj = sxf.A09.get(r5);
            AnonymousClass3Qk.A02(obj);
            AnonymousClass647 r4 = (AnonymousClass647) obj;
            boolean A1a = AnonymousClass7TE.A1a(map.get(r6));
            if (r4.requiresSignIn()) {
                this.A03 = true;
                if (A1a) {
                    this.A0K.add(r5);
                } else {
                    this.A02 = false;
                }
            }
            A1E.put(r4, new C12556Sxh(r6, this, A1a));
        }
        if (this.A03) {
            AnonymousClass643 r9 = this.A0E;
            AnonymousClass3Qk.A02(r9);
            AnonymousClass63I r42 = this.A0I;
            AnonymousClass3Qk.A02(r42);
            QpU qpU = sxf.A05;
            r9.A00 = Integer.valueOf(System.identityHashCode(qpU));
            Sx7 sx7 = new Sx7(this);
            this.A01 = r42.A00(this.A0B, qpU.A06, sx7, sx7, r9, r9.A01);
        }
        this.A09 = sxf.A09.size();
        this.A0F.add(C9986Rkf.A00.submit(new C8372Qpd(this, A1E)));
    }

    public final void FOZ(int i) {
        A02(new ConnectionResult(8, (PendingIntent) null), this);
    }

    public final boolean FOa() {
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        A05(true);
        this.A0D.A00((ConnectionResult) null);
        return true;
    }

    public C12550Sxb(Context context, GoogleApiAvailabilityLight googleApiAvailabilityLight, AnonymousClass63I r4, C12554Sxf sxf, AnonymousClass643 r6, Map map, Lock lock) {
        this.A0D = sxf;
        this.A0E = r6;
        this.A0J = map;
        this.A0C = googleApiAvailabilityLight;
        this.A0I = r4;
        this.A0G = lock;
        this.A0B = context;
    }

    public static final void A01(ConnectionResult connectionResult, AnonymousClass63K r5, C12550Sxb sxb, boolean z) {
        int i;
        if ((!z || !(((i = connectionResult.A01) == 0 || connectionResult.A02 == null) && sxb.A0C.A04((Context) null, (String) null, i) == null)) && sxb.A0A == null) {
            sxb.A0A = connectionResult;
            sxb.A07 = Integer.MAX_VALUE;
        }
        C12554Sxf sxf = sxb.A0D;
        sxf.A0A.put(r5.A01, connectionResult);
    }
}
