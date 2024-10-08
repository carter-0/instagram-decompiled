package X;

import android.util.SparseArray;
import androidx.media3.common.util.Util;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;

/* renamed from: X.XvT  reason: case insensitive filesystem */
public final class C22103XvT implements C13809Thc {
    public YBZ A00;
    public C21153XGu A01;
    public boolean A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final SparseArray A07 = new SparseArray();
    public final C11389SRd A08 = Pxe.A0P(4096);
    public final C21505XdL A09 = new C21505XdL();
    public final XnI A0A = new XnI();

    public final /* synthetic */ C13809Thc CBL() {
        return this;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [X.Y91, java.lang.Object] */
    public final int E67(C13910TlA tlA, C21363XYr xYr) {
        long j;
        int A082;
        long j2;
        C22557YAo sfj;
        C13511Tbc sf7;
        long j3;
        long j4;
        long j5;
        YBZ ybz = this.A00;
        C11366SPh.A00(ybz);
        C13910TlA tlA2 = tlA;
        long length = tlA2.getLength();
        C21363XYr xYr2 = xYr;
        if (length != -1) {
            XnI xnI = this.A0A;
            if (!xnI.A03) {
                if (!xnI.A05) {
                    int min = (int) Math.min(20000, length);
                    j3 = length - ((long) min);
                    if (tlA2.Bdl() == j3) {
                        C11389SRd sRd = xnI.A06;
                        sRd.A0M(min);
                        tlA2.EI7();
                        tlA2.E2F(sRd.A02, 0, min);
                        int i = sRd.A01;
                        int i2 = sRd.A00 - 4;
                        while (true) {
                            if (i2 < i) {
                                j5 = -9223372036854775807L;
                                break;
                            }
                            if (C21056XCh.A02(sRd.A02, i2) == 442) {
                                sRd.A0O(i2 + 4);
                                j5 = XnI.A00(sRd);
                                if (j5 != -9223372036854775807L) {
                                    break;
                                }
                            }
                            i2--;
                        }
                        xnI.A02 = j5;
                        xnI.A05 = true;
                    }
                    xYr2.A00 = j3;
                    return 1;
                }
                if (xnI.A02 != -9223372036854775807L) {
                    if (!xnI.A04) {
                        int min2 = (int) Math.min(20000, length);
                        j3 = 0;
                        if (tlA2.Bdl() == 0) {
                            C11389SRd sRd2 = xnI.A06;
                            sRd2.A0M(min2);
                            tlA2.EI7();
                            tlA2.E2F(sRd2.A02, 0, min2);
                            int i3 = sRd2.A01;
                            int i4 = sRd2.A00;
                            while (true) {
                                if (i3 >= i4 - 3) {
                                    j4 = -9223372036854775807L;
                                    break;
                                }
                                if (C21056XCh.A02(sRd2.A02, i3) == 442) {
                                    sRd2.A0O(i3 + 4);
                                    j4 = XnI.A00(sRd2);
                                    if (j4 != -9223372036854775807L) {
                                        break;
                                    }
                                }
                                i3++;
                            }
                            xnI.A01 = j4;
                            xnI.A04 = true;
                        }
                        xYr2.A00 = j3;
                        return 1;
                    }
                    long j6 = xnI.A01;
                    if (j6 != -9223372036854775807L) {
                        C21505XdL xdL = xnI.A07;
                        xnI.A00 = xdL.A03(xnI.A02) - xdL.A02(j6);
                    }
                }
                xnI.A06.A0Q(Util.A07, 0);
                xnI.A03 = true;
                tlA2.EI7();
                return 0;
            }
        }
        if (!this.A02) {
            this.A02 = true;
            XnI xnI2 = this.A0A;
            long j7 = xnI2.A00;
            if (j7 != -9223372036854775807L) {
                C21483Xca xca = new C21483Xca(new Object(), new C22099XvP(xnI2.A07), IgNetworkConsentStorage.MAX_ENTRIES, j7, j7 + 1, 0, length, 188);
                this.A01 = xca;
                sf7 = xca.A01;
            } else {
                sf7 = new C11710Sf7(j7);
            }
            ybz.EKw(sf7);
        }
        C21153XGu xGu = this.A01;
        if (xGu != null && xGu.A00 != null) {
            return xGu.A00(tlA2, xYr2);
        }
        tlA2.EI7();
        if (length != -1) {
            j = length - tlA2.BbM();
        } else {
            j = -1;
        }
        if (j != -1 && j < 4) {
            return -1;
        }
        C11389SRd sRd3 = this.A08;
        if (!tlA2.E2G(sRd3.A02, 0, 4, true)) {
            return -1;
        }
        sRd3.A0O(0);
        int A012 = sRd3.A01();
        if (A012 == 441) {
            return -1;
        }
        if (A012 == 442) {
            tlA2.E2F(sRd3.A02, 0, 10);
            sRd3.A0O(9);
            A082 = (sRd3.A05() & 7) + 14;
        } else if (A012 == 443) {
            tlA2.E2F(sRd3.A02, 0, 2);
            sRd3.A0O(0);
            A082 = sRd3.A08() + 6;
        } else if (((A012 & -256) >> 8) != 1) {
            tlA2.Evk(1);
            return 0;
        } else {
            int i5 = A012 & 255;
            SparseArray sparseArray = this.A07;
            C21442Xau xau = (C21442Xau) sparseArray.get(i5);
            if (!this.A04) {
                if (xau == null) {
                    if (i5 == 189) {
                        sfj = new C11741Sfc();
                    } else if ((i5 & 224) == 192) {
                        sfj = new C11743Sfe();
                    } else if ((i5 & 240) == 224) {
                        sfj = new C11748Sfj();
                        this.A06 = true;
                        this.A03 = tlA2.Bdl();
                        sfj.ANC(this.A00, new SR8(AnonymousClass972.MUTABLE_FLAG_MASK, i5, 256));
                        xau = new C21442Xau(this.A09, sfj);
                        sparseArray.put(i5, xau);
                    }
                    this.A05 = true;
                    this.A03 = tlA2.Bdl();
                    sfj.ANC(this.A00, new SR8(AnonymousClass972.MUTABLE_FLAG_MASK, i5, 256));
                    xau = new C21442Xau(this.A09, sfj);
                    sparseArray.put(i5, xau);
                }
                if (!this.A05 || !this.A06) {
                    j2 = 1048576;
                } else {
                    j2 = this.A03 + 8192;
                }
                if (tlA2.Bdl() > j2) {
                    this.A04 = true;
                    this.A00.ASU();
                }
            }
            tlA2.E2F(sRd3.A02, 0, 2);
            sRd3.A0O(0);
            A082 = sRd3.A08() + 6;
            if (xau != null) {
                sRd3.A0M(A082);
                tlA2.readFully(sRd3.A02, 0, A082);
                sRd3.A0O(6);
                ST7 st7 = xau.A03;
                sRd3.A0R(st7.A03, 0, 3);
                st7.A09(0);
                st7.A0A(8);
                xau.A01 = st7.A0F();
                xau.A00 = st7.A0F();
                sRd3.A0R(st7.A03, 0, ST7.A00(st7, 6, 8));
                st7.A09(0);
                long j8 = 0;
                if (xau.A01) {
                    st7.A0A(4);
                    st7.A0A(1);
                    long A032 = C21056XCh.A03(st7, ((long) st7.A06(3)) << 30);
                    if (!xau.A02 && xau.A00) {
                        st7.A0A(1);
                        xau.A04.A02(C21056XCh.A03(st7, ((long) ST7.A00(st7, 4, 3)) << 30));
                        xau.A02 = true;
                    }
                    j8 = xau.A04.A02(A032);
                }
                C22557YAo yAo = xau.A05;
                yAo.E1Y(j8, 4);
                yAo.AJP(sRd3);
                yAo.E1X(false);
                sRd3.A0N(sRd3.A02.length);
                return 0;
            }
        }
        tlA2.Evk(A082);
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0020, code lost:
        if (r3 != r12) goto L_0x0022;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0034 A[LOOP:0: B:17:0x002c->B:19:0x0034, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0045 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EKu(long r10, long r12) {
        /*
            r9 = this;
            X.XdL r6 = r9.A09
            monitor-enter(r6)
            long r1 = r6.A01     // Catch:{ all -> 0x0046 }
            monitor-exit(r6)
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            int r0 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0022
            long r3 = r6.A00()
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
            int r0 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r0 == 0) goto L_0x0025
        L_0x0022:
            r6.A04(r12)
        L_0x0025:
            X.XGu r0 = r9.A01
            if (r0 == 0) goto L_0x002c
            r0.A01(r12)
        L_0x002c:
            android.util.SparseArray r1 = r9.A07
            int r0 = r1.size()
            if (r5 >= r0) goto L_0x0045
            java.lang.Object r1 = r1.valueAt(r5)
            X.Xau r1 = (X.C21442Xau) r1
            r0 = 0
            r1.A02 = r0
            X.YAo r0 = r1.A05
            r0.EKt()
            int r5 = r5 + 1
            goto L_0x002c
        L_0x0045:
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22103XvT.EKu(long, long):void");
    }

    public final boolean Evx(C13910TlA tlA) {
        byte[] bArr = new byte[14];
        tlA.E2F(bArr, 0, 14);
        if (442 != (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        tlA.AAu(bArr[13] & 7);
        tlA.E2F(bArr, 0, 3);
        if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
            return true;
        }
        return false;
    }

    public final void CMU(YBZ ybz) {
        this.A00 = ybz;
    }
}
