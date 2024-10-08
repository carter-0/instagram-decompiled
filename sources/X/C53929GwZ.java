package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.user.model.User;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.GwZ  reason: case insensitive filesystem */
public final class C53929GwZ extends C251343mx {
    public final int A00;
    public final 2Wa A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final C51984GAh A06;
    public final JTB A07;
    public final C51987GAk A08;
    public final C55676HlZ A09;
    public final HashMap A0A;
    public final C62320sa A0B;
    public final C52058GDe A0C;
    public final C230292pL A0D;

    public C53929GwZ(2Wa r2, C267324bN r3, C52058GDe gDe, C52058GDe gDe2, UserSession userSession, AnonymousClass4DU r7, C230292pL r8, C51984GAh gAh, JTB jtb, C51987GAk gAk, C55676HlZ hlZ, HashMap hashMap, C62320sa r14, int i) {
        0qQ.A0B(gDe, 3);
        AnonymousClass7TG.A1S(jtb, userSession);
        C51974G9v.A1Q(r7, hashMap, gAk, gAh);
        this.A00 = i;
        this.A02 = r3;
        this.A03 = gDe;
        this.A0C = gDe2;
        this.A07 = jtb;
        this.A04 = userSession;
        this.A05 = r7;
        this.A0A = hashMap;
        this.A08 = gAk;
        this.A06 = gAh;
        this.A01 = r2;
        this.A0B = r14;
        this.A0D = r8;
        this.A09 = hlZ;
    }

    public static final void A09(View view, C53929GwZ gwZ, Integer num) {
        Integer num2;
        int i;
        AnonymousClass3W1 r0;
        String str;
        C53929GwZ gwZ2 = gwZ;
        C267324bN r10 = gwZ.A02;
        String str2 = r10.A06().A0e;
        Integer[] A002 = AnonymousClass05K.A00(5);
        int length = A002.length;
        int i2 = 0;
        while (true) {
            if (i2 < length) {
                num2 = A002[i2];
                switch (num2.intValue()) {
                    case 1:
                        str = "ENLARGED_VIEWER";
                        break;
                    case 2:
                        str = AnonymousClass000.A00(945);
                        break;
                    case 3:
                        str = "SEED_AD";
                        break;
                    case 4:
                        str = "WATCH_AND_BROWSE";
                        break;
                    default:
                        str = "CTA_DESTINATION";
                        break;
                }
                if (!str.equalsIgnoreCase(str2)) {
                    i2++;
                }
            } else {
                num2 = AnonymousClass05K.A00;
            }
        }
        Integer A012 = C57031ILx.A01(r10);
        if (A012 == null) {
            A012 = AnonymousClass05K.A00;
        }
        C52058GDe gDe = gwZ.A0C;
        C53368Gms gms = gDe.A09;
        if (gms.A00 == gwZ.A00) {
            i = gms.A01;
        } else {
            i = 0;
        }
        UserSession userSession = gwZ2.A04;
        if (182.A01(C51965G9l.A0Z(userSession, 0), userSession, 36600714867773406L) > 0 && (r0 = gDe.A0E) != null && !r0.A33) {
            num2 = AnonymousClass05K.A0C;
        }
        int intValue = num2.intValue();
        View view2 = view;
        if (intValue == 1 || intValue == 4 || intValue == 2 || intValue == 3) {
            gwZ2.A06.A03(r10, num, gwZ2.A03.A09());
            gwZ2.A07.DSX(view2, r10, num2, A012, gwZ2.A05.getModuleName(), i);
        } else if (intValue == 0) {
            A0A(view, gwZ2, AnonymousClass05K.A00);
        } else {
            throw AnonymousClass7TE.A1K();
        }
    }

