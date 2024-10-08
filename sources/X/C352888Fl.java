package X;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.facebook.cameracore.mediapipeline.services.uicontrol.PickerConfiguration;
import com.facebook.quicklog.reliability.CancelReason;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.google.gson.Gson;
import com.instagram.android.R;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.camera.mpfacade.touch.TouchEventForwardingView;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu;
import com.instagram.creation.capture.quickcapture.faceeffectui.NestableSnapPickerRecyclerView;
import com.instagram.creation.capture.quickcapture.layout.MultiTouchRecyclerView;
import com.instagram.modal.ModalActivity;
import com.instagram.model.shopping.ShoppingCameraSurveyMetadata;
import com.instagram.ui.widget.countdowntimer.CountdownTimerView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;
import com.instagram.user.model.UpcomingEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import org.webrtc.CameraCapturer;

/* renamed from: X.8Fl  reason: invalid class name and case insensitive filesystem */
public final class C352888Fl implements AnonymousClass0iw, C352898Fm, AnonymousClass85Y, AnonymousClass4DM, C352908Fn, C352918Fo, C3493580b, C3502283u, AnonymousClass84H {
    public static final C71392co A1q = C71392co.A04(40.0d, 7.0d);
    public static final String __redex_internal_original_name = "IgCameraViewController";
    public float A00;
    public long A01;
    public TextView A02 = null;
    public C265674Vs A03;
    public B17 A04;
    public C18078Vl7 A05;
    public C340297l2 A06;
    public C353078Ge A07;
    public AnonymousClass8HG A08;
    public C353028Fz A09 = null;
    public C352948Fr A0A = null;
    public AnonymousClass8W6 A0B;
    public JYD A0C;
    public C59937Jc1 A0D;
    public C352828Fe A0E;
    public AnonymousClass6ST A0F;
    public Integer A0G;
    public String A0H = "not_initialized";
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M = false;
    public ColorDrawable A0N;
    public boolean A0O;
    public final Activity A0P;
    public final Handler A0Q = new Handler(Looper.getMainLooper());
    public final View A0R;
    public final View A0S;
    public final ViewGroup A0T;
    public final ViewGroup A0U;
    public final Fragment A0V;
    public final AnonymousClass07Z A0W;
    public final C3497181l A0X = new C352968Ft(this);
    public final 2cs A0Y;
    public final AnonymousClass82W A0Z;
    public final TouchEventForwardingView A0a;
    public final TouchEventForwardingView A0b;
    public final AnonymousClass84E A0c;
    public final 1wn A0d;
    public final C61110lV A0e = new C353018Fy(this);
    public final UserSession A0f;
    public final C357638Yz A0g;
    public final AnonymousClass8H1 A0h;
    public final AnonymousClass888 A0i;
    public final C342827pE A0j;
    public final AnonymousClass8GJ A0k;
    public final C352988Fv A0l = new C352988Fv(this);
    public final C353118Gi A0m;
    public final AnonymousClass8GA A0n;
    public final AnonymousClass8GT A0o;
    public final C3498081w A0p;
    public final C3498081w A0q;
    public final C3498081w A0r;
    public final C3498081w A0s;
    public final C3498081w A0t;
    public final C352538Dt A0u;
    public final AnonymousClass85X A0v;
    public final C3499582p A0w;
    public final AnonymousClass823 A0x;
    public final CameraPreCaptureUtilityMenu A0y;
    public final AnonymousClass8E7 A0z;
    public final C3496481e A10;
    public final AnonymousClass8FK A11;
    public final AnonymousClass8G2 A12;
    public final AnonymousClass8AL A13;
    public final AnonymousClass8DD A14;
    public final AnonymousClass86Y A15;
    public final AnonymousClass8G7 A16;
    public final C3496881i A17;
    public final AnonymousClass8E5 A18;
    public final C3497281m A19;
    public final AnonymousClass8E6 A1A;
    public final C352868Fj A1B;
    public final AnonymousClass80U A1C;
    public final AnonymousClass885 A1D;
    public final C3510287h A1E;
    public final AnonymousClass846 A1F;
    public final C3495780x A1G;
    public final AnonymousClass88F A1H;
    public final ShutterButton A1I;
    public final Runnable A1J = new C352958Fs(this);
    public final Runnable A1K = new C352938Fq(this);
    public final AtomicBoolean A1L = new AtomicBoolean(false);
    public final boolean A1M;
    public final boolean A1N;
    public final boolean A1O;
    public final boolean A1P;
    public final boolean A1Q;
    public final boolean A1R;
    public final boolean A1S;
    public final boolean A1T;
    public final boolean A1U;
    public final boolean A1V;
    public final boolean A1W;
    public final long A1X;
    public final View A1Y;
    public final ImageView A1Z;
    public final ConstraintLayout A1a;
    public final C3497181l A1b = new C352978Fu(this);
    public final C3500082u A1c;
    public final C353078Ge A1d;
    public final C353078Ge A1e;
    public final AnonymousClass4D6 A1f;
    public final C71662eb A1g;
    public final TargetViewSizeProvider A1h;
    public final C352998Fw A1i = new C352998Fw(this);
    public final C3503684j A1j;
    public final AnonymousClass8DB A1k;
    public final AnonymousClass88R A1l;
    public final C3497481o A1m;
    public final C3504784u A1n;
    public final boolean A1o;
    public final boolean A1p;

    public final Integer A0N() {
        try {
            C340297l2 r0 = this.A06;
            if (r0 == null || !r0.CVP()) {
                return null;
            }
            return Integer.valueOf(this.A06.A07());
        } catch (C352928Fp unused) {
            return null;
        }
    }

    public final void DHa(float f, float f2) {
        AnonymousClass8Ho r0;
        C353438Hq r2;
        AnonymousClass8Ho r02;
        C353438Hq r22;
        AnonymousClass8GA r23;
        Integer A052;
        double d = (double) f;
        this.A00 = (float) Math.min(Math.max(d, 0.0d), 1.0d);
        if (f2 >= 0.0f) {
            if (f > 0.0f || this.A0N != null) {
                A0C(this, (int) AnonymousClass37Q.A04(d, 0.0d, 1.0d, 0.0d, 255.0d));
            }
            float f3 = this.A00;
            if (f3 > 0.5f) {
                if (!this.A0O && (A052 = r23.A05()) != null && A052.intValue() == 3) {
                    (r23 = this.A0n).A09(0);
                    this.A0O = true;
                }
                C41832B2n b2n = this.A0B.A0I.A01;
                AnonymousClass8Ho r24 = null;
                if (b2n != null) {
                    r02 = b2n.BN9();
                } else {
                    r02 = null;
                }
                if (r02 instanceof C353438Hq) {
                    if (b2n != null) {
                        r24 = b2n.BN9();
                    }
                    if ((r24 instanceof C353438Hq) && (r22 = (C353438Hq) r24) != null && !r22.A04) {
                        r22.A04 = true;
                        W0T A002 = C353438Hq.A00(r22);
                        if (A002 != null) {
                            A002.A0D(true);
                        }
                        r22.A05 = true;
                        W0T A003 = C353438Hq.A00(r22);
                        if (A003 != null && A003.A0I()) {
                            A003.A06();
                            r22.DWr();
                        }
                    }
                }
            } else if (f3 == 0.0f) {
                if (this.A0O) {
                    this.A0n.A09(3);
                    this.A0O = false;
                }
                C41832B2n b2n2 = this.A0B.A0I.A01;
                AnonymousClass8Ho r25 = null;
                if (b2n2 != null) {
                    r0 = b2n2.BN9();
                } else {
                    r0 = null;
                }
                if (r0 instanceof C353438Hq) {
                    if (b2n2 != null) {
                        r25 = b2n2.BN9();
                    }
                    if ((r25 instanceof C353438Hq) && (r2 = (C353438Hq) r25) != null && r2.A04) {
                        if (r2.A05) {
                            W0T A004 = C353438Hq.A00(r2);
                            if (A004 != null) {
                                A004.A0D(false);
                            }
                            r2.A05 = false;
                        }
                        r2.A04 = false;
                    }
                }
            }
            if (this.A1C.Ats() == AnonymousClass80X.PRE_CAPTURE) {
                A07(this);
                C265674Vs r1 = this.A03;
                if (this.A00 == 0.0f && r1 != null) {
                    A0R(r1);
                }
            }
        }
    }

    public final void onResume() {
        if (this.A1C.Ats() == AnonymousClass80X.PRE_CAPTURE) {
            A0E(this, false);
        }
    }

    public static JYD A00(C352888Fl r28) {
        C352888Fl r8 = r28;
        JYD jyd = r8.A0C;
        if (jyd != null) {
            return jyd;
        }
        C340297l2 r0 = r8.A06;
        if (r0 == null || !r0.CVP()) {
            return null;
        }
        UserSession userSession = r8.A0f;
        Activity activity = r8.A0P;
        String moduleName = r8.getModuleName();
        AnonymousClass80U r9 = r8.A1C;
        C340297l2 r15 = r8.A06;
        r15.getClass();
        AnonymousClass82X A002 = r8.A0Z.A00();
        AnonymousClass8AL r7 = r8.A13;
        C357638Yz r6 = r8.A0g;
        AnonymousClass4D6 r5 = r8.A1f;
        ViewGroup viewGroup = r8.A0T;
        TouchEventForwardingView touchEventForwardingView = r8.A0a;
        ShutterButton shutterButton = r8.A1I;
        C3495780x r2 = r8.A1G;
        TargetViewSizeProvider targetViewSizeProvider = r8.A1h;
        AnonymousClass80U r25 = r9;
        AnonymousClass8AL r24 = r7;
        C352888Fl r23 = r8;
        TargetViewSizeProvider targetViewSizeProvider2 = targetViewSizeProvider;
        C357638Yz r21 = r6;
        C71662eb r20 = r8.A1g;
        AnonymousClass4D6 r19 = r5;
        UserSession userSession2 = userSession;
        TouchEventForwardingView touchEventForwardingView2 = touchEventForwardingView;
        JYD jyd2 = new JYD(activity, viewGroup, r8.A0V, r15, A002, touchEventForwardingView2, userSession2, r19, r20, r21, targetViewSizeProvider2, r23, r24, r25, r2, shutterButton, moduleName);
        r8.A0C = jyd2;
        return jyd2;
    }

    public static C59937Jc1 A01(C352888Fl r9) {
        C59937Jc1 jc1 = r9.A0D;
        if (jc1 != null) {
            return jc1;
        }
        C340297l2 r0 = r9.A06;
        if (r0 == null || !r0.CVP()) {
            return null;
        }
        Activity activity = r9.A0P;
        UserSession userSession = r9.A0f;
        C340297l2 r3 = r9.A06;
        AnonymousClass80U r6 = r9.A1C;
        C59937Jc1 jc12 = new C59937Jc1(activity, r9.A0T, r3, userSession, r9.A1h, r6, new C379959Vz(r9), new C379949Vy(r9));
        r9.A0D = jc12;
        return jc12;
    }

