package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.GwX  reason: case insensitive filesystem */
public final class C53927GwX extends C251343mx {
    public final JPE A00;
    public final C267324bN A01;
    public final C52058GDe A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final C55753Hmo A05;
    public final boolean A06;
    public final String A07;

    public C53927GwX(JPE jpe, C267324bN r3, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r6, C55753Hmo hmo, String str, boolean z) {
        DbW.A1N(userSession, 1, r6);
        this.A03 = userSession;
        this.A01 = r3;
        this.A02 = gDe;
        this.A00 = jpe;
        this.A04 = r6;
        this.A06 = z;
        this.A07 = str;
        this.A05 = hmo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:174:0x07df, code lost:
        if (r10 != 3) goto L_0x07e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x082a, code lost:
        if (r0 != null) goto L_0x07c5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0840, code lost:
        if (r0 != null) goto L_0x0717;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x08ba, code lost:
        if (r0 != null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x08d2, code lost:
        if (r0 != null) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x08fa, code lost:
        if (r0 != null) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e3, code lost:
        if (r6.A2K != false) goto L_0x00e5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0494  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x04fa  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0513  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x053e  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x0549  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x054c  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x07ae  */
    /* JADX WARNING: Removed duplicated region for block: B:164:0x07bc  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x07d5  */
    /* JADX WARNING: Removed duplicated region for block: B:181:0x07ee  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x0824  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0826  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0839  */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x08b9  */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x08be  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x08c1  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x08c7  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x08ed  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00cb  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00e0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0215  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x026f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x027c  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x03c6  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x0407  */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x042f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r66) {
        /*
            r65 = this;
            r1 = 0
            r63 = r66
            r0 = r63
            X.0qQ.A0B(r0, r1)
            java.lang.Integer r28 = X.AnonymousClass05K.A04
            X.AnonymousClass2yJ.A00(r28)
            r64 = r65
            r0 = r64
            com.instagram.common.session.UserSession r0 = r0.A03
            r57 = r0
            X.0Tu r10 = X.0Tu.A06
            r2 = 36315133900164110(0x81046c00170c0e, double:3.029175135546263E-306)
            boolean r0 = X.182.A06(r10, r0, r2)
            r4 = 0
            if (r0 != 0) goto L_0x0909
            X.Iuj r2 = X.C58612Iuj.A00
            r0 = r63
            X.2Wa r43 = X.C243643Zq.A00(r0, r2)
            boolean r0 = X.C51969G9p.A1V(r43)
            if (r0 != 0) goto L_0x0909
            r0 = r64
            X.4bN r0 = r0.A01
            r56 = r0
            X.3OA r9 = r56.A07()
            if (r9 == 0) goto L_0x0909
            X.Iui r2 = X.C58611Iui.A00
            r0 = r63
            X.3Zt r40 = X.C243633Zp.A00(r0, r2)
            X.4gF r0 = r9.A0F
            if (r0 == 0) goto L_0x08f1
            java.lang.String r2 = r0.A0L
            if (r2 == 0) goto L_0x08f1
            int r38 = android.graphics.Color.parseColor(r2)
        L_0x0051:
            java.lang.String r2 = r0.A0K
            if (r2 == 0) goto L_0x08fe
            int r15 = android.graphics.Color.parseColor(r2)
        L_0x0059:
            android.graphics.drawable.GradientDrawable$Orientation r14 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            X.JVb r3 = new X.JVb
            r3.<init>(r14)
            r35 = 1090519040(0x41000000, float:8.0)
            r2 = r63
            X.2V1 r2 = r2.A05
            r24 = r2
            android.content.Context r2 = r2.A0C
            X.0qQ.A07(r2)
            r5 = r35
            float r5 = X.C61380mr.A00(r2, r5)
            r3.setCornerRadius(r5)
            r3.setColor(r15)
            r5 = 1
            if (r0 == 0) goto L_0x009a
            java.lang.Boolean r6 = r0.A0C
            boolean r6 = X.AnonymousClass7TF.A1Y(r6, r5)
            if (r6 == 0) goto L_0x009a
            r6 = 1069547520(0x3fc00000, float:1.5)
            X.0qQ.A07(r2)
            float r6 = X.C61380mr.A00(r2, r6)
            int r8 = (int) r6
            r7 = 2131100861(0x7f0604bd, float:1.7814115E38)
            r6 = r63
            int r6 = X.C51969G9p.A08(r6, r7)
            r3.setStroke(r8, r6)
        L_0x009a:
            r6 = r64
            boolean r6 = r6.A06
            r21 = r6
            java.lang.Object[] r7 = X.C51968G9o.A1b(r21)
            r39 = 2
            X.IoL r6 = new X.IoL
            r36 = r6
            r37 = r15
            r41 = r64
            r42 = r3
            r36.<init>(r37, r38, r39, r40, r41, r42)
            r8 = r63
            X.C243773a4.A00(r8, r6, r7)
            r6 = r64
            X.4DU r6 = r6.A04
            r58 = r6
            X.GCs r12 = new X.GCs
            r7 = r57
            r12.<init>(r7, r6)
            r6 = r64
            java.lang.String r8 = r6.A07
            if (r8 == 0) goto L_0x08ed
            X.3Zd r13 = X.C243533Zd.GLOBAL
        L_0x00cd:
            r6 = 300(0x12c, float:4.2E-43)
            X.3Zd r7 = X.2Vi.A04
            X.4Ex r11 = new X.4Ex
            r11.<init>(r6)
            r6 = r64
            X.GDe r6 = r6.A02
            r62 = r6
            X.3W1 r6 = r6.A0E
            if (r6 == 0) goto L_0x00e5
            boolean r6 = r6.A2K
            r7 = 1
            if (r6 == 0) goto L_0x00e6
        L_0x00e5:
            r7 = 0
        L_0x00e6:
            java.lang.String r18 = "cta"
            if (r7 == 0) goto L_0x08e3
            if (r0 == 0) goto L_0x08e3
            java.lang.Integer r6 = r0.A0F
            if (r6 == 0) goto L_0x08e3
            int r6 = r6.intValue()
            if (r6 <= 0) goto L_0x08e3
            r6 = r8
            if (r8 != 0) goto L_0x00fb
            r6 = r18
        L_0x00fb:
            X.4Ey r7 = X.C51970G9q.A0b(r13, r6)
            r6 = 200(0xc8, float:2.8E-43)
            X.4F6 r6 = X.AnonymousClass4F6.A00(r2, r6)
            r7.A04(r6)
            r7.A02 = r11
        L_0x010a:
            r6 = r63
            X.AnonymousClass4F7.A00(r6, r7)
            if (r0 == 0) goto L_0x08c7
            java.lang.Integer r6 = r0.A0H
            if (r6 == 0) goto L_0x08c7
            int r6 = r6.intValue()
            X.0qQ.A07(r2)
            int r19 = X.C61380mr.A01(r2, r6)
        L_0x0120:
            java.lang.Integer r6 = r0.A0J
            if (r6 == 0) goto L_0x08d6
            int r6 = r6.intValue()
            int r34 = X.C61380mr.A01(r2, r6)
        L_0x012c:
            r6 = 36315133900753939(0x81046c00200c13, double:3.029175135919273E-306)
            r11 = r57
            boolean r52 = X.182.A06(r10, r11, r6)
            r23 = 1065353216(0x3f800000, float:1.0)
            r7 = r23
            r6 = r63
            X.2V5 r17 = X.C51968G9o.A0Z(r6, r7)
            r27 = 0
            r7 = r27
            X.2V5 r16 = X.C51968G9o.A0Z(r6, r7)
            X.HxS r48 = new X.HxS
            r48.<init>()
            java.lang.Object[] r7 = new java.lang.Object[r1]
            r26 = 3
            X.Ioc r6 = new X.Ioc
            r42 = r6
            r44 = r16
            r45 = r63
            r46 = r17
            r47 = r12
            r49 = r9
            r50 = r64
            r51 = r26
            r42.<init>(r43, r44, r45, r46, r47, r48, r49, r50, r51, r52)
            r10 = r63
            java.lang.Object r20 = X.AnonymousClass3Zw.A00(r10, r6, r7)
            r6 = r20
            X.GdV r6 = (X.C52839GdV) r6
            r20 = r6
            X.3XV r54 = X.2WX.A02
            r7 = 2131165205(0x7f070015, float:1.794462E38)
            long r11 = X.C244013aV.A0C(r10, r7)
            long r6 = X.C244013aV.A03(r63)
            java.lang.Integer r33 = X.AnonymousClass05K.A0E
            r10 = r33
            X.9JR r6 = X.C51965G9l.A0c(r10, r1, r6)
            X.2WX r11 = X.C51974G9v.A0F(r4, r6, r1, r11)
            if (r0 == 0) goto L_0x08c1
            java.lang.Boolean r6 = r0.A06
            boolean r6 = X.AnonymousClass7TF.A1Y(r6, r5)
            if (r6 == 0) goto L_0x08c1
            long r6 = X.C51969G9p.A0D()
        L_0x019a:
            java.lang.Integer r32 = X.AnonymousClass05K.A0u
            r10 = r32
            X.2WX r12 = X.AnonymousClass9JR.A00(r11, r10, r1, r6)
            if (r0 == 0) goto L_0x08be
            java.lang.Boolean r6 = r0.A0E
            boolean r6 = X.AnonymousClass7TF.A1Y(r6, r5)
            if (r6 == 0) goto L_0x08be
            r7 = 2131100847(0x7f0604af, float:1.7814087E38)
            if (r21 == 0) goto L_0x01b4
            r7 = 2131100263(0x7f060267, float:1.7812903E38)
        L_0x01b4:
            r6 = r63
            int r10 = X.C51969G9p.A08(r6, r7)
            r7 = 2131099778(0x7f060082, float:1.7811919E38)
            int r11 = X.C51969G9p.A08(r6, r7)
            android.content.res.ColorStateList r10 = android.content.res.ColorStateList.valueOf(r10)
            X.JVb r7 = new X.JVb
            r7.<init>(r14)
            r6 = r35
            float r6 = X.C61380mr.A00(r2, r6)
            r7.setCornerRadius(r6)
            r7.setColor(r11)
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[]{r7}
            java.util.ArrayList r7 = X.0sr.A1M(r6)
            android.graphics.drawable.Drawable[] r6 = new android.graphics.drawable.Drawable[r1]
            java.lang.Object[] r7 = r7.toArray(r6)
            android.graphics.drawable.Drawable[] r7 = (android.graphics.drawable.Drawable[]) r7
            android.graphics.drawable.LayerDrawable r6 = new android.graphics.drawable.LayerDrawable
            r6.<init>(r7)
            android.graphics.drawable.RippleDrawable r7 = new android.graphics.drawable.RippleDrawable
            r7.<init>(r10, r4, r6)
        L_0x01f0:
            java.lang.Integer r39 = X.AnonymousClass05K.A15
            r22 = 4
            r10 = r39
            r6 = r22
            X.2WX r11 = X.C51971G9r.A0Y(r12, r10, r7, r6)
            r6 = r19
            long r6 = (long) r6
            r30 = 9221401712017801216(0x7ff9000000000000, double:NaN)
            long r6 = r6 | r30
            java.lang.Integer r29 = X.AnonymousClass05K.A0Y
            r10 = r29
            X.2WX r10 = X.AnonymousClass9JR.A00(r11, r10, r1, r6)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            r7 = r22
            X.2WX r10 = X.C51971G9r.A0Y(r10, r6, r3, r7)
            if (r8 != 0) goto L_0x0217
            r8 = r18
        L_0x0217:
            r7 = r24
            X.2WX r11 = X.C51971G9r.A0V(r7, r10, r13, r8)
            java.lang.Integer r10 = X.AnonymousClass05K.A0D
            java.lang.String r8 = "clips_overlay_ad_cta_component"
            r7 = r22
            X.2WX r8 = X.C51971G9r.A0Y(r11, r10, r8, r7)
            X.IxW r7 = new X.IxW
            r41 = r7
            r42 = r15
            r43 = r38
            r44 = r5
            r45 = r64
            r46 = r3
            r47 = r40
            r41.<init>(r42, r43, r44, r45, r46, r47)
            r3 = r4
            X.2WX r10 = X.C51971G9r.A0Z(r8, r6, r7, r4)
            r7 = 5
            r8 = r20
            X.J6N r8 = X.J6N.A00(r8, r7)
            r7 = r28
            r11 = r22
            X.2WX r10 = X.C51971G9r.A0Y(r10, r7, r8, r11)
            java.lang.Integer r21 = X.AnonymousClass05K.A1F
            X.9JS r8 = new X.9JS
            r11 = r21
            r7 = r17
            r8.<init>(r7, r11)
            X.2WX r10 = X.C51974G9v.A0A(r7, r10, r8)
            java.lang.Integer r8 = X.AnonymousClass05K.A02
            r7 = r16
            X.2WX r25 = X.C51971G9r.A0W(r7, r10, r8)
            if (r0 == 0) goto L_0x08b9
            java.lang.Boolean r7 = r0.A06
            boolean r7 = X.AnonymousClass7TF.A1Y(r7, r5)
            if (r7 == 0) goto L_0x08b9
            X.IOx r13 = new X.IOx
            r3 = r34
            r13.<init>(r2, r9, r3)
        L_0x0276:
            com.instagram.api.schemas.OverlayAdsFormatEnum r3 = r0.A01
        L_0x0278:
            com.instagram.api.schemas.OverlayAdsFormatEnum r2 = com.instagram.api.schemas.OverlayAdsFormatEnum.NO_INFO
            if (r3 != r2) goto L_0x054c
            X.3Zi r18 = X.C243583Zi.FLEX_START
            X.2Wb r17 = X.C51973G9u.A0K(r63)
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            r2 = r23
            X.2WX r16 = X.C51971G9r.A0X(r4, r7, r2, r5)
            X.2Wb r14 = X.G9t.A0w(r17)
            r35 = r64
            r36 = r14
            r37 = r13
            r38 = r9
            r39 = r20
            r40 = r34
            X.3aQ r2 = r35.A04(r36, r37, r38, r39, r40)
            r14.A00(r2)
            long r2 = X.C244013aV.A06(r14)
            X.9JR r3 = X.C51967G9n.A0U(r1, r2)
            r2 = r23
            X.2WX r15 = X.C51973G9u.A0S(r4, r3, r7, r2, r5)
            X.3Zh r38 = X.C243573Zh.FLEX_START
            X.3Zi r24 = X.C243583Zi.CENTER
            X.2Wb r13 = X.G9t.A0w(r14)
            X.2WX r12 = X.G9t.A0y(r4, r6, r1)
            X.2Wb r11 = X.C51973G9u.A0L(r13)
            r3 = r64
            r2 = r20
            X.2Tp r2 = r3.A05(r11, r9, r2)
            r11.A00(r2)
            r2 = r56
            X.1Xj r3 = r2.A02
            if (r3 == 0) goto L_0x0304
            r2 = r57
            com.instagram.user.model.User r2 = r3.A2A(r2)
            if (r2 == 0) goto L_0x0304
            boolean r2 = r2.isVerified()
            if (r2 != r5) goto L_0x0304
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            r2 = r27
            X.2WX r10 = X.C51971G9r.A0X(r4, r3, r2, r5)
            long r2 = X.C244013aV.A05(r11)
            r8 = r32
            X.2WX r8 = X.AnonymousClass9JR.A00(r10, r8, r1, r2)
            android.content.Context r2 = X.C243803a8.A00(r11)
            android.graphics.drawable.BitmapDrawable r2 = X.C244273av.A00(r2)
            android.graphics.drawable.Drawable r3 = r2.mutate()
            X.AnonymousClass7TG.A13(r3)
            X.2V1 r2 = r11.A00
            X.C51974G9v.A0h(r3, r2, r11, r8)
        L_0x0304:
            X.C51967G9n.A1E(r11, r13, r12)
            X.2WW r2 = A06(r13, r9)
            r13.A00(r2)
            r3 = r38
            r2 = r24
            X.2Tl r2 = X.C243563Zg.A07(r13, r14, r15, r3, r2)
            r14.A00(r2)
            java.lang.Integer r37 = X.AnonymousClass05K.A0C
            r3 = r27
            r2 = r37
            X.2WX r10 = X.C51971G9r.A0X(r4, r2, r3, r5)
            long r2 = X.C244013aV.A03(r14)
            r8 = r33
            X.2WX r40 = X.AnonymousClass9JR.A00(r10, r8, r1, r2)
            X.3Ds r39 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            X.ILB r3 = new X.ILB
            r2 = r64
            r3.<init>(r9, r2, r1)
            r41 = r3
            r42 = r56
            r43 = r57
            r44 = r58
            r45 = r4
            r46 = r1
            r47 = r1
            X.2WX r10 = X.GFM.A00(r39, r40, r41, r42, r43, r44, r45, r46, r47)
            r2 = 46
            r3 = r20
            X.J6E r8 = X.J6E.A00(r3, r2)
            r3 = r28
            r2 = r22
            X.2WX r29 = X.C51971G9r.A0Y(r10, r3, r8, r2)
            X.2Wb r12 = X.C51973G9u.A0L(r14)
            java.lang.String r13 = r9.A0d
            if (r13 != 0) goto L_0x0367
            r2 = 2131963536(0x7f132e90, float:1.9563828E38)
            java.lang.String r13 = X.C244013aV.A0E(r12, r2)
        L_0x0367:
            long r8 = X.C244013aV.A08(r12)
            X.2V1 r11 = r12.A00
            android.content.Context r3 = r11.A0C
            r2 = 2130970247(0x7f040687, float:1.7549199E38)
            int r15 = X.C51968G9o.A08(r3, r12, r2)
            android.graphics.Typeface r10 = android.graphics.Typeface.DEFAULT
            long r2 = X.C51969G9p.A0D()
            X.3ae r11 = X.C51971G9r.A0b(r11, r4, r13, r1)
            X.C51973G9u.A17(r12, r11, r15, r8)
            r11.A0R(r5)
            X.G9w.A12(r10, r12, r11, r2)
            r11.A0W(r6)
            r2 = r23
            X.C51974G9v.A13(r11, r6, r2)
            r11.A05(r4)
            X.C51967G9n.A1G(r12, r11)
            r2 = r29
            X.2Tp r2 = X.C243563Zg.A0C(r12, r14, r2)
        L_0x039d:
            r14.A00(r2)
            long r2 = X.C51969G9p.A0G(r19)
            X.2WX r8 = X.AnonymousClass9JR.A00(r4, r7, r1, r2)
            long r2 = X.C244013aV.A0A(r14)
            X.2WX r9 = X.AnonymousClass9JR.A00(r8, r6, r1, r2)
            if (r0 == 0) goto L_0x0549
            java.lang.Boolean r2 = r0.A0D
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r5)
            boolean r2 = X.0qQ.A0K(r2, r3)
            if (r2 == 0) goto L_0x0549
            java.lang.Boolean r2 = r0.A08
            boolean r2 = X.0qQ.A0K(r2, r3)
            if (r2 == 0) goto L_0x0549
            r3 = r20
            r2 = r22
            X.J6N r8 = X.J6N.A00(r3, r2)
            r3 = r28
            X.2WX r2 = X.C51971G9r.A0Y(r4, r3, r8, r2)
        L_0x03d4:
            X.2WX r3 = r9.A00(r2)
            X.2Wb r2 = X.C51973G9u.A0M(r14)
            X.2Tl r2 = X.C243563Zg.A03(r2, r14, r3)
            r14.A00(r2)
            long r2 = X.C51969G9p.A0G(r19)
            java.lang.Integer r8 = X.AnonymousClass05K.A0j
            X.2WX r8 = X.AnonymousClass9JR.A00(r4, r8, r1, r2)
            long r2 = X.C244013aV.A0B(r14)
            r9 = r21
            X.2WX r8 = X.AnonymousClass9JR.A00(r8, r9, r1, r2)
            r3 = r20
            r2 = r26
            X.J6N r3 = X.J6N.A00(r3, r2)
            r2 = r28
            X.2WX r8 = X.G9t.A10(r8, r2, r3)
            if (r0 == 0) goto L_0x053e
            java.lang.Boolean r0 = r0.A0D
            boolean r9 = X.DbX.A1a(r0)
            if (r9 == 0) goto L_0x053f
            r0 = 1120403456(0x42c80000, float:100.0)
            X.2WX r3 = X.C51971G9r.A0X(r4, r7, r0, r1)
            if (r52 == 0) goto L_0x053b
            r2 = r38
            r0 = r26
            X.2WX r0 = X.C51971G9r.A0Y(r4, r6, r2, r0)
        L_0x041f:
            X.2WX r0 = r3.A00(r0)
        L_0x0423:
            X.2WX r13 = r8.A00(r0)
            X.3Zi r12 = X.C243583Zi.SPACE_BETWEEN
            X.2Wb r0 = X.C51973G9u.A0M(r14)
            if (r9 == 0) goto L_0x0492
            r9 = 2131165205(0x7f070015, float:1.794462E38)
            long r2 = X.C244013aV.A0C(r0, r9)
            X.2WX r3 = X.AnonymousClass9JR.A00(r4, r6, r1, r2)
            r8 = 48
            r2 = r20
            X.J6E r8 = X.J6E.A00(r2, r8)
            r2 = r28
            X.2WX r10 = X.G9t.A10(r3, r2, r8)
            r8 = 1120403456(0x42c80000, float:100.0)
            if (r52 == 0) goto L_0x052b
            X.2WX r2 = X.C51973G9u.A0W(r4, r0, r7, r9, r1)
        L_0x0450:
            X.2WX r31 = r10.A00(r2)
            X.3Zh r32 = X.C243573Zh.CENTER
            X.2Wb r11 = X.C51973G9u.A0L(r0)
            X.2WX r9 = X.C51973G9u.A0V(r4, r11, r6, r1)
            r3 = r27
            r2 = r37
            X.9JQ r2 = X.C51965G9l.A0b(r2, r3, r5)
            X.2WX r10 = X.C51973G9u.A0S(r9, r2, r7, r8, r1)
            r2 = 2131239024(0x7f082070, float:1.8094343E38)
            android.graphics.drawable.Drawable r9 = X.C51968G9o.A0K(r11, r2)
            X.2V1 r8 = r11.A00
            android.content.Context r3 = r8.A0C
            int r2 = X.2Yu.A05(r3)
            X.DbX.A11(r3, r9, r2)
            X.C51974G9v.A0h(r9, r8, r11, r10)
            r30 = r0
            r33 = r4
            r34 = r24
            r35 = r4
            r36 = r1
            r29 = r11
            X.2Tp r2 = X.C243563Zg.A0H(r29, r30, r31, r32, r33, r34, r35, r36)
            r0.A00(r2)
        L_0x0492:
            if (r52 != 0) goto L_0x04ed
            r8 = 1120403456(0x42c80000, float:100.0)
            X.2WX r9 = X.C51971G9r.A0X(r4, r7, r8, r1)
            r2 = 2131165205(0x7f070015, float:1.794462E38)
            long r2 = X.C244013aV.A0C(r0, r2)
            X.2WX r3 = X.AnonymousClass9JR.A00(r9, r6, r1, r2)
            r2 = 49
            r9 = r20
            X.J6E r9 = X.J6E.A00(r9, r2)
            r2 = r28
            X.2WX r28 = X.G9t.A10(r3, r2, r9)
            X.3Zh r29 = X.C243573Zh.CENTER
            X.2Wb r9 = X.C51973G9u.A0L(r0)
            r3 = r27
            r2 = r37
            X.9JQ r2 = X.C51965G9l.A0b(r2, r3, r5)
            X.2WX r8 = X.C51973G9u.A0S(r4, r2, r7, r8, r1)
            r2 = 2131238566(0x7f081ea6, float:1.8093414E38)
            android.graphics.drawable.Drawable r7 = X.C51968G9o.A0K(r9, r2)
            X.2V1 r5 = r9.A00
            android.content.Context r3 = r5.A0C
            int r2 = X.2Yu.A05(r3)
            X.DbX.A11(r3, r7, r2)
            X.C51974G9v.A0h(r7, r5, r9, r8)
            r27 = r0
            r30 = r4
            r31 = r24
            r32 = r4
            r33 = r1
            r26 = r9
            X.2Tp r2 = X.C243563Zg.A0H(r26, r27, r28, r29, r30, r31, r32, r33)
            r0.A00(r2)
        L_0x04ed:
            X.2Tl r0 = X.C243563Zg.A07(r0, r14, r13, r4, r12)
            r14.A00(r0)
            r0 = r64
            X.JPE r5 = r0.A00
            if (r5 != 0) goto L_0x0513
            X.3XA r3 = new X.3XA
            r3.<init>()
        L_0x04ff:
            r2 = r17
            r1 = r16
            r0 = r18
            X.C51971G9r.A1G(r3, r14, r2, r1, r0)
            r3 = r2
            r2 = r25
            r1 = r0
            r0 = r63
            X.2Tp r0 = X.C243563Zg.A0K(r3, r0, r2, r1)
            return r0
        L_0x0513:
            r2 = 1120403456(0x42c80000, float:100.0)
            X.9JQ r0 = X.C51965G9l.A0b(r6, r2, r1)
            X.2WX r0 = X.C51974G9v.A0D(r4, r0, r2, r1)
            X.2WX r2 = X.C51974G9v.A0B(r0)
            X.GNv r3 = new X.GNv
            r1 = r62
            r0 = r56
            r3.<init>(r2, r5, r0, r1)
            goto L_0x04ff
        L_0x052b:
            long r2 = X.C244013aV.A0A(r0)
            java.lang.Integer r9 = X.AnonymousClass05K.A0A
            X.9JR r2 = X.C51965G9l.A0c(r9, r1, r2)
            X.2WX r2 = X.C51973G9u.A0S(r4, r2, r7, r8, r1)
            goto L_0x0450
        L_0x053b:
            r0 = r4
            goto L_0x041f
        L_0x053e:
            r9 = 0
        L_0x053f:
            long r2 = X.C51967G9n.A07(r14)
            X.2WX r0 = X.AnonymousClass9JR.A00(r4, r7, r1, r2)
            goto L_0x0423
        L_0x0549:
            r2 = r4
            goto L_0x03d4
        L_0x054c:
            if (r0 == 0) goto L_0x08b5
            com.instagram.api.schemas.OverlayAdsFormatEnum r2 = r0.A01
            r36 = r2
        L_0x0552:
            X.3Zi r18 = X.C243583Zi.FLEX_START
            X.2Wb r17 = X.C51973G9u.A0K(r63)
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            r2 = r23
            X.2WX r16 = X.C51971G9r.A0X(r4, r7, r2, r5)
            X.2Wb r14 = X.G9t.A0w(r17)
            if (r0 == 0) goto L_0x08b2
            com.instagram.api.schemas.OverlayAdTapDestinationEnum r3 = r0.A00
        L_0x0568:
            com.instagram.api.schemas.OverlayAdTapDestinationEnum r2 = com.instagram.api.schemas.OverlayAdTapDestinationEnum.WATCH_AND_BROWSE
            if (r3 != r2) goto L_0x08a2
            java.lang.Integer r15 = X.AnonymousClass05K.A0C
            r2 = r27
            X.2WX r8 = X.C51971G9r.A0X(r4, r15, r2, r5)
            r2 = r34
            long r2 = (long) r2
            long r2 = r2 | r30
            X.2WX r8 = X.AnonymousClass9JR.A00(r8, r7, r1, r2)
            X.2WX r41 = X.AnonymousClass9JR.A00(r8, r6, r1, r2)
            X.3Ds r40 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            X.ILB r11 = new X.ILB
            r10 = r64
            r8 = r26
            r11.<init>(r9, r10, r8)
            r42 = r11
            r43 = r56
            r44 = r57
            r45 = r58
            r46 = r4
            r47 = r1
            r48 = r1
            X.2WX r12 = X.GFM.A00(r40, r41, r42, r43, r44, r45, r46, r47, r48)
            r8 = r20
            X.J6N r11 = X.J6N.A00(r8, r5)
            r10 = r28
            r8 = r22
            X.2WX r24 = X.C51971G9r.A0Y(r12, r10, r11, r8)
            X.2Wb r8 = X.C51973G9u.A0L(r14)
            X.1Xj r11 = r9.A0K
            r10 = r34
            com.instagram.model.mediasize.ExtendedImageUrl r44 = r11.A1m(r10)
            if (r44 == 0) goto L_0x089f
            if (r0 == 0) goto L_0x0851
            java.lang.Boolean r10 = r0.A06
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r5)
            boolean r10 = X.0qQ.A0K(r10, r12)
            if (r10 == 0) goto L_0x0851
            X.2Wb r10 = X.G9t.A0w(r8)
            r11 = r27
            X.2WX r11 = X.C51971G9r.A0X(r4, r15, r11, r5)
            X.2WX r11 = X.AnonymousClass9JR.A00(r11, r7, r1, r2)
            X.2WX r42 = X.AnonymousClass9JR.A00(r11, r6, r1, r2)
            android.widget.ImageView$ScaleType r41 = android.widget.ImageView.ScaleType.CENTER_CROP
            X.GYW r2 = new X.GYW
            r40 = r2
            r43 = r58
            r45 = r4
            r47 = r13
            r48 = r4
            r49 = r26
            r50 = r1
            r51 = r1
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51)
            r10.A00(r2)
            X.3b9 r11 = X.C244413b9.ABSOLUTE
            r3 = r29
            r2 = r26
            X.2WX r11 = X.C51971G9r.A0Y(r4, r3, r11, r2)
            java.lang.Boolean r2 = r0.A0C
            boolean r2 = X.0qQ.A0K(r2, r12)
            if (r2 == 0) goto L_0x0613
            r2 = 2131165237(0x7f070035, float:1.7944685E38)
            long r2 = X.C244013aV.A0C(r10, r2)
            java.lang.Integer r12 = X.AnonymousClass05K.A0G
            X.2WX r11 = X.AnonymousClass9JR.A00(r11, r12, r1, r2)
        L_0x0613:
            X.2V1 r13 = r10.A00
            android.content.Context r12 = X.C51965G9l.A0B(r13)
            r3 = 2131099784(0x7f060088, float:1.781193E38)
            X.2V4 r2 = r10.Bnf()
            int r3 = r2.A02(r3)
            r2 = r35
            float r2 = X.C61380mr.A00(r12, r2)
            android.graphics.drawable.ShapeDrawable r2 = A00(r12, r9, r2, r3)
            X.C51974G9v.A0h(r2, r13, r10, r11)
            X.2Tl r2 = X.C243563Zg.A00(r10)
        L_0x0635:
            r8.A00(r2)
            X.2WX r10 = X.C51973G9u.A0V(r4, r8, r6, r1)
            long r2 = X.C244013aV.A06(r8)
            X.9JR r3 = X.C51965G9l.A0c(r7, r1, r2)
            r2 = r27
            X.2WX r2 = X.C51973G9u.A0S(r10, r3, r15, r2, r5)
            X.2WX r11 = X.G9t.A0y(r2, r7, r1)
            X.3b9 r10 = X.C244413b9.ABSOLUTE
            r3 = r29
            r2 = r26
            X.2WX r12 = X.C51971G9r.A0Y(r11, r3, r10, r2)
            r2 = 2131238650(0x7f081efa, float:1.8093585E38)
            android.graphics.drawable.Drawable r11 = X.C51968G9o.A0K(r8, r2)
            X.2V1 r10 = r8.A00
            android.content.Context r3 = r10.A0C
            int r2 = X.2Yu.A05(r3)
            X.DbX.A11(r3, r11, r2)
            X.C51974G9v.A0h(r11, r10, r8, r12)
            r3 = r18
            r2 = r24
            X.2Tl r2 = X.C243563Zg.A08(r8, r14, r2, r3)
        L_0x0675:
            r14.A00(r2)
            r10 = 1120403456(0x42c80000, float:100.0)
            X.2WX r8 = X.C51971G9r.A0X(r4, r6, r10, r1)
            long r2 = X.C244013aV.A06(r14)
            X.2WX r35 = X.C51972G9s.A0S(r8, r1, r2)
            X.3Zh r38 = X.C243573Zh.FLEX_START
            X.3Zi r24 = X.C243583Zi.CENTER
            X.2Wb r8 = X.G9t.A0w(r14)
            X.2WX r34 = X.C51971G9r.A0X(r4, r6, r10, r1)
            X.2V1 r33 = r8.Aqq()
            X.2Wb r12 = X.AnonymousClass7TG.A0S(r33)
            r3 = r64
            r2 = r20
            X.2Tp r2 = r3.A05(r12, r9, r2)
            r12.A00(r2)
            java.lang.Integer r37 = X.AnonymousClass05K.A0C
            r3 = r27
            r2 = r37
            X.2WX r11 = X.C51971G9r.A0X(r4, r2, r3, r5)
            long r2 = X.C244013aV.A05(r12)
            r10 = r28
            X.2WX r32 = X.AnonymousClass9JR.A00(r11, r10, r1, r2)
            X.2V1 r2 = r12.A00
            r40 = r2
            X.2Wb r11 = X.AnonymousClass7TG.A0S(r40)
            r2 = r56
            X.1Xj r3 = r2.A02
            if (r3 == 0) goto L_0x06fb
            r2 = r57
            com.instagram.user.model.User r2 = r3.A2A(r2)
            if (r2 == 0) goto L_0x06fb
            boolean r2 = r2.isVerified()
            if (r2 != r5) goto L_0x06fb
            r3 = r27
            r2 = r37
            X.2WX r13 = X.C51971G9r.A0X(r4, r2, r3, r5)
            long r2 = X.C244013aV.A05(r11)
            r10 = r21
            X.2WX r10 = X.AnonymousClass9JR.A00(r13, r10, r1, r2)
            android.content.Context r2 = X.C243803a8.A00(r11)
            android.graphics.drawable.BitmapDrawable r2 = X.C244273av.A00(r2)
            android.graphics.drawable.Drawable r3 = r2.mutate()
            X.AnonymousClass7TG.A13(r3)
            X.2V1 r2 = r11.A00
            X.C51974G9v.A0h(r3, r2, r11, r10)
        L_0x06fb:
            r2 = 2131974141(0x7f1357fd, float:1.9585338E38)
            java.lang.String r15 = X.C244013aV.A0E(r11, r2)
            if (r0 == 0) goto L_0x083c
            X.DSj r2 = r0.A04
            if (r2 == 0) goto L_0x083c
            java.lang.Integer r2 = r2.Bwe()
            if (r2 == 0) goto L_0x083c
            int r2 = r2.intValue()
            float r2 = (float) r2
            long r2 = X.C51972G9s.A0G(r2)
        L_0x0717:
            X.DSj r10 = r0.A04
            if (r10 == 0) goto L_0x0844
            java.lang.String r10 = r10.getColor()
            if (r10 == 0) goto L_0x0844
            int r13 = android.graphics.Color.parseColor(r10)
        L_0x0725:
            android.graphics.Typeface r31 = android.graphics.Typeface.DEFAULT
            long r29 = X.C51969G9p.A0D()
            X.2V1 r10 = r11.A00
            X.3ae r10 = X.C51971G9r.A0b(r10, r4, r15, r1)
            X.C51973G9u.A17(r11, r10, r13, r2)
            r10.A0R(r1)
            r13 = r31
            r2 = r29
            X.G9w.A12(r13, r11, r10, r2)
            r10.A0W(r6)
            r2 = r23
            X.C51974G9v.A14(r10, r6, r2, r1, r5)
            r10.A05(r4)
            X.2WW r3 = r10.A0A()
            r2 = r32
            X.C51971G9r.A1C(r3, r11, r12, r2)
            r3 = r27
            r2 = r37
            X.2WX r10 = X.C51971G9r.A0X(r4, r2, r3, r5)
            X.2Wb r3 = X.AnonymousClass7TG.A0S(r40)
            X.2WW r2 = A06(r3, r9)
            X.C51971G9r.A1C(r2, r3, r12, r10)
            r2 = r34
            r3 = r18
            X.2Tp r2 = X.C243563Zg.A0K(r12, r8, r2, r3)
            r8.A00(r2)
            if (r0 == 0) goto L_0x0781
            java.lang.Integer r2 = r0.A0I
            if (r2 == 0) goto L_0x0781
            int r2 = r2.intValue()
            double r2 = (double) r2
            r10 = r39
            X.2WX r54 = X.C51973G9u.A0X(r4, r10, r2, r1)
        L_0x0781:
            X.3Ds r53 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            X.ILB r3 = new X.ILB
            r2 = r64
            r3.<init>(r9, r2, r5)
            r55 = r3
            r59 = r4
            r60 = r1
            r61 = r1
            X.2WX r11 = X.GFM.A00(r53, r54, r55, r56, r57, r58, r59, r60, r61)
            r3 = 47
            r2 = r20
            X.J6E r10 = X.J6E.A00(r2, r3)
            r3 = r28
            r2 = r22
            X.2WX r15 = X.C51971G9r.A0Y(r11, r3, r10, r2)
            X.1Xj r2 = r9.A0K
            X.3gp r2 = r2.A1T()
            if (r2 == 0) goto L_0x0839
            java.lang.String r13 = r2.A0d
        L_0x07b0:
            if (r0 == 0) goto L_0x0826
            X.DSj r2 = r0.A02
            if (r2 == 0) goto L_0x0826
            java.lang.Integer r2 = r2.Bwe()
            if (r2 == 0) goto L_0x0826
            int r2 = r2.intValue()
            float r2 = (float) r2
            long r2 = X.C51972G9s.A0G(r2)
        L_0x07c5:
            X.DSj r9 = r0.A02
            if (r9 == 0) goto L_0x082d
            java.lang.String r9 = r9.getColor()
            if (r9 == 0) goto L_0x082d
            int r12 = android.graphics.Color.parseColor(r9)
        L_0x07d3:
            if (r36 == 0) goto L_0x07e1
            int r10 = r36.ordinal()
            r11 = 2
            r9 = r22
            if (r10 == r9) goto L_0x07e2
            r11 = 3
            if (r10 == r11) goto L_0x07e2
        L_0x07e1:
            r11 = 1
        L_0x07e2:
            if (r0 == 0) goto L_0x0824
            X.DSj r9 = r0.A02
            if (r9 == 0) goto L_0x0824
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r10 = r9.C24()
            if (r10 == 0) goto L_0x0824
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r9 = com.instagram.api.schemas.OverlayAdsTextStyleEnum.BOLD
            boolean r10 = X.AnonymousClass7TF.A1W(r9, r10)
        L_0x07f4:
            r9 = r33
            X.3ae r9 = X.C51971G9r.A0b(r9, r4, r13, r1)
            X.C51973G9u.A17(r8, r9, r12, r2)
            r9.A0R(r10)
            r10 = r31
            r2 = r29
            X.G9w.A12(r10, r8, r9, r2)
            r9.A0W(r6)
            r2 = r23
            X.C51973G9u.A1A(r9, r6, r2, r1)
            r9.A0M(r11)
            X.C51973G9u.A19(r15, r9, r1)
            X.C51967G9n.A1G(r8, r9)
            r9 = r35
            r3 = r38
            r2 = r24
            X.2Tl r2 = X.C243563Zg.A07(r8, r14, r9, r3, r2)
            goto L_0x039d
        L_0x0824:
            r10 = 0
            goto L_0x07f4
        L_0x0826:
            long r2 = X.C244013aV.A08(r8)
            if (r0 == 0) goto L_0x082d
            goto L_0x07c5
        L_0x082d:
            r9 = r33
            android.content.Context r10 = r9.A0C
            r9 = 2130970247(0x7f040687, float:1.7549199E38)
            int r12 = X.C51968G9o.A08(r10, r8, r9)
            goto L_0x07d3
        L_0x0839:
            r13 = r4
            goto L_0x07b0
        L_0x083c:
            long r2 = X.C244013aV.A08(r11)
            if (r0 == 0) goto L_0x0844
            goto L_0x0717
        L_0x0844:
            X.2V1 r10 = r11.A00
            android.content.Context r13 = r10.A0C
            r10 = 2130970247(0x7f040687, float:1.7549199E38)
            int r13 = X.C51968G9o.A08(r13, r11, r10)
            goto L_0x0725
        L_0x0851:
            r10 = r27
            X.2WX r10 = X.C51971G9r.A0X(r4, r15, r10, r5)
            X.2WX r10 = X.AnonymousClass9JR.A00(r10, r7, r1, r2)
            X.2WX r12 = X.AnonymousClass9JR.A00(r10, r6, r1, r2)
            android.content.Context r11 = X.C51966G9m.A0O(r8)
            r2 = 2131099784(0x7f060088, float:1.781193E38)
            int r10 = X.C244013aV.A02(r8, r2)
            long r2 = X.C244013aV.A05(r8)
            int r2 = X.C51968G9o.A09(r8, r2)
            float r2 = (float) r2
            android.graphics.drawable.ShapeDrawable r10 = A00(r11, r9, r2, r10)
            r3 = r39
            r2 = r22
            X.2WX r42 = X.C51971G9r.A0Y(r12, r3, r10, r2)
            android.widget.ImageView$ScaleType r41 = android.widget.ImageView.ScaleType.CENTER_CROP
            long r2 = X.C244013aV.A05(r8)
            int r2 = X.C51968G9o.A09(r8, r2)
            float r3 = (float) r2
            int r46 = X.C51973G9u.A06(r8)
            r47 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.GxS r2 = new X.GxS
            r40 = r2
            r43 = r58
            r45 = r3
            r49 = r1
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49)
            goto L_0x0635
        L_0x089f:
            r2 = 0
            goto L_0x0635
        L_0x08a2:
            r29 = r64
            r30 = r14
            r31 = r13
            r32 = r9
            r33 = r20
            X.3aQ r2 = r29.A04(r30, r31, r32, r33, r34)
            goto L_0x0675
        L_0x08b2:
            r3 = r4
            goto L_0x0568
        L_0x08b5:
            r36 = r4
            goto L_0x0552
        L_0x08b9:
            r13 = 0
            if (r0 == 0) goto L_0x0278
            goto L_0x0276
        L_0x08be:
            r7 = 0
            goto L_0x01f0
        L_0x08c1:
            long r6 = X.C244013aV.A0A(r63)
            goto L_0x019a
        L_0x08c7:
            android.content.res.Resources r7 = r2.getResources()
            r6 = 2131165251(0x7f070043, float:1.7944714E38)
            int r19 = r7.getDimensionPixelSize(r6)
            if (r0 == 0) goto L_0x08d6
            goto L_0x0120
        L_0x08d6:
            android.content.res.Resources r7 = r2.getResources()
            r6 = 2131165250(0x7f070042, float:1.7944712E38)
            int r34 = r7.getDimensionPixelSize(r6)
            goto L_0x012c
        L_0x08e3:
            java.lang.String[] r7 = new java.lang.String[r1]
            X.3Zd r6 = X.2Vi.A04
            X.4Ey r7 = X.2Vi.A01(r6, r7)
            goto L_0x010a
        L_0x08ed:
            X.3Zd r13 = X.C243533Zd.LOCAL
            goto L_0x00cd
        L_0x08f1:
            r3 = 2131099931(0x7f06011b, float:1.781223E38)
            r2 = r63
            int r38 = X.C51969G9p.A08(r2, r3)
            if (r0 == 0) goto L_0x08fe
            goto L_0x0051
        L_0x08fe:
            r3 = 2131099930(0x7f06011a, float:1.7812227E38)
            r2 = r63
            int r15 = X.C51969G9p.A08(r2, r3)
            goto L_0x0059
        L_0x0909:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53927GwX.A0X(X.3Y5):X.3mp");
    }

    public static final ShapeDrawable A00(Context context, AnonymousClass3OA r7, float f, int i) {
        boolean z;
        int i2;
        Integer num;
        Integer num2;
        C270134gF r3 = r7.A0F;
        int i3 = 0;
        if (r3 != null) {
            z = AnonymousClass7TF.A1Y(r3.A06, true);
        } else {
            z = false;
        }
        float[] fArr = new float[8];
        if (z) {
            fArr[0] = f;
            fArr[1] = f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = f;
        } else {
            int i4 = 0;
            do {
                fArr[i4] = f;
                i4++;
            } while (i4 < 8);
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(fArr, (RectF) null, (float[]) null));
        shapeDrawable.getPaint().setColor(i);
        if (r3 == null || (num2 = r3.A0H) == null) {
            i2 = 0;
        } else {
            i2 = C61380mr.A01(context, num2.intValue());
        }
        shapeDrawable.setIntrinsicHeight(i2);
        if (!(r3 == null || (num = r3.A0H) == null)) {
            i3 = C61380mr.A01(context, num.intValue());
        }
        shapeDrawable.setIntrinsicWidth(i3);
        return shapeDrawable;
    }

    private final C243963aQ A04(C70832Wc r26, C226632hb r27, AnonymousClass3OA r28, C52839GdV gdV, int i) {
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(AnonymousClass05K.A0C, 0.0f, 1));
        int i2 = i;
        long A0G = C51969G9p.A0G(i2);
        2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(A0X, AnonymousClass05K.A01, 0, A0G), AnonymousClass05K.A00, 0, A0G);
        C267324bN r6 = this.A01;
        UserSession userSession = this.A03;
        AnonymousClass4DU r8 = this.A04;
        AnonymousClass3OA r4 = r28;
        2WX A10 = G9t.A10(GFM.A00(C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, A002, new ILB(r4, this, 2), r6, userSession, r8, (Integer) null, false, false), AnonymousClass05K.A04, J6N.A00(gdV, 0));
        ExtendedImageUrl A1m = r4.A0K.A1m(i2);
        if (A1m == null) {
            return null;
        }
        C270134gF r02 = r4.A0F;
        if (r02 != null && AnonymousClass7TF.A1Y(r02.A06, true)) {
            return new GYW(ImageView.ScaleType.CENTER_CROP, A10, r8, A1m, (ImageUrl) null, (C240963Ni) null, r27, (String) null, 3, false, false);
        }
        C70832Wc r3 = r26;
        return new C53984GxS(ImageView.ScaleType.CENTER_CROP, A10, r8, A1m, (float) C51969G9p.A09(r3, C244013aV.A05(r3)), C51972G9s.A0E(r3, 1.0d), -16777216, false, false);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0092, code lost:
        if (r4 != null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a0, code lost:
        if (r4 != null) goto L_0x0058;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.2Tp A05(X.C70832Wc r18, X.AnonymousClass3OA r19, X.C52839GdV r20) {
        /*
            r17 = this;
            X.3XV r9 = X.2WX.A02
            r0 = r17
            X.4bN r11 = r0.A01
            com.instagram.common.session.UserSession r12 = r0.A03
            X.4DU r13 = r0.A04
            X.3Ds r8 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r4 = 4
            X.ILB r10 = new X.ILB
            r2 = r19
            r10.<init>(r2, r0, r4)
            r14 = 0
            r15 = 0
            r16 = r15
            X.2WX r3 = X.GFM.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r0 = 2
            r1 = r20
            X.J6N r1 = X.J6N.A00(r1, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.2WX r7 = X.C51971G9r.A0Y(r3, r0, r1, r4)
            r8 = r18
            X.2Wb r6 = X.C51973G9u.A0M(r8)
            java.lang.String r11 = r2.A03(r12)
            X.4gF r4 = r2.A0F
            if (r4 == 0) goto L_0x008e
            X.DSj r0 = r4.A04
            if (r0 == 0) goto L_0x008e
            java.lang.Integer r0 = r0.Bwe()
            if (r0 == 0) goto L_0x008e
            int r0 = r0.intValue()
            float r0 = (float) r0
            long r2 = X.C51972G9s.A0G(r0)
        L_0x004a:
            X.DSj r0 = r4.A04
            if (r0 == 0) goto L_0x0095
            java.lang.String r0 = r0.getColor()
            if (r0 == 0) goto L_0x0095
            int r13 = android.graphics.Color.parseColor(r0)
        L_0x0058:
            X.DSj r0 = r4.A04
            if (r0 == 0) goto L_0x00a3
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r1 = r0.C24()
            if (r1 == 0) goto L_0x00a3
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r0 = com.instagram.api.schemas.OverlayAdsTextStyleEnum.BOLD
            boolean r12 = X.AnonymousClass7TF.A1W(r0, r1)
        L_0x0068:
            android.graphics.Typeface r10 = android.graphics.Typeface.DEFAULT
            long r4 = X.C51969G9p.A0D()
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.2V1 r0 = r6.A00
            X.3ae r1 = X.C51971G9r.A0b(r0, r14, r11, r15)
            X.C51973G9u.A17(r6, r1, r13, r2)
            r1.A0R(r12)
            X.G9w.A12(r10, r6, r1, r4)
            X.C51974G9v.A19(r1, r9, r15)
            r0 = 1
            r1.A0M(r0)
            X.C51974G9v.A0y(r6, r1, r15)
            X.2Tp r0 = X.C243563Zg.A0B(r6, r8, r7)
            return r0
        L_0x008e:
            long r2 = X.C244013aV.A08(r6)
            if (r4 == 0) goto L_0x0095
            goto L_0x004a
        L_0x0095:
            X.2V1 r0 = r6.A00
            android.content.Context r1 = r0.A0C
            r0 = 2130970247(0x7f040687, float:1.7549199E38)
            int r13 = X.C51968G9o.A08(r1, r6, r0)
            if (r4 == 0) goto L_0x00a3
            goto L_0x0058
        L_0x00a3:
            r12 = 1
            goto L_0x0068
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53927GwX.A05(X.2Wc, X.3OA, X.GdV):X.2Tp");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0089, code lost:
        if (r3 != null) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0096, code lost:
        if (r3 != null) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.2WW A06(X.C70832Wc r12, X.AnonymousClass3OA r13) {
        /*
            r0 = 2131969109(0x7f134455, float:1.9575132E38)
            java.lang.String r5 = X.C244013aV.A0E(r12, r0)
            X.4gF r3 = r13.A0F
            if (r3 == 0) goto L_0x0085
            X.DSj r0 = r3.A03
            if (r0 == 0) goto L_0x0085
            java.lang.Integer r0 = r0.Bwe()
            if (r0 == 0) goto L_0x0085
            int r0 = r0.intValue()
            float r0 = (float) r0
            long r1 = X.C51972G9s.A0G(r0)
        L_0x001e:
            X.DSj r0 = r3.A03
            if (r0 == 0) goto L_0x008c
            java.lang.String r0 = r0.getColor()
            if (r0 == 0) goto L_0x008c
            int r11 = android.graphics.Color.parseColor(r0)
        L_0x002c:
            X.DSj r0 = r3.A03
            if (r0 == 0) goto L_0x0099
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r3 = r0.C24()
            if (r3 == 0) goto L_0x0099
            com.instagram.api.schemas.OverlayAdsTextStyleEnum r0 = com.instagram.api.schemas.OverlayAdsTextStyleEnum.BOLD
            boolean r10 = X.AnonymousClass7TF.A1W(r0, r3)
        L_0x003c:
            android.graphics.Typeface r9 = android.graphics.Typeface.DEFAULT
            long r3 = X.C51969G9p.A0D()
            java.lang.Integer r8 = X.AnonymousClass05K.A00
            X.2V1 r0 = r12.Aqq()
            r7 = 0
            X.3ae r6 = X.2WW.A00(r0, r7)
            r6.A0V(r5)
            r5 = 0
            r6.A0U(r5)
            r6.A0P(r11)
            X.2V4 r0 = r12.Bnf()
            X.C51971G9r.A1J(r6, r0, r10, r1)
            r6.A0S(r9)
            r6.A0F()
            int r0 = X.C51969G9p.A09(r12, r3)
            X.C51974G9v.A10(r6, r12, r0, r3)
            int r0 = X.C51969G9p.A09(r12, r3)
            float r0 = (float) r0
            r6.A0H(r0)
            X.C51974G9v.A19(r6, r8, r7)
            r0 = 1
            r6.A0M(r0)
            X.C51969G9p.A1J(r6)
            r6.A05(r5)
            X.2WW r0 = r6.A0A()
            return r0
        L_0x0085:
            long r1 = X.C244013aV.A08(r12)
            if (r3 == 0) goto L_0x008c
            goto L_0x001e
        L_0x008c:
            X.2V1 r0 = r12.Aqq()
            android.content.Context r0 = r0.A0C
            int r11 = X.C51968G9o.A07(r0, r12)
            if (r3 == 0) goto L_0x0099
            goto L_0x002c
        L_0x0099:
            r10 = 0
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C53927GwX.A06(X.2Wc, X.3OA):X.2WW");
    }
}
