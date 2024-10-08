package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class PC8 implements C74407PuN {
    public final Context A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass7L2 A02;
    public final OLQ A03;
    public final UserSession A04;
    public final OLP A05;

    public boolean AFT(C74541Pwa pwa, C74552Pwl pwl, int i) {
        0qQ.A0B(pwl, 0);
        return AnonymousClass7TF.A1W(OZ6.A00(pwa, pwl, i), A00());
    }

    public final 2FW A00() {
        if (this instanceof C68910Nan) {
            return ((C68910Nan) this).A03;
        }
        if (this instanceof C68907Nak) {
            return ((C68907Nak) this).A03;
        }
        if (this instanceof C68905Nai) {
            return ((C68905Nai) this).A00;
        }
        if (this instanceof C68912Nap) {
            return ((C68912Nap) this).A02;
        }
        if (this instanceof C68911Nao) {
            return ((C68911Nao) this).A02;
        }
        if (this instanceof C68908Nal) {
            return ((C68908Nal) this).A00;
        }
        if (this instanceof C68913Naq) {
            return ((C68913Naq) this).A02;
        }
        if (this instanceof C68906Naj) {
            return ((C68906Naj) this).A00;
        }
        if (this instanceof C68904Nah) {
            return ((C68904Nah) this).A00;
        }
        return ((C68909Nam) this).A02;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v7, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v11, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v12, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v26, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v27, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v28, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v29, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v30, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v31, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v32, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v33, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v34, resolved type: X.PtA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v35, resolved type: X.PtA} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0065, code lost:
        if (X.0qQ.A0K(java.lang.String.valueOf(r4), r1.BSF(r2)) == false) goto L_0x0067;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00eb  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x017d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.OTT AWh(android.content.Context r34, X.C61084JwM r35, X.C74541Pwa r36, com.instagram.direct.model.messaginguser.MessagingUser r37, X.OMF r38, X.C74552Pwl r39, java.util.Map r40, java.util.Set r41, int r42, boolean r43) {
        /*
            r33 = this;
            r28 = 0
            r32 = r34
            r11 = r38
            r0 = r32
            X.AnonymousClass7TF.A1H(r0, r11)
            r3 = 2
            r31 = r37
            r1 = r39
            r10 = r40
            r30 = r41
            r2 = r31
            r0 = r30
            X.C51974G9v.A0d(r3, r1, r2, r0, r10)
            r0 = r33
            r7 = r0
            boolean r3 = r0 instanceof X.C68912Nap
            r12 = r36
            r2 = r42
            if (r3 == 0) goto L_0x0214
            X.Nap r7 = (X.C68912Nap) r7
            X.7L2 r6 = r7.A01
            X.9HC r5 = r7.A00
            X.Pjy r4 = X.C73799Pjy.A00
        L_0x002e:
            X.0t0 r19 = X.AnonymousClass0eN.A01(r4)
            boolean r4 = X.C71057Oaa.A00(r12, r1, r2)
            java.lang.Boolean r17 = java.lang.Boolean.valueOf(r4)
            boolean r4 = X.C71057Oaa.A01(r12, r1, r2)
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r4)
            r13 = r5
            r14 = r6
            r15 = r31
            r16 = r1
        L_0x0048:
            r20 = r2
            X.7FE r17 = X.C70101NxH.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
        L_0x004e:
            r6 = 0
            r9 = r35
            if (r35 == 0) goto L_0x0067
            java.lang.Object r4 = r9.A00
            if (r4 == 0) goto L_0x0067
            java.lang.String r5 = java.lang.String.valueOf(r4)
            java.lang.String r4 = r1.BSF(r2)
            boolean r4 = X.0qQ.A0K(r5, r4)
            r16 = 1
            if (r4 != 0) goto L_0x0069
        L_0x0067:
            r16 = 0
        L_0x0069:
            r8 = r0
            boolean r5 = r0 instanceof X.C68910Nan
            if (r5 == 0) goto L_0x01ae
            r4 = r8
            X.Nan r4 = (X.C68910Nan) r4
            X.9HO r4 = r4.A01
            X.PC0 r7 = new X.PC0
            r7.<init>(r4)
        L_0x0078:
            com.instagram.common.session.UserSession r4 = r0.A04
            X.9HC r15 = r0.A01
            X.7L2 r14 = r0.A02
            java.lang.String r13 = r1.BsK(r2)
            java.lang.String r23 = X.C71095OcV.A01(r4, r13, r10)
            boolean r26 = X.C71095OcV.A04(r4, r11, r10)
            boolean r27 = X.OPx.A01(r11)
            com.instagram.direct.msys.subtype.MsysThreadSubtype r22 = r11.A00()
            if (r16 == 0) goto L_0x01ab
            if (r35 == 0) goto L_0x01ab
            java.lang.Object r9 = r9.A02
            java.util.List r9 = (java.util.List) r9
        L_0x009a:
            r24 = r9
            r25 = r2
            r29 = r28
            r18 = r15
            r19 = r14
            r20 = r31
            r21 = r1
            r13 = r7
            r14 = r32
            r15 = r12
            r16 = r4
            X.7FW r7 = r13.ALM(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            if (r7 == 0) goto L_0x0259
            if (r5 == 0) goto L_0x018f
            X.Nan r8 = (X.C68910Nan) r8
            android.content.Context r9 = r8.A00
            X.7L2 r4 = r8.A02
        L_0x00bc:
            r13 = r9
            r14 = r4
            r15 = r31
            r16 = r11
            r17 = r1
            r18 = r2
            X.73b r16 = X.C70098NxE.A00(r13, r14, r15, r16, r17, r18)
        L_0x00ca:
            boolean r9 = r0 instanceof X.C68913Naq
            if (r9 == 0) goto L_0x017d
            r15 = 0
        L_0x00cf:
            X.OLP r4 = r0.A05
            X.2FW r20 = r0.A00()
            r13 = r4
            r14 = r12
            r17 = r31
            r18 = r11
            r19 = r1
            r21 = r30
            r22 = r2
            X.7Fl r4 = r13.A00(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            java.lang.String r2 = X.C71095OcV.A02(r1, r2)
            if (r5 == 0) goto L_0x00fd
            X.79c r7 = (X.AnonymousClass79c) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.748 r3 = new X.748
            r3.<init>(r4, r7, r2)
        L_0x00f5:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            X.OTT r0 = new X.OTT
            r0.<init>(r1, r2, r3, r6)
            return r0
        L_0x00fd:
            boolean r1 = r0 instanceof X.C68905Nai
            if (r1 == 0) goto L_0x010c
            X.7Fq r7 = (X.C328657Fq) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.MdA r3 = new X.MdA
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x010c:
            if (r3 == 0) goto L_0x0119
            X.NYd r7 = (X.C68819NYd) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.N6R r3 = new X.N6R
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x0119:
            boolean r1 = r0 instanceof X.C68911Nao
            if (r1 == 0) goto L_0x0128
            X.Mdk r7 = (X.C66851Mdk) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.Mdu r3 = new X.Mdu
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x0128:
            boolean r1 = r0 instanceof X.C68908Nal
            if (r1 == 0) goto L_0x0137
            X.7Fs r7 = (X.C328677Fs) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.N6W r3 = new X.N6W
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x0137:
            boolean r1 = r0 instanceof X.C68909Nam
            if (r1 == 0) goto L_0x0146
            X.NYY r7 = (X.NYY) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.Na6 r3 = new X.Na6
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x0146:
            if (r9 == 0) goto L_0x0153
            X.Mcv r7 = (X.C66809Mcv) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.Md9 r3 = new X.Md9
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x0153:
            boolean r1 = r0 instanceof X.C68907Nak
            if (r1 == 0) goto L_0x0162
            X.NYI r7 = (X.NYI) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.N6G r3 = new X.N6G
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x0162:
            boolean r0 = r0 instanceof X.C68904Nah
            if (r0 == 0) goto L_0x0171
            X.7Fv r7 = (X.C328707Fv) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.N6E r3 = new X.N6E
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x0171:
            X.7Fs r7 = (X.C328677Fs) r7
            X.AnonymousClass7TG.A1T(r2, r7, r4)
            X.N6W r3 = new X.N6W
            r3.<init>(r4, r7, r2)
            goto L_0x00f5
        L_0x017d:
            X.OLQ r8 = r0.A03
            android.content.Context r4 = r0.A00
            r17 = r8
            r18 = r4
            r19 = r12
            r22 = r2
            X.75x r15 = r17.A00(r18, r19, r20, r21, r22)
            goto L_0x00cf
        L_0x018f:
            boolean r4 = r0 instanceof X.C68913Naq
            if (r4 == 0) goto L_0x019b
            X.Naq r8 = (X.C68913Naq) r8
            android.content.Context r9 = r8.A00
            X.7L2 r4 = r8.A01
            goto L_0x00bc
        L_0x019b:
            boolean r4 = r0 instanceof X.C68907Nak
            if (r4 == 0) goto L_0x01a7
            X.Nak r8 = (X.C68907Nak) r8
            android.content.Context r9 = r8.A00
            X.7L2 r4 = r8.A02
            goto L_0x00bc
        L_0x01a7:
            r16 = 0
            goto L_0x00ca
        L_0x01ab:
            r9 = r6
            goto L_0x009a
        L_0x01ae:
            boolean r4 = r0 instanceof X.C68905Nai
            if (r4 == 0) goto L_0x01b9
            X.PBy r7 = new X.PBy
            r7.<init>()
            goto L_0x0078
        L_0x01b9:
            if (r3 == 0) goto L_0x01c2
            X.PBx r7 = new X.PBx
            r7.<init>()
            goto L_0x0078
        L_0x01c2:
            boolean r4 = r0 instanceof X.C68911Nao
            if (r4 == 0) goto L_0x01cd
            X.PBw r7 = new X.PBw
            r7.<init>()
            goto L_0x0078
        L_0x01cd:
            boolean r4 = r0 instanceof X.C68908Nal
            if (r4 == 0) goto L_0x01da
            X.2FW r4 = X.2FW.A1b
            X.PC1 r7 = new X.PC1
            r7.<init>(r4)
            goto L_0x0078
        L_0x01da:
            boolean r4 = r0 instanceof X.C68909Nam
            if (r4 == 0) goto L_0x01e5
            X.PBv r7 = new X.PBv
            r7.<init>()
            goto L_0x0078
        L_0x01e5:
            boolean r4 = r0 instanceof X.C68913Naq
            if (r4 == 0) goto L_0x01f0
            X.PBu r7 = new X.PBu
            r7.<init>()
            goto L_0x0078
        L_0x01f0:
            boolean r4 = r0 instanceof X.C68907Nak
            if (r4 == 0) goto L_0x0200
            r4 = r8
            X.Nak r4 = (X.C68907Nak) r4
            X.9HO r4 = r4.A01
            X.PBz r7 = new X.PBz
            r7.<init>(r4)
            goto L_0x0078
        L_0x0200:
            boolean r4 = r0 instanceof X.C68904Nah
            if (r4 == 0) goto L_0x020b
            X.PBt r7 = new X.PBt
            r7.<init>()
            goto L_0x0078
        L_0x020b:
            X.2FW r4 = X.2FW.A0O
            X.PC1 r7 = new X.PC1
            r7.<init>(r4)
            goto L_0x0078
        L_0x0214:
            boolean r4 = r0 instanceof X.C68911Nao
            if (r4 == 0) goto L_0x0222
            X.Nao r7 = (X.C68911Nao) r7
            X.7L2 r6 = r7.A01
            X.9HC r5 = r7.A00
            X.Pjx r4 = X.C73798Pjx.A00
            goto L_0x002e
        L_0x0222:
            boolean r4 = r0 instanceof X.C68909Nam
            if (r4 == 0) goto L_0x0241
            X.Nam r7 = (X.C68909Nam) r7
            X.7L2 r6 = r7.A01
            X.9HC r5 = r7.A00
            r4 = 1
            X.Plm r4 = X.C73911Plm.A00(r7, r4)
            X.0t0 r19 = X.AnonymousClass0eN.A01(r4)
            r17 = 0
            r13 = r5
            r14 = r6
            r15 = r31
            r16 = r1
            r18 = r17
            goto L_0x0048
        L_0x0241:
            X.9HC r6 = r0.A01
            X.7L2 r5 = r0.A02
            X.Pjt r4 = X.C73794Pjt.A00
            X.0t0 r17 = X.AnonymousClass0eN.A01(r4)
            r13 = r6
            r14 = r5
            r15 = r31
            r16 = r1
            r18 = r2
            X.7FE r17 = X.C71136Ode.A02(r12, r13, r14, r15, r16, r17, r18)
            goto L_0x004e
        L_0x0259:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.PC8.AWh(android.content.Context, X.JwM, X.Pwa, com.instagram.direct.model.messaginguser.MessagingUser, X.OMF, X.Pwl, java.util.Map, java.util.Set, int, boolean):X.OTT");
    }

    public PC8(Context context, UserSession userSession, AnonymousClass9HC r5, AnonymousClass7L2 r6) {
        this.A00 = context;
        this.A04 = userSession;
        this.A02 = r6;
        this.A01 = r5;
        this.A03 = new OLQ(userSession, r5, r6, new C70624ODv(userSession, r5));
        this.A05 = C70095NxB.A00(context, userSession, r5, r6);
    }
}
