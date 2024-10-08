package com.instagram.login.smartlock.impl;

import X.002;
import X.0lg;
import X.0yf;
import X.1WP;
import X.AnonymousClass3Qk;
import X.AnonymousClass63I;
import X.AnonymousClass63K;
import X.AnonymousClass63S;
import X.AnonymousClass642;
import X.AnonymousClass643;
import X.AnonymousClass647;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10134RnB;
import X.C10136RnD;
import X.C13675Tek;
import X.C13806ThV;
import X.C49914FEn;
import X.C50521Fdh;
import X.C51970G9q;
import X.C66581MXm;
import X.C8386Qpr;
import X.JTP;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.QpU;
import X.Sx8;
import X.Sx9;
import X.SxB;
import android.content.Context;
import android.os.Looper;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

public class SmartLockPluginImpl extends 1WP {
    public boolean A00 = true;
    public final Map A01 = new WeakHashMap();
    public final Map A02 = new WeakHashMap();
    public final Map A03 = new WeakHashMap();

    public void getSmartLockBroker(FragmentActivity fragmentActivity, C13675Tek tek, 0lg r4) {
        getSmartLockBroker(fragmentActivity, tek, r4, false);
    }

    public boolean getShouldShowSmartLockForLogin() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r3v2, types: [X.QpM, X.63E] */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        if (r3 != null) goto L_0x001e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C51864G4y listenForSmsResponse(android.app.Activity r6, boolean r7) {
        /*
            r5 = this;
            java.util.Map r4 = r5.A03
            java.lang.Object r3 = r4.get(r6)
            X.G4y r3 = (X.C51864G4y) r3
            if (r7 != 0) goto L_0x001c
            if (r3 == 0) goto L_0x0034
            r1 = r3
            X.Dir r1 = (X.C46663Dir) r1
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.A03
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x001b
            java.lang.String r0 = r1.A01
            if (r0 == 0) goto L_0x001e
        L_0x001b:
            return r3
        L_0x001c:
            if (r3 == 0) goto L_0x0034
        L_0x001e:
            X.Dir r3 = (X.C46663Dir) r3
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.A03
            boolean r0 = r1.get()
            if (r0 == 0) goto L_0x0034
            r0 = 0
            boolean r0 = r1.getAndSet(r0)
            if (r0 == 0) goto L_0x0034
            android.content.Context r0 = r3.A02
            r0.unregisterReceiver(r3)
        L_0x0034:
            X.63K r2 = X.C8364QpM.A00
            X.63M r1 = X.AnonymousClass63L.A00
            X.63N r0 = X.AnonymousClass63N.A02
            X.QpM r3 = new X.QpM
            r3.<init>((android.content.Context) r6, (X.AnonymousClass63L) r1, (X.AnonymousClass63K) r2, (X.AnonymousClass63N) r0)
            X.SHO r2 = X.SFC.A00()
            X.SxJ r0 = new X.SxJ
            r0.<init>(r3)
            r2.A01 = r0
            r1 = 1
            com.google.android.gms.common.Feature r0 = X.C10130Rn7.A02
            com.google.android.gms.common.Feature[] r0 = new com.google.android.gms.common.Feature[]{r0}
            r2.A03 = r0
            r0 = 1567(0x61f, float:2.196E-42)
            X.9GD r2 = X.SHO.A00(r3, r2, r0, r1)
            X.Dir r3 = new X.Dir
            r3.<init>(r6)
            r1 = 3
            X.Sz5 r0 = new X.Sz5
            r0.<init>(r3, r1)
            r2.A09(r0)
            r4.put(r6, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.login.smartlock.impl.SmartLockPluginImpl.listenForSmsResponse(android.app.Activity, boolean):X.G4y");
    }

    public void setShouldShowSmartLockForLogin(boolean z) {
        this.A00 = z;
    }

    public void getSmartLockBroker(FragmentActivity fragmentActivity, C13675Tek tek, 0lg r39, boolean z) {
        Object obj;
        FragmentActivity fragmentActivity2 = fragmentActivity;
        C13675Tek tek2 = tek;
        if (fragmentActivity == null) {
            obj = null;
        } else {
            Map map = this.A02;
            if (map.containsKey(fragmentActivity2)) {
                obj = map.get(fragmentActivity2);
            } else {
                Map map2 = this.A01;
                Set set = (Set) map2.get(fragmentActivity2);
                if (set != null) {
                    set.add(tek2);
                    return;
                }
                HashSet A1F = AnonymousClass7TE.A1F();
                A1F.add(tek2);
                map2.put(fragmentActivity2, A1F);
                C50521Fdh fdh = new C50521Fdh(1, this, fragmentActivity2);
                GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.A00;
                if (Pxe.A05(fragmentActivity2, googleApiAvailability) == 0) {
                    C49914FEn fEn = new C49914FEn(r39);
                    Context applicationContext = fragmentActivity2.getApplicationContext();
                    AnonymousClass63K r7 = null;
                    HashSet A1F2 = AnonymousClass7TE.A1F();
                    HashSet A1F3 = AnonymousClass7TE.A1F();
                    0yf A0N = Pxe.A0N(0);
                    0yf A0N2 = Pxe.A0N(0);
                    AnonymousClass63I r24 = C10134RnB.A00;
                    ArrayList A1C = AnonymousClass7TE.A1C();
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    Looper mainLooper = applicationContext.getMainLooper();
                    String packageName = applicationContext.getPackageName();
                    String A0y = C66581MXm.A0y(applicationContext);
                    AnonymousClass63K r2 = C10136RnD.A04;
                    AnonymousClass3Qk.A03(r2, "Api must not be null");
                    A0N2.put(r2, (Object) null);
                    AnonymousClass3Qk.A03(r2.A00, "Base client builder must not be null");
                    List emptyList = Collections.emptyList();
                    A1F3.addAll(emptyList);
                    A1F2.addAll(emptyList);
                    Sx9 sx9 = new Sx9(new C50521Fdh(0, fdh, fEn), z);
                    int i = sx9.A01;
                    A1C.add(sx9);
                    AnonymousClass3Qk.A08(!A0N2.isEmpty(), "must call addApi() to add at least one API");
                    AnonymousClass642 r0 = AnonymousClass642.A00;
                    AnonymousClass63K r8 = C10134RnB.A04;
                    if (A0N2.containsKey(r8)) {
                        r0 = (AnonymousClass642) A0N2.get(r8);
                    }
                    AnonymousClass643 r29 = new AnonymousClass643(r0, packageName, A0y, A0N, A1F2);
                    Map map3 = r29.A04;
                    Map A0N3 = Pxe.A0N(0);
                    Map A0N4 = Pxe.A0N(0);
                    ArrayList A1C3 = AnonymousClass7TE.A1C();
                    for (AnonymousClass63K r10 : A0N2.keySet()) {
                        Object obj2 = A0N2.get(r10);
                        boolean A1V = AnonymousClass7TF.A1V(map3.get(r10));
                        JTP.A1R(r10, A0N3, A1V);
                        Sx8 sx8 = new Sx8(r10, A1V);
                        A1C3.add(sx8);
                        AnonymousClass63I r82 = r10.A00;
                        AnonymousClass3Qk.A02(r82);
                        AnonymousClass647 A002 = r82.A00(applicationContext, mainLooper, sx8, sx8, r29, obj2);
                        A0N4.put(r10.A01, A002);
                        if (A002.E57()) {
                            if (r7 == null) {
                                r7 = r10;
                            } else {
                                throw Pxg.A0e(r10.A02, " cannot be used with ", r7.A02);
                            }
                        }
                    }
                    if (r7 != null) {
                        Object[] objArr = {r7.A02};
                        if (!A1F2.equals(A1F3)) {
                            throw Pxf.A0Y("Must not set scopes in GoogleApiClient.Builder when using %s. Set account in GoogleSignInOptions.Builder instead.", objArr);
                        }
                    }
                    ArrayList arrayList = A1C3;
                    ArrayList arrayList2 = A1C;
                    Map map4 = A0N3;
                    Map map5 = A0N4;
                    GoogleApiAvailability googleApiAvailability2 = googleApiAvailability;
                    AnonymousClass643 r25 = r29;
                    QpU qpU = new QpU(applicationContext, mainLooper, googleApiAvailability2, r24, r25, arrayList, arrayList2, A1C2, map4, map5, new ReentrantLock(), i, QpU.A00(A0N4.values(), true));
                    Set set2 = AnonymousClass63S.A00;
                    synchronized (set2) {
                        set2.add(qpU);
                    }
                    C13806ThV A003 = LifecycleCallback.A00(fragmentActivity2);
                    C8386Qpr qpr = (C8386Qpr) A003.Ajc(C8386Qpr.class, "AutoManageHelper");
                    if (qpr == null) {
                        qpr = new C8386Qpr(A003);
                    }
                    SparseArray sparseArray = qpr.A00;
                    int indexOfKey = sparseArray.indexOfKey(i);
                    AnonymousClass3Qk.A09(C51970G9q.A1T(indexOfKey), 002.A0O("Already managing a GoogleApiClient with id ", i));
                    Object obj3 = qpr.A01.get();
                    String.valueOf(obj3);
                    SxB sxB = new SxB(sx9, qpU, qpr, i);
                    qpU.A0D(sxB);
                    sparseArray.put(i, sxB);
                    if (qpr.A03 && obj3 == null) {
                        qpU.toString();
                        qpU.A08();
                    }
                    sx9.A00 = qpU;
                    fEn.A00 = sx9;
                    return;
                }
                fdh.D5D((Object) null);
                return;
            }
        }
        tek2.D5D(obj);
    }
}
