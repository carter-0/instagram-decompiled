package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* renamed from: X.48S  reason: invalid class name */
public final class AnonymousClass48S {
    public static final Comparator A0Q = new AnonymousClass4B5();
    public Boolean A00 = null;
    public final 1UV A01 = new AnonymousClass4BP(this);
    public final 1UV A02 = new AnonymousClass4BO(this);
    public final 1UV A03 = new AnonymousClass4BG(this);
    public final 1UV A04 = new AnonymousClass4BC(this);
    public final 1UV A05 = new AnonymousClass4BF(this);
    public final 1UV A06 = new AnonymousClass4BD(this);
    public final 1UV A07 = new AnonymousClass4B9(this);
    public final 1UV A08 = new AnonymousClass4BA(this);
    public final 1UV A09 = new AnonymousClass4BB(this);
    public final 1UV A0A = new AnonymousClass4BJ(this);
    public final 1UV A0B = new AnonymousClass4BI(this);
    public final 1UV A0C = new AnonymousClass4B6(this);
    public final 1UV A0D = new AnonymousClass4B7(this);
    public final 1UV A0E = new AnonymousClass4BE(this);
    public final 1UV A0F = new AnonymousClass4BK(this);
    public final 1UV A0G = new AnonymousClass4BL(this);
    public final UserSession A0H;
    public final AnonymousClass3U9 A0I;
    public final AnonymousClass48T A0J;
    public final List A0K;
    public final List A0L = new ArrayList();
    public final 1UV A0M = new AnonymousClass4BN(this);
    public final 1UV A0N = new AnonymousClass4B8(this);
    public final 1UV A0O = new AnonymousClass4BH(this);
    public final 1UV A0P = new AnonymousClass4BM(this);

