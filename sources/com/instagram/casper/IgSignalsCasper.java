package com.instagram.casper;

import X.00k;
import X.0Tu;
import X.0qQ;
import X.0qg;
import X.0sP;
import X.14i;
import X.182;
import X.19E;
import X.1Au;
import X.1QK;
import X.2J7;
import X.2SP;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass0lh;
import X.AnonymousClass0vF;
import X.AnonymousClass12U;
import X.AnonymousClass19S;
import X.AnonymousClass2MF;
import X.AnonymousClass4D7;
import X.AnonymousClass562;
import X.AnonymousClass565;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C262224Cq;
import X.C279824zU;
import X.C279834zV;
import X.C51966G9m;
import X.C51967G9n;
import X.C61110lV;
import X.C61480nO;
import X.C61610nw;
import X.C61931KSe;
import X.C62320sa;
import X.C63101KrU;
import X.C63286KuV;
import X.C63287KuW;
import X.C63773L6f;
import X.C64031Cc;
import X.C65375LsG;
import X.C65378LsJ;
import X.C65380LsL;
import X.C66186MGx;
import X.C66188MGz;
import X.C66209MIq;
import X.C66235MJw;
import X.C71087ObS;
import X.C71342cb;
import X.DbS;
import X.DbX;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.JTR;
import X.JTS;
import X.JVD;
import X.KSS;
import X.KST;
import X.KSZ;
import X.L9W;
import X.LDC;
import X.LT2;
import X.MG7;
import X.S5L;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public final class IgSignalsCasper implements C61110lV, AnonymousClass0lh {
    public static boolean A09;
    public KST A00 = null;
    public IgSignalsDcpPredictor A01;
    public final Context A02;
    public final L9W A03;
    public final C61931KSe A04;
    public final UserSession A05;
    public final C61480nO A06;
    public final C62320sa A07;
    public final C262224Cq A08;

    /* JADX WARNING: type inference failed for: r5v9, types: [X.LsL, X.KST] */
    private final KST A00() {
        long j;
        Integer num;
        int i;
        KSS kss;
        Number number;
        AnonymousClass565 r1 = this.A04.A00;
        if (r1 == null) {
            0qQ.A0F("productCore");
            throw AnonymousClass00P.createAndThrow();
        }
        LT2 lt2 = (LT2) r1.A06.invoke("on_start");
        lt2.A00 = r1;
        KSZ ksz = (KSZ) lt2;
        L9W l9w = this.A03;
        C62320sa r56 = this.A07;
        long A0O = JTR.A0O(r56);
        int i2 = 0;
        0qQ.A0B(ksz, 0);
        KSS.A02(ksz.A0a, AnonymousClass7TE.A0R(l9w.A04.getValue()));
        KSS kss2 = ksz.A0R;
        Context context = l9w.A01;
        if (context != null) {
            0qg.A01();
            j = 0qg.A00(context, false) / 1048576;
        } else {
            j = -1;
        }
        KSS.A02(kss2, j);
        KSS.A00(ksz.A0e, DbX.A07(l9w.A05));
        KSS.A00(ksz.A0Z, DbX.A07(l9w.A03));
        KSS kss3 = ksz.A0X;
        UserSession userSession = l9w.A02;
        String str = C71342cb.A00(userSession).A05;
        if (str == null) {
            num = AnonymousClass05K.A00;
        } else if (JTQ.A1Y(1QK.A0C, str)) {
            num = AnonymousClass05K.A01;
        } else if (JTQ.A1Y(1QK.A09, str)) {
            num = AnonymousClass05K.A0C;
        } else if (JTQ.A1Y(1QK.A0A, str) || JTQ.A1Y(1QK.A0G, str)) {
            num = AnonymousClass05K.A0N;
        } else if (JTQ.A1Y(1QK.A0B, str)) {
            num = AnonymousClass05K.A0Y;
        } else {
            num = AnonymousClass05K.A0j;
        }
        switch (num.intValue()) {
            case 0:
                i = -1;
                break;
            case 1:
                i = 0;
                break;
            case 2:
                i = 1;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                i = 3;
                break;
            default:
                i = 4;
                break;
        }
        KSS.A00(kss3, i);
        TimeZone timeZone = TimeZone.getDefault();
        Calendar instance = Calendar.getInstance(timeZone);
        timeZone.getOffset(instance.getTimeInMillis());
        instance.setTime(new Date(A0O));
        double d = (double) instance.get(7);
        double d2 = (double) instance.get(11);
        ksz.A0d.A00 = d;
        ksz.A0b.A00 = d2;
        ksz.A0c.A00 = (d * 24.0d * 60.0d) + (d2 * 60.0d) + ((double) instance.get(12));
        List A0a = 00k.A0a(new S5L(1Au.A00(userSession)).A02());
        long A0P = AnonymousClass7TE.A0P(A0O);
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (Object next : A0a) {
            if (AnonymousClass7TE.A0R(next) > A0P) {
                A1C.add(next);
            }
        }
        List<Object> A0d = 00k.A0d(A1C, 5);
        ArrayList A0r = AnonymousClass7TG.A0r(A0d);
        for (Object A0R : A0d) {
            AnonymousClass7TE.A1Y(A0r, (AnonymousClass7TE.A0R(A0R) - A0P) / 60);
        }
        long j2 = -1;
        KSS.A02(ksz.A0S, JTS.A06((Number) 00k.A0O(A0r, 0)));
        KSS.A02(ksz.A0T, JTS.A06((Number) 00k.A0O(A0r, 1)));
        KSS.A02(ksz.A0U, JTS.A06((Number) 00k.A0O(A0r, 2)));
        KSS.A02(ksz.A0V, JTS.A06((Number) 00k.A0O(A0r, 3)));
        KSS kss4 = ksz.A0W;
        Number number2 = (Number) 00k.A0O(A0r, 4);
        if (number2 != null) {
            j2 = number2.longValue();
        }
        KSS.A02(kss4, j2);
        KSS.A00(ksz.A02, AnonymousClass2MF.A00().A00(context));
        KSS.A00(ksz.A0Y, l9w.A00);
        C279824zU r9 = C64031Cc.A03;
        if (r9 != null) {
            C71087ObS obS = new C71087ObS();
            AnonymousClass7TE.A1Z(new C66186MGx((Object) obS, (Object) r9, (AnonymousClass4D7) null, 38), r9.A04);
            try {
                obS.A01.await();
            } catch (InterruptedException unused) {
            }
            Object obj = obS.A00;
            0qQ.A07(obj);
            Calendar instance2 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
            instance2.setTimeInMillis(A0O);
            instance2.set(11, 0);
            instance2.set(12, 0);
            instance2.set(13, 0);
            instance2.set(14, 0);
            long timeInMillis = instance2.getTimeInMillis();
            long j3 = timeInMillis - 86400000;
            long j4 = j3 - 86400000;
            long j5 = j4 - 86400000;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            long j10 = 0;
            long j11 = 0;
            long j12 = 0;
            long j13 = 0;
            long j14 = 0;
            long j15 = 0;
            long j16 = 0;
            long j17 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            for (C279834zV r7 : (List) obj) {
                long j18 = r7.A01;
                if (j18 <= A0O) {
                    if (timeInMillis <= j18) {
                        i3++;
                        j6 += r7.A00;
                    } else if (j3 <= j18 && j18 < timeInMillis) {
                        i4++;
                        j8 += r7.A00;
                    } else if (j4 <= j18 && j18 < j3) {
                        i5++;
                        j7 += r7.A00;
                    } else if (j5 <= j18 && j18 < j4) {
                        i12++;
                        j15 += r7.A00;
                    }
                    if (j18 >= A0O - 3600000) {
                        i6++;
                        i7++;
                        i8++;
                        i9++;
                        i10++;
                        i11++;
                        i2++;
                        long j19 = r7.A00;
                        j9 += j19;
                        j10 += j19;
                        j11 += j19;
                    } else if (j18 >= A0O - 7200000) {
                        i6++;
                        i7++;
                        i8++;
                        i9++;
                        i10++;
                        i11++;
                        i2++;
                        j10 += r7.A00;
                    } else {
                        if (j18 >= A0O - 28800000) {
                            i7++;
                        } else if (j18 < A0O - 43200000) {
                            if (j18 >= A0O - 86400000) {
                                i9++;
                                i10++;
                                i11++;
                                i2++;
                                j13 += r7.A00;
                                j14 += r7.A00;
                                j16 += r7.A00;
                                j17 += r7.A00;
                            } else if (j18 >= A0O - 172800000) {
                                i10++;
                                i11++;
                                i2++;
                                j14 += r7.A00;
                                j16 += r7.A00;
                                j17 += r7.A00;
                            } else if (j18 >= A0O - 432000000) {
                                i11++;
                                i2++;
                                j16 += r7.A00;
                                j17 += r7.A00;
                            } else if (j18 >= A0O - 604800000) {
                                i2++;
                                j17 += r7.A00;
                            }
                        }
                        i8++;
                        i9++;
                        i10++;
                        i11++;
                        i2++;
                    }
                    j12 += r7.A00;
                    j13 += r7.A00;
                    j14 += r7.A00;
                    j16 += r7.A00;
                    j17 += r7.A00;
                }
            }
            KSS.A00(ksz.A04, i6);
            KSS.A00(ksz.A07, i7);
            KSS.A00(ksz.A0A, i8);
            KSS.A00(ksz.A05, i9);
            KSS.A00(ksz.A06, i10);
            KSS.A00(ksz.A09, i11);
            KSS.A00(ksz.A03, i2);
            KSS.A02(ksz.A0K, j9);
            KSS.A02(ksz.A0G, j10);
            KSS.A02(ksz.A0J, j11);
            KSS.A02(ksz.A0M, j12);
            KSS.A02(ksz.A0H, j13);
            KSS.A02(ksz.A0I, j14);
            KSS.A02(ksz.A0L, j16);
            KSS.A02(ksz.A0F, j17);
            KSS.A00(ksz.A0B, i3);
            KSS.A00(ksz.A0C, i4);
            KSS.A00(ksz.A0D, i5);
            KSS.A00(ksz.A0E, i12);
            KSS.A02(ksz.A0N, j6);
            KSS.A02(ksz.A0O, j8);
            KSS.A02(ksz.A0P, j7);
            kss = ksz.A0Q;
            number = Long.valueOf(j15);
        } else {
            kss = ksz.A03;
            number = C51967G9n.A0j();
        }
        kss.A00 = number.doubleValue();
        long A0O2 = JTR.A0O(r56);
        KST kst = ksz.A01;
        KST kst2 = kst;
        if (kst == null) {
            String str2 = ksz.A02;
            double d3 = ksz.A01;
            ArrayList A032 = LT2.A03(ksz);
            0qQ.A0B(A032, 3);
            ? lsL = new C65380LsL(str2, A032, d3, A0O2);
            ksz.A05(lsL);
            ksz.A00 = lsL;
            ksz.A01 = lsL;
            kst2 = lsL;
        }
        this.A00 = kst2;
        return kst2;
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.instagram.casper.IgSignalsCasper r8, X.AnonymousClass4D7 r9) {
        /*
            r3 = 17
            boolean r0 = X.C66128MDg.A01(r3, r9)
            if (r0 == 0) goto L_0x0070
            r7 = r9
            X.MDg r7 = (X.C66128MDg) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0070
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r7.A02
            X.1Hj r6 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r5) goto L_0x007e
            java.lang.Object r4 = r7.A01
            X.LsL r4 = (X.C65380LsL) r4
            X.0eS.A00(r1)
        L_0x0028:
            X.565 r5 = r4.A00
            if (r5 == 0) goto L_0x0076
            X.4Cq r3 = r5.A08
            r2 = 0
            r1 = 39
            X.Pfo r0 = new X.Pfo
            r0.<init>(r4, r5, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x003c:
            X.0eS.A00(r1)
            X.KST r4 = r8.A00()
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r2 = r8.A01
            if (r2 == 0) goto L_0x0054
            boolean r0 = r2 instanceof X.KSc
            if (r0 != 0) goto L_0x0054
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r2 = (com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor) r2
            X.4Cq r1 = r2.A07
            r0 = 45
            X.C66181MGs.A02(r2, r1, r0)
        L_0x0054:
            com.instagram.common.session.UserSession r3 = r8.A05
            X.0Tu r2 = X.0Tu.A06
            r0 = 36329809802117457(0x8111c500034151, double:3.038456235036673E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0028
            X.MNk r0 = X.C66327MNk.A00
            r7.A01 = r4
            r7.A00 = r5
            java.lang.Object r0 = r8.A02(r7, r0)
            if (r0 != r6) goto L_0x0028
            return r6
        L_0x0070:
            X.MDg r7 = new X.MDg
            r7.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x0076:
            X.JTO.A1K()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x007e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.casper.IgSignalsCasper.A01(com.instagram.casper.IgSignalsCasper, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass4D7 r10, X.0sP r11) {
        /*
            r9 = this;
            r3 = 22
            boolean r0 = X.MED.A04(r3, r10)
            if (r0 == 0) goto L_0x009b
            r6 = r10
            X.MED r6 = (X.MED) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r2 = r6.A00
            r1 = 1
            if (r2 == 0) goto L_0x0071
            if (r2 != r1) goto L_0x00a2
            java.lang.Object r4 = r6.A03
            X.Kov r4 = (X.C62943Kov) r4
            java.lang.Object r11 = r6.A02
            X.0sP r11 = (X.0sP) r11
            java.lang.Object r8 = r6.A01
            com.instagram.casper.IgSignalsCasper r8 = (com.instagram.casper.IgSignalsCasper) r8
            X.0eS.A00(r0)
        L_0x0030:
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 != 0) goto L_0x0042
            r0 = -1
            java.lang.Long r0 = X.JTO.A0y(r0)
            r11.invoke(r0)
        L_0x003f:
            X.0gF r5 = X.C60340gF.A00
        L_0x0041:
            return r5
        L_0x0042:
            X.KST r7 = r8.A00
            if (r7 == 0) goto L_0x006c
            long r2 = r7.A03
            X.0sa r0 = r8.A07
            long r5 = X.JTR.A0O(r0)
            r0 = 15000(0x3a98, double:7.411E-320)
            long r5 = r5 - r0
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x006c
        L_0x0055:
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.LDU r2 = new X.LDU
            r2.<init>(r7, r7, r4)
            r1 = 4
            X.J6O r0 = new X.J6O
            r0.<init>(r11, r1)
            r2.A00 = r0
            X.566 r0 = r2.A02
            r0.EJc(r2)
            goto L_0x003f
        L_0x006c:
            X.KST r7 = r8.A00()
            goto L_0x0055
        L_0x0071:
            X.0eS.A00(r0)
            com.instagram.igsignals.predictors.dcp.IgSignalsDcpPredictor r4 = r9.A01
            if (r4 == 0) goto L_0x0091
            X.MED.A00(r9, r11, r4, r6, r1)
            X.4Cq r3 = r4.A07
            r2 = 0
            r1 = 44
            X.MGs r0 = new X.MGs
            r0.<init>(r4, r2, r1)
            X.2Q8 r0 = X.JTO.A1E(r0, r3)
            java.lang.Object r0 = r0.A0E(r6)
            if (r0 == r5) goto L_0x0041
            r8 = r9
            goto L_0x0030
        L_0x0091:
            r0 = -1
            java.lang.Long r0 = X.JTO.A0y(r0)
            r11.invoke(r0)
            goto L_0x003f
        L_0x009b:
            X.MED r6 = new X.MED
            r6.<init>(r9, r10, r3)
            goto L_0x0016
        L_0x00a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.casper.IgSignalsCasper.A02(X.4D7, X.0sP):java.lang.Object");
    }

    public final void A03(0sP r5) {
        if (this.A01 != null) {
            AnonymousClass7TE.A1Z(new C66188MGz((Object) r5, (Object) this, (AnonymousClass4D7) null, 8), this.A08);
            return;
        }
        r5.invoke(-1L);
    }

    public /* synthetic */ IgSignalsCasper(Context context, UserSession userSession) {
        Integer num;
        long j;
        Long A10;
        AnonymousClass0vF A0W = JTP.A0W(C61610nw.A00(), "IgSignalsCasper");
        AnonymousClass19S A022 = 19E.A02(new AnonymousClass12U(A0W).AOJ(109120473, 3));
        C66235MJw mJw = C66235MJw.A00;
        C63101KrU krU = C61931KSe.A04;
        0qQ.A0B(userSession, 0);
        C61931KSe kSe = new C61931KSe(userSession);
        kSe.A00 = AnonymousClass562.A00(userSession).A00(kSe, JTO.A1C(krU, 21), new C66209MIq(krU, 0));
        AnonymousClass7TG.A1R(A022, mJw);
        this.A05 = userSession;
        this.A02 = context;
        this.A06 = A0W;
        this.A08 = A022;
        this.A07 = mJw;
        this.A04 = kSe;
        this.A03 = new L9W(userSession, context);
        14i.A05(this);
        C65378LsJ lsJ = new C65378LsJ(userSession);
        AnonymousClass565 r0 = kSe.A00;
        if (r0 != null) {
            r0.A00 = lsJ;
            0Tu r2 = 0Tu.A06;
            int A042 = DbS.A04(r2, userSession, 36611284778686681L);
            if (A042 > 0 && 2SP.A01.A06(0, A042) == 0) {
                C65375LsG lsG = new C65375LsG(userSession);
                AnonymousClass565 r02 = kSe.A00;
                if (r02 != null) {
                    r02.A03.add(lsG);
                }
            }
            String A043 = 182.A04(r2, userSession, 36892759755457471L);
            long A012 = 182.A01(r2, userSession, 36611284778883290L);
            if (A012 == 1) {
                num = AnonymousClass05K.A00;
            } else if (A012 == 2) {
                num = AnonymousClass05K.A01;
            } else if (A012 == 3) {
                num = AnonymousClass05K.A0C;
            } else {
                num = null;
            }
            if (A043.length() > 0 && num != null) {
                List A0x = DbX.A0x(A043);
                if (A0x.size() == 3) {
                    String A1G = C51966G9m.A1G(A0x, 0);
                    A1G = A1G == null ? "undefined" : A1G;
                    String A1G2 = C51966G9m.A1G(A0x, 1);
                    A1G2 = A1G2 == null ? "undefined" : A1G2;
                    String A1G3 = C51966G9m.A1G(A0x, 2);
                    if (A1G3 == null || (A10 = AnonymousClass7TE.A10(A1G3)) == null) {
                        j = 0;
                    } else {
                        j = A10.longValue();
                    }
                    C63286KuV.A00(num);
                    IgSignalsDcpPredictor igSignalsDcpPredictor = new IgSignalsDcpPredictor(userSession, new C63773L6f(j, A1G, A1G2), num);
                    this.A01 = igSignalsDcpPredictor;
                    LDC A002 = C63287KuW.A00(182.A04(0Tu.A05, userSession, 36892759755654080L));
                    if (A002 != null) {
                        List list = igSignalsDcpPredictor.A04;
                        if (list.size() < 1) {
                            list.add(A002);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        0qQ.A0F("productCore");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onAppBackgrounded() {
        int A032 = AnonymousClass0fD.A03(-102566291);
        L9W l9w = this.A03;
        l9w.A00 = 2J7.A00(l9w.A02).A00.A02;
        MG7.A01(this, this.A08, 14);
        AnonymousClass0fD.A0A(302919485, A032);
    }

    public final void onAppForegrounded() {
        int A032 = AnonymousClass0fD.A03(910529308);
        AnonymousClass7TE.A1Z(new JVD(this, (AnonymousClass4D7) null, 46), this.A08);
        AnonymousClass0fD.A0A(1281018058, A032);
    }

    public final void onSessionWillEnd() {
        14i.A06(this);
    }
}
