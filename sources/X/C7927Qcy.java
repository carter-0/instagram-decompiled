package X;

import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Handler;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.smartcapture.ui.ResourcesProgressBar;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.facebook.smartcapture.ui.view.FaceCaptureProgressView;
import com.facebook.smartcapture.view.HelpButton;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Qcy  reason: case insensitive filesystem */
public final class C7927Qcy extends C7918Qcp implements AnonymousClass0iw {
    public static final Interpolator A0S = new AccelerateInterpolator();
    public static final String __redex_internal_original_name = "IgSelfieCaptureOverlayFragment";
    public View A00;
    public FrameLayout A01;
    public ImageView A02;
    public LinearLayout A03;
    public TextView A04;
    public TextView A05;
    public RFH A06;
    public ResourcesProgressBar A07;
    public ArrowHintView A08;
    public FaceCaptureProgressView A09;
    public HelpButton A0A;
    public UserSession A0B;
    public Integer A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public boolean A0H;
    public boolean A0I;
    public View A0J;
    public 0lg A0K;
    public boolean A0L;
    public final RectF A0M = AnonymousClass7TE.A0Y();
    public final Handler A0N = AnonymousClass7TF.A0D();
    public final C10420Rrw A0O = new C10420Rrw(this);
    public final C12282Sqf A0P = new C12282Sqf(new C10241Rp1(this));
    public final float[] A0Q = new float[4];
    public final float[] A0R = new float[4];

