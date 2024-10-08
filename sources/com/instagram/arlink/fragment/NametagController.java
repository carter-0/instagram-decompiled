package com.instagram.arlink.fragment;

import X.002;
import X.0cp;
import X.0gy;
import X.0mk;
import X.0s0;
import X.0wb;
import X.1Au;
import X.1Av;
import X.1DL;
import X.1ES;
import X.1OC;
import X.2cs;
import X.AnonymousClass05K;
import X.AnonymousClass07i;
import X.AnonymousClass0YZ;
import X.AnonymousClass0iw;
import X.AnonymousClass2hV;
import X.AnonymousClass4DH;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass84J;
import X.AnonymousClass88I;
import X.C17669Vc0;
import X.C252233om;
import X.C49124Epn;
import X.C61499KAe;
import X.C61519KAy;
import X.C62590KiN;
import X.C64148LQl;
import X.C64287LYn;
import X.C64432Lbn;
import X.C65121Lnj;
import X.DbU;
import X.DbX;
import X.JTT;
import X.KB1;
import X.KB6;
import X.LBQ;
import X.LYC;
import X.U1A;
import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.react.views.webview.ReactWebViewManager;
import com.instagram.android.R;
import com.instagram.arlink.ui.CoachMarkOverlay;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.nametag.NametagCardView;
import com.instagram.user.model.User;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Iterator;

public class NametagController extends C252233om implements AnonymousClass88I {
    public User A00;
    public Integer A01;
    public String A02;
    public boolean A03;
    public boolean A04;
    public boolean A05 = true;
    public final Activity A06;
    public final Context A07;
    public final Handler A08 = AnonymousClass7TF.A0D();
    public final KB6 A09;
    public final LBQ A0A;
    public final AnonymousClass4DH A0B;
    public final AnonymousClass0iw A0C;
    public final UserSession A0D;
    public final AnonymousClass84J A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final C61519KAy A0I;
    public final KB1 A0J;
    public View mBackgroundModeButton;
    public View mBottomBar;
    public NametagCardView mCardView;
    public View mGradientOverlay;
    public View mProfileShareCardView;
    public ViewGroup mRootView;
    public View mTopBar;
    public ImageView mTopBarCloseButton;
    public View mTopBarGalleryButton;
    public View mTopBarScanQRButton;

    public final /* synthetic */ void DG3(MotionEvent motionEvent, float f, float f2, boolean z, boolean z2) {
    }

    public final /* synthetic */ void DsQ(float f, float f2) {
    }

