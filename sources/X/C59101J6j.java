package X;

import android.content.Context;

/* renamed from: X.J6j  reason: case insensitive filesystem */
public final class C59101J6j extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59101J6j(C307896Rx r2, C277014uI r3, int i) {
        super(1);
        this.A00 = i;
        if (12 - i != 0) {
            this.A02 = r2;
            this.A01 = r3;
        } else {
            this.A01 = r2;
            this.A02 = r3;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v64, resolved type: X.Gwm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v68, resolved type: X.Gwn} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v70, resolved type: X.Gwy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v88, resolved type: X.Gwm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v89, resolved type: X.Gwm} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v90, resolved type: X.Gwm} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x060e, code lost:
        if (r2 == false) goto L_0x0610;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x07fd, code lost:
        r1.E5g(r4, r3.A02(r2, r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x0a35, code lost:
        r2 = r6.A04;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x0ccc, code lost:
        r2.invoke(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x0cd1, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0246, code lost:
        r4.A02(new X.JG1(r1, r2, r3), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x03bc, code lost:
        r5.A02(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x03d2, code lost:
        r2 = (com.instagram.common.session.UserSession) r2;
        X.0qQ.A0B(r2, 0);
        r1 = r1.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x03dc, code lost:
        if ((r1 instanceof X.C335907dj) == false) goto L_0x03e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x03de, code lost:
        r1 = ((X.C335907dj) r1).A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x03e2, code lost:
        r0 = X.1OP.$redex_init_class;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x03e8, code lost:
        return X.AnonymousClass3PQ.A02(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x03eb, code lost:
        if ((r1 instanceof X.C385149iT) == false) goto L_0x03f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03ed, code lost:
        r1 = ((X.C385149iT) r1).A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x03f2, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0417, code lost:
        if (r3 == X.C335857de.A02) goto L_0x0419;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0968 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:362:0x096a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x09ba A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:369:0x097c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            r1 = r31
            int r2 = r0.A00
            switch(r2) {
                case 0: goto L_0x0cbe;
                case 1: goto L_0x0cad;
                case 2: goto L_0x0c9c;
                case 3: goto L_0x0c88;
                case 4: goto L_0x0c60;
                case 5: goto L_0x0c3a;
                case 6: goto L_0x0bfd;
                case 7: goto L_0x0b49;
                case 8: goto L_0x0b2e;
                case 9: goto L_0x0aae;
                case 10: goto L_0x0a63;
                case 11: goto L_0x08a2;
                case 12: goto L_0x088d;
                case 13: goto L_0x087c;
                case 14: goto L_0x0869;
                case 15: goto L_0x0806;
                case 16: goto L_0x07eb;
                case 17: goto L_0x07d4;
                case 18: goto L_0x07c1;
                case 19: goto L_0x0757;
                case 20: goto L_0x04e8;
                case 21: goto L_0x04b1;
                case 22: goto L_0x049e;
                case 23: goto L_0x0480;
                case 24: goto L_0x046d;
                case 25: goto L_0x044f;
                case 26: goto L_0x0405;
                case 27: goto L_0x03f4;
                case 28: goto L_0x03c8;
                case 29: goto L_0x03c1;
                case 30: goto L_0x039c;
                case 31: goto L_0x0374;
                case 32: goto L_0x02d2;
                case 33: goto L_0x0250;
                case 34: goto L_0x0232;
                case 35: goto L_0x021d;
                case 36: goto L_0x01fe;
                case 37: goto L_0x01ce;
                case 38: goto L_0x01aa;
                case 39: goto L_0x019c;
                case 40: goto L_0x0188;
                case 41: goto L_0x0174;
                case 42: goto L_0x014d;
                case 43: goto L_0x012c;
                case 44: goto L_0x00d8;
                case 45: goto L_0x00bb;
                case 46: goto L_0x0056;
                case 47: goto L_0x0048;
                case 48: goto L_0x0036;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.Q3m r1 = (X.C7310Q3m) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r5 = r0.A01
            X.6Qd r5 = (X.C307446Qd) r5
            java.lang.Object r4 = r0.A02
            X.INI r4 = (X.INI) r4
            X.6RB r0 = r4.A00
            java.lang.Object r2 = r0.A0A
            monitor-enter(r2)
            X.6RN r0 = r0.A00     // Catch:{ all -> 0x0033 }
            monitor-exit(r2)
            X.6Rv r3 = new X.6Rv
            r3.<init>(r0)
            java.lang.String r2 = r4.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            java.util.Map r1 = X.INI.A00(r1, r4, r0)
            java.lang.String r0 = "acq"
            r5.A0G(r3, r1, r0, r2)
            goto L_0x0ccf
        L_0x0033:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0036:
            X.Vuf r1 = (X.C18588Vuf) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.UgW r2 = (X.C15666UgW) r2
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            r2.A07 = r1
            goto L_0x0b29
        L_0x0048:
            X.X9L r1 = (X.X9L) r1
            java.lang.Object r2 = r0.A02
            X.UgW r2 = (X.C15666UgW) r2
            java.lang.Object r0 = r0.A01
            X.0sa r0 = (X.C62320sa) r0
            r2.A06 = r1
            goto L_0x0b29
        L_0x0056:
            X.JMA r1 = (X.JMA) r1
            boolean r3 = r1 instanceof X.IVC
            java.lang.String r2 = "CommerceCartGetGlobalCartViewModel"
            if (r3 == 0) goto L_0x00a7
            java.lang.Object r4 = r0.A02
            X.6xP r4 = (X.C323386xP) r4
            X.IVC r1 = (X.IVC) r1
            X.3JD r1 = r1.A00
            if (r1 == 0) goto L_0x0ccf
            X.3lr r5 = X.C41845B3m.A0U(r1)
            if (r5 == 0) goto L_0x0ccf
            java.lang.Class<X.C7Z> r3 = X.C7Z.class
            r1 = 832(0x340, float:1.166E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r1)
            r1 = 231324885(0xdc9bcd5, float:1.2433041E-30)
            X.3lr r1 = r5.A03(r3, r2, r1)
            X.C7Z r1 = (X.C7Z) r1
            if (r1 == 0) goto L_0x0ccf
            X.BdQ r3 = r1.A0E()
            if (r3 == 0) goto L_0x0ccf
            r2 = 1
            r1 = 1899(0x76b, float:2.661E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            int r3 = r3.getCoercedIntField(r2, r1)
            X.HLL r1 = X.HLL.GRAPHQL
            X.6yN r2 = new X.6yN
            r2.<init>(r1, r3)
            java.lang.Object r1 = r0.A01
            X.2gO r1 = (X.AnonymousClass2gO) r1
            X.1Ng r0 = r4.A02
            r0.A00(r2)
            r1.onChanged(r2)
            goto L_0x0ccf
        L_0x00a7:
            boolean r0 = r1 instanceof X.IVB
            if (r0 == 0) goto L_0x00b6
            X.IVB r1 = (X.IVB) r1
            java.lang.Throwable r1 = r1.A00
            java.lang.String r0 = "onFailure: Failed to request CommerceCartGlobalCartQuery"
            X.0KC.A0F(r2, r0, r1)
            goto L_0x0ccf
        L_0x00b6:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00bb:
            java.lang.Object r2 = r0.A02
            X.GgO r2 = (X.C52971GgO) r2
            X.7aO r1 = r2.A0I
            if (r1 == 0) goto L_0x00ca
            java.lang.Object r0 = r0.A01
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r1.A01(r0)
        L_0x00ca:
            X.05G r2 = r2.A0O
            X.IN4 r1 = X.IN4.A00
            X.9IK r0 = new X.9IK
            r0.<init>(r1)
            r2.Epw(r0)
            goto L_0x0ccf
        L_0x00d8:
            X.7a7 r1 = (X.C333777a7) r1
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r3 = r0.A01
            X.7eu r3 = (X.C336617eu) r3
            java.lang.Integer r2 = r3.A03
            int r4 = r2.intValue()
            java.lang.Object r0 = r0.A02
            X.GgO r0 = (X.C52971GgO) r0
            X.7a0 r5 = r0.A0C
            java.lang.String r3 = r3.A06
            X.0wc r2 = r5.A01
            if (r4 == r6) goto L_0x0129
            java.lang.String r0 = "ig_comments_view_previous_replies_tap"
        L_0x00f6:
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r2, r0)
            java.lang.String r0 = r1.A0K
            X.G9t.A1J(r4, r0)
            com.instagram.user.model.User r0 = r1.A0A
            if (r0 == 0) goto L_0x0126
            java.lang.Long r0 = X.C51972G9s.A0h(r0)
            if (r0 == 0) goto L_0x0126
            long r0 = r0.longValue()
        L_0x010d:
            X.C51970G9q.A1C(r4, r0)
            java.lang.Long r1 = X.AnonymousClass7TE.A10(r3)
            java.lang.String r0 = "comment_id"
            r4.A9F(r0, r1)
            X.4DU r0 = r5.A03
            X.DbW.A16(r4, r0)
            java.lang.String r3 = X.DbS.A0k()
            java.lang.String r0 = "nav_chain"
            goto L_0x04e0
        L_0x0126:
            r0 = 0
            goto L_0x010d
        L_0x0129:
            java.lang.String r0 = "ig_comments_view_more_replies_tap"
            goto L_0x00f6
        L_0x012c:
            X.7a7 r1 = (X.C333777a7) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r4 = r0.A01
            X.7a0 r4 = (X.C333717a0) r4
            java.util.concurrent.atomic.AtomicBoolean r2 = X.1Xj.A0i
            java.lang.String r1 = r1.A0I
            java.lang.String r3 = X.1Xv.A06(r1)
            java.lang.Object r0 = r0.A02
            X.7dj r0 = (X.C335907dj) r0
            com.instagram.user.model.User r2 = r0.A0C
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = r0.A0N
            r4.A09(r2, r3, r1, r0)
            goto L_0x0ccf
        L_0x014d:
            X.7a7 r1 = (X.C333777a7) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r3 = r0.A01
            X.7a0 r3 = (X.C333717a0) r3
            java.util.concurrent.atomic.AtomicBoolean r2 = X.1Xj.A0i
            java.lang.String r1 = r1.A0I
            java.lang.String r6 = X.1Xv.A06(r1)
            java.lang.Object r0 = r0.A02
            X.7dj r0 = (X.C335907dj) r0
            com.instagram.user.model.User r4 = r0.A0C
            java.lang.String r7 = r0.A0K
            java.lang.String r8 = r0.A0N
            r0 = 1077(0x435, float:1.509E-42)
            java.lang.String r5 = X.C66579MXk.A00(r0)
            r3.A0A(r4, r5, r6, r7, r8)
            goto L_0x0ccf
        L_0x0174:
            java.lang.Object r2 = r0.A02
            X.GgO r2 = (X.C52971GgO) r2
            java.lang.Object r0 = r0.A01
            X.7dj r0 = (X.C335907dj) r0
            java.lang.String r1 = r0.A0K
            java.lang.String r0 = r0.A0N
            r2.A0c(r1, r0)
            java.lang.Boolean r3 = X.AnonymousClass7TE.A0v()
            return r3
        L_0x0188:
            java.lang.Object r0 = r0.A01
            X.3Y5 r0 = (X.AnonymousClass3Y5) r0
            X.2V1 r1 = r0.A05
            r0 = 0
            android.view.View r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x0ccf
            java.lang.String r0 = "intValue"
            java.lang.NullPointerException r0 = X.AnonymousClass7TE.A11(r0)
            throw r0
        L_0x019c:
            java.lang.Object r0 = r0.A02
            X.GuH r0 = (X.C53788GuH) r0
            X.0sP r1 = r0.A03
            if (r1 == 0) goto L_0x0ccf
            r0 = 0
            r1.invoke(r0)
            goto L_0x0ccf
        L_0x01aa:
            X.2WE r5 = X.C51968G9o.A0f(r1)
            java.lang.Object r4 = r0.A02
            X.Gwd r4 = (X.C53933Gwd) r4
            X.H3k r2 = r4.A00
            X.4DU r1 = r4.A01
            java.lang.Object[] r3 = new java.lang.Object[]{r2, r1}
            java.lang.Object r2 = r0.A01
            r1 = 21
            X.JG1 r0 = new X.JG1
            r0.<init>(r1, r2, r4)
            r5.A02(r0, r3)
            java.lang.Object[] r1 = X.C51966G9m.A1b()
            X.JEy r0 = X.C59320JEy.A00
            goto L_0x03bc
        L_0x01ce:
            X.2WE r5 = X.C51968G9o.A0f(r1)
            java.lang.Object r4 = r0.A01
            java.lang.Object[] r3 = new java.lang.Object[]{r4}
            r2 = 48
            X.J6t r1 = new X.J6t
            r1.<init>(r4, r2)
            r5.A02(r1, r3)
            java.lang.Object r3 = r0.A02
            X.Gwr r3 = (X.C53947Gwr) r3
            int r0 = r3.A00
            java.lang.Object[] r2 = X.AnonymousClass7TF.A1b(r0)
            r1 = 49
            X.J6t r0 = new X.J6t
            r0.<init>(r3, r1)
            r5.A02(r0, r2)
            java.lang.Object[] r1 = X.C51966G9m.A1b()
            X.JEx r0 = X.C59319JEx.A00
            goto L_0x03bc
        L_0x01fe:
            X.2WE r4 = X.C51968G9o.A0f(r1)
            java.lang.Object r3 = r0.A02
            X.Gwy r3 = (X.C53954Gwy) r3
            java.lang.String r5 = r3.A06
            java.lang.String r6 = r3.A05
            X.7ft r7 = r3.A02
            X.HMR r8 = r3.A04
            X.7fu r9 = r3.A03
            com.instagram.common.session.UserSession r10 = r3.A01
            X.GgO r11 = r3.A00
            java.lang.Object[] r5 = new java.lang.Object[]{r5, r6, r7, r8, r9, r10, r11}
            java.lang.Object r2 = r0.A01
            r1 = 20
            goto L_0x0246
        L_0x021d:
            X.2WE r4 = X.C51968G9o.A0f(r1)
            java.lang.Object r3 = r0.A02
            X.Gwn r3 = (X.C53943Gwn) r3
            X.H3m r2 = r3.A00
            X.GgO r1 = r3.A01
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r1}
            java.lang.Object r2 = r0.A01
            r1 = 19
            goto L_0x0246
        L_0x0232:
            X.2WE r4 = X.C51968G9o.A0f(r1)
            java.lang.Object r3 = r0.A02
            X.Gwm r3 = (X.C53942Gwm) r3
            X.H3h r2 = r3.A00
            X.GgO r1 = r3.A01
            java.lang.Object[] r5 = new java.lang.Object[]{r2, r1}
            java.lang.Object r2 = r0.A01
            r1 = 18
        L_0x0246:
            X.JG1 r0 = new X.JG1
            r0.<init>(r1, r2, r3)
            r4.A02(r0, r5)
            goto L_0x0ccf
        L_0x0250:
            X.2WA r1 = (X.AnonymousClass2WA) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r2 = r0.A02
            X.Gsa r2 = (X.C53683Gsa) r2
            java.lang.Object r5 = r0.A01
            android.content.Context r5 = (android.content.Context) r5
            X.H3j r0 = r2.A00
            java.util.List r8 = r0.A01
            X.HN2 r7 = r0.A00
            android.view.View r6 = r1.A00
            X.0qQ.A06(r6)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            android.graphics.drawable.ColorDrawable r10 = X.C51965G9l.A0D(r4)
            r0 = 2131238065(0x7f081cb1, float:1.8092398E38)
            android.graphics.drawable.Drawable r9 = r5.getDrawable(r0)
            java.util.Iterator r8 = r8.iterator()
        L_0x027c:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02c2
            java.lang.Object r1 = r8.next()
            X.HN2 r1 = (X.HN2) r1
            boolean r23 = X.AnonymousClass7TF.A1W(r1, r7)
            X.HN2 r0 = X.HN2.A0A
            boolean r22 = X.AnonymousClass7TF.A1W(r1, r0)
            int r0 = r1.A00
            java.lang.String r17 = X.AnonymousClass7TE.A16(r5, r0)
            r12 = r10
            if (r23 == 0) goto L_0x029c
            r12 = r9
        L_0x029c:
            r0 = 12
            int r19 = X.DbS.A02(r5, r0)
            X.IVI r15 = new X.IVI
            r15.<init>((int) r4, (java.lang.Object) r1, (java.lang.Object) r2)
            r13 = 0
            r24 = 1
            X.8rI r11 = new X.8rI
            r14 = r13
            r16 = r13
            r18 = r4
            r20 = r4
            r21 = r4
            r25 = r4
            r26 = r4
            r27 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r3.add(r11)
            goto L_0x027c
        L_0x02c2:
            com.instagram.common.session.UserSession r2 = r2.A02
            r1 = 0
            X.8Ov r0 = new X.8Ov
            r0.<init>(r5, r2, r1, r4)
            r0.A02(r3)
            r0.showAsDropDown(r6)
            goto L_0x0ccf
        L_0x02d2:
            java.lang.Object r3 = r0.A02
            X.7fJ r3 = (X.C336867fJ) r3
            X.2WX r1 = X.C336867fJ.A0F
            com.instagram.common.session.UserSession r2 = r3.A03
            java.lang.Object r0 = r0.A01
            X.2Wb r0 = (X.2Wb) r0
            android.content.Context r1 = X.C243803a8.A00(r0)
            X.7dj r0 = r3.A00
            com.instagram.user.model.User r10 = r0.A0C
            java.lang.String r11 = r0.A0K
            java.lang.String r12 = r0.A0N
            java.lang.String r13 = r0.A0M
            X.GgO r8 = r3.A02
            r3 = 0
            X.0qQ.A0B(r2, r3)
            r14 = 1
            r0 = 6
            X.0qQ.A0B(r8, r0)
            X.1YZ r0 = X.1YZ.A02
            if (r0 == 0) goto L_0x0ccf
            X.7aO r5 = r0.A01(r2)
            if (r5 == 0) goto L_0x0ccf
            X.0wc r9 = X.AnonymousClass0kN.A02(r2)
            r0 = 2131972307(0x7f1350d3, float:1.9581618E38)
            java.lang.String r7 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131972306(0x7f1350d2, float:1.9581616E38)
            java.lang.String r6 = X.DbY.A0b(r1, r10, r0)
            X.0qQ.A07(r6)
            r0 = 2131972305(0x7f1350d1, float:1.9581614E38)
            java.lang.String r4 = X.AnonymousClass7TE.A16(r1, r0)
            r0 = 2131972304(0x7f1350d0, float:1.9581612E38)
            java.lang.String r2 = X.AnonymousClass7TE.A16(r1, r0)
            X.8ab r1 = X.DbS.A0Y(r1)
            r1.A05 = r7
            r1.A0q(r6)
            X.OfH r7 = new X.OfH
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r1.A0c(r7, r4)
            X.FIl r14 = new X.FIl
            r15 = r9
            r16 = r10
            r17 = r11
            r18 = r13
            r19 = r12
            r20 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r1.A0C(r14)
            X.FHa r14 = new X.FHa
            r18 = r12
            r19 = r13
            r14.<init>(r15, r16, r17, r18, r19)
            r1.A0B(r14)
            java.util.Set r4 = r5.A02
            java.lang.String r0 = r10.getId()
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x036f
            X.OfH r4 = new X.OfH
            r5 = r8
            r6 = r9
            r7 = r10
            r8 = r11
            r9 = r12
            r10 = r13
            r11 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r1.A0a(r4, r2)
        L_0x036f:
            X.DbT.A1V(r1)
            goto L_0x0ccf
        L_0x0374:
            java.lang.Object r4 = r0.A01
            X.3Y5 r4 = (X.AnonymousClass3Y5) r4
            X.2V1 r3 = r4.A05
            r1 = 1772(0x6ec, float:2.483E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            java.lang.Object r2 = r0.A02
            X.7hK r2 = (X.C338047hK) r2
            X.7dj r0 = r2.A00
            java.lang.String r0 = r0.A0K
            java.lang.String r0 = X.002.A0R(r1, r0)
            android.view.View r1 = r3.A03(r0)
            if (r1 == 0) goto L_0x0ccf
            X.Aon r0 = new X.Aon
            r0.<init>(r1, r4, r2)
            r1.post(r0)
            goto L_0x0ccf
        L_0x039c:
            X.2WE r5 = X.C51968G9o.A0f(r1)
            java.lang.Object r4 = r0.A01
            java.lang.Object r3 = r0.A02
            X.Gwv r3 = (X.C53951Gwv) r3
            java.lang.String r0 = r3.A05
            java.lang.Object[] r2 = new java.lang.Object[]{r4, r0}
            r1 = 16
            X.JG1 r0 = new X.JG1
            r0.<init>(r1, r4, r3)
            r5.A02(r0, r2)
            java.lang.Object[] r1 = X.C51966G9m.A1b()
            X.JEv r0 = X.C59317JEv.A00
        L_0x03bc:
            r5.A02(r0, r1)
            goto L_0x0ccf
        L_0x03c1:
            java.lang.Object r1 = r0.A01
            X.Hrc r1 = (X.C56030Hrc) r1
            java.lang.Object r2 = r0.A02
            goto L_0x03d2
        L_0x03c8:
            java.lang.Object r1 = r0.A01
            X.Hrc r1 = (X.C56030Hrc) r1
            java.lang.Object r0 = r0.A02
            java.lang.Object r2 = X.C51966G9m.A18(r0)
        L_0x03d2:
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            r0 = 0
            X.0qQ.A0B(r2, r0)
            X.7aD r1 = r1.A01
            boolean r0 = r1 instanceof X.C335907dj
            if (r0 == 0) goto L_0x03e9
            X.7dj r1 = (X.C335907dj) r1
            com.instagram.user.model.User r1 = r1.A0C
        L_0x03e2:
            X.1OP r0 = X.1OP.$redex_init_class
            com.instagram.model.reels.Reel r3 = X.AnonymousClass3PQ.A02(r2, r1)
            return r3
        L_0x03e9:
            boolean r0 = r1 instanceof X.C385149iT
            if (r0 == 0) goto L_0x03f2
            X.9iT r1 = (X.C385149iT) r1
            com.instagram.user.model.User r1 = r1.A02
            goto L_0x03e2
        L_0x03f2:
            r3 = 0
            return r3
        L_0x03f4:
            java.lang.Object r1 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r1 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r1
            X.7aH r1 = com.instagram.comments.mvvm.data.MediaCommentListRepository.A00(r1)
            java.lang.Object r0 = r0.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.7aH r3 = X.C335067cK.A05(r1, r0)
            return r3
        L_0x0405:
            X.7dj r1 = (X.C335907dj) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r3 = r0.A01
            X.7de r3 = (X.C335857de) r3
            X.7de r2 = X.C335857de.HIDDEN_COMMENT
            if (r3 == r2) goto L_0x0419
            X.7de r2 = X.C335857de.COVERED_COMMENT
            r29 = 0
            if (r3 != r2) goto L_0x041b
        L_0x0419:
            r29 = 1
        L_0x041b:
            X.7de r2 = X.C335857de.A04
            boolean r28 = X.AnonymousClass7TF.A1W(r3, r2)
            r5 = 0
            java.lang.Object r0 = r0.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r20 = -1090519041(0xffffffffbeffffff, float:-0.49999997)
            r21 = 65529(0xfff9, float:9.1826E-41)
            r6 = r1
            r7 = r5
            r8 = r3
            r9 = r5
            r10 = r5
            r11 = r5
            r12 = r5
            r13 = r5
            r14 = r5
            r15 = r0
            r16 = r5
            r17 = r5
            r18 = r5
            r19 = r5
            r22 = r4
            r23 = r4
            r24 = r4
            r25 = r4
            r26 = r4
            r27 = r4
            X.7dj r3 = X.C335907dj.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            return r3
        L_0x044f:
            X.7dj r1 = (X.C335907dj) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r2 = r0.A02
            X.7ft r2 = (X.C337207ft) r2
            java.lang.Object r0 = r0.A01
            X.7fu r0 = (X.C337217fu) r0
            r4 = 0
            r10 = -1
            r11 = 65439(0xff9f, float:9.17E-41)
            r5 = r1
            r6 = r2
            r7 = r0
            r8 = r4
            r9 = r4
            r12 = r3
            X.7dj r3 = X.C335907dj.A00(r4, r5, (X.C337227fv) null, (X.C335857de) null, (X.C333897aK) null, r6, r7, (java.lang.Boolean) null, (java.lang.Boolean) null, (java.lang.Integer) null, r8, (java.lang.Long) null, (java.lang.String) null, (java.lang.String) null, r9, r10, r11, false, false, false, false, false, r12, false, false)
            return r3
        L_0x046d:
            X.7aH r1 = (X.C333867aH) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            java.util.Set r2 = (java.util.Set) r2
            java.lang.Object r0 = r0.A01
            java.util.Set r0 = (java.util.Set) r0
            X.7aH r3 = X.C335067cK.A09(r1, r2, r0)
            return r3
        L_0x0480:
            X.7dW r1 = (X.C335777dW) r1
            r3 = 0
            X.0qQ.A0B(r1, r3)
            java.lang.Object r5 = r0.A02
            com.instagram.comments.mvvm.data.MediaCommentListRepository r5 = (com.instagram.comments.mvvm.data.MediaCommentListRepository) r5
            java.lang.Object r2 = r0.A01
            X.7al r2 = (X.C334157al) r2
            r8 = 1
            X.7a5 r0 = r5.A05
            X.7da r4 = new X.7da
            r6 = r1
            r7 = r2
            r9 = r3
            r4.<init>(r5, r6, r7, r8, r9)
            r0.A01(r4)
            goto L_0x0ccf
        L_0x049e:
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            java.lang.Object r2 = r0.A02
            X.3Q2 r2 = (X.AnonymousClass3Q2) r2
            r2.A1v = r1
            java.lang.Object r1 = r0.A01
            X.4D7 r1 = (X.AnonymousClass4D7) r1
            X.KVm r0 = X.C62013KVm.A00
            r1.resumeWith(r0)
            goto L_0x0ccf
        L_0x04b1:
            java.lang.String r3 = X.C41847B3o.A1E(r1)
            java.lang.Object r1 = r0.A02
            android.content.Context r1 = (android.content.Context) r1
            X.C59689JTv.A04(r1)
            java.lang.Object r2 = r0.A01
            X.LPH r2 = (X.LPH) r2
            X.0wc r1 = r2.A01
            java.lang.String r0 = "content_scheduling_submit_error"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r4.isSampled()
            if (r0 == 0) goto L_0x0ccf
            X.JVg r0 = r2.A00
            java.lang.String r0 = r0.A00
            X.DbS.A1N(r4, r0)
            r0 = 5199(0x144f, float:7.285E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbS.A1H(r4, r0)
            java.lang.String r0 = "error_message"
        L_0x04e0:
            r4.AAJ(r0, r3)
            r4.Cgf()
            goto L_0x0ccf
        L_0x04e8:
            X.GnV r1 = (X.C53398GnV) r1
            java.lang.Object r4 = r0.A02
            X.UaW r4 = (X.C15324UaW) r4
            X.0qQ.A0A(r1)
            java.lang.Object r8 = r1.A02
            java.util.List r8 = (java.util.List) r8
            if (r8 == 0) goto L_0x04fd
            boolean r2 = r8.isEmpty()
            if (r2 == 0) goto L_0x054c
        L_0x04fd:
            boolean r2 = r1.A05
            if (r2 != 0) goto L_0x054c
            boolean r2 = r4.A0D
            if (r2 != 0) goto L_0x054c
            java.lang.String r2 = r1.A04
            if (r2 != 0) goto L_0x054c
            X.DbT.A1I(r4)
            androidx.fragment.app.FragmentActivity r1 = r4.requireActivity()
            com.instagram.common.session.UserSession r0 = r4.getSession()
            X.6Yo r4 = X.DbS.A0M(r1, r0)
            X.1Wy r0 = X.C322576w3.A00()
            r0.A01()
            X.Ump r3 = new X.Ump
            r3.<init>()
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            r0 = 4997(0x1385, float:7.002E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 798(0x31e, float:1.118E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r1, r0)
            r3.setArguments(r2)
            r4.A0D(r3)
            r0 = 1722(0x6ba, float:2.413E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.A0C = r0
            r4.A0A = r0
            r4.A04()
            goto L_0x0ccf
        L_0x054c:
            android.view.View r6 = r4.A02
            if (r6 != 0) goto L_0x055a
            java.lang.String r12 = "spinnerView"
        L_0x0552:
            X.0qQ.A0F(r12)
        L_0x0555:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x055a:
            boolean r5 = r1.A05
            r3 = 8
            int r2 = X.DbW.A01(r5)
            r6.setVisibility(r2)
            android.view.View r2 = r4.A00
            if (r2 != 0) goto L_0x056c
            java.lang.String r12 = "contentView"
            goto L_0x0552
        L_0x056c:
            if (r5 != 0) goto L_0x056f
            r3 = 0
        L_0x056f:
            r2.setVisibility(r3)
            r2 = 2680(0xa78, float:3.755E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r2)
            java.lang.String r12 = "promoteLogger"
            java.lang.String r11 = "leadAdsLogger"
            if (r8 == 0) goto L_0x0721
            java.lang.Object r7 = r0.A01
            android.view.View r7 = (android.view.View) r7
            com.instagram.business.promote.model.PromoteData r0 = r4.A09
            if (r0 != 0) goto L_0x0589
            java.lang.String r12 = "promoteData"
            goto L_0x0552
        L_0x0589:
            r0.A1u = r8
            boolean r0 = r8.isEmpty()
            r4.A0C = r0
            X.WYX r8 = r4.A06
            if (r8 == 0) goto L_0x0752
            java.lang.Long r3 = r4.A0B
            java.lang.String r6 = "lead_gen_manage_lead_forms"
            r0 = 2679(0xa77, float:3.754E-42)
            java.lang.String r2 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = "impression"
            X.1Ln r0 = X.WYX.A00(r8, r3, r6, r2, r0)
            r0.Cgf()
            r0 = 2131438671(0x7f0b2c4f, float:1.8499275E38)
            android.widget.TextView r0 = X.DbU.A0G(r7, r0)
            r4.A04 = r0
            r0 = 2131438702(0x7f0b2c6e, float:1.8499338E38)
            android.widget.TextView r3 = X.AnonymousClass7TG.A0R(r7, r0)
            r0 = 2131430936(0x7f0b0e18, float:1.8483587E38)
            android.view.View r0 = r7.requireViewById(r0)
            r4.A01 = r0
            r0 = 2131435292(0x7f0b1f1c, float:1.8492422E38)
            android.view.View r0 = r7.requireViewById(r0)
            r4.A02 = r0
            android.widget.TextView r2 = r4.A04
            if (r2 != 0) goto L_0x05d4
            java.lang.String r2 = "headerView"
        L_0x05d0:
            X.0qQ.A0F(r2)
            goto L_0x0555
        L_0x05d4:
            r0 = 2131970408(0x7f134968, float:1.9577766E38)
            X.DbU.A1G(r2, r4, r0)
            r0 = 2131970407(0x7f134967, float:1.9577764E38)
            X.DbU.A1G(r3, r4, r0)
            X.C15324UaW.A01(r4)
            android.view.View r0 = r4.A03
            java.lang.String r9 = "viewAllRow"
            if (r0 == 0) goto L_0x06e1
            r8 = 2131438192(0x7f0b2a70, float:1.8498304E38)
            android.widget.TextView r2 = X.AnonymousClass7TG.A0R(r0, r8)
            r0 = 2131970406(0x7f134966, float:1.9577762E38)
            X.DbU.A1G(r2, r4, r0)
            android.view.View r3 = r4.A03
            if (r3 == 0) goto L_0x06e1
            com.instagram.business.promote.model.PromoteData r2 = r4.A09
            java.lang.String r0 = "promoteData"
            if (r2 != 0) goto L_0x0605
            X.0qQ.A0F(r0)
            goto L_0x0555
        L_0x0605:
            java.util.List r0 = r2.A1u
            if (r0 == 0) goto L_0x0610
            boolean r2 = X.AnonymousClass7TE.A1b(r0)
            r0 = 0
            if (r2 != 0) goto L_0x0612
        L_0x0610:
            r0 = 8
        L_0x0612:
            r3.setVisibility(r0)
            android.view.View r2 = r4.A03
            if (r2 == 0) goto L_0x06e1
            r0 = 7
            X.C56800ICx.A00(r2, r0, r4)
            android.view.View r0 = r4.A01
            java.lang.String r2 = "createFormView"
            if (r0 == 0) goto L_0x05d0
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r0, r8)
            r0 = 2131970400(0x7f134960, float:1.957775E38)
            X.DbU.A1G(r10, r4, r0)
            android.view.View r3 = r4.A01
            if (r3 == 0) goto L_0x05d0
            r2 = 58
            X.WBB r0 = new X.WBB
            r0.<init>(r4, r2)
            X.AnonymousClass0fU.A00(r0, r3)
            com.instagram.common.session.UserSession r0 = r4.getSession()
            X.1Av r9 = X.1Au.A00(r0)
            boolean r0 = r4.A0C
            if (r0 == 0) goto L_0x0687
            X.0xa r2 = r9.A01
            java.lang.String r0 = "has_seen_promote_lead_gen_add_new_form_tooltip"
            r8 = 0
            boolean r0 = r2.getBoolean(r0, r8)
            if (r0 != 0) goto L_0x0687
            androidx.fragment.app.FragmentActivity r3 = r4.requireActivity()
            androidx.fragment.app.FragmentActivity r2 = r4.requireActivity()
            r0 = 2131970401(0x7f134961, float:1.9577752E38)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            X.5Gt r0 = X.AnonymousClass7TG.A0f(r3, r0)
            r0.A03(r10)
            r0.A02()
            r0.A0B = r8
            X.5Gv r2 = r0.A00()
            X.IiE r0 = new X.IiE
            r0.<init>(r4, r2, r9)
            r10.post(r0)
            X.WGU r3 = r4.A07
            if (r3 != 0) goto L_0x0680
            r2 = r12
            goto L_0x05d0
        L_0x0680:
            X.UzE r2 = X.C16678UzE.MANAGE_LEAD_ADS
            java.lang.String r0 = "add_new_form_button_tooltip"
            r3.A0F(r2, r0)
        L_0x0687:
            r0 = 2131435337(0x7f0b1f49, float:1.8492513E38)
            android.view.View r7 = X.AnonymousClass7TF.A0F(r7, r0)
            com.instagram.ui.widget.radiogroup.IgRadioGroup r7 = (com.instagram.ui.widget.radiogroup.IgRadioGroup) r7
            com.instagram.api.schemas.XIGIGBoostCallToAction r9 = com.instagram.api.schemas.XIGIGBoostCallToAction.APPLY_NOW
            com.instagram.api.schemas.XIGIGBoostCallToAction r8 = com.instagram.api.schemas.XIGIGBoostCallToAction.LEARN_MORE
            com.instagram.api.schemas.XIGIGBoostCallToAction r3 = com.instagram.api.schemas.XIGIGBoostCallToAction.GET_QUOTE
            com.instagram.api.schemas.XIGIGBoostCallToAction r2 = com.instagram.api.schemas.XIGIGBoostCallToAction.SIGN_UP
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = com.instagram.api.schemas.XIGIGBoostCallToAction.SUBSCRIBE
            com.instagram.api.schemas.XIGIGBoostCallToAction[] r0 = new com.instagram.api.schemas.XIGIGBoostCallToAction[]{r9, r8, r3, r2, r0}
            java.util.List r0 = X.0sr.A1P(r0)
            java.util.Iterator r9 = r0.iterator()
        L_0x06a6:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x06e6
            java.lang.Object r8 = r9.next()
            com.instagram.api.schemas.XIGIGBoostCallToAction r8 = (com.instagram.api.schemas.XIGIGBoostCallToAction) r8
            android.content.Context r0 = r4.requireContext()
            X.U5O r3 = new X.U5O
            r3.<init>(r0)
            r3.setTag(r8)
            android.content.Context r2 = r4.requireContext()
            int r0 = X.C18677Vwa.A00(r8)
            java.lang.String r0 = X.AnonymousClass7TE.A16(r2, r0)
            r3.setPrimaryText((java.lang.CharSequence) r0)
            r2 = 1
            X.Wen r0 = new X.Wen
            r0.<init>(r2, r8, r4)
            r3.A9W(r0)
            r7.addView(r3)
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r4.A05
            if (r0 != r8) goto L_0x06a6
            r3.setChecked(r2)
            goto L_0x06a6
        L_0x06e1:
            X.0qQ.A0F(r9)
            goto L_0x0555
        L_0x06e6:
            com.instagram.api.schemas.XIGIGBoostCallToAction r0 = r4.A05
            if (r0 == 0) goto L_0x06f8
            android.view.View r0 = r7.findViewWithTag(r0)
            X.0qQ.A07(r0)
            int r0 = r0.getId()
            r7.A02(r0)
        L_0x06f8:
            X.WGU r3 = r4.A07
            if (r3 == 0) goto L_0x0552
            X.UzE r2 = X.C16678UzE.MANAGE_LEAD_ADS
            java.lang.String r0 = r2.toString()
            r3.A0Q(r0)
            X.WGU r0 = r4.A07
            if (r0 == 0) goto L_0x0552
            r0.A0D(r2, r5)
            X.WYX r0 = r4.A06
            if (r0 == 0) goto L_0x0752
            java.lang.Long r7 = r4.A0B
            java.lang.String r3 = "success"
            r2 = 259(0x103, float:3.63E-43)
            java.lang.String r2 = X.AnonymousClass000.A00(r2)
            X.1Ln r0 = X.WYX.A00(r0, r7, r6, r2, r3)
            r0.Cgf()
        L_0x0721:
            java.lang.String r2 = r1.A04
            if (r2 == 0) goto L_0x0ccf
            X.WGU r1 = r4.A07
            if (r1 == 0) goto L_0x0552
            X.UzE r0 = X.C16678UzE.MANAGE_LEAD_ADS
            r1.A0I(r0, r5, r2)
            X.WYX r5 = r4.A06
            if (r5 == 0) goto L_0x0752
            java.lang.Long r3 = r4.A0B
            java.lang.String r2 = "fail"
            java.lang.String r1 = "lead_gen_manage_lead_forms"
            r0 = 259(0x103, float:3.63E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.1Ln r0 = X.WYX.A00(r5, r3, r1, r0, r2)
            r0.Cgf()
            com.instagram.common.session.UserSession r1 = r4.getSession()
            androidx.fragment.app.FragmentActivity r0 = r4.requireActivity()
            X.W2F.A02(r1, r0)
            goto L_0x0ccf
        L_0x0752:
            X.0qQ.A0F(r11)
            goto L_0x0555
        L_0x0757:
            java.lang.String r2 = X.C41847B3o.A1E(r1)
            java.lang.Object r5 = r0.A02
            com.instagram.business.promote.activity.PromoteActivity r5 = (com.instagram.business.promote.activity.PromoteActivity) r5
            com.instagram.business.promote.model.PromoteData r1 = r5.A00
            r9 = 0
            if (r1 != 0) goto L_0x076e
            java.lang.String r0 = "promoteData"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x076e:
            r1.A1A = r2
            X.0eM r1 = r5.A05
            java.lang.Object r8 = r1.getValue()
            X.W1k r8 = (X.C18784W1k) r8
            X.UzE r6 = X.C16678UzE.CAMPAIGN_CONTROLS_BUDGET_DURATION
            r1 = 4553(0x11c9, float:6.38E-42)
            java.lang.String r18 = X.AnonymousClass000.A00(r1)
            java.lang.Object r4 = r0.A01
            android.os.Bundle r4 = (android.os.Bundle) r4
            com.instagram.ui.widget.spinner.SpinnerImageView r0 = r5.A02
            if (r0 == 0) goto L_0x0789
            r9 = r0
        L_0x0789:
            java.lang.String r11 = X.UZX.A0G
            com.instagram.common.session.UserSession r12 = r8.A08
            com.instagram.business.promote.model.PromoteData r0 = r8.A03
            java.lang.String r13 = r0.A1A
            java.lang.String r14 = r0.A1S
            java.lang.String r15 = r0.A1b
            X.WGU r7 = r8.A02
            java.lang.String r1 = r7.A03
            java.lang.String r0 = r0.A1H
            r16 = r1
            r17 = r0
            X.1OC r2 = X.W2V.A04(r12, r13, r14, r15, r16, r17, r18)
            java.lang.String r1 = "/api/v1/"
            r0 = 2583(0xa17, float:3.62E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = X.002.A0R(r1, r0)
            java.lang.String r10 = X.W2x.A01(r0)
            X.UcV r3 = new X.UcV
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            r2.A00 = r3
            X.2lw r0 = r8.A07
            r0.schedule(r2)
            goto L_0x0ccf
        L_0x07c1:
            X.0xY r1 = (X.0xY) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.Rsz r2 = (X.C10484Rsz) r2
            java.lang.String r4 = "fb_page_info"
            X.3mB r3 = r2.A01
            java.lang.Object r2 = r0.A01
            X.TsY r0 = X.C14251TsY.A00
            goto L_0x07fd
        L_0x07d4:
            X.0xY r1 = (X.0xY) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r3 = r0.A02
            X.Rsy r3 = (X.C10483Rsy) r3
            r2 = 1148(0x47c, float:1.609E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r2)
            X.3mB r3 = r3.A01
            java.lang.Object r2 = r0.A01
            X.Wsm r0 = X.C20506Wsm.A00
            goto L_0x07fd
        L_0x07eb:
            X.0xY r1 = (X.0xY) r1
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.Rsx r2 = (X.C10482Rsx) r2
            java.lang.String r4 = "ad_account_info"
            X.3mB r3 = r2.A01
            java.lang.Object r2 = r0.A01
            X.Wsl r0 = X.C20505Wsl.A00
        L_0x07fd:
            java.lang.String r0 = r3.A02(r2, r0)
            r1.E5g(r4, r0)
            goto L_0x0ccf
        L_0x0806:
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r5 = r0.A02
            X.E4G r5 = (X.E4G) r5
            java.lang.Object r2 = r0.A01
            android.view.View r2 = (android.view.View) r2
            r0 = 2131439344(0x7f0b2ef0, float:1.850064E38)
            androidx.recyclerview.widget.RecyclerView r3 = X.DbT.A0I(r2, r0)
            r5.A00 = r3
            if (r3 == 0) goto L_0x0827
            android.content.Context r2 = r5.getContext()
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r0.<init>(r2)
            r3.setLayoutManager(r0)
        L_0x0827:
            java.util.Iterator r4 = r1.iterator()
        L_0x082b:
            boolean r0 = r4.hasNext()
            r3 = 1
            if (r0 == 0) goto L_0x084a
            java.lang.Object r2 = r4.next()
            X.Dvr r2 = (X.C47357Dvr) r2
            java.lang.Boolean r0 = r2.A00
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r3)
            if (r0 == 0) goto L_0x082b
            java.lang.Integer r2 = r2.A01
            if (r2 == 0) goto L_0x082b
            java.util.Set r0 = r5.A09
            r0.add(r2)
            goto L_0x082b
        L_0x084a:
            com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout r2 = r5.A04
            if (r2 == 0) goto L_0x0859
            java.util.Set r0 = r5.A09
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            r2.setPrimaryButtonEnabled(r0)
        L_0x0859:
            X.Dls r2 = new X.Dls
            r2.<init>(r5, r1)
            r5.A01 = r2
            androidx.recyclerview.widget.RecyclerView r0 = r5.A00
            if (r0 == 0) goto L_0x0ccf
            r0.setAdapter(r2)
            goto L_0x0ccf
        L_0x0869:
            int r2 = X.AnonymousClass7TE.A0M(r1)
            java.lang.Object r1 = r0.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.Object r0 = r0.A02
            java.lang.Object r0 = X.C51966G9m.A19(r0, r2)
            java.lang.Object r3 = r1.invoke(r0)
            return r3
        L_0x087c:
            java.lang.Object r3 = r0.A02
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r0.A01
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            java.lang.Object r3 = X.C308206Td.A0E(r3, r2, r0)
            return r3
        L_0x088d:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r3 = r0.A01
            X.6Rx r3 = (X.C307896Rx) r3
            java.lang.Object r2 = r0.A02
            X.4uI r2 = (X.C277014uI) r2
            java.lang.Object[] r0 = new java.lang.Object[]{r1}
            X.C308206Td.A0E(r3, r2, r0)
            goto L_0x0ccf
        L_0x08a2:
            androidx.compose.foundation.lazy.LazyListState r1 = (androidx.compose.foundation.lazy.LazyListState) r1
            r9 = 0
            X.0qQ.A0B(r1, r9)
            java.lang.Object r2 = r0.A02
            X.Ggz r2 = (X.C53008Ggz) r2
            X.6Gl r5 = r1.A02()
            java.lang.Object r0 = r0.A01
            java.lang.Object r0 = X.C51966G9m.A18(r0)
            X.JwF r0 = (X.C61077JwF) r0
            java.lang.Object r0 = r0.A00
            X.GmK r0 = (X.C53334GmK) r0
            X.62P r0 = r0.A0K
            boolean r11 = X.AnonymousClass7TF.A1U(r9, r5, r0)
            X.HpH r10 = r2.A03
            X.I0E r6 = r10.A05
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r0.iterator()
        L_0x08ce:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x08e7
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.5vQ r0 = (X.C299575vQ) r0
            X.JwK r0 = r0.CFL()
            boolean r0 = r0.A01
            if (r0 != 0) goto L_0x08ce
            r3.add(r1)
            goto L_0x08ce
        L_0x08e7:
            r0 = 10
            int r0 = X.0Yv.A1E(r3, r0)
            int r0 = X.AnonymousClass7TG.A01(r0)
            java.util.LinkedHashMap r4 = X.DbS.A0x(r0)
            java.util.Iterator r18 = r3.iterator()
        L_0x08f9:
            boolean r0 = r18.hasNext()
            if (r0 == 0) goto L_0x0a01
            java.lang.Object r1 = r18.next()
            X.5vQ r1 = (X.C299575vQ) r1
            X.0qQ.A0B(r1, r9)
            java.lang.String r2 = "permalink:post-rows:"
            java.lang.String r0 = r1.BK1()
            java.lang.String r8 = X.002.A0R(r2, r0)
            X.HDr r0 = r10.A06
            X.5vJ r2 = r1.Be5()
            java.lang.String r3 = r2.A07
            X.0qQ.A0B(r3, r9)
            X.05G r13 = r0.A07
            java.lang.Object r0 = r13.getValue()
            X.GnG r0 = (X.C53384GnG) r0
            java.util.List r0 = r0.A06
            java.util.Iterator r17 = r0.iterator()
            r7 = 0
        L_0x092c:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x096f
            java.lang.Object r0 = r17.next()
            X.Gl5 r0 = (X.C53257Gl5) r0
            X.GlW r0 = r0.A00
            java.util.List r12 = r0.A05
            java.util.Iterator r16 = r12.iterator()
            r15 = 0
        L_0x0941:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x096a
            java.lang.Object r0 = r16.next()
            X.Gm6 r0 = (X.C53320Gm6) r0
            X.JRG r14 = r0.A02
            java.lang.String r0 = r14.getId()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x0966
            java.lang.String r0 = r14.Bn1()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x0966
            int r15 = r15 + 1
            goto L_0x0941
        L_0x0966:
            if (r15 < 0) goto L_0x096a
            int r7 = r7 + r15
            goto L_0x0970
        L_0x096a:
            int r7 = X.DbT.A01(r12, r7)
            goto L_0x092c
        L_0x096f:
            r7 = -1
        L_0x0970:
            java.lang.Object r0 = r13.getValue()
            X.GnG r0 = (X.C53384GnG) r0
            java.util.List r0 = r0.A06
            java.util.Iterator r16 = r0.iterator()
        L_0x097c:
            boolean r0 = r16.hasNext()
            r26 = 0
            if (r0 == 0) goto L_0x09c4
            java.lang.Object r0 = r16.next()
            X.Gl5 r0 = (X.C53257Gl5) r0
            X.GlW r0 = r0.A00
            java.util.List r12 = r0.A05
            java.util.Iterator r15 = r12.iterator()
            r14 = 0
        L_0x0993:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x097c
            java.lang.Object r0 = r15.next()
            X.Gm6 r0 = (X.C53320Gm6) r0
            X.JRG r13 = r0.A02
            java.lang.String r0 = r13.getId()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x09b8
            java.lang.String r0 = r13.Bn1()
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 != 0) goto L_0x09b8
            int r14 = r14 + 1
            goto L_0x0993
        L_0x09b8:
            if (r14 < 0) goto L_0x097c
            if (r14 != 0) goto L_0x09c4
            int r0 = r12.size()
            if (r0 <= r11) goto L_0x09c4
            r26 = 1
        L_0x09c4:
            java.lang.String r0 = r10.A0E
            X.0qQ.A0K(r0, r3)
            X.0qQ.A0K(r0, r3)
            java.lang.String r22 = r1.BK1()
            java.lang.String r3 = r2.A03
            java.lang.String r2 = r2.A04
            boolean r0 = r1 instanceof X.C304296Cx
            r21 = 0
            if (r0 == 0) goto L_0x09e5
            r0 = r1
            X.6Cx r0 = (X.C304296Cx) r0
            if (r0 == 0) goto L_0x09e5
            boolean r0 = r0.A0B
            java.lang.Integer r21 = X.C51967G9n.A0l(r0)
        L_0x09e5:
            X.JwK r0 = r1.CFL()
            java.lang.Object r1 = r0.A00
            X.N49 r1 = (X.N49) r1
            X.Glf r0 = new X.Glf
            r19 = r0
            r20 = r1
            r23 = r3
            r24 = r2
            r25 = r7
            r19.<init>(r20, r21, r22, r23, r24, r25, r26)
            r4.put(r8, r0)
            goto L_0x08f9
        L_0x0a01:
            X.IPQ r9 = r6.A02
            X.1FE r0 = r6.A03
            long r0 = r0.now()
            r9.A02(r0)
            r8 = r5
            X.6Gk r8 = (X.C305076Gk) r8
            java.util.List r0 = r8.A0D
            java.util.Iterator r10 = r0.iterator()
        L_0x0a15:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x0a5e
            java.lang.Object r7 = r10.next()
            X.6JM r7 = (X.AnonymousClass6JM) r7
            int r2 = r8.A07
            r1 = r7
            X.6JK r1 = (X.AnonymousClass6JK) r1
            int r0 = r1.A02
            int r2 = r2 - r0
            if (r2 <= 0) goto L_0x0a15
            java.lang.Object r0 = r1.A0B
            java.lang.Object r3 = r4.get(r0)
            X.Glf r3 = (X.C53293Glf) r3
            if (r3 == 0) goto L_0x0a15
            X.1E8 r2 = r6.A04
            java.lang.String r0 = r3.A04
            X.1Xj r15 = r2.A02(r0)
            if (r15 == 0) goto L_0x0a15
            java.lang.String r0 = r3.A03
            r11 = r7
            r12 = r5
            r13 = r3
            r14 = r6
            r16 = r0
            X.I0E.A00(r11, r12, r13, r14, r15, r16)
            X.N49 r1 = r3.A01
            if (r1 == 0) goto L_0x0a15
            java.lang.String r0 = r1.A01
            X.1Xj r15 = r2.A02(r0)
            if (r15 == 0) goto L_0x0a15
            java.lang.String r0 = r1.A00
            r16 = r0
            X.I0E.A00(r11, r12, r13, r14, r15, r16)
            goto L_0x0a15
        L_0x0a5e:
            r9.A01()
            goto L_0x0ccf
        L_0x0a63:
            java.lang.Object r2 = r0.A02
            X.Ggz r2 = (X.C53008Ggz) r2
            java.lang.Object r0 = r0.A01
            android.content.Context r5 = X.C51968G9o.A0J(r0)
            X.1Av r0 = r2.A09
            r15 = 1
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "barcelona_ig_has_confirmed_like_as_ig_dialog"
            r1.E5T(r0, r15)
            r1.apply()
            X.ILa r4 = r2.A00
            if (r4 == 0) goto L_0x0ccf
            X.HoC r3 = r2.A05
            X.1E8 r1 = r3.A01
            java.lang.String r0 = r4.A01
            X.1Xj r8 = r1.A02(r0)
            if (r8 == 0) goto L_0x0aa9
            java.lang.String r1 = r4.A05
            if (r1 == 0) goto L_0x0aa9
            X.0sP r0 = r3.A04
            java.lang.Object r0 = r0.invoke(r1)
            int r13 = X.AnonymousClass7TE.A0M(r0)
            java.lang.String r10 = r4.A02
            java.lang.String r11 = r4.A04
            boolean r14 = r4.A06
            com.instagram.common.session.UserSession r6 = r3.A00
            X.4DU r9 = r3.A02
            r7 = 0
            r12 = r7
            X.HVE.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0aa9:
            r0 = 0
            r2.A00 = r0
            goto L_0x0ccf
        L_0x0aae:
            X.JLe r1 = (X.C59480JLe) r1
            r6 = 0
            X.0qQ.A0B(r1, r6)
            java.lang.Object r2 = r0.A02
            X.Ggz r2 = (X.C53008Ggz) r2
            java.lang.Object r8 = r0.A01
            android.content.Context r8 = (android.content.Context) r8
            r5 = 1
            X.0qQ.A0B(r8, r5)
            X.HoC r4 = r2.A05
            boolean r0 = r1 instanceof X.C57008ILa
            if (r0 == 0) goto L_0x0b27
            X.ILa r1 = (X.C57008ILa) r1
            X.1E8 r2 = r4.A01
            java.lang.String r0 = r1.A01
            X.1Xj r11 = r2.A02(r0)
            if (r11 == 0) goto L_0x0ccf
            java.lang.String r2 = r1.A05
            if (r2 == 0) goto L_0x0ccf
            X.0sP r0 = r4.A04
            java.lang.Object r0 = r0.invoke(r2)
            int r16 = X.AnonymousClass7TE.A0M(r0)
            com.instagram.common.session.UserSession r9 = r4.A00
            X.0Tu r0 = X.0Tu.A05
            r2 = 36322796120320423(0x810b64000029a7, double:3.034020754426399E-306)
            boolean r0 = X.182.A06(r0, r9, r2)
            if (r0 != 0) goto L_0x0b09
            X.0sa r0 = r4.A03
            r0.invoke()
            X.3Yl r10 = X.C243363Yl.LIKED
            X.4DU r12 = r4.A02
            r7 = 0
            java.lang.Integer r15 = X.AnonymousClass05K.A00
            r17 = -1
            r8 = r7
            r13 = r7
            r14 = r7
            r18 = r17
            r19 = r6
            X.C56622I4z.A02(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0ccf
        L_0x0b09:
            X.0sP r0 = r4.A05
            boolean r0 = X.C51971G9r.A1a(r1, r0)
            if (r0 != 0) goto L_0x0ccf
            java.lang.String r3 = r1.A02
            java.lang.String r2 = r1.A04
            boolean r1 = r1.A06
            X.4DU r0 = r4.A02
            r10 = 0
            r12 = r0
            r13 = r3
            r14 = r2
            r15 = r10
            r17 = r1
            r18 = r5
            X.HVE.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            goto L_0x0ccf
        L_0x0b27:
            X.0sa r0 = r4.A03
        L_0x0b29:
            r0.invoke()
            goto L_0x0ccf
        L_0x0b2e:
            java.lang.Object r3 = r0.A02
            r1 = 3
            X.IHG r2 = new X.IHG
            r2.<init>(r3, r1)
            java.lang.Object r1 = r0.A01
            X.07Z r1 = (X.AnonymousClass07Z) r1
            X.07V r0 = r1.getLifecycle()
            r0.A09(r2)
            r0 = 14
            X.GOz r3 = new X.GOz
            r3.<init>((X.AnonymousClass0hF) r2, (X.AnonymousClass07Z) r1, (int) r0)
            return r3
        L_0x0b49:
            X.5Q4 r1 = (X.AnonymousClass5Q4) r1
            X.C51970G9q.A15(r1)
            java.lang.Object r6 = r0.A02
            X.Hn3 r6 = (X.C55768Hn3) r6
            java.lang.Object r14 = r0.A01
            X.2DO r14 = (X.AnonymousClass2DO) r14
            X.2Ha r0 = X.I42.A03
            java.lang.Comparable r0 = r0.B1S()
            X.5d0 r0 = (X.C289095d0) r0
            float r12 = r0.A00
            float r0 = r1.F06(r12)
            long r22 = X.C288015bE.A00(r0, r0)
            X.5Oz r0 = r6.A03
            java.lang.Object r0 = r0.getValue()
            java.util.Iterator r17 = X.C51966G9m.A1H(r0)
        L_0x0b72:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x0ccf
            java.lang.Object r9 = r17.next()
            X.Hoi r9 = (X.C55861Hoi) r9
            X.5PZ r0 = r6.A01
            float r8 = r0.B6X()
            float r0 = r9.A04
            float r8 = r8 - r0
            r0 = 1065353216(0x3f800000, float:1.0)
            float r8 = r8 / r0
            float r2 = r9.A05
            float r0 = r9.A00
            float r0 = r0 * r8
            float r2 = r2 + r0
            float r5 = r1.F06(r2)
            float r2 = r9.A06
            X.2Ha r0 = X.I42.A04
            float r0 = X.I42.A01(r0, r8)
            float r2 = r2 + r0
            float r4 = r1.F06(r2)
            X.5QD r10 = r1.Ayw()
            r7 = r10
            X.5QC r7 = (X.AnonymousClass5QC) r7
            X.5Q5 r0 = r7.A02
            X.5QB r11 = r0.A02
            long r2 = X.C51967G9n.A05(r11)
            X.5QF r7 = r7.A01     // Catch:{ all -> 0x0bf8 }
            r7.FHv(r5, r4)     // Catch:{ all -> 0x0bf8 }
            float r0 = r9.A03     // Catch:{ all -> 0x0bf8 }
            float r0 = r0 / r12
            double r4 = (double) r8     // Catch:{ all -> 0x0bf8 }
            r15 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r4 = r4 * r15
            double r4 = java.lang.Math.sin(r4)     // Catch:{ all -> 0x0bf8 }
            float r13 = (float) r4     // Catch:{ all -> 0x0bf8 }
            float r0 = r0 * r13
            r4 = 0
            r7.EKJ(r4, r0, r0)     // Catch:{ all -> 0x0bf8 }
            float r13 = r9.A01     // Catch:{ all -> 0x0bf8 }
            float r0 = r9.A02     // Catch:{ all -> 0x0bf8 }
            float r0 = r0 * r8
            float r13 = r13 + r0
            r7.EJR(r4, r13)     // Catch:{ all -> 0x0bf8 }
            float r0 = X.C288025bF.A02(r22)     // Catch:{ all -> 0x0bf8 }
            float r5 = -r0
            r4 = 1056964608(0x3f000000, float:0.5)
            float r5 = r5 * r4
            float r0 = X.C288025bF.A00(r22)     // Catch:{ all -> 0x0bf8 }
            float r0 = -r0
            float r0 = r0 * r4
            r7.FHv(r5, r0)     // Catch:{ all -> 0x0bf8 }
            long r4 = r9.A07     // Catch:{ all -> 0x0bf8 }
            X.5bV r19 = X.C51968G9o.A0R(r4)     // Catch:{ all -> 0x0bf8 }
            r21 = 1065353216(0x3f800000, float:1.0)
            r18 = r14
            r20 = r1
            r18.A01(r19, r20, r21, r22)     // Catch:{ all -> 0x0bf8 }
            X.C51968G9o.A1G(r11, r10, r2)
            goto L_0x0b72
        L_0x0bf8:
            r0 = move-exception
            X.C51968G9o.A1G(r11, r10, r2)
            throw r0
        L_0x0bfd:
            X.5RU r5 = X.C51968G9o.A0S(r1)
            java.lang.Object r4 = r0.A02
            X.HoP r4 = (X.C55842HoP) r4
            X.5b4 r1 = r4.A01
            float r3 = X.C51975G9x.A00(r1)
            java.lang.Object r2 = r0.A01
            X.6DR r2 = (X.AnonymousClass6DR) r2
            float r0 = r2.A01
            long r0 = r5.FH9(r0)
            float r0 = X.AnonymousClass5Z5.A00(r0)
            r5.EpG(r0)
            float r0 = r2.A02
            long r0 = r5.FH9(r0)
            float r0 = X.AnonymousClass5Z5.A00(r0)
            r5.EpH(r0)
            r5.EjG(r3)
            r5.EjH(r3)
            X.5b4 r0 = r4.A00
            float r0 = X.C51975G9x.A00(r0)
            r5.EOX(r0)
            goto L_0x0ccf
        L_0x0c3a:
            X.5Q3 r1 = X.C51968G9o.A0T(r1)
            java.lang.Object r0 = r0.A01
            X.Hqp r0 = (X.C55984Hqp) r0
            X.Gey r2 = r0.A00(r1)
            r0 = 1082130432(0x40800000, float:4.0)
            float r0 = r1.F06(r0)
            r3 = 0
            long r11 = X.AnonymousClass6GR.A00(r0, r0)
            r7 = 0
            long r9 = X.C51968G9o.A0H(r1)
            r5 = 1065353216(0x3f800000, float:1.0)
            X.5dw r4 = X.C289635dw.A00
            r6 = 3
            r1.AQu(r2, r3, r4, r5, r6, r7, r9, r11)
            goto L_0x0ccf
        L_0x0c60:
            X.I11 r1 = (X.I11) r1
            r4 = 0
            X.0qQ.A0B(r1, r4)
            java.lang.Object r3 = r0.A02
            X.62P r3 = (X.AnonymousClass62P) r3
            X.J1E r6 = X.J1E.A00
            X.J1F r7 = X.J1F.A00
            java.lang.Object r0 = r0.A01
            X.JK3 r2 = new X.JK3
            r2.<init>(r0, r4)
            r0 = -593052816(0xffffffffdca6bb70, float:-3.75447487E17)
            X.5PJ r8 = X.AnonymousClass5PI.A03(r2, r0)
            r0 = 3254(0xcb6, float:4.56E-42)
            java.lang.String r5 = X.C273654mx.A00(r0)
            r4 = r1
            r9 = r3
            r4.A02(r5, r6, r7, r8, r9)
            goto L_0x0ccf
        L_0x0c88:
            java.lang.Object r2 = r0.A01
            X.0sP r2 = (X.0sP) r2
            if (r2 == 0) goto L_0x0c92
            r1 = 1
            X.C51968G9o.A1O(r2, r1)
        L_0x0c92:
            java.lang.Object r1 = r0.A02
            r0 = 13
            X.GOz r3 = new X.GOz
            r3.<init>((int) r0, (java.lang.Object) r1, (java.lang.Object) r2)
            return r3
        L_0x0c9c:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r0.A01
            X.5vK r0 = (X.C299515vK) r0
            X.6D5 r0 = (X.AnonymousClass6D5) r0
            java.lang.String r0 = r0.A03
            goto L_0x0ccc
        L_0x0cad:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r0.A01
            X.5vK r0 = (X.C299515vK) r0
            X.6D3 r0 = (X.AnonymousClass6D3) r0
            java.lang.String r0 = r0.A05
            goto L_0x0ccc
        L_0x0cbe:
            r2 = 0
            X.0qQ.A0B(r1, r2)
            java.lang.Object r2 = r0.A02
            X.0sL r2 = (X.0sL) r2
            java.lang.Object r0 = r0.A01
            X.GmJ r0 = (X.C53333GmJ) r0
            java.lang.String r0 = r0.A0F
        L_0x0ccc:
            r2.invoke(r0, r1)
        L_0x0ccf:
            X.0gF r3 = X.C60340gF.A00
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59101J6j.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59101J6j(int i, Object obj, Object obj2) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59101J6j(Context context, C53008Ggz ggz, int i) {
        super(1);
        this.A00 = i;
        this.A02 = ggz;
        this.A01 = context;
    }
}
