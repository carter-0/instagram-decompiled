package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.2xb  reason: invalid class name and case insensitive filesystem */
public final class C234282xb {
    public C254143s0 A00;
    public final long A01;
    public final C234292xc A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final AnonymousClass2xX A05;
    public final List A06;
    public final Map A07;
    public final AnonymousClass0eM A08 = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 27));
    public final AnonymousClass0eM A09 = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 28));
    public final boolean A0A;
    public final Context A0B;
    public final C231332rR A0C;
    public final C232722uK A0D;
    public final List A0E;

    public C234282xb(Context context, UserSession userSession, AnonymousClass4DU r18, C231332rR r19, AnonymousClass2xX r20, C232722uK r21, String str, List list, Map map) {
        0qQ.A0B(str, 7);
        this.A07 = map;
        this.A0E = list;
        this.A0C = r19;
        AnonymousClass4DU r7 = r18;
        this.A04 = r7;
        UserSession userSession2 = userSession;
        this.A03 = userSession2;
        Context context2 = context;
        this.A0B = context2;
        this.A05 = r20;
        C232722uK r3 = r21;
        this.A0D = r3;
        this.A01 = 182.A01(0Tu.A06, userSession2, 36594362616317632L);
        boolean A062 = 182.A06(0Tu.A05, userSession2, 36318196210931695L);
        this.A0A = A062;
        ArrayList arrayList = new ArrayList();
        this.A06 = arrayList;
        this.A02 = new C234292xc(context2, userSession2);
        if (A062) {
            arrayList.add(r3);
            String str2 = r3.A0N;
            while (this.A06.size() < 3) {
                List list2 = this.A06;
                String str3 = str2;
                if (str2 == null) {
                    str3 = "";
                }
                list2.add(new C232722uK(context2, userSession2, r7, (C228412ld) null, str3, false, true, true, false, false));
            }
        }
    }

    public final AnonymousClass3V3 A00(1Xj r4, C238133Ar r5) {
        if (r5 == null) {
            return null;
        }
        C254143s0 r0 = this.A00;
        if (r0 == null) {
            C253923rd r1 = C253923rd.A01;
            ViewGroup CEd = r5.CEd();
            0qQ.A07(CEd);
            r0 = C253923rd.A06(CEd, r4, r1);
            this.A00 = r0;
        }
        AnonymousClass3V3 A0A2 = C253923rd.A0A(r4, r0);
        if (A0A2 == null) {
            this.A00 = null;
        }
        return A0A2;
    }

    public final boolean A03(1Xj r3) {
        0qQ.A0B(r3, 0);
        AnonymousClass4HX r0 = (AnonymousClass4HX) this.A07.get(r3);
        if (r0 != null) {
            Object obj = r0.A03;
            if (obj instanceof AnonymousClass3Y6) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego");
                if (!((AnonymousClass3Y6) obj).A0O) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean A04(1Xj r4) {
        Object obj;
        0qQ.A0B(r4, 0);
        AnonymousClass4HX r0 = (AnonymousClass4HX) this.A07.get(r4);
        if (r0 != null) {
            obj = r0.A03;
        } else {
            obj = null;
        }
        if (!(obj instanceof AnonymousClass3Y6) || ((AnonymousClass3Y6) obj).A03 != ClipsIFUType.SUGGESTED) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0079, code lost:
        r0 = r3.A05.A08(r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007f, code lost:
        if (r0 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r10 = r0.A01;
        r4 = r3.A0C.BQr(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r2 = r5.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0091, code lost:
        if (r2.hasNext() == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        r7 = r2.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (((X.C232722uK) r7).A0J() != X.AnonymousClass3OB.IDLE) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r7 = (X.C232722uK) r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00a4, code lost:
        if (r7 == null) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00aa, code lost:
        if (r4.A0p() == false) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ac, code lost:
        r12 = r4.getPosition();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b0, code lost:
        r7.A0R(r8, r3.A04, r10, new X.C263414Lx(false, false, false, X.C263404Lw.A00(r3.A03)), r12, r4.A03, r4.A01(), r4.A22, r4.A2H);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00cf, code lost:
        r12 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d1, code lost:
        r7 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0042, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void A01() {
        /*
            r17 = this;
            r3 = r17
            monitor-enter(r3)
            java.util.Map r0 = r3.A07     // Catch:{ all -> 0x00d5 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x00d5 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x00d5 }
            r5.<init>()     // Catch:{ all -> 0x00d5 }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x0012:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x003e
            java.lang.Object r2 = r4.next()     // Catch:{ all -> 0x00d5 }
            r1 = r2
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ all -> 0x00d5 }
            java.lang.Object r0 = r1.getKey()     // Catch:{ all -> 0x00d5 }
            X.1Xj r0 = (X.1Xj) r0     // Catch:{ all -> 0x00d5 }
            java.lang.Object r1 = r1.getValue()     // Catch:{ all -> 0x00d5 }
            X.4HX r1 = (X.AnonymousClass4HX) r1     // Catch:{ all -> 0x00d5 }
            boolean r0 = r3.A04(r0)     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x0012
            float r1 = r1.A00     // Catch:{ all -> 0x00d5 }
            r0 = 1059749626(0x3f2a7efa, float:0.666)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L_0x0012
            r5.add(r2)     // Catch:{ all -> 0x00d5 }
            goto L_0x0012
        L_0x003e:
            java.util.Iterator r6 = r5.iterator()     // Catch:{ all -> 0x00d7 }
        L_0x0042:
            boolean r0 = r6.hasNext()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x00d3
            java.lang.Object r0 = r6.next()     // Catch:{ all -> 0x00d7 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x00d7 }
            java.lang.Object r8 = r0.getKey()     // Catch:{ all -> 0x00d7 }
            X.1Xj r8 = (X.1Xj) r8     // Catch:{ all -> 0x00d7 }
            java.lang.Object r4 = r0.getValue()     // Catch:{ all -> 0x00d7 }
            X.4HX r4 = (X.AnonymousClass4HX) r4     // Catch:{ all -> 0x00d7 }
            java.util.List r5 = r3.A06     // Catch:{ all -> 0x00d7 }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x00d7 }
        L_0x0060:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0079
            java.lang.Object r1 = r2.next()     // Catch:{ all -> 0x00d7 }
            r0 = r1
            X.2uK r0 = (X.C232722uK) r0     // Catch:{ all -> 0x00d7 }
            X.1Xj r0 = r0.A0G()     // Catch:{ all -> 0x00d7 }
            boolean r0 = X.0qQ.A0K(r0, r8)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0060
            if (r1 != 0) goto L_0x0042
        L_0x0079:
            X.2xX r0 = r3.A05     // Catch:{ all -> 0x00d7 }
            X.4Lv r0 = r0.A08(r8, r4)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0042
            X.3V3 r10 = r0.A01     // Catch:{ all -> 0x00d7 }
            X.2rR r0 = r3.A0C     // Catch:{ all -> 0x00d7 }
            X.3W1 r4 = r0.BQr(r8)     // Catch:{ all -> 0x00d7 }
            java.util.Iterator r2 = r5.iterator()     // Catch:{ all -> 0x00d5 }
        L_0x008d:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x00d5 }
            r0 = r7
            X.2uK r0 = (X.C232722uK) r0     // Catch:{ all -> 0x00d5 }
            X.3OB r1 = r0.A0J()     // Catch:{ all -> 0x00d5 }
            X.3OB r0 = X.AnonymousClass3OB.IDLE     // Catch:{ all -> 0x00d5 }
            if (r1 != r0) goto L_0x008d
        L_0x00a2:
            X.2uK r7 = (X.C232722uK) r7     // Catch:{ all -> 0x00d5 }
            if (r7 == 0) goto L_0x0042
            boolean r0 = r4.A0p()     // Catch:{ all -> 0x00d5 }
            if (r0 == 0) goto L_0x00cf
            int r12 = r4.getPosition()     // Catch:{ all -> 0x00d5 }
        L_0x00b0:
            int r13 = r4.A03     // Catch:{ all -> 0x00d5 }
            int r14 = r4.A01()     // Catch:{ all -> 0x00d5 }
            boolean r15 = r4.A22     // Catch:{ all -> 0x00d5 }
            boolean r2 = r4.A2H     // Catch:{ all -> 0x00d5 }
            X.4DU r9 = r3.A04     // Catch:{ all -> 0x00d5 }
            com.instagram.common.session.UserSession r0 = r3.A03     // Catch:{ all -> 0x00d5 }
            boolean r1 = X.C263404Lw.A00(r0)     // Catch:{ all -> 0x00d5 }
            r0 = 0
            X.4Lx r11 = new X.4Lx     // Catch:{ all -> 0x00d5 }
            r11.<init>(r0, r0, r0, r1)     // Catch:{ all -> 0x00d5 }
            r16 = r2
            r7.A0R(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00d5 }
            goto L_0x0042
        L_0x00cf:
            r12 = -1
            goto L_0x00b0
        L_0x00d1:
            r7 = 0
            goto L_0x00a2
        L_0x00d3:
            monitor-exit(r3)
            return
        L_0x00d5:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00d7 }
        L_0x00d7:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C234282xb.A01():void");
    }

    public final void A02(1Xj r12, AnonymousClass3W1 r13, C238133Ar r14) {
        AnonymousClass3V3 A002;
        List<Map.Entry> list = this.A0E;
        list.clear();
        Map map = this.A07;
        AnonymousClass4HX r0 = (AnonymousClass4HX) map.get(r12);
        if (r0 != null) {
            Object obj = r0.A03;
            if (!(obj instanceof 1Xj)) {
                list.addAll(00k.A0g(map.entrySet(), C241423Pd.A00));
                boolean z = false;
                AnonymousClass3V3 r5 = null;
                1Xj r4 = null;
                for (Map.Entry entry : list) {
                    1Xj r7 = (1Xj) entry.getKey();
                    AnonymousClass4HX r2 = (AnonymousClass4HX) entry.getValue();
                    AnonymousClass3W1 BQr = this.A0C.BQr(r7);
                    if ((BQr.A2p || BQr.A2o) && r2.A00 >= 0.666f && 0qQ.A0K(r2.A03, obj)) {
                        if (0qQ.A0K(r7, r12)) {
                            z = true;
                        } else {
                            AnonymousClass2xX r3 = this.A05;
                            C263394Lv A082 = r3.A08(r7, r2);
                            if (A082 != null) {
                                A002 = A082.A01;
                            } else if (A03(r7)) {
                                0qQ.A0B(r7, 0);
                                if (!A03(r7)) {
                                    continue;
                                } else {
                                    A002 = A00(r7, r14);
                                    if (A002 == null) {
                                        continue;
                                    }
                                }
                            } else {
                                continue;
                            }
                            if (z) {
                                r3.A0A(r7, A002, BQr, new C263414Lx(false, false, false, C263404Lw.A00(this.A03)));
                                return;
                            } else if (r5 == null) {
                                r5 = A002;
                                r4 = r7;
                            }
                        }
                    }
                }
                if (r5 != null && r5.BQq() != null && r4 != null) {
                    this.A05.A0A(r4, r5, r13, new C263414Lx(false, false, false, C263404Lw.A00(this.A03)));
                }
            }
        }
    }
}
