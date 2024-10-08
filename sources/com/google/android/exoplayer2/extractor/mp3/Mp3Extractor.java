package com.google.android.exoplayer2.extractor.mp3;

import X.AnonymousClass4XT;
import X.AnonymousClass4XV;
import X.AnonymousClass4Y6;
import X.AnonymousClass4Y7;
import X.AnonymousClass4YK;
import X.C10262RpM;
import X.C12526SwM;
import X.C12529SwP;
import X.C13463Taq;
import X.C13953TmG;
import X.C2609347p;
import X.C265004Sd;
import X.C265994Xd;
import X.C301755zw;
import X.Pxg;
import X.Pxh;
import X.Pxk;
import X.Q0Q;
import X.Qo4;
import X.S38;
import X.SN2;
import X.Swi;
import com.facebook.common.dextricks.Constants;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.id3.TextInformationFrame;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;

public final class Mp3Extractor implements AnonymousClass4XT {
    public static final C13463Taq A0J = new Swi();
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public C265004Sd A06;
    public C265994Xd A07;
    public C265994Xd A08;
    public C13953TmG A09;
    public Metadata A0A;
    public boolean A0B;
    public final int A0C;
    public final long A0D;
    public final S38 A0E;
    public final Q0Q A0F;
    public final AnonymousClass4XV A0G;
    public final C10262RpM A0H;
    public final C265994Xd A0I;

    public final void EKu(long j, long j2) {
        this.A01 = 0;
        this.A02 = -9223372036854775807L;
        this.A04 = 0;
        this.A00 = 0;
        this.A05 = j2;
        C13953TmG tmG = this.A09;
        if (tmG instanceof C12529SwP) {
            C301755zw r1 = ((C12529SwP) tmG).A02;
            if (j2 - r1.A00(r1.A00 - 1) >= 100000) {
                this.A0B = true;
                this.A07 = this.A0I;
            }
        }
    }

    public final boolean Evy(AnonymousClass4Y7 r2) {
        return A03(r2, true);
    }

    public static long A00(Metadata metadata) {
        if (metadata == null) {
            return -9223372036854775807L;
        }
        for (Metadata.Entry entry : metadata.A01) {
            if (entry instanceof TextInformationFrame) {
                TextInformationFrame textInformationFrame = (TextInformationFrame) entry;
                if (textInformationFrame.A00.equals("TLEN")) {
                    return Util.A07(Pxg.A0J(textInformationFrame.A01, 0));
                }
            }
        }
        return -9223372036854775807L;
    }

    private C12526SwM A01(AnonymousClass4Y7 r8, boolean z) {
        AnonymousClass4XV r3 = this.A0G;
        r8.E2F(r3.A02, 0, 4);
        r3.A0G(0);
        S38 s38 = this.A0E;
        s38.A00(r3.A01());
        AnonymousClass4Y6 r82 = (AnonymousClass4Y6) r8;
        return new C12526SwM(s38, r82.A04, r82.A02, z);
    }

    private boolean A02(AnonymousClass4Y7 r9) {
        boolean z;
        C13953TmG tmG = this.A09;
        if (tmG != null) {
            long AvI = tmG.AvI();
            if (AvI != -1) {
                AnonymousClass4Y6 r0 = (AnonymousClass4Y6) r9;
                if (r0.A02 + ((long) r0.A01) > AvI - 4) {
                    return true;
                }
            }
        }
        try {
            byte[] bArr = this.A0G.A02;
            AnonymousClass4Y6 r92 = (AnonymousClass4Y6) r9;
            if (!r92.A02(4, true)) {
                z = false;
            } else {
                System.arraycopy(r92.A03, r92.A01 - 4, bArr, 0, 4);
                z = true;
            }
            return !z;
        } catch (EOFException unused) {
            return true;
        }
    }

