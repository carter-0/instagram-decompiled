package X;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.direct.model.thread.CreatorBroadcastThreadInfo;
import com.instagram.direct.model.thread.CreatorSubscriberThreadInfo;
import com.instagram.direct.smartsuggestion.model.SmartSuggestion;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.3U9  reason: invalid class name */
public final class AnonymousClass3U9 implements AnonymousClass2Ep {
    public DirectThreadKey A00;
    public final AnonymousClass3S9 A01;
    public final AnonymousClass3S9 A02;
    public final ReentrantReadWriteLock A03 = new ReentrantReadWriteLock();
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;

    public AnonymousClass3U9(UserSession userSession, AnonymousClass3S9 r6) {
        0qQ.A0B(userSession, 1);
        0eO r3 = 0eO.A03;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new AnonymousClass9LX(userSession, 4));
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r3, new AnonymousClass9LX(userSession, 5));
        this.A01 = r6;
        this.A05 = A002;
        this.A04 = A003;
        this.A02 = r6;
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final boolean A0N(X.AnonymousClass3SZ r19, java.lang.String r20) {
        /*
            r18 = this;
            r11 = 0
            r5 = r20
            X.0qQ.A0B(r5, r11)
            r4 = 1
            r6 = r19
            X.0qQ.A0B(r6, r4)
            r8 = r18
            X.0eM r0 = r8.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 0
            r7 = 0
            if (r0 == 0) goto L_0x00ee
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r8.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r17 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            if (r0 != 0) goto L_0x0037
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x002f:
            if (r0 >= r2) goto L_0x0038
            r17.unlock()
            int r0 = r0 + 1
            goto L_0x002f
        L_0x0037:
            r2 = 0
        L_0x0038:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r16 = r1.writeLock()
            r16.lock()
            X.3S9 r9 = r8.A01     // Catch:{ all -> 0x00e1 }
            java.util.HashMap r0 = r9.A20     // Catch:{ all -> 0x00e1 }
            java.lang.Object r8 = r0.get(r5)     // Catch:{ all -> 0x00e1 }
            X.3SZ r8 = (X.AnonymousClass3SZ) r8     // Catch:{ all -> 0x00e1 }
            if (r8 == 0) goto L_0x0058
            X.3Sc r0 = r8.A02     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0058
            java.lang.String r13 = r0.A01     // Catch:{ all -> 0x00e1 }
        L_0x0051:
            X.3Sc r0 = r6.A02     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x005a
            java.lang.String r12 = r0.A01     // Catch:{ all -> 0x00e1 }
            goto L_0x005b
        L_0x0058:
            r13 = r7
            goto L_0x0051
        L_0x005a:
            r12 = r7
        L_0x005b:
            if (r8 == 0) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            r10 = r7
            goto L_0x0066
        L_0x0060:
            X.9JD r0 = r8.A01     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x005e
            java.lang.String r10 = r0.A02     // Catch:{ all -> 0x00e1 }
        L_0x0066:
            X.9JD r0 = r6.A01     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x006d
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x00e1 }
            goto L_0x006e
        L_0x006d:
            r1 = r7
        L_0x006e:
            if (r8 == 0) goto L_0x0087
            java.lang.String r15 = r6.A02     // Catch:{ all -> 0x00e1 }
            java.util.Comparator r14 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x00e1 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00e1 }
            int r0 = r14.compare(r0, r15)     // Catch:{ all -> 0x00e1 }
            if (r0 < 0) goto L_0x0087
            boolean r0 = r8.A01()     // Catch:{ all -> 0x00e1 }
            if (r0 == 0) goto L_0x0087
            if (r12 == 0) goto L_0x009b
            if (r13 == 0) goto L_0x00bb
            goto L_0x008c
        L_0x0087:
            if (r13 == 0) goto L_0x00bb
            if (r12 == 0) goto L_0x00b2
            goto L_0x0092
        L_0x008c:
            int r0 = r14.compare(r13, r12)     // Catch:{ all -> 0x00e1 }
            if (r0 >= 0) goto L_0x009b
        L_0x0092:
            java.util.Comparator r0 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x00e1 }
            int r0 = r0.compare(r13, r12)     // Catch:{ all -> 0x00e1 }
            if (r0 <= 0) goto L_0x00bb
            goto L_0x00b2
        L_0x009b:
            if (r1 == 0) goto L_0x00a6
            if (r10 == 0) goto L_0x0087
            int r0 = r14.compare(r10, r1)     // Catch:{ all -> 0x00e1 }
            if (r0 >= 0) goto L_0x00a6
            goto L_0x0087
        L_0x00a6:
            if (r3 >= r2) goto L_0x00ae
            r17.lock()
            int r3 = r3 + 1
            goto L_0x00a6
        L_0x00ae:
            r16.unlock()
            return r11
        L_0x00b2:
            if (r8 == 0) goto L_0x00b5
            goto L_0x00b7
        L_0x00b5:
            r0 = r7
            goto L_0x00b9
        L_0x00b7:
            X.3Sc r0 = r8.A02     // Catch:{ all -> 0x00e1 }
        L_0x00b9:
            r6.A02 = r0     // Catch:{ all -> 0x00e1 }
        L_0x00bb:
            if (r10 == 0) goto L_0x00cd
            if (r1 == 0) goto L_0x00c7
            java.util.Comparator r0 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x00e1 }
            int r0 = r0.compare(r10, r1)     // Catch:{ all -> 0x00e1 }
            if (r0 <= 0) goto L_0x00cd
        L_0x00c7:
            if (r8 == 0) goto L_0x00cb
            X.9JD r7 = r8.A01     // Catch:{ all -> 0x00e1 }
        L_0x00cb:
            r6.A01 = r7     // Catch:{ all -> 0x00e1 }
        L_0x00cd:
            java.util.HashMap r0 = r9.A20     // Catch:{ all -> 0x00e1 }
            X.0qQ.A06(r0)     // Catch:{ all -> 0x00e1 }
            r0.put(r5, r6)     // Catch:{ all -> 0x00e1 }
        L_0x00d5:
            if (r3 >= r2) goto L_0x00dd
            r17.lock()
            int r3 = r3 + 1
            goto L_0x00d5
        L_0x00dd:
            r16.unlock()
            return r4
        L_0x00e1:
            r0 = move-exception
        L_0x00e2:
            if (r3 >= r2) goto L_0x00ea
            r17.lock()
            int r3 = r3 + 1
            goto L_0x00e2
        L_0x00ea:
            r16.unlock()
            throw r0
        L_0x00ee:
            X.3S9 r3 = r8.A01
            monitor-enter(r3)
            java.util.HashMap r0 = r3.A20     // Catch:{ all -> 0x017d }
            java.lang.Object r2 = r0.get(r5)     // Catch:{ all -> 0x017d }
            X.3SZ r2 = (X.AnonymousClass3SZ) r2     // Catch:{ all -> 0x017d }
            if (r2 == 0) goto L_0x0108
            X.3Sc r0 = r2.A02     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0108
            java.lang.String r10 = r0.A01     // Catch:{ all -> 0x017d }
        L_0x0101:
            X.3Sc r0 = r6.A02     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x010a
            java.lang.String r9 = r0.A01     // Catch:{ all -> 0x017d }
            goto L_0x010b
        L_0x0108:
            r10 = r7
            goto L_0x0101
        L_0x010a:
            r9 = r7
        L_0x010b:
            if (r2 == 0) goto L_0x010e
            goto L_0x0110
        L_0x010e:
            r8 = r7
            goto L_0x0116
        L_0x0110:
            X.9JD r0 = r2.A01     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x010e
            java.lang.String r8 = r0.A02     // Catch:{ all -> 0x017d }
        L_0x0116:
            X.9JD r0 = r6.A01     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x011d
            java.lang.String r1 = r0.A02     // Catch:{ all -> 0x017d }
            goto L_0x011e
        L_0x011d:
            r1 = r7
        L_0x011e:
            if (r2 == 0) goto L_0x0137
            java.lang.String r13 = r6.A02     // Catch:{ all -> 0x017d }
            java.util.Comparator r12 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x017d }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x017d }
            int r0 = r12.compare(r0, r13)     // Catch:{ all -> 0x017d }
            if (r0 < 0) goto L_0x0137
            boolean r0 = r2.A01()     // Catch:{ all -> 0x017d }
            if (r0 == 0) goto L_0x0137
            if (r9 == 0) goto L_0x014b
            if (r10 == 0) goto L_0x0161
            goto L_0x013c
        L_0x0137:
            if (r10 == 0) goto L_0x0161
            if (r9 == 0) goto L_0x0158
            goto L_0x0142
        L_0x013c:
            int r0 = r12.compare(r10, r9)     // Catch:{ all -> 0x017d }
            if (r0 >= 0) goto L_0x014b
        L_0x0142:
            java.util.Comparator r0 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x017d }
            int r0 = r0.compare(r10, r9)     // Catch:{ all -> 0x017d }
            if (r0 <= 0) goto L_0x0161
            goto L_0x0158
        L_0x014b:
            if (r1 == 0) goto L_0x0156
            if (r8 == 0) goto L_0x0137
            int r0 = r12.compare(r8, r1)     // Catch:{ all -> 0x017d }
            if (r0 >= 0) goto L_0x0156
            goto L_0x0137
        L_0x0156:
            monitor-exit(r3)
            return r11
        L_0x0158:
            if (r2 == 0) goto L_0x015b
            goto L_0x015d
        L_0x015b:
            r0 = r7
            goto L_0x015f
        L_0x015d:
            X.3Sc r0 = r2.A02     // Catch:{ all -> 0x017d }
        L_0x015f:
            r6.A02 = r0     // Catch:{ all -> 0x017d }
        L_0x0161:
            if (r8 == 0) goto L_0x0173
            if (r1 == 0) goto L_0x016d
            java.util.Comparator r0 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x017d }
            int r0 = r0.compare(r8, r1)     // Catch:{ all -> 0x017d }
            if (r0 <= 0) goto L_0x0173
        L_0x016d:
            if (r2 == 0) goto L_0x0171
            X.9JD r7 = r2.A01     // Catch:{ all -> 0x017d }
        L_0x0171:
            r6.A01 = r7     // Catch:{ all -> 0x017d }
        L_0x0173:
            java.util.HashMap r0 = r3.A20     // Catch:{ all -> 0x017d }
            X.0qQ.A06(r0)     // Catch:{ all -> 0x017d }
            r0.put(r5, r6)     // Catch:{ all -> 0x017d }
            monitor-exit(r3)
            return r4
        L_0x017d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0N(X.3SZ, java.lang.String):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final boolean A0O(X.AnonymousClass3SZ r8, java.lang.String r9, java.lang.String r10) {
        /*
            r7 = this;
            r0 = 1
            X.0qQ.A0B(r8, r0)
            r0 = 2
            X.0qQ.A0B(r10, r0)
            X.0eM r0 = r7.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x006c
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            if (r0 != 0) goto L_0x0031
            int r3 = r1.getReadHoldCount()
            r0 = 0
        L_0x0029:
            if (r0 >= r3) goto L_0x0032
            r5.unlock()
            int r0 = r0 + 1
            goto L_0x0029
        L_0x0031:
            r3 = 0
        L_0x0032:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.writeLock()
            r2.lock()
            X.3Sc r1 = r8.A02     // Catch:{ all -> 0x005f }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x005f }
            boolean r0 = X.AnonymousClass48N.A0B(r7, r9, r0, r10)     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x004d
            if (r1 == 0) goto L_0x0052
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x005f }
            boolean r0 = X.AnonymousClass48N.A0A(r7, r9, r0)     // Catch:{ all -> 0x005f }
            if (r0 != 0) goto L_0x0052
        L_0x004d:
            X.3S9 r0 = r7.A01     // Catch:{ all -> 0x005f }
            r0.A0v = r8     // Catch:{ all -> 0x005f }
            goto L_0x0053
        L_0x0052:
            r6 = 0
        L_0x0053:
            if (r4 >= r3) goto L_0x005b
            r5.lock()
            int r4 = r4 + 1
            goto L_0x0053
        L_0x005b:
            r2.unlock()
            return r6
        L_0x005f:
            r0 = move-exception
        L_0x0060:
            if (r4 >= r3) goto L_0x0068
            r5.lock()
            int r4 = r4 + 1
            goto L_0x0060
        L_0x0068:
            r2.unlock()
            throw r0
        L_0x006c:
            X.3S9 r2 = r7.A01
            monitor-enter(r2)
            X.3Sc r1 = r8.A02     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0089 }
            boolean r0 = X.AnonymousClass48N.A0B(r7, r9, r0, r10)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0083
            if (r1 == 0) goto L_0x0086
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x0089 }
            boolean r0 = X.AnonymousClass48N.A0A(r7, r9, r0)     // Catch:{ all -> 0x0089 }
            if (r0 != 0) goto L_0x0086
        L_0x0083:
            r2.A0v = r8     // Catch:{ all -> 0x0089 }
            goto L_0x0087
        L_0x0086:
            r6 = 0
        L_0x0087:
            monitor-exit(r2)
            return r6
        L_0x0089:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0O(X.3SZ, java.lang.String, java.lang.String):boolean");
    }

    public final String Ayt(UserSession userSession) {
        String str;
        String str2;
        0qQ.A0B(userSession, 0);
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                String str3 = this.A01.A1p;
                if (str3 == null) {
                    str2 = null;
                } else {
                    str2 = 1Au.A00(userSession).A01.getString(002.A0R("direct_thread_draft_", str3), (String) null);
                }
                return str2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r3 = this.A01;
            synchronized (r3) {
                String str4 = r3.A1p;
                if (str4 == null) {
                    str = null;
                } else {
                    str = 1Au.A00(userSession).A01.getString(002.A0R("direct_thread_draft_", str4), (String) null);
                }
            }
            return str;
        }
    }

    public final boolean CKr(UserSession userSession) {
        Long l;
        Long l2;
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                AnonymousClass3S9 r7 = this.A01;
                C272964li r5 = r7.A1P;
                if (!(r5 == null || (l2 = r5.A05) == null)) {
                    long longValue = l2.longValue();
                    if (!0qQ.A0K(r7.A1T.getId(), r5.A07)) {
                        0Tu r6 = 0Tu.A05;
                        if (182.A06(r6, userSession, 2342163327141290271L) || 182.A06(r6, userSession, 36320317928513829L)) {
                            AnonymousClass3SZ r3 = r7.A0v;
                            if (r3 != null || (r3 = (AnonymousClass3SZ) r7.A20.get(r7.A1T.getId())) != null) {
                                String A022 = C2611348j.A02(longValue, r5.A08);
                                String str = r3.A02;
                                0qQ.A07(str);
                                z = false;
                                if (AnonymousClass48W.A00.compare(A022, str) > 0) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r52 = this.A01;
            synchronized (r52) {
                C272964li r62 = r52.A1P;
                if (!(r62 == null || (l = r62.A05) == null)) {
                    long longValue2 = l.longValue();
                    if (!0qQ.A0K(r52.A1T.getId(), r62.A07)) {
                        0Tu r72 = 0Tu.A05;
                        if (182.A06(r72, userSession, 2342163327141290271L) || 182.A06(r72, userSession, 36320317928513829L)) {
                            AnonymousClass3SZ r32 = r52.A0v;
                            if (r32 != null || (r32 = (AnonymousClass3SZ) r52.A20.get(r52.A1T.getId())) != null) {
                                String A023 = C2611348j.A02(longValue2, r62.A08);
                                String str2 = r32.A02;
                                0qQ.A07(str2);
                                z = false;
                                if (AnonymousClass48W.A00.compare(A023, str2) > 0) {
                                    z = true;
                                }
                            }
                        }
                    }
                }
            }
            return z;
        }
    }

    public final boolean CVZ(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242373Tu r0 = this.A01.A0e;
                if (r0 == null || !r0.A03(userSession)) {
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242373Tu r02 = r1.A0e;
                if (r02 == null || !r02.A03(userSession)) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final boolean CVa(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (CVb() || CVZ(userSession)) {
                    z = true;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (this.A01) {
                if (CVb() || CVZ(userSession)) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final boolean CbQ(String str, String str2, String str3) {
        0qQ.A0B(str3, 2);
        return AnonymousClass48N.A0B(this, str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005e, code lost:
        if (CKr(r6) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00af, code lost:
        if (CKr(r6) == false) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Cdv(com.instagram.common.session.UserSession r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x006a
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            r4.lock()
            X.0Tu r0 = X.0Tu.A05     // Catch:{ all -> 0x0065 }
            r2 = 36326476907296542(0x810ebd0000371e, double:3.0363484989314364E-306)
            boolean r0 = X.182.A06(r0, r6, r2)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x003c
            boolean r0 = r5.CKu()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5.CWp()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5.CKx()     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0061
            goto L_0x0060
        L_0x003c:
            boolean r0 = r5.CKx()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5.CKu()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5.CKv()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5.CWp()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0060
            X.N49 r0 = r5.A00()     // Catch:{ all -> 0x0065 }
            if (r0 != 0) goto L_0x0060
            boolean r0 = r5.CKr(r6)     // Catch:{ all -> 0x0065 }
            if (r0 == 0) goto L_0x0061
        L_0x0060:
            r1 = 1
        L_0x0061:
            r4.unlock()
            return r1
        L_0x0065:
            r0 = move-exception
            r4.unlock()
            throw r0
        L_0x006a:
            X.3S9 r2 = r5.A01
            monitor-enter(r2)
            X.0Tu r0 = X.0Tu.A05     // Catch:{ all -> 0x00b4 }
            r3 = 36326476907296542(0x810ebd0000371e, double:3.0363484989314364E-306)
            boolean r0 = X.182.A06(r0, r6, r3)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x008d
            boolean r0 = r5.CKu()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r5.CWp()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r5.CKx()     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00b2
            goto L_0x00b1
        L_0x008d:
            boolean r0 = r5.CKx()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r5.CKu()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r5.CKv()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r5.CWp()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00b1
            X.N49 r0 = r5.A00()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00b1
            boolean r0 = r5.CKr(r6)     // Catch:{ all -> 0x00b4 }
            if (r0 == 0) goto L_0x00b2
        L_0x00b1:
            r1 = 1
        L_0x00b2:
            monitor-exit(r2)
            return r1
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.Cdv(com.instagram.common.session.UserSession):boolean");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EaA(boolean r7) {
        /*
            r6 = this;
            r5 = 1
            X.0eM r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004e
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0029
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0021:
            if (r0 >= r2) goto L_0x002a
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0029:
            r2 = 0
        L_0x002a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r6.A01     // Catch:{ all -> 0x0041 }
            r0.A2W = r5     // Catch:{ all -> 0x0041 }
        L_0x0035:
            if (r3 >= r2) goto L_0x003d
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0035
        L_0x003d:
            r1.unlock()
            return
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            if (r3 >= r2) goto L_0x004a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0042
        L_0x004a:
            r1.unlock()
            throw r0
        L_0x004e:
            X.3S9 r1 = r6.A01
            monitor-enter(r1)
            r1.A2W = r5     // Catch:{ all -> 0x0055 }
            monitor-exit(r1)
            return
        L_0x0055:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.EaA(boolean):void");
    }

    private final N49 A00() {
        String str;
        String str2;
        N49 n49 = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                N49 BKs = BKs();
                if (!(BKs == null || (str2 = BKs.A01) == null || BKs.A00 == null || CbQ(this.A01.A1T.getId(), BKs.A00, str2))) {
                    n49 = BKs;
                }
                return n49;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r4 = this.A01;
            synchronized (r4) {
                N49 BKs2 = BKs();
                if (!(BKs2 == null || (str = BKs2.A01) == null || BKs2.A00 == null || CbQ(r4.A1T.getId(), BKs2.A00, str))) {
                    n49 = BKs2;
                }
            }
            return n49;
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.instagram.model.direct.DirectThreadKey, java.lang.Object] */
    private final DirectThreadKey A01() {
        AnonymousClass3S9 r0 = this.A01;
        String str = r0.A1p;
        String str2 = r0.A1s;
        List list = r0.A28;
        0qQ.A06(list);
        ArrayList A002 = DirectThreadKey.A00(AnonymousClass48M.A01(list));
        ? obj = new Object();
        obj.A00 = str;
        obj.A02 = A002;
        Collections.sort(A002);
        obj.A01 = str2;
        return obj;
    }

    private final HashMap A02() {
        HashMap hashMap;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return new HashMap(this.A01.A2F);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                hashMap = new HashMap(r1.A2F);
            }
            return hashMap;
        }
    }

    public static final HashSet A03(UserSession userSession, AnonymousClass3U9 r9, String str, String str2) {
        String str3 = userSession.A06;
        HashSet hashSet = new HashSet();
        if (str2 != null) {
            for (Object next : r9.A01.A20.entrySet()) {
                0qQ.A07(next);
                Map.Entry entry = (Map.Entry) next;
                C241953Sa r2 = (C241953Sa) entry.getValue();
                if (!0qQ.A0K(entry.getKey(), str3) && !0qQ.A0K(entry.getKey(), str) && r2 != null && AnonymousClass48V.A01.compare(str2, r2.A02) <= 0) {
                    User CCf = r9.CCf((String) entry.getKey());
                    if (CCf != null || (CCf = 17h.A00(userSession).A02((String) entry.getKey())) != null) {
                        String A08 = AnonymousClass50n.A08(CCf);
                        0qQ.A07(A08);
                        hashSet.add(new C376659Iv(CCf.Bh3(), A08, ((C241953Sa) entry.getValue()).A00));
                    }
                }
            }
        }
        return hashSet;
    }

    public final C2611148h A04() {
        C2611148h r4;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                AnonymousClass48V r2 = AnonymousClass48V.A00;
                AnonymousClass3S9 r0 = this.A01;
                return new C2611148h(r2, AnonymousClass48V.A01(r0.A1q, r0.A2N, false), r2.A00);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r3 = this.A01;
            synchronized (r3) {
                AnonymousClass48V r22 = AnonymousClass48V.A00;
                r4 = new C2611148h(r22, AnonymousClass48V.A01(r3.A1q, r3.A2N, false), r22.A00);
            }
            return r4;
        }
    }

    public final C2611148h A05() {
        C2611148h r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                AnonymousClass48V r3 = AnonymousClass48V.A00;
                Object obj = r3.A01;
                AnonymousClass3S9 r0 = this.A01;
                return new C2611148h(r3, obj, AnonymousClass48V.A00(r0.A1w, r0.A2L));
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r4 = this.A01;
            synchronized (r4) {
                AnonymousClass48V r32 = AnonymousClass48V.A00;
                r1 = new C2611148h(r32, r32.A01, AnonymousClass48V.A00(r4.A1w, r4.A2L));
            }
            return r1;
        }
    }

    public final C254703su A06() {
        C254703su r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0i;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0i;
            }
            return r1;
        }
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A07(int r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A0M = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A0M = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A07(int):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A09(X.C254703su r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A0f = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A0f = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A09(X.3su):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0A(X.C254703su r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A0g = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A0g = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0A(X.3su):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0B(X.C254703su r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A0h = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A0h = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0B(X.3su):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0C(X.C254703su r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A0j = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A0j = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0C(X.3su):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0D(java.lang.String r8) {
        /*
            r7 = this;
            X.0eM r0 = r7.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r6 = 0
            if (r0 == 0) goto L_0x005f
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r7.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r4 = 0
            if (r0 != 0) goto L_0x0029
            int r3 = r1.getReadHoldCount()
            r0 = 0
        L_0x0021:
            if (r0 >= r3) goto L_0x002a
            r5.unlock()
            int r0 = r0 + 1
            goto L_0x0021
        L_0x0029:
            r3 = 0
        L_0x002a:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.writeLock()
            r2.lock()
            X.3S9 r1 = r7.A01     // Catch:{ all -> 0x0052 }
            java.lang.String r0 = r1.A1p     // Catch:{ all -> 0x0052 }
            boolean r0 = X.0qQ.A0K(r0, r8)     // Catch:{ all -> 0x0052 }
            if (r0 != 0) goto L_0x0046
            r1.A1p = r8     // Catch:{ all -> 0x0052 }
            r7.A00 = r6     // Catch:{ all -> 0x0052 }
            X.OJh r0 = r1.A0c     // Catch:{ all -> 0x0052 }
            if (r0 == 0) goto L_0x0046
            r0.A00()     // Catch:{ all -> 0x0052 }
        L_0x0046:
            if (r4 >= r3) goto L_0x004e
            r5.lock()
            int r4 = r4 + 1
            goto L_0x0046
        L_0x004e:
            r2.unlock()
            return
        L_0x0052:
            r0 = move-exception
        L_0x0053:
            if (r4 >= r3) goto L_0x005b
            r5.lock()
            int r4 = r4 + 1
            goto L_0x0053
        L_0x005b:
            r2.unlock()
            throw r0
        L_0x005f:
            X.3S9 r1 = r7.A01
            monitor-enter(r1)
            java.lang.String r0 = r1.A1p     // Catch:{ all -> 0x0077 }
            boolean r0 = X.0qQ.A0K(r0, r8)     // Catch:{ all -> 0x0077 }
            if (r0 != 0) goto L_0x0075
            r1.A1p = r8     // Catch:{ all -> 0x0077 }
            r7.A00 = r6     // Catch:{ all -> 0x0077 }
            X.OJh r0 = r1.A0c     // Catch:{ all -> 0x0077 }
            if (r0 == 0) goto L_0x0075
            r0.A00()     // Catch:{ all -> 0x0077 }
        L_0x0075:
            monitor-exit(r1)
            return
        L_0x0077:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0D(java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0E(java.lang.String r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A1q = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A1q = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0E(java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0F(java.lang.String r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A1w = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A1w = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0F(java.lang.String):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0G(java.util.List r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A23 = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A23 = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0G(java.util.List):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0H(boolean r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A2I = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A2I = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0H(boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0I(boolean r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A2L = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A2L = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0I(boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0J(boolean r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A2N = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A2N = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0J(boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0K(boolean r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A2e = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A2e = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0K(boolean):void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void A0L(boolean r7) {
        /*
            r6 = this;
            X.0eM r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0054
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r4 = 0
            if (r0 != 0) goto L_0x0028
            int r3 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r3) goto L_0x0029
            r5.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r3 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r2 = r1.writeLock()
            r2.lock()
            X.3S9 r0 = r6.A01     // Catch:{ all -> 0x0047 }
            X.3SB r1 = r0.A1G     // Catch:{ all -> 0x0047 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0047 }
            r1.A03(r0)     // Catch:{ all -> 0x0047 }
        L_0x003b:
            if (r4 >= r3) goto L_0x0043
            r5.lock()
            int r4 = r4 + 1
            goto L_0x003b
        L_0x0043:
            r2.unlock()
            return
        L_0x0047:
            r0 = move-exception
        L_0x0048:
            if (r4 >= r3) goto L_0x0050
            r5.lock()
            int r4 = r4 + 1
            goto L_0x0048
        L_0x0050:
            r2.unlock()
            throw r0
        L_0x0054:
            X.3S9 r2 = r6.A01
            monitor-enter(r2)
            X.3SB r1 = r2.A1G     // Catch:{ all -> 0x0062 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r7)     // Catch:{ all -> 0x0062 }
            r1.A03(r0)     // Catch:{ all -> 0x0062 }
            monitor-exit(r2)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.A0L(boolean):void");
    }

    public final boolean A0M() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242373Tu r0 = this.A01.A0e;
                if (r0 != null) {
                    z = r0.A02();
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242373Tu r02 = r1.A0e;
                if (r02 != null) {
                    z = r02.A02();
                }
            }
            return z;
        }
    }

    public final int AYf() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A00;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A00;
            }
            return i;
        }
    }

    public final C280014zr AYx() {
        C280014zr r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0t;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0t;
            }
            return r1;
        }
    }

    public final List AZs() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list2 = this.A01.A21;
                0qQ.A06(list2);
                return list2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                list = r1.A21;
                0qQ.A06(list);
            }
            return list;
        }
    }

    public final int AaV() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A01;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A01;
            }
            return i;
        }
    }

    public final int AdN() {
        int i = 0;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    i = r0.A00;
                }
                return i;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    i = r02.A00;
                }
            }
            return i;
        }
    }

    public final C242373Tu AiM() {
        C242373Tu r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0e;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0e;
            }
            return r1;
        }
    }

    public final C254403sQ Aie() {
        C254403sQ r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1M;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A1M;
            }
            return r1;
        }
    }

    public final Boolean Amk() {
        Boolean bool = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    bool = Boolean.valueOf(r0.A0H);
                }
                return bool;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    bool = Boolean.valueOf(r02.A0H);
                }
            }
            return bool;
        }
    }

    public final AnonymousClass914 Amp() {
        return this.A01.A10;
    }

    public final boolean AqP() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2I;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2I;
            }
            return z;
        }
    }

    public final String AsX() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    str = r0.A07;
                }
                return str;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    str = r02.A07;
                }
            }
            return str;
        }
    }

    public final ImageUrl Asd() {
        ImageUrl imageUrl = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    imageUrl = r0.A04;
                }
                return imageUrl;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    imageUrl = r02.A04;
                }
            }
            return imageUrl;
        }
    }

    public final CreatorSubscriberThreadInfo Asg() {
        CreatorSubscriberThreadInfo creatorSubscriberThreadInfo;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1O;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                creatorSubscriberThreadInfo = r0.A1O;
            }
            return creatorSubscriberThreadInfo;
        }
    }

    public final User Ash() {
        User user = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    user = (User) A02().get(r0.A07);
                }
                return user;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r2 = this.A01;
            synchronized (r2) {
                C242243Te r02 = r2.A0s;
                if (r02 != null) {
                    user = (User) A02().get(r02.A07);
                }
            }
            return user;
        }
    }

    public final String Asi() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    str = r0.A08;
                }
                return str;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    str = r02.A08;
                }
            }
            return str;
        }
    }

    public final AnonymousClass9IV AtZ() {
        AnonymousClass9IV r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0R;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0R;
            }
            return r1;
        }
    }

    public final boolean Aud() {
        Boolean CYa = this.A01.A1T.A03.CYa();
        if (CYa != null) {
            return CYa.booleanValue();
        }
        return false;
    }

    public final AnonymousClass3SZ Aue(String str) {
        AnonymousClass3SZ r5;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                AnonymousClass3S9 r1 = this.A01;
                AnonymousClass3SZ r52 = (AnonymousClass3SZ) r1.A20.get(str);
                if (r52 == null || !r52.A01()) {
                    r52 = r1.A0v;
                } else {
                    AnonymousClass3SZ r3 = r1.A0v;
                    if (r3 != null) {
                        if (AnonymousClass48V.A01.compare(r3.A02, r52.A02) >= 0) {
                            r52 = r3;
                        }
                    }
                }
                return r52;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r4 = this.A01;
            synchronized (r4) {
                r5 = (AnonymousClass3SZ) r4.A20.get(str);
                if (r5 == null || !r5.A01()) {
                    r5 = r4.A0v;
                } else {
                    AnonymousClass3SZ r32 = r4.A0v;
                    if (r32 != null) {
                        if (AnonymousClass48V.A01.compare(r32.A02, r5.A02) >= 0) {
                            r5 = r32;
                        }
                    }
                }
            }
            return r5;
        }
    }

    public final String Aus() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return (String) this.A01.A13.A01();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                str = (String) r1.A13.A01();
            }
            return str;
        }
    }

    public final C300625xW AxB() {
        C300625xW r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0r;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0r;
            }
            return r1;
        }
    }

    public final List AxI() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A22;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                list = r0.A22;
            }
            return list;
        }
    }

    public final boolean Axj() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C272964li r0 = this.A01.A1P;
                if (r0 != null) {
                    z = r0.A08;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C272964li r02 = r1.A1P;
                if (r02 != null) {
                    z = r02.A08;
                }
            }
            return z;
        }
    }

    public final C272964li Axk() {
        C272964li r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1P;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A1P;
            }
            return r1;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: X.ODs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Long} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: X.ODs} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Long} */
    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v11 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: type inference failed for: r5v13 */
    /* JADX WARNING: type inference failed for: r5v14 */
    /* JADX WARNING: type inference failed for: r5v15 */
    /* JADX WARNING: type inference failed for: r5v16 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C70621ODs B25() {
        /*
            r6 = this;
            X.0eM r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r5 = 0
            if (r0 == 0) goto L_0x0056
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r6.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r0.readLock()
            r4.lock()
            X.3S9 r0 = r6.A01     // Catch:{ all -> 0x0051 }
            X.4li r3 = r0.A1P     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0043
            boolean r0 = r3.A08     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0043
            java.lang.Integer r0 = r3.A02     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x0041
            int r0 = r0.intValue()     // Catch:{ all -> 0x0051 }
            long r0 = (long) r0     // Catch:{ all -> 0x0051 }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0051 }
        L_0x002f:
            java.lang.Integer r0 = r3.A03     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x003c
            int r0 = r0.intValue()     // Catch:{ all -> 0x0051 }
            long r0 = (long) r0     // Catch:{ all -> 0x0051 }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0051 }
        L_0x003c:
            X.ODs r5 = X.C70875OPo.A01(r2, r5)     // Catch:{ all -> 0x0051 }
            goto L_0x004d
        L_0x0041:
            r2 = r5
            goto L_0x002f
        L_0x0043:
            boolean r0 = r6.CVE()     // Catch:{ all -> 0x0051 }
            if (r0 == 0) goto L_0x004d
            X.ODs r5 = X.C70875OPo.A00()     // Catch:{ all -> 0x0051 }
        L_0x004d:
            r4.unlock()
            return r5
        L_0x0051:
            r0 = move-exception
            r4.unlock()
            throw r0
        L_0x0056:
            X.3S9 r4 = r6.A01
            monitor-enter(r4)
            X.4li r3 = r4.A1P     // Catch:{ all -> 0x008e }
            if (r3 == 0) goto L_0x0082
            boolean r0 = r3.A08     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0082
            java.lang.Integer r0 = r3.A02     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x0080
            int r0 = r0.intValue()     // Catch:{ all -> 0x008e }
            long r0 = (long) r0     // Catch:{ all -> 0x008e }
            java.lang.Long r2 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x008e }
        L_0x006e:
            java.lang.Integer r0 = r3.A03     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x007b
            int r0 = r0.intValue()     // Catch:{ all -> 0x008e }
            long r0 = (long) r0     // Catch:{ all -> 0x008e }
            java.lang.Long r5 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x008e }
        L_0x007b:
            X.ODs r5 = X.C70875OPo.A01(r2, r5)     // Catch:{ all -> 0x008e }
            goto L_0x008c
        L_0x0080:
            r2 = r5
            goto L_0x006e
        L_0x0082:
            boolean r0 = r6.CVE()     // Catch:{ all -> 0x008e }
            if (r0 == 0) goto L_0x008c
            X.ODs r5 = X.C70875OPo.A00()     // Catch:{ all -> 0x008e }
        L_0x008c:
            monitor-exit(r4)
            return r5
        L_0x008e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.B25():X.ODs");
    }

    public final int B6d() {
        int intValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A1J.A01();
                0qQ.A07(A012);
                return ((Number) A012).intValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A1J.A01();
                0qQ.A07(A013);
                intValue = ((Number) A013).intValue();
            }
            return intValue;
        }
    }

    public final C61081JwJ B7g(UserSession userSession) {
        C61081JwJ A002;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return AnonymousClass7LX.A00(userSession, this.A01.A1p);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                A002 = AnonymousClass7LX.A00(userSession, r1.A1p);
            }
            return A002;
        }
    }

    public final String BA0() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1j;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                str = r0.A1j;
            }
            return str;
        }
    }

    public final boolean BAj() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2K;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2K;
            }
            return z;
        }
    }

    public final boolean BBQ() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (this.A01.A0f == null) {
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                if (r1.A0f == null) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final boolean BBy() {
        return this.A01.A2O;
    }

    public final int BHS() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A06;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A06;
            }
            return i;
        }
    }

    public final A5N BHu() {
        A5N a5n;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0y;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                a5n = r0.A0y;
            }
            return a5n;
        }
    }

    public final List BIp() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    list = r0.A0B;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    list = r02.A0B;
                }
            }
            return list;
        }
    }

    public final List BIq() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    list = r0.A0C;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    list = r02.A0C;
                }
            }
            return list;
        }
    }

    public final List BIr() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A24;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                list = r0.A24;
            }
            return list;
        }
    }

    public final User BIt() {
        User user;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1U;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                user = r0.A1U;
            }
            return user;
        }
    }

    public final Boolean BIx() {
        Boolean bool;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A16.A01();
                0qQ.A07(A012);
                return (Boolean) A012;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A16.A01();
                0qQ.A07(A013);
                bool = (Boolean) A013;
            }
            return bool;
        }
    }

    public final boolean BJ3() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2W;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2W;
            }
            return z;
        }
    }

    public final List BJk() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    list = r0.A0D;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    list = r02.A0D;
                }
            }
            return list;
        }
    }

    public final List BJl() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    list = r0.A0E;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    list = r02.A0E;
                }
            }
            return list;
        }
    }

    /* renamed from: BJy */
    public final DirectThreadKey BJz() {
        DirectThreadKey directThreadKey;
        DirectThreadKey directThreadKey2;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (((Boolean) this.A04.getValue()).booleanValue()) {
                    directThreadKey2 = this.A00;
                    if (directThreadKey2 == null) {
                        directThreadKey2 = A01();
                        this.A00 = directThreadKey2;
                    }
                } else {
                    directThreadKey2 = A01();
                }
                return directThreadKey2;
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (this.A01) {
                if (((Boolean) this.A04.getValue()).booleanValue()) {
                    directThreadKey = this.A00;
                    if (directThreadKey == null) {
                        directThreadKey = A01();
                        this.A00 = directThreadKey;
                    }
                } else {
                    directThreadKey = A01();
                }
            }
            return directThreadKey;
        }
    }

    public final long BKd() {
        long j;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0N;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                j = r0.A0N;
            }
            return j;
        }
    }

    public final C59832Ja7 BKp() {
        return this.A01.A0a;
    }

    public final N49 BKs() {
        N49 n49 = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C61078JwG jwG = this.A01.A0W;
                if (jwG != null) {
                    n49 = (N49) jwG.A00;
                }
                return n49;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r2 = this.A01;
            synchronized (r2) {
                C61078JwG jwG2 = r2.A0W;
                if (jwG2 != null) {
                    n49 = (N49) jwG2.A00;
                }
            }
            return n49;
        }
    }

    public final String BKu() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1k;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                str = r0.A1k;
            }
            return str;
        }
    }

    public final C254703su BKv() {
        C254703su r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0f;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0f;
            }
            return r1;
        }
    }

    public final C254703su BKw() {
        C254703su r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0g;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0g;
            }
            return r1;
        }
    }

    public final C254703su BLF() {
        C254703su r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0j;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0j;
            }
            return r1;
        }
    }

    public final C254703su BLG() {
        C254703su r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0k;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0k;
            }
            return r1;
        }
    }

    public final C254703su BLT() {
        C254703su r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0o;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0o;
            }
            return r1;
        }
    }

    public final List BMK() {
        List unmodifiableList;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List unmodifiableList2 = Collections.unmodifiableList(this.A01.A25);
                0qQ.A07(unmodifiableList2);
                return unmodifiableList2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                unmodifiableList = Collections.unmodifiableList(r1.A25);
                0qQ.A07(unmodifiableList);
            }
            return unmodifiableList;
        }
    }

    public final Integer BMT() {
        Integer num;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Integer num2 = this.A01.A1g;
                0qQ.A06(num2);
                return num2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                num = r1.A1g;
                0qQ.A06(num);
            }
            return num;
        }
    }

    public final String BMX() {
        return this.A01.A1l;
    }

    public final int BNq() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A07;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A07;
            }
            return i;
        }
    }

    public final int BRT() {
        int i = 1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (C6a() == 29) {
                    C242243Te r0 = this.A01.A0s;
                    if (r0 == null) {
                        0KC.A0E("DirectThreadSummary", "Metadata should not be null for broadcast channels");
                    } else {
                        i = r0.A02;
                    }
                } else {
                    i = 1 + BRZ().size();
                }
                return i;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r2 = this.A01;
            synchronized (r2) {
                if (C6a() == 29) {
                    C242243Te r02 = r2.A0s;
                    if (r02 == null) {
                        0KC.A0E("DirectThreadSummary", "Metadata should not be null for broadcast channels");
                    } else {
                        i = r02.A02;
                    }
                } else {
                    i = 1 + BRZ().size();
                }
            }
            return i;
        }
    }

    public final List BRV() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list2 = this.A01.A26;
                0qQ.A06(list2);
                return list2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                list = r1.A26;
                0qQ.A06(list);
            }
            return list;
        }
    }

    public final ArrayList BRW() {
        ArrayList arrayList;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                ArrayList arrayList2 = new ArrayList();
                for (Object next : this.A01.A26) {
                    0qQ.A07(next);
                    arrayList2.add(Long.valueOf(Long.parseLong((String) next)));
                }
                return arrayList2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r3 = this.A01;
            synchronized (r3) {
                arrayList = new ArrayList();
                for (Object next2 : r3.A26) {
                    0qQ.A07(next2);
                    arrayList.add(Long.valueOf(Long.parseLong((String) next2)));
                }
            }
            return arrayList;
        }
    }

    public final List BRX() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list2 = this.A01.A27;
                0qQ.A06(list2);
                return list2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                list = r1.A27;
                0qQ.A06(list);
            }
            return list;
        }
    }

    public final List BRZ() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list2 = this.A01.A28;
                0qQ.A06(list2);
                return list2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                list = r1.A28;
                0qQ.A06(list);
            }
            return list;
        }
    }

    public final User BSJ() {
        User user;
        User user2;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (CUG()) {
                    user2 = BIt();
                } else {
                    user2 = AnonymousClass48N.A05(this);
                }
                return user2;
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (this.A01) {
                if (CUG()) {
                    user = BIt();
                } else {
                    user = AnonymousClass48N.A05(this);
                }
            }
            return user;
        }
    }

    public final int BSK() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A08;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A08;
            }
            return i;
        }
    }

    public final Map BWN() {
        return this.A01.A2D;
    }

    public final int BWe() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A09;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A09;
            }
            return i;
        }
    }

    public final AnonymousClass9IM BWj() {
        AnonymousClass9IM r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0Q;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0Q;
            }
            return r1;
        }
    }

    public final int BXY() {
        int size;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A28.size() + 1;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                size = r1.A28.size() + 1;
            }
            return size;
        }
    }

    public final C254703su BXx() {
        C254703su r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0p;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0p;
            }
            return r1;
        }
    }

    public final N49 BYB() {
        N49 n49;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0Z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                n49 = r0.A0Z;
            }
            return n49;
        }
    }

    public final User BZK() {
        User A052;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return AnonymousClass48N.A05(this);
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (this.A01) {
                A052 = AnonymousClass48N.A05(this);
            }
            return A052;
        }
    }

    public final String BZM() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                User A052 = AnonymousClass48N.A05(this);
                if (A052 != null) {
                    str = A052.getFullName();
                }
                return str;
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (this.A01) {
                User A053 = AnonymousClass48N.A05(this);
                if (A053 != null) {
                    str = A053.getFullName();
                }
            }
            return str;
        }
    }

    public final String BZN() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                User A052 = AnonymousClass48N.A05(this);
                if (A052 != null) {
                    str = A052.B8Q();
                }
                return str;
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (this.A01) {
                User A053 = AnonymousClass48N.A05(this);
                if (A053 != null) {
                    str = A053.B8Q();
                }
            }
            return str;
        }
    }

    public final String BZP() {
        String str = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                User A052 = AnonymousClass48N.A05(this);
                if (A052 != null) {
                    str = A052.getId();
                }
                return str;
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (this.A01) {
                User A053 = AnonymousClass48N.A05(this);
                if (A053 != null) {
                    str = A053.getId();
                }
            }
            return str;
        }
    }

    public final AnonymousClass9IV Bbp() {
        AnonymousClass9IV r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0S;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0S;
            }
            return r1;
        }
    }

    public final List BcW() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A29;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                list = r0.A29;
            }
            return list;
        }
    }

    public final long Bca() {
        long j;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0O;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                j = r0.A0O;
            }
            return j;
        }
    }

    public final C376579In Bgc() {
        C376579In r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0U;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0U;
            }
            return r1;
        }
    }

    public final int Bjw() {
        int intValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A1F.A01();
                0qQ.A07(A012);
                return ((Number) A012).intValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A1F.A01();
                0qQ.A07(A013);
                intValue = ((Number) A013).intValue();
            }
            return intValue;
        }
    }

    public final List Bk5() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2A;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                list = r0.A2A;
            }
            return list;
        }
    }

    public final String BkK() {
        return this.A01.A1m;
    }

    public final int BlL() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0B;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A0B;
            }
            return i;
        }
    }

    public final int Bpc() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0E;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A0E;
            }
            return i;
        }
    }

    public final int BrE() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0F;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A0F;
            }
            return i;
        }
    }

    public final String Btb() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return (String) this.A01.A1H.A01();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                str = (String) r1.A1H.A01();
            }
            return str;
        }
    }

    public final int Btc() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0G;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A0G;
            }
            return i;
        }
    }

    public final SmartSuggestion Bwx() {
        SmartSuggestion smartSuggestion;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1S;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                smartSuggestion = r0.A1S;
            }
            return smartSuggestion;
        }
    }

    public final AnonymousClass9IE BxH() {
        AnonymousClass9IE r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0P;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0P;
            }
            return r1;
        }
    }

    public final List BxY() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    list = r0.A0F;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    list = r02.A0F;
                }
            }
            return list;
        }
    }

    public final 2EN C3d() {
        2EN r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1Q;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A1Q;
            }
            return r1;
        }
    }

    public final N2U C43() {
        N2U n2u;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1R;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                n2u = r0.A1R;
            }
            return n2u;
        }
    }

    public final DirectThreadThemeInfo C5v() {
        DirectThreadThemeInfo directThreadThemeInfo;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A1L.A01();
                0qQ.A07(A012);
                DirectThreadThemeInfo directThreadThemeInfo2 = (DirectThreadThemeInfo) A012;
                String str = directThreadThemeInfo2.A0o;
                DirectThreadThemeInfo directThreadThemeInfo3 = AnonymousClass6BI.A0D;
                if (!0qQ.A0K(str, directThreadThemeInfo3.A0o)) {
                    if (directThreadThemeInfo2.A02() == 0) {
                        0wb.A03("DirectThreadSummary", "Theme's light fallback color is not set, returning default theme");
                    }
                    return directThreadThemeInfo2;
                }
                directThreadThemeInfo2 = directThreadThemeInfo3;
                return directThreadThemeInfo2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r3 = this.A01;
            synchronized (r3) {
                Object A013 = r3.A1L.A01();
                0qQ.A07(A013);
                directThreadThemeInfo = (DirectThreadThemeInfo) A013;
                String str2 = directThreadThemeInfo.A0o;
                DirectThreadThemeInfo directThreadThemeInfo4 = AnonymousClass6BI.A0D;
                if (!0qQ.A0K(str2, directThreadThemeInfo4.A0o)) {
                    if (directThreadThemeInfo.A02() == 0) {
                        0wb.A03("DirectThreadSummary", "Theme's light fallback color is not set, returning default theme");
                    }
                }
                directThreadThemeInfo = directThreadThemeInfo4;
            }
            return directThreadThemeInfo;
        }
    }

    public final List C64() {
        List list;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2B;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                list = r0.A2B;
            }
            return list;
        }
    }

    public final int C66() {
        int B6d;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return B6d();
            } finally {
                readLock.unlock();
            }
        } else {
            synchronized (this.A01) {
                B6d = B6d();
            }
            return B6d;
        }
    }

    public final String C6C() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1p;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                str = r0.A1p;
            }
            return str;
        }
    }

    public final AnonymousClass4jH C6F() {
        AnonymousClass4jH r1;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                r1 = r0.A0z;
            }
            return r1;
        }
    }

    public final Long C6I() {
        long j;
        Long valueOf;
        Long l;
        long j2;
        Long l2;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (!CUG()) {
                    C242373Tu AiM = AiM();
                    boolean z = true;
                    if (AiM == null || (AiM.A01 & 4) != 4) {
                        z = false;
                    }
                    if (!z) {
                        if (CbX()) {
                            Long BST = this.A01.A1T.BST();
                            if (BST == null) {
                                BST = 2Eq.A00;
                            }
                            0qQ.A0A(BST);
                            j2 = BST.longValue();
                        } else {
                            String str = (String) 00k.A0J(BRX());
                            if (!CQ2() || CVr() || COb() || CQq() || BRX().size() != 1 || str == null) {
                                l2 = 2Eq.A00;
                            } else {
                                l2 = 00y.A0n(10, str);
                                if (l2 == null) {
                                    l2 = 2Eq.A00;
                                }
                            }
                            0qQ.A0A(l2);
                            j2 = l2.longValue();
                        }
                        return Long.valueOf(j2);
                    }
                }
                Long l3 = this.A01.A1h;
                if (l3 != null) {
                    j2 = l3.longValue();
                    if (j2 > 0) {
                        return Long.valueOf(j2);
                    }
                }
                0qQ.A0A(2Eq.A00);
                j2 = -1;
                return Long.valueOf(j2);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r2 = this.A01;
            synchronized (r2) {
                if (!CUG()) {
                    C242373Tu AiM2 = AiM();
                    boolean z2 = true;
                    if (AiM2 == null || (AiM2.A01 & 4) != 4) {
                        z2 = false;
                    }
                    if (!z2) {
                        if (CbX()) {
                            Long BST2 = r2.A1T.BST();
                            if (BST2 == null) {
                                BST2 = 2Eq.A00;
                            }
                            0qQ.A0A(BST2);
                            j = BST2.longValue();
                        } else {
                            String str2 = (String) 00k.A0J(BRX());
                            if (!CQ2() || CVr() || COb() || CQq() || BRX().size() != 1 || str2 == null) {
                                l = 2Eq.A00;
                            } else {
                                l = 00y.A0n(10, str2);
                                if (l == null) {
                                    l = 2Eq.A00;
                                }
                            }
                            0qQ.A0A(l);
                            j = l.longValue();
                        }
                        valueOf = Long.valueOf(j);
                    }
                }
                Long l4 = r2.A1h;
                if (l4 != null) {
                    j = l4.longValue();
                    if (j > 0) {
                        valueOf = Long.valueOf(j);
                    }
                }
                0qQ.A0A(2Eq.A00);
                j = -1;
                valueOf = Long.valueOf(j);
            }
            return valueOf;
        }
    }

    public final int C6M() {
        int intValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A2p.A01();
                0qQ.A07(A012);
                return ((Number) A012).intValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A2p.A01();
                0qQ.A07(A013);
                intValue = ((Number) A013).intValue();
            }
            return intValue;
        }
    }

    public final String C6P() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1q;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                str = r0.A1q;
            }
            return str;
        }
    }

    public final int C6a() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0I;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A0I;
            }
            return i;
        }
    }

    public final String C6f() {
        String str;
        Map map;
        String str2;
        Map map2;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                AnonymousClass3S9 r2 = this.A01;
                if (!0qQ.A0K(r2.A1Y, false) || r2.A28.size() != 1 || (map2 = r2.A2D) == null || map2.isEmpty()) {
                    str2 = r2.A1r;
                } else {
                    str2 = (String) r2.A2D.get(((User) r2.A28.get(0)).getId());
                }
                return str2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r22 = this.A01;
            synchronized (r22) {
                if (!0qQ.A0K(r22.A1Y, false) || r22.A28.size() != 1 || (map = r22.A2D) == null || map.isEmpty()) {
                    str = r22.A1r;
                } else {
                    str = (String) r22.A2D.get(((User) r22.A28.get(0)).getId());
                }
            }
            return str;
        }
    }

    public final HashMap C6h() {
        HashMap hashMap;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                hashMap = r0.A1z;
            }
            return hashMap;
        }
    }

    public final String C6k() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1s;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                str = r0.A1s;
            }
            return str;
        }
    }

    public final int CAt() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0K;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A0K;
            }
            return i;
        }
    }

    public final Long CBk() {
        Long l = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                String str = this.A01.A1t;
                if (str != null) {
                    l = 00y.A0n(10, str);
                }
                return l;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r2 = this.A01;
            synchronized (r2) {
                String str2 = r2.A1t;
                if (str2 != null) {
                    l = 00y.A0n(10, str2);
                }
            }
            return l;
        }
    }

    public final int CBu() {
        int i;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A0M;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                i = r0.A0M;
            }
            return i;
        }
    }

    public final User CCf(String str) {
        User user;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return (User) this.A01.A2F.get(str);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                user = (User) r1.A2F.get(str);
            }
            return user;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0090, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.user.model.User CCg(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 0
            if (r0 == 0) goto L_0x0057
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            if (r6 == 0) goto L_0x001f
            com.instagram.user.model.User r4 = r5.CCf(r6)     // Catch:{ all -> 0x004e }
            goto L_0x0053
        L_0x001f:
            if (r7 == 0) goto L_0x0053
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x004e }
            java.util.Map r0 = r0.A2F     // Catch:{ all -> 0x004e }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x004e }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x004e }
        L_0x002d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x0053
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x004e }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x004e }
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3     // Catch:{ all -> 0x004e }
            java.lang.Long r0 = r3.BST()     // Catch:{ all -> 0x004e }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x004e }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x002d
            r2.unlock()
            return r3
        L_0x004e:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x0053:
            r2.unlock()
            return r4
        L_0x0057:
            X.3S9 r2 = r5.A01
            monitor-enter(r2)
            if (r6 == 0) goto L_0x0061
            com.instagram.user.model.User r4 = r5.CCf(r6)     // Catch:{ all -> 0x008c }
            goto L_0x008f
        L_0x0061:
            if (r7 == 0) goto L_0x008f
            java.util.Map r0 = r2.A2F     // Catch:{ all -> 0x008c }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x008c }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x008c }
        L_0x006d:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x008c }
            X.0qQ.A07(r3)     // Catch:{ all -> 0x008c }
            com.instagram.user.model.User r3 = (com.instagram.user.model.User) r3     // Catch:{ all -> 0x008c }
            java.lang.Long r0 = r3.BST()     // Catch:{ all -> 0x008c }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x008c }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x006d
            monitor-exit(r2)
            return r3
        L_0x008c:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x008f:
            monitor-exit(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.CCg(java.lang.String, java.lang.String):com.instagram.user.model.User");
    }

    public final HashMap CCo() {
        HashMap hashMap;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return new HashMap(this.A01.A20);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                hashMap = new HashMap(r1.A20);
            }
            return hashMap;
        }
    }

    public final String CDr() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1u;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                str = r0.A1u;
            }
            return str;
        }
    }

    public final String CDs() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1v;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                str = r0.A1v;
            }
            return str;
        }
    }

    public final String CFm() {
        String str;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A1w;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                str = r0.A1w;
            }
            return str;
        }
    }

    public final Integer CHO() {
        Integer num = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    num = r0.A06;
                }
                return num;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    num = r02.A06;
                }
            }
            return num;
        }
    }

    public final List CHP() {
        List list = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    list = r0.A0G;
                }
                return list;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    list = r02.A0G;
                }
            }
            return list;
        }
    }

    public final boolean CJt() {
        String str;
        AnonymousClass3S9 r1 = this.A01;
        C45275Cte cte = r1.A0d;
        if (cte != null) {
            str = cte.A01;
        } else {
            str = null;
        }
        if (str != null && str.length() != 0) {
            return true;
        }
        List<C274694ou> list = r1.A23;
        if (list == null || list.isEmpty()) {
            return false;
        }
        for (C274694ou r0 : list) {
            if (!"General".equals(r0.A04)) {
                return true;
            }
        }
        return false;
    }

    public final boolean CKK() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2N;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2N;
            }
            return z;
        }
    }

    public final boolean CKb() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2P;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2P;
            }
            return z;
        }
    }

    public final boolean CKt() {
        AnonymousClass3S9 r0 = this.A01;
        C254703su r2 = r0.A0l;
        if (r2 == null || AnonymousClass48N.A0A(this, r0.A1T.getId(), r2.A0g())) {
            return false;
        }
        return true;
    }

    public final boolean CKu() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                AnonymousClass3S9 r0 = this.A01;
                C254703su r3 = r0.A0j;
                if (r3 != null) {
                    String id = r0.A1T.getId();
                    String A0g = r3.A0g();
                    String str = r3.A1u;
                    0qQ.A07(str);
                    if (!AnonymousClass48N.A0B(this, id, A0g, str)) {
                        return z;
                    }
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r4 = this.A01;
            synchronized (r4) {
                C254703su r32 = r4.A0j;
                if (r32 != null) {
                    String id2 = r4.A1T.getId();
                    String A0g2 = r32.A0g();
                    String str2 = r32.A1u;
                    0qQ.A07(str2);
                    if (!AnonymousClass48N.A0B(this, id2, A0g2, str2)) {
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public final boolean CKv() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (CKt() || this.A01.A0q != null) {
                    z = true;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                if (CKt() || r1.A0q != null) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final boolean CKx() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (this.A01.A0p == null) {
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                if (r1.A0p == null) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final boolean CL4() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2Q;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2Q;
            }
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x006c, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CMN() {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0046
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r0.readLock()
            r3.lock()
            X.N49 r1 = r5.A00()     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x0023
            r3.unlock()
            return r2
        L_0x0023:
            X.3su r0 = X.AnonymousClass48N.A01(r5)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x003d
            java.lang.String r2 = r0.A0g()     // Catch:{ all -> 0x0041 }
            if (r2 == 0) goto L_0x003d
            java.lang.String r1 = r1.A00     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x003c
            java.util.Comparator r0 = X.AnonymousClass48W.A00     // Catch:{ all -> 0x0041 }
            int r0 = r0.compare(r1, r2)     // Catch:{ all -> 0x0041 }
            if (r0 <= 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r4 = 0
        L_0x003d:
            r3.unlock()
            return r4
        L_0x0041:
            r0 = move-exception
            r3.unlock()
            throw r0
        L_0x0046:
            X.3S9 r3 = r5.A01
            monitor-enter(r3)
            X.N49 r1 = r5.A00()     // Catch:{ all -> 0x006d }
            if (r1 != 0) goto L_0x0051
            monitor-exit(r3)
            return r2
        L_0x0051:
            X.3su r0 = X.AnonymousClass48N.A01(r5)     // Catch:{ all -> 0x006d }
            if (r0 == 0) goto L_0x006b
            java.lang.String r2 = r0.A0g()     // Catch:{ all -> 0x006d }
            if (r2 == 0) goto L_0x006b
            java.lang.String r1 = r1.A00     // Catch:{ all -> 0x006d }
            if (r1 == 0) goto L_0x006a
            java.util.Comparator r0 = X.AnonymousClass48W.A00     // Catch:{ all -> 0x006d }
            int r0 = r0.compare(r1, r2)     // Catch:{ all -> 0x006d }
            if (r0 <= 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            monitor-exit(r3)
            return r4
        L_0x006d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.CMN():boolean");
    }

    public final boolean COP() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 == null || !r0.A0I) {
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 == null || !r02.A0I) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final boolean COS() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A17.A01();
                0qQ.A07(A012);
                return ((Boolean) A012).booleanValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A17.A01();
                0qQ.A07(A013);
                booleanValue = ((Boolean) A013).booleanValue();
            }
            return booleanValue;
        }
    }

    public final boolean COb() {
        return AnonymousClass48O.A06(Integer.valueOf(this.A01.A0I));
    }

    public final boolean CPn() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2U;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2U;
            }
            return z;
        }
    }

    public final boolean CQ2() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2V;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2V;
            }
            return z;
        }
    }

    public final ImmutableMap CQl() {
        ImmutableMap copyOf;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A12.A01();
                0qQ.A07(A012);
                ImmutableMap copyOf2 = ImmutableMap.copyOf((Map) A012);
                0qQ.A07(copyOf2);
                return copyOf2;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A12.A01();
                0qQ.A07(A013);
                copyOf = ImmutableMap.copyOf((Map) A013);
                0qQ.A07(copyOf);
            }
            return copyOf;
        }
    }

    public final boolean CQo() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2X;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2X;
            }
            return z;
        }
    }

    public final boolean CQq() {
        return AnonymousClass48O.A07(Integer.valueOf(this.A01.A0I));
    }

    public final boolean CQs() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2Y;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2Y;
            }
            return z;
        }
    }

    public final boolean CR4() {
        boolean A0K;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return 0qQ.A0K(this.A01.A1X, true);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                A0K = 0qQ.A0K(r1.A1X, true);
            }
            return A0K;
        }
    }

    public final Boolean CSS() {
        Boolean bool = null;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                C242243Te r0 = this.A01.A0s;
                if (r0 != null) {
                    bool = Boolean.valueOf(r0.A0S);
                }
                return bool;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                C242243Te r02 = r1.A0s;
                if (r02 != null) {
                    bool = Boolean.valueOf(r02.A0S);
                }
            }
            return bool;
        }
    }

    public final boolean CTB() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2Z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2Z;
            }
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0050, code lost:
        if (r0.booleanValue() != false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r0.booleanValue() != false) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CUG() {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0045
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            X.3S9 r1 = r5.A01     // Catch:{ all -> 0x0040 }
            java.lang.Boolean r0 = r1.A1Y     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x0040 }
            if (r0 == 0) goto L_0x003c
        L_0x0025:
            X.2EN r1 = r1.A1Q     // Catch:{ all -> 0x0040 }
            X.2EN r0 = X.2EN.A04     // Catch:{ all -> 0x0040 }
            if (r1 == r0) goto L_0x003c
            goto L_0x003b
        L_0x002c:
            java.util.List r0 = r1.A26     // Catch:{ all -> 0x0040 }
            int r0 = r0.size()     // Catch:{ all -> 0x0040 }
            if (r0 > r3) goto L_0x0025
            boolean r0 = r5.CQ2()     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x003c
            goto L_0x0025
        L_0x003b:
            r4 = 1
        L_0x003c:
            r2.unlock()
            return r4
        L_0x0040:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x0045:
            X.3S9 r2 = r5.A01
            monitor-enter(r2)
            java.lang.Boolean r0 = r2.A1Y     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x006b }
            if (r0 == 0) goto L_0x0069
        L_0x0052:
            X.2EN r1 = r2.A1Q     // Catch:{ all -> 0x006b }
            X.2EN r0 = X.2EN.A04     // Catch:{ all -> 0x006b }
            if (r1 == r0) goto L_0x0069
            goto L_0x0068
        L_0x0059:
            java.util.List r0 = r2.A26     // Catch:{ all -> 0x006b }
            int r0 = r0.size()     // Catch:{ all -> 0x006b }
            if (r0 > r3) goto L_0x0052
            boolean r0 = r5.CQ2()     // Catch:{ all -> 0x006b }
            if (r0 != 0) goto L_0x0069
            goto L_0x0052
        L_0x0068:
            r4 = 1
        L_0x0069:
            monitor-exit(r2)
            return r4
        L_0x006b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.CUG():boolean");
    }

    public final boolean CUJ() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Integer num = (Integer) this.A01.A1K.A01();
                if (num != null && num.intValue() == 1) {
                    z = true;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Integer num2 = (Integer) r1.A1K.A01();
                if (num2 != null && num2.intValue() == 1) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final boolean CVE() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A1G.A01();
                0qQ.A07(A012);
                return ((Boolean) A012).booleanValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A1G.A01();
                0qQ.A07(A013);
                booleanValue = ((Boolean) A013).booleanValue();
            }
            return booleanValue;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005a, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CVb() {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L_0x003e
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0039 }
            X.3Tu r1 = r0.A0e     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x0023
            r2.unlock()
            return r4
        L_0x0023:
            boolean r0 = r1.A01()     // Catch:{ all -> 0x0039 }
            if (r0 != 0) goto L_0x0035
            X.3Tv r0 = r1.A04     // Catch:{ all -> 0x0039 }
            int r0 = r0.A00     // Catch:{ all -> 0x0039 }
            r1 = 42
            r0 = r0 & 42
            r3 = 0
            if (r0 != r1) goto L_0x0035
            r3 = 1
        L_0x0035:
            r2.unlock()
            return r3
        L_0x0039:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x003e:
            X.3S9 r2 = r5.A01
            monitor-enter(r2)
            X.3Tu r1 = r2.A0e     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0047
            monitor-exit(r2)
            return r4
        L_0x0047:
            boolean r0 = r1.A01()     // Catch:{ all -> 0x005b }
            if (r0 != 0) goto L_0x0059
            X.3Tv r0 = r1.A04     // Catch:{ all -> 0x005b }
            int r0 = r0.A00     // Catch:{ all -> 0x005b }
            r1 = 42
            r0 = r0 & 42
            r3 = 0
            if (r0 != r1) goto L_0x0059
            r3 = 1
        L_0x0059:
            monitor-exit(r2)
            return r3
        L_0x005b:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.CVb():boolean");
    }

    public final boolean CVr() {
        boolean A0K;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return 0qQ.A0K(this.A01.A1d, true);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                A0K = 0qQ.A0K(r1.A1d, true);
            }
            return A0K;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0054, code lost:
        return r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CW5() {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x003b
            java.util.concurrent.locks.ReentrantReadWriteLock r0 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r0.readLock()
            r2.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0036 }
            X.3su r1 = r0.A0f     // Catch:{ all -> 0x0036 }
            if (r1 != 0) goto L_0x0023
            r2.unlock()
            return r3
        L_0x0023:
            boolean r0 = r1.A2N     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0031
            java.lang.String r0 = r1.A1q     // Catch:{ all -> 0x0036 }
            if (r0 == 0) goto L_0x0031
            int r0 = r0.length()     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0032
        L_0x0031:
            r4 = 0
        L_0x0032:
            r2.unlock()
            return r4
        L_0x0036:
            r0 = move-exception
            r2.unlock()
            throw r0
        L_0x003b:
            X.3S9 r2 = r5.A01
            monitor-enter(r2)
            X.3su r1 = r2.A0f     // Catch:{ all -> 0x0055 }
            if (r1 != 0) goto L_0x0044
            monitor-exit(r2)
            return r3
        L_0x0044:
            boolean r0 = r1.A2N     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0052
            java.lang.String r0 = r1.A1q     // Catch:{ all -> 0x0055 }
            if (r0 == 0) goto L_0x0052
            int r0 = r0.length()     // Catch:{ all -> 0x0055 }
            if (r0 != 0) goto L_0x0053
        L_0x0052:
            r4 = 0
        L_0x0053:
            monitor-exit(r2)
            return r4
        L_0x0055:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.CW5():boolean");
    }

    public final boolean CWJ() {
        boolean A0K;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return 0qQ.A0K(this.A01.A1Z, true);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                A0K = 0qQ.A0K(r1.A1Z, true);
            }
            return A0K;
        }
    }

    public final boolean CWe() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (this.A01.A07 == 1) {
                    z = true;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                if (r1.A07 == 1) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final boolean CWp() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A2o.A01();
                0qQ.A07(A012);
                return ((Boolean) A012).booleanValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A2o.A01();
                0qQ.A07(A013);
                booleanValue = ((Boolean) A013).booleanValue();
            }
            return booleanValue;
        }
    }

    public final boolean CXF() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A18.A01();
                0qQ.A07(A012);
                return ((Boolean) A012).booleanValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A18.A01();
                0qQ.A07(A013);
                booleanValue = ((Boolean) A013).booleanValue();
            }
            return booleanValue;
        }
    }

    public final boolean CY7() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2d;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2d;
            }
            return z;
        }
    }

    public final boolean CZA() {
        boolean A0K;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return 0qQ.A0K(this.A01.A1a, true);
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                A0K = 0qQ.A0K(r1.A1a, true);
            }
            return A0K;
        }
    }

    public final boolean Ca9() {
        C242243Te r0;
        C242243Te r02;
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                if (!CUG() || (r02 = this.A01.A0s) == null || !r02.A0Q) {
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                if (!CUG() || (r0 = r1.A0s) == null || !r0.A0Q) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final boolean CaM() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A1A.A01();
                0qQ.A07(A012);
                return ((Boolean) A012).booleanValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A1A.A01();
                0qQ.A07(A013);
                booleanValue = ((Boolean) A013).booleanValue();
            }
            return booleanValue;
        }
    }

    public final boolean Car() {
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                List list = this.A01.A28;
                0qQ.A06(list);
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((User) it.next()).isRestricted()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    return z;
                }
                z = false;
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r2 = this.A01;
            synchronized (r2) {
                List list2 = r2.A28;
                0qQ.A06(list2);
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((User) it2.next()).isRestricted()) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                z = false;
            }
            return z;
        }
    }

    public final boolean CbG() {
        C61081JwJ jwJ;
        C61081JwJ jwJ2;
        boolean z = true;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                AnonymousClass3S9 r1 = this.A01;
                C242243Te r0 = r1.A0s;
                if (r0 == null || r0.A00 != 5 || (jwJ2 = r1.A0Y) == null || jwJ2.A01 == null) {
                    z = false;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r12 = this.A01;
            synchronized (r12) {
                C242243Te r02 = r12.A0s;
                if (r02 == null || r02.A00 != 5 || (jwJ = r12.A0Y) == null || jwJ.A01 == null) {
                    z = false;
                }
            }
            return z;
        }
    }

    public final boolean Cbs() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2n;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2n;
            }
            return z;
        }
    }

    public final boolean CcG() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2h;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2h;
            }
            return z;
        }
    }

    public final boolean CdY() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A1B.A01();
                0qQ.A07(A012);
                return ((Boolean) A012).booleanValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A1B.A01();
                0qQ.A07(A013);
                booleanValue = ((Boolean) A013).booleanValue();
            }
            return booleanValue;
        }
    }

    public final boolean Ce4(String str) {
        return this.A01.A21.contains(str);
    }

    public final boolean CeU() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A1C.A01();
                0qQ.A07(A012);
                return ((Boolean) A012).booleanValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A1C.A01();
                0qQ.A07(A013);
                booleanValue = ((Boolean) A013).booleanValue();
            }
            return booleanValue;
        }
    }

    public final boolean Cez() {
        return 0qQ.A0K(this.A01.A1c, true);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public final void EY1(boolean r6) {
        /*
            r5 = this;
            X.0eM r0 = r5.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r5.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0028
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x0020:
            if (r0 >= r2) goto L_0x0029
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x0020
        L_0x0028:
            r2 = 0
        L_0x0029:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r5.A01     // Catch:{ all -> 0x0040 }
            r0.A2K = r6     // Catch:{ all -> 0x0040 }
        L_0x0034:
            if (r3 >= r2) goto L_0x003c
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0034
        L_0x003c:
            r1.unlock()
            return
        L_0x0040:
            r0 = move-exception
        L_0x0041:
            if (r3 >= r2) goto L_0x0049
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0041
        L_0x0049:
            r1.unlock()
            throw r0
        L_0x004d:
            X.3S9 r1 = r5.A01
            monitor-enter(r1)
            r1.A2K = r6     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)
            return
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3U9.EY1(boolean):void");
    }

    public final boolean Etj() {
        boolean z = false;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Boolean bool = this.A01.A1e;
                if (bool != null && bool.equals(true)) {
                    z = true;
                }
                return z;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Boolean bool2 = r1.A1e;
                if (bool2 != null && bool2.equals(true)) {
                    z = true;
                }
            }
            return z;
        }
    }

    public final boolean isMuted() {
        boolean booleanValue;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                Object A012 = this.A01.A19.A01();
                0qQ.A07(A012);
                return ((Boolean) A012).booleanValue();
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r1 = this.A01;
            synchronized (r1) {
                Object A013 = r1.A19.A01();
                0qQ.A07(A013);
                booleanValue = ((Boolean) A013).booleanValue();
            }
            return booleanValue;
        }
    }

    public final boolean isPending() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2f;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2f;
            }
            return z;
        }
    }

    public final boolean isStale() {
        boolean z;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = this.A03.readLock();
            readLock.lock();
            try {
                return this.A01.A2i;
            } finally {
                readLock.unlock();
            }
        } else {
            AnonymousClass3S9 r0 = this.A01;
            synchronized (r0) {
                z = r0.A2i;
            }
            return z;
        }
    }

    public final Boolean BZL() {
        User A052 = AnonymousClass48N.A05(this);
        if (A052 != null) {
            return A052.A03.CYa();
        }
        return null;
    }

    public final boolean CJZ() {
        if (AYx() != null) {
            return true;
        }
        return false;
    }

    public final boolean CXW() {
        User A052 = AnonymousClass48N.A05(this);
        if (A052 != null) {
            return A052.A1X();
        }
        return false;
    }

    public final boolean CYU() {
        if (CUG() || this.A01.A1Q == 2EN.A04 || BRT() != 2) {
            return false;
        }
        return true;
    }

    public final boolean CbX() {
        if (!CQ2() || !BRZ().isEmpty()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: finally extract failed */
    public final void A08(AnonymousClass9IE r112, AnonymousClass9IM r113, AnonymousClass9IV r114, AnonymousClass9IV r115, AnonymousClass9IV r116, C376579In r117, AnonymousClass9J6 r118, C61078JwG jwG, C61081JwJ jwJ, N49 n49, C59832Ja7 ja7, C45275Cte cte, C242373Tu r124, C300625xW r125, C242243Te r126, C280014zr r127, C242263Tg r128, DirectThreadThemeInfo directThreadThemeInfo, C370838x9 r130, A5N a5n, AnonymousClass4jH r132, AnonymousClass914 r133, C254403sQ r134, CreatorBroadcastThreadInfo creatorBroadcastThreadInfo, CreatorSubscriberThreadInfo creatorSubscriberThreadInfo, C272964li r137, 2EN r138, N2U n2u, SmartSuggestion smartSuggestion, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, Boolean bool10, Boolean bool11, Boolean bool12, Boolean bool13, Integer num, Long l, Long l2, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, HashMap hashMap, List list, List list2, List list3, List list4, List list5, List list6, List list7, List list8, List list9, Map map, Map map2, Map map3, Map map4, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24) {
        int i22;
        Map map5 = map2;
        List list10 = list;
        0qQ.A0B(list10, 6);
        List list11 = list7;
        List list12 = list6;
        List list13 = list5;
        List list14 = list4;
        List list15 = list3;
        List list16 = list2;
        String str14 = str13;
        String str15 = str12;
        String str16 = str11;
        String str17 = str10;
        String str18 = str9;
        String str19 = str8;
        String str20 = str7;
        String str21 = str6;
        String str22 = str5;
        String str23 = str4;
        String str24 = str3;
        String str25 = str2;
        String str26 = str;
        Long l3 = l;
        Integer num2 = num;
        Boolean bool14 = bool13;
        Boolean bool15 = bool11;
        Boolean bool16 = bool10;
        Boolean bool17 = bool9;
        Boolean bool18 = bool8;
        AnonymousClass4jH r92 = r132;
        A5N a5n2 = a5n;
        C370838x9 r94 = r130;
        DirectThreadThemeInfo directThreadThemeInfo2 = directThreadThemeInfo;
        C242263Tg r96 = r128;
        C280014zr r97 = r127;
        C242243Te r98 = r126;
        C300625xW r99 = r125;
        C242373Tu r100 = r124;
        C45275Cte cte2 = cte;
        int i23 = i17;
        Boolean bool19 = bool;
        int i24 = i19;
        Boolean bool20 = bool3;
        int i25 = i20;
        Boolean bool21 = bool4;
        int i26 = i21;
        Boolean bool22 = bool5;
        long j2 = j;
        Boolean bool23 = bool6;
        boolean z25 = z;
        boolean z26 = z2;
        boolean z27 = z6;
        boolean z28 = z7;
        HashMap hashMap2 = hashMap;
        N49 n492 = n49;
        List list17 = list9;
        boolean z29 = z13;
        int i27 = i18;
        Boolean bool24 = bool2;
        boolean z30 = z24;
        boolean z31 = z11;
        int i28 = i16;
        User user2 = user;
        boolean z32 = z22;
        boolean z33 = z21;
        int i29 = i14;
        N2U n2u2 = n2u;
        boolean z34 = z20;
        int i30 = i12;
        C272964li r87 = r137;
        boolean z35 = z18;
        int i31 = i11;
        CreatorSubscriberThreadInfo creatorSubscriberThreadInfo2 = creatorSubscriberThreadInfo;
        boolean z36 = z17;
        int i32 = i10;
        CreatorBroadcastThreadInfo creatorBroadcastThreadInfo2 = creatorBroadcastThreadInfo;
        boolean z37 = z16;
        int i33 = i9;
        C254403sQ r90 = r134;
        boolean z38 = z15;
        boolean z39 = z12;
        boolean z40 = z10;
        int i34 = i8;
        AnonymousClass914 r91 = r133;
        int i35 = i7;
        int i36 = i6;
        int i37 = i4;
        int i38 = i3;
        int i39 = i2;
        int i40 = i;
        Map map6 = map4;
        Map map7 = map3;
        Boolean bool25 = bool7;
        SmartSuggestion smartSuggestion2 = smartSuggestion;
        2EN r86 = r138;
        C61081JwJ jwJ2 = jwJ;
        List list18 = list8;
        C59832Ja7 ja72 = ja7;
        AnonymousClass9IE r110 = r112;
        AnonymousClass9IM r109 = r113;
        AnonymousClass9IV r12 = r114;
        AnonymousClass9IV r108 = r115;
        AnonymousClass9IV r107 = r116;
        C376579In r106 = r117;
        AnonymousClass9J6 r105 = r118;
        C61078JwG jwG2 = jwG;
        if (((Boolean) this.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = this.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i22 = reentrantReadWriteLock.getReadHoldCount();
                for (int i41 = 0; i41 < i22; i41++) {
                    readLock.unlock();
                }
            } else {
                i22 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                A0D(str26);
                if (this.A00 != null) {
                    AnonymousClass3S9 r2 = this.A01;
                    if (!0qQ.A0K(str25, r2.A1s) || r2.A28 != list10) {
                        this.A00 = null;
                    }
                }
                AnonymousClass3S9 r1 = this.A01;
                r1.A1s = str25;
                r1.A1h = l3;
                r1.A1k = str24;
                r1.A1g = num2;
                r1.A1U = user2;
                r1.A25 = new ArrayList(list16);
                r1.A28 = new ArrayList(list10);
                r1.A21 = new ArrayList(list15);
                r1.A01();
                r1.A1r = str23;
                r1.A0z = r92;
                for (Map.Entry entry : map.entrySet()) {
                    A0N((AnonymousClass3SZ) entry.getValue(), (String) entry.getKey());
                }
                r1.A0D = i40;
                r1.A0C = i39;
                r1.A03 = i38;
                r1.A02 = i37;
                r1.A2f = z25;
                r1.A2h = z26;
                r1.A2d = z40;
                r1.A2p.A03(Integer.valueOf(i5));
                r1.A2o.A03(Boolean.valueOf(z3));
                r1.A19.A03(Boolean.valueOf(z4));
                r1.A18.A03(Boolean.valueOf(z5));
                r1.A1A.A03(Boolean.valueOf(z27));
                r1.A2g = z27;
                r1.A1C.A03(Boolean.valueOf(z8));
                r1.A1B.A03(Boolean.valueOf(z9));
                r1.A1J.A03(Integer.valueOf(i36));
                r1.A13.A03(str20);
                r1.A2V = z31;
                r1.A2S = z39;
                r1.A2P = z29;
                r1.A1u = str22;
                r1.A1v = str21;
                r1.A2J = z28;
                r1.A04 = i36;
                r1.A1i = str20;
                r1.A06 = i35;
                r1.A0I = i34;
                r1.A0F = i33;
                r1.A00 = i32;
                r1.A1G.A03(Boolean.valueOf(z14));
                r1.A2n = z38;
                r1.A1H.A03(str19);
                r1.A14.A03(r87);
                r1.A0r = r99;
                r1.A1L.A03(directThreadThemeInfo2);
                r1.A0x = r94;
                r1.A08 = i31;
                r1.A24 = list12;
                r1.A0P = r110;
                r1.A16.A03(Boolean.valueOf(z19));
                r1.A0t = r97;
                r1.A0U = r106;
                r1.A0X = jwG2;
                if (list4 != null) {
                    r1.A2B = list14;
                }
                if (str9 != null) {
                    r1.A1n = str18;
                }
                if (list5 != null) {
                    r1.A23 = list13;
                }
                if (r114 != null) {
                    r1.A0T = r12;
                }
                if (cte != null) {
                    r1.A0d = cte2;
                }
                r1.A1W = bool19;
                r1.A1Y = bool24;
                r1.A1d = bool22;
                r1.A1c = bool21;
                r1.A1f = bool20;
                r1.A1b = bool23;
                r1.A2Z = z37;
                r1.A2Y = z36;
                r1.A2U = z35;
                r1.A1O = creatorSubscriberThreadInfo2;
                r1.A1N = creatorBroadcastThreadInfo2;
                r1.A1M = r90;
                r1.A1Z = bool25;
                r1.A22 = list11;
                r1.A1Q = r86;
                r1.A1z = hashMap2;
                r1.A0J = i30;
                r1.A0S = r108;
                r1.A1X = bool18;
                r1.A0s = r98;
                r1.A0Y = jwJ2;
                r1.A10 = r91;
                r1.A0a = ja72;
                r1.A1m = str15;
                r1.A1K.A03(Integer.valueOf(i13));
                r1.A1j = str17;
                r1.A1S = smartSuggestion2;
                if (bool9 != null) {
                    r1.A1E.A03(bool17);
                }
                if (bool10 != null) {
                    r1.A15.A03(bool16);
                }
                if (bool11 != null) {
                    r1.A11.A03(bool15);
                }
                r1.A0V = r105;
                if (bool12 != null) {
                    r1.A2T = bool12.booleanValue();
                }
                r1.A1e = bool14;
                r1.A0u = r96;
                r1.A0G = i29;
                r1.A0e = r100;
                r1.A1P = r87;
                r1.A1R = n2u2;
                r1.A1F.A03(Integer.valueOf(i15));
                r1.A0K = i28;
                r1.A07 = i23;
                r1.A09 = i27;
                if (l2 != null) {
                    r1.A0N = l2.longValue();
                }
                r1.A1t = str16;
                r1.A2X = z34;
                r1.A01 = i24;
                AnonymousClass3SB r22 = r1.A12;
                if (map2 == null) {
                    map5 = RegularImmutableMap.A02;
                }
                r22.A03(map5);
                r1.A2Q = z33;
                r1.A2i = z32;
                r1.A1a = Boolean.valueOf(z23);
                r1.A0O = j2;
                r1.A0y = a5n2;
                r1.A0R = r107;
                r1.A0B = i25;
                r1.A29 = list18;
                r1.A1l = str14;
                r1.A2O = z30;
                r1.A2A = list17;
                r1.A2D = map7;
                r1.A2E = map6;
                r1.A0Q = r109;
                r1.A0Z = n492;
                r1.A0E = i26;
                for (int i42 = 0; i42 < i22; i42++) {
                    readLock.lock();
                }
                writeLock.unlock();
            } catch (Throwable th) {
                for (int i43 = 0; i43 < i22; i43++) {
                    readLock.lock();
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            AnonymousClass3S9 r13 = this.A01;
            synchronized (r13) {
                A0D(str26);
                if (this.A00 != null && (!0qQ.A0K(str25, r13.A1s) || r13.A28 != list10)) {
                    this.A00 = null;
                }
                r13.A1s = str25;
                r13.A1h = l3;
                r13.A1k = str24;
                r13.A1g = num2;
                r13.A1U = user2;
                r13.A25 = new ArrayList(list16);
                r13.A28 = new ArrayList(list10);
                r13.A21 = new ArrayList(list15);
                r13.A01();
                r13.A1r = str23;
                r13.A0z = r92;
                for (Map.Entry entry2 : map.entrySet()) {
                    A0N((AnonymousClass3SZ) entry2.getValue(), (String) entry2.getKey());
                }
                r13.A0D = i40;
                r13.A0C = i39;
                r13.A03 = i38;
                r13.A02 = i37;
                r13.A2f = z25;
                r13.A2h = z26;
                r13.A2d = z40;
                r13.A2p.A03(Integer.valueOf(i5));
                r13.A2o.A03(Boolean.valueOf(z3));
                r13.A19.A03(Boolean.valueOf(z4));
                r13.A18.A03(Boolean.valueOf(z5));
                r13.A1A.A03(Boolean.valueOf(z27));
                r13.A2g = z27;
                r13.A1C.A03(Boolean.valueOf(z8));
                r13.A1B.A03(Boolean.valueOf(z9));
                r13.A1J.A03(Integer.valueOf(i36));
                r13.A13.A03(str20);
                r13.A2V = z31;
                r13.A2S = z39;
                r13.A2P = z29;
                r13.A1u = str22;
                r13.A1v = str21;
                r13.A2J = z28;
                r13.A04 = i36;
                r13.A1i = str20;
                r13.A06 = i35;
                r13.A0I = i34;
                r13.A0F = i33;
                r13.A00 = i32;
                r13.A1G.A03(Boolean.valueOf(z14));
                r13.A2n = z38;
                r13.A1H.A03(str19);
                r13.A14.A03(r87);
                r13.A0r = r99;
                r13.A1L.A03(directThreadThemeInfo2);
                r13.A0x = r94;
                r13.A08 = i31;
                r13.A24 = list12;
                r13.A0P = r110;
                r13.A16.A03(Boolean.valueOf(z19));
                r13.A0t = r97;
                r13.A0U = r106;
                r13.A0X = jwG2;
                if (list4 != null) {
                    r13.A2B = list14;
                }
                if (str9 != null) {
                    r13.A1n = str18;
                }
                if (list5 != null) {
                    r13.A23 = list13;
                }
                if (r114 != null) {
                    r13.A0T = r12;
                }
                if (cte != null) {
                    r13.A0d = cte2;
                }
                r13.A1W = bool19;
                r13.A1Y = bool24;
                r13.A1d = bool22;
                r13.A1c = bool21;
                r13.A1f = bool20;
                r13.A1b = bool23;
                r13.A2Z = z37;
                r13.A2Y = z36;
                r13.A2U = z35;
                r13.A1O = creatorSubscriberThreadInfo2;
                r13.A1N = creatorBroadcastThreadInfo2;
                r13.A1M = r90;
                r13.A1Z = bool25;
                r13.A22 = list11;
                r13.A1Q = r86;
                r13.A1z = hashMap2;
                r13.A0J = i30;
                r13.A0S = r108;
                r13.A1X = bool18;
                r13.A0s = r98;
                r13.A0Y = jwJ2;
                r13.A10 = r91;
                r13.A0a = ja72;
                r13.A1m = str15;
                r13.A1K.A03(Integer.valueOf(i13));
                r13.A1j = str17;
                r13.A1S = smartSuggestion2;
                if (bool9 != null) {
                    r13.A1E.A03(bool17);
                }
                if (bool10 != null) {
                    r13.A15.A03(bool16);
                }
                if (bool11 != null) {
                    r13.A11.A03(bool15);
                }
                r13.A0V = r105;
                if (bool12 != null) {
                    r13.A2T = bool12.booleanValue();
                }
                r13.A1e = bool14;
                r13.A0u = r96;
                r13.A0G = i29;
                r13.A0e = r100;
                r13.A1P = r87;
                r13.A1R = n2u2;
                r13.A1F.A03(Integer.valueOf(i15));
                r13.A0K = i28;
                r13.A07 = i23;
                r13.A09 = i27;
                if (l2 != null) {
                    r13.A0N = l2.longValue();
                }
                r13.A1t = str16;
                r13.A2X = z34;
                r13.A01 = i24;
                AnonymousClass3SB r23 = r13.A12;
                if (map2 == null) {
                    map5 = RegularImmutableMap.A02;
                }
                r23.A03(map5);
                r13.A2Q = z33;
                r13.A2i = z32;
                r13.A1a = Boolean.valueOf(z23);
                r13.A0O = j2;
                r13.A0y = a5n2;
                r13.A0R = r107;
                r13.A0B = i25;
                r13.A29 = list18;
                r13.A1l = str14;
                r13.A2O = z30;
                r13.A2A = list17;
                r13.A2D = map7;
                r13.A2E = map6;
                r13.A0Q = r109;
                r13.A0Z = n492;
                r13.A0E = i26;
            }
        }
    }
}
