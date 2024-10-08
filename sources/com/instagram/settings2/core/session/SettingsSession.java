package com.instagram.settings2.core.session;

import X.02z;
import X.05G;
import X.0KC;
import X.0sP;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C262224Cq;
import X.C51968G9o;
import X.C51971G9r;
import X.C61770pa;
import X.C64185LSs;
import X.C66186MGx;
import X.C66349MOg;
import X.DbS;
import X.DbV;
import X.JTP;
import com.instagram.common.session.UserSession;
import com.instagram.settings2.core.data.SettingsRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public final class SettingsSession {
    public final UserSession A00;
    public final SettingsRepository A01;
    public final String A02;
    public final Map A03;
    public final ReentrantReadWriteLock A04 = new ReentrantReadWriteLock();
    public final 05G A05;
    public final 05G A06;
    public final C61770pa A07;
    public final C61770pa A08;

    public static final void A00(SettingsSession settingsSession, 0sP r11) {
        ReentrantReadWriteLock.ReadLock readLock;
        int i;
        int i2;
        ReentrantReadWriteLock.WriteLock A0z;
        try {
            ReentrantReadWriteLock reentrantReadWriteLock = settingsSession.A04;
            readLock = reentrantReadWriteLock.readLock();
            i = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i2; i3++) {
                    readLock.unlock();
                }
            } else {
                i2 = 0;
            }
            A0z = JTP.A0z(reentrantReadWriteLock);
            Map map = settingsSession.A03;
            map.size();
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator A16 = DbV.A16(map);
            while (A16.hasNext()) {
                C64185LSs lSs = (C64185LSs) A16.next();
                if (C51971G9r.A1a(lSs, r11)) {
                    A1C.add(lSs);
                }
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                map.remove((C64185LSs) it.next());
            }
            map.size();
            while (i < i2) {
                readLock.lock();
                i++;
            }
            A0z.unlock();
            settingsSession.A06.Epw(new Date());
        } catch (Exception e) {
            0KC.A0F("SettingsSession", "Error while invalidating values", e);
            settingsSession.A05.Epw(new Date());
            throw e;
        } catch (Throwable th) {
            while (i < i2) {
                readLock.lock();
                i++;
            }
            A0z.unlock();
            throw th;
        }
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MEB, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.util.List r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 30
            boolean r0 = X.MEB.A03(r3, r7)
            if (r0 == 0) goto L_0x0036
            r4 = r7
            X.MEB r4 = (X.MEB) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0036
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x002a
            if (r1 != r0) goto L_0x003b
            X.0eS.A00(r3)
        L_0x0024:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.collections.List<T of com.instagram.settings2.core.session.SettingsSession.resolveList>"
            X.0qQ.A0C(r3, r0)
            return r3
        L_0x002a:
            X.0eS.A00(r3)
            r4.A00 = r0
            java.lang.Object r3 = r5.A02(r6, r4)
            if (r3 != r2) goto L_0x0024
            return r2
        L_0x0036:
            X.MEB r4 = X.MEB.A00(r5, r7, r3)
            goto L_0x0016
        L_0x003b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.session.SettingsSession.A01(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r11v1, types: [X.MDR, X.4D7] */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0099 A[Catch:{ all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00c6 A[Catch:{ all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d0 A[Catch:{ all -> 0x00f1 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d7 A[SYNTHETIC, Splitter:B:42:0x00d7] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e6 A[Catch:{ Exception -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7 A[SYNTHETIC, Splitter:B:52:0x00f7] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.List r21, X.AnonymousClass4D7 r22) {
        /*
            r20 = this;
            r3 = r22
            boolean r0 = r3 instanceof X.MDR
            r8 = r20
            if (r0 == 0) goto L_0x0043
            r11 = r3
            X.MDR r11 = (X.MDR) r11
            int r2 = r11.A02
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0043
            int r2 = r2 - r1
            r11.A02 = r2
        L_0x0016:
            java.lang.Object r13 = r11.A0A
            X.1Hj r10 = X.1Hj.A02
            int r0 = r11.A02
            r7 = 0
            r9 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r9) goto L_0x0049
            int r2 = r11.A01
            int r3 = r11.A00
            java.lang.Object r8 = r11.A09
            java.util.Collection r8 = (java.util.Collection) r8
            java.lang.Object r12 = r11.A08
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r1 = r11.A07
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r14 = r11.A06
            com.instagram.settings2.core.session.AbstractValueResolverImpl r14 = (com.instagram.settings2.core.session.AbstractValueResolverImpl) r14
            java.lang.Object r6 = r11.A05
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = (java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock) r6
            java.lang.Object r5 = r11.A04
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = (java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock) r5
            java.lang.Object r4 = r11.A03
            com.instagram.settings2.core.session.SettingsSession r4 = (com.instagram.settings2.core.session.SettingsSession) r4
            goto L_0x00be
        L_0x0043:
            X.MDR r11 = new X.MDR
            r11.<init>(r8, r3)
            goto L_0x0016
        L_0x0049:
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0x()
            throw r2
        L_0x004e:
            X.0eS.A00(r13)
            java.util.concurrent.locks.ReentrantReadWriteLock r12 = r8.A04     // Catch:{ Exception -> 0x0103 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r5 = r12.readLock()     // Catch:{ Exception -> 0x0103 }
            int r0 = r12.getWriteHoldCount()     // Catch:{ Exception -> 0x0103 }
            if (r0 != 0) goto L_0x0062
            int r3 = r12.getReadHoldCount()     // Catch:{ Exception -> 0x0103 }
            goto L_0x0063
        L_0x0062:
            r3 = 0
        L_0x0063:
            r0 = 0
        L_0x0064:
            if (r0 >= r3) goto L_0x006c
            r5.unlock()     // Catch:{ Exception -> 0x0103 }
            int r0 = r0 + 1
            goto L_0x0064
        L_0x006c:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r6 = X.JTP.A0z(r12)     // Catch:{ Exception -> 0x0103 }
            java.util.Map r4 = r8.A03     // Catch:{ all -> 0x00f3 }
            int r2 = r4.size()     // Catch:{ all -> 0x00f3 }
            com.instagram.common.session.UserSession r15 = r8.A00     // Catch:{ all -> 0x00f3 }
            com.instagram.settings2.core.data.SettingsRepository r1 = r8.A01     // Catch:{ all -> 0x00f3 }
            java.lang.String r0 = r8.A02     // Catch:{ all -> 0x00f3 }
            com.instagram.settings2.core.session.AbstractValueResolverImpl r14 = new com.instagram.settings2.core.session.AbstractValueResolverImpl     // Catch:{ all -> 0x00f3 }
            r17 = r0
            r18 = r4
            r19 = r12
            r16 = r1
            r14.<init>(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x00f3 }
            java.util.ArrayList r1 = X.AnonymousClass7TG.A0r(r21)     // Catch:{ all -> 0x00f3 }
            java.util.Iterator r12 = r21.iterator()     // Catch:{ all -> 0x00f3 }
            r4 = r8
        L_0x0092:
            r8 = r1
            boolean r0 = r12.hasNext()     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00c6
            java.lang.Object r0 = r12.next()     // Catch:{ all -> 0x00f1 }
            X.LSs r0 = (X.C64185LSs) r0     // Catch:{ all -> 0x00f1 }
            if (r0 == 0) goto L_0x00bc
            r11.A03 = r4     // Catch:{ all -> 0x00f1 }
            r11.A04 = r5     // Catch:{ all -> 0x00f1 }
            r11.A05 = r6     // Catch:{ all -> 0x00f1 }
            r11.A06 = r14     // Catch:{ all -> 0x00f1 }
            r11.A07 = r1     // Catch:{ all -> 0x00f1 }
            r11.A08 = r12     // Catch:{ all -> 0x00f1 }
            r11.A09 = r1     // Catch:{ all -> 0x00f1 }
            r11.A00 = r3     // Catch:{ all -> 0x00f1 }
            r11.A01 = r2     // Catch:{ all -> 0x00f1 }
            r11.A02 = r9     // Catch:{ all -> 0x00f1 }
            java.lang.Object r13 = r14.A01(r0, r11)     // Catch:{ all -> 0x00f1 }
            if (r13 != r10) goto L_0x00c1
            goto L_0x00c5
        L_0x00bc:
            r13 = 0
            goto L_0x00c1
        L_0x00be:
            X.0eS.A00(r13)     // Catch:{ all -> 0x00f1 }
        L_0x00c1:
            r8.add(r13)     // Catch:{ all -> 0x00f1 }
            goto L_0x0092
        L_0x00c5:
            return r10
        L_0x00c6:
            java.util.List r8 = (java.util.List) r8     // Catch:{ all -> 0x00f1 }
            java.util.Map r0 = r4.A03     // Catch:{ all -> 0x00f1 }
            int r0 = r0.size()     // Catch:{ all -> 0x00f1 }
            if (r2 != r0) goto L_0x00d1
            r9 = 0
        L_0x00d1:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r9)     // Catch:{ all -> 0x00f1 }
        L_0x00d5:
            if (r7 >= r3) goto L_0x00dd
            r5.lock()     // Catch:{ Exception -> 0x0101 }
            int r7 = r7 + 1
            goto L_0x00d5
        L_0x00dd:
            r6.unlock()     // Catch:{ Exception -> 0x0101 }
            boolean r0 = r0.booleanValue()     // Catch:{ Exception -> 0x0101 }
            if (r0 == 0) goto L_0x00f0
            X.05G r1 = r4.A06     // Catch:{ Exception -> 0x0101 }
            java.util.Date r0 = new java.util.Date     // Catch:{ Exception -> 0x0101 }
            r0.<init>()     // Catch:{ Exception -> 0x0101 }
            r1.Epw(r0)     // Catch:{ Exception -> 0x0101 }
        L_0x00f0:
            return r8
        L_0x00f1:
            r0 = move-exception
            goto L_0x00f5
        L_0x00f3:
            r0 = move-exception
            r4 = r8
        L_0x00f5:
            if (r7 >= r3) goto L_0x00fd
            r5.lock()     // Catch:{ Exception -> 0x0101 }
            int r7 = r7 + 1
            goto L_0x00f5
        L_0x00fd:
            r6.unlock()     // Catch:{ Exception -> 0x0101 }
            throw r0     // Catch:{ Exception -> 0x0101 }
        L_0x0101:
            r2 = move-exception
            goto L_0x0105
        L_0x0103:
            r2 = move-exception
            r4 = r8
        L_0x0105:
            java.lang.String r1 = "SettingsSession"
            java.lang.String r0 = "Error while resolving values"
            X.0KC.A0F(r1, r0, r2)
            X.05G r1 = r4.A05
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            r1.Epw(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.settings2.core.session.SettingsSession.A02(java.util.List, X.4D7):java.lang.Object");
    }

    public final void A03() {
        this.A01.A0C();
        A00(this, C66349MOg.A00);
    }

    public /* synthetic */ SettingsSession(UserSession userSession, SettingsRepository settingsRepository, String str, C262224Cq r8) {
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        this.A00 = userSession;
        this.A01 = settingsRepository;
        this.A02 = str;
        this.A03 = A1H;
        C51968G9o.A1P(new C66186MGx(this, (AnonymousClass4D7) null, 2), r8, settingsRepository.A0M);
        02z A10 = DbS.A10(new Date());
        this.A06 = A10;
        this.A08 = A10;
        02z A102 = DbS.A10(new Date());
        this.A05 = A102;
        this.A07 = A102;
    }
}
