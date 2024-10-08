package X;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3Dp  reason: invalid class name and case insensitive filesystem */
public final class C238833Dp {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public WeakReference A04;
    public WeakReference A05;
    public final Handler A06;
    public final C238853Dr A07;
    public final 0lg A08;

    public final void A05(View view, C238863Ds r4) {
        A08(view, new C238873Dt((Integer) null, r4, (String) null, (String) null));
    }

    public final void A06(View view, C238863Ds r5, int i) {
        Integer num = null;
        if (i >= 0) {
            num = Integer.valueOf(i);
        }
        A08(view, new C238873Dt(num, r5, (String) null, (String) null));
    }

    public final void A07(View view, C238863Ds r4, String[] strArr, int i) {
        A09(view, new C238873Dt((Integer) null, r4, (String) null, (String) null), strArr, i);
    }

    public final void A0B(View view, String... strArr) {
        String str;
        this.A00 = 1;
        if (strArr.length > 0) {
            str = strArr[0];
        } else {
            str = null;
        }
        A01(view, (C238873Dt) null, str);
    }

    public static C238833Dp A00(0lg r2) {
        return (C238833Dp) r2.A01(C238833Dp.class, new C238843Dq(r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0037, code lost:
        if (r11 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A01(android.view.View r9, X.C238873Dt r10, java.lang.String r11) {
        /*
            r8 = this;
            X.0lg r2 = r8.A08
            X.0Tu r3 = X.0Tu.A05
            r0 = 36331158421652398(0x8112ff000043ae, double:3.039309107461025E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            if (r0 == 0) goto L_0x0047
            if (r10 == 0) goto L_0x001e
            r5.add(r10)
        L_0x001e:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.3Dr r0 = r8.A07
            X.HTB.A00(r9, r0, r4, r5, r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0046
            r7 = 0
            java.lang.Object r3 = r1.get(r7)
            X.4Lh r3 = (X.AnonymousClass4Lh) r3
            if (r3 == 0) goto L_0x0046
            if (r11 == 0) goto L_0x003b
        L_0x0039:
            r3.A03 = r11
        L_0x003b:
            X.3GX r2 = X.AnonymousClass3GX.A00(r2)
            int r6 = r8.A00
            r2.A04(r3, r4, r5, r6, r7)
            r8.A00 = r7
        L_0x0046:
            return
        L_0x0047:
            if (r10 == 0) goto L_0x004c
            r5.add(r10)
        L_0x004c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.3Dr r0 = r8.A07
            X.HTB.A00(r9, r0, r4, r5, r1)
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0046
            r7 = 0
            java.lang.Object r3 = r1.get(r7)
            X.4Lh r3 = (X.AnonymousClass4Lh) r3
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238833Dp.A01(android.view.View, X.3Dt, java.lang.String):void");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.3Du, java.lang.Object] */
    public final C238883Du A02(View view) {
        Map map = this.A07.A02;
        if (map.get(view) == null || map.get(view) == C238883Du.A07) {
            ? obj = new Object();
            map.put(view, obj);
            return obj;
        }
        C238883Du r0 = (C238883Du) map.get(view);
        r0.getClass();
        return r0;
    }

    public final void A04(View view) {
        this.A07.A02.remove(view);
    }

    public final void A09(View view, C238873Dt r3, String[] strArr, int i) {
        String str;
        C296505qA r0;
        AnonymousClass3LT r02 = (AnonymousClass3LT) this.A04.get();
        if (!(r02 == null || (r0 = r02.A02) == null)) {
            r0.A0G.add(r3);
        }
        this.A00 = i;
        if (strArr.length > 0) {
            str = strArr[0];
        } else {
            str = null;
        }
        A01(view, r3, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C238833Dp(X.0lg r7) {
        /*
            r6 = this;
            r6.<init>()
            r3 = 0
            r6.A00 = r3
            r1 = 0
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r1)
            r6.A05 = r0
            r6.A08 = r7
            X.0Tu r2 = X.0Tu.A05
            r0 = 36591957426044999(0x82003100040047, double:3.204239447992205E-306)
            long r0 = X.182.A01(r2, r7, r0)
            r6.A01 = r0
            r0 = 36591957426110536(0x82003100050048, double:3.204239448033651E-306)
            long r0 = X.182.A01(r2, r7, r0)
            r6.A03 = r0
            r0 = 2342153491662831734(0x2081003100010076, double:4.057515804457404E-152)
            boolean r1 = X.182.A06(r2, r7, r0)
            X.3Dr r0 = r6.A07
            r0.A01 = r1
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            r0 = 36873432402886670(0x8300310006000e, double:3.3822453567556357E-306)
            java.lang.String r2 = X.182.A04(r2, r7, r0)
            java.lang.String r1 = ","
            X.11S r0 = new X.11S
            r0.<init>(r1)
            r5 = 0
            java.util.List r2 = r0.A03(r2)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0092
            int r0 = r2.size()
            java.util.ListIterator r1 = r2.listIterator(r0)
        L_0x005d:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L_0x0092
            java.lang.Object r0 = r1.previous()
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 == 0) goto L_0x005d
            int r0 = r1.nextIndex()
            int r0 = r0 + 1
            java.util.List r1 = X.00k.A0d(r2, r0)
        L_0x0079:
            java.lang.String[] r0 = new java.lang.String[r3]
            java.lang.Object[] r3 = r1.toArray(r0)
            java.lang.String[] r3 = (java.lang.String[]) r3
            int r2 = r3.length
        L_0x0082:
            if (r5 >= r2) goto L_0x0095
            r1 = r3[r5]
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x008f
            r4.add(r1)
        L_0x008f:
            int r5 = r5 + 1
            goto L_0x0082
        L_0x0092:
            X.0sn r1 = X.0sn.A00
            goto L_0x0079
        L_0x0095:
            X.3Dr r0 = r6.A07
            r0.A00 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C238833Dp.<init>(X.0lg):void");
    }

    public final void A03() {
        String str;
        boolean isShown;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.A02 > this.A01) {
            C238853Dr r10 = this.A07;
            long j = this.A03;
            ArrayList arrayList = new ArrayList();
            long currentTimeMillis2 = System.currentTimeMillis();
            Map map = r10.A02;
            Iterator it = new HashSet(map.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                View view = (View) entry.getKey();
                C238883Du r13 = (C238883Du) entry.getValue();
                if (r13 != null) {
                    long j2 = currentTimeMillis2 - r13.A00;
                    C244333b1 r1 = r13.A05;
                    AnonymousClass4Lh r0 = r13.A03;
                    if (r0 == null && r1 != null) {
                        r0 = r1.AWe();
                        r13.A03 = r0;
                    }
                    if (r0 != null) {
                        str = ((AnonymousClass0iw) r0.A02).getModuleName();
                    } else {
                        str = "";
                    }
                    if (view != null) {
                        if (r10.A01) {
                            isShown = view.isAttachedToWindow();
                        } else {
                            isShown = view.isShown();
                        }
                        if (!isShown) {
                            if (j2 > j) {
                                if (r10.A00.contains(str)) {
                                }
                            }
                        }
                    }
                }
                arrayList.add(view);
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                map.remove(it2.next());
            }
            this.A02 = currentTimeMillis;
        }
    }

    public final void A08(View view, C238873Dt r5) {
        C238883Du A022 = A02(view);
        A022.A04 = r5;
        A022.A00 = System.currentTimeMillis();
    }

    public final void A0A(View view, C244333b1 r5) {
        C238883Du A022 = A02(view);
        A022.A06 = null;
        A022.A03 = null;
        A022.A02 = null;
        A022.A01 = null;
        A022.A05 = r5;
        A022.A00 = System.currentTimeMillis();
    }

    public C238833Dp() {
        this.A04 = new WeakReference((Object) null);
        this.A06 = new Handler(Looper.getMainLooper());
        this.A02 = 0;
        this.A03 = 0;
        this.A01 = 1000;
        this.A07 = new C238853Dr();
    }
}