    /* JADX WARNING: type inference failed for: r1v49, types: [X.3mp] */
    /* JADX WARNING: type inference failed for: r40v3, types: [X.GxU] */
    /* JADX WARNING: type inference failed for: r40v4, types: [X.GxV] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0044, code lost:
        if (r16 != false) goto L_0x0046;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0680, code lost:
        if (r4 != null) goto L_0x0208;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0261, code lost:
        if (r1 == X.C54643HMa.A03) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0032, code lost:
        if (r4 == null) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0271, code lost:
        if ((r37 instanceof X.C54584HJt) != false) goto L_0x0273;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r68) {
        /*
            r67 = this;
            r2 = 0
            r15 = r68
            X.0qQ.A0B(r15, r2)
            r3 = r67
            com.instagram.common.session.UserSession r0 = r3.A04
            X.0Tu r9 = X.C51965G9l.A0Z(r0, r2)
            r4 = 36882189844349369(0x830828003601b9, double:3.387783598000033E-306)
            java.lang.String r6 = X.182.A04(r9, r0, r4)
            kotlin.enums.EnumEntries r1 = X.C54656HMn.A01
            java.util.Iterator r5 = r1.iterator()
        L_0x001d:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0034
            java.lang.Object r4 = r5.next()
            r1 = r4
            X.HMn r1 = (X.C54656HMn) r1
            java.lang.String r1 = r1.A00
            boolean r1 = X.0qQ.A0K(r1, r6)
            if (r1 == 0) goto L_0x001d
            if (r4 != 0) goto L_0x0036
        L_0x0034:
            X.HMn r4 = X.C54656HMn.A08
        L_0x0036:
            X.HMn r1 = X.C54656HMn.DETACHED_HEADLINE_CAPTION
            r17 = 1
            boolean r16 = X.AnonymousClass7TF.A1W(r4, r1)
            X.HMn r1 = X.C54656HMn.A08
            if (r4 == r1) goto L_0x0046
            r39 = 1
            if (r16 == 0) goto L_0x0048
        L_0x0046:
            r39 = 0
        L_0x0048:
            java.lang.Object[] r4 = new java.lang.Object[r2]
            X.IuR r1 = X.C58594IuR.A00
            java.lang.Object r5 = X.AnonymousClass3Zw.A00(r15, r1, r4)
            java.lang.Object[] r4 = X.C51970G9q.A1b()
            r20 = 25
            r1 = r20
            X.C58693Iw2.A00(r15, r3, r5, r4, r1)
            X.1se r4 = X.1sd.A00(r0)
            X.4bN r1 = r3.A02
            r66 = r1
            X.1Xj r1 = X.C51966G9m.A0s(r66)
            boolean r1 = r4.A05(r1)
            if (r1 == 0) goto L_0x01c9
            android.os.Handler r1 = X.AnonymousClass7TF.A0D()
            X.IgI r0 = new X.IgI
            r0.<init>(r3)
            r1.post(r0)
            r0 = 2131238268(0x7f081d7c, float:1.809281E38)
            android.graphics.drawable.Drawable r18 = X.C244013aV.A0D(r15, r0)
            android.graphics.drawable.Drawable r1 = r18.mutate()
            r21 = 2131100269(0x7f06026d, float:1.7812915E38)
            r0 = r21
            X.C51973G9u.A0x(r1, r15, r0)
            X.3XV r0 = X.2WX.A02
            X.3b9 r11 = X.C244413b9.RELATIVE
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            r9 = 3
            X.9JS r0 = X.C51965G9l.A0d(r10, r11, r9)
            r8 = 0
            X.2WX r0 = X.C51965G9l.A0X(r8, r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            r6 = 1120403456(0x42c80000, float:100.0)
            X.2WX r0 = X.C51971G9r.A0X(r0, r7, r6, r2)
            java.lang.Integer r5 = X.AnonymousClass05K.A00
            X.2WX r34 = X.C51971G9r.A0X(r0, r5, r6, r2)
            X.3Zh r24 = X.C243573Zh.CENTER
            X.3Zi r26 = X.C243583Zi.CENTER
            X.2Wb r20 = X.C51972G9s.A0Q(r15)
            X.2WX r0 = X.C51971G9r.A0Y(r8, r10, r11, r9)
            X.2WX r23 = X.C51974G9v.A0O(r0, r7, r5, r6, r2)
            X.2Wb r19 = X.G9t.A0w(r20)
            X.2WX r0 = X.C51971G9r.A0Y(r8, r10, r11, r9)
            X.2WX r14 = X.C51974G9v.A0O(r0, r7, r5, r6, r2)
            r1 = 8
            float[] r4 = new float[r1]
            r0 = 0
        L_0x00cb:
            r12 = 1107296256(0x42000000, float:32.0)
            r4[r0] = r12
            int r0 = r0 + 1
            if (r0 < r1) goto L_0x00cb
            android.graphics.drawable.shapes.RoundRectShape r1 = new android.graphics.drawable.shapes.RoundRectShape
            r1.<init>(r4, r8, r8)
            android.graphics.drawable.ShapeDrawable r0 = new android.graphics.drawable.ShapeDrawable
            r0.<init>(r1)
            r13 = 2131100247(0x7f060257, float:1.781287E38)
            r1 = r19
            X.C51972G9s.A0w(r0, r1, r13)
            r12 = 4
            X.2WX r29 = X.C51971G9r.A0Y(r14, r5, r0, r12)
            X.2Wb r4 = X.G9t.A0w(r19)
            X.2V1 r0 = r4.A00
            r22 = r0
            X.2Wb r1 = X.AnonymousClass7TG.A0S(r22)
            X.2WX r14 = X.C51971G9r.A0Y(r8, r10, r11, r9)
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            X.2WX r14 = X.C51973G9u.A0W(r14, r1, r7, r0, r2)
            X.2WX r14 = X.C51973G9u.A0W(r14, r1, r5, r0, r2)
            int r0 = X.C244013aV.A02(r1, r13)
            X.7gD r0 = X.C51965G9l.A0Y(r0)
            X.2WX r12 = X.C51971G9r.A0Y(r14, r5, r0, r12)
            r0 = r18
            X.C51969G9p.A13(r0, r8, r1, r12)
            X.2Tp r0 = X.C243563Zg.A0A(r1, r4)
            r4.A00(r0)
            X.2Wb r0 = X.AnonymousClass7TG.A0S(r22)
            X.2WX r9 = X.C51971G9r.A0Y(r8, r10, r11, r9)
            r1 = 2131165204(0x7f070014, float:1.7944619E38)
            X.9JR r1 = X.C51970G9q.A0c(r0, r7, r1, r2)
            X.2WX r9 = X.C51973G9u.A0S(r9, r1, r5, r6, r2)
            long r6 = X.C244013aV.A0A(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A08
            X.2WX r18 = X.AnonymousClass9JR.A00(r9, r1, r2, r6)
            r1 = 2131963716(0x7f132f44, float:1.9564193E38)
            java.lang.String r13 = X.C244013aV.A0E(r0, r1)
            r1 = r21
            int r14 = X.C244013aV.A02(r0, r1)
            long r9 = X.C244013aV.A0B(r0)
            X.2V1 r1 = r0.A00
            android.content.Context r7 = r1.A0C
            r6 = 2130970313(0x7f0406c9, float:1.7549333E38)
            int r12 = X.C51968G9o.A08(r7, r0, r6)
            android.graphics.Typeface r11 = android.graphics.Typeface.DEFAULT
            long r6 = X.C51969G9p.A0D()
            X.3ae r1 = X.C51971G9r.A0b(r1, r8, r13, r2)
            X.C51973G9u.A17(r0, r1, r14, r9)
            X.2V4 r9 = X.G9t.A15(r11, r0, r1, r2, r12)
            int r9 = X.2Wd.A00(r9, r6)
            X.G9w.A1F(r0, r1, r9, r6)
            r1.A0B()
            r6 = r17
            X.C51974G9v.A1A(r1, r5, r2, r6)
            r5 = r18
            X.C244123ag.A00(r1, r5)
            X.C51967G9n.A1G(r0, r1)
            X.2Tp r0 = X.C243563Zg.A0A(r0, r4)
            r4.A00(r0)
            r27 = r4
            r28 = r19
            r30 = r24
            r31 = r24
            r32 = r26
            r33 = r2
            X.2Tl r1 = X.C243563Zg.A06(r27, r28, r29, r30, r31, r32, r33)
            r0 = r19
            r0.A00(r1)
            r21 = r0
            r22 = r20
            r25 = r24
            r27 = r8
            r28 = r2
            X.2Tp r1 = X.C243563Zg.A0H(r21, r22, r23, r24, r25, r26, r27, r28)
            r0 = r20
            r0.A00(r1)
            if (r16 == 0) goto L_0x01b8
            X.2Tp r1 = r3.A06(r15, r6)
            r0 = r20
            r0.A00(r1)
        L_0x01b8:
            r32 = r0
            r33 = r15
            r35 = r24
            r36 = r24
            r37 = r26
            r38 = r2
            X.2Tl r0 = X.C243563Zg.A06(r32, r33, r34, r35, r36, r37, r38)
            return r0
        L_0x01c9:
            X.3OA r38 = r66.A06()
            r1 = r38
            X.1Xj r1 = r1.A0K
            r44 = r1
            X.1Xy r1 = r1.A0C
            java.lang.String r1 = r1.getDominantColor()
            if (r1 == 0) goto L_0x0684
            r1 = r44
            X.1Xy r1 = r1.A0C
            java.lang.String r1 = r1.getDominantColor()
            int r50 = android.graphics.Color.parseColor(r1)
        L_0x01e7:
            r1 = r38
            X.3xz r4 = r1.A0H
            r6 = 0
            if (r4 == 0) goto L_0x067e
            X.4iX r1 = r4.C8L()
            if (r1 == 0) goto L_0x067e
            java.lang.String r1 = r1.getBackgroundColor()
            if (r1 == 0) goto L_0x067e
            X.4iX r1 = r4.C8L()
            if (r1 == 0) goto L_0x067b
            java.lang.String r1 = r1.getBackgroundColor()
        L_0x0204:
            int r49 = android.graphics.Color.parseColor(r1)
        L_0x0208:
            X.4iX r1 = r4.AhE()
            if (r1 == 0) goto L_0x0222
            java.lang.String r1 = r1.getBackgroundColor()
            if (r1 == 0) goto L_0x0222
            X.4iX r1 = r4.AhE()
            if (r1 == 0) goto L_0x0678
            java.lang.String r1 = r1.getBackgroundColor()
        L_0x021e:
            int r50 = android.graphics.Color.parseColor(r1)
        L_0x0222:
            float r47 = r44.A0l()
            X.HMa r1 = X.I2T.A00(r0)
            r4 = 36882189842252210(0x830828001601b2, double:3.387783596673781E-306)
            java.lang.String r5 = X.182.A04(r9, r0, r4)
            int r7 = r5.hashCode()
            r4 = -2117089673(0xffffffff81cfc677, float:-7.6324574E-38)
            if (r7 == r4) goto L_0x0663
            r4 = -1768452127(0xffffffff96978fe1, float:-2.4486166E-25)
            if (r7 == r4) goto L_0x0650
            r4 = -1037686517(0xffffffffc226290b, float:-41.54008)
            if (r7 != r4) goto L_0x066f
            java.lang.String r4 = "text_pill"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x066f
            X.HJw r37 = X.C54587HJw.A00
        L_0x0250:
            r4 = 2342162249102335019(0x2081082800131c2b, double:4.064941370283444E-152)
            boolean r4 = X.182.A06(r9, r0, r4)
            r7 = 14
            if (r4 != 0) goto L_0x0263
            X.HMa r4 = X.C54643HMa.FADE_IN
            r51 = 0
            if (r1 != r4) goto L_0x0265
        L_0x0263:
            r51 = 1
        L_0x0265:
            r1 = r37
            boolean r1 = r1 instanceof X.C54585HJu
            if (r1 != 0) goto L_0x0273
            r1 = r37
            boolean r1 = r1 instanceof X.C54584HJt
            r56 = 0
            if (r1 == 0) goto L_0x0275
        L_0x0273:
            r56 = 1
        L_0x0275:
            X.HJw r4 = X.C54587HJw.A00
            r1 = r37
            boolean r58 = X.0qQ.A0K(r1, r4)
            r4 = 36319239890738241(0x81082800331c41, double:3.03177178051884E-306)
            boolean r57 = X.182.A06(r9, r0, r4)
            r4 = 2342162249102793775(0x20810828001a1c2f, double:4.06494137067243E-152)
            boolean r59 = X.182.A06(r9, r0, r4)
            X.HMa r4 = r1.A00
            X.HMa r1 = X.C54643HMa.SLIDE_UP
            if (r4 != r1) goto L_0x064c
            java.lang.String r64 = "cta_slide_up"
        L_0x0297:
            X.2V1 r1 = r15.A05
            r24 = r1
            android.content.Context r1 = X.C51965G9l.A0B(r24)
            boolean r1 = r3.A0D(r1)
            if (r1 != 0) goto L_0x0648
            if (r39 == 0) goto L_0x02b3
            java.lang.String r1 = A08(r38)
            if (r1 == 0) goto L_0x02b3
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0648
        L_0x02b3:
            r52 = 0
        L_0x02b5:
            X.HMb r19 = X.I2T.A01(r0)
            java.lang.Integer r1 = X.C57031ILx.A01(r66)
            if (r1 != 0) goto L_0x0642
            r1 = -1
        L_0x02c0:
            r4 = 15
            r14 = 1120403456(0x42c80000, float:100.0)
            if (r1 == r7) goto L_0x0631
            if (r1 == r4) goto L_0x0631
            X.3XV r10 = X.2WX.A02
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.2WX r7 = X.C51971G9r.A0X(r6, r8, r14, r2)
        L_0x02d0:
            X.3b9 r23 = X.C244413b9.RELATIVE
            java.lang.Integer r36 = X.AnonymousClass05K.A0Y
            r35 = 3
            r5 = r23
            r4 = r36
            r1 = r35
            X.2WX r1 = X.C51971G9r.A0Y(r6, r4, r5, r1)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.2WX r1 = X.C51971G9r.A0X(r1, r13, r14, r2)
            X.2WX r5 = r1.A00(r7)
            java.lang.Integer r22 = X.AnonymousClass05K.A0C
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r17)
            r11 = 4
            r4 = r22
            r1 = r18
            X.9JS r1 = X.C51965G9l.A0d(r4, r1, r11)
            if (r5 != r10) goto L_0x02fc
            r5 = r6
        L_0x02fc:
            X.2WX r10 = X.C51965G9l.A0X(r5, r1)
            r4 = 6
            X.Iml r1 = new X.Iml
            r1.<init>(r3, r4)
            X.IIx r12 = X.C56953IIx.A00
            X.JwL r5 = new X.JwL
            r5.<init>((X.0sP) r1, (com.instagram.common.session.UserSession) r0)
            X.3ar r4 = new X.3ar
            r4.<init>(r12, r5)
            r7 = 2
            X.2WX r34 = X.C51971G9r.A0Y(r10, r8, r4, r7)
            X.2Wb r33 = X.AnonymousClass7TG.A0S(r24)
            r5 = r23
            r4 = r36
            r1 = r35
            X.2WX r1 = X.C51971G9r.A0Y(r6, r4, r5, r1)
            X.2WX r5 = X.C51974G9v.A0O(r1, r13, r8, r14, r2)
            r4 = r22
            r1 = r18
            X.2WX r10 = X.C51971G9r.A0Y(r5, r4, r1, r11)
            r4 = 7
            X.Iml r1 = new X.Iml
            r1.<init>(r3, r4)
            X.JwL r5 = new X.JwL
            r5.<init>((X.0sP) r1, (com.instagram.common.session.UserSession) r0)
            X.3ar r4 = new X.3ar
            r4.<init>(r12, r5)
            X.2WX r5 = X.C51971G9r.A0Y(r10, r8, r4, r7)
            X.4DU r1 = r3.A05
            r12 = r1
            r4 = r66
            X.2WX r32 = X.GFM.A01(r6, r5, r4, r0, r1)
            X.2Wb r31 = X.G9t.A0w(r33)
            boolean r1 = r44.CeS()
            if (r1 == 0) goto L_0x05f0
            java.util.HashMap r1 = r3.A0A
            r11 = r1
            int r1 = r3.A00
            r10 = r1
            java.lang.String r45 = r66.getId()
            X.2WX r7 = X.C51974G9v.A0O(r6, r8, r13, r14, r2)
            r4 = 36319239888509993(0x81082800111c29, double:3.031771779109687E-306)
            boolean r4 = X.C51965G9l.A1a(r9, r0, r4)
            r1 = 30
            X.J6E r1 = X.J6E.A00(r3, r1)
            java.lang.Integer r5 = X.AnonymousClass05K.A1F
            if (r4 != 0) goto L_0x037a
            r1 = r6
        L_0x037a:
            X.2WX r41 = X.G9t.A10(r7, r5, r1)
            X.GxV r1 = new X.GxV
            r40 = r1
            r42 = r12
            r43 = r0
            r46 = r11
            r48 = r10
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
        L_0x038d:
            r0 = r31
            r0.A00(r1)
            X.3b9 r30 = X.C244413b9.ABSOLUTE
            r4 = r30
            r1 = r36
            r0 = r35
            X.2WX r0 = X.C51971G9r.A0Y(r6, r1, r4, r0)
            X.2WX r29 = X.C51974G9v.A0O(r0, r13, r8, r14, r2)
            X.3Zh r28 = X.C243573Zh.STRETCH
            X.3Zi r27 = X.C243583Zi.FLEX_START
            r0 = r31
            X.2V1 r0 = r0.A00
            r40 = r0
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r40)
            if (r51 == 0) goto L_0x053d
            r1 = 2131165236(0x7f070034, float:1.7944683E38)
            r0 = r17
            A0B(r4, r1, r0)
            r52 = r3
            r53 = r4
            r54 = r44
            r55 = r8
            X.2Tp r0 = r52.A07(r53, r54, r55, r56, r57, r58, r59)
            r4.A00(r0)
        L_0x03c9:
            r7 = r29
            r5 = r31
            r1 = r28
            r0 = r27
            X.2Tl r1 = X.C243563Zg.A07(r4, r5, r7, r1, r0)
            r5.A00(r1)
            r4 = r30
            r1 = r36
            r0 = r35
            X.2WX r0 = X.C51971G9r.A0Y(r6, r1, r4, r0)
            X.2WX r20 = X.C51974G9v.A0O(r0, r13, r8, r14, r2)
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r40)
            java.lang.String r9 = "Required value was null."
            android.content.Context r0 = X.C51966G9m.A0O(r4)
            boolean r1 = r3.A0D(r0)
            if (r51 != 0) goto L_0x04ae
            if (r1 == 0) goto L_0x0491
            r0 = 2131165320(0x7f070088, float:1.7944854E38)
            A0B(r4, r0, r2)
            r0 = r38
            java.lang.String r0 = r0.A0d
            if (r0 == 0) goto L_0x0691
            r60 = r3
            r61 = r15
            r62 = r37
            r63 = r0
            r65 = r2
            X.2Tp r0 = r60.A04(r61, r62, r63, r64, r65)
            r4.A00(r0)
            r52 = r3
            r53 = r4
            r54 = r44
            r55 = r13
            X.2Tp r0 = r52.A07(r53, r54, r55, r56, r57, r58, r59)
            r4.A00(r0)
        L_0x0424:
            r18 = r4
            r19 = r31
            r21 = r6
            r22 = r28
            r23 = r27
            r24 = r17
            X.2Tl r1 = X.C243563Zg.A06(r18, r19, r20, r21, r22, r23, r24)
            r0 = r31
            r0.A00(r1)
            X.2WX r5 = X.C51974G9v.A0O(r6, r8, r13, r14, r2)
            r4 = r30
            r1 = r36
            r0 = r35
            X.2WX r11 = X.C51971G9r.A0Y(r5, r1, r4, r0)
            X.GDe r10 = r3.A03
            X.GAk r0 = r3.A08
            X.2el r12 = r0.A04
            com.instagram.common.session.UserSession r9 = r0.A03
            X.93U r8 = r0.A07
            java.lang.String r7 = r0.A0J
            X.4DU r5 = r0.A06
            X.2uY r4 = new X.2uY
            r4.<init>(r9, r6)
            X.GAh r0 = r0.A09
            X.ILp r1 = new X.ILp
            r17 = r1
            r18 = r9
            r19 = r12
            r20 = r4
            r21 = r5
            r22 = r8
            r23 = r0
            r24 = r7
            r17.<init>(r18, r19, r20, r21, r22, r23, r24)
            X.GYf r5 = new X.GYf
            r0 = r66
            r5.<init>(r11, r1, r0, r10)
            r4 = r33
            r1 = r32
            r0 = r31
            X.C51971G9r.A1C(r5, r0, r4, r1)
            if (r16 == 0) goto L_0x048a
            X.2Tp r1 = r3.A06(r15, r2)
            r4.A00(r1)
        L_0x048a:
            r0 = r34
            X.2Tl r0 = X.C243563Zg.A03(r4, r15, r0)
            return r0
        L_0x0491:
            boolean r0 = r3.A0D(r0)
            if (r0 != 0) goto L_0x0424
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            A0B(r4, r0, r2)
            r52 = r3
            r53 = r4
            r54 = r44
            r55 = r13
            X.2Tp r0 = r52.A07(r53, r54, r55, r56, r57, r58, r59)
            r4.A00(r0)
            goto L_0x0424
        L_0x04ae:
            if (r1 == 0) goto L_0x04e8
            if (r39 == 0) goto L_0x04e8
            java.lang.String r5 = A08(r38)
            if (r5 == 0) goto L_0x0424
            r0 = 2131165477(0x7f070125, float:1.7945172E38)
            long r0 = X.C244013aV.A0C(r4, r0)
            java.util.List r7 = X.C55403Hh9.A01
            X.2Tl r0 = A00(r4, r7, r0, r2)
            r4.A00(r0)
            r0 = r38
            java.lang.String r0 = r0.A0d
            if (r0 == 0) goto L_0x0696
            r60 = r3
            r61 = r15
            r62 = r37
            r63 = r0
            r65 = r17
            X.2Tp r0 = r60.A04(r61, r62, r63, r64, r65)
            r4.A00(r0)
            X.2Tp r0 = A05(r15, r5, r2)
            r4.A00(r0)
            goto L_0x0424
        L_0x04e8:
            boolean r1 = r3.A0D(r0)
            if (r1 == 0) goto L_0x050f
            if (r39 != 0) goto L_0x050f
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            A0B(r4, r0, r2)
            r0 = r38
            java.lang.String r0 = r0.A0d
            if (r0 == 0) goto L_0x069b
            r60 = r3
            r61 = r15
            r62 = r37
            r63 = r0
            r65 = r2
            X.2Tp r0 = r60.A04(r61, r62, r63, r64, r65)
            r4.A00(r0)
            goto L_0x0424
        L_0x050f:
            boolean r1 = r3.A0D(r0)
            if (r1 != 0) goto L_0x0538
            if (r39 == 0) goto L_0x0538
            java.lang.String r5 = A08(r38)
            if (r5 == 0) goto L_0x0424
            r0 = 2131165245(0x7f07003d, float:1.7944702E38)
            long r0 = X.C244013aV.A0C(r4, r0)
            java.util.List r7 = X.C55403Hh9.A01
            X.2Tl r0 = A00(r4, r7, r0, r2)
            r4.A00(r0)
            r0 = r17
            X.2Tp r0 = A05(r15, r5, r0)
            r4.A00(r0)
            goto L_0x0424
        L_0x0538:
            r3.A0D(r0)
            goto L_0x0424
        L_0x053d:
            X.HMb r1 = X.C54644HMb.WITHIN_CARD
            r0 = r19
            if (r0 != r1) goto L_0x03c9
            r1 = 2131165236(0x7f070034, float:1.7944683E38)
            r0 = r17
            A0B(r4, r1, r0)
            r7 = r23
            r1 = r36
            r0 = r35
            X.9JS r0 = X.C51965G9l.A0d(r1, r7, r0)
            X.2WX r11 = X.C51973G9u.A0S(r6, r0, r8, r14, r2)
            long r20 = X.C244013aV.A06(r15)
            long r18 = X.C244013aV.A06(r15)
            r0 = 2131165308(0x7f07007c, float:1.794483E38)
            long r9 = X.C244013aV.A0C(r15, r0)
            java.lang.Integer r7 = X.AnonymousClass05K.A0u
            r0 = r20
            X.9JR r0 = X.C51965G9l.A0c(r7, r2, r0)
            X.2WX r7 = X.C51974G9v.A0G(r11, r0, r2, r9)
            r0 = r18
            X.2WX r26 = X.AnonymousClass9JR.A00(r7, r5, r2, r0)
            X.2Wb r11 = X.AnonymousClass7TG.A0S(r24)
            r10 = 1065353216(0x3f800000, float:1.0)
            r1 = r22
            r0 = r17
            X.2WX r25 = X.C51974G9v.A0O(r6, r13, r1, r10, r0)
            X.2Wb r7 = X.G9t.A0w(r11)
            r5 = r23
            r1 = r36
            r0 = r35
            X.2WX r5 = X.C51971G9r.A0Y(r6, r1, r5, r0)
            r1 = r22
            r0 = r17
            X.2WX r24 = X.C51974G9v.A0O(r5, r13, r1, r10, r0)
            java.lang.Integer r23 = X.AnonymousClass05K.A0N
            r0 = 2131963717(0x7f132f45, float:1.9564195E38)
            java.lang.String r22 = X.C244013aV.A0E(r7, r0)
            X.2V1 r1 = r7.A00
            android.content.Context r0 = r1.A0C
            r5 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r9 = X.C51968G9o.A08(r0, r7, r5)
            long r20 = X.C244013aV.A08(r7)
            android.graphics.Typeface r12 = android.graphics.Typeface.DEFAULT
            long r18 = X.C51969G9p.A0D()
            r0 = r22
            X.3ae r5 = X.C51971G9r.A0b(r1, r6, r0, r2)
            r0 = r20
            X.C51973G9u.A17(r7, r5, r9, r0)
            r5.A0R(r2)
            r0 = r18
            X.G9w.A12(r12, r7, r5, r0)
            r0 = r23
            r5.A0W(r0)
            X.C51974G9v.A13(r5, r8, r10)
            r0 = r24
            X.G9t.A1M(r7, r0, r5)
            r0 = r25
            X.2Tp r0 = X.C243563Zg.A0G(r7, r11, r0)
            r11.A00(r0)
            r0 = r26
            X.2Tp r0 = X.C243563Zg.A0D(r11, r15, r0)
            r4.A00(r0)
            goto L_0x03c9
        L_0x05f0:
            java.util.HashMap r1 = r3.A0A
            r11 = r1
            int r1 = r3.A00
            r10 = r1
            java.lang.String r45 = r66.getId()
            X.3b9 r5 = X.C244413b9.ABSOLUTE
            r4 = r36
            r1 = r35
            X.2WX r1 = X.C51971G9r.A0Y(r6, r4, r5, r1)
            X.2WX r7 = X.C51974G9v.A0O(r1, r13, r8, r14, r2)
            r4 = 36319239888509993(0x81082800111c29, double:3.031771779109687E-306)
            boolean r4 = X.C51965G9l.A1a(r9, r0, r4)
            r1 = r20
            X.J6E r1 = X.J6E.A00(r3, r1)
            java.lang.Integer r5 = X.AnonymousClass05K.A1F
            if (r4 != 0) goto L_0x061c
            r1 = r6
        L_0x061c:
            X.2WX r41 = X.G9t.A10(r7, r5, r1)
            X.GxU r1 = new X.GxU
            r40 = r1
            r42 = r12
            r43 = r0
            r46 = r11
            r48 = r10
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            goto L_0x038d
        L_0x0631:
            X.3XV r10 = X.2WX.A02
            r1 = 2131165267(0x7f070053, float:1.7944746E38)
            long r4 = X.C244013aV.A0C(r15, r1)
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.2WX r7 = X.AnonymousClass9JR.A00(r6, r8, r2, r4)
            goto L_0x02d0
        L_0x0642:
            int r1 = r1.intValue()
            goto L_0x02c0
        L_0x0648:
            r52 = 1
            goto L_0x02b5
        L_0x064c:
            java.lang.String r64 = "cta_fade_in"
            goto L_0x0297
        L_0x0650:
            java.lang.String r4 = "text_arrow_profile"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x066f
            X.HJu r37 = new X.HJu
            r5 = r17
            r4 = r37
            r4.<init>(r1, r5)
            goto L_0x0250
        L_0x0663:
            java.lang.String r4 = "text_arrow"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x066f
            X.HJv r37 = X.C54586HJv.A00
            goto L_0x0250
        L_0x066f:
            X.HJt r37 = new X.HJt
            r4 = r37
            r4.<init>(r1, r2)
            goto L_0x0250
        L_0x0678:
            r1 = r6
            goto L_0x021e
        L_0x067b:
            r1 = r6
            goto L_0x0204
        L_0x067e:
            r49 = r50
            if (r4 == 0) goto L_0x0222
            goto L_0x0208
        L_0x0684:
            X.2V1 r1 = r15.A05
            android.content.Context r4 = r1.A0C
            r1 = 2130970236(0x7f04067c, float:1.7549176E38)
            int r50 = X.C51972G9s.A0A(r4, r15, r1)
            goto L_0x01e7
        L_0x0691:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x0696:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        L_0x069b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53929GwZ.A0X(X.3Y5):X.3mp");
    }

    public static final 2Tl A00(C70832Wc r9, List list, long j, boolean z) {
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, C51968G9o.A0d(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE));
        Integer num = AnonymousClass05K.A00;
        2WX A0X2 = C51971G9r.A0X(A0X, num, 100.0f, 0);
        Integer num2 = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00(A0X2, num2, 0, j);
        2Wb A0M = C51973G9u.A0M(r9);
        A0M.A00(new C53972GxG(C51974G9v.A0O(G9t.A0x((2WX) null, num2, 1.0f), num2, num, 100.0f, 0), list, 32, z));
        return C243563Zg.A02(A0M, r9, A002);
    }

    private final 2Tp A04(AnonymousClass3Y5 r31, C55675HlY hlY, String str, String str2, boolean z) {
        boolean z2;
        long A0C2;
        long A062;
        AnonymousClass4Ey A012;
        AnonymousClass4Ey A013;
        C55675HlY hlY2 = hlY;
        C55675HlY hlY3 = hlY2;
        boolean z3 = hlY3 instanceof C54584HJt;
        C54643HMa hMa = hlY3.A00;
        C54643HMa hMa2 = C54643HMa.A04;
        AnonymousClass3Y5 r5 = r31;
        String str3 = str;
        String str4 = str2;
        if (z3) {
            z2 = false;
            if (hMa != hMa2) {
                0eP r1 = (0eP) this.A01.A03;
                if (AnonymousClass7TE.A1a(r1.A00)) {
                    if (hMa == C54643HMa.FADE_IN) {
                        if (!AnonymousClass7TE.A1a(r1.A01)) {
                            A013 = 2Vi.A00(C243533Zd.LOCAL, "cta_fade_in");
                            A013.A03(C246033ds.A00);
                            A013.A01(0.0f);
                        }
                        A013 = 2Vi.A01(2Vi.A04, new String[0]);
                        AnonymousClass4F7.A00(r5, A013);
                    } else if (hMa == C54643HMa.SLIDE_UP) {
                        if (!AnonymousClass7TE.A1a(r1.A01)) {
                            A013 = C51970G9q.A0b(C243533Zd.LOCAL, "cta_slide_up");
                            A013.A04(AnonymousClass4F6.A00(r5.A05.A0C, 10));
                        }
                        A013 = 2Vi.A01(2Vi.A04, new String[0]);
                        AnonymousClass4F7.A00(r5, A013);
                    }
                    C51966G9m.A1M(A013, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION);
                    this.A0B.invoke();
                    AnonymousClass4F7.A00(r5, A013);
                }
            }
            AnonymousClass3XV r0 = 2WX.A02;
            C244413b9 r11 = C244413b9.RELATIVE;
            Integer num = AnonymousClass05K.A0Y;
            2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, r11, 3));
            Integer num2 = AnonymousClass05K.A00;
            2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
            long A0C3 = C244013aV.A0C(r5, R.dimen.alert_dialog_button_cell_height);
            Integer num3 = AnonymousClass05K.A01;
            2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00(A0X2, num3, 0, A0C3), AnonymousClass05K.A1F, J6E.A00(this, 24), 4);
            2V1 r02 = r5.A05;
            2WX A0V = C51971G9r.A0V(r02, A0Y, C243533Zd.LOCAL, str4);
            Integer num4 = AnonymousClass05K.A0C;
            2WX A0Y2 = C51973G9u.A0Y(A0V, num4, true);
            C243583Zi r22 = C243583Zi.CENTER;
            C243573Zh r21 = C243573Zh.AUTO;
            2Wb A0S = AnonymousClass7TG.A0S(r02);
            2WX A0W = C51973G9u.A0W(C51971G9r.A0Y((2WX) null, num, r11, 3), A0S, num3, R.dimen.abc_dropdownitem_icon_width, 0);
            2WX A0Y3 = C51971G9r.A0Y(C51974G9v.A0F(C51972G9s.A0S(A0W, 0, C244013aV.A06(A0S)), C51967G9n.A0T(0, C244013aV.A06(A0S)), 0, C244013aV.A06(A0S)), num2, C244013aV.A0D(A0S, R.drawable.clips_viewer_multi_media_card_cta_background), 4);
            2Wb A0w = G9t.A0w(A0S);
            2WX A0O = C51974G9v.A0O(C51973G9u.A0S(C51971G9r.A0Y((2WX) null, num, r11, 3), C51970G9q.A0c(A0w, num3, R.dimen.abc_select_dialog_padding_start_material, 0), num2, 100.0f, 0), num3, num4, 0.0f, 1);
            2V1 r15 = A0w.A00;
            Context context = r15.A0C;
            int A052 = C51968G9o.A05(context, A0w);
            long A0B2 = C244013aV.A0B(A0w);
            Typeface A032 = 0oh.A03(context, Typeface.DEFAULT, num4);
            int A082 = C51968G9o.A08(context, A0w, R.attr.igds_color_selected_text_background);
            long A0D2 = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, str3, 0);
            C51973G9u.A17(A0w, A0b, A052, A0B2);
            G9w.A1F(A0w, A0b, 2Wd.A00(G9t.A15(A032, A0w, A0b, 0, A082), A0D2), A0D2);
            C51974G9v.A16(A0b, num4, num2);
            A0b.A0M(1);
            C51973G9u.A19(A0O, A0b, false);
            C51971G9r.A1E(A0b.A0A(), A0w, A0S, A0Y3);
            return C243563Zg.A0I(A0S, r5, A0Y2, r21, r22);
        }
        z2 = false;
        if (hMa != hMa2) {
            0eP r12 = (0eP) this.A01.A03;
            if (AnonymousClass7TE.A1a(r12.A00)) {
                if (hMa == C54643HMa.FADE_IN) {
                    if (!AnonymousClass7TE.A1a(r12.A01)) {
                        A012 = 2Vi.A00(C243533Zd.LOCAL, "cta_fade_in");
                        A012.A03(C246033ds.A00);
                        A012.A01(0.0f);
                    }
                    A012 = 2Vi.A01(2Vi.A04, new String[0]);
                    AnonymousClass4F7.A00(r5, A012);
                } else if (hMa == C54643HMa.SLIDE_UP) {
                    if (!AnonymousClass7TE.A1a(r12.A01)) {
                        A012 = C51970G9q.A0b(C243533Zd.LOCAL, "cta_slide_up");
                        A012.A04(AnonymousClass4F6.A00(r5.A05.A0C, 10));
                    }
                    A012 = 2Vi.A01(2Vi.A04, new String[0]);
                    AnonymousClass4F7.A00(r5, A012);
                }
                C51966G9m.A1M(A012, C355538Qj.DEFAULT_SWIPE_ANIMATION_DURATION);
                this.A0B.invoke();
                AnonymousClass4F7.A00(r5, A012);
            }
        }
        AnonymousClass3XV r03 = 2WX.A02;
        C244413b9 r26 = C244413b9.RELATIVE;
        Integer num5 = AnonymousClass05K.A0Y;
        2WX A0X3 = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num5, r26, 3));
        Integer num6 = AnonymousClass05K.A00;
        2WX A0X4 = C51971G9r.A0X(A0X3, num6, 100.0f, 0);
        if (z) {
            A0C2 = C51967G9n.A07(r5);
        } else {
            A0C2 = C244013aV.A0C(r5, R.dimen.add_to_story_dual_destination_share_sheet_avatar_icon_size);
        }
        Integer num7 = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00(A0X4, num7, 0, A0C2);
        long A063 = C244013aV.A06(r5);
        long A064 = C244013aV.A06(r5);
        if (z) {
            A062 = C244013aV.A0A(r5);
        } else {
            A062 = C244013aV.A06(r5);
        }
        2WX A0E = C51974G9v.A0E(AnonymousClass9JR.A00(A002, AnonymousClass05K.A04, 0, A063), C51967G9n.A0V(A062), 0, A064);
        2V1 r2 = r5.A05;
        2WX A0Z = C51973G9u.A0Z(C51971G9r.A0V(r2, A0E, C243533Zd.LOCAL, str4), J6E.A00(this, 29));
        2Wb A0S2 = AnonymousClass7TG.A0S(r2);
        2WX A0X5 = C51971G9r.A0X((2WX) null, num7, 1.0f, 1);
        Integer num8 = AnonymousClass05K.A0C;
        2WX A0X6 = C51971G9r.A0X(A0X5, num8, 1.0f, 1);
        2Wb A0w2 = G9t.A0w(A0S2);
        2WX A0O2 = C51974G9v.A0O(C51971G9r.A0Y((2WX) null, num5, r26, 3), num7, num8, 1.0f, 1);
        Integer num9 = AnonymousClass05K.A0N;
        2V1 r13 = A0w2.A00;
        Context context2 = r13.A0C;
        int A053 = C51968G9o.A05(context2, A0w2);
        long A0B3 = C244013aV.A0B(A0w2);
        Typeface A033 = 0oh.A03(context2, Typeface.DEFAULT, num8);
        int A083 = C51968G9o.A08(context2, A0w2, R.attr.igds_color_selected_text_background);
        long A0D3 = C51969G9p.A0D();
        C244103ae A0b2 = C51971G9r.A0b(r13, (2V5) null, str3, 0);
        C51973G9u.A17(A0w2, A0b2, A053, A0B3);
        G9w.A1F(A0w2, A0b2, 2Wd.A00(G9t.A15(A033, A0w2, A0b2, 0, A083), A0D3), A0D3);
        A0b2.A0W(num9);
        C51974G9v.A13(A0b2, num6, 1.0f);
        G9t.A1M(A0w2, A0O2, A0b2);
        if (hlY2.A01) {
            2WX A0O3 = C51974G9v.A0O(C51972G9s.A0S(C51971G9r.A0Y((2WX) null, num5, r26, 3), 0, C244013aV.A0A(A0w2)), num7, num8, 0.0f, 1);
            Drawable A0K = C51968G9o.A0K(A0w2, R.drawable.instagram_chevron_right_pano_outline_12);
            C51972G9s.A0w(A0K, A0w2, R.color.design_dark_default_color_on_background);
            C51969G9p.A13(A0K, (ImageView.ScaleType) null, A0w2, A0O3);
        }
        A0S2.A00(C243563Zg.A0G(A0w2, A0S2, A0X6));
        return C243563Zg.A0D(A0S2, r5, A0Z);
        return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, (List) null, z2);
    }

    public static final 2Tp A05(AnonymousClass3Y5 r19, String str, boolean z) {
        long A0D2;
        AnonymousClass3XV r0 = 2WX.A02;
        C244413b9 r12 = C244413b9.RELATIVE;
        Integer num = AnonymousClass05K.A0Y;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num, r12, 3));
        Integer num2 = AnonymousClass05K.A00;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
        long A062 = C244013aV.A06(r19);
        long A063 = C244013aV.A06(r19);
        long A064 = C244013aV.A06(r19);
        if (z) {
            A0D2 = C244013aV.A06(r19);
        } else {
            A0D2 = C51969G9p.A0D();
        }
        2WX A0E = C51974G9v.A0E(C51974G9v.A0G(A0X2, C51965G9l.A0c(AnonymousClass05K.A0u, 0, A062), 0, A064), C51965G9l.A0c(AnonymousClass05K.A1F, 0, A063), 0, A0D2);
        2Wb A0Q = C51972G9s.A0Q(r19);
        Integer num3 = AnonymousClass05K.A01;
        2WX A0X3 = C51971G9r.A0X((2WX) null, num3, 1.0f, 1);
        Integer num4 = AnonymousClass05K.A0C;
        2WX A0X4 = C51971G9r.A0X(A0X3, num4, 1.0f, 1);
        2Wb A0w = G9t.A0w(A0Q);
        2WX A0O = C51974G9v.A0O(C51971G9r.A0Y((2WX) null, num, r12, 3), num3, num4, 1.0f, 1);
        Integer num5 = AnonymousClass05K.A0N;
        2V1 r15 = A0w.A00;
        Context context = r15.A0C;
        int A052 = C51968G9o.A05(context, A0w);
        long A042 = C244013aV.A04(A0w);
        int A082 = C51968G9o.A08(context, A0w, R.attr.igds_color_selected_text_background);
        Typeface typeface = Typeface.DEFAULT;
        long A0D3 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, str, 0);
        C51973G9u.A17(A0w, A0b, A052, A042);
        G9w.A1F(A0w, A0b, 2Wd.A00(G9t.A15(typeface, A0w, A0b, 0, A082), A0D3), A0D3);
        A0b.A0W(num5);
        C51973G9u.A1A(A0b, num2, 1.0f, false);
        A0b.A0M(2);
        C51973G9u.A19(A0O, A0b, false);
        C51971G9r.A1E(A0b.A0A(), A0w, A0Q, A0X4);
        return C243563Zg.A0D(A0Q, r19, A0E);
    }

    private final 2Tp A06(AnonymousClass3Y5 r18, boolean z) {
        String str;
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(AnonymousClass05K.A0D, "detached_info_view", 4));
        C244413b9 r5 = C244413b9.RELATIVE;
        Integer num = AnonymousClass05K.A0Y;
        2WX A0Y = C51971G9r.A0Y(A0X, num, r5, 3);
        AnonymousClass3Y5 r16 = r18;
        long A062 = C51967G9n.A06(r16);
        Integer num2 = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00(A0Y, num2, 0, A062);
        Integer num3 = AnonymousClass05K.A00;
        2WX A0V = C51972G9s.A0V(AnonymousClass9JR.A00(AnonymousClass9JR.A00(C51971G9r.A0X(A002, num3, 100.0f, 0), AnonymousClass05K.A1I, 0, C244013aV.A05(r16)), AnonymousClass05K.A08, 0, C244013aV.A09(r16)), new GN2(25, this, r16, z));
        2Wb A0Q = C51972G9s.A0Q(r16);
        if (!z) {
            2WX A0C2 = C51974G9v.A0C(C51971G9r.A0Y((2WX) null, num, r5, 3), C51965G9l.A0b(num2, 1.0f, 1), 1.0f);
            Integer num4 = AnonymousClass05K.A0N;
            C257933yC r02 = this.A02.A06().A0O;
            if (r02 == null || (str = r02.AZ6()) == null) {
                str = "";
            }
            2V1 r03 = A0Q.A00;
            int A0C3 = C51971G9r.A0C(r03, A0Q);
            long A082 = C244013aV.A08(A0Q);
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r03, (2V5) null, str, 0);
            C51973G9u.A17(A0Q, A0b, A0C3, A082);
            A0b.A0R(0);
            G9w.A12(typeface, A0Q, A0b, A0D2);
            A0b.A0W(num4);
            C51974G9v.A13(A0b, num3, 1.0f);
            G9t.A1M(A0Q, A0C2, A0b);
        }
        return C243563Zg.A0B(A0Q, r16, A0V);
    }

    private final 2Tp A07(C70832Wc r46, 1Xj r47, Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        long A062;
        long j;
        long A0A2;
        User A2A;
        2WX r1;
        2WX A0R;
        2WX r12 = 2WX.A02;
        C244413b9 r25 = C244413b9.RELATIVE;
        Integer num2 = AnonymousClass05K.A0Y;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0d(num2, r25, 3));
        C70832Wc r44 = r46;
        long A0C2 = C244013aV.A0C(r44, R.dimen.abc_select_dialog_padding_start_material);
        Integer num3 = AnonymousClass05K.A01;
        2WX A002 = AnonymousClass9JR.A00(A0X, num3, 0, A0C2);
        if (num.intValue() != 0) {
            A062 = 9221401712017801216L;
            if (!A0D(C51969G9p.A0K(r44)) || !AnonymousClass7TE.A1a(((0eP) this.A01.A03).A00)) {
                j = C244013aV.A06(r44);
            } else {
                j = 9221401712017801216L;
            }
        } else {
            A062 = C244013aV.A06(r44);
            j = 9221401712017801216L;
        }
        Integer num4 = AnonymousClass05K.A08;
        2WX A0F = C51974G9v.A0F(A002, C51965G9l.A0c(num4, 0, A062), 0, j);
        Integer num5 = AnonymousClass05K.A00;
        2WX A0X2 = C51971G9r.A0X(A0F, num5, 100.0f, 0);
        C243573Zh r39 = C243573Zh.CENTER;
        2Wb A0M = C51973G9u.A0M(r44);
        1Xj r43 = r47;
        if (z) {
            if (!z2) {
                r1 = C51973G9u.A0W(C51973G9u.A0W((2WX) null, A0M, num3, R.dimen.asset_picker_redesign_sticker_height, 0), A0M, num5, R.dimen.asset_picker_redesign_sticker_height, 0);
            } else {
                UserSession userSession = this.A04;
                if (182.A06(C51965G9l.A0Z(userSession, 0), userSession, 2342162249102400556L)) {
                    r1 = C51973G9u.A0W((2WX) null, A0M, num3, R.dimen.abc_star_medium, 0);
                } else {
                    r1 = r12;
                }
            }
            AnonymousClass9JQ A0b = C51965G9l.A0b(num3, 0.0f, 1);
            if (r1 == r12) {
                r1 = null;
            }
            2WX A0X3 = C51965G9l.A0X(r1, A0b);
            Integer num6 = AnonymousClass05K.A0C;
            2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(C51971G9r.A0X(A0X3, num6, 0.0f, 1), AnonymousClass05K.A1F, J6E.A00(this, 26), 4), num4, "reels_multi_ads_card_profile_image", 4);
            2Wb A0w = G9t.A0w(A0M);
            if (z2) {
                A0R = C51973G9u.A0R(C51973G9u.A0W(C51973G9u.A0W((2WX) null, A0w, num5, R.dimen.abc_select_dialog_padding_start_material, 0), A0w, num3, R.dimen.abc_select_dialog_padding_start_material, 0), C51967G9n.A0U(0, C244013aV.A06(A0w)), 0, C51969G9p.A0D());
            } else {
                A0R = C51973G9u.A0R(C51973G9u.A0W(C51973G9u.A0W((2WX) null, A0w, num5, R.dimen.asset_picker_section_title_horizontal_padding, 0), A0w, num3, R.dimen.asset_picker_section_title_horizontal_padding, 0), C51967G9n.A0U(0, C244013aV.A06(A0w)), 0, C244013aV.A06(A0w));
            }
            2WX A0O = C51974G9v.A0O(A0R, num3, num6, 0.0f, 1);
            User A2A2 = r43.A2A(this.A04);
            if (A2A2 != null) {
                ImageUrl Bh3 = A2A2.Bh3();
                AnonymousClass4DU r9 = this.A05;
                Context context = A0w.A00.A0C;
                A0w.A00(new C244443bC(A0O, r9, Bh3, (AnonymousClass3NK) null, C51968G9o.A05(context, A0w), 0, C51968G9o.A05(context, A0w), false, false, false));
                A0M.A00(C243563Zg.A0H(A0w, A0M, A0Y, (C243573Zh) null, r39, (C243583Zi) null, (C244343b2) null, true));
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        2WX A0Y2 = C51971G9r.A0Y((2WX) null, num2, r25, 3);
        UserSession userSession2 = this.A04;
        0Tu A0Z = C51965G9l.A0Z(userSession2, 0);
        if (182.A06(A0Z, userSession2, 2342162249102400556L)) {
            A0Y2 = C51973G9u.A0W(A0Y2, A0M, num3, R.dimen.abc_star_medium, 0);
        }
        2WX A0X4 = C51971G9r.A0X(A0Y2, num3, 1.0f, 1);
        Integer num7 = AnonymousClass05K.A0C;
        2WX A0X5 = C51971G9r.A0X(A0X4, num7, 1.0f, 1);
        if (!z) {
            A0A2 = C244013aV.A06(A0M);
        } else if (z4) {
            A0A2 = C244013aV.A09(A0M);
        } else {
            A0A2 = C244013aV.A0A(A0M);
        }
        2WX A0R2 = C51972G9s.A0R(A0X5, 0, A0A2);
        if (z2) {
            A0R2 = C51973G9u.A0Z(A0R2, J6E.A00(this, 27));
        }
        2WX A0Y3 = C51971G9r.A0Y(A0R2, num4, "reels_multi_ads_card_username", 4);
        2Wb A0w2 = G9t.A0w(A0M);
        2WX A0Y4 = C51971G9r.A0Y((2WX) null, num2, r25, 3);
        if (z3) {
            2WX A0Q = C51973G9u.A0Q(A0Y4, C51967G9n.A0S(0, C244013aV.A0A(A0w2)), 0, C244013aV.A07(A0w2));
            float[] fArr = new float[8];
            int i = 0;
            do {
                fArr[i] = (float) C61380mr.A01(C51966G9m.A0O(A0w2), 32);
                i++;
            } while (i < 8);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
            shapeDrawable.setAlpha(178);
            C51972G9s.A0w(shapeDrawable, A0w2, R.color.black);
            A0Y4 = C51971G9r.A0Y(A0Q, num5, shapeDrawable, 4);
        }
        2Wb A0w3 = G9t.A0w(A0w2);
        if (z2) {
            User A2A3 = r43.A2A(userSession2);
            if (A2A3 != null) {
                String username = A2A3.getUsername();
                2V1 r122 = A0w3.A00;
                Context context2 = r122.A0C;
                int A052 = C51968G9o.A05(context2, A0w3);
                Typeface A032 = 0oh.A03(context2, Typeface.DEFAULT, num3);
                long A063 = C244013aV.A06(A0w3);
                long A0D2 = C51969G9p.A0D();
                C244103ae A0b2 = C51971G9r.A0b(r122, (2V5) null, username, 0);
                C51973G9u.A17(A0w3, A0b2, A052, A063);
                A0b2.A0R(0);
                G9w.A12(A032, A0w3, A0b2, A0D2);
                C51970G9q.A1K(A0b2, num5, num3);
                C51972G9s.A17(A0b2);
                A0b2.A0b(true);
                G9t.A1N(A0b2, false);
                C51967G9n.A1G(A0w3, A0b2);
                1Xj r0 = this.A02.A02;
                if (r0 != null && (A2A = r0.A2A(userSession2)) != null && A2A.isVerified() && 182.A06(A0Z, userSession2, 2342162249101876260L)) {
                    2WX A0S = C51972G9s.A0S(C51973G9u.A0V(C51973G9u.A0V(C51971G9r.A0Y((2WX) null, num2, r25, 3), A0w3, num3, 0), A0w3, num5, 0), 0, C244013aV.A05(A0w3));
                    Drawable mutate = C244273av.A00(C243803a8.A00(A0w3)).mutate();
                    2V1 Aqq = A0w3.Aqq();
                    Context A0B2 = C51965G9l.A0B(Aqq);
                    mutate.setBounds(0, 0, C61380mr.A01(A0B2, 12), C61380mr.A01(A0B2, 12));
                    C51974G9v.A0h(mutate, Aqq, A0w3, A0S);
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        2Wb r02 = A0w2;
        C51971G9r.A1E(C243563Zg.A0G(A0w3, r02, A0Y4), r02, A0M, A0Y3);
        2WX A0Y5 = C51971G9r.A0Y((2WX) null, num2, r25, 3);
        int i2 = R.dimen.account_group_management_clickable_width;
        if (z2) {
            i2 = R.dimen.abc_star_medium;
        }
        2WX A0W = C51973G9u.A0W(A0Y5, A0M, num5, i2, 0);
        int i3 = R.dimen.account_group_management_clickable_width;
        if (z2) {
            i3 = R.dimen.abc_star_medium;
        }
        C51969G9p.A13(C244013aV.A0D(A0M, R.drawable.instagram_more_vertical_outline_44), (ImageView.ScaleType) null, A0M, C51972G9s.A0V(C51974G9v.A0O(C51973G9u.A0W(A0W, A0M, num3, i3, 0), num3, num7, 0.0f, 1), J6E.A00(this, 28)));
        return C243563Zg.A0G(A0M, r44, A0X2);
    }

    public static final String A08(AnonymousClass3OA r1) {
        List C7t;
        String str;
        C257913yA r0 = r1.A0N;
        if (r0 != null && (C7t = r0.C7t()) != null && (str = (String) AnonymousClass7TE.A13(C7t)) != null) {
            return str;
        }
        C247733gp A1T = r1.A0K.A1T();
        if (A1T != null) {
            return A1T.A0d;
        }
        return null;
    }

    public static final void A0A(View view, C53929GwZ gwZ, Integer num) {
        C51984GAh gAh = gwZ.A06;
        C52058GDe gDe = gwZ.A03;
        int A092 = gDe.A09();
        C267324bN r4 = gwZ.A02;
        gAh.A03(r4, num, A092);
        C238833Dp.A00(gwZ.A04).A07(view, C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, new String[0], 1);
        gwZ.A07.D3Z((JPD) null, r4, gDe, (2EG) null, false, gwZ.A05.getModuleName(), (String) null, 0.0f, 0.0f, false, false);
    }

    public static final void A0C(C53929GwZ gwZ) {
        C230292pL r3;
        C267324bN r4 = gwZ.A02;
        if (r4.A03().A00 == 10) {
            UserSession userSession = gwZ.A04;
            if (182.A06(C51968G9o.A0b(userSession), userSession, 36319239892245583L) && (r3 = gwZ.A0D) != null) {
                r3.A03(C51966G9m.A1B(r4), r4.A03().A01.A02, "1027920312221535");
            }
        }
    }

    private final boolean A0D(Context context) {
        C267324bN r4 = this.A02;
        1Xj A0s = C51966G9m.A0s(r4);
        List A042 = r4.A06().A04();
        UserSession userSession = this.A04;
        AndroidLink A012 = AnonymousClass47K.A01(context, userSession, A0s, A042, false);
        if (r4.A06().A0d == null || A012 == null || !182.A06(C51965G9l.A0Z(userSession, 0), userSession, 2342162249102269482L)) {
            return false;
        }
        return true;
    }

    public static void A0B(2Wb r3, int i, boolean z) {
        r3.A00(A00(r3, C55403Hh9.A00, C244013aV.A0C(r3, i), z));
    }
}
