package X;

import com.instagram.android.R;
import com.instagram.api.schemas.RingSpec;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;

/* renamed from: X.3ao  reason: invalid class name and case insensitive filesystem */
public final class C244203ao extends C251343mx {
    public final UserSession A00;
    public final AnonymousClass4DU A01;
    public final C242813Wa A02;
    public final C243503Za A03;
    public final long A04;
    public final C243613Zn A05;
    public final String A06;

    private final C244423bA A00(C70832Wc r15, Reel reel, Reel reel2, long j) {
        RingSpec A052;
        C244403b8 r11;
        C277954w0 r0;
        C277884vt r02;
        Reel reel3 = reel2;
        Reel reel4 = reel;
        if (reel == null && reel2 == null) {
            return null;
        }
        if (reel != null) {
            AnonymousClass3NV A0E = reel4.A0E();
            C270194gL r03 = reel4.A0H;
            boolean z = true;
            if (r03 == null || (r0 = r03.A02) == null || (r02 = r0.A0A) == null || !r02.CVs()) {
                z = false;
            }
            A052 = AnonymousClass3NW.A01(A0E, z);
        } else if (reel2 != null) {
            UserSession userSession = this.A00;
            A052 = reel3.A05(userSession);
            if (A052 == null) {
                A052 = AnonymousClass3NW.A00(userSession, reel3);
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        if (reel == null) {
            if (reel2 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (reel3.A16(this.A00)) {
                r11 = C244403b8.STATE_INACTIVE;
                float A032 = AnonymousClass0od.A03(C243803a8.A00(r15), R.dimen.album_preview_add_item_margin, R.dimen.afi_indicator_arrow_margin_top);
                float A033 = AnonymousClass0od.A03(C243803a8.A00(r15), R.dimen.album_preview_add_item_margin, R.dimen.account_recs_header_image_margin);
                AnonymousClass3XV r04 = 2WX.A02;
                Integer num = AnonymousClass05K.A00;
                long j2 = j;
                return new C244423bA(new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(num, 0, j2)), new AnonymousClass9JR(AnonymousClass05K.A01, 0, j2)), new AnonymousClass9JS(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3)), new AnonymousClass9JS(num, C243573Zh.CENTER, 3)), A052, r11, Float.valueOf(A032), Float.valueOf(A033));
            }
        }
        r11 = C244403b8.STATE_ACTIVE;
        float A0322 = AnonymousClass0od.A03(C243803a8.A00(r15), R.dimen.album_preview_add_item_margin, R.dimen.afi_indicator_arrow_margin_top);
        float A0332 = AnonymousClass0od.A03(C243803a8.A00(r15), R.dimen.album_preview_add_item_margin, R.dimen.account_recs_header_image_margin);
        AnonymousClass3XV r042 = 2WX.A02;
        Integer num2 = AnonymousClass05K.A00;
        long j22 = j;
        return new C244423bA(new 2WX(new 2WX(new 2WX(new 2WX((2WX) null, new AnonymousClass9JR(num2, 0, j22)), new AnonymousClass9JR(AnonymousClass05K.A01, 0, j22)), new AnonymousClass9JS(AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3)), new AnonymousClass9JS(num2, C243573Zh.CENTER, 3)), A052, r11, Float.valueOf(A0322), Float.valueOf(A0332));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x012a, code lost:
        if (r1.A01.A03 != false) goto L_0x012c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0470, code lost:
        if (r12 != null) goto L_0x0075;
     */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0235  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0320  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0349  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x03ab  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x03ff  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C251263mp A0X(X.AnonymousClass3Y5 r37) {
        /*
            r36 = this;
            r4 = 0
            r5 = r37
            X.0qQ.A0B(r5, r4)
            X.3b3 r0 = X.C244353b3.A00
            X.3Zt r21 = X.C243633Zp.A00(r5, r0)
            r10 = r36
            X.3Za r6 = r10.A03
            X.3W1 r0 = r6.A0D
            r35 = r0
            X.9IT r8 = r6.A02
            java.lang.Object r7 = r8.A0G
            X.0sJ r7 = (X.0sJ) r7
            java.lang.String r3 = r10.A06
            X.4DU r0 = r10.A01
            r34 = r0
            int r0 = r35.getPosition()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = r34
            r0 = r35
            java.lang.Object r19 = r7.invoke(r0, r3, r1, r2)
            r0 = r19
            X.9J2 r0 = (X.AnonymousClass9J2) r0
            r19 = r0
            X.9If r0 = r6.A05
            r31 = r0
            java.lang.Object r0 = r0.A03
            r24 = r0
            r0 = r24
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            r24 = r0
            X.9cQ r0 = r6.A08
            r20 = r0
            com.instagram.model.reels.Reel r2 = r6.A0E
            java.lang.Object r0 = r8.A0D
            X.0sP r0 = (X.0sP) r0
            java.lang.Object r12 = r0.invoke(r3)
            com.instagram.model.reels.Reel r12 = (com.instagram.model.reels.Reel) r12
            X.3ZE r7 = r6.A0C
            android.content.Context r3 = X.C243803a8.A00(r5)
            r23 = 2131165266(0x7f070052, float:1.7944744E38)
            r22 = 2131165214(0x7f07001e, float:1.7944639E38)
            r1 = r23
            r0 = r22
            float r0 = X.AnonymousClass0od.A04(r3, r1, r0)
            int r0 = (int) r0
            long r0 = (long) r0
            r16 = r0
            r0 = 9221401712017801216(0x7ff9000000000000, double:NaN)
            long r16 = r16 | r0
            r3 = 0
            if (r20 == 0) goto L_0x0460
            r18 = r3
        L_0x0075:
            r2 = 26
            X.9LN r14 = new X.9LN
            r14.<init>(r10, r2)
            r13 = 0
            X.3XV r2 = X.2WX.A02
            if (r12 == 0) goto L_0x0402
            X.3b9 r11 = X.C244413b9.ABSOLUTE
            java.lang.Integer r9 = X.AnonymousClass05K.A0Y
            r2 = 3
            X.9JS r15 = new X.9JS
            r15.<init>(r9, r11, r2)
            X.2WX r9 = new X.2WX
            r9.<init>(r3, r15)
            java.lang.Integer r11 = X.AnonymousClass05K.A0j
            r3 = 1
            X.9JR r2 = new X.9JR
            r2.<init>(r11, r3, r0)
            X.2WX r1 = new X.2WX
            r1.<init>(r9, r2)
            r0 = 36
            X.9Ld r2 = new X.9Ld
            r2.<init>(r14, r0)
            java.lang.String r9 = "live-ring"
            r0 = r21
            X.2WX r2 = X.C244243as.A00(r0, r1, r9, r2)
            X.3NV r1 = r12.A0E()
            boolean r0 = r12.A0j()
            X.4gL r9 = r12.A0H
            if (r9 == 0) goto L_0x00c7
            X.4w0 r9 = r9.A02
            if (r9 == 0) goto L_0x00c7
            X.4vt r9 = r9.A0A
            if (r9 == 0) goto L_0x00c7
            boolean r9 = r9.CVs()
            if (r9 != r3) goto L_0x00c7
            r13 = 1
        L_0x00c7:
            X.GxF r3 = new X.GxF
            r3.<init>(r2, r1, r0, r13)
        L_0x00cc:
            r0 = r31
            boolean r9 = r0.A05
            com.instagram.common.session.UserSession r11 = r10.A00
            r2 = 5
            X.9Lp r1 = new X.9Lp
            r0 = r35
            r1.<init>(r2, r0, r9)
            r0 = 2
            X.9Me r25 = new X.9Me
            r26 = r0
            r27 = r20
            r28 = r10
            r29 = r35
            r30 = r24
            r31 = r19
            r32 = r18
            r33 = r5
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33)
            r2 = 0
            r9 = 1
            X.3aW r21 = new X.3aW
            r26 = r21
            r27 = r11
            r28 = r2
            r29 = r1
            r30 = r25
            r31 = r9
            r26.<init>(r27, r28, r29, r30, r31)
            if (r20 != 0) goto L_0x026c
            boolean r0 = X.AnonymousClass9IU.A00(r0, r7)
            if (r0 != 0) goto L_0x012c
            boolean r0 = X.AnonymousClass9IU.A00(r9, r7)
            if (r0 != 0) goto L_0x012c
            boolean r0 = X.AnonymousClass9IU.A00(r4, r7)
            if (r0 == 0) goto L_0x011b
            boolean r0 = r6.A0P
            if (r0 != 0) goto L_0x012c
        L_0x011b:
            boolean r0 = r7 instanceof X.C243793a7
            if (r0 == 0) goto L_0x026c
            r1 = r7
            X.3a7 r1 = (X.C243793a7) r1
            X.9J2 r0 = r1.A00
            if (r0 != 0) goto L_0x026c
            X.Jw5 r0 = r1.A01
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x026c
        L_0x012c:
            X.3Zn r1 = r10.A05
            boolean r0 = X.AnonymousClass9IU.A00(r4, r7)
            if (r0 == 0) goto L_0x0248
            X.0eM r0 = r1.A07
            java.lang.Object r8 = r0.getValue()
            X.Htf r8 = (X.C56153Htf) r8
            X.2V1 r0 = r5.A05
            android.content.Context r6 = r0.A0C
            X.0qQ.A07(r6)
            X.9IU r7 = (X.AnonymousClass9IU) r7
            java.lang.Object r3 = r7.A02
            X.GlT r3 = (X.C53281GlT) r3
            r0 = r35
            int r1 = r0.A02
            java.lang.String r0 = r34.getModuleName()
            android.graphics.drawable.Drawable r0 = r8.A00(r6, r3, r0, r1)
        L_0x0155:
            if (r0 == 0) goto L_0x01c5
            X.3XV r1 = X.2WX.A02
            java.lang.Integer r6 = X.AnonymousClass05K.A08
            java.lang.String r3 = "profile_picture"
            r7 = 4
            X.9JS r1 = new X.9JS
            r1.<init>(r6, r3, r7)
            X.2WX r6 = new X.2WX
            r6.<init>(r2, r1)
            r3 = 0
            java.lang.Integer r2 = X.AnonymousClass05K.A0C
            X.9JQ r1 = new X.9JQ
            r1.<init>(r2, r3, r9)
            X.2WX r9 = new X.2WX
            r9.<init>(r6, r1)
            r1 = 2131165219(0x7f070023, float:1.7944649E38)
            long r1 = X.C244013aV.A0C(r5, r1)
            java.lang.Integer r6 = X.AnonymousClass05K.A00
            X.9JR r3 = new X.9JR
            r3.<init>(r6, r4, r1)
            X.2WX r8 = new X.2WX
            r8.<init>(r9, r3)
            r1 = 2131976220(0x7f13601c, float:1.9589554E38)
            java.lang.String r3 = X.C244013aV.A0E(r5, r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            X.9JS r1 = new X.9JS
            r1.<init>(r2, r3, r4)
            X.2WX r6 = new X.2WX
            r6.<init>(r8, r1)
            X.3aa r1 = X.C244063aa.PROFILE_IMAGE
            android.util.SparseArray r3 = X.C244083ac.A00(r1)
            java.lang.Integer r2 = X.AnonymousClass05K.A0E
            X.9JS r1 = new X.9JS
            r1.<init>(r2, r3, r7)
            X.2WX r3 = new X.2WX
            r3.<init>(r6, r1)
            android.widget.ImageView$ScaleType r2 = android.widget.ImageView.ScaleType.FIT_CENTER
            X.2V1 r1 = r5.A05
            X.3gG r1 = X.C247373gE.A00(r1)
            r1.A0D(r0)
            r1.A0E(r2)
            r1.A0C()
            X.C244123ag.A00(r1, r3)
            X.3gE r2 = r1.A0A()
        L_0x01c5:
            X.3XV r9 = X.2WX.A02
            long r6 = r10.A04
            r0 = 0
            long r10 = java.lang.Double.doubleToRawLongBits(r0)
            int r0 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r0 != 0) goto L_0x0237
            r3 = r9
        L_0x01d4:
            X.2WX r3 = r9.A00(r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            r8 = 0
            X.9JR r0 = new X.9JR
            r0.<init>(r1, r4, r6)
            if (r3 != r9) goto L_0x01e3
            r3 = r8
        L_0x01e3:
            X.2WX r9 = new X.2WX
            r9.<init>(r3, r0)
            r1 = 37
            X.9Ld r3 = new X.9Ld
            r0 = r21
            r3.<init>(r0, r1)
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            r7 = 4
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r3, r7)
            X.2WX r6 = new X.2WX
            r6.<init>(r9, r0)
            if (r20 == 0) goto L_0x0235
            r1 = 38
            X.9Ld r3 = new X.9Ld
            r0 = r19
            r3.<init>(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass05K.A04
            X.9JS r1 = new X.9JS
            r1.<init>(r0, r3, r7)
            X.2WX r0 = new X.2WX
            r0.<init>(r8, r1)
        L_0x0215:
            X.2WX r11 = r6.A00(r0)
            X.2V1 r3 = r5.A05
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            X.2Wb r0 = new X.2Wb
            r0.<init>(r3, r1)
            r0.A00(r2)
            r9 = r0
            r10 = r5
            r12 = r8
            r13 = r8
            r14 = r8
            r15 = r8
            r16 = r4
            X.2Tp r0 = X.C243563Zg.A0H(r9, r10, r11, r12, r13, r14, r15, r16)
            return r0
        L_0x0235:
            r0 = r8
            goto L_0x0215
        L_0x0237:
            X.3Zh r8 = X.C243573Zh.STRETCH
            java.lang.Integer r3 = X.AnonymousClass05K.A00
            r0 = 3
            X.9JS r1 = new X.9JS
            r1.<init>(r3, r8, r0)
            r0 = 0
            X.2WX r3 = new X.2WX
            r3.<init>(r0, r1)
            goto L_0x01d4
        L_0x0248:
            boolean r0 = X.AnonymousClass9IU.A00(r9, r7)
            if (r0 == 0) goto L_0x0262
            java.lang.Object r3 = r8.A01
        L_0x0250:
            X.0sL r3 = (X.0sL) r3
            android.content.Context r1 = X.C243803a8.A00(r5)
            java.lang.String r0 = r34.getModuleName()
            java.lang.Object r0 = r3.invoke(r1, r0)
            android.graphics.drawable.Drawable r0 = (android.graphics.drawable.Drawable) r0
            goto L_0x0155
        L_0x0262:
            boolean r0 = r7 instanceof X.C243793a7
            if (r0 == 0) goto L_0x0269
            java.lang.Object r3 = r8.A0F
            goto L_0x0250
        L_0x0269:
            java.lang.Object r3 = r8.A02
            goto L_0x0250
        L_0x026c:
            r0 = r19
            java.lang.Object r0 = r0.A02
            r25 = r0
            java.lang.String r8 = r24.getUsername()
            r0 = 2131165223(0x7f070027, float:1.7944657E38)
            long r0 = X.C244013aV.A0C(r5, r0)
            X.2V4 r7 = r5.Bnf()
            int r29 = X.2Wd.A00(r7, r0)
            r1 = 2130968697(0x7f040079, float:1.7546055E38)
            X.2V4 r0 = r5.Bnf()
            int r30 = r0.A01(r1)
            X.2V1 r7 = r5.A05
            android.content.Context r1 = r7.A0C
            r0 = 2130970237(0x7f04067d, float:1.7549178E38)
            int r1 = X.2Yu.A0H(r1, r0)
            X.2V4 r0 = r5.Bnf()
            int r28 = r0.A02(r1)
            X.3XV r15 = X.2WX.A02
            r0 = r23
            long r0 = X.C244013aV.A0C(r5, r0)
            java.lang.Integer r14 = X.AnonymousClass05K.A00
            X.9JR r11 = new X.9JR
            r11.<init>(r14, r4, r0)
            X.2WX r12 = new X.2WX
            r12.<init>(r2, r11)
            r0 = r23
            long r0 = X.C244013aV.A0C(r5, r0)
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            X.9JR r11 = new X.9JR
            r11.<init>(r13, r4, r0)
            X.2WX r0 = new X.2WX
            r0.<init>(r12, r11)
            r1 = 2131970055(0x7f134807, float:1.957705E38)
            java.lang.String r11 = X.C244013aV.A0F(r5, r8, r1)
            java.lang.Integer r8 = X.AnonymousClass05K.A0N
            X.9JS r1 = new X.9JS
            r1.<init>(r8, r11, r4)
            X.2WX r8 = new X.2WX
            r8.<init>(r0, r1)
            java.lang.Integer r11 = X.AnonymousClass05K.A08
            java.lang.String r1 = "profile_picture"
            r12 = 4
            X.9JS r0 = new X.9JS
            r0.<init>(r11, r1, r12)
            X.2WX r11 = new X.2WX
            r11.<init>(r8, r0)
            X.3aZ r8 = X.C244053aZ.A03
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r8, r12)
            X.2WX r8 = new X.2WX
            r8.<init>(r11, r0)
            X.3aa r0 = X.C244063aa.PROFILE_IMAGE
            android.util.SparseArray r11 = X.C244083ac.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            X.9JS r0 = new X.9JS
            r0.<init>(r1, r11, r12)
            X.2WX r11 = new X.2WX
            r11.<init>(r8, r0)
            r0 = 2131440205(0x7f0b324d, float:1.8502387E38)
            java.lang.Integer r8 = X.AnonymousClass05K.A0B
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            X.9JS r0 = new X.9JS
            r0.<init>(r8, r1, r12)
            X.2WX r12 = new X.2WX
            r12.<init>(r11, r0)
            if (r3 == 0) goto L_0x03ff
            X.3b9 r11 = X.C244413b9.ABSOLUTE
            java.lang.Integer r8 = X.AnonymousClass05K.A0Y
            r1 = 3
            X.9JS r0 = new X.9JS
            r0.<init>(r8, r11, r1)
            X.2WX r1 = new X.2WX
            r1.<init>(r2, r0)
        L_0x032f:
            X.2WX r11 = r12.A00(r1)
            r1 = 0
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            X.9JQ r0 = new X.9JQ
            r0.<init>(r8, r1, r9)
            if (r11 != r15) goto L_0x033e
            r11 = r2
        L_0x033e:
            X.2WX r1 = new X.2WX
            r1.<init>(r11, r0)
            X.3QO r11 = X.AnonymousClass3QO.OPAL
            r0 = r25
            if (r0 != r11) goto L_0x03f9
            com.instagram.user.model.User r0 = r6.A0F
            X.4Cl r0 = r0.A03
            X.4bl r0 = r0.BYD()
            if (r0 == 0) goto L_0x03f2
            java.lang.String r0 = r0.Bh8()
            if (r0 == 0) goto L_0x03f2
            android.net.Uri r6 = X.0cp.A03(r0)
            X.0qQ.A07(r6)
            r0 = -1
            com.instagram.common.typedurl.SimpleImageUrl r0 = X.C253833rU.A00(r6, r0, r0)
        L_0x0365:
            X.3bC r6 = new X.3bC
            r24 = r1
            r25 = r34
            r26 = r0
            r27 = r2
            r32 = r9
            r33 = r4
            r23 = r6
            r23.<init>(r24, r25, r26, r27, r28, r29, r30, r31, r32, r33)
            X.3Zh r26 = X.C243573Zh.CENTER
            X.3Zi r27 = X.C243583Zi.CENTER
            r0 = r22
            long r0 = X.C244013aV.A0C(r5, r0)
            X.9JR r9 = new X.9JR
            r9.<init>(r14, r4, r0)
            X.2WX r11 = new X.2WX
            r11.<init>(r2, r9)
            r0 = r22
            long r0 = X.C244013aV.A0C(r5, r0)
            X.9JR r9 = new X.9JR
            r9.<init>(r13, r4, r0)
            X.2WX r0 = new X.2WX
            r0.<init>(r11, r9)
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            X.2Wb r1 = new X.2Wb
            r1.<init>(r7, r9)
            r1.A00(r6)
            if (r3 == 0) goto L_0x03ae
            r1.A00(r3)
        L_0x03ae:
            r22 = r1
            r23 = r5
            r24 = r0
            r25 = r2
            r28 = r4
            X.2Tl r3 = X.C243563Zg.A06(r22, r23, r24, r25, r26, r27, r28)
            X.9JR r6 = new X.9JR
            r0 = r16
            r6.<init>(r8, r4, r0)
            X.2WX r8 = new X.2WX
            r8.<init>(r2, r6)
            java.lang.Integer r2 = X.AnonymousClass05K.A0Y
            X.9JR r6 = new X.9JR
            r6.<init>(r2, r4, r0)
            X.2WX r2 = new X.2WX
            r2.<init>(r8, r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            X.2Wb r1 = new X.2Wb
            r1.<init>(r7, r0)
            r0 = r18
            r1.A00(r0)
            r1.A00(r3)
            r22 = r1
            r24 = r2
            r25 = r26
            X.2Tl r2 = X.C243563Zg.A06(r22, r23, r24, r25, r26, r27, r28)
            goto L_0x01c5
        L_0x03f2:
            com.instagram.common.typedurl.SimpleImageUrl r0 = new com.instagram.common.typedurl.SimpleImageUrl
            r0.<init>(r2)
            goto L_0x0365
        L_0x03f9:
            com.instagram.common.typedurl.ImageUrl r0 = r24.Bh3()
            goto L_0x0365
        L_0x03ff:
            r1 = r2
            goto L_0x032f
        L_0x0402:
            r11 = 2131165204(0x7f070014, float:1.7944619E38)
            long r0 = X.C244013aV.A0C(r5, r11)
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.9JR r2 = new X.9JR
            r2.<init>(r9, r4, r0)
            X.2WX r9 = new X.2WX
            r9.<init>(r3, r2)
            long r0 = X.C244013aV.A0C(r5, r11)
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            X.9JR r2 = new X.9JR
            r2.<init>(r3, r4, r0)
            X.2WX r3 = new X.2WX
            r3.<init>(r9, r2)
            X.3b9 r2 = X.C244413b9.ABSOLUTE
            java.lang.Integer r13 = X.AnonymousClass05K.A0Y
            r1 = 3
            X.9JS r0 = new X.9JS
            r0.<init>(r13, r2, r1)
            X.2WX r12 = new X.2WX
            r12.<init>(r3, r0)
            r0 = 0
            long r2 = java.lang.Double.doubleToRawLongBits(r0)
            r0 = 4616189618054758400(0x4010000000000000, double:4.0)
            long r0 = java.lang.Double.doubleToRawLongBits(r0)
            r11 = 1
            X.9JR r9 = new X.9JR
            r9.<init>(r13, r11, r2)
            X.2WX r2 = new X.2WX
            r2.<init>(r12, r9)
            java.lang.Integer r9 = X.AnonymousClass05K.A0j
            X.9JR r3 = new X.9JR
            r3.<init>(r9, r11, r0)
            X.2WX r1 = new X.2WX
            r1.<init>(r2, r3)
            X.3Nl r0 = X.C240993Nl.HASHTAG
            X.GxB r3 = new X.GxB
            r3.<init>(r1, r0)
            goto L_0x00cc
        L_0x0460:
            if (r2 == 0) goto L_0x0474
            r25 = r10
            r26 = r5
            r27 = r3
            r28 = r2
            r29 = r16
            X.3bA r18 = r25.A00(r26, r27, r28, r29)
        L_0x0470:
            if (r12 == 0) goto L_0x00cc
            goto L_0x0075
        L_0x0474:
            if (r12 == 0) goto L_0x047f
            r11 = r5
            r13 = r3
            r14 = r16
            X.3bA r18 = r10.A00(r11, r12, r13, r14)
            goto L_0x0470
        L_0x047f:
            r18 = 0
            goto L_0x00cc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C244203ao.A0X(X.3Y5):X.3mp");
    }

    public C244203ao(UserSession userSession, AnonymousClass4DU r2, C243613Zn r3, C242813Wa r4, C243503Za r5, String str, long j) {
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = r3;
        this.A06 = str;
        this.A04 = j;
    }
}
