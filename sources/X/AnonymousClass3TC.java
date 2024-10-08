package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3TC  reason: invalid class name */
public final class AnonymousClass3TC {
    public Integer A00 = AnonymousClass05K.A0C;
    public final Context A01;
    public final UserSession A02;
    public final C234432xr A03;
    public final AnonymousClass3TA A04;
    public final AnonymousClass2xS A05;
    public final FragmentActivity A06;
    public final AnonymousClass4DV A07;
    public final User A08;
    public final boolean A09;
    public final boolean A0A;

    public AnonymousClass3TC(Context context, FragmentActivity fragmentActivity, UserSession userSession, C234432xr r5, AnonymousClass3TA r6, AnonymousClass2xS r7, AnonymousClass4DV r8, boolean z, boolean z2) {
        0qQ.A0B(fragmentActivity, 1);
        0qQ.A0B(context, 2);
        0qQ.A0B(r7, 4);
        0qQ.A0B(r5, 5);
        0qQ.A0B(r6, 6);
        0qQ.A0B(userSession, 7);
        0qQ.A0B(r8, 9);
        this.A06 = fragmentActivity;
        this.A01 = context;
        this.A09 = z;
        this.A05 = r7;
        this.A03 = r5;
        this.A04 = r6;
        this.A02 = userSession;
        this.A0A = z2;
        this.A07 = r8;
        this.A08 = 0eE.A00(userSession).A00();
    }

    public static final boolean A00(AnonymousClass3TR r2) {
        Object obj;
        AnonymousClass3VD r1;
        View view = (View) C242173Sx.A06(new AnonymousClass044(r2.A09));
        if (view != null) {
            obj = view.getTag();
        } else {
            obj = null;
        }
        if (!(obj instanceof C262804Gb) || (r1 = ((C262804Gb) obj).A0I.A04) == null) {
            return false;
        }
        return r1.A06;
    }

    public final AnonymousClass3TP A01(Context context, ViewGroup viewGroup, AnonymousClass0iw r15) {
        int A032 = AnonymousClass0fD.A03(-262495976);
        0qQ.A0B(context, 0);
        0qQ.A0B(r15, 1);
        LayoutInflater from = LayoutInflater.from(context);
        0qQ.A07(from);
        View A012 = 2Su.A01(from, new ViewGroup.LayoutParams(-1, -2), viewGroup, R.layout.row_feed_carousel_media_group, false, true);
        0qQ.A0B(A012, 1);
        AnonymousClass3TP r4 = new AnonymousClass3TP(context, true);
        r4.addView(A012);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        r4.setLayoutParams(layoutParams);
        AnonymousClass3TR r2 = new AnonymousClass3TR(r4, r15, this.A02);
        r2.A09.setPageSpacing(0.0f);
        r4.setTag(r2);
        r2.A08.A01();
        r4.addOnAttachStateChangeListener(new AnonymousClass3UC(this, r2));
        AnonymousClass0fD.A0A(-115922775, A032);
        return r4;
    }

