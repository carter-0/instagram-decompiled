package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.6xN  reason: invalid class name and case insensitive filesystem */
public final class C323366xN extends C252233om implements AnonymousClass4DS {
    public int A00 = -1;
    public View A01;
    public ImageView A02;
    public ImageView A03;
    public ImageView A04;
    public ImageView A05;
    public C46766Dkt A06;
    public List A07;
    public boolean A08;
    public ImageView A09;
    public boolean A0A;
    public boolean A0B;
    public final C249453jo A0C;
    public final AnonymousClass4DH A0D;
    public final UserSession A0E;
    public final AnonymousClass4DU A0F;
    public final C322456vr A0G;
    public final C323346xL A0H;
    public final UserDetailFragment A0I;
    public final UserDetailLaunchConfig A0J;
    public final C322356vh A0K;
    public final C323536xe A0L;
    public final boolean A0M;
    public final 0hq A0N;
    public final boolean A0O;
    public final boolean A0P;

    public final void onStop() {
        this.A08 = false;
        this.A0A = false;
    }

    public C323366xN(0hq r16, C249453jo r17, AnonymousClass4DH r18, UserSession userSession, AnonymousClass4DU r20, C322456vr r21, C323346xL r22, UserDetailFragment userDetailFragment, UserDetailLaunchConfig userDetailLaunchConfig, C322356vh r25, boolean z, boolean z2) {
        C249453jo r4 = r17;
        this.A0C = r4;
        UserSession userSession2 = userSession;
        this.A0E = userSession2;
        this.A0H = r22;
        this.A0I = userDetailFragment;
        this.A0D = r18;
        this.A0N = r16;
        AnonymousClass4DU r2 = r20;
        this.A0F = r2;
        this.A0J = userDetailLaunchConfig;
        this.A0G = r21;
        this.A0K = r25;
        this.A0O = z;
        this.A0M = true;
        this.A0L = C249713kF.A00.A0Q((FragmentActivity) r4, userSession2, (C15380UbZ) null, (C17869VhM) null, (String) null, r2.getModuleName(), "profile", (String) null, (String) null, (String) null, (String) null);
        this.A0P = z2;
    }

    private void A00(Context context, 2da r4, User user) {
        AnonymousClass3JR r1 = new AnonymousClass3JR();
        r1.A0A = R.layout.navbar_profile_share_button;
        r1.A05 = 2131970067;
        r1.A0G = new C318566pA(this, user);
        ImageView imageView = (ImageView) r4.AA5(new AnonymousClass3Jb(r1));
        this.A09 = imageView;
        2eQ.A08(imageView, context.getString(2131970066));
    }

    public static void A01(C323366xN r3, boolean z) {
        ImageView imageView = r3.A03;
        if (imageView != null) {
            Resources resources = ((Context) r3.A0C).getResources();
            int i = R.drawable.instagram_alert_new_pano_outline_24;
            if (z) {
                i = R.drawable.instagram_alert_check_new_pano_outline_24;
            }
            imageView.setImageDrawable(resources.getDrawable(i));
        }
    }