    public static Boolean A02(C352888Fl r4) {
        boolean z;
        UserSession userSession = r4.A0f;
        if (AnonymousClass4AJ.A0D(userSession) || (r4.A1Q && 182.A06(0Tu.A05, userSession, 36321769627002624L))) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static void A03(C343047pa r4, C352888Fl r5) {
        if (r4 == null) {
            0f9 AEf = 0wj.A01.AEf(__redex_internal_original_name, 817900894);
            AEf.ABQ(DialogModule.KEY_MESSAGE, "mCameraVideoSize is null");
            AEf.ERJ(new Exception());
            AEf.report();
            return;
        }
        C3495780x r3 = r5.A1G;
        String A0B2 = new Gson().A0B(AnonymousClass72R.A01(r3.A06, r4.A02, r4.A01));
        0qQ.A07(A0B2);
        0xY AR4 = r3.A07.AR4();
        AR4.E5g("KEY_CAMERA_SPEC", A0B2);
        AR4.apply();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00a6, code lost:
        if (A0K(r12) == false) goto L_0x00a8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00b6, code lost:
        if (r3 != false) goto L_0x00b8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A04(com.instagram.creation.cameraconfiguration.CameraConfiguration r11, X.C352888Fl r12) {
        /*
            com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu r1 = r12.A0y
            X.81m r0 = r12.A19
            X.81t r0 = r0.A00()
            X.81w r3 = r0.B6T()
            if (r3 == 0) goto L_0x0041
            com.instagram.common.session.UserSession r0 = r12.A0f
            boolean r0 = X.AnonymousClass81x.A00(r0)
            if (r0 == 0) goto L_0x0227
            if (r1 == 0) goto L_0x0227
            X.8Yz r0 = r12.A0g
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80N
            if (r0 == 0) goto L_0x0227
            X.8GA r2 = r12.A0n
            X.81v r0 = r1.getCameraFlashButton()
            r2.A04 = r0
            X.8GF r1 = r0.CrP()
            X.8GG r0 = new X.8GG
            r0.<init>(r2)
            r1.A00 = r0
            r1.A00()
            android.view.View r1 = r3.getView()
            r0 = 8
        L_0x003e:
            r1.setVisibility(r0)
        L_0x0041:
            java.util.Set r8 = r11.A04
            X.4yO r9 = r11.A03
            X.7l2 r0 = r12.A06
            if (r0 == 0) goto L_0x0064
            boolean r2 = r9 instanceof X.AnonymousClass80O
            X.7tb r0 = X.C340297l2.A02(r0)
            com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController r0 = (com.facebook.onecamera.outputcontrollers.camera.basic.BasicCameraOutputController) r0
            X.7lR r1 = r0.A04
            if (r1 == 0) goto L_0x0064
            r1.A0H = r2
            X.7lR r0 = r1.A0C
            if (r0 == 0) goto L_0x005d
            r0.A0H = r2
        L_0x005d:
            X.7m6 r0 = r1.A0P
            r0.getClass()
            r0.A08 = r2
        L_0x0064:
            X.8aL r0 = X.C358088aL.A0D
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0076
            X.7l2 r0 = r12.A06
            if (r0 == 0) goto L_0x007b
            boolean r0 = r0.A0T()
            if (r0 == 0) goto L_0x007b
        L_0x0076:
            X.81i r1 = r12.A17
            r0 = 0
            r1.A0A = r0
        L_0x007b:
            X.8aL r11 = X.C358088aL.A0T
            boolean r0 = r8.contains(r11)
            r7 = 1
            r6 = 0
            if (r0 != 0) goto L_0x00bc
            X.8aL r0 = X.C358088aL.A0z
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x00bc
            X.JYD r10 = A00(r12)
            if (r10 == 0) goto L_0x00bc
            X.8aL r0 = X.C358088aL.A0p
            boolean r5 = r8.contains(r0)
            boolean r4 = r9 instanceof X.AnonymousClass80L
            boolean r3 = r9 instanceof X.AnonymousClass80K
            boolean r0 = r9 instanceof X.AnonymousClass9QA
            if (r0 == 0) goto L_0x00a8
            boolean r0 = A0K(r12)
            r2 = 1
            if (r0 != 0) goto L_0x00a9
        L_0x00a8:
            r2 = 0
        L_0x00a9:
            X.8W6 r0 = r12.A0B
            boolean r1 = r0.A07()
            if (r5 != 0) goto L_0x00b8
            if (r4 != 0) goto L_0x00b8
            if (r2 != 0) goto L_0x00b8
            r0 = 1
            if (r3 == 0) goto L_0x00b9
        L_0x00b8:
            r0 = 0
        L_0x00b9:
            r10.A0L(r1, r0, r3)
        L_0x00bc:
            boolean r0 = r8.contains(r11)
            if (r0 == 0) goto L_0x00d4
            X.8aL r0 = X.C358088aL.A0z
            boolean r0 = r8.contains(r0)
            if (r0 == 0) goto L_0x00d4
            X.JYD r0 = A00(r12)
            r0.getClass()
            r0.A0K(r7)
        L_0x00d4:
            X.Jc1 r2 = A01(r12)
            X.8aL r3 = X.C358088aL.A0p
            boolean r0 = r8.contains(r3)
            if (r0 != 0) goto L_0x0221
            X.8aL r0 = X.C358088aL.A0o
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0221
            com.instagram.ui.widget.shutterbutton.ShutterButton r5 = r12.A1I
            long r0 = r12.A1X
        L_0x00ec:
            r5.A08 = r0
            boolean r0 = r8.contains(r3)
            if (r0 == 0) goto L_0x0188
            r2.getClass()
            r2.A03()
        L_0x00fa:
            X.8Yz r3 = r12.A0g
            X.80m r0 = r3.A09
            java.lang.Object r0 = r0.A00
            java.util.Set r0 = (java.util.Set) r0
            r12.A05(r9, r0)
            X.9QA r0 = X.AnonymousClass9QA.A00
            if (r9 == r0) goto L_0x010d
            X.80M r0 = X.AnonymousClass80M.A00
            if (r9 != r0) goto L_0x0118
        L_0x010d:
            boolean r0 = r8.isEmpty()
            if (r0 != 0) goto L_0x0118
            X.8aL r0 = X.C358088aL.A0M
            r8.contains(r0)
        L_0x0118:
            boolean r0 = r9 instanceof X.AnonymousClass80O
            if (r0 == 0) goto L_0x0185
            android.content.Context r2 = X.C60960kU.A00
            r1 = 1069757235(0x3fc33333, float:1.525)
            X.9QM r0 = new X.9QM
            r0.<init>(r2, r1)
        L_0x0126:
            r5.setShutterButtonRecordingStyle(r0)
            X.8aL r0 = X.C358088aL.A0J
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r3.A0V(r0)
            if (r0 == 0) goto L_0x0149
            java.util.concurrent.atomic.AtomicBoolean r4 = r12.A1L
            boolean r0 = r4.get()
            if (r0 != 0) goto L_0x0149
            android.os.Handler r3 = r12.A0Q
            java.lang.Runnable r2 = r12.A1J
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            r4.set(r7)
        L_0x0149:
            A0A(r12)
            A07(r12)
            X.8GA r3 = r12.A0n
            java.lang.Integer r0 = r3.A05()
            if (r0 == 0) goto L_0x016e
            int r2 = r0.intValue()
            if (r2 == 0) goto L_0x0181
            boolean r0 = r3.A0A()
            if (r0 == 0) goto L_0x0181
            boolean r1 = X.AnonymousClass8GA.A04(r3)
            r0 = 3
            if (r1 == 0) goto L_0x0179
            r2 = 3
        L_0x016b:
            r3.A08(r2)
        L_0x016e:
            X.AnonymousClass8GA.A00(r3)
            X.4Vs r0 = r12.A03
            if (r0 == 0) goto L_0x0178
            r12.A0R(r0)
        L_0x0178:
            return
        L_0x0179:
            if (r2 != r0) goto L_0x016b
            int r2 = r3.A01
            if (r2 != r0) goto L_0x016b
            r2 = 0
            goto L_0x016b
        L_0x0181:
            r3.A09(r6)
            goto L_0x016e
        L_0x0185:
            X.5zt r0 = r5.A0j
            goto L_0x0126
        L_0x0188:
            if (r2 == 0) goto L_0x00fa
            boolean r4 = r2.A00
            r2.A00 = r6
            X.0eM r0 = r2.A0I
            java.lang.Object r0 = r0.getValue()
            X.JYE r0 = (X.JYE) r0
            r0.A00()
            X.Jc3 r3 = r2.A0A
            X.4Co r1 = r3.A00
            if (r1 == 0) goto L_0x01a3
            r0 = 0
            r1.AG7(r0)
        L_0x01a3:
            com.instagram.common.ui.base.IgTextView r0 = r3.A05
            r10 = 8
            r0.setVisibility(r10)
            if (r4 == 0) goto L_0x01af
            X.C59937Jc1.A01(r2)
        L_0x01af:
            X.0eM r0 = r2.A0G
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x01e7
            X.0eM r11 = r2.A0F
            java.lang.Object r4 = r11.getValue()
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            android.graphics.drawable.Drawable r3 = r4.getDrawable()
            boolean r0 = r3 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r0 == 0) goto L_0x01db
            android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
            if (r3 == 0) goto L_0x01db
            android.graphics.Bitmap r0 = r3.getBitmap()
            if (r0 == 0) goto L_0x01db
            r0.recycle()
        L_0x01db:
            r4.setImageBitmap(r1)
            java.lang.Object r0 = r11.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r10)
        L_0x01e7:
            X.0eM r0 = r2.A0E
            java.lang.Object r0 = r0.getValue()
            X.3oV r0 = (X.C252063oV) r0
            boolean r0 = r0.CVM()
            if (r0 == 0) goto L_0x00fa
            X.0eM r4 = r2.A0D
            java.lang.Object r3 = r4.getValue()
            android.widget.ImageView r3 = (android.widget.ImageView) r3
            android.graphics.drawable.Drawable r2 = r3.getDrawable()
            boolean r0 = r2 instanceof android.graphics.drawable.BitmapDrawable
            r1 = 0
            if (r0 == 0) goto L_0x0213
            android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
            if (r2 == 0) goto L_0x0213
            android.graphics.Bitmap r0 = r2.getBitmap()
            if (r0 == 0) goto L_0x0213
            r0.recycle()
        L_0x0213:
            r3.setImageBitmap(r1)
            java.lang.Object r0 = r4.getValue()
            android.view.View r0 = (android.view.View) r0
            r0.setVisibility(r10)
            goto L_0x00fa
        L_0x0221:
            com.instagram.ui.widget.shutterbutton.ShutterButton r5 = r12.A1I
            r0 = 3000(0xbb8, double:1.482E-320)
            goto L_0x00ec
        L_0x0227:
            X.8GA r2 = r12.A0n
            r2.A04 = r3
            X.8GF r1 = r3.CrP()
            X.8GG r0 = new X.8GG
            r0.<init>(r2)
            r1.A00 = r0
            r1.A00()
            android.view.View r1 = r3.getView()
            r0 = 0
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.A04(com.instagram.creation.cameraconfiguration.CameraConfiguration, X.8Fl):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        if (A02(r4).booleanValue() != false) goto L_0x0043;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        if (java.lang.Boolean.valueOf(r0).booleanValue() != false) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(X.C279284yO r5, java.util.Set r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x004f
            X.8aL r0 = X.C358088aL.A0M
            boolean r0 = r6.contains(r0)
            if (r0 != 0) goto L_0x004f
            boolean r0 = A0J(r4)
            if (r0 != 0) goto L_0x004f
            X.80h r0 = X.C3494180h.A00
            if (r5 != r0) goto L_0x0043
            com.instagram.common.session.UserSession r3 = r4.A0f
            r0 = 0
            X.0qQ.A0B(r3, r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36320502608110081(0x81094e00052201, double:3.0325703280693466E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x0038
            boolean r0 = r4.A1Q
            if (r0 == 0) goto L_0x0043
            r0 = 36321769627068161(0x810a75003c2701, double:3.033371595960312E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0043
        L_0x0038:
            java.lang.Boolean r0 = A02(r4)
            boolean r1 = r0.booleanValue()
            r0 = 1
            if (r1 == 0) goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            r1 = 1
        L_0x0050:
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r4.A1I
            r0.setHandsFreeRecordingEnabled(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.A05(X.4yO, java.util.Set):void");
    }

    public static void A06(C352888Fl r60) {
        String str;
        String str2;
        C18078Vl7 vl7;
        C301665zl r1;
        String str3;
        float f;
        float f2;
        boolean z;
        int i;
        int i2;
        C339307jO A002;
        View view;
        View view2;
        C352888Fl r4 = r60;
        CameraAREffect cameraAREffect = r4.A0Z.A00().A05.A09;
        C357638Yz r3 = r4.A0g;
        C3494680m r2 = r3.A08;
        r4.A05((C279284yO) r2.A00, (Set) r3.A09.A00);
        C279294yP r13 = ((C279284yO) r2.A00).A00;
        UserSession userSession = r4.A0f;
        27r A012 = 27p.A01(userSession);
        28t r14 = 28t.A05;
        C59725JVj A082 = C59895JbK.A08(r3.A08(), true);
        if (cameraAREffect != null) {
            str = cameraAREffect.A0K;
            str2 = cameraAREffect.A0M;
        } else {
            str = null;
            str2 = null;
        }
        A012.A0y(r13, r14, A082, str, str2);
        AnonymousClass81C r12 = r4.A0u.A00;
        if (((C352568Dw) r12.A00()).Cc9()) {
            AnonymousClass80U r7 = r4.A1C;
            if (!r7.CQ0(AnonymousClass80V.ROLL_CALL_SEQUENTIAL_CAPTURE)) {
                Object obj = r2.A00;
                AnonymousClass80K r23 = AnonymousClass80K.A00;
                if (obj == r23) {
                    C352838Ff.A03(C40586Aea.A00, (C352838Ff) r4.A0E.A0F.getValue());
                } else {
                    AnonymousClass85X r0 = r4.A0v;
                    r0.A0B = true;
                    AnonymousClass85X.A06(r0);
                }
                C3498081w r9 = r4.A0p;
                r9.setEnabled(false);
                if (r3.A0R() || 1X9.A00 == null || !AnonymousClass38W.A00().A02(r4.A0P, userSession)) {
                    if (r2.A00 == r23) {
                        C352828Fe r122 = r4.A0E;
                        UserSession userSession2 = r122.A04;
                        if (AnonymousClass39V.A00(userSession2).booleanValue() && 182.A06(0Tu.A05, userSession2, 2342168566998643753L)) {
                            Bitmap A0M2 = r4.A0M();
                            if (A0M2 != null) {
                                r122.A01(A0M2);
                            } else {
                                C364448lR r6 = new C364448lR(r4);
                                C340297l2 r02 = r4.A06;
                                if (r02 != null) {
                                    view = r02.A0H.A00();
                                } else {
                                    view = r4.A0T;
                                }
                                int width = view.getWidth();
                                C340297l2 r03 = r4.A06;
                                if (r03 != null) {
                                    view2 = r03.A0H.A00();
                                } else {
                                    view2 = r4.A0T;
                                }
                                int height = view2.getHeight();
                                C340297l2 r04 = r4.A06;
                                if (r04 != null) {
                                    r04.A0L(r6, width, height);
                                }
                            }
                            if (r3.A0V(C358088aL.A0p) || r2.A00 == r23) {
                                AnonymousClass2S0.A01.A03();
                            }
                            r4.A1F.A00().A00();
                            return;
                        }
                    }
                    if (r2.A00 == AnonymousClass80L.A00) {
                        AnonymousClass8A1.A01(userSession).A0F("live_tapped");
                        C342887pK r05 = r4.A0B.A0J;
                        if (!(r05 == null || (A002 = r05.A00()) == null)) {
                            A002.DJo();
                        }
                    } else {
                        if (r3.A0V(C358088aL.A0B)) {
                            r4.A08.A0A = true;
                            ShutterButton shutterButton = r4.A1I;
                            shutterButton.setEnabled(false);
                            r1 = shutterButton.A0i;
                            str3 = "start_boomerang_recording";
                        } else {
                            boolean z2 = r4.A1U;
                            if ((!z2 || A02(r4).booleanValue()) && !r3.A0V(C358088aL.A0M)) {
                                AnonymousClass80V r10 = AnonymousClass80V.VIDEO_LAYOUT_COMPLETE;
                                if (r7.CQ0(r10)) {
                                    AnonymousClass8A1.A01(userSession).A0F("video_layout_complete");
                                    JYD A003 = A00(r4);
                                    CameraSpec A004 = r4.A1G.A00();
                                    if (A003 != null) {
                                        int i3 = A004.A03;
                                        int i4 = A004.A02;
                                        ArrayList arrayList = new ArrayList();
                                        LinkedList linkedList = A003.A0M.A08;
                                        int size = linkedList.size();
                                        int i5 = 0;
                                        while (i5 < size) {
                                            C63873LAc lAc = (C63873LAc) linkedList.get(i5);
                                            C63809L7p A042 = A003.A0P.A04(A003.A01, i5);
                                            C349307zv r06 = lAc.A05;
                                            if (r06 != null) {
                                                r06.A02().A03 = lAc.A07;
                                            }
                                            C349307zv r07 = lAc.A05;
                                            C349307zv r20 = r07;
                                            if (r07 != null) {
                                                C349307zv r142 = lAc.A05;
                                                C63809L7p l7p = lAc.A04;
                                                float f3 = l7p.A03;
                                                float f4 = A003.A06;
                                                float f5 = (float) i3;
                                                float f6 = (f3 / f4) * f5;
                                                float f7 = l7p.A00;
                                                float f8 = A003.A05;
                                                float f9 = (float) i4;
                                                float f10 = (f7 / f8) * f9;
                                                float f11 = (l7p.A01 / f4) * f5;
                                                float f12 = (l7p.A02 / f8) * f9;
                                                float f13 = 0.0f;
                                                float f14 = 1.0f;
                                                if (r142 != null) {
                                                    int i6 = r142.A09;
                                                    if (i6 == 90 || i6 == 270) {
                                                        z = true;
                                                        i = r142.A08;
                                                    } else {
                                                        z = false;
                                                        i = r142.A0K;
                                                    }
                                                    float f15 = (float) i;
                                                    if (z) {
                                                        i2 = r142.A0K;
                                                    } else {
                                                        i2 = r142.A08;
                                                    }
                                                    float f16 = (float) i2;
                                                    if (JYD.A0J(A003)) {
                                                        C347087wF r15 = A003.A01;
                                                        int i7 = r15.A00;
                                                        int i8 = r15.A03 / i7;
                                                        float f17 = ((float) i7) * f6;
                                                        float f18 = (float) i8;
                                                        if (f15 / f16 > (f17 / f10) / f18) {
                                                            float f19 = (f18 * f10) / f16;
                                                            float f20 = f15 * f19;
                                                            f13 = (0.5f - ((f17 / 2.0f) / f20)) + (f11 / f20);
                                                            float f21 = f19 * f16;
                                                            f = f12 / f21;
                                                            f2 = (f10 / f21) + f;
                                                            f14 = (f6 / f20) + f13;
                                                        } else {
                                                            float f22 = f17 / f15;
                                                            float f23 = f16 * f22;
                                                            f = (f12 / f23) + (0.5f - (((f18 * f10) / 2.0f) / f23));
                                                            f2 = (f10 / f23) + f;
                                                            float f24 = f22 * f15;
                                                            float f25 = f11 / f24;
                                                            f14 = f25 + (f6 / f24);
                                                            f13 = f25;
                                                        }
                                                    } else {
                                                        if (f15 / f16 > f6 / f10) {
                                                            float f26 = 0.5f - ((f6 / 2.0f) / ((f10 / f16) * f15));
                                                            f14 = 1.0f - f26;
                                                            f13 = f26;
                                                        } else {
                                                            float f27 = 0.5f - ((f10 / 2.0f) / ((f6 / f15) * f16));
                                                            f2 = 1.0f - f27;
                                                            f = f27;
                                                        }
                                                    }
                                                    RectF rectF = new RectF(f13, f, f14, f2);
                                                    float f28 = A042.A01 / f4;
                                                    float f29 = A042.A02 / f8;
                                                    arrayList.add(new C10641Rva(rectF, new RectF(f28, f29, (A042.A03 / f4) + f28, (A042.A00 / f8) + f29), r20));
                                                    i5++;
                                                }
                                                f = 0.0f;
                                                f2 = 1.0f;
                                                RectF rectF2 = new RectF(f13, f, f14, f2);
                                                float f282 = A042.A01 / f4;
                                                float f292 = A042.A02 / f8;
                                                arrayList.add(new C10641Rva(rectF2, new RectF(f282, f292, (A042.A03 / f4) + f282, (A042.A00 / f8) + f292), r20));
                                                i5++;
                                            } else {
                                                throw new IllegalStateException("Required value was null.");
                                            }
                                        }
                                        A003.A0Q.A05.Epw(arrayList);
                                    }
                                } else {
                                    Object obj2 = r2.A00;
                                    if (((obj2 instanceof AnonymousClass80N) || (obj2 instanceof C3493880e)) && !r7.CQ0(r10)) {
                                        if (A00(r4) != null) {
                                            ShutterButton shutterButton2 = r4.A1I;
                                            shutterButton2.A07 = A00(r4).A01.A03;
                                            shutterButton2.A06 = A00(r4).A0M.getItemCount();
                                        }
                                        r1 = r4.A1I.A0i;
                                        str3 = "start_clips_recording";
                                    } else if (r3.A0V(C358088aL.A0C)) {
                                        AnonymousClass8A1.A01(userSession).A0F("text_mode_next_tapped");
                                        AnonymousClass8W6 r16 = r4.A0B;
                                        C364688lp.A00(r16.A0L);
                                        r16.A0E.A05();
                                    } else if (r3.A0V(C358088aL.A0T)) {
                                        JYD A005 = A00(r4);
                                        A005.getClass();
                                        AnonymousClass8A1.A01(userSession).A0F("layout_tap");
                                        C59792JYl jYl = A005.A0M;
                                        if (jYl.getItemCount() == 0) {
                                            A005.A0R.E3H(new Object());
                                        }
                                        AnonymousClass80U r17 = A005.A0R;
                                        if (r17.CQ0(AnonymousClass80V.LAYOUT_COMPLETE)) {
                                            C60694Jpf jpf = jYl.A00;
                                            if (jpf != null) {
                                                jpf.A03();
                                                jYl.A00 = null;
                                            }
                                            MultiTouchRecyclerView multiTouchRecyclerView = A005.A0N;
                                            Bitmap createBitmap = Bitmap.createBitmap(multiTouchRecyclerView.getWidth(), multiTouchRecyclerView.getHeight(), Bitmap.Config.ARGB_8888);
                                            0qQ.A07(createBitmap);
                                            multiTouchRecyclerView.draw(new Canvas(createBitmap));
                                            ArrayList arrayList2 = new ArrayList();
                                            ImmutableList.Builder builder = ImmutableList.builder();
                                            String str4 = null;
                                            while (true) {
                                                String str5 = str4;
                                                for (Object next : jYl.A08) {
                                                    0qQ.A07(next);
                                                    C63873LAc lAc2 = (C63873LAc) next;
                                                    AnonymousClass34S r152 = lAc2.A03;
                                                    Object obj3 = r152.A00;
                                                    if (obj3 != null) {
                                                        int intValue = ((Number) obj3).intValue();
                                                        UserSession userSession3 = A005.A0H;
                                                        arrayList2.add(AnonymousClass6LX.A00(userSession3, intValue));
                                                        Object obj4 = r152.A01;
                                                        if (obj4 != null) {
                                                            builder.add(((CameraAREffect) obj4).A0K);
                                                        }
                                                        str4 = lAc2.A07;
                                                        if (str4 == null || (str5 != null && C59737JVv.A01(userSession3, str5, 0sn.A00) == null)) {
                                                        }
                                                    } else {
                                                        throw new IllegalStateException("Required value was null.");
                                                    }
                                                }
                                                boolean contains = arrayList2.contains("3");
                                                AnonymousClass4D6 r18 = A005.A0I;
                                                UserSession userSession4 = A005.A0H;
                                                Context context = A005.A08;
                                                Context context2 = context;
                                                Bitmap bitmap = createBitmap;
                                                r18.schedule(new C363838kQ(context2, bitmap, (Bitmap) null, (Bitmap) null, (Rect) null, (C363848kR) null, (C363858kS) null, (C363858kS) null, builder.build(), (CameraAREffect) null, new MediaUploadMetadata((ImmersiveMediaFields) null, str5, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false), userSession4, A005.A0K, A005, (AnonymousClass8GK) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, "unknown", "layout", (String) null, A005.A01.A05, arrayList2, (byte[]) null, (byte[]) null, contains ? 1 : 0, true, false, false));
                                                AnonymousClass0eM r19 = A005.A0Y;
                                                if (!((Dialog) r19.getValue()).isShowing()) {
                                                    AnonymousClass0fN.A00((Dialog) r19.getValue());
                                                }
                                                JYD.A09(A005);
                                            }
                                        } else if (r17.CQ0(AnonymousClass80V.LAYOUT_CAPTURE)) {
                                            C59943Jc9 jc9 = A005.A0P;
                                            C347087wF r110 = A005.A01;
                                            0qQ.A0B(r110, 0);
                                            List list = (List) jc9.A02.get(r110);
                                            if (list != null && jYl.getItemCount() < list.size()) {
                                                C63809L7p A013 = JYD.A01(A005);
                                                C340297l2 r102 = A005.A0E;
                                                boolean z3 = false;
                                                if (r102.A0H.A00 != null) {
                                                    z3 = true;
                                                }
                                                double d = A005.A04;
                                                double d2 = ((double) A013.A03) / d;
                                                if (z3) {
                                                    r102.A0L(new C364408lN(A005), (int) d2, (int) (((double) A013.A00) / d));
                                                } else {
                                                    JYD.A03(r102.A0A((int) d2, (int) (((double) A013.A00) / d)), A005, (String) null);
                                                }
                                            }
                                        }
                                        r9.setEnabled(true);
                                    } else {
                                        if (r3.A0V(C358088aL.A0w)) {
                                            AnonymousClass8A1.A01(userSession).A0F("stop_motion_take_photo");
                                            View view3 = r4.A0n.A0A;
                                            view3.setVisibility(0);
                                            view3.animate().cancel();
                                            view3.setAlpha(0.25f);
                                            view3.animate().alpha(0.0f).setDuration(71).start();
                                        } else if (A0J(r4)) {
                                            r4.A16.A03 = true;
                                            r1 = r4.A1I.A0i;
                                            str3 = "start_effect_handsfree_recording";
                                        } else {
                                            AnonymousClass8A1.A01(userSession).A0F("normal_take_photo");
                                            if (A0K(r4) && (r2.A00 instanceof AnonymousClass9QA) && (vl7 = r4.A05) != null) {
                                                vl7.A06(C391639tP.PHOTO_CAPTURED);
                                            }
                                        }
                                        A09(r4);
                                    }
                                }
                            } else {
                                if (z2 && !AnonymousClass1GD.A03()) {
                                    ShutterButton shutterButton3 = r4.A1I;
                                    Context context3 = C60960kU.A00;
                                    shutterButton3.setShutterButtonSingularColor(context3.getColor(2Yu.A04(context3)));
                                }
                                r4.A16.A03 = true;
                                r4.A1I.A0i.A01("start_handsfree_recording");
                                if (z2) {
                                    0qQ.A0B(userSession, 0);
                                    0Tu r5 = 0Tu.A05;
                                    if ((182.A06(r5, userSession, 36320502608110081L) || (r4.A1Q && 182.A06(r5, userSession, 36321769627068161L))) && !AnonymousClass4AJ.A0D(userSession)) {
                                        r4.A1F.A00().A01(r4.A0T, r4.A1a, C366978pz.A0Z);
                                    }
                                }
                            }
                        }
                        r1.A01(str3);
                    }
                    AnonymousClass2S0.A01.A03();
                    r4.A1F.A00().A00();
                    return;
                }
                r4.A0m.A05();
                r4.A1I.A04(CancelReason.SYSTEM_CANCELLED, "Single Tap in Video Call");
                return;
            }
        }
        ((C352568Dw) r12.A00()).Dkg();
        AnonymousClass8A1.A01(userSession).A0F("tapped_when_disabled");
    }

    public static void A07(C352888Fl r3) {
        B17 b17;
        r3.A0Q.removeCallbacks(r3.A1K);
        AnonymousClass84E r2 = r3.A0c;
        if (r2 != null && !r3.A0L) {
            C340297l2 r1 = r3.A06;
            if (!(r1 == null || (b17 = r3.A04) == null)) {
                r1.EEJ(b17);
                r3.A04 = null;
            }
            r2.A01();
        }
    }

    public static void A08(C352888Fl r3) {
        r3.A0B.A03();
        0kD.A03(__redex_internal_original_name, "onBurstFramesCaptureFailure");
        C59689JTv.A0F(r3.A0P, "boomerang_capture_error", 2131953948);
        r3.A1C.E3H(new Object());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0081, code lost:
        if (r1 != false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A09(X.C352888Fl r10) {
        /*
            X.8Yz r0 = r10.A0g
            X.80m r0 = r0.A08
            java.lang.Object r6 = r0.A00
            X.4yO r6 = (X.C279284yO) r6
            com.instagram.common.session.UserSession r5 = r10.A0f
            X.27r r0 = X.27p.A01(r5)
            X.283 r0 = r0.A04
            java.lang.String r2 = r0.A0L
            X.27r r0 = X.27p.A01(r5)
            java.lang.String r1 = r0.A0R()
            r0 = 17642914(0x10d35a2, float:2.593609E-38)
            X.C360908fL.A02(r5, r6, r2, r1, r0)
            X.8GA r2 = r10.A0n
            boolean r4 = r2.A05
            X.7l2 r0 = r10.A06
            r0.getClass()
            boolean r0 = r0.A0W()
            r9 = 1
            if (r0 != 0) goto L_0x0047
            if (r4 != 0) goto L_0x0047
            X.7l2 r0 = r10.A06
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x00ab
            X.0Tu r3 = X.0Tu.A05
            r0 = 36322791825811878(0x810b63000729a6, double:3.034018038561903E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            if (r0 == 0) goto L_0x00ab
        L_0x0047:
            r1 = 1
        L_0x0048:
            boolean r0 = r6 instanceof X.C363138jC
            if (r0 == 0) goto L_0x0081
            if (r1 != 0) goto L_0x0083
            X.JaN r1 = X.JW1.A00(r5)
            X.81e r0 = r10.A10
            X.80R r0 = r0.A00
            X.28D r0 = r0.A01
            X.29E r3 = r1.A0B
            r4 = 0
            r6 = 288434727(0x11312a27, float:1.3975827E-28)
            r7 = 5000(0x1388, double:2.4703E-320)
            r5 = r4
            long r5 = r3.A04(r4, r5, r6, r7)
            r1.A08 = r5
            if (r0 == 0) goto L_0x0073
            java.lang.String r8 = r0.name()
            java.lang.String r7 = "entry_point"
            r4 = r3
            r4.A0B(r5, r7, r8, r9)
        L_0x0073:
            X.8GJ r1 = r10.A0k
            r1.getClass()
            X.AjN r0 = new X.AjN
            r0.<init>(r1)
            r2.A0B(r0)
            return
        L_0x0081:
            if (r1 == 0) goto L_0x0073
        L_0x0083:
            X.7l2 r0 = r10.A06
            boolean r0 = r0.A0W()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            X.7l2 r0 = r10.A06
            boolean r0 = r0.A0V()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r1 = new java.lang.Object[]{r2, r1, r0}
            java.lang.String r0 = "takePhoto() isTakingPhoto=%s mAwaitingFakeSelfieFlash=%s isRecordingVideo=%s"
            java.lang.String r1 = java.lang.String.format(r0, r1)
            java.lang.String r0 = "IgCameraViewController"
            A0F(r0, r1)
            return
        L_0x00ab:
            r1 = 0
            goto L_0x0048
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.A09(X.8Fl):void");
    }

    public static void A0A(C352888Fl r10) {
        C301685zn r0;
        AnonymousClass8GA r2 = r10.A0n;
        r2.A0G.A01(r2.A0A);
        C3496881i r4 = r10.A17;
        r4.A03(r10.A0X);
        if (!A0K(r10)) {
            r10.A0s.setEnabled(true);
        }
        ShutterButton shutterButton = r10.A1I;
        shutterButton.setEnabled(true);
        r10.A0p.setEnabled(true);
        C340297l2 r02 = r10.A06;
        if (r02 != null) {
            r02.A0H.A00().setEnabled(true);
        }
        if (r10.A1O) {
            C3498081w r03 = r10.A0r;
            r03.getClass();
            r03.setEnabled(true);
        }
        r10.A0q.setEnabled(true);
        C357638Yz r8 = r10.A0g;
        C3494680m r7 = r8.A08;
        Object obj = r7.A00;
        AnonymousClass80L r9 = AnonymousClass80L.A00;
        boolean z = true;
        if (obj != r9) {
            if (r8.A0V(C358088aL.A0T, C358088aL.A0z)) {
                r0 = C301685zn.READY_TO_SHOOT_MULTI_CAPTURE;
            } else {
                r0 = C301685zn.READY_TO_SHOOT;
            }
            shutterButton.setMode(r0);
        } else {
            r2.A08(0);
        }
        View view = r10.A1Y;
        ViewGroup viewGroup = r10.A0T;
        view.setLayoutParams(new FrameLayout.LayoutParams(viewGroup.getWidth(), viewGroup.getHeight()));
        boolean z2 = true;
        if (r8.A06().A02 || r7.A00 == r9 || ((!((Set) r8.A09.A00).isEmpty() && r8.A0V(C358088aL.A0C, C358088aL.A0T, C358088aL.A0w)) || r10.A1N || r7.A00 == AnonymousClass80K.A00)) {
            z2 = false;
        }
        shutterButton.setVideoRecordingEnabled(z2);
        if ((r10.A1U && !AnonymousClass4AJ.A0D(r10.A0f)) || r10.A1p) {
            z = false;
        }
        shutterButton.setLongPressEnabled(z);
        r4.A03(r10.A1b);
    }

    public static void A0B(C352888Fl r3, int i) {
        C340297l2 r0 = r3.A06;
        r0.getClass();
        r0.A00 = i;
        Activity activity = r3.A0P;
        int i2 = 2131974863;
        if (i == 1) {
            i2 = 2131974847;
        }
        String string = activity.getString(i2);
        0qQ.A0B(string, 0);
        ((C3497981v) r3.A0s).getView().setContentDescription(string);
    }

    public static void A0C(C352888Fl r13, int i) {
        C340297l2 r0 = r13.A06;
        if (r0 != null) {
            View A002 = r0.A0H.A00();
            if (A002.getWidth() > 0 && A002.getHeight() > 0) {
                ColorDrawable colorDrawable = r13.A0N;
                if (colorDrawable == null) {
                    colorDrawable = new ColorDrawable(r13.A0T.getContext().getColor(R.color.black));
                    r13.A0N = colorDrawable;
                }
                boolean z = true;
                boolean z2 = false;
                if (i > 0) {
                    z2 = true;
                }
                colorDrawable.setVisible(z2, false);
                ImageView imageView = r13.A1Z;
                int i2 = 4;
                if (z2) {
                    i2 = 0;
                }
                imageView.setVisibility(i2);
                if (i < 255) {
                    z = false;
                }
                imageView.setEnabled(z);
                imageView.setImageDrawable(r13.A0N);
                imageView.setImageAlpha(Math.min((int) AnonymousClass37Q.A04((double) i, 0.0d, 127.5d, 0.0d, 255.0d), 255));
            }
        }
    }

    public static void A0D(C352888Fl r5, String str) {
        0qQ.A0B(r5.A0f, 0);
        02m.A0p.markerDrop(17629194);
        C360908fL.A02.clear();
        C360908fL.A01 = false;
        r5.A0I = false;
        r5.A0H = str;
        C3496881i r3 = r5.A17;
        C340297l2 r1 = r3.A02;
        if (r1 != null) {
            r1.A03 = null;
        }
        AnonymousClass8HB r0 = r3.A04;
        if (r0 != null) {
            AnonymousClass8FL r2 = (AnonymousClass8FL) r0.A00.A1B.A00.A00();
            if (r2.A09 && r2.A08) {
                C343437qD r02 = r2.A06;
                if (r02 != null) {
                    AnonymousClass8FP r12 = r2.A0F;
                    0qQ.A0B(r12, 0);
                    r02.A00.A0H(r12);
                }
                RoundedCornerFrameLayout roundedCornerFrameLayout = r2.A0N;
                C294975nL.A00(roundedCornerFrameLayout).A0G();
                roundedCornerFrameLayout.setVisibility(4);
                r2.A09 = false;
            }
        }
        r3.A0H.A00();
        r3.A0A = false;
        C352988Fv r32 = r5.A0l;
        r32.A00 = false;
        AnonymousClass8G2 r22 = r32.A01.A12;
        if (!(r22.A00 == null && r22.A02 == null)) {
            r22.DDS();
            C371648yk r03 = r22.A00;
            if (r03 != null) {
                r03.onTextEditComplete("");
            }
            r22.A00 = null;
            AnonymousClass8G2.A00(r22);
        }
        C340297l2 r23 = r5.A06;
        if (r23 != null) {
            r23.A0D();
            C340297l2 r04 = r5.A06;
            if (r04 != null) {
                r04.A0H.A00().setVisibility(8);
            }
            r23.A0H(r32);
            r23.A0I.A00 = null;
            A07(r5);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0033, code lost:
        if (X.C348017xk.A02(r1) == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0087, code lost:
        if (r3.A00 <= 0.0f) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x008d, code lost:
        if (r4.Caz() != false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00bc, code lost:
        if (X.1Au.A00(r0).A1u() == false) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x014c, code lost:
        if (((java.lang.Boolean) r3.A0y.CDM(r3, X.1Av.A8a[68])).booleanValue() != false) goto L_0x014e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0E(X.C352888Fl r7, boolean r8) {
        /*
            boolean r0 = r7.A1o
            if (r0 == 0) goto L_0x000a
            android.view.ViewGroup r1 = r7.A0U
            r0 = 4
            r1.setVisibility(r0)
        L_0x000a:
            X.8W6 r2 = r7.A0B
            if (r2 == 0) goto L_0x0092
            X.80D r0 = r2.A0F
            int r1 = r0.A03
            r0 = 7
            if (r1 == r0) goto L_0x0041
            X.8Vl r0 = r2.A0H
            X.8Vm r3 = r0.A00()
            boolean r0 = r3.A06
            if (r0 != 0) goto L_0x0042
            X.81e r0 = r3.A0N
            X.80R r0 = r0.A00
            X.28D r1 = r0.A01
            X.80D r0 = r3.A0M
            boolean r0 = r0.A3y
            if (r0 != 0) goto L_0x0035
            X.28D r0 = X.28D.A0i
            if (r0 == r1) goto L_0x0035
            boolean r0 = X.C348017xk.A02(r1)
            if (r0 == 0) goto L_0x0042
        L_0x0035:
            android.app.Activity r1 = r7.A0P
            java.lang.String r0 = "android.permission.CAMERA"
            X.7vz r1 = X.1DL.A00(r1, r0)
            X.7vz r0 = X.C346927vz.DENIED_DONT_ASK_AGAIN
            if (r1 == r0) goto L_0x0092
        L_0x0041:
            return
        L_0x0042:
            X.85X r1 = r2.A0C
            X.2cs r0 = r1.A0O
            X.2ct r0 = r0.A09
            double r3 = r0.A00
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 > 0) goto L_0x0035
            boolean r0 = r1.A0G
            if (r0 != 0) goto L_0x0035
            X.8Hx r4 = r2.A0M
            boolean r0 = r4.CVJ()
            if (r0 != 0) goto L_0x0035
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0035
            X.8ic r0 = X.AnonymousClass8W6.A00(r2)
            if (r0 == 0) goto L_0x0090
            float r0 = r0.A00
            java.lang.Float r1 = java.lang.Float.valueOf(r0)
        L_0x006c:
            r0 = 1065353216(0x3f800000, float:1.0)
            boolean r0 = X.0qQ.A0I(r1, r0)
            if (r0 == 0) goto L_0x0089
            X.8ic r3 = X.AnonymousClass8W6.A00(r2)
            if (r3 == 0) goto L_0x0089
            X.2cs r0 = r3.A0E
            double r1 = r0.A01
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            float r1 = r3.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0035
        L_0x0089:
            boolean r0 = r4.Caz()
            if (r0 == 0) goto L_0x0092
            goto L_0x0035
        L_0x0090:
            r1 = 0
            goto L_0x006c
        L_0x0092:
            X.7pE r0 = r7.A0j
            if (r0 == 0) goto L_0x0099
            r0.onStart()
        L_0x0099:
            X.7l2 r0 = r7.A06
            r4 = 1
            if (r0 == 0) goto L_0x00c2
            X.8Yz r0 = r7.A0g
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r2 = r0 instanceof X.AnonymousClass80M
            X.81e r0 = r7.A10
            X.80R r0 = r0.A00
            X.28D r1 = r0.A01
            X.28D r0 = X.28D.A2O
            if (r1 == r0) goto L_0x014e
            com.instagram.common.session.UserSession r0 = r7.A0f
            if (r2 != 0) goto L_0x0136
            X.1Av r0 = X.1Au.A00(r0)
            boolean r0 = r0.A1u()
            if (r0 != 0) goto L_0x014e
        L_0x00be:
            r0 = 0
        L_0x00bf:
            A0B(r7, r0)
        L_0x00c2:
            boolean r0 = r7.A0I
            if (r0 != 0) goto L_0x00d2
            r7.A0I = r4
            X.81i r1 = r7.A17
            X.81l r0 = r7.A0X
            r1.A03(r0)
            r1.A05(r8)
        L_0x00d2:
            X.7l2 r3 = r7.A06
            if (r3 == 0) goto L_0x0160
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r2 = r7.A0a
            X.7l1 r0 = r3.A0H
            android.view.View r1 = r0.A00()
            X.8Ge r0 = r7.A1d
            r2.A00 = r1
            r2.A01 = r0
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r2 = r7.A0b
            android.view.ViewGroup r1 = r7.A0U
            X.8Ge r0 = r7.A1e
            r2.A00 = r1
            r2.A01 = r0
            X.8Fv r1 = r7.A0l
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x00f7
            r3.A0G(r1)
        L_0x00f7:
            X.8Fw r1 = r7.A1i
            boolean r0 = r1.A00
            if (r0 != 0) goto L_0x0101
            X.7l6 r0 = r3.A0I
            r0.A00 = r1
        L_0x0101:
            X.7l2 r0 = r7.A06
            if (r0 == 0) goto L_0x0108
            r0.A0C()
        L_0x0108:
            X.8E7 r0 = r7.A0z
            X.8E8 r1 = r0.A00()
            com.instagram.common.session.UserSession r0 = r7.A0f
            X.1Av r0 = X.1Au.A00(r0)
            boolean r4 = r0.A1y()
            X.8EA r3 = r1.A00
            if (r3 == 0) goto L_0x0154
            X.2cs r2 = r3.A0B
            if (r4 == 0) goto L_0x0133
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L_0x0122:
            r2.A06(r0)
            com.instagram.common.session.UserSession r0 = r3.A02
            if (r0 != 0) goto L_0x0151
            java.lang.String r0 = "userSession"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0133:
            r0 = 0
            goto L_0x0122
        L_0x0136:
            X.1Av r3 = X.1Au.A00(r0)
            X.0s0 r2 = r3.A0y
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 68
            r0 = r1[r0]
            java.lang.Object r0 = r2.CDM(r3, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x00be
        L_0x014e:
            r0 = 1
            goto L_0x00bf
        L_0x0151:
            X.AnonymousClass8EF.A01(r0, r4)
        L_0x0154:
            float r1 = r7.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x0160
            r0 = 255(0xff, float:3.57E-43)
            A0C(r7, r0)
        L_0x0160:
            boolean r0 = r7.A1U
            if (r0 == 0) goto L_0x017c
            X.81m r0 = r7.A19
            X.81t r2 = r0.A00()
            android.app.Activity r1 = r7.A0P
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r0 = 0
            android.content.res.ColorStateList r0 = X.1QE.A0B(r1, r0)
            int r0 = r0.getDefaultColor()
            r2.ElJ(r0)
        L_0x017c:
            X.82W r0 = r7.A0Z
            X.82X r4 = r0.A00()
            X.8G2 r3 = r7.A12
            X.8DB r0 = r7.A1k
            X.81C r0 = r0.A00
            X.81E r0 = r0.A00()
            X.8Hd r0 = (X.C353318Hd) r0
            X.6eJ r2 = r0.CAx()
            X.88R r1 = r7.A1l
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r4.A05
            r0.A06 = r3
            r0.A04 = r3
            r0.A03 = r2
            r0.A05 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.A0E(X.8Fl, boolean):void");
    }

    public static void A0F(String str, String str2) {
        0f9 AEf = 0wj.A01.AEf(str, 817900894);
        AEf.ABQ(DialogModule.KEY_MESSAGE, str2);
        AEf.report();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0034, code lost:
        if (r1.A0V(X.C358088aL.A0T) != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000c, code lost:
        if ((r4 instanceof X.AnonymousClass80M) != false) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0G(X.C279284yO r4, X.C352888Fl r5) {
        /*
            boolean r0 = r4 instanceof X.C363138jC
            r3 = 0
            if (r0 != 0) goto L_0x000e
            boolean r0 = r4 instanceof X.AnonymousClass9QA
            if (r0 != 0) goto L_0x000e
            boolean r0 = r4 instanceof X.AnonymousClass80M
            r2 = 0
            if (r0 == 0) goto L_0x000f
        L_0x000e:
            r2 = 1
        L_0x000f:
            X.8Yz r1 = r5.A0g
            X.8aL r0 = X.C358088aL.A0M
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 != 0) goto L_0x0036
            X.8aL r0 = X.C358088aL.A0B
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r0 = r1.A0V(r0)
            if (r0 != 0) goto L_0x0036
            X.8aL r0 = X.C358088aL.A0T
            X.8aL[] r0 = new X.C358088aL[]{r0}
            boolean r1 = r1.A0V(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0037
        L_0x0036:
            r0 = 0
        L_0x0037:
            if (r2 == 0) goto L_0x003c
            if (r0 == 0) goto L_0x003c
            r3 = 1
        L_0x003c:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.A0G(X.4yO, X.8Fl):boolean");
    }

    public static boolean A0H(C352888Fl r2) {
        AnonymousClass8DD r1 = r2.A14;
        if (r1 == null || r1.A0D() == null || r1.A0D().A04 != AnonymousClass87I.AR_EFFECT) {
            return false;
        }
        return true;
    }

    public static boolean A0I(C352888Fl r6) {
        AnonymousClass88F r0;
        if (!r6.A0M) {
            return false;
        }
        C340297l2 r02 = r6.A06;
        if (r02 != null && r02.CVP() && ((r0 = r6.A0B.A0N) == null || r0.A0f)) {
            return true;
        }
        Activity activity = r6.A0P;
        if (activity != null) {
            UserSession userSession = r6.A0f;
            if (C362988ir.A01(activity.getApplicationContext(), userSession)) {
                1pd.A00(C362988ir.A00()).A00(activity.getApplicationContext(), userSession, new AfZ(r6), __redex_internal_original_name);
            }
        }
        C18078Vl7 vl7 = r6.A05;
        if (vl7 == null || !vl7.A0B.isStreaming()) {
            return false;
        }
        return true;
    }

    public static boolean A0J(C352888Fl r1) {
        CameraAREffect cameraAREffect = r1.A0Z.A00().A05.A09;
        if (cameraAREffect == null || !cameraAREffect.A0i) {
            return false;
        }
        return true;
    }

    public static boolean A0K(C352888Fl r1) {
        C357488Yc A012 = C357488Yc.A03.A01(r1.A0f);
        if (A012 == null || !A012.A00().A0I()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002f, code lost:
        if (r1.contains(r3, r2) != false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0L(X.C352888Fl r6, float r7, float r8, float r9, float r10) {
        /*
            X.7l2 r0 = r6.A06
            r5 = 0
            if (r0 == 0) goto L_0x004f
            boolean r0 = r0.CVP()
            if (r0 == 0) goto L_0x004f
            boolean r0 = r6.A0K
            if (r0 != 0) goto L_0x004f
            X.80U r1 = r6.A1C
            X.80V r0 = X.AnonymousClass80V.LAYOUT_CAPTURE
            boolean r0 = r1.CQ0(r0)
            if (r0 == 0) goto L_0x0031
            int r3 = (int) r7
            int r2 = (int) r8
            X.JYD r0 = r6.A0C
            if (r0 == 0) goto L_0x004f
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            X.7l2 r0 = r0.A0E
            android.view.View r0 = r0.A0F
            r0.getHitRect(r1)
            boolean r0 = r1.contains(r3, r2)
            if (r0 == 0) goto L_0x004f
        L_0x0031:
            X.823 r0 = r6.A0x
            if (r0 == 0) goto L_0x003d
            X.8Xk r1 = r0.A00()
            r0 = 1
            r1.A04(r0)
        L_0x003d:
            boolean r0 = r6.A0W()
            if (r0 == 0) goto L_0x0050
            X.8E5 r0 = r6.A18
            X.8Zl r0 = r0.A00()
            boolean r0 = r0.CYI()
            if (r0 == 0) goto L_0x0050
        L_0x004f:
            return r5
        L_0x0050:
            X.82W r0 = r6.A0Z
            X.82X r0 = r0.A00()
            com.instagram.camera.effect.mq.IgCameraEffectsController r0 = r0.A05
            com.instagram.camera.effect.models.CameraAREffect r1 = r0.A09
            if (r1 == 0) goto L_0x0066
            java.lang.String r0 = r1.A0A
            if (r0 == 0) goto L_0x0066
            java.lang.Integer r1 = r1.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x004f
        L_0x0066:
            X.7l2 r0 = r6.A06
            com.instagram.camera.capture.IgCameraFocusView r4 = r0.A05
            if (r4 == 0) goto L_0x004f
            r3 = 1
            r4.A01 = r3
            android.graphics.PointF r0 = r4.A03
            r0.set(r9, r10)
            X.2cs r2 = r4.A04
            r0 = 0
            r2.A08(r0, r3)
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r2.A06(r0)
            r4.invalidate()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.A0L(X.8Fl, float, float, float, float):boolean");
    }

    public final Bitmap A0M() {
        this.A0n.A09(0);
        C340297l2 r2 = this.A06;
        if (r2 == null) {
            return null;
        }
        C344207rU r1 = r2.A0G;
        if (r1.A08()) {
            C345387tP r22 = (C345387tP) ((C345397tQ) r1.A01(C345397tQ.A00));
            C344037rD r5 = r22.A00;
            C363798kM.A00(r5, AnonymousClass05K.A01, "BasicPhotoCaptureCoordinator", r22.hashCode());
            C340547lR r0 = r22.A04;
            if (r0 != null) {
                Bitmap Bex = r0.A0O.Bex();
                C363808kN.A01(r5, "BasicPhotoCaptureCoordinator", r22.hashCode());
                return Bex;
            }
            C363808kN.A00(new C391719tX((int) CameraCapturer.OPEN_CAMERA_TIMEOUT, "CameraViewController is released"), r5, "BasicPhotoCaptureCoordinator", "high", r22.hashCode());
            return null;
        }
        0kD.A01("OneCameraController", "Trying to take a photo while CameraService is not connected");
        TextureView textureView = r2.A0H.A01;
        if (textureView != null) {
            return textureView.getBitmap();
        }
        return null;
    }

    public final String A0O() {
        C357638Yz r2 = this.A0g;
        if (r2.A08.A00 != AnonymousClass9QA.A00) {
            return null;
        }
        C358088aL r1 = C358088aL.A0M;
        if (!r2.A0V(r1)) {
            r1 = C358088aL.A0B;
            if (!r2.A0V(r1)) {
                r1 = C358088aL.A0T;
                if (!r2.A0V(r1)) {
                    return null;
                }
            }
        }
        return r1.A01;
    }

    public final void A0P() {
        Bundle bundle = new Bundle();
        bundle.putSerializable(C273654mx.A00(460), C62497Kgn.GENERAL);
        Activity activity = this.A0P;
        AnonymousClass6W8 r0 = new AnonymousClass6W8(activity, bundle, this.A0f, ModalActivity.class, C273654mx.A00(592));
        r0.A07();
        r0.A0C(activity);
    }

    public final void A0Q() {
        this.A0n.A09(0);
        if (!A0Y()) {
            C357638Yz r4 = this.A0g;
            Iterator it = new HashSet((Collection) r4.A09.A00).iterator();
            while (it.hasNext()) {
                C358088aL r2 = (C358088aL) it.next();
                Object obj = r4.A08.A00;
                List list = C358218aY.A01;
                0qQ.A0B(obj, 0);
                0sn r0 = (List) C358218aY.A00.get(obj);
                if (r0 == null) {
                    r0 = 0sn.A00;
                }
                if (!r0.contains(r2)) {
                    r4.A0M(r2);
                }
            }
        }
    }

    public final void A0R(C265674Vs r7) {
        this.A03 = r7;
        if (AnonymousClass4W7.A00(r7) != null && AnonymousClass4WA.A01(this.A0P) == AnonymousClass05K.A0C) {
            float f = 1.0f;
            Object obj = this.A0g.A08.A00;
            if (AnonymousClass4W7.A01(r7) == AnonymousClass88T.TABLE_TOP && (obj == AnonymousClass9QA.A00 || (obj instanceof AnonymousClass80O))) {
                f = AnonymousClass4WA.A00(this.A0S, r7);
            }
            View view = this.A0S;
            if (view != null) {
                C294975nL A012 = C294975nL.A01(view, 0);
                A012.A0G();
                C294975nL A0F2 = A012.A0F(true);
                A0F2.A0P(f, ((float) view.getWidth()) / 2.0f);
                A0F2.A0Q(f, 0.0f);
                A0F2.A0H();
            }
            C3495780x r1 = this.A1G;
            if (r1 != null) {
                r1.A03.A0B(new AnonymousClass34S(Float.valueOf(f), true));
            }
            this.A1B.A00().ETS(f);
            this.A1j.A00 = f;
            if (this.A0n != null) {
                float A002 = AnonymousClass4WA.A00(this.A0T, r7);
                View view2 = this.A1Y;
                if (view2 != null) {
                    C294975nL A013 = C294975nL.A01(view2, 0);
                    A013.A0G();
                    C294975nL A0F3 = A013.A0F(true);
                    A0F3.A0P(1.0f, 0.0f);
                    A0F3.A0Q(A002, 0.0f);
                    A0F3.A0H();
                }
            }
        }
    }

    public final void A0S(C391509tC r9) {
        UserSession userSession = this.A0f;
        UpcomingEvent A002 = C339637jv.A00(userSession).A00(userSession);
        if (this.A0g.A08.A00 != AnonymousClass80L.A00 || A002 == null) {
            A06(this);
            return;
        }
        Fragment fragment = this.A0V;
        AKN akn = new AKN(r9, this);
        0qQ.A0B(fragment, 0);
        0qQ.A0B(userSession, 1);
        Context requireContext = fragment.requireContext();
        C358248ab r2 = new C358248ab(requireContext);
        r2.A05 = requireContext.getString(2131963951, new Object[]{A002.getTitle()});
        r2.A08(2131963947);
        r2.A0I(akn, 2131963948);
        r2.A0G((DialogInterface.OnClickListener) null, 2131963949);
        r2.A0H(new C39941AKh(fragment, this, userSession, A002), 2131963950);
        AnonymousClass0fN.A00(r2.A02());
    }

    public final void A0T(PickerConfiguration.ItemConfiguration itemConfiguration) {
        String str;
        C3504784u r2 = this.A1n;
        if (this.A1R && r2 != null && (str = itemConfiguration.mId) != null) {
            r2.A04();
            r2.A0K.put(r2.A05, str);
            Product A042 = r2.A04();
            ShoppingCameraSurveyMetadata shoppingCameraSurveyMetadata = r2.A02;
            if (!(shoppingCameraSurveyMetadata == null || A042 == null)) {
                HashSet hashSet = shoppingCameraSurveyMetadata.A06;
                hashSet.add(A042.A0H);
                shoppingCameraSurveyMetadata.A00 = hashSet.size();
            }
            boolean isEmpty = str.isEmpty();
            AnonymousClass8DD r0 = this.A14;
            r0.getClass();
            AnonymousClass8DM r1 = r0.A0O;
            if (r1 != null) {
                r1.Egp(A042);
                r1.Egv(!isEmpty);
                AnonymousClass8E6 r02 = this.A1A;
                if (r02 != null) {
                    r02.A00().FL8();
                    return;
                }
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A0U(AnonymousClass8GD r4) {
        C340297l2 r2 = this.A06;
        if (r2 == null) {
            this.A17.A04(new C359148c5(r4, this));
        } else {
            r2.A0J(new C341947nn(r4, this.A0f));
        }
    }

    public final boolean A0V() {
        AnonymousClass87G A0D2;
        CameraAREffect A002;
        AnonymousClass8DD r0 = this.A14;
        if (r0 == null || (A0D2 = r0.A0D()) == null || (A002 = A0D2.A00()) == null || !A002.A0I()) {
            return false;
        }
        return true;
    }

    public final boolean A0X() {
        CameraAREffect cameraAREffect = this.A0Z.A00().A05.A09;
        if (A0Y()) {
            return false;
        }
        C340297l2 r0 = this.A06;
        if (r0 != null && r0.A0W()) {
            return false;
        }
        if ((cameraAREffect == null || "SUPERZOOMV3".equals(CameraAREffect.A00(cameraAREffect.A09)) || cameraAREffect.A09 == AnonymousClass05K.A01) && !this.A0g.A0V(C358088aL.A0o, C358088aL.A0p)) {
            return true;
        }
        return false;
    }

    public final boolean A0Y() {
        return this.A1C.CQ0(AnonymousClass80V.VIDEO_RECORDING);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000d, code lost:
        if (r2.A1C.CQ0(X.AnonymousClass80V.CONFIGURE_CAMERA) != false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ boolean A76(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            X.80V r0 = X.AnonymousClass80V.CAPTURE
            if (r3 != r0) goto L_0x000f
            X.80U r1 = r2.A1C
            X.80V r0 = X.AnonymousClass80V.CONFIGURE_CAMERA
            boolean r1 = r1.CQ0(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            r1 = r0 ^ 1
            java.lang.String r0 = "State transitioning to CAPTURE without being in CONFIGURE_CAMERA first."
            X.02V.A06(r1, r0)
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.A76(java.lang.Object, java.lang.Object):boolean");
    }

    public final C340297l2 Ajh() {
        return this.A06;
    }

    public final boolean CeF() {
        if (this.A1C.Ats() == AnonymousClass80X.PRE_CAPTURE) {
            return true;
        }
        return false;
    }

    public final void CxH(String str) {
        27p.A01(this.A0f).A1k(str);
    }

    public final void D0E() {
        if (this.A06 == null) {
            C340297l2 r0 = this.A17.A02;
            this.A06 = r0;
            r0.getClass();
            this.A0m.A01 = this.A06;
            A0E(this, false);
            UserSession userSession = this.A0f;
            Integer num = this.A0G;
            C357638Yz r2 = this.A0g;
            A0B(this, C340377lA.A00(userSession, (C279284yO) r2.A08.A00, num, r2.A0V(C358088aL.A0C)));
            this.A0G = null;
        }
        C352988Fv r1 = this.A0l;
        if (!r1.A00) {
            this.A06.A0G(r1);
        }
        C340297l2 r02 = this.A06;
        r02.getClass();
        r02.A0H.A00().setEnabled(true);
        C340297l2 r03 = this.A06;
        r03.A0H.A00().post(new C341937nm(this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r2.A00().CbC() == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x003b, code lost:
        if (1 != r3.intValue()) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D8c(X.AnonymousClass87G r17, java.util.Map r18) {
        /*
            r16 = this;
            r2 = r17
            X.87I r0 = r2.A04
            if (r0 != 0) goto L_0x0008
            X.87I r0 = X.AnonymousClass87I.EMPTY
        L_0x0008:
            int r0 = r0.ordinal()
            r13 = 2
            if (r0 != r13) goto L_0x0089
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            r0.getClass()
            java.lang.String r7 = r0.A0K
            r1 = r16
            java.lang.Integer r3 = r1.A0N()
            com.instagram.common.session.UserSession r0 = r1.A0f
            X.27r r4 = X.27p.A01(r0)
            r8 = 0
            X.JVj r6 = X.C59725JVj.PRE_CAPTURE
            X.8Yz r0 = r1.A0g
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            X.4yO r0 = (X.C279284yO) r0
            X.4yP r5 = X.C359198cG.A00(r0)
            r1 = 1
            if (r3 == 0) goto L_0x003d
            int r0 = r3.intValue()
            r12 = 1
            if (r1 == r0) goto L_0x003e
        L_0x003d:
            r12 = 2
        L_0x003e:
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            r11 = 0
            if (r0 == 0) goto L_0x008a
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            java.lang.String r9 = r0.A0B
        L_0x004b:
            com.instagram.model.shopping.ProductItemWithAR r0 = r2.A06
            if (r0 == 0) goto L_0x0071
            com.instagram.user.model.ProductDetailsProductItemDict r0 = r0.A01
            com.instagram.user.model.Product r3 = X.C14502TxO.A00(r0)
            r0 = 0
            X.0yf r11 = new X.0yf
            r11.<init>(r0)
            java.lang.String r1 = r3.A0H
            java.lang.String r0 = "product_id"
            r11.put(r0, r1)
            com.instagram.user.model.User r0 = r3.A0B
            if (r0 == 0) goto L_0x0071
            java.lang.String r1 = X.AnonymousClass3ZA.A00(r0)
            if (r1 == 0) goto L_0x0071
            java.lang.String r0 = "merchant_id"
            r11.put(r0, r1)
        L_0x0071:
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            if (r0 == 0) goto L_0x0082
            com.instagram.camera.effect.models.CameraAREffect r0 = r2.A00()
            boolean r0 = r0.CbC()
            r14 = 1
            if (r0 != 0) goto L_0x0083
        L_0x0082:
            r14 = 0
        L_0x0083:
            r15 = 0
            r10 = r18
            r4.A13(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
        L_0x0089:
            return
        L_0x008a:
            r9 = r8
            goto L_0x004b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.D8c(X.87G, java.util.Map):void");
    }

    public final void D8e(AnonymousClass87G r5) {
        C352948Fr r0;
        String str;
        this.A1c.A00.A00(new AnonymousClass9JG(__redex_internal_original_name, 002.A0R("onDialElementSelected ", r5.getId())));
        C3495780x r3 = this.A1G;
        boolean z = false;
        if (r5.A04 == AnonymousClass87I.AR_EFFECT) {
            z = true;
        }
        r3.A09.Epw(Boolean.valueOf(z));
        AnonymousClass8DD r02 = this.A14;
        if (r02 != null) {
            ShutterButton shutterButton = this.A1I;
            AnonymousClass8DM r03 = r02.A0O;
            if (r03 != null) {
                str = r03.AqZ(r5);
            } else {
                str = "";
            }
            shutterButton.setContentDescription(str);
        }
        AnonymousClass8W6 r1 = this.A0B;
        C355948Rz.A06(r1.A09);
        AnonymousClass85X r04 = r1.A0C;
        r04.A03 = r5;
        AnonymousClass85X.A06(r04);
        if (A0H(this) && (r0 = this.A0A) != null) {
            r0.A02();
        }
        AnonymousClass8E6 r05 = this.A1A;
        if (r05 != null) {
            r05.A00().FL8();
        }
    }

    public final void D8g(AnonymousClass87G r3) {
        AnonymousClass8W6 r1 = this.A0B;
        r1.A09.A09(r3);
        AnonymousClass85X r0 = r1.A0C;
        r0.A03 = r3;
        AnonymousClass85X.A06(r0);
    }

    public final void DWx(String str) {
        if (this.A0g.A08.A00 instanceof C363138jC) {
            C59847JaN A002 = JW1.A00(this.A0f);
            A002.A08 = A002.A0B.A07(String.valueOf(str), "", 288434727, A002.A08);
        }
    }

    public final void DWy(C352218Cl r6) {
        if (this.A0g.A08.A00 instanceof C363138jC) {
            C59847JaN A002 = JW1.A00(this.A0f);
            A002.A08 = A002.A0B.A02(288434727, A002.A08);
        }
        this.A0w.A02.A08(AnonymousClass05K.A00);
        this.A0B.A04(r6);
    }

    public final void DjU(boolean z) {
        this.A1I.setEnabled(z);
    }

    public final /* bridge */ /* synthetic */ void Dmx(Object obj, Object obj2, Object obj3) {
        JYD A002;
        AnonymousClass80U r1;
        Object r0;
        String str;
        AnonymousClass80V r7 = (AnonymousClass80V) obj;
        AnonymousClass80V r8 = (AnonymousClass80V) obj2;
        int ordinal = r7.ordinal();
        if (ordinal != 2) {
            if (ordinal == 3) {
                if (r8 != AnonymousClass80V.CAPTURE) {
                    A07(this);
                }
                AnonymousClass823 r02 = this.A0x;
                if (r02 != null) {
                    r02.A00().A04(false);
                }
                C340297l2 r03 = this.A06;
                if (r03 != null) {
                    r03.EXA(false);
                }
            } else if (ordinal == 10) {
                if (A0J(this)) {
                    AnonymousClass82T r5 = this.A0Z.A00().A05.A0M;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("action", "reset_effect");
                        jSONObject.put("platform", "android");
                        AnonymousClass82T.A00(r5, jSONObject);
                    } catch (JSONException e) {
                        if (e.getMessage() != null) {
                            str = e.getMessage();
                        } else {
                            str = "";
                        }
                        0kD.A01("PlatformEventsController::fireResetEffectEvent", str);
                    }
                }
                if (this.A0g.A0V(C358088aL.A0M) || A0J(this)) {
                    AnonymousClass8G7 r12 = this.A16;
                    r12.A03 = false;
                    if (r12.A02) {
                        r12.A02 = false;
                        View requireViewById = r12.A04.getView().requireViewById(R.id.hands_free_timer);
                        0qQ.A07(requireViewById);
                        CountdownTimerView countdownTimerView = (CountdownTimerView) requireViewById;
                        GradientSpinner gradientSpinner = countdownTimerView.A04;
                        0qQ.A0A(gradientSpinner);
                        gradientSpinner.A08();
                        0qQ.A0A(gradientSpinner);
                        gradientSpinner.setVisibility(8);
                        AnonymousClass8JB r04 = countdownTimerView.A05;
                        if (r04 != null) {
                            r04.A02.removeCallbacksAndMessages((Object) null);
                            countdownTimerView.A05 = null;
                        }
                        countdownTimerView.A03 = null;
                    }
                }
                if (A0W() || this.A18.A00().CVH()) {
                    this.A18.A00().DDY();
                }
            }
        } else if (r8 != AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY) {
            A07(this);
        }
        int ordinal2 = r8.ordinal();
        if (ordinal2 == 3) {
            C360908fL.A03(this.A0f, "ui_ready_to_interact", true);
            A0A(this);
        } else if (ordinal2 == 1) {
            if (r7 != AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY || !(obj3 instanceof AnonymousClass8SD)) {
                if (r7 == AnonymousClass80V.VIDEO_RECORDING) {
                    A0A(this);
                } else if (this.A0g.A0V(C358088aL.A0T, C358088aL.A0z) && (A002 = A00(this)) != null) {
                    A002.A0K(true);
                }
                r1 = this.A1C;
                r0 = new AnonymousClass8SC(obj3);
            } else {
                r1 = this.A1C;
                r0 = new Object();
            }
            r1.E3H(r0);
        } else if (ordinal2 == 0) {
            AnonymousClass1Nd.A00(this.A0f).A02(this.A0d, C359138c4.class);
            14i.A06(this.A0e);
        } else if (ordinal2 == 48) {
            if (!this.A0I) {
                onResume();
            }
            this.A0n.A09(0);
        } else if (ordinal2 == 49) {
            C59937Jc1 A012 = A01(this);
            A012.getClass();
            A012.A01 = false;
            C340297l2 r4 = A012.A06;
            boolean z = false;
            if (r4.A0H.A00 != null) {
                z = true;
            }
            AnonymousClass0eM r13 = A012.A0D;
            int measuredWidth = ((View) r13.getValue()).getMeasuredWidth();
            int measuredHeight = ((View) r13.getValue()).getMeasuredHeight();
            if (z) {
                r4.A0L(new C364398lM(A012), measuredWidth, measuredHeight);
            } else {
                C59937Jc1.A00(r4.A0A(measuredWidth, measuredHeight), A012);
            }
            A012.A0J.invoke(new C65875M2q(A012), new C40830Ak0(A012));
        }
    }

    public final void Eu2() {
        View view;
        ReboundViewPager reboundViewPager;
        AnonymousClass846 r2 = this.A1F;
        if (!r2.A00().A01 && (view = this.A0V.mView) != null && (reboundViewPager = (ReboundViewPager) view.findViewById(R.id.ar_effect_picker_pager)) != null) {
            C349317zw A002 = r2.A00();
            ViewGroup viewGroup = this.A0T;
            ShutterButton shutterButton = this.A1I;
            C366978pz r5 = C366978pz.A0C;
            UserSession userSession = this.A0f;
            if (A002.A02(viewGroup, shutterButton, r5, 26G.A00(userSession), (String) null, reboundViewPager.getPageSize() / 2, false)) {
                0wc r22 = 27p.A01(userSession).A05.A01;
                0Aj A003 = r22.A00(r22.A00, "avatar_effect_in_live_tooltip_impression");
                if (A003.isSampled()) {
                    A003.Cgf();
                }
            }
        }
    }

    public final String getModuleName() {
        Object obj = this.A0g.A08.A00;
        if (obj instanceof AnonymousClass80M) {
            return "direct_precapture_camera";
        }
        if (obj instanceof C3494180h) {
            return "note_precapture_camera";
        }
        return "reel_composer_camera";
    }

    public final void onPause() {
        if (this.A1P) {
            this.A0Y.A08(1.0d, true);
        }
        if (this.A08.A0M.get() == 1) {
            0kD.A03(__redex_internal_original_name, "mBoomerangCaptureController.isRecording() = true");
            this.A08.A08(false);
        }
        C353118Gi r2 = this.A0m;
        if (r2.A0V.A0i.A0A || r2.A0S.CQ0(AnonymousClass80V.VIDEO_RECORDING)) {
            C353118Gi.A02(r2, "onPause");
        }
        AnonymousClass8GA r0 = this.A0n;
        r0.A0G.A01(r0.A0A);
        A0D(this, "on_pause");
        IgCameraEffectsController igCameraEffectsController = this.A0Z.A00().A05;
        CameraAREffect cameraAREffect = igCameraEffectsController.A09;
        C312196dz r1 = igCameraEffectsController.A0L;
        if (!(r1 == null || cameraAREffect == null)) {
            r1.EyC(cameraAREffect.A0K);
        }
        AnonymousClass80U r12 = this.A1C;
        if (r12.CQ0(AnonymousClass80V.PHOTO_CAPTURING)) {
            this.A1I.A02();
            r12.E3H(new Object());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        if ((r1 instanceof X.C3494080g) != false) goto L_0x0033;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        if (r1.A0i.A09 != false) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0021, code lost:
        if (r1.A00().A01().A0J() == false) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onVolumeKeyPressed(X.AnonymousClass5FQ r8, android.view.KeyEvent r9) {
        /*
            r7 = this;
            X.8W6 r0 = r7.A0B
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x007b
            X.82W r1 = r7.A0Z
            X.82X r0 = r1.A00()
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A01()
            if (r0 == 0) goto L_0x0023
            X.82X r0 = r1.A00()
            com.instagram.camera.effect.models.CameraAREffect r0 = r0.A01()
            boolean r0 = r0.A0J()
            r6 = 1
            if (r0 != 0) goto L_0x0024
        L_0x0023:
            r6 = 0
        L_0x0024:
            X.8Yz r0 = r7.A0g
            X.80m r0 = r0.A08
            java.lang.Object r1 = r0.A00
            boolean r0 = r1 instanceof X.AnonymousClass80O
            if (r0 != 0) goto L_0x0033
            boolean r0 = r1 instanceof X.C3494080g
            r5 = 0
            if (r0 == 0) goto L_0x0034
        L_0x0033:
            r5 = 1
        L_0x0034:
            X.85X r0 = r7.A0v
            X.2cs r0 = r0.A0O
            X.2ct r0 = r0.A09
            double r3 = r0.A00
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r2 = 0
            if (r0 <= 0) goto L_0x0044
            r2 = 1
        L_0x0044:
            X.80U r0 = r7.A1C
            X.80X r1 = r0.Ats()
            X.80X r0 = X.AnonymousClass80X.PRE_CAPTURE
            if (r1 != r0) goto L_0x0079
            android.app.Activity r0 = r7.A0P
            android.content.Context r0 = r0.getApplicationContext()
            boolean r0 = X.AnonymousClass8FD.A00(r0)
            if (r0 == 0) goto L_0x0079
            float r1 = r7.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x0079
            if (r6 != 0) goto L_0x0079
            if (r5 != 0) goto L_0x0079
            boolean r0 = r7.A0V()
            if (r0 != 0) goto L_0x0079
            X.8E5 r0 = r7.A18
            X.8Zl r0 = r0.A00()
            boolean r0 = r0.CVH()
            if (r0 != 0) goto L_0x0079
            if (r2 == 0) goto L_0x007b
        L_0x0079:
            r0 = 0
            return r0
        L_0x007b:
            android.view.ViewGroup r4 = r7.A0T
            X.8W6 r0 = r7.A0B
            boolean r0 = r0.A07()
            r3 = 0
            if (r0 != 0) goto L_0x0090
            java.lang.String r2 = r7.getModuleName()
            java.lang.String r0 = "Not handling volume tap since camera is not fully visible"
        L_0x008c:
            A0F(r2, r0)
            goto L_0x0079
        L_0x0090:
            X.87h r0 = r7.A1E
            X.8Jc r0 = r0.A00()
            boolean r0 = r0.isVisible()
            if (r0 == 0) goto L_0x00a3
            java.lang.String r2 = r7.getModuleName()
            java.lang.String r0 = "Not handling volume tap since composer is visible"
            goto L_0x008c
        L_0x00a3:
            int r0 = r9.getAction()
            r1 = 1
            if (r0 != 0) goto L_0x00e3
            X.8Gi r5 = r7.A0m
            X.AjP r0 = r5.A02
            if (r0 != 0) goto L_0x00e1
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = r5.A0V
            X.5zl r1 = r0.A0i
            boolean r0 = r1.A09
            if (r0 != 0) goto L_0x00e1
            boolean r0 = r1.A0C
            if (r0 == 0) goto L_0x00e1
            X.7l2 r0 = r5.A01
            if (r0 == 0) goto L_0x00d5
            boolean r0 = r0.A0V()
            if (r0 == 0) goto L_0x00d5
            com.instagram.common.session.UserSession r3 = r5.A0H
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322791825746341(0x810b63000629a5, double:3.034018038520457E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x00e1
        L_0x00d5:
            X.AjP r2 = new X.AjP
            r2.<init>(r5)
            r5.A02 = r2
            r0 = 400(0x190, double:1.976E-321)
            r4.postDelayed(r2, r0)
        L_0x00e1:
            r0 = 1
            return r0
        L_0x00e3:
            int r0 = r9.getAction()
            if (r0 != r1) goto L_0x0079
            X.8Gi r2 = r7.A0m
            X.AjP r0 = r2.A02
            if (r0 == 0) goto L_0x00f5
            r4.removeCallbacks(r0)
            r0 = 0
            r2.A02 = r0
        L_0x00f5:
            boolean r0 = r2.A08
            if (r0 == 0) goto L_0x0101
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r2.A0V
            X.5zl r0 = r1.A0i
            boolean r0 = r0.A09
            if (r0 == 0) goto L_0x0119
        L_0x0101:
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r2.A0V
            X.5zl r0 = r1.A0i
            boolean r0 = r0.A0A
            if (r0 != 0) goto L_0x0119
            boolean r0 = A0I(r7)
            if (r0 == 0) goto L_0x0127
            boolean r0 = r7.A0M
            if (r0 == 0) goto L_0x0127
            X.9tC r0 = X.C391509tC.VOLUME
            r7.A0S(r0)
            goto L_0x00e1
        L_0x0119:
            boolean r0 = r9.isCanceled()
            if (r0 != 0) goto L_0x00e1
            java.lang.String r0 = "volume_up"
            r1.DnW(r0)
            r2.A08 = r3
            goto L_0x00e1
        L_0x0127:
            java.lang.String r2 = r7.getModuleName()
            java.lang.String r1 = "Not handling volume tap since camera is not initialised, mOnInitializedFinishedOnce="
            boolean r0 = r7.A0M
            java.lang.String r0 = X.002.A1D(r1, r0)
            goto L_0x008c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.onVolumeKeyPressed(X.5FQ, android.view.KeyEvent):boolean");
    }

    public final boolean A0W() {
        if (!A0V() || !this.A18.A00().CKp()) {
            return false;
        }
        return true;
    }

    public final boolean A0Z(Runnable runnable, Runnable runnable2) {
        C340297l2 r0;
        if ((A0Y() && !this.A1W) || (r0 = this.A06) == null || !r0.CVP() || !this.A06.A0H.A00().isEnabled() || !this.A0I || !((C3497981v) this.A0s).getView().isEnabled()) {
            return false;
        }
        this.A0K = true;
        C340297l2 r1 = this.A06;
        r1.getClass();
        r1.EzI(new C364258l8(this, runnable, runnable2));
        return true;
    }

    public final void Csu(CameraAREffect cameraAREffect, CameraAREffect cameraAREffect2) {
        AnonymousClass8EA r0;
        AnonymousClass8EL r02;
        C343367q6 r03;
        A07(this);
        UserSession userSession = this.A0f;
        boolean z = false;
        if (AnonymousClass0t1.A01.A01(userSession).A2L()) {
            C3494680m r5 = this.A0g.A08;
            if (r5.A00 == AnonymousClass9QA.A00 && cameraAREffect != null && CameraAREffect.A00(cameraAREffect.A09).equals("DEFAULT") && 182.A06(0Tu.A05, userSession, 36319145398246332L)) {
                boolean z2 = false;
                if (System.currentTimeMillis() - 1Au.A00(userSession).A01.getLong("time_last_seen_boost_story_effects_toast", 0) > TimeUnit.HOURS.toMillis(24)) {
                    z2 = true;
                }
                int i = 1Au.A00(userSession).A01.getInt("boost_story_effects_toast_view_count", 0);
                boolean z3 = false;
                if (i < 3) {
                    z3 = true;
                }
                if (z2 && z3) {
                    C59689JTv.A08(this.A0P, 2131961554, 1);
                    1Av A002 = 1Au.A00(userSession);
                    long currentTimeMillis = System.currentTimeMillis();
                    0xY AR4 = A002.A01.AR4();
                    AR4.E5c("time_last_seen_boost_story_effects_toast", currentTimeMillis);
                    AR4.apply();
                    0xY AR42 = 1Au.A00(userSession).A01.AR4();
                    AR42.E5Z("boost_story_effects_toast_view_count", i + 1);
                    AR42.apply();
                    27p.A01(userSession).A1a((C279284yO) r5.A00);
                }
            }
        }
        boolean z4 = false;
        if (cameraAREffect2 != null) {
            z4 = true;
        }
        if (cameraAREffect != null) {
            z = true;
        }
        if (z4) {
            AnonymousClass8GA r6 = this.A0n;
            if (AnonymousClass8GA.A01(r6) && AnonymousClass8GA.A03(r6) && (((r03 = r6.A02) == null || r03.A01 != 1) && 0qQ.A0K(r6.A0F.A08.A00, AnonymousClass9QA.A00))) {
                if (r6.A0I.contains(3)) {
                    r6.A09(3);
                } else {
                    C340297l2 r04 = r6.A03;
                    if (r04 == null) {
                        0qQ.A0F("cameraController");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    int A082 = r04.A08();
                    if (A082 == 3) {
                        r6.A08(A082);
                    }
                }
            }
        } else {
            AnonymousClass8GA r1 = this.A0n;
            if (r1.A00 == 3) {
                r1.A09(r1.A01);
            }
        }
        this.A18.A00().Csu(cameraAREffect, cameraAREffect2);
        this.A1m.A00();
        AnonymousClass8AL r4 = this.A13;
        AnonymousClass8AY r62 = r4.A0Q;
        if (r4.A0B && r4.A0T && r62 != null) {
            r4.A0P.A16(r4.A0N);
            r62.A02(r4.A0O);
            AnonymousClass8AL.A07(r4, false);
            r4.A0B = false;
        }
        if (cameraAREffect2 != null && cameraAREffect2.A0Z.get("nativeUIControlPicker") == null && r4.A0D(cameraAREffect2)) {
            if (r4.A0D) {
                NestableSnapPickerRecyclerView nestableSnapPickerRecyclerView = r4.A0P;
                nestableSnapPickerRecyclerView.A15(r4.A0N);
                0nA.A0q(nestableSnapPickerRecyclerView, r4.A0S);
            } else {
                AnonymousClass8AL.A07(r4, true);
            }
        }
        AnonymousClass8E8 A003 = this.A0z.A00();
        A003.A01 = z4;
        if (!(!z4 || (r0 = A003.A00) == null || (r02 = (AnonymousClass8EL) r0.A0D.get(r0.A03)) == null)) {
            r02.A05();
        }
        if (!z || z4) {
            ((C353318Hd) this.A1k.A00.A00()).CL9(true);
        } else {
            this.A1j.A05(true);
        }
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, X.4DH] */
    /* JADX WARNING: type inference failed for: r0v113, types: [X.07g] */
    /* JADX WARNING: type inference failed for: r1v69, types: [java.lang.Object, X.8GK] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C352888Fl(android.view.ViewGroup r51, X.C3500082u r52, X.AnonymousClass82W r53, X.AnonymousClass84E r54, X.AnonymousClass4D6 r55, X.C357638Yz r56, X.AnonymousClass888 r57, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r58, X.C352538Dt r59, X.AnonymousClass85X r60, X.C3499582p r61, X.AnonymousClass823 r62, com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu r63, X.AnonymousClass8E7 r64, X.AnonymousClass80D r65, X.C3496481e r66, X.AnonymousClass8FK r67, X.AnonymousClass8AL r68, X.C3503684j r69, X.AnonymousClass8DD r70, X.AnonymousClass8DB r71, X.AnonymousClass86Y r72, X.AnonymousClass88R r73, X.C3497481o r74, X.C3496881i r75, X.AnonymousClass8E5 r76, X.C3497281m r77, X.AnonymousClass8E6 r78, X.C352868Fj r79, X.AnonymousClass80U r80, X.C3510287h r81, X.AnonymousClass846 r82, X.C3495780x r83, X.AnonymousClass88F r84, X.C352828Fe r85) {
        /*
            r50 = this;
            r6 = r50
            r6.<init>()
            X.8Fq r0 = new X.8Fq
            r0.<init>(r6)
            r6.A1K = r0
            r8 = 0
            r6.A0A = r8
            X.8Fs r0 = new X.8Fs
            r0.<init>(r6)
            r6.A1J = r0
            X.8Ft r0 = new X.8Ft
            r0.<init>(r6)
            r6.A0X = r0
            X.8Fu r0 = new X.8Fu
            r0.<init>(r6)
            r6.A1b = r0
            X.8Fv r0 = new X.8Fv
            r0.<init>(r6)
            r6.A0l = r0
            X.8Fw r0 = new X.8Fw
            r0.<init>(r6)
            r6.A1i = r0
            X.8Fy r0 = new X.8Fy
            r0.<init>(r6)
            r6.A0e = r0
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r1)
            r6.A0Q = r0
            r7 = 0
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r0.<init>(r7)
            r6.A1L = r0
            r6.A02 = r8
            r6.A09 = r8
            java.lang.String r0 = "not_initialized"
            r6.A0H = r0
            r6.A0M = r7
            r12 = r63
            r6.A0y = r12
            r48 = r56
            r0 = r48
            r6.A0g = r0
            X.8G0 r1 = new X.8G0
            r1.<init>(r6)
            r0.A0E(r1)
            X.8G1 r1 = new X.8G1
            r1.<init>(r6)
            r0.A0F(r1)
            r45 = r61
            r0 = r45
            r6.A0w = r0
            r31 = r80
            r0 = r31
            r6.A1C = r0
            r0.A7w(r6)
            r4 = r65
            android.app.Activity r3 = r4.A05
            r6.A0P = r3
            X.4DH r0 = r4.A0M
            r0.getClass()
            X.4DH r0 = r4.A0M
            r42 = r0
            r6.A0V = r0
            com.instagram.common.session.UserSession r2 = r4.A0S
            r6.A0f = r2
            r5 = r51
            r6.A0T = r5
            r0 = 2131438068(0x7f0b29f4, float:1.8498052E38)
            android.view.View r0 = r5.requireViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            r6.A0U = r0
            r0 = 2131429477(0x7f0b0865, float:1.8480628E38)
            android.view.View r0 = r5.requireViewById(r0)
            r6.A0S = r0
            r43 = r77
            r0 = r43
            r6.A19 = r0
            r0 = r72
            r6.A15 = r0
            r38 = r68
            r0 = r38
            r6.A13 = r0
            r0 = 2131435229(0x7f0b1edd, float:1.8492294E38)
            android.view.View r1 = r5.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r6.A1g = r0
            r46 = r60
            r0 = r46
            r6.A0v = r0
            r0 = r59
            r6.A0u = r0
            r0 = r81
            r6.A1E = r0
            r35 = r76
            r0 = r35
            r6.A18 = r0
            r44 = r64
            r0 = r44
            r6.A0z = r0
            r49 = r53
            r0 = r49
            r6.A0Z = r0
            r0 = r54
            r6.A0c = r0
            boolean r0 = r4.A3J
            r6.A1P = r0
            boolean r0 = r4.A3F
            r17 = r0
            r6.A1O = r0
            X.7pE r0 = r4.A0f
            r6.A0j = r0
            r36 = r70
            r0 = r36
            r6.A14 = r0
            java.lang.Integer r0 = r4.A26
            r6.A0G = r0
            r0 = r71
            r6.A1k = r0
            r0 = r75
            r6.A17 = r0
            boolean r0 = X.C305756Jk.A00(r3)
            r6.A1W = r0
            r0 = r73
            r6.A1l = r0
            X.8G2 r0 = new X.8G2
            r0.<init>(r5)
            r6.A12 = r0
            r39 = r66
            r0 = r39
            r6.A10 = r0
            boolean r0 = r4.A3k
            r6.A1T = r0
            boolean r0 = r4.A3d
            r40 = r0
            r6.A1R = r0
            r37 = r69
            r0 = r37
            r6.A1j = r0
            r28 = r55
            r0 = r28
            r6.A1f = r0
            boolean r15 = r4.A35
            r6.A1M = r15
            r0 = r74
            r6.A1m = r0
            r27 = r58
            r0 = r27
            r6.A1h = r0
            r10 = r84
            r6.A1H = r10
            r0 = r85
            r6.A0E = r0
            boolean r0 = r4.A3j
            r6.A1S = r0
            X.82i r9 = r4.A18
            X.8aL r1 = r4.A0X
            if (r1 == 0) goto L_0x043b
            X.8aL r0 = X.C358088aL.A0o
            if (r1 != r0) goto L_0x043b
            r0 = 3000(0xbb8, float:4.204E-42)
        L_0x0163:
            long r9 = (long) r0
            r6.A1X = r9
            r32 = r82
            r0 = r32
            r6.A1F = r0
            r33 = r83
            r0 = r33
            r6.A1G = r0
            r0 = 2131429459(0x7f0b0853, float:1.8480591E38)
            android.view.View r1 = r5.requireViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r6.A1Z = r1
            X.8G6 r0 = new X.8G6
            r0.<init>(r6)
            X.AnonymousClass0fU.A00(r0, r1)
            boolean r0 = r4.A3E
            r6.A1N = r0
            boolean r0 = r4.A3m
            r6.A1U = r0
            boolean r0 = r4.A3R
            r6.A1p = r0
            X.4DH r0 = r4.A0M
            r0.getClass()
            X.4DH r14 = r4.A0M
            r6.A0W = r14
            r47 = r57
            r0 = r47
            r6.A0i = r0
            boolean r0 = r4.A3T
            r6.A1Q = r0
            r0 = 2131433767(0x7f0b1927, float:1.8489329E38)
            android.view.View r1 = r5.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            int r0 = (int) r9
            X.8G7 r11 = new X.8G7
            r11.<init>(r1, r2, r0)
            r6.A16 = r11
            X.8G9 r0 = new X.8G9
            r0.<init>(r6)
            r6.A0d = r0
            r0 = 2131441101(0x7f0b35cd, float:1.8504204E38)
            android.view.View r1 = r5.requireViewById(r0)
            r6.A1Y = r1
            X.81t r0 = r43.A00()
            X.81w r25 = r0.B6T()
            boolean r0 = X.AnonymousClass81x.A00(r2)
            if (r0 == 0) goto L_0x01e3
            if (r63 == 0) goto L_0x01e3
            X.8Yz r0 = r6.A0g
            X.80m r0 = r0.A08
            java.lang.Object r0 = r0.A00
            boolean r0 = r0 instanceof X.AnonymousClass80N
            if (r0 == 0) goto L_0x01e3
            X.81v r25 = r12.getCameraFlashButton()
        L_0x01e3:
            r0 = 2131429472(0x7f0b0860, float:1.8480618E38)
            android.view.View r0 = r5.requireViewById(r0)
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            r6.A1a = r0
            r0 = 2131429471(0x7f0b085f, float:1.8480616E38)
            android.view.View r0 = r5.requireViewById(r0)
            com.instagram.ui.widget.shutterbutton.ShutterButton r0 = (com.instagram.ui.widget.shutterbutton.ShutterButton) r0
            r6.A1I = r0
            r0.A08 = r9
            r0.setEnabled(r7)
            r25.getClass()
            X.82X r22 = r49.A00()
            android.content.Context r19 = X.C60960kU.A00
            X.8GA r16 = new X.8GA
            r18 = r16
            r20 = r1
            r21 = r14
            r23 = r2
            r24 = r48
            r26 = r33
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26)
            r1 = r16
            r6.A0n = r1
            X.82X r20 = r49.A00()
            X.84u r12 = r4.A1p
            r1 = 0
            if (r12 == 0) goto L_0x0246
            com.instagram.user.model.Product r12 = r12.A03()
            if (r12 == 0) goto L_0x0246
            java.lang.String r13 = r12.A0H
            com.instagram.user.model.User r1 = r12.A0B
            if (r1 == 0) goto L_0x0237
            java.lang.String r12 = X.AnonymousClass3ZA.A00(r1)
            if (r12 != 0) goto L_0x0239
        L_0x0237:
            java.lang.String r12 = ""
        L_0x0239:
            r1 = 1
            X.0qQ.A0B(r13, r1)
            X.8GK r1 = new X.8GK
            r1.<init>()
            r1.A01 = r13
            r1.A00 = r12
        L_0x0246:
            X.8GJ r12 = new X.8GJ
            r18 = r12
            r19 = r3
            r21 = r2
            r22 = r28
            r23 = r48
            r24 = r27
            r25 = r6
            r26 = r16
            r27 = r31
            r28 = r1
            r29 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            r6.A0k = r12
            r1 = r67
            r6.A11 = r1
            X.84u r1 = r4.A1p
            r34 = r1
            r6.A1n = r1
            r1 = r62
            r6.A0x = r1
            r30 = r79
            r1 = r30
            r6.A1B = r1
            r1 = r52
            r6.A1c = r1
            X.8GM r1 = new X.8GM
            r1.<init>(r6)
            r0.setLoggingListener(r1)
            X.8GO r1 = new X.8GO
            r1.<init>(r6)
            r0.setCameraInitialisedDelegate(r1)
            X.8GQ r1 = new X.8GQ
            r1.<init>(r6)
            r0.setOnSingleTapCaptureListener(r1)
            com.instagram.ui.widget.shutterbutton.ShutterButton r12 = r6.A1I
            X.8GS r1 = new X.8GS
            r1.<init>(r6)
            X.03v.A0B(r12, r1)
            if (r15 == 0) goto L_0x0437
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r0.getGlobalVisibleRect(r12)
            android.content.Context r1 = r3.getBaseContext()
            android.view.ViewConfiguration r20 = android.view.ViewConfiguration.get(r1)
            X.82X r22 = r49.A00()
            X.8GT r1 = new X.8GT
            r18 = r1
            r19 = r12
            r21 = r14
            r23 = r2
            r24 = r37
            r18.<init>(r19, r20, r21, r22, r23, r24)
            r6.A0o = r1
            r0.A0E = r1
        L_0x02c6:
            X.8GX r1 = new X.8GX
            r1.<init>(r6)
            r0.A0D = r1
            X.8GZ r1 = new X.8GZ
            r1.<init>(r6)
            r0.setOnTakingLowLightPhotoListener(r1)
            X.8Gb r12 = new X.8Gb
            r1 = r39
            r12.<init>(r6, r1)
            r0.setOnRecordVideoListener(r12)
            r13 = 1
            r0.setVideoRecordingEnabled(r13)
            r1 = 2131430676(0x7f0b0d14, float:1.848306E38)
            android.view.View r1 = r5.requireViewById(r1)
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r1 = (com.instagram.camera.mpfacade.touch.TouchEventForwardingView) r1
            r6.A0b = r1
            X.8Gd r1 = new X.8Gd
            r1.<init>(r6)
            r6.A1e = r1
            r1 = 2131429461(0x7f0b0855, float:1.8480595E38)
            android.view.View r1 = r5.requireViewById(r1)
            com.instagram.camera.mpfacade.touch.TouchEventForwardingView r1 = (com.instagram.camera.mpfacade.touch.TouchEventForwardingView) r1
            r6.A0a = r1
            X.8Gf r1 = new X.8Gf
            r1.<init>(r6)
            r6.A1d = r1
            if (r17 != 0) goto L_0x041d
            r6.A0r = r8
        L_0x030b:
            X.8Gg r15 = new X.8Gg
            r15.<init>(r3)
            X.82i r1 = r4.A18
            r41 = 0
            if (r1 == 0) goto L_0x0318
            r41 = 1
        L_0x0318:
            X.81w r1 = r6.A0r
            r19 = r1
            X.8GT r1 = r6.A0o
            r18 = r1
            X.8Gh r1 = new X.8Gh
            r1.<init>(r6)
            X.8Gi r12 = new X.8Gi
            r20 = r47
            r21 = r1
            r22 = r16
            r23 = r18
            r24 = r19
            r25 = r46
            r26 = r45
            r27 = r38
            r28 = r36
            r29 = r35
            r35 = r0
            r36 = r15
            r37 = r9
            r39 = r17
            r15 = r12
            r16 = r3
            r17 = r49
            r18 = r2
            r19 = r48
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r39, r40, r41)
            r6.A0m = r12
            X.81t r0 = r43.A00()
            X.81w r0 = r0.BDi()
            r6.A0q = r0
            X.8GF r1 = r0.CrP()
            X.8Gn r0 = new X.8Gn
            r0.<init>(r6)
            r1.A00 = r0
            r1.A00()
            X.81t r0 = r43.A00()
            X.81w r0 = r0.BlZ()
            X.8GF r1 = r0.CrP()
            X.8Go r0 = new X.8Go
            r0.<init>(r6)
            r1.A00 = r0
            r1.A00()
            X.81t r0 = r43.A00()
            X.81w r0 = r0.Acd()
            if (r0 == 0) goto L_0x0397
            X.8GF r1 = r0.CrP()
            X.8Gp r0 = new X.8Gp
            r0.<init>(r6)
            r1.A00 = r0
            r1.A00()
        L_0x0397:
            X.8E8 r9 = r44.A00()
            X.8aL r1 = X.C358088aL.A0v
            X.8Gq r0 = new X.8Gq
            r0.<init>(r6)
            r9.A02(r0, r1)
            X.8Gr r1 = new X.8Gr
            r1.<init>(r6)
            X.81t r0 = r43.A00()
            X.81w r0 = r0.C3a()
            r6.A0s = r0
            X.8GF r0 = r0.CrP()
            r0.A02 = r7
            r0.A00 = r1
            r0.A00()
            X.81t r0 = r43.A00()
            X.81w r0 = r0.C3b()
            r6.A0t = r0
            X.8E8 r0 = r44.A00()
            X.8Gs r1 = new X.8Gs
            r1.<init>(r6)
            java.util.Set r0 = r0.A09
            r0.add(r1)
            r0 = 2131429423(0x7f0b082f, float:1.8480518E38)
            android.view.View r0 = r5.requireViewById(r0)
            r6.A0R = r0
            X.2cp r0 = X.C61340me.A00()
            X.2cs r1 = r0.A02()
            X.2co r0 = A1q
            r1.A09(r0)
            r1.A06 = r13
            X.8Gt r0 = new X.8Gt
            r0.<init>(r6)
            r1.A0A(r0)
            r6.A0Y = r1
            X.81t r0 = r43.A00()
            X.81w r15 = r0.B8r()
            r15.getClass()
            r6.A0p = r15
            android.content.Context r0 = r5.getContext()
            X.0qQ.A0B(r2, r7)
            X.0xa r10 = X.C353238Gu.A00()
            X.0qQ.A0A(r10)
            java.lang.String r9 = "GalleryThumbnailMedium"
            java.lang.String r1 = ""
            java.lang.String r1 = r10.getString(r9, r1)
            goto L_0x047c
        L_0x041d:
            X.81t r1 = r43.A00()
            X.7ik r1 = r1.Bt4()
            r6.A0r = r1
            X.8GF r12 = r1.CrP()
            X.7il r1 = new X.7il
            r1.<init>(r6)
            r12.A00 = r1
            r12.A00()
            goto L_0x030b
        L_0x0437:
            r6.A0o = r8
            goto L_0x02c6
        L_0x043b:
            r13 = 60000(0xea60, float:8.4078E-41)
            if (r84 == 0) goto L_0x0453
            if (r9 == 0) goto L_0x0453
            X.A5F r0 = r9.A01
            long r0 = r0.A00
            r10 = 0
            int r9 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r9 <= 0) goto L_0x0453
            int r9 = (int) r0
            int r0 = java.lang.Math.min(r9, r13)
            goto L_0x0163
        L_0x0453:
            boolean r0 = r4.A3m
            if (r0 == 0) goto L_0x046e
            com.instagram.common.session.UserSession r10 = r6.A0f
            X.0Tu r9 = X.0Tu.A05
            r0 = 36601977584554386(0x82094e00011192, double:3.210576236581481E-306)
            long r0 = X.182.A01(r9, r10, r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            int r0 = r0.intValue()
            goto L_0x0163
        L_0x046e:
            com.instagram.creation.capture.opencarousel.configuration.OpenCarouselCaptureConfig r0 = r4.A0b
            if (r0 == 0) goto L_0x0477
            r0 = 61500(0xf03c, float:8.618E-41)
            goto L_0x0163
        L_0x0477:
            r0 = 60000(0xea60, float:8.4078E-41)
            goto L_0x0163
        L_0x047c:
            X.16F r9 = X.16P.A00(r1)     // Catch:{ IOException -> 0x04c8 }
            com.instagram.common.gallery.Medium r10 = X.C353258Gx.parseFromJson(r9)     // Catch:{ IOException -> 0x04c8 }
            if (r10 == 0) goto L_0x04d4
            java.lang.String r1 = r10.A0a
            if (r1 == 0) goto L_0x04c0
            int r9 = r1.length()
            if (r9 == 0) goto L_0x04c0
            X.9Pm r9 = new X.9Pm
            r9.<init>(r0, r2, r15)
            java.util.List r0 = X.C353238Gu.A02
            r0.add(r9)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            r1 = -1
            android.net.Uri r0 = android.net.Uri.fromFile(r0)
            X.0qQ.A07(r0)
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.C253833rU.A00(r0, r1, r1)
            X.1NK r0 = X.1NK.A00()
            X.1OO r1 = r0.A0J(r1, r8)
            r1.A0I = r7
            r1.A02(r9)
            int r0 = r10.A06
            r1.A01 = r0
            r1.A01()
            goto L_0x04d4
        L_0x04c0:
            java.lang.String r1 = "GalleryThumbnailCacheUtil"
            java.lang.String r0 = "Thumbnail path is null"
            X.0kD.A0A(r1, r0, r8)
            goto L_0x04d4
        L_0x04c8:
            r7 = move-exception
            java.lang.String r0 = "Loading gallery thumbnail failed, media: "
            java.lang.String r1 = X.002.A0R(r0, r1)
            java.lang.String r0 = "GalleryThumbnailCacheUtil"
            X.0kD.A0A(r0, r1, r7)
        L_0x04d4:
            X.0Tu r7 = X.0Tu.A05
            r0 = 36312870450890014(0x81025d0000051e, double:3.027743721111146E-306)
            boolean r0 = X.182.A06(r7, r2, r0)
            r6.A1V = r0
            r0 = r78
            r6.A1A = r0
            boolean r0 = X.11Z.A07()
            if (r0 == 0) goto L_0x055f
            r0 = r33
            X.05G r5 = r0.A0B
            X.84o r1 = new X.84o
            r1.<init>(r0, r5)
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r0 = X.C226292g8.A00(r0, r1)
            X.2gB r1 = X.AnonymousClass72Y.A00(r0)
            X.8Gy r0 = new X.8Gy
            r0.<init>(r6)
            r1.A06(r14, r0)
        L_0x0506:
            X.2YN r1 = new X.2YN
            r0 = r42
            r1.<init>(r0)
            java.lang.Class<X.8Gz> r0 = X.C353278Gz.class
            X.2YL r0 = r1.A00(r0)
            X.8Gz r0 = (X.C353278Gz) r0
            X.05G r0 = r0.A06
            X.0qC r1 = new X.0qC
            r1.<init>(r0)
            X.19B r0 = X.19B.A00
            androidx.lifecycle.CoroutineLiveData r1 = X.C226292g8.A00(r0, r1)
            X.8H0 r0 = new X.8H0
            r0.<init>(r6)
            r1.A06(r14, r0)
            X.07g r3 = (X.AnonymousClass07g) r3
            X.2YN r1 = new X.2YN
            r1.<init>(r3)
            java.lang.Class<X.8H1> r0 = X.AnonymousClass8H1.class
            X.2YL r0 = r1.A00(r0)
            X.8H1 r0 = (X.AnonymousClass8H1) r0
            r6.A0h = r0
            X.884 r0 = new X.884
            r0.<init>(r2)
            X.2YN r1 = new X.2YN
            r1.<init>(r0, r3)
            java.lang.Class<X.885> r0 = X.AnonymousClass885.class
            X.2YL r0 = r1.A00(r0)
            X.885 r0 = (X.AnonymousClass885) r0
            r6.A1D = r0
            X.8aL r1 = X.C358088aL.A0M
            X.0yf r0 = r12.A0C
            r0.put(r1, r11)
            int r1 = r4.A03
            r0 = 7
            if (r1 == r0) goto L_0x055c
            r13 = 0
        L_0x055c:
            r6.A1o = r13
            return
        L_0x055f:
            X.AjO r0 = new X.AjO
            r0.<init>(r6)
            r5.post(r0)
            goto L_0x0506
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C352888Fl.<init>(android.view.ViewGroup, X.82u, X.82W, X.84E, X.4D6, X.8Yz, X.888, com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider, X.8Dt, X.85X, X.82p, X.823, com.instagram.creation.capture.quickcapture.cameratoolmenu.CameraPreCaptureUtilityMenu, X.8E7, X.80D, X.81e, X.8FK, X.8AL, X.84j, X.8DD, X.8DB, X.86Y, X.88R, X.81o, X.81i, X.8E5, X.81m, X.8E6, X.8Fj, X.80U, X.87h, X.846, X.80x, X.88F, X.8Fe):void");
    }
}