    public static String A00(NametagController nametagController, String str) {
        String str2 = nametagController.A02;
        if (str2 == null) {
            str2 = StringFormatUtil.formatStrLocaleSafe("https://www.instagram.com/%s/?r=nametag", str);
        }
        try {
            Uri A032 = 0cp.A03(str2);
            Uri.Builder builder = new Uri.Builder();
            Iterator it = JTT.A0u(builder, A032).iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                builder.appendQueryParameter(A18, A032.getQueryParameter(A18));
            }
            return URLDecoder.decode(builder.build().toString(), ReactWebViewManager.HTML_ENCODING);
        } catch (UnsupportedEncodingException | RuntimeException unused) {
            0wb.A03("QRCodeDialogParseError", 002.A0R("failed url: ", str2));
            return str2;
        }
    }

    public static void A01(ViewGroup viewGroup, NametagController nametagController) {
        Integer num = nametagController.A01;
        Integer num2 = AnonymousClass05K.A00;
        if (num == num2) {
            UserSession userSession = nametagController.A0D;
            1Av A002 = 1Au.A00(userSession);
            0s0 r0 = A002.A44;
            AnonymousClass0YZ[] r5 = 1Av.A8a;
            if (!AnonymousClass7TG.A1a(A002, r0, r5, 102)) {
                C64148LQl lQl = new C64148LQl(viewGroup);
                if (lQl.A03 == null) {
                    ViewGroup viewGroup2 = (ViewGroup) lQl.A09.inflate();
                    lQl.A03 = viewGroup2;
                    lQl.A06 = (CoachMarkOverlay) viewGroup2.requireViewById(R.id.coach_mark_overlay);
                    lQl.A02 = lQl.A03.requireViewById(R.id.tutorial_text_arrow_container);
                    lQl.A04 = DbU.A0G(lQl.A03, R.id.tutorial_step_text);
                    lQl.A05 = DbU.A0G(lQl.A03, R.id.tutorial_title_text);
                    lQl.A01 = lQl.A03.requireViewById(R.id.tutorial_arrow_up);
                    lQl.A00 = lQl.A03.requireViewById(R.id.tutorial_arrow_down);
                    LYC.A00(lQl.A03, 40, lQl);
                    C64148LQl.A00(lQl, num2);
                    lQl.A0A.A06(1.0d);
                    lQl.A0B.A08(1.0d, true);
                }
                1Av A003 = 1Au.A00(userSession);
                AnonymousClass7TF.A1J(A003, A003.A44, r5, 102, true);
            }
        }
        DbX.A1B(viewGroup, R.id.loading_view);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.07Z, X.4DH] */
    public static void A02(AnonymousClass2hV r4, NametagController nametagController, Integer num, String str) {
        1OC A002 = C49124Epn.A00(nametagController.A0D, num, str, nametagController.A0C.getModuleName());
        if (A002 != null) {
            Activity activity = nametagController.A06;
            0gy A003 = AnonymousClass07i.A00(nametagController.A0B);
            C61499KAe.A00(A002, nametagController, r4, 0);
            1ES.A00(activity, A003, A002);
        }
    }

    public static void A03(NametagController nametagController, Integer num) {
        Integer num2 = nametagController.A01;
        if (num2 != num) {
            nametagController.A01 = num;
            nametagController.A04(num, num2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003c, code lost:
        if (r8.A05() != false) goto L_0x0024;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A05() {
        /*
            r9 = this;
            java.lang.Integer r1 = r9.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            if (r1 != r0) goto L_0x0008
            r8 = 0
        L_0x0007:
            return r8
        L_0x0008:
            X.KB6 r5 = r9.A09
            X.LYn r8 = r5.A0J
            boolean r0 = r8.A05()
            r7 = 1
            if (r0 == 0) goto L_0x003f
            X.KHv r6 = r8.A05
            if (r6 == 0) goto L_0x0035
            X.2cs r0 = r6.A00
            double r3 = r0.A01
            r1 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            r6.A00()
        L_0x0024:
            r0 = 1
        L_0x0025:
            r8 = 1
            if (r0 != 0) goto L_0x0007
            X.KB1 r2 = r9.A0J
            X.7kB r0 = r2.A07
            if (r0 == 0) goto L_0x005f
            r0.A00()
            r0 = 0
            r2.A07 = r0
            return r8
        L_0x0035:
            r8.A03(r7)
            boolean r0 = r8.A05()
            if (r0 == 0) goto L_0x003f
            goto L_0x0024
        L_0x003f:
            X.LWg r2 = r5.A0K
            android.view.ViewGroup r0 = r2.A03
            if (r0 == 0) goto L_0x005d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L_0x005d
            r1 = 0
            X.LOV r0 = r5.A0L
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x005d
            X.KB6.A03(r5)
            r2.A05(r7)
            r5.A07 = r1
            goto L_0x0024
        L_0x005d:
            r0 = 0
            goto L_0x0025
        L_0x005f:
            X.WJp r1 = r2.A0T
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x006b
            r1.A01()
            return r8
        L_0x006b:
            boolean r0 = X.KB1.A03(r2)
            if (r0 == 0) goto L_0x0075
            X.KB1.A02(r2)
            return r8
        L_0x0075:
            X.KAy r1 = r9.A0I
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0007
            r0 = 0
            X.Lye r6 = new X.Lye
            r6.<init>((java.lang.Object) r1, (int) r0)
            X.4DH r0 = r1.A08
            android.view.View r5 = r0.mView
            if (r5 == 0) goto L_0x00c9
            android.graphics.RectF r4 = r1.A06
            if (r4 == 0) goto L_0x00c9
            r1.A00 = r7
            float r3 = r4.width()
            int r0 = r1.A03
            float r0 = (float) r0
            float r3 = r3 / r0
            X.2co r0 = X.C315596kB.A02
            X.5nL r2 = X.JTP.A0b(r5)
            float r1 = r5.getScaleX()
            float r0 = r4.centerX()
            r2.A0U(r1, r3, r0)
            float r1 = r5.getScaleY()
            float r0 = r4.centerY()
            r2.A0V(r1, r3, r0)
            r0 = 0
            r2.A0K(r0)
            r0 = 8
            r2.A03 = r0
            X.5nL r1 = r2.A0F(r7)
            r1.A05 = r6
            X.2co r0 = X.C59681JTn.A00
            X.5nL r0 = r1.A0E(r0)
            r0.A0H()
            return r8
        L_0x00c9:
            r6.onFinish()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.fragment.NametagController.A05():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        if (r7 > (((float) r5) / 2.0f)) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean DHo(float r10, float r11, float r12, float r13, float r14, boolean r15, boolean r16) {
        /*
            r9 = this;
            if (r16 == 0) goto L_0x004c
            java.lang.Integer r1 = r9.A01
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 != r0) goto L_0x0052
            X.KB1 r0 = r9.A0J
            X.Lbn r2 = r0.A04
            if (r2 == 0) goto L_0x004c
            X.8hH r0 = r2.A05
            boolean r0 = r0.CUA()
            if (r0 == 0) goto L_0x004c
            float r8 = -r11
            X.2cs r6 = r2.A04
            float r7 = X.JTO.A03(r6)
            double r0 = (double) r8
            r6.A07(r0)
            android.view.ViewGroup r0 = r2.A01
            int r5 = r0.getHeight()
            r4 = 1
            r3 = 0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            boolean r2 = X.AnonymousClass7TF.A1R(r0)
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            boolean r1 = X.C51970G9q.A1T(r0)
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x003a
            r4 = 0
        L_0x003a:
            if (r2 != 0) goto L_0x0048
            if (r1 != 0) goto L_0x004e
            if (r4 != 0) goto L_0x004c
            float r1 = (float) r5
            r0 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
        L_0x0048:
            double r0 = (double) r5
            r6.A06(r0)
        L_0x004c:
            r0 = 0
            return r0
        L_0x004e:
            r6.A04()
            goto L_0x004c
        L_0x0052:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x004c
            X.KB6 r2 = r9.A09
            X.KiN r1 = r2.A03
            X.KiN r0 = X.C62590KiN.A08
            if (r1 != r0) goto L_0x004c
            X.LYn r1 = r2.A0J
            r0 = 1
            boolean r0 = r1.A06(r11, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.fragment.NametagController.DHo(float, float, float, float, float, boolean, boolean):boolean");
    }

    public final void DhL(float f, float f2, float f3, float f4, boolean z, boolean z2) {
        if (z2) {
            Integer num = this.A01;
            if (num == AnonymousClass05K.A01) {
                C64432Lbn lbn = this.A0J.A04;
                if (lbn != null && lbn.A05.CUA()) {
                    2cs r4 = lbn.A04;
                    r4.A08(r4.A09.A00 - ((double) (-f2)), true);
                }
            } else if (num == AnonymousClass05K.A00) {
                KB6 kb6 = this.A09;
                if (kb6.A03 == C62590KiN.A08) {
                    C64287LYn lYn = kb6.A0J;
                    if (!lYn.A05() && f2 > 0.0f) {
                        lYn.A04(true);
                    } else if (lYn.A05()) {
                        C64287LYn.A01(lYn, f2);
                    }
                }
            }
        }
    }

    public final void onDestroyView() {
        this.A0A.A0F.CNi((View.OnTouchListener) null);
        NametagControllerLifecycleUtil.cleanupReferences(this);
    }

    private void A04(Integer num, Integer num2) {
        User user;
        int intValue = num.intValue();
        if (intValue == 0) {
            DbU.A13(this.A06, this.mTopBarCloseButton, R.drawable.nav_close);
            if (num2 == AnonymousClass05K.A01) {
                this.A0J.A08(true);
            }
        } else if (intValue == 2) {
            this.mGradientOverlay.setVisibility(0);
            return;
        } else if (intValue == 1) {
            Activity activity = this.A06;
            if (1DL.A07(activity, "android.permission.CAMERA")) {
                KB1 kb1 = this.A0J;
                if (!kb1.A08) {
                    kb1.A08 = true;
                    kb1.A05();
                    C65121Lnj lnj = kb1.A03;
                    if (lnj != null) {
                        lnj.A03 = true;
                    }
                }
                if (num2 == AnonymousClass05K.A00) {
                    ImageView imageView = this.mTopBarCloseButton;
                    boolean A022 = 0mk.A02(activity);
                    int i = R.drawable.instagram_chevron_left_pano_outline_24;
                    if (A022) {
                        i = R.drawable.instagram_chevron_right_pano_outline_24;
                    }
                    DbU.A13(activity, imageView, i);
                }
            } else {
                if (num2 == null || num2 == AnonymousClass05K.A0C) {
                    num2 = AnonymousClass05K.A0N;
                }
                this.A01 = num2;
                this.A0J.A05();
                this.mTopBarScanQRButton.setEnabled(true);
            }
        } else if (intValue == 4 && (user = this.A00) != null) {
            KB1 kb12 = this.A0J;
            kb12.A08(false);
            ViewGroup viewGroup = kb12.A01;
            if (KB1.A03(kb12) && kb12.A06 == null && viewGroup != null) {
                C17669Vc0 vc0 = new C17669Vc0(kb12.A0L, "ScanCameraController", kb12.A0J, viewGroup);
                vc0.A02 = 15;
                vc0.A00 = 6;
                vc0.A03 = kb12.A0K.getContext().getColor(R.color.primary_text_disabled_material_dark);
                U1A u1a = new U1A(vc0);
                kb12.A06 = u1a;
                u1a.setVisible(true, false);
            }
            kb12.A0T.A02(user);
            return;
        } else {
            return;
        }
        this.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r27v0, types: [X.07Z, X.0iw, androidx.fragment.app.Fragment] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NametagController(android.app.Activity r29, android.graphics.RectF r30, android.view.ViewGroup r31, X.C64126LOx r32, X.LOV r33, X.AnonymousClass4DH r34, X.AnonymousClass0iw r35, com.instagram.common.session.UserSession r36, X.AnonymousClass3E6 r37, X.AnonymousClass80C r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, boolean r42, boolean r43, boolean r44) {
        /*
            r28 = this;
            r11 = r28
            r11.<init>()
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            r11.A01 = r7
            android.os.Handler r0 = X.AnonymousClass7TF.A0D()
            r11.A08 = r0
            r6 = 1
            r11.A05 = r6
            r10 = r36
            X.1Av r2 = X.1Au.A00(r10)
            long r0 = java.lang.System.currentTimeMillis()
            r2.A0e(r0)
            r0 = 2131429681(0x7f0b0931, float:1.8481042E38)
            r12 = r31
            android.view.View r0 = r12.requireViewById(r0)
            com.instagram.ui.widget.nametag.NametagCardView r0 = (com.instagram.ui.widget.nametag.NametagCardView) r0
            r11.mCardView = r0
            r1 = r40
            r9 = r39
            r0.setName(r9, r1)
            r14 = r41
            r11.A0G = r14
            r11.A0H = r9
            r0 = 2131438544(0x7f0b2bd0, float:1.8499018E38)
            android.view.View r0 = r12.requireViewById(r0)
            r11.mProfileShareCardView = r0
            r13 = r29
            r11.A06 = r13
            r27 = r34
            r0 = r27
            r11.A0B = r0
            android.content.Context r1 = r27.requireContext()
            r11.A07 = r1
            X.84J r0 = new X.84J
            r0.<init>(r1)
            r11.A0E = r0
            r0 = r38
            X.2jd r5 = r0.A00
            r5.A0E(r11)
            r11.mRootView = r12
            r11.A0D = r10
            r27.getModuleName()
            r4 = 0
            r15 = r35
            r11.A0C = r15
            X.1Av r3 = X.1Au.A00(r10)
            X.0s0 r2 = r3.A1z
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 100
            boolean r0 = X.AnonymousClass7TG.A1a(r3, r2, r1, r0)
            r11.A03 = r0
            r0 = 2131433628(0x7f0b189c, float:1.8489047E38)
            android.view.View r0 = r12.requireViewById(r0)
            r11.mGradientOverlay = r0
            r0 = 2131443054(0x7f0b3d6e, float:1.8508165E38)
            android.view.View r0 = r12.requireViewById(r0)
            r11.mTopBar = r0
            r0 = 2131430326(0x7f0b0bb6, float:1.848235E38)
            android.widget.ImageView r0 = X.DbU.A0F(r12, r0)
            r11.mTopBarCloseButton = r0
            r0 = 2131428551(0x7f0b04c7, float:1.847875E38)
            android.view.View r0 = r12.requireViewById(r0)
            r11.mBackgroundModeButton = r0
            r0 = 2131428887(0x7f0b0617, float:1.8479431E38)
            android.view.View r1 = r12.requireViewById(r0)
            r11.mBottomBar = r1
            r0 = 2
            r1.setImportantForAccessibility(r0)
            java.lang.String r0 = r10.A06
            boolean r2 = r14.equals(r0)
            if (r2 == 0) goto L_0x0270
            r0 = 951(0x3b7, float:1.333E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x00bb:
            r11.A0F = r0
            android.widget.ImageView r0 = r11.mTopBarCloseButton
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            r3 = 0
            X.H7h r0 = new X.H7h
            r8 = r43
            r0.<init>(r3, r11, r8)
            r1.A04 = r0
            r1.A00()
            android.view.ViewGroup r1 = r11.mRootView
            r0 = 2131438920(0x7f0b2d48, float:1.849978E38)
            android.view.View r0 = r1.requireViewById(r0)
            r11.mTopBarScanQRButton = r0
            android.view.ViewGroup r1 = r11.mRootView
            r0 = 2131433353(0x7f0b1789, float:1.848849E38)
            android.view.View r0 = r1.requireViewById(r0)
            r11.mTopBarGalleryButton = r0
            if (r2 != 0) goto L_0x00f9
            android.view.View r0 = r11.mTopBarScanQRButton
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r11.mBackgroundModeButton
            r0.setVisibility(r1)
            android.view.View r0 = r11.mBottomBar
            r0.setVisibility(r1)
        L_0x00f9:
            android.view.View r0 = r11.mTopBarScanQRButton
            X.3NG r2 = X.AnonymousClass7TE.A0m(r0)
            r1 = 3
            X.KHt r0 = new X.KHt
            r0.<init>(r11, r1)
            X.JTQ.A1H(r0, r2)
            android.view.ViewGroup r1 = r11.mRootView
            r0 = 2131438545(0x7f0b2bd1, float:1.849902E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            X.KHq r0 = new X.KHq
            r0.<init>(r9, r11, r3)
            r1.A04 = r0
            r1.A00()
            android.view.ViewGroup r1 = r11.mRootView
            r0 = 2131438548(0x7f0b2bd4, float:1.8499026E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            X.KHq r0 = new X.KHq
            r0.<init>(r9, r11, r6)
            r1.A04 = r0
            r1.A00()
            if (r44 == 0) goto L_0x017a
            android.view.ViewGroup r1 = r11.mRootView
            r0 = 2131438546(0x7f0b2bd2, float:1.8499022E38)
            android.view.View r1 = r1.requireViewById(r0)
            android.view.ViewGroup r2 = r11.mRootView
            r0 = 2131438547(0x7f0b2bd3, float:1.8499024E38)
            android.view.View r0 = r2.requireViewById(r0)
            r1.setVisibility(r3)
            r0.setVisibility(r3)
            X.Kae r2 = new X.Kae
            r2.<init>()
            r2.A00 = r11
            android.view.ViewGroup r1 = r11.mRootView
            r0 = 2131438546(0x7f0b2bd2, float:1.8499022E38)
            android.view.View r0 = r1.requireViewById(r0)
            X.3NG r1 = X.AnonymousClass7TE.A0m(r0)
            X.H7k r0 = new X.H7k
            r16 = r0
            r17 = r3
            r18 = r13
            r19 = r2
            r20 = r11
            r21 = r10
            r16.<init>(r17, r18, r19, r20, r21)
            r1.A04 = r0
            r1.A00()
        L_0x017a:
            r0 = 2131428887(0x7f0b0617, float:1.8479431E38)
            android.view.View r0 = r12.requireViewById(r0)
            r11.mBottomBar = r0
            r0 = 2131238040(0x7f081c98, float:1.8092347E38)
            android.graphics.drawable.Drawable r1 = r13.getDrawable(r0)
            r0 = 2131441096(0x7f0b35c8, float:1.8504194E38)
            android.widget.TextView r0 = X.DbU.A0G(r12, r0)
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r4, r4, r4)
            r0 = 2131428547(0x7f0b04c3, float:1.8478742E38)
            android.widget.TextView r0 = X.DbU.A0G(r12, r0)
            r0.setCompoundDrawablesWithIntrinsicBounds(r1, r4, r4, r4)
            r0 = r12
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r0 = (com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout) r0
            X.LBQ r6 = new X.LBQ
            r6.<init>(r13, r0)
            r11.A0A = r6
            java.util.List r0 = r6.A0G
            X.JTR.A1T(r11, r0)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = r6.A0F
            X.LYb r1 = r6.A0E
            X.LYa r0 = r6.A0D
            r2.A00(r1, r0)
            X.KB6 r0 = new X.KB6
            r19 = r32
            r21 = r33
            r24 = r37
            r25 = r14
            r26 = r9
            r20 = r6
            r22 = r27
            r23 = r10
            r17 = r13
            r18 = r12
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r11.A09 = r0
            r5.A0E(r0)
            X.KB1 r0 = new X.KB1
            r16 = r0
            r19 = r11
            r21 = r27
            r22 = r15
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r11.A0J = r0
            r5.A0E(r0)
            X.KAy r0 = new X.KAy
            r18 = r30
            r16 = r0
            r19 = r18
            r20 = r11
            r16.<init>(r17, r18, r19, r20, r21)
            r11.A0I = r0
            r5.A0E(r0)
            if (r43 != 0) goto L_0x01fe
            if (r42 == 0) goto L_0x0202
        L_0x01fe:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            r11.A01 = r0
        L_0x0202:
            java.lang.Integer r1 = r11.A01
            if (r1 == 0) goto L_0x020e
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0211
            com.instagram.user.model.User r0 = r11.A00
            if (r0 != 0) goto L_0x0211
        L_0x020e:
            r11.A01 = r7
            r1 = r7
        L_0x0211:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r1 == r0) goto L_0x021d
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r0) goto L_0x021d
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0241
        L_0x021d:
            r11.A05 = r3
            com.instagram.ui.widget.nametag.NametagCardView r0 = r11.mCardView
            r1 = 8
            r0.setVisibility(r1)
            android.widget.ImageView r5 = r11.mTopBarCloseButton
            android.view.View r0 = r11.mProfileShareCardView
            if (r0 == 0) goto L_0x023b
            if (r5 == 0) goto L_0x023b
            r0.setVisibility(r1)
            android.app.Activity r2 = r11.A06
            if (r43 == 0) goto L_0x0263
            r1 = 2131239334(0x7f0821a6, float:1.8094972E38)
        L_0x0238:
            X.DbU.A13(r2, r5, r1)
        L_0x023b:
            X.KB6 r1 = r11.A09
            r0 = 0
            r1.A09(r0)
        L_0x0241:
            java.lang.Integer r0 = r11.A01
            r11.A04(r0, r4)
            if (r43 != 0) goto L_0x0278
            java.lang.Integer r1 = X.AnonymousClass05K.A0A
            java.lang.String r0 = r15.getModuleName()
            X.1OC r2 = X.C49124Epn.A00(r10, r1, r9, r0)
            if (r2 == 0) goto L_0x0278
            X.0gy r1 = X.AnonymousClass07i.A00(r27)
            X.EDL r0 = new X.EDL
            r0.<init>(r11, r12, r9, r3)
            r2.A00 = r0
            X.1ES.A00(r13, r1, r2)
            return
        L_0x0263:
            boolean r0 = X.0mk.A02(r2)
            r1 = 2131238082(0x7f081cc2, float:1.8092433E38)
            if (r0 == 0) goto L_0x0238
            r1 = 2131238091(0x7f081ccb, float:1.809245E38)
            goto L_0x0238
        L_0x0270:
            r0 = 5107(0x13f3, float:7.156E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x00bb
        L_0x0278:
            A01(r12, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.arlink.fragment.NametagController.<init>(android.app.Activity, android.graphics.RectF, android.view.ViewGroup, X.LOx, X.LOV, X.4DH, X.0iw, com.instagram.common.session.UserSession, X.3E6, X.80C, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean):void");
    }
}
