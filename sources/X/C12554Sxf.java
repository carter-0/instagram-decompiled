package X;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: X.Sxf  reason: case insensitive filesystem */
public final class C12554Sxf implements C13841TiG, C3025563x {
    public int A00;
    public ConnectionResult A01 = null;
    public final Context A02;
    public final GoogleApiAvailabilityLight A03;
    public final AnonymousClass63I A04;
    public final QpU A05;
    public final C8434QuW A06;
    public final C13785Th0 A07;
    public final AnonymousClass643 A08;
    public final Map A09;
    public final Map A0A = AnonymousClass7TE.A1E();
    public final Map A0B;
    public final Condition A0C;
    public final Lock A0D;
    public volatile C13840TiF A0E;

    public final void FOe() {
    }

    public final boolean FOf() {
        return this.A0E instanceof SxZ;
    }

    public final boolean FOg(C13469Taw taw) {
        return false;
    }

    public final void A00(ConnectionResult connectionResult) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A01 = connectionResult;
            this.A0E = new C12549Sxa(this);
            this.A0E.FOR();
            this.A0C.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public final void D5e(Bundle bundle) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.FOX(bundle);
        } finally {
            lock.unlock();
        }
    }

    public final void D5q(int i) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.FOZ(i);
        } finally {
            lock.unlock();
        }
    }

    public final void FOM(ConnectionResult connectionResult, AnonymousClass63K r4, boolean z) {
        Lock lock = this.A0D;
        lock.lock();
        try {
            this.A0E.FOY(connectionResult, r4, z);
        } finally {
            lock.unlock();
        }
    }

    public final void FOb() {
        this.A0E.FOU();
    }

    public final void FOc() {
        this.A0E.FOa();
        this.A0A.clear();
    }

    public C12554Sxf(Context context, Looper looper, GoogleApiAvailabilityLight googleApiAvailabilityLight, AnonymousClass63I r7, QpU qpU, C13785Th0 th0, AnonymousClass643 r10, ArrayList arrayList, Map map, Map map2, Lock lock) {
        this.A02 = context;
        this.A0D = lock;
        this.A03 = googleApiAvailabilityLight;
        this.A09 = map;
        this.A08 = r10;
        this.A0B = map2;
        this.A04 = r7;
        this.A05 = qpU;
        this.A07 = th0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Sx8) arrayList.get(i)).A00 = this;
        }
        this.A06 = new C8434QuW(looper, this);
        this.A0C = lock.newCondition();
        this.A0E = new C12549Sxa(this);
    }

    public final C8412Qts FOT(C8412Qts qts) {
        qts.A05();
        this.A0E.FOK(qts);
        return qts;
    }

    public final C8412Qts FOW(C8412Qts qts) {
        qts.A05();
        return this.A0E.FON(qts);
    }

    public final void FOd(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        printWriter.append(str).append("mState=").println(this.A0E);
        Iterator A16 = DbV.A16(this.A0B);
        while (A16.hasNext()) {
            String valueOf = String.valueOf(str);
            AnonymousClass63K r2 = (AnonymousClass63K) A16.next();
            printWriter.append(str).append(r2.A02).println(":");
            Object obj = this.A09.get(r2.A01);
            AnonymousClass3Qk.A02(obj);
            ((AnonymousClass647) obj).dump(valueOf.concat("  "), fileDescriptor, printWriter, strArr);
        }
    }
}
