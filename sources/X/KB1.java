package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.android.R;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.arlink.ui.NametagCardHintView;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.mediapicker.Folder;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;
import com.instagram.user.model.User;
import java.util.Map;

public final class KB1 extends C252233om implements AnonymousClass84F, 1DN, AnonymousClass84G, C66421MRb {
    public static final C71392co A0a = C71392co.A01();
    public Dialog A00;
    public ViewGroup A01;
    public LP6 A02;
    public C65121Lnj A03;
    public C64432Lbn A04;
    public C340297l2 A05;
    public U1A A06;
    public C339797kB A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public int A0C;
    public Drawable A0D;
    public B17 A0E;
    public C60044Jdy A0F;
    public boolean A0G;
    public final Activity A0H;
    public final Handler A0I = AnonymousClass7TF.A0D();
    public final View A0J;
    public final ViewGroup A0K;
    public final ImageView A0L;
    public final ImageView A0M;
    public final AnonymousClass8FP A0N = new C64426Lbh(this);
    public final 2cs A0O;
    public final NametagController A0P;
    public final NametagCardHintView A0Q;
    public final AnonymousClass4DH A0R;
    public final UserSession A0S;
    public final WJp A0T;
    public final Runnable A0U = new C65853M1t(this);
    public final View A0V;
    public final ViewGroup A0W;
    public final ImageView A0X;
    public final LBQ A0Y;
    public final AnonymousClass0iw A0Z;

    public final void A08(boolean z) {
        this.A08 = false;
        if (z) {
            this.A0O.A03();
        }
        A04();
        C340297l2 r1 = this.A05;
        if (r1 != null) {
            this.A09 = false;
            r1.A0D();
            r1.A0H(this.A0N);
        } else {
            this.A0I.removeCallbacks(this.A0U);
        }
        NametagCardHintView nametagCardHintView = this.A0Q;
        AnonymousClass61R r0 = nametagCardHintView.A00;
        if (r0 != null) {
            r0.pause();
            nametagCardHintView.A00.EL2(0.0f);
        }
        nametagCardHintView.setVisibility(8);
        C65121Lnj lnj = this.A03;
        if (lnj != null) {
            lnj.A03 = false;
            lnj.A0L.clear();
        }
    }

    public final void DHa(float f, float f2) {
        if (f2 > 0.0f) {
            A00(this.A0D, this.A0X, (int) AnonymousClass37Q.A00((double) f));
            A04();
        } else {
            A07();
        }
        NametagCardHintView nametagCardHintView = this.A0Q;
        float f3 = 1.0f - f;
        nametagCardHintView.setAlpha(f3);
        int i = 0;
        if (f3 <= 0.0f) {
            i = 8;
        }
        nametagCardHintView.setVisibility(i);
        NametagController nametagController = this.A0P;
        nametagController.mTopBar.setAlpha(f3);
        int i2 = 0;
        nametagController.mTopBar.setVisibility(JTQ.A01((f3 > 0.0f ? 1 : (f3 == 0.0f ? 0 : -1))));
        nametagController.mBottomBar.setAlpha(f3);
        View view = nametagController.mBottomBar;
        if (f3 <= 0.0f) {
            i2 = 8;
        }
        view.setVisibility(i2);
    }

