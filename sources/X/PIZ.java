package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public final class PIZ implements C250593li {
    public long A00;
    public 1xS A01;
    public boolean A02;
    public long A03;
    public final Context A04;
    public final UserSession A05;
    public final 1x0 A06;
    public final C74263Prr A07;
    public final LinkedHashMap A08;
    public final boolean A09;
    public final Handler A0A;
    public final 1ws A0B;
    public final 1xP A0C;
    public final Runnable A0D;
    public final LinkedList A0E;
    public final Map A0F;
    public final Set A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public final void A8Z(AnonymousClass3WR r4, C256223vQ r5, String str) {
        synchronized (this) {
            Set set = this.A0G;
            String str2 = r4.A0G;
            if (!set.contains(str2)) {
                set.add(str2);
                OFT oft = new OFT(r4, r5, str2, str);
                if (!this.A0J || !r4.A0T) {
                    this.A0E.add(oft);
                } else {
                    this.A0E.addFirst(oft);
                }
            }
        }
    }

    public final void EBw(String str, int i) {
        0qQ.A0B(str, 0);
        this.A0F.put(str, -1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: X.PIY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: X.PIX} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: X.PIY} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v2, resolved type: X.PIY} */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0190, code lost:
        if (X.DbY.A1Z(r6, r9, r0) != false) goto L_0x0192;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01bb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.PIZ r25) {
        /*
            r8 = r25
            X.1xS r0 = r8.A01
            r25 = r0
            boolean r0 = r25.CPo()
            if (r0 != 0) goto L_0x0229
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r0 = r8.A00
            long r5 = r3 - r0
            r1 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0027
            android.content.Context r2 = r8.A04
            com.instagram.common.session.UserSession r1 = r8.A05
            r0 = 1
            boolean r0 = X.AnonymousClass46O.A00(r2, r1, r0)
            r8.A02 = r0
            r8.A00 = r3
        L_0x0027:
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0229
            X.1Rm r0 = X.1Rm.A00()
            java.lang.String r13 = r0.A00
            X.0qQ.A07(r13)
            java.util.LinkedHashMap r0 = r8.A08
            r24 = r0
            boolean r0 = r24.isEmpty()
            r12 = 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01ec
            X.1x0 r11 = r8.A06
            X.34R r18 = r11.BjI(r13)
            X.34L r10 = r11.BTz(r13)
            java.util.Map r9 = r8.A0F
            java.lang.Number r0 = X.C51966G9m.A14(r13, r9)
            r7 = 0
            if (r0 == 0) goto L_0x01ec
            int r6 = r0.intValue()
            r17 = -1
            r0 = r17
            if (r6 == r0) goto L_0x0060
            if (r6 <= 0) goto L_0x01ec
        L_0x0060:
            if (r18 == 0) goto L_0x01ec
            if (r10 == 0) goto L_0x01ec
            java.util.LinkedHashMap r3 = X.AnonymousClass7TE.A1H()
            java.util.Iterator r2 = X.AnonymousClass7TF.A0s(r24)
        L_0x006c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0088
            java.util.Map$Entry r1 = X.AnonymousClass7TE.A1J(r2)
            java.lang.Object r0 = r1.getValue()
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            boolean r0 = X.0qQ.A0K(r0, r13)
            if (r0 == 0) goto L_0x006c
            X.JTR.A1U(r3, r1)
            goto L_0x006c
        L_0x0088:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = X.AnonymousClass7TF.A0s(r3)
        L_0x0090:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r0 = X.C51971G9r.A0p(r1)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            if (r0 == 0) goto L_0x0090
            r2.add(r0)
            goto L_0x0090
        L_0x00a4:
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r16 = r2.iterator()
        L_0x00ac:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x0104
            java.lang.Object r14 = r16.next()
            r4 = r14
            X.1yX r4 = (X.1yX) r4
            X.3Vo r1 = r4.A01
            X.3WR r0 = r1.A01
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = r1.A02
            X.0qQ.A0A(r0)
            X.41D r3 = r11.Bef(r0)
            if (r3 == 0) goto L_0x0100
            java.lang.ref.WeakReference r0 = r4.A00
            r2 = 0
            if (r0 == 0) goto L_0x00fe
            java.lang.Object r1 = r0.get()
            X.6Vu r1 = (X.C308836Vu) r1
        L_0x00d5:
            int r0 = r3.A01
            r15 = r0
            r0 = 2
            if (r15 <= r0) goto L_0x00e3
            if (r1 == 0) goto L_0x00ac
            r1.A00(r12)
            r4.A00 = r2
            goto L_0x00ac
        L_0x00e3:
            int r0 = r3.A02
            r15 = r0
            r0 = 512(0x200, float:7.175E-43)
            if (r15 < r0) goto L_0x00f2
            if (r1 == 0) goto L_0x00ac
            r1.A00(r12)
            r4.A00 = r2
            goto L_0x00ac
        L_0x00f2:
            int r0 = r3.A03
            if (r0 <= 0) goto L_0x0100
            if (r1 == 0) goto L_0x00ac
            r1.A00(r7)
            r4.A00 = r2
            goto L_0x00ac
        L_0x00fe:
            r1 = r2
            goto L_0x00d5
        L_0x0100:
            r5.add(r14)
            goto L_0x00ac
        L_0x0104:
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r5)
            java.util.Iterator r1 = r5.iterator()
        L_0x010c:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0127
            java.lang.Object r0 = r1.next()
            X.1yX r0 = (X.1yX) r0
            X.3Vo r0 = r0.A01
            java.lang.String r0 = r0.A02
            X.0qQ.A0A(r0)
            X.41D r0 = r11.Bef(r0)
            r2.add(r0)
            goto L_0x010c
        L_0x0127:
            boolean r0 = X.DbT.A1b(r5)
            if (r0 == 0) goto L_0x01dc
            r0 = r18
            X.9IV r1 = r0.A00(r10, r5, r7)
            if (r1 == 0) goto L_0x01dc
            r0 = r17
            if (r6 == r0) goto L_0x013d
            int r6 = r6 - r12
            X.C66580MXl.A1T(r13, r9, r6)
        L_0x013d:
            java.lang.Object r1 = r1.A00
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.uigraph.data.UiGraphNodeData<*>"
            X.0qQ.A0C(r1, r0)
        L_0x0144:
            X.1yX r1 = (X.1yX) r1
            X.3Vo r3 = r1.A01
            java.lang.String r2 = r3.A02
            java.lang.ref.WeakReference r5 = r1.A00
            X.3Vq r4 = r1.A02
            X.1xP r0 = X.1xP.A00
            com.instagram.common.session.UserSession r9 = r8.A05
            boolean r13 = r0.A00(r9, r1)
            X.1Rm r0 = X.1Rm.A00()
            java.lang.String r0 = r0.A00
            X.0qQ.A07(r0)
            boolean r0 = X.AnonymousClass4OE.A00(r0)
            if (r0 == 0) goto L_0x01da
            X.0Tu r6 = X.0Tu.A05
            r0 = 36315095244016621(0x81046300010bed, double:3.029150689242935E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 == 0) goto L_0x01da
            r0 = 36315095244082158(0x81046300020bee, double:3.029150689284381E-306)
            boolean r0 = X.182.A06(r6, r9, r0)
            if (r0 == 0) goto L_0x0192
            X.1Bh r0 = X.1Bh.A00()
            boolean r0 = r0.A03()
            if (r0 == 0) goto L_0x01d4
            r0 = 36315095243951084(0x81046300000bec, double:3.029150689201489E-306)
        L_0x018c:
            boolean r0 = X.DbY.A1Z(r6, r9, r0)
            if (r0 == 0) goto L_0x01da
        L_0x0192:
            X.0qQ.A0A(r2)
            X.41D r0 = r11.Bef(r2)
            if (r0 == 0) goto L_0x01d2
            int r12 = r0.A01
        L_0x019d:
            X.PIY r1 = new X.PIY
            r18 = r1
            r19 = r8
            r20 = r4
            r21 = r2
            r22 = r5
            r23 = r12
            r18.<init>(r19, r20, r21, r22, r23)
            boolean r0 = r8.A09
            if (r0 == 0) goto L_0x01b7
            r0 = r24
            X.C66580MXl.A1S(r0, r2)
        L_0x01b7:
            X.3WR r10 = r3.A01
            if (r10 == 0) goto L_0x0229
            X.1Rm r0 = X.1Rm.A00()
            java.lang.String r11 = r0.A00
            X.0qQ.A07(r11)
            com.instagram.model.mediatype.ProductType r2 = r10.A09
            r0 = r17
            boolean r14 = X.C2804551x.A00(r9, r2, r11, r0)
            X.51y r8 = new X.51y
            r8.<init>(r9, r10, r11, r12, r13, r14)
            goto L_0x0220
        L_0x01d2:
            r12 = 0
            goto L_0x019d
        L_0x01d4:
            r0 = 36315095244213232(0x81046300040bf0, double:3.0291506893672725E-306)
            goto L_0x018c
        L_0x01da:
            r12 = -1
            goto L_0x019d
        L_0x01dc:
            boolean r0 = r8.A0H
            if (r0 == 0) goto L_0x01ec
            boolean r0 = X.DbT.A1b(r5)
            if (r0 == 0) goto L_0x01ec
            java.lang.Object r1 = r5.get(r7)
            goto L_0x0144
        L_0x01ec:
            r2 = 0
            monitor-enter(r8)
            java.util.LinkedList r1 = r8.A0E     // Catch:{ all -> 0x0226 }
            boolean r0 = X.AnonymousClass7TE.A1b(r1)     // Catch:{ all -> 0x0226 }
            if (r0 == 0) goto L_0x0203
            java.lang.Object r2 = r1.remove()     // Catch:{ all -> 0x0226 }
            X.OFT r2 = (X.OFT) r2     // Catch:{ all -> 0x0226 }
            java.util.Set r1 = r8.A0G     // Catch:{ all -> 0x0226 }
            java.lang.String r0 = r2.A02     // Catch:{ all -> 0x0226 }
            r1.remove(r0)     // Catch:{ all -> 0x0226 }
        L_0x0203:
            monitor-exit(r8)
            if (r2 == 0) goto L_0x0229
            X.PIX r1 = new X.PIX
            r1.<init>(r2, r8)
            X.3WR r10 = r2.A00
            java.lang.String r3 = r2.A03
            r2 = -1
            r13 = 0
            com.instagram.common.session.UserSession r9 = r8.A05
            com.instagram.model.mediatype.ProductType r0 = r10.A09
            boolean r14 = X.C2804551x.A00(r9, r0, r3, r2)
            X.51y r8 = new X.51y
            r11 = r3
            r12 = r2
            r8.<init>(r9, r10, r11, r12, r13, r14)
        L_0x0220:
            r0 = r25
            r0.E3b(r1, r8)
            return
        L_0x0226:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x0229:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PIZ.A00(X.PIZ):void");
    }

    public final void A9q(1yX r4, String str) {
        LinkedHashMap linkedHashMap = this.A08;
        String str2 = r4.A01.A02;
        0qQ.A0A(str2);
        linkedHashMap.put(str2, new Pair(r4, str));
    }

    public final void Dwa() {
        this.A01.AGD(false);
        this.A0A.removeCallbacks(this.A0D);
    }

    public final void EEW(String str) {
        LinkedHashMap linkedHashMap = this.A08;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (0qQ.A0K(((Pair) A1J.getValue()).second, str)) {
                JTR.A1U(A1H, A1J);
            }
        }
        ArrayList<Object> A0f = JTQ.A0f(A1H);
        Iterator A0s2 = AnonymousClass7TF.A0s(A1H);
        while (A0s2.hasNext()) {
            A0f.add(AnonymousClass7TE.A1J(A0s2).getKey());
        }
        for (Object remove : A0f) {
            linkedHashMap.remove(remove);
        }
    }

    public final void ExO(Integer num) {
        if (this.A0I) {
            Handler handler = this.A0A;
            Runnable runnable = this.A0D;
            handler.removeCallbacks(runnable);
            String str = 1Rm.A00().A00;
            0qQ.A07(str);
            int i = 100;
            if ("stories".equals(str)) {
                i = 200;
            }
            long elapsedRealtime = ((long) i) - (SystemClock.elapsedRealtime() - this.A03);
            if (elapsedRealtime > 0) {
                handler.postDelayed(runnable, elapsedRealtime);
                return;
            }
        } else if (this.A0K) {
            this.A0A.post(this.A0D);
            return;
        }
        A01(this);
    }

    public PIZ(Context context, UserSession userSession, 1x0 r7, 1ws r8, 1xP r9, C74263Prr prr) {
        long j;
        AnonymousClass7TG.A1O(context, userSession);
        this.A04 = context;
        this.A05 = userSession;
        this.A0B = r8;
        this.A06 = r7;
        this.A07 = prr;
        this.A0C = r9;
        this.A0F = AnonymousClass7TE.A1H();
        this.A0A = AnonymousClass7TF.A0D();
        this.A0D = new C73104PWl(this);
        this.A08 = AnonymousClass7TE.A1H();
        this.A0E = new LinkedList();
        this.A0G = DbS.A0y();
        1wt r1 = r8.A06;
        this.A09 = r1.A06;
        this.A0I = r1.A04;
        this.A0K = r1.A07;
        this.A0H = r1.A01;
        this.A0J = r1.A05;
        if (r1.A03) {
            j = r1.A00;
        } else {
            j = 1;
        }
        this.A01 = new 1xQ(userSession, -1, j);
    }

    public static final void A01(PIZ piz) {
        piz.A03 = SystemClock.elapsedRealtime();
        1wy r3 = ((C72743PIa) piz.A07).A00.A09;
        synchronized (r3) {
            Iterator A0u = AnonymousClass7TF.A0u(r3.A01);
            while (A0u.hasNext()) {
                ((AnonymousClass41D) C51971G9r.A0p(A0u)).A03 = 0;
            }
        }
        piz.A01.AGD(true);
        A00(piz);
        SystemClock.elapsedRealtime();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PIZ(Context context, UserSession userSession, 1ws r10, 1x0 r11, C74263Prr prr, 1xP r13, 1xS r14) {
        this(context, userSession, r11, r10, r13, prr);
        0qQ.A0B(context, 1);
        C51974G9v.A1S(userSession, r10, r11, prr, r13);
        0qQ.A0B(r14, 7);
        this.A01 = r14;
    }
}
