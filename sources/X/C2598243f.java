package X;

import android.os.Handler;
import android.os.Looper;
import com.instagram.common.session.UserSession;

/* renamed from: X.43f  reason: invalid class name and case insensitive filesystem */
public abstract class C2598243f {
    public Looper A00;
    public String A01;
    public final Handler A02 = new C262054By(this.A00, this);
    public final 1bT A03;
    public final 2Dm A04;

    public final void A01(AnonymousClass651 r9) {
        AnonymousClass651 r3 = r9;
        0qQ.A0B(r9, 0);
        for (AnonymousClass653 r4 : r9.A05) {
            0qQ.A0B(r4, 1);
            this.A03.A00(r3, r4, new AnonymousClass9LZ(this, 23), C41768Azx.A00, true);
        }
    }

    public final void A00() {
        if (this instanceof C2598143e) {
            C2598143e r0 = (C2598143e) this;
            r0.A01 = null;
            C2600644d r2 = r0.A01;
            r2.A01 = -1;
            r2.A02 = C2600844f.ORDERED;
            r2.A00 = 0;
            r2.A0E.clear();
            r2.A0C.clear();
            Runnable runnable = r2.A03;
            if (runnable != null) {
                r2.A08.removeCallbacks(runnable);
            }
            r2.A03 = null;
            return;
        }
        this.A01 = null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00fb  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(java.util.List r19) {
        /*
            r18 = this;
            r2 = r18
            boolean r0 = r2 instanceof X.C2601044h
            r1 = r19
            if (r0 == 0) goto L_0x0020
            r0 = 0
            X.0qQ.A0B(r1, r0)
            java.util.Iterator r1 = r1.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r0 = r1.next()
            X.651 r0 = (X.AnonymousClass651) r0
            r2.A01(r0)
            goto L_0x0010
        L_0x0020:
            r9 = r2
            X.43e r9 = (X.C2598143e) r9
            r8 = 0
            X.0qQ.A0B(r1, r8)
            java.util.Iterator r17 = r1.iterator()
        L_0x002b:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x017d
            java.lang.Object r11 = r17.next()
            X.651 r11 = (X.AnonymousClass651) r11
            X.44d r10 = r9.A01
            java.lang.String r0 = r9.A01
            r14 = 0
            if (r0 == 0) goto L_0x003f
            r14 = 1
        L_0x003f:
            X.0qQ.A0B(r11, r8)
            java.lang.Long r3 = r11.A02
            X.44e r0 = r10.A0B
            X.02m r7 = r0.A00
            r6 = 991103806(0x3b130b3e, float:0.002243712)
            r7.markerStart(r6)
            java.util.List r0 = r11.A05
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0062
            java.lang.String r1 = "empty_delta"
        L_0x0058:
            java.lang.String r0 = "event"
            r7.markerAnnotate(r6, r0, r1)
            r0 = 2
            r7.markerEnd(r6, r0)
            goto L_0x002b
        L_0x0062:
            java.util.List r0 = r11.A05
            java.lang.Object r12 = X.00k.A0O(r0, r8)
            X.653 r12 = (X.AnonymousClass653) r12
            X.44c r0 = r10.A0A
            X.43e r2 = r0.A00
            X.1bT r0 = r2.A03
            if (r12 == 0) goto L_0x0109
            X.43h r0 = r0.A01
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r4 = r0.iterator()
        L_0x007c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0109
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r0 = r12.A01
            java.util.Map r13 = com.instagram.realtimeclient.EventRouter.match(r1, r0)
            if (r13 == 0) goto L_0x007c
        L_0x0096:
            java.util.LinkedList r5 = r10.A0C
            r4 = 2
            X.0qQ.A0B(r5, r4)
            if (r12 == 0) goto L_0x00e2
            java.lang.String r1 = r12.A01
            X.0qQ.A06(r1)
            java.lang.String r0 = "incoming_delta_path"
            r7.markerAnnotate(r6, r0, r1)
            if (r3 == 0) goto L_0x00b0
            java.lang.String r1 = r3.toString()
            if (r1 != 0) goto L_0x00b2
        L_0x00b0:
            java.lang.String r1 = "null"
        L_0x00b2:
            java.lang.String r0 = "incoming_tq_seq_id"
            r7.markerAnnotate(r6, r0, r1)
            java.lang.String[] r0 = new java.lang.String[r8]
            java.lang.Object[] r1 = r5.toArray(r0)
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.lang.String r0 = "previous_delta_tq_seq_ids"
            r7.markerAnnotate(r6, r0, r1)
            java.lang.String r0 = "direct_v2_thread_id"
            java.lang.Object r1 = r13.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00d3
            java.lang.String r0 = "thread_id"
            r7.markerAnnotate(r6, r0, r1)
        L_0x00d3:
            java.lang.String r0 = "direct_v2_item_id"
            java.lang.Object r1 = r13.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L_0x00e2
            java.lang.String r0 = "item_id"
            r7.markerAnnotate(r6, r0, r1)
        L_0x00e2:
            if (r3 == 0) goto L_0x0176
            int r1 = r10.A00
            int r0 = r10.A06
            if (r1 >= r0) goto L_0x0176
            if (r14 == 0) goto L_0x0176
            com.instagram.common.session.UserSession r13 = r10.A09
            X.0Tu r12 = X.0Tu.A05
            r0 = 36315868341735041(0x81051700380e81, double:3.0296395993530784E-306)
            boolean r0 = X.182.A06(r12, r13, r0)
            if (r0 == 0) goto L_0x0176
            long r2 = r3.longValue()
            long r0 = r10.A01
            int r12 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r12 > 0) goto L_0x010e
            java.lang.String r1 = "delta_before_current_seq_id"
            goto L_0x0058
        L_0x0109:
            X.0sm r13 = X.0Yt.A0E()
            goto L_0x0096
        L_0x010e:
            r13 = -1
            int r12 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x0155
            r15 = 1
            long r13 = r0 + r15
            int r12 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r12 == 0) goto L_0x0155
            long r13 = r2 - r0
            int r0 = r10.A04
            long r0 = (long) r0
            int r12 = (r13 > r0 ? 1 : (r13 == r0 ? 0 : -1))
            if (r12 < 0) goto L_0x013a
            X.44g r0 = X.C2600944g.GAP_TOLERANCE_EXCEEDED
            X.C2600644d.A00(r0, r10, r11)
            java.lang.String r1 = "gap_tolerance_exceeded"
        L_0x012c:
            java.lang.String r0 = "event"
            r7.markerAnnotate(r6, r0, r1)
            r7.markerEnd(r6, r4)
            int r1 = r10.A05
            if (r1 > 0) goto L_0x0142
            goto L_0x002b
        L_0x013a:
            X.44g r0 = X.C2600944g.HOLE_DETECTED
            X.C2600644d.A00(r0, r10, r11)
            java.lang.String r1 = "hole_detected"
            goto L_0x012c
        L_0x0142:
            int r0 = r5.size()
            if (r0 < r1) goto L_0x014c
            r5.removeFirst()
            goto L_0x0142
        L_0x014c:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r5.add(r0)
            goto L_0x002b
        L_0x0155:
            r10.A01 = r2
            X.44g r0 = X.C2600944g.VALID_MESSAGE
            X.C2600644d.A00(r0, r10, r11)
            int r1 = r10.A05
            if (r1 > 0) goto L_0x0164
        L_0x0160:
            java.lang.String r1 = "message_in_order"
            goto L_0x0058
        L_0x0164:
            int r0 = r5.size()
            if (r0 < r1) goto L_0x016e
            r5.removeFirst()
            goto L_0x0164
        L_0x016e:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            r5.add(r0)
            goto L_0x0160
        L_0x0176:
            r2.A01(r11)
            java.lang.String r1 = "null_seq_id"
            goto L_0x0058
        L_0x017d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2598243f.A02(java.util.List):void");
    }

    public C2598243f(UserSession userSession) {
        this.A00 = ((AnonymousClass435) userSession.A01(AnonymousClass436.class, AnonymousClass437.A00)).A02();
        this.A04 = 1bJ.A00(userSession);
        this.A03 = C2598343g.A00(userSession);
    }
}
