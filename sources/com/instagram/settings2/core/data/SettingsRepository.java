package com.instagram.settings2.core.data;

import X.05D;
import X.05G;
import X.0V2;
import X.0Yh;
import X.0eP;
import X.0qQ;
import X.106;
import X.10D;
import X.1Al;
import X.1An;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262094Cc;
import X.C262224Cq;
import X.C318126oR;
import X.C41845B3m;
import X.C46573DhF;
import X.C49142Eq5;
import X.C51969G9p;
import X.C51973G9u;
import X.C61024JvO;
import X.C61076JwE;
import X.C61079JwH;
import X.C61240JzY;
import X.C61241JzZ;
import X.C61242Jza;
import X.C61243Jzb;
import X.C61244Jzc;
import X.C61770pa;
import X.C65622Lwx;
import X.C66460MSo;
import X.C66570MXa;
import X.DbT;
import X.I4T;
import X.JTR;
import X.JTS;
import X.LGF;
import X.MR1;
import X.MVF;
import X.MXZ;
import X.Pxd;
import X.XMD;
import com.instagram.api.schemas.RemoteBooleanSettingId;
import com.instagram.api.schemas.RemoteStringSettingId;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class SettingsRepository {
    public 0eP A00;
    public final UserSession A01;
    public final SettingsNetworkInteractor A02;
    public final LGF A03;
    public final I4T A04;
    public final String A05;
    public final Map A06 = AnonymousClass7TE.A1H();
    public final Map A07;
    public final ReentrantReadWriteLock A08 = new ReentrantReadWriteLock();
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new C46573DhF(this, 41));
    public final C262094Cc A0A;
    public final C262224Cq A0B;
    public final 0V2 A0C;
    public final 0V2 A0D;
    public final 0V2 A0E;
    public final 0V2 A0F;
    public final 0V2 A0G;
    public final 0V2 A0H;
    public final 0V2 A0I;
    public final 0V2 A0J;
    public final 0V2 A0K;
    public final 05G A0L;
    public final C61770pa A0M;
    public final C61770pa A0N;
    public final C61770pa A0O;
    public final C61770pa A0P;
    public final C61770pa A0Q;
    public final C61770pa A0R;
    public final C61770pa A0S;
    public final C61770pa A0T;
    public final C61770pa A0U;

    public final C61079JwH A02(C66460MSo mSo) {
        0qQ.A0B(mSo, 0);
        MVF A0X = JTS.A0X(this.A04, mSo);
        if (A0X != null) {
            return A0X.Bzr();
        }
        throw C51973G9u.A0g(mSo, "No setting model found for ID ", AnonymousClass7TE.A1A());
    }

    public final Boolean A03(MXZ mxz) {
        Boolean bool;
        0qQ.A0B(mxz, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A08.readLock();
        readLock.lock();
        try {
            Object obj = this.A06.get(mxz);
            if (obj == null) {
                bool = null;
            } else {
                bool = (Boolean) obj;
            }
            return bool;
        } finally {
            readLock.unlock();
        }
    }

    public final String A0B(C66570MXa mXa) {
        String str;
        0qQ.A0B(mXa, 0);
        ReentrantReadWriteLock.ReadLock readLock = this.A08.readLock();
        readLock.lock();
        try {
            Object obj = this.A06.get(mXa);
            if (obj == null) {
                str = null;
            } else {
                str = (String) obj;
            }
            return str;
        } finally {
            readLock.unlock();
        }
    }

    public static ClassCastException A00(Class cls, Object obj, Object obj2) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(", from ");
        sb.append(obj2);
        sb.append(", is not instance of ");
        sb.append(new 0Yh(cls));
        return new ClassCastException(sb.toString());
    }

    public static final Integer A01(SettingsRepository settingsRepository, C66460MSo mSo) {
        Object A0x = JTR.A0x(mSo, settingsRepository.A04.A05);
        if (A0x == null) {
            throw C51973G9u.A0g(mSo, "No setting model found for ID ", AnonymousClass7TE.A1A());
        } else if (A0x instanceof C61241JzZ) {
            return AnonymousClass05K.A00;
        } else {
            if (A0x instanceof C61242Jza) {
                return AnonymousClass05K.A01;
            }
            if (A0x instanceof C61240JzY) {
                return AnonymousClass05K.A0C;
            }
            if (A0x instanceof C61243Jzb) {
                return AnonymousClass05K.A0N;
            }
            throw AnonymousClass7TE.A1K();
        }
    }

    public final Object A04(C61079JwH jwH, AnonymousClass4D7 r6) {
        MR1 mr1 = (MR1) jwH.A01;
        if (XMD.A03(1, mr1)) {
            C61024JvO jvO = (C61024JvO) ((XMD) mr1).A01;
            if (C61024JvO.A00(0, jvO)) {
                SettingsNetworkInteractor settingsNetworkInteractor = this.A02;
                0qQ.A0C(jvO, "null cannot be cast to non-null type com.instagram.settings2.core.model.Storage.RemoteSettingId.Boolean");
                return settingsNetworkInteractor.A01((RemoteBooleanSettingId) jvO.A01, r6);
            }
            throw DbT.A0m();
        } else if (mr1 instanceof C61244Jzc) {
            return C41845B3m.A0d(new C61076JwE((Object) Boolean.valueOf(DbT.A1a(C51969G9p.A0n(1Al.A01(this.A01), 1An.A3V, this), ((C61244Jzc) mr1).A00))));
        } else {
            if (XMD.A03(0, mr1)) {
                return C49142Eq5.A00().A00(this.A01, (Integer) ((XMD) mr1).A01).Bt1(r6);
            }
            throw AnonymousClass7TE.A1K();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.lang.Object A05(X.C61079JwH r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 26
            boolean r0 = X.ME9.A03(r3, r11)
            if (r0 == 0) goto L_0x002b
            r4 = r11
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r4.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r4.A00
            java.lang.String r6 = "null cannot be cast to non-null type com.meta.kotlin.Try<com.instagram.settings2.core.data.storageresult.StorageResult<T of com.instagram.settings2.core.data.SettingsRepository.getSetting>, kotlin.Any>"
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 == r8) goto L_0x0030
            if (r0 == r3) goto L_0x0030
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002b:
            X.ME9 r4 = X.ME9.A00(r9, r11, r3)
            goto L_0x0016
        L_0x0030:
            java.lang.Object r7 = r4.A02
            com.instagram.settings2.core.data.SettingsRepository r7 = (com.instagram.settings2.core.data.SettingsRepository) r7
            java.lang.Object r10 = r4.A01
            X.JwH r10 = (X.C61079JwH) r10
            X.0eS.A00(r5)
            goto L_0x0088
        L_0x003c:
            X.0eS.A00(r5)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.Map r1 = r9.A07     // Catch:{ all -> 0x00f8 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x00f8 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00f8 }
            X.JwE r0 = (X.C61076JwE) r0     // Catch:{ all -> 0x00f8 }
            if (r0 == 0) goto L_0x005c
            X.3Ih r5 = X.C41845B3m.A0d(r0)     // Catch:{ all -> 0x00f8 }
            r2.unlock()
            return r5
        L_0x005c:
            r2.unlock()
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            X.0Yh r1 = X.DbS.A0z(r2)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = X.JTQ.A1U(r0, r1)
            if (r0 == 0) goto L_0x0077
            X.ME9.A01(r10, r9, r4, r8)
            java.lang.Object r5 = r9.A04(r10, r4)
        L_0x0074:
            if (r5 != r7) goto L_0x0087
            return r7
        L_0x0077:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = X.JTQ.A1U(r0, r1)
            if (r0 == 0) goto L_0x00f3
            X.ME9.A01(r10, r9, r4, r3)
            java.lang.Object r5 = r9.A06(r10, r4)
            goto L_0x0074
        L_0x0087:
            r7 = r9
        L_0x0088:
            X.0qQ.A0C(r5, r6)
            X.3Ii r5 = (X.C239803Ii) r5
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r4 = 0
            if (r0 != 0) goto L_0x00a7
            int r3 = r1.getReadHoldCount()
            r0 = 0
        L_0x009f:
            if (r0 >= r3) goto L_0x00a8
            r8.unlock()
            int r0 = r0 + 1
            goto L_0x009f
        L_0x00a7:
            r3 = 0
        L_0x00a8:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = X.JTP.A0z(r1)
            boolean r0 = r5 instanceof X.C239793Ih     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00cc
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.util.Map r0 = X.0Yh.A03     // Catch:{ all -> 0x00e6 }
            r0 = r5
            X.3Ih r0 = (X.C239793Ih) r0     // Catch:{ all -> 0x00e6 }
            java.lang.Object r2 = r0.A00     // Catch:{ all -> 0x00e6 }
            r0 = r2
            X.JwE r0 = (X.C61076JwE) r0     // Catch:{ all -> 0x00e6 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x00e6 }
            boolean r0 = X.0q1.A02(r1, r0)     // Catch:{ all -> 0x00e6 }
            if (r0 == 0) goto L_0x00d5
            java.util.Map r1 = r7.A07     // Catch:{ all -> 0x00e6 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x00e6 }
            r1.put(r0, r2)     // Catch:{ all -> 0x00e6 }
            goto L_0x00da
        L_0x00cc:
            boolean r0 = r5 instanceof X.C297815sO     // Catch:{ all -> 0x00e6 }
            if (r0 != 0) goto L_0x00da
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x00e6 }
            goto L_0x00d9
        L_0x00d5:
            java.lang.ClassCastException r0 = A00(r1, r2, r10)     // Catch:{ all -> 0x00e6 }
        L_0x00d9:
            throw r0     // Catch:{ all -> 0x00e6 }
        L_0x00da:
            if (r4 >= r3) goto L_0x00e2
            r8.lock()
            int r4 = r4 + 1
            goto L_0x00da
        L_0x00e2:
            r6.unlock()
            return r5
        L_0x00e6:
            r0 = move-exception
        L_0x00e7:
            if (r4 >= r3) goto L_0x00ef
            r8.lock()
            int r4 = r4 + 1
            goto L_0x00e7
        L_0x00ef:
            r6.unlock()
            throw r0
        L_0x00f3:
            java.lang.IllegalArgumentException r0 = X.JTT.A0k(r2)
            throw r0
        L_0x00f8:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A05(X.JwH, X.4D7):java.lang.Object");
    }

    public final Object A06(C61079JwH jwH, AnonymousClass4D7 r5) {
        MR1 mr1 = (MR1) jwH.A01;
        if (XMD.A03(1, mr1)) {
            C61024JvO jvO = (C61024JvO) ((XMD) mr1).A01;
            if (C61024JvO.A00(1, jvO)) {
                SettingsNetworkInteractor settingsNetworkInteractor = this.A02;
                0qQ.A0C(jvO, "null cannot be cast to non-null type com.instagram.settings2.core.model.Storage.RemoteSettingId.String");
                return settingsNetworkInteractor.A04((RemoteStringSettingId) jvO.A01, r5);
            }
            throw DbT.A0m();
        } else if (mr1 instanceof C61244Jzc) {
            throw new C318126oR(Pxd.A00(51));
        } else if (XMD.A03(0, mr1)) {
            C49142Eq5.A00().A01((Integer) ((XMD) mr1).A01);
            throw AnonymousClass00P.createAndThrow();
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.lang.Object A07(X.C61079JwH r10, X.AnonymousClass4D7 r11) {
        /*
            r9 = this;
            r3 = 27
            boolean r0 = X.ME9.A03(r3, r11)
            if (r0 == 0) goto L_0x002b
            r4 = r11
            X.ME9 r4 = (X.ME9) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r4.A03
            X.1Hj r7 = X.1Hj.A02
            int r0 = r4.A00
            java.lang.String r6 = "null cannot be cast to non-null type com.meta.kotlin.Try<com.instagram.settings2.core.data.storageresult.StorageResult<T of com.instagram.settings2.core.data.SettingsRepository.getSetting>, kotlin.Any>"
            r3 = 2
            r8 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 == r8) goto L_0x0030
            if (r0 == r3) goto L_0x0030
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002b:
            X.ME9 r4 = X.ME9.A00(r9, r11, r3)
            goto L_0x0016
        L_0x0030:
            java.lang.Object r7 = r4.A02
            com.instagram.settings2.core.data.SettingsRepository r7 = (com.instagram.settings2.core.data.SettingsRepository) r7
            java.lang.Object r10 = r4.A01
            X.JwH r10 = (X.C61079JwH) r10
            X.0eS.A00(r5)
            goto L_0x0086
        L_0x003c:
            X.0eS.A00(r5)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r9.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.Map r1 = r9.A07     // Catch:{ all -> 0x00f6 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x00f6 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x00f6 }
            X.JwE r0 = (X.C61076JwE) r0     // Catch:{ all -> 0x00f6 }
            if (r0 == 0) goto L_0x005c
            X.3Ih r5 = X.C41845B3m.A0d(r0)     // Catch:{ all -> 0x00f6 }
            r2.unlock()
            return r5
        L_0x005c:
            r2.unlock()
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.0Yh r1 = X.DbS.A0z(r2)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = X.JTQ.A1U(r0, r1)
            if (r0 == 0) goto L_0x0077
            X.ME9.A01(r10, r9, r4, r8)
            java.lang.Object r5 = r9.A04(r10, r4)
        L_0x0074:
            if (r5 != r7) goto L_0x0085
            return r7
        L_0x0077:
            boolean r0 = X.JTQ.A1U(r2, r1)
            if (r0 == 0) goto L_0x00f1
            X.ME9.A01(r10, r9, r4, r3)
            java.lang.Object r5 = r9.A06(r10, r4)
            goto L_0x0074
        L_0x0085:
            r7 = r9
        L_0x0086:
            X.0qQ.A0C(r5, r6)
            X.3Ii r5 = (X.C239803Ii) r5
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r8 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r4 = 0
            if (r0 != 0) goto L_0x00a5
            int r3 = r1.getReadHoldCount()
            r0 = 0
        L_0x009d:
            if (r0 >= r3) goto L_0x00a6
            r8.unlock()
            int r0 = r0 + 1
            goto L_0x009d
        L_0x00a5:
            r3 = 0
        L_0x00a6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = X.JTP.A0z(r1)
            boolean r0 = r5 instanceof X.C239793Ih     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00ca
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.util.Map r0 = X.0Yh.A03     // Catch:{ all -> 0x00e4 }
            r0 = r5
            X.3Ih r0 = (X.C239793Ih) r0     // Catch:{ all -> 0x00e4 }
            java.lang.Object r2 = r0.A00     // Catch:{ all -> 0x00e4 }
            r0 = r2
            X.JwE r0 = (X.C61076JwE) r0     // Catch:{ all -> 0x00e4 }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x00e4 }
            boolean r0 = X.0q1.A02(r1, r0)     // Catch:{ all -> 0x00e4 }
            if (r0 == 0) goto L_0x00d3
            java.util.Map r1 = r7.A07     // Catch:{ all -> 0x00e4 }
            java.lang.String r0 = r10.A02     // Catch:{ all -> 0x00e4 }
            r1.put(r0, r2)     // Catch:{ all -> 0x00e4 }
            goto L_0x00d8
        L_0x00ca:
            boolean r0 = r5 instanceof X.C297815sO     // Catch:{ all -> 0x00e4 }
            if (r0 != 0) goto L_0x00d8
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x00e4 }
            goto L_0x00d7
        L_0x00d3:
            java.lang.ClassCastException r0 = A00(r1, r2, r10)     // Catch:{ all -> 0x00e4 }
        L_0x00d7:
            throw r0     // Catch:{ all -> 0x00e4 }
        L_0x00d8:
            if (r4 >= r3) goto L_0x00e0
            r8.lock()
            int r4 = r4 + 1
            goto L_0x00d8
        L_0x00e0:
            r6.unlock()
            return r5
        L_0x00e4:
            r0 = move-exception
        L_0x00e5:
            if (r4 >= r3) goto L_0x00ed
            r8.lock()
            int r4 = r4 + 1
            goto L_0x00e5
        L_0x00ed:
            r6.unlock()
            throw r0
        L_0x00f1:
            java.lang.IllegalArgumentException r0 = X.JTT.A0k(r2)
            throw r0
        L_0x00f6:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A07(X.JwH, X.4D7):java.lang.Object");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.lang.Object A08(X.MXZ r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            r3 = 16
            boolean r0 = X.C66147MDz.A02(r3, r12)
            if (r0 == 0) goto L_0x002b
            r4 = r12
            X.MDz r4 = (X.C66147MDz) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r4.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            java.lang.String r8 = "null cannot be cast to non-null type com.meta.kotlin.Try<com.instagram.settings2.core.data.storageresult.StorageResult<T of com.instagram.settings2.core.data.SettingsRepository.getSetting>, kotlin.Any>"
            r3 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r9) goto L_0x0031
            if (r0 == r3) goto L_0x0031
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002b:
            X.MDz r4 = new X.MDz
            r4.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x0031:
            java.lang.Object r7 = r4.A03
            X.JwH r7 = (X.C61079JwH) r7
            java.lang.Object r6 = r4.A02
            com.instagram.settings2.core.data.SettingsRepository r6 = (com.instagram.settings2.core.data.SettingsRepository) r6
            java.lang.Object r11 = r4.A01
            X.MSo r11 = (X.C66460MSo) r11
            X.0eS.A00(r5)
            goto L_0x0096
        L_0x0041:
            X.0eS.A00(r5)
            X.JwH r7 = r10.A02(r11)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r10.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.Map r1 = r10.A07     // Catch:{ all -> 0x0111 }
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x0111 }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x0111 }
            X.JwE r0 = (X.C61076JwE) r0     // Catch:{ all -> 0x0111 }
            if (r0 == 0) goto L_0x0063
            X.3Ih r5 = X.C41845B3m.A0d(r0)     // Catch:{ all -> 0x0111 }
            goto L_0x00fb
        L_0x0063:
            r2.unlock()
            if (r11 == 0) goto L_0x006d
            X.LGF r0 = r10.A03
            r0.A01(r11)
        L_0x006d:
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            X.0Yh r1 = X.DbS.A0z(r2)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = X.JTQ.A1U(r0, r1)
            if (r0 == 0) goto L_0x0085
            X.C66147MDz.A00(r11, r10, r7, r4, r9)
            java.lang.Object r5 = r10.A04(r7, r4)
        L_0x0082:
            if (r5 != r6) goto L_0x0095
            return r6
        L_0x0085:
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            boolean r0 = X.JTQ.A1U(r0, r1)
            if (r0 == 0) goto L_0x010c
            X.C66147MDz.A00(r11, r10, r7, r4, r3)
            java.lang.Object r5 = r10.A06(r7, r4)
            goto L_0x0082
        L_0x0095:
            r6 = r10
        L_0x0096:
            X.0qQ.A0C(r5, r8)
            X.3Ii r5 = (X.C239803Ii) r5
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r4 = 0
            if (r0 != 0) goto L_0x00b5
            int r3 = r1.getReadHoldCount()
            r0 = 0
        L_0x00ad:
            if (r0 >= r3) goto L_0x00b6
            r9.unlock()
            int r0 = r0 + 1
            goto L_0x00ad
        L_0x00b5:
            r3 = 0
        L_0x00b6:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = X.JTP.A0z(r1)
            boolean r0 = r5 instanceof X.C239793Ih     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00da
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            java.util.Map r0 = X.0Yh.A03     // Catch:{ all -> 0x00ff }
            r0 = r5
            X.3Ih r0 = (X.C239793Ih) r0     // Catch:{ all -> 0x00ff }
            java.lang.Object r2 = r0.A00     // Catch:{ all -> 0x00ff }
            r0 = r2
            X.JwE r0 = (X.C61076JwE) r0     // Catch:{ all -> 0x00ff }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x00ff }
            boolean r0 = X.0q1.A02(r1, r0)     // Catch:{ all -> 0x00ff }
            if (r0 == 0) goto L_0x00e3
            java.util.Map r1 = r6.A07     // Catch:{ all -> 0x00ff }
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x00ff }
            r1.put(r0, r2)     // Catch:{ all -> 0x00ff }
            goto L_0x00e8
        L_0x00da:
            boolean r0 = r5 instanceof X.C297815sO     // Catch:{ all -> 0x00ff }
            if (r0 != 0) goto L_0x00e8
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x00ff }
            goto L_0x00e7
        L_0x00e3:
            java.lang.ClassCastException r0 = A00(r1, r2, r7)     // Catch:{ all -> 0x00ff }
        L_0x00e7:
            throw r0     // Catch:{ all -> 0x00ff }
        L_0x00e8:
            if (r4 >= r3) goto L_0x00f0
            r9.lock()
            int r4 = r4 + 1
            goto L_0x00e8
        L_0x00f0:
            r8.unlock()
            if (r11 == 0) goto L_0x00fe
            X.LGF r0 = r6.A03
            r0.A03(r11, r5)
            return r5
        L_0x00fb:
            r2.unlock()
        L_0x00fe:
            return r5
        L_0x00ff:
            r0 = move-exception
        L_0x0100:
            if (r4 >= r3) goto L_0x0108
            r9.lock()
            int r4 = r4 + 1
            goto L_0x0100
        L_0x0108:
            r8.unlock()
            throw r0
        L_0x010c:
            java.lang.IllegalArgumentException r0 = X.JTT.A0k(r2)
            throw r0
        L_0x0111:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A08(X.MXZ, X.4D7):java.lang.Object");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final java.lang.Object A09(X.C66570MXa r11, X.AnonymousClass4D7 r12) {
        /*
            r10 = this;
            r3 = 17
            boolean r0 = X.C66147MDz.A02(r3, r12)
            if (r0 == 0) goto L_0x002b
            r4 = r12
            X.MDz r4 = (X.C66147MDz) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r5 = r4.A04
            X.1Hj r6 = X.1Hj.A02
            int r0 = r4.A00
            java.lang.String r8 = "null cannot be cast to non-null type com.meta.kotlin.Try<com.instagram.settings2.core.data.storageresult.StorageResult<T of com.instagram.settings2.core.data.SettingsRepository.getSetting>, kotlin.Any>"
            r3 = 2
            r9 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r9) goto L_0x0031
            if (r0 == r3) goto L_0x0031
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002b:
            X.MDz r4 = new X.MDz
            r4.<init>(r10, r12, r3)
            goto L_0x0016
        L_0x0031:
            java.lang.Object r7 = r4.A03
            X.JwH r7 = (X.C61079JwH) r7
            java.lang.Object r6 = r4.A02
            com.instagram.settings2.core.data.SettingsRepository r6 = (com.instagram.settings2.core.data.SettingsRepository) r6
            java.lang.Object r11 = r4.A01
            X.MSo r11 = (X.C66460MSo) r11
            X.0eS.A00(r5)
            goto L_0x0094
        L_0x0041:
            X.0eS.A00(r5)
            X.JwH r7 = r10.A02(r11)
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r10.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            java.util.Map r1 = r10.A07     // Catch:{ all -> 0x010f }
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x010f }
            java.lang.Object r0 = r1.get(r0)     // Catch:{ all -> 0x010f }
            X.JwE r0 = (X.C61076JwE) r0     // Catch:{ all -> 0x010f }
            if (r0 == 0) goto L_0x0063
            X.3Ih r5 = X.C41845B3m.A0d(r0)     // Catch:{ all -> 0x010f }
            goto L_0x00f9
        L_0x0063:
            r2.unlock()
            if (r11 == 0) goto L_0x006d
            X.LGF r0 = r10.A03
            r0.A01(r11)
        L_0x006d:
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            X.0Yh r1 = X.DbS.A0z(r2)
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = X.JTQ.A1U(r0, r1)
            if (r0 == 0) goto L_0x0085
            X.C66147MDz.A00(r11, r10, r7, r4, r9)
            java.lang.Object r5 = r10.A04(r7, r4)
        L_0x0082:
            if (r5 != r6) goto L_0x0093
            return r6
        L_0x0085:
            boolean r0 = X.JTQ.A1U(r2, r1)
            if (r0 == 0) goto L_0x010a
            X.C66147MDz.A00(r11, r10, r7, r4, r3)
            java.lang.Object r5 = r10.A06(r7, r4)
            goto L_0x0082
        L_0x0093:
            r6 = r10
        L_0x0094:
            X.0qQ.A0C(r5, r8)
            X.3Ii r5 = (X.C239803Ii) r5
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r9 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r4 = 0
            if (r0 != 0) goto L_0x00b3
            int r3 = r1.getReadHoldCount()
            r0 = 0
        L_0x00ab:
            if (r0 >= r3) goto L_0x00b4
            r9.unlock()
            int r0 = r0 + 1
            goto L_0x00ab
        L_0x00b3:
            r3 = 0
        L_0x00b4:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r8 = X.JTP.A0z(r1)
            boolean r0 = r5 instanceof X.C239793Ih     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00d8
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.util.Map r0 = X.0Yh.A03     // Catch:{ all -> 0x00fd }
            r0 = r5
            X.3Ih r0 = (X.C239793Ih) r0     // Catch:{ all -> 0x00fd }
            java.lang.Object r2 = r0.A00     // Catch:{ all -> 0x00fd }
            r0 = r2
            X.JwE r0 = (X.C61076JwE) r0     // Catch:{ all -> 0x00fd }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x00fd }
            boolean r0 = X.0q1.A02(r1, r0)     // Catch:{ all -> 0x00fd }
            if (r0 == 0) goto L_0x00e1
            java.util.Map r1 = r6.A07     // Catch:{ all -> 0x00fd }
            java.lang.String r0 = r7.A02     // Catch:{ all -> 0x00fd }
            r1.put(r0, r2)     // Catch:{ all -> 0x00fd }
            goto L_0x00e6
        L_0x00d8:
            boolean r0 = r5 instanceof X.C297815sO     // Catch:{ all -> 0x00fd }
            if (r0 != 0) goto L_0x00e6
            X.Wub r0 = X.AnonymousClass7TE.A1K()     // Catch:{ all -> 0x00fd }
            goto L_0x00e5
        L_0x00e1:
            java.lang.ClassCastException r0 = A00(r1, r2, r7)     // Catch:{ all -> 0x00fd }
        L_0x00e5:
            throw r0     // Catch:{ all -> 0x00fd }
        L_0x00e6:
            if (r4 >= r3) goto L_0x00ee
            r9.lock()
            int r4 = r4 + 1
            goto L_0x00e6
        L_0x00ee:
            r8.unlock()
            if (r11 == 0) goto L_0x00fc
            X.LGF r0 = r6.A03
            r0.A03(r11, r5)
            return r5
        L_0x00f9:
            r2.unlock()
        L_0x00fc:
            return r5
        L_0x00fd:
            r0 = move-exception
        L_0x00fe:
            if (r4 >= r3) goto L_0x0106
            r9.lock()
            int r4 = r4 + 1
            goto L_0x00fe
        L_0x0106:
            r8.unlock()
            throw r0
        L_0x010a:
            java.lang.IllegalArgumentException r0 = X.JTT.A0k(r2)
            throw r0
        L_0x010f:
            r0 = move-exception
            r2.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A09(X.MXa, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0A(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 46
            boolean r0 = X.C66138MDq.A02(r3, r6)
            if (r0 == 0) goto L_0x0072
            r4 = r6
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x005a
            if (r0 != r2) goto L_0x007d
            java.lang.Object r3 = r4.A01
            com.instagram.settings2.core.data.SettingsRepository r3 = (com.instagram.settings2.core.data.SettingsRepository) r3
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0051
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r2 = r1.A00
            java.util.List r2 = (java.util.List) r2
            X.05G r1 = r3.A0L
            X.JzT r0 = new X.JzT
            r0.<init>(r2)
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x003f:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004e
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0078
            X.05G r1 = r3.A0L
            X.Lww r0 = X.C65621Lww.A00
            r1.Epw(r0)
        L_0x004e:
            X.0gF r3 = X.C60340gF.A00
        L_0x0050:
            return r3
        L_0x0051:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x003f
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x005a:
            X.0eS.A00(r1)
            X.05G r1 = r5.A0L
            X.Lwy r0 = X.C65623Lwy.A00
            r1.Epw(r0)
            com.instagram.settings2.core.data.SettingsNetworkInteractor r0 = r5.A02
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = r0.A05(r4)
            if (r1 == r3) goto L_0x0050
            r3 = r5
            goto L_0x0028
        L_0x0072:
            X.MDq r4 = new X.MDq
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x0078:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x007d:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A0A(X.4D7):java.lang.Object");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0C() {
        /*
            r5 = this;
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A08
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x001a
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0012:
            if (r0 >= r2) goto L_0x001b
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0012
        L_0x001a:
            r2 = 0
        L_0x001b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = X.JTP.A0z(r1)
            java.util.Map r0 = r5.A07     // Catch:{ all -> 0x0030 }
            r0.clear()     // Catch:{ all -> 0x0030 }
        L_0x0024:
            if (r3 >= r2) goto L_0x002c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0024
        L_0x002c:
            r1.unlock()
            return
        L_0x0030:
            r0 = move-exception
        L_0x0031:
            if (r3 >= r2) goto L_0x0039
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0031
        L_0x0039:
            r1.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.data.SettingsRepository.A0C():void");
    }

    public /* synthetic */ SettingsRepository(UserSession userSession, I4T i4t, String str, C262224Cq r7) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        this.A01 = userSession;
        this.A0B = r7;
        this.A04 = i4t;
        this.A07 = A1H;
        this.A05 = str;
        Integer num = AnonymousClass05K.A00;
        05D A012 = 10D.A01(num, 0, 0);
        this.A0H = A012;
        this.A0Q = A012;
        05D A013 = 10D.A01(num, 0, 0);
        this.A0E = A013;
        this.A0O = A013;
        05D A014 = 10D.A01(num, 0, 0);
        this.A0D = A014;
        this.A0N = A014;
        05D A015 = 10D.A01(num, 0, 0);
        this.A0C = A015;
        this.A0M = A015;
        05D A016 = 10D.A01(num, 0, 0);
        this.A0F = A016;
        this.A0P = A016;
        05D A017 = 10D.A01(num, 0, 0);
        this.A0G = A017;
        this.A0U = A017;
        05D A018 = 10D.A01(num, 0, 0);
        this.A0K = A018;
        this.A0T = A018;
        05D A019 = 10D.A01(num, 0, 0);
        this.A0J = A019;
        this.A0S = A019;
        05D A0110 = 10D.A01(num, 0, 0);
        this.A0I = A0110;
        this.A0R = A0110;
        this.A03 = (LGF) userSession.A01(LGF.class, new C46573DhF(userSession, 40));
        this.A02 = (SettingsNetworkInteractor) userSession.A01(SettingsNetworkInteractor.class, new C46573DhF(userSession, 39));
        this.A0A = r7.ArX();
        this.A0L = 106.A01(C65622Lwx.A00);
    }
}
