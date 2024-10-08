package X;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.util.Util;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class XDJ implements AnonymousClass4TH, C265004Sd, AnonymousClass4TQ, AnonymousClass4TR, C22531Y8c {
    public static final C256683wB A0c;
    public static final Map A0d;
    public int A00;
    public int A01;
    public int A02;
    public long A03;
    public long A04;
    public AnonymousClass4YO A05;
    public C264924Rv A06;
    public C21091XEe A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public C21089XEc[] A0G;
    public C265984Xc[] A0H;
    public long A0I;
    public boolean A0J;
    public boolean A0K;
    public final Handler A0L;
    public final C265184Sw A0M;
    public final C265114Sp A0N;
    public final C265174Sv A0O;
    public final Y9T A0P;
    public final AnonymousClass4QW A0Q;
    public final C265084Sm A0R;
    public final AnonymousClass4XY A0S = new AnonymousClass4XY("Loader:ProgressiveMediaPeriod");
    public final Runnable A0T;
    public final Runnable A0U;
    public final String A0V;
    public final boolean A0W;
    public final Uri A0X;
    public final C22530Y8b A0Y;
    public final C257113ws A0Z;
    public final AnonymousClass4Q3 A0a;
    public final boolean A0b;

    private void A01() {
        XEX xex = new XEX(this.A0X, this, this.A0Y, this, this.A0Z, this.A0a);
        if (this.A0E) {
            C256703wD.A04(A05(this));
            long j = this.A03;
            if (j == -9223372036854775807L || this.A0I < j) {
                AnonymousClass4YO r2 = this.A05;
                r2.getClass();
                long j2 = r2.BrA(this.A0I).A00.A00;
                long j3 = this.A0I;
                xex.A04.A00 = j2;
                xex.A00 = j3;
                xex.A02 = true;
                for (C265984Xc r0 : this.A0H) {
                    r0.A08 = j3;
                }
                this.A0I = -9223372036854775807L;
            } else {
                this.A0B = true;
                this.A0I = -9223372036854775807L;
                return;
            }
        }
        int i = 0;
        for (C265984Xc r02 : this.A0H) {
            i += r02.A00 + r02.A02;
        }
        this.A02 = i;
        AnonymousClass4XY r3 = this.A0S;
        C265084Sm r03 = this.A0R;
        int i2 = this.A00;
        int i3 = ((C265074Sl) r03).A00;
        if (i3 == -1) {
            i3 = 3;
            if (i2 == 7) {
                i3 = 6;
            }
        }
        r3.A02(this, xex, i3);
        C257263x7 r1 = xex.A01;
        if (!this.A0W) {
            this.A0O.A04((C256683wB) null, new AnonymousClass4Y0(r1), (Object) null, 1, -1, 0, xex.A00, this.A03);
        } else {
            this.A0O.A02((C256683wB) null, new AnonymousClass4Y0(r1), (Object) null, 1, -1, 0, 0, xex.A00, this.A03);
        }
    }

    public final void AGR(long j) {
    }

    public final void ASU() {
        this.A0J = true;
        this.A0L.post(this.A0T);
    }

    public final long E3Q(long j) {
        return 0;
    }

    public final void EB7(long j) {
    }

    public final void Efw(boolean z) {
    }

    public final void FKi(byte b, boolean z) {
    }

    private void A00() {
        C256703wD.A04(this.A0E);
        this.A07.getClass();
        this.A05.getClass();
    }

    public static void A02(XDJ xdj) {
        C256683wB r2;
        boolean z;
        C256683wB r0;
        if (!xdj.A0F && !xdj.A0E && xdj.A0J && xdj.A05 != null) {
            C265984Xc[] r4 = xdj.A0H;
            int length = r4.length;
            int i = 0;
            while (i < length) {
                C265984Xc r1 = r4[i];
                synchronized (r1) {
                    if (r1.A0I) {
                        r0 = null;
                    } else {
                        r0 = r1.A0B;
                    }
                }
                if (r0 != null) {
                    i++;
                } else {
                    return;
                }
            }
            xdj.A0a.A01();
            int length2 = xdj.A0H.length;
            C264854Ro[] r5 = new C264854Ro[length2];
            boolean[] zArr = new boolean[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                C265984Xc r12 = xdj.A0H[i2];
                synchronized (r12) {
                    if (r12.A0I) {
                        r2 = null;
                    } else {
                        r2 = r12.A0B;
                    }
                }
                r2.getClass();
                String str = r2.A0W;
                if (!2Kn.A04(str)) {
                    boolean A062 = 2Kn.A06(str);
                    z = false;
                    if (!A062) {
                        zArr[i2] = z;
                        xdj.A08 = z | xdj.A08;
                        r5[i2] = new C264854Ro("", r2);
                    }
                }
                z = true;
                zArr[i2] = z;
                xdj.A08 = z | xdj.A08;
                r5[i2] = new C264854Ro("", r2);
            }
            xdj.A07 = new C21091XEe(new C264844Rn(r5), zArr);
            xdj.A0E = true;
            C264924Rv r02 = xdj.A06;
            r02.getClass();
            r02.DZ1(xdj);
        }
    }

    public static boolean A05(XDJ xdj) {
        if (xdj.A0I != -9223372036854775807L) {
            return true;
        }
        return false;
    }

    public final void A06() {
        AnonymousClass4XY r2 = this.A0S;
        C265084Sm r0 = this.A0R;
        int i = this.A00;
        int i2 = ((C265074Sl) r0).A00;
        if (i2 == -1) {
            i2 = 3;
            if (i == 7) {
                i2 = 6;
            }
        }
        IOException iOException = r2.A02;
        if (iOException == null) {
            AnonymousClass4Y3 r22 = r2.A01;
            if (r22 != null) {
                if (i2 == Integer.MIN_VALUE) {
                    i2 = r22.A06;
                }
                IOException iOException2 = r22.A02;
                if (iOException2 != null && r22.A00 > i2) {
                    throw iOException2;
                }
                return;
            }
            return;
        }
        throw iOException;
    }

    public final boolean AJh(long j, long j2) {
        if (!this.A0B) {
            AnonymousClass4XY r2 = this.A0S;
            if (r2.A02 == null && !this.A0D && (!this.A0E || this.A01 != 0)) {
                boolean A022 = this.A0a.A02();
                if (r2.A01 != null) {
                    return A022;
                }
                A01();
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ boolean AJi(C21415XaP xaP) {
        return AJh(xaP.A01, -9223372036854775807L);
    }

    public final long AiS(long j) {
        long AiU;
        if (this.A0b && !this.A0E) {
            return 0;
        }
        if (this.A0B) {
            AiU = this.A03;
        } else {
            AiU = AiU();
        }
        return AiU - j;
    }

    public final /* bridge */ /* synthetic */ void DO6(C266204Xy r12, long j, long j2, boolean z) {
        XEX xex = (XEX) r12;
        this.A0O.A03((C256683wB) null, C21053XCe.A0A(xex.A01, xex.A05), (Object) null, 1, -1, 0, xex.A00, this.A03);
        if (!z) {
            for (C265984Xc A0C2 : this.A0H) {
                A0C2.A0C(false);
            }
            if (this.A01 > 0) {
                C264924Rv r0 = this.A06;
                r0.getClass();
                r0.D6K(this);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DOA(C266204Xy r18, long j, long j2) {
        AnonymousClass4YO r0;
        long j3;
        XEX xex = (XEX) r18;
        if (this.A03 == -9223372036854775807L && (r0 = this.A05) != null) {
            boolean CbO = r0.CbO();
            long j4 = Long.MIN_VALUE;
            int i = 0;
            while (true) {
                C265984Xc[] r1 = this.A0H;
                if (i >= r1.length) {
                    break;
                }
                j4 = Math.max(j4, r1[i].A05());
                i++;
            }
            if (j4 == Long.MIN_VALUE) {
                j3 = 0;
            } else {
                j3 = j4 + 10000;
            }
            this.A03 = j3;
            this.A0P.Dlp(j3, CbO, this.A0A);
        }
        this.A0O.A05((C256683wB) null, C21053XCe.A0A(xex.A01, xex.A05), (Object) null, xex, (Object) null, 1, -1, 0, xex.A00, this.A03);
        this.A0B = true;
        C264924Rv r02 = this.A06;
        r02.getClass();
        r02.D6K(this);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass4XZ DOC(C266204Xy r30, IOException iOException, int i, long j, long j2) {
        AnonymousClass4XZ r9;
        AnonymousClass4YO r2;
        XEX xex = (XEX) r30;
        AnonymousClass4Y0 A0A2 = C21053XCe.A0A(xex.A01, xex.A05);
        IOException iOException2 = iOException;
        long Bo4 = this.A0R.Bo4(new XDS(A0A2, new AnonymousClass4Y4((C256683wB) null, (Object) null, 1, -1, 0, Util.A08(xex.A00), Util.A08(this.A03)), iOException2, i));
        if (Bo4 == -9223372036854775807L) {
            r9 = AnonymousClass4XY.A05;
        } else {
            C265984Xc[] r13 = this.A0H;
            int i2 = 0;
            for (C265984Xc r22 : r13) {
                i2 += r22.A00 + r22.A02;
            }
            int i3 = 0;
            if (i2 > this.A02) {
                i3 = 1;
            }
            if (this.A09 || !((r2 = this.A05) == null || r2.AzU() == -9223372036854775807L)) {
                this.A02 = i2;
            } else {
                boolean z = this.A0E;
                if (!z || this.A0C || A05(this)) {
                    this.A0C = z;
                    this.A04 = 0;
                    this.A02 = 0;
                    for (C265984Xc A0C2 : r13) {
                        A0C2.A0C(false);
                    }
                    xex.A04.A00 = 0;
                    xex.A00 = 0;
                    xex.A02 = true;
                } else {
                    this.A0D = true;
                    r9 = AnonymousClass4XY.A04;
                }
            }
            r9 = new AnonymousClass4XZ(i3, Bo4);
        }
        int i4 = r9.A00;
        boolean z2 = true;
        if (!(i4 == 0 || i4 == 1)) {
            z2 = false;
        }
        C265174Sv r16 = this.A0O;
        r16.A01((C256683wB) null, A0A2, iOException2, (Object) null, 1, -1, 0, xex.A00, this.A03, !z2);
        return r9;
    }

    public final /* bridge */ /* synthetic */ void DOS(C266204Xy r13, int i, long j, long j2) {
        XEX xex = (XEX) r13;
        if (this.A0W) {
            int i2 = i;
            if (i > 0) {
                this.A0O.A02((C256683wB) null, C21053XCe.A0A(xex.A01, xex.A05), (Object) null, 1, -1, 0, i2, xex.A00, this.A03);
            }
        }
    }

    public final void DOc() {
        for (C265984Xc A092 : this.A0H) {
            A092.A09();
        }
        XEZ xez = (XEZ) this.A0Y;
        if (xez.A00 != null) {
            xez.A00 = null;
        }
        xez.A01 = null;
    }

    public final void E3p(C264924Rv r2, long j) {
        this.A06 = r2;
        this.A0a.A02();
        A01();
    }

    public final long E6K() {
        if (!this.A0C) {
            return -9223372036854775807L;
        }
        if (!this.A0B) {
            int i = 0;
            for (C265984Xc r0 : this.A0H) {
                i += r0.A00 + r0.A02;
            }
            if (i <= this.A02) {
                return -9223372036854775807L;
            }
        }
        this.A0C = false;
        return this.A04;
    }

    public final void EKx(AnonymousClass4YO r3) {
        this.A0L.post(new C21090XEd(r3, this));
    }

    public final long ELF(AnonymousClass4TD[] r13, AnonymousClass4RX[] r14, boolean[] zArr, boolean[] zArr2, long j) {
        int length;
        boolean z;
        AnonymousClass4RX r4;
        long j2 = j;
        A00();
        C21091XEe xEe = this.A07;
        C264844Rn r9 = xEe.A00;
        boolean[] zArr3 = xEe.A01;
        int i = this.A01;
        int i2 = i;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            length = r14.length;
            if (i4 >= length) {
                break;
            }
            XDK xdk = r13[i4];
            if (xdk != null && (r14[i4] == null || !zArr[i4])) {
                int i5 = xdk.A00;
                C256703wD.A04(zArr3[i5]);
                i2--;
                this.A01 = i2;
                zArr3[i5] = false;
                r13[i4] = null;
            }
            i4++;
        }
        if (!this.A0K ? j == 0 : i != 0) {
            z = false;
        } else {
            z = true;
        }
        for (int i6 = 0; i6 < length; i6++) {
            if (r13[i6] == null && (r4 = r14[i6]) != null) {
                boolean z2 = false;
                if (r4.length() == 1) {
                    z2 = true;
                }
                C256703wD.A04(z2);
                boolean z3 = false;
                if (r4.BGu(0) == 0) {
                    z3 = true;
                }
                C256703wD.A04(z3);
                int indexOf = r9.A02.indexOf(r4.C98());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                C256703wD.A04(!zArr3[indexOf]);
                this.A01++;
                zArr3[indexOf] = true;
                r13[i6] = new XDK(this, indexOf);
                zArr2[i6] = true;
                if (!z) {
                    C265984Xc r42 = this.A0H[indexOf];
                    if (!r42.A0D(j2, true)) {
                        z = true;
                        if (r42.A00 + r42.A03 != 0) {
                        }
                    }
                    z = false;
                }
            }
        }
        if (this.A01 == 0) {
            this.A0D = false;
            this.A0C = false;
            AnonymousClass4XY r3 = this.A0S;
            boolean A1V = AnonymousClass7TF.A1V(r3.A01);
            C265984Xc[] r5 = this.A0H;
            int length2 = r5.length;
            if (A1V) {
                while (i3 < length2) {
                    r5[i3].A06();
                    i3++;
                }
                r3.A00();
            } else {
                while (i3 < length2) {
                    r5[i3].A0C(false);
                    i3++;
                }
            }
        } else if (z) {
            j2 = EL5(j2, false);
            while (i3 < r13.length) {
                if (r13[i3] != null) {
                    zArr2[i3] = true;
                }
                i3++;
            }
        }
        this.A0K = true;
        return j2;
    }

    public final C265994Xd FHW(int i, int i2) {
        C21089XEc xEc = new C21089XEc(i);
        C265984Xc[] r2 = this.A0H;
        int length = r2.length;
        for (int i3 = 0; i3 < length; i3++) {
            if (xEc.equals(this.A0G[i3])) {
                return r2[i3];
            }
        }
        AnonymousClass4QW r3 = this.A0Q;
        C265114Sp r1 = this.A0N;
        C265184Sw r0 = this.A0M;
        r0.getClass();
        C265984Xc r22 = new C265984Xc(r0, r1, r3);
        r22.A0D = this;
        int i4 = length + 1;
        Object[] copyOf = Arrays.copyOf(this.A0G, i4);
        copyOf[length] = xEc;
        this.A0G = (C21089XEc[]) copyOf;
        Object[] copyOf2 = Arrays.copyOf(this.A0H, i4);
        copyOf2[length] = r22;
        this.A0H = (C265984Xc[]) copyOf2;
        return r22;
    }

    public final boolean isLoading() {
        return AnonymousClass7TF.A1V(this.A0S.A01);
    }

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("Icy-MetaData", RealtimeSubscription.GRAPHQL_MQTT_VERSION);
        A0d = Collections.unmodifiableMap(A1E);
        C256653w8 r1 = new C256653w8();
        r1.A0R = "icy";
        r1.A0U = "application/x-icy";
        A0c = new C256683wB(r1);
    }

    public static void A03(XDJ xdj, int i) {
        xdj.A00();
        C21091XEe xEe = xdj.A07;
        boolean[] zArr = xEe.A03;
        if (!zArr[i]) {
            C256683wB r3 = ((C264854Ro) xEe.A00.A02.get(i)).A04[0];
            xdj.A0O.A06(r3, (Object) null, 2Kn.A00(r3.A0W), 0, xdj.A04);
            zArr[i] = true;
        }
    }

    public static void A04(XDJ xdj, int i) {
        xdj.A00();
        boolean[] zArr = xdj.A07.A02;
        if (xdj.A0D && zArr[i]) {
            if (!xdj.A0H[i].A0E(false)) {
                xdj.A0I = 0;
                xdj.A0D = false;
                xdj.A0C = true;
                xdj.A04 = 0;
                xdj.A02 = 0;
                for (C265984Xc A0C2 : xdj.A0H) {
                    A0C2.A0C(false);
                }
                C264924Rv r0 = xdj.A06;
                r0.getClass();
                r0.D6K(xdj);
            }
        }
    }

    public final void APR(long j, boolean z) {
        A00();
        if (!A05(this)) {
            boolean[] zArr = this.A07.A01;
            int length = this.A0H.length;
            for (int i = 0; i < length; i++) {
                this.A0H[i].A0B(j, z, zArr[i]);
            }
        }
    }

    public final long AZp(AnonymousClass4P6 r9, long j) {
        A00();
        AnonymousClass4YO r1 = this.A05;
        if (!r1.CbO()) {
            return 0;
        }
        C21498Xcy BrA = r1.BrA(j);
        return r9.A00(j, BrA.A00.A01, BrA.A01.A01);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0056, code lost:
        if (r2 == Long.MAX_VALUE) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long AiU() {
        /*
            r10 = this;
            r10.A00()
            boolean r0 = r10.A0B
            r4 = -9223372036854775808
            if (r0 != 0) goto L_0x0015
            int r0 = r10.A01
            if (r0 == 0) goto L_0x0015
            boolean r0 = A05(r10)
            if (r0 == 0) goto L_0x0016
            long r4 = r10.A0I
        L_0x0015:
            return r4
        L_0x0016:
            boolean r0 = r10.A08
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 == 0) goto L_0x0058
            X.4Xc[] r0 = r10.A0H
            int r7 = r0.length
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r6 = 0
        L_0x0028:
            if (r6 >= r7) goto L_0x0054
            X.XEe r1 = r10.A07
            boolean[] r0 = r1.A02
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x004e
            boolean[] r0 = r1.A01
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x004e
            X.4Xc[] r0 = r10.A0H
            r1 = r0[r6]
            monitor-enter(r1)
            boolean r0 = r1.A0E     // Catch:{ all -> 0x0051 }
            monitor-exit(r1)
            if (r0 != 0) goto L_0x004e
            X.4Xc[] r0 = r10.A0H
            r0 = r0[r6]
            long r0 = r0.A05()
            long r2 = java.lang.Math.min(r2, r0)
        L_0x004e:
            int r6 = r6 + 1
            goto L_0x0028
        L_0x0051:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x0054:
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x007a
        L_0x0058:
            r2 = -9223372036854775808
            r6 = 0
        L_0x005b:
            X.4Xc[] r0 = r10.A0H
            int r0 = r0.length
            if (r6 >= r0) goto L_0x007a
            X.XEe r0 = r10.A07
            r0.getClass()
            boolean[] r0 = r0.A01
            boolean r0 = r0[r6]
            if (r0 == 0) goto L_0x0077
            X.4Xc[] r0 = r10.A0H
            r0 = r0[r6]
            long r0 = r0.A05()
            long r2 = java.lang.Math.max(r2, r0)
        L_0x0077:
            int r6 = r6 + 1
            goto L_0x005b
        L_0x007a:
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            long r2 = r10.A04
        L_0x0080:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XDJ.AiU():long");
    }

    public final long BWC() {
        return AiU();
    }

    public final C264844Rn C99() {
        A00();
        return this.A07.A00;
    }

    public final void Cnk() {
        A06();
        if (this.A0B && !this.A0E) {
            throw C2609347p.A00("Loading finished before preparation is complete.", (Throwable) null);
        }
    }

    public final long EL5(long j, boolean z) {
        A00();
        boolean[] zArr = this.A07.A02;
        if (!this.A05.CbO()) {
            j = 0;
        }
        int i = 0;
        this.A0C = false;
        this.A04 = j;
        if (A05(this)) {
            this.A0I = j;
        } else {
            if (this.A00 != 7) {
                int length = this.A0H.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (!this.A0H[i2].A0D(j, false) && (zArr[i2] || !this.A08)) {
                            break;
                        }
                        i2++;
                    } else {
                        break;
                    }
                }
            }
            this.A0D = false;
            this.A0I = j;
            this.A0B = false;
            AnonymousClass4XY r3 = this.A0S;
            if (r3.A01 != null) {
                C265984Xc[] r2 = this.A0H;
                int length2 = r2.length;
                while (i < length2) {
                    r2[i].A06();
                    i++;
                }
                r3.A00();
                return j;
            }
            r3.A02 = null;
            C265984Xc[] r32 = this.A0H;
            int length3 = r32.length;
            while (i < length3) {
                r32[i].A0C(false);
                i++;
            }
        }
        return j;
    }

    public XDJ(Uri uri, C265184Sw r6, C265114Sp r7, C265174Sv r8, C22530Y8b y8b, Y9T y9t, AnonymousClass4QW r11, C257113ws r12, C265084Sm r13, String str) {
        this.A0X = uri;
        this.A0Z = r12;
        this.A0N = r7;
        this.A0M = r6;
        this.A0R = r13;
        this.A0O = r8;
        this.A0P = y9t;
        this.A0Q = r11;
        this.A0V = str;
        this.A0Y = y8b;
        this.A0a = new AnonymousClass4Q3();
        this.A0T = new C21088XEb(this);
        this.A0U = new C21087XEa(this);
        Looper myLooper = Looper.myLooper();
        C256703wD.A01(myLooper);
        this.A0L = new Handler(myLooper, (Handler.Callback) null);
        boolean z = false;
        this.A0G = new C21089XEc[0];
        this.A0H = new C265984Xc[0];
        this.A0I = -9223372036854775807L;
        this.A03 = -9223372036854775807L;
        this.A00 = 1;
        this.A0b = (2BY.A02(2BQ.A0V) || 2BY.A02(2BQ.A0W) || 2BY.A02(2BQ.A1A)) ? true : z;
        this.A0W = 2BY.A02(2BQ.A0g);
    }
}
