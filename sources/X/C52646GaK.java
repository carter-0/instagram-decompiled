package X;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import kotlin.Deprecated;

@Deprecated(message = "This will be deleted after the CTA MVVM migration is completed. During the migration, please maintain the consistency of this legacy component with GenericAdsImmersiveCTAComponent")
/* renamed from: X.GaK  reason: case insensitive filesystem */
public final class C52646GaK extends C251343mx {
    public static final OvershootInterpolator A0u = new OvershootInterpolator(1.2f);
    public final View.OnClickListener A00;
    public final View.OnClickListener A01;
    public final C267324bN A02;
    public final AnonymousClass3W1 A03;
    public final GZG A04;
    public final Boolean A05;
    public final String A06;
    public final String A07;
    public final 0eP A08;
    public final C62320sa A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;
    public final boolean A0R;
    public final int A0S;
    public final TextUtils.TruncateAt A0T;
    public final 2WX A0U;
    public final 2Vi A0V;
    public final AnonymousClass0iw A0W;
    public final Integer A0X;
    public final Integer A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;
    public final boolean A0o;
    public final boolean A0p;
    public final boolean A0q;
    public final boolean A0r;
    public final boolean A0s;
    public final boolean A0t;

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0036  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.drawable.LayerDrawable A00(float r12, int r13, int r14, int r15, boolean r16, boolean r17) {
        /*
            r11 = 3
            android.graphics.drawable.GradientDrawable$Orientation r5 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            X.JVb r8 = new X.JVb
            r8.<init>(r5)
            r10 = 7
            r9 = 6
            r7 = 5
            r6 = 4
            r4 = 2
            r0 = 8
            r3 = 1
            r2 = 0
            r1 = 0
            if (r16 == 0) goto L_0x0052
            float[] r0 = new float[r0]
            r0[r2] = r12
            r0[r3] = r12
            r0[r4] = r12
            r0[r11] = r12
            r0[r6] = r1
            r0[r7] = r1
            r0[r9] = r1
            r0[r10] = r1
        L_0x0026:
            r8.setCornerRadii(r0)
        L_0x0029:
            r8.setColor(r13)
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[]{r8}
            java.util.ArrayList r1 = X.0sr.A1M(r0)
            if (r14 <= 0) goto L_0x0044
            X.JVb r0 = new X.JVb
            r0.<init>(r5)
            r0.setCornerRadius(r12)
            r0.setStroke(r14, r15)
            r1.add(r0)
        L_0x0044:
            android.graphics.drawable.Drawable[] r0 = new android.graphics.drawable.Drawable[r2]
            java.lang.Object[] r1 = r1.toArray(r0)
            android.graphics.drawable.Drawable[] r1 = (android.graphics.drawable.Drawable[]) r1
            android.graphics.drawable.LayerDrawable r0 = new android.graphics.drawable.LayerDrawable
            r0.<init>(r1)
            return r0
        L_0x0052:
            if (r17 == 0) goto L_0x0067
            float[] r0 = new float[r0]
            r0[r2] = r1
            r0[r3] = r1
            r0[r4] = r1
            r0[r11] = r1
            r0[r6] = r12
            r0[r7] = r12
            r0[r9] = r12
            r0[r10] = r12
            goto L_0x0026
        L_0x0067:
            r8.setCornerRadius(r12)
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52646GaK.A00(float, int, int, int, boolean, boolean):android.graphics.drawable.LayerDrawable");
    }

    private final RippleDrawable A04(C70832Wc r11, int i, int i2) {
        float f;
        if (this.A0q) {
            f = C61380mr.A00(C51969G9p.A0K(r11), 16.0f);
        } else {
            f = 32.0f;
        }
        return new RippleDrawable(ColorStateList.valueOf(i), (Drawable) null, A00(f, i2, 0, 0, false, false));
    }

    private final 2Tp A05(C251263mp r13, C251263mp r14, C251263mp r15, C251263mp r16, C251263mp r17, C251263mp r18, C251263mp r19, C70832Wc r20, 2WX r21, 2WX r22) {
        C243583Zi r7;
        2WX A002 = r21.A00(this.A0U);
        if (this.A0e) {
            r7 = C243583Zi.CENTER;
        } else {
            r7 = C243583Zi.SPACE_BETWEEN;
        }
        C70832Wc r9 = r20;
        2WX r6 = null;
        2Wb A0S2 = AnonymousClass7TG.A0S(r9.Aqq());
        C243573Zh r3 = C243573Zh.FLEX_START;
        2V1 r4 = A0S2.A00;
        2Wb A0v = G9t.A0v(r13, r4);
        2Wb A0w = G9t.A0w(A0v);
        if (this.A0F) {
            A0w.A00(new C53892Gvx(false, true, true));
        }
        C51971G9r.A1C(r16, A0w, A0v, r22);
        A0S2.A00(C243563Zg.A07(A0v, A0S2, (2WX) null, r3, (C243583Zi) null));
        if (this.A0c != null) {
            A0S2.A00(r15);
            A0S2.A00(r14);
        }
        A0S2.A00(r17);
        C243583Zi r32 = C243583Zi.FLEX_END;
        String str = this.A0b;
        if (str != null) {
            r6 = C51971G9r.A0X((2WX) null, AnonymousClass05K.A00, 50.0f, 0);
        }
        2Wb A0S3 = AnonymousClass7TG.A0S(r4);
        if (str != null) {
            A0S3.A00(r18);
        }
        C51971G9r.A1G(r19, A0S3, A0S2, r6, r32);
        return C243563Zg.A0K(A0S2, r9, A002, r7);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v1, resolved type: X.3gE} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r31v3, resolved type: X.Gx6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v436, resolved type: X.Gx6} */
    /* JADX WARNING: type inference failed for: r31v2 */
    /* JADX WARNING: Code restructure failed: missing block: B:261:0x0bc2, code lost:
        if (r18 != false) goto L_0x0bc4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0459, code lost:
        if (r18 != false) goto L_0x045b;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x04d6  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x04da  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x04f1  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x04f9  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0512  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0519  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x058d  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x05a2  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x05a8  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x05da  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x05e4  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x05ee  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x064e  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0660  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x0678  */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x068d  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x06a5  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x06d3  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x06fd  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0728  */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x0768  */
    /* JADX WARNING: Removed duplicated region for block: B:177:0x0795  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x07ab  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0859  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x0943  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0956  */
    /* JADX WARNING: Removed duplicated region for block: B:219:0x095e  */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0a12  */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0a31  */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0abf  */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0b0e  */
    /* JADX WARNING: Removed duplicated region for block: B:242:0x0b17  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x0b1d  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x0b21  */
    /* JADX WARNING: Removed duplicated region for block: B:250:0x0ba2  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x0ba5  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0ba9  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x0bac  */
    /* JADX WARNING: Removed duplicated region for block: B:254:0x0baf  */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x0bb2  */
    /* JADX WARNING: Removed duplicated region for block: B:256:0x0bb5  */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x0bbb  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0126  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x0bd4  */
    /* JADX WARNING: Removed duplicated region for block: B:271:0x0be1  */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x0c51  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x015d  */
    /* JADX WARNING: Removed duplicated region for block: B:313:0x0cc1  */
    /* JADX WARNING: Removed duplicated region for block: B:316:0x0ccd  */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x0cd1  */
    /* JADX WARNING: Removed duplicated region for block: B:318:0x0cd5  */
    /* JADX WARNING: Removed duplicated region for block: B:319:0x0cd9  */
    /* JADX WARNING: Removed duplicated region for block: B:323:0x0d20  */
    /* JADX WARNING: Removed duplicated region for block: B:324:0x0d2b  */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x0d3f  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x0d56  */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x0d66  */
    /* JADX WARNING: Removed duplicated region for block: B:329:0x0d6e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x027f  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x02a6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0359  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0408  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0415  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x04c5  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r127) {
        /*
            r126 = this;
            r26 = 0
            r24 = 0
            r3 = 0
            r5 = r127
            X.0qQ.A0B(r5, r3)
            r9 = r126
            java.lang.String r0 = r9.A07
            r28 = r0
            if (r0 == 0) goto L_0x0d99
            int r81 = android.graphics.Color.parseColor(r28)
        L_0x0016:
            java.lang.Integer r0 = r9.A0Y
            if (r0 == 0) goto L_0x0d8d
            int r0 = r0.intValue()
            double r0 = (double) r0
        L_0x001f:
            int r0 = X.C51972G9s.A0B(r5, r0)
            float r0 = (float) r0
            r52 = r0
        L_0x0026:
            r11 = r81
            boolean r0 = r9.A0P
            if (r0 == 0) goto L_0x0d6e
            r0 = 2131100262(0x7f060266, float:1.78129E38)
        L_0x002f:
            int r11 = X.C51969G9p.A08(r5, r0)
        L_0x0033:
            r21 = 0
            r10 = r52
            r12 = r3
            r13 = r3
            r14 = r3
            r15 = r3
            android.graphics.drawable.LayerDrawable r47 = A00(r10, r11, r12, r13, r14, r15)
            r0 = r47
            X.2V5 r51 = X.C247343gB.A00(r5, r0)
            X.ItD r0 = X.C58518ItD.A00
            X.3Zt r104 = X.C243633Zp.A00(r5, r0)
            X.ItH r0 = X.C58522ItH.A00
            X.3Zt r102 = X.C243633Zp.A00(r5, r0)
            boolean r0 = r9.A0q
            if (r0 == 0) goto L_0x0d66
            r0 = 4625196817309499392(0x4030000000000000, double:16.0)
            int r0 = X.C51972G9s.A0B(r5, r0)
            float r0 = (float) r0
            r41 = r0
            long r0 = X.C51970G9q.A0D()
        L_0x0062:
            float r110 = X.C51969G9p.A02(r5, r0)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r11 = X.C51969G9p.A08(r5, r0)
            r10 = r41
            android.graphics.drawable.LayerDrawable r36 = A00(r10, r11, r12, r13, r14, r15)
            r0 = r36
            X.2V5 r42 = X.C247343gB.A00(r5, r0)
            X.ItL r0 = X.C58526ItL.A00
            X.3Zt r79 = X.C243633Zp.A00(r5, r0)
            X.ItK r0 = X.C58525ItK.A00
            X.2Wa r70 = X.C243643Zq.A00(r5, r0)
            X.ItI r0 = X.C58523ItI.A00
            X.3Zt r77 = X.C243633Zp.A00(r5, r0)
            java.lang.Boolean r0 = r9.A05
            r71 = r0
            r67 = 1
            java.lang.Boolean r66 = java.lang.Boolean.valueOf(r67)
            r1 = r0
            r0 = r66
            boolean r109 = X.0qQ.A0K(r1, r0)
            boolean r0 = r9.A0D
            r33 = r0
            if (r0 != 0) goto L_0x00a8
            r0 = r66
            boolean r21 = X.C51971G9r.A1Z(r1, r0, r3)
        L_0x00a8:
            r1 = 42
            X.GA1 r0 = new X.GA1
            r2 = r21
            r0.<init>(r1, r9, r2)
            X.2Wa r58 = X.C243643Zq.A00(r5, r0)
            r46 = 6
            X.GaN r1 = new X.GaN
            r0 = r46
            r1.<init>(r2, r0)
            X.2Wa r62 = X.C243643Zq.A00(r5, r1)
            r45 = 5
            X.GaN r1 = new X.GaN
            r0 = r45
            r1.<init>(r2, r0)
            X.2Wa r76 = X.C243643Zq.A00(r5, r1)
            X.ItG r0 = X.C58521ItG.A00
            X.3Zt r118 = X.C243633Zp.A00(r5, r0)
            X.ItF r0 = X.C58520ItF.A00
            X.3Zt r115 = X.C243633Zp.A00(r5, r0)
            r0 = 0
            X.2V5 r40 = X.C51968G9o.A0Z(r5, r0)
            X.ItE r0 = X.C58519ItE.A00
            X.2Wa r39 = X.C243643Zq.A00(r5, r0)
            r0 = -1030356992(0xffffffffc2960000, float:-75.0)
            X.2V5 r38 = X.C51968G9o.A0Z(r5, r0)
            X.ItJ r0 = X.C58524ItJ.A00
            X.2Wa r37 = X.C243643Zq.A00(r5, r0)
            boolean r0 = r9.A0A
            r30 = r0
            X.2V1 r0 = r5.A05
            r94 = r0
            android.content.Context r0 = r0.A0C
            r69 = r0
            if (r30 == 0) goto L_0x0d56
            if (r28 == 0) goto L_0x0d43
            int r0 = X.2Yu.A0E(r69)
            int r53 = X.C51969G9p.A08(r5, r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r16 = X.C51969G9p.A08(r5, r0)
            r0 = 2131100263(0x7f060267, float:1.7812903E38)
        L_0x0114:
            int r63 = X.C51969G9p.A08(r5, r0)
            long r17 = X.C244013aV.A03(r5)
            java.lang.String r0 = r9.A0b
            r34 = r0
            if (r0 != 0) goto L_0x0d3f
            java.lang.String r0 = r9.A0c
            if (r0 != 0) goto L_0x0d3f
            int r0 = r9.A0S
            r32 = r0
        L_0x012a:
            java.lang.Integer r64 = X.AnonymousClass05K.A01
            r10 = 0
            android.graphics.Typeface r65 = android.graphics.Typeface.DEFAULT
            r2 = r69
            r1 = r65
            r0 = r64
            android.graphics.Typeface r31 = X.0oh.A03(r2, r1, r0)
            X.3XV r29 = X.2WX.A02
            java.lang.Integer r20 = X.AnonymousClass05K.A0B
            r2 = r20
            r0 = r17
            X.2WX r4 = X.AnonymousClass9JR.A00(r10, r2, r3, r0)
            java.lang.Integer r48 = X.AnonymousClass05K.A0C
            r49 = 0
            r2 = r48
            r1 = r49
            r0 = r67
            X.2WX r4 = X.C51971G9r.A0X(r4, r2, r1, r0)
            boolean r0 = r9.A0F
            r22 = r0
            if (r0 != 0) goto L_0x0d2b
            boolean r0 = r9.A0H
            if (r0 != 0) goto L_0x0d2b
            r0 = 0
        L_0x015e:
            X.2WX r19 = r4.A00(r0)
            java.lang.String r2 = r9.A0d
            long r11 = X.C244013aV.A04(r5)
            android.text.TextUtils$TruncateAt r15 = r9.A0T
            boolean r0 = r9.A0Q
            if (r0 == 0) goto L_0x0d20
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            long r6 = java.lang.Double.doubleToRawLongBits(r0)
            r0 = 2131099902(0x7f0600fe, float:1.781217E38)
            int r1 = X.C51969G9p.A08(r5, r0)
            r0 = 2131100860(0x7f0604bc, float:1.7814113E38)
            int r0 = X.C51969G9p.A08(r5, r0)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            r13 = 4596373779694328218(0x3fc999999999999a, double:0.2)
            long r13 = java.lang.Double.doubleToRawLongBits(r13)
        L_0x018f:
            long r56 = X.C51969G9p.A0D()
            java.lang.Integer r61 = X.AnonymousClass05K.A00
            r0 = r94
            X.3ae r2 = X.C51971G9r.A0b(r0, r10, r2, r3)
            r0 = r53
            X.C51973G9u.A16(r5, r2, r0, r11)
            r0 = r67
            r2.A0R(r0)
            r0 = r31
            r2.A0S(r0)
            r2.A0O(r1)
            int r4 = X.C51969G9p.A07(r5, r6)
            r0 = r56
            X.C51974G9v.A0x(r5, r2, r4, r0)
            X.2V4 r0 = r5.Bnf()
            X.C51974G9v.A11(r2, r0, r8, r13)
            r1 = r48
            r0 = r61
            X.C51970G9q.A1K(r2, r1, r0)
            r11 = 1067702026(0x3fa3d70a, float:1.28)
            X.C51970G9q.A1I(r2, r11, r3)
            r0 = r32
            r2.A0M(r0)
            X.C51969G9p.A1J(r2)
            if (r15 == 0) goto L_0x01d7
            r2.A0T(r15)
        L_0x01d7:
            r0 = r19
            X.2WW r88 = X.C51971G9r.A0c(r10, r0, r2)
            r50 = 2131165206(0x7f070016, float:1.7944623E38)
            r0 = r50
            long r1 = X.C244013aV.A0C(r5, r0)
            long r6 = X.C244013aV.A0C(r5, r0)
            java.lang.Integer r59 = X.AnonymousClass05K.A0u
            r0 = r59
            X.2WX r1 = X.AnonymousClass9JR.A00(r10, r0, r3, r1)
            java.lang.Integer r60 = X.AnonymousClass05K.A1F
            r0 = r60
            X.2WX r4 = X.AnonymousClass9JR.A00(r1, r0, r3, r6)
            X.3Zh r44 = X.C243573Zh.CENTER
            r55 = 3
            r2 = r55
            r1 = r61
            r0 = r44
            X.2WX r8 = X.C51971G9r.A0Y(r4, r1, r0, r2)
            r0 = 2131960999(0x7f1324a7, float:1.9558683E38)
            java.lang.String r1 = X.C244013aV.A0E(r5, r0)
            long r6 = X.C244013aV.A04(r5)
            r0 = r94
            X.3ae r4 = X.C51971G9r.A0b(r0, r10, r1, r3)
            r0 = r53
            X.C51973G9u.A16(r5, r4, r0, r6)
            r4.A0R(r3)
            r2 = r65
            r0 = r56
            X.G9w.A11(r2, r5, r4, r0)
            r1 = r48
            r0 = r61
            X.C51970G9q.A1K(r4, r1, r0)
            r19 = 1065353216(0x3f800000, float:1.0)
            X.C51972G9s.A17(r4)
            X.C51974G9v.A0z(r8, r4, r3)
            X.2WW r90 = r4.A0A()
            r2 = r55
            r1 = r0
            r0 = r44
            X.9JS r4 = X.C51965G9l.A0d(r1, r0, r2)
            r2 = r64
            r1 = r19
            r0 = r67
            X.2WX r8 = X.C51973G9u.A0S(r10, r4, r2, r1, r0)
            java.lang.String r1 = r9.A0c
            long r6 = X.C244013aV.A04(r5)
            java.lang.Integer r43 = X.AnonymousClass05K.A0j
            r0 = r94
            X.3ae r4 = X.C51971G9r.A0b(r0, r10, r1, r3)
            r0 = r53
            X.C51973G9u.A16(r5, r4, r0, r6)
            r4.A0R(r3)
            r0 = r56
            r2 = r31
            X.G9w.A11(r2, r5, r4, r0)
            r0 = r43
            r4.A0W(r0)
            r0 = r61
            X.C51973G9u.A1A(r4, r0, r11, r3)
            r0 = r32
            r4.A0M(r0)
            X.C51969G9p.A1J(r4)
            if (r15 == 0) goto L_0x0282
            r4.A0T(r15)
        L_0x0282:
            X.2WW r89 = X.C51971G9r.A0c(r10, r8, r4)
            java.lang.Integer r23 = X.AnonymousClass05K.A03
            r1 = r38
            r0 = r23
            X.2WX r1 = X.C51971G9r.A0W(r1, r10, r0)
            r0 = r37
            X.2WX r97 = X.C52112GFg.A00(r0, r1)
            if (r22 != 0) goto L_0x0cd9
            boolean r0 = r9.A0H
            if (r0 != 0) goto L_0x0cd9
            r91 = 0
        L_0x029e:
            boolean r0 = r9.A0t
            r18 = r0
            java.lang.String r54 = ""
            if (r0 == 0) goto L_0x0cd5
            long r6 = X.C51967G9n.A07(r5)
            r2 = r48
            r1 = r19
            r0 = r67
            X.2WX r2 = X.C51971G9r.A0X(r10, r2, r1, r0)
            r1 = r61
            X.2WX r8 = X.AnonymousClass9JR.A00(r2, r1, r0, r6)
            long r6 = X.C51971G9r.A0K()
            r1 = r94
            r0 = r54
            X.3ae r4 = X.C51971G9r.A0b(r1, r10, r0, r3)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.C51973G9u.A16(r5, r4, r0, r6)
            r4.A0R(r3)
            r2 = r65
            r0 = r56
            X.G9w.A11(r2, r5, r4, r0)
            r0 = r61
            r4.A0W(r0)
            r2 = r0
            r1 = r19
            r0 = r67
            X.C51974G9v.A14(r4, r2, r1, r3, r0)
            X.2WW r92 = X.C51971G9r.A0c(r10, r8, r4)
        L_0x02e6:
            r0 = 2131165310(0x7f07007e, float:1.7944834E38)
            long r6 = X.C244013aV.A0C(r5, r0)
            r0 = 2131165585(0x7f070191, float:1.7945391E38)
            long r1 = X.C244013aV.A0C(r5, r0)
            java.lang.Integer r35 = X.AnonymousClass05K.A0A
            r0 = r35
            X.2WX r1 = X.AnonymousClass9JR.A00(r10, r0, r3, r1)
            r0 = r20
            X.2WX r8 = X.AnonymousClass9JR.A00(r1, r0, r3, r6)
            long r6 = X.C244013aV.A08(r5)
            r1 = r94
            r0 = r34
            X.3ae r4 = X.C51971G9r.A0b(r1, r10, r0, r3)
            r0 = r53
            X.C51973G9u.A16(r5, r4, r0, r6)
            r4.A0R(r3)
            r0 = r56
            r2 = r31
            X.G9w.A11(r2, r5, r4, r0)
            r1 = r59
            r0 = r64
            X.C51970G9q.A1K(r4, r1, r0)
            r53 = 1065353216(0x3f800000, float:1.0)
            r0 = r19
            X.C51970G9q.A1I(r4, r0, r3)
            r0 = r32
            r4.A0M(r0)
            X.C51973G9u.A19(r8, r4, r3)
            X.2WW r93 = r4.A0A()
            X.4bN r11 = r9.A02
            if (r11 == 0) goto L_0x0cd1
            X.1Xj r1 = r11.A02
            if (r1 == 0) goto L_0x0cd1
            r0 = r67
            java.util.ArrayList r0 = r1.A3K(r0)
            if (r0 == 0) goto L_0x0cd1
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x0cd1
            boolean r0 = X.AnonymousClass71K.A04(r11)
            if (r0 != 0) goto L_0x0359
            boolean r0 = X.AnonymousClass71K.A05(r11)
            if (r0 == 0) goto L_0x0cd1
        L_0x0359:
            X.2Wb r4 = X.AnonymousClass7TG.A0S(r94)
            r0 = r58
            java.lang.Object r0 = r0.A03
            java.lang.String r0 = (java.lang.String) r0
            X.2V1 r1 = r4.A00
            android.content.Context r6 = r1.A0C
            r2 = 2130970272(0x7f0406a0, float:1.754925E38)
            int r13 = X.C51968G9o.A08(r6, r4, r2)
            r12 = 2132018624(0x7f1405c0, float:1.967556E38)
            X.3aa r2 = X.C244063aa.MID_SCENE_CARD_TITLE
            android.util.SparseArray r6 = X.C244083ac.A00(r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A0E
            X.2WX r14 = X.G9t.A10(r10, r2, r6)
            long r7 = X.C51971G9r.A0K()
            X.3ae r6 = X.C51971G9r.A0b(r1, r10, r0, r12)
            X.C51973G9u.A17(r4, r6, r13, r7)
            r0 = r67
            r6.A0R(r0)
            r2 = r65
            r0 = r56
            X.G9w.A12(r2, r4, r6, r0)
            r0 = r61
            r6.A0W(r0)
            r1 = r0
            r0 = r19
            X.C51974G9v.A13(r6, r1, r0)
            r6.A0D()
            X.G9t.A1M(r4, r14, r6)
            boolean r0 = X.AnonymousClass71K.A05(r11)
            if (r0 == 0) goto L_0x03d4
            X.2WX r1 = X.C51973G9u.A0V(r10, r4, r1, r3)
            r0 = r64
            X.2WX r2 = X.C51973G9u.A0V(r1, r4, r0, r3)
            long r0 = X.C244013aV.A0A(r4)
            X.2WX r2 = X.C51972G9s.A0S(r2, r3, r0)
            r0 = 2131238787(0x7f081f83, float:1.8093863E38)
            android.graphics.drawable.Drawable r1 = X.C51968G9o.A0K(r4, r0)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            X.C51973G9u.A0x(r1, r4, r0)
            android.graphics.drawable.Drawable r0 = r1.mutate()
            X.0qQ.A07(r0)
            X.C51969G9p.A13(r0, r10, r4, r2)
        L_0x03d4:
            java.util.List r0 = r4.A01
            X.2Tp r20 = new X.2Tp
            r119 = r20
            r120 = r10
            r121 = r44
            r122 = r10
            r123 = r10
            r124 = r0
            r125 = r3
            r119.<init>(r120, r121, r122, r123, r124, r125)
        L_0x03e9:
            r0 = 2131239970(0x7f082422, float:1.8096262E38)
            android.graphics.drawable.Drawable r34 = X.C244013aV.A0D(r5, r0)
            r0 = 2131100175(0x7f06020f, float:1.7812724E38)
            int r1 = X.C51969G9p.A08(r5, r0)
            r0 = r34
            r0.setTint(r1)
            java.lang.String r13 = r9.A0a
            if (r13 == 0) goto L_0x0ccd
            X.3Zd r14 = X.C243533Zd.GLOBAL
        L_0x0402:
            boolean r15 = r9.A0M
            r0 = 300(0x12c, float:4.2E-43)
            if (r15 == 0) goto L_0x040a
            r0 = 150(0x96, float:2.1E-43)
        L_0x040a:
            X.3Zd r1 = X.2Vi.A04
            X.4Ex r8 = new X.4Ex
            r8.<init>(r0)
            boolean r1 = r9.A0l
            if (r1 == 0) goto L_0x0cc1
            r2 = 2131238496(0x7f081e60, float:1.8093272E38)
        L_0x0418:
            boolean r0 = r9.A0p
            java.lang.String r68 = "cta_chevron_transition_key"
            if (r0 == 0) goto L_0x0c51
            r7 = 2131239340(0x7f0821ac, float:1.8094984E38)
            long r1 = X.C244013aV.A0B(r5)
            r0 = r61
            X.2WX r4 = X.AnonymousClass9JR.A00(r10, r0, r3, r1)
            long r1 = X.C244013aV.A0B(r5)
            r0 = r64
            X.2WX r6 = X.AnonymousClass9JR.A00(r4, r0, r3, r1)
            long r0 = X.C51967G9n.A06(r5)
            java.lang.Integer r2 = X.AnonymousClass05K.A06
            X.9JR r4 = X.C51965G9l.A0c(r2, r3, r0)
            r2 = r55
            r1 = r61
            r0 = r44
            X.2WX r1 = X.C51973G9u.A0T(r6, r4, r1, r0, r2)
            X.Gx6 r31 = new X.Gx6
            r0 = r31
            r0.<init>(r1, r7)
        L_0x0450:
            boolean r11 = r9.A0i
            if (r11 != 0) goto L_0x045b
            boolean r0 = r9.A0s
            if (r0 != 0) goto L_0x045b
            r2 = 0
            if (r18 == 0) goto L_0x045c
        L_0x045b:
            r2 = 1
        L_0x045c:
            X.2Vi r1 = r9.A0V
            java.lang.String r32 = "cta"
            if (r1 != 0) goto L_0x049e
            r0 = r13
            if (r2 == 0) goto L_0x0c28
            if (r13 != 0) goto L_0x0469
            r0 = r32
        L_0x0469:
            X.4Ey r2 = X.2Vi.A00(r14, r0)
            X.3du r7 = X.C246033ds.A04
            X.3du r6 = X.C246033ds.A01
            X.3du r4 = X.C246033ds.A03
            X.3du[] r0 = new X.C246053du[]{r7, r6, r4}
            r2.A06(r0)
            X.3du r1 = X.C246033ds.A00
            r0 = r49
            X.C51969G9p.A1H(r8, r2, r1, r0)
            r0 = r13
            if (r13 != 0) goto L_0x0486
            r0 = r32
        L_0x0486:
            X.4Ey r1 = X.2Vi.A00(r14, r0)
            X.3du[] r0 = new X.C246053du[]{r7, r6, r4}
            r1.A06(r0)
            X.3du r0 = X.C246033ds.A05
            r1.A03(r0)
            r4 = 10
            r0 = r69
            X.2Vm r1 = X.C51974G9v.A09(r0, r8, r1, r2, r4)
        L_0x049e:
            X.AnonymousClass4F7.A00(r5, r1)
            long r22 = X.C51967G9n.A07(r5)
            boolean r1 = r9.A0J
            if (r1 == 0) goto L_0x0bf5
            r0 = 2131165269(0x7f070055, float:1.794475E38)
        L_0x04ac:
            long r83 = X.C244013aV.A0C(r5, r0)
        L_0x04b0:
            X.GaP r0 = new X.GaP
            r119 = r0
            r120 = r83
            r122 = r22
            r124 = r21
            r119.<init>(r120, r122, r124)
            X.2Wa r12 = X.C243643Zq.A00(r5, r0)
            boolean r0 = r9.A0n
            if (r0 == 0) goto L_0x0be1
            r0 = 2131165236(0x7f070034, float:1.7944683E38)
            long r16 = X.C244013aV.A0C(r5, r0)
        L_0x04cc:
            boolean r0 = r9.A0o
            if (r0 != 0) goto L_0x0bd4
            boolean r0 = X.C51969G9p.A1V(r70)
            if (r0 == 0) goto L_0x0bd4
            r2 = r10
        L_0x04d7:
            r0 = r13
            if (r13 != 0) goto L_0x04dc
            java.lang.String r0 = "cta_wrapper"
        L_0x04dc:
            X.4Ey r0 = X.2Vi.A00(r14, r0)
            X.3du r4 = X.C246033ds.A04
            X.3du r8 = X.C246033ds.A05
            X.3du r7 = X.C246033ds.A01
            X.3du r6 = X.C246033ds.A03
            X.3du[] r1 = new X.C246053du[]{r4, r8, r7, r6}
            r0.A06(r1)
            if (r2 == 0) goto L_0x04f3
            r0.A02 = r2
        L_0x04f3:
            X.AnonymousClass4F7.A00(r5, r0)
            r0 = r13
            if (r13 != 0) goto L_0x04fb
            java.lang.String r0 = "cta_card_content"
        L_0x04fb:
            X.4Ey r1 = X.2Vi.A00(r14, r0)
            X.3du r0 = X.C246033ds.A00
            r1.A03(r0)
            r0 = r49
            r1.A01(r0)
            X.3du[] r0 = new X.C246053du[]{r4, r8, r7, r6}
            r1.A06(r0)
            if (r2 == 0) goto L_0x0514
            r1.A02 = r2
        L_0x0514:
            X.AnonymousClass4F7.A00(r5, r1)
            if (r13 == 0) goto L_0x051b
            r68 = r13
        L_0x051b:
            r0 = r68
            X.4Ey r0 = X.2Vi.A00(r14, r0)
            r0.A03(r4)
            X.AnonymousClass4F7.A00(r5, r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r71}
            X.Iok r0 = new X.Iok
            r68 = r0
            r69 = r9
            r71 = r5
            r72 = r58
            r73 = r62
            r74 = r12
            r75 = r42
            r78 = r36
            r80 = r41
            r82 = r3
            r85 = r22
            r87 = r21
            r68.<init>(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80, r81, r82, r83, r85, r87)
            X.C243773a4.A00(r5, r0, r1)
            r36 = 2
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r30)
            r0 = r28
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            X.IoY r0 = new X.IoY
            r100 = r0
            r101 = r9
            r103 = r51
            r105 = r5
            r106 = r52
            r107 = r81
            r108 = r3
            r100.<init>(r101, r102, r103, r104, r105, r106, r107, r108)
            X.C243773a4.A00(r5, r0, r1)
            boolean r0 = r9.A0B
            r41 = r0
            java.lang.Object[] r1 = X.C51968G9o.A1b(r41)
            X.IwA r0 = new X.IwA
            r111 = r0
            r112 = r46
            r113 = r40
            r114 = r39
            r116 = r38
            r117 = r37
            r119 = r9
            r111.<init>(r112, r113, r114, r115, r116, r117, r118, r119)
            X.C243773a4.A00(r5, r0, r1)
            if (r11 == 0) goto L_0x0bbb
            r11 = 0
            long r0 = X.C244013aV.A0A(r5)
            X.2Wd r2 = X.C51965G9l.A0e(r0)
        L_0x0596:
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            long r24 = X.C244013aV.A0C(r5, r0)
            r8 = 1
        L_0x059e:
            boolean r0 = r9.A0k
            if (r0 != 0) goto L_0x05a4
            r19 = 0
        L_0x05a4:
            boolean r0 = r9.A0f
            if (r0 == 0) goto L_0x05ba
            boolean r0 = r9.A0j
            if (r0 == 0) goto L_0x0bb8
            java.lang.Integer r0 = r9.A0X
            if (r0 == 0) goto L_0x0bb8
            long r0 = X.C51970G9q.A0M(r0)
            X.2Wd r2 = X.C51965G9l.A0e(r0)
        L_0x05b8:
            r11 = 0
            r8 = 0
        L_0x05ba:
            java.lang.Object r0 = r12.A03
            X.2Wd r0 = (X.2Wd) r0
            long r6 = r0.A00
            r0 = r64
            X.2WX r6 = X.AnonymousClass9JR.A00(r10, r0, r3, r6)
            X.3aa r0 = X.C244063aa.MID_SCENE_CARD
            android.util.SparseArray r4 = X.C244083ac.A00(r0)
            java.lang.Integer r28 = X.AnonymousClass05K.A0E
            r37 = 4
            r1 = r28
            r0 = r37
            X.2WX r4 = X.C51971G9r.A0Y(r6, r1, r4, r0)
            if (r2 == 0) goto L_0x05e2
            long r0 = r2.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A08
            X.2WX r4 = X.AnonymousClass9JR.A00(r4, r2, r3, r0)
        L_0x05e2:
            if (r8 == 0) goto L_0x05ec
            java.lang.Integer r2 = X.AnonymousClass05K.A09
            r0 = r24
            X.2WX r4 = X.AnonymousClass9JR.A00(r4, r2, r3, r0)
        L_0x05ec:
            if (r11 == 0) goto L_0x05f6
            r2 = r35
            r0 = r26
            X.2WX r4 = X.AnonymousClass9JR.A00(r4, r2, r3, r0)
        L_0x05f6:
            r27 = 2131099778(0x7f060082, float:1.7811919E38)
            r0 = r27
            int r1 = X.C51969G9p.A08(r5, r0)
            r0 = r63
            android.graphics.drawable.RippleDrawable r2 = r9.A04(r5, r0, r1)
            java.lang.Integer r25 = X.AnonymousClass05K.A15
            r1 = r25
            r0 = r37
            X.2WX r6 = X.C51971G9r.A0Y(r4, r1, r2, r0)
            X.9JS r4 = new X.9JS
            r1 = r48
            r0 = r42
            r4.<init>(r0, r1)
            r2 = r66
            r1 = r64
            r0 = r37
            X.2WX r6 = X.C51973G9u.A0T(r6, r4, r1, r2, r0)
            r2 = r59
            r1 = r66
            X.9JS r4 = X.C51965G9l.A0d(r2, r1, r0)
            r2 = r64
            r1 = r19
            r0 = r67
            X.2WX r4 = X.C51973G9u.A0S(r6, r4, r2, r1, r0)
            r0 = 7
            X.MP8 r2 = new X.MP8
            r2.<init>(r9, r0)
            r1 = r60
            r0 = r37
            X.2WX r1 = X.C51971G9r.A0Y(r4, r1, r2, r0)
            java.lang.Integer r24 = X.AnonymousClass05K.A0N
            r0 = r24
            X.2WX r2 = X.G9t.A0y(r1, r0, r3)
            boolean r0 = r9.A0g
            if (r0 == 0) goto L_0x0bb5
            r1 = 1119223808(0x42b60000, float:91.0)
            r0 = r61
            X.2WX r0 = X.C51971G9r.A0X(r10, r0, r1, r3)
        L_0x0656:
            X.2WX r4 = r2.A00(r0)
            boolean r0 = r9.A0G
            r18 = r0
            if (r0 != 0) goto L_0x0670
            r0 = r62
            java.lang.Object r0 = r0.A03
            java.lang.Number r0 = (java.lang.Number) r0
            long r0 = X.C51970G9q.A0M(r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A06
            X.2WX r29 = X.AnonymousClass9JR.A00(r10, r2, r3, r0)
        L_0x0670:
            r0 = r29
            X.2WX r2 = r4.A00(r0)
            if (r21 != 0) goto L_0x0bb2
            r1 = r13
            if (r13 != 0) goto L_0x067d
            java.lang.String r1 = "cta_wrapper"
        L_0x067d:
            r0 = r94
            X.2WX r0 = X.C51971G9r.A0V(r0, r10, r14, r1)
        L_0x0683:
            X.2WX r26 = r2.A00(r0)
            boolean r0 = r9.A0m
            r1 = 8
            if (r0 == 0) goto L_0x068f
            r1 = 12
        L_0x068f:
            long r1 = X.C51965G9l.A07(r1)
            r0 = r35
            X.9JR r4 = X.C51965G9l.A0c(r0, r3, r1)
            r2 = r53
            r1 = r64
            r0 = r67
            X.2WX r4 = X.C51973G9u.A0S(r10, r4, r1, r2, r0)
            if (r18 == 0) goto L_0x0baf
            r0 = r62
            java.lang.Object r0 = r0.A03
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = X.C51970G9q.A0M(r0)
            long r1 = X.C51970G9q.A0M(r0)
            long r11 = X.C51970G9q.A0M(r0)
            r0 = r59
            X.2WX r1 = X.AnonymousClass9JR.A00(r10, r0, r3, r1)
            r0 = r25
            X.2WX r1 = X.AnonymousClass9JR.A00(r1, r0, r3, r6)
            r0 = r60
            X.2WX r0 = X.AnonymousClass9JR.A00(r1, r0, r3, r11)
        L_0x06c9:
            X.2WX r8 = r4.A00(r0)
            boolean r0 = r9.A0I
            r19 = r0
            if (r0 == 0) goto L_0x0bac
            r0 = 4620693217682128896(0x4020000000000000, double:8.0)
            X.2WX r4 = X.C51973G9u.A0P(r10, r0)
            r2 = r35
            r0 = r56
            X.2WX r4 = X.AnonymousClass9JR.A00(r4, r2, r3, r0)
            r0 = r62
            java.lang.Object r0 = r0.A03
            java.lang.Number r0 = (java.lang.Number) r0
            long r6 = X.C51970G9q.A0M(r0)
            r2 = r25
            r0 = r56
            X.9JR r0 = X.C51965G9l.A0c(r2, r3, r0)
            X.2WX r0 = X.C51974G9v.A0E(r4, r0, r3, r6)
        L_0x06f7:
            X.2WX r2 = r8.A00(r0)
            if (r21 != 0) goto L_0x0ba9
            r1 = r13
            if (r13 != 0) goto L_0x0702
            java.lang.String r1 = "cta_card_content"
        L_0x0702:
            r0 = r94
            X.2WX r0 = X.C51971G9r.A0V(r0, r10, r14, r1)
        L_0x0708:
            X.2WX r21 = r2.A00(r0)
            r2 = r64
            r0 = r22
            X.9JR r4 = X.C51965G9l.A0c(r2, r3, r0)
            r2 = r25
            r1 = r34
            r0 = r37
            X.2WX r2 = X.C51973G9u.A0T(r10, r4, r2, r1, r0)
            r1 = r48
            r0 = r51
            X.2WX r4 = X.C51971G9r.A0W(r0, r2, r1)
            if (r30 == 0) goto L_0x0ba5
            java.lang.String r1 = "clips_highlighted_cta_component"
        L_0x072a:
            java.lang.Integer r2 = X.AnonymousClass05K.A0D
            r0 = r37
            X.2WX r4 = X.C51971G9r.A0Y(r4, r2, r1, r0)
            X.3aa r0 = X.C244063aa.CTA
            android.util.SparseArray r2 = X.C244083ac.A00(r0)
            r1 = r28
            r0 = r37
            X.2WX r4 = X.C51971G9r.A0Y(r4, r1, r2, r0)
            X.MP8 r2 = new X.MP8
            r0 = r45
            r2.<init>(r9, r0)
            r1 = r60
            r0 = r37
            X.2WX r2 = X.C51971G9r.A0Y(r4, r1, r2, r0)
            r15 = 1120403456(0x42c80000, float:100.0)
            X.GYx r1 = new X.GYx
            r100 = r1
            r102 = r51
            r103 = r76
            r105 = r47
            r100.<init>(r101, r102, r103, r104, r105, r106, r107, r108, r109)
            r0 = r61
            X.2WX r2 = X.C51971G9r.A0Z(r2, r0, r1, r10)
            java.lang.String r1 = r9.A0Z
            if (r1 == 0) goto L_0x076e
            r0 = r24
            X.2WX r2 = X.C51971G9r.A0Y(r2, r0, r1, r3)
        L_0x076e:
            java.lang.String r22 = "android.widget.Button"
            r1 = r22
            r0 = r64
            X.2WX r2 = X.C51971G9r.A0Y(r2, r0, r1, r3)
            X.MP8 r1 = new X.MP8
            r0 = r46
            r1.<init>(r9, r0)
            r0 = r25
            X.9JS r1 = X.C51965G9l.A0d(r0, r1, r3)
            r0 = r61
            X.2WX r4 = X.C51973G9u.A0S(r2, r1, r0, r15, r3)
            X.3Zh r2 = X.C243573Zh.FLEX_END
            r1 = r55
            X.2WX r1 = X.C51971G9r.A0Y(r4, r0, r2, r1)
            if (r33 == 0) goto L_0x0ba2
            if (r13 != 0) goto L_0x0799
            r13 = r32
        L_0x0799:
            r0 = r94
            X.2WX r0 = X.C51971G9r.A0V(r0, r10, r14, r13)
        L_0x079f:
            X.2WX r96 = r1.A00(r0)
            X.3Zi r23 = X.C243583Zi.SPACE_BETWEEN
            X.2Wb r14 = X.AnonymousClass7TG.A0S(r94)
            if (r19 == 0) goto L_0x083d
            r87 = r9
            r94 = r31
            r95 = r14
            X.2Tp r0 = r87.A05(r88, r89, r90, r91, r92, r93, r94, r95, r96, r97)
            r14.A00(r0)
            if (r41 == 0) goto L_0x07ee
            boolean r0 = r9.A0H
            if (r0 == 0) goto L_0x07ee
            X.3b9 r2 = X.C244413b9.ABSOLUTE
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r0 = r55
            X.2WX r4 = X.C51971G9r.A0Y(r10, r1, r2, r0)
            X.3O5 r2 = X.G9w.A0U(r14)
            r98 = r9
            r99 = r10
            r100 = r10
            r101 = r10
            r102 = r10
            r103 = r10
            r104 = r10
            r105 = r10
            r106 = r14
            r107 = r96
            r108 = r97
            X.2Tp r1 = r98.A05(r99, r100, r101, r102, r103, r104, r105, r106, r107, r108)
            X.7dx r0 = new X.7dx
            r0.<init>(r1, r4, r2)
            r14.A00(r0)
        L_0x07ee:
            long r6 = X.C51971G9r.A0K()
            X.2V1 r1 = r14.A00
            r0 = r54
            X.3ae r2 = X.C51971G9r.A0b(r1, r10, r0, r3)
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.C51973G9u.A17(r14, r2, r0, r6)
            r2.A0R(r3)
            r4 = r65
            r0 = r56
            X.G9w.A12(r4, r14, r2, r0)
            r0 = r61
            r2.A0W(r0)
            r4 = r53
            r1 = r0
            r0 = r67
            X.C51974G9v.A14(r2, r1, r4, r3, r0)
            r2.A05(r10)
            X.C51967G9n.A1G(r14, r2)
            X.GZG r0 = r9.A04
            if (r0 == 0) goto L_0x083d
            boolean r0 = X.C51969G9p.A1V(r76)
            if (r0 == 0) goto L_0x083d
            if (r109 == 0) goto L_0x083d
            r68 = r52
            r69 = r81
            r70 = r3
            r71 = r3
            r72 = r67
            r73 = r3
            android.graphics.drawable.LayerDrawable r1 = A00(r68, r69, r70, r71, r72, r73)
            r0 = r51
            r0.A00(r1)
        L_0x083d:
            X.GZG r0 = r9.A04
            r29 = r0
            if (r0 == 0) goto L_0x0abd
            boolean r0 = X.C51969G9p.A1V(r76)
            if (r0 == 0) goto L_0x0abd
            if (r109 == 0) goto L_0x0abd
            X.2V1 r0 = r14.A00
            r30 = r0
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r30)
            r0 = r29
            java.util.List r11 = r0.A09
            if (r11 == 0) goto L_0x0b99
            int r1 = r11.size()
            r0 = r67
            if (r1 <= r0) goto L_0x0b25
            java.lang.Object r4 = X.00k.A0O(r11, r0)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            if (r4 == 0) goto L_0x08c2
            X.0iw r12 = r9.A0W
            int r111 = X.C51973G9u.A06(r2)
            android.widget.ImageView$ScaleType r106 = android.widget.ImageView.ScaleType.CENTER_CROP
            r6 = 2131165344(0x7f0700a0, float:1.7944902E38)
            r0 = r64
            X.2WX r8 = X.C51973G9u.A0W(r10, r2, r0, r6, r3)
            X.3aa r0 = X.C244063aa.MID_SCENE_CARD_IMAGE
            android.util.SparseArray r7 = X.C244083ac.A00(r0)
            r1 = r28
            r0 = r37
            X.2WX r1 = X.C51971G9r.A0Y(r8, r1, r7, r0)
            r0 = r61
            X.2WX r7 = X.C51973G9u.A0W(r1, r2, r0, r6, r3)
            r0 = 2131165302(0x7f070076, float:1.7944817E38)
            long r0 = X.C244013aV.A0C(r2, r0)
            java.lang.Integer r6 = X.AnonymousClass05K.A09
            X.2WX r7 = X.AnonymousClass9JR.A00(r7, r6, r3, r0)
            r0 = 2131099782(0x7f060086, float:1.7811927E38)
            int r0 = X.C244013aV.A02(r2, r0)
            android.graphics.drawable.ColorDrawable r6 = X.C51965G9l.A0D(r0)
            r1 = r25
            r0 = r37
            X.2WX r107 = X.C51971G9r.A0Y(r7, r1, r6, r0)
            X.GxS r0 = new X.GxS
            r108 = r12
            r109 = r4
            r112 = r3
            r113 = r3
            r114 = r3
            r105 = r0
            r105.<init>(r106, r107, r108, r109, r110, r111, r112, r113, r114)
            r2.A00(r0)
        L_0x08c2:
            java.lang.Object r4 = X.00k.A0J(r11)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            if (r4 == 0) goto L_0x091f
            X.0iw r12 = r9.A0W
            int r111 = X.C51973G9u.A06(r2)
            android.widget.ImageView$ScaleType r106 = android.widget.ImageView.ScaleType.CENTER_CROP
            r1 = 2131165344(0x7f0700a0, float:1.7944902E38)
            r0 = r64
            X.2WX r6 = X.C51973G9u.A0W(r10, r2, r0, r1, r3)
            r0 = r61
            X.2WX r7 = X.C51973G9u.A0W(r6, r2, r0, r1, r3)
            X.3aa r0 = X.C244063aa.MID_SCENE_CARD_IMAGE
            android.util.SparseArray r6 = X.C244083ac.A00(r0)
            r1 = r28
            r0 = r37
            X.2WX r7 = X.C51971G9r.A0Y(r7, r1, r6, r0)
            X.3b9 r6 = X.C244413b9.ABSOLUTE
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            r0 = r55
            X.2WX r8 = X.C51971G9r.A0Y(r7, r1, r6, r0)
            r0 = r50
            long r6 = X.C244013aV.A0C(r2, r0)
            long r0 = X.C244013aV.A0C(r2, r0)
            X.9JR r0 = X.C51967G9n.A0U(r3, r0)
            X.2WX r107 = X.C51974G9v.A0H(r8, r0, r3, r6)
            X.GxS r0 = new X.GxS
            r108 = r12
            r109 = r4
            r112 = r3
            r113 = r3
            r114 = r3
            r105 = r0
            r105.<init>(r106, r107, r108, r109, r110, r111, r112, r113, r114)
            r2.A00(r0)
        L_0x091f:
            int r1 = r11.size()
            r0 = r67
            if (r1 <= r0) goto L_0x0b99
            r8 = 1
            r0 = r24
            X.2WX r6 = X.C51971G9r.A0X(r10, r0, r15, r3)
            r0 = 2131165293(0x7f07006d, float:1.79448E38)
            long r0 = X.C244013aV.A0C(r2, r0)
            java.lang.Integer r4 = X.AnonymousClass05K.A08
            X.2WX r4 = X.AnonymousClass9JR.A00(r6, r4, r3, r0)
        L_0x093b:
            r0 = r29
            boolean r0 = r0.A0C
            r17 = r0
            if (r0 == 0) goto L_0x0b21
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            long r0 = X.C244013aV.A0C(r2, r0)
        L_0x094a:
            java.lang.Integer r6 = X.AnonymousClass05K.A09
            X.2WX r16 = X.AnonymousClass9JR.A00(r4, r6, r3, r0)
            r0 = r29
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x0b1d
            X.3Zi r15 = X.C243583Zi.FLEX_START
        L_0x0958:
            X.2Wb r6 = X.G9t.A0w(r2)
            if (r20 != 0) goto L_0x09b6
            r0 = r58
            java.lang.Object r4 = r0.A03
            java.lang.String r4 = (java.lang.String) r4
            X.2V1 r7 = r6.A00
            android.content.Context r1 = r7.A0C
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
            int r13 = X.C51968G9o.A08(r1, r6, r0)
            r12 = 2132018624(0x7f1405c0, float:1.967556E38)
            if (r8 == 0) goto L_0x0b1a
            boolean r0 = r9.A0h
            if (r0 == 0) goto L_0x097c
            boolean r0 = r9.A0r
            if (r0 != 0) goto L_0x0b1a
        L_0x097c:
            r8 = 1
        L_0x097d:
            X.3aa r0 = X.C244063aa.MID_SCENE_CARD_TITLE
            android.util.SparseArray r11 = X.C244083ac.A00(r0)
            r1 = r28
            r0 = r37
            X.2WX r11 = X.C51971G9r.A0Y(r10, r1, r11, r0)
            long r0 = X.C51971G9r.A0K()
            X.3ae r7 = X.C51971G9r.A0b(r7, r10, r4, r12)
            X.C51973G9u.A17(r6, r7, r13, r0)
            r7.A0R(r8)
            r4 = r65
            r0 = r56
            X.G9w.A12(r4, r6, r7, r0)
            r0 = r61
            r7.A0W(r0)
            r1 = r53
            X.C51973G9u.A1A(r7, r0, r1, r3)
            r0 = r36
            r7.A0M(r0)
            X.C51974G9v.A0z(r11, r7, r3)
            X.2WW r20 = r7.A0A()
        L_0x09b6:
            r0 = r20
            r6.A00(r0)
            X.2Wb r8 = X.G9t.A0w(r6)
            r0 = r29
            java.lang.String r13 = r0.A00
            r7 = 2132018053(0x7f140385, float:1.9674402E38)
            X.2V1 r0 = r8.A00
            android.content.Context r4 = r0.A0C
            r1 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r1 = X.C51968G9o.A08(r4, r8, r1)
            long r11 = X.C51971G9r.A0K()
            X.3ae r7 = X.C51971G9r.A0b(r0, r10, r13, r7)
            X.C51973G9u.A17(r8, r7, r1, r11)
            r7.A0R(r3)
            r4 = r65
            r0 = r56
            X.G9w.A12(r4, r8, r7, r0)
            r0 = r61
            r7.A0W(r0)
            r1 = r53
            X.C51974G9v.A13(r7, r0, r1)
            r7.A0D()
            r7.A05(r10)
            X.2WW r0 = r7.A0A()
            X.C51971G9r.A1E(r0, r8, r6, r10)
            r1 = r16
            X.2Tl r1 = X.C243563Zg.A07(r6, r2, r1, r10, r15)
            r0 = r21
            X.C51971G9r.A1C(r1, r2, r14, r0)
            if (r17 == 0) goto L_0x0abd
            if (r18 != 0) goto L_0x0abd
            r0 = r29
            java.lang.Integer r0 = r0.A05
            if (r0 == 0) goto L_0x0b17
            int r1 = r0.intValue()
            r0 = r62
            java.lang.Object r0 = r0.A03
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r13 = X.C229632nm.A03(r1, r3, r0)
        L_0x0a22:
            r0 = r62
            java.lang.Object r0 = r0.A03
            int r8 = X.AnonymousClass7TE.A0M(r0)
            int r8 = r8 - r13
            r0 = r29
            java.lang.Integer r0 = r0.A06
            if (r0 == 0) goto L_0x0b0e
            long r11 = X.C51970G9q.A0M(r0)
        L_0x0a35:
            X.3b9 r1 = X.C244413b9.ABSOLUTE
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            r0 = r55
            X.2WX r7 = X.C51971G9r.A0Y(r10, r2, r1, r0)
            r6 = r24
            r0 = r56
            r4 = r67
            X.2WX r6 = X.AnonymousClass9JR.A00(r7, r6, r4, r0)
            X.2WX r4 = X.AnonymousClass9JR.A00(r6, r2, r4, r0)
            long r0 = X.C51965G9l.A07(r13)
            java.lang.Integer r2 = X.AnonymousClass05K.A06
            X.2WX r4 = X.AnonymousClass9JR.A00(r4, r2, r3, r0)
            long r0 = X.C51965G9l.A07(r8)
            java.lang.Integer r2 = X.AnonymousClass05K.A0G
            X.2WX r6 = X.AnonymousClass9JR.A00(r4, r2, r3, r0)
            X.2V4 r1 = r14.Bnf()
            r0 = r27
            int r1 = r1.A02(r0)
            r0 = r63
            android.graphics.drawable.RippleDrawable r2 = r9.A04(r14, r0, r1)
            r1 = r25
            r0 = r37
            X.9JS r4 = X.C51965G9l.A0d(r1, r2, r0)
            r2 = r66
            r1 = r64
            X.2WX r2 = X.C51973G9u.A0T(r6, r4, r1, r2, r0)
            r4 = r59
            r1 = r66
            X.9JS r4 = X.C51965G9l.A0d(r4, r1, r0)
            r1 = r22
            r0 = r64
            X.2WX r2 = X.C51973G9u.A0T(r2, r4, r0, r1, r3)
            X.MP8 r1 = new X.MP8
            r0 = r37
            r1.<init>(r9, r0)
            r4 = r60
            X.2WX r4 = X.C51971G9r.A0Y(r2, r4, r1, r0)
            X.2Wb r2 = X.AnonymousClass7TG.A0S(r30)
            r0 = 2131231403(0x7f0802ab, float:1.8078886E38)
            android.graphics.drawable.Drawable r1 = X.C244013aV.A0D(r2, r0)
            r0 = r64
            X.2WX r6 = X.AnonymousClass9JR.A00(r10, r0, r3, r11)
            r0 = r61
            X.2WX r6 = X.AnonymousClass9JR.A00(r6, r0, r3, r11)
            X.2V1 r0 = r2.A00
            X.C51974G9v.A0h(r1, r0, r2, r6)
            X.C51967G9n.A1E(r2, r14, r4)
        L_0x0abd:
            if (r19 != 0) goto L_0x0b05
            long r0 = X.C51971G9r.A0K()
            X.2V1 r4 = r14.A00
            r2 = r54
            X.3ae r2 = X.C51971G9r.A0b(r4, r10, r2, r3)
            r4 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            X.C51973G9u.A17(r14, r2, r4, r0)
            r2.A0R(r3)
            r4 = r65
            r0 = r56
            X.G9w.A12(r4, r14, r2, r0)
            r0 = r61
            r2.A0W(r0)
            r4 = r53
            r1 = r0
            r0 = r67
            X.C51974G9v.A14(r2, r1, r4, r3, r0)
            r2.A05(r10)
            X.C51967G9n.A1G(r14, r2)
            r6 = r9
            r7 = r88
            r8 = r89
            r9 = r90
            r11 = r92
            r12 = r93
            r13 = r31
            r15 = r96
            r16 = r97
            X.2Tp r0 = r6.A05(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            r14.A00(r0)
        L_0x0b05:
            r1 = r26
            r0 = r23
            X.2Tl r0 = X.C243563Zg.A07(r14, r5, r1, r10, r0)
            return r0
        L_0x0b0e:
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            long r11 = X.C244013aV.A0C(r14, r0)
            goto L_0x0a35
        L_0x0b17:
            r13 = 0
            goto L_0x0a22
        L_0x0b1a:
            r8 = 0
            goto L_0x097d
        L_0x0b1d:
            X.3Zi r15 = X.C243583Zi.CENTER
            goto L_0x0958
        L_0x0b21:
            r0 = r56
            goto L_0x094a
        L_0x0b25:
            java.lang.Object r8 = X.00k.A0J(r11)
            com.instagram.common.typedurl.ImageUrl r8 = (com.instagram.common.typedurl.ImageUrl) r8
            if (r8 == 0) goto L_0x091f
            X.0iw r12 = r9.A0W
            int r111 = X.C51973G9u.A06(r2)
            android.widget.ImageView$ScaleType r106 = android.widget.ImageView.ScaleType.CENTER_CROP
            r4 = r48
            r1 = r49
            X.9JQ r6 = X.C51965G9l.A0b(r4, r1, r0)
            r4 = r55
            r1 = r61
            r0 = r44
            X.2WX r6 = X.C51973G9u.A0T(r10, r6, r1, r0, r4)
            X.3aa r0 = X.C244063aa.MID_SCENE_CARD_IMAGE
            android.util.SparseArray r4 = X.C244083ac.A00(r0)
            r1 = r28
            r0 = r37
            X.2WX r6 = X.C51971G9r.A0Y(r6, r1, r4, r0)
            r4 = r43
            r0 = r16
            X.2WX r6 = X.AnonymousClass9JR.A00(r6, r4, r3, r0)
            r4 = r24
            X.2WX r6 = X.AnonymousClass9JR.A00(r6, r4, r3, r0)
            long r0 = X.C244013aV.A06(r2)
            java.lang.Integer r4 = X.AnonymousClass05K.A09
            X.2WX r1 = X.AnonymousClass9JR.A00(r6, r4, r3, r0)
            int r0 = r8.getHeight()
            double r6 = (double) r0
            r0 = r64
            X.2WX r1 = X.C51973G9u.A0X(r1, r0, r6, r3)
            int r0 = r8.getWidth()
            double r6 = (double) r0
            r0 = r61
            X.2WX r107 = X.C51973G9u.A0X(r1, r0, r6, r3)
            X.GxS r0 = new X.GxS
            r108 = r12
            r109 = r8
            r112 = r3
            r113 = r3
            r114 = r3
            r105 = r0
            r105.<init>(r106, r107, r108, r109, r110, r111, r112, r113, r114)
            r2.A00(r0)
            goto L_0x091f
        L_0x0b99:
            r8 = 0
            r0 = r24
            X.2WX r4 = X.C51971G9r.A0X(r10, r0, r15, r3)
            goto L_0x093b
        L_0x0ba2:
            r0 = 0
            goto L_0x079f
        L_0x0ba5:
            java.lang.String r1 = "clips_immersive_cta_component"
            goto L_0x072a
        L_0x0ba9:
            r0 = r10
            goto L_0x0708
        L_0x0bac:
            r0 = r10
            goto L_0x06f7
        L_0x0baf:
            r0 = r10
            goto L_0x06c9
        L_0x0bb2:
            r0 = r10
            goto L_0x0683
        L_0x0bb5:
            r0 = r10
            goto L_0x0656
        L_0x0bb8:
            r2 = 0
            goto L_0x05b8
        L_0x0bbb:
            boolean r1 = r9.A0s
            if (r1 != 0) goto L_0x0bc4
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            if (r18 == 0) goto L_0x0bc7
        L_0x0bc4:
            r0 = 2131165218(0x7f070022, float:1.7944647E38)
        L_0x0bc7:
            long r26 = X.C244013aV.A0C(r5, r0)
            r11 = 1
            r2 = 0
            if (r1 != 0) goto L_0x0596
            if (r18 != 0) goto L_0x0596
            r8 = 0
            goto L_0x059e
        L_0x0bd4:
            r0 = 300(0x12c, float:4.2E-43)
            if (r15 == 0) goto L_0x0bda
            r0 = 150(0x96, float:2.1E-43)
        L_0x0bda:
            X.4Ex r2 = new X.4Ex
            r2.<init>(r0)
            goto L_0x04d7
        L_0x0be1:
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            if (r1 == 0) goto L_0x0bef
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            long r16 = X.C244013aV.A0C(r5, r0)
            goto L_0x04cc
        L_0x0bef:
            long r16 = X.C244013aV.A0C(r5, r0)
            goto L_0x04cc
        L_0x0bf5:
            boolean r0 = r9.A0G
            if (r0 == 0) goto L_0x0bfe
            r0 = 2131165320(0x7f070088, float:1.7944854E38)
            goto L_0x04ac
        L_0x0bfe:
            X.0eP r0 = r9.A08
            if (r0 == 0) goto L_0x0c16
            java.lang.Object r0 = r0.A00
            java.lang.Number r0 = (java.lang.Number) r0
            int r2 = r0.intValue()
            if (r2 == 0) goto L_0x0c16
            int r0 = r0.intValue()
        L_0x0c10:
            long r83 = X.C51965G9l.A07(r0)
            goto L_0x04b0
        L_0x0c16:
            X.GZG r0 = r9.A04
            if (r0 == 0) goto L_0x0c23
            java.lang.Integer r0 = r0.A04
            if (r0 == 0) goto L_0x0c23
            int r0 = r0.intValue()
            goto L_0x0c10
        L_0x0c23:
            r0 = 2131165322(0x7f07008a, float:1.7944858E38)
            goto L_0x04ac
        L_0x0c28:
            if (r13 != 0) goto L_0x0c2c
            r0 = r32
        L_0x0c2c:
            X.4Ey r1 = X.2Vi.A00(r14, r0)
            X.3du r4 = X.C246033ds.A04
            X.3du r2 = X.C246033ds.A01
            X.3du r0 = X.C246033ds.A03
            X.3du[] r0 = new X.C246053du[]{r4, r2, r0}
            r1.A06(r0)
            X.3du r0 = X.C246033ds.A05
            r1.A03(r0)
            r2 = 200(0xc8, float:2.8E-43)
            r0 = r69
            X.4F6 r0 = X.AnonymousClass4F6.A00(r0, r2)
            r1.A04(r0)
            r1.A02 = r8
            goto L_0x049e
        L_0x0c51:
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            if (r1 == 0) goto L_0x0c58
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x0c58:
            long r6 = X.C244013aV.A0C(r5, r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A0D
            X.2WX r4 = X.AnonymousClass9JR.A00(r10, r0, r3, r6)
            r6 = r13
            if (r13 != 0) goto L_0x0c67
            r6 = r68
        L_0x0c67:
            r0 = r94
            X.2WX r4 = X.C51971G9r.A0V(r0, r4, r14, r6)
            if (r1 == 0) goto L_0x0cb2
            long r6 = X.C244013aV.A03(r5)
            r0 = r64
            X.2WX r1 = X.AnonymousClass9JR.A00(r10, r0, r3, r6)
            long r6 = X.C244013aV.A03(r5)
            r0 = r61
            X.2WX r0 = X.AnonymousClass9JR.A00(r1, r0, r3, r6)
        L_0x0c83:
            X.2WX r4 = r4.A00(r0)
            if (r22 != 0) goto L_0x0ca3
            boolean r0 = r9.A0H
            if (r0 != 0) goto L_0x0ca3
            r0 = r10
        L_0x0c8e:
            X.2WX r4 = r4.A00(r0)
            android.graphics.drawable.Drawable r1 = X.C51968G9o.A0K(r5, r2)
            r0 = r16
            X.AnonymousClass7TE.A1R(r1, r0)
            r0 = r94
            X.3gE r31 = X.C51974G9v.A0P(r1, r0, r4)
            goto L_0x0450
        L_0x0ca3:
            r1 = r40
            r0 = r23
            X.2WX r1 = X.C51971G9r.A0W(r1, r10, r0)
            r0 = r39
            X.2WX r0 = X.C52112GFg.A00(r0, r1)
            goto L_0x0c8e
        L_0x0cb2:
            boolean r0 = r9.A0i
            if (r0 == 0) goto L_0x0cbf
            r6 = 4625196817309499392(0x4030000000000000, double:16.0)
            r0 = r64
            X.2WX r0 = X.C51973G9u.A0X(r10, r0, r6, r3)
            goto L_0x0c83
        L_0x0cbf:
            r0 = r10
            goto L_0x0c83
        L_0x0cc1:
            boolean r0 = r9.A0i
            r2 = 2131231325(0x7f08025d, float:1.8078728E38)
            if (r0 == 0) goto L_0x0418
            r2 = 2131238088(0x7f081cc8, float:1.8092445E38)
            goto L_0x0418
        L_0x0ccd:
            X.3Zd r14 = X.C243533Zd.LOCAL
            goto L_0x0402
        L_0x0cd1:
            r20 = 0
            goto L_0x03e9
        L_0x0cd5:
            r92 = 0
            goto L_0x02e6
        L_0x0cd9:
            r2 = r20
            r0 = r17
            X.2WX r8 = X.AnonymousClass9JR.A00(r10, r2, r3, r0)
            r0 = 2131963537(0x7f132e91, float:1.956383E38)
            java.lang.String r1 = X.C244013aV.A0E(r5, r0)
            long r6 = X.C244013aV.A04(r5)
            r0 = r94
            X.3ae r4 = X.C51971G9r.A0b(r0, r10, r1, r3)
            r0 = r53
            X.C51973G9u.A16(r5, r4, r0, r6)
            r0 = r67
            r4.A0R(r0)
            r0 = r56
            r2 = r31
            X.G9w.A11(r2, r5, r4, r0)
            r0 = r48
            r4.A0W(r0)
            r0 = r64
            X.C51973G9u.A1A(r4, r0, r11, r3)
            r0 = r32
            r4.A0M(r0)
            X.C51969G9p.A1J(r4)
            if (r15 == 0) goto L_0x0d1a
            r4.A0T(r15)
        L_0x0d1a:
            X.2WW r91 = X.C51971G9r.A0c(r10, r8, r4)
            goto L_0x029e
        L_0x0d20:
            long r6 = X.C51969G9p.A0D()
            r1 = -7829368(0xffffffffff888888, float:NaN)
            r13 = r6
            r8 = r10
            goto L_0x018f
        L_0x0d2b:
            X.2WX r2 = X.C51974G9v.A0B(r10)
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            r0 = r40
            X.2WX r1 = X.C51971G9r.A0W(r0, r2, r1)
            r0 = r39
            X.2WX r0 = X.C52112GFg.A00(r0, r1)
            goto L_0x015e
        L_0x0d3f:
            r32 = 1
            goto L_0x012a
        L_0x0d43:
            r1 = 2130970335(0x7f0406df, float:1.7549377E38)
            int r53 = X.C51972G9s.A0A(r0, r5, r1)
            r1 = 2130970242(0x7f040682, float:1.7549189E38)
            int r16 = X.C51972G9s.A0A(r0, r5, r1)
            r0 = 2131100181(0x7f060215, float:1.7812736E38)
            goto L_0x0114
        L_0x0d56:
            int r53 = X.C51972G9s.A09(r0, r5)
            r0 = 2131099843(0x7f0600c3, float:1.781205E38)
            int r16 = X.C51969G9p.A08(r5, r0)
            r0 = 2131100847(0x7f0604af, float:1.7814087E38)
            goto L_0x0114
        L_0x0d66:
            r41 = 1107296256(0x42000000, float:32.0)
            long r0 = X.C244013aV.A09(r5)
            goto L_0x0062
        L_0x0d6e:
            boolean r0 = r9.A0R
            if (r0 == 0) goto L_0x0d77
            r0 = 2131100283(0x7f06027b, float:1.7812943E38)
            goto L_0x002f
        L_0x0d77:
            boolean r0 = r9.A0Q
            if (r0 == 0) goto L_0x0d80
            r0 = 2131100847(0x7f0604af, float:1.7814087E38)
            goto L_0x002f
        L_0x0d80:
            boolean r0 = r9.A0L
            if (r0 != 0) goto L_0x0033
            r0 = 2131100677(0x7f060405, float:1.7813742E38)
            int r11 = X.C51969G9p.A08(r5, r0)
            goto L_0x0033
        L_0x0d8d:
            boolean r0 = r9.A0q
            if (r0 == 0) goto L_0x0d95
            r0 = 4622945017495814144(0x4028000000000000, double:12.0)
            goto L_0x001f
        L_0x0d95:
            r52 = 1107296256(0x42000000, float:32.0)
            goto L_0x0026
        L_0x0d99:
            X.2V1 r0 = r5.A05
            android.content.Context r1 = r0.A0C
            r0 = 2130970272(0x7f0406a0, float:1.754925E38)
            int r81 = X.C51972G9s.A0A(r1, r5, r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C52646GaK.A0X(X.3Y5):X.3mp");
    }

    public C52646GaK(TextUtils.TruncateAt truncateAt, View.OnClickListener onClickListener, View.OnClickListener onClickListener2, 2WX r5, 2Vi r6, C267324bN r7, AnonymousClass0iw r8, AnonymousClass3W1 r9, GZG gzg, Boolean bool, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, 0eP r21, C62320sa r22, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z30, boolean z31, boolean z32, boolean z33, boolean z34) {
        C51969G9p.A1N(r8, 9, r9);
        this.A0d = str;
        this.A0c = str2;
        this.A0A = z;
        this.A05 = bool;
        this.A00 = onClickListener;
        this.A01 = onClickListener2;
        this.A07 = str3;
        this.A0Z = str4;
        this.A0W = r8;
        this.A03 = r9;
        this.A06 = str5;
        this.A0U = r5;
        this.A0g = z2;
        this.A0a = str6;
        this.A0V = r6;
        this.A0S = i;
        this.A0T = truncateAt;
        this.A0e = z3;
        this.A0i = z4;
        this.A0s = z5;
        this.A0k = z6;
        this.A0t = z7;
        this.A0E = z8;
        this.A0C = z9;
        this.A0D = z10;
        this.A04 = gzg;
        this.A0b = str7;
        this.A0Y = num;
        this.A0G = z11;
        this.A0J = z12;
        this.A0l = z13;
        this.A0I = z14;
        this.A0F = z15;
        this.A0H = z16;
        this.A0M = z17;
        this.A0B = z18;
        this.A02 = r7;
        this.A09 = r22;
        this.A0L = z19;
        this.A0f = z20;
        this.A0p = z21;
        this.A0n = z22;
        this.A0m = z23;
        this.A0q = z24;
        this.A0o = z25;
        this.A0K = z26;
        this.A0P = z27;
        this.A0R = z28;
        this.A0Q = z29;
        this.A0O = z30;
        this.A0N = z31;
        this.A08 = r21;
        this.A0h = z32;
        this.A0r = z33;
        this.A0j = z34;
        this.A0X = num2;
    }
}
