package X;

import com.instagram.api.schemas.CommentGiphyMediaInfoIntf;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.model.mediasize.VideoVersionIntf;
import java.util.List;

/* renamed from: X.GgM  reason: case insensitive filesystem */
public final class C52969GgM extends C361478gI {
    public final long A00 = System.currentTimeMillis();
    public final long A01;
    public final long A02;
    public final C55893HpE A03;
    public final UserSession A04;
    public final 1E8 A05;
    public final AnonymousClass4DU A06;
    public final String A07;
    public final String A08;
    public final String A09 = AnonymousClass7TG.A0j();
    public final AnonymousClass0Ud A0A;
    public final C63760L5s A0B;
    public final 05G A0C;

    public static JV7 A00(C52969GgM ggM, 1Xj r6) {
        JSO CGF;
        if (r6.A6N()) {
            if (182.A06(0Tu.A05, ggM.A04, 36330273658389035L) && (CGF = r6.A0C.CGF()) != null) {
                return new JV7(new SimpleImageUrl(CGF.getAttributionTopIconUrl()), CGF.getAttributionTitle(), CGF.getAttributionCtaActionUrl());
            }
        }
        return null;
    }

    private final JQB A01(1Xj r11, 1Xj r12) {
        List Al9;
        String B9F;
        int A0y;
        int A0x;
        VideoVersionIntf videoVersionIntf;
        if (!(r11 == null || r12 == null)) {
            if (r11.A50()) {
                List CEY = r11.A0C.CEY();
                if (CEY == null || (videoVersionIntf = (VideoVersionIntf) 00k.A0J(CEY)) == null || videoVersionIntf.CGY() == null || videoVersionIntf.BCu() == null) {
                    A0y = r11.A0y();
                    A0x = r11.A0x();
                } else {
                    Integer CGY = videoVersionIntf.CGY();
                    if (CGY != null) {
                        A0y = CGY.intValue();
                        Integer BCu = videoVersionIntf.BCu();
                        if (BCu != null) {
                            A0x = BCu.intValue();
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                String id = r11.getId();
                if (id != null) {
                    String AXm = r11.A0C.AXm();
                    return new C53472Gp4(A00(this, r11), r11.CEL(), id, AXm, A0y, A0x);
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            GifUrlImpl A1o = r11.A1o();
            if (A1o != null) {
                Integer A2N = r11.A2N();
                if (A2N != null) {
                    int intValue = A2N.intValue();
                    Integer A2O = r11.A2O();
                    if (A2O != null) {
                        int intValue2 = A2O.intValue();
                        CommentGiphyMediaInfoIntf B9K = r11.A0C.B9K();
                        if (!(B9K == null || (B9F = B9K.B9F()) == null)) {
                            if (intValue2 > 0 && intValue > 0) {
                                String id2 = r11.getId();
                                if (id2 != null) {
                                    return new C53471Gp3(A1o, id2, r11.A0C.AXm(), B9F, intValue2, intValue);
                                }
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        }
                    }
                }
            }
            ImageInfo A1p = r11.A1p();
            if (!(A1p == null || (Al9 = A1p.Al9()) == null)) {
                String id3 = r11.getId();
                if (id3 != null) {
                    int A0y2 = r11.A0y();
                    int A0x2 = r11.A0x();
                    return new C53472Gp4(A00(this, r11), id3, r11.A0C.AXm(), AnonymousClass62Q.A00(Al9), A0y2, A0x2);
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        return null;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C52969GgM(android.app.Application r25, com.instagram.common.session.UserSession r26, X.AnonymousClass4DU r27, java.lang.String r28, java.lang.String r29) {
        /*
            r24 = this;
            r2 = r26
            r5 = r27
            r4 = r28
            r6 = r29
            X.C51974G9v.A1P(r2, r5, r4, r6)
            r0 = 5
            r1 = r25
            X.0qQ.A0B(r1, r0)
            r3 = r24
            r3.<init>(r1)
            r3.A04 = r2
            r3.A06 = r5
            r3.A07 = r4
            r3.A08 = r6
            r8 = 0
            X.62M r11 = X.AnonymousClass62M.A01
            r12 = 0
            X.Gmp r7 = new X.Gmp
            r9 = r8
            r10 = r8
            r13 = r12
            r14 = r12
            r15 = r12
            r16 = r12
            r17 = r12
            r18 = r12
            r19 = r12
            r20 = r12
            r21 = r12
            r22 = r12
            r23 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            X.02z r1 = X.DbS.A10(r7)
            r3.A0C = r1
            X.1E8 r0 = X.1E7.A00(r2)
            r3.A05 = r0
            r3.A0A = r1
            long r0 = java.lang.System.currentTimeMillis()
            r3.A00 = r0
            java.lang.String r0 = X.AnonymousClass7TG.A0j()
            r3.A09 = r0
            java.lang.String r1 = X.C51965G9l.A0u(r4)
            int r0 = r1.length()
            boolean r0 = X.AnonymousClass7TF.A1Q(r0)
            java.lang.String r4 = "0"
            if (r0 == 0) goto L_0x0067
            r1 = r4
        L_0x0067:
            long r0 = java.lang.Long.parseLong(r1)
            r3.A01 = r0
            java.lang.String r1 = X.1Xv.A06(r6)
            int r0 = r1.length()
            if (r0 == 0) goto L_0x0078
            r4 = r1
        L_0x0078:
            long r0 = java.lang.Long.parseLong(r4)
            r3.A02 = r0
            X.L5s r4 = new X.L5s
            r4.<init>(r2)
            r3.A0B = r4
            java.lang.String r14 = r5.getModuleName()
            java.lang.Integer r13 = X.AnonymousClass05K.A15
            X.6oS r17 = X.C318116oQ.A00(r3)
            r0 = 40
            X.J6h r1 = new X.J6h
            r1.<init>(r3, r0)
            X.J0m r16 = X.C58949J0m.A00
            X.HpE r0 = new X.HpE
            r9 = r0
            r10 = r4
            r11 = r2
            r12 = r5
            r15 = r1
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17)
            r3.A03 = r0
            X.1E8 r1 = r3.A05
            java.lang.String r0 = r3.A07
            X.1Xj r0 = r1.A02(r0)
            A03(r3, r0)
            X.1Ng r0 = X.AnonymousClass1Nd.A00(r2)
            X.64X r1 = new X.64X
            r1.<init>(r0)
            java.lang.Class<X.1qJ> r0 = X.1qJ.class
            X.032 r2 = r1.A00(r0)
            r1 = 23
            X.JVD r0 = new X.JVD
            r0.<init>(r3, r8, r1)
            X.DbY.A19(r3, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52969GgM.<init>(android.app.Application, com.instagram.common.session.UserSession, X.4DU, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.lang.String A02() {
        /*
            r4 = this;
            X.1E8 r1 = r4.A05
            java.lang.String r0 = r4.A07
            X.1Xj r1 = r1.A02(r0)
            r0 = 0
            if (r1 == 0) goto L_0x003e
            X.4oA r3 = X.C51966G9m.A0x(r1)
            if (r3 == 0) goto L_0x003f
            X.1Xj r2 = r3.BN0()
            if (r2 == 0) goto L_0x001f
            java.lang.String r1 = r4.A08
            X.1Xj r1 = r2.A1f(r1)
            if (r1 != 0) goto L_0x0031
        L_0x001f:
            X.1Xj r1 = r3.BN0()
            if (r1 == 0) goto L_0x003f
            java.lang.String r2 = r1.getId()
        L_0x0029:
            java.lang.String r1 = r4.A08
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x003d
        L_0x0031:
            X.1Xj r1 = r3.BN0()
            if (r1 == 0) goto L_0x003d
            X.1Xy r0 = r1.A0C
            java.lang.String r0 = r0.Bbe()
        L_0x003d:
            return r0
        L_0x003e:
            r3 = r0
        L_0x003f:
            r2 = r0
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52969GgM.A02():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:130:0x021f, code lost:
        if (r11 == null) goto L_0x0222;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00eb, code lost:
        if (r3.A0N() != X.AnonymousClass05K.A0C) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x017b, code lost:
        if (r11 == null) goto L_0x017e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x01ec  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x01f8  */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0210  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x016c  */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x016e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A03(X.C52969GgM r28, X.1Xj r29) {
        /*
            r1 = r28
            r0 = r29
            if (r29 == 0) goto L_0x0056
            com.instagram.common.session.UserSession r2 = r1.A04
            boolean r23 = X.C51968G9o.A1X(r2, r0)
        L_0x000c:
            r6 = r0
            r3 = 0
            if (r29 == 0) goto L_0x002e
            X.4oA r5 = X.C51966G9m.A0x(r0)
            if (r5 == 0) goto L_0x004d
            X.1Xj r4 = r5.BN0()
            if (r4 == 0) goto L_0x004d
            java.lang.String r2 = r1.A08
            X.1Xj r2 = r4.A1f(r2)
            if (r2 == 0) goto L_0x004d
            X.1Xj r6 = r5.BN0()
            if (r6 == 0) goto L_0x002e
        L_0x002a:
            java.util.List r3 = X.C51966G9m.A1I(r6)
        L_0x002e:
            r12 = 0
            if (r3 == 0) goto L_0x0059
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r3.iterator()
        L_0x0039:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x005a
            X.1Xj r2 = X.C51966G9m.A0t(r3)
            X.JQB r2 = r1.A01(r2, r0)
            if (r2 == 0) goto L_0x0039
            r5.add(r2)
            goto L_0x0039
        L_0x004d:
            java.lang.String r2 = r1.A08
            X.1Xj r2 = r0.A1f(r2)
            if (r2 == 0) goto L_0x002e
            goto L_0x002a
        L_0x0056:
            r23 = 0
            goto L_0x000c
        L_0x0059:
            r5 = r12
        L_0x005a:
            java.lang.String r7 = r1.A08
            r6 = -1
            if (r5 == 0) goto L_0x007b
            r4 = 0
            java.util.Iterator r3 = r5.iterator()
        L_0x0064:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x007b
            java.lang.Object r2 = r3.next()
            X.JQB r2 = (X.JQB) r2
            java.lang.String r2 = r2.getId()
            boolean r2 = X.0qQ.A0K(r2, r7)
            if (r2 == 0) goto L_0x0234
            r6 = r4
        L_0x007b:
            r4 = 0
            if (r6 >= r4) goto L_0x007f
            r6 = 0
        L_0x007f:
            if (r29 == 0) goto L_0x0230
            X.4oA r11 = X.C51966G9m.A0x(r0)
            if (r11 == 0) goto L_0x0231
            java.lang.Integer r2 = r11.Biy()
            if (r2 == 0) goto L_0x0231
            int r2 = r2.intValue()
        L_0x0091:
            int r21 = java.lang.Math.max(r2, r4)
            if (r11 == 0) goto L_0x022d
            java.lang.Integer r2 = r11.Bmv()
            if (r2 == 0) goto L_0x022d
            int r2 = r2.intValue()
        L_0x00a1:
            int r2 = java.lang.Math.max(r2, r4)
            int r21 = r21 + r2
            com.instagram.common.session.UserSession r9 = r1.A04
            X.0Tu r8 = X.0Tu.A05
            r2 = 36328370988072229(0x81107600033d25, double:3.037546323240832E-306)
            boolean r2 = X.182.A06(r8, r9, r2)
            r22 = 0
            if (r2 == 0) goto L_0x00c2
            if (r11 == 0) goto L_0x00c2
            java.lang.Integer r2 = r11.BnU()
            int r22 = X.C51967G9n.A04(r2, r4)
        L_0x00c2:
            if (r29 == 0) goto L_0x0228
            boolean r28 = X.C243353Yk.A00(r9, r0)
            com.instagram.user.model.User r8 = r0.A2A(r9)
        L_0x00cc:
            com.instagram.user.model.User r3 = X.DbT.A0j(r9)
            r10 = 1
            if (r8 == 0) goto L_0x00ed
            java.lang.String r2 = r8.getId()
            boolean r2 = X.DbV.A1Z(r3, r2)
            if (r2 != 0) goto L_0x00ed
            boolean r2 = r8.A2A()
            if (r2 != 0) goto L_0x00ed
            java.lang.Integer r3 = r3.A0N()
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            r29 = 1
            if (r3 == r2) goto L_0x00ef
        L_0x00ed:
            r29 = 0
        L_0x00ef:
            if (r5 == 0) goto L_0x0184
            X.05G r9 = r1.A0C
        L_0x00f3:
            java.lang.Object r8 = r9.getValue()
            X.62P r7 = X.AnonymousClass62Q.A00(r5)
            java.lang.String r15 = r1.A02()
            if (r0 == 0) goto L_0x0181
            int r19 = r0.A0v()
        L_0x0105:
            if (r11 == 0) goto L_0x0171
            java.lang.Integer r2 = r11.AxC()
            if (r2 == 0) goto L_0x0171
            int r20 = r2.intValue()
        L_0x0111:
            java.lang.Boolean r2 = r11.AkR()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r10)
            boolean r24 = X.0qQ.A0K(r2, r3)
            java.lang.Boolean r2 = r11.AkK()
            boolean r25 = X.0qQ.A0K(r2, r3)
            X.4o8 r2 = r11.BtE()
            if (r2 == 0) goto L_0x0179
            java.lang.Boolean r2 = r2.AkS()
            boolean r26 = X.0qQ.A0K(r2, r3)
        L_0x0133:
            X.4o8 r2 = r11.BtE()
            if (r2 == 0) goto L_0x017e
            java.lang.Boolean r2 = r2.AkM()
            boolean r27 = X.AnonymousClass7TF.A1Y(r2, r10)
        L_0x0141:
            if (r0 == 0) goto L_0x016e
            com.instagram.user.model.User r2 = X.C51966G9m.A11(r0)
            if (r2 == 0) goto L_0x016e
            java.lang.String r16 = r2.getUsername()
        L_0x014d:
            if (r11 == 0) goto L_0x016c
            X.4o8 r2 = r11.BtE()
            if (r2 == 0) goto L_0x016c
            com.instagram.api.schemas.RepostRestrictedReason r14 = r2.Bmz()
        L_0x0159:
            X.0qQ.A0B(r7, r4)
            X.Gmp r13 = new X.Gmp
            r17 = r7
            r18 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r2 = r9.AIY(r8, r13)
            if (r2 == 0) goto L_0x00f3
        L_0x016b:
            return
        L_0x016c:
            r14 = r12
            goto L_0x0159
        L_0x016e:
            r16 = r12
            goto L_0x014d
        L_0x0171:
            r20 = 0
            if (r11 != 0) goto L_0x0111
            r24 = 0
            r25 = 0
        L_0x0179:
            r26 = 0
            if (r11 == 0) goto L_0x017e
            goto L_0x0133
        L_0x017e:
            r27 = 0
            goto L_0x0141
        L_0x0181:
            r19 = 0
            goto L_0x0105
        L_0x0184:
            X.1E8 r2 = r1.A05
            X.1Xj r2 = r2.A02(r7)
            X.JQB r8 = r1.A01(r2, r0)
            if (r8 == 0) goto L_0x016b
            X.05G r7 = r1.A0C
        L_0x0192:
            java.lang.Object r6 = r7.getValue()
            X.JQB[] r2 = new X.JQB[]{r8}
            X.62O r3 = X.AnonymousClass62Q.A04(r2)
            java.lang.String r15 = r1.A02()
            if (r0 == 0) goto L_0x0225
            int r19 = r0.A0v()
        L_0x01a8:
            if (r11 == 0) goto L_0x0215
            java.lang.Integer r2 = r11.AxC()
            if (r2 == 0) goto L_0x0215
            int r20 = r2.intValue()
        L_0x01b4:
            java.lang.Boolean r2 = r11.AkR()
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)
            boolean r24 = X.0qQ.A0K(r2, r5)
            java.lang.Boolean r2 = r11.AkK()
            boolean r25 = X.0qQ.A0K(r2, r5)
            X.4o8 r2 = r11.BtE()
            if (r2 == 0) goto L_0x021d
            java.lang.Boolean r2 = r2.AkS()
            boolean r26 = X.0qQ.A0K(r2, r5)
        L_0x01d6:
            X.4o8 r2 = r11.BtE()
            if (r2 == 0) goto L_0x0222
            java.lang.Boolean r2 = r2.AkM()
            boolean r27 = X.AnonymousClass7TF.A1Y(r2, r10)
        L_0x01e4:
            if (r0 == 0) goto L_0x0212
            com.instagram.user.model.User r2 = X.C51966G9m.A11(r0)
            if (r2 == 0) goto L_0x0212
            java.lang.String r16 = r2.getUsername()
        L_0x01f0:
            if (r11 == 0) goto L_0x0210
            X.4o8 r2 = r11.BtE()
            if (r2 == 0) goto L_0x0210
            com.instagram.api.schemas.RepostRestrictedReason r14 = r2.Bmz()
        L_0x01fc:
            X.0qQ.A0B(r3, r4)
            X.Gmp r2 = new X.Gmp
            r13 = r2
            r17 = r3
            r18 = r4
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            boolean r2 = r7.AIY(r6, r2)
            if (r2 == 0) goto L_0x0192
            return
        L_0x0210:
            r14 = r12
            goto L_0x01fc
        L_0x0212:
            r16 = r12
            goto L_0x01f0
        L_0x0215:
            r20 = 0
            if (r11 != 0) goto L_0x01b4
            r24 = 0
            r25 = 0
        L_0x021d:
            r26 = 0
            if (r11 == 0) goto L_0x0222
            goto L_0x01d6
        L_0x0222:
            r27 = 0
            goto L_0x01e4
        L_0x0225:
            r19 = 0
            goto L_0x01a8
        L_0x0228:
            r28 = 0
            r8 = r12
            goto L_0x00cc
        L_0x022d:
            r2 = 0
            goto L_0x00a1
        L_0x0230:
            r11 = r12
        L_0x0231:
            r2 = 0
            goto L_0x0091
        L_0x0234:
            int r4 = r4 + 1
            goto L_0x0064
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52969GgM.A03(X.GgM, X.1Xj):void");
    }

    public final String A0E(int i) {
        AnonymousClass0Ud r2 = this.A0A;
        if (((C53365Gmp) r2.getValue()).A08.size() <= i) {
            return null;
        }
        JQB jqb = (JQB) ((C53365Gmp) r2.getValue()).A08.get(i);
        if (C53472Gp4.A00(0, jqb)) {
            return ((C53472Gp4) jqb).A06;
        }
        if (C53472Gp4.A00(1, jqb)) {
            1Xj A022 = this.A05.A02(this.A07);
            if (A022 == null || !I0L.A00.A00(A022)) {
                return null;
            }
            if (182.A06(0Tu.A05, this.A04, 36327696678140541L)) {
                return ((C53472Gp4) jqb).A06;
            }
            return null;
        } else if (jqb instanceof C53471Gp3) {
            return null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }
}