    public final void DWm(Map map) {
        String str;
        boolean z = false;
        this.A0G = false;
        Object obj = map.get("android.permission.CAMERA");
        if (obj == C346927vz.DENIED_DONT_ASK_AGAIN) {
            z = true;
        }
        this.A0A = z;
        C346927vz r4 = C346927vz.GRANTED;
        if (obj == r4) {
            ViewGroup viewGroup = this.A0K;
            if (viewGroup.getWidth() <= 0 || viewGroup.getHeight() <= 0) {
                this.A0I.post(this.A0U);
            } else {
                A06();
            }
        } else {
            if (this.A07 == null) {
                ViewGroup viewGroup2 = this.A0K;
                C339797kB A0O2 = JTQ.A0O(viewGroup2);
                A0O2.A06(map);
                Activity activity = this.A0H;
                A0O2.A05(activity.getString(2131967988));
                A0O2.A04(activity.getString(2131971016));
                A0O2.A02(2131967987);
                Context context = viewGroup2.getContext();
                int A022 = 2Yu.A02(context);
                int A0H2 = 2Yu.A0H(context, R.attr.textColorPrimary);
                Context context2 = A0O2.A00;
                int color = context2.getColor(A022);
                int color2 = context2.getColor(A0H2);
                int color3 = context2.getColor(R.color.badge_color);
                A0O2.A01.setBackgroundColor(color);
                TextView textView = A0O2.A05;
                if (textView != null) {
                    textView.setTextColor(color2);
                }
                TextView textView2 = A0O2.A04;
                if (textView2 != null) {
                    textView2.setTextColor(color2);
                }
                TextView textView3 = A0O2.A03;
                if (textView3 != null) {
                    textView3.setTextColor(color3);
                }
                A0O2.A01();
                this.A07 = A0O2;
                A0O2.A03(new LYC((Object) this, 45));
            }
            this.A07.A06(map);
        }
        Object obj2 = map.get("android.permission.CAMERA");
        if (obj2 != null) {
            if (obj2.equals(r4)) {
                str = "app_permission_grant";
            } else {
                str = "app_permission_deny";
            }
            UserSession userSession = this.A0S;
            JTU.A1F(new AnonymousClass4O6(new C64575LeH(this), userSession), AnonymousClass4O7.A00(userSession), str, "SCAN_CAMERA_CONTROLLER", AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN));
        }
    }

    public final void DwA(User user, boolean z) {
        this.A0C = 0;
        if (A03(this) != z) {
            A04();
            C60044Jdy jdy = this.A0F;
            if (jdy != null) {
                synchronized (jdy.A0E) {
                    jdy.A01 = 0;
                    jdy.A0F.clear();
                    jdy.A02 = 0;
                    jdy.A08 = null;
                }
                jdy.postInvalidate();
            }
            NametagController nametagController = this.A0P;
            if (nametagController.A0B.isResumed()) {
                nametagController.A00 = user;
                NametagController.A03(nametagController, AnonymousClass05K.A0Y);
            }
        }
        if (!z) {
            A01(this);
        }
    }

    public static void A00(Drawable drawable, ImageView imageView, int i) {
        if (drawable != null) {
            boolean z = true;
            if (drawable instanceof U1A) {
                U1A u1a = (U1A) drawable;
                u1a.A09 = true;
                U1A.A05(u1a);
                u1a.A0A = AnonymousClass7TF.A1T(i, 255);
            }
            drawable.setVisible(AnonymousClass7TF.A1R(i), false);
            int i2 = 4;
            if (i > 0) {
                i2 = 0;
            }
            imageView.setVisibility(i2);
            if (i < 255) {
                z = false;
            }
            imageView.setEnabled(z);
            imageView.setImageDrawable(drawable);
            imageView.setImageAlpha(i);
        }
    }

    public static void A01(KB1 kb1) {
        kb1.A0I.post(new C65854M1u(kb1));
    }

    public static void A02(KB1 kb1) {
        C64432Lbn lbn = kb1.A04;
        if (lbn != null) {
            UserSession userSession = kb1.A0S;
            0xI A042 = 1Q9.A01("instagram_nametag").A04("ig_nametag_gallery_closed");
            if (userSession != null) {
                DbU.A1R(A042, userSession);
                lbn.A04.A04();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static boolean A03(KB1 kb1) {
        C64432Lbn lbn = kb1.A04;
        if (lbn == null || lbn.A00 <= 0.0f) {
            return false;
        }
        return true;
    }

    public final void A04() {
        B17 b17;
        C340297l2 r1 = this.A05;
        if (!(r1 == null || !r1.CVP() || (b17 = this.A0E) == null)) {
            r1.EEJ(b17);
            this.A0E = null;
        }
        C60044Jdy jdy = this.A0F;
        if (jdy != null) {
            this.A0K.removeView(jdy);
        }
        this.A0F = null;
    }

    public final void A05() {
        if (!this.A0G) {
            this.A0G = true;
            JTP.A11(this.A0H, this, "android.permission.CAMERA");
        }
    }

    /* JADX WARNING: type inference failed for: r0v42, types: [X.07Z, X.4DH] */
    public final void A06() {
        C339797kB r0 = this.A07;
        if (r0 != null) {
            r0.A00();
            this.A07 = null;
        }
        UserSession userSession = this.A0S;
        LCx A002 = C63058Kqn.A00(userSession);
        A002.A01.put("open_camera", Long.valueOf(A002.A00.now()));
        if (this.A05 == null) {
            this.A0O.A02();
            ViewGroup viewGroup = this.A0K;
            ViewStub A0D2 = DbU.A0D(viewGroup, R.id.camera_stub);
            Activity activity = this.A0H;
            C340137kl r15 = new C340137kl(userSession, activity.getApplicationContext());
            DisplayMetrics A0E2 = AnonymousClass7TF.A0E(activity);
            RectF rectF = 0nA.A01;
            0qQ.A0B(A0E2, 0);
            r15.A00 = Integer.MAX_VALUE;
            C340297l2 A022 = C340217kt.A02(A0D2, (C340167ko) null, r15, (C3496781h) null, userSession, "scan_camera", 0, false);
            this.A05 = A022;
            A022.EdB(true);
            A022.A00 = 0;
            A022.A0O(new C64427Lbi(this, 0));
            ColorDrawable colorDrawable = new ColorDrawable(AnonymousClass7TE.A0A(viewGroup.getContext()));
            this.A0D = colorDrawable;
            colorDrawable.setVisible(false, false);
            ViewGroup A0C2 = DbU.A0C(viewGroup, R.id.nametag_outer_container);
            JTR.A1C(A0C2, R.id.gallery_grid_stub);
            JTR.A1C(A0C2, R.id.gallery_folder_menu_stub);
            this.A01 = DbU.A0C(A0C2, R.id.gallery_container_coordinator);
            C65121Lnj lnj = new C65121Lnj(activity, this.A01, this.A0M, AnonymousClass07i.A00(this.A0R), this, this.A0Z, userSession, (TriangleSpinner) viewGroup.requireViewById(R.id.gallery_folder_menu));
            this.A03 = lnj;
            lnj.A03 = true;
            lnj.A0M.A07();
            LBQ lbq = this.A0Y;
            C65121Lnj lnj2 = this.A03;
            lbq.A05 = lnj2;
            int i = 0;
            JTR.A1T(new AnonymousClass88I[]{lnj2}[0], lbq.A0G);
            C64432Lbn lbn = new C64432Lbn(A0C2, this.A0W, this.A03);
            this.A04 = lbn;
            C66421MRb[] mRbArr = {this, this.A03};
            do {
                C66421MRb mRb = mRbArr[i];
                0qQ.A0B(mRb, 0);
                JTR.A1T(mRb, lbn.A06);
                i++;
            } while (i < 2);
        }
        C64432Lbn lbn2 = this.A04;
        if (lbn2 != null) {
            lbn2.A04.A0A(lbn2);
        }
        C65121Lnj lnj3 = this.A03;
        if (lnj3 != null) {
            AnonymousClass8XW r2 = lnj3.A0M;
            if (r2.A05) {
                Object A10 = C51968G9o.A10(r2.A0B, -1);
                if (A10 == null) {
                    throw AnonymousClass7TE.A0y();
                } else if (!(!((Folder) A10).A05.isEmpty())) {
                    lnj3.A0M.A07();
                }
            }
        }
        NametagController.A03(this.A0P, AnonymousClass05K.A01);
        if (!this.A09) {
            onResume();
        } else {
            C340547lR r02 = ((BasicCameraOutputController) C340297l2.A02(this.A05)).A04;
            if (r02 != null) {
                r02.A0N.EJ6((AnonymousClass8GD) null);
            }
        }
        this.A05.A0H.A00().setEnabled(true);
        C340297l2 r03 = this.A05;
        r03.A0H.A00().post(new C65852M1s(this));
    }

    public final void A07() {
        C340297l2 r5 = this.A05;
        if (r5 != null && r5.CVP() && this.A0E == null) {
            Rect A0B2 = r5.A0B();
            LP6 lp6 = this.A02;
            if (lp6 != null) {
                int width = A0B2.width();
                int height = A0B2.height();
                lp6.A01 = width;
                lp6.A00 = height;
                this.A0C = 0;
            }
            C40167AUh aUh = new C40167AUh(this, 2);
            this.A0E = aUh;
            r5.A9b(aUh, 1);
            0tS A002 = 0tS.A00();
            if (AnonymousClass7TG.A1a(A002, A002.A2p, 0tS.A4G, 113)) {
                C60044Jdy jdy = new C60044Jdy(this.A0H);
                this.A0F = jdy;
                int width2 = A0B2.width();
                int height2 = A0B2.height();
                jdy.A04 = width2;
                jdy.A03 = height2;
                this.A0K.addView(this.A0F, new FrameLayout.LayoutParams(-1, -1));
            }
        }
    }

    public final void DfZ(boolean z) {
        NametagController.A03(this.A0P, AnonymousClass05K.A01);
    }

    public final void Dfa(float f) {
        Drawable drawable;
        ImageView imageView;
        float f2 = 1.0f - f;
        View view = this.A0V;
        view.setAlpha(f2);
        int i = 0;
        view.setVisibility(JTQ.A01((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1))));
        if (this.A05 != null) {
            ImageView imageView2 = this.A0M;
            imageView2.setAlpha(f2);
            imageView2.setVisibility(JTQ.A01((f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1))));
            NametagCardHintView nametagCardHintView = this.A0Q;
            nametagCardHintView.setAlpha(f2);
            if (f2 <= 0.0f) {
                i = 8;
            }
            nametagCardHintView.setVisibility(i);
        }
        int A002 = (int) AnonymousClass37Q.A00((double) f);
        if (!A03(this)) {
            drawable = this.A0D;
            imageView = this.A0X;
        } else {
            drawable = this.A06;
            imageView = this.A0L;
        }
        A00(drawable, imageView, A002);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.FW5, X.1qK, java.lang.Object] */
    public final void DkS(String str, int i, String str2) {
        NametagController nametagController = this.A0P;
        nametagController.A05();
        1Ng A002 = AnonymousClass1Nd.A00(nametagController.A0D);
        ? obj = new Object();
        obj.A01 = str2;
        obj.A02 = str;
        obj.A00 = i;
        A002.A00(obj);
    }

    public final void DwJ(String str, boolean z) {
        if (z) {
            int i = this.A0C + 1;
            this.A0C = i;
            if (i >= 10) {
                0xI A042 = 1Q9.A01("instagram_nametag").A04(AnonymousClass000.A00(3307));
                A042.A08(Integer.valueOf(this.A0C), Pxd.A00(213));
                DbU.A1R(A042, this.A0S);
                C59689JTv.A07(this.A0H, 2131967986);
                this.A0C = 0;
            }
            C60044Jdy jdy = this.A0F;
            if (jdy != null) {
                jdy.setMessage(str);
            }
        }
    }

    public final void onDestroyView() {
        this.A0O.A00();
        LP6 lp6 = this.A02;
        if (lp6 != null) {
            lp6.A01();
        }
        this.A02 = null;
        WJp wJp = this.A0T;
        AnonymousClass1Nd.A00(wJp.A0G).A02(wJp.A0F, C2370836g.class);
    }

    public final void onResume() {
        C340297l2 r2 = this.A05;
        if (this.A08 && r2 != null) {
            if (this.A09) {
                this.A0O.A04();
            } else {
                this.A09 = true;
            }
            r2.A0P((C279284yO) null, "");
            r2.A0G(this.A0N);
        }
    }

    public KB1(Activity activity, ViewGroup viewGroup, NametagController nametagController, LBQ lbq, AnonymousClass4DH r14, AnonymousClass0iw r15, UserSession userSession) {
        this.A0H = activity;
        this.A0R = r14;
        this.A0K = viewGroup;
        this.A0V = viewGroup.requireViewById(R.id.close_button);
        this.A0W = DbU.A0C(viewGroup, R.id.camera_container);
        this.A0J = viewGroup.requireViewById(R.id.gradient_overlay);
        ImageView A0F2 = DbU.A0F(viewGroup, R.id.camera_preview_overlay);
        this.A0X = A0F2;
        LYC.A00(A0F2, 44, this);
        this.A0L = DbU.A0F(viewGroup, R.id.gallery_blur_overlay);
        ImageView A0F3 = DbU.A0F(viewGroup, R.id.gallery_button);
        this.A0M = A0F3;
        A0F3.setColorFilter(AnonymousClass37O.A00(-1));
        this.A0Q = (NametagCardHintView) viewGroup.requireViewById(R.id.card_hint_view);
        this.A0Y = lbq;
        UserSession userSession2 = userSession;
        VM8 vm8 = new VM8(userSession2, r14.getModuleName());
        WJp wJp = new WJp(r14.requireActivity(), viewGroup, vm8, r15, userSession2, this);
        this.A0T = wJp;
        AnonymousClass1Nd.A00(wJp.A0G).A01(wJp.A0F, C2370836g.class);
        this.A0S = userSession2;
        this.A0P = nametagController;
        this.A0Z = r15;
        2cs A0J2 = AnonymousClass7TF.A0J();
        A0J2.A09(A0a);
        A0J2.A06 = true;
        A0J2.A0A(new K08(this));
        this.A0O = A0J2;
    }

    public final void D06(String str) {
        A01(this);
        C49895FBy.A01(this.A0P.A0B.requireActivity(), (String) null, str, (String) null, (String) null);
    }

    public final void DDl(String str) {
        A01(this);
        this.A0P.A0E.A00(str, true, "dogfooding_assistant".equals(0cp.A03(str).getHost()));
    }

    public final void DK7() {
        A01(this);
        C59689JTv.A0F(this.A0P.A06, "SCAN_QR_CODE_error", 2131971019);
    }

    public final void DLV(String str) {
        A01(this);
        this.A0P.A0E.A00(str, false, "dogfooding_assistant".equals(0cp.A03(str).getHost()));
    }

    public final void onPause() {
        A04();
        C340297l2 r1 = this.A05;
        if (r1 != null) {
            this.A09 = false;
            r1.A0D();
            r1.A0H(this.A0N);
        } else {
            this.A0I.removeCallbacks(this.A0U);
        }
        C65121Lnj lnj = this.A03;
        if (lnj != null) {
            lnj.onPause();
        }
    }
}
