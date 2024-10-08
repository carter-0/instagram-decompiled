package X;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.Metadata;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.Xv6  reason: case insensitive filesystem */
public final class C22080Xv6 implements YCG {
    public C22546Y8v A00;
    public C22520Y7r A01;
    public C22007Xqi A02;
    public final SparseArray A03;
    public final SIQ A04;
    public final YB5 A05;
    public final Xn2 A06;
    public final XcO A07;

    public final void Dpl(int i, int i2) {
        C21490Xch A012 = A01(this, (C21484Xcb) null);
        A02(new C22066Xus(A012, 22), A012, 24);
    }

    public final void DyI(C21974XoJ xoJ) {
        C21490Xch A012 = A01(this, (C21484Xcb) null);
        A02(new C22064Xuq(11, xoJ, A012), A012, 25);
    }

    public static C21490Xch A00(C22080Xv6 xv6) {
        return A01(xv6, xv6.A06.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C21490Xch A01(X.C22080Xv6 r15, X.C21484Xcb r16) {
        /*
            X.Y8v r0 = r15.A00
            r0.getClass()
            r1 = r16
            if (r16 == 0) goto L_0x0021
            X.Xn2 r0 = r15.A06
            com.google.common.collect.ImmutableMap r0 = r0.A02
            java.lang.Object r2 = r0.get(r1)
            androidx.media3.common.Timeline r2 = (androidx.media3.common.Timeline) r2
            if (r2 == 0) goto L_0x0021
            java.lang.Object r1 = r1.A04
            X.XcO r0 = r15.A07
        L_0x0019:
            r2.A09(r0, r1)
        L_0x001c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0021:
            X.Y8v r0 = r15.A00
            int r7 = r0.AuC()
            X.Y8v r0 = r15.A00
            X.Xui r0 = (X.C22056Xui) r0
            androidx.media3.common.Timeline r4 = X.C21055XCg.A04(r0)
            int r0 = r4.A02()
            if (r7 < r0) goto L_0x0037
            androidx.media3.common.Timeline r4 = androidx.media3.common.Timeline.A00
        L_0x0037:
            int r0 = r4.A02()
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.Y8v r0 = r15.A00
            X.Xui r0 = (X.C22056Xui) r0
            androidx.media3.common.Timeline r0 = X.C21055XCg.A04(r0)
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x00b6
            X.Y8v r0 = r15.A00
            int r0 = r0.AuC()
            if (r7 != r0) goto L_0x00b6
            X.Y8v r3 = r15.A00
            X.Xui r3 = (X.C22056Xui) r3
            X.C22056Xui.A02(r3)
            X.Xqt r1 = r3.A0A
            androidx.media3.common.Timeline r2 = r1.A06
            int r0 = r2.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x00c1
            r0 = 0
            long r11 = androidx.media3.common.util.Util.A04(r0)
        L_0x0074:
            X.Xn2 r0 = r15.A06
            X.Xcb r6 = r0.A00
            X.Y8v r0 = r15.A00
            X.Xui r0 = (X.C22056Xui) r0
            androidx.media3.common.Timeline r5 = X.C21055XCg.A04(r0)
            X.Y8v r0 = r15.A00
            int r8 = r0.AuC()
            X.Y8v r3 = r15.A00
            X.Xui r3 = (X.C22056Xui) r3
            X.C22056Xui.A02(r3)
            X.Xqt r1 = r3.A0A
            androidx.media3.common.Timeline r2 = r1.A06
            int r0 = r2.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x00c1
            r0 = 0
            long r13 = androidx.media3.common.util.Util.A04(r0)
            X.Y8v r0 = r15.A00
            X.Xui r0 = (X.C22056Xui) r0
            X.C22056Xui.A02(r0)
            X.Xqt r0 = r0.A0A
            long r0 = r0.A0J
            long r15 = androidx.media3.common.util.Util.A04(r0)
            X.Xch r3 = new X.Xch
            r3.<init>(r4, r5, r6, r7, r8, r9, r11, r13, r15)
            return r3
        L_0x00b6:
            r11 = 0
            if (r1 != 0) goto L_0x0074
            X.SIQ r0 = r15.A04
            r4.A0A(r0, r7)
            goto L_0x001c
        L_0x00c1:
            boolean r0 = r1.A0F
            if (r0 == 0) goto L_0x00c8
            r1.A01()
        L_0x00c8:
            X.Xcb r0 = r1.A09
            java.lang.Object r1 = r0.A04
            X.XcO r0 = r3.A0Q
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22080Xv6.A01(X.Xv6, X.Xcb):X.Xch");
    }

    public final void A02(Y8w y8w, C21490Xch xch, int i) {
        this.A03.put(i, xch);
        C22007Xqi xqi = this.A02;
        xqi.A03(y8w, i);
        xqi.A02();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0044, code lost:
        if (r7 != null) goto L_0x0046;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Drh(androidx.media3.common.Timeline r10, int r11) {
        /*
            r9 = this;
            X.Xn2 r5 = r9.A06
            X.Y8v r2 = r9.A00
            r2.getClass()
            com.google.common.collect.ImmutableList r8 = r5.A01
            r1 = 0
            X.Xcb r0 = X.Xn2.A00(r2, r8)
            r5.A00 = r0
            X.Xui r2 = (X.C22056Xui) r2
            androidx.media3.common.Timeline r7 = X.C21055XCg.A04(r2)
            com.google.common.collect.ImmutableMap$Builder r6 = new com.google.common.collect.ImmutableMap$Builder
            r6.<init>()
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x0061
            X.Xcb r0 = r5.A00
            boolean r0 = X.2PP.A00(r0, r1)
            if (r0 != 0) goto L_0x0049
            X.Xcb r0 = r5.A00
            boolean r0 = X.2PP.A00(r0, r1)
        L_0x002f:
            if (r0 != 0) goto L_0x0049
            X.Xcb r2 = r5.A00
            if (r2 == 0) goto L_0x0049
            java.lang.Object r0 = r2.A04
            int r1 = r7.A05(r0)
            r0 = -1
            if (r1 != r0) goto L_0x0046
            com.google.common.collect.ImmutableMap r0 = r5.A02
            java.lang.Object r7 = r0.get(r2)
            if (r7 == 0) goto L_0x0049
        L_0x0046:
            r6.put(r2, r7)
        L_0x0049:
            com.google.common.collect.ImmutableMap r0 = r6.buildOrThrow()
            r5.A02 = r0
            X.Xcb r0 = r5.A00
            X.Xch r2 = A01(r9, r0)
            r0 = 18
            X.Xus r1 = new X.Xus
            r1.<init>((X.C21490Xch) r2, (int) r0)
            r0 = 0
            r9.A02(r1, r2, r0)
            return
        L_0x0061:
            r4 = 0
        L_0x0062:
            int r0 = r8.size()
            if (r4 >= r0) goto L_0x0088
            java.lang.Object r3 = r8.get(r4)
            X.Xcb r3 = (X.C21484Xcb) r3
            r2 = r7
            if (r3 == 0) goto L_0x0085
            java.lang.Object r0 = r3.A04
            int r1 = r7.A05(r0)
            r0 = -1
            if (r1 != r0) goto L_0x0082
            com.google.common.collect.ImmutableMap r0 = r5.A02
            java.lang.Object r2 = r0.get(r3)
            if (r2 == 0) goto L_0x0085
        L_0x0082:
            r6.put(r3, r2)
        L_0x0085:
            int r4 = r4 + 1
            goto L_0x0062
        L_0x0088:
            X.Xcb r0 = r5.A00
            boolean r0 = r8.contains(r0)
            goto L_0x002f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22080Xv6.Drh(androidx.media3.common.Timeline, int):void");
    }

    public C22080Xv6(YB5 yb5) {
        YB5 yb52 = yb5;
        yb5.getClass();
        this.A05 = yb5;
        Looper myLooper = Looper.myLooper();
        this.A02 = new C22007Xqi(myLooper == null ? Looper.getMainLooper() : myLooper, yb52, new C22067Xut(), new CopyOnWriteArraySet(), true);
        XcO xcO = new XcO();
        this.A07 = xcO;
        this.A04 = new SIQ();
        this.A06 = new Xn2(xcO);
        this.A03 = new SparseArray();
    }

    public final void CxB(C21972XoH xoH) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(1, xoH, A002), A002, 13);
    }

    public final void D7N(C21957Xmm xmm) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(6, xmm, A002), A002, 27);
    }

    public final void DLi(boolean z) {
        C21490Xch A002 = A00(this);
        A02(new C22066Xus(A002, 24), A002, 3);
    }

    public final void DLk(boolean z) {
        C21490Xch A002 = A00(this);
        A02(new C22066Xus(A002, 20), A002, 7);
    }

    public final void DQU(SIc sIc, int i) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(7, sIc, A002), A002, 1);
    }

    public final void DQb(C21979XoR xoR) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(9, xoR, A002), A002, 14);
    }

    public final void DS4(Metadata metadata) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(5, metadata, A002), A002, 28);
    }

    public final void DXV(boolean z, int i) {
        C21490Xch A002 = A00(this);
        A02(new C22066Xus(A002, 19), A002, 5);
    }

    public final void DXZ(C21982Xoc xoc) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(0, xoc, A002), A002, 12);
    }

    public final void DXh(int i) {
        C21490Xch A002 = A00(this);
        A02(new C22066Xus(A002, 21), A002, 4);
    }

    public final void DXj(int i) {
        C21490Xch A002 = A00(this);
        A02(new C22066Xus(A002, 23), A002, 6);
    }

    public final void DXl(C21281XSl xSl) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(4, xSl, A002), A002, 10);
    }

    public final void DXo(C21281XSl xSl) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(8, xSl, A002), A002, 10);
    }

    public final void DXp(boolean z, int i) {
        C21490Xch A002 = A00(this);
        A02(new C22066Xus(A002, 17), A002, -1);
    }

    public final void DtF(C21973XoI xoI) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(2, xoI, A002), A002, 2);
    }

    public final void onCues(List list) {
        C21490Xch A002 = A00(this);
        A02(new C22064Xuq(3, list, A002), A002, 27);
    }
}
