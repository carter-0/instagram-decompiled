package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.List;

public abstract class PC9 implements C74407PuN {
    public final UserSession A00;
    public final AnonymousClass9HO A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final Context A04;

    public boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        int i2;
        List list;
        List list2;
        0qQ.A0B(pwl, 0);
        2FW A002 = OZ6.A00(pwa, pwl, i);
        if (pwl.BmP(i) != null) {
            Integer BmN = pwl.BmN(i);
            boolean z = this instanceof C68918Nav;
            if (z) {
                i2 = 0;
            } else if ((this instanceof C68917Nau) || (!(this instanceof C68920Nax) && !(this instanceof C68919Naw))) {
                i2 = 2;
            } else {
                i2 = 8;
            }
            if (BmN != null && BmN.intValue() == i2) {
                if (z) {
                    list = ((C68918Nav) this).A03;
                } else if (this instanceof C68917Nau) {
                    list = ((C68917Nau) this).A02;
                } else if (this instanceof C68920Nax) {
                    list = ((C68920Nax) this).A04;
                } else if (this instanceof C68919Naw) {
                    list = ((C68919Naw) this).A04;
                } else if (this instanceof C68915Nas) {
                    list = ((C68915Nas) this).A01;
                } else if (this instanceof C68916Nat) {
                    list = ((C68916Nat) this).A02;
                } else {
                    list = ((C68914Nar) this).A01;
                }
                if (list.isEmpty() || 00k.A0u(list, pwl.BmC(i))) {
                    if (z) {
                        C68918Nav nav = (C68918Nav) this;
                        list2 = A00(nav.A01, 2FW.A1g, nav.A02);
                    } else if (this instanceof C68917Nau) {
                        C68917Nau nau = (C68917Nau) this;
                        list2 = A00(nau.A00, 2FW.A1k, nau.A01);
                    } else if (this instanceof C68920Nax) {
                        C68920Nax nax = (C68920Nax) this;
                        list2 = A00(nax.A01, 2FW.A1j, nax.A03);
                    } else if (this instanceof C68919Naw) {
                        C68919Naw naw = (C68919Naw) this;
                        list2 = A00(naw.A01, 2FW.A1j, naw.A03);
                    } else if (this instanceof C68916Nat) {
                        C68916Nat nat = (C68916Nat) this;
                        list2 = A00(nat.A00, 2FW.A1A, nat.A01);
                    } else if (this instanceof C68915Nas) {
                        list2 = ((C68915Nas) this).A00;
                    } else {
                        list2 = ((C68914Nar) this).A00;
                    }
                    if (!list2.contains(A002)) {
                        return false;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: X.PC1} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: X.PC0} */
    /* JADX WARNING: type inference failed for: r15v1, types: [X.PtA] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x010a, code lost:
        if (r3 == null) goto L_0x010c;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.OTT AWh(android.content.Context r49, X.C61084JwM r50, X.C74541Pwa r51, com.instagram.direct.model.messaginguser.MessagingUser r52, X.OMF r53, X.C74552Pwl r54, java.util.Map r55, java.util.Set r56, int r57, boolean r58) {
        /*
            r48 = this;
            r3 = 0
            r47 = r49
            r13 = r53
            r0 = r47
            boolean r30 = X.AnonymousClass7TF.A1U(r3, r0, r13)
            r0 = 2
            r10 = r52
            r1 = r54
            r11 = r55
            r5 = r56
            X.C51974G9v.A0d(r0, r1, r10, r5, r11)
            r0 = r57
            boolean r4 = X.C74552Pwl.A02(r10, r1, r0)
            r2 = r48
            X.7L2 r15 = r2.A03
            X.AnonymousClass7FB.A04(r15, r4)
            com.instagram.common.session.UserSession r14 = r2.A00
            boolean r28 = X.C71095OcV.A04(r14, r13, r11)
            X.9HC r4 = r2.A02
            r45 = r4
            r8 = 0
            X.Pjt r4 = X.C73794Pjt.A00
            X.0t0 r21 = X.AnonymousClass0eN.A01(r4)
            r46 = r51
            r16 = r46
            r17 = r45
            r18 = r15
            r19 = r10
            r20 = r1
            r22 = r0
            X.7FE r36 = X.C71136Ode.A02(r16, r17, r18, r19, r20, r21, r22)
            X.OUe r31 = X.C70980OUe.A00
            X.9HO r4 = r2.A01
            r32 = r47
            r33 = r46
            r34 = r14
            r35 = r4
            r37 = r45
            r38 = r15
            r39 = r10
            r40 = r13
            r41 = r1
            r42 = r11
            r43 = r0
            r44 = r28
            X.7FW r4 = r31.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            if (r4 == 0) goto L_0x03b0
            r6 = r47
            java.lang.String r24 = X.C71136Ode.A05(r6, r10, r13, r1, r0)
            r16 = r6
            r17 = r46
            r18 = r14
            r19 = r45
            r20 = r15
            r21 = r10
            r22 = r13
            r23 = r1
            r25 = r5
            r26 = r0
            X.77t r5 = X.C71136Ode.A03(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.Long r6 = r1.BmV(r0)
            if (r6 == 0) goto L_0x03ab
            long r6 = r6.longValue()
            boolean r37 = r10.A01(r6)
            r6 = r46
            X.2FW r34 = X.OZ6.A00(r6, r1, r0)
            r7 = r2
            boolean r6 = r2 instanceof X.C68920Nax
            if (r6 == 0) goto L_0x039a
            X.Nax r7 = (X.C68920Nax) r7
            X.9HC r9 = r7.A00
            X.7L2 r7 = r7.A02
        L_0x00a6:
            X.Pjs r12 = X.C73793Pjs.A00
            X.0t0 r35 = X.AnonymousClass0eN.A01(r12)
            r36 = 1
            X.7FE r19 = new X.7FE
            r31 = r19
            r32 = r9
            r33 = r7
            r38 = r3
            r39 = r3
            r40 = r3
            r41 = r3
            r31.<init>(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r7 = r2
            boolean r9 = r2 instanceof X.C68918Nav
            if (r9 == 0) goto L_0x035c
            X.Nav r7 = (X.C68918Nav) r7
            X.9HO r12 = r7.A00
            X.PC0 r7 = new X.PC0
            r7.<init>(r12)
        L_0x00cf:
            java.lang.String r12 = r1.BsK(r0)
            java.lang.String r25 = X.C71095OcV.A01(r14, r12, r11)
            boolean r29 = X.OPx.A01(r13)
            com.instagram.direct.msys.subtype.MsysThreadSubtype r24 = r13.A00()
            r26 = r8
            r27 = r0
            r31 = r3
            r20 = r45
            r21 = r15
            r22 = r10
            r15 = r7
            X.7FW r7 = r15.ALM(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            if (r9 == 0) goto L_0x016d
            X.79c r7 = (X.AnonymousClass79c) r7
            X.DbZ.A0t(r3, r4, r5, r1)
            if (r7 == 0) goto L_0x010c
            boolean r2 = r4 instanceof X.AnonymousClass79c
            if (r2 == 0) goto L_0x010d
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.79c r4 = (X.AnonymousClass79c) r4
            X.74E r3 = new X.74E
            r3.<init>(r5, r4, r7, r2)
        L_0x0108:
            X.2tL r3 = (X.C232262tL) r3
        L_0x010a:
            if (r3 != 0) goto L_0x02ba
        L_0x010c:
            return r8
        L_0x010d:
            boolean r2 = r4 instanceof X.C328707Fv
            if (r2 == 0) goto L_0x011d
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fv r4 = (X.C328707Fv) r4
            X.N72 r3 = new X.N72
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0108
        L_0x011d:
            boolean r2 = r4 instanceof X.C328677Fs
            if (r2 == 0) goto L_0x012d
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fs r4 = (X.C328677Fs) r4
            X.N7E r3 = new X.N7E
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0108
        L_0x012d:
            boolean r2 = r4 instanceof X.C328657Fq
            if (r2 == 0) goto L_0x013d
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fq r4 = (X.C328657Fq) r4
            X.N7k r3 = new X.N7k
            r3.<init>(r5, r7, r4, r2)
            goto L_0x0108
        L_0x013d:
            boolean r2 = r4 instanceof X.C66809Mcv
            if (r2 == 0) goto L_0x014d
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.Mcv r4 = (X.C66809Mcv) r4
            X.N79 r3 = new X.N79
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0108
        L_0x014d:
            boolean r2 = r4 instanceof X.C66851Mdk
            if (r2 == 0) goto L_0x015d
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.Mdk r4 = (X.C66851Mdk) r4
            X.N7W r3 = new X.N7W
            r3.<init>(r5, r7, r4, r2)
            goto L_0x0108
        L_0x015d:
            boolean r2 = r4 instanceof X.C68819NYd
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.NYd r4 = (X.C68819NYd) r4
            X.N7d r3 = new X.N7d
            r3.<init>(r5, r7, r4, r2)
            goto L_0x0108
        L_0x016d:
            boolean r9 = r2 instanceof X.C68917Nau
            if (r9 == 0) goto L_0x01ea
            X.7Fq r7 = (X.C328657Fq) r7
            X.DbZ.A0t(r3, r4, r5, r1)
            if (r7 == 0) goto L_0x010c
            boolean r2 = r4 instanceof X.AnonymousClass79c
            if (r2 == 0) goto L_0x018a
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.79c r4 = (X.AnonymousClass79c) r4
            X.N7S r3 = new X.N7S
            r3.<init>(r5, r4, r7, r2)
        L_0x0187:
            X.2tL r3 = (X.C232262tL) r3
            goto L_0x010a
        L_0x018a:
            boolean r2 = r4 instanceof X.C328707Fv
            if (r2 == 0) goto L_0x019a
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fv r4 = (X.C328707Fv) r4
            X.N75 r3 = new X.N75
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0187
        L_0x019a:
            boolean r2 = r4 instanceof X.C328677Fs
            if (r2 == 0) goto L_0x01aa
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fs r4 = (X.C328677Fs) r4
            X.N7H r3 = new X.N7H
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0187
        L_0x01aa:
            boolean r2 = r4 instanceof X.C328657Fq
            if (r2 == 0) goto L_0x01ba
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fq r4 = (X.C328657Fq) r4
            X.N7n r3 = new X.N7n
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0187
        L_0x01ba:
            boolean r2 = r4 instanceof X.C66809Mcv
            if (r2 == 0) goto L_0x01ca
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.Mcv r4 = (X.C66809Mcv) r4
            X.N7C r3 = new X.N7C
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0187
        L_0x01ca:
            boolean r2 = r4 instanceof X.C66851Mdk
            if (r2 == 0) goto L_0x01da
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.Mdk r4 = (X.C66851Mdk) r4
            X.N7Z r3 = new X.N7Z
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0187
        L_0x01da:
            boolean r2 = r4 instanceof X.C68819NYd
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.NYd r4 = (X.C68819NYd) r4
            X.N7g r3 = new X.N7g
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0187
        L_0x01ea:
            if (r6 == 0) goto L_0x0244
            X.NYd r7 = (X.C68819NYd) r7
            X.DbZ.A0t(r3, r4, r5, r1)
            boolean r2 = r4 instanceof X.AnonymousClass79c
            if (r2 == 0) goto L_0x0204
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.79c r4 = (X.AnonymousClass79c) r4
            X.N7R r3 = new X.N7R
            r3.<init>(r5, r4, r7, r2)
        L_0x0200:
            X.2tL r3 = (X.C232262tL) r3
            goto L_0x010a
        L_0x0204:
            boolean r2 = r4 instanceof X.C328707Fv
            if (r2 == 0) goto L_0x0214
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fv r4 = (X.C328707Fv) r4
            X.N73 r3 = new X.N73
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0200
        L_0x0214:
            boolean r2 = r4 instanceof X.C328677Fs
            if (r2 == 0) goto L_0x0224
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fs r4 = (X.C328677Fs) r4
            X.N7F r3 = new X.N7F
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0200
        L_0x0224:
            boolean r2 = r4 instanceof X.C328657Fq
            if (r2 == 0) goto L_0x0234
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fq r4 = (X.C328657Fq) r4
            X.N7l r3 = new X.N7l
            r3.<init>(r5, r7, r4, r2)
            goto L_0x0200
        L_0x0234:
            boolean r2 = r4 instanceof X.C66809Mcv
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.Mcv r4 = (X.C66809Mcv) r4
            X.N7A r3 = new X.N7A
            r3.<init>(r5, r4, r7, r2)
            goto L_0x0200
        L_0x0244:
            boolean r6 = r2 instanceof X.C68919Naw
            if (r6 == 0) goto L_0x02a0
            X.Mdk r7 = (X.C66851Mdk) r7
            X.DbZ.A0t(r3, r4, r5, r1)
            boolean r2 = r4 instanceof X.AnonymousClass79c
            if (r2 == 0) goto L_0x0260
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.79c r4 = (X.AnonymousClass79c) r4
            X.N7Q r3 = new X.N7Q
            r3.<init>(r5, r4, r7, r2)
        L_0x025c:
            X.2tL r3 = (X.C232262tL) r3
            goto L_0x010a
        L_0x0260:
            boolean r2 = r4 instanceof X.C328707Fv
            if (r2 == 0) goto L_0x0270
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fv r4 = (X.C328707Fv) r4
            X.N74 r3 = new X.N74
            r3.<init>(r5, r4, r7, r2)
            goto L_0x025c
        L_0x0270:
            boolean r2 = r4 instanceof X.C328677Fs
            if (r2 == 0) goto L_0x0280
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fs r4 = (X.C328677Fs) r4
            X.N7G r3 = new X.N7G
            r3.<init>(r5, r4, r7, r2)
            goto L_0x025c
        L_0x0280:
            boolean r2 = r4 instanceof X.C328657Fq
            if (r2 == 0) goto L_0x0290
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fq r4 = (X.C328657Fq) r4
            X.N7m r3 = new X.N7m
            r3.<init>(r5, r7, r4, r2)
            goto L_0x025c
        L_0x0290:
            boolean r2 = r4 instanceof X.C66809Mcv
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.Mcv r4 = (X.C66809Mcv) r4
            X.N7B r3 = new X.N7B
            r3.<init>(r5, r4, r7, r2)
            goto L_0x025c
        L_0x02a0:
            boolean r6 = r2 instanceof X.C68915Nas
            if (r6 == 0) goto L_0x02c6
            X.7Fs r7 = (X.C328677Fs) r7
            X.DbZ.A0t(r3, r4, r5, r1)
            if (r7 == 0) goto L_0x010c
            boolean r2 = r4 instanceof X.AnonymousClass79c
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.79c r4 = (X.AnonymousClass79c) r4
            X.N7I r3 = new X.N7I
            r3.<init>(r5, r7, r4, r2)
        L_0x02ba:
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.String r1 = X.C71095OcV.A02(r1, r0)
            X.OTT r0 = new X.OTT
            r0.<init>(r2, r1, r3, r8)
            return r0
        L_0x02c6:
            boolean r2 = r2 instanceof X.C68916Nat
            if (r2 == 0) goto L_0x0344
            X.Mcv r7 = (X.C66809Mcv) r7
            X.DbZ.A0t(r3, r4, r5, r1)
            if (r7 == 0) goto L_0x010c
            boolean r2 = r4 instanceof X.AnonymousClass79c
            if (r2 == 0) goto L_0x02e4
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.79c r4 = (X.AnonymousClass79c) r4
            X.N7N r3 = new X.N7N
            r3.<init>(r5, r7, r4, r2)
        L_0x02e0:
            X.2tL r3 = (X.C232262tL) r3
            goto L_0x010a
        L_0x02e4:
            boolean r2 = r4 instanceof X.C328707Fv
            if (r2 == 0) goto L_0x02f4
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fv r4 = (X.C328707Fv) r4
            X.N71 r3 = new X.N71
            r3.<init>(r5, r4, r7, r2)
            goto L_0x02e0
        L_0x02f4:
            boolean r2 = r4 instanceof X.C328677Fs
            if (r2 == 0) goto L_0x0304
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fs r4 = (X.C328677Fs) r4
            X.N7D r3 = new X.N7D
            r3.<init>(r5, r7, r4, r2)
            goto L_0x02e0
        L_0x0304:
            boolean r2 = r4 instanceof X.C328657Fq
            if (r2 == 0) goto L_0x0314
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.7Fq r4 = (X.C328657Fq) r4
            X.N7j r3 = new X.N7j
            r3.<init>(r5, r7, r4, r2)
            goto L_0x02e0
        L_0x0314:
            boolean r2 = r4 instanceof X.C66809Mcv
            if (r2 == 0) goto L_0x0324
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.Mcv r4 = (X.C66809Mcv) r4
            X.N78 r3 = new X.N78
            r3.<init>(r5, r4, r7, r2)
            goto L_0x02e0
        L_0x0324:
            boolean r2 = r4 instanceof X.C66851Mdk
            if (r2 == 0) goto L_0x0334
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.Mdk r4 = (X.C66851Mdk) r4
            X.N7V r3 = new X.N7V
            r3.<init>(r5, r7, r4, r2)
            goto L_0x02e0
        L_0x0334:
            boolean r2 = r4 instanceof X.C68819NYd
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.NYd r4 = (X.C68819NYd) r4
            X.N7c r3 = new X.N7c
            r3.<init>(r5, r7, r4, r2)
            goto L_0x02e0
        L_0x0344:
            X.7Fv r7 = (X.C328707Fv) r7
            X.DbZ.A0t(r3, r4, r5, r1)
            if (r7 == 0) goto L_0x010c
            boolean r2 = r4 instanceof X.AnonymousClass79c
            if (r2 == 0) goto L_0x010c
            java.lang.String r2 = X.C71095OcV.A02(r1, r0)
            X.79c r4 = (X.AnonymousClass79c) r4
            X.N7M r3 = new X.N7M
            r3.<init>(r5, r7, r4, r2)
            goto L_0x02ba
        L_0x035c:
            boolean r7 = r2 instanceof X.C68917Nau
            if (r7 == 0) goto L_0x0367
            X.PBy r7 = new X.PBy
            r7.<init>()
            goto L_0x00cf
        L_0x0367:
            if (r6 == 0) goto L_0x0370
            X.PBx r7 = new X.PBx
            r7.<init>()
            goto L_0x00cf
        L_0x0370:
            boolean r7 = r2 instanceof X.C68919Naw
            if (r7 == 0) goto L_0x037b
            X.PBw r7 = new X.PBw
            r7.<init>()
            goto L_0x00cf
        L_0x037b:
            boolean r7 = r2 instanceof X.C68915Nas
            if (r7 == 0) goto L_0x0388
            X.2FW r12 = X.2FW.A1b
            X.PC1 r7 = new X.PC1
            r7.<init>(r12)
            goto L_0x00cf
        L_0x0388:
            boolean r7 = r2 instanceof X.C68916Nat
            if (r7 == 0) goto L_0x0393
            X.PBu r7 = new X.PBu
            r7.<init>()
            goto L_0x00cf
        L_0x0393:
            X.PBt r7 = new X.PBt
            r7.<init>()
            goto L_0x00cf
        L_0x039a:
            boolean r9 = r2 instanceof X.C68919Naw
            if (r9 == 0) goto L_0x03a6
            X.Naw r7 = (X.C68919Naw) r7
            X.9HC r9 = r7.A00
            X.7L2 r7 = r7.A02
            goto L_0x00a6
        L_0x03a6:
            r9 = r45
            r7 = r15
            goto L_0x00a6
        L_0x03ab:
            java.lang.IllegalArgumentException r0 = X.DbU.A0h()
            throw r0
        L_0x03b0:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PC9.AWh(android.content.Context, X.JwM, X.Pwa, com.instagram.direct.model.messaginguser.MessagingUser, X.OMF, X.Pwl, java.util.Map, java.util.Set, int, boolean):X.OTT");
    }

    public PC9(Context context, UserSession userSession, AnonymousClass9HO r3, AnonymousClass9HC r4, AnonymousClass7L2 r5) {
        this.A04 = context;
        this.A00 = userSession;
        this.A03 = r5;
        this.A02 = r4;
        this.A01 = r3;
    }

    public static List A00(AnonymousClass7IK r0, 2FW r1, Iterable iterable) {
        return 00k.A0a(00k.A0l(iterable, r0.A00(r1)));
    }
}
