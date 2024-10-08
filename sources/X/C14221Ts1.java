package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;

/* renamed from: X.Ts1  reason: case insensitive filesystem */
public final class C14221Ts1 extends C252233om {
    public C337247fx A00;
    public final long A01;
    public final long A02;
    public final Handler A03 = new C14697U1x(Looper.getMainLooper(), this, 9);
    public final C14223Ts3 A04;
    public final C14222Ts2 A05;
    public final C337287g2 A06;
    public final Deque A07 = new ArrayDeque();
    public final boolean A08;
    public final UserSession A09;
    public final Integer A0A;

    public C14221Ts1(UserSession userSession, C337247fx r5, C14223Ts3 ts3, C337287g2 r7, Integer num, long j, long j2, boolean z, boolean z2) {
        0qQ.A0B(num, 4);
        this.A00 = r5;
        this.A0A = num;
        this.A02 = j;
        this.A09 = userSession;
        this.A06 = r7;
        this.A05 = new C14222Ts2(z2);
        this.A08 = z;
        this.A01 = j2;
        this.A04 = ts3;
    }

    public final void A03(String str) {
        0qQ.A0B(str, 0);
        C15050ULg uLg = new C15050ULg(str);
        if (!this.A04.A01.containsKey(uLg)) {
            Deque deque = this.A07;
            if (!deque.contains(uLg)) {
                deque.add(uLg);
                Handler handler = this.A03;
                if (!handler.hasMessages(1)) {
                    handler.sendEmptyMessageDelayed(1, this.A02);
                }
            }
        }
    }

    public final boolean A06(String str) {
        0qQ.A0B(str, 0);
        return A05(new C15050ULg(str));
    }

    public static final void A00(C15050ULg uLg, C14221Ts1 ts1) {
        1GP AMw;
        if (uLg != null && ts1.A00 != null) {
            C14223Ts3 ts3 = ts1.A04;
            String A11 = DbT.A11(uLg, ts1.A05.A02);
            C14493TxF txF = new C14493TxF(uLg, ts1);
            C337267fz r2 = ts3.A00;
            if (r2 != null) {
                if (!r2.Cch() || !0qQ.A0K(uLg.A00, "fbsearch/ig_typeahead/")) {
                    AMw = r2.AMw(uLg, A11);
                    AMw.A00 = new C14500TxM(uLg, txF, ts3);
                } else {
                    AMw = r2.AMy(uLg, A11);
                    if (AMw != null) {
                        AMw.A02(new C14499TxL(uLg, txF, ts3));
                    } else {
                        return;
                    }
                }
                ts3.A01.put(uLg, AMw);
                AnonymousClass4D6 Bpf = r2.Bpf();
                if (Bpf != null) {
                    Bpf.schedule(AMw, 879992394, 1, true, true);
                } else {
                    1ES.A05(AMw, 879992394, 1, true, true);
                }
            }
        }
    }

