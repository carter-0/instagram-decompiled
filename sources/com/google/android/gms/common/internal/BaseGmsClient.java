package com.google.android.gms.common.internal;

import X.002;
import X.AnonymousClass000;
import X.AnonymousClass0fD;
import X.AnonymousClass3Qk;
import X.AnonymousClass63a;
import X.AnonymousClass644;
import X.AnonymousClass64F;
import X.AnonymousClass64H;
import X.AnonymousClass64I;
import X.AnonymousClass64Q;
import X.AnonymousClass64T;
import X.AnonymousClass64U;
import X.AnonymousClass64V;
import X.C295535oP;
import X.C301095yU;
import X.C301115yW;
import X.C301135ya;
import X.C376409Hw;
import X.C9696RfE;
import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.auth_blockstore.zza;
import com.google.android.gms.internal.auth_blockstore.zzf;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class BaseGmsClient {
    public static final Feature[] A0T = new Feature[0];
    public int A00;
    public int A01;
    public int A02 = 1;
    public long A03;
    public long A04;
    public long A05;
    public ConnectionResult A06 = null;
    public AnonymousClass64Q A07;
    public IGmsServiceBroker A08;
    public AnonymousClass64U A09;
    public AtomicInteger A0A = new AtomicInteger(0);
    public boolean A0B = false;
    public IInterface A0C;
    public AnonymousClass64T A0D;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final AnonymousClass64F A0H;
    public final AnonymousClass64H A0I;
    public final Object A0J = new Object();
    public final Object A0K = new Object();
    public final String A0L;
    public final ArrayList A0M = new ArrayList();
    public final Looper A0N;
    public final GoogleApiAvailabilityLight A0O;
    public final AnonymousClass63a A0P;
    public volatile zzk A0Q = null;
    public volatile String A0R;
    public volatile String A0S = null;

    public static final void A00(IInterface iInterface, BaseGmsClient baseGmsClient, int i) {
        AnonymousClass64U r0;
        boolean z = false;
        boolean z2 = true;
        if (i != 4) {
            z2 = false;
        }
        boolean z3 = true;
        if (iInterface == null) {
            z3 = false;
        }
        if (z2 == z3) {
            z = true;
        }
        AnonymousClass3Qk.A07(z);
        synchronized (baseGmsClient.A0J) {
            baseGmsClient.A02 = i;
            baseGmsClient.A0C = iInterface;
            if (i == 1) {
                AnonymousClass64T r5 = baseGmsClient.A0D;
                if (r5 != null) {
                    AnonymousClass63a r3 = baseGmsClient.A0P;
                    AnonymousClass64U r02 = baseGmsClient.A09;
                    String str = r02.A00;
                    AnonymousClass3Qk.A02(str);
                    r3.A02(r5, new AnonymousClass64V(str, r02.A01));
                    baseGmsClient.A0D = null;
                }
            } else if (i == 2 || i == 3) {
                AnonymousClass64T r6 = baseGmsClient.A0D;
                if (!(r6 == null || (r0 = baseGmsClient.A09) == null)) {
                    Log.e("GmsClient", 002.A0u("Calling connect() while still connected, missing disconnect() for ", r0.A00, " on ", "com.google.android.gms"));
                    AnonymousClass63a r32 = baseGmsClient.A0P;
                    AnonymousClass64U r03 = baseGmsClient.A09;
                    String str2 = r03.A00;
                    AnonymousClass3Qk.A02(str2);
                    r32.A02(r6, new AnonymousClass64V(str2, r03.A01));
                    baseGmsClient.A0A.incrementAndGet();
                }
                AtomicInteger atomicInteger = baseGmsClient.A0A;
                AnonymousClass64T r7 = new AnonymousClass64T(baseGmsClient, atomicInteger.get());
                baseGmsClient.A0D = r7;
                AnonymousClass64U r2 = new AnonymousClass64U(baseGmsClient.A06(), baseGmsClient.A08());
                baseGmsClient.A09 = r2;
                boolean z4 = r2.A01;
                if (!z4 || baseGmsClient.getMinApkVersion() >= 17895000) {
                    AnonymousClass63a r33 = baseGmsClient.A0P;
                    String str3 = r2.A00;
                    AnonymousClass3Qk.A02(str3);
                    String str4 = baseGmsClient.A0L;
                    if (str4 == null) {
                        str4 = baseGmsClient.A0F.getClass().getName();
                    }
                    if (!r33.A03(r7, new AnonymousClass64V(str3, z4), str4)) {
                        Log.w("GmsClient", 002.A0u("unable to connect to service: ", baseGmsClient.A09.A00, " on ", "com.google.android.gms"));
                        int i2 = atomicInteger.get();
                        C301095yU r34 = new C301095yU(baseGmsClient, 16);
                        Handler handler = baseGmsClient.A0G;
                        handler.sendMessage(handler.obtainMessage(7, i2, -1, r34));
                    }
                } else {
                    throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(r2.A00)));
                }
            } else if (i == 4) {
                AnonymousClass3Qk.A02(iInterface);
                baseGmsClient.A04 = System.currentTimeMillis();
            }
        }
    }

    public boolean E57() {
        return false;
    }

    public abstract int getMinApkVersion();

    public boolean requiresSignIn() {
        return false;
    }

    public static /* bridge */ /* synthetic */ boolean A01(IInterface iInterface, BaseGmsClient baseGmsClient, int i, int i2) {
        synchronized (baseGmsClient.A0J) {
            if (baseGmsClient.A02 != i) {
                return false;
            }
            A00(iInterface, baseGmsClient, i2);
            return true;
        }
    }

    public Bundle A02() {
        return new Bundle();
    }

    public final IInterface A03() {
        IInterface iInterface;
        synchronized (this.A0J) {
            if (this.A02 != 5) {
                A07();
                iInterface = this.A0C;
                AnonymousClass3Qk.A03(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public IInterface A04(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        if (queryLocalInterface instanceof zzf) {
            return queryLocalInterface;
        }
        zza zza = new zza(iBinder);
        AnonymousClass0fD.A0A(657767852, AnonymousClass0fD.A03(-420895720));
        return zza;
    }

    public String A05() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    public String A06() {
        return "com.google.android.gms.auth.blockstore.service.START";
    }

    public boolean A08() {
        if ((this instanceof AnonymousClass644) || getMinApkVersion() >= 211700000) {
            return true;
        }
        return false;
    }

    public boolean A09() {
        if (this instanceof AnonymousClass644) {
            return true;
        }
        return false;
    }

    public Feature[] A0A() {
        if (this instanceof AnonymousClass644) {
            return C301135ya.A08;
        }
        return A0T;
    }

    public final void AJG(AnonymousClass64Q r3) {
        AnonymousClass3Qk.A03(r3, "Connection progress callbacks cannot be null.");
        this.A07 = r3;
        A00((IInterface) null, this, 2);
    }

    public void APT(String str) {
        this.A0S = str;
        disconnect();
    }

    /* JADX INFO: finally extract failed */
    public final void Blb(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A022 = A02();
        String str = this.A0R;
        Scope[] scopeArr = GetServiceRequest.A0F;
        Bundle bundle = new Bundle();
        int i = this.A0E;
        Feature[] featureArr = GetServiceRequest.A0E;
        GetServiceRequest getServiceRequest = new GetServiceRequest((Account) null, bundle, (IBinder) null, (String) null, str, featureArr, featureArr, scopeArr, 6, i, 12451000, 0, true, false);
        getServiceRequest.A03 = this.A0F.getPackageName();
        getServiceRequest.A01 = A022;
        Set set2 = set;
        if (set != null) {
            getServiceRequest.A07 = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (requiresSignIn()) {
            getServiceRequest.A00 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                getServiceRequest.A02 = iAccountAccessor.asBinder();
            }
        }
        getServiceRequest.A05 = A0T;
        getServiceRequest.A06 = A0A();
        if (A09()) {
            getServiceRequest.A04 = true;
        }
        try {
            synchronized (this.A0K) {
                IGmsServiceBroker iGmsServiceBroker = this.A08;
                if (iGmsServiceBroker != null) {
                    zzd zzd = new zzd(this, this.A0A.get());
                    zzad zzad = (zzad) iGmsServiceBroker;
                    int A032 = AnonymousClass0fD.A03(1496275803);
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(zzd.asBinder());
                        obtain.writeInt(1);
                        C376409Hw.A00(obtain, getServiceRequest, 0);
                        zzad.A00.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                        AnonymousClass0fD.A0A(681444654, A032);
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        AnonymousClass0fD.A0A(-1560154449, A032);
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i2 = this.A0A.get();
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, i2, 3));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            int i3 = this.A0A.get();
            C295535oP r2 = new C295535oP((Bundle) null, (IBinder) null, this, 8);
            Handler handler2 = this.A0G;
            handler2.sendMessage(handler2.obtainMessage(1, i3, -1, r2));
        }
    }

    public Intent BwH() {
        throw new UnsupportedOperationException("Not a sign in API");
    }

    public final boolean CQT() {
        boolean z;
        synchronized (this.A0J) {
            int i = this.A02;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    public void disconnect() {
        this.A0A.incrementAndGet();
        ArrayList arrayList = this.A0M;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C301115yW r1 = (C301115yW) arrayList.get(i);
                synchronized (r1) {
                    r1.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0K) {
            this.A08 = null;
        }
        A00((IInterface) null, this, 1);
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i;
        IInterface iInterface;
        IGmsServiceBroker iGmsServiceBroker;
        String A002;
        String str2;
        synchronized (this.A0J) {
            i = this.A02;
            iInterface = this.A0C;
        }
        synchronized (this.A0K) {
            iGmsServiceBroker = this.A08;
        }
        printWriter.append(str).append("mConnectState=");
        if (i == 1) {
            A002 = AnonymousClass000.A00(4333);
        } else if (i == 2) {
            A002 = "REMOTE_CONNECTING";
        } else if (i == 3) {
            A002 = "LOCAL_CONNECTING";
        } else if (i != 4) {
            A002 = "DISCONNECTING";
        } else {
            A002 = "CONNECTED";
        }
        printWriter.print(A002);
        printWriter.append(" mService=");
        if (iInterface == null) {
            printWriter.append("null");
        } else {
            printWriter.append(A05()).append("@").append(Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
        }
        printWriter.append(" mServiceBroker=");
        if (iGmsServiceBroker == null) {
            printWriter.println("null");
        } else {
            printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(AnonymousClass000.A00(4286), Locale.US);
        if (this.A04 > 0) {
            PrintWriter append = printWriter.append(str).append("lastConnectedTime=");
            long j = this.A04;
            String format = simpleDateFormat.format(new Date(j));
            StringBuilder sb = new StringBuilder();
            sb.append(j);
            sb.append(" ");
            sb.append(format);
            append.println(sb.toString());
        }
        if (this.A03 > 0) {
            printWriter.append(str).append("lastSuspendedCause=");
            int i2 = this.A00;
            if (i2 == 1) {
                str2 = "CAUSE_SERVICE_DISCONNECTED";
            } else if (i2 == 2) {
                str2 = "CAUSE_NETWORK_LOST";
            } else if (i2 != 3) {
                str2 = String.valueOf(i2);
            } else {
                str2 = "CAUSE_DEAD_OBJECT_EXCEPTION";
            }
            printWriter.append(str2);
            PrintWriter append2 = printWriter.append(" lastSuspendedTime=");
            long j2 = this.A03;
            String format2 = simpleDateFormat.format(new Date(j2));
            StringBuilder sb2 = new StringBuilder();
            sb2.append(j2);
            sb2.append(" ");
            sb2.append(format2);
            append2.println(sb2.toString());
        }
        if (this.A05 > 0) {
            printWriter.append(str).append("lastFailedStatus=").append(C9696RfE.A00(this.A01));
            PrintWriter append3 = printWriter.append(" lastFailedTime=");
            long j3 = this.A05;
            String format3 = simpleDateFormat.format(new Date(j3));
            StringBuilder sb3 = new StringBuilder();
            sb3.append(j3);
            sb3.append(" ");
            sb3.append(format3);
            append3.println(sb3.toString());
        }
    }

    public final boolean isConnected() {
        boolean z;
        synchronized (this.A0J) {
            z = false;
            if (this.A02 == 4) {
                z = true;
            }
        }
        return z;
    }

    public BaseGmsClient(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, AnonymousClass64F r7, AnonymousClass64H r8, AnonymousClass63a r9, String str, int i) {
        AnonymousClass3Qk.A03(context, "Context must not be null");
        this.A0F = context;
        AnonymousClass3Qk.A03(looper, "Looper must not be null");
        this.A0N = looper;
        AnonymousClass3Qk.A03(r9, "Supervisor must not be null");
        this.A0P = r9;
        AnonymousClass3Qk.A03(googleApiAvailabilityLight, "API availability must not be null");
        this.A0O = googleApiAvailabilityLight;
        this.A0G = new AnonymousClass64I(looper, this);
        this.A0E = i;
        this.A0H = r7;
        this.A0I = r8;
        this.A0L = str;
    }

    public final void A07() {
        if (!isConnected()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
}
