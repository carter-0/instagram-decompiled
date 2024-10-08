package X;

import android.content.Context;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Surface;
import androidx.media3.common.Timeline;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* renamed from: X.Xui  reason: case insensitive filesystem */
public final class C22056Xui implements C22546Y8v, YCH {
    public static final C22056Xui $redex_init_class = null;
    public float A00;
    public int A01;
    public int A02;
    public Surface A03;
    public C21475Xc9 A04;
    public C21979XoR A05;
    public C21979XoR A06;
    public C21972XoH A07;
    public C21974XoJ A08;
    public C21957Xmm A09;
    public C22009Xqt A0A;
    public Y8A A0B;
    public Object A0C;
    public int A0D;
    public int A0E;
    public int A0F;
    public SIH A0G;
    public C21979XoR A0H;
    public C21981Xoa A0I;
    public C21533Xe1 A0J;
    public C21976XoN A0K;
    public boolean A0L;
    public boolean A0M;
    public final Looper A0N;
    public final C21972XoH A0O;
    public final C22546Y8v A0P;
    public final XcO A0Q;
    public final SIQ A0R;
    public final C22520Y7r A0S;
    public final C22007Xqi A0T;
    public final C22000Xq8 A0U;
    public final C22525Y7w A0V;
    public final C22041XuP A0W;
    public final YCG A0X;
    public final C21405XaD A0Y;
    public final List A0Z;
    public final CopyOnWriteArraySet A0a;
    public final long A0b;
    public final Context A0c;
    public final YB5 A0d;
    public final Xno A0e;
    public final C10343Rqg A0f;
    public final C22042XuR A0g;
    public final C22077Xv3 A0h;
    public final C21359XYm A0i;
    public final C21360XYn A0j;
    public final YBC A0k;
    public final C21294XTo A0l;
    public final Y8G A0m;
    public final YCI[] A0n;

    static {
        C11312SMg.A00("media3.exoplayer");
    }

    private C21491Xci A00(C22548Y8y y8y) {
        C22009Xqt xqt = this.A0A;
        Timeline timeline = xqt.A06;
        if (AnonymousClass7TF.A1Q(timeline.A02())) {
            C22041XuP xuP = this.A0W;
            return new C21491Xci(xuP.A0C, timeline, this.A0d, xuP, y8y);
        }
        timeline.A09(this.A0Q, xqt.A09.A04);
        throw AnonymousClass00P.createAndThrow();
    }

    public static void A02(C22056Xui xui) {
        IllegalStateException A0i2;
        Xno xno = xui.A0e;
        synchronized (xno) {
            boolean z = false;
            while (!xno.A00) {
                try {
                    xno.wait();
                } catch (InterruptedException unused) {
                    z = true;
                }
            }
            if (z) {
                Pxe.A1F();
            }
        }
        Thread currentThread = Thread.currentThread();
        Looper looper = xui.A0N;
        if (currentThread != looper.getThread()) {
            Object[] objArr = {currentThread.getName(), looper.getThread().getName()};
            String format = String.format(Locale.US, C273654mx.A00(1337), objArr);
            if (!xui.A0M) {
                if (xui.A0L) {
                    A0i2 = null;
                } else {
                    A0i2 = Pxe.A0i();
                }
                STH.A05("ExoPlayerImpl", format, A0i2);
                xui.A0L = true;
                return;
            }
            throw AnonymousClass7TE.A0z(format);
        }
    }

