package X;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.instagram.android.R;
import com.instagram.ar.features.effectspage.models.EffectsPageModel;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.camera.effect.mq.IgCameraEffectsController;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.dial.CameraProductTitleView;
import com.instagram.model.shopping.ProductItemWithAR;
import com.instagram.music.common.config.MusicAttributionConfig;
import com.instagram.ui.widget.shutterbutton.ShutterButton;
import com.instagram.user.model.Product;
import instagram.features.clips.ar.features.effectspage.ui.EffectsPageFragment;
import java.util.List;
import java.util.UUID;

/* renamed from: X.86m  reason: invalid class name */
public final class AnonymousClass86m implements C3508286n {
    public int A00 = -1;
    public int A01;
    public View A02;
    public C265674Vs A03;
    public C342277oK A04;
    public ReboundViewPager A05;
    public C71662eb A06;
    public CameraProductTitleView A07;
    public AnonymousClass876 A08;
    public AnonymousClass871 A09;
    public C347487wt A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = true;
    public float A0F = 1.0f;
    public float A0G = 1.0f;
    public final int A0H;
    public final int A0I;
    public final int A0J;
    public final Activity A0K;
    public final ViewStub A0L;
    public final ViewStub A0M;
    public final AnonymousClass2gO A0N;
    public final AnonymousClass2gO A0O;
    public final UserSession A0P;
    public final TouchInterceptorFrameLayout A0Q;
    public final TargetViewSizeProvider A0R;
    public final AnonymousClass86h A0S;
    public final AnonymousClass86h A0T;
    public final C3508886t A0U;
    public final AnonymousClass86i A0V;
    public final C3507986j A0W;
    public final ShutterButton A0X;
    public final AnonymousClass0eM A0Y;
    public final AnonymousClass0eM A0Z;
    public final AnonymousClass0eM A0a;
    public final View A0b;
    public final ViewGroup A0c;
    public final C3508686r A0d = new C3508586q(this);
    public final C3508486p A0e = new C3508486p(this);

