package X;

import android.util.SparseArray;
import androidx.media3.common.DrmInitData;
import com.google.common.collect.ImmutableList;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

/* renamed from: X.Ses  reason: case insensitive filesystem */
public final class C11695Ses implements C13809Thc {
    public static final SJM A0X;
    public static final byte[] A0Y = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public C11389SRd A0C;
    public YBZ A0D;
    public S75 A0E;
    public ImmutableList A0F;
    public boolean A0G;
    public boolean A0H;
    public C13900TjN[] A0I;
    public C13900TjN[] A0J;
    public final int A0K;
    public final SparseArray A0L;
    public final C11389SRd A0M;
    public final C11389SRd A0N;
    public final C11389SRd A0O;
    public final C11389SRd A0P;
    public final C11389SRd A0Q;
    public final C10345Rqi A0R;
    public final ArrayDeque A0S;
    public final ArrayDeque A0T;
    public final List A0U;
    public final byte[] A0V;
    public final C13890TjD A0W;

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    public final boolean Evx(C13910TlA tlA) {
        ImmutableList of;
        TZZ A002 = C11114SAr.A00(tlA, true, false);
        if (A002 != null) {
            of = ImmutableList.of(A002);
        } else {
            of = ImmutableList.of();
        }
        this.A0F = of;
        return DbW.A1a(A002);
    }

    static {
        SOW A002 = SOW.A00();
        A002.A01("application/x-emsg");
        A0X = Pxe.A0O(A002);
    }

    public static void A01(C11389SRd sRd, C10855RzF rzF, int i) {
        int A062 = Pxf.A06(sRd, i + 8) & 16777215;
        if ((A062 & 1) == 0) {
            boolean A1P = AnonymousClass7TF.A1P(A062 & 2);
            int A072 = sRd.A07();
            if (A072 == 0) {
                Arrays.fill(rzF.A0E, 0, rzF.A00, false);
                return;
            }
            int i2 = rzF.A00;
            if (A072 == i2) {
                Arrays.fill(rzF.A0E, 0, A072, A1P);
                int A063 = Pxe.A06(sRd);
                C11389SRd sRd2 = rzF.A0G;
                sRd2.A0M(A063);
                rzF.A07 = true;
                rzF.A09 = true;
                sRd.A0R(sRd2.A02, 0, sRd2.A00);
                sRd2.A0O(0);
                rzF.A09 = false;
                return;
            }
            throw Pxf.A0L(002.A02(A072, i2, "Senc sample count ", " is different from fragment sample count"), (Throwable) null);
        }
        throw new XQX("Overriding TrackEncryptionBox parameters is unsupported.", (Throwable) null, 1, false);
    }

