package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.user.model.User;

/* renamed from: X.Mnl  reason: case insensitive filesystem */
public final class C67430Mnl {
    public static final String A01(C66967Mg0 mg0, C67432Mnn mnn, User user) {
        String fullName;
        String BxN;
        if (mg0.A0H && (BxN = user.A03.BxN()) != null && BxN.length() != 0) {
            return null;
        }
        if (mg0.A0J) {
            return mg0.A09;
        }
        String B3O = user.A03.B3O();
        if (B3O == null || B3O.length() == 0) {
            fullName = user.getFullName();
        } else {
            fullName = user.A03.B3O();
        }
        if (mnn.A07) {
            return fullName;
        }
        if (user.A03.BqN() != null) {
            return user.A03.BqN();
        }
        if (mnn.A0A) {
            return fullName;
        }
        String BqK = user.A03.BqK();
        if (fullName != null) {
            int length = fullName.length();
            if (length != 0 && BqK != null && BqK.length() != 0) {
                return 002.A0g(fullName, " • ", BqK);
            }
            if (length != 0) {
                return fullName;
            }
        }
        if (BqK == null || BqK.length() == 0) {
            return null;
        }
        return BqK;
    }

    public static final ViewGroup A00(Context context, ViewGroup viewGroup, boolean z) {
        ViewGroup viewGroup2 = (ViewGroup) DbW.A09(LayoutInflater.from(context), viewGroup, R.layout.row_search_user, false);
        if (context != null) {
            C67431Mnm mnm = new C67431Mnm(context, viewGroup2, z);
            mnm.A0M.A00 = true;
            mnm.A0L.A00 = true;
            mnm.A0J.A00 = true;
            viewGroup2.setTag(mnm);
            return viewGroup2;
        }
        throw DbU.A0h();
    }

    public static final void A02(Context context, IgTextView igTextView, C66967Mg0 mg0, boolean z) {
        int A02;
        Drawable drawable = context.getDrawable(R.drawable.blue_dot_medium_padded);
        Drawable drawable2 = null;
        if (z) {
            drawable2 = drawable;
            drawable = null;
        }
        igTextView.setCompoundDrawablesWithIntrinsicBounds(drawable2, (Drawable) null, drawable, (Drawable) null);
        if (mg0.A0F) {
            A02 = 0;
        } else {
            A02 = AnonymousClass7TG.A02(context);
        }
        int i = 0;
        if (z) {
            i = A02;
            A02 = 0;
        }
        igTextView.setPadding(i, 0, A02, 0);
        igTextView.setCompoundDrawablePadding(AnonymousClass7TG.A03(context));
    }