    public AnonymousClass86m(Activity activity, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass86h r10, C3507986j r11) {
        C40045APb aPb;
        0qQ.A0B(r11, 1);
        0qQ.A0B(targetViewSizeProvider, 4);
        0qQ.A0B(r10, 5);
        this.A0W = r11;
        this.A0P = userSession;
        this.A0K = activity;
        this.A0R = targetViewSizeProvider;
        this.A0S = r10;
        this.A0V = r10;
        this.A0T = r10;
        View view = r11.A00;
        TouchInterceptorFrameLayout requireViewById = view.requireViewById(R.id.dial_picker_shutter_button_container);
        0qQ.A07(requireViewById);
        this.A0Q = requireViewById;
        if (182.A06(0Tu.A05, userSession, 36317844023416429L)) {
            aPb = new C40045APb(this);
        } else {
            aPb = null;
        }
        this.A0N = aPb;
        C3508786s r2 = new C3508786s(this);
        this.A0O = r2;
        this.A0Y = AnonymousClass0eN.A01(new AnonymousClass9LC(this, 6));
        this.A0a = AnonymousClass0eN.A01(new AnonymousClass9LC(this, 8));
        this.A0Z = AnonymousClass0eN.A01(new AnonymousClass9LC(this, 7));
        Context context = view.getContext();
        this.A0M = (ViewStub) view.requireViewById(R.id.dial_ar_effect_picker_container_stub);
        this.A0L = (ViewStub) view.findViewById(R.id.dial_ar_effect_picker_background_stub);
        this.A0X = (ShutterButton) view.findViewById(R.id.camera_shutter_button);
        this.A0b = view.findViewById(R.id.camera_shutter_button_container);
        this.A0c = (ViewGroup) view.requireViewById(R.id.effect_footer_container);
        Resources resources = context.getResources();
        this.A0I = resources.getDimensionPixelSize(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        this.A0J = resources.getDimensionPixelSize(R.dimen.album_music_sticker_circular_album_art_size);
        this.A0H = resources.getDimensionPixelSize(R.dimen.ad_not_delivering_thumbnail_height);
        this.A0U = new C3508886t(view, userSession, false, true);
        if (!2CC.A00(AnonymousClass05K.A01)) {
            r10.A00(aPb, r2);
        }
    }

    public final boolean CQA(MotionEvent motionEvent) {
        if (this.A0A == null) {
            return false;
        }
        int rawX = (int) motionEvent.getRawX();
        int rawY = (int) motionEvent.getRawY();
        Rect rect = new Rect();
        C347487wt r0 = this.A0A;
        if (r0 != null) {
            r0.getGlobalVisibleRect(rect);
        }
        return !rect.contains(rawX, rawY);
    }

    public final void E4F() {
        this.A0B = true;
        A02();
        ShutterButton shutterButton = this.A0X;
        if (shutterButton != null) {
            shutterButton.setInnerCircleAlpha(0.0f);
        }
        onResume();
    }

    public final void EKb(String str, boolean z) {
        AnonymousClass876 r0 = this.A08;
        if (r0 != null) {
            EKh(r0.A00(str), true);
        }
    }

    public final void Emz(boolean z) {
        this.A0C = true;
    }

    public static final CameraAREffect A00(AnonymousClass86m r2) {
        AnonymousClass87G A022;
        AnonymousClass876 r22 = r2.A08;
        if (r22 == null || (A022 = r22.A02(r22.A00)) == null) {
            return null;
        }
        return A022.A00();
    }

    private final void A01() {
        Context context;
        View A012;
        View A013;
        View A014;
        CameraProductTitleView cameraProductTitleView;
        float f;
        ReboundViewPager reboundViewPager = this.A05;
        boolean z = false;
        if (reboundViewPager != null) {
            z = true;
        }
        int i = 4;
        C342527ok r3 = null;
        if (!z) {
            0kD.A07("PreCaptureDialViewController", "updatePickerAlpha() was called but picker was not initialized", (Throwable) null);
            return;
        }
        float min = Math.min(this.A0G, this.A0F);
        if (reboundViewPager != null) {
            reboundViewPager.setAlpha(min);
            ReboundViewPager reboundViewPager2 = this.A05;
            int i2 = 0;
            if (reboundViewPager2 != null) {
                if (min > 0.0f) {
                    i = 0;
                }
                reboundViewPager2.setVisibility(i);
            }
            C3494680m r7 = this.A0S.A02.A08;
            if (r7.A00 == AnonymousClass80L.A00) {
                FLb(min);
            }
            ShutterButton shutterButton = this.A0X;
            if (shutterButton != null) {
                AnonymousClass876 r0 = this.A08;
                if (r0 == null || r0.getCount() == 0) {
                    f = 1.0f;
                } else {
                    f = 1.0f - min;
                }
                shutterButton.setInnerCircleAlpha(f);
            }
            if (!this.A0W.A03 || (cameraProductTitleView = this.A07) == null) {
                C347487wt r2 = this.A0A;
                if (!(r2 == null || r7.A00 == C363138jC.A00)) {
                    if (!this.A0B) {
                        min = 0.0f;
                    }
                    r2.setGroupAlpha(min);
                }
            } else {
                int i3 = 0;
                if (min == 0.0f) {
                    i3 = 8;
                }
                cameraProductTitleView.setVisibility(i3);
                CameraProductTitleView cameraProductTitleView2 = this.A07;
                if (cameraProductTitleView2 != null) {
                    cameraProductTitleView2.setAlpha(min);
                }
            }
            C71662eb r1 = this.A06;
            if (r1 == null) {
                throw new IllegalStateException("Required value was null.");
            } else if (r1.A04()) {
                if (this.A0G == 0.0f) {
                    i2 = 8;
                }
                r1.A03(i2);
                C71662eb r02 = this.A06;
                if (!(r02 == null || (A014 = r02.A01()) == null)) {
                    A014.setAlpha(this.A0G);
                }
                C71662eb r03 = this.A06;
                if (r03 == null || (A013 = r03.A01()) == null) {
                    context = null;
                } else {
                    context = A013.getContext();
                }
                C71662eb r04 = this.A06;
                if (r04 != null && (A012 = r04.A01()) != null) {
                    if (context != null) {
                        r3 = new C342527ok(context, 0nA.A06(context));
                    }
                    A012.setBackground(r3);
                }
            }
        } else {
            throw new IllegalStateException("Required value was null.");
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ef, code lost:
        if (r5 == false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00f3, code lost:
        if (r13.A0A != null) goto L_0x00f5;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void A02() {
        /*
            r13 = this;
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r0 = r13.A05
            if (r0 != 0) goto L_0x0126
            android.view.ViewStub r6 = r13.A0M
            android.content.Context r3 = r6.getContext()
            android.content.res.Resources r8 = r3.getResources()
            int r5 = X.AnonymousClass879.A00(r3)
            com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider r0 = r13.A0R
            com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl r0 = (com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl) r0
            X.81W r0 = r0.A0K
            int r0 = r0.getWidth()
            float r9 = (float) r5
            float r10 = (float) r0
            int r1 = r13.A0J
            float r11 = (float) r1
            int r0 = r13.A0I
            float r12 = (float) r0
            r0 = 1073741824(0x40000000, float:2.0)
            float r7 = r10 / r0
            r0 = 2131165203(0x7f070013, float:1.7944616E38)
            int r0 = r8.getDimensionPixelSize(r0)
            float r4 = (float) r0
            r0 = 2131165214(0x7f07001e, float:1.7944639E38)
            int r0 = r8.getDimensionPixelSize(r0)
            float r2 = (float) r0
            r0 = 2131165193(0x7f070009, float:1.7944596E38)
            int r0 = r8.getDimensionPixelSize(r0)
            float r0 = (float) r0
            X.7oJ[] r8 = X.C342257oI.A00(r9, r7, r4, r2, r0)
            X.7oK r7 = new X.7oK
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A04 = r7
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = r13.A05
            if (r4 != 0) goto L_0x0060
            android.view.View r4 = r6.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager"
            X.0qQ.A0C(r4, r0)
            com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager r4 = (com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager) r4
            r13.A05 = r4
            X.86t r0 = r13.A0U
            r0.A00 = r4
        L_0x0060:
            X.86j r7 = r13.A0W
            boolean r9 = r7.A02
            java.lang.String r8 = "Required value was null."
            if (r9 != 0) goto L_0x0076
            android.view.View r0 = r13.A02
            if (r0 != 0) goto L_0x0076
            android.view.ViewStub r0 = r13.A0L
            if (r0 == 0) goto L_0x0144
            android.view.View r0 = r0.inflate()
            r13.A02 = r0
        L_0x0076:
            X.0nA.A0V(r4, r1)
            android.view.View r1 = r13.A02
            if (r1 == 0) goto L_0x0082
            int r0 = r13.A0H
            X.0nA.A0V(r1, r0)
        L_0x0082:
            r2 = 0
            r4.setVisibility(r2)
            r4.A0C = r5
            r5 = 0
            r0 = 4
            r4.A0M(r0, r2)
            r0 = 0
            r4.setPageSpacing(r0)
            r13.FK5()
            X.7oK r0 = r13.A04
            r4.setItemPositioner(r0)
            X.7oL r0 = new X.7oL
            r0.<init>(r4)
            r4.setAccessibilityDelegateCompat(r0)
            X.7oN r0 = new X.7oN
            r0.<init>(r13)
            r4.A0K = r0
            android.view.View r6 = r7.A00
            r0 = 2131433121(0x7f0b16a1, float:1.8488019E38)
            android.view.View r1 = r6.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00b8
            r5 = r1
            android.view.ViewStub r5 = (android.view.ViewStub) r5
        L_0x00b8:
            X.2eb r0 = new X.2eb
            r0.<init>(r5)
            r13.A06 = r0
            boolean r5 = r7.A03
            if (r5 == 0) goto L_0x0127
            r0 = 2131431510(0x7f0b1056, float:1.8484751E38)
            android.view.View r0 = r6.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            if (r0 == 0) goto L_0x00f5
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.dial.CameraProductTitleView"
            X.0qQ.A0C(r1, r0)
            com.instagram.creation.capture.quickcapture.dial.CameraProductTitleView r1 = (com.instagram.creation.capture.quickcapture.dial.CameraProductTitleView) r1
            r13.A07 = r1
            boolean r0 = r7.A01
            r1.A01 = r0
            X.AMC r0 = new X.AMC
            r0.<init>(r13)
            X.AnonymousClass0fU.A00(r0, r1)
            X.An9 r0 = new X.An9
            r0.<init>(r1, r13)
        L_0x00ec:
            X.0nA.A0p(r6, r0)
            if (r5 != 0) goto L_0x00f5
        L_0x00f1:
            X.7wt r0 = r13.A0A
            if (r0 == 0) goto L_0x0107
        L_0x00f5:
            X.2eb r1 = r13.A06
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.ui.widget.viewstubholder.ViewStubHolder<*>"
            X.0qQ.A0C(r1, r0)
            android.view.ViewStub r0 = r1.A01
            if (r0 == 0) goto L_0x0107
            X.2eb r0 = r13.A06
            if (r0 == 0) goto L_0x0107
            r0.A03(r2)
        L_0x0107:
            X.86t r1 = r13.A0U
            java.lang.String r0 = "camera_dial"
            r1.A00(r0)
            X.7oS r2 = new X.7oS
            r2.<init>(r13)
            com.instagram.ui.widget.shutterbutton.ShutterButton r1 = r13.A0X
            X.7oU r0 = new X.7oU
            r0.<init>(r3, r1, r4, r2)
            com.instagram.common.ui.widget.touchinterceptorlayout.TouchInterceptorFrameLayout r2 = r13.A0Q
            X.7oV r1 = r0.A02
            X.7oW r0 = r0.A01
            r2.A00(r1, r0)
            r13.A03()
        L_0x0126:
            return
        L_0x0127:
            if (r9 != 0) goto L_0x00f1
            A05(r13)
            X.7wt r1 = r13.A0A
            if (r1 == 0) goto L_0x013e
            X.7oQ r0 = new X.7oQ
            r0.<init>(r13)
            X.AnonymousClass0fU.A00(r0, r1)
            X.7oR r0 = new X.7oR
            r0.<init>(r13)
            goto L_0x00ec
        L_0x013e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        L_0x0144:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86m.A02():void");
    }

    private final void A03() {
        AnonymousClass876 r2 = this.A08;
        if (r2 != null) {
            C342277oK r1 = this.A04;
            r2.A02 = r1;
            if (r1 != null) {
                r1.A00 = r2.A04;
            }
            r2.A03 = this.A0d;
            Integer valueOf = Integer.valueOf(r2.A00);
            if (valueOf != null) {
                int intValue = valueOf.intValue();
                r2.A07(intValue);
                ReboundViewPager reboundViewPager = this.A05;
                if (reboundViewPager != null) {
                    reboundViewPager.A0K(intValue);
                    ReboundViewPager reboundViewPager2 = this.A05;
                    if (reboundViewPager2 != null) {
                        AnonymousClass876 r12 = this.A08;
                        if (r12 != null) {
                            reboundViewPager2.A0N(r12, (float) intValue);
                            return;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
        }
    }

    public static final void A04(AnonymousClass87G r6, AnonymousClass86m r7) {
        Context context;
        String A012;
        SpannableStringBuilder spannableStringBuilder;
        AnonymousClass0eM r4 = r7.A0Y;
        View view = (View) r4.getValue();
        if (view != null) {
            context = view.getContext();
        } else {
            context = null;
        }
        View view2 = (View) r4.getValue();
        int i = 0;
        if (view2 != null) {
            view2.setVisibility(0);
        }
        TextView textView = (TextView) r7.A0a.getValue();
        if (textView != null) {
            AnonymousClass87I r1 = r6.A04;
            if (r1 == null) {
                r1 = AnonymousClass87I.EMPTY;
            }
            if (r1 != AnonymousClass87I.QUICK_SNAP_AUDIENCE_LIST || r6.A0O) {
                spannableStringBuilder = new SpannableStringBuilder(r6.A0G);
            } else {
                String str = r6.A0G;
                0qQ.A07(str);
                spannableStringBuilder = I7E.A04(context, str);
            }
            textView.setText(spannableStringBuilder);
        }
        SpannableStringBuilder spannableStringBuilder2 = null;
        if (!(context == null || (A012 = r6.A01(context)) == null)) {
            spannableStringBuilder2 = I7E.A04(context, A012);
        }
        AnonymousClass0eM r12 = r7.A0Z;
        TextView textView2 = (TextView) r12.getValue();
        if (textView2 != null) {
            textView2.setText(spannableStringBuilder2);
        }
        View view3 = (View) r12.getValue();
        if (view3 != null) {
            if (spannableStringBuilder2 == null) {
                i = 8;
            }
            view3.setVisibility(i);
        }
        View view4 = (View) r4.getValue();
        if (view4 != null) {
            AnonymousClass0fU.A00(new ANM(r6, r7), view4);
        }
    }

    public static final void A05(AnonymousClass86m r4) {
        if (r4.A0A == null) {
            C342327oP r3 = new C342327oP(r4);
            Context context = r4.A0W.A00.getContext();
            0qQ.A07(context);
            r4.A0A = new C347487wt(context, r3, r4.A0R.CTv());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            ViewGroup viewGroup = r4.A0c;
            if (viewGroup != null) {
                viewGroup.addView(r4.A0A, layoutParams);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public static final void A06(AnonymousClass86m r38) {
        AnonymousClass86m r1 = r38;
        CameraAREffect A002 = A00(r1);
        if (A002 != null && A002.A0D()) {
            AnonymousClass86h r3 = (AnonymousClass86h) r1.A0V;
            AnonymousClass80D r0 = r3.A03;
            UserSession userSession = r0.A0S;
            0qQ.A07(userSession);
            Activity activity = r0.A05;
            0qQ.A07(activity);
            28D r2 = (28D) r3.A08.invoke();
            C279294yP A003 = C359198cG.A00((C279284yO) r3.A02.A08.A00);
            String moduleName = r3.A04.getModuleName();
            IgCameraEffectsController igCameraEffectsController = r3.A01.A00().A05;
            C361848gv r02 = igCameraEffectsController.A07;
            EffectAttribution effectAttribution = null;
            if (r02 == null) {
                0kD.A01("IgCameraEffectsController", "MQRenderer is null");
            } else if (r02.A0D() != null) {
                effectAttribution = igCameraEffectsController.A07.A0D().mAttribution;
            }
            0qQ.A0B(r2, 3);
            0qQ.A0B(A003, 4);
            String obj = UUID.randomUUID().toString();
            0qQ.A07(obj);
            String str = A002.A0B;
            if (str != null) {
                String str2 = A002.A0C;
                if (str2 != null) {
                    ImageUrl imageUrl = A002.A07;
                    String str3 = A002.A0K;
                    String str4 = A002.A0M;
                    0qQ.A07(str4);
                    String str5 = A002.A0S;
                    0qQ.A07(str5);
                    String str6 = str;
                    String str7 = str2;
                    EffectsPageModel effectsPageModel = new EffectsPageModel(effectAttribution, imageUrl, (Integer) null, (Integer) null, (Integer) null, (Integer) null, str6, str7, str3, (String) null, str4, str5, "", (String) null, false, false, A002.CbC(), true, true, true, true, false);
                    C391589tK r29 = C391589tK.EFFECT_FOOTER;
                    HUG.A00(activity, EffectsPageFragment.A00(r29, (AnonymousClass8ZN) null, effectsPageModel, (MusicAttributionConfig) null, (String) null, obj, (String) null, (String) null, (String) null), A003, r29, r2, C59725JVj.PRE_CAPTURE, userSession, AnonymousClass05K.A01, moduleName);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final boolean AFa() {
        AnonymousClass3TF r1;
        if (!this.A0B) {
            return false;
        }
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            r1 = reboundViewPager.A0O;
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass3TF.IDLE) {
            return true;
        }
        return false;
    }

    public final void AIy(AnonymousClass876 r3, AnonymousClass871 r4) {
        this.A09 = r4;
        C3508886t r1 = this.A0U;
        r1.A02 = r4;
        if (!0qQ.A0K(this.A08, r3)) {
            this.A08 = r3;
            r1.A01 = r3;
            FK5();
            if (this.A05 != null) {
                A03();
            }
        }
    }

    public final int B6L() {
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            return reboundViewPager.A09;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int BLQ() {
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            return reboundViewPager.A0A;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int BcK() {
        return this.A0J;
    }

    public final C252203oj BoF() {
        return this.A0e;
    }

    public final void CHo() {
        C357488Yc A012 = C357488Yc.A03.A01(this.A0P);
        if (A012 != null && A012.A00().A0I()) {
            this.A0V.DBU();
        }
        FK5();
    }

    public final boolean CZ5() {
        if (this.A05 != null) {
            return true;
        }
        return false;
    }

    public final boolean Ccf() {
        return this.A0C;
    }

    public final void Dke() {
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            reboundViewPager.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final void E1E() {
        UserSession userSession = this.A0P;
        C359098c0.A01(C391569tI.TAP_NEW_GROUP_ICON, C359088bz.A00(userSession), (String) null);
        C63398KwJ.A00(this.A0K, AnonymousClass87I.QUICK_SNAP_AUDIENCE_SELECTOR_ENTRYPOINT, userSession, (String) null, (String) null, (String) null);
    }

    public final void EBE() {
        AnonymousClass87G A012;
        AnonymousClass876 r0 = this.A08;
        if (r0 != null && (A012 = r0.A01()) != null && A012.A04()) {
            A04(A012, this);
        }
    }

    public final void EI0() {
        AnonymousClass876 r5 = this.A08;
        if (r5 != null) {
            List list = r5.A08;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((AnonymousClass87G) list.get(i)).A04 == AnonymousClass87I.EMPTY) {
                    r5.A03(i);
                    return;
                }
            }
        }
    }

    public final void EKh(int i, boolean z) {
        AnonymousClass876 r0;
        if (this.A05 != null && (r0 = this.A08) != null) {
            if (r0.A07(i)) {
                ReboundViewPager reboundViewPager = this.A05;
                if (z) {
                    if (reboundViewPager != null) {
                        reboundViewPager.A0L(i, 0.0f);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                } else if (reboundViewPager != null) {
                    reboundViewPager.A0K(i);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                0kD.A07("PreCaptureDialViewController", "Invalid Scroll position passed", (Throwable) null);
            }
        }
    }

    public final void EL8(String str) {
        AnonymousClass876 r0 = this.A08;
        if (r0 != null) {
            ELA((String) null, r0.A00(str), false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r0.EtO(r1) != true) goto L_0x001d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0022, code lost:
        if (r1 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0028, code lost:
        if (r1.A00() == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002a, code lost:
        if (r2 == null) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x002c, code lost:
        r10 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x002f, code lost:
        if (r2.A0d == false) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0031, code lost:
        r10 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0032, code lost:
        if (r2 != null) goto L_0x0052;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0034, code lost:
        r1 = r11.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0036, code lost:
        if (r1 == null) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0038, code lost:
        r1.setCurrentTitle(X.C342507oi.A07);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003d, code lost:
        r1 = r11.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x003f, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0041, code lost:
        r8 = r1.A01;
        r4 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0044, code lost:
        if (r8 != true) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0046, code lost:
        if (r12 == null) goto L_0x004e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x004c, code lost:
        if (r12.length() != 0) goto L_0x0073;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x004e, code lost:
        r1.A0F();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0054, code lost:
        if (r11.A0B != false) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0056, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x006e, code lost:
        if (r2.CbC() != true) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0073, code lost:
        if (r2 == null) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0075, code lost:
        r9 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x007e, code lost:
        if (((X.AnonymousClass86h) r11.A0V).A03.A3k == false) goto L_0x0081;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0080, code lost:
        r9 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0081, code lost:
        r1.setCurrentTitle(new X.C342507oi(r4, r5, r6, r7, r8, r9, r10));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ETd(java.lang.String r12) {
        /*
            r11 = this;
            X.7wt r0 = r11.A0A
            if (r0 == 0) goto L_0x0051
            X.876 r1 = r11.A08
            r5 = 0
            if (r1 == 0) goto L_0x0071
            int r0 = r1.A00
            X.87G r1 = r1.A02(r0)
        L_0x000f:
            r3 = 1
            if (r1 == 0) goto L_0x001d
            X.871 r0 = r11.A09
            if (r0 == 0) goto L_0x001d
            boolean r0 = r0.EtO(r1)
            r6 = 1
            if (r0 == r3) goto L_0x0057
        L_0x001d:
            r6 = 0
            if (r1 != 0) goto L_0x0057
            r2 = r5
        L_0x0021:
            r7 = 0
            if (r1 == 0) goto L_0x0031
        L_0x0024:
            com.instagram.camera.effect.models.CameraAREffect r0 = r1.A00()
            if (r0 == 0) goto L_0x0031
            if (r2 == 0) goto L_0x0031
            boolean r0 = r2.A0d
            r10 = 1
            if (r0 == 0) goto L_0x0052
        L_0x0031:
            r10 = 0
            if (r2 != 0) goto L_0x0052
            X.7wt r1 = r11.A0A
            if (r1 == 0) goto L_0x003d
            X.7oi r0 = X.C342507oi.A07
            r1.setCurrentTitle(r0)
        L_0x003d:
            X.7wt r1 = r11.A0A
            if (r1 == 0) goto L_0x0051
            boolean r8 = r1.A01
            r4 = r12
            if (r8 != r3) goto L_0x0073
            if (r12 == 0) goto L_0x004e
            int r0 = r12.length()
            if (r0 != 0) goto L_0x0073
        L_0x004e:
            r1.A0F()
        L_0x0051:
            return
        L_0x0052:
            boolean r0 = r11.A0B
            if (r0 != 0) goto L_0x003d
            return
        L_0x0057:
            com.instagram.camera.effect.models.CameraAREffect r2 = r1.A00()
            X.86j r0 = r11.A0W
            android.view.View r0 = r0.A00
            android.content.Context r0 = r0.getContext()
            java.lang.String r5 = r1.A01(r0)
            if (r2 == 0) goto L_0x0021
            boolean r0 = r2.CbC()
            r7 = 1
            if (r0 == r3) goto L_0x0024
            goto L_0x0021
        L_0x0071:
            r1 = r5
            goto L_0x000f
        L_0x0073:
            if (r2 == 0) goto L_0x0080
            X.86i r0 = r11.A0V
            X.86h r0 = (X.AnonymousClass86h) r0
            X.80D r0 = r0.A03
            boolean r0 = r0.A3k
            r9 = 1
            if (r0 == 0) goto L_0x0081
        L_0x0080:
            r9 = 0
        L_0x0081:
            X.7oi r3 = new X.7oi
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            r1.setCurrentTitle(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass86m.ETd(java.lang.String):void");
    }

    public final void EUq(float f) {
        ViewGroup viewGroup = this.A0c;
        if (viewGroup != null) {
            viewGroup.setAlpha(f);
        }
    }

    public final void EUr(boolean z) {
        C347487wt r1;
        C347487wt r0;
        C347487wt r4 = this.A0A;
        if (r4 == null) {
            this.A0D = z;
            return;
        }
        boolean z2 = true;
        if (z) {
            r4.A0E();
            C347487wt r02 = this.A0A;
            if (r02 != null) {
                r02.setHorizontalMargin(0);
            }
            CameraAREffect A002 = A00(this);
            C347487wt r12 = this.A0A;
            if (r12 != null) {
                if (A002 == null || !A002.CbC()) {
                    z2 = false;
                }
                r12.setBookmarkIconExpanded(z2);
            }
            if (A002 == null && (r0 = this.A0A) != null) {
                r0.A0F();
                return;
            }
            return;
        }
        r4.A06.setTextSize(12.0f);
        r4.A05.setTextSize(12.0f);
        r4.setBackground(r4.A04);
        r4.A01 = false;
        C347487wt.A00(r4);
        C347487wt r13 = this.A0A;
        if (r13 != null) {
            r13.setHorizontalMargin(this.A01);
        }
        CameraAREffect A003 = A00(this);
        C347487wt r14 = this.A0A;
        if (r14 != null) {
            if (A003 == null || !A003.CbC()) {
                z2 = false;
            }
            r14.setBookmarkIcon(z2);
        }
        if (A003 == null && (r1 = this.A0A) != null) {
            r1.setCurrentTitle(C342507oi.A07);
        }
    }

    public final void EUs(int i) {
        ViewGroup viewGroup = this.A0c;
        if (viewGroup != null) {
            viewGroup.setTranslationY(-((float) i));
        }
    }

    public final void EXs(boolean z) {
        this.A0U.A05 = z;
    }

    public final void Egp(Product product) {
        CameraProductTitleView cameraProductTitleView = this.A07;
        if (cameraProductTitleView != null) {
            cameraProductTitleView.setProduct(product);
        }
    }

    public final void Egv(boolean z) {
        CameraProductTitleView cameraProductTitleView = this.A07;
        if (cameraProductTitleView != null) {
            int i = 8;
            if (z) {
                i = 0;
            }
            cameraProductTitleView.setVisibility(i);
        }
    }

    public final void FK5() {
        ReboundViewPager reboundViewPager;
        AnonymousClass3TG r0;
        C357488Yc A012;
        AnonymousClass876 r2 = this.A08;
        if (r2 != null && this.A05 != null) {
            if (r2.getCount() <= 1 || !this.A0E || ((A012 = C357488Yc.A03.A01(this.A0P)) != null && A012.A00().A0I())) {
                reboundViewPager = this.A05;
                if (reboundViewPager != null) {
                    r0 = AnonymousClass3TG.DISABLED;
                } else {
                    return;
                }
            } else {
                reboundViewPager = this.A05;
                if (reboundViewPager != null) {
                    r0 = AnonymousClass3TG.WHEEL_OF_FORTUNE;
                } else {
                    return;
                }
            }
            reboundViewPager.setScrollMode(r0);
        }
    }

    public final void FKP(float f) {
        this.A0F = 1.0f;
        if (this.A05 != null) {
            A01();
        }
    }

    public final void FL7(float f) {
        this.A0G = f;
        A01();
    }

    public final void FLb(float f) {
        View view = this.A0b;
        if (view != null) {
            view.setAlpha(f);
            int i = 4;
            if (f > 0.0f) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public final View getView() {
        return this.A05;
    }

    public final void hide() {
        if (this.A05 != null) {
            E4E();
        }
    }

    public final boolean isVisible() {
        return this.A0B;
    }

    public final void onPause() {
        if (this.A0B) {
            ReboundViewPager reboundViewPager = this.A05;
            if (reboundViewPager != null) {
                reboundViewPager.A0Q(this.A0U);
            }
            ReboundViewPager reboundViewPager2 = this.A05;
            if (!(reboundViewPager2 == null || reboundViewPager2.A0O == AnonymousClass3TF.IDLE)) {
                int rint = (int) ((float) Math.rint((double) reboundViewPager2.A01));
                AnonymousClass876 r0 = this.A08;
                if (r0 != null) {
                    rint = Math.min(r0.getCount() - 1, rint);
                }
                int max = Math.max(0, rint);
                this.A00 = max;
                ReboundViewPager reboundViewPager3 = this.A05;
                if (reboundViewPager3 != null) {
                    reboundViewPager3.A0K(max);
                }
            }
            C229402nK r02 = this.A0U.A03;
            if (r02 != null) {
                r02.onPause();
            }
        }
    }

    public final void onResume() {
        int i;
        AnonymousClass876 r0;
        if (this.A0B) {
            ReboundViewPager reboundViewPager = this.A05;
            if (reboundViewPager != null) {
                reboundViewPager.A0P(this.A0U);
            }
            if (this.A05 != null && (i = this.A00) >= 0 && (r0 = this.A08) != null) {
                r0.A05((String) null, i, false, false, false);
                this.A00 = -1;
            }
        }
    }

    public final void E4E() {
        onPause();
        this.A0B = false;
        ShutterButton shutterButton = this.A0X;
        if (shutterButton != null) {
            Application application = this.A0S.A03.A05.getApplication();
            0qQ.A07(application);
            if (AnonymousClass8FD.A00(application)) {
                shutterButton.setInnerCircleAlpha(1.0f);
            }
        }
        FL7(0.0f);
        if (this.A0W.A03) {
            CameraProductTitleView cameraProductTitleView = this.A07;
            if (cameraProductTitleView != null) {
                cameraProductTitleView.setVisibility(8);
            }
        } else {
            ETd((String) null);
        }
        View view = (View) this.A0Y.getValue();
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public final void EBD() {
        CameraAREffect A002 = A00(this);
        if (A002 != null) {
            ETd(A002.A0S);
        }
    }

    public final void ELA(String str, int i, boolean z) {
        A02();
        ReboundViewPager reboundViewPager = this.A05;
        if (reboundViewPager != null) {
            int i2 = i;
            reboundViewPager.A0K(i);
            AnonymousClass876 r0 = this.A08;
            if (r0 != null) {
                r0.A05(str, i2, false, z, false);
            }
            this.A00 = -1;
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void FLO() {
        FK5();
    }

    public final void show() {
        AnonymousClass87G A012;
        E4F();
        FL7(1.0f);
        AnonymousClass876 r0 = this.A08;
        if (r0 != null && (A012 = r0.A01()) != null) {
            if (A012.A04()) {
                A04(A012, this);
            } else if (this.A0W.A03) {
                ProductItemWithAR productItemWithAR = A012.A06;
                if (productItemWithAR != null) {
                    Egp(C14502TxO.A00(productItemWithAR.A01));
                }
            } else {
                ETd(A012.A0G);
            }
        }
    }

    public final void DGF(C265674Vs r1) {
        this.A03 = r1;
    }
}