    public static final void A02(RFH rfh, C7927Qcy qcy, Integer num) {
        TextView textView;
        int i;
        TextView textView2;
        int i2;
        qcy.A0I = false;
        String str = "selfieFaceWarning";
        if (num != AnonymousClass05K.A0Y) {
            if (num != null) {
                int intValue = num.intValue();
                if (intValue == 2) {
                    TextView textView3 = qcy.A05;
                    if (textView3 != null) {
                        textView3.setText(R.string.f0nameremoved);
                        textView2 = qcy.A04;
                        if (textView2 != null) {
                            i2 = R.string.f0nameremoved;
                        }
                        0qQ.A0F("subtitleView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("titleView");
                    throw AnonymousClass00P.createAndThrow();
                } else if (intValue == 3) {
                    TextView textView4 = qcy.A05;
                    if (textView4 != null) {
                        textView4.setText(R.string.f0nameremoved);
                        textView2 = qcy.A04;
                        if (textView2 != null) {
                            i2 = R.string.f0nameremoved;
                        }
                        0qQ.A0F("subtitleView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    0qQ.A0F("titleView");
                    throw AnonymousClass00P.createAndThrow();
                }
                textView2.setText(i2);
                ImageView imageView = qcy.A02;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    FaceCaptureProgressView faceCaptureProgressView = qcy.A09;
                    if (faceCaptureProgressView != null) {
                        faceCaptureProgressView.A02 = true;
                        faceCaptureProgressView.invalidate();
                        ImageView imageView2 = qcy.A02;
                        if (imageView2 != null) {
                            imageView2.post(new C12901TCp(qcy));
                            qcy.A0L = false;
                            return;
                        }
                    }
                    0qQ.A0F("captureProgressView");
                    throw AnonymousClass00P.createAndThrow();
                }
            }
            TextView textView5 = qcy.A05;
            if (textView5 != null) {
                textView5.setText(R.string.f0nameremoved);
                TextView textView6 = qcy.A04;
                if (textView6 != null) {
                    textView6.setText(R.string.f0nameremoved);
                    FaceCaptureProgressView faceCaptureProgressView2 = qcy.A09;
                    if (faceCaptureProgressView2 != null) {
                        faceCaptureProgressView2.A02 = false;
                        faceCaptureProgressView2.invalidate();
                        ImageView imageView3 = qcy.A02;
                        if (imageView3 != null) {
                            imageView3.setVisibility(8);
                            qcy.A0L = false;
                            return;
                        }
                    }
                    0qQ.A0F("captureProgressView");
                    throw AnonymousClass00P.createAndThrow();
                }
                0qQ.A0F("subtitleView");
                throw AnonymousClass00P.createAndThrow();
            }
            0qQ.A0F("titleView");
            throw AnonymousClass00P.createAndThrow();
        }
        FaceCaptureProgressView faceCaptureProgressView3 = qcy.A09;
        if (faceCaptureProgressView3 != null) {
            faceCaptureProgressView3.A02 = false;
            faceCaptureProgressView3.invalidate();
            TextView textView7 = qcy.A04;
            if (textView7 != null) {
                textView7.setText(R.string.f0nameremoved);
                ImageView imageView4 = qcy.A02;
                if (imageView4 != null) {
                    imageView4.setVisibility(8);
                    if (!qcy.A0L) {
                        qcy.A0L = true;
                        TextView textView8 = qcy.A05;
                        if (textView8 != null) {
                            textView8.setText(R.string.f0nameremoved);
                            qcy.A0I = true;
                            TextView textView9 = qcy.A05;
                            if (textView9 != null) {
                                textView9.postDelayed(new C13031TIn(rfh, qcy, num), 1000);
                            }
                        }
                        0qQ.A0F("titleView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    if (rfh == null) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                        0qQ.A0F("titleView");
                        throw AnonymousClass00P.createAndThrow();
                    }
                    int ordinal = rfh.ordinal();
                    if (ordinal == 0) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                        0qQ.A0F("titleView");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (ordinal == 1) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                        0qQ.A0F("titleView");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (ordinal == 2) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                        0qQ.A0F("titleView");
                        throw AnonymousClass00P.createAndThrow();
                    } else if (ordinal == 3) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                        0qQ.A0F("titleView");
                        throw AnonymousClass00P.createAndThrow();
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                    textView.setText(i);
                    LinearLayout linearLayout = qcy.A03;
                    if (linearLayout == null) {
                        str = "messageContainer";
                    } else {
                        TransitionManager.beginDelayedTransition(linearLayout);
                        return;
                    }
                }
            }
            0qQ.A0F("subtitleView");
            throw AnonymousClass00P.createAndThrow();
        }
        0qQ.A0F("captureProgressView");
        throw AnonymousClass00P.createAndThrow();
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "selfie_capture";
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00db, code lost:
        if (((com.facebook.smartcapture.view.BaseSelfieCaptureActivity) r1).A05 != null) goto L_0x00dd;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r7, android.os.Bundle r8) {
        /*
            r6 = this;
            r4 = 0
            X.0qQ.A0B(r7, r4)
            r6.A00 = r7
            r0 = 2131437521(0x7f0b27d1, float:1.8496943E38)
            android.view.View r0 = X.SKW.A00(r7, r0)
            com.facebook.smartcapture.ui.ResourcesProgressBar r0 = (com.facebook.smartcapture.ui.ResourcesProgressBar) r0
            r6.A07 = r0
            r0 = 2131441100(0x7f0b35cc, float:1.8504202E38)
            android.widget.ImageView r0 = X.SKW.A01(r7, r0)
            r6.A02 = r0
            r0 = 2131432568(0x7f0b1478, float:1.8486897E38)
            android.view.View r0 = X.SKW.A00(r7, r0)
            com.facebook.smartcapture.ui.view.FaceCaptureProgressView r0 = (com.facebook.smartcapture.ui.view.FaceCaptureProgressView) r0
            r6.A09 = r0
            r0 = 2131428146(0x7f0b0332, float:1.8477928E38)
            android.view.View r0 = X.SKW.A00(r7, r0)
            com.facebook.smartcapture.ui.view.ArrowHintView r0 = (com.facebook.smartcapture.ui.view.ArrowHintView) r0
            r6.A08 = r0
            r0 = 2131435618(0x7f0b2062, float:1.8493083E38)
            android.view.View r0 = X.SKW.A00(r7, r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r6.A03 = r0
            r0 = 2131443303(0x7f0b3e67, float:1.850867E38)
            android.widget.TextView r0 = X.SKW.A02(r7, r0)
            r6.A05 = r0
            r0 = 2131443297(0x7f0b3e61, float:1.8508658E38)
            android.widget.TextView r0 = X.SKW.A02(r7, r0)
            r6.A04 = r0
            r0 = 2131433879(0x7f0b1997, float:1.8489556E38)
            android.view.View r0 = X.SKW.A00(r7, r0)
            com.facebook.smartcapture.view.HelpButton r0 = (com.facebook.smartcapture.view.HelpButton) r0
            r6.A0A = r0
            r0 = 2131432934(0x7f0b15e6, float:1.848764E38)
            android.view.View r0 = X.SKW.A00(r7, r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.A01 = r0
            r0 = 2131443277(0x7f0b3e4d, float:1.8508618E38)
            android.view.View r0 = X.SKW.A00(r7, r0)
            r6.A0J = r0
            android.os.Bundle r1 = r6.mArguments
            if (r1 == 0) goto L_0x0079
            java.lang.String r0 = "should_hide_privacy_disclaimer"
            boolean r0 = r1.getBoolean(r0)
            r6.A0H = r0
        L_0x0079:
            r0 = 2131435078(0x7f0b1e46, float:1.8491988E38)
            android.widget.ImageView r3 = X.SKW.A01(r7, r0)
            X.Tic r0 = r6.A00
            if (r0 == 0) goto L_0x008e
            android.content.Context r1 = r6.requireContext()
            r0 = 2131237915(0x7f081c1b, float:1.8092094E38)
            X.DbU.A13(r1, r3, r0)
        L_0x008e:
            X.Tic r2 = r6.A00
            if (r2 == 0) goto L_0x00ac
            android.widget.ImageView r1 = r6.A02
            if (r1 != 0) goto L_0x00a1
            java.lang.String r5 = "selfieFaceWarning"
        L_0x0099:
            X.0qQ.A0F(r5)
        L_0x009c:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00a1:
            android.content.Context r0 = r6.requireContext()
            android.graphics.drawable.Drawable r0 = r2.Bs7(r0)
            r1.setImageDrawable(r0)
        L_0x00ac:
            r0 = 38
            X.C11497SbK.A01(r3, r0, r6)
            r0 = 39
            X.SbK r1 = new X.SbK
            r1.<init>(r6, r0)
            com.facebook.smartcapture.view.HelpButton r0 = r6.A0A
            java.lang.String r3 = "helpButton"
            if (r0 == 0) goto L_0x010e
            X.AnonymousClass0fU.A00(r1, r0)
            android.view.View r0 = r6.A0J
            java.lang.String r5 = "helpTextView"
            if (r0 == 0) goto L_0x0099
            X.AnonymousClass0fU.A00(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r6.getActivity()
            boolean r0 = r1 instanceof X.C13445TaY
            if (r0 == 0) goto L_0x0104
            X.TaY r1 = (X.C13445TaY) r1
            r2 = 1
            if (r1 == 0) goto L_0x0104
            com.facebook.smartcapture.view.BaseSelfieCaptureActivity r1 = (com.facebook.smartcapture.view.BaseSelfieCaptureActivity) r1
            com.facebook.smartcapture.ui.SelfieCaptureUi r0 = r1.A05
            if (r0 == 0) goto L_0x0104
        L_0x00dd:
            r1 = 8
            com.facebook.smartcapture.view.HelpButton r0 = r6.A0A
            if (r2 == 0) goto L_0x00f7
            if (r0 == 0) goto L_0x010e
            r0.setVisibility(r1)
            android.view.View r0 = r6.A0J
            if (r0 == 0) goto L_0x0099
            r0.setVisibility(r4)
        L_0x00ef:
            android.widget.TextView r1 = r6.A05
            if (r1 != 0) goto L_0x0106
            java.lang.String r5 = "titleView"
            goto L_0x0099
        L_0x00f7:
            if (r0 == 0) goto L_0x010e
            r0.setVisibility(r4)
            android.view.View r0 = r6.A0J
            if (r0 == 0) goto L_0x0099
            r0.setVisibility(r1)
            goto L_0x00ef
        L_0x0104:
            r2 = 0
            goto L_0x00dd
        L_0x0106:
            android.widget.TextView r0 = r6.A04
            if (r0 != 0) goto L_0x0112
            java.lang.String r5 = "subtitleView"
            goto L_0x0099
        L_0x010e:
            X.0qQ.A0F(r3)
            goto L_0x009c
        L_0x0112:
            X.C9581RdL.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7927Qcy.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public static final void A00(RFH rfh, C7927Qcy qcy) {
        RectF rectF;
        float f;
        float f2;
        float centerY;
        ArrowHintView arrowHintView = qcy.A08;
        if (arrowHintView == null) {
            0qQ.A0F("arrowHintView");
            throw AnonymousClass00P.createAndThrow();
        }
        Resources A052 = DbU.A05(arrowHintView);
        int dimension = ((int) A052.getDimension(R.dimen.alert_dialog_button_cell_height)) / 2;
        int dimension2 = (int) A052.getDimension(R.dimen.abc_button_inset_vertical_material);
        ViewGroup.LayoutParams layoutParams = arrowHintView.getLayoutParams();
        0qQ.A0C(layoutParams, AnonymousClass000.A00(1));
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 3;
        int ordinal = rfh.ordinal();
        if (ordinal == 0) {
            rectF = qcy.A0M;
            f = (float) dimension;
            f2 = (rectF.left - f) - ((float) dimension2);
            layoutParams2.leftMargin = (int) f2;
            centerY = rectF.centerY() - f;
        } else if (ordinal == 1) {
            RectF rectF2 = qcy.A0M;
            float f3 = (float) dimension;
            layoutParams2.leftMargin = (int) (rectF2.centerX() - f3);
            centerY = (rectF2.top - f3) - ((float) dimension2);
        } else if (ordinal == 2) {
            rectF = qcy.A0M;
            f = (float) dimension;
            f2 = (rectF.right - f) + ((float) dimension2);
            layoutParams2.leftMargin = (int) f2;
            centerY = rectF.centerY() - f;
        } else if (ordinal == 3) {
            RectF rectF3 = qcy.A0M;
            float f4 = (float) dimension;
            layoutParams2.leftMargin = (int) (rectF3.centerX() - f4);
            centerY = (rectF3.bottom - f4) + ((float) dimension2);
        } else {
            throw AnonymousClass7TE.A1K();
        }
        layoutParams2.topMargin = (int) centerY;
        arrowHintView.requestLayout();
    }

    public static final void A01(RFH rfh, C7927Qcy qcy, Integer num) {
        TextView textView;
        int i;
        if (qcy.A0P.A00) {
            String str = "titleView";
            if (num != AnonymousClass05K.A0Y) {
                TextView textView2 = qcy.A05;
                if (textView2 != null) {
                    textView2.setText(R.string.f0nameremoved);
                    return;
                }
            } else {
                if (rfh == null) {
                    textView = qcy.A05;
                    if (textView != null) {
                        i = R.string.f0nameremoved;
                    }
                } else {
                    int ordinal = rfh.ordinal();
                    if (ordinal == 0) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                    } else if (ordinal == 1) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                    } else if (ordinal == 2) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                    } else if (ordinal == 3) {
                        textView = qcy.A05;
                        if (textView != null) {
                            i = R.string.f0nameremoved;
                        }
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                }
                textView.setText(i);
                LinearLayout linearLayout = qcy.A03;
                if (linearLayout == null) {
                    str = "messageContainer";
                } else {
                    TransitionManager.beginDelayedTransition(linearLayout);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        A02(rfh, qcy, num);
    }

    public final void onCreate(Bundle bundle) {
        UserSession userSession;
        int A022 = AnonymousClass0fD.A02(-948039736);
        C7927Qcy.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A0E = requireArguments.getString("challenge_use_case");
        this.A0D = requireArguments.getString("av_session_id");
        this.A0F = requireArguments.getString("flow_id");
        this.A0G = requireArguments.getString("product_surface");
        UserSession A042 = 09i.A0A.A04(requireArguments);
        this.A0K = A042;
        if (A042 instanceof UserSession) {
            userSession = A042;
        } else {
            userSession = null;
        }
        this.A0B = userSession;
        AnonymousClass0fD.A09(1740144422, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1860421809);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.default_selfie_capture_overlay_fragment, viewGroup, false);
        AnonymousClass0fD.A09(868207351, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1983779464);
        C7927Qcy.super.onDestroyView();
        ArrowHintView arrowHintView = this.A08;
        if (arrowHintView == null) {
            0qQ.A0F("arrowHintView");
            throw AnonymousClass00P.createAndThrow();
        }
        C10563RuH ruH = arrowHintView.A03;
        if (ruH != null) {
            ruH.A00 = true;
            ruH.A01.cancel();
            arrowHintView.A03 = null;
        }
        AnonymousClass0fD.A09(-909288777, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-687530861);
        HelpButton helpButton = this.A0A;
        if (helpButton == null) {
            0qQ.A0F("helpButton");
            throw AnonymousClass00P.createAndThrow();
        }
        helpButton.A04.removeCallbacks(helpButton.A05);
        C7927Qcy.super.onPause();
        AnonymousClass0fD.A09(1368212883, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1400895987);
        C7927Qcy.super.onResume();
        A03((Integer) null);
        FaceCaptureProgressView faceCaptureProgressView = this.A09;
        String str = "captureProgressView";
        if (faceCaptureProgressView != null) {
            faceCaptureProgressView.A03();
            FaceCaptureProgressView faceCaptureProgressView2 = this.A09;
            if (faceCaptureProgressView2 != null) {
                faceCaptureProgressView2.setDrawingAlpha(0.0f);
                ArrowHintView arrowHintView = this.A08;
                if (arrowHintView == null) {
                    str = "arrowHintView";
                } else {
                    arrowHintView.setAlpha(0.0f);
                    View view = this.A00;
                    if (view == null) {
                        str = "rootView";
                    } else {
                        View A002 = SKW.A00(view, R.id.placeholder);
                        A002.setAlpha(1.0f);
                        Pxf.A1B(A002, C11408SSf.A01(AnonymousClass7TE.A0S(A002), R.attr.selfie_capture_placeholder));
                        AnonymousClass0fD.A09(-139467836, A022);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
