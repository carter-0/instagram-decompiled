package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.GwO  reason: case insensitive filesystem */
public final class C53918GwO extends C251343mx {
    public static final HashMap A03 = AnonymousClass7TE.A1E();
    public static final HashSet A04 = AnonymousClass7TE.A1F();
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C267324bN A02;

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0226, code lost:
        if (r0.isEmpty() != false) goto L_0x0228;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0380, code lost:
        if (r12.contains(r46.A03) != true) goto L_0x0382;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x04cf, code lost:
        if (r11 != null) goto L_0x0038;
     */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0543  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x054d  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0667  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x066d  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0169  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01c0  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0306  */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x04c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r72) {
        /*
            r71 = this;
            r3 = 0
            r4 = r72
            X.0qQ.A0B(r4, r3)
            r70 = r71
            r0 = r70
            X.4bN r0 = r0.A02
            X.Cw7 r11 = r0.A04()
            if (r11 == 0) goto L_0x04d7
            java.util.List r0 = r11.A09
            if (r0 == 0) goto L_0x04d7
            java.lang.Object r0 = X.00k.A0O(r0, r3)
            X.Cvd r0 = (X.C45397Cvd) r0
            if (r0 == 0) goto L_0x04d7
            java.lang.String r8 = r0.A02
        L_0x0020:
            java.lang.String r25 = ""
            if (r8 != 0) goto L_0x0026
            r8 = r25
        L_0x0026:
            if (r11 == 0) goto L_0x04cd
            java.util.List r0 = r11.A09
            if (r0 == 0) goto L_0x04cd
            java.lang.Object r0 = X.00k.A0O(r0, r3)
            X.Cvd r0 = (X.C45397Cvd) r0
            if (r0 == 0) goto L_0x04cd
            java.lang.String r0 = r0.A03
            r26 = r0
        L_0x0038:
            java.util.List r0 = r11.A09
            if (r0 == 0) goto L_0x04d3
            java.lang.Object r0 = X.00k.A0O(r0, r3)
            X.Cvd r0 = (X.C45397Cvd) r0
            if (r0 == 0) goto L_0x04d3
            java.lang.String r0 = r0.A01
            r66 = r0
        L_0x0048:
            X.0rm r27 = X.C51965G9l.A11()
            java.util.HashMap r2 = A03
            r0 = r66
            java.lang.Object r1 = r2.get(r0)
            r0 = r27
            r0.A00 = r1
            if (r1 != 0) goto L_0x0065
            java.util.HashSet r1 = X.AnonymousClass7TE.A1F()
            r0.A00 = r1
            r0 = r66
            r2.put(r0, r1)
        L_0x0065:
            r32 = 8
            r1 = r27
            r0 = r32
            X.2Wa r24 = X.C58705IwE.A00(r4, r1, r0)
            X.IuM r0 = X.C58589IuM.A00
            X.2Wa r61 = X.C243643Zq.A00(r4, r0)
            if (r11 == 0) goto L_0x04c9
            java.util.List r0 = r11.A09
            if (r0 == 0) goto L_0x04c9
            java.lang.Object r0 = X.00k.A0O(r0, r3)
            X.Cvd r0 = (X.C45397Cvd) r0
            if (r0 == 0) goto L_0x04c9
            java.util.List r0 = r0.A04
            r41 = r0
        L_0x0087:
            r0 = r70
            com.instagram.common.session.UserSession r1 = r0.A00
            X.4DU r0 = r0.A01
            r69 = r0
            int r23 = X.DbW.A02(r3, r1, r0)
            if (r11 == 0) goto L_0x00b8
            r0 = 751(0x2ef, float:1.052E-42)
            java.lang.String r2 = X.C273654mx.A00(r0)
            java.lang.String r0 = "instagram_ad_"
            java.lang.String r2 = X.002.A0R(r0, r2)
            r0 = r69
            X.3sc r2 = X.C51965G9l.A0n(r0, r2)
            java.lang.String r0 = r11.A06
            r2.A78 = r0
            java.lang.String r0 = r11.A08
            r2.A7J = r0
            java.lang.String r0 = "in_feed_survey"
            r2.A79 = r0
            r0 = r69
            X.C233822wX.A0H(r1, r2, r0)
        L_0x00b8:
            r0 = 2131165317(0x7f070085, float:1.7944848E38)
            long r0 = X.C244013aV.A0C(r4, r0)
            X.2V1 r2 = r4.A05
            r68 = r2
            android.content.Context r2 = r2.A0C
            r22 = r2
            if (r2 == 0) goto L_0x00d5
            int r5 = r8.length()
            r2 = 125(0x7d, float:1.75E-43)
            if (r5 <= r2) goto L_0x00d5
            long r0 = X.C244013aV.A04(r4)
        L_0x00d5:
            X.3XV r2 = X.2WX.A02
            java.lang.Integer r28 = X.AnonymousClass05K.A0N
            r2 = r28
            X.9JS r5 = X.C51965G9l.A0d(r2, r8, r3)
            r2 = 0
            X.2WX r10 = X.C51965G9l.A0X(r2, r5)
            r5 = r22
            int r12 = X.C51972G9s.A09(r5, r4)
            android.graphics.Typeface r21 = android.graphics.Typeface.DEFAULT
            long r5 = X.C51969G9p.A0D()
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r9 = r68
            X.3ae r9 = X.C51971G9r.A0b(r9, r2, r8, r3)
            X.C51973G9u.A16(r4, r9, r12, r0)
            r9.A0R(r3)
            r0 = r21
            X.G9w.A11(r0, r4, r9, r5)
            X.C51970G9q.A1J(r9, r7)
            r20 = 1065353216(0x3f800000, float:1.0)
            r0 = r20
            X.C51970G9q.A1I(r9, r0, r3)
            r8 = 5
            r9.A0M(r8)
            r16 = 1
            X.C51974G9v.A0z(r10, r9, r3)
            X.2WW r19 = r9.A0A()
            X.3b9 r33 = X.C244413b9.ABSOLUTE
            java.lang.Integer r34 = X.AnonymousClass05K.A0Y
            r35 = 3
            r9 = r34
            r1 = r33
            r0 = r35
            X.2WX r0 = X.C51971G9r.A0Y(r2, r9, r1, r0)
            long r9 = X.C51970G9q.A0G()
            X.2WX r0 = X.AnonymousClass9JR.A00(r0, r7, r3, r9)
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            r1 = r17
            X.2WX r1 = X.AnonymousClass9JR.A00(r0, r1, r3, r9)
            X.3Zh r12 = X.C243573Zh.CENTER
            r0 = r35
            X.2WX r14 = X.C51971G9r.A0Y(r1, r7, r12, r0)
            r36 = 2131165228(0x7f07002c, float:1.7944667E38)
            r0 = r36
            long r0 = X.C244013aV.A0C(r4, r0)
            java.lang.Integer r40 = X.AnonymousClass05K.A07
            r13 = r40
            X.2WX r13 = X.AnonymousClass9JR.A00(r14, r13, r3, r0)
            r0 = 2131238114(0x7f081ce2, float:1.8092498E38)
            android.graphics.drawable.Drawable r1 = X.C51968G9o.A0K(r4, r0)
            java.util.HashSet r42 = A04
            r14 = r42
            r0 = r66
            boolean r14 = r14.contains(r0)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            if (r14 == 0) goto L_0x016c
            r0 = 2131100275(0x7f060273, float:1.7812927E38)
        L_0x016c:
            X.C51973G9u.A0x(r1, r4, r0)
            r0 = r68
            X.3gE r43 = X.C51974G9v.A0P(r1, r0, r13)
            r13 = r34
            r1 = r33
            r0 = r35
            X.2WX r0 = X.C51971G9r.A0Y(r2, r13, r1, r0)
            X.2WX r1 = X.AnonymousClass9JR.A00(r0, r7, r3, r9)
            r0 = r17
            X.9JR r13 = X.C51965G9l.A0c(r0, r3, r9)
            r0 = r35
            X.2WX r12 = X.C51973G9u.A0T(r1, r13, r7, r12, r0)
            r1 = r40
            r0 = r36
            X.2WX r12 = X.C51973G9u.A0W(r12, r4, r1, r0, r3)
            r0 = 2131238108(0x7f081cdc, float:1.8092485E38)
            android.graphics.drawable.Drawable r1 = X.C51968G9o.A0K(r4, r0)
            r18 = 2131099843(0x7f0600c3, float:1.781205E38)
            r0 = r18
            X.C51973G9u.A0x(r1, r4, r0)
            r0 = r68
            X.3gE r54 = X.C51974G9v.A0P(r1, r0, r12)
            java.lang.String r1 = "multiple"
            r0 = r26
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x04c5
            r1 = r42
            r0 = r66
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x04c5
            r0 = 2131974590(0x7f1359be, float:1.9586248E38)
            java.lang.String r31 = X.C244013aV.A0E(r4, r0)
            r0 = r22
            int r15 = X.C51972G9s.A09(r0, r4)
            long r29 = X.C244013aV.A04(r4)
            X.Ixn r0 = new X.Ixn
            r58 = r0
            r59 = r70
            r60 = r27
            r62 = r11
            r63 = r4
            r64 = r66
            r65 = r8
            r58.<init>(r59, r60, r61, r62, r63, r64, r65)
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            r8 = 4
            X.9JS r13 = X.C51965G9l.A0d(r1, r0, r8)
            r12 = r17
            r1 = r20
            r0 = r16
            X.2WX r14 = X.C51973G9u.A0S(r2, r13, r12, r1, r0)
            long r0 = X.C51970G9q.A0D()
            r12 = 4624633867356078080(0x402e000000000000, double:15.0)
            long r12 = java.lang.Double.doubleToRawLongBits(r12)
            X.9JR r12 = X.C51967G9n.A0S(r3, r12)
            X.2WX r13 = X.C51973G9u.A0Q(r14, r12, r3, r0)
            X.9JR r12 = X.C51966G9m.A0k(r3, r0)
            X.2WX r12 = X.C51974G9v.A0F(r13, r12, r3, r0)
            r1 = r42
            r0 = r66
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x0228
            r0 = r27
            java.lang.Object r0 = r0.A00
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0228
            boolean r0 = r0.isEmpty()
            r14 = 0
            if (r0 == 0) goto L_0x0229
        L_0x0228:
            r14 = 1
        L_0x0229:
            android.graphics.drawable.GradientDrawable$Orientation r0 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            X.JVb r13 = new X.JVb
            r13.<init>(r0)
            X.2V1 r0 = r4.Aqq()
            android.content.Context r1 = X.C51965G9l.A0B(r0)
            r0 = r32
            float r0 = X.0nA.A04(r1, r0)
            r13.setCornerRadius(r0)
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
            if (r14 == 0) goto L_0x0249
            r0 = 2131099811(0x7f0600a3, float:1.7811986E38)
        L_0x0249:
            int r0 = X.C51969G9p.A08(r4, r0)
            r13.setColor(r0)
            X.2WX r8 = X.C51971G9r.A0Y(r12, r7, r13, r8)
            r1 = r68
            r0 = r31
            X.3ae r12 = X.C51971G9r.A0b(r1, r2, r0, r3)
            r0 = r29
            X.C51973G9u.A16(r4, r12, r15, r0)
            r0 = r16
            r12.A0R(r0)
            r0 = r21
            X.G9w.A11(r0, r4, r12, r5)
            r12.A0B()
            r1 = r20
            r0 = r16
            X.C51974G9v.A14(r12, r7, r1, r3, r0)
            X.2WW r57 = X.C51971G9r.A0c(r2, r8, r12)
        L_0x0279:
            android.graphics.drawable.GradientDrawable$Orientation r56 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            X.JVb r1 = new X.JVb
            r0 = r56
            r1.<init>(r0)
            X.2V1 r0 = r4.Aqq()
            android.content.Context r8 = X.C51965G9l.A0B(r0)
            r0 = 12
            float r0 = X.0nA.A04(r8, r0)
            r1.setCornerRadius(r0)
            int r0 = X.C51972G9s.A09(r8, r4)
            r1.setColor(r0)
            r32 = 4
            r0 = r32
            X.2WX r31 = X.C51971G9r.A0Y(r2, r7, r1, r0)
            r0 = 2131165243(0x7f07003b, float:1.7944698E38)
            long r37 = X.C244013aV.A0C(r4, r0)
            long r14 = X.C244013aV.A0C(r4, r0)
            long r29 = X.C244013aV.A0C(r4, r0)
            r0 = 4619567317775286272(0x401c000000000000, double:7.0)
            long r12 = java.lang.Double.doubleToRawLongBits(r0)
            java.lang.Integer r55 = X.AnonymousClass05K.A0u
            r8 = r55
            X.9JR r8 = X.C51965G9l.A0c(r8, r3, r14)
            r0 = r37
            r14 = r31
            X.2WX r14 = X.C51974G9v.A0G(r14, r8, r3, r0)
            java.lang.Integer r39 = X.AnonymousClass05K.A1F
            r8 = r39
            r0 = r29
            X.9JR r0 = X.C51965G9l.A0c(r8, r3, r0)
            X.2WX r8 = X.C51974G9v.A0E(r14, r0, r3, r12)
            r53 = 2131165213(0x7f07001d, float:1.7944637E38)
            r0 = r53
            long r37 = X.C244013aV.A0C(r4, r0)
            long r29 = X.C244013aV.A0C(r4, r0)
            long r12 = X.C244013aV.A0C(r4, r0)
            r14 = r40
            r0 = r37
            X.2WX r1 = X.AnonymousClass9JR.A00(r8, r14, r3, r0)
            java.lang.Integer r52 = X.AnonymousClass05K.A08
            r0 = r52
            X.2WX r12 = X.AnonymousClass9JR.A00(r1, r0, r3, r12)
            java.lang.Integer r51 = X.AnonymousClass05K.A09
            r8 = r51
            r0 = r29
            X.2WX r50 = X.AnonymousClass9JR.A00(r12, r8, r3, r0)
            X.2Wb r49 = X.AnonymousClass7TG.A0S(r68)
            if (r41 == 0) goto L_0x04da
            java.util.Iterator r48 = r41.iterator()
            r47 = 0
        L_0x030c:
            boolean r0 = r48.hasNext()
            if (r0 == 0) goto L_0x04da
            java.lang.Object r46 = r48.next()
            r0 = r46
            X.CvG r0 = (X.C45374CvG) r0
            r46 = r0
            r0 = r24
            java.lang.Object r12 = r0.A03
            java.util.AbstractCollection r12 = (java.util.AbstractCollection) r12
            if (r12 == 0) goto L_0x04ba
            r0 = r46
            java.lang.String r0 = r0.A03
            boolean r8 = r12.contains(r0)
            r1 = 2131230940(0x7f0800dc, float:1.8077947E38)
            r0 = r16
            if (r8 != r0) goto L_0x04ba
            r0 = r49
            android.graphics.drawable.Drawable r1 = X.C244013aV.A0D(r0, r1)
        L_0x0339:
            r0 = r32
            X.2WX r13 = X.C51971G9r.A0Y(r2, r7, r1, r0)
            r0 = 4632233691727265792(0x4049000000000000, double:50.0)
            r8 = r34
            X.2WX r13 = X.C51973G9u.A0X(r13, r8, r0, r3)
            long r0 = X.C244013aV.A0A(r49)
            java.lang.Integer r8 = X.AnonymousClass05K.A0A
            X.2WX r13 = X.AnonymousClass9JR.A00(r13, r8, r3, r0)
            X.Ixz r8 = new X.Ixz
            r58 = r8
            r59 = r49
            r60 = r24
            r62 = r46
            r63 = r11
            r64 = r70
            r65 = r26
            r67 = r27
            r58.<init>(r59, r60, r61, r62, r63, r64, r65, r66, r67)
            r1 = r39
            r0 = r32
            X.2WX r45 = X.C51971G9r.A0Y(r13, r1, r8, r0)
            X.2Wb r8 = X.G9t.A0w(r49)
            if (r12 == 0) goto L_0x0382
            r0 = r46
            java.lang.String r0 = r0.A03
            boolean r13 = r12.contains(r0)
            r1 = r54
            r0 = r16
            if (r13 == r0) goto L_0x0384
        L_0x0382:
            r1 = r43
        L_0x0384:
            r8.A00(r1)
            r13 = r34
            r1 = r33
            r0 = r35
            X.2WX r1 = X.C51971G9r.A0Y(r2, r13, r1, r0)
            r0 = r40
            X.2WX r44 = X.AnonymousClass9JR.A00(r1, r0, r3, r5)
            X.2V1 r0 = r8.A00
            r58 = r0
            X.2Wb r15 = X.AnonymousClass7TG.A0S(r58)
            r1 = r42
            r0 = r66
            boolean r1 = r1.contains(r0)
            r0 = 2131099778(0x7f060082, float:1.7811919E38)
            if (r1 == 0) goto L_0x03af
            r0 = 2131100275(0x7f060273, float:1.7812927E38)
        L_0x03af:
            int r41 = X.C244013aV.A02(r15, r0)
            X.2WX r1 = X.AnonymousClass9JR.A00(r2, r7, r3, r9)
            r0 = r17
            X.2WX r13 = X.AnonymousClass9JR.A00(r1, r0, r3, r9)
            r0 = r36
            long r37 = X.C244013aV.A0C(r15, r0)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r29 = java.lang.Double.doubleToRawLongBits(r0)
            r14 = r40
            r0 = r37
            X.2WX r13 = X.AnonymousClass9JR.A00(r13, r14, r3, r0)
            r14 = r52
            r0 = r29
            X.2WX r14 = X.AnonymousClass9JR.A00(r13, r14, r3, r0)
            int r31 = r47 + 1
            if (r12 == 0) goto L_0x04b7
            r0 = r46
            java.lang.String r0 = r0.A03
            boolean r12 = r12.contains(r0)
        L_0x03e5:
            if (r47 < 0) goto L_0x04b3
            r1 = 25
            r0 = r47
            if (r0 > r1) goto L_0x04b3
            if (r12 != 0) goto L_0x04b3
            int r0 = r47 % 26
            int r0 = r0 + 65
            char r0 = (char) r0
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L_0x03f8:
            long r29 = X.C244013aV.A04(r15)
            X.2V1 r0 = r15.A00
            X.3ae r12 = X.C51971G9r.A0b(r0, r2, r1, r3)
            r13 = r41
            r0 = r29
            X.C51973G9u.A17(r15, r12, r13, r0)
            r12.A0R(r3)
            r0 = r21
            X.G9w.A12(r0, r15, r12, r5)
            r12.A0B()
            r1 = r20
            r0 = r16
            X.C51974G9v.A14(r12, r7, r1, r3, r0)
            X.G9t.A1M(r15, r14, r12)
            r0 = r44
            X.2Tl r0 = X.C243563Zg.A04(r15, r8, r0)
            r8.A00(r0)
            r0 = r27
            java.lang.Object r1 = r0.A00
            java.util.AbstractCollection r1 = (java.util.AbstractCollection) r1
            if (r1 == 0) goto L_0x049a
            r0 = r46
            java.lang.String r0 = r0.A03
            boolean r1 = r1.contains(r0)
            r0 = r16
            if (r1 != r0) goto L_0x049a
            r0 = r58
            int r12 = X.C51971G9r.A0C(r0, r8)
        L_0x0441:
            long r29 = X.C244013aV.A04(r8)
            r0 = r46
            java.lang.String r0 = r0.A02
            r37 = r0
            r0 = r55
            X.2WX r13 = X.AnonymousClass9JR.A00(r2, r0, r3, r5)
            long r0 = X.C244013aV.A0A(r8)
            r15 = 2131165271(0x7f070057, float:1.7944754E38)
            r14 = r40
            X.2WX r14 = X.C51973G9u.A0W(r13, r8, r14, r15, r3)
            r13 = r51
            X.2WX r13 = X.AnonymousClass9JR.A00(r14, r13, r3, r0)
            r1 = r58
            r0 = r37
            X.3ae r14 = X.C51971G9r.A0b(r1, r2, r0, r3)
            r0 = r29
            X.C51973G9u.A17(r8, r14, r12, r0)
            r14.A0R(r3)
            r0 = r21
            X.G9w.A12(r0, r8, r14, r5)
            r0 = r28
            r14.A0W(r0)
            r0 = r20
            X.C51973G9u.A1A(r14, r7, r0, r3)
            r0 = r23
            r14.A0M(r0)
            X.C51974G9v.A0z(r13, r14, r3)
            X.2WW r12 = r14.A0A()
            r1 = r45
            r0 = r49
            X.C51971G9r.A1E(r12, r8, r0, r1)
            r47 = r31
            goto L_0x030c
        L_0x049a:
            r1 = r42
            r0 = r66
            boolean r0 = r1.contains(r0)
            r1 = 2131099778(0x7f060082, float:1.7811919E38)
            if (r0 == 0) goto L_0x04aa
            r1 = 2131100275(0x7f060273, float:1.7812927E38)
        L_0x04aa:
            X.2V4 r0 = r8.Bnf()
            int r12 = r0.A02(r1)
            goto L_0x0441
        L_0x04b3:
            r1 = r25
            goto L_0x03f8
        L_0x04b7:
            r12 = 0
            goto L_0x03e5
        L_0x04ba:
            r1 = 2131231181(0x7f0801cd, float:1.8078436E38)
            r0 = r49
            android.graphics.drawable.Drawable r1 = X.C244013aV.A0D(r0, r1)
            goto L_0x0339
        L_0x04c5:
            r57 = 0
            goto L_0x0279
        L_0x04c9:
            r41 = 0
            goto L_0x0087
        L_0x04cd:
            java.lang.String r26 = "multiple"
            if (r11 == 0) goto L_0x04d3
            goto L_0x0038
        L_0x04d3:
            r66 = r25
            goto L_0x0048
        L_0x04d7:
            r8 = 0
            goto L_0x0020
        L_0x04da:
            X.3Zi r14 = X.C243583Zi.CENTER
            r0 = r49
            X.2V1 r1 = r0.A00
            r26 = r2
            r0 = r57
            X.2Wb r1 = X.G9t.A0v(r0, r1)
            r0 = r49
            X.2Tp r8 = X.C243563Zg.A0F(r1, r0, r2)
            r1 = r50
            X.2Tl r23 = X.C51967G9n.A0N(r8, r0, r4, r1)
            android.util.DisplayMetrics r8 = new android.util.DisplayMetrics
            r8.<init>()
            java.lang.String r1 = "null cannot be cast to non-null type android.app.Activity"
            r0 = r22
            X.0qQ.A0C(r0, r1)
            r0 = r22
            android.app.Activity r0 = (android.app.Activity) r0
            r22 = r0
            android.view.WindowManager r0 = r22.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r8)
            int r0 = r8.heightPixels
            float r0 = (float) r0
            float r0 = android.util.TypedValue.applyDimension(r3, r0, r8)
            int r1 = (int) r0
            X.JVb r8 = new X.JVb
            r0 = r56
            r8.<init>(r0)
            r0 = 2131100509(0x7f06035d, float:1.7813401E38)
            int r12 = X.C51969G9p.A08(r4, r0)
            r0 = 2131100510(0x7f06035e, float:1.7813403E38)
            int r0 = X.C51969G9p.A08(r4, r0)
            int[] r0 = new int[]{r12, r0}
            r8.setColors(r0)
            r0 = r32
            X.2WX r25 = X.C51971G9r.A0Y(r2, r7, r8, r0)
            X.2Wb r8 = X.AnonymousClass7TG.A0S(r68)
            r15 = 1500(0x5dc, float:2.102E-42)
            if (r1 <= r15) goto L_0x0545
            X.3Zi r14 = X.C243583Zi.FLEX_END
        L_0x0545:
            r0 = r53
            long r12 = X.C244013aV.A0C(r8, r0)
            if (r1 <= r15) goto L_0x066d
            r0 = 2131165235(0x7f070033, float:1.7944681E38)
            long r0 = X.C244013aV.A0C(r8, r0)
        L_0x0554:
            java.lang.Integer r15 = X.AnonymousClass05K.A0E
            X.9JR r12 = X.C51965G9l.A0c(r15, r3, r12)
            X.2WX r13 = X.C51974G9v.A0F(r2, r12, r3, r0)
            r12 = r17
            r1 = r20
            r0 = r16
            X.2WX r13 = X.C51971G9r.A0X(r13, r12, r1, r0)
            X.2V1 r12 = r8.A00
            r1 = r19
            r0 = r23
            X.2Wb r0 = X.C51973G9u.A0J(r1, r0, r12)
            X.2Tl r0 = X.C243563Zg.A07(r0, r8, r13, r2, r14)
            r8.A00(r0)
            if (r11 == 0) goto L_0x0667
            java.lang.String r0 = r11.A06
            r24 = r0
            java.lang.String r0 = r11.A08
            r23 = r0
            java.lang.String r0 = r11.A04
            r26 = r0
        L_0x0587:
            r1 = 0
            if (r24 == 0) goto L_0x0660
            if (r23 == 0) goto L_0x0660
            if (r26 == 0) goto L_0x0660
            X.2WX r11 = X.AnonymousClass9JR.A00(r2, r7, r3, r9)
            r0 = 4630826316843712512(0x4044000000000000, double:40.0)
            r12 = r17
            X.2WX r0 = X.C51973G9u.A0X(r11, r12, r0, r3)
            java.lang.Integer r15 = X.AnonymousClass05K.A06
            X.2WX r11 = X.AnonymousClass9JR.A00(r0, r15, r3, r5)
            long r0 = X.C51969G9p.A0E()
            java.lang.Integer r14 = X.AnonymousClass05K.A0G
            X.2WX r13 = X.AnonymousClass9JR.A00(r11, r14, r3, r0)
            r11 = 2131237883(0x7f081bfb, float:1.809203E38)
            android.graphics.drawable.Drawable r12 = X.C51968G9o.A0K(r8, r11)
            r11 = r18
            X.C51972G9s.A0w(r12, r8, r11)
            X.2V1 r22 = r8.Aqq()
            r11 = r22
            X.3gE r19 = X.C51974G9v.A0P(r12, r11, r13)
            r13 = r17
            r12 = r20
            r11 = r16
            X.2WX r28 = X.C51971G9r.A0X(r2, r13, r12, r11)
            X.2Wb r13 = X.AnonymousClass7TG.A0S(r22)
            X.2WX r11 = X.AnonymousClass9JR.A00(r2, r7, r3, r9)
            r12 = r17
            X.2WX r9 = X.AnonymousClass9JR.A00(r11, r12, r3, r9)
            X.2WX r9 = X.AnonymousClass9JR.A00(r9, r15, r3, r5)
            X.2WX r12 = X.AnonymousClass9JR.A00(r9, r14, r3, r5)
            X.IxS r11 = new X.IxS
            r40 = r11
            r41 = r13
            r42 = r69
            r43 = r70
            r44 = r24
            r45 = r23
            r46 = r26
            r40.<init>(r41, r42, r43, r44, r45, r46)
            r10 = r39
            r9 = r32
            X.2WX r11 = X.C51971G9r.A0Y(r12, r10, r11, r9)
            r9 = 2131238568(0x7f081ea8, float:1.8093418E38)
            android.graphics.drawable.Drawable r10 = X.C51968G9o.A0K(r13, r9)
            r9 = r18
            X.C51972G9s.A0w(r10, r13, r9)
            X.2V1 r9 = r13.A00
            X.C51974G9v.A0h(r10, r9, r13, r11)
            r26 = r13
            r27 = r8
            r29 = r2
            r30 = r2
            r31 = r2
            r32 = r2
            r33 = r16
            X.2Tp r12 = X.C243563Zg.A0H(r26, r27, r28, r29, r30, r31, r32, r33)
            X.2WX r14 = X.AnonymousClass9JR.A00(r2, r14, r3, r0)
            r1 = r19
            r0 = r22
            X.2Wb r13 = X.G9t.A0v(r1, r0)
            X.2V1 r11 = r13.A00
            int r10 = X.C51971G9r.A0C(r11, r13)
            r0 = 2131954111(0x7f1309bf, float:1.9544712E38)
            java.lang.String r9 = X.C244013aV.A0E(r13, r0)
            r0 = 1096810496(0x41600000, float:14.0)
            long r0 = X.C51972G9s.A0G(r0)
            X.3ae r9 = X.C51971G9r.A0b(r11, r2, r9, r3)
            X.C51973G9u.A17(r13, r9, r10, r0)
            r9.A0R(r3)
            r0 = r21
            X.G9w.A12(r0, r13, r9, r5)
            r9.A0B()
            r1 = r20
            r0 = r16
            X.C51974G9v.A14(r9, r7, r1, r3, r0)
            r9.A05(r2)
            X.C51967G9n.A1G(r13, r9)
            X.2Tp r1 = X.C51967G9n.A0P(r12, r13, r8, r14)
        L_0x0660:
            r0 = r25
            X.2Tl r0 = X.C51967G9n.A0N(r1, r8, r4, r0)
            return r0
        L_0x0667:
            r24 = r2
            r23 = r2
            goto L_0x0587
        L_0x066d:
            r0 = r5
            goto L_0x0554
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53918GwO.A0X(X.3Y5):X.3mp");
    }

    public C53918GwO(C267324bN r1, UserSession userSession, AnonymousClass4DU r3) {
        AnonymousClass7TG.A1U(r3, r1, userSession);
        this.A01 = r3;
        this.A02 = r1;
        this.A00 = userSession;
    }

    public static final void A00(2V1 r4, 2Wa r5, C45427Cw7 cw7, UserSession userSession, AnonymousClass4DU r8, String str, HashSet hashSet) {
        if (DbT.A1b(hashSet)) {
            HashSet hashSet2 = A04;
            if (!hashSet2.contains(str)) {
                hashSet2.add(str);
                AnonymousClass7TF.A1B(userSession, 0, r8);
                C45397Cvd cvd = null;
                if (!(cw7 == null || cw7.A06.length() == 0)) {
                    List list = cw7.A09;
                    if (list != null) {
                        cvd = (C45397Cvd) 00k.A0O(list, 0);
                    }
                    String A0R = 002.A0R("instagram_ad_", C273654mx.A00(404));
                    if (!(cvd == null || A0R == null)) {
                        C254523sc A0n = C51965G9l.A0n(r8, A0R);
                        A0n.A7J = cw7.A08;
                        A0n.A6X = cvd.A01;
                        A0n.A83 = AnonymousClass7TE.A1D(hashSet);
                        A0n.A6w = "in_feed_survey";
                        C233822wX.A0H(userSession, A0n, r8);
                    }
                }
                1xC r3 = 1xC.A01;
                C310336ap A0a = DbS.A0a();
                A0a.A02();
                Context context = r4.A0C;
                A0a.A04 = context.getDrawable(R.drawable.instagram_check_pano_outline_24);
                DbS.A19(context, A0a, 2131954114);
                A0a.A06();
                DbY.A1K(r3, A0a);
            }
        }
        r5.A03(C59082J5p.A00);
    }
}