    /* JADX WARNING: Removed duplicated region for block: B:23:0x009f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f4  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.ArrayList A02(X.AnonymousClass3U9 r12, X.AnonymousClass48S r13, int r14) {
        /*
            monitor-enter(r13)
            X.3U9 r0 = r13.A0I     // Catch:{ all -> 0x013c }
            X.48h r6 = r0.A04()     // Catch:{ all -> 0x013c }
            r13.A06()     // Catch:{ all -> 0x013c }
            java.util.List r4 = r13.A0K     // Catch:{ all -> 0x013c }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x013c }
            r2.<init>(r4)     // Catch:{ all -> 0x013c }
            X.1UV r0 = r13.A08     // Catch:{ all -> 0x013c }
            java.lang.Object r1 = X.AnonymousClass3S1.A00(r0, r2)     // Catch:{ all -> 0x013c }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x013c }
            if (r1 == 0) goto L_0x003e
            java.lang.String r0 = r1.A0g()     // Catch:{ all -> 0x013c }
            if (r0 == 0) goto L_0x003e
            java.lang.String r0 = r1.A0g()     // Catch:{ all -> 0x013c }
            java.math.BigInteger r1 = new java.math.BigInteger     // Catch:{ all -> 0x013c }
            r1.<init>(r0)     // Catch:{ all -> 0x013c }
            java.math.BigInteger r0 = java.math.BigInteger.ONE     // Catch:{ all -> 0x013c }
            java.math.BigInteger r0 = r1.subtract(r0)     // Catch:{ all -> 0x013c }
            java.lang.String r2 = r0.toString()     // Catch:{ all -> 0x013c }
            X.2Ed r1 = r6.A00     // Catch:{ all -> 0x013c }
            java.lang.Object r0 = r6.A01     // Catch:{ all -> 0x013c }
            X.48h r6 = new X.48h     // Catch:{ all -> 0x013c }
            r6.<init>(r1, r2, r0)     // Catch:{ all -> 0x013c }
            goto L_0x005d
        L_0x003e:
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x013c }
            if (r0 != 0) goto L_0x005d
            int r0 = r2.size()     // Catch:{ all -> 0x013c }
            int r0 = r0 + -1
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x013c }
            X.3su r0 = (X.C254703su) r0     // Catch:{ all -> 0x013c }
            java.lang.String r2 = r0.A0g()     // Catch:{ all -> 0x013c }
            X.2Ed r1 = r6.A00     // Catch:{ all -> 0x013c }
            java.lang.Object r0 = r6.A01     // Catch:{ all -> 0x013c }
            X.48h r6 = new X.48h     // Catch:{ all -> 0x013c }
            r6.<init>(r1, r2, r0)     // Catch:{ all -> 0x013c }
        L_0x005d:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x013e }
            r3.<init>(r4)     // Catch:{ all -> 0x013e }
            X.48h r10 = r12.A04()     // Catch:{ all -> 0x013e }
            X.48V r9 = X.AnonymousClass48V.A00     // Catch:{ all -> 0x013e }
            java.lang.Object r1 = r9.A00     // Catch:{ all -> 0x013e }
            X.48a r7 = X.AnonymousClass48U.A00     // Catch:{ all -> 0x013e }
            java.util.List r11 = X.C2611248i.A03(r10, r7, r3)     // Catch:{ all -> 0x013e }
            int r4 = r11.size()     // Catch:{ all -> 0x013e }
            X.2hV r8 = r7.A00     // Catch:{ all -> 0x013e }
            X.2Ed r0 = r7.A01     // Catch:{ all -> 0x013e }
            java.util.Comparator r5 = r0.A02     // Catch:{ all -> 0x013e }
            int r1 = X.C2611248i.A00(r8, r1, r5, r11)     // Catch:{ all -> 0x013e }
            if (r1 >= 0) goto L_0x0082
            r1 = r1 ^ -1
        L_0x0082:
            int r2 = r1 - r14
            if (r2 >= 0) goto L_0x0089
            int r0 = -r2
            int r1 = r1 + r0
            goto L_0x009b
        L_0x0089:
            if (r1 <= r4) goto L_0x008e
            int r0 = r1 - r4
            int r2 = r2 - r0
        L_0x008e:
            if (r2 <= 0) goto L_0x009b
            int r0 = r2 + -1
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x013e }
            java.lang.Object r2 = r8.apply(r0)     // Catch:{ all -> 0x013e }
            goto L_0x009d
        L_0x009b:
            java.lang.Object r2 = r10.A02     // Catch:{ all -> 0x013e }
        L_0x009d:
            if (r1 < r4) goto L_0x00a0
            goto L_0x00a9
        L_0x00a0:
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x013e }
            java.lang.Object r1 = r8.apply(r0)     // Catch:{ all -> 0x013e }
            goto L_0x00ab
        L_0x00a9:
            java.lang.Object r1 = r10.A01     // Catch:{ all -> 0x013e }
        L_0x00ab:
            X.2Ed r0 = r10.A00     // Catch:{ all -> 0x013e }
            X.48h r4 = new X.48h     // Catch:{ all -> 0x013e }
            r4.<init>(r0, r2, r1)     // Catch:{ all -> 0x013e }
            java.util.Comparator r2 = X.AnonymousClass48U.A02     // Catch:{ all -> 0x013e }
            java.lang.Object r1 = r10.A02     // Catch:{ all -> 0x013e }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r6.A02     // Catch:{ all -> 0x013e }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x013e }
            int r0 = r2.compare(r1, r0)     // Catch:{ all -> 0x013e }
            if (r0 > 0) goto L_0x00c6
            X.48h r4 = r4.A00(r6)     // Catch:{ all -> 0x013e }
        L_0x00c6:
            X.48h r0 = r4.A00(r6)     // Catch:{ all -> 0x013e }
            java.util.List r0 = X.C2611248i.A03(r0, r7, r3)     // Catch:{ all -> 0x013e }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x013e }
            r3.<init>(r0)     // Catch:{ all -> 0x013e }
            X.48h r2 = r12.A05()     // Catch:{ all -> 0x013e }
            java.util.List r6 = r13.A0P(r2)     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x013e }
            java.util.List r9 = X.C2611248i.A03(r2, r7, r6)     // Catch:{ all -> 0x013e }
            int r1 = r9.size()     // Catch:{ all -> 0x013e }
            int r5 = X.C2611248i.A00(r8, r0, r5, r9)     // Catch:{ all -> 0x013e }
            if (r5 >= 0) goto L_0x00ed
            r5 = r5 ^ -1
        L_0x00ed:
            int r10 = r5 + r14
            if (r5 >= 0) goto L_0x00f4
            int r0 = -r5
            int r10 = r10 + r0
            goto L_0x0106
        L_0x00f4:
            if (r10 <= r1) goto L_0x00f9
            int r0 = r10 - r1
            int r5 = r5 - r0
        L_0x00f9:
            if (r5 <= 0) goto L_0x0106
            int r0 = r5 + -1
            java.lang.Object r0 = r9.get(r0)     // Catch:{ all -> 0x013e }
            java.lang.Object r5 = r8.apply(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0108
        L_0x0106:
            java.lang.Object r5 = r2.A02     // Catch:{ all -> 0x013e }
        L_0x0108:
            if (r10 < r1) goto L_0x010b
            goto L_0x0114
        L_0x010b:
            java.lang.Object r0 = r9.get(r10)     // Catch:{ all -> 0x013e }
            java.lang.Object r1 = r8.apply(r0)     // Catch:{ all -> 0x013e }
            goto L_0x0116
        L_0x0114:
            java.lang.Object r1 = r2.A01     // Catch:{ all -> 0x013e }
        L_0x0116:
            X.2Ed r0 = r2.A00     // Catch:{ all -> 0x013e }
            X.48h r2 = new X.48h     // Catch:{ all -> 0x013e }
            r2.<init>(r0, r5, r1)     // Catch:{ all -> 0x013e }
            java.util.List r0 = X.C2611248i.A03(r2, r7, r6)     // Catch:{ all -> 0x013e }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x013e }
            r1.<init>(r0)     // Catch:{ all -> 0x013e }
            java.util.Comparator r0 = X.AnonymousClass48U.A04     // Catch:{ all -> 0x013e }
            java.util.ArrayList r1 = X.AnonymousClass3S1.A02(r0, r3, r1)     // Catch:{ all -> 0x013e }
            X.1UV r0 = r13.A07     // Catch:{ all -> 0x013e }
            java.lang.Object r0 = X.AnonymousClass3S1.A00(r0, r3)     // Catch:{ all -> 0x013e }
            X.3su r0 = (X.C254703su) r0     // Catch:{ all -> 0x013e }
            A08(r4, r0, r12, r3)     // Catch:{ all -> 0x013e }
            A09(r2, r12, r1)     // Catch:{ all -> 0x013e }
            monitor-exit(r13)
            return r1
        L_0x013c:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x013e }
        L_0x013e:
            r0 = move-exception
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A02(X.3U9, X.48S, int):java.util.ArrayList");
    }

    public static ArrayList A03(List list, boolean z) {
        String A0g;
        boolean z2;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C254703su r1 = (C254703su) it.next();
            if (r1.A0g() == null) {
                A0g = r1.A0f();
            } else {
                A0g = r1.A0g();
            }
            if (z) {
                z2 = false;
            } else {
                z2 = null;
            }
            arrayList.add(new AnonymousClass9VM(r1.A10, z2, AnonymousClass05K.A00, A0g));
        }
        return arrayList;
    }

    public static List A04(C370548we r6, List list) {
        boolean CKJ;
        C370538wd r5 = (C370538wd) r6;
        C370878xD r0 = r5.A01;
        ArrayList arrayList = list;
        if (r0 != null) {
            arrayList = list;
            if (!r0.A01.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(r5.A01.A01);
                Comparator comparator = AnonymousClass48U.A04;
                Collections.sort(arrayList2, comparator);
                ArrayList A022 = AnonymousClass3S1.A02(comparator, arrayList2, list);
                String A052 = AnonymousClass48U.A05((String) null, list);
                String A053 = AnonymousClass48U.A05((String) null, arrayList2);
                String A042 = AnonymousClass48U.A04(A052, A053);
                if (2Ob.A00(A042, A053)) {
                    CKJ = r5.A01.A03;
                } else {
                    CKJ = r6.CKJ();
                }
                if (!CKJ) {
                    return A022;
                }
                ArrayList arrayList3 = new ArrayList();
                Iterator it = A022.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (AnonymousClass48U.A02.compare(((C254703su) next).A0g(), A042) >= 0) {
                        arrayList3.add(next);
                    }
                }
                arrayList = arrayList3;
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (r2.compare(r4.A01, r1) <= 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A08(X.C2611148h r4, X.C254703su r5, X.AnonymousClass3U9 r6, java.util.List r7) {
        /*
            monitor-enter(r6)
            r2 = 0
            X.0qQ.A0B(r7, r2)     // Catch:{ all -> 0x0050 }
            X.48a r0 = X.AnonymousClass48U.A00     // Catch:{ all -> 0x0050 }
            int r1 = X.C2611248i.A02(r4, r0, r7)     // Catch:{ all -> 0x0050 }
            int r0 = r7.size()     // Catch:{ all -> 0x0050 }
            if (r1 >= r0) goto L_0x003b
            java.lang.Object r0 = r7.get(r1)     // Catch:{ all -> 0x0050 }
            X.3su r0 = (X.C254703su) r0     // Catch:{ all -> 0x0050 }
            java.lang.String r3 = r0.A0g()     // Catch:{ all -> 0x0050 }
            X.2Ed r1 = r4.A00     // Catch:{ all -> 0x0050 }
            java.util.Comparator r2 = r1.A02     // Catch:{ all -> 0x0050 }
            java.lang.Object r0 = r4.A02     // Catch:{ all -> 0x0050 }
            java.lang.Object r1 = r1.A01     // Catch:{ all -> 0x0050 }
            int r0 = r2.compare(r0, r1)     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x0032
            java.lang.Object r0 = r4.A01     // Catch:{ all -> 0x0050 }
            int r1 = r2.compare(r0, r1)     // Catch:{ all -> 0x0050 }
            r0 = 1
            if (r1 > 0) goto L_0x0033
        L_0x0032:
            r0 = 0
        L_0x0033:
            r0 = r0 ^ 1
            X.5kL r1 = new X.5kL     // Catch:{ all -> 0x0050 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0050 }
            goto L_0x0041
        L_0x003b:
            r0 = 0
            X.5kL r1 = new X.5kL     // Catch:{ all -> 0x0050 }
            r1.<init>(r0, r2)     // Catch:{ all -> 0x0050 }
        L_0x0041:
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x0050 }
            r6.A0E(r0)     // Catch:{ all -> 0x0050 }
            boolean r0 = r1.A01     // Catch:{ all -> 0x0050 }
            r6.A0J(r0)     // Catch:{ all -> 0x0050 }
            A07(r4, r5, r6)     // Catch:{ all -> 0x0050 }
            monitor-exit(r6)     // Catch:{ all -> 0x0050 }
            return
        L_0x0050:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0050 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A08(X.48h, X.3su, X.3U9, java.util.List):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0034, code lost:
        if (r2.compare(r9.A02, r1) >= 0) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.C2611148h r9, X.AnonymousClass3U9 r10, java.util.List r11) {
        /*
            monitor-enter(r10)
            r8 = 0
            X.0qQ.A0B(r11, r8)     // Catch:{ all -> 0x00f7 }
            X.48a r0 = X.AnonymousClass48U.A00     // Catch:{ all -> 0x00f7 }
            int r0 = X.C2611248i.A01(r9, r0, r11)     // Catch:{ all -> 0x00f7 }
            int r1 = r0 + -1
            if (r1 < 0) goto L_0x003f
            int r0 = r11.size()     // Catch:{ all -> 0x00f7 }
            if (r1 >= r0) goto L_0x003f
            java.lang.Object r0 = r11.get(r1)     // Catch:{ all -> 0x00f7 }
            X.3su r0 = (X.C254703su) r0     // Catch:{ all -> 0x00f7 }
            java.lang.String r3 = r0.A0g()     // Catch:{ all -> 0x00f7 }
            X.2Ed r1 = r9.A00     // Catch:{ all -> 0x00f7 }
            java.util.Comparator r2 = r1.A02     // Catch:{ all -> 0x00f7 }
            java.lang.Object r0 = r9.A01     // Catch:{ all -> 0x00f7 }
            java.lang.Object r1 = r1.A00     // Catch:{ all -> 0x00f7 }
            int r0 = r2.compare(r0, r1)     // Catch:{ all -> 0x00f7 }
            if (r0 != 0) goto L_0x0036
            java.lang.Object r0 = r9.A02     // Catch:{ all -> 0x00f7 }
            int r1 = r2.compare(r0, r1)     // Catch:{ all -> 0x00f7 }
            r0 = 1
            if (r1 < 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            r0 = r0 ^ 1
            X.5kL r1 = new X.5kL     // Catch:{ all -> 0x00f7 }
            r1.<init>(r3, r0)     // Catch:{ all -> 0x00f7 }
            goto L_0x0045
        L_0x003f:
            r0 = 0
            X.5kL r1 = new X.5kL     // Catch:{ all -> 0x00f7 }
            r1.<init>(r0, r8)     // Catch:{ all -> 0x00f7 }
        L_0x0045:
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x00f7 }
            r10.A0F(r0)     // Catch:{ all -> 0x00f7 }
            boolean r0 = r1.A01     // Catch:{ all -> 0x00f7 }
            r10.A0I(r0)     // Catch:{ all -> 0x00f7 }
            java.lang.Object r5 = r9.A02     // Catch:{ all -> 0x00f7 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00f7 }
            X.0eM r7 = r10.A05     // Catch:{ all -> 0x00f7 }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x00f7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x009b
            java.util.concurrent.locks.ReentrantReadWriteLock r3 = r10.A03     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r2 = r3.readLock()     // Catch:{ all -> 0x00f7 }
            int r0 = r3.getWriteHoldCount()     // Catch:{ all -> 0x00f7 }
            r1 = 0
            if (r0 != 0) goto L_0x007b
            int r8 = r3.getReadHoldCount()     // Catch:{ all -> 0x00f7 }
            r0 = 0
        L_0x0073:
            if (r0 >= r8) goto L_0x007b
            r2.unlock()     // Catch:{ all -> 0x00f7 }
            int r0 = r0 + 1
            goto L_0x0073
        L_0x007b:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r3.writeLock()     // Catch:{ all -> 0x00f7 }
            r4.lock()     // Catch:{ all -> 0x00f7 }
            X.3S9 r6 = r10.A01     // Catch:{ all -> 0x0092 }
            r6.A1y = r5     // Catch:{ all -> 0x0092 }
        L_0x0086:
            if (r1 >= r8) goto L_0x008e
            r2.lock()     // Catch:{ all -> 0x00f7 }
            int r1 = r1 + 1
            goto L_0x0086
        L_0x008e:
            r4.unlock()     // Catch:{ all -> 0x00f7 }
            goto L_0x00a1
        L_0x0092:
            r0 = move-exception
        L_0x0093:
            if (r1 >= r8) goto L_0x00ea
            r2.lock()     // Catch:{ all -> 0x00f7 }
            int r1 = r1 + 1
            goto L_0x0093
        L_0x009b:
            X.3S9 r6 = r10.A01     // Catch:{ all -> 0x00f7 }
            monitor-enter(r6)     // Catch:{ all -> 0x00f7 }
            r6.A1y = r5     // Catch:{ all -> 0x00f4 }
            monitor-exit(r6)     // Catch:{ all -> 0x00f7 }
        L_0x00a1:
            java.lang.Object r5 = r9.A01     // Catch:{ all -> 0x00f7 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00f7 }
            java.lang.Object r0 = r7.getValue()     // Catch:{ all -> 0x00f7 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x00f7 }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x00f7 }
            if (r0 == 0) goto L_0x00ee
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r10.A03     // Catch:{ all -> 0x00f7 }
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r4.readLock()     // Catch:{ all -> 0x00f7 }
            int r0 = r4.getWriteHoldCount()     // Catch:{ all -> 0x00f7 }
            r2 = 0
            if (r0 != 0) goto L_0x00cb
            int r1 = r4.getReadHoldCount()     // Catch:{ all -> 0x00f7 }
            r0 = 0
        L_0x00c3:
            if (r0 >= r1) goto L_0x00cc
            r3.unlock()     // Catch:{ all -> 0x00f7 }
            int r0 = r0 + 1
            goto L_0x00c3
        L_0x00cb:
            r1 = 0
        L_0x00cc:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r4 = r4.writeLock()     // Catch:{ all -> 0x00f7 }
            r4.lock()     // Catch:{ all -> 0x00f7 }
            r6.A1x = r5     // Catch:{ all -> 0x00e1 }
        L_0x00d5:
            if (r2 >= r1) goto L_0x00dd
            r3.lock()     // Catch:{ all -> 0x00f7 }
            int r2 = r2 + 1
            goto L_0x00d5
        L_0x00dd:
            r4.unlock()     // Catch:{ all -> 0x00f7 }
            goto L_0x00f2
        L_0x00e1:
            r0 = move-exception
        L_0x00e2:
            if (r2 >= r1) goto L_0x00ea
            r3.lock()     // Catch:{ all -> 0x00f7 }
            int r2 = r2 + 1
            goto L_0x00e2
        L_0x00ea:
            r4.unlock()     // Catch:{ all -> 0x00f7 }
            goto L_0x00f6
        L_0x00ee:
            monitor-enter(r6)     // Catch:{ all -> 0x00f7 }
            r6.A1x = r5     // Catch:{ all -> 0x00f4 }
            monitor-exit(r6)     // Catch:{ all -> 0x00f7 }
        L_0x00f2:
            monitor-exit(r10)     // Catch:{ all -> 0x00f7 }
            return
        L_0x00f4:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00f7 }
        L_0x00f6:
            throw r0     // Catch:{ all -> 0x00f7 }
        L_0x00f7:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x00f7 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A09(X.48h, X.3U9, java.util.List):void");
    }

    public final synchronized int A0F(AnonymousClass3SZ r16, int i) {
        int i2;
        Set set;
        int i3 = i;
        AnonymousClass3SZ r1 = r16;
        if (r16 == null) {
            i2 = Math.min(this.A0K.size(), i3);
        } else {
            ArrayList arrayList = new ArrayList(this.A0K);
            int size = arrayList.size();
            UserSession userSession = this.A0H;
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 36320674406474511L)) {
                set = 1Au.A00(userSession).A01.C1t("direct_reels_watched_set");
            } else {
                set = new HashSet();
            }
            i2 = 0;
            C254703su r13 = null;
            for (int A002 = A00(r1, this); A002 < size; A002++) {
                C254703su r3 = (C254703su) arrayList.get(A002);
                if (r3 == null) {
                    0f9 AEf = 0wj.A01.AEf("getUnseenMessageCount directMessage is null", 20134884);
                    AEf.ABO("index", A002);
                    AEf.ABO("messageListSize", size);
                    AEf.report();
                } else {
                    0eE r14 = AnonymousClass0t1.A01;
                    if (r3.A1i(r14.A01(userSession)) && ((r3.A10 != 2FW.A0q || r3.A1l(r14.A01(userSession))) && (r13 == null || r13.A0Q == null || r3.A0Q == null || !2Ob.A00(r13.A1q, r3.A1q)))) {
                        if ((r3.A0g() == null || !set.contains(r3.A0g()) || !182.A06(r5, userSession, 36320674406474511L)) && (i2 = i2 + 1) >= i3) {
                            break;
                        }
                        r13 = r3;
                    }
                }
            }
        }
        return i2;
    }

    public final synchronized C254703su A0G(C254703su r2, boolean z) {
        return A0H(r2, true, z);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f1, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C254703su A0H(X.C254703su r10, boolean r11, boolean r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.instagram.common.session.UserSession r2 = r9.A0H     // Catch:{ all -> 0x00f2 }
            X.5yD r3 = X.C300935yC.A00(r2)     // Catch:{ all -> 0x00f2 }
            X.3U9 r7 = r9.A0I     // Catch:{ all -> 0x00f2 }
            com.instagram.model.direct.DirectThreadKey r1 = r7.BJz()     // Catch:{ all -> 0x00f2 }
            r0 = 1
            boolean r0 = r3.A02(r10, r1, r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x0016
            monitor-exit(r9)
            return r10
        L_0x0016:
            boolean r0 = r10.A1Q()     // Catch:{ all -> 0x00f2 }
            r8 = 0
            if (r0 == 0) goto L_0x005d
            java.util.List r3 = r9.A0K     // Catch:{ all -> 0x00f2 }
            java.util.Comparator r1 = X.AnonymousClass48U.A01     // Catch:{ all -> 0x00f2 }
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x00f2 }
            int r0 = java.util.Collections.binarySearch(r3, r10, r1)     // Catch:{ all -> 0x00f2 }
            if (r0 < 0) goto L_0x005b
            java.lang.Object r3 = r3.remove(r0)     // Catch:{ all -> 0x00f2 }
            X.3su r3 = (X.C254703su) r3     // Catch:{ all -> 0x00f2 }
        L_0x0031:
            java.util.List r1 = r9.A0L     // Catch:{ all -> 0x00f2 }
            java.util.Comparator r0 = X.AnonymousClass48U.A01     // Catch:{ all -> 0x00f2 }
            r5 = 0
            X.0qQ.A0B(r1, r5)     // Catch:{ all -> 0x00f2 }
            int r0 = java.util.Collections.binarySearch(r1, r10, r0)     // Catch:{ all -> 0x00f2 }
            if (r0 < 0) goto L_0x0059
            java.lang.Object r1 = r1.remove(r0)     // Catch:{ all -> 0x00f2 }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x00f2 }
        L_0x0045:
            java.util.List r4 = r9.A0K     // Catch:{ all -> 0x00f2 }
            java.util.Comparator r6 = X.AnonymousClass48U.A04     // Catch:{ all -> 0x00f2 }
            X.0qQ.A0B(r4, r5)     // Catch:{ all -> 0x00f2 }
            int r0 = java.util.Collections.binarySearch(r4, r10, r6)     // Catch:{ all -> 0x00f2 }
            if (r0 < 0) goto L_0x0063
            java.lang.Object r0 = r4.remove(r0)     // Catch:{ all -> 0x00f2 }
            X.3su r0 = (X.C254703su) r0     // Catch:{ all -> 0x00f2 }
            goto L_0x005f
        L_0x0059:
            r1 = 0
            goto L_0x0045
        L_0x005b:
            r3 = 0
            goto L_0x0031
        L_0x005d:
            r3 = r8
            goto L_0x0031
        L_0x005f:
            if (r0 == 0) goto L_0x0063
            r3 = r0
            goto L_0x0066
        L_0x0063:
            if (r1 == 0) goto L_0x0069
            r3 = r1
        L_0x0066:
            if (r3 == r10) goto L_0x007e
            goto L_0x006d
        L_0x0069:
            if (r3 != 0) goto L_0x0066
            r3 = r10
            goto L_0x0066
        L_0x006d:
            com.instagram.model.direct.DirectThreadKey r0 = r7.BJz()     // Catch:{ all -> 0x00f2 }
            X.3t0 r0 = X.AnonymousClass3t7.A00(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x007b
            X.3t0 r8 = X.C300965yF.A02(r0)     // Catch:{ all -> 0x00f2 }
        L_0x007b:
            r3.A10(r2, r10, r8)     // Catch:{ all -> 0x00f2 }
        L_0x007e:
            java.lang.String r0 = r7.C6P()     // Catch:{ all -> 0x00f2 }
            java.lang.String r1 = r3.A0g()     // Catch:{ all -> 0x00f2 }
            if (r12 == 0) goto L_0x0093
            if (r0 == 0) goto L_0x0090
            int r0 = r0.compareTo(r1)     // Catch:{ all -> 0x00f2 }
            if (r0 <= 0) goto L_0x0093
        L_0x0090:
            r7.A0E(r1)     // Catch:{ all -> 0x00f2 }
        L_0x0093:
            int r0 = java.util.Collections.binarySearch(r4, r3, r6)     // Catch:{ all -> 0x00f2 }
            if (r0 >= 0) goto L_0x009c
            int r0 = -r0
            int r0 = r0 + -1
        L_0x009c:
            r4.add(r0, r3)     // Catch:{ all -> 0x00f2 }
            X.0qQ.A0B(r2, r5)     // Catch:{ all -> 0x00f2 }
            X.0Tu r4 = X.0Tu.A05     // Catch:{ all -> 0x00f2 }
            r0 = 36325665158673523(0x810e0000033473, double:3.03583514583359E-306)
            boolean r0 = X.182.A06(r4, r2, r0)     // Catch:{ all -> 0x00f2 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00d3
            r0 = 32
            X.Ay7 r1 = new X.Ay7     // Catch:{ all -> 0x00f2 }
            r1.<init>(r2, r0)     // Catch:{ all -> 0x00f2 }
            java.lang.Class<X.5I6> r0 = X.AnonymousClass5I6.class
            java.lang.Object r0 = r2.A01(r0, r1)     // Catch:{ all -> 0x00f2 }
            X.5I6 r0 = (X.AnonymousClass5I6) r0     // Catch:{ all -> 0x00f2 }
            java.lang.Long r1 = r0.A00(r10)     // Catch:{ all -> 0x00f2 }
            if (r1 == 0) goto L_0x00d3
            android.content.Context r0 = X.C60960kU.A00     // Catch:{ all -> 0x00f2 }
            X.4ru r2 = X.C275754rt.A00(r0, r2)     // Catch:{ all -> 0x00f2 }
            long r0 = r1.longValue()     // Catch:{ all -> 0x00f2 }
            r2.A01(r0)     // Catch:{ all -> 0x00f2 }
        L_0x00d3:
            if (r11 == 0) goto L_0x00f0
            X.1UV r0 = r9.A0G     // Catch:{ all -> 0x00f2 }
            boolean r0 = r0.apply(r10)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00f0
            A0B(r9)     // Catch:{ all -> 0x00f2 }
            X.2FW r1 = X.2FW.A0q     // Catch:{ all -> 0x00f2 }
            X.2FW r0 = r10.A10     // Catch:{ all -> 0x00f2 }
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x00f2 }
            if (r0 == 0) goto L_0x00f0
            r9.A0S()     // Catch:{ all -> 0x00f2 }
            r9.A0U()     // Catch:{ all -> 0x00f2 }
        L_0x00f0:
            monitor-exit(r9)
            return r3
        L_0x00f2:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A0H(X.3su, boolean, boolean):X.3su");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C254703su A0I(X.2FW r7, java.lang.String r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r5 = r6.A0L     // Catch:{ all -> 0x0048 }
            int r3 = r5.size()     // Catch:{ all -> 0x0048 }
            r4 = 0
            r2 = 0
        L_0x0009:
            if (r2 >= r3) goto L_0x0023
            java.lang.Object r1 = r5.get(r2)     // Catch:{ all -> 0x0048 }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x0048 }
            X.2FW r0 = r1.A10     // Catch:{ all -> 0x0048 }
            if (r7 != r0) goto L_0x0020
            java.lang.String r0 = r1.A0f()     // Catch:{ all -> 0x0048 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0020
            goto L_0x0043
        L_0x0020:
            int r2 = r2 + 1
            goto L_0x0009
        L_0x0023:
            java.util.List r3 = r6.A0K     // Catch:{ all -> 0x0048 }
            int r2 = r3.size()     // Catch:{ all -> 0x0048 }
        L_0x0029:
            if (r4 >= r2) goto L_0x0045
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x0048 }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x0048 }
            X.2FW r0 = r1.A10     // Catch:{ all -> 0x0048 }
            if (r7 != r0) goto L_0x0040
            java.lang.String r0 = r1.A0f()     // Catch:{ all -> 0x0048 }
            boolean r0 = r8.equals(r0)     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0040
            goto L_0x0043
        L_0x0040:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x0043:
            monitor-exit(r6)
            return r1
        L_0x0045:
            r0 = 0
            monitor-exit(r6)
            return r0
        L_0x0048:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A0I(X.2FW, java.lang.String):X.3su");
    }

    public final synchronized C254703su A0J(String str) {
        C254703su r0;
        C254703su r2 = new C254703su();
        r2.A1E(str);
        List list = this.A0K;
        int binarySearch = Collections.binarySearch(list, r2, AnonymousClass48U.A04);
        if (binarySearch >= 0) {
            r0 = (C254703su) list.get(binarySearch);
        } else {
            r0 = null;
        }
        return r0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003a, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized X.C254703su A0K(java.lang.String r7) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.util.List r5 = r6.A0L     // Catch:{ all -> 0x003e }
            int r3 = r5.size()     // Catch:{ all -> 0x003e }
            r4 = 0
            r2 = 0
        L_0x0009:
            if (r2 >= r3) goto L_0x001e
            java.lang.Object r1 = r5.get(r2)     // Catch:{ all -> 0x003e }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x003e }
            java.lang.String r0 = r1.A0f()     // Catch:{ all -> 0x003e }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0039
            int r2 = r2 + 1
            goto L_0x0009
        L_0x001e:
            java.util.List r3 = r6.A0K     // Catch:{ all -> 0x003e }
            int r2 = r3.size()     // Catch:{ all -> 0x003e }
        L_0x0024:
            if (r4 >= r2) goto L_0x003b
            java.lang.Object r1 = r3.get(r4)     // Catch:{ all -> 0x003e }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x003e }
            java.lang.String r0 = r1.A0f()     // Catch:{ all -> 0x003e }
            boolean r0 = r7.equals(r0)     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x0039
            int r4 = r4 + 1
            goto L_0x0024
        L_0x0039:
            monitor-exit(r6)
            return r1
        L_0x003b:
            r0 = 0
            monitor-exit(r6)
            return r0
        L_0x003e:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A0K(java.lang.String):X.3su");
    }

    public final synchronized C242243Te A0L() {
        C242243Te r0;
        r0 = this.A0I.A01.A0s;
        if (r0 == null) {
            r0 = new C242243Te();
        }
        return r0;
    }

    public final synchronized 2Kb A0M(C242243Te r8) {
        AnonymousClass3U9 r6;
        int i;
        r6 = this.A0I;
        if (((Boolean) r6.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = r6.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i2 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock.getReadHoldCount();
                for (int i3 = 0; i3 < i; i3++) {
                    readLock.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                r6.A01.A0s = r8;
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                th = th;
                while (i2 < i) {
                    readLock.lock();
                    i2++;
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            AnonymousClass3S9 r0 = r6.A01;
            synchronized (r0) {
                try {
                    r0.A0s = r8;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        return new 2Kb(r6.BJz(), AnonymousClass05K.A0H, (List) null, (List) null, (List) null, false);
    }

    public final synchronized ArrayList A0N(boolean z) {
        ArrayList arrayList;
        arrayList = new ArrayList(new ArrayList(A05(this)));
        arrayList.addAll(new ArrayList(this.A0L));
        if (z) {
            Collections.sort(arrayList, A0Q);
        }
        return arrayList;
    }

    public final synchronized List A0O() {
        ArrayList arrayList;
        arrayList = new ArrayList();
        UserSession userSession = this.A0H;
        String str = userSession.A06;
        AnonymousClass3SZ Aue = this.A0I.Aue(str);
        if (Aue != null) {
            ArrayList arrayList2 = new ArrayList(this.A0K);
            int size = arrayList2.size();
            for (int A002 = A00(Aue, this); A002 < size; A002++) {
                C254703su r2 = (C254703su) arrayList2.get(A002);
                if (r2.A1i(0eE.A00(userSession).A00()) && ((r2.A10 != 2FW.A0q || r2.A1l(0eE.A00(userSession).A00())) && !r2.A1u.equals(str))) {
                    arrayList.add(r2);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final synchronized List A0P(C2611148h r3) {
        return AnonymousClass3S1.A03(this.A0C, new ArrayList(C2611248i.A03(r3, AnonymousClass48U.A00, new ArrayList(this.A0K))));
    }

    public final synchronized void A0S() {
        AnonymousClass3U9 r2 = this.A0I;
        C2611148h A042 = r2.A04();
        C2611148h A052 = r2.A05();
        C2611148h A012 = A01(A052, A042);
        if (!A012.equals(A052)) {
            A09(A012, r2, this.A0K);
        }
    }

    public final synchronized void A0T() {
        AnonymousClass3S9 r5;
        int i;
        String str;
        AnonymousClass3SZ Aue;
        int i2;
        AnonymousClass3U9 r6 = this.A0I;
        List list = this.A0K;
        r6.A0C((C254703su) AnonymousClass3S1.A01(this.A0N, list));
        C254703su r9 = (C254703su) AnonymousClass3S1.A01(this.A0A, list);
        AnonymousClass0eM r7 = r6.A05;
        if (((Boolean) r7.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = r6.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i3 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
                for (int i4 = 0; i4 < i2; i4++) {
                    readLock.unlock();
                }
            } else {
                i2 = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                r5 = r6.A01;
                r5.A0m = r9;
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                th = th;
                while (i3 < i2) {
                    readLock.lock();
                    i3++;
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            r5 = r6.A01;
            synchronized (r5) {
                try {
                    r5.A0m = r9;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        if (!list.isEmpty() && (Aue = r6.Aue(str)) != null && Aue.A02 != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                C254703su r2 = (C254703su) list.get(size);
                if (!r6.CbQ((str = this.A0H.A06), r2.A0g(), r2.A1u)) {
                    if (r2.A10 != 2FW.A1i) {
                        break;
                    }
                    r2.A0g();
                } else {
                    list.size();
                    break;
                }
            }
        }
        if (((Boolean) r7.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock2 = r6.A03;
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock2.readLock();
            if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock2.getReadHoldCount();
                for (int i5 = 0; i5 < i; i5++) {
                    readLock2.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock2.writeLock();
            writeLock2.lock();
            for (int i6 = 0; i6 < i; i6++) {
                readLock2.lock();
            }
            writeLock2.unlock();
        }
    }

    public final synchronized void A0U() {
        C254703su r11;
        ReentrantReadWriteLock.WriteLock writeLock;
        AnonymousClass3S9 r7;
        C254703su r0;
        int i;
        int i2;
        int i3;
        AnonymousClass3U9 r2 = this.A0I;
        C2611148h A052 = r2.A05();
        List A032 = AnonymousClass3S1.A03(this.A0C, C2611248i.A03(A052, AnonymousClass48U.A00, this.A0K));
        Long l = null;
        if (!A032.isEmpty()) {
            r11 = (C254703su) A032.get(0);
        } else {
            r11 = null;
        }
        AnonymousClass0eM r3 = r2.A05;
        if (((Boolean) r3.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock = r2.A03;
            ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
            int i4 = 0;
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i3 = reentrantReadWriteLock.getReadHoldCount();
                for (int i5 = 0; i5 < i3; i5++) {
                    readLock.unlock();
                }
            } else {
                i3 = 0;
            }
            writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                r7 = r2.A01;
                r7.A0p = r11;
                while (i4 < i3) {
                    readLock.lock();
                    i4++;
                }
                writeLock.unlock();
            } catch (Throwable th) {
                th = th;
                while (i4 < i3) {
                    readLock.lock();
                    i4++;
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            r7 = r2.A01;
            synchronized (r7) {
                try {
                    r7.A0p = r11;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            }
        }
        int size = A032.size();
        if (((Boolean) r3.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock2 = r2.A03;
            ReentrantReadWriteLock.ReadLock readLock2 = reentrantReadWriteLock2.readLock();
            int i6 = 0;
            if (reentrantReadWriteLock2.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock2.getReadHoldCount();
                for (int i7 = 0; i7 < i2; i7++) {
                    readLock2.unlock();
                }
            } else {
                i2 = 0;
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                r7.A0L = size;
                while (i6 < i2) {
                    readLock2.lock();
                    i6++;
                }
                writeLock.unlock();
            } catch (Throwable th3) {
                th = th3;
                while (i6 < i2) {
                    readLock2.lock();
                    i6++;
                }
                writeLock.unlock();
                throw th;
            }
        } else {
            synchronized (r7) {
                r7.A0L = size;
            }
        }
        List A033 = AnonymousClass3S1.A03(this.A07, A032);
        if (!A033.isEmpty()) {
            r0 = (C254703su) A033.get(0);
        } else {
            r0 = null;
        }
        r7.A0q = r0;
        List A0P2 = A0P(A052);
        if (!A0P2.isEmpty()) {
            l = Long.valueOf(((C254703su) A0P2.get(A0P2.size() - 1)).C7c());
        }
        if (((Boolean) r3.getValue()).booleanValue()) {
            ReentrantReadWriteLock reentrantReadWriteLock3 = r2.A03;
            ReentrantReadWriteLock.ReadLock readLock3 = reentrantReadWriteLock3.readLock();
            int i8 = 0;
            if (reentrantReadWriteLock3.getWriteHoldCount() == 0) {
                i = reentrantReadWriteLock3.getReadHoldCount();
                for (int i9 = 0; i9 < i; i9++) {
                    readLock3.unlock();
                }
            } else {
                i = 0;
            }
            ReentrantReadWriteLock.WriteLock writeLock2 = reentrantReadWriteLock3.writeLock();
            writeLock2.lock();
            try {
                C370838x9 r22 = r7.A0x;
                if (!(r22 == null || l == null)) {
                    r22.A00 = l.longValue();
                }
                while (i8 < i) {
                    readLock3.lock();
                    i8++;
                }
                writeLock2.unlock();
            } catch (Throwable th4) {
                th = th4;
                while (i8 < i) {
                    readLock3.lock();
                    i8++;
                }
                writeLock2.unlock();
                throw th;
            }
        } else {
            synchronized (r7) {
                C370838x9 r23 = r7.A0x;
                if (!(r23 == null || l == null)) {
                    r23.A00 = l.longValue();
                }
            }
        }
    }

    public final synchronized void A0V(String str) {
        Object obj;
        List list = this.A0K;
        if (AnonymousClass48U.A09(str, list)) {
            AnonymousClass3U9 r4 = this.A0I;
            if (str.equals(r4.C6P())) {
                String str2 = null;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((C254703su) obj).A0g() != null) {
                        break;
                    }
                }
                C254703su r1 = (C254703su) obj;
                if (r1 != null) {
                    str2 = r1.A0g();
                }
                r4.A0E(str2);
            }
            A0B(this);
            A0U();
        } else if (AnonymousClass48U.A09(str, this.A0L)) {
            A0A(this);
        }
    }

    public final synchronized boolean A0W() {
        boolean z;
        String A0g;
        if (this.A0I.CUG()) {
            z = false;
        } else {
            A06();
            Iterator it = this.A0K.iterator();
            ArrayList arrayList = new ArrayList();
            String str = null;
            while (it.hasNext()) {
                C254703su r2 = (C254703su) it.next();
                if (r2.A2P && !AnonymousClass48T.A00(r2, this.A0J, true)) {
                    arrayList.add(r2);
                    it.remove();
                    if (r2.A1S() && (A0g = r2.A0g()) != null) {
                        if (str == null || str.compareTo(A0g) < 0) {
                            str = A0g;
                        }
                    }
                }
            }
            A0B(this);
            A0U();
            if (str != null) {
                C73242PZM pzm = new C73242PZM(this, str);
                UserSession userSession = this.A0H;
                if (182.A06(0Tu.A05, userSession, 36328001620884321L)) {
                    0nY.A00().ATE(new 0vX(657395099, pzm));
                } else {
                    AnonymousClass436.A00.A00(userSession).A01().post(pzm);
                }
            }
            A0D(this, arrayList);
            z = !arrayList.isEmpty();
        }
        return z;
    }

    public final synchronized boolean A0Y(boolean z) {
        long j;
        boolean z2;
        if (z) {
            j = 0;
        } else {
            j = System.currentTimeMillis();
        }
        Iterator it = this.A0K.iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            C254703su r4 = (C254703su) it.next();
            if (r4.A1T()) {
                Long l = r4.A1L;
                if (l == null) {
                    0f9 AEf = 0wj.A01.AEf("Unexpected null timestamp for disappearing message, removed message", 20134884);
                    AEf.ABQ("message_id", r4.A0h());
                    AEf.report();
                }
                if (z || l == null || r4.A1n(Long.valueOf(j))) {
                    arrayList.add(r4);
                    it.remove();
                }
            }
        }
        if (!arrayList.isEmpty()) {
            A0B(this);
            A0U();
            A0D(this, arrayList);
            z2 = true;
        } else {
            z2 = false;
        }
        return z2;
    }

    public static int A00(AnonymousClass3SZ r2, AnonymousClass48S r3) {
        ArrayList arrayList = new ArrayList(r3.A0K);
        String str = r2.A02;
        C2610448a r0 = AnonymousClass48U.A00;
        int A002 = C2611248i.A00(r0.A00, str, r0.A01.A02, arrayList);
        int i = A002 ^ -1;
        if (A002 >= 0) {
            return A002 + 1;
        }
        return i;
    }

    public static List A05(AnonymousClass48S r3) {
        return C2611248i.A03(r3.A0I.A04(), AnonymousClass48U.A00, new ArrayList(r3.A0K));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v3, resolved type: X.3SZ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.3SZ} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A06() {
        /*
            r6 = this;
            X.3U9 r0 = r6.A0I
            java.util.HashMap r0 = r0.CCo()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r5 = r0.iterator()
            r4 = 0
            r3 = r4
        L_0x0010:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0036
            java.lang.Object r2 = r5.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            com.instagram.common.session.UserSession r0 = r6.A0H
            java.lang.String r1 = r0.A06
            java.lang.Object r0 = r2.getKey()
            boolean r1 = r1.equals(r0)
            java.lang.Object r0 = r2.getValue()
            if (r1 == 0) goto L_0x0032
            r4 = r0
            X.3SZ r4 = (X.AnonymousClass3SZ) r4
            goto L_0x0010
        L_0x0032:
            r3 = r0
            X.3SZ r3 = (X.AnonymousClass3SZ) r3
            goto L_0x0010
        L_0x0036:
            X.48T r0 = r6.A0J
            r0.A00 = r4
            r0.A01 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A06():void");
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    public static void A07(X.C2611148h r4, X.C254703su r5, X.AnonymousClass3U9 r6) {
        /*
            if (r5 == 0) goto L_0x000d
            java.lang.Object r0 = r4.A02
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.A1o(r0)
            r5 = 1
            if (r0 == 0) goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            X.0eM r0 = r6.A05
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x005b
            java.util.concurrent.locks.ReentrantReadWriteLock r1 = r6.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r4 = r1.readLock()
            int r0 = r1.getWriteHoldCount()
            r3 = 0
            if (r0 != 0) goto L_0x0036
            int r2 = r1.getReadHoldCount()
            r0 = 0
        L_0x002e:
            if (r0 >= r2) goto L_0x0037
            r4.unlock()
            int r0 = r0 + 1
            goto L_0x002e
        L_0x0036:
            r2 = 0
        L_0x0037:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r1 = r1.writeLock()
            r1.lock()
            X.3S9 r0 = r6.A01     // Catch:{ all -> 0x004e }
            r0.A2M = r5     // Catch:{ all -> 0x004e }
        L_0x0042:
            if (r3 >= r2) goto L_0x004a
            r4.lock()
            int r3 = r3 + 1
            goto L_0x0042
        L_0x004a:
            r1.unlock()
            return
        L_0x004e:
            r0 = move-exception
        L_0x004f:
            if (r3 >= r2) goto L_0x0057
            r4.lock()
            int r3 = r3 + 1
            goto L_0x004f
        L_0x0057:
            r1.unlock()
            throw r0
        L_0x005b:
            X.3S9 r1 = r6.A01
            monitor-enter(r1)
            r1.A2M = r5     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)
            return
        L_0x0062:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A07(X.48h, X.3su, X.3U9):void");
    }

    public static void A0C(AnonymousClass48S r4, ArrayList arrayList, ArrayList arrayList2) {
        C254703su r1;
        List list = r4.A0L;
        if (!list.isEmpty()) {
            ListIterator listIterator = arrayList.listIterator(arrayList.size());
            while (listIterator.hasPrevious()) {
                C254703su r2 = (C254703su) listIterator.previous();
                Comparator comparator = AnonymousClass48U.A01;
                0qQ.A0B(r2, 1);
                int binarySearch = Collections.binarySearch(list, r2, comparator);
                if (binarySearch >= 0 && (r1 = (C254703su) list.remove(binarySearch)) != null) {
                    listIterator.remove();
                    r1.A1E(r2.A0g());
                    arrayList2.add(r1);
                }
            }
        }
    }

    public static void A0D(AnonymousClass48S r7, List list) {
        AnonymousClass1Nd.A00(r7.A0H).A00(new 2Kb(r7.A0I.BJz(), AnonymousClass05K.A0G, (List) null, A03(list, true), (List) null, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0108, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void A0E(X.AnonymousClass48S r19, java.util.List r20, java.util.List r21, java.util.List r22, java.util.List r23, java.util.List r24) {
        /*
            r5 = r19
            monitor-enter(r5)
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x014d }
            r6 = r20
            r4.<init>(r6)     // Catch:{ all -> 0x014d }
            com.instagram.common.session.UserSession r3 = r5.A0H     // Catch:{ all -> 0x014d }
            X.3U9 r0 = r5.A0I     // Catch:{ all -> 0x014d }
            com.instagram.model.direct.DirectThreadKey r20 = r0.BJz()     // Catch:{ all -> 0x014d }
            r0 = 0
            X.0qQ.A0B(r3, r0)     // Catch:{ all -> 0x014d }
            r19 = 1
            r0 = 3
            r10 = r21
            X.0qQ.A0B(r10, r0)     // Catch:{ all -> 0x014d }
            int r9 = r10.size()     // Catch:{ all -> 0x014d }
            r11 = 0
            r8 = 0
        L_0x0024:
            int r0 = r4.size()     // Catch:{ all -> 0x014d }
            r7 = r22
            r1 = r23
            if (r11 >= r0) goto L_0x0109
            if (r8 >= r9) goto L_0x0109
            java.lang.Object r14 = r4.get(r11)     // Catch:{ all -> 0x014d }
            X.3su r14 = (X.C254703su) r14     // Catch:{ all -> 0x014d }
            java.lang.Object r12 = r10.get(r8)     // Catch:{ all -> 0x014d }
            X.3su r12 = (X.C254703su) r12     // Catch:{ all -> 0x014d }
            java.lang.String r15 = r14.A0g()     // Catch:{ all -> 0x014d }
            java.lang.String r13 = "Required value was null."
            if (r15 == 0) goto L_0x0103
            java.lang.String r2 = r12.A0g()     // Catch:{ all -> 0x014d }
            if (r2 == 0) goto L_0x00fd
            java.util.Comparator r0 = X.AnonymousClass48V.A01     // Catch:{ all -> 0x014d }
            int r0 = r0.compare(r15, r2)     // Catch:{ all -> 0x014d }
            java.lang.String r13 = "TTLC message "
            java.lang.String r2 = "messageIsDirectlyCreatedFromEBResponse"
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r14.equals(r12)     // Catch:{ all -> 0x014d }
            if (r0 != 0) goto L_0x00f7
            X.N4L r0 = r12.A0D     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00a2
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x014d }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x014d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x014d }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00a2
            long r17 = r14.C7c()     // Catch:{ all -> 0x014d }
            long r15 = r12.C7c()     // Catch:{ all -> 0x014d }
            int r0 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x0095
            X.0Tu r7 = X.0Tu.A05     // Catch:{ all -> 0x014d }
            r0 = 2342161901217651410(0x208107d700881ad2, double:4.064646393581973E-152)
            boolean r0 = X.182.A06(r7, r3, r0)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0095
            java.lang.String r1 = r12.A0f()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = " is skipped since cache is newer "
            java.lang.String r0 = X.002.A0g(r13, r1, r0)     // Catch:{ all -> 0x014d }
            X.0KC.A0E(r2, r0)     // Catch:{ all -> 0x014d }
            goto L_0x0024
        L_0x0095:
            java.lang.String r1 = r12.A0f()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = " will replace cached message"
            java.lang.String r0 = X.002.A0g(r13, r1, r0)     // Catch:{ all -> 0x014d }
            X.0KC.A0E(r2, r0)     // Catch:{ all -> 0x014d }
        L_0x00a2:
            X.3t0 r0 = X.AnonymousClass3t7.A00(r20)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00b5
            X.3t0 r0 = X.C300965yF.A02(r0)     // Catch:{ all -> 0x014d }
        L_0x00ac:
            r14.A10(r3, r12, r0)     // Catch:{ all -> 0x014d }
            r0 = r24
            r0.add(r14)     // Catch:{ all -> 0x014d }
            goto L_0x00f7
        L_0x00b5:
            r0 = 0
            goto L_0x00ac
        L_0x00b7:
            if (r0 >= 0) goto L_0x00c2
            java.lang.Object r0 = r4.remove(r11)     // Catch:{ all -> 0x014d }
            r1.add(r0)     // Catch:{ all -> 0x014d }
            goto L_0x0024
        L_0x00c2:
            X.3t0 r0 = X.AnonymousClass3t7.A00(r20)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00f5
            X.3t0 r0 = X.C300965yF.A02(r0)     // Catch:{ all -> 0x014d }
        L_0x00cc:
            r12.A11(r3, r0)     // Catch:{ all -> 0x014d }
            r4.add(r11, r12)     // Catch:{ all -> 0x014d }
            X.N4L r0 = r12.A0D     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r1 = r0.A02     // Catch:{ all -> 0x014d }
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch:{ all -> 0x014d }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r19)     // Catch:{ all -> 0x014d }
            boolean r0 = X.0qQ.A0K(r1, r0)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x00f1
            java.lang.String r1 = r12.A0f()     // Catch:{ all -> 0x014d }
            java.lang.String r0 = " is not in cache, may need to double check if this message is deleted locally or not"
            java.lang.String r0 = X.002.A0g(r13, r1, r0)     // Catch:{ all -> 0x014d }
            X.0KC.A0E(r2, r0)     // Catch:{ all -> 0x014d }
        L_0x00f1:
            r7.add(r12)     // Catch:{ all -> 0x014d }
            goto L_0x00f7
        L_0x00f5:
            r0 = 0
            goto L_0x00cc
        L_0x00f7:
            int r11 = r11 + 1
            int r8 = r8 + 1
            goto L_0x0024
        L_0x00fd:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x014d }
            r0.<init>(r13)     // Catch:{ all -> 0x014d }
            goto L_0x0108
        L_0x0103:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x014d }
            r0.<init>(r13)     // Catch:{ all -> 0x014d }
        L_0x0108:
            throw r0     // Catch:{ all -> 0x014d }
        L_0x0109:
            int r0 = r4.size()     // Catch:{ all -> 0x014d }
            if (r11 >= r0) goto L_0x0119
            java.util.List r0 = r4.subList(r11, r0)     // Catch:{ all -> 0x014d }
            r1.addAll(r0)     // Catch:{ all -> 0x014d }
            r0.clear()     // Catch:{ all -> 0x014d }
        L_0x0119:
            if (r8 >= r9) goto L_0x0145
            java.util.List r0 = r10.subList(r8, r9)     // Catch:{ all -> 0x014d }
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x014d }
        L_0x0123:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0145
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x014d }
            X.3su r1 = (X.C254703su) r1     // Catch:{ all -> 0x014d }
            X.3t0 r0 = X.AnonymousClass3t7.A00(r20)     // Catch:{ all -> 0x014d }
            if (r0 == 0) goto L_0x0143
            X.3t0 r0 = X.C300965yF.A02(r0)     // Catch:{ all -> 0x014d }
        L_0x0139:
            r1.A11(r3, r0)     // Catch:{ all -> 0x014d }
            r7.add(r1)     // Catch:{ all -> 0x014d }
            r4.add(r1)     // Catch:{ all -> 0x014d }
            goto L_0x0123
        L_0x0143:
            r0 = 0
            goto L_0x0139
        L_0x0145:
            r6.clear()     // Catch:{ all -> 0x014d }
            r6.addAll(r4)     // Catch:{ all -> 0x014d }
            monitor-exit(r5)
            return
        L_0x014d:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A0E(X.48S, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }

    public final void A0Q() {
        AnonymousClass3S9 r5;
        C241973Sc r0;
        AnonymousClass3U9 r6 = this.A0I;
        long j = 0;
        if (((Boolean) r6.A05.getValue()).booleanValue()) {
            ReentrantReadWriteLock.ReadLock readLock = r6.A03.readLock();
            readLock.lock();
            try {
                r5 = r6.A01;
                C254703su r02 = r5.A0h;
                if (r02 != null) {
                    j = r02.C7c();
                }
            } finally {
                readLock.unlock();
            }
        } else {
            r5 = r6.A01;
            synchronized (r5) {
                C254703su r03 = r5.A0h;
                if (r03 != null) {
                    j = r03.C7c();
                }
            }
        }
        if (!r6.CUG()) {
            UserSession userSession = this.A0H;
            AnonymousClass3SZ Aue = r6.Aue(userSession.A06);
            if (!(Aue == null || (r0 = Aue.A02) == null)) {
                j = Math.max(j, r0.A00);
            }
            if (!(r6.Axk() == null || r6.Axk().A05 == null)) {
                0Tu r2 = 0Tu.A05;
                if (182.A06(r2, userSession, 2342163327141290271L) || 182.A06(r2, userSession, 36320317928513829L)) {
                    j = Math.max(j, TimeUnit.MILLISECONDS.toMicros(r6.Axk().A05.longValue()));
                }
            }
        }
        if (j > r6.BKd()) {
            r5.A0N = j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0060, code lost:
        if (r0 == false) goto L_0x0062;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008e, code lost:
        if (r1.A10 != X.2FW.A0G) goto L_0x0090;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R() {
        /*
            r14 = this;
            java.util.HashSet r7 = new java.util.HashSet
            r7.<init>()
            r1 = 1
            java.util.ArrayList r10 = r14.A0N(r1)
            X.3U9 r6 = r14.A0I
            java.util.List r0 = r6.BRV()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r0)
            com.instagram.common.session.UserSession r0 = r14.A0H
            java.lang.String r0 = r0.A06
            r9.remove(r0)
            java.util.HashMap r8 = r6.CCo()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            boolean r13 = r6.CUG()
            int r4 = r10.size()
            int r4 = r4 - r1
        L_0x002e:
            if (r4 < 0) goto L_0x00b6
            boolean r0 = r9.isEmpty()
            if (r0 != 0) goto L_0x00b6
            java.lang.Object r3 = r10.get(r4)
            X.3su r3 = (X.C254703su) r3
            java.util.Iterator r12 = r9.iterator()
        L_0x0040:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x00b2
            java.lang.Object r2 = r12.next()
            java.lang.Object r1 = r8.get(r2)
            X.3Sa r1 = (X.C241953Sa) r1
            java.lang.String r11 = r3.A0g()
            if (r11 == 0) goto L_0x0040
            if (r1 == 0) goto L_0x0040
            java.lang.String r0 = r3.A1u
            boolean r0 = r0.equals(r2)
            if (r13 == 0) goto L_0x00af
            if (r0 != 0) goto L_0x0094
        L_0x0062:
            java.lang.String r1 = r1.A02
            boolean r0 = r1.equals(r11)
            if (r0 != 0) goto L_0x0072
            java.util.Comparator r0 = X.AnonymousClass48V.A01
            int r0 = r0.compare(r1, r11)
            if (r0 < 0) goto L_0x0040
        L_0x0072:
            if (r13 != 0) goto L_0x0094
            int r1 = r4 + 1
            int r0 = r10.size()
            if (r1 >= r0) goto L_0x0094
            java.lang.Object r1 = r10.get(r1)
            X.3su r1 = (X.C254703su) r1
            java.lang.String r0 = r1.A1u
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0094
            X.2FW r1 = r1.A10
            X.2FW r0 = X.2FW.A0G
            if (r1 == r0) goto L_0x0094
        L_0x0090:
            r12.remove()
            goto L_0x0040
        L_0x0094:
            boolean r0 = r5.containsKey(r3)
            if (r0 != 0) goto L_0x00a2
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            r5.put(r3, r0)
        L_0x00a2:
            java.lang.Object r0 = r5.get(r3)
            r0.getClass()
            java.util.Set r0 = (java.util.Set) r0
            r0.add(r2)
            goto L_0x0090
        L_0x00af:
            if (r0 != 0) goto L_0x0040
            goto L_0x0062
        L_0x00b2:
            int r4 = r4 + -1
            goto L_0x002e
        L_0x00b6:
            java.util.Set r0 = r5.entrySet()
            java.util.Iterator r5 = r0.iterator()
        L_0x00be:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00e7
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r0 = r1.getKey()
            X.3su r0 = (X.C254703su) r0
            long r3 = r0.C7c()
            java.lang.String r2 = r0.A0g()
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            X.48n r0 = new X.48n
            r0.<init>(r2, r1, r3)
            r7.add(r0)
            goto L_0x00be
        L_0x00e7:
            java.util.Set r1 = java.util.Collections.unmodifiableSet(r7)
            X.3S9 r0 = r6.A01
            r0.A2G = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A0R():void");
    }

    public final synchronized boolean A0X() {
        boolean z;
        synchronized (this) {
            AnonymousClass3U9 r2 = this.A0I;
            ArrayList A022 = A02(r2, this, 20);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            A0E(this, this.A0K, A022, arrayList, arrayList2, arrayList3);
            A0B(this);
            A0U();
            AnonymousClass1Nd.A00(this.A0H).A00(new 2Kb(r2.BJz(), AnonymousClass05K.A0G, arrayList, A03(arrayList2, true), arrayList3, false));
            z = !arrayList2.isEmpty();
        }
        return z;
    }

    public AnonymousClass48S(UserSession userSession, AnonymousClass3U9 r6, List list) {
        ArrayList arrayList = new ArrayList();
        this.A0K = arrayList;
        this.A0H = userSession;
        this.A0I = r6;
        this.A0J = new AnonymousClass48T(userSession.A06, new 1Ue(Boolean.valueOf(r6.Cbs())));
        if (list != null) {
            arrayList.addAll(list);
            Collections.sort(arrayList, AnonymousClass48U.A04);
        }
        A0B(this);
        A0U();
    }

    public static C2611148h A01(C2611148h r3, C2611148h r4) {
        if (r3.A01() || r4.A01()) {
            return r3;
        }
        Comparator comparator = r3.A00.A02;
        if (comparator.compare(r3.A01, r4.A02) <= 0 || comparator.compare(r4.A01, r3.A02) <= 0) {
            return r3;
        }
        return r3.A00(r4);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v0, resolved type: X.3su} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v1, resolved type: X.3su} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v51, resolved type: X.3su} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: X.3su} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0A(X.AnonymousClass48S r12) {
        /*
            java.util.List r1 = A05(r12)
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.lang.Object r11 = X.00k.A0L(r1)
            X.3su r11 = (X.C254703su) r11
            java.util.List r2 = r12.A0L
            X.0qQ.A0B(r2, r0)
            java.lang.Object r9 = X.00k.A0L(r2)
            X.3su r9 = (X.C254703su) r9
            java.util.List r1 = A05(r12)
            X.1UV r0 = r12.A0F
            java.lang.Object r10 = X.AnonymousClass3S1.A01(r0, r1)
            X.3su r10 = (X.C254703su) r10
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x002d:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x006a
            java.lang.Object r7 = r1.previous()
            r0 = r7
            X.3su r0 = (X.C254703su) r0
            java.lang.Long r0 = r0.A1Q
            if (r0 != 0) goto L_0x002d
        L_0x003e:
            java.util.List r1 = A05(r12)
            X.1UV r0 = r12.A0P
            java.lang.Object r6 = X.AnonymousClass3S1.A01(r0, r1)
            X.3su r6 = (X.C254703su) r6
            if (r9 == 0) goto L_0x006c
            java.util.Iterator r8 = r2.iterator()
        L_0x0050:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r5 = r8.next()
            X.3su r5 = (X.C254703su) r5
            long r3 = r5.C7c()
            long r1 = r9.C7c()
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0050
            r9 = r5
            goto L_0x0050
        L_0x006a:
            r7 = 0
            goto L_0x003e
        L_0x006c:
            X.3U9 r8 = r12.A0I
            r8.A09(r11)
            r8.A0A(r10)
            goto L_0x009f
        L_0x0075:
            X.3U9 r8 = r12.A0I
            java.util.Comparator r1 = X.AnonymousClass48U.A05
            r0 = 2
            X.0qQ.A0B(r1, r0)
            if (r11 == 0) goto L_0x00d8
            int r0 = r1.compare(r11, r9)
            if (r0 < 0) goto L_0x00d8
        L_0x0085:
            r8.A09(r11)
            if (r10 == 0) goto L_0x00d6
            if (r7 == 0) goto L_0x0092
            int r0 = r1.compare(r10, r7)
            if (r0 < 0) goto L_0x00d6
        L_0x0092:
            X.3su r10 = (X.C254703su) r10
            r8.A0A(r10)
            if (r6 == 0) goto L_0x00d4
            int r0 = r1.compare(r6, r9)
            if (r0 < 0) goto L_0x00d4
        L_0x009f:
            r8.A0B(r6)
            java.util.List r7 = r12.A0K
            X.1UV r0 = r12.A0B
            java.lang.Object r5 = X.AnonymousClass3S1.A01(r0, r7)
            X.3su r5 = (X.C254703su) r5
            X.0eM r9 = r8.A05
            java.lang.Object r0 = r9.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00f7
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r8.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r4.readLock()
            int r0 = r4.getWriteHoldCount()
            r2 = 0
            if (r0 != 0) goto L_0x00da
            int r1 = r4.getReadHoldCount()
            r0 = 0
        L_0x00cc:
            if (r0 >= r1) goto L_0x00db
            r3.unlock()
            int r0 = r0 + 1
            goto L_0x00cc
        L_0x00d4:
            r6 = r9
            goto L_0x009f
        L_0x00d6:
            r10 = r7
            goto L_0x0092
        L_0x00d8:
            r11 = r9
            goto L_0x0085
        L_0x00da:
            r1 = 0
        L_0x00db:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.writeLock()
            r0.lock()
            X.3S9 r6 = r8.A01     // Catch:{ all -> 0x00ee }
            r6.A0n = r5     // Catch:{ all -> 0x00ee }
        L_0x00e6:
            if (r2 >= r1) goto L_0x00fe
            r3.lock()
            int r2 = r2 + 1
            goto L_0x00e6
        L_0x00ee:
            r4 = move-exception
        L_0x00ef:
            if (r2 >= r1) goto L_0x01eb
            r3.lock()
            int r2 = r2 + 1
            goto L_0x00ef
        L_0x00f7:
            X.3S9 r6 = r8.A01
            monitor-enter(r6)
            r6.A0n = r5     // Catch:{ all -> 0x020d }
            monitor-exit(r6)
            goto L_0x0101
        L_0x00fe:
            r0.unlock()
        L_0x0101:
            java.util.List r1 = A05(r12)
            X.1UV r0 = r12.A04
            java.lang.Object r5 = X.AnonymousClass3S1.A01(r0, r1)
            X.3su r5 = (X.C254703su) r5
            java.lang.Object r0 = r9.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x014f
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r8.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r4.readLock()
            int r0 = r4.getWriteHoldCount()
            r2 = 0
            if (r0 != 0) goto L_0x0133
            int r1 = r4.getReadHoldCount()
            r0 = 0
        L_0x012b:
            if (r0 >= r1) goto L_0x0134
            r3.unlock()
            int r0 = r0 + 1
            goto L_0x012b
        L_0x0133:
            r1 = 0
        L_0x0134:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.writeLock()
            r0.lock()
            r6.A0k = r5     // Catch:{ all -> 0x013e }
            goto L_0x0147
        L_0x013e:
            r4 = move-exception
        L_0x013f:
            if (r2 >= r1) goto L_0x01eb
            r3.lock()
            int r2 = r2 + 1
            goto L_0x013f
        L_0x0147:
            if (r2 >= r1) goto L_0x0154
            r3.lock()
            int r2 = r2 + 1
            goto L_0x0147
        L_0x014f:
            monitor-enter(r6)
            r6.A0k = r5     // Catch:{ all -> 0x020d }
            monitor-exit(r6)
            goto L_0x0157
        L_0x0154:
            r0.unlock()
        L_0x0157:
            X.1UV r0 = r12.A03
            java.lang.Object r5 = X.AnonymousClass3S1.A01(r0, r7)
            X.3su r5 = (X.C254703su) r5
            java.lang.Object r0 = r9.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01a1
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r8.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r4.readLock()
            int r0 = r4.getWriteHoldCount()
            r2 = 0
            if (r0 != 0) goto L_0x0185
            int r1 = r4.getReadHoldCount()
            r0 = 0
        L_0x017d:
            if (r0 >= r1) goto L_0x0186
            r3.unlock()
            int r0 = r0 + 1
            goto L_0x017d
        L_0x0185:
            r1 = 0
        L_0x0186:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.writeLock()
            r0.lock()
            r6.A0i = r5     // Catch:{ all -> 0x0190 }
            goto L_0x0199
        L_0x0190:
            r4 = move-exception
        L_0x0191:
            if (r2 >= r1) goto L_0x01eb
            r3.lock()
            int r2 = r2 + 1
            goto L_0x0191
        L_0x0199:
            if (r2 >= r1) goto L_0x01a6
            r3.lock()
            int r2 = r2 + 1
            goto L_0x0199
        L_0x01a1:
            monitor-enter(r6)
            r6.A0i = r5     // Catch:{ all -> 0x020d }
            monitor-exit(r6)
            goto L_0x01a9
        L_0x01a6:
            r0.unlock()
        L_0x01a9:
            X.1UV r0 = r12.A0E
            java.lang.Object r5 = X.AnonymousClass3S1.A01(r0, r7)
            X.3su r5 = (X.C254703su) r5
            java.lang.Object r0 = r9.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01f7
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r8.A03
            java.util.concurrent.locks.ReentrantReadWriteLock$ReadLock r3 = r4.readLock()
            int r0 = r4.getWriteHoldCount()
            r2 = 0
            if (r0 != 0) goto L_0x01d7
            int r1 = r4.getReadHoldCount()
            r0 = 0
        L_0x01cf:
            if (r0 >= r1) goto L_0x01d8
            r3.unlock()
            int r0 = r0 + 1
            goto L_0x01cf
        L_0x01d7:
            r1 = 0
        L_0x01d8:
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r0 = r4.writeLock()
            r0.lock()
            r6.A0o = r5     // Catch:{ all -> 0x01e2 }
            goto L_0x01ef
        L_0x01e2:
            r4 = move-exception
        L_0x01e3:
            if (r2 >= r1) goto L_0x01eb
            r3.lock()
            int r2 = r2 + 1
            goto L_0x01e3
        L_0x01eb:
            r0.unlock()
            throw r4
        L_0x01ef:
            if (r2 >= r1) goto L_0x01fc
            r3.lock()
            int r2 = r2 + 1
            goto L_0x01ef
        L_0x01f7:
            monitor-enter(r6)
            r6.A0o = r5     // Catch:{ all -> 0x020d }
            monitor-exit(r6)
            goto L_0x01ff
        L_0x01fc:
            r0.unlock()
        L_0x01ff:
            X.1UV r0 = r12.A05
            java.lang.Object r0 = X.AnonymousClass3S1.A01(r0, r7)
            X.3su r0 = (X.C254703su) r0
            r6.A0l = r0
            r12.A0Q()
            return
        L_0x020d:
            r4 = move-exception
            monitor-exit(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass48S.A0A(X.48S):void");
    }

    public static void A0B(AnonymousClass48S r0) {
        A0A(r0);
        r0.A0T();
        r0.A0R();
    }
}