    /* JADX WARNING: type inference failed for: r11v23, types: [com.facebook.pando.TreeJNI, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00bd, code lost:
        if (X.182.A06(X.0Tu.A05, r0, 36328070340164526L) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0541, code lost:
        if (r10 == false) goto L_0x0254;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x03ca  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x03f9  */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0431  */
    /* JADX WARNING: Removed duplicated region for block: B:118:0x0448  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x044b  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0529  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x052e  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x0532  */
    /* JADX WARNING: Removed duplicated region for block: B:162:0x0545  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x0576  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x01e8  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0200  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0250  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02c2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x02cc  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x02f2  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x030d  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C229382nI r46, X.C262774Fy r47, X.C262754Fw r48, X.AnonymousClass3TR r49, X.AnonymousClass4DU r50, X.AnonymousClass3W1 r51) {
        /*
            r45 = this;
            r0 = -59766034(0xfffffffffc700aee, float:-4.9854917E36)
            int r20 = X.AnonymousClass0fD.A03(r0)
            r4 = 0
            r6 = r49
            X.0qQ.A0B(r6, r4)
            r3 = 1
            r7 = r48
            X.0qQ.A0B(r7, r3)
            r1 = 2
            r44 = r47
            r0 = r44
            X.0qQ.A0B(r0, r1)
            r14 = 3
            r5 = r51
            X.0qQ.A0B(r5, r14)
            r17 = 4
            r43 = r50
            r1 = r43
            r0 = r17
            X.0qQ.A0B(r1, r0)
            X.1Xj r2 = r7.A0D
            X.3W1 r0 = r7.A0G
            r42 = r0
            X.0qQ.A0B(r2, r4)
            X.0qQ.A0B(r0, r3)
            X.AnonymousClass4FX.A01(r2, r0)
            com.instagram.ui.mediaactions.LikeActionView r11 = r6.A0E
            r11.A00()
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r1 = r6.A09
            android.view.ViewGroup$LayoutParams r9 = r1.getLayoutParams()
            X.0qQ.A07(r9)
            r8 = r45
            androidx.fragment.app.FragmentActivity r0 = r8.A06
            r41 = r0
            android.content.Context r0 = r8.A01
            r40 = r0
            boolean r0 = X.2Y9.A00
            if (r0 == 0) goto L_0x0086
            com.instagram.common.session.UserSession r0 = r8.A02
            int r10 = X.0Pn.A01(r0)
            r0 = r40
            int r13 = X.2Yu.A0G(r0, r10)
            int r0 = r7.A01
            int r13 = r13 + r0
            int r0 = X.AnonymousClass2uJ.A00
            int r13 = r13 + r0
            int r0 = X.2db.A01(r41)
            int r13 = r13 + r0
            X.3v2 r12 = X.C255983v2.A00
            com.instagram.model.mediasize.ExtendedImageUrl r10 = r7.A0H
            r0 = r40
            android.util.Size r10 = r12.A01(r0, r10, r13, r4)
            if (r10 == 0) goto L_0x0086
            int r0 = r10.getWidth()
            r9.width = r0
            int r0 = r10.getHeight()
            r9.height = r0
        L_0x0086:
            X.3W1 r9 = r6.A02
            if (r9 == 0) goto L_0x009f
            if (r9 == r5) goto L_0x009f
            r9.A0V(r11)
            r9.A0Y(r11)
            X.3TS r0 = r6.A08
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r0 = r0.A01()
            r9.A0S(r0)
            r0 = 0
            r9.A0M(r6, r0, r3)
        L_0x009f:
            r6.A02 = r5
            r6.A01 = r7
            X.2xS r0 = r8.A05
            r19 = r0
            r6.A03 = r0
            com.instagram.common.session.UserSession r0 = r8.A02
            boolean r9 = X.1sx.A0E(r0, r2, r5)
            if (r9 == 0) goto L_0x00bf
            X.0Tu r12 = X.0Tu.A05
            r9 = 36328070340164526(0x81103000003bae, double:3.0373561922933887E-306)
            boolean r10 = X.182.A06(r12, r0, r9)
            r9 = 1
            if (r10 != 0) goto L_0x00c0
        L_0x00bf:
            r9 = 0
        L_0x00c0:
            r6.A05 = r9
            if (r9 == 0) goto L_0x00d8
            X.0Tu r12 = X.0Tu.A05
            r9 = 37172495270347331(0x84103000010243, double:3.5713739183672665E-306)
            double r9 = X.182.A00(r12, r0, r9)
            r12 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r9 = r9 * r12
            long r12 = (long) r9
            r6.A00 = r12
        L_0x00d8:
            r5.A0T(r11)
            r5.A0X(r11)
            r6.A04 = r4
            X.3TS r11 = r6.A08
            X.9IQ r9 = r7.A09
            X.C250563lf.A0f(r9, r11, r5)
            boolean r9 = r9.A01
            if (r9 == 0) goto L_0x00ff
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r9 = r11.A01()
            r5.A0v = r9
            com.instagram.ui.widget.slideouticon.SlideInAndOutIconView r12 = r11.A01()
            X.IB4 r10 = new X.IB4
            r9 = r44
            r10.<init>(r9, r7, r8)
            X.AnonymousClass0fU.A00(r10, r12)
        L_0x00ff:
            X.3TV r12 = r6.A0B
            X.9I9 r15 = r7.A07
            X.0qQ.A0B(r12, r4)
            X.0qQ.A0B(r15, r3)
            boolean r13 = r15.A02
            boolean r10 = r15.A04
            int r9 = r15.A00
            int r15 = r15.A01
            boolean r9 = X.C247023fe.A01(r0, r9, r15, r13, r10)
            if (r9 == 0) goto L_0x0590
            X.0Tu r13 = X.0Tu.A05
            r9 = 36316650022310442(0x8105cd0003122a, double:3.030133937296537E-306)
            boolean r9 = X.182.A06(r13, r0, r9)
            if (r9 == 0) goto L_0x0590
            r12.A00 = r15
            X.3W1 r10 = r12.A01
            if (r10 == 0) goto L_0x012e
            r9 = 0
            r10.A0M(r12, r9, r3)
        L_0x012e:
            r9 = 0
            r5.A0L(r12, r9, r3)
            r12.A01 = r5
        L_0x0134:
            int r10 = r5.A03
            int r9 = r5.A02
            if (r10 == r9) goto L_0x013d
            r5.A0B(r9)
        L_0x013d:
            X.3TT r13 = r6.A0C
            X.4Fs r12 = r7.A0E
            java.lang.String r9 = r43.getModuleName()
            X.0qQ.A0B(r13, r4)
            X.0qQ.A0B(r12, r3)
            X.0qQ.A0B(r9, r14)
            X.3W1 r10 = r13.A04
            if (r10 == r5) goto L_0x0158
            if (r10 == 0) goto L_0x0158
            r9 = 0
            r10.A0M(r13, r9, r3)
        L_0x0158:
            r13.A03 = r12
            r13.A04 = r5
            r21 = 0
            r9 = r21
            r5.A0L(r13, r9, r3)
            boolean r15 = r12.A06
            boolean r14 = r12.A05
            int r10 = r12.A00
            int r9 = r12.A03
            boolean r10 = X.C247023fe.A01(r0, r10, r9, r15, r14)
            if (r10 != 0) goto L_0x0173
            int r9 = r12.A01
        L_0x0173:
            r13.A00 = r9
            r13.A07 = r4
            r13.A05()
            r13.A06()
            r13.A04()
            X.3TW r12 = r6.A0D
            X.9J0 r10 = r7.A0A
            X.3TA r9 = r8.A04
            r39 = r9
            X.4G1 r27 = r39.Aow()
            r22 = r41
            r23 = r10
            r24 = r0
            r25 = r43
            r26 = r12
            r28 = r5
            X.AnonymousClass4G2.A00(r22, r23, r24, r25, r26, r27, r28)
            X.3TX r13 = r6.A07
            X.9IE r12 = r7.A08
            X.3fP r10 = r39.Ahs()
            com.instagram.user.model.User r9 = r8.A08
            X.AnonymousClass4G6.A00(r12, r10, r13, r9)
            r1.A0F()
            boolean r9 = X.C262574Fa.A00(r0, r2)
            if (r9 == 0) goto L_0x0589
            X.0Tu r12 = X.0Tu.A05
            r9 = 36612259736852796(0x8212a8000a193c, double:3.2170787110979E-306)
            long r14 = X.182.A01(r12, r0, r9)
            java.lang.Long r9 = java.lang.Long.valueOf(r14)
            r12 = 1
            if (r9 == 0) goto L_0x0589
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x057a
            X.H7s r10 = new X.H7s
            r9 = r40
            r10.<init>(r9)
        L_0x01cf:
            r1.A0J = r10
            X.3TG r9 = r7.A0B
            r1.setScrollMode(r9)
            java.lang.Integer r12 = r7.A0J
            if (r12 == 0) goto L_0x01e0
            int r9 = r12.intValue()
            r1.A0C = r9
        L_0x01e0:
            android.widget.Adapter r9 = r1.getAdapter()
            boolean r10 = r9 instanceof X.AnonymousClass4G8
            if (r10 == 0) goto L_0x0576
            X.4G8 r9 = (X.AnonymousClass4G8) r9
        L_0x01ea:
            boolean r10 = r8.A09
            r18 = r10
            boolean r10 = r8.A0A
            r16 = r10
            r10 = 5
            X.0qQ.A0B(r11, r10)
            r10 = r44
            X.4Fq r10 = r10.A02
            if (r9 == 0) goto L_0x0545
            X.1Xj r13 = r9.A0B
            if (r13 != r2) goto L_0x0545
            int r13 = r7.A04
            com.instagram.common.session.UserSession r10 = r10.A01
            r22 = r9
            r23 = r11
            r24 = r10
            r25 = r39
            r26 = r42
            r27 = r19
            r28 = r12
            r29 = r13
            r22.A03(r23, r24, r25, r26, r27, r28, r29)
        L_0x0217:
            int r10 = r7.A05
            r16 = r10
            r1.A0M(r10, r4)
            float r10 = r1.A00
            float r11 = r7.A00
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 != 0) goto L_0x022c
            boolean r10 = X.C262574Fa.A00(r0, r2)
            if (r10 != 0) goto L_0x022f
        L_0x022c:
            r1.setPageSpacing(r11)
        L_0x022f:
            int r10 = r5.A03
            r22 = r44
            r23 = r40
            r24 = r7
            r25 = r43
            r26 = r21
            r27 = r10
            r22.A02(r23, r24, r25, r26, r27)
            X.4GQ r22 = X.AnonymousClass4GQ.A00
            X.3TY r10 = r6.A0A
            r19 = r10
            X.3ex r11 = r7.A0C
            if (r11 == 0) goto L_0x0532
            boolean r10 = X.GMK.A03(r0, r11)
            if (r10 != r3) goto L_0x0532
            android.content.res.Resources r13 = r40.getResources()
        L_0x0254:
            r12 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x0256:
            int r34 = r13.getDimensionPixelSize(r12)
            java.lang.String r10 = r7.A0K
            X.4GR r15 = new X.4GR
            r15.<init>(r0, r5, r10)
            X.33B r26 = r39.Aqg()
            r12 = r44
            r10 = r43
            X.3fK r27 = r12.A00(r7, r10)
            java.lang.ref.WeakReference r14 = new java.lang.ref.WeakReference
            r10 = r41
            r14.<init>(r10)
            if (r11 == 0) goto L_0x052e
            boolean r36 = X.GMK.A02(r0, r11)
        L_0x027a:
            X.4DV r10 = r8.A07
            r18 = r10
            r12 = 33
            X.9MI r13 = new X.9MI
            r10 = r43
            r13.<init>((int) r12, (java.lang.Object) r7, (java.lang.Object) r8, (java.lang.Object) r10)
            boolean r37 = X.C247163fs.A00(r40)
            boolean r35 = X.C249223jK.A03(r0)
            r23 = r0
            r24 = r15
            r25 = r11
            r28 = r19
            r29 = r10
            r30 = r5
            r31 = r18
            r32 = r14
            r33 = r13
            r22.A01(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37)
            X.4GT r10 = new X.4GT
            r10.<init>(r1)
            X.03v.A0B(r1, r10)
            android.widget.Adapter r10 = r1.getAdapter()
            boolean r10 = X.0qQ.A0K(r10, r9)
            if (r10 == 0) goto L_0x0529
            boolean r10 = X.C262574Fa.A00(r0, r2)
            if (r10 != 0) goto L_0x02c2
            boolean r10 = A00(r6)
            if (r10 == 0) goto L_0x0529
        L_0x02c2:
            r10 = 765903374(0x2da6c20e, float:1.8958193E-11)
            X.0fE.A00(r9, r10)
        L_0x02c8:
            int r10 = r7.A03
            if (r10 >= 0) goto L_0x044b
            X.3v1 r11 = r1.A0J
            boolean r10 = r11 instanceof X.AnonymousClass4HB
            if (r10 != 0) goto L_0x02da
            boolean r10 = r11 instanceof X.AnonymousClass4GX
            if (r10 != 0) goto L_0x02da
            boolean r10 = r11 instanceof X.AnonymousClass4HD
            if (r10 == 0) goto L_0x02e8
        L_0x02da:
            r10 = -1
            r1.A0C = r10
            r10 = 0
            r1.setPageSpacing(r10)
            X.H7r r10 = new X.H7r
            r10.<init>()
            r1.A0J = r10
        L_0x02e8:
            boolean r10 = r7.A0M
            if (r10 == 0) goto L_0x0448
            boolean r10 = X.C262574Fa.A00(r0, r2)
            if (r10 == 0) goto L_0x0448
            r11 = r17
            r10 = r40
            int r10 = X.C61380mr.A01(r10, r11)
        L_0x02fa:
            android.view.ViewGroup r12 = r6.A06
            r12.setPadding(r4, r4, r4, r10)
            r12.setClipChildren(r3)
            r12.setClipToPadding(r3)
        L_0x0305:
            X.1Xy r10 = r2.A0C
            X.48Z r10 = r10.BYE()
            if (r10 == 0) goto L_0x03c4
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r3)
            java.lang.Boolean r10 = r10.BVa()
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x03c4
            int r14 = r2.A0o()
            int r14 = r14 - r3
            int r13 = r2.A14()
            int r11 = r2.A0o()
            int r10 = r11 + -2
            if (r14 == r13) goto L_0x032e
            int r10 = r11 - r3
        L_0x032e:
            int r11 = java.lang.Math.max(r4, r10)
            r10 = r42
            r10.A0B(r11)
            r10.A0A(r11)
            X.1Xy r10 = r2.A0C
            X.48Z r11 = r10.BYE()
            if (r11 == 0) goto L_0x03c4
            X.1Xy r10 = r2.A0C
            r28 = r10
            java.lang.Boolean r14 = r11.BC3()
            java.lang.Boolean r13 = r11.CYY()
            java.lang.Boolean r10 = r11.CYs()
            java.lang.Boolean r19 = r11.Ca7()
            r11.BVa()
            java.lang.Boolean r18 = java.lang.Boolean.valueOf(r4)
            boolean r4 = r11 instanceof X.CRL
            if (r4 == 0) goto L_0x0435
            com.facebook.pando.TreeUpdaterJNI r4 = com.facebook.pando.TreeUpdaterJNI.$redex_init_class
            r4 = 626(0x272, float:8.77E-43)
            java.lang.String r15 = X.AnonymousClass000.A00(r4)
            X.0eP r17 = new X.0eP
            r4 = r17
            r4.<init>(r15, r14)
            r4 = 4951(0x1357, float:6.938E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r4)
            X.0eP r16 = new X.0eP
            r4 = r16
            r4.<init>(r14, r13)
            r4 = 4952(0x1358, float:6.939E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.0eP r15 = new X.0eP
            r15.<init>(r4, r10)
            r4 = 4959(0x135f, float:6.949E-42)
            java.lang.String r10 = X.AnonymousClass000.A00(r4)
            X.0eP r14 = new X.0eP
            r4 = r19
            r14.<init>(r10, r4)
            r4 = 711(0x2c7, float:9.96E-43)
            java.lang.String r4 = X.AnonymousClass000.A00(r4)
            X.0eP r13 = new X.0eP
            r10 = r4
            r4 = r18
            r13.<init>(r10, r4)
            r10 = r17
            r4 = r16
            X.0eP[] r4 = new X.0eP[]{r10, r4, r15, r14, r13}
            java.util.LinkedHashMap r10 = X.0Yt.A06(r4)
            com.facebook.pando.TreeJNI r11 = (com.facebook.pando.TreeJNI) r11
            com.facebook.pando.TreeUpdaterJNI r4 = new com.facebook.pando.TreeUpdaterJNI
            r4.<init>(r10, r11)
            com.facebook.pando.TreeJNI r11 = r4.applyToTree(r11)
            X.0qQ.A07(r11)
        L_0x03bd:
            X.48Z r11 = (X.AnonymousClass48Z) r11
            r4 = r28
            r4.Eeg(r11)
        L_0x03c4:
            boolean r10 = r5.A2U
            int r4 = r5.A03
            if (r10 == 0) goto L_0x0431
            float r4 = (float) r4
            r10 = 0
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager.A05(r1, r10, r4, r3)
        L_0x03d0:
            X.0Tu r4 = X.0Tu.A05
            r10 = 36329397485060185(0x81116500004059, double:3.038195484069387E-306)
            boolean r0 = X.182.A06(r4, r0, r10)
            r1.A0Z = r0
            X.4HE r0 = new X.4HE
            r22 = r0
            r23 = r44
            r24 = r7
            r25 = r9
            r26 = r8
            r27 = r6
            r28 = r43
            r29 = r5
            r22.<init>(r23, r24, r25, r26, r27, r28, r29)
            r1.A0P(r0)
            boolean r0 = r5.A37
            if (r0 == 0) goto L_0x0402
            int r4 = r42.getPosition()
            r0 = r39
            r0.DeZ(r1, r2, r4)
        L_0x0402:
            android.content.Context r11 = r12.getContext()
            X.0qQ.A07(r11)
            r0 = r44
            com.instagram.common.session.UserSession r0 = r0.A01
            r13 = r0
            r14 = r2
            r15 = r43
            r16 = r42
            X.AnonymousClass4HG.A00(r11, r12, r13, r14, r15, r16)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r8.A00 = r0
            X.3W1 r1 = r6.A02
            if (r1 == 0) goto L_0x0423
            r0 = r21
            r1.A0L(r6, r0, r3)
        L_0x0423:
            X.3aa r0 = X.C244063aa.MEDIA
            X.C244083ac.A05(r12, r0)
            r1 = -1942740694(0xffffffff8c34212a, float:-1.3876676E-31)
            r0 = r20
            X.AnonymousClass0fD.A0A(r1, r0)
            return
        L_0x0431:
            r1.A0K(r4)
            goto L_0x03d0
        L_0x0435:
            X.4JR r11 = new X.4JR
            r22 = r11
            r23 = r14
            r24 = r13
            r25 = r10
            r26 = r19
            r27 = r18
            r22.<init>(r23, r24, r25, r26, r27)
            goto L_0x03bd
        L_0x0448:
            r10 = 0
            goto L_0x02fa
        L_0x044b:
            X.0Tu r12 = X.0Tu.A05
            r10 = 2342163288486256827(0x2081091a002f20bb, double:4.065822679680673E-152)
            boolean r10 = X.182.A06(r12, r0, r10)
            if (r10 != 0) goto L_0x0474
            r10 = 2342163288483569819(0x2081091a0006209b, double:4.065822677402318E-152)
            boolean r10 = X.182.A06(r12, r0, r10)
            if (r10 == 0) goto L_0x048b
            boolean r10 = X.C56645I6a.A02(r0)
            if (r10 != 0) goto L_0x048b
            r10 = 2342163288486518972(0x2081091a003320bc, double:4.06582267990295E-152)
            boolean r10 = X.182.A06(r12, r0, r10)
            if (r10 != 0) goto L_0x048b
        L_0x0474:
            android.util.Size r10 = r7.A06
            if (r10 == 0) goto L_0x048b
            int r14 = r10.getWidth()
            float r10 = r1.A00
            int r13 = (int) r10
            X.Hia r11 = new X.Hia
            r11.<init>(r7)
            X.4HB r10 = new X.4HB
            r10.<init>(r11, r14, r13)
            r1.A0J = r10
        L_0x048b:
            boolean r10 = X.C56645I6a.A02(r0)
            if (r10 == 0) goto L_0x04ae
            android.util.Size r10 = r7.A06
            if (r10 == 0) goto L_0x04ae
            int r10 = r10.getWidth()
            r1.A0C = r10
            android.content.res.Resources r11 = r40.getResources()
            r10 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r10 = r11.getDimensionPixelSize(r10)
            float r11 = (float) r10
            r10 = 1062501089(0x3f547ae1, float:0.83)
            float r11 = r11 / r10
            r1.setPageSpacing(r11)
        L_0x04ae:
            X.3v1 r10 = r1.A0J
            boolean r10 = r10 instanceof X.AnonymousClass4GX
            if (r10 != 0) goto L_0x04e6
            r10 = 2342163288486256827(0x2081091a002f20bb, double:4.065822679680673E-152)
            boolean r10 = X.182.A06(r12, r0, r10)
            if (r10 != 0) goto L_0x04e6
            r10 = 2342163288486518972(0x2081091a003320bc, double:4.06582267990295E-152)
            boolean r10 = X.182.A06(r12, r0, r10)
            if (r10 != 0) goto L_0x04e6
            r10 = 36320279271317678(0x81091a001c20ae, double:3.032429088982526E-306)
            boolean r10 = X.182.A06(r12, r0, r10)
            if (r10 == 0) goto L_0x04e6
            android.util.Size r10 = r7.A06
            if (r10 == 0) goto L_0x04e6
            int r13 = r5.A09
            r11 = 0
            if (r13 != 0) goto L_0x04df
            r11 = 1
        L_0x04df:
            X.4GX r10 = new X.4GX
            r10.<init>(r13, r11)
            r1.A0J = r10
        L_0x04e6:
            X.3v1 r10 = r1.A0J
            boolean r10 = r10 instanceof X.AnonymousClass4HD
            if (r10 != 0) goto L_0x0507
            r10 = 2342163288486518972(0x2081091a003320bc, double:4.06582267990295E-152)
            boolean r10 = X.182.A06(r12, r0, r10)
            if (r10 == 0) goto L_0x0507
            android.util.Size r10 = r7.A06
            if (r10 == 0) goto L_0x0507
            X.HqH r11 = new X.HqH
            r11.<init>(r7, r8, r5)
            X.4HD r10 = new X.4HD
            r10.<init>(r11)
            r1.A0J = r10
        L_0x0507:
            if (r16 == 0) goto L_0x02e8
            android.content.res.Resources r11 = r40.getResources()
            r10 = 2131165196(0x7f07000c, float:1.7944602E38)
            int r13 = r11.getDimensionPixelSize(r10)
            android.view.ViewGroup r12 = r6.A06
            int r11 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            r12.setPadding(r11, r13, r10, r13)
            r12.setClipChildren(r4)
            r12.setClipToPadding(r4)
            goto L_0x0305
        L_0x0529:
            r1.setAdapter((android.widget.Adapter) r9)
            goto L_0x02c8
        L_0x052e:
            r36 = 0
            goto L_0x027a
        L_0x0532:
            r12 = r43
            r10 = r21
            boolean r10 = X.C243193Xt.A05(r12, r0, r2, r2, r10)
            android.content.res.Resources r13 = r40.getResources()
            r12 = 2131165193(0x7f070009, float:1.7944596E38)
            if (r10 != 0) goto L_0x0256
            goto L_0x0254
        L_0x0545:
            X.0Pl r15 = r10.A02
            int r14 = r7.A04
            com.instagram.common.session.UserSession r13 = r10.A01
            java.lang.Float r10 = r7.A0I
            X.4G8 r9 = new X.4G8
            r24 = r46
            r28 = r39
            r29 = r2
            r30 = r43
            r31 = r42
            r32 = r15
            r33 = r19
            r34 = r10
            r35 = r12
            r36 = r14
            r37 = r18
            r38 = r16
            r22 = r9
            r23 = r40
            r25 = r11
            r26 = r13
            r27 = r1
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38)
            goto L_0x0217
        L_0x0576:
            r9 = r21
            goto L_0x01ea
        L_0x057a:
            r12 = 2
            int r9 = (r14 > r12 ? 1 : (r14 == r12 ? 0 : -1))
            if (r9 != 0) goto L_0x0589
            X.H7u r10 = new X.H7u
            r9 = r40
            r10.<init>(r9)
            goto L_0x01cf
        L_0x0589:
            X.3v0 r10 = new X.3v0
            r10.<init>()
            goto L_0x01cf
        L_0x0590:
            X.3oV r10 = r12.A02
            r9 = 8
            r10.setVisibility(r9)
            goto L_0x0134
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TC.A02(X.2nI, X.4Fy, X.4Fw, X.3TR, X.4DU, X.3W1):void");
    }
}