    /* JADX WARNING: type inference failed for: r4v49, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r8v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x041a, code lost:
        if (r4 != null) goto L_0x041c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0544, code lost:
        if (r4 == false) goto L_0x0546;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x055d, code lost:
        if (r5 != null) goto L_0x055f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0622, code lost:
        if (r1.A2A() != false) goto L_0x0624;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0689, code lost:
        if (X.0qQ.A0K(r1.getId(), r11.A06) == false) goto L_0x068b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x06ac, code lost:
        if (r5 != null) goto L_0x0472;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0359, code lost:
        if (r24 == r23) goto L_0x035b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x03ee, code lost:
        if (r5 != null) goto L_0x03f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x03f8, code lost:
        if (r8.A0G != false) goto L_0x03fa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:123:0x0479  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x0498  */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x04aa  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x054e  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0566  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0579  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x05bb  */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x0607  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x061d  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x064f  */
    /* JADX WARNING: Removed duplicated region for block: B:207:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x068f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(android.app.Activity r54, android.content.Context r55, X.AnonymousClass0iw r56, com.instagram.common.session.UserSession r57, X.C66967Mg0 r58, X.C66632Ma1 r59, X.C66974Mg7 r60, X.C74585PxY r61, X.C67431Mnm r62, X.C67432Mnn r63, X.XAH r64) {
        /*
            r53 = this;
            r4 = r64
            r17 = 1
            r52 = r55
            r1 = r17
            r0 = r52
            X.0qQ.A0B(r0, r1)
            r19 = 2
            r11 = r57
            r0 = r19
            X.0qQ.A0B(r11, r0)
            r1 = 3
            r51 = r56
            r0 = r51
            X.0qQ.A0B(r0, r1)
            r1 = 4
            r50 = r59
            r0 = r50
            X.0qQ.A0B(r0, r1)
            r1 = 7
            r49 = r61
            r0 = r49
            X.0qQ.A0B(r0, r1)
            r6 = 8
            X.0qQ.A0B(r4, r6)
            r26 = 9
            r0 = r62
            r1 = r26
            X.0qQ.A0B(r0, r1)
            com.instagram.user.model.User r1 = r50.A06()
            android.view.ViewGroup r2 = r0.A0A
            r48 = r2
            r8 = r58
            r3 = r2
            r2 = r50
            r4.ECK(r3, r2, r8)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r0.A0N
            r47 = r2
            r5 = 0
            r2.setVisibility(r5)
            com.instagram.common.typedurl.ImageUrl r7 = r1.Bh3()
            r3 = r2
            r2 = r51
            r3.setUrl(r7, r2)
            X.C67434Mnp.A03(r47)
            r7 = r63
            boolean r2 = r7.A05
            r21 = r2
            if (r2 == 0) goto L_0x0863
            boolean r2 = r1.A29()
            if (r2 == 0) goto L_0x0863
            int r2 = r1.A06()
            if (r2 <= 0) goto L_0x0863
            r16 = 1
            com.instagram.user.model.User r2 = r50.A06()
            java.lang.String r3 = "new_post_count"
            X.4Cl r2 = r2.A03
            r2.EjR(r3)
        L_0x0082:
            r28 = 16
            X.Ojz r27 = new X.Ojz
            r29 = r49
            r30 = r50
            r31 = r8
            r32 = r51
            r27.<init>((int) r28, (java.lang.Object) r29, (java.lang.Object) r30, (java.lang.Object) r31, (java.lang.Object) r32)
            java.lang.String r3 = r50.A01()
            X.Dh6 r9 = new X.Dh6
            r2 = r52
            r9.<init>(r2, r11, r3)
            r18 = 4
            X.FPd r28 = new X.FPd
            r3 = r28
            r2 = r18
            r3.<init>(r9, r2)
            boolean r10 = r7.A0C
            X.4Cl r2 = r1.A03
            java.lang.String r2 = r2.BNG()
            r13 = 1
            r12 = 0
            if (r2 == 0) goto L_0x00b4
            r12 = 1
        L_0x00b4:
            X.4Cl r2 = r1.A03
            java.lang.String r2 = r2.BNG()
            if (r2 == 0) goto L_0x0860
            boolean r2 = r8.A0F
            if (r2 == 0) goto L_0x0860
            X.0Tu r9 = X.0Tu.A05
            r2 = 36313141033830189(0x81029c0000072d, double:3.0279148388520626E-306)
            boolean r2 = X.182.A06(r9, r11, r2)
            if (r2 == 0) goto L_0x0860
        L_0x00cd:
            X.4Cl r2 = r1.A03
            java.lang.String r2 = r2.BNG()
            if (r2 == 0) goto L_0x07d9
            if (r12 == 0) goto L_0x07d9
            if (r13 != 0) goto L_0x07d9
            boolean r2 = r7.A0B
            if (r2 == 0) goto L_0x07d9
            boolean r9 = r7.A08
            X.4Cl r2 = r1.A03
            java.lang.String r2 = r2.BNG()
            r34 = 0
            if (r2 == 0) goto L_0x07d5
            X.1OP r2 = X.1OP.$redex_init_class
            com.instagram.reels.store.ReelStore r3 = com.instagram.reels.store.ReelStore.A03(r11)
            X.0qQ.A07(r3)
            X.4Cl r2 = r1.A03
            java.lang.String r2 = r2.BNG()
            com.instagram.model.reels.Reel r3 = r3.A0M(r2)
        L_0x00fc:
            com.instagram.ui.widget.gradientspinner.GradientSpinner r2 = r0.A0T
            r46 = r2
            r2.setVisibility(r5)
            r46.A02()
            android.widget.FrameLayout r10 = r0.A0H
            r10.setImportantForAccessibility(r5)
            X.3oV r13 = r0.A0O
            r13.setVisibility(r5)
            android.view.View r2 = r0.A00
            if (r2 != 0) goto L_0x0121
            android.view.View r12 = r13.getView()
            r2 = 2131428564(0x7f0b04d4, float:1.8478776E38)
            android.view.View r2 = r12.requireViewById(r2)
            r0.A00 = r2
        L_0x0121:
            com.instagram.common.ui.widget.imageview.IgImageView r2 = r0.A06
            if (r2 != 0) goto L_0x0134
            android.view.View r12 = r13.getView()
            r2 = 2131428569(0x7f0b04d9, float:1.8478786E38)
            android.view.View r2 = r12.requireViewById(r2)
            com.instagram.common.ui.widget.imageview.IgImageView r2 = (com.instagram.common.ui.widget.imageview.IgImageView) r2
            r0.A06 = r2
        L_0x0134:
            com.instagram.common.ui.base.IgTextView r2 = r0.A03
            if (r2 != 0) goto L_0x0147
            android.view.View r12 = r13.getView()
            r2 = 2131428571(0x7f0b04db, float:1.847879E38)
            android.view.View r2 = r12.requireViewById(r2)
            com.instagram.common.ui.base.IgTextView r2 = (com.instagram.common.ui.base.IgTextView) r2
            r0.A03 = r2
        L_0x0147:
            if (r3 == 0) goto L_0x0191
            X.3NV r13 = r3.A0E()
            X.4gL r2 = r3.A0H
            if (r2 == 0) goto L_0x07d2
            X.4w0 r2 = r2.A02
            if (r2 == 0) goto L_0x07d2
            X.4vt r2 = r2.A0A
            if (r2 == 0) goto L_0x07d2
            boolean r12 = r2.CVs()
        L_0x015d:
            r2 = r46
            X.AnonymousClass3NW.A03(r2, r13, r12)
            X.3NV r32 = r3.A0E()
            boolean r2 = r3.A0j()
            java.lang.Boolean r33 = java.lang.Boolean.valueOf(r2)
            X.4gL r2 = r3.A0H
            if (r2 == 0) goto L_0x0182
            X.4w0 r2 = r2.A02
            if (r2 == 0) goto L_0x0182
            X.4vt r2 = r2.A0A
            if (r2 == 0) goto L_0x0182
            boolean r2 = r2.CVs()
            java.lang.Boolean r34 = java.lang.Boolean.valueOf(r2)
        L_0x0182:
            android.view.View r12 = r0.A00
            com.instagram.common.ui.widget.imageview.IgImageView r3 = r0.A06
            com.instagram.common.ui.base.IgTextView r2 = r0.A03
            r29 = r12
            r30 = r3
            r31 = r2
            X.C278194wQ.A00(r29, r30, r31, r32, r33, r34)
        L_0x0191:
            X.3oV r3 = r0.A0P
            r3.setVisibility(r5)
            android.view.View r2 = r3.getView()
            com.instagram.ui.widget.emitter.PulseEmitter r2 = (com.instagram.ui.widget.emitter.PulseEmitter) r2
            r2.A01()
            if (r9 == 0) goto L_0x01c8
            android.view.View r2 = r3.getView()
            android.view.ViewGroup$LayoutParams r12 = r2.getLayoutParams()
            android.content.res.Resources r2 = r52.getResources()
            r9 = 2131165250(0x7f070042, float:1.7944712E38)
            int r2 = r2.getDimensionPixelSize(r9)
            r12.width = r2
            android.view.View r2 = r3.getView()
            android.view.ViewGroup$LayoutParams r3 = r2.getLayoutParams()
            android.content.res.Resources r2 = r52.getResources()
            int r2 = r2.getDimensionPixelSize(r9)
            r3.height = r2
        L_0x01c8:
            X.3oV r2 = r0.A0Q
            r2.setVisibility(r5)
            android.view.View r5 = r2.getView()
            com.instagram.ui.widget.imageview.PulsingMultiImageView r5 = (com.instagram.ui.widget.imageview.PulsingMultiImageView) r5
            com.instagram.common.typedurl.ImageUrl r3 = r1.Bh3()
            r2 = r51
            r5.setAnimatingImageUrl(r3, r2)
            r2 = r47
            r2.setVisibility(r6)
            r30 = 5
            X.OjM r2 = new X.OjM
            r29 = r2
            r31 = r49
            r32 = r11
            r33 = r8
            r34 = r0
            r35 = r50
            r36 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            X.AnonymousClass0fU.A00(r2, r10)
            r3 = 2131976354(0x7f1360a2, float:1.9589826E38)
            r2 = r52
            java.lang.String r2 = r2.getString(r3)
            r10.setContentDescription(r2)
        L_0x0205:
            com.instagram.common.ui.base.IgSimpleImageView r2 = r0.A0I
            r45 = r2
            r2.setVisibility(r6)
            com.instagram.common.ui.base.IgTextView r3 = r0.A0J
            r25 = 0
            r20 = 1065353216(0x3f800000, float:1.0)
            r5 = r25
            r2 = r20
            r3.setLineSpacing(r5, r2)
            r2 = r17
            r3.setMaxLines(r2)
            android.content.res.Resources r5 = r52.getResources()
            r2 = 2131165306(0x7f07007a, float:1.7944825E38)
            float r5 = r5.getDimension(r2)
            r2 = 0
            r3.setTextSize(r2, r5)
            boolean r5 = r7.A0A
            if (r5 == 0) goto L_0x0771
            com.instagram.user.follow.FollowButton r9 = r0.A0U
            r9.setVisibility(r2)
            android.content.res.Resources r12 = r52.getResources()
            r5 = 2131165265(0x7f070051, float:1.7944742E38)
            int r5 = r12.getDimensionPixelSize(r5)
            r9.setWidth(r5)
            r9.setPadding(r2, r2, r2, r2)
            X.2f1 r5 = X.AnonymousClass2f1.A00(r11)
            com.instagram.user.model.FollowStatus r24 = r5.A0N(r1)
            com.instagram.user.model.FollowStatus r23 = com.instagram.user.model.FollowStatus.A05
            r12 = r23
            r5 = r24
            if (r5 != r12) goto L_0x075d
            java.lang.String r12 = "message"
        L_0x0259:
            r5 = r50
            r5.A03 = r12
            X.NhP r22 = new X.NhP
            r29 = r22
            r30 = r51
            r31 = r11
            r32 = r8
            r33 = r5
            r34 = r49
            r35 = r0
            r36 = r7
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            boolean r5 = r8.A0H
            if (r5 == 0) goto L_0x0739
            boolean r5 = r4 instanceof X.C67408MnP
            if (r5 == 0) goto L_0x02b0
            r13 = r60
            if (r60 == 0) goto L_0x02b0
            X.MnP r4 = (X.C67408MnP) r4
            X.Mg0 r5 = r13.A00
            r29 = r5
            X.MnM r5 = r4.A07
            r12 = r5
            X.Ma1 r5 = r13.A00
            java.lang.String r15 = r5.A01()
            X.X4b r5 = r12.A00
            java.lang.String r12 = r5.E4p()
            r5 = 58
            r14 = r12
            java.lang.String r5 = X.002.A0T(r14, r15, r5)
            r12 = r29
            X.30a r5 = X.AnonymousClass30Y.A00(r13, r12, r5)
            X.MnN r12 = r4.A0B
            r5.A00(r12)
            X.2el r4 = r4.A01
            X.30Y r12 = r5.A01()
            r5 = r48
            r4.A05(r5, r12)
        L_0x02b0:
            X.3aK r4 = X.C243923aK.LARGE
            r9.setBaseStyle(r4)
            X.0Tu r12 = X.0Tu.A05
            r13 = 36321121083139195(0x8109de0001247b, double:3.0329614541681573E-306)
            boolean r4 = X.182.A06(r12, r11, r13)
            if (r4 != 0) goto L_0x02c6
            r4 = r17
            r9.A09 = r4
        L_0x02c6:
            X.4at r12 = r9.A0J
            r4 = r22
            r12.A07(r4)
            X.4Cl r4 = r1.A03
            java.lang.String r4 = r4.BxN()
            if (r4 == 0) goto L_0x02ff
            int r4 = r4.length()
            if (r4 == 0) goto L_0x02ff
            r5 = 1066192077(0x3f8ccccd, float:1.1)
            r4 = r25
            r3.setLineSpacing(r4, r5)
            r4 = r19
            r3.setMaxLines(r4)
            android.content.res.Resources r4 = r52.getResources()
            r5 = 2131165249(0x7f070041, float:1.794471E38)
            float r4 = r4.getDimension(r5)
            r3.setTextSize(r2, r4)
            X.4Cl r4 = r1.A03
            java.lang.String r4 = r4.BqK()
            r3.setText(r4)
        L_0x02ff:
            java.util.List r4 = r8.A0B
            r13 = r4
            if (r4 == 0) goto L_0x034c
            java.lang.String r37 = r51.getModuleName()
            r5 = 18
            r4 = r52
            float r4 = X.0nA.A04(r4, r5)
            int r4 = (int) r4
            r14 = r4
            java.lang.Integer r32 = X.AnonymousClass05K.A01
            r4 = 1059816735(0x3f2b851f, float:0.67)
            java.lang.Float r31 = java.lang.Float.valueOf(r4)
            r30 = 0
            r5 = r17
            r4 = r52
            float r4 = X.0nA.A04(r4, r5)
            int r4 = (int) r4
            java.lang.Integer r34 = java.lang.Integer.valueOf(r4)
            r29 = r52
            r33 = r30
            r35 = r30
            r36 = r30
            r38 = r13
            r39 = r14
            r40 = r2
            r41 = r5
            r42 = r5
            r43 = r5
            r44 = r2
            android.graphics.drawable.Drawable r5 = X.C244283aw.A00(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44)
            r4 = r45
            r4.setImageDrawable(r5)
            r4.setVisibility(r2)
        L_0x034c:
            java.lang.String r4 = r7.A02
            r12.A0H = r4
            r4 = r51
            r12.A03(r4, r11, r1)
            r5 = r23
            r4 = r24
            if (r4 != r5) goto L_0x035e
        L_0x035b:
            r9.setVisibility(r6)
        L_0x035e:
            java.lang.String r5 = A01(r8, r7, r1)
            if (r5 == 0) goto L_0x0732
            int r4 = r5.length()
            if (r4 == 0) goto L_0x0732
            com.instagram.common.ui.base.IgTextView r9 = r0.A0L
            r9.setText(r5)
            r9.setVisibility(r2)
        L_0x0372:
            com.instagram.common.ui.base.IgTextView r4 = r0.A0M
            r30 = r4
            java.lang.String r5 = r1.getUsername()
            r4.setText(r5)
            boolean r12 = r1.isVerified()
            android.content.res.Resources r4 = r52.getResources()
            android.util.DisplayMetrics r13 = r4.getDisplayMetrics()
            android.graphics.RectF r4 = X.0nA.A01
            r5 = r17
            r4 = r20
            float r4 = android.util.TypedValue.applyDimension(r5, r4, r13)
            int r13 = (int) r4
            r5 = 2130970224(0x7f040670, float:1.7549152E38)
            r4 = r52
            int r5 = X.2Yu.A0H(r4, r5)
            int r14 = r4.getColor(r5)
            r5 = r30
            r4 = r26
            X.C244273av.A09(r5, r13, r4, r14, r12)
            android.view.ViewStub r5 = r0.A0F
            boolean r12 = X.C308436Ug.A02(r1)
            r4 = 8
            if (r12 == 0) goto L_0x03b3
            r4 = 0
        L_0x03b3:
            r5.setVisibility(r4)
            android.view.ViewGroup r4 = r0.A09
            r29 = r4
            r5 = r27
            X.AnonymousClass0fU.A00(r5, r4)
            r5 = r4
            r4 = r28
            r5.setOnTouchListener(r4)
            r23 = 3
            X.OkL r5 = new X.OkL
            r22 = r5
            r24 = r52
            r25 = r11
            r26 = r49
            r27 = r1
            r22.<init>(r23, r24, r25, r26, r27)
            r4 = r29
            r4.setOnLongClickListener(r5)
            com.instagram.common.ui.base.IgSimpleImageView r5 = r0.A01
            if (r5 != 0) goto L_0x03f0
            android.view.ViewStub r4 = r0.A0C
            android.view.View r5 = r4.inflate()
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgSimpleImageView"
            X.0qQ.A0C(r5, r4)
            com.instagram.common.ui.base.IgSimpleImageView r5 = (com.instagram.common.ui.base.IgSimpleImageView) r5
            r0.A01 = r5
            if (r5 == 0) goto L_0x0407
        L_0x03f0:
            boolean r4 = r7.A09
            if (r4 != 0) goto L_0x03fa
            boolean r4 = r8.A0G
            r27 = 0
            if (r4 == 0) goto L_0x03fc
        L_0x03fa:
            r27 = 1
        L_0x03fc:
            r22 = r51
            r23 = r5
            r24 = r50
            r25 = r8
            X.C67429Mnk.A00(r22, r23, r24, r25, r26, r27)
        L_0x0407:
            com.instagram.common.ui.base.IgTextView r4 = r0.A04
            if (r4 != 0) goto L_0x041c
            android.view.ViewStub r4 = r0.A0G
            android.view.View r4 = r4.inflate()
            java.lang.String r5 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView"
            X.0qQ.A0C(r4, r5)
            com.instagram.common.ui.base.IgTextView r4 = (com.instagram.common.ui.base.IgTextView) r4
            r0.A04 = r4
            if (r4 == 0) goto L_0x041f
        L_0x041c:
            r4.setVisibility(r6)
        L_0x041f:
            r12 = 0
            if (r4 == 0) goto L_0x0425
            X.AnonymousClass0fU.A00(r12, r4)
        L_0x0425:
            r9.setCompoundDrawables(r12, r12, r12, r12)
            r3.setCompoundDrawables(r12, r12, r12, r12)
            boolean r4 = r7.A08
            if (r4 == 0) goto L_0x06bb
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r13 = A01(r8, r7, r1)
            boolean r4 = r7.A04
            if (r4 != 0) goto L_0x06b7
            boolean r4 = r8.A0H
            if (r4 != 0) goto L_0x06b7
            if (r21 == 0) goto L_0x06a2
            boolean r4 = r1.A29()
            if (r4 == 0) goto L_0x06a2
            int r4 = r1.A06()
            if (r4 <= 0) goto L_0x06a2
            boolean r5 = r0.A08
            r4 = r52
            A02(r4, r9, r8, r5)
            boolean r4 = r7.A06
            r15 = r4
            int r16 = r1.A06()
            android.content.res.Resources r5 = r52.getResources()
            r4 = 2131820950(0x7f110196, float:1.927463E38)
            if (r15 == 0) goto L_0x0468
            r4 = 2131820951(0x7f110197, float:1.9274631E38)
        L_0x0468:
            r15 = r5
            r5 = r16
            java.lang.String r5 = X.DbY.A0d(r15, r5, r4)
            X.0qQ.A0A(r5)
        L_0x0472:
            boolean r4 = r0.A08
            java.lang.String r16 = " • "
            r15 = 0
            if (r4 == 0) goto L_0x068f
            int r4 = r5.length()
            if (r4 == 0) goto L_0x0488
            r14.append(r5)
            r4 = r16
            java.lang.String r13 = X.002.A0R(r13, r4)
        L_0x0488:
            com.instagram.common.ui.base.IgTextView r4 = r0.A0K
            r4.setText(r13)
        L_0x048d:
            java.lang.String r4 = r14.toString()
            r9.setText(r4)
            boolean r4 = r8.A0H
            if (r4 != 0) goto L_0x049b
            r3.setVisibility(r6)
        L_0x049b:
            com.instagram.common.ui.base.IgTextView r5 = r0.A0K
            java.lang.CharSequence r4 = r5.getText()
            X.0qQ.A07(r4)
            int r4 = r4.length()
            if (r4 != 0) goto L_0x04ac
            r15 = 8
        L_0x04ac:
            r5.setVisibility(r15)
            r4 = 2132018053(0x7f140385, float:1.9674402E38)
            r9.setTextAppearance(r4)
            r5.setTextAppearance(r4)
            X.C67434Mnp.A01(r29)
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            android.content.res.Resources r5 = r52.getResources()
            r4 = 2131165405(0x7f0700dd, float:1.7945026E38)
            int r4 = r5.getDimensionPixelSize(r4)
            r10.height = r4
            android.view.ViewGroup$LayoutParams r5 = r47.getLayoutParams()
            android.content.res.Resources r4 = r52.getResources()
            r10 = 2131165250(0x7f070042, float:1.7944712E38)
            int r4 = r4.getDimensionPixelSize(r10)
            r5.width = r4
            android.view.ViewGroup$LayoutParams r5 = r47.getLayoutParams()
            android.content.res.Resources r4 = r52.getResources()
            int r4 = r4.getDimensionPixelSize(r10)
            r5.height = r4
            android.view.ViewGroup$LayoutParams r5 = r46.getLayoutParams()
            android.content.res.Resources r4 = r52.getResources()
            r10 = 2131165270(0x7f070056, float:1.7944752E38)
            int r4 = r4.getDimensionPixelSize(r10)
            r5.width = r4
            android.view.ViewGroup$LayoutParams r5 = r46.getLayoutParams()
            android.content.res.Resources r4 = r52.getResources()
            int r4 = r4.getDimensionPixelSize(r10)
            r5.height = r4
        L_0x050a:
            X.3oV r5 = r0.A0S
            java.lang.Integer r4 = r7.A01
            if (r4 == 0) goto L_0x068b
            int r10 = r4.intValue()
            if (r10 == r2) goto L_0x066b
            r4 = r17
            if (r10 == r4) goto L_0x0671
            r4 = r19
            if (r10 != r4) goto L_0x068b
            X.4Cl r4 = r1.A03
            java.lang.Boolean r4 = r4.Ak2()
            if (r4 == 0) goto L_0x0546
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0546
            java.lang.String r10 = r1.getId()
            java.lang.String r4 = r11.A06
            boolean r4 = X.0qQ.A0K(r10, r4)
            if (r4 != 0) goto L_0x0546
            X.4Cl r4 = r1.A03
            java.lang.Boolean r4 = r4.Ak3()
            if (r4 == 0) goto L_0x068b
            boolean r4 = r4.booleanValue()
        L_0x0544:
            if (r4 != 0) goto L_0x068b
        L_0x0546:
            r4 = 0
        L_0x0547:
            r5.setVisibility(r4)
            com.instagram.common.ui.base.IgTextView r5 = r0.A02
            if (r5 != 0) goto L_0x055f
            android.view.ViewStub r4 = r0.A0E
            android.view.View r5 = r4.inflate()
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.common.ui.base.IgTextView"
            X.0qQ.A0C(r5, r4)
            com.instagram.common.ui.base.IgTextView r5 = (com.instagram.common.ui.base.IgTextView) r5
            r0.A02 = r5
            if (r5 == 0) goto L_0x0562
        L_0x055f:
            r5.setVisibility(r6)
        L_0x0562:
            com.instagram.igds.components.button.IgdsButton r14 = r0.A07
            if (r14 != 0) goto L_0x0575
            android.view.ViewStub r4 = r0.A0D
            android.view.View r14 = r4.inflate()
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.igds.components.button.IgdsButton"
            X.0qQ.A0C(r14, r4)
            com.instagram.igds.components.button.IgdsButton r14 = (com.instagram.igds.components.button.IgdsButton) r14
            r0.A07 = r14
        L_0x0575:
            java.lang.Integer r4 = r8.A04
            if (r4 == 0) goto L_0x0664
            int r4 = r4.intValue()
            if (r14 == 0) goto L_0x059d
            r14.setVisibility(r2)
            r14.setText((int) r4)
            X.4lo r4 = r8.A03
            r14.setStyle(r4)
            r13 = 34
            X.Ojy r10 = new X.Ojy
            r5 = r50
            r4 = r49
            r10.<init>(r13, r8, r5, r4)
            X.AnonymousClass0fU.A00(r10, r14)
            boolean r4 = r8.A0C
            r14.setEnabled(r4)
        L_0x059d:
            X.3oV r4 = r0.A0R
            r4.setVisibility(r6)
            int r4 = r47.getVisibility()
            if (r4 != 0) goto L_0x064f
            boolean r4 = X.C240943Ng.A02(r11, r1)
            if (r4 == 0) goto L_0x064f
            X.0Tu r6 = X.0Tu.A05
            r4 = 36319510470729165(0x81086700061dcd, double:3.031942896394639E-306)
            boolean r4 = X.182.A06(r6, r11, r4)
            if (r4 == 0) goto L_0x064f
            android.view.ViewStub r5 = r0.A0B
            if (r5 == 0) goto L_0x05d0
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r0.A05
            if (r4 != 0) goto L_0x05d0
            android.view.View r5 = r5.inflate()
            java.lang.String r4 = "null cannot be cast to non-null type com.instagram.common.ui.widget.imageview.CircularImageView"
            X.0qQ.A0C(r5, r4)
            com.instagram.common.ui.widget.imageview.CircularImageView r5 = (com.instagram.common.ui.widget.imageview.CircularImageView) r5
            r0.A05 = r5
        L_0x05d0:
            com.instagram.common.ui.widget.imageview.CircularImageView r8 = r0.A05
            if (r8 == 0) goto L_0x05f9
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.view.ViewGroup$LayoutParams r5 = r47.getLayoutParams()
            int r4 = r5.width
            r6.width = r4
            int r4 = r5.height
            r6.height = r4
            r8.setVisibility(r2)
            r8.setVisibility(r2)
            r8.bringToFront()
            r2 = r52
            X.C240943Ng.A00(r2, r8)
            android.graphics.drawable.Drawable r2 = r8.getDrawable()
            X.C240943Ng.A01(r2)
        L_0x05f9:
            r4 = r48
            r2 = r17
            r4.setEnabled(r2)
            r4.setTag(r0)
            com.instagram.user.model.User r4 = r7.A00
            if (r4 == 0) goto L_0x0619
            java.lang.String r2 = r4.getId()
            java.lang.String r0 = r1.getId()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 == 0) goto L_0x0624
            java.lang.Integer r12 = r4.A0N()
        L_0x0619:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r12 != r0) goto L_0x0624
            boolean r0 = r1.A2A()
            r2 = 1
            if (r0 == 0) goto L_0x0625
        L_0x0624:
            r2 = 0
        L_0x0625:
            boolean r0 = r7.A0D
            if (r0 == 0) goto L_0x063c
            X.4Cl r0 = r1.A03
            java.lang.Boolean r0 = r0.Cd0()
            if (r0 == 0) goto L_0x0637
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0639
        L_0x0637:
            if (r2 == 0) goto L_0x063c
        L_0x0639:
            r20 = 1053609165(0x3ecccccd, float:0.4)
        L_0x063c:
            r1 = r47
            r0 = r20
            r1.setAlpha(r0)
            r1 = r30
            r1.setAlpha(r0)
            r9.setAlpha(r0)
            r3.setAlpha(r0)
            return
        L_0x064f:
            android.view.ViewStub r4 = r0.A0B
            if (r4 == 0) goto L_0x05f9
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r0.A05
            if (r2 == 0) goto L_0x05f9
            r2 = r18
            r4.setVisibility(r2)
            com.instagram.common.ui.widget.imageview.CircularImageView r4 = r0.A05
            if (r4 == 0) goto L_0x05f9
            r4.setVisibility(r2)
            goto L_0x05f9
        L_0x0664:
            if (r14 == 0) goto L_0x059d
            r14.setVisibility(r6)
            goto L_0x059d
        L_0x066b:
            boolean r4 = r1.A2G()
            goto L_0x0544
        L_0x0671:
            X.4Cl r4 = r1.A03
            java.lang.Boolean r4 = r4.Ak2()
            if (r4 == 0) goto L_0x0546
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L_0x0546
            java.lang.String r10 = r1.getId()
            java.lang.String r4 = r11.A06
            boolean r4 = X.0qQ.A0K(r10, r4)
            if (r4 != 0) goto L_0x0546
        L_0x068b:
            r4 = 8
            goto L_0x0547
        L_0x068f:
            r14.append(r13)
            int r4 = r5.length()
            if (r4 == 0) goto L_0x048d
            r4 = r16
            r14.append(r4)
            r14.append(r5)
            goto L_0x048d
        L_0x06a2:
            boolean r4 = r7.A07
            if (r4 == 0) goto L_0x06b0
            X.4Cl r4 = r1.A03
            java.lang.String r5 = r4.BqK()
        L_0x06ac:
            if (r5 == 0) goto L_0x06b7
            goto L_0x0472
        L_0x06b0:
            X.4Cl r4 = r1.A03
            java.lang.String r5 = r4.BqI()
            goto L_0x06ac
        L_0x06b7:
            java.lang.String r5 = ""
            goto L_0x0472
        L_0x06bb:
            boolean r4 = r7.A04
            if (r4 == 0) goto L_0x06c4
            r3.setVisibility(r6)
            goto L_0x050a
        L_0x06c4:
            boolean r4 = r7.A07
            if (r4 == 0) goto L_0x070d
            X.4Cl r4 = r1.A03
            java.lang.String r5 = r4.BqK()
            if (r16 == 0) goto L_0x06f8
            boolean r5 = r0.A08
            r4 = r52
            A02(r4, r3, r8, r5)
            r3.setVisibility(r2)
            boolean r13 = r7.A06
            int r10 = r1.A06()
            android.content.res.Resources r5 = r52.getResources()
            r4 = 2131820950(0x7f110196, float:1.927463E38)
            if (r13 == 0) goto L_0x06ec
            r4 = 2131820951(0x7f110197, float:1.9274631E38)
        L_0x06ec:
            java.lang.String r4 = X.DbY.A0d(r5, r10, r4)
            X.0qQ.A0A(r4)
            r3.setText(r4)
            goto L_0x050a
        L_0x06f8:
            if (r5 == 0) goto L_0x0708
            int r4 = r5.length()
            if (r4 == 0) goto L_0x0708
            r3.setVisibility(r2)
            r3.setText(r5)
            goto L_0x050a
        L_0x0708:
            r3.setVisibility(r6)
            goto L_0x050a
        L_0x070d:
            boolean r4 = r7.A03
            if (r4 == 0) goto L_0x072d
            X.4Cl r4 = r1.A03
            java.lang.String r4 = r4.BqI()
            if (r4 == 0) goto L_0x072d
            int r4 = r4.length()
            if (r4 == 0) goto L_0x072d
            r3.setVisibility(r2)
            X.4Cl r4 = r1.A03
            java.lang.String r4 = r4.BqI()
            r3.setText(r4)
            goto L_0x050a
        L_0x072d:
            r3.setVisibility(r6)
            goto L_0x050a
        L_0x0732:
            com.instagram.common.ui.base.IgTextView r9 = r0.A0L
            r9.setVisibility(r6)
            goto L_0x0372
        L_0x0739:
            X.3aK r4 = X.C243923aK.MESSAGE_OPTION
            r9.setBaseStyle(r4)
            X.4at r12 = r9.A0J
            r30 = 3
            X.WAH r4 = new X.WAH
            r31 = r54
            r29 = r4
            r32 = r52
            r33 = r51
            r34 = r11
            r35 = r9
            r36 = r22
            r37 = r12
            r38 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36, r37, r38)
            r12.A00 = r4
            goto L_0x034c
        L_0x075d:
            com.instagram.user.model.FollowStatus r12 = com.instagram.user.model.FollowStatus.A07
            if (r5 != r12) goto L_0x0765
            java.lang.String r12 = "requested"
            goto L_0x0259
        L_0x0765:
            com.instagram.user.model.FollowStatus r12 = com.instagram.user.model.FollowStatus.A06
            if (r5 != r12) goto L_0x076d
            java.lang.String r12 = "follow"
            goto L_0x0259
        L_0x076d:
            java.lang.String r12 = "unknown"
            goto L_0x0259
        L_0x0771:
            r9 = 18
            X.4Cl r4 = r1.A03
            java.util.List r12 = r4.BqL()
            if (r12 == 0) goto L_0x07ce
            r4 = 10
            int r4 = X.0Yv.A1E(r12, r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r4)
            java.util.Iterator r13 = r12.iterator()
        L_0x078a:
            boolean r4 = r13.hasNext()
            if (r4 == 0) goto L_0x079f
            java.lang.Object r12 = r13.next()
            java.lang.String r12 = (java.lang.String) r12
            com.instagram.common.typedurl.SimpleImageUrl r4 = new com.instagram.common.typedurl.SimpleImageUrl
            r4.<init>(r12)
            r5.add(r4)
            goto L_0x078a
        L_0x079f:
            boolean r4 = r5.isEmpty()
            if (r4 != 0) goto L_0x07ce
            r4 = r45
            r4.setVisibility(r2)
            java.lang.String r34 = r51.getModuleName()
            r4 = r52
            float r4 = X.0nA.A04(r4, r9)
            int r4 = (int) r4
            java.lang.Integer r31 = X.AnonymousClass05K.A00
            r30 = 0
            r29 = r52
            r32 = r30
            r33 = r30
            r35 = r5
            r36 = r4
            r37 = r2
            X.3b0 r5 = X.C244283aw.A05(r29, r30, r31, r32, r33, r34, r35, r36, r37)
            r4 = r45
            r4.setImageDrawable(r5)
        L_0x07ce:
            com.instagram.user.follow.FollowButton r9 = r0.A0U
            goto L_0x035b
        L_0x07d2:
            r12 = 0
            goto L_0x015d
        L_0x07d5:
            r3 = r34
            goto L_0x00fc
        L_0x07d9:
            if (r10 == 0) goto L_0x0834
            X.1OP r2 = X.1OP.$redex_init_class
            com.instagram.model.reels.Reel r2 = X.AnonymousClass3PQ.A02(r11, r1)
            if (r2 == 0) goto L_0x0834
            X.3oV r2 = r0.A0O
            r2.setVisibility(r6)
            X.3oV r2 = r0.A0P
            r2.setVisibility(r6)
            X.3oV r2 = r0.A0Q
            r2.setVisibility(r6)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r2 = r0.A0T
            r46 = r2
            r2.setVisibility(r5)
            android.widget.FrameLayout r10 = r0.A0H
            r10.setImportantForAccessibility(r5)
            X.OjM r2 = new X.OjM
            r29 = r2
            r30 = r18
            r31 = r49
            r32 = r11
            r33 = r8
            r34 = r0
            r35 = r50
            r36 = r1
            r29.<init>(r30, r31, r32, r33, r34, r35, r36)
            X.AnonymousClass0fU.A00(r2, r10)
            android.content.res.Resources r3 = r52.getResources()
            r2 = 2131974507(0x7f13596b, float:1.958608E38)
            java.lang.String r2 = r3.getString(r2)
            r10.setContentDescription(r2)
            r46.A02()
            com.instagram.model.reels.Reel r3 = X.AnonymousClass3PQ.A02(r11, r1)
            if (r3 == 0) goto L_0x0205
            r2 = r46
            X.AnonymousClass3NW.A02(r11, r3, r2)
            goto L_0x0205
        L_0x0834:
            X.3oV r2 = r0.A0O
            r2.setVisibility(r6)
            X.3oV r2 = r0.A0P
            r2.setVisibility(r6)
            X.3oV r2 = r0.A0Q
            r2.setVisibility(r6)
            android.widget.FrameLayout r10 = r0.A0H
            r2 = r27
            X.AnonymousClass0fU.A00(r2, r10)
            r2 = r28
            r10.setOnTouchListener(r2)
            com.instagram.ui.widget.gradientspinner.GradientSpinner r2 = r0.A0T
            r46 = r2
            r3 = r2
            r2 = r18
            r3.setVisibility(r2)
            r2 = r19
            r10.setImportantForAccessibility(r2)
            goto L_0x0205
        L_0x0860:
            r13 = 0
            goto L_0x00cd
        L_0x0863:
            r16 = 0
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C67430Mnl.A03(android.app.Activity, android.content.Context, X.0iw, com.instagram.common.session.UserSession, X.Mg0, X.Ma1, X.Mg7, X.PxY, X.Mnm, X.Mnn, X.XAH):void");
    }
}
