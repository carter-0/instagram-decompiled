package X;

import android.content.Context;
import android.os.SystemClock;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.3lh  reason: invalid class name and case insensitive filesystem */
public final class C250583lh implements C250593li {
    public long A00;
    public 1xS A01;
    public 1xP A02;
    public final Context A03;
    public final UserSession A04;
    public final 1x0 A05;
    public final AnonymousClass1xL A06;
    public final Map A07 = new HashMap();
    public final 1ws A08;
    public volatile boolean A09;

    public final void A8Z(AnonymousClass3WR r1, C256223vQ r2, String str) {
    }

    public final void A9q(1yX r1, String str) {
    }

    public final void EBw(String str, int i) {
        this.A07.put(str, -1);
    }

    public final void EEW(String str) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0012, code lost:
        r0 = r7.A05;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.C250583lh r16) {
        /*
            r7 = r16
            X.1xS r6 = r7.A01
            boolean r0 = r6.CPo()
            if (r0 != 0) goto L_0x008e
            X.1Rm r0 = X.1Rm.A00()
            java.lang.String r5 = r0.A00
            if (r5 == 0) goto L_0x008e
            X.1x0 r0 = r7.A05
            X.34R r9 = r0.BjI(r5)
            if (r9 == 0) goto L_0x008e
            X.34L r8 = r0.BTz(r5)
            if (r8 == 0) goto L_0x008e
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = r7.A00
            long r10 = r1 - r3
            r3 = 5000(0x1388, double:2.4703E-320)
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0042
            android.content.Context r4 = r7.A03
            com.instagram.common.session.UserSession r3 = r7.A04
            r0 = 0
            X.0qQ.A0B(r4, r0)
            r0 = 1
            X.0qQ.A0B(r3, r0)
            boolean r0 = X.AnonymousClass46O.A00(r4, r3, r0)
            r7.A09 = r0
            r7.A00 = r1
        L_0x0042:
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x008e
            X.34Q r3 = r9.A00
            X.470 r2 = new X.470
            r2.<init>(r7)
            com.instagram.common.session.UserSession r0 = r8.A00
            X.1y3 r1 = X.1y1.A00(r0)
            java.lang.String r0 = r8.A01
            X.46R r4 = r1.A02(r3, r0, r2)
            if (r4 != 0) goto L_0x005c
            r4 = 0
        L_0x005c:
            r3 = 0
        L_0x005d:
            X.1ws r8 = r7.A08
            int r0 = r8.A03
            if (r3 >= r0) goto L_0x008e
            if (r4 == 0) goto L_0x0100
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0100
            r0 = 1
            X.9IV r2 = X.AnonymousClass46R.A00(r4, r0)
            boolean r0 = r8.A0B
            if (r0 == 0) goto L_0x008f
            java.util.HashSet r1 = r8.A07
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0082
            boolean r0 = r1.contains(r5)
            if (r0 == 0) goto L_0x008f
        L_0x0082:
            java.lang.Object r0 = r2.A01
            X.9IM r0 = (X.AnonymousClass9IM) r0
            if (r0 == 0) goto L_0x008f
            int r1 = r0.A00
            int r0 = r8.A02
            if (r1 <= r0) goto L_0x008f
        L_0x008e:
            return
        L_0x008f:
            java.lang.Object r9 = r2.A00
            X.1yX r9 = (X.1yX) r9
            java.lang.Object r0 = r2.A01
            X.9IM r0 = (X.AnonymousClass9IM) r0
            r0.getClass()
            int r10 = r0.A00
            java.util.Map r2 = r7.A07
            java.lang.Object r1 = r2.get(r5)
            java.lang.Number r1 = (java.lang.Number) r1
            if (r9 == 0) goto L_0x0100
            if (r1 == 0) goto L_0x0100
            java.lang.Integer r0 = X.1wY.A0F
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00b6
            int r0 = r1.intValue()
            if (r0 <= 0) goto L_0x0100
        L_0x00b6:
            int r0 = r1.intValue()
            if (r0 <= 0) goto L_0x00c5
            int r0 = r0 + -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.put(r5, r0)
        L_0x00c5:
            X.3Vo r8 = r9.A01
            java.lang.String r2 = r8.A02
            java.lang.ref.WeakReference r1 = r9.A00
            X.3Vq r0 = r9.A02
            X.3WR r12 = r8.A01
            java.lang.String r8 = "videoSource should not be null for item in VideoQueue"
            X.17k.A07(r12, r8)
            X.1xP r8 = X.1xP.A00
            com.instagram.common.session.UserSession r11 = r7.A04
            boolean r15 = r8.A00(r11, r9)
            com.instagram.model.mediatype.ProductType r9 = r12.A09
            X.1Rm r8 = X.1Rm.A00()
            java.lang.String r8 = r8.A00
            boolean r16 = X.C2804551x.A00(r11, r9, r8, r10)
            X.1Rm r8 = X.1Rm.A00()
            java.lang.String r13 = r8.A00
            r14 = -1
            X.51y r10 = new X.51y
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.51z r9 = new X.51z
            r13 = r2
            r14 = r1
            r12 = r0
            r11 = r7
            r9.<init>(r10, r11, r12, r13, r14)
            r6.E3b(r9, r10)
        L_0x0100:
            int r3 = r3 + 1
            goto L_0x005d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C250583lh.A00(X.3lh):void");
    }

    public final void Dwa() {
        this.A01.AGD(false);
    }

    public C250583lh(Context context, UserSession userSession, 1x0 r7, AnonymousClass1xL r8, 1ws r9) {
        this.A03 = context;
        this.A04 = userSession;
        this.A08 = r9;
        this.A05 = r7;
        this.A06 = r8;
        this.A02 = 1xP.A00;
        this.A01 = new 1xQ(userSession, 26374082, (long) r9.A04);
    }

    public final void ExO(Integer num) {
        if (11Z.A07()) {
            0nY.A00().ATE(new C242653Vi(this));
            return;
        }
        SystemClock.elapsedRealtime();
        A00(this);
        SystemClock.elapsedRealtime();
    }
}
