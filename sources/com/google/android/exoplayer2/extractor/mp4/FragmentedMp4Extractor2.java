package com.google.android.exoplayer2.extractor.mp4;

import X.002;
import X.2AG;
import X.AnonymousClass4XT;
import X.AnonymousClass4XU;
import X.AnonymousClass4XV;
import X.AnonymousClass4XW;
import X.AnonymousClass4Y7;
import X.AnonymousClass4YA;
import X.AnonymousClass4YM;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C10594Ruo;
import X.C11137SBs;
import X.C11303SKn;
import X.C256653w8;
import X.C256683wB;
import X.C256703wD;
import X.C2609347p;
import X.C265004Sd;
import X.C265994Xd;
import X.Pxe;
import X.Pxg;
import X.Pxh;
import X.S76;
import android.util.SparseArray;
import com.google.android.exoplayer2.drm.DrmInitData;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class FragmentedMp4Extractor2 implements AnonymousClass4XT {
    public static final C256683wB A0X;
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
    public long A0C;
    public C265004Sd A0D;
    public S76 A0E;
    public AnonymousClass4XV A0F;
    public boolean A0G;
    public boolean A0H;
    public C265994Xd[] A0I;
    public C265994Xd[] A0J;
    public final int A0K;
    public final SparseArray A0L;
    public final C265994Xd A0M;
    public final AnonymousClass4XU A0N;
    public final AnonymousClass4XV A0O;
    public final AnonymousClass4XV A0P;
    public final AnonymousClass4XV A0Q;
    public final AnonymousClass4XV A0R;
    public final AnonymousClass4XV A0S;
    public final ArrayDeque A0T;
    public final ArrayDeque A0U;
    public final List A0V;
    public final byte[] A0W;

    public final boolean Evy(AnonymousClass4Y7 r2) {
        return C11137SBs.A00(r2, true);
    }

    static {
        C256653w8 r1 = new C256653w8();
        r1.A0U = "application/x-emsg";
        A0X = new C256683wB(r1);
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    public static void A01(AnonymousClass4YM r5, AnonymousClass4XV r6, int i) {
        int A092 = Pxh.A09(r6, i + 8) & 16777215;
        if ((A092 & 1) == 0) {
            boolean A1P = AnonymousClass7TF.A1P(A092 & 2);
            int A042 = r6.A04();
            if (A042 == 0) {
                Arrays.fill(r5.A0E, 0, r5.A00, false);
                return;
            }
            int i2 = r5.A00;
            if (A042 == i2) {
                Arrays.fill(r5.A0E, 0, A042, A1P);
                AnonymousClass4XV r2 = r5.A0G;
                r2.A0E(r6.A00 - r6.A01);
                r5.A07 = true;
                r5.A09 = true;
                r6.A0J(r2.A02, 0, r2.A00);
                r2.A0G(0);
                r5.A09 = false;
                return;
            }
            throw C2609347p.A00(002.A02(A042, i2, "Senc sample count ", " is different from fragment sample count"), (Throwable) null);
        }
        ? iOException = new IOException("Overriding TrackEncryptionBox parameters is unsupported.", (Throwable) null);
        iOException.A01 = false;
        iOException.A00 = 1;
        throw iOException;
    }

    public final void CMc(C265004Sd r8) {
        int i;
        this.A0D = r8;
        this.A02 = 0;
        this.A00 = 0;
        C265994Xd[] r3 = new C265994Xd[2];
        this.A0J = r3;
        C265994Xd r0 = this.A0M;
        int i2 = 0;
        if (r0 != null) {
            r3[0] = r0;
            i = 1;
        } else {
            i = 0;
        }
        int i3 = 100;
        if ((this.A0K & 4) != 0) {
            r3[i] = r8.FHW(100, 5);
            i++;
            i3 = 101;
        }
        C265994Xd[] r1 = this.A0J;
        C256703wD.A03(Pxg.A1T(i, r1.length));
        C265994Xd[] r32 = (C265994Xd[]) Arrays.copyOf(r1, i);
        this.A0J = r32;
        for (C265994Xd AWP : r32) {
            AWP.AWP(A0X);
        }
        List list = this.A0V;
        C265994Xd[] r02 = new C265994Xd[list.size()];
        this.A0I = r02;
        while (i2 < r02.length) {
            C265994Xd FHW = this.A0D.FHW(i3, 3);
            FHW.AWP((C256683wB) list.get(i2));
            r02 = this.A0I;
            r02[i2] = FHW;
            i2++;
            i3++;
        }
    }

    /* JADX WARNING: type inference failed for: r2v21, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: type inference failed for: r2v67, types: [java.lang.Throwable, java.io.IOException, X.47p] */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x023d, code lost:
        if (r5 == 1701671783) goto L_0x023f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05cd, code lost:
        if ((r38 & 1) == 0) goto L_0x05cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x063e, code lost:
        if (r33 == false) goto L_0x0640;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:482:0x0a9c, code lost:
        if (r0.A02 != 3) goto L_0x0b37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:484:0x0aa0, code lost:
        if (r7.A06 != false) goto L_0x0ae9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:485:0x0aa2, code lost:
        r1 = r7.A05.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:486:0x0aa6, code lost:
        r4 = r7.A01;
        r2 = r1[r4];
        r0.A06 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x0aae, code lost:
        if (r4 >= r7.A03) goto L_0x0aee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:488:0x0ab0, code lost:
        r3.Evk(r2);
        r1 = r7.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:489:0x0ab7, code lost:
        if (r1 == null) goto L_0x0ad9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0ab9, code lost:
        r4 = r7.A08;
        r3 = r4.A0G;
        r1 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0abf, code lost:
        if (r1 == 0) goto L_0x0ac4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0ac1, code lost:
        r3.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:493:0x0ac4, code lost:
        r2 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:494:0x0ac8, code lost:
        if (r4.A07 == false) goto L_0x0ad9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:496:0x0ace, code lost:
        if (r4.A0E[r2] == false) goto L_0x0ad9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:497:0x0ad0, code lost:
        r3.A0H(r3.A05() * 6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:499:0x0add, code lost:
        if (r7.A03() != false) goto L_0x0ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:500:0x0adf, code lost:
        r0.A0E = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:501:0x0ae3, code lost:
        r0.A02 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:502:0x0ae8, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0ae9, code lost:
        r1 = r7.A08.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0af4, code lost:
        if (r7.A05.A03.A02 != 1) goto L_0x0afe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:506:0x0af6, code lost:
        r0.A06 = r2 - 8;
        r3.Evk(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:507:0x0afe, code lost:
        r2 = "audio/ac4".equals(r7.A05.A03.A07.A0W);
        r1 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0b0e, code lost:
        if (r2 == false) goto L_0x0ce6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:509:0x0b10, code lost:
        r0.A04 = r7.A00(r1, 7);
        r4 = r0.A06;
        r2 = r0.A0S;
        r2.A0E(7);
        X.Pxk.A0g(r2.A02, r4);
        r7.A07.EJh(r2, 7);
        r2 = r0.A04 + 7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:510:0x0b2c, code lost:
        r0.A04 = r2;
        r0.A06 += r2;
        r0.A02 = 4;
        r0.A05 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:511:0x0b37, code lost:
        r4 = r7.A05;
        r34 = r4.A03;
        r2 = r7.A07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:512:0x0b41, code lost:
        if (r7.A06 != false) goto L_0x0cdc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:513:0x0b43, code lost:
        r4 = r4.A07[r7.A01];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:514:0x0b49, code lost:
        r12 = r34.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:515:0x0b4d, code lost:
        if (r12 == 0) goto L_0x0cec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0b4f, code lost:
        r1 = r0.A0Q;
        r33 = r1;
        r11 = r1.A02;
        r11[0] = 0;
        r11[1] = 0;
        r11[2] = 0;
        r23 = r12 + 1;
        r22 = 4 - r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:517:0x0b5f, code lost:
        r1 = r0.A04;
        r10 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0b63, code lost:
        if (r1 >= r10) goto L_0x0cfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0b65, code lost:
        r10 = r0.A05;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:520:0x0b67, code lost:
        if (r10 != 0) goto L_0x0bc6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:521:0x0b69, code lost:
        r3.readFully(r11, r22, r23);
        r1 = X.Pxh.A09(r33, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:522:0x0b76, code lost:
        if (r1 < 1) goto L_0x0d8e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:523:0x0b78, code lost:
        r0.A05 = r1 - 1;
        r1 = r0.A0R;
        r1.A0G(0);
        r2.EJh(r1, 4);
        r2.EJh(r33, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:524:0x0b8c, code lost:
        if (r0.A0I.length <= 0) goto L_0x0bc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:525:0x0b8e, code lost:
        r12 = r34.A07.A0W;
        r13 = r11[4];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:526:0x0b9d, code lost:
        if ("video/avc".equals(r12) == false) goto L_0x0ba4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0ba2, code lost:
        if ((r13 & 31) == 6) goto L_0x0bb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0bab, code lost:
        if ("video/hevc".equals(r12) == false) goto L_0x0bc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:532:0x0bb2, code lost:
        if (((r13 & 126) >> 1) != 39) goto L_0x0bc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:533:0x0bb4, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:534:0x0bb5, code lost:
        r0.A0H = r1;
        r0.A04 += 5;
        r0.A06 += r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:535:0x0bc4, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:537:0x0bc8, code lost:
        if (r0.A0H == false) goto L_0x0cca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:538:0x0bca, code lost:
        r12 = r0.A0P;
        r12.A0E(r10);
        r3.readFully(r12.A02, 0, r10);
        r2.EJh(r12, r0.A05);
        r16 = r0.A05;
        r10 = X.AnonymousClass4XW.A00(r12.A02, r12.A00);
        r12.A0G("video/hevc".equals(r34.A07.A0W) ? 1 : 0);
        r12.A0F(r10);
        r21 = r0.A0I;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:539:0x0bfc, code lost:
        r14 = r12.A00;
        r20 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:540:0x0c04, code lost:
        if ((r14 - r12.A01) <= 1) goto L_0x0cce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:541:0x0c06, code lost:
        r13 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:543:0x0c0b, code lost:
        if ((r14 - r12.A01) != 0) goto L_0x0cbf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:544:0x0c0d, code lost:
        r13 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:545:0x0c0e, code lost:
        r15 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:547:0x0c13, code lost:
        if ((r14 - r12.A01) != 0) goto L_0x0cb4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:548:0x0c15, code lost:
        r15 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:549:0x0c16, code lost:
        r1 = r12.A01;
        r10 = r1;
        r19 = r1 + r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:550:0x0c1c, code lost:
        if (r15 == -1) goto L_0x0ca2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:552:0x0c1f, code lost:
        if (r15 > (r14 - r10)) goto L_0x0ca2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:553:0x0c21, code lost:
        if (r13 != 4) goto L_0x0cad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x0c25, code lost:
        if (r15 < 8) goto L_0x0cad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:556:0x0c27, code lost:
        r10 = r12.A02();
        r14 = r12.A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:557:0x0c31, code lost:
        if (r14 != 49) goto L_0x0c9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x0c33, code lost:
        r18 = r12.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x0c37, code lost:
        r17 = r12.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:560:0x0c3d, code lost:
        if (r14 != 47) goto L_0x0c42;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:561:0x0c3f, code lost:
        r12.A0H(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:563:0x0c44, code lost:
        if (r10 != 181) goto L_0x0c51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:564:0x0c46, code lost:
        if (r14 == 49) goto L_0x0c4a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:565:0x0c48, code lost:
        if (r14 != 47) goto L_0x0c51;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:566:0x0c4a, code lost:
        r15 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:567:0x0c4f, code lost:
        if (r17 == 3) goto L_0x0c52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:568:0x0c51, code lost:
        r15 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:569:0x0c52, code lost:
        if (r14 != 49) goto L_0x0c5f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:0x0c59, code lost:
        if (r18 == 1195456820) goto L_0x0c5d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:572:0x0c5b, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:573:0x0c5d, code lost:
        r15 = r15 & r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:574:0x0c5f, code lost:
        if (r15 == false) goto L_0x0cad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:575:0x0c61, code lost:
        r13 = r12.A02();
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:576:0x0c68, code lost:
        if ((r13 & 64) == 0) goto L_0x0cad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:577:0x0c6a, code lost:
        r12.A0H(1);
        r15 = (r13 & 31) * 3;
        r20 = r12.A01;
        r14 = r21.length;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:578:0x0c78, code lost:
        if (r10 >= r14) goto L_0x0cad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:579:0x0c7a, code lost:
        r13 = r21[r10];
        r12.A0G(r20);
        r13.EJh(r12, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:580:0x0c8b, code lost:
        if (r4 == -9223372036854775807L) goto L_0x0c9c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:581:0x0c8d, code lost:
        r13.EJn((X.C266034Xh) null, 1, r15, 0, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:582:0x0c9c, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:583:0x0c9f, code lost:
        r18 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:584:0x0ca2, code lost:
        X.2AG.A04("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
        r19 = r12.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:585:0x0cad, code lost:
        r12.A0G(r19);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:586:0x0cb4, code lost:
        r10 = r12.A02();
        r15 = r15 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:587:0x0cbb, code lost:
        if (r10 == 255) goto L_0x0c0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:588:0x0cbf, code lost:
        r10 = r12.A02();
        r13 = r13 + r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:589:0x0cc6, code lost:
        if (r10 == 255) goto L_0x0c07;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:590:0x0cca, code lost:
        r16 = r2.EJl(r3, r10, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:0x0cce, code lost:
        r0.A04 += r16;
        r0.A05 -= r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:592:0x0cdc, code lost:
        r4 = r7.A08.A0C[r7.A01];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:593:0x0ce6, code lost:
        r2 = r7.A00(r1, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:594:0x0cec, code lost:
        r1 = r0.A04;
        r10 = r0.A06;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:595:0x0cf0, code lost:
        if (r1 >= r10) goto L_0x0cfd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:596:0x0cf2, code lost:
        r0.A04 += r2.EJl(r3, r10 - r1, 0, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:598:0x0cff, code lost:
        if (r7.A06 != false) goto L_0x0d6d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:599:0x0d01, code lost:
        r13 = r7.A05.A04[r7.A01];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:600:0x0d09, code lost:
        r3 = r7.A01();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:601:0x0d0d, code lost:
        if (r3 == null) goto L_0x0d12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:602:0x0d0f, code lost:
        r13 = r13 | X.SN3.MAX_SIGNED_POWER_OF_TWO;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:603:0x0d12, code lost:
        if (r3 == null) goto L_0x0d6b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:604:0x0d14, code lost:
        r9 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:605:0x0d16, code lost:
        r1 = r0.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:606:0x0d18, code lost:
        if (r1 == null) goto L_0x0d2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:608:0x0d28, code lost:
        if ("application/x-mp4-vtt".equals(r1.A05.A03.A07.A0W) == false) goto L_0x0d2c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:609:0x0d2a, code lost:
        r13 = r13 | 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:610:0x0d2c, code lost:
        r2.EJn(r9, r13, r10, 0, r4);
        r0.A0A = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:611:0x0d37, code lost:
        r2 = r0.A0U;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:612:0x0d3d, code lost:
        if (r2.isEmpty() != false) goto L_0x0d7a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:613:0x0d3f, code lost:
        r3 = (X.C10593Run) r2.removeFirst();
        r1 = r0.A03;
        r11 = r3.A00;
        r0.A03 = r1 - r11;
        r1 = r3.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:614:0x0d50, code lost:
        if (r3.A02 == false) goto L_0x0d53;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:615:0x0d52, code lost:
        r1 = r1 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:616:0x0d53, code lost:
        r10 = r0.A0J;
        r9 = r10.length;
        r8 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:617:0x0d57, code lost:
        if (r8 >= r9) goto L_0x0d37;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:618:0x0d59, code lost:
        r10[r8].EJn((X.C266034Xh) null, 1, r11, r0.A03, r1);
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:619:0x0d6b, code lost:
        r9 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:620:0x0d6d, code lost:
        r13 = X.AnonymousClass7TF.A1P(r7.A08.A0F[r7.A01] ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:622:0x0d7e, code lost:
        if (r7.A03() != false) goto L_0x0ae3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:623:0x0d80, code lost:
        r0.A0E = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:625:0x0d8e, code lost:
        r1 = "Invalid NAL length";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:627:0x0d96, code lost:
        throw X.C2609347p.A00(r1, (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:635:0x0dc6, code lost:
        r2.append(r0);
        r2.append(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:638:0x0de2, code lost:
        throw X.C2609347p.A00(r2.toString(), (java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:642:0x0ded, code lost:
        r2 = new java.io.IOException(r1, (java.lang.Throwable) null);
        r2.A01 = false;
        r2.A00 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:643:0x0df7, code lost:
        throw r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x02e6  */
    /* JADX WARNING: Removed duplicated region for block: B:472:0x0a67 A[EDGE_INSN: B:679:0x0a67->B:472:0x0a67 ?: BREAK  
    EDGE_INSN: B:680:0x0a67->B:472:0x0a67 ?: BREAK  ] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x010e  */
    /* JADX WARNING: Removed duplicated region for block: B:651:0x0deb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E68(X.AnonymousClass4Y7 r58, X.C265044Sh r59) {
        /*
            r57 = this;
        L_0x0000:
            r0 = r57
            int r1 = r0.A02
            r3 = r58
            if (r1 == 0) goto L_0x00c5
            r13 = 1
            if (r1 == r13) goto L_0x0295
            r10 = 2
            if (r1 == r10) goto L_0x0074
            X.S76 r7 = r0.A0E
            r25 = 0
            r8 = 0
            if (r7 != 0) goto L_0x0a94
            android.util.SparseArray r12 = r0.A0L
            int r11 = r12.size()
            r7 = 0
            r13 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r9 = 0
        L_0x0022:
            if (r9 >= r11) goto L_0x005f
            java.lang.Object r6 = r12.valueAt(r9)
            X.S76 r6 = (X.S76) r6
            boolean r1 = r6.A06
            if (r1 != 0) goto L_0x0036
            int r2 = r6.A01
            X.Q0S r1 = r6.A05
            int r1 = r1.A01
            if (r2 == r1) goto L_0x0042
        L_0x0036:
            boolean r1 = r6.A06
            if (r1 == 0) goto L_0x0045
            int r2 = r6.A02
            X.4YM r1 = r6.A08
            int r1 = r1.A01
            if (r2 != r1) goto L_0x0045
        L_0x0042:
            int r9 = r9 + 1
            goto L_0x0022
        L_0x0045:
            boolean r1 = r6.A06
            if (r1 != 0) goto L_0x0058
            X.Q0S r1 = r6.A05
            long[] r2 = r1.A06
            int r1 = r6.A01
        L_0x004f:
            r4 = r2[r1]
            int r1 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x0042
            r7 = r6
            r13 = r4
            goto L_0x0042
        L_0x0058:
            X.4YM r1 = r6.A08
            long[] r2 = r1.A0D
            int r1 = r6.A02
            goto L_0x004f
        L_0x005f:
            if (r7 != 0) goto L_0x0a72
            long r4 = r0.A09
            r1 = r3
            X.4Y6 r1 = (X.AnonymousClass4Y6) r1
            long r1 = r1.A02
            long r4 = r4 - r1
            int r1 = (int) r4
            if (r1 < 0) goto L_0x0a6e
            r3.Evk(r1)
            r0.A02 = r8
            r0.A00 = r8
            goto L_0x0000
        L_0x0074:
            android.util.SparseArray r12 = r0.A0L
            int r11 = r12.size()
            r9 = 0
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r10 = 0
            r2 = r9
        L_0x0082:
            if (r10 >= r11) goto L_0x00a1
            java.lang.Object r1 = r12.valueAt(r10)
            X.S76 r1 = (X.S76) r1
            X.4YM r8 = r1.A08
            boolean r1 = r8.A09
            if (r1 == 0) goto L_0x009e
            long r6 = r8.A02
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x009e
            long r4 = r8.A02
            java.lang.Object r2 = r12.valueAt(r10)
            X.S76 r2 = (X.S76) r2
        L_0x009e:
            int r10 = r10 + 1
            goto L_0x0082
        L_0x00a1:
            if (r2 != 0) goto L_0x00a6
            r1 = 3
            goto L_0x0186
        L_0x00a6:
            r0 = r3
            X.4Y6 r0 = (X.AnonymousClass4Y6) r0
            long r0 = r0.A02
            long r4 = r4 - r0
            int r0 = (int) r4
            if (r0 < 0) goto L_0x0d97
            r3.Evk(r0)
            X.4YM r5 = r2.A08
            X.4XV r4 = r5.A0G
            byte[] r2 = r4.A02
            int r1 = r4.A00
            r0 = 0
            r3.readFully(r2, r0, r1)
            r4.A0G(r0)
            r5.A09 = r0
            goto L_0x0000
        L_0x00c5:
            int r1 = r0.A00
            r7 = 8
            r6 = 0
            r8 = 1
            if (r1 != 0) goto L_0x00ea
            X.4XV r4 = r0.A0O
            byte[] r1 = r4.A02
            boolean r1 = r3.E6T(r1, r6, r7, r8)
            if (r1 != 0) goto L_0x00d9
            r0 = -1
            return r0
        L_0x00d9:
            r0.A00 = r7
            r4.A0G(r6)
            long r1 = r4.A07()
            r0.A07 = r1
            int r1 = r4.A01()
            r0.A01 = r1
        L_0x00ea:
            long r1 = r0.A07
            r9 = 1
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x014e
            X.4XV r2 = r0.A0O
            byte[] r1 = r2.A02
            r3.readFully(r1, r7, r7)
            int r1 = r0.A00
            int r1 = r1 + 8
            r0.A00 = r1
            long r4 = r2.A08()
        L_0x0103:
            r0.A07 = r4
        L_0x0105:
            long r4 = r0.A07
            int r1 = r0.A00
            long r1 = (long) r1
            int r9 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r9 < 0) goto L_0x0deb
            r10 = r3
            X.4Y6 r10 = (X.AnonymousClass4Y6) r10
            long r3 = r10.A02
            long r3 = r3 - r1
            int r1 = r0.A01
            r12 = 1835295092(0x6d646174, float:4.4175247E27)
            r11 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r1 == r11) goto L_0x0120
            if (r1 != r12) goto L_0x0132
        L_0x0120:
            boolean r1 = r0.A0G
            if (r1 != 0) goto L_0x0132
            X.4Sd r9 = r0.A0D
            long r1 = r0.A08
            X.SwL r5 = new X.SwL
            r5.<init>(r1, r3)
            r9.EKx(r5)
            r0.A0G = r8
        L_0x0132:
            int r5 = r0.A01
            if (r5 != r11) goto L_0x017b
            android.util.SparseArray r8 = r0.A0L
            int r7 = r8.size()
            r2 = 0
        L_0x013d:
            if (r2 >= r7) goto L_0x026e
            java.lang.Object r1 = r8.valueAt(r2)
            X.S76 r1 = (X.S76) r1
            X.4YM r1 = r1.A08
            r1.A02 = r3
            r1.A03 = r3
            int r2 = r2 + 1
            goto L_0x013d
        L_0x014e:
            r9 = 0
            int r4 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0105
            r11 = r3
            X.4Y6 r11 = (X.AnonymousClass4Y6) r11
            long r4 = r11.A04
            r9 = -1
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 != 0) goto L_0x016f
            java.util.ArrayDeque r2 = r0.A0T
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x016f
            java.lang.Object r1 = r2.peek()
            X.4Y8 r1 = (X.AnonymousClass4Y8) r1
            long r4 = r1.A00
        L_0x016f:
            int r1 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r1 == 0) goto L_0x0105
            long r1 = r11.A02
            long r4 = r4 - r1
            int r1 = r0.A00
            long r1 = (long) r1
            long r4 = r4 + r1
            goto L_0x0103
        L_0x017b:
            r9 = 0
            if (r5 != r12) goto L_0x018a
            r0.A0E = r9
            long r1 = r0.A07
            long r3 = r3 + r1
            r0.A09 = r3
            r1 = 2
        L_0x0186:
            r0.A02 = r1
            goto L_0x0000
        L_0x018a:
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r5 == r1) goto L_0x026e
            r1 = 1953653099(0x7472616b, float:7.681346E31)
            if (r5 == r1) goto L_0x026e
            r1 = 1835297121(0x6d646961, float:4.4181236E27)
            if (r5 == r1) goto L_0x026e
            r1 = 1835626086(0x6d696e66, float:4.515217E27)
            if (r5 == r1) goto L_0x026e
            r1 = 1937007212(0x7374626c, float:1.9362132E31)
            if (r5 == r1) goto L_0x026e
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r5 == r1) goto L_0x026e
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r5 == r1) goto L_0x026e
            r1 = 1701082227(0x65647473, float:6.742798E22)
            if (r5 == r1) goto L_0x026e
            r1 = 1751411826(0x68646c72, float:4.3148E24)
            if (r5 == r1) goto L_0x023f
            r1 = 1835296868(0x6d646864, float:4.418049E27)
            if (r5 == r1) goto L_0x023f
            r1 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r5 == r1) goto L_0x023f
            r1 = 1936286840(0x73696478, float:1.8491255E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1937011556(0x73747364, float:1.9367383E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1937011827(0x73747473, float:1.9367711E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1668576371(0x63747473, float:4.5093966E21)
            if (r5 == r1) goto L_0x023f
            r1 = 1937011555(0x73747363, float:1.9367382E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1937011578(0x7374737a, float:1.936741E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1937013298(0x73747a32, float:1.9369489E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r5 == r1) goto L_0x023f
            r1 = 1937011571(0x73747373, float:1.9367401E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1952867444(0x74666474, float:7.3014264E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1952868452(0x74666864, float:7.301914E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1953196132(0x746b6864, float:7.46037E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1953658222(0x7472756e, float:7.683823E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1886614376(0x70737368, float:3.013775E29)
            if (r5 == r1) goto L_0x023f
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r5 == r1) goto L_0x023f
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r5 == r1) goto L_0x023f
            r1 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r5 == r1) goto L_0x023f
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r5 == r1) goto L_0x023f
            r2 = 1701671783(0x656d7367, float:7.0083103E22)
            r1 = 0
            if (r5 != r2) goto L_0x0240
        L_0x023f:
            r1 = 1
        L_0x0240:
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            if (r1 == 0) goto L_0x0264
            int r1 = r0.A00
            if (r1 != r7) goto L_0x0da1
            long r2 = r0.A07
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x0d9e
            int r1 = (int) r2
            X.4XV r9 = new X.4XV
            r9.<init>((int) r1)
            X.4XV r1 = r0.A0O
            byte[] r2 = r1.A02
            byte[] r1 = r9.A02
            java.lang.System.arraycopy(r2, r6, r1, r6, r7)
        L_0x025e:
            r0.A0F = r9
            r0.A02 = r8
            goto L_0x0000
        L_0x0264:
            long r2 = r0.A07
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x025e
            java.lang.String r1 = "Skipping atom with length > 2147483647 (unsupported)."
            goto L_0x0ded
        L_0x026e:
            long r1 = r10.A02
            r16 = r1
            long r1 = r0.A07
            long r16 = r16 + r1
            r1 = 8
            long r16 = r16 - r1
            java.util.ArrayDeque r4 = r0.A0T
            X.4Y8 r3 = new X.4Y8
            r1 = r16
            r3.<init>(r5, r1)
            r4.push(r3)
            long r4 = r0.A07
            int r1 = r0.A00
            long r2 = (long) r1
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02d2
            r0.A02 = r6
            r0.A00 = r6
            goto L_0x0000
        L_0x0295:
            long r1 = r0.A07
            int r4 = (int) r1
            int r1 = r0.A00
            int r4 = r4 - r1
            X.4XV r2 = r0.A0F
            if (r2 == 0) goto L_0x0a62
            byte[] r1 = r2.A02
            r6 = 8
            r3.readFully(r1, r6, r4)
            int r1 = r0.A01
            X.4YA r7 = new X.4YA
            r7.<init>(r2, r1)
            r4 = r3
            X.4Y6 r4 = (X.AnonymousClass4Y6) r4
            long r1 = r4.A02
            X.3ws r4 = r4.A05
            android.net.Uri r11 = r4.getUri()
            java.util.ArrayDeque r5 = r0.A0T
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x08be
            java.lang.Object r1 = r5.peek()
            X.4Y8 r1 = (X.AnonymousClass4Y8) r1
            java.util.List r1 = r1.A02
            r1.add(r7)
        L_0x02cb:
            r1 = r3
            X.4Y6 r1 = (X.AnonymousClass4Y6) r1
            long r1 = r1.A02
            r16 = r1
        L_0x02d2:
            java.util.ArrayDeque r4 = r0.A0T
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x0a67
            java.lang.Object r1 = r4.peek()
            X.4Y8 r1 = (X.AnonymousClass4Y8) r1
            long r2 = r1.A00
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 != 0) goto L_0x0a67
            java.lang.Object r14 = r4.pop()
            X.4Y8 r14 = (X.AnonymousClass4Y8) r14
            int r2 = r14.A00
            r1 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r2 != r1) goto L_0x0423
            r7 = 1
            r6 = 0
            java.util.List r1 = r14.A02
            com.google.android.exoplayer2.drm.DrmInitData r18 = A00(r1)
            r1 = 1836475768(0x6d766578, float:4.7659988E27)
            X.4Y8 r1 = r14.A00(r1)
            r1.getClass()
            android.util.SparseArray r5 = X.Pxe.A0L()
            java.util.List r12 = r1.A02
            int r11 = r12.size()
            r22 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r10 = 0
        L_0x0315:
            if (r10 >= r11) goto L_0x0376
            java.lang.Object r3 = r12.get(r10)
            X.4YA r3 = (X.AnonymousClass4YA) r3
            int r2 = r3.A00
            r1 = 1953654136(0x74726578, float:7.6818474E31)
            if (r2 != r1) goto L_0x0357
            X.4XV r1 = r3.A00
            r2 = 12
            int r13 = X.Pxh.A09(r1, r2)
            int r2 = r1.A01()
            int r9 = r2 + -1
            int r8 = r1.A01()
            int r4 = r1.A01()
            int r3 = r1.A01()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            X.4YB r1 = new X.4YB
            r1.<init>(r9, r8, r4, r3)
            android.util.Pair r1 = android.util.Pair.create(r2, r1)
            int r2 = X.Pxf.A05(r1)
            java.lang.Object r1 = r1.second
            r5.put(r2, r1)
        L_0x0354:
            int r10 = r10 + 1
            goto L_0x0315
        L_0x0357:
            int r2 = r3.A00
            r1 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r2 != r1) goto L_0x0354
            X.4XV r2 = r3.A00
            r1 = 8
            int r1 = X.Pxh.A09(r2, r1)
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != 0) goto L_0x0371
            long r22 = r2.A07()
            goto L_0x0354
        L_0x0371:
            long r22 = r2.A08()
            goto L_0x0354
        L_0x0376:
            X.Q0Q r19 = new X.Q0Q
            r19.<init>()
            int r1 = r0.A0K
            r1 = r1 & 16
            boolean r24 = X.AnonymousClass7TF.A1P(r1)
            r2 = 5
            X.Szs r1 = new X.Szs
            r1.<init>((java.lang.Object) r0, (int) r2)
            r20 = r14
            r21 = r1
            r25 = r6
            java.util.ArrayList r10 = X.AnonymousClass4YC.A03(r18, r19, r20, r21, r22, r24, r25)
            int r9 = r10.size()
            android.util.SparseArray r8 = r0.A0L
            int r1 = r8.size()
            if (r1 == 0) goto L_0x03e1
            int r1 = r8.size()
            if (r1 == r9) goto L_0x03a6
            r7 = 0
        L_0x03a6:
            X.C256703wD.A04(r7)
        L_0x03a9:
            if (r6 >= r9) goto L_0x02d2
            java.lang.Object r7 = r10.get(r6)
            X.Q0S r7 = (X.Q0S) r7
            X.4YI r1 = r7.A03
            int r4 = r1.A00
            java.lang.Object r3 = r8.get(r4)
            X.S76 r3 = (X.S76) r3
            int r2 = r5.size()
            r1 = 1
            if (r2 != r1) goto L_0x03dc
            r1 = 0
            java.lang.Object r1 = r5.valueAt(r1)
        L_0x03c7:
            X.4YB r1 = (X.AnonymousClass4YB) r1
            r3.A05 = r7
            r3.A04 = r1
            X.4Xd r2 = r3.A07
            X.4YI r1 = r7.A03
            X.3wB r1 = r1.A07
            r2.AWP(r1)
            r3.A02()
            int r6 = r6 + 1
            goto L_0x03a9
        L_0x03dc:
            java.lang.Object r1 = X.C41847B3o.A15(r5, r4)
            goto L_0x03c7
        L_0x03e1:
            if (r6 >= r9) goto L_0x041c
            java.lang.Object r12 = r10.get(r6)
            X.Q0S r12 = (X.Q0S) r12
            X.4YI r11 = r12.A03
            X.4Sd r2 = r0.A0D
            int r1 = r11.A03
            X.4Xd r4 = r2.FHW(r6, r1)
            int r3 = r11.A00
            int r1 = r5.size()
            if (r1 != r7) goto L_0x0417
            r1 = 0
            java.lang.Object r2 = r5.valueAt(r1)
        L_0x0400:
            X.4YB r2 = (X.AnonymousClass4YB) r2
            X.S76 r1 = new X.S76
            r1.<init>(r4, r2, r12)
            r8.put(r3, r1)
            long r3 = r0.A08
            long r1 = r11.A04
            long r1 = java.lang.Math.max(r3, r1)
            r0.A08 = r1
            int r6 = r6 + 1
            goto L_0x03e1
        L_0x0417:
            java.lang.Object r2 = X.C41847B3o.A15(r5, r3)
            goto L_0x0400
        L_0x041c:
            X.4Sd r1 = r0.A0D
            r1.ASU()
            goto L_0x02d2
        L_0x0423:
            r1 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r2 != r1) goto L_0x08ab
            android.util.SparseArray r1 = r0.A0L
            r56 = r1
            r5 = 0
            int r1 = r0.A0K
            r38 = r1
            byte[] r1 = r0.A0W
            r55 = r1
            java.util.List r1 = r14.A01
            r54 = r1
            int r39 = r54.size()
            r40 = 0
        L_0x043f:
            r2 = r40
            r1 = r39
            if (r2 >= r1) goto L_0x0826
            r2 = r54
            r1 = r40
            java.lang.Object r10 = r2.get(r1)
            X.4Y8 r10 = (X.AnonymousClass4Y8) r10
            int r2 = r10.A00
            r1 = 1953653094(0x74726166, float:7.6813435E31)
            if (r2 != r1) goto L_0x0822
            r1 = 1952868452(0x74666864, float:7.301914E31)
            X.4YA r1 = r10.A01(r1)
            r1.getClass()
            X.4XV r4 = r1.A00
            r11 = 8
            int r9 = X.Pxh.A09(r4, r11)
            r41 = 16777215(0xffffff, float:2.3509886E-38)
            r9 = r9 & r41
            int r2 = r4.A01()
            r1 = r56
            java.lang.Object r6 = r1.get(r2)
            X.S76 r6 = (X.S76) r6
            if (r6 == 0) goto L_0x0822
            r1 = r9 & 1
            if (r1 == 0) goto L_0x0489
            long r1 = r4.A08()
            X.4YM r3 = r6.A08
            r3.A03 = r1
            r3.A02 = r1
        L_0x0489:
            X.4YB r2 = r6.A04
            r1 = r9 & 2
            if (r1 == 0) goto L_0x081e
            int r1 = r4.A01()
            int r8 = r1 + -1
        L_0x0495:
            r1 = r9 & 8
            if (r1 == 0) goto L_0x081a
            int r7 = r4.A01()
        L_0x049d:
            r1 = r9 & 16
            if (r1 == 0) goto L_0x0816
            int r3 = r4.A01()
        L_0x04a5:
            r1 = r9 & 32
            if (r1 == 0) goto L_0x0812
            int r2 = r4.A01()
        L_0x04ad:
            X.4YM r4 = r6.A08
            X.4YB r1 = new X.4YB
            r1.<init>(r8, r7, r3, r2)
            r4.A05 = r1
            long r1 = r4.A04
            boolean r9 = r4.A08
            r6.A02()
            r3 = 1
            r6.A06 = r3
            r7 = 1952867444(0x74666474, float:7.3014264E31)
            X.4YA r8 = r10.A01(r7)
            if (r8 == 0) goto L_0x080c
            r7 = r38 & 2
            if (r7 != 0) goto L_0x080c
            X.4XV r2 = r8.A00
            int r1 = X.Pxh.A09(r2, r11)
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            if (r1 != r3) goto L_0x0806
            long r1 = r2.A08()
        L_0x04dd:
            r4.A04 = r1
            r4.A08 = r3
        L_0x04e1:
            java.util.List r1 = r10.A02
            r53 = r1
            int r37 = r53.size()
            r36 = 0
            r8 = 0
            r7 = 0
            r2 = 0
        L_0x04ee:
            r35 = 1953658222(0x7472756e, float:7.683823E31)
            r1 = r37
            if (r8 >= r1) goto L_0x0516
            r1 = r53
            java.lang.Object r12 = r1.get(r8)
            X.4YA r12 = (X.AnonymousClass4YA) r12
            int r9 = r12.A00
            r1 = r35
            if (r9 != r1) goto L_0x0513
            X.4XV r9 = r12.A00
            r1 = 12
            r9.A0G(r1)
            int r1 = r9.A04()
            if (r1 <= 0) goto L_0x0513
            int r2 = r2 + r1
            int r7 = r7 + 1
        L_0x0513:
            int r8 = r8 + 1
            goto L_0x04ee
        L_0x0516:
            r6.A02 = r5
            r6.A00 = r5
            r6.A01 = r5
            r4.A00(r7, r2)
            r18 = 0
            r7 = 0
        L_0x0522:
            r2 = r37
            r1 = r36
            if (r1 >= r2) goto L_0x0658
            r2 = r53
            java.lang.Object r8 = r2.get(r1)
            X.4YA r8 = (X.AnonymousClass4YA) r8
            int r2 = r8.A00
            r1 = r35
            if (r2 != r1) goto L_0x0654
            int r34 = r18 + 1
            X.4XV r1 = r8.A00
            r52 = r1
            int r9 = X.Pxh.A09(r1, r11)
            r9 = r9 & r41
            X.Q0S r1 = r6.A05
            X.4YI r8 = r1.A03
            X.4YB r1 = r4.A05
            r51 = r1
            int[] r1 = r4.A0B
            int r23 = r52.A04()
            r1[r18] = r23
            long[] r15 = r4.A0D
            long r1 = r4.A03
            r15[r18] = r1
            r12 = r9 & 1
            if (r12 == 0) goto L_0x0564
            int r12 = r52.A01()
            long r12 = (long) r12
            long r1 = r1 + r12
            r15[r18] = r1
        L_0x0564:
            r1 = r9 & 4
            boolean r33 = X.AnonymousClass7TF.A1P(r1)
            r1 = r51
            int r1 = r1.A01
            r32 = r1
            r50 = r1
            if (r33 == 0) goto L_0x0578
            int r32 = r52.A01()
        L_0x0578:
            r1 = r9 & 256(0x100, float:3.59E-43)
            boolean r31 = X.AnonymousClass7TF.A1P(r1)
            r1 = r9 & 512(0x200, float:7.175E-43)
            boolean r30 = X.AnonymousClass7TF.A1P(r1)
            r1 = r9 & 1024(0x400, float:1.435E-42)
            boolean r29 = X.AnonymousClass7TF.A1P(r1)
            r1 = r9 & 2048(0x800, float:2.87E-42)
            boolean r22 = X.AnonymousClass7TF.A1P(r1)
            r20 = 0
            long[] r2 = r8.A08
            if (r2 == 0) goto L_0x05ba
            int r1 = r2.length
            if (r1 != r3) goto L_0x05ba
            long[] r1 = r8.A09
            if (r1 == 0) goto L_0x05ba
            r42 = r2[r5]
            int r2 = (r42 > r20 ? 1 : (r42 == r20 ? 0 : -1))
            if (r2 == 0) goto L_0x05b8
            r12 = r1[r5]
            long r42 = r42 + r12
            r44 = 1000000(0xf4240, double:4.940656E-318)
            long r12 = r8.A05
            r46 = r12
            long r18 = com.google.android.exoplayer2.util.Util.A09(r42, r44, r46)
            long r12 = r8.A04
            int r2 = (r18 > r12 ? 1 : (r18 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x05ba
        L_0x05b8:
            r20 = r1[r5]
        L_0x05ba:
            int[] r1 = r4.A0A
            r28 = r1
            long[] r15 = r4.A0C
            boolean[] r1 = r4.A0F
            r27 = r1
            int r2 = r8.A03
            r1 = 2
            if (r2 != r1) goto L_0x05cf
            r1 = r38 & 1
            r26 = 1
            if (r1 != 0) goto L_0x05d1
        L_0x05cf:
            r26 = 0
        L_0x05d1:
            int r25 = r7 + r23
            long r1 = r8.A06
            r48 = r1
            long r8 = r4.A04
        L_0x05d9:
            r1 = r25
            if (r7 >= r1) goto L_0x064f
            if (r31 == 0) goto L_0x064a
            int r13 = r52.A01()
        L_0x05e3:
            if (r13 < 0) goto L_0x0dcd
            if (r30 == 0) goto L_0x0645
            int r12 = r52.A01()
        L_0x05eb:
            if (r12 < 0) goto L_0x0da4
            if (r29 == 0) goto L_0x0638
            int r24 = r52.A01()
            r23 = r33
        L_0x05f5:
            if (r22 == 0) goto L_0x0634
            int r1 = r52.A01()
            r22 = 1
        L_0x05fd:
            long r1 = (long) r1
            long r1 = r1 + r8
            long r1 = r1 - r20
            r44 = 1000000(0xf4240, double:4.940656E-318)
            r42 = r1
            r46 = r48
            long r1 = com.google.android.exoplayer2.util.Util.A09(r42, r44, r46)
            r15[r7] = r1
            boolean r1 = r4.A08
            if (r1 != 0) goto L_0x061c
            r18 = r15[r7]
            X.Q0S r1 = r6.A05
            long r1 = r1.A02
            long r18 = r18 + r1
            r15[r7] = r18
        L_0x061c:
            r28[r7] = r12
            int r1 = r24 >> 16
            r1 = r1 & 1
            if (r1 != 0) goto L_0x0632
            if (r26 == 0) goto L_0x0628
            if (r7 != 0) goto L_0x0632
        L_0x0628:
            r1 = 1
        L_0x0629:
            r27[r7] = r1
            long r1 = (long) r13
            long r8 = r8 + r1
            int r7 = r7 + 1
            r33 = r23
            goto L_0x05d9
        L_0x0632:
            r1 = 0
            goto L_0x0629
        L_0x0634:
            r22 = 0
            r1 = 0
            goto L_0x05fd
        L_0x0638:
            if (r7 != 0) goto L_0x0640
            r23 = 1
            r24 = r32
            if (r33 != 0) goto L_0x05f5
        L_0x0640:
            r23 = r33
            r24 = r50
            goto L_0x05f5
        L_0x0645:
            r1 = r51
            int r12 = r1.A03
            goto L_0x05eb
        L_0x064a:
            r1 = r51
            int r13 = r1.A00
            goto L_0x05e3
        L_0x064f:
            r4.A04 = r8
            r7 = r1
            r18 = r34
        L_0x0654:
            int r36 = r36 + 1
            goto L_0x0522
        L_0x0658:
            X.Q0S r1 = r6.A05
            X.4YI r6 = r1.A03
            X.4YB r1 = r4.A05
            r1.getClass()
            int r2 = r1.A02
            X.4YD[] r1 = r6.A0A
            r12 = r1[r2]
            r1 = 1935763834(0x7361697a, float:1.785898E31)
            X.4YA r1 = r10.A01(r1)
            if (r1 == 0) goto L_0x06c2
            r12.getClass()
            X.4XV r13 = r1.A00
            int r9 = r12.A00
            int r1 = X.Pxh.A09(r13, r11)
            r1 = r1 & r41
            r2 = 1
            r1 = r1 & 1
            if (r1 != r3) goto L_0x0685
            r13.A0H(r11)
        L_0x0685:
            int r8 = r13.A02()
            int r7 = r13.A04()
            int r1 = r4.A00
            if (r7 > r1) goto L_0x0db1
            if (r8 != 0) goto L_0x06a7
            boolean[] r6 = r4.A0E
            r2 = 0
            r8 = 0
        L_0x0697:
            if (r2 >= r7) goto L_0x06b0
            int r1 = r13.A02()
            int r8 = r8 + r1
            boolean r1 = X.C51970G9q.A1W(r1, r9)
            r6[r2] = r1
            int r2 = r2 + 1
            goto L_0x0697
        L_0x06a7:
            if (r8 > r9) goto L_0x06aa
            r2 = 0
        L_0x06aa:
            int r8 = r8 * r7
            boolean[] r1 = r4.A0E
            java.util.Arrays.fill(r1, r5, r7, r2)
        L_0x06b0:
            boolean[] r2 = r4.A0E
            int r1 = r4.A00
            java.util.Arrays.fill(r2, r7, r1, r5)
            if (r8 <= 0) goto L_0x06c2
            X.4XV r1 = r4.A0G
            r1.A0E(r8)
            r4.A07 = r3
            r4.A09 = r3
        L_0x06c2:
            r1 = 1935763823(0x7361696f, float:1.7858967E31)
            X.4YA r1 = r10.A01(r1)
            if (r1 == 0) goto L_0x06ef
            X.4XV r7 = r1.A00
            int r2 = X.Pxh.A09(r7, r11)
            r1 = r2 & r41
            r1 = r1 & 1
            if (r1 != r3) goto L_0x06da
            r7.A0H(r11)
        L_0x06da:
            int r1 = r7.A04()
            if (r1 != r3) goto L_0x0dc0
            int r1 = r2 >> 24
            r6 = r1 & 255(0xff, float:3.57E-43)
            long r1 = r4.A02
            if (r6 != 0) goto L_0x073c
            long r6 = r7.A07()
        L_0x06ec:
            long r1 = r1 + r6
            r4.A02 = r1
        L_0x06ef:
            r1 = 1936027235(0x73656e63, float:1.8177412E31)
            X.4YA r1 = r10.A01(r1)
            if (r1 == 0) goto L_0x06fd
            X.4XV r1 = r1.A00
            A01(r4, r1, r5)
        L_0x06fd:
            if (r12 == 0) goto L_0x073a
            java.lang.String r10 = r12.A02
        L_0x0701:
            r9 = 0
            r13 = r9
            r8 = r9
            r12 = 0
        L_0x0705:
            int r1 = r53.size()
            if (r12 >= r1) goto L_0x0741
            r1 = r53
            java.lang.Object r15 = r1.get(r12)
            X.4YA r15 = (X.AnonymousClass4YA) r15
            X.4XV r11 = r15.A00
            int r2 = r15.A00
            r1 = 1935828848(0x73626770, float:1.7937577E31)
            r7 = 1936025959(0x73656967, float:1.817587E31)
            r6 = 12
            if (r2 != r1) goto L_0x072b
            int r1 = X.Pxh.A09(r11, r6)
            if (r1 != r7) goto L_0x0728
            r13 = r11
        L_0x0728:
            int r12 = r12 + 1
            goto L_0x0705
        L_0x072b:
            int r2 = r15.A00
            r1 = 1936158820(0x73677064, float:1.8336489E31)
            if (r2 != r1) goto L_0x0728
            int r1 = X.Pxh.A09(r11, r6)
            if (r1 != r7) goto L_0x0728
            r8 = r11
            goto L_0x0728
        L_0x073a:
            r10 = 0
            goto L_0x0701
        L_0x073c:
            long r6 = r7.A08()
            goto L_0x06ec
        L_0x0741:
            if (r13 == 0) goto L_0x07d0
            if (r8 == 0) goto L_0x07d0
            r2 = 8
            int r1 = X.Pxh.A09(r13, r2)
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            r6 = 4
            r13.A0H(r6)
            if (r1 != r3) goto L_0x0758
            r13.A0H(r6)
        L_0x0758:
            int r1 = r13.A01()
            if (r1 != r3) goto L_0x0781
            int r1 = X.Pxh.A09(r8, r2)
            int r1 = r1 >> 24
            r2 = r1 & 255(0xff, float:3.57E-43)
            r8.A0H(r6)
            if (r2 != r3) goto L_0x0784
            long r11 = r8.A07()
            r6 = 0
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x078a
            java.lang.String r0 = "Variable length description in sgpd found (unsupported)"
        L_0x0777:
            X.47p r2 = new X.47p
            r2.<init>(r0, r9)
            r2.A01 = r5
            r2.A00 = r3
            throw r2
        L_0x0781:
            java.lang.String r0 = "Entry count in sbgp != 1 (unsupported)."
            goto L_0x0777
        L_0x0784:
            r1 = 2
            if (r2 < r1) goto L_0x078a
            r8.A0H(r6)
        L_0x078a:
            long r11 = r8.A07()
            r6 = 1
            int r1 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r1 != 0) goto L_0x0802
            r8.A0H(r3)
            int r2 = r8.A02()
            r1 = r2 & 240(0xf0, float:3.36E-43)
            int r23 = r1 >> 4
            r24 = r2 & 15
            int r1 = r8.A02()
            if (r1 != r3) goto L_0x07d0
            int r22 = r8.A02()
            r1 = 16
            byte[] r2 = new byte[r1]
            r8.A0J(r2, r5, r1)
            if (r22 != 0) goto L_0x07bd
            int r1 = r8.A02()
            byte[] r9 = new byte[r1]
            r8.A0J(r9, r5, r1)
        L_0x07bd:
            r4.A07 = r3
            X.4YD r1 = new X.4YD
            r18 = r1
            r19 = r10
            r20 = r2
            r21 = r9
            r25 = r3
            r18.<init>(r19, r20, r21, r22, r23, r24, r25)
            r4.A06 = r1
        L_0x07d0:
            int r8 = r53.size()
            r7 = 0
        L_0x07d5:
            if (r7 >= r8) goto L_0x0822
            r1 = r53
            java.lang.Object r3 = r1.get(r7)
            X.4YA r3 = (X.AnonymousClass4YA) r3
            int r2 = r3.A00
            r1 = 1970628964(0x75756964, float:3.1109627E32)
            if (r2 != r1) goto L_0x07ff
            X.4XV r6 = r3.A00
            r1 = 8
            r6.A0G(r1)
            r3 = 16
            r1 = r55
            r6.A0J(r1, r5, r3)
            byte[] r2 = A0Y
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L_0x07ff
            A01(r4, r6, r3)
        L_0x07ff:
            int r7 = r7 + 1
            goto L_0x07d5
        L_0x0802:
            java.lang.String r0 = "Entry count in sgpd != 1 (unsupported)."
            goto L_0x0777
        L_0x0806:
            long r1 = r2.A07()
            goto L_0x04dd
        L_0x080c:
            r4.A04 = r1
            r4.A08 = r9
            goto L_0x04e1
        L_0x0812:
            int r2 = r2.A01
            goto L_0x04ad
        L_0x0816:
            int r3 = r2.A03
            goto L_0x04a5
        L_0x081a:
            int r7 = r2.A00
            goto L_0x049d
        L_0x081e:
            int r8 = r2.A02
            goto L_0x0495
        L_0x0822:
            int r40 = r40 + 1
            goto L_0x043f
        L_0x0826:
            java.util.List r1 = r14.A02
            com.google.android.exoplayer2.drm.DrmInitData r7 = A00(r1)
            if (r7 == 0) goto L_0x0870
            int r6 = r56.size()
            r4 = 0
        L_0x0833:
            if (r4 >= r6) goto L_0x0870
            r1 = r56
            java.lang.Object r8 = r1.valueAt(r4)
            X.S76 r8 = (X.S76) r8
            X.Q0S r1 = r8.A05
            X.4YI r3 = r1.A03
            X.4YM r1 = r8.A08
            X.4YB r1 = r1.A05
            int r2 = r1.A02
            X.4YD[] r1 = r3.A0A
            r1 = r1[r2]
            if (r1 == 0) goto L_0x086e
            java.lang.String r1 = r1.A02
        L_0x084f:
            com.google.android.exoplayer2.drm.DrmInitData r3 = r7.A00(r1)
            X.Q0S r1 = r8.A05
            X.4YI r1 = r1.A03
            X.3wB r2 = r1.A07
            X.3w8 r1 = new X.3w8
            r1.<init>(r2)
            r1.A00(r3)
            X.3wB r2 = new X.3wB
            r2.<init>(r1)
            X.4Xd r1 = r8.A07
            r1.AWP(r2)
            int r4 = r4 + 1
            goto L_0x0833
        L_0x086e:
            r1 = 0
            goto L_0x084f
        L_0x0870:
            long r6 = r0.A0B
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02d2
            int r10 = r56.size()
        L_0x087f:
            if (r5 >= r10) goto L_0x08a7
            r1 = r56
            java.lang.Object r11 = r1.valueAt(r5)
            X.S76 r11 = (X.S76) r11
            int r4 = r11.A01
        L_0x088b:
            X.4YM r12 = r11.A08
            int r1 = r12.A00
            if (r4 >= r1) goto L_0x08a4
            long[] r1 = r12.A0C
            r8 = r1[r4]
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 > 0) goto L_0x08a4
            boolean[] r1 = r12.A0F
            boolean r1 = r1[r4]
            if (r1 == 0) goto L_0x08a1
            r11.A03 = r4
        L_0x08a1:
            int r4 = r4 + 1
            goto L_0x088b
        L_0x08a4:
            int r5 = r5 + 1
            goto L_0x087f
        L_0x08a7:
            r0.A0B = r2
            goto L_0x02d2
        L_0x08ab:
            boolean r1 = r4.isEmpty()
            if (r1 != 0) goto L_0x02d2
            java.lang.Object r1 = r4.peek()
            X.4Y8 r1 = (X.AnonymousClass4Y8) r1
            java.util.List r1 = r1.A01
            r1.add(r14)
            goto L_0x02d2
        L_0x08be:
            int r5 = r7.A00
            r4 = 1936286840(0x73696478, float:1.8491255E31)
            if (r5 != r4) goto L_0x0957
            X.4XV r9 = r7.A00
            int r4 = X.Pxh.A09(r9, r6)
            int r4 = r4 >> 24
            r5 = r4 & 255(0xff, float:3.57E-43)
            r4 = 4
            r9.A0H(r4)
            long r24 = r9.A07()
            if (r5 != 0) goto L_0x092c
            long r20 = r9.A07()
            long r4 = r9.A07()
        L_0x08e1:
            long r1 = r1 + r4
            r22 = 1000000(0xf4240, double:4.940656E-318)
            long r18 = com.google.android.exoplayer2.util.Util.A09(r20, r22, r24)
            r4 = 2
            r9.A0H(r4)
            int r8 = r9.A05()
            int[] r7 = new int[r8]
            long[] r10 = new long[r8]
            long[] r6 = new long[r8]
            long[] r5 = new long[r8]
            r16 = r18
            r4 = 0
        L_0x08fc:
            if (r4 >= r8) goto L_0x0935
            int r12 = r9.A01()
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            r11 = r11 & r12
            if (r11 != 0) goto L_0x0de3
            long r14 = r9.A07()
            r11 = 2147483647(0x7fffffff, float:NaN)
            r12 = r12 & r11
            r7[r4] = r12
            r10[r4] = r1
            r5[r4] = r16
            long r20 = r20 + r14
            long r14 = com.google.android.exoplayer2.util.Util.A09(r20, r22, r24)
            long r11 = r14 - r16
            r6[r4] = r11
            r11 = 4
            r9.A0H(r11)
            r11 = r7[r4]
            long r11 = (long) r11
            long r1 = r1 + r11
            int r4 = r4 + 1
            r16 = r14
            goto L_0x08fc
        L_0x092c:
            long r20 = r9.A08()
            long r4 = r9.A08()
            goto L_0x08e1
        L_0x0935:
            java.lang.Long r2 = java.lang.Long.valueOf(r18)
            X.4YN r1 = new X.4YN
            r1.<init>(r7, r10, r6, r5)
            android.util.Pair r4 = android.util.Pair.create(r2, r1)
            java.lang.Object r1 = r4.first
            long r1 = X.AnonymousClass7TE.A0R(r1)
            r0.A0C = r1
            X.4Sd r2 = r0.A0D
            java.lang.Object r1 = r4.second
            X.4YO r1 = (X.AnonymousClass4YO) r1
            r2.EKx(r1)
            r0.A0G = r13
            goto L_0x02cb
        L_0x0957:
            r1 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r5 != r1) goto L_0x02cb
            if (r11 == 0) goto L_0x02cb
            X.4XV r8 = r7.A00
            X.4Xd[] r1 = r0.A0J
            int r1 = r1.length
            if (r1 == 0) goto L_0x02cb
            int r1 = X.Pxh.A09(r8, r6)
            int r1 = r1 >> 24
            r2 = r1 & 255(0xff, float:3.57E-43)
            r16 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x09b7
            if (r2 == r13) goto L_0x0983
            java.lang.String r1 = "Skipping unsupported emsg version: "
            java.lang.String r2 = X.002.A0O(r1, r2)
            java.lang.String r1 = "FragmentedMp4Extractor"
            X.2AG.A04(r1, r2)
            goto L_0x02cb
        L_0x0983:
            long r22 = r8.A07()
            long r18 = r8.A08()
            r20 = 1000000(0xf4240, double:4.940656E-318)
            long r1 = com.google.android.exoplayer2.util.Util.A09(r18, r20, r22)
            long r24 = r8.A07()
            r26 = 1000(0x3e8, double:4.94E-321)
            r28 = r22
            long r22 = com.google.android.exoplayer2.util.Util.A09(r24, r26, r28)
            long r24 = r8.A07()
            r6 = 0
            java.lang.String r19 = r8.A09()
            r19.getClass()
            java.lang.String r20 = r8.A09()
            r20.getClass()
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x09ea
        L_0x09b7:
            r6 = 0
            java.lang.String r19 = r8.A09()
            r19.getClass()
            java.lang.String r20 = r8.A09()
            r20.getClass()
            long r25 = r8.A07()
            long r21 = r8.A07()
            r23 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = com.google.android.exoplayer2.util.Util.A09(r21, r23, r25)
            long r1 = r0.A0C
            int r7 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r7 == 0) goto L_0x0a22
            long r1 = r1 + r4
        L_0x09dc:
            long r21 = r8.A07()
            r23 = 1000(0x3e8, double:4.94E-321)
            long r22 = com.google.android.exoplayer2.util.Util.A09(r21, r23, r25)
            long r24 = r8.A07()
        L_0x09ea:
            int r9 = r8.A00
            int r7 = r8.A01
            int r9 = r9 - r7
            byte[] r10 = new byte[r9]
            r7 = 0
            r8.A0J(r10, r6, r9)
            com.google.android.exoplayer2.metadata.emsg.EventMessage r8 = new com.google.android.exoplayer2.metadata.emsg.EventMessage
            r18 = r8
            r21 = r10
            r18.<init>(r19, r20, r21, r22, r24)
            X.4XU r9 = r0.A0N
            byte[] r8 = r9.A00(r8)
            X.4XV r15 = new X.4XV
            r15.<init>((byte[]) r8)
            int r8 = r15.A00
            int r9 = r15.A01
            int r8 = r8 - r9
            X.4Xd[] r14 = r0.A0J
            int r12 = r14.length
            r10 = 0
        L_0x0a12:
            if (r10 >= r12) goto L_0x0a28
            r9 = r14[r10]
            r15.A0G(r6)
            r9.FMe(r11)
            r9.EJh(r15, r8)
            int r10 = r10 + 1
            goto L_0x0a12
        L_0x0a22:
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x09dc
        L_0x0a28:
            int r10 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            java.util.ArrayDeque r9 = r0.A0U
            if (r10 != 0) goto L_0x0a3d
            X.Run r7 = new X.Run
            r7.<init>(r4, r8, r13)
        L_0x0a33:
            r9.addLast(r7)
            int r1 = r0.A03
            int r1 = r1 + r8
            r0.A03 = r1
            goto L_0x02cb
        L_0x0a3d:
            boolean r4 = r9.isEmpty()
            if (r4 != 0) goto L_0x0a49
            X.Run r7 = new X.Run
            r7.<init>(r1, r8, r6)
            goto L_0x0a33
        L_0x0a49:
            long r4 = r0.A0A
            int r9 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r9 == 0) goto L_0x0a50
            r1 = r4
        L_0x0a50:
            X.4Xd[] r5 = r0.A0J
            int r4 = r5.length
        L_0x0a53:
            if (r7 >= r4) goto L_0x02cb
            r11 = r5[r7]
            r12 = 0
            r14 = r8
            r15 = r6
            r16 = r1
            r11.EJn(r12, r13, r14, r15, r16)
            int r7 = r7 + 1
            goto L_0x0a53
        L_0x0a62:
            r3.Evk(r4)
            goto L_0x02cb
        L_0x0a67:
            r1 = 0
            r0.A02 = r1
            r0.A00 = r1
            goto L_0x0000
        L_0x0a6e:
            java.lang.String r1 = "Offset to end of mdat was negative."
            goto L_0x0d90
        L_0x0a72:
            boolean r1 = r7.A06
            if (r1 != 0) goto L_0x0d86
            X.Q0S r1 = r7.A05
            long[] r2 = r1.A06
            int r1 = r7.A01
        L_0x0a7c:
            r4 = r2[r1]
            r1 = r3
            X.4Y6 r1 = (X.AnonymousClass4Y6) r1
            long r1 = r1.A02
            long r4 = r4 - r1
            int r1 = (int) r4
            if (r1 >= 0) goto L_0x0a8f
            java.lang.String r2 = "FragmentedMp4Extractor"
            java.lang.String r1 = "Ignoring negative offset to sample data."
            X.2AG.A04(r2, r1)
            r1 = 0
        L_0x0a8f:
            r3.Evk(r1)
            r0.A0E = r7
        L_0x0a94:
            int r2 = r0.A02
            r24 = 3
            r9 = 4
            r6 = 1
            r1 = r24
            if (r2 != r1) goto L_0x0b37
            boolean r1 = r7.A06
            if (r1 != 0) goto L_0x0ae9
            X.Q0S r1 = r7.A05
            int[] r1 = r1.A05
        L_0x0aa6:
            int r4 = r7.A01
            r2 = r1[r4]
            r0.A06 = r2
            int r1 = r7.A03
            if (r4 >= r1) goto L_0x0aee
            r3.Evk(r2)
            X.4YD r1 = r7.A01()
            if (r1 == 0) goto L_0x0ad9
            X.4YM r4 = r7.A08
            X.4XV r3 = r4.A0G
            int r1 = r1.A00
            if (r1 == 0) goto L_0x0ac4
            r3.A0H(r1)
        L_0x0ac4:
            int r2 = r7.A01
            boolean r1 = r4.A07
            if (r1 == 0) goto L_0x0ad9
            boolean[] r1 = r4.A0E
            boolean r1 = r1[r2]
            if (r1 == 0) goto L_0x0ad9
            int r1 = r3.A05()
            int r1 = r1 * 6
            r3.A0H(r1)
        L_0x0ad9:
            boolean r1 = r7.A03()
            if (r1 != 0) goto L_0x0ae3
            r1 = r25
            r0.A0E = r1
        L_0x0ae3:
            r1 = r24
            r0.A02 = r1
            r0 = 0
            return r0
        L_0x0ae9:
            X.4YM r1 = r7.A08
            int[] r1 = r1.A0A
            goto L_0x0aa6
        L_0x0aee:
            X.Q0S r1 = r7.A05
            X.4YI r1 = r1.A03
            int r1 = r1.A02
            if (r1 != r6) goto L_0x0afe
            r1 = 8
            int r2 = r2 - r1
            r0.A06 = r2
            r3.Evk(r1)
        L_0x0afe:
            X.Q0S r1 = r7.A05
            X.4YI r1 = r1.A03
            X.3wB r1 = r1.A07
            java.lang.String r2 = r1.A0W
            java.lang.String r1 = "audio/ac4"
            boolean r2 = r1.equals(r2)
            int r1 = r0.A06
            if (r2 == 0) goto L_0x0ce6
            r5 = 7
            int r1 = r7.A00(r1, r5)
            r0.A04 = r1
            int r4 = r0.A06
            X.4XV r2 = r0.A0S
            r2.A0E(r5)
            byte[] r1 = r2.A02
            X.Pxk.A0g(r1, r4)
            X.4Xd r1 = r7.A07
            r1.EJh(r2, r5)
            int r1 = r0.A04
            int r2 = r1 + 7
        L_0x0b2c:
            r0.A04 = r2
            int r1 = r0.A06
            int r1 = r1 + r2
            r0.A06 = r1
            r0.A02 = r9
            r0.A05 = r8
        L_0x0b37:
            X.Q0S r4 = r7.A05
            X.4YI r1 = r4.A03
            r34 = r1
            X.4Xd r2 = r7.A07
            boolean r1 = r7.A06
            if (r1 != 0) goto L_0x0cdc
            long[] r4 = r4.A07
            int r1 = r7.A01
            r4 = r4[r1]
        L_0x0b49:
            r1 = r34
            int r12 = r1.A01
            if (r12 == 0) goto L_0x0cec
            X.4XV r1 = r0.A0Q
            r33 = r1
            byte[] r11 = r1.A02
            r11[r8] = r8
            r11[r6] = r8
            r11[r10] = r8
            int r23 = r12 + 1
            int r22 = 4 - r12
        L_0x0b5f:
            int r1 = r0.A04
            int r10 = r0.A06
            if (r1 >= r10) goto L_0x0cfd
            int r10 = r0.A05
            if (r10 != 0) goto L_0x0bc6
            r10 = r22
            r1 = r23
            r3.readFully(r11, r10, r1)
            r1 = r33
            int r1 = X.Pxh.A09(r1, r8)
            if (r1 < r6) goto L_0x0d8e
            int r1 = r1 + -1
            r0.A05 = r1
            X.4XV r1 = r0.A0R
            r1.A0G(r8)
            r2.EJh(r1, r9)
            r1 = r33
            r2.EJh(r1, r6)
            X.4Xd[] r1 = r0.A0I
            int r1 = r1.length
            if (r1 <= 0) goto L_0x0bc4
            r1 = r34
            X.3wB r1 = r1.A07
            java.lang.String r12 = r1.A0W
            byte r13 = r11[r9]
            java.lang.String r1 = "video/avc"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0ba4
            r10 = r13 & 31
            r1 = 6
            if (r10 == r1) goto L_0x0bb4
        L_0x0ba4:
            java.lang.String r1 = "video/hevc"
            boolean r1 = r1.equals(r12)
            if (r1 == 0) goto L_0x0bc4
            r10 = r13 & 126(0x7e, float:1.77E-43)
            int r10 = r10 >> r6
            r1 = 39
            if (r10 != r1) goto L_0x0bc4
        L_0x0bb4:
            r1 = 1
        L_0x0bb5:
            r0.A0H = r1
            int r1 = r0.A04
            int r1 = r1 + 5
            r0.A04 = r1
            int r1 = r0.A06
            int r1 = r1 + r22
            r0.A06 = r1
            goto L_0x0b5f
        L_0x0bc4:
            r1 = 0
            goto L_0x0bb5
        L_0x0bc6:
            boolean r1 = r0.A0H
            if (r1 == 0) goto L_0x0cca
            X.4XV r12 = r0.A0P
            r12.A0E(r10)
            byte[] r1 = r12.A02
            r3.readFully(r1, r8, r10)
            int r1 = r0.A05
            r2.EJh(r12, r1)
            int r1 = r0.A05
            r16 = r1
            byte[] r10 = r12.A02
            int r1 = r12.A00
            int r10 = X.AnonymousClass4XW.A00(r10, r1)
            r1 = r34
            X.3wB r1 = r1.A07
            java.lang.String r13 = r1.A0W
            java.lang.String r1 = "video/hevc"
            boolean r1 = r1.equals(r13)
            r12.A0G(r1)
            r12.A0F(r10)
            X.4Xd[] r1 = r0.A0I
            r21 = r1
        L_0x0bfc:
            int r14 = r12.A00
            int r1 = r12.A01
            int r1 = r14 - r1
            r20 = 1
            if (r1 <= r6) goto L_0x0cce
            r13 = 0
        L_0x0c07:
            int r1 = r12.A01
            int r1 = r14 - r1
            if (r1 != 0) goto L_0x0cbf
            r13 = -1
        L_0x0c0e:
            r15 = 0
        L_0x0c0f:
            int r1 = r12.A01
            int r1 = r14 - r1
            if (r1 != 0) goto L_0x0cb4
            r15 = -1
        L_0x0c16:
            int r1 = r12.A01
            r10 = r1
            int r19 = r1 + r15
            r1 = -1
            if (r15 == r1) goto L_0x0ca2
            int r14 = r14 - r10
            if (r15 > r14) goto L_0x0ca2
            if (r13 != r9) goto L_0x0cad
            r1 = 8
            if (r15 < r1) goto L_0x0cad
            int r10 = r12.A02()
            int r14 = r12.A05()
            r13 = 49
            if (r14 != r13) goto L_0x0c9f
            int r18 = r12.A01()
        L_0x0c37:
            int r17 = r12.A02()
            r15 = 47
            if (r14 != r15) goto L_0x0c42
            r12.A0H(r6)
        L_0x0c42:
            r1 = 181(0xb5, float:2.54E-43)
            if (r10 != r1) goto L_0x0c51
            if (r14 == r13) goto L_0x0c4a
            if (r14 != r15) goto L_0x0c51
        L_0x0c4a:
            r15 = 1
            r10 = r24
            r1 = r17
            if (r1 == r10) goto L_0x0c52
        L_0x0c51:
            r15 = 0
        L_0x0c52:
            if (r14 != r13) goto L_0x0c5f
            r10 = 1195456820(0x47413934, float:49465.203)
            r1 = r18
            if (r1 == r10) goto L_0x0c5d
            r20 = 0
        L_0x0c5d:
            r15 = r15 & r20
        L_0x0c5f:
            if (r15 == 0) goto L_0x0cad
            int r13 = r12.A02()
            r1 = r13 & 64
            r10 = 0
            if (r1 == 0) goto L_0x0cad
            r1 = r13 & 31
            r12.A0H(r6)
            int r15 = r1 * 3
            int r1 = r12.A01
            r20 = r1
            r1 = r21
            int r14 = r1.length
        L_0x0c78:
            if (r10 >= r14) goto L_0x0cad
            r13 = r21[r10]
            r1 = r20
            r12.A0G(r1)
            r13.EJh(r12, r15)
            r17 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r1 == 0) goto L_0x0c9c
            r26 = r13
            r27 = r25
            r28 = r6
            r29 = r15
            r30 = r8
            r31 = r4
            r26.EJn(r27, r28, r29, r30, r31)
        L_0x0c9c:
            int r10 = r10 + 1
            goto L_0x0c78
        L_0x0c9f:
            r18 = 0
            goto L_0x0c37
        L_0x0ca2:
            java.lang.String r10 = "CeaUtil"
            java.lang.String r1 = "Skipping remainder of malformed SEI NAL unit."
            X.2AG.A04(r10, r1)
            int r1 = r12.A00
            r19 = r1
        L_0x0cad:
            r1 = r19
            r12.A0G(r1)
            goto L_0x0bfc
        L_0x0cb4:
            int r10 = r12.A02()
            int r15 = r15 + r10
            r1 = 255(0xff, float:3.57E-43)
            if (r10 == r1) goto L_0x0c0f
            goto L_0x0c16
        L_0x0cbf:
            int r10 = r12.A02()
            int r13 = r13 + r10
            r1 = 255(0xff, float:3.57E-43)
            if (r10 == r1) goto L_0x0c07
            goto L_0x0c0e
        L_0x0cca:
            int r16 = r2.EJl(r3, r10, r8, r8)
        L_0x0cce:
            int r1 = r0.A04
            int r1 = r1 + r16
            r0.A04 = r1
            int r1 = r0.A05
            int r1 = r1 - r16
            r0.A05 = r1
            goto L_0x0b5f
        L_0x0cdc:
            X.4YM r1 = r7.A08
            int r4 = r7.A01
            long[] r1 = r1.A0C
            r4 = r1[r4]
            goto L_0x0b49
        L_0x0ce6:
            int r2 = r7.A00(r1, r8)
            goto L_0x0b2c
        L_0x0cec:
            int r1 = r0.A04
            int r10 = r0.A06
            if (r1 >= r10) goto L_0x0cfd
            int r10 = r10 - r1
            int r9 = r2.EJl(r3, r10, r8, r8)
            int r1 = r0.A04
            int r1 = r1 + r9
            r0.A04 = r1
            goto L_0x0cec
        L_0x0cfd:
            boolean r1 = r7.A06
            if (r1 != 0) goto L_0x0d6d
            X.Q0S r1 = r7.A05
            int[] r3 = r1.A04
            int r1 = r7.A01
            r13 = r3[r1]
        L_0x0d09:
            X.4YD r3 = r7.A01()
            if (r3 == 0) goto L_0x0d12
            r1 = 1073741824(0x40000000, float:2.0)
            r13 = r13 | r1
        L_0x0d12:
            if (r3 == 0) goto L_0x0d6b
            X.4Xh r9 = r3.A01
        L_0x0d16:
            X.S76 r1 = r0.A0E
            if (r1 == 0) goto L_0x0d2c
            X.Q0S r1 = r1.A05
            X.4YI r1 = r1.A03
            X.3wB r1 = r1.A07
            java.lang.String r3 = r1.A0W
            java.lang.String r1 = "application/x-mp4-vtt"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0d2c
            r13 = r13 | 1
        L_0x0d2c:
            r11 = r2
            r12 = r9
            r14 = r10
            r15 = r8
            r16 = r4
            r11.EJn(r12, r13, r14, r15, r16)
            r0.A0A = r4
        L_0x0d37:
            java.util.ArrayDeque r2 = r0.A0U
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x0d7a
            java.lang.Object r3 = r2.removeFirst()
            X.Run r3 = (X.C10593Run) r3
            int r1 = r0.A03
            int r11 = r3.A00
            int r1 = r1 - r11
            r0.A03 = r1
            long r1 = r3.A01
            boolean r3 = r3.A02
            if (r3 == 0) goto L_0x0d53
            long r1 = r1 + r4
        L_0x0d53:
            X.4Xd[] r10 = r0.A0J
            int r9 = r10.length
            r8 = 0
        L_0x0d57:
            if (r8 >= r9) goto L_0x0d37
            r12 = r10[r8]
            int r3 = r0.A03
            r13 = r25
            r14 = r6
            r15 = r11
            r16 = r3
            r17 = r1
            r12.EJn(r13, r14, r15, r16, r17)
            int r8 = r8 + 1
            goto L_0x0d57
        L_0x0d6b:
            r9 = 0
            goto L_0x0d16
        L_0x0d6d:
            X.4YM r1 = r7.A08
            boolean[] r3 = r1.A0F
            int r1 = r7.A01
            boolean r1 = r3[r1]
            boolean r13 = X.AnonymousClass7TF.A1P(r1)
            goto L_0x0d09
        L_0x0d7a:
            boolean r1 = r7.A03()
            if (r1 != 0) goto L_0x0ae3
            r1 = r25
            r0.A0E = r1
            goto L_0x0ae3
        L_0x0d86:
            X.4YM r1 = r7.A08
            long[] r2 = r1.A0D
            int r1 = r7.A02
            goto L_0x0a7c
        L_0x0d8e:
            java.lang.String r1 = "Invalid NAL length"
        L_0x0d90:
            r0 = r25
            X.47p r2 = X.C2609347p.A00(r1, r0)
            throw r2
        L_0x0d97:
            java.lang.String r0 = "Offset to encryption data was negative."
            X.47p r2 = X.C2609347p.A00(r0, r9)
            throw r2
        L_0x0d9e:
            java.lang.String r1 = "Leaf atom with length > 2147483647 (unsupported)."
            goto L_0x0ded
        L_0x0da1:
            java.lang.String r1 = "Leaf atom defines extended atom size (unsupported)."
            goto L_0x0ded
        L_0x0da4:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected negative value: "
            r2.append(r0)
            r2.append(r12)
            goto L_0x0dd9
        L_0x0db1:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Saiz sample count "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " is greater than fragment sample count"
            goto L_0x0dc6
        L_0x0dc0:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected saio entry count: "
        L_0x0dc6:
            r2.append(r0)
            r2.append(r1)
            goto L_0x0dd9
        L_0x0dcd:
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "Unexpected negative value: "
            r2.append(r0)
            r2.append(r13)
        L_0x0dd9:
            java.lang.String r1 = r2.toString()
            r0 = 0
            X.47p r2 = X.C2609347p.A00(r1, r0)
            throw r2
        L_0x0de3:
            r1 = 0
            java.lang.String r0 = "Unhandled indirect reference"
            X.47p r2 = X.C2609347p.A00(r0, r1)
            throw r2
        L_0x0deb:
            java.lang.String r1 = "Atom size less than header length (unsupported)."
        L_0x0ded:
            r0 = 0
            X.47p r2 = new X.47p
            r2.<init>(r1, r0)
            r2.A01 = r6
            r2.A00 = r8
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor2.E68(X.4Y7, X.4Sh):int");
    }

    public final void EKu(long j, long j2) {
        SparseArray sparseArray = this.A0L;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((S76) sparseArray.valueAt(i)).A02();
        }
        this.A0U.clear();
        this.A03 = 0;
        this.A0B = j2;
        this.A0T.clear();
        this.A02 = 0;
        this.A00 = 0;
    }

    public FragmentedMp4Extractor2(C265994Xd r6, List list, int i) {
        this.A0A = -9223372036854775807L;
        this.A0K = i;
        this.A0V = Collections.unmodifiableList(list);
        this.A0M = r6;
        this.A0N = new AnonymousClass4XU();
        this.A0O = new AnonymousClass4XV(16);
        this.A0R = new AnonymousClass4XV(AnonymousClass4XW.A01);
        this.A0Q = new AnonymousClass4XV(5);
        this.A0P = new AnonymousClass4XV();
        byte[] bArr = new byte[16];
        this.A0W = bArr;
        this.A0S = new AnonymousClass4XV(bArr);
        this.A0T = new ArrayDeque();
        this.A0U = new ArrayDeque();
        this.A0L = Pxe.A0L();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0D = C265004Sd.A00;
        this.A0J = new C265994Xd[0];
        this.A0I = new C265994Xd[0];
    }

    public static DrmInitData A00(List list) {
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            AnonymousClass4YA r2 = (AnonymousClass4YA) list.get(i);
            if (r2.A00 == 1886614376) {
                if (arrayList == null) {
                    arrayList = AnonymousClass7TE.A1C();
                }
                byte[] bArr = r2.A00.A02;
                C10594Ruo A002 = C11303SKn.A00(bArr);
                if (A002 == null) {
                    2AG.A04("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new DrmInitData.SchemeData((String) null, "video/mp4", A002.A01, bArr));
                }
            }
        }
        if (arrayList != null) {
            return new DrmInitData((String) null, (DrmInitData.SchemeData[]) arrayList.toArray(new DrmInitData.SchemeData[0]), false);
        }
        return null;
    }

    public FragmentedMp4Extractor2() {
        this((C265994Xd) null, Collections.emptyList(), 0);
    }
}