    public final void CMU(YBZ ybz) {
        YBZ ybz2;
        int i = this.A0K;
        if ((i & 32) == 0) {
            ybz2 = new C11703Sf0(ybz, this.A0W);
        } else {
            ybz2 = ybz;
        }
        this.A0D = ybz2;
        this.A02 = 0;
        this.A00 = 0;
        C13900TjN[] tjNArr = new C13900TjN[2];
        this.A0J = tjNArr;
        int i2 = 0;
        int i3 = 0;
        int i4 = i & 4;
        int i5 = 100;
        if (i4 != 0) {
            tjNArr[0] = ybz2.FHV(100, 5);
            i3 = 1;
            i5 = 101;
        }
        C13900TjN[] tjNArr2 = this.A0J;
        C11366SPh.A01(Pxg.A1T(i3, tjNArr2.length));
        C13900TjN[] tjNArr3 = (C13900TjN[]) Arrays.copyOf(tjNArr2, i3);
        this.A0J = tjNArr3;
        for (C13900TjN AWO : tjNArr3) {
            AWO.AWO(A0X);
        }
        List list = this.A0U;
        C13900TjN[] tjNArr4 = new C13900TjN[list.size()];
        this.A0I = tjNArr4;
        while (i2 < tjNArr4.length) {
            C13900TjN FHV = this.A0D.FHV(i5, 3);
            FHV.AWO((SJM) list.get(i2));
            tjNArr4 = this.A0I;
            tjNArr4[i2] = FHV;
            i2++;
            i5++;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0218, code lost:
        if (r9 == 1701671783) goto L_0x021a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05dd, code lost:
        if ((r38 & 1) == 0) goto L_0x05df;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x064c, code lost:
        if (r32 == false) goto L_0x064e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0ab3, code lost:
        if (r0.A02 != 3) goto L_0x0b4e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:495:0x0ab7, code lost:
        if (r12.A06 != false) goto L_0x0b00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0ab9, code lost:
        r2 = r12.A05.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0abd, code lost:
        r6 = r12.A01;
        r3 = r2[r6];
        r0.A06 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:498:0x0ac5, code lost:
        if (r6 >= r12.A03) goto L_0x0b05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0ac7, code lost:
        r4.Evk(r3);
        r1 = r12.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0ace, code lost:
        if (r1 == null) goto L_0x0af0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0ad0, code lost:
        r4 = r12.A09;
        r3 = r4.A0G;
        r1 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0ad6, code lost:
        if (r1 == 0) goto L_0x0adb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0ad8, code lost:
        r3.A0P(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0adb, code lost:
        r2 = r12.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0adf, code lost:
        if (r4.A07 == false) goto L_0x0af0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0ae5, code lost:
        if (r4.A0E[r2] == false) goto L_0x0af0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0ae7, code lost:
        r3.A0P(r3.A08() * 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0af4, code lost:
        if (r12.A03() != false) goto L_0x0afa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0af6, code lost:
        r0.A0E = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0afa, code lost:
        r0.A02 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0aff, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0b00, code lost:
        r2 = r12.A09.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b0b, code lost:
        if (r12.A05.A03.A02 != 1) goto L_0x0b15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b0d, code lost:
        r0.A06 = r3 - 8;
        r4.Evk(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b15, code lost:
        r3 = "audio/ac4".equals(r12.A05.A03.A07.A0Y);
        r2 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b25, code lost:
        if (r3 == false) goto L_0x0c23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b27, code lost:
        r0.A04 = r12.A00(r2, 7);
        r6 = r0.A06;
        r3 = r0.A0Q;
        r3.A0M(7);
        X.Pxk.A0g(r3.A02, r6);
        r12.A08.EJf(r3, 7);
        r3 = r0.A04 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b43, code lost:
        r0.A04 = r3;
        r0.A06 += r3;
        r0.A02 = 4;
        r0.A05 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b4e, code lost:
        r3 = r12.A05;
        r11 = r3.A03;
        r10 = r12.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b56, code lost:
        if (r12.A06 != false) goto L_0x0c19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b58, code lost:
        r2 = r3.A07[r12.A01];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b5e, code lost:
        r6 = r11.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0b60, code lost:
        if (r6 == 0) goto L_0x0c29;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:527:0x0b62, code lost:
        r9 = r0.A0O;
        r8 = r9.A02;
        r8[0] = 0;
        r8[1] = 0;
        r8[2] = 0;
        r18 = r6 + 1;
        r17 = 4 - r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b70, code lost:
        r6 = r0.A04;
        r5 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0b74, code lost:
        if (r6 >= r5) goto L_0x0c3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0b76, code lost:
        r6 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0b78, code lost:
        if (r6 != 0) goto L_0x0bd1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0b7a, code lost:
        r4.readFully(r8, r17, r18);
        r5 = X.Pxf.A06(r9, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0b85, code lost:
        if (r5 < 1) goto L_0x0cb8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0b87, code lost:
        r0.A05 = r5 - 1;
        r5 = r0.A0P;
        r5.A0O(0);
        r10.EJf(r5, 4);
        r10.EJf(r9, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0b99, code lost:
        if (r0.A0I.length <= 0) goto L_0x0bcf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:536:0x0b9b, code lost:
        r7 = r11.A07.A0Y;
        r15 = r8[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0ba8, code lost:
        if ("video/avc".equals(r7) == false) goto L_0x0baf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0bad, code lost:
        if ((r15 & 31) == 6) goto L_0x0bbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0bb6, code lost:
        if ("video/hevc".equals(r7) == false) goto L_0x0bcf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0bbd, code lost:
        if (((r15 & 126) >> 1) != 39) goto L_0x0bcf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0bbf, code lost:
        r5 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0bc0, code lost:
        r0.A0H = r5;
        r0.A04 += 5;
        r0.A06 += r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:546:0x0bcf, code lost:
        r5 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0bd3, code lost:
        if (r0.A0H == false) goto L_0x0c14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0bd5, code lost:
        r7 = r0.A0N;
        r7.A0M(r6);
        r4.readFully(r7.A02, 0, r6);
        r10.EJf(r7, r0.A05);
        r6 = r0.A05;
        r16 = X.SS3.A00(r7.A02, r7.A00);
        r7.A0O("video/hevc".equals(r11.A07.A0Y) ? 1 : 0);
        r7.A0N(r16);
        X.C11053S7y.A00(r7, r0.A0I, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0c08, code lost:
        r0.A04 += r6;
        r0.A05 -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:551:0x0c14, code lost:
        r6 = r10.EJe(r4, r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0c19, code lost:
        r2 = r12.A09.A0C[r12.A01];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0c23, code lost:
        r3 = r12.A00(r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x0c29, code lost:
        r6 = r0.A04;
        r5 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0c2d, code lost:
        if (r6 >= r5) goto L_0x0c3a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0c2f, code lost:
        r0.A04 += r10.EJe(r4, r5 - r6, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0c3c, code lost:
        if (r12.A06 != false) goto L_0x0c97;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0c3e, code lost:
        r23 = r12.A05.A04[r12.A01];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0c46, code lost:
        r6 = r12.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0c4a, code lost:
        if (r6 == null) goto L_0x0c95;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0c4c, code lost:
        r23 = r23 | X.SN3.MAX_SIGNED_POWER_OF_TWO;
        r4 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0c52, code lost:
        r10.EJm(r4, r23, r5, 0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0c5f, code lost:
        r5 = r0.A0T;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c65, code lost:
        if (r5.isEmpty() != false) goto L_0x0ca4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c67, code lost:
        r6 = (X.C10512RtR) r5.removeFirst();
        r4 = r0.A03;
        r10 = r6.A00;
        r0.A03 = r4 - r10;
        r4 = r6.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c78, code lost:
        if (r6.A02 == false) goto L_0x0c7b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c7a, code lost:
        r4 = r4 + r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c7b, code lost:
        r9 = r0.A0J;
        r8 = r9.length;
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:570:0x0c7f, code lost:
        if (r7 >= r8) goto L_0x0c5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c81, code lost:
        r9[r7].EJm((X.S4h) null, 1, r10, r0.A03, r4);
        r7 = r7 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0c95, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0c97, code lost:
        r23 = X.AnonymousClass7TF.A1P(r12.A09.A0F[r12.A01] ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0ca8, code lost:
        if (r12.A03() != false) goto L_0x0afa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0caa, code lost:
        r0.A0E = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0cb8, code lost:
        r3 = "Invalid NAL length";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0cc4, code lost:
        throw new X.XQX(r3, (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0cef, code lost:
        r1.append(r0);
        r1.append(r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0d0c, code lost:
        throw new X.XQX(r1.toString(), (java.lang.Throwable) null, 1, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0d24, code lost:
        throw new X.XQX(r1, (java.lang.Throwable) null, 1, false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:484:0x0a84 A[EDGE_INSN: B:636:0x0a84->B:484:0x0a84 ?: BREAK  
    EDGE_INSN: B:637:0x0a84->B:484:0x0a84 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARNING: Removed duplicated region for block: B:606:0x0d1c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E67(X.C13910TlA r52, X.C21363XYr r53) {
        /*
            r51 = this;
        L_0x0000:
            r0 = r51
            int r2 = r0.A02
            r4 = r52
            if (r2 == 0) goto L_0x00a0
            r1 = 1
            if (r2 == r1) goto L_0x0291
            r5 = 2
            if (r2 == r5) goto L_0x0073
            X.S75 r12 = r0.A0E
            r20 = 0
            r13 = 0
            if (r12 != 0) goto L_0x0aac
            android.util.SparseArray r11 = r0.A0L
            int r10 = r11.size()
            r12 = 0
            r14 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x0022:
            if (r9 >= r10) goto L_0x005f
            java.lang.Object r8 = r11.valueAt(r9)
            X.S75 r8 = (X.S75) r8
            boolean r2 = r8.A06
            if (r2 != 0) goto L_0x0036
            int r3 = r8.A01
            X.S39 r2 = r8.A05
            int r2 = r2.A01
            if (r3 == r2) goto L_0x0042
        L_0x0036:
            boolean r2 = r8.A06
            if (r2 == 0) goto L_0x0045
            int r3 = r8.A02
            X.RzF r2 = r8.A09
            int r2 = r2.A01
            if (r3 != r2) goto L_0x0045
        L_0x0042:
            int r9 = r9 + 1
            goto L_0x0022
        L_0x0045:
            boolean r2 = r8.A06
            if (r2 != 0) goto L_0x0058
            X.S39 r2 = r8.A05
            long[] r3 = r2.A06
            int r2 = r8.A01
        L_0x004f:
            r6 = r3[r2]
            int r2 = (r6 > r14 ? 1 : (r6 == r14 ? 0 : -1))
            if (r2 >= 0) goto L_0x0042
            r12 = r8
            r14 = r6
            goto L_0x0042
        L_0x0058:
            X.RzF r2 = r8.A09
            long[] r3 = r2.A0D
            int r2 = r8.A02
            goto L_0x004f
        L_0x005f:
            if (r12 != 0) goto L_0x0a8b
            long r5 = r0.A09
            long r2 = r4.Bdl()
            long r5 = r5 - r2
            int r2 = (int) r5
            if (r2 < 0) goto L_0x0cbb
            r4.Evk(r2)
            r0.A02 = r13
            r0.A00 = r13
            goto L_0x0000
        L_0x0073:
            android.util.SparseArray r13 = r0.A0L
            int r12 = r13.size()
            r9 = 0
            r5 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r11 = 0
            r7 = r9
        L_0x0081:
            if (r11 >= r12) goto L_0x0245
            java.lang.Object r2 = r13.valueAt(r11)
            X.S75 r2 = (X.S75) r2
            X.RzF r10 = r2.A09
            boolean r2 = r10.A09
            if (r2 == 0) goto L_0x009d
            long r2 = r10.A02
            int r8 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r8 >= 0) goto L_0x009d
            long r5 = r10.A02
            java.lang.Object r7 = r13.valueAt(r11)
            X.S75 r7 = (X.S75) r7
        L_0x009d:
            int r11 = r11 + 1
            goto L_0x0081
        L_0x00a0:
            int r1 = r0.A00
            r8 = 8
            r7 = 0
            r3 = 1
            if (r1 != 0) goto L_0x00c5
            X.SRd r5 = r0.A0M
            byte[] r1 = r5.A02
            boolean r1 = r4.E6T(r1, r7, r8, r3)
            if (r1 != 0) goto L_0x00b4
            r0 = -1
            return r0
        L_0x00b4:
            r0.A00 = r8
            r5.A0O(r7)
            long r1 = r5.A0C()
            r0.A07 = r1
            int r1 = r5.A01()
            r0.A01 = r1
        L_0x00c5:
            long r1 = r0.A07
            r9 = 1
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x0128
            X.SRd r2 = r0.A0M
            byte[] r1 = r2.A02
            r4.readFully(r1, r8, r8)
            int r1 = r0.A00
            int r1 = r1 + 8
            r0.A00 = r1
            long r5 = r2.A0D()
        L_0x00de:
            r0.A07 = r5
        L_0x00e0:
            long r5 = r0.A07
            int r1 = r0.A00
            long r1 = (long) r1
            int r9 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0d1c
            long r5 = r4.Bdl()
            long r5 = r5 - r1
            int r1 = r0.A01
            r12 = 1835295092(0x6d646174, float:4.4175247E27)
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 == r11) goto L_0x00fa
            if (r1 != r12) goto L_0x010c
        L_0x00fa:
            boolean r1 = r0.A0G
            if (r1 != 0) goto L_0x010c
            X.YBZ r10 = r0.A0D
            long r1 = r0.A08
            X.Sf7 r9 = new X.Sf7
            r9.<init>(r1, r5)
            r10.EKw(r9)
            r0.A0G = r3
        L_0x010c:
            int r9 = r0.A01
            if (r9 != r11) goto L_0x0156
            android.util.SparseArray r8 = r0.A0L
            int r3 = r8.size()
            r2 = 0
        L_0x0117:
            if (r2 >= r3) goto L_0x026a
            java.lang.Object r1 = r8.valueAt(r2)
            X.S75 r1 = (X.S75) r1
            X.RzF r1 = r1.A09
            r1.A02 = r5
            r1.A03 = r5
            int r2 = r2 + 1
            goto L_0x0117
        L_0x0128:
            r9 = 0
            int r5 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r5 != 0) goto L_0x00e0
            long r5 = r4.getLength()
            r9 = -1
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x0148
            java.util.ArrayDeque r2 = r0.A0S
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0148
            java.lang.Object r1 = r2.peek()
            X.QEL r1 = (X.QEL) r1
            long r5 = r1.A00
        L_0x0148:
            int r1 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x00e0
            long r1 = r4.Bdl()
            long r5 = r5 - r1
            int r1 = r0.A00
            long r1 = (long) r1
            long r5 = r5 + r1
            goto L_0x00de
        L_0x0156:
            r11 = 0
            if (r9 != r12) goto L_0x0165
            r0.A0E = r11
            long r1 = r0.A07
            long r5 = r5 + r1
            r0.A09 = r5
            r1 = 2
            r0.A02 = r1
            goto L_0x0000
        L_0x0165:
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r9 == r1) goto L_0x026a
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            if (r9 == r1) goto L_0x026a
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r9 == r1) goto L_0x026a
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r9 == r1) goto L_0x026a
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r9 == r1) goto L_0x026a
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r9 == r1) goto L_0x026a
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r9 == r1) goto L_0x026a
            r1 = 1701082227(0x65647473, float:6.742798E22)
            if (r9 == r1) goto L_0x026a
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r9 == r1) goto L_0x021a
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r9 == r1) goto L_0x021a
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r9 == r1) goto L_0x021a
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1937011827(0x73747473, float:1.9367711E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1668576371(0x63747473, float:4.5093966E21)
            if (r9 == r1) goto L_0x021a
            r1 = 1937011555(0x73747363, float:1.9367382E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1937011578(0x7374737a, float:1.936741E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r9 == r1) goto L_0x021a
            r1 = 1937011571(0x73747373, float:1.9367401E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r9 == r1) goto L_0x021a
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r9 == r1) goto L_0x021a
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r9 == r1) goto L_0x021a
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r9 == r1) goto L_0x021a
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r9 == r1) goto L_0x021a
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            r1 = 0
            if (r9 != r2) goto L_0x021b
        L_0x021a:
            r1 = 1
        L_0x021b:
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x023b
            int r1 = r0.A00
            if (r1 != r8) goto L_0x0cd0
            long r4 = r0.A07
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 > 0) goto L_0x0ccd
            int r1 = (int) r4
            X.SRd r11 = X.Pxe.A0P(r1)
            X.SRd r1 = r0.A0M
            byte[] r2 = r1.A02
            byte[] r1 = r11.A02
            java.lang.System.arraycopy(r2, r7, r1, r7, r8)
        L_0x0238:
            r0.A0C = r11
            goto L_0x0248
        L_0x023b:
            long r4 = r0.A07
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x0238
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            goto L_0x0d1e
        L_0x0245:
            if (r7 != 0) goto L_0x024c
            r3 = 3
        L_0x0248:
            r0.A02 = r3
            goto L_0x0000
        L_0x024c:
            long r2 = r4.Bdl()
            long r5 = r5 - r2
            int r0 = (int) r5
            if (r0 < 0) goto L_0x0cc5
            r4.Evk(r0)
            X.RzF r5 = r7.A09
            X.SRd r3 = r5.A0G
            byte[] r2 = r3.A02
            int r1 = r3.A00
            r0 = 0
            r4.readFully(r2, r0, r1)
            r3.A0O(r0)
            r5.A09 = r0
            goto L_0x0000
        L_0x026a:
            long r16 = r4.Bdl()
            long r1 = r0.A07
            long r16 = r16 + r1
            r1 = 8
            long r16 = r16 - r1
            java.util.ArrayDeque r4 = r0.A0S
            X.QEL r3 = new X.QEL
            r1 = r16
            r3.<init>(r9, r1)
            r4.push(r3)
            long r4 = r0.A07
            int r1 = r0.A00
            long r2 = (long) r1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02c4
            r0.A02 = r7
            r0.A00 = r7
            goto L_0x0000
        L_0x0291:
            long r2 = r0.A07
            int r5 = (int) r2
            int r2 = r0.A00
            int r5 = r5 - r2
            X.SRd r6 = r0.A0C
            if (r6 == 0) goto L_0x0a7f
            byte[] r3 = r6.A02
            r2 = 8
            r4.readFully(r3, r2, r5)
            int r2 = r0.A01
            X.QEK r5 = new X.QEK
            r5.<init>(r6, r2)
            long r22 = r4.Bdl()
            java.util.ArrayDeque r3 = r0.A0S
            boolean r2 = r3.isEmpty()
            if (r2 != 0) goto L_0x08c8
            java.lang.Object r1 = r3.peek()
            X.QEL r1 = (X.QEL) r1
            java.util.List r1 = r1.A02
            r1.add(r5)
        L_0x02c0:
            long r16 = r4.Bdl()
        L_0x02c4:
            java.util.ArrayDeque r4 = r0.A0S
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0a84
            java.lang.Object r1 = r4.peek()
            X.QEL r1 = (X.QEL) r1
            long r2 = r1.A00
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0a84
            java.lang.Object r34 = r4.pop()
            r1 = r34
            X.QEL r1 = (X.QEL) r1
            r34 = r1
            int r2 = r1.A00
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 != r1) goto L_0x0415
            r6 = 1
            r5 = 0
            r1 = r34
            java.util.List r1 = r1.A02
            androidx.media3.common.DrmInitData r18 = A00(r1)
            r2 = 1836475768(0x6d766578, float:4.7659988E27)
            r1 = r34
            X.QEL r1 = r1.A00(r2)
            r1.getClass()
            android.util.SparseArray r8 = X.Pxe.A0L()
            java.util.List r12 = r1.A02
            int r11 = r12.size()
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
        L_0x030f:
            if (r10 >= r11) goto L_0x036a
            java.lang.Object r3 = r12.get(r10)
            X.QEK r3 = (X.QEK) r3
            int r2 = r3.A00
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 != r1) goto L_0x0351
            X.SRd r1 = r3.A00
            r2 = 12
            int r13 = X.Pxf.A06(r1, r2)
            int r2 = r1.A01()
            int r9 = r2 + -1
            int r7 = r1.A01()
            int r4 = r1.A01()
            int r3 = r1.A01()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            X.Rvj r1 = new X.Rvj
            r1.<init>(r9, r7, r4, r3)
            android.util.Pair r1 = android.util.Pair.create(r2, r1)
            int r2 = X.Pxf.A05(r1)
            java.lang.Object r1 = r1.second
            r8.put(r2, r1)
        L_0x034e:
            int r10 = r10 + 1
            goto L_0x030f
        L_0x0351:
            int r2 = r3.A00
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 != r1) goto L_0x034e
            X.SRd r2 = r3.A00
            int r1 = X.Pxg.A04(r2)
            if (r1 != 0) goto L_0x0365
            long r22 = r2.A0C()
            goto L_0x034e
        L_0x0365:
            long r22 = r2.A0D()
            goto L_0x034e
        L_0x036a:
            X.SGx r19 = new X.SGx
            r19.<init>()
            int r1 = r0.A0K
            r1 = r1 & 16
            boolean r24 = X.AnonymousClass7TF.A1P(r1)
            r7 = 0
            X.Szs r1 = new X.Szs
            r1.<init>((java.lang.Object) r0, (int) r5)
            r20 = r34
            r21 = r1
            r25 = r5
            java.util.ArrayList r11 = X.C11399SRu.A03(r18, r19, r20, r21, r22, r24, r25)
            int r10 = r11.size()
            android.util.SparseArray r9 = r0.A0L
            int r1 = r9.size()
            if (r1 == 0) goto L_0x03d4
            int r1 = r9.size()
            if (r1 == r10) goto L_0x039a
            r6 = 0
        L_0x039a:
            X.C11366SPh.A02(r6)
        L_0x039d:
            if (r5 >= r10) goto L_0x02c4
            java.lang.Object r6 = r11.get(r5)
            X.S39 r6 = (X.S39) r6
            X.Ryn r1 = r6.A03
            int r4 = r1.A00
            java.lang.Object r3 = r9.get(r4)
            X.S75 r3 = (X.S75) r3
            int r2 = r8.size()
            r1 = 1
            if (r2 != r1) goto L_0x03cf
            java.lang.Object r1 = r8.valueAt(r7)
        L_0x03ba:
            X.Rvj r1 = (X.C10650Rvj) r1
            r3.A05 = r6
            r3.A04 = r1
            X.TjN r2 = r3.A08
            X.Ryn r1 = r6.A03
            X.SJM r1 = r1.A07
            r2.AWO(r1)
            r3.A02()
            int r5 = r5 + 1
            goto L_0x039d
        L_0x03cf:
            java.lang.Object r1 = X.C41847B3o.A15(r8, r4)
            goto L_0x03ba
        L_0x03d4:
            if (r5 >= r10) goto L_0x040e
            java.lang.Object r13 = r11.get(r5)
            X.S39 r13 = (X.S39) r13
            X.Ryn r12 = r13.A03
            X.YBZ r2 = r0.A0D
            int r1 = r12.A03
            X.TjN r4 = r2.FHV(r5, r1)
            int r3 = r12.A00
            int r1 = r8.size()
            if (r1 != r6) goto L_0x0409
            java.lang.Object r2 = r8.valueAt(r7)
        L_0x03f2:
            X.Rvj r2 = (X.C10650Rvj) r2
            X.S75 r1 = new X.S75
            r1.<init>(r4, r2, r13)
            r9.put(r3, r1)
            long r3 = r0.A08
            long r1 = r12.A04
            long r1 = java.lang.Math.max(r3, r1)
            r0.A08 = r1
            int r5 = r5 + 1
            goto L_0x03d4
        L_0x0409:
            java.lang.Object r2 = X.C41847B3o.A15(r8, r3)
            goto L_0x03f2
        L_0x040e:
            X.YBZ r1 = r0.A0D
            r1.ASU()
            goto L_0x02c4
        L_0x0415:
            r1 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r1) goto L_0x08b3
            android.util.SparseArray r1 = r0.A0L
            r50 = r1
            r7 = 0
            int r1 = r0.A0K
            r38 = r1
            byte[] r1 = r0.A0V
            r49 = r1
            r1 = r34
            java.util.List r1 = r1.A01
            r48 = r1
            int r39 = r48.size()
            r40 = 0
        L_0x0433:
            r2 = r40
            r1 = r39
            if (r2 >= r1) goto L_0x0821
            r2 = r48
            r1 = r40
            java.lang.Object r12 = r2.get(r1)
            X.QEL r12 = (X.QEL) r12
            int r2 = r12.A00
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 != r1) goto L_0x081d
            r1 = 1952868452(0x74666864, float:7.301914E31)
            X.QEK r1 = r12.A01(r1)
            r1.getClass()
            X.SRd r6 = r1.A00
            r13 = 8
            int r8 = X.Pxf.A06(r6, r13)
            r41 = 16777215(0xffffff, float:2.3509886E-38)
            r8 = r8 & r41
            int r2 = r6.A01()
            r1 = r50
            java.lang.Object r9 = r1.get(r2)
            X.S75 r9 = (X.S75) r9
            if (r9 == 0) goto L_0x081d
            r1 = r8 & 1
            if (r1 == 0) goto L_0x047d
            long r1 = r6.A0D()
            X.RzF r3 = r9.A09
            r3.A03 = r1
            r3.A02 = r1
        L_0x047d:
            X.Rvj r2 = r9.A04
            r1 = r8 & 2
            if (r1 == 0) goto L_0x0819
            int r1 = r6.A01()
            int r5 = r1 + -1
        L_0x0489:
            r1 = r8 & 8
            if (r1 == 0) goto L_0x0815
            int r4 = r6.A01()
        L_0x0491:
            r1 = r8 & 16
            if (r1 == 0) goto L_0x0811
            int r3 = r6.A01()
        L_0x0499:
            r1 = r8 & 32
            if (r1 == 0) goto L_0x080d
            int r2 = r6.A01()
        L_0x04a1:
            X.RzF r6 = r9.A09
            X.Rvj r1 = new X.Rvj
            r1.<init>(r5, r4, r3, r2)
            r6.A05 = r1
            long r1 = r6.A04
            boolean r8 = r6.A08
            r9.A02()
            r5 = 1
            r9.A06 = r5
            r3 = 1952867444(0x74666474, float:7.3014264E31)
            X.QEK r4 = r12.A01(r3)
            if (r4 == 0) goto L_0x0807
            r3 = r38 & 2
            if (r3 != 0) goto L_0x0807
            X.SRd r2 = r4.A00
            int r1 = X.Pxg.A04(r2)
            if (r1 != r5) goto L_0x0801
            long r1 = r2.A0D()
        L_0x04cd:
            r6.A04 = r1
            r6.A08 = r5
        L_0x04d1:
            java.util.List r1 = r12.A02
            r47 = r1
            int r37 = r47.size()
            r36 = 0
            r4 = 0
            r3 = 0
            r2 = 0
        L_0x04de:
            r35 = 1953658222(0x7472756e, float:7.683823E31)
            r1 = r37
            if (r4 >= r1) goto L_0x0503
            r1 = r47
            java.lang.Object r10 = r1.get(r4)
            X.QEK r10 = (X.QEK) r10
            int r8 = r10.A00
            r1 = r35
            if (r8 != r1) goto L_0x0500
            X.SRd r8 = r10.A00
            r1 = 12
            int r1 = X.Pxe.A07(r8, r1)
            if (r1 <= 0) goto L_0x0500
            int r2 = r2 + r1
            int r3 = r3 + 1
        L_0x0500:
            int r4 = r4 + 1
            goto L_0x04de
        L_0x0503:
            r9.A02 = r7
            r9.A00 = r7
            r9.A01 = r7
            r6.A01 = r3
            r6.A00 = r2
            int[] r1 = r6.A0B
            int r1 = r1.length
            if (r1 >= r3) goto L_0x051a
            long[] r1 = new long[r3]
            r6.A0D = r1
            int[] r1 = new int[r3]
            r6.A0B = r1
        L_0x051a:
            int[] r1 = r6.A0A
            int r1 = r1.length
            if (r1 >= r2) goto L_0x0533
            int r1 = r2 * 125
            int r2 = r1 / 100
            int[] r1 = new int[r2]
            r6.A0A = r1
            long[] r1 = new long[r2]
            r6.A0C = r1
            boolean[] r1 = new boolean[r2]
            r6.A0F = r1
            boolean[] r1 = new boolean[r2]
            r6.A0E = r1
        L_0x0533:
            r21 = 0
            r8 = 0
        L_0x0536:
            r2 = r37
            r1 = r36
            if (r1 >= r2) goto L_0x0666
            r2 = r47
            java.lang.Object r3 = r2.get(r1)
            X.QEK r3 = (X.QEK) r3
            int r2 = r3.A00
            r1 = r35
            if (r2 != r1) goto L_0x0662
            int r33 = r21 + 1
            X.SRd r1 = r3.A00
            r46 = r1
            int r4 = X.Pxf.A06(r1, r13)
            r4 = r4 & r41
            X.S39 r1 = r9.A05
            X.Ryn r3 = r1.A03
            X.Rvj r1 = r6.A05
            r45 = r1
            int[] r2 = r6.A0B
            int r1 = r46.A07()
            r2[r21] = r1
            long[] r14 = r6.A0D
            long r1 = r6.A03
            r14[r21] = r1
            r10 = r4 & 1
            if (r10 == 0) goto L_0x0578
            int r10 = r46.A01()
            long r10 = (long) r10
            long r1 = r1 + r10
            r14[r21] = r1
        L_0x0578:
            r1 = r4 & 4
            boolean r32 = X.AnonymousClass7TF.A1P(r1)
            r1 = r45
            int r1 = r1.A01
            r31 = r1
            r44 = r1
            if (r32 == 0) goto L_0x058c
            int r31 = r46.A01()
        L_0x058c:
            r1 = r4 & 256(0x100, float:3.59E-43)
            boolean r30 = X.AnonymousClass7TF.A1P(r1)
            r1 = r4 & 512(0x200, float:7.175E-43)
            boolean r29 = X.AnonymousClass7TF.A1P(r1)
            r1 = r4 & 1024(0x400, float:1.435E-42)
            boolean r28 = X.AnonymousClass7TF.A1P(r1)
            r1 = r4 & 2048(0x800, float:2.87E-42)
            boolean r20 = X.AnonymousClass7TF.A1P(r1)
            r18 = 0
            long[] r1 = r3.A08
            if (r1 == 0) goto L_0x05c8
            int r2 = r1.length
            if (r2 != r5) goto L_0x05c8
            long[] r4 = r3.A09
            if (r4 == 0) goto L_0x05c8
            r1 = r1[r7]
            int r10 = (r1 > r18 ? 1 : (r1 == r18 ? 0 : -1))
            if (r10 == 0) goto L_0x05c6
            r10 = r4[r7]
            long r1 = r1 + r10
            long r10 = r3.A05
            long r14 = androidx.media3.common.util.Util.A05(r1, r10)
            long r1 = r3.A04
            int r10 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r10 < 0) goto L_0x05c8
        L_0x05c6:
            r18 = r4[r7]
        L_0x05c8:
            int[] r1 = r6.A0A
            r27 = r1
            long[] r1 = r6.A0C
            r26 = r1
            boolean[] r1 = r6.A0F
            r25 = r1
            int r2 = r3.A03
            r1 = 2
            if (r2 != r1) goto L_0x05df
            r1 = r38 & 1
            r24 = 1
            if (r1 != 0) goto L_0x05e1
        L_0x05df:
            r24 = 0
        L_0x05e1:
            int[] r1 = r6.A0B
            r1 = r1[r21]
            int r23 = r8 + r1
            long r1 = r3.A06
            r42 = r1
            long r10 = r6.A04
        L_0x05ed:
            r1 = r23
            if (r8 >= r1) goto L_0x065d
            if (r30 == 0) goto L_0x0658
            int r15 = r46.A01()
        L_0x05f7:
            if (r15 < 0) goto L_0x0ce9
            if (r29 == 0) goto L_0x0653
            int r14 = r46.A01()
        L_0x05ff:
            if (r14 < 0) goto L_0x0cf6
            if (r28 == 0) goto L_0x0646
            int r22 = r46.A01()
            r21 = r32
        L_0x0609:
            if (r20 == 0) goto L_0x0642
            int r1 = r46.A01()
            r20 = 1
        L_0x0611:
            long r3 = (long) r1
            long r3 = r3 + r10
            long r3 = r3 - r18
            r1 = r42
            long r1 = androidx.media3.common.util.Util.A05(r3, r1)
            r26[r8] = r1
            boolean r1 = r6.A08
            if (r1 != 0) goto L_0x062a
            r3 = r26[r8]
            X.S39 r1 = r9.A05
            long r1 = r1.A02
            long r3 = r3 + r1
            r26[r8] = r3
        L_0x062a:
            r27[r8] = r14
            int r1 = r22 >> 16
            r1 = r1 & 1
            if (r1 != 0) goto L_0x0640
            if (r24 == 0) goto L_0x0636
            if (r8 != 0) goto L_0x0640
        L_0x0636:
            r1 = 1
        L_0x0637:
            r25[r8] = r1
            long r1 = (long) r15
            long r10 = r10 + r1
            int r8 = r8 + 1
            r32 = r21
            goto L_0x05ed
        L_0x0640:
            r1 = 0
            goto L_0x0637
        L_0x0642:
            r20 = 0
            r1 = 0
            goto L_0x0611
        L_0x0646:
            if (r8 != 0) goto L_0x064e
            r21 = 1
            r22 = r31
            if (r32 != 0) goto L_0x0609
        L_0x064e:
            r21 = r32
            r22 = r44
            goto L_0x0609
        L_0x0653:
            r1 = r45
            int r14 = r1.A03
            goto L_0x05ff
        L_0x0658:
            r1 = r45
            int r15 = r1.A00
            goto L_0x05f7
        L_0x065d:
            r6.A04 = r10
            r8 = r1
            r21 = r33
        L_0x0662:
            int r36 = r36 + 1
            goto L_0x0536
        L_0x0666:
            X.S39 r1 = r9.A05
            X.Ryn r3 = r1.A03
            X.Rvj r1 = r6.A05
            r1.getClass()
            int r2 = r1.A02
            X.Rwy[] r1 = r3.A0A
            r3 = r1[r2]
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            X.QEK r1 = r12.A01(r1)
            if (r1 == 0) goto L_0x06d0
            r3.getClass()
            X.SRd r10 = r1.A00
            int r9 = r3.A00
            int r1 = X.Pxf.A06(r10, r13)
            r1 = r1 & r41
            r2 = 1
            r1 = r1 & 1
            if (r1 != r5) goto L_0x0693
            r10.A0P(r13)
        L_0x0693:
            int r8 = r10.A05()
            int r4 = r10.A07()
            int r15 = r6.A00
            if (r4 > r15) goto L_0x0cd3
            if (r8 != 0) goto L_0x06b5
            boolean[] r11 = r6.A0E
            r2 = 0
            r8 = 0
        L_0x06a5:
            if (r2 >= r4) goto L_0x06be
            int r1 = r10.A05()
            int r8 = r8 + r1
            boolean r1 = X.C51970G9q.A1W(r1, r9)
            r11[r2] = r1
            int r2 = r2 + 1
            goto L_0x06a5
        L_0x06b5:
            if (r8 > r9) goto L_0x06b8
            r2 = 0
        L_0x06b8:
            int r8 = r8 * r4
            boolean[] r1 = r6.A0E
            java.util.Arrays.fill(r1, r7, r4, r2)
        L_0x06be:
            boolean[] r2 = r6.A0E
            int r1 = r6.A00
            java.util.Arrays.fill(r2, r4, r1, r7)
            if (r8 <= 0) goto L_0x06d0
            X.SRd r1 = r6.A0G
            r1.A0M(r8)
            r6.A07 = r5
            r6.A09 = r5
        L_0x06d0:
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            X.QEK r1 = r12.A01(r1)
            if (r1 == 0) goto L_0x06fd
            X.SRd r8 = r1.A00
            int r2 = X.Pxf.A06(r8, r13)
            r1 = r2 & r41
            r1 = r1 & 1
            if (r1 != r5) goto L_0x06e8
            r8.A0P(r13)
        L_0x06e8:
            int r15 = r8.A07()
            if (r15 != r5) goto L_0x0ce2
            int r1 = r2 >> 24
            r4 = r1 & 255(0xff, float:3.57E-43)
            long r1 = r6.A02
            if (r4 != 0) goto L_0x074a
            long r8 = r8.A0C()
        L_0x06fa:
            long r1 = r1 + r8
            r6.A02 = r1
        L_0x06fd:
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            X.QEK r1 = r12.A01(r1)
            if (r1 == 0) goto L_0x070b
            X.SRd r1 = r1.A00
            A01(r1, r6, r7)
        L_0x070b:
            if (r3 == 0) goto L_0x0748
            java.lang.String r10 = r3.A02
        L_0x070f:
            r9 = 0
            r14 = r9
            r8 = r9
            r12 = 0
        L_0x0713:
            int r1 = r47.size()
            if (r12 >= r1) goto L_0x074f
            r1 = r47
            java.lang.Object r15 = r1.get(r12)
            X.QEK r15 = (X.QEK) r15
            X.SRd r11 = r15.A00
            int r2 = r15.A00
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            r4 = 1936025959(0x73656967, float:1.817587E31)
            r3 = 12
            if (r2 != r1) goto L_0x0739
            int r1 = X.Pxf.A06(r11, r3)
            if (r1 != r4) goto L_0x0736
            r14 = r11
        L_0x0736:
            int r12 = r12 + 1
            goto L_0x0713
        L_0x0739:
            int r2 = r15.A00
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 != r1) goto L_0x0736
            int r1 = X.Pxf.A06(r11, r3)
            if (r1 != r4) goto L_0x0736
            r8 = r11
            goto L_0x0736
        L_0x0748:
            r10 = 0
            goto L_0x070f
        L_0x074a:
            long r8 = r8.A0D()
            goto L_0x06fa
        L_0x074f:
            if (r14 == 0) goto L_0x07cd
            if (r8 == 0) goto L_0x07cd
            int r1 = X.Pxg.A04(r14)
            r3 = 4
            r14.A0P(r3)
            if (r1 != r5) goto L_0x0760
            r14.A0P(r3)
        L_0x0760:
            int r1 = r14.A01()
            if (r1 != r5) goto L_0x0781
            int r2 = X.Pxg.A04(r8)
            r8.A0P(r3)
            if (r2 != r5) goto L_0x0784
            long r11 = r8.A0C()
            r2 = 0
            int r1 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x078a
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
        L_0x077b:
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r9, r5, r7)
            throw r2
        L_0x0781:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            goto L_0x077b
        L_0x0784:
            r1 = 2
            if (r2 < r1) goto L_0x078a
            r8.A0P(r3)
        L_0x078a:
            long r11 = r8.A0C()
            r2 = 1
            int r1 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x07fd
            int r2 = X.Pxf.A07(r8, r5)
            r1 = r2 & 240(0xf0, float:3.36E-43)
            int r23 = r1 >> 4
            r24 = r2 & 15
            int r1 = r8.A05()
            if (r1 != r5) goto L_0x07cd
            int r22 = r8.A05()
            r1 = 16
            byte[] r2 = new byte[r1]
            r8.A0R(r2, r7, r1)
            if (r22 != 0) goto L_0x07ba
            int r1 = r8.A05()
            byte[] r9 = new byte[r1]
            r8.A0R(r9, r7, r1)
        L_0x07ba:
            r6.A07 = r5
            X.Rwy r1 = new X.Rwy
            r18 = r1
            r19 = r10
            r20 = r2
            r21 = r9
            r25 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r6.A06 = r1
        L_0x07cd:
            int r8 = r47.size()
            r5 = 0
        L_0x07d2:
            if (r5 >= r8) goto L_0x081d
            r1 = r47
            java.lang.Object r3 = r1.get(r5)
            X.QEK r3 = (X.QEK) r3
            int r2 = r3.A00
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 != r1) goto L_0x07fa
            X.SRd r4 = r3.A00
            r4.A0O(r13)
            r3 = 16
            r1 = r49
            r4.A0R(r1, r7, r3)
            byte[] r2 = A0Y
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x07fa
            A01(r4, r6, r3)
        L_0x07fa:
            int r5 = r5 + 1
            goto L_0x07d2
        L_0x07fd:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            goto L_0x077b
        L_0x0801:
            long r1 = r2.A0C()
            goto L_0x04cd
        L_0x0807:
            r6.A04 = r1
            r6.A08 = r8
            goto L_0x04d1
        L_0x080d:
            int r2 = r2.A01
            goto L_0x04a1
        L_0x0811:
            int r3 = r2.A03
            goto L_0x0499
        L_0x0815:
            int r4 = r2.A00
            goto L_0x0491
        L_0x0819:
            int r5 = r2.A02
            goto L_0x0489
        L_0x081d:
            int r40 = r40 + 1
            goto L_0x0433
        L_0x0821:
            r1 = r34
            java.util.List r1 = r1.A02
            androidx.media3.common.DrmInitData r6 = A00(r1)
            if (r6 == 0) goto L_0x0878
            int r5 = r50.size()
            r4 = 0
        L_0x0830:
            if (r4 >= r5) goto L_0x0878
            r1 = r50
            java.lang.Object r8 = r1.valueAt(r4)
            X.S75 r8 = (X.S75) r8
            X.S39 r1 = r8.A05
            X.Ryn r3 = r1.A03
            X.RzF r1 = r8.A09
            X.Rvj r1 = r1.A05
            int r2 = r1.A02
            X.Rwy[] r1 = r3.A0A
            r1 = r1[r2]
            if (r1 == 0) goto L_0x0876
            java.lang.String r3 = r1.A02
        L_0x084c:
            java.lang.String r1 = r6.A02
            boolean r1 = androidx.media3.common.util.Util.A0E(r1, r3)
            if (r1 == 0) goto L_0x086e
            r1 = r6
        L_0x0855:
            X.S39 r2 = r8.A05
            X.Ryn r2 = r2.A03
            X.SJM r3 = r2.A07
            X.SOW r2 = new X.SOW
            r2.<init>(r3)
            r2.A0O = r1
            X.SJM r2 = X.Pxe.A0O(r2)
            X.TjN r1 = r8.A08
            r1.AWO(r2)
            int r4 = r4 + 1
            goto L_0x0830
        L_0x086e:
            androidx.media3.common.DrmInitData$SchemeData[] r2 = r6.A03
            androidx.media3.common.DrmInitData r1 = new androidx.media3.common.DrmInitData
            r1.<init>(r3, r2, r7)
            goto L_0x0855
        L_0x0876:
            r3 = 0
            goto L_0x084c
        L_0x0878:
            long r4 = r0.A0A
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02c4
            int r10 = r50.size()
        L_0x0887:
            if (r7 >= r10) goto L_0x08af
            r1 = r50
            java.lang.Object r11 = r1.valueAt(r7)
            X.S75 r11 = (X.S75) r11
            int r6 = r11.A01
        L_0x0893:
            X.RzF r12 = r11.A09
            int r1 = r12.A00
            if (r6 >= r1) goto L_0x08ac
            long[] r1 = r12.A0C
            r8 = r1[r6]
            int r1 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x08ac
            boolean[] r1 = r12.A0F
            boolean r1 = r1[r6]
            if (r1 == 0) goto L_0x08a9
            r11.A03 = r6
        L_0x08a9:
            int r6 = r6 + 1
            goto L_0x0893
        L_0x08ac:
            int r7 = r7 + 1
            goto L_0x0887
        L_0x08af:
            r0.A0A = r2
            goto L_0x02c4
        L_0x08b3:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x02c4
            java.lang.Object r1 = r4.peek()
            X.QEL r1 = (X.QEL) r1
            java.util.List r2 = r1.A01
            r1 = r34
            r2.add(r1)
            goto L_0x02c4
        L_0x08c8:
            int r3 = r5.A00
            r2 = 1936286840(0x73696478, float:1.8491255E31)
            if (r3 != r2) goto L_0x095c
            X.SRd r15 = r5.A00
            int r3 = X.Pxg.A04(r15)
            r2 = 4
            r15.A0P(r2)
            long r5 = r15.A0C()
            if (r3 != 0) goto L_0x0931
            long r2 = r15.A0C()
            long r7 = r15.A0C()
        L_0x08e7:
            long r22 = r22 + r7
            long r20 = androidx.media3.common.util.Util.A05(r2, r5)
            r7 = 2
            r15.A0P(r7)
            int r14 = r15.A08()
            int[] r13 = new int[r14]
            long[] r12 = new long[r14]
            long[] r11 = new long[r14]
            long[] r10 = new long[r14]
            r18 = r20
            r9 = 0
        L_0x0900:
            if (r9 >= r14) goto L_0x093a
            int r8 = r15.A01()
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 & r8
            if (r7 != 0) goto L_0x0d0d
            long r16 = r15.A0C()
            r7 = 2147483647(0x7fffffff, float:NaN)
            r8 = r8 & r7
            r13[r9] = r8
            r12[r9] = r22
            r10[r9] = r18
            long r2 = r2 + r16
            long r18 = androidx.media3.common.util.Util.A05(r2, r5)
            r16 = r10[r9]
            long r7 = r18 - r16
            r11[r9] = r7
            r7 = 4
            r15.A0P(r7)
            r7 = r13[r9]
            long r7 = (long) r7
            long r22 = r22 + r7
            int r9 = r9 + 1
            goto L_0x0900
        L_0x0931:
            long r2 = r15.A0D()
            long r7 = r15.A0D()
            goto L_0x08e7
        L_0x093a:
            java.lang.Long r3 = java.lang.Long.valueOf(r20)
            X.Sf6 r2 = new X.Sf6
            r2.<init>(r13, r12, r11, r10)
            android.util.Pair r5 = android.util.Pair.create(r3, r2)
            java.lang.Object r2 = r5.first
            long r2 = X.AnonymousClass7TE.A0R(r2)
            r0.A0B = r2
            X.YBZ r3 = r0.A0D
            java.lang.Object r2 = r5.second
            X.Tbc r2 = (X.C13511Tbc) r2
            r3.EKw(r2)
            r0.A0G = r1
            goto L_0x02c0
        L_0x095c:
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r3 != r2) goto L_0x02c0
            X.SRd r2 = r5.A00
            r14 = r2
            X.TjN[] r2 = r0.A0J
            int r2 = r2.length
            if (r2 == 0) goto L_0x02c0
            int r2 = X.Pxg.A04(r14)
            r19 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0983
            if (r2 == r1) goto L_0x09bc
            java.lang.String r1 = "Skipping unsupported emsg version: "
            java.lang.String r2 = X.002.A0O(r1, r2)
            java.lang.String r1 = "FragmentedMp4Extractor"
            X.STH.A03(r1, r2)
            goto L_0x02c0
        L_0x0983:
            r11 = 0
            java.lang.String r18 = r14.A0F()
            r18.getClass()
            java.lang.String r17 = r14.A0F()
            r17.getClass()
            long r5 = r14.A0C()
            long r2 = r14.A0C()
            long r9 = androidx.media3.common.util.Util.A05(r2, r5)
            long r2 = r0.A0B
            int r7 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            if (r7 == 0) goto L_0x09b6
            long r2 = r2 + r9
        L_0x09a5:
            long r21 = r14.A0C()
            r23 = 1000(0x3e8, double:4.94E-321)
            r25 = r5
            long r7 = androidx.media3.common.util.Util.A06(r21, r23, r25)
            long r5 = r14.A0C()
            goto L_0x09ea
        L_0x09b6:
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x09a5
        L_0x09bc:
            long r9 = r14.A0C()
            long r2 = r14.A0D()
            long r2 = androidx.media3.common.util.Util.A05(r2, r9)
            long r5 = r14.A0C()
            r7 = 1000(0x3e8, double:4.94E-321)
            long r7 = androidx.media3.common.util.Util.A06(r5, r7, r9)
            long r5 = r14.A0C()
            r11 = 0
            java.lang.String r18 = r14.A0F()
            r18.getClass()
            java.lang.String r17 = r14.A0F()
            r17.getClass()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x09ea:
            int r16 = X.Pxe.A06(r14)
            r12 = r16
            byte[] r12 = new byte[r12]
            r21 = r12
            r13 = 0
            r15 = r14
            r14 = r12
            r12 = r16
            r15.A0R(r14, r11, r12)
            android.os.Parcelable$Creator r12 = androidx.media3.extractor.metadata.emsg.EventMessage.CREATOR
            X.Rqi r14 = r0.A0R
            java.io.ByteArrayOutputStream r12 = r14.A00
            r15 = r12
            r12.reset()
            java.io.DataOutputStream r14 = r14.A01     // Catch:{ IOException -> 0x0d16 }
            r12 = r18
            r14.writeBytes(r12)     // Catch:{ IOException -> 0x0d16 }
            r14.writeByte(r11)     // Catch:{ IOException -> 0x0d16 }
            if (r17 != 0) goto L_0x0a14
            java.lang.String r17 = ""
        L_0x0a14:
            r12 = r17
            r14.writeBytes(r12)     // Catch:{ IOException -> 0x0d16 }
            r14.writeByte(r11)     // Catch:{ IOException -> 0x0d16 }
            r14.writeLong(r7)     // Catch:{ IOException -> 0x0d16 }
            r14.writeLong(r5)     // Catch:{ IOException -> 0x0d16 }
            r5 = r21
            r14.write(r5)     // Catch:{ IOException -> 0x0d16 }
            r14.flush()     // Catch:{ IOException -> 0x0d16 }
            byte[] r5 = r15.toByteArray()     // Catch:{ IOException -> 0x0d16 }
            X.SRd r14 = new X.SRd
            r14.<init>(r5)
            int r7 = X.Pxe.A06(r14)
            X.TjN[] r12 = r0.A0J
            int r8 = r12.length
            r6 = 0
        L_0x0a3b:
            if (r6 >= r8) goto L_0x0a48
            r5 = r12[r6]
            r14.A0O(r11)
            r5.EJf(r14, r7)
            int r6 = r6 + 1
            goto L_0x0a3b
        L_0x0a48:
            int r5 = (r2 > r19 ? 1 : (r2 == r19 ? 0 : -1))
            java.util.ArrayDeque r6 = r0.A0T
            if (r5 != 0) goto L_0x0a5d
            X.RtR r5 = new X.RtR
            r5.<init>(r9, r7, r1)
        L_0x0a53:
            r6.addLast(r5)
            int r1 = r0.A03
            int r1 = r1 + r7
            r0.A03 = r1
            goto L_0x02c0
        L_0x0a5d:
            boolean r5 = r6.isEmpty()
            if (r5 != 0) goto L_0x0a69
            X.RtR r5 = new X.RtR
            r5.<init>(r2, r7, r11)
            goto L_0x0a53
        L_0x0a69:
            X.TjN[] r6 = r0.A0J
            int r5 = r6.length
        L_0x0a6c:
            if (r13 >= r5) goto L_0x02c0
            r14 = r6[r13]
            r15 = 0
            r16 = r1
            r17 = r7
            r18 = r11
            r19 = r2
            r14.EJm(r15, r16, r17, r18, r19)
            int r13 = r13 + 1
            goto L_0x0a6c
        L_0x0a7f:
            r4.Evk(r5)
            goto L_0x02c0
        L_0x0a84:
            r1 = 0
            r0.A02 = r1
            r0.A00 = r1
            goto L_0x0000
        L_0x0a8b:
            boolean r2 = r12.A06
            if (r2 != 0) goto L_0x0cb0
            X.S39 r2 = r12.A05
            long[] r3 = r2.A06
            int r2 = r12.A01
        L_0x0a95:
            r2 = r3[r2]
            long r6 = r4.Bdl()
            long r2 = r2 - r6
            int r6 = (int) r2
            if (r6 >= 0) goto L_0x0aa7
            java.lang.String r3 = "FragmentedMp4Extractor"
            java.lang.String r2 = "Ignoring negative offset to sample data."
            X.STH.A03(r3, r2)
            r6 = 0
        L_0x0aa7:
            r4.Evk(r6)
            r0.A0E = r12
        L_0x0aac:
            int r3 = r0.A02
            r19 = 3
            r14 = 4
            r2 = r19
            if (r3 != r2) goto L_0x0b4e
            boolean r2 = r12.A06
            if (r2 != 0) goto L_0x0b00
            X.S39 r2 = r12.A05
            int[] r2 = r2.A05
        L_0x0abd:
            int r6 = r12.A01
            r3 = r2[r6]
            r0.A06 = r3
            int r2 = r12.A03
            if (r6 >= r2) goto L_0x0b05
            r4.Evk(r3)
            X.Rwy r1 = r12.A01()
            if (r1 == 0) goto L_0x0af0
            X.RzF r4 = r12.A09
            X.SRd r3 = r4.A0G
            int r1 = r1.A00
            if (r1 == 0) goto L_0x0adb
            r3.A0P(r1)
        L_0x0adb:
            int r2 = r12.A01
            boolean r1 = r4.A07
            if (r1 == 0) goto L_0x0af0
            boolean[] r1 = r4.A0E
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x0af0
            int r1 = r3.A08()
            int r1 = r1 * 6
            r3.A0P(r1)
        L_0x0af0:
            boolean r1 = r12.A03()
            if (r1 != 0) goto L_0x0afa
            r1 = r20
            r0.A0E = r1
        L_0x0afa:
            r1 = r19
            r0.A02 = r1
            r0 = 0
            return r0
        L_0x0b00:
            X.RzF r2 = r12.A09
            int[] r2 = r2.A0A
            goto L_0x0abd
        L_0x0b05:
            X.S39 r2 = r12.A05
            X.Ryn r2 = r2.A03
            int r2 = r2.A02
            if (r2 != r1) goto L_0x0b15
            r2 = 8
            int r3 = r3 - r2
            r0.A06 = r3
            r4.Evk(r2)
        L_0x0b15:
            X.S39 r2 = r12.A05
            X.Ryn r2 = r2.A03
            X.SJM r2 = r2.A07
            java.lang.String r3 = r2.A0Y
            java.lang.String r2 = "audio/ac4"
            boolean r3 = r2.equals(r3)
            int r2 = r0.A06
            if (r3 == 0) goto L_0x0c23
            r7 = 7
            int r2 = r12.A00(r2, r7)
            r0.A04 = r2
            int r6 = r0.A06
            X.SRd r3 = r0.A0Q
            r3.A0M(r7)
            byte[] r2 = r3.A02
            X.Pxk.A0g(r2, r6)
            X.TjN r2 = r12.A08
            r2.EJf(r3, r7)
            int r2 = r0.A04
            int r3 = r2 + 7
        L_0x0b43:
            r0.A04 = r3
            int r2 = r0.A06
            int r2 = r2 + r3
            r0.A06 = r2
            r0.A02 = r14
            r0.A05 = r13
        L_0x0b4e:
            X.S39 r3 = r12.A05
            X.Ryn r11 = r3.A03
            X.TjN r10 = r12.A08
            boolean r2 = r12.A06
            if (r2 != 0) goto L_0x0c19
            long[] r3 = r3.A07
            int r2 = r12.A01
            r2 = r3[r2]
        L_0x0b5e:
            int r6 = r11.A01
            if (r6 == 0) goto L_0x0c29
            X.SRd r9 = r0.A0O
            byte[] r8 = r9.A02
            r8[r13] = r13
            r8[r1] = r13
            r8[r5] = r13
            int r18 = r6 + 1
            int r17 = 4 - r6
        L_0x0b70:
            int r6 = r0.A04
            int r5 = r0.A06
            if (r6 >= r5) goto L_0x0c3a
            int r6 = r0.A05
            if (r6 != 0) goto L_0x0bd1
            r6 = r17
            r5 = r18
            r4.readFully(r8, r6, r5)
            int r5 = X.Pxf.A06(r9, r13)
            if (r5 < r1) goto L_0x0cb8
            int r5 = r5 + -1
            r0.A05 = r5
            X.SRd r5 = r0.A0P
            r5.A0O(r13)
            r10.EJf(r5, r14)
            r10.EJf(r9, r1)
            X.TjN[] r5 = r0.A0I
            int r5 = r5.length
            if (r5 <= 0) goto L_0x0bcf
            X.SJM r5 = r11.A07
            java.lang.String r7 = r5.A0Y
            byte r15 = r8[r14]
            java.lang.String r5 = "video/avc"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0baf
            r6 = r15 & 31
            r5 = 6
            if (r6 == r5) goto L_0x0bbf
        L_0x0baf:
            java.lang.String r5 = "video/hevc"
            boolean r5 = r5.equals(r7)
            if (r5 == 0) goto L_0x0bcf
            r6 = r15 & 126(0x7e, float:1.77E-43)
            int r6 = r6 >> r1
            r5 = 39
            if (r6 != r5) goto L_0x0bcf
        L_0x0bbf:
            r5 = 1
        L_0x0bc0:
            r0.A0H = r5
            int r5 = r0.A04
            int r5 = r5 + 5
            r0.A04 = r5
            int r5 = r0.A06
            int r5 = r5 + r17
            r0.A06 = r5
            goto L_0x0b70
        L_0x0bcf:
            r5 = 0
            goto L_0x0bc0
        L_0x0bd1:
            boolean r5 = r0.A0H
            if (r5 == 0) goto L_0x0c14
            X.SRd r7 = r0.A0N
            r7.A0M(r6)
            byte[] r5 = r7.A02
            r4.readFully(r5, r13, r6)
            int r5 = r0.A05
            r10.EJf(r7, r5)
            int r6 = r0.A05
            byte[] r5 = r7.A02
            r15 = r5
            int r5 = r7.A00
            int r16 = X.SS3.A00(r15, r5)
            X.SJM r5 = r11.A07
            java.lang.String r5 = r5.A0Y
            r15 = r5
            java.lang.String r5 = "video/hevc"
            boolean r5 = r5.equals(r15)
            r7.A0O(r5)
            r5 = r16
            r7.A0N(r5)
            X.TjN[] r5 = r0.A0I
            X.C11053S7y.A00(r7, r5, r2)
        L_0x0c08:
            int r5 = r0.A04
            int r5 = r5 + r6
            r0.A04 = r5
            int r5 = r0.A05
            int r5 = r5 - r6
            r0.A05 = r5
            goto L_0x0b70
        L_0x0c14:
            int r6 = r10.EJe(r4, r6, r13)
            goto L_0x0c08
        L_0x0c19:
            X.RzF r2 = r12.A09
            int r3 = r12.A01
            long[] r2 = r2.A0C
            r2 = r2[r3]
            goto L_0x0b5e
        L_0x0c23:
            int r3 = r12.A00(r2, r13)
            goto L_0x0b43
        L_0x0c29:
            int r6 = r0.A04
            int r5 = r0.A06
            if (r6 >= r5) goto L_0x0c3a
            int r5 = r5 - r6
            int r6 = r10.EJe(r4, r5, r13)
            int r5 = r0.A04
            int r5 = r5 + r6
            r0.A04 = r5
            goto L_0x0c29
        L_0x0c3a:
            boolean r4 = r12.A06
            if (r4 != 0) goto L_0x0c97
            X.S39 r4 = r12.A05
            int[] r6 = r4.A04
            int r4 = r12.A01
            r23 = r6[r4]
        L_0x0c46:
            X.Rwy r6 = r12.A01()
            if (r6 == 0) goto L_0x0c95
            r4 = 1073741824(0x40000000, float:2.0)
            r23 = r23 | r4
            X.S4h r4 = r6.A01
        L_0x0c52:
            r24 = r5
            r25 = r13
            r26 = r2
            r21 = r10
            r22 = r4
            r21.EJm(r22, r23, r24, r25, r26)
        L_0x0c5f:
            java.util.ArrayDeque r5 = r0.A0T
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x0ca4
            java.lang.Object r6 = r5.removeFirst()
            X.RtR r6 = (X.C10512RtR) r6
            int r4 = r0.A03
            int r10 = r6.A00
            int r4 = r4 - r10
            r0.A03 = r4
            long r4 = r6.A01
            boolean r6 = r6.A02
            if (r6 == 0) goto L_0x0c7b
            long r4 = r4 + r2
        L_0x0c7b:
            X.TjN[] r9 = r0.A0J
            int r8 = r9.length
            r7 = 0
        L_0x0c7f:
            if (r7 >= r8) goto L_0x0c5f
            r21 = r9[r7]
            int r6 = r0.A03
            r22 = r20
            r23 = r1
            r24 = r10
            r25 = r6
            r26 = r4
            r21.EJm(r22, r23, r24, r25, r26)
            int r7 = r7 + 1
            goto L_0x0c7f
        L_0x0c95:
            r4 = 0
            goto L_0x0c52
        L_0x0c97:
            X.RzF r4 = r12.A09
            boolean[] r6 = r4.A0F
            int r4 = r12.A01
            boolean r4 = r6[r4]
            boolean r23 = X.AnonymousClass7TF.A1P(r4)
            goto L_0x0c46
        L_0x0ca4:
            boolean r1 = r12.A03()
            if (r1 != 0) goto L_0x0afa
            r1 = r20
            r0.A0E = r1
            goto L_0x0afa
        L_0x0cb0:
            X.RzF r2 = r12.A09
            long[] r3 = r2.A0D
            int r2 = r12.A02
            goto L_0x0a95
        L_0x0cb8:
            java.lang.String r3 = "Invalid NAL length"
            goto L_0x0cbd
        L_0x0cbb:
            java.lang.String r3 = "Offset to end of mdat was negative."
        L_0x0cbd:
            X.XQX r2 = new X.XQX
            r0 = r20
            r2.<init>(r3, r0, r1, r1)
            throw r2
        L_0x0cc5:
            java.lang.String r0 = "Offset to encryption data was negative."
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r9, r1, r1)
            throw r2
        L_0x0ccd:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            goto L_0x0d1e
        L_0x0cd0:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            goto L_0x0d1e
        L_0x0cd3:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Saiz sample count "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " is greater than fragment sample count"
            goto L_0x0cef
        L_0x0ce2:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected saio entry count: "
            goto L_0x0cef
        L_0x0ce9:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected negative value: "
        L_0x0cef:
            r1.append(r0)
            r1.append(r15)
            goto L_0x0d02
        L_0x0cf6:
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected negative value: "
            r1.append(r0)
            r1.append(r14)
        L_0x0d02:
            java.lang.String r1 = r1.toString()
            r0 = 0
            X.XQX r2 = new X.XQX
            r2.<init>(r1, r0, r5, r5)
            throw r2
        L_0x0d0d:
            r3 = 0
            java.lang.String r0 = "Unhandled indirect reference"
            X.XQX r2 = new X.XQX
            r2.<init>(r0, r3, r1, r1)
            throw r2
        L_0x0d16:
            r0 = move-exception
            java.lang.RuntimeException r2 = X.C41845B3m.A0j(r0)
            throw r2
        L_0x0d1c:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
        L_0x0d1e:
            r0 = 0
            X.XQX r2 = new X.XQX
            r2.<init>(r1, r0, r3, r7)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11695Ses.E67(X.TlA, X.XYr):int");
    }

    public final void EKu(long j, long j2) {
        SparseArray sparseArray = this.A0L;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((S75) sparseArray.valueAt(i)).A02();
        }
        this.A0T.clear();
        this.A03 = 0;
        this.A0A = j2;
        this.A0S.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public C11695Ses(C13890TjD tjD, List list, int i) {
        this.A0W = tjD;
        this.A0K = i;
        this.A0U = Collections.unmodifiableList(list);
        this.A0R = new C10345Rqi();
        this.A0M = Pxe.A0P(16);
        this.A0P = new C11389SRd(SS3.A01);
        this.A0O = Pxe.A0P(5);
        this.A0N = new C11389SRd();
        byte[] bArr = new byte[16];
        this.A0V = bArr;
        this.A0Q = new C11389SRd(bArr);
        this.A0S = new ArrayDeque();
        this.A0T = new ArrayDeque();
        this.A0L = Pxe.A0L();
        this.A0F = ImmutableList.of();
        this.A08 = -9223372036854775807L;
        this.A0A = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0D = YBZ.A00;
        this.A0J = new C13900TjN[0];
        this.A0I = new C13900TjN[0];
    }

    public static DrmInitData A00(List list) {
        StringBuilder A1A;
        String str;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            QEK qek = (QEK) list.get(i);
            if (qek.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = AnonymousClass7TE.A1C();
                }
                byte[] bArr = qek.A00.A02;
                C11389SRd sRd = new C11389SRd(bArr);
                if (sRd.A00 >= 32) {
                    sRd.A0O(0);
                    int A062 = Pxe.A06(sRd);
                    int A012 = sRd.A01();
                    if (A012 != A062) {
                        A1A = AnonymousClass7TE.A1A();
                        A1A.append("Advertised atom size (");
                        A1A.append(A012);
                        str = ") does not match buffer size: ";
                    } else {
                        A062 = sRd.A01();
                        if (A062 != 1886614376) {
                            A1A = AnonymousClass7TE.A1A();
                            str = "Atom type is not pssh: ";
                        } else {
                            A062 = (sRd.A01() >> 24) & 255;
                            if (A062 > 1) {
                                A1A = AnonymousClass7TE.A1A();
                                str = "Unsupported pssh version: ";
                            } else {
                                UUID uuid = new UUID(sRd.A0B(), sRd.A0B());
                                if (A062 == 1) {
                                    int A072 = sRd.A07();
                                    for (int i2 = 0; i2 < A072; i2++) {
                                        sRd.A0B();
                                        sRd.A0B();
                                    }
                                }
                                int A073 = sRd.A07();
                                int A063 = Pxe.A06(sRd);
                                if (A073 != A063) {
                                    A1A = AnonymousClass7TE.A1A();
                                    A1A.append("Atom data size (");
                                    A1A.append(A073);
                                    A1A.append(") does not match the bytes left: ");
                                    A1A.append(A063);
                                    STH.A03("PsshAtomUtil", A1A.toString());
                                } else {
                                    sRd.A0R(new byte[A073], 0, A073);
                                    arrayList.add(new DrmInitData.SchemeData("video/mp4", uuid, bArr));
                                }
                            }
                        }
                    }
                    A1A.append(str);
                    A1A.append(A062);
                    STH.A03("PsshAtomUtil", A1A.toString());
                }
                STH.A03("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
            }
        }
        if (arrayList != null) {
            return new DrmInitData((String) null, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false);
        }
        return null;
    }

    @Deprecated
    public C11695Ses() {
        this(C13890TjD.A00, ImmutableList.of(), 32);
    }
}
