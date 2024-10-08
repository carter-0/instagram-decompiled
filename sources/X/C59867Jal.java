package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Rect;
import android.os.SystemClock;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.ui.mediatabbar.Tab;
import com.instagram.creation.capture.FocusIndicatorView;
import com.instagram.creation.capture.MediaCaptureFragment;
import com.instagram.creation.capture.RotateLayout;
import com.instagram.creation.capture.ShutterButton;
import com.instagram.creation.capture.quickcapture.aspectratioutil.intf.CreationLayoutConfig;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jal  reason: case insensitive filesystem */
public final class C59867Jal extends LinearLayout implements AnonymousClass0iw, View.OnClickListener, View.OnTouchListener, MXN, GestureDetector.OnGestureListener, C66523MVb, 1DN, MQA {
    public static final String __redex_internal_original_name = "InAppCaptureView";
    public int A00;
    public int A01 = -1;
    public Dialog A02;
    public Tab A03;
    public MQE A04;
    public C273554mm A05;
    public C59893JbI A06;
    public AnonymousClass5Gv A07;
    public C339797kB A08;
    public AnonymousClass6ST A09;
    public Integer A0A;
    public String A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public View A0I;
    public FrameLayout A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public final Rect A0N;
    public final GestureDetector A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final FrameLayout A0T;
    public final AnonymousClass8GD A0U;
    public final AnonymousClass8GD A0V;
    public final 2cs A0W;
    public final C2366634p A0X;
    public final C340297l2 A0Y;
    public final 1wn A0Z;
    public final UserSession A0a;
    public final FocusIndicatorView A0b;
    public final RotateLayout A0c;
    public final ShutterButton A0d;
    public final C59870Jat A0e;
    public final Runnable A0f;

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        if (r8 != 3) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00(int r8) {
        /*
            r7 = this;
            r0 = -1
            r6 = 4
            r5 = 3
            r4 = 2
            r3 = 1
            if (r8 == r0) goto L_0x0030
            r1 = 0
            if (r8 == r3) goto L_0x0036
            if (r8 == r4) goto L_0x0036
            if (r8 == r5) goto L_0x0036
            r7.setFlashButtonImageLevel(r8)
            android.view.View r2 = r7.A0R
            r0 = r2
            java.lang.Integer r1 = r7.A0A
            if (r1 == 0) goto L_0x002e
            int r1 = r1.intValue()
            if (r3 != r1) goto L_0x002e
        L_0x001e:
            r2.setVisibility(r6)
            if (r8 != 0) goto L_0x003f
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131962517(0x7f132a95, float:1.9561761E38)
            X.DbT.A1A(r1, r2, r0)
            return
        L_0x002e:
            r6 = 0
            goto L_0x001e
        L_0x0030:
            android.view.View r0 = r7.A0R
            r0.setVisibility(r6)
            goto L_0x0045
        L_0x0036:
            r7.setFlashButtonImageLevel(r8)
            android.view.View r2 = r7.A0R
            r0 = r2
            r2.setVisibility(r1)
        L_0x003f:
            if (r8 == r3) goto L_0x0053
            if (r8 == r4) goto L_0x004b
            if (r8 == r5) goto L_0x0053
        L_0x0045:
            java.lang.String r1 = ""
            r0.setContentDescription(r1)
            return
        L_0x004b:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131962514(0x7f132a92, float:1.9561755E38)
            goto L_0x005a
        L_0x0053:
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131962518(0x7f132a96, float:1.9561763E38)
        L_0x005a:
            X.DbT.A1A(r1, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59867Jal.A00(int):void");
    }

    public final void A0D() {
        UserSession userSession = this.A0a;
        C59847JaN A002 = JW1.A00(userSession);
        28D r4 = 28D.A3x;
        29E r3 = A002.A0B;
        long A032 = r3.A03(288428278, 300000);
        A002.A08 = A032;
        JTQ.A1E(r3, r4, A032);
        Context context = getContext();
        Activity activity = (Activity) context;
        boolean A052 = 1DL.A05(activity, "android.permission.RECORD_AUDIO");
        boolean A053 = 1DL.A05(activity, "android.permission.CAMERA");
        boolean A072 = 1DL.A07(context, "android.permission.RECORD_AUDIO");
        boolean A073 = 1DL.A07(context, "android.permission.CAMERA");
        if (!A072 || !A073) {
            JW1.A00(userSession).A0C(false, "Requesting permissions");
            1DL.A04(activity, new C64730Lh7(this, activity, 1, A052, A053), new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"});
            return;
        }
        A0A();
    }

    public final void D3X() {
    }

    public final void DWm(Map map) {
        this.A0M = false;
        Context context = getContext();
        Map map2 = map;
        if (map.get("android.permission.CAMERA") == C346927vz.GRANTED) {
            A02(this);
        } else {
            C339797kB r0 = this.A08;
            if (r0 != null) {
                r0.A06(map);
                return;
            }
            Context context2 = getRootView().getContext();
            String A0K2 = 2Yu.A0K(context2);
            C339797kB A0O2 = JTQ.A0O(this.A0T);
            A0O2.A06(map);
            A0O2.A05(DbW.A0h(context2, A0K2, 2131954560));
            A0O2.A04(DbW.A0h(context2, A0K2, 2131954559));
            A0O2.A02(2131954558);
            this.A08 = A0O2;
            A0O2.A03(new LY8(42, this, context));
        }
        AnonymousClass4O9 r02 = AnonymousClass4O9.CAMERA;
        AnonymousClass4OA r3 = AnonymousClass4OA.UNSPECIFIED;
        List A1P = 0sr.A1P(new Pair[]{new Pair(r02, r3), new Pair(AnonymousClass4O9.MICROPHONE, r3)});
        UserSession userSession = this.A0a;
        new AnonymousClass4O6(new C64577LeJ(this), userSession).A01(AnonymousClass4O7.A00(userSession), "IN_APP_CAPTURE_VIEW", A1P, AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN), map2);
    }

    public String getModuleName() {
        return __redex_internal_original_name;
    }

    public final boolean onDown(MotionEvent motionEvent) {
        return true;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r20v0, types: [java.lang.Object, X.7km] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C59867Jal(android.content.Context r24, X.C2366634p r25) {
        /*
            r23 = this;
            java.lang.String r3 = "tabbed_gallery_camera"
            r2 = 0
            r9 = 0
            r8 = r23
            r14 = r24
            r8.<init>(r14, r2, r9)
            r0 = -1
            r8.A01 = r0
            r7 = 0
            r8.A0D = r9
            r0 = 6
            X.LgT r0 = X.C64698LgT.A00(r8, r0)
            r8.A0Z = r0
            r1 = 2
            X.K04 r0 = new X.K04
            r0.<init>(r8, r1)
            r8.A0U = r0
            r0 = r25
            r8.A0X = r0
            r0.A08(r2)
            r6 = 1
            r8.setOrientation(r6)
            android.content.Context r5 = r8.getContext()
            r0 = r5
            X.4cK r0 = (X.C267854cK) r0
            com.instagram.common.session.UserSession r15 = r0.CCy()
            r8.A0a = r15
            r8.A0B = r3
            android.graphics.Rect r0 = X.AnonymousClass7TE.A0W()
            r8.A0N = r0
            X.2cs r0 = X.AnonymousClass7TF.A0J()
            r8.A0W = r0
            r1 = 4
            X.K04 r0 = new X.K04
            r0.<init>(r8, r1)
            r8.A0V = r0
            X.Jam r0 = new X.Jam
            r0.<init>(r8)
            r8.A0f = r0
            r0 = 2130968858(0x7f04011a, float:1.7546382E38)
            android.view.ContextThemeWrapper r0 = X.2Yu.A0I(r14, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r0)
            r0 = 2131626165(0x7f0e08b5, float:1.8879558E38)
            r1.inflate(r0, r8, r6)
            r0 = 2131441370(0x7f0b36da, float:1.850475E38)
            android.view.View r10 = r8.requireViewById(r0)
            com.instagram.creation.capture.ShutterButton r10 = (com.instagram.creation.capture.ShutterButton) r10
            r8.A0d = r10
            r10.setOnTouchListener(r8)
            r10.setClickable(r9)
            r10.setFocusable(r6)
            r0 = 2131432950(0x7f0b15f6, float:1.8487672E38)
            android.view.View r1 = r8.requireViewById(r0)
            r8.A0P = r1
            r1.setOnClickListener(r8)
            r0 = 8
            r1.setVisibility(r0)
            r0 = 2131432946(0x7f0b15f2, float:1.8487664E38)
            android.view.View r0 = r8.requireViewById(r0)
            r8.A0R = r0
            r0.setOnClickListener(r8)
            r0 = 2131432972(0x7f0b160c, float:1.8487717E38)
            android.view.View r0 = r8.requireViewById(r0)
            com.instagram.creation.capture.FocusIndicatorView r0 = (com.instagram.creation.capture.FocusIndicatorView) r0
            r8.A0b = r0
            r0 = 2131432973(0x7f0b160d, float:1.8487719E38)
            android.view.View r0 = r8.requireViewById(r0)
            com.instagram.creation.capture.RotateLayout r0 = (com.instagram.creation.capture.RotateLayout) r0
            r8.A0c = r0
            android.view.GestureDetector r0 = new android.view.GestureDetector
            r0.<init>(r14, r8)
            r8.A0O = r0
            r0 = 2131429964(0x7f0b0a4c, float:1.8481616E38)
            android.view.View r0 = r8.requireViewById(r0)
            r8.A0Q = r0
            r0 = 2131429963(0x7f0b0a4b, float:1.8481614E38)
            android.view.View r4 = r8.requireViewById(r0)
            com.instagram.creation.video.ui.ClipStackView r4 = (com.instagram.creation.video.ui.ClipStackView) r4
            r0 = 2131428769(0x7f0b05a1, float:1.8479192E38)
            android.view.View r3 = r8.requireViewById(r0)
            com.instagram.creation.video.ui.CamcorderBlinker r3 = (com.instagram.creation.video.ui.CamcorderBlinker) r3
            r0 = 2131436380(0x7f0b235c, float:1.8494629E38)
            android.view.View r0 = r8.requireViewById(r0)
            r8.A0S = r0
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            boolean r0 = X.0mk.A02(r5)
            if (r0 == 0) goto L_0x0228
            r1 = 0
            int r0 = r8.getMinVideoIndicatorXPos()
        L_0x00e9:
            r2.setMargins(r1, r9, r0, r9)
            r0 = 2131435914(0x7f0b218a, float:1.8493684E38)
            android.view.View r0 = r8.requireViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r8.A0T = r0
            android.view.ViewGroup$LayoutParams r13 = r0.getLayoutParams()
            r0 = 2131429615(0x7f0b08ef, float:1.8480908E38)
            android.view.View r0 = r8.requireViewById(r0)
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()
            boolean r0 = r13 instanceof android.widget.LinearLayout.LayoutParams
            X.17k.A0E(r0)
            boolean r0 = r12 instanceof android.widget.LinearLayout.LayoutParams
            X.17k.A0E(r0)
            java.lang.Integer r2 = X.JWN.A02(r5)
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            if (r2 != r1) goto L_0x0204
            android.content.res.Resources r11 = r8.getResources()
            r0 = 2131165219(0x7f070023, float:1.7944649E38)
            int r0 = r11.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            r10.height = r0
            r10.width = r0
            r0 = 2131165248(0x7f070040, float:1.7944708E38)
            int r0 = r11.getDimensionPixelSize(r0)
            r10.bottomMargin = r0
            android.widget.LinearLayout$LayoutParams r13 = (android.widget.LinearLayout.LayoutParams) r13
            r0 = 1065353216(0x3f800000, float:1.0)
            r13.weight = r0
            r10 = r12
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            r0 = 0
            r10.weight = r0
            r0 = 2131165369(0x7f0700b9, float:1.7944953E38)
            X.DbT.A1B(r11, r12, r0)
            r0 = 2130969190(0x7f040266, float:1.7547055E38)
            int r10 = X.2Yu.A0F(r5, r0)
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r10)
            r8.setBackground(r0)
        L_0x0157:
            X.SoF r20 = new X.SoF
            r20.<init>()
            X.7kp r18 = X.C340177kp.HIGH
            X.7kq r16 = new X.7kq
            r17 = r5
            r19 = r18
            r21 = r15
            r16.<init>(r17, r18, r19, r20, r21)
            java.lang.String r21 = "in_app_capture_view"
            r17 = r14
            r18 = r16
            r19 = r20
            r20 = r15
            r22 = r9
            X.7l2 r10 = X.C340217kt.A01(r17, r18, r19, r20, r21, r22)
            r8.A0Y = r10
            X.Lbi r0 = new X.Lbi
            r0.<init>(r8, r6)
            r10.A0O(r0)
            X.Lbg r9 = new X.Lbg
            r9.<init>(r8, r6)
            X.7tb r0 = X.C340297l2.A02(r10)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r0 = r0.A04
            if (r0 == 0) goto L_0x0197
            X.7lX r0 = r0.A0N
            r0.EWv(r9)
        L_0x0197:
            X.Jas r6 = new X.Jas
            r6.<init>(r8)
            X.7l6 r0 = r10.A0I
            r0.A00 = r6
            X.Jau r0 = new X.Jau
            r0.<init>(r8)
            X.Jat r13 = new X.Jat
            r18 = r8
            r19 = r3
            r17 = r8
            r16 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r8.A0e = r13
            r3 = r14
            X.4cI r3 = (X.C267834cI) r3
            X.Jaz r0 = new X.Jaz
            r0.<init>(r14, r13)
            r3.EBv(r0)
            X.Jav r6 = r13.A06
            X.Jaw r0 = r6.A01
            r4.setClipStack(r0)
            java.util.List r3 = r6.A02
            r3.add(r4)
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 == r0) goto L_0x01fc
            if (r2 == r1) goto L_0x01fc
            r0 = 2131443686(0x7f0b3fe6, float:1.8509447E38)
            android.view.View r0 = r8.requireViewById(r0)
        L_0x01d8:
            com.instagram.creation.video.ui.VideoCaptureTimerView r0 = (com.instagram.creation.video.ui.VideoCaptureTimerView) r0
            r0.setClipStackManager(r6)
            r3.add(r0)
            X.82q r0 = X.JTR.A0k(r5)
            X.36W r1 = X.JWE.A04(r0)
            X.36W r0 = X.AnonymousClass36W.PROFILE_PHOTO
            if (r1 == r0) goto L_0x01f8
            X.82q r0 = X.JTR.A0k(r5)
            X.36W r1 = X.JWE.A04(r0)
            X.36W r0 = X.AnonymousClass36W.GROUP_PHOTO
            if (r1 != r0) goto L_0x01f9
        L_0x01f8:
            r7 = 1
        L_0x01f9:
            r8.A0E = r7
            return
        L_0x01fc:
            r0 = 2131443688(0x7f0b3fe8, float:1.8509451E38)
            android.view.View r0 = X.DbY.A0F(r8, r0)
            goto L_0x01d8
        L_0x0204:
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r2 != r0) goto L_0x0157
            android.content.res.Resources r11 = r8.getResources()
            r0 = 2131165498(0x7f07013a, float:1.7945215E38)
            int r0 = r11.getDimensionPixelSize(r0)
            android.view.ViewGroup$LayoutParams r10 = r10.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r10 = (android.view.ViewGroup.MarginLayoutParams) r10
            r10.height = r0
            r10.width = r0
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            int r0 = r11.getDimensionPixelSize(r0)
            r10.bottomMargin = r0
            goto L_0x0157
        L_0x0228:
            int r1 = r8.getMinVideoIndicatorXPos()
            r0 = 0
            goto L_0x00e9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59867Jal.<init>(android.content.Context, X.34p):void");
    }

    public static void A02(C59867Jal jal) {
        C339797kB r0 = jal.A08;
        if (r0 != null) {
            r0.A00();
            jal.A08 = null;
        }
        C340297l2 r3 = jal.A0Y;
        C340287l1 r1 = r3.A0H;
        if (r1.A00().getParent() == null) {
            jal.A0T.addView(r1.A00(), 0);
        }
        r3.A0P((C279284yO) null, "FEED_GALLERY_MAIN_BUTTON");
    }

    public static void A03(C59867Jal jal) {
        LV3 A002 = LV3.A00(jal, 32);
        C358248ab A0Y2 = DbS.A0Y(jal.getContext());
        A0Y2.A0r(false);
        A0Y2.A08(2131954736);
        A0Y2.A0E(A002);
        LV8.A00(A0Y2, jal, 5);
        Dialog A022 = A0Y2.A02();
        jal.A02 = A022;
        AnonymousClass0fN.A00(A022);
    }

    public static void A04(C59867Jal jal) {
        C340297l2 r1 = jal.A0Y;
        if (r1.CVP()) {
            jal.A00(r1.A08());
        }
    }

    public static void A05(C59867Jal jal) {
        String[] strArr;
        Tab tab = jal.A03;
        if (tab != null && tab != JXL.A00) {
            if (jal.A0L) {
                Context context = jal.getContext();
                boolean A072 = 1DL.A07(context, "android.permission.CAMERA");
                boolean A073 = 1DL.A07(context, "android.permission.RECORD_AUDIO");
                tab = jal.A03;
                if (tab == JXL.A01) {
                    if (A072) {
                        return;
                    }
                } else if (A072 && A073) {
                    return;
                }
            }
            if (!jal.A0M) {
                jal.A0M = true;
                jal.A0L = true;
                Activity activity = (Activity) jal.getContext();
                if (tab == JXL.A01) {
                    strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"};
                } else {
                    strArr = new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.RECORD_AUDIO"};
                }
                1DL.A04(activity, jal, strArr);
            }
        }
    }

    public static void A06(C59867Jal jal, boolean z) {
        AnonymousClass5Gv r0 = jal.A07;
        if (r0 != null) {
            r0.A08(z);
            jal.A07 = null;
        }
    }

    private void setCaptureMode(Tab tab) {
        C59893JbI jbI;
        if (tab == JXL.A00) {
            jbI = C59893JbI.GALLERY;
        } else if (tab == JXL.A01) {
            jbI = C59893JbI.CAMERA;
        } else if (tab == JXL.A02) {
            jbI = C59893JbI.CAMCORDER;
        } else {
            return;
        }
        this.A06 = jbI;
    }

    private void setFlashButtonImageLevel(int i) {
        View view = this.A0R;
        if (view instanceof ImageView) {
            ((ImageView) view).setImageLevel(i);
        } else {
            C51969G9p.A1K(0wj.A01.AEf(__redex_internal_original_name, 817904119), 002.A0R(AnonymousClass000.A00(3963), C51968G9o.A16(view)));
        }
    }

    private void setProgress(float f) {
        C59893JbI jbI;
        if (f < 0.5f) {
            jbI = C59893JbI.GALLERY;
        } else if (f < 1.5f) {
            jbI = C59893JbI.CAMERA;
        } else {
            jbI = C59893JbI.CAMCORDER;
        }
        this.A06 = jbI;
    }

    public final void A08() {
        C59870Jat jat = this.A0e;
        C59872Jav jav = jat.A06;
        C59873Jaw jaw = jav.A01;
        if (jaw.A01() != null && jaw.A01().A05 == AnonymousClass05K.A01) {
            if (jaw.A01() != null) {
                jaw.A01().A04(AnonymousClass05K.A0C);
            }
            Rect A0W2 = AnonymousClass7TE.A0W();
            this.A0I.getGlobalVisibleRect(A0W2);
            Context context = getContext();
            Window window = ((Activity) context).getWindow();
            window.getClass();
            FrameLayout frameLayout = new FrameLayout(context);
            this.A0J = frameLayout;
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.A0J.setOnTouchListener(new C64282LYi(2, A0W2, this));
            ((ViewGroup) window.getDecorView()).addView(this.A0J);
        } else if (jat.A01()) {
            A01(this);
            jav.A00();
            A07();
        }
        A07();
    }

    public final void A09() {
        if (this.A0K) {
            ShutterButton shutterButton = this.A0d;
            if (shutterButton.getGlobalVisibleRect(this.A0N)) {
                0xY A0p = AnonymousClass7TE.A0p(1Au.A00(this.A0a));
                A0p.E5T("show_tap_to_record_nux", true);
                A0p.apply();
                A06(this, true);
                shutterButton.post(new M2H(this));
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.LDq] */
    /* JADX WARNING: type inference failed for: r1v5, types: [X.A70, java.lang.Object] */
    public final void A0A() {
        boolean z;
        try {
            if (this.A0Y.A0V()) {
                return;
            }
        } catch (C352928Fp unused) {
        }
        C59870Jat jat = this.A0e;
        this.A00 = jat.A06.A01.A01.size();
        0xY A0p = AnonymousClass7TE.A0p(1Au.A00(this.A0a));
        A0p.E5T("show_tap_to_record_nux", true);
        A0p.apply();
        if (jat.A01 != AnonymousClass05K.A0N) {
            z = false;
        } else {
            SystemClock.elapsedRealtime();
            jat.A01 = AnonymousClass05K.A00;
            z = true;
        }
        if (!z) {
            C59689JTv.A08(getContext(), 2131969784, 0);
        }
        View view = this.A0Q;
        view.setAlpha(1.0f);
        view.setVisibility(0);
        C340297l2 r6 = this.A0Y;
        ? obj = new Object();
        C63575KzO kzO = LOF.A09;
        AnonymousClass3Q2 r0 = jat.A00;
        r0.getClass();
        String str = r0.A3w;
        str.getClass();
        String A0B2 = AnonymousClass457.A0B(str);
        jat.A02 = A0B2;
        obj.A00(kzO, A0B2);
        obj.A00(LOF.A0A, true);
        LOF lof = new LOF(obj);
        K04 k04 = new K04(this, 1);
        AnonymousClass8GD r9 = this.A0U;
        ? obj2 = new Object();
        obj2.A00 = false;
        r6.A0F(new ADm(obj2), k04, r9, (AnonymousClass8GD) null, lof);
        MQE mqe = this.A04;
        if (mqe != null) {
            ((MediaCaptureFragment) mqe).mMediaTabHost.A03(JXL.A02, true);
        }
    }

    public final void A0B() {
        C59870Jat jat = this.A0e;
        Integer num = jat.A01;
        Integer num2 = AnonymousClass05K.A01;
        if (num == num2) {
            C59872Jav jav = jat.A06;
            C59796JYp jYp = jav.A00;
            if (jYp != null) {
                jYp.A04(num2);
                jav.A00.A03();
            }
            String str = jat.A02;
            if (JTQ.A1Z(str)) {
                C59796JYp jYp2 = jav.A00;
                jYp2.getClass();
                jYp2.A07 = str;
            }
        }
        jat.A03.removeMessages(1);
        SystemClock.elapsedRealtime();
        jat.A01 = AnonymousClass05K.A0C;
        try {
            C340297l2 r1 = this.A0Y;
            if (r1.A0V()) {
                r1.A0R(AnonymousClass05K.A00);
                this.A0I.setVisibility(0);
            }
        } catch (C352928Fp unused) {
        }
        SystemClock.elapsedRealtime();
        jat.A01 = AnonymousClass05K.A0N;
        this.A0I.setVisibility(0);
    }

    public final void A0C() {
        try {
            if (this.A0Y.A0V()) {
                return;
            }
        } catch (C352928Fp unused) {
        }
        Integer num = AnonymousClass05K.A0F;
        UserSession userSession = this.A0a;
        C59882Jb5.A01(userSession, num);
        JW1.A00(userSession).A06(27p.A01(userSession).A04.A09, 1, false);
        29f A0c2 = JTO.A0c(userSession);
        28t r6 = 28t.A05;
        int A032 = C59895JbK.A03(this.A0A);
        List list = Collections.EMPTY_LIST;
        A0c2.A0b(r6, C59725JVj.PRE_CAPTURE, C363138jC.A00, (CreationLayoutConfig) null, (Long) null, (String) null, (String) null, this.A0B, list, list, list, list, list, (List) null, A032, 1);
        this.A0Y.A0M(new K04(this, 6), new K04(this, 7));
    }

    public final boolean CJh() {
        return AnonymousClass7TF.A1R(this.A0e.A06.A01.A01.size());
    }

    public final void D3P(C59796JYp jYp) {
        MQE mqe = this.A04;
        if (mqe != null) {
            MediaCaptureFragment.A01((MediaCaptureFragment) mqe);
        }
        A07();
    }

    public final void D3Q(C59796JYp jYp, Integer num) {
        MQE mqe = this.A04;
        if (mqe != null) {
            MediaCaptureFragment.A01((MediaCaptureFragment) mqe);
        }
        A07();
    }

    public final void D3R(C59796JYp jYp) {
        C59870Jat jat = this.A0e;
        if (jYp.A05 == AnonymousClass05K.A00 && 60000 - jat.A06.A01.A00() <= 0) {
            this.A0G = true;
            A0B();
        }
    }

    public final void D3W(C59796JYp jYp) {
        MQE mqe = this.A04;
        if (mqe != null) {
            MediaCaptureFragment.A01((MediaCaptureFragment) mqe);
        }
        A07();
    }

    public final void DfJ() {
        double d;
        double d2;
        MQE mqe = this.A04;
        if (mqe != null) {
            MediaCaptureFragment mediaCaptureFragment = (MediaCaptureFragment) mqe;
            C59864Jah jah = mediaCaptureFragment.mMediaTabHost;
            MXN mxn = mediaCaptureFragment.mCaptureProvider;
            mxn.getClass();
            boolean z = !mxn.CJh();
            if (z) {
                d2 = 0.0d;
            } else {
                d2 = 1.0d;
            }
            jah.A0I.setEnabled(z);
            jah.A0H.A08(d2, true);
        }
        if (CJh()) {
            d = 1.0d;
        } else {
            d = 0.0d;
        }
        this.A0W.A08(d, true);
    }

    public final void DqA(Tab tab, Tab tab2) {
        if (this.A03 != tab2) {
            this.A03 = tab2;
            if (!this.A0H) {
                C340297l2 r1 = this.A0Y;
                if (r1.CVP() && tab != tab2 && r1.A08() != -1) {
                    setFlashMode(0);
                }
            }
        }
    }

    public final void E4X() {
        try {
            if (this.A0Y.A0V()) {
                this.A0F = true;
                A0B();
                return;
            }
        } catch (C352928Fp unused) {
        }
        C59870Jat jat = this.A0e;
        new C61508KAn(jat).A02(jat.A00);
    }

    public Integer getCameraFacing() {
        return this.A0A;
    }

    public C59893JbI getCaptureMode() {
        return this.A06;
    }

    public final void onLongPress(MotionEvent motionEvent) {
        if (this.A06.ordinal() == 1 && !this.A0E) {
            requestDisallowInterceptTouchEvent(true);
            if (!this.A0H) {
                C59882Jb5.A01(this.A0a, AnonymousClass05K.A0G);
                this.A0H = true;
                A0D();
            }
        }
    }

    public final void onShowPress(MotionEvent motionEvent) {
        if (this.A06.ordinal() == 2) {
            requestDisallowInterceptTouchEvent(true);
            if (!this.A0H) {
                C59882Jb5.A01(this.A0a, AnonymousClass05K.A0H);
                this.A0H = true;
                A0D();
                A06(this, true);
            }
        }
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        int ordinal = this.A06.ordinal();
        if (ordinal == 1) {
            A0C();
            return true;
        } else if (ordinal != 2) {
            return false;
        } else {
            A09();
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0013, code lost:
        if (r2 != 3) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
        /*
            r5 = this;
            android.view.GestureDetector r0 = r5.A0O
            boolean r4 = r0.onTouchEvent(r7)
            int r2 = r7.getAction()
            r1 = 1
            if (r2 == 0) goto L_0x004e
            if (r2 == r1) goto L_0x0035
            r0 = 2
            if (r2 == r0) goto L_0x0016
            r0 = 3
            if (r2 == r0) goto L_0x0035
        L_0x0015:
            return r4
        L_0x0016:
            com.instagram.creation.capture.ShutterButton r3 = r5.A0d
            android.graphics.Rect r2 = r5.A0N
            r3.getGlobalVisibleRect(r2)
            float r0 = r7.getRawX()
            int r1 = (int) r0
            float r0 = r7.getRawY()
            int r0 = (int) r0
            boolean r1 = r2.contains(r1, r0)
            boolean r0 = r3.isPressed()
            if (r0 == r1) goto L_0x0015
            r3.setPressed(r1)
            return r4
        L_0x0035:
            com.instagram.creation.capture.ShutterButton r0 = r5.A0d
            r1 = 0
            r0.setPressed(r1)
            boolean r0 = r5.A0H
            if (r0 == 0) goto L_0x0015
            r5.A0H = r1
            X.7l2 r0 = r5.A0Y     // Catch:{ 8Fp -> 0x004c }
            boolean r0 = r0.A0V()     // Catch:{ 8Fp -> 0x004c }
            if (r0 == 0) goto L_0x004c
            r5.A0B()
        L_0x004c:
            r4 = 1
            return r4
        L_0x004e:
            com.instagram.creation.capture.ShutterButton r0 = r5.A0d
            r0.setPressed(r1)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59867Jal.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public void setDeleteClipButton(View view, C252203oj r3) {
        this.A0I = view;
        view.setOnClickListener(this);
        this.A0W.A0A(r3);
    }

    public void setFocusIndicatorOrientation(int i) {
        this.A0c.setOrientation(i);
    }

    public void setInitialCameraFacing(int i) {
        this.A0Y.A00 = i;
    }

    public static void A01(C59867Jal jal) {
        Window window = ((Activity) jal.getContext()).getWindow();
        window.getClass();
        ((ViewGroup) window.getDecorView()).removeView(jal.A0J);
        jal.A0J = null;
    }

    private C3499682q getCameraCreationSession() {
        return JTR.A0k(getContext());
    }

    private int getMinVideoIndicatorXPos() {
        return AnonymousClass7TE.A05((float) 0nA.A09(getContext()), 3000.0f / 60000.0f);
    }

    public final void A07() {
        Integer num;
        double d;
        if (CJh()) {
            View view = this.A0Q;
            view.setVisibility(0);
            view.setAlpha(1.0f);
            num = JTP.A0j(this.A0e.A01() ? 1 : 0);
            this.A0P.setEnabled(false);
        } else {
            this.A0P.setEnabled(true);
            num = AnonymousClass05K.A0C;
        }
        if (num == AnonymousClass05K.A00) {
            this.A0I.setSelected(true);
        } else if (num == AnonymousClass05K.A01) {
            this.A0I.setSelected(false);
        } else {
            d = 0.0d;
            this.A0W.A06(d);
        }
        d = 1.0d;
        this.A0W.A06(d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r7.A0e.A00 != null) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Dq9(float r8, float r9) {
        /*
            r7 = this;
            r7.setProgress(r8)
            com.instagram.creation.capture.ShutterButton r6 = r7.A0d
            X.JbI r1 = r7.A06
            X.JbI r0 = X.C59893JbI.CAMCORDER
            r3 = 0
            r4 = 1
            if (r1 != r0) goto L_0x0014
            X.Jat r0 = r7.A0e
            X.3Q2 r1 = r0.A00
            r0 = 0
            if (r1 == 0) goto L_0x0015
        L_0x0014:
            r0 = 1
        L_0x0015:
            r6.setEnabled(r0)
            r5 = 0
            r1 = 4
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0034
            android.view.View r0 = r7.A0Q
            r0.setVisibility(r1)
            X.7l2 r0 = r7.A0Y
            X.7l1 r0 = r0.A0H
            android.view.View r1 = r0.A00()
            r0 = 8
            r1.setVisibility(r0)
        L_0x0030:
            A06(r7, r4)
        L_0x0033:
            return
        L_0x0034:
            r2 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0048
            r6.setProgress(r5)
            android.view.View r0 = r7.A0Q
            r0.setVisibility(r1)
            X.7l2 r0 = r7.A0Y
            r0.A0C()
            goto L_0x0030
        L_0x0048:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0087
            r2 = 1073741824(0x40000000, float:2.0)
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0087
            float r0 = r2 - r8
            float r1 = r1 - r0
            r6.setProgress(r1)
            android.view.View r0 = r7.A0Q
            r0.setVisibility(r3)
            r0.setAlpha(r1)
            X.7l2 r1 = r7.A0Y
            r1.A0C()
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0030
            boolean r0 = r1.A0V()     // Catch:{ 8Fp -> 0x0071 }
            if (r0 != 0) goto L_0x0033
        L_0x0071:
            com.instagram.common.session.UserSession r0 = r7.A0a
            X.0xa r1 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r0 = "show_tap_to_record_nux"
            boolean r0 = r1.getBoolean(r0, r3)
            if (r0 != 0) goto L_0x0033
            java.lang.Runnable r2 = r7.A0f
            r0 = 300(0x12c, double:1.48E-321)
            r7.postDelayed(r2, r0)
            return
        L_0x0087:
            r6.setProgress(r1)
            android.view.View r0 = r7.A0Q
            r0.setAlpha(r1)
            X.7l2 r0 = r7.A0Y
            r0.A0C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C59867Jal.Dq9(float, float):void");
    }

    public final void DqB(Tab tab) {
        A05(this);
        if (tab != JXL.A00 && this.A0C && this.A02 == null) {
            A03(this);
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-1388917489);
        super.onAttachedToWindow();
        this.A0K = true;
        A04(this);
        AnonymousClass0fD.A0D(215121558, A062);
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(254795142);
        if (view == this.A0P) {
            if (!CJh()) {
                C340297l2 r2 = this.A0Y;
                if (r2.CVP()) {
                    r2.EzI(new K04(this, 3));
                }
            }
        } else if (view == this.A0R) {
            C340297l2 r4 = this.A0Y;
            if (r4.CVP()) {
                int i = -1;
                try {
                    int ordinal = this.A06.ordinal();
                    if (ordinal == 1) {
                        int A082 = r4.A08();
                        if (A082 == 0) {
                            i = 1;
                        } else if (A082 == 1) {
                            i = 2;
                        } else if (A082 == 2) {
                            i = 0;
                        }
                        A00(i);
                        setFlashMode(i);
                    } else if (ordinal == 2) {
                        int A083 = r4.A08();
                        if (A083 == 0) {
                            i = 1;
                        } else if (A083 == 1) {
                            i = 2;
                        } else if (A083 == 2) {
                            i = 0;
                        }
                        A00(i);
                        setFlashMode(i);
                        if (this.A0H) {
                            this.A0D = true;
                            this.A01 = i;
                        }
                    }
                } catch (RuntimeException unused) {
                }
            }
        } else if (view == this.A0I) {
            A08();
        }
        AnonymousClass0fD.A0C(-1004564712, A052);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(2079200001);
        super.onDetachedFromWindow();
        this.A0K = false;
        removeCallbacks(this.A0f);
        C340297l2 r2 = this.A0Y;
        if (r2.CVP() && 3 == r2.A08()) {
            setFlashMode(0);
        }
        r2.A03 = null;
        C64424Lbf lbf = new C64424Lbf();
        C340547lR r0 = ((BasicCameraOutputController) C340297l2.A02(r2)).A04;
        if (r0 != null) {
            r0.A0N.EWv(lbf);
        }
        AnonymousClass0fD.A0D(-1973539014, A062);
    }

    public void setFlashMode(int i) {
        String A012 = C378899Rq.A01(i);
        if (A012 != null) {
            1Av A002 = 1Au.A00(this.A0a);
            DbS.A1a(A002, A012, A002.A1I, 1Av.A8a, 25);
        }
        this.A0Y.A0K(this.A0V, i);
    }

    public void setListener(MQE mqe) {
        this.A04 = mqe;
    }

    public void setNavigationDelegate(C273554mm r1) {
        this.A05 = r1;
    }

    private double getMinimumVideoLengthMs() {
        return 3000.0d;
    }
}