    public static void A03(C22056Xui xui, int i, int i2) {
        C21981Xoa xoa = xui.A0I;
        if (i != xoa.A01 || i2 != xoa.A00) {
            xui.A0I = new C21981Xoa(i, i2);
            C22007Xqi xqi = xui.A0T;
            xqi.A03(new C22062Xuo(i, i2), 24);
            xqi.A02();
            A06(xui, new C21981Xoa(i, i2), 2, 14);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x025e, code lost:
        r4.A01(7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0262, code lost:
        if (r7 == false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0264, code lost:
        if (r9 != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0266, code lost:
        r4.A01(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026b, code lost:
        if (r6 != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026d, code lost:
        if (r7 == false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026f, code lost:
        if (r9 != false) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0271, code lost:
        r4.A01(9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0278, code lost:
        if (r1 == false) goto L_0x027d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x027a, code lost:
        r4.A01(10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x027d, code lost:
        r0 = new X.C21972XoH(r4.A00());
        r14.A07 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x028c, code lost:
        if (r0.equals(r2) != false) goto L_0x0297;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x028e, code lost:
        X.C22007Xqi.A01(r14.A0T, r14, 11, 13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0297, code lost:
        r14.A0T.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02a0, code lost:
        if (r3.A0F == r15.A0F) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a2, code lost:
        r1 = r14.A0a.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02ac, code lost:
        if (r1.hasNext() == false) goto L_0x02bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ae, code lost:
        A01(((X.C22042XuR) ((X.C22524Y7v) r1.next())).A00);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x005a, code lost:
        if (r3.A0C.equals(r15.A0C) == false) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bb, code lost:
        if (r10 != false) goto L_0x00bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0133, code lost:
        if (r10 == false) goto L_0x0135;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0139, code lost:
        if (r3.A00 != r15.A00) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013b, code lost:
        X.C22007Xqi.A01(r14.A0T, r15, 0, 5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0145, code lost:
        if (r3.A02 == r15.A02) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0147, code lost:
        X.C22007Xqi.A01(r14.A0T, r15, 1, 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0156, code lost:
        if (r3.A07() == r15.A07()) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0158, code lost:
        X.C22007Xqi.A01(r14.A0T, r15, 2, 7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0167, code lost:
        if (r3.A05.equals(r15.A05) != false) goto L_0x0171;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0169, code lost:
        X.C22007Xqi.A01(r14.A0T, r15, 3, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0171, code lost:
        r2 = r14.A07;
        r4 = r14.A0P;
        r1 = r14.A0O;
        r4 = (X.C22056Xui) r4;
        A02(r4);
        r9 = X.JTQ.A1O(-1, -1);
        r5 = X.C21055XCg.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x018c, code lost:
        if (X.AnonymousClass7TF.A1Q(r5.A02()) == false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x018e, code lost:
        r5 = X.C21055XCg.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019a, code lost:
        if (X.AnonymousClass7TF.A1Q(r5.A02()) != false) goto L_0x01ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x019c, code lost:
        r0 = r4.AuC();
        A02(r4);
        A02(r4);
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ab, code lost:
        if (r5.A03(r0) != -1) goto L_0x01ae;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01ad, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ae, code lost:
        r5 = X.C21055XCg.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01ba, code lost:
        if (X.AnonymousClass7TF.A1Q(r5.A02()) != false) goto L_0x01cd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01bc, code lost:
        r0 = r4.AuC();
        A02(r4);
        A02(r4);
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01cb, code lost:
        if (r5.A04(r0, false) != -1) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01cd, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01ce, code lost:
        r5 = X.C21055XCg.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01da, code lost:
        if (X.AnonymousClass7TF.A1Q(r5.A02()) == false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01dc, code lost:
        r5 = X.C21055XCg.A04(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01e8, code lost:
        if (X.AnonymousClass7TF.A1Q(r5.A02()) == false) goto L_0x0212;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01ea, code lost:
        r6 = X.AnonymousClass7TF.A1Q(X.C21055XCg.A04(r4).A02());
        r4 = new X.C21479XcS();
        r0 = X.C21972XoH.A01;
        r5 = r1.A00;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0206, code lost:
        if (r1 >= r5.A00.size()) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0208, code lost:
        r4.A01(r5.A00(r1));
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0212, code lost:
        r1 = r4.AuC();
        r0 = r4.A0R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x024a, code lost:
        r1 = !r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x024d, code lost:
        if (r1 == false) goto L_0x0252;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024f, code lost:
        r4.A01(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0252, code lost:
        if (r8 == false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0254, code lost:
        if (r9 != false) goto L_0x025a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0256, code lost:
        r4.A01(6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x025a, code lost:
        if (r6 != false) goto L_0x0262;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x025c, code lost:
        if (r9 != false) goto L_0x0262;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(X.C22056Xui r14, X.C22009Xqt r15, int r16) {
        /*
            X.Xqt r3 = r14.A0A
            r14.A0A = r15
            androidx.media3.common.Timeline r4 = r3.A06
            androidx.media3.common.Timeline r5 = r15.A06
            boolean r0 = r4.equals(r5)
            r13 = r0 ^ 1
            int r0 = r5.A02()
            boolean r9 = X.AnonymousClass7TF.A1Q(r0)
            r6 = -1
            java.lang.Integer r8 = java.lang.Integer.valueOf(r6)
            r7 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)
            if (r9 == 0) goto L_0x0224
            int r0 = r4.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x0224
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r8)
        L_0x0031:
            java.lang.Object r0 = r2.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r12 = r0.booleanValue()
            java.lang.Object r0 = r2.second
            int r8 = X.AnonymousClass7TE.A0M(r0)
            r4 = 0
            if (r12 == 0) goto L_0x0052
            if (r9 != 0) goto L_0x005d
            X.Xcb r0 = r15.A09
            java.lang.Object r1 = r0.A04
            X.XcO r0 = r14.A0Q
            r5.A09(r0, r1)
        L_0x004d:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0052:
            java.util.List r1 = r3.A0C
            java.util.List r0 = r15.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0091
            goto L_0x0061
        L_0x005d:
            X.XoR r0 = X.C21979XoR.A0W
            r14.A06 = r0
        L_0x0061:
            X.XoR r0 = r14.A06
            X.Xo1 r9 = new X.Xo1
            r9.<init>(r0)
            java.util.List r10 = r15.A0C
            r5 = 0
        L_0x006b:
            int r0 = r10.size()
            if (r5 >= r0) goto L_0x008a
            java.lang.Object r2 = r10.get(r5)
            androidx.media3.common.Metadata r2 = (androidx.media3.common.Metadata) r2
            r1 = 0
        L_0x0078:
            androidx.media3.common.Metadata$Entry[] r0 = r2.A01
            int r0 = r0.length
            if (r1 >= r0) goto L_0x0087
            androidx.media3.common.Metadata$Entry[] r0 = r2.A01
            r0 = r0[r1]
            r0.E36(r9)
            int r1 = r1 + 1
            goto L_0x0078
        L_0x0087:
            int r5 = r5 + 1
            goto L_0x006b
        L_0x008a:
            X.XoR r0 = new X.XoR
            r0.<init>(r9)
            r14.A06 = r0
        L_0x0091:
            androidx.media3.common.Timeline r5 = X.C21055XCg.A04(r14)
            int r0 = r5.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x0219
            X.XoR r1 = r14.A06
            X.XoR r0 = r14.A05
            boolean r0 = r1.equals(r0)
            r11 = r0 ^ 1
            r14.A05 = r1
            boolean r1 = r3.A0E
            boolean r0 = r15.A0E
            boolean r10 = X.JTQ.A1O(r1, r0)
            int r1 = r3.A01
            int r0 = r15.A01
            r9 = 1
            if (r1 != r0) goto L_0x00bd
            r9 = 0
            if (r10 == 0) goto L_0x00c0
        L_0x00bd:
            A01(r14)
        L_0x00c0:
            boolean r1 = r3.A0D
            boolean r0 = r15.A0D
            boolean r5 = X.JTQ.A1O(r1, r0)
            if (r13 == 0) goto L_0x00d7
            X.Xqi r2 = r14.A0T
            r1 = 1
            X.Xup r0 = new X.Xup
            r13 = r16
            r0.<init>(r15, r13, r1)
            r2.A03(r0, r7)
        L_0x00d7:
            if (r12 == 0) goto L_0x00e4
            X.Xqi r2 = r14.A0T
            X.Xup r1 = new X.Xup
            r1.<init>(r4, r8, r7)
            r0 = 1
            r2.A03(r1, r0)
        L_0x00e4:
            X.XGY r0 = r3.A07
            X.XGY r4 = r15.A07
            if (r0 == r4) goto L_0x00fd
            X.Xqi r2 = r14.A0T
            r1 = 4
            X.Xus r0 = new X.Xus
            r0.<init>((java.lang.Object) r15, (int) r1)
            r1 = 10
            r2.A03(r0, r1)
            if (r4 == 0) goto L_0x00fd
            r0 = 5
            X.C22007Xqi.A01(r2, r15, r0, r1)
        L_0x00fd:
            X.XaD r1 = r3.A0B
            X.XaD r0 = r15.A0B
            if (r1 == r0) goto L_0x010a
            X.Xqi r2 = r14.A0T
            r1 = 2
            r0 = 6
            X.C22007Xqi.A01(r2, r15, r0, r1)
        L_0x010a:
            if (r11 == 0) goto L_0x0116
            X.XoR r4 = r14.A05
            X.Xqi r2 = r14.A0T
            r1 = 14
            r0 = 7
            X.C22007Xqi.A01(r2, r4, r0, r1)
        L_0x0116:
            if (r5 == 0) goto L_0x0120
            X.Xqi r2 = r14.A0T
            r1 = 3
            r0 = 8
            X.C22007Xqi.A01(r2, r15, r0, r1)
        L_0x0120:
            if (r9 != 0) goto L_0x0124
            if (r10 == 0) goto L_0x0135
        L_0x0124:
            X.Xqi r2 = r14.A0T
            r0 = 9
            X.C22007Xqi.A01(r2, r15, r0, r6)
            if (r9 == 0) goto L_0x0133
            r1 = 4
            r0 = 10
            X.C22007Xqi.A01(r2, r15, r0, r1)
        L_0x0133:
            if (r10 != 0) goto L_0x013b
        L_0x0135:
            int r1 = r3.A00
            int r0 = r15.A00
            if (r1 == r0) goto L_0x0141
        L_0x013b:
            X.Xqi r1 = r14.A0T
            r0 = 5
            X.C22007Xqi.A01(r1, r15, r7, r0)
        L_0x0141:
            int r1 = r3.A02
            int r0 = r15.A02
            if (r1 == r0) goto L_0x014e
            X.Xqi r2 = r14.A0T
            r1 = 6
            r0 = 1
            X.C22007Xqi.A01(r2, r15, r0, r1)
        L_0x014e:
            boolean r1 = r3.A07()
            boolean r0 = r15.A07()
            if (r1 == r0) goto L_0x015f
            X.Xqi r2 = r14.A0T
            r1 = 7
            r0 = 2
            X.C22007Xqi.A01(r2, r15, r0, r1)
        L_0x015f:
            X.Xoc r1 = r3.A05
            X.Xoc r0 = r15.A05
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0171
            X.Xqi r2 = r14.A0T
            r1 = 12
            r0 = 3
            X.C22007Xqi.A01(r2, r15, r0, r1)
        L_0x0171:
            X.XoH r2 = r14.A07
            X.Y8v r4 = r14.A0P
            X.XoH r1 = r14.A0O
            X.Xui r4 = (X.C22056Xui) r4
            A02(r4)
            boolean r9 = X.JTQ.A1O(r6, r6)
            androidx.media3.common.Timeline r5 = X.C21055XCg.A04(r4)
            int r0 = r5.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x0212
            androidx.media3.common.Timeline r5 = X.C21055XCg.A04(r4)
            int r0 = r5.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x01ad
            int r0 = r4.AuC()
            A02(r4)
            A02(r4)
            int r0 = r5.A03(r0)
            r8 = 1
            if (r0 != r6) goto L_0x01ae
        L_0x01ad:
            r8 = 0
        L_0x01ae:
            androidx.media3.common.Timeline r5 = X.C21055XCg.A04(r4)
            int r0 = r5.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 != 0) goto L_0x01cd
            int r0 = r4.AuC()
            A02(r4)
            A02(r4)
            int r0 = r5.A04(r0, r7)
            r7 = 1
            if (r0 != r6) goto L_0x01ce
        L_0x01cd:
            r7 = 0
        L_0x01ce:
            androidx.media3.common.Timeline r5 = X.C21055XCg.A04(r4)
            int r0 = r5.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x0212
            androidx.media3.common.Timeline r5 = X.C21055XCg.A04(r4)
            int r0 = r5.A02()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            if (r0 == 0) goto L_0x0212
            androidx.media3.common.Timeline r0 = X.C21055XCg.A04(r4)
            int r0 = r0.A02()
            boolean r6 = X.AnonymousClass7TF.A1Q(r0)
            X.XcS r4 = new X.XcS
            r4.<init>()
            X.XoH r0 = X.C21972XoH.A01
            X.Xct r5 = r1.A00
            r1 = 0
        L_0x0200:
            android.util.SparseBooleanArray r0 = r5.A00
            int r0 = r0.size()
            if (r1 >= r0) goto L_0x024a
            int r0 = r5.A00(r1)
            r4.A01(r0)
            int r1 = r1 + 1
            goto L_0x0200
        L_0x0212:
            int r1 = r4.AuC()
            X.SIQ r0 = r4.A0R
            goto L_0x021f
        L_0x0219:
            int r1 = r14.AuC()
            X.SIQ r0 = r14.A0R
        L_0x021f:
            r5.A0A(r0, r1)
            goto L_0x004d
        L_0x0224:
            int r0 = r4.A02()
            boolean r1 = X.AnonymousClass7TF.A1Q(r0)
            r2 = 3
            r0 = 1
            if (r9 == r1) goto L_0x023f
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            android.util.Pair r2 = new android.util.Pair
            r2.<init>(r1, r0)
            goto L_0x0031
        L_0x023f:
            X.Xcb r0 = r3.A09
            java.lang.Object r1 = r0.A04
            X.XcO r0 = r14.A0Q
            r4.A09(r0, r1)
            goto L_0x004d
        L_0x024a:
            r1 = r9 ^ 1
            r0 = 4
            if (r1 == 0) goto L_0x0252
            r4.A01(r0)
        L_0x0252:
            if (r8 == 0) goto L_0x025a
            if (r9 != 0) goto L_0x025a
            r0 = 6
            r4.A01(r0)
        L_0x025a:
            if (r6 != 0) goto L_0x0262
            if (r9 != 0) goto L_0x0262
            r0 = 7
            r4.A01(r0)
        L_0x0262:
            if (r7 == 0) goto L_0x026b
            if (r9 != 0) goto L_0x026b
            r0 = 8
            r4.A01(r0)
        L_0x026b:
            if (r6 != 0) goto L_0x0276
            if (r7 == 0) goto L_0x0276
            if (r9 != 0) goto L_0x0276
            r0 = 9
            r4.A01(r0)
        L_0x0276:
            r0 = 10
            if (r1 == 0) goto L_0x027d
            r4.A01(r0)
        L_0x027d:
            X.Xct r1 = r4.A00()
            X.XoH r0 = new X.XoH
            r0.<init>(r1)
            r14.A07 = r0
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x0297
            X.Xqi r2 = r14.A0T
            r1 = 13
            r0 = 11
            X.C22007Xqi.A01(r2, r14, r0, r1)
        L_0x0297:
            X.Xqi r0 = r14.A0T
            r0.A02()
            boolean r1 = r3.A0F
            boolean r0 = r15.A0F
            if (r1 == r0) goto L_0x02bc
            java.util.concurrent.CopyOnWriteArraySet r0 = r14.A0a
            java.util.Iterator r1 = r0.iterator()
        L_0x02a8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x02bc
            java.lang.Object r0 = r1.next()
            X.Y7v r0 = (X.C22524Y7v) r0
            X.XuR r0 = (X.C22042XuR) r0
            X.Xui r0 = r0.A00
            A01(r0)
            goto L_0x02a8
        L_0x02bc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22056Xui.A04(X.Xui, X.Xqt, int):void");
    }

    public static void A06(C22056Xui xui, Object obj, int i, int i2) {
        for (YCI yci : xui.A0n) {
            if (i == -1 || ((C22078Xv4) yci).A05 == i) {
                C21491Xci A002 = xui.A00(yci);
                boolean z = !A002.A05;
                C11366SPh.A02(z);
                A002.A00 = i2;
                C11366SPh.A02(z);
                A002.A02 = obj;
                A002.A00();
            }
        }
    }

    public static void A01(C22056Xui xui) {
        A02(xui);
        int i = xui.A0A.A01;
        if (i == 1) {
            return;
        }
        if (i == 2 || i == 3) {
            A02(xui);
            A02(xui);
            A02(xui);
        } else if (i != 4) {
            throw Pxe.A0i();
        }
    }

    public static void A05(C22056Xui xui, Object obj) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        boolean z = false;
        for (YCI yci : xui.A0n) {
            if (((C22078Xv4) yci).A05 == 2) {
                C21491Xci A002 = xui.A00(yci);
                boolean z2 = !A002.A05;
                C11366SPh.A02(z2);
                A002.A00 = 1;
                C11366SPh.A02(z2);
                A002.A02 = obj;
                A002.A00();
                A1C.add(A002);
            }
        }
        Object obj2 = xui.A0C;
        if (!(obj2 == null || obj2 == obj)) {
            try {
                Iterator it = A1C.iterator();
                while (it.hasNext()) {
                    C21491Xci xci = (C21491Xci) it.next();
                    long j = xui.A0b;
                    synchronized (xci) {
                        C11366SPh.A02(xci.A05);
                        C11366SPh.A02(C51969G9p.A1a(xci.A01.getThread(), Thread.currentThread()));
                        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
                        while (!xci.A04) {
                            if (j > 0) {
                                xci.wait(j);
                                j = elapsedRealtime - SystemClock.elapsedRealtime();
                            } else {
                                throw new TimeoutException(C273654mx.A00(1304));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Pxe.A1F();
            } catch (TimeoutException unused2) {
                z = true;
            }
            Object obj3 = xui.A0C;
            Surface surface = xui.A03;
            if (obj3 == surface) {
                surface.release();
                xui.A03 = null;
            }
        }
        xui.A0C = obj;
        if (z) {
            XGY xgy = new XGY(new Y5C(), 2, 1003);
            C22009Xqt xqt = xui.A0A;
            C22009Xqt A062 = xqt.A06(xqt.A09);
            A062.A0G = A062.A0I;
            A062.A0J = 0;
            C22009Xqt A052 = A062.A02(1).A05(xgy);
            xui.A02++;
            C22061Xun xun = (C22061Xun) xui.A0W.A0G;
            C21997Xq5.A00(xun.A00.obtainMessage(6), C22061Xun.A00(), xun);
            A04(xui, A052, 0);
        }
    }

    public final int AuC() {
        A02(this);
        C22009Xqt xqt = this.A0A;
        Timeline timeline = xqt.A06;
        if (AnonymousClass7TF.A1Q(timeline.A02())) {
            int i = this.A01;
            if (i == -1) {
                return 0;
            }
            return i;
        }
        timeline.A09(this.A0Q, xqt.A09.A04);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r22v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: X.Xv3} */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.Xc9, java.lang.Object] */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0220, code lost:
        if (r14.A06.A01.isEmpty() != false) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0354, code lost:
        if (r3 == false) goto L_0x0356;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C22056Xui(android.content.Context r49, android.os.Looper r50, X.SIH r51, X.YB5 r52, X.C22526Y7x r53, X.C21976XoN r54, X.AnonymousClass2hV r55, X.C635813i r56, X.C635813i r57, X.C635813i r58, X.C635813i r59, X.C635813i r60) {
        /*
            r48 = this;
            r1 = 2000(0x7d0, double:9.88E-321)
            r25 = 0
            r15 = 0
            r4 = -1000(0xfffffffffffffc18, float:NaN)
            r6 = 1
            r0 = r48
            r0.<init>()
            X.Xno r24 = new X.Xno
            r24.<init>()
            r3 = r24
            r0.A0e = r3
            java.lang.String r7 = "Init "
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x03be }
            java.lang.String r8 = java.lang.Integer.toHexString(r3)     // Catch:{ all -> 0x03be }
            java.lang.String r9 = " ["
            java.lang.String r10 = "AndroidXMedia3/1.4.0"
            java.lang.String r11 = "] ["
            java.lang.String r12 = androidx.media3.common.util.Util.A03     // Catch:{ all -> 0x03be }
            java.lang.String r13 = "]"
            java.lang.String r3 = X.002.A15(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ all -> 0x03be }
            X.STH.A01(r3)     // Catch:{ all -> 0x03be }
            r47 = r49
            android.content.Context r23 = r47.getApplicationContext()     // Catch:{ all -> 0x03be }
            r3 = r23
            r0.A0c = r3     // Catch:{ all -> 0x03be }
            r46 = r52
            r5 = r55
            r3 = r46
            java.lang.Object r3 = r5.apply(r3)     // Catch:{ all -> 0x03be }
            X.YCG r3 = (X.YCG) r3     // Catch:{ all -> 0x03be }
            r0.A0X = r3     // Catch:{ all -> 0x03be }
            r0.A0E = r4     // Catch:{ all -> 0x03be }
            r4 = r51
            r0.A0G = r4     // Catch:{ all -> 0x03be }
            r0.A0F = r6     // Catch:{ all -> 0x03be }
            r0.A0b = r1     // Catch:{ all -> 0x03be }
            X.XuR r2 = new X.XuR     // Catch:{ all -> 0x03be }
            r2.<init>(r0)     // Catch:{ all -> 0x03be }
            r0.A0g = r2     // Catch:{ all -> 0x03be }
            X.Xv3 r22 = new X.Xv3     // Catch:{ all -> 0x03be }
            r22.<init>()     // Catch:{ all -> 0x03be }
            r1 = r22
            r0.A0h = r1     // Catch:{ all -> 0x03be }
            android.os.Handler r21 = new android.os.Handler     // Catch:{ all -> 0x03be }
            r9 = r50
            r1 = r21
            r1.<init>(r9)     // Catch:{ all -> 0x03be }
            java.lang.Object r1 = r59.get()     // Catch:{ all -> 0x03be }
            X.Y83 r1 = (X.Y83) r1     // Catch:{ all -> 0x03be }
            X.Xv5 r1 = (X.C22079Xv5) r1     // Catch:{ all -> 0x03be }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x03be }
            android.content.Context r11 = r1.A01     // Catch:{ all -> 0x03be }
            X.YBA r10 = r1.A00     // Catch:{ all -> 0x03be }
            X.XvG r8 = r1.A02     // Catch:{ all -> 0x03be }
            X.XGq r1 = new X.XGq     // Catch:{ all -> 0x03be }
            r26 = r1
            r27 = r11
            r28 = r21
            r29 = r8
            r30 = r10
            r31 = r2
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x03be }
            r5.add(r1)     // Catch:{ all -> 0x03be }
            com.google.common.collect.ImmutableMap r1 = X.SRK.A04     // Catch:{ all -> 0x03be }
            X.YB7 r13 = X.YB7.A00     // Catch:{ all -> 0x03be }
            r12 = 1
            r1 = r25
            X.YBY[] r1 = new X.YBY[r1]     // Catch:{ all -> 0x03be }
            X.Xul r7 = new X.Xul     // Catch:{ all -> 0x03be }
            r7.<init>(r1)     // Catch:{ all -> 0x03be }
            X.XvC r1 = new X.XvC     // Catch:{ all -> 0x03be }
            r1.<init>(r11)     // Catch:{ all -> 0x03be }
            X.XvA r4 = new X.XvA     // Catch:{ all -> 0x03be }
            r4.<init>(r11, r7, r1, r13)     // Catch:{ all -> 0x03be }
            X.XGp r1 = new X.XGp     // Catch:{ all -> 0x03be }
            r26 = r1
            r29 = r2
            r30 = r4
            r31 = r8
            r32 = r10
            r26.<init>(r27, r28, r29, r30, r31, r32)     // Catch:{ all -> 0x03be }
            r5.add(r1)     // Catch:{ all -> 0x03be }
            android.os.Looper r4 = r21.getLooper()     // Catch:{ all -> 0x03be }
            X.XGo r1 = new X.XGo     // Catch:{ all -> 0x03be }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x03be }
            r5.add(r1)     // Catch:{ all -> 0x03be }
            android.os.Looper r4 = r21.getLooper()     // Catch:{ all -> 0x03be }
            X.XGn r1 = new X.XGn     // Catch:{ all -> 0x03be }
            r1.<init>(r4, r2)     // Catch:{ all -> 0x03be }
            r5.add(r1)     // Catch:{ all -> 0x03be }
            X.XGk r1 = new X.XGk     // Catch:{ all -> 0x03be }
            r1.<init>()     // Catch:{ all -> 0x03be }
            r5.add(r1)     // Catch:{ all -> 0x03be }
            X.YB8 r4 = X.YB8.A00     // Catch:{ all -> 0x03be }
            X.XGl r1 = new X.XGl     // Catch:{ all -> 0x03be }
            r1.<init>(r4)     // Catch:{ all -> 0x03be }
            r5.add(r1)     // Catch:{ all -> 0x03be }
            r1 = r25
            X.YCI[] r1 = new X.YCI[r1]     // Catch:{ all -> 0x03be }
            java.lang.Object[] r8 = r5.toArray(r1)     // Catch:{ all -> 0x03be }
            X.YCI[] r8 = (X.YCI[]) r8     // Catch:{ all -> 0x03be }
            r0.A0n = r8     // Catch:{ all -> 0x03be }
            int r10 = r8.length     // Catch:{ all -> 0x03be }
            if (r10 > 0) goto L_0x00f6
            r12 = 0
        L_0x00f6:
            X.C11366SPh.A02(r12)     // Catch:{ all -> 0x03be }
            java.lang.Object r1 = r60.get()     // Catch:{ all -> 0x03be }
            X.XTo r1 = (X.C21294XTo) r1     // Catch:{ all -> 0x03be }
            r0.A0l = r1     // Catch:{ all -> 0x03be }
            java.lang.Object r4 = r58.get()     // Catch:{ all -> 0x03be }
            X.YBC r4 = (X.YBC) r4     // Catch:{ all -> 0x03be }
            r0.A0k = r4     // Catch:{ all -> 0x03be }
            java.lang.Object r4 = r56.get()     // Catch:{ all -> 0x03be }
            X.Y8G r4 = (X.Y8G) r4     // Catch:{ all -> 0x03be }
            r0.A0m = r4     // Catch:{ all -> 0x03be }
            r5 = r54
            r0.A0K = r5     // Catch:{ all -> 0x03be }
            r0.A0N = r9     // Catch:{ all -> 0x03be }
            r5 = r46
            r0.A0d = r5     // Catch:{ all -> 0x03be }
            r0.A0P = r0     // Catch:{ all -> 0x03be }
            X.Xuu r7 = new X.Xuu     // Catch:{ all -> 0x03be }
            r7.<init>(r0)     // Catch:{ all -> 0x03be }
            java.util.concurrent.CopyOnWriteArraySet r30 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x03be }
            r30.<init>()     // Catch:{ all -> 0x03be }
            X.Xqi r5 = new X.Xqi     // Catch:{ all -> 0x03be }
            r26 = r5
            r27 = r9
            r28 = r46
            r29 = r7
            r31 = r6
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x03be }
            r0.A0T = r5     // Catch:{ all -> 0x03be }
            java.util.concurrent.CopyOnWriteArraySet r5 = new java.util.concurrent.CopyOnWriteArraySet     // Catch:{ all -> 0x03be }
            r5.<init>()     // Catch:{ all -> 0x03be }
            r0.A0a = r5     // Catch:{ all -> 0x03be }
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()     // Catch:{ all -> 0x03be }
            r0.A0Z = r5     // Catch:{ all -> 0x03be }
            java.util.Random r11 = new java.util.Random     // Catch:{ all -> 0x03be }
            r11.<init>()     // Catch:{ all -> 0x03be }
            r5 = r25
            int[] r7 = new int[r5]     // Catch:{ all -> 0x03be }
            X.XvK r5 = new X.XvK     // Catch:{ all -> 0x03be }
            r5.<init>(r11, r7)     // Catch:{ all -> 0x03be }
            r0.A0B = r5     // Catch:{ all -> 0x03be }
            X.Xe1 r5 = X.C21533Xe1.A00     // Catch:{ all -> 0x03be }
            r0.A0J = r5     // Catch:{ all -> 0x03be }
            X.XSq[] r11 = new X.C21285XSq[r10]     // Catch:{ all -> 0x03be }
            X.Y8D[] r10 = new X.Y8D[r10]     // Catch:{ all -> 0x03be }
            X.XoI r7 = X.C21973XoI.A01     // Catch:{ all -> 0x03be }
            X.XaD r20 = new X.XaD     // Catch:{ all -> 0x03be }
            r5 = r20
            r5.<init>(r7, r11, r10)     // Catch:{ all -> 0x03be }
            r0.A0Y = r5     // Catch:{ all -> 0x03be }
            X.XcO r5 = new X.XcO     // Catch:{ all -> 0x03be }
            r5.<init>()     // Catch:{ all -> 0x03be }
            r0.A0Q = r5     // Catch:{ all -> 0x03be }
            X.XcS r10 = new X.XcS     // Catch:{ all -> 0x03be }
            r10.<init>()     // Catch:{ all -> 0x03be }
            r11 = 20
            r7 = 2
            r19 = 3
            r29 = 13
            r30 = 14
            r31 = 15
            r18 = 16
            r33 = 17
            r34 = 18
            r35 = 19
            r5 = 10
            r17 = 31
            r38 = 30
            r39 = 21
            r40 = 35
            r41 = 22
            r42 = 24
            r43 = 27
            r44 = 28
            r16 = 32
            r32 = r18
            r36 = r17
            r37 = r11
            r45 = r16
            r26 = r6
            r27 = r7
            r28 = r19
            int[] r14 = new int[]{r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45}     // Catch:{ all -> 0x03be }
            r13 = 0
        L_0x01ae:
            r12 = r14[r13]     // Catch:{ all -> 0x03be }
            r10.A01(r12)     // Catch:{ all -> 0x03be }
            int r13 = r13 + 1
            if (r13 < r11) goto L_0x01ae
            r11 = 29
            r10.A01(r11)     // Catch:{ all -> 0x03be }
            X.XoH r11 = X.C21972XoH.A01     // Catch:{ all -> 0x03be }
            X.Xct r11 = r10.A00()     // Catch:{ all -> 0x03be }
            X.XoH r10 = new X.XoH     // Catch:{ all -> 0x03be }
            r10.<init>(r11)     // Catch:{ all -> 0x03be }
            r0.A0O = r10     // Catch:{ all -> 0x03be }
            X.XcS r12 = new X.XcS     // Catch:{ all -> 0x03be }
            r12.<init>()     // Catch:{ all -> 0x03be }
            X.Xct r13 = r10.A00     // Catch:{ all -> 0x03be }
            r11 = 0
        L_0x01d1:
            android.util.SparseBooleanArray r10 = r13.A00     // Catch:{ all -> 0x03be }
            int r10 = r10.size()     // Catch:{ all -> 0x03be }
            if (r11 >= r10) goto L_0x01e3
            int r10 = r13.A00(r11)     // Catch:{ all -> 0x03be }
            r12.A01(r10)     // Catch:{ all -> 0x03be }
            int r11 = r11 + 1
            goto L_0x01d1
        L_0x01e3:
            r10 = 4
            r12.A01(r10)     // Catch:{ all -> 0x03be }
            r12.A01(r5)     // Catch:{ all -> 0x03be }
            X.Xct r12 = r12.A00()     // Catch:{ all -> 0x03be }
            X.XoH r11 = new X.XoH     // Catch:{ all -> 0x03be }
            r11.<init>(r12)     // Catch:{ all -> 0x03be }
            r0.A07 = r11     // Catch:{ all -> 0x03be }
            java.util.List r11 = X.C22061Xun.A01     // Catch:{ all -> 0x03be }
            android.os.Handler r12 = new android.os.Handler     // Catch:{ all -> 0x03be }
            r12.<init>(r9, r15)     // Catch:{ all -> 0x03be }
            X.Xun r11 = new X.Xun     // Catch:{ all -> 0x03be }
            r11.<init>(r12)     // Catch:{ all -> 0x03be }
            r0.A0S = r11     // Catch:{ all -> 0x03be }
            X.Xuz r13 = new X.Xuz     // Catch:{ all -> 0x03be }
            r13.<init>(r0)     // Catch:{ all -> 0x03be }
            r0.A0V = r13     // Catch:{ all -> 0x03be }
            X.Xqt r11 = X.C22009Xqt.A00(r20)     // Catch:{ all -> 0x03be }
            r0.A0A = r11     // Catch:{ all -> 0x03be }
            r14 = r3
            X.Xv6 r14 = (X.C22080Xv6) r14     // Catch:{ all -> 0x03be }
            X.Y8v r11 = r14.A00     // Catch:{ all -> 0x03be }
            if (r11 == 0) goto L_0x0222
            X.Xn2 r11 = r14.A06     // Catch:{ all -> 0x03be }
            com.google.common.collect.ImmutableList r11 = r11.A01     // Catch:{ all -> 0x03be }
            boolean r12 = r11.isEmpty()     // Catch:{ all -> 0x03be }
            r11 = 0
            if (r12 == 0) goto L_0x0223
        L_0x0222:
            r11 = 1
        L_0x0223:
            X.C11366SPh.A02(r11)     // Catch:{ all -> 0x03be }
            r14.A00 = r0     // Catch:{ all -> 0x03be }
            android.os.Handler r12 = new android.os.Handler     // Catch:{ all -> 0x03be }
            r12.<init>(r9, r15)     // Catch:{ all -> 0x03be }
            X.Xun r11 = new X.Xun     // Catch:{ all -> 0x03be }
            r11.<init>(r12)     // Catch:{ all -> 0x03be }
            r14.A01 = r11     // Catch:{ all -> 0x03be }
            X.Xqi r15 = r14.A02     // Catch:{ all -> 0x03be }
            X.Xuv r12 = new X.Xuv     // Catch:{ all -> 0x03be }
            r12.<init>(r0, r14)     // Catch:{ all -> 0x03be }
            X.YB5 r11 = r15.A01     // Catch:{ all -> 0x03be }
            r28 = r11
            java.util.concurrent.CopyOnWriteArraySet r11 = r15.A04     // Catch:{ all -> 0x03be }
            r30 = r11
            boolean r11 = r15.A00     // Catch:{ all -> 0x03be }
            r15 = r11
            X.Xqi r11 = new X.Xqi     // Catch:{ all -> 0x03be }
            r26 = r11
            r27 = r9
            r29 = r12
            r31 = r15
            r26.<init>(r27, r28, r29, r30, r31)     // Catch:{ all -> 0x03be }
            r14.A02 = r11     // Catch:{ all -> 0x03be }
            int r11 = androidx.media3.common.util.Util.A01     // Catch:{ all -> 0x03be }
            r12 = r17
            if (r11 >= r12) goto L_0x02a8
            X.XrA r35 = new X.XrA     // Catch:{ all -> 0x03be }
            r35.<init>()     // Catch:{ all -> 0x03be }
        L_0x0260:
            java.lang.Object r14 = r57.get()     // Catch:{ all -> 0x03be }
            X.YB6 r14 = (X.YB6) r14     // Catch:{ all -> 0x03be }
            X.XoN r12 = r0.A0K     // Catch:{ all -> 0x03be }
            r17 = r12
            X.Xe1 r12 = r0.A0J     // Catch:{ all -> 0x03be }
            r15 = r12
            X.XuP r12 = new X.XuP     // Catch:{ all -> 0x03be }
            r31 = r53
            r26 = r12
            r28 = r46
            r29 = r15
            r30 = r13
            r32 = r14
            r33 = r17
            r34 = r3
            r36 = r1
            r37 = r20
            r38 = r4
            r39 = r8
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x03be }
            r0.A0W = r12     // Catch:{ all -> 0x03be }
            r8 = 1065353216(0x3f800000, float:1.0)
            r0.A00 = r8     // Catch:{ all -> 0x03be }
            X.XoR r8 = X.C21979XoR.A0W     // Catch:{ all -> 0x03be }
            r0.A05 = r8     // Catch:{ all -> 0x03be }
            r0.A0H = r8     // Catch:{ all -> 0x03be }
            r0.A06 = r8     // Catch:{ all -> 0x03be }
            r8 = -1
            r0.A01 = r8     // Catch:{ all -> 0x03be }
            java.lang.String r13 = "audio"
            r12 = r23
            java.lang.Object r12 = r12.getSystemService(r13)     // Catch:{ all -> 0x03be }
            android.media.AudioManager r12 = (android.media.AudioManager) r12     // Catch:{ all -> 0x03be }
            if (r12 != 0) goto L_0x02b1
            goto L_0x02af
        L_0x02a8:
            r12 = r23
            X.XrA r35 = X.XUC.A00(r12, r0)     // Catch:{ all -> 0x03be }
            goto L_0x0260
        L_0x02af:
            r12 = -1
            goto L_0x02b5
        L_0x02b1:
            int r12 = r12.generateAudioSessionId()     // Catch:{ all -> 0x03be }
        L_0x02b5:
            r0.A0D = r12     // Catch:{ all -> 0x03be }
            X.Xmm r12 = X.C21957Xmm.A01     // Catch:{ all -> 0x03be }
            r0.A09 = r12     // Catch:{ all -> 0x03be }
            r0.A0M = r6     // Catch:{ all -> 0x03be }
            X.Xqi r12 = r0.A0T     // Catch:{ all -> 0x03be }
            r3.getClass()     // Catch:{ all -> 0x03be }
            r12.A04(r3)     // Catch:{ all -> 0x03be }
            android.os.Handler r12 = new android.os.Handler     // Catch:{ all -> 0x03be }
            r12.<init>(r9)     // Catch:{ all -> 0x03be }
            X.Xuy r4 = (X.C22072Xuy) r4     // Catch:{ all -> 0x03be }
            X.XYp r4 = r4.A08     // Catch:{ all -> 0x03be }
            java.util.concurrent.CopyOnWriteArrayList r13 = r4.A00     // Catch:{ all -> 0x03be }
            java.util.Iterator r14 = r13.iterator()     // Catch:{ all -> 0x03be }
        L_0x02d4:
            boolean r4 = r14.hasNext()     // Catch:{ all -> 0x03be }
            if (r4 == 0) goto L_0x02ea
            java.lang.Object r9 = r14.next()     // Catch:{ all -> 0x03be }
            X.XaE r9 = (X.C21406XaE) r9     // Catch:{ all -> 0x03be }
            X.Y8F r4 = r9.A02     // Catch:{ all -> 0x03be }
            if (r4 != r3) goto L_0x02d4
            r9.A00 = r6     // Catch:{ all -> 0x03be }
            r13.remove(r9)     // Catch:{ all -> 0x03be }
            goto L_0x02d4
        L_0x02ea:
            X.XaE r4 = new X.XaE     // Catch:{ all -> 0x03be }
            r4.<init>(r12, r3)     // Catch:{ all -> 0x03be }
            r13.add(r4)     // Catch:{ all -> 0x03be }
            java.util.concurrent.CopyOnWriteArraySet r3 = r0.A0a     // Catch:{ all -> 0x03be }
            r3.add(r2)     // Catch:{ all -> 0x03be }
            X.Rqg r9 = new X.Rqg     // Catch:{ all -> 0x03be }
            r4 = r47
            r3 = r21
            r9.<init>(r4, r3, r2)     // Catch:{ all -> 0x03be }
            r0.A0f = r9     // Catch:{ all -> 0x03be }
            X.Xq8 r9 = new X.Xq8     // Catch:{ all -> 0x03be }
            r9.<init>(r4, r3, r2)     // Catch:{ all -> 0x03be }
            r0.A0U = r9     // Catch:{ all -> 0x03be }
            X.XYm r3 = new X.XYm     // Catch:{ all -> 0x03be }
            r3.<init>(r4)     // Catch:{ all -> 0x03be }
            r0.A0i = r3     // Catch:{ all -> 0x03be }
            X.XYn r3 = new X.XYn     // Catch:{ all -> 0x03be }
            r3.<init>(r4)     // Catch:{ all -> 0x03be }
            r0.A0j = r3     // Catch:{ all -> 0x03be }
            X.Xc9 r2 = new X.Xc9     // Catch:{ all -> 0x03be }
            r2.<init>()     // Catch:{ all -> 0x03be }
            r0.A04 = r2     // Catch:{ all -> 0x03be }
            X.XoJ r2 = X.C21974XoJ.A01     // Catch:{ all -> 0x03be }
            r0.A08 = r2     // Catch:{ all -> 0x03be }
            X.Xoa r2 = X.C21981Xoa.A02     // Catch:{ all -> 0x03be }
            r0.A0I = r2     // Catch:{ all -> 0x03be }
            X.SIH r3 = r0.A0G     // Catch:{ all -> 0x03be }
            X.XGs r1 = (X.C21151XGs) r1     // Catch:{ all -> 0x03be }
            java.lang.Object r4 = r1.A05     // Catch:{ all -> 0x03be }
            monitor-enter(r4)     // Catch:{ all -> 0x03be }
            X.SIH r2 = r1.A00     // Catch:{ all -> 0x03bb }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x03bb }
            boolean r2 = X.AnonymousClass7TF.A1Q(r2)
            r1.A00 = r3     // Catch:{ all -> 0x03bb }
            monitor-exit(r4)     // Catch:{ all -> 0x03bb }
            if (r2 == 0) goto L_0x036d
            monitor-enter(r4)     // Catch:{ all -> 0x03be }
            X.QDe r2 = r1.A01     // Catch:{ all -> 0x035b }
            boolean r2 = r2.A05     // Catch:{ all -> 0x035b }
            if (r2 == 0) goto L_0x0356
            boolean r2 = r1.A06     // Catch:{ all -> 0x035b }
            if (r2 != 0) goto L_0x0356
            r2 = r16
            if (r11 < r2) goto L_0x0356
            X.Xnp r2 = r1.A02     // Catch:{ all -> 0x035b }
            if (r2 == 0) goto L_0x0356
            boolean r3 = r2.A01()     // Catch:{ all -> 0x035b }
            r2 = 1
            if (r3 != 0) goto L_0x0357
        L_0x0356:
            r2 = 0
        L_0x0357:
            monitor-exit(r4)     // Catch:{ all -> 0x035b }
            if (r2 == 0) goto L_0x036d
            goto L_0x035e
        L_0x035b:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x035b }
            goto L_0x03bd
        L_0x035e:
            X.Y8E r1 = r1.A00     // Catch:{ all -> 0x03be }
            if (r1 == 0) goto L_0x036d
            X.XuP r1 = (X.C22041XuP) r1     // Catch:{ all -> 0x03be }
            X.Y7r r1 = r1.A0G     // Catch:{ all -> 0x03be }
            X.Xun r1 = (X.C22061Xun) r1     // Catch:{ all -> 0x03be }
            android.os.Handler r1 = r1.A00     // Catch:{ all -> 0x03be }
            r1.sendEmptyMessage(r5)     // Catch:{ all -> 0x03be }
        L_0x036d:
            int r1 = r0.A0D     // Catch:{ all -> 0x03be }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03be }
            A06(r0, r1, r6, r5)     // Catch:{ all -> 0x03be }
            int r1 = r0.A0D     // Catch:{ all -> 0x03be }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03be }
            A06(r0, r1, r7, r5)     // Catch:{ all -> 0x03be }
            X.SIH r2 = r0.A0G     // Catch:{ all -> 0x03be }
            r1 = r19
            A06(r0, r2, r6, r1)     // Catch:{ all -> 0x03be }
            int r1 = r0.A0F     // Catch:{ all -> 0x03be }
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03be }
            A06(r0, r1, r7, r10)     // Catch:{ all -> 0x03be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r25)     // Catch:{ all -> 0x03be }
            r1 = 5
            A06(r0, r2, r7, r1)     // Catch:{ all -> 0x03be }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r25)     // Catch:{ all -> 0x03be }
            r1 = 9
            A06(r0, r2, r6, r1)     // Catch:{ all -> 0x03be }
            r2 = 7
            r1 = r22
            A06(r0, r1, r7, r2)     // Catch:{ all -> 0x03be }
            r3 = 8
            r2 = 6
            A06(r0, r1, r2, r3)     // Catch:{ all -> 0x03be }
            int r1 = r0.A0E     // Catch:{ all -> 0x03be }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch:{ all -> 0x03be }
            r1 = r18
            A06(r0, r2, r8, r1)     // Catch:{ all -> 0x03be }
            r24.A00()
            return
        L_0x03bb:
            r1 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x03bb }
        L_0x03bd:
            throw r1     // Catch:{ all -> 0x03be }
        L_0x03be:
            r1 = move-exception
            X.Xno r0 = r0.A0e
            r0.A00()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22056Xui.<init>(android.content.Context, android.os.Looper, X.SIH, X.YB5, X.Y7x, X.XoN, X.2hV, X.13i, X.13i, X.13i, X.13i, X.13i):void");
    }

    public C22056Xui() {
        this.A0R = new SIQ();
    }
}