    public static final void A01(C14221Ts1 ts1, String str) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            Deque deque = ts1.A07;
            if (!deque.isEmpty()) {
                C15050ULg uLg = (C15050ULg) deque.removeFirst();
                String str2 = uLg.A00;
                if (str2 != null && !str2.equals(str)) {
                    arrayList.add(uLg);
                } else if (ts1.A00 != null) {
                    A00(uLg, ts1);
                }
            } else {
                deque.addAll(arrayList);
                return;
            }
        }
    }

    public final void A02() {
        this.A07.clear();
        Iterator A0u = C13989Tnp.A0u(this.A04.A01);
        while (A0u.hasNext()) {
            ((AnonymousClass11X) A0u.next()).onCancel();
        }
    }

    public final boolean A04() {
        if ((!this.A04.A01.isEmpty()) || !this.A07.isEmpty()) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d1, code lost:
        if (r2.hasMessages(1) == false) goto L_0x00d3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05(X.C15050ULg r12) {
        /*
            r11 = this;
            java.util.Deque r4 = r11.A07
            monitor-enter(r4)
            X.Ts3 r0 = r11.A04     // Catch:{ all -> 0x00e8 }
            java.util.LinkedHashMap r3 = r0.A01     // Catch:{ all -> 0x00e8 }
            boolean r0 = r3.containsKey(r12)     // Catch:{ all -> 0x00e8 }
            r5 = 1
            r2 = 0
            if (r0 != 0) goto L_0x00d9
            X.7g2 r0 = r11.A06     // Catch:{ all -> 0x00e8 }
            X.9P5 r0 = r0.BiW(r12)     // Catch:{ all -> 0x00e8 }
            java.lang.Integer r1 = r0.A01     // Catch:{ all -> 0x00e8 }
            java.lang.Integer r0 = X.AnonymousClass05K.A0C     // Catch:{ all -> 0x00e8 }
            if (r1 == r0) goto L_0x00d9
            boolean r0 = r4.contains(r12)     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00d9
            java.lang.Integer r0 = r11.A0A     // Catch:{ all -> 0x00e8 }
            int r0 = r0.intValue()     // Catch:{ all -> 0x00e8 }
            if (r0 == r2) goto L_0x00a8
            r9 = 3
            r1 = 2
            if (r0 == r5) goto L_0x003c
            if (r0 == r1) goto L_0x00c8
            r4.add(r12)     // Catch:{ all -> 0x00e8 }
            android.os.Handler r2 = r11.A03     // Catch:{ all -> 0x00e8 }
            boolean r0 = r2.hasMessages(r5)     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00e6
            goto L_0x00d3
        L_0x003c:
            android.os.Handler r8 = r11.A03     // Catch:{ all -> 0x00e8 }
            r8.removeMessages(r5)     // Catch:{ all -> 0x00e8 }
            java.lang.String r6 = r12.A00     // Catch:{ all -> 0x00e8 }
            java.lang.String r10 = "fbsearch/keyword_typeahead/"
            boolean r0 = X.0qQ.A0K(r6, r10)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x0076
            r8.removeMessages(r9)     // Catch:{ all -> 0x00e8 }
        L_0x004e:
            X.7fx r3 = r11.A00     // Catch:{ all -> 0x00e8 }
            if (r3 == 0) goto L_0x0082
            java.util.Iterator r2 = r4.iterator()     // Catch:{ all -> 0x00e8 }
            X.0qQ.A07(r2)     // Catch:{ all -> 0x00e8 }
        L_0x0059:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00e8 }
            X.ULg r1 = (X.C15050ULg) r1     // Catch:{ all -> 0x00e8 }
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.equals(r6)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x0059
            r4.remove(r1)     // Catch:{ all -> 0x00e8 }
            r3.DeG(r1)     // Catch:{ all -> 0x00e8 }
            goto L_0x0059
        L_0x0076:
            java.lang.String r0 = "fbsearch/ig_typeahead/"
            boolean r0 = X.0qQ.A0K(r6, r0)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x004e
            r8.removeMessages(r1)     // Catch:{ all -> 0x00e8 }
            goto L_0x004e
        L_0x0082:
            r4.add(r12)     // Catch:{ all -> 0x00e8 }
            long r2 = r11.A01     // Catch:{ all -> 0x00e8 }
            long r0 = r11.A02     // Catch:{ all -> 0x00e8 }
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x008f
            r2 = 1
            goto L_0x00a4
        L_0x008f:
            java.lang.String r7 = r12.A00     // Catch:{ all -> 0x00e8 }
            boolean r6 = X.0qQ.A0K(r7, r10)     // Catch:{ all -> 0x00e8 }
            if (r6 == 0) goto L_0x009b
            r8.sendEmptyMessageDelayed(r9, r2)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x009b:
            java.lang.String r2 = "fbsearch/ig_typeahead/"
            boolean r2 = X.0qQ.A0K(r7, r2)     // Catch:{ all -> 0x00e8 }
            if (r2 == 0) goto L_0x00e6
            r2 = 2
        L_0x00a4:
            r8.sendEmptyMessageDelayed(r2, r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x00a8:
            android.os.Handler r2 = r11.A03     // Catch:{ all -> 0x00e8 }
            r2.removeMessages(r5)     // Catch:{ all -> 0x00e8 }
            X.7fx r1 = r11.A00     // Catch:{ all -> 0x00e8 }
            if (r1 == 0) goto L_0x00c4
        L_0x00b1:
            boolean r0 = r4.isEmpty()     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00c4
            java.lang.Object r0 = r4.pop()     // Catch:{ all -> 0x00e8 }
            X.0qQ.A07(r0)     // Catch:{ all -> 0x00e8 }
            X.ULg r0 = (X.C15050ULg) r0     // Catch:{ all -> 0x00e8 }
            r1.DeG(r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00b1
        L_0x00c4:
            r4.add(r12)     // Catch:{ all -> 0x00e8 }
            goto L_0x00d3
        L_0x00c8:
            r4.add(r12)     // Catch:{ all -> 0x00e8 }
            android.os.Handler r2 = r11.A03     // Catch:{ all -> 0x00e8 }
            boolean r0 = r2.hasMessages(r5)     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00e6
        L_0x00d3:
            long r0 = r11.A02     // Catch:{ all -> 0x00e8 }
            r2.sendEmptyMessageDelayed(r5, r0)     // Catch:{ all -> 0x00e8 }
            goto L_0x00e6
        L_0x00d9:
            boolean r0 = r3.containsKey(r12)     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00e6
            boolean r0 = r4.contains(r12)     // Catch:{ all -> 0x00e8 }
            if (r0 != 0) goto L_0x00e6
            r5 = 0
        L_0x00e6:
            monitor-exit(r4)
            return r5
        L_0x00e8:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14221Ts1.A05(X.ULg):boolean");
    }

    public final void onDestroy() {
        this.A03.removeCallbacksAndMessages((Object) null);
        this.A00 = null;
    }

    public final void onDestroyView() {
        this.A06.clear();
        A02();
    }
}