    private boolean A03(AnonymousClass4Y7 r19, boolean z) {
        int i;
        int i2;
        int A002;
        C13463Taq taq;
        int i3 = Constants.LOAD_RESULT_DEX2OAT_TRY_PERIODIC_PGO_COMP;
        if (z) {
            i3 = Constants.LOAD_RESULT_PGO;
        }
        AnonymousClass4Y7 r8 = r19;
        AnonymousClass4Y6 r6 = (AnonymousClass4Y6) r8;
        r6.A01 = 0;
        if (r6.A02 == 0) {
            if ((this.A0C & 8) == 0) {
                taq = null;
            } else {
                taq = A0J;
            }
            C10262RpM rpM = this.A0H;
            Metadata metadata = null;
            int i4 = 0;
            while (true) {
                try {
                    AnonymousClass4XV r0 = rpM.A00;
                    r8.E2F(r0.A02, 0, 10);
                    r0.A0G(0);
                    if (r0.A03() != 4801587) {
                        break;
                    }
                    r0.A0H(3);
                    int A012 = Pxk.A01(r0);
                    int i5 = A012 + 10;
                    if (metadata == null) {
                        byte[] bArr = new byte[i5];
                        System.arraycopy(r0.A02, 0, bArr, 0, 10);
                        r8.E2F(bArr, 10, A012);
                        metadata = new Qo4(taq).A07(bArr, i5);
                    } else {
                        r6.A02(A012, false);
                    }
                    i4 += i5;
                } catch (EOFException unused) {
                }
            }
            r6.A01 = 0;
            r6.A02(i4, false);
            this.A0A = metadata;
            if (metadata != null) {
                this.A0F.A00(metadata);
            }
            i2 = (int) (r6.A02 + ((long) r6.A01));
            if (!z) {
                r8.Evk(i2);
            }
            i = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i6 = 0;
        int i7 = 0;
        while (true) {
            if (!A02(r8)) {
                int A092 = Pxh.A09(this.A0G, 0);
                if ((i == 0 || ((long) (-128000 & A092)) == (((long) i) & -128000)) && (A002 = SN2.A00(A092)) != -1) {
                    i6++;
                    if (i6 != 1) {
                        if (i6 == 4) {
                            break;
                        }
                    } else {
                        this.A0E.A00(A092);
                        i = A092;
                    }
                    r6.A02(A002 - 4, false);
                } else {
                    int i8 = i7 + 1;
                    if (i7 != i3) {
                        if (z) {
                            r6.A01 = 0;
                            r6.A02(i2 + i8, false);
                        } else {
                            r8.Evk(1);
                        }
                        i7 = i8;
                        i = 0;
                        i6 = 0;
                    } else if (z) {
                        return false;
                    } else {
                        throw C2609347p.A00("Searched too many bytes.", (Throwable) null);
                    }
                }
            } else if (i6 <= 0) {
                throw new EOFException();
            }
        }
        if (z) {
            r8.Evk(i2 + i7);
        } else {
            r6.A01 = 0;
        }
        this.A01 = i;
        return true;
    }

    public final void CMc(C265004Sd r3) {
        this.A06 = r3;
        C265994Xd FHW = r3.FHW(0, 1);
        this.A08 = FHW;
        this.A07 = FHW;
        this.A06.ASU();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v60, resolved type: X.SwR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v72, resolved type: X.SwR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v35, resolved type: X.SwS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v73, resolved type: X.SwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v74, resolved type: X.SwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v75, resolved type: X.SwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v76, resolved type: X.SwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v38, resolved type: X.SwS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v40, resolved type: X.SwS} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v105, resolved type: X.SwQ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v106, resolved type: X.SwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v107, resolved type: X.SwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v108, resolved type: X.SwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v109, resolved type: X.SwM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v5, resolved type: X.SwP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v110, resolved type: X.SwR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v111, resolved type: X.SwR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v112, resolved type: X.SwR} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v113, resolved type: X.SwM} */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x028b, code lost:
        if ((r7 & 1) != 0) goto L_0x028d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r2 == 1) goto L_0x0038;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03bd, code lost:
        if (r8 != -1) goto L_0x03e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x040c, code lost:
        if (r1 != null) goto L_0x0280;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x040e, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0243, code lost:
        if (r2 != 1) goto L_0x0038;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x026e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0283  */
    /* JADX WARNING: Removed duplicated region for block: B:121:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x03ef  */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E68(X.AnonymousClass4Y7 r36, X.C265044Sh r37) {
        /*
            r35 = this;
            r0 = r35
            X.4Xd r1 = r0.A08
            X.C256703wD.A01(r1)
            int r1 = r0.A01
            r14 = r36
            if (r1 != 0) goto L_0x0015
            r1 = 0
            r0.A03(r14, r1)     // Catch:{ EOFException -> 0x0012 }
            goto L_0x0015
        L_0x0012:
            r8 = -1
            goto L_0x03bf
        L_0x0015:
            X.TmG r1 = r0.A09
            if (r1 != 0) goto L_0x0249
            X.S38 r6 = r0.A0E
            int r2 = r6.A02
            X.4XV r7 = new X.4XV
            r7.<init>((int) r2)
            byte[] r1 = r7.A02
            r15 = 0
            r14.E2F(r1, r15, r2)
            int r1 = r6.A05
            r24 = 1
            r1 = r1 & 1
            int r2 = r6.A01
            if (r1 == 0) goto L_0x023f
            r5 = 36
            r1 = r24
            if (r2 != r1) goto L_0x003a
        L_0x0038:
            r5 = 21
        L_0x003a:
            int r2 = r7.A00
            int r1 = r5 + 4
            if (r2 < r1) goto L_0x016c
            int r2 = X.Pxh.A09(r7, r5)
            r3 = 1483304551(0x58696e67, float:1.02664153E15)
            if (r2 == r3) goto L_0x004e
            r1 = 1231971951(0x496e666f, float:976486.94)
            if (r2 != r1) goto L_0x016c
        L_0x004e:
            r13 = 1231971951(0x496e666f, float:976486.94)
            if (r2 == r3) goto L_0x0055
            if (r2 != r13) goto L_0x0178
        L_0x0055:
            r8 = r14
            X.4Y6 r8 = (X.AnonymousClass4Y6) r8
            long r9 = r8.A04
            long r3 = r8.A02
            r17 = r3
            int r11 = r6.A04
            int r1 = r6.A03
            int r16 = r7.A01()
            r4 = r16 & 1
            r3 = r24
            if (r4 != r3) goto L_0x0169
            int r3 = r7.A04()
            if (r3 == 0) goto L_0x0169
            long r3 = (long) r3
            r21 = r3
            long r3 = (long) r11
            r11 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r11
            long r11 = (long) r1
            r19 = r21
            r21 = r3
            r23 = r11
            long r24 = com.google.android.exoplayer2.util.Util.A09(r19, r21, r23)
            r3 = 6
            r1 = r16 & 6
            if (r1 == r3) goto L_0x0127
            int r3 = r6.A02
            r26 = -1
            r20 = 0
            X.SwR r1 = new X.SwR
            r19 = r1
            r21 = r3
            r22 = r17
            r19.<init>(r20, r21, r22, r24, r26)
        L_0x009b:
            if (r1 == 0) goto L_0x00a8
            X.Q0Q r7 = r0.A0F
            int r3 = r7.A00
            r4 = -1
            if (r3 == r4) goto L_0x0104
            int r3 = r7.A01
            if (r3 == r4) goto L_0x0104
        L_0x00a8:
            int r3 = r6.A02
            r14.Evk(r3)
            if (r1 == 0) goto L_0x00bd
            long[] r3 = r1.A01
            boolean r3 = X.AnonymousClass7TF.A1V(r3)
            if (r3 != 0) goto L_0x00bd
            if (r2 != r13) goto L_0x00bd
            X.SwM r1 = r0.A01(r14, r15)
        L_0x00bd:
            com.google.android.exoplayer2.metadata.Metadata r10 = r0.A0A
            long r4 = r8.A02
            if (r10 == 0) goto L_0x0247
            com.google.android.exoplayer2.metadata.Metadata$Entry[] r9 = r10.A01
            int r7 = r9.length
            r3 = 0
        L_0x00c7:
            if (r3 >= r7) goto L_0x0247
            r13 = r9[r3]
            boolean r2 = r13 instanceof com.google.android.exoplayer2.metadata.id3.MlltFrame
            if (r2 == 0) goto L_0x0101
            com.google.android.exoplayer2.metadata.id3.MlltFrame r13 = (com.google.android.exoplayer2.metadata.id3.MlltFrame) r13
            long r18 = A00(r10)
            int[] r12 = r13.A03
            int r11 = r12.length
            int r2 = r11 + 1
            long[] r10 = new long[r2]
            long[] r9 = new long[r2]
            r10[r15] = r4
            r16 = 0
            r9[r15] = r16
            r7 = 1
        L_0x00e5:
            if (r7 > r11) goto L_0x0260
            int r3 = r13.A00
            int r15 = r7 + -1
            r2 = r12[r15]
            int r3 = r3 + r2
            long r2 = (long) r3
            long r4 = r4 + r2
            int r3 = r13.A01
            int[] r2 = r13.A04
            r2 = r2[r15]
            int r3 = r3 + r2
            long r2 = (long) r3
            long r16 = r16 + r2
            r10[r7] = r4
            r9[r7] = r16
            int r7 = r7 + 1
            goto L_0x00e5
        L_0x0101:
            int r3 = r3 + 1
            goto L_0x00c7
        L_0x0104:
            r8.A01 = r15
            int r3 = r5 + 141
            r8.A02(r3, r15)
            X.4XV r5 = r0.A0G
            byte[] r4 = r5.A02
            r3 = 3
            r14.E2F(r4, r15, r3)
            r5.A0G(r15)
            int r3 = r5.A03()
            int r4 = r3 >> 12
            r3 = r3 & 4095(0xfff, float:5.738E-42)
            if (r4 > 0) goto L_0x0122
            if (r3 <= 0) goto L_0x00a8
        L_0x0122:
            r7.A00 = r4
            r7.A01 = r3
            goto L_0x00a8
        L_0x0127:
            long r33 = r7.A07()
            r11 = 100
            long[] r12 = new long[r11]
            r1 = 0
        L_0x0130:
            int r3 = r7.A02()
            long r3 = (long) r3
            r12[r1] = r3
            int r1 = r1 + 1
            if (r1 < r11) goto L_0x0130
            r3 = -1
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 == 0) goto L_0x0156
            long r30 = r17 + r33
            int r1 = (r9 > r30 ? 1 : (r9 == r30 ? 0 : -1))
            if (r1 == 0) goto L_0x0156
            java.lang.String r26 = "XING data size mismatch: "
            java.lang.String r27 = ", "
            r28 = r9
            java.lang.String r3 = X.002.A0f(r26, r27, r28, r30)
            java.lang.String r1 = "XingSeeker"
            X.2AG.A04(r1, r3)
        L_0x0156:
            int r3 = r6.A02
            X.SwR r1 = new X.SwR
            r26 = r1
            r27 = r12
            r28 = r3
            r29 = r17
            r31 = r24
            r26.<init>(r27, r28, r29, r31, r33)
            goto L_0x009b
        L_0x0169:
            r1 = 0
            goto L_0x009b
        L_0x016c:
            int r2 = r7.A00
            r1 = 40
            if (r2 < r1) goto L_0x0237
            r1 = 36
            int r2 = X.Pxh.A09(r7, r1)
        L_0x0178:
            r1 = 1447187017(0x56425249, float:5.3414667E13)
            if (r2 != r1) goto L_0x0237
            r8 = r14
            X.4Y6 r8 = (X.AnonymousClass4Y6) r8
            long r1 = r8.A04
            r22 = r1
            long r2 = r8.A02
            r1 = 10
            r7.A0H(r1)
            int r4 = r7.A01()
            r1 = 0
            if (r4 <= 0) goto L_0x0230
            int r11 = r6.A03
            long r9 = (long) r4
            r18 = 1000000(0xf4240, double:4.940656E-318)
            r5 = 32000(0x7d00, float:4.4842E-41)
            r4 = 576(0x240, float:8.07E-43)
            if (r11 < r5) goto L_0x01a0
            r4 = 1152(0x480, float:1.614E-42)
        L_0x01a0:
            long r4 = (long) r4
            long r18 = r18 * r4
            long r4 = (long) r11
            r20 = r4
            r16 = r9
            long r25 = com.google.android.exoplayer2.util.Util.A09(r16, r18, r20)
            int r11 = r7.A05()
            int r21 = r7.A05()
            int r10 = r7.A05()
            r20 = 2
            r4 = r20
            r7.A0H(r4)
            int r4 = r6.A02
            long r4 = (long) r4
            long r18 = r2 + r4
            long[] r4 = new long[r11]
            r17 = r4
            long[] r4 = new long[r11]
            r16 = r4
            r9 = 0
        L_0x01cd:
            if (r9 >= r11) goto L_0x0208
            long r4 = (long) r9
            long r4 = r4 * r25
            long r12 = (long) r11
            long r4 = r4 / r12
            r17[r9] = r4
            r4 = r18
            long r4 = java.lang.Math.max(r2, r4)
            r16[r9] = r4
            r4 = r24
            if (r10 == r4) goto L_0x0203
            r4 = r20
            if (r10 == r4) goto L_0x01fe
            r4 = 3
            if (r10 == r4) goto L_0x01f9
            r4 = 4
            if (r10 != r4) goto L_0x0230
            int r4 = r7.A04()
        L_0x01f0:
            long r4 = (long) r4
            r12 = r21
            long r12 = (long) r12
            long r4 = r4 * r12
            long r2 = r2 + r4
            int r9 = r9 + 1
            goto L_0x01cd
        L_0x01f9:
            int r4 = r7.A03()
            goto L_0x01f0
        L_0x01fe:
            int r4 = r7.A05()
            goto L_0x01f0
        L_0x0203:
            int r4 = r7.A02()
            goto L_0x01f0
        L_0x0208:
            r4 = -1
            int r1 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x0223
            int r1 = (r22 > r2 ? 1 : (r22 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x0223
            java.lang.String r18 = "VBRI data size mismatch: "
            java.lang.String r19 = ", "
            r20 = r22
            r22 = r2
            java.lang.String r4 = X.002.A0f(r18, r19, r20, r22)
            java.lang.String r1 = "VbriSeeker"
            X.2AG.A04(r1, r4)
        L_0x0223:
            X.SwQ r1 = new X.SwQ
            r22 = r1
            r23 = r17
            r24 = r16
            r27 = r2
            r22.<init>(r23, r24, r25, r27)
        L_0x0230:
            int r2 = r6.A02
            r14.Evk(r2)
            goto L_0x00bd
        L_0x0237:
            r1 = 0
            r8 = r14
            X.4Y6 r8 = (X.AnonymousClass4Y6) r8
            r8.A01 = r15
            goto L_0x00bd
        L_0x023f:
            r5 = 13
            r1 = r24
            if (r2 == r1) goto L_0x003a
            goto L_0x0038
        L_0x0247:
            r4 = 0
            goto L_0x0267
        L_0x0249:
            long r4 = r0.A03
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L_0x02d1
            r1 = r14
            X.4Y6 r1 = (X.AnonymousClass4Y6) r1
            long r2 = r1.A02
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 >= 0) goto L_0x02d1
            long r4 = r4 - r2
            int r1 = (int) r4
            r14.Evk(r1)
            goto L_0x02d1
        L_0x0260:
            X.SwS r4 = new X.SwS
            r2 = r18
            r4.<init>(r10, r9, r2)
        L_0x0267:
            r3 = 0
            int r7 = r0.A0C
            r2 = r7 & 4
            if (r2 == 0) goto L_0x0407
            if (r4 == 0) goto L_0x03f3
            long r2 = r4.A00
        L_0x0272:
            r20 = -1
        L_0x0274:
            long r4 = r8.A02
            X.SwP r1 = new X.SwP
            r15 = r1
            r16 = r2
            r18 = r4
            r15.<init>(r16, r18, r20)
        L_0x0280:
            r3 = 1
            if (r1 == 0) goto L_0x028d
            boolean r2 = r1.CbO()
            if (r2 != 0) goto L_0x0296
            r2 = r7 & 1
            if (r2 == 0) goto L_0x0296
        L_0x028d:
            r1 = r7 & 2
            if (r1 != 0) goto L_0x0292
            r3 = 0
        L_0x0292:
            X.SwM r1 = r0.A01(r14, r3)
        L_0x0296:
            r0.A09 = r1
            X.4Sd r2 = r0.A06
            r2.EKx(r1)
            X.4Xd r4 = r0.A07
            X.3w8 r3 = new X.3w8
            r3.<init>()
            java.lang.String r1 = r6.A06
            r3.A0U = r1
            r1 = 4096(0x1000, float:5.74E-42)
            r3.A09 = r1
            int r1 = r6.A01
            r3.A04 = r1
            int r1 = r6.A03
            r3.A0E = r1
            X.Q0Q r2 = r0.A0F
            int r1 = r2.A00
            r3.A06 = r1
            int r1 = r2.A01
            r3.A07 = r1
            r1 = r7 & 8
            if (r1 == 0) goto L_0x03ef
            r1 = 0
        L_0x02c3:
            r3.A0N = r1
            X.3wB r1 = new X.3wB
            r1.<init>(r3)
            r4.AWP(r1)
            long r1 = r8.A02
            r0.A03 = r1
        L_0x02d1:
            int r1 = r0.A00
            r12 = 1
            r13 = -1
            r7 = 0
            if (r1 != 0) goto L_0x0382
            r10 = r14
            X.4Y6 r10 = (X.AnonymousClass4Y6) r10
            r10.A01 = r7
            boolean r1 = r0.A02(r14)
            if (r1 != 0) goto L_0x03ed
            X.4XV r1 = r0.A0G
            int r8 = X.Pxh.A09(r1, r7)
            int r1 = r0.A01
            long r3 = (long) r1
            r1 = -128000(0xfffffffffffe0c00, float:NaN)
            r1 = r1 & r8
            long r1 = (long) r1
            r5 = -128000(0xfffffffffffe0c00, double:NaN)
            long r3 = r3 & r5
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x03e7
            int r1 = X.SN2.A00(r8)
            if (r1 == r13) goto L_0x03e7
            X.S38 r11 = r0.A0E
            r11.A00(r8)
            long r5 = r0.A02
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x032d
            X.TmG r3 = r0.A09
            long r1 = r10.A02
            long r5 = r3.C7P(r1)
            r0.A02 = r5
            long r3 = r0.A0D
            int r1 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r1 == 0) goto L_0x032d
            X.TmG r5 = r0.A09
            r1 = 0
            long r1 = r5.C7P(r1)
            long r5 = r0.A02
            long r3 = r3 - r1
            long r5 = r5 + r3
            r0.A02 = r5
        L_0x032d:
            int r9 = r11.A02
            r0.A00 = r9
            X.TmG r8 = r0.A09
            boolean r1 = r8 instanceof X.C12529SwP
            if (r1 == 0) goto L_0x0382
            X.SwP r8 = (X.C12529SwP) r8
            long r3 = r0.A04
            int r1 = r11.A04
            long r1 = (long) r1
            long r3 = r3 + r1
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r1
            int r1 = r11.A03
            long r1 = (long) r1
            long r3 = r3 / r1
            long r5 = r5 + r3
            long r3 = r10.A02
            long r1 = (long) r9
            long r3 = r3 + r1
            X.5zw r2 = r8.A02
            int r1 = r2.A00
            int r1 = r1 - r12
            long r1 = r2.A00(r1)
            long r15 = r5 - r1
            r9 = 100000(0x186a0, double:4.94066E-319)
            int r1 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r1 < 0) goto L_0x0368
            X.5zw r1 = r8.A02
            r1.A01(r5)
            X.5zw r1 = r8.A01
            r1.A01(r3)
        L_0x0368:
            boolean r1 = r0.A0B
            if (r1 == 0) goto L_0x0382
            long r1 = r0.A05
            X.5zw r4 = r8.A02
            int r3 = r4.A00
            int r3 = r3 - r12
            long r3 = r4.A00(r3)
            long r1 = r1 - r3
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 >= 0) goto L_0x0382
            r0.A0B = r7
            X.4Xd r1 = r0.A08
            r0.A07 = r1
        L_0x0382:
            X.4Xd r2 = r0.A07
            int r1 = r0.A00
            int r2 = r2.EJl(r14, r1, r7, r12)
            if (r2 == r13) goto L_0x03ed
            int r1 = r0.A00
            int r1 = r1 - r2
            r0.A00 = r1
            if (r1 > 0) goto L_0x03bc
            X.4Xd r14 = r0.A07
            long r5 = r0.A04
            long r3 = r0.A02
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r5 = r5 * r1
            X.S38 r8 = r0.A0E
            int r1 = r8.A03
            long r1 = (long) r1
            long r5 = r5 / r1
            long r3 = r3 + r5
            int r1 = r8.A02
            r15 = 0
            r18 = r7
            r19 = r3
            r16 = r12
            r17 = r1
            r14.EJn(r15, r16, r17, r18, r19)
            long r3 = r0.A04
            int r1 = r8.A04
            long r1 = (long) r1
            long r3 = r3 + r1
            r0.A04 = r3
            r0.A00 = r7
        L_0x03bc:
            r8 = 0
        L_0x03bd:
            if (r8 != r13) goto L_0x03e6
        L_0x03bf:
            X.TmG r9 = r0.A09
            boolean r1 = r9 instanceof X.C12529SwP
            if (r1 == 0) goto L_0x03e6
            long r6 = r0.A04
            long r4 = r0.A02
            r1 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r1
            X.S38 r1 = r0.A0E
            int r1 = r1.A03
            long r1 = (long) r1
            long r6 = r6 / r1
            long r4 = r4 + r6
            long r2 = r9.AzU()
            int r1 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r1 == 0) goto L_0x03e6
            r1 = r9
            X.SwP r1 = (X.C12529SwP) r1
            r1.A00 = r4
            X.4Sd r0 = r0.A06
            r0.EKx(r9)
        L_0x03e6:
            return r8
        L_0x03e7:
            r14.Evk(r12)
            r0.A01 = r7
            goto L_0x03bc
        L_0x03ed:
            r8 = -1
            goto L_0x03bd
        L_0x03ef:
            com.google.android.exoplayer2.metadata.Metadata r1 = r0.A0A
            goto L_0x02c3
        L_0x03f3:
            if (r1 == 0) goto L_0x03ff
            long r2 = r1.AzU()
            long r20 = r1.AvI()
            goto L_0x0274
        L_0x03ff:
            com.google.android.exoplayer2.metadata.Metadata r1 = r0.A0A
            long r2 = A00(r1)
            goto L_0x0272
        L_0x0407:
            if (r4 == 0) goto L_0x040c
            r1 = r4
            goto L_0x0280
        L_0x040c:
            if (r1 != 0) goto L_0x0280
            r1 = r3
            goto L_0x0280
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.extractor.mp3.Mp3Extractor.E68(X.4Y7, X.4Sh):int");
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.S38] */
    public Mp3Extractor(int i, long j) {
        this.A0C = (i & 2) != 0 ? i | 1 : i;
        this.A0D = j;
        this.A0G = new AnonymousClass4XV(10);
        this.A0E = new Object();
        this.A0F = new Q0Q();
        this.A02 = -9223372036854775807L;
        this.A0H = new C10262RpM();
        AnonymousClass4YK r0 = new AnonymousClass4YK();
        this.A0I = r0;
        this.A07 = r0;
    }

    public Mp3Extractor(int i) {
        this(i, -9223372036854775807L);
    }

    public Mp3Extractor() {
        this(0);
    }
}