    public final void A02(boolean z) {
        ImageView imageView = this.A03;
        if (imageView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            imageView.setVisibility(i);
            if (z && !this.A0B) {
                this.A0B = true;
                this.A0I.A10("user_profile_header", "notifications_entry_point_impression");
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (X.C319886rO.A03(r10.A0E) == false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(boolean r11) {
        /*
            r10 = this;
            X.6xL r3 = r10.A0H
            X.Dc6 r0 = r3.A08
            com.instagram.user.model.User r6 = r0.A03
            if (r6 == 0) goto L_0x0050
            android.widget.ImageView r5 = r10.A02
            if (r5 == 0) goto L_0x0050
            r1 = 1
            r4 = 0
            if (r11 == 0) goto L_0x0019
            com.instagram.common.session.UserSession r0 = r10.A0E
            boolean r2 = X.C319886rO.A03(r0)
            r0 = 1
            if (r2 != 0) goto L_0x001c
        L_0x0019:
            r0 = 0
            r4 = 8
        L_0x001c:
            r5.setVisibility(r4)
            if (r0 == 0) goto L_0x0050
            boolean r0 = r10.A0A
            if (r0 != 0) goto L_0x0050
            com.instagram.common.session.UserSession r5 = r10.A0E
            boolean r0 = X.2R8.A04(r5, r6)
            X.4DU r4 = r10.A0F
            if (r0 == 0) goto L_0x0053
            java.lang.String r7 = "self_profile_switcher"
        L_0x0031:
            java.lang.String r8 = r6.getId()
            X.4DH r0 = r10.A0D
            android.content.Context r0 = r0.requireContext()
            boolean r9 = X.0oI.A0A(r0)
            X.6xC r0 = r3.A05
            X.6xK r0 = r0.A0D
            if (r0 == 0) goto L_0x0051
            int r0 = r0.A00
        L_0x0047:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            X.C321406u6.A04(r4, r5, r6, r7, r8, r9)
            r10.A0A = r1
        L_0x0050:
            return
        L_0x0051:
            r0 = 0
            goto L_0x0047
        L_0x0053:
            java.lang.String r7 = "other_profile_switcher"
            goto L_0x0031
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323366xN.A03(boolean):void");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.KI1, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x0468, code lost:
        if (r16 != false) goto L_0x046a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0486, code lost:
        if (r12.A0H() != X.Dc9.A03) goto L_0x0488;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005f, code lost:
        if (r12 != null) goto L_0x0061;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0581, code lost:
        if (r0 != false) goto L_0x0583;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x032c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x03b7  */
    /* JADX WARNING: Removed duplicated region for block: B:138:0x03d6  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x03de  */
    /* JADX WARNING: Removed duplicated region for block: B:141:0x03e2  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x03e6  */
    /* JADX WARNING: Removed duplicated region for block: B:144:0x03f0  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x04d5  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x04d8  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x055c  */
    /* JADX WARNING: Removed duplicated region for block: B:220:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0181  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void configureActionBar(X.2da r18) {
        /*
            r17 = this;
            r9 = r17
            X.6xL r7 = r9.A0H
            X.Dc6 r6 = r7.A08
            com.instagram.user.model.User r12 = r6.A03
            com.instagram.profile.intf.UserDetailLaunchConfig r13 = r9.A0J
            java.lang.String r2 = r13.A0J
            r1 = 0
            r5 = 1
            r8 = r18
            if (r2 == 0) goto L_0x0562
            java.lang.String r0 = "com.instagram.barcelona"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0562
        L_0x001a:
            r8.Eu4(r1)
            r2 = 0
        L_0x001e:
            boolean r0 = r9.A0P
            if (r0 == 0) goto L_0x0025
            if (r2 == 0) goto L_0x0025
            r1 = 1
        L_0x0025:
            r10 = r8
            X.2dZ r10 = (X.2dZ) r10
            if (r1 == 0) goto L_0x055c
            android.view.ViewStub r1 = r10.A0R
            if (r1 == 0) goto L_0x003a
            android.view.ViewParent r0 = r1.getParent()
            if (r0 == 0) goto L_0x003a
            android.view.View r0 = r1.inflate()
            r10.A03 = r0
        L_0x003a:
            android.view.View r0 = r10.A03
            r1 = 0
        L_0x003d:
            r0.setVisibility(r1)
            android.view.View r0 = r10.A0N
            r0.setVisibility(r1)
            r8.ErT(r7)
            com.instagram.common.session.UserSession r4 = r9.A0E
            r3 = 0
            X.0qQ.A0B(r4, r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36327795462978252(0x810ff0000b3acc, double:3.0371823588539474E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            r11 = 0
            if (r0 == 0) goto L_0x04d8
            r8.setTitle(r11)
            if (r12 == 0) goto L_0x0129
        L_0x0061:
            boolean r0 = r9.A0O
            if (r0 == 0) goto L_0x0129
            com.instagram.profile.fragment.UserDetailFragment r1 = r7.A07
            boolean r16 = r1.A15()
            if (r16 == 0) goto L_0x0071
            boolean r0 = r1.A1l
            if (r0 == 0) goto L_0x0129
        L_0x0071:
            X.6zS r15 = new X.6zS
            r15.<init>(r9)
            if (r16 == 0) goto L_0x04d5
            boolean r0 = X.2R8.A00(r4)
            if (r0 == 0) goto L_0x04d5
            X.FPR r13 = new X.FPR
            r13.<init>(r9)
        L_0x0083:
            X.3jo r14 = r9.A0C
            android.content.Context r14 = (android.content.Context) r14
            boolean r0 = r1.A1l
            if (r0 == 0) goto L_0x03f0
            r0 = 2131238541(0x7f081e8d, float:1.8093364E38)
            X.3JS r12 = new X.3JS
            r12.<init>(r14, r0)
            r0 = 36320889154839479(0x8109a8000023b7, double:3.0328147817775166E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x03ea
            r0 = 2130970239(0x7f04067f, float:1.7549183E38)
            r12.A02(r0, r5)
        L_0x00a4:
            X.3JR r1 = new X.3JR
            r1.<init>()
            r1.A0F = r12
            r0 = 2131966173(0x7f1338dd, float:1.9569177E38)
            r1.A05 = r0
            r1.A0G = r15
            r1.A0H = r13
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            android.view.View r0 = r8.AA3(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.A04 = r0
            r9.A01 = r0
            r0 = 2342163236943700083(0x2081090e00022073, double:4.0657789759647865E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x0120
            X.6xC r0 = r7.A05
            int r12 = r0.A03()
            int r0 = r9.A00
            if (r12 == r0) goto L_0x010c
            X.2aO r0 = X.2aN.A00(r4)
            X.2aT r13 = r0.A00()
            X.2aD r0 = X.2aD.A0c
            X.2aX r1 = new X.2aX
            r1.<init>(r0, r12)
            X.2g1 r0 = X.AnonymousClass2g1.PROFILE_PAGE
            X.2fx r15 = X.C226252fx.NUMBERED
            r13.A02(r15, r0, r1)
            X.2aO r0 = X.2aN.A00(r4)
            X.2aV r14 = r0.A01()
            X.2aD r0 = X.2aD.A0b
            X.2aX r13 = new X.2aX
            r13.<init>(r0, r12)
            X.2g1 r1 = X.AnonymousClass2g1.TOP_NAVIGATION_BAR
            X.0qQ.A0B(r1, r3)
            X.3Jd r0 = new X.3Jd
            r0.<init>(r15, r1, r11, r11)
            r14.A02(r0, r13)
            r9.A00 = r12
        L_0x010c:
            android.widget.ImageView r0 = r9.A04
            r0.getClass()
            r0.setImageLevel(r12)
            android.widget.ImageView r1 = r9.A04
            r1.getClass()
            r0 = 0
            if (r12 <= 0) goto L_0x011d
            r0 = 1
        L_0x011d:
            r1.setActivated(r0)
        L_0x0120:
            android.view.View r1 = r9.A01
            if (r1 == 0) goto L_0x0129
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            X.2eS.A04(r1, r0)
        L_0x0129:
            com.instagram.profile.fragment.UserDetailFragment r0 = r7.A07
            boolean r16 = r0.A15()
            if (r16 == 0) goto L_0x017f
            r0 = 36312363644814389(0x8101e700010435, double:3.0274232149081763E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x017f
            X.0Tu r12 = X.0Tu.A06
            r0 = 36312363645010999(0x8101e700040437, double:3.027423215032513E-306)
            boolean r0 = X.182.A06(r12, r4, r0)
            if (r0 == 0) goto L_0x03e6
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
        L_0x014b:
            int r0 = r0.intValue()
            switch(r0) {
                case 0: goto L_0x03e2;
                case 1: goto L_0x03d6;
                case 2: goto L_0x03da;
                case 3: goto L_0x03de;
                default: goto L_0x0152;
            }
        L_0x0152:
            java.lang.String r12 = "discover_people_self_profile_entry"
        L_0x0154:
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131238947(0x7f082023, float:1.8094187E38)
            r1.A06 = r0
            r0 = 2131960849(0x7f132411, float:1.9558378E38)
            r1.A05 = r0
            X.FNC r0 = new X.FNC
            r0.<init>(r9, r12)
            r1.A0G = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            r8.AA3(r0)
            boolean r0 = r9.A08
            if (r0 != 0) goto L_0x017f
            com.instagram.profile.fragment.UserDetailFragment r1 = r9.A0I
            java.lang.String r0 = "nav_bar"
            r1.A0z(r0)
            r9.A08 = r5
        L_0x017f:
            if (r16 == 0) goto L_0x03b7
            r0 = 36315559101336944(0x8104cf000e0d70, double:3.029444034480111E-306)
            boolean r13 = X.182.A06(r2, r4, r0)
            X.3jo r1 = r9.A0C
            r12 = r1
            android.content.Context r12 = (android.content.Context) r12
            r0 = 2131238593(0x7f081ec1, float:1.809347E38)
            if (r13 == 0) goto L_0x0197
            r0 = 2131237848(0x7f081bd8, float:1.8091958E38)
        L_0x0197:
            X.3JS r13 = new X.3JS
            r13.<init>(r12, r0)
            r0 = 2130970239(0x7f04067f, float:1.7549183E38)
            r13.A02(r0, r5)
            X.3JR r12 = new X.3JR
            r12.<init>()
            r0 = 2131438451(0x7f0b2b73, float:1.849883E38)
            r12.A04 = r0
            r12.A0F = r13
            r0 = 2131970073(0x7f134819, float:1.9577087E38)
            r12.A05 = r0
            X.6qP r0 = new X.6qP
            r0.<init>(r9)
            r12.A0G = r0
            r12.A0N = r5
            X.3Jb r0 = new X.3Jb
            r0.<init>(r12)
            android.view.View r12 = r8.AA3(r0)
            android.widget.ImageView r12 = (android.widget.ImageView) r12
            r9.A05 = r12
            X.4DH r0 = r9.A0D
            boolean r0 = r0.isAdded()
            if (r0 == 0) goto L_0x021d
            if (r12 == 0) goto L_0x021d
            X.6xC r0 = r7.A05
            int r14 = X.C323256xC.A00(r0)
            if (r14 <= 0) goto L_0x021d
            X.2aO r0 = X.2aN.A00(r4)
            X.2aT r13 = r0.A00()
            X.2aD r0 = X.2aD.A0m
            X.2aX r12 = new X.2aX
            r12.<init>(r0, r14)
            X.2g1 r0 = X.AnonymousClass2g1.PROFILE_PAGE
            X.2fx r15 = X.C226252fx.DOT
            r13.A02(r15, r0, r12)
            X.2aO r0 = X.2aN.A00(r4)
            X.2aV r13 = r0.A01()
            X.2aD r0 = X.2aD.A0b
            X.2aX r12 = new X.2aX
            r12.<init>(r0, r14)
            X.2g1 r0 = X.AnonymousClass2g1.TOP_NAVIGATION_BAR
            X.0qQ.A0B(r0, r3)
            X.3Jd r3 = new X.3Jd
            r3.<init>(r15, r0, r11, r11)
            r13.A02(r3, r12)
            android.widget.ImageView r0 = r9.A05
            r0.getClass()
            r0.setImageLevel(r14)
            android.widget.ImageView r0 = r9.A05
            r0.getClass()
            r0.setActivated(r5)
        L_0x021d:
            X.6vh r11 = r9.A0K
            X.6vi r3 = X.C322366vi.CREATE_CHANNELS
            X.2dZ r0 = r1.AYJ()
            r0.getClass()
            android.view.ViewGroup r1 = r0.A0O
            android.widget.ImageView r0 = r9.A05
            r11.A01(r1, r0, r3)
        L_0x022f:
            X.4DH r3 = r9.A0D
            if (r3 == 0) goto L_0x0296
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x0296
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0296
            java.util.List r0 = r9.A07
            if (r0 != 0) goto L_0x0296
            com.instagram.user.model.User r12 = r6.A03
            if (r12 == 0) goto L_0x0296
            java.lang.String r1 = r4.A06
            java.lang.String r0 = r12.getId()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0296
            boolean r0 = r12.A1h()
            if (r0 == 0) goto L_0x0296
            androidx.fragment.app.FragmentActivity r11 = r3.requireActivity()
            com.instagram.common.ui.base.IgTextView r1 = r8.C7y()
            X.6pX r0 = new X.6pX
            r0.<init>(r11, r9, r12)
            X.AnonymousClass0fU.A00(r0, r1)
            X.0eM r10 = r10.A0Y
            java.lang.Object r0 = r10.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x0296
            r0 = 36320412413469066(0x8109390000218a, double:3.032513288615184E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0296
            java.lang.Object r1 = r10.getValue()
            X.0qQ.A07(r1)
            android.view.View r1 = (android.view.View) r1
            X.72I r0 = new X.72I
            r0.<init>(r11, r9, r12)
            X.AnonymousClass0fU.A00(r0, r1)
        L_0x0296:
            com.instagram.user.model.User r12 = r6.A03
            if (r3 == 0) goto L_0x031c
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x031c
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x031c
            if (r12 == 0) goto L_0x031c
            android.content.Context r10 = r3.requireContext()
            if (r16 == 0) goto L_0x031c
            boolean r0 = X.C319886rO.A03(r4)
            if (r0 == 0) goto L_0x031c
            r0 = 2131237898(0x7f081c0a, float:1.809206E38)
            X.3JS r1 = new X.3JS
            r1.<init>(r10, r0)
            r0 = 9
            r1.A03 = r0
            X.3JR r11 = new X.3JR
            r11.<init>()
            r0 = 2131438432(0x7f0b2b60, float:1.849879E38)
            r11.A04 = r0
            r11.A0F = r1
            android.content.Context r10 = r3.requireContext()
            r1 = 2131969899(0x7f13476b, float:1.9576734E38)
            java.lang.String r0 = X.C319886rO.A00(r4)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r0 = r10.getString(r1, r0)
            r11.A0M = r0
            X.6qQ r0 = new X.6qQ
            r0.<init>(r9, r12)
            r11.A0G = r0
            r11.A0N = r5
            X.3Jb r0 = new X.3Jb
            r0.<init>(r11)
            android.view.View r0 = r8.AA3(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.A02 = r0
            boolean r0 = X.C319886rO.A04(r4)
            if (r0 == 0) goto L_0x031c
            boolean r0 = r3.isAdded()
            if (r0 == 0) goto L_0x031c
            android.widget.ImageView r1 = r9.A02
            if (r1 == 0) goto L_0x031c
            X.6xC r0 = r7.A05
            X.6xK r0 = r0.A0D
            if (r0 == 0) goto L_0x031c
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x031c
            r1.setImageLevel(r0)
            android.widget.ImageView r0 = r9.A02
            r0.getClass()
            r0.setActivated(r5)
        L_0x031c:
            com.instagram.user.model.User r7 = r6.A03
            if (r3 == 0) goto L_0x03b6
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 == 0) goto L_0x03b6
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x03b6
            if (r7 == 0) goto L_0x03b6
            X.3jo r6 = r9.A0C
            X.2dZ r0 = r6.AYJ()
            if (r0 == 0) goto L_0x03b6
            boolean r0 = X.2R8.A04(r4, r7)
            if (r0 != 0) goto L_0x03b6
            boolean r0 = r7.A29()
            if (r0 == 0) goto L_0x03b6
            boolean r0 = r7.A2A()
            if (r0 == 0) goto L_0x03b6
            r0 = 36324239229333399(0x810cb400002f97, double:3.034933382377139E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x03b6
            X.07f r2 = r3.getViewModelStore()
            X.EEa r0 = new X.EEa
            r0.<init>(r4)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r2)
            java.lang.Class<X.Dkt> r0 = X.C46766Dkt.class
            X.2YL r0 = r1.A00(r0)
            X.Dkt r0 = (X.C46766Dkt) r0
            r9.A06 = r0
            android.content.Context r0 = r3.requireContext()
            X.KI1 r5 = new X.KI1
            r5.<init>(r4, r0)
            X.3JR r4 = new X.3JR
            r4.<init>()
            r4.A0I = r5
            r0 = 2131970059(0x7f13480b, float:1.9577058E38)
            r4.A05 = r0
            X.LXR r0 = new X.LXR
            r0.<init>(r5, r9, r7)
            r4.A0G = r0
            X.2dZ r0 = r6.AYJ()
            int r2 = r0.AYI()
            X.2dZ r0 = r6.AYJ()
            int r1 = r0.AYI()
            android.widget.LinearLayout$LayoutParams r0 = new android.widget.LinearLayout$LayoutParams
            r0.<init>(r2, r1)
            r4.A0J = r0
            X.3Jb r0 = new X.3Jb
            r0.<init>(r4)
            r8.AA4(r0)
            X.Dkt r0 = r9.A06
            X.2Fk r2 = r0.A00
            X.07Z r1 = r3.getViewLifecycleOwner()
            X.LZn r0 = new X.LZn
            r0.<init>(r5)
            r2.A06(r1, r0)
        L_0x03b6:
            return
        L_0x03b7:
            com.instagram.user.model.User r3 = r6.A03
            java.util.List r0 = r9.A07
            if (r0 == 0) goto L_0x022f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x022f
            if (r3 == 0) goto L_0x022f
            r8.EuC(r5)
            com.instagram.common.ui.base.IgTextView r1 = r8.C7y()
            X.FNB r0 = new X.FNB
            r0.<init>(r9, r3)
            X.AnonymousClass0fU.A00(r0, r1)
            goto L_0x022f
        L_0x03d6:
            java.lang.String r12 = "suggested_user"
            goto L_0x0154
        L_0x03da:
            java.lang.String r12 = "nux_explore_people"
            goto L_0x0154
        L_0x03de:
            java.lang.String r12 = "nux_based_on_interests"
            goto L_0x0154
        L_0x03e2:
            java.lang.String r12 = "discover_people"
            goto L_0x0154
        L_0x03e6:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            goto L_0x014b
        L_0x03ea:
            r0 = 9
            r12.A03 = r0
            goto L_0x00a4
        L_0x03f0:
            boolean r0 = r9.A0M
            if (r0 == 0) goto L_0x0120
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131625399(0x7f0e05b7, float:1.8878005E38)
            r1.A0A = r0
            r0 = 2131966173(0x7f1338dd, float:1.9569177E38)
            r1.A05 = r0
            r1.A0G = r15
            r1.A0H = r13
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            android.view.View r13 = r8.AA5(r0)
            com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton r13 = (com.instagram.profile.ui.fadeinfollowbutton.FadeInFollowButton) r13
            r1 = 2131628376(0x7f0e1158, float:1.8884043E38)
            android.view.ViewStub r0 = r13.A01
            r0.setLayoutResource(r1)
            android.view.ViewStub r0 = r13.A01
            r0.inflate()
            r9.A01 = r13
            r0 = 36324909244428755(0x810d50000331d3, double:3.035357102621376E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x04ca
            r9.A00(r14, r8, r12)
        L_0x042f:
            boolean r15 = X.C324536zU.A00(r4)
            X.3JR r1 = new X.3JR
            r1.<init>()
            r0 = 2131627984(0x7f0e0fd0, float:1.8883248E38)
            r1.A0A = r0
            r0 = 2131968670(0x7f13429e, float:1.9574241E38)
            r1.A05 = r0
            X.6zX r0 = new X.6zX
            r0.<init>(r14, r9, r12, r15)
            r1.A0G = r0
            r13 = 1
            X.3Jb r0 = new X.3Jb
            r0.<init>(r1)
            android.view.View r1 = r8.AA5(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r9.A03 = r1
            r0 = 2131970040(0x7f1347f8, float:1.957702E38)
            java.lang.String r0 = r14.getString(r0)
            X.2eQ.A08(r1, r0)
            boolean r0 = r12.A29()
            if (r0 == 0) goto L_0x046a
            r0 = 1
            if (r16 == 0) goto L_0x046b
        L_0x046a:
            r0 = 0
        L_0x046b:
            r9.A02(r0)
            r0 = 2342158877551824494(0x2081051700010e6e, double:4.062082581451122E-152)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 == 0) goto L_0x0488
            X.Dc9 r0 = r12.A0H()
            if (r0 == 0) goto L_0x0488
            X.Dc9 r1 = r12.A0H()
            X.Dc9 r0 = X.Dc9.ALL
            r14 = 1
            if (r1 == r0) goto L_0x0489
        L_0x0488:
            r14 = 0
        L_0x0489:
            boolean r0 = r12.A25()
            if (r0 != 0) goto L_0x04b9
            boolean r0 = r12.A24()
            if (r0 != 0) goto L_0x04b9
            boolean r0 = r12.A23()
            if (r0 != 0) goto L_0x04b9
            boolean r0 = r12.A22()
            if (r0 != 0) goto L_0x04b9
            com.instagram.api.schemas.IGLiveNotificationPreference r1 = r12.A0A()
            com.instagram.api.schemas.IGLiveNotificationPreference r0 = com.instagram.api.schemas.IGLiveNotificationPreference.ALL
            if (r1 == r0) goto L_0x04b9
            if (r14 != 0) goto L_0x04b9
            X.4Cl r0 = r12.A03
            java.lang.Boolean r0 = r0.CTG()
            if (r0 == 0) goto L_0x04c8
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x04c8
        L_0x04b9:
            A01(r9, r13)
            if (r15 == 0) goto L_0x0120
            android.widget.ImageView r1 = r9.A03
            r0 = 1050253722(0x3e99999a, float:0.3)
            r1.setAlpha(r0)
            goto L_0x0120
        L_0x04c8:
            r13 = 0
            goto L_0x04b9
        L_0x04ca:
            boolean r0 = X.C322606w6.A05(r4)
            if (r0 == 0) goto L_0x042f
            r9.A00(r14, r8, r12)
            goto L_0x0120
        L_0x04d5:
            r13 = 0
            goto L_0x0083
        L_0x04d8:
            if (r12 == 0) goto L_0x0553
            java.lang.String r1 = r12.getUsername()
            android.text.SpannableStringBuilder r0 = new android.text.SpannableStringBuilder
            r0.<init>(r1)
            r8.Eon(r0)
            r8.EnO(r11)
            boolean r0 = r12.isVerified()
            if (r0 == 0) goto L_0x0500
            X.2dZ.A0F(r10)
            X.0eM r0 = r10.A0Y
            java.lang.Object r0 = r0.getValue()
            X.0qQ.A07(r0)
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r3)
        L_0x0500:
            com.instagram.profile.fragment.UserDetailFragment r1 = r7.A07
            boolean r0 = r1.A15()
            if (r0 == 0) goto L_0x0061
            boolean r0 = r1.A1l
            if (r0 == 0) goto L_0x0061
            X.6vr r1 = r9.A0G
            r1.A01 = r8
            X.4DH r14 = r1.A04
            boolean r0 = r14.isAdded()
            if (r0 == 0) goto L_0x0061
            com.instagram.common.ui.base.IgTextView r0 = r8.C7y()
            java.lang.CharSequence r0 = r0.getText()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x054c
            X.2da r0 = r1.A01
            com.instagram.common.ui.base.IgTextView r0 = r0.C7y()
            java.lang.CharSequence r0 = r0.getText()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>(r0)
            android.content.Context r14 = r14.requireContext()
            r0 = 2131973023(0x7f13539f, float:1.958307E38)
            java.lang.String r0 = r14.getString(r0)
            X.2eQ.A09(r0, r13, r5)
            X.2da r0 = r1.A01
            com.instagram.common.ui.base.IgTextView r0 = r0.C7y()
            r0.setContentDescription(r13)
        L_0x054c:
            com.instagram.common.session.UserSession r0 = r1.A05
            r1.A03(r0)
            goto L_0x0061
        L_0x0553:
            java.lang.String r0 = r13.A0P
            if (r0 == 0) goto L_0x0129
            r8.setTitle(r0)
            goto L_0x0129
        L_0x055c:
            android.view.View r0 = r10.A03
            r1 = 8
            goto L_0x003d
        L_0x0562:
            X.3jo r2 = r9.A0C
            boolean r0 = r2 instanceof com.instagram.url.UrlHandlerActivity
            if (r0 != 0) goto L_0x0589
            boolean r0 = r2 instanceof com.instagram.urlhandlers.igme.IgMeExternalUrlHandlerActivity
            if (r0 != 0) goto L_0x0589
            com.instagram.profile.fragment.UserDetailFragment r0 = r7.A07
            boolean r0 = r0.A1l
            if (r0 != 0) goto L_0x001a
            boolean r0 = r13.A0g
            if (r0 != 0) goto L_0x0589
            X.0hq r0 = r9.A0N
            int r0 = r0.A0M()
            if (r0 > 0) goto L_0x0583
            boolean r0 = r2 instanceof com.instagram.modal.ModalActivity
            r2 = 0
            if (r0 == 0) goto L_0x0584
        L_0x0583:
            r2 = 1
        L_0x0584:
            r8.Eu4(r2)
            goto L_0x001e
        L_0x0589:
            r8.Eu4(r5)
            r2 = 1
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C323366xN.configureActionBar(X.2da):void");
    }

    public final void onDestroyView() {
        View view = this.A01;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
    }
}
