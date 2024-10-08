package com.facebook.smartcapture.view;

import X.0qQ;
import X.0s1;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TE;
import X.C10680RwJ;
import X.C11176SEc;
import X.C11257SHr;
import X.C12061Slo;
import X.C13580Td6;
import X.C7918Qcp;
import X.C7927Qcy;
import X.C9757RgF;
import X.DbU;
import X.DbW;
import X.Pxi;
import X.Pxj;
import X.Q7t;
import X.QCN;
import X.RFH;
import X.S3Y;
import X.STD;
import android.content.Intent;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.facedetection.amlfacetracker.AMLFaceTracker;
import com.facebook.smartcapture.ui.ResourcesProgressBar;
import com.facebook.smartcapture.ui.view.ArrowHintView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class SelfieCaptureActivity extends BaseSelfieCaptureActivity implements C13580Td6, View.OnLayoutChangeListener {
    public FrameLayout A00;
    public QCN A01;
    public S3Y A02;
    public C12061Slo A03;
    public C7918Qcp A04;
    public FrameLayout A05;

    public final void Dmu(RFH rfh) {
        0qQ.A0B(rfh, 0);
        C7918Qcp qcp = this.A04;
        String str = "cameraOverlayFragment";
        if (qcp != null) {
            if (!A01(qcp)) {
                C7927Qcy qcy = (C7927Qcy) qcp;
                ArrowHintView arrowHintView = qcy.A08;
                if (arrowHintView == null) {
                    str = "arrowHintView";
                } else {
                    arrowHintView.setCaptureState(rfh);
                    qcy.A06 = rfh;
                    C7927Qcy.A00(rfh, qcy);
                    C7927Qcy.A01(rfh, qcy, qcy.A0C);
                    HelpButton helpButton = qcy.A0A;
                    if (helpButton == null) {
                        str = "helpButton";
                    } else {
                        helpButton.A04.removeCallbacks(helpButton.A05);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final boolean A01(Fragment fragment) {
        if (fragment.mRemoving || fragment.mDetached || fragment.getActivity() == null || fragment.mView == null || !fragment.isAdded()) {
            return true;
        }
        return false;
    }

    public final void onBackPressed() {
        String str;
        C12061Slo slo = this.A03;
        if (slo == null) {
            str = "presenter";
        } else {
            if (slo.A0A == AnonymousClass05K.A01) {
                slo.A0A = AnonymousClass05K.A0N;
                C10680RwJ rwJ = slo.A0O;
                if (rwJ != null) {
                    rwJ.A01.cancel();
                }
                C12061Slo.A01(slo);
            }
            C7918Qcp qcp = this.A04;
            if (qcp == null) {
                str = "cameraOverlayFragment";
            } else {
                C7927Qcy qcy = (C7927Qcy) qcp;
                if ("ig_age_verification".equals(qcy.A0E)) {
                    UserSession userSession = qcy.A0B;
                    if (userSession != null) {
                        STD.A03(qcy, userSession, qcy.A0D, "av_fbap", "capture_video_selfie", qcy.A0F);
                        UserSession userSession2 = qcy.A0B;
                        if (userSession2 != null) {
                            Pxi.A1F(AnonymousClass1Nd.A00(userSession2), C9757RgF.A00(qcy.A0G), "fbap", false);
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    } else {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                }
                super.onBackPressed();
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i != i5 || i2 != i6 || i3 != i7 || i4 != i8) {
            C7918Qcp qcp = this.A04;
            String str = "cameraOverlayFragment";
            if (qcp != null) {
                str = "cameraFragmentContainer";
                if (!A01(qcp)) {
                    FrameLayout frameLayout = this.A05;
                    if (frameLayout != null) {
                        int i9 = i3 - i;
                        int i10 = i4 - i2;
                        C7927Qcy qcy = (C7927Qcy) qcp;
                        FragmentActivity activity = qcy.getActivity();
                        if (activity != null) {
                            RectF rectF = qcy.A0M;
                            0qQ.A0B(rectF, 1);
                            float dimension = activity.getResources().getDimension(R.dimen.abc_button_inset_vertical_material) + Pxj.A06(activity);
                            float A002 = DbU.A00(activity, R.dimen.audience_selector_pill_layout_height) + dimension;
                            float f = (float) i9;
                            float min = Math.min(f - ((activity.getResources().getDimension(R.dimen.audience_selector_pill_layout_height) + dimension) * 2.0f), ((float) i10) - A002) / 2.0f;
                            float f2 = f / 2.0f;
                            rectF.set(f2 - min, A002, f2 + min, A002 + min + min);
                            ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                            String A003 = AnonymousClass000.A00(1);
                            0qQ.A0C(layoutParams, A003);
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                            marginLayoutParams.width = (int) rectF.width();
                            marginLayoutParams.height = (int) rectF.height();
                            marginLayoutParams.topMargin = (int) rectF.top;
                            frameLayout.requestLayout();
                            LinearLayout linearLayout = qcy.A03;
                            str = "messageContainer";
                            if (linearLayout != null) {
                                DbW.A0A(linearLayout, A003).topMargin = (int) (rectF.bottom + ((float) ((int) activity.getResources().getDimension(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding))));
                                LinearLayout linearLayout2 = qcy.A03;
                                if (linearLayout2 != null) {
                                    linearLayout2.requestLayout();
                                    ResourcesProgressBar resourcesProgressBar = qcy.A07;
                                    str = "loadingView";
                                    if (resourcesProgressBar != null) {
                                        ViewGroup.MarginLayoutParams A0A = DbW.A0A(resourcesProgressBar, A003);
                                        float f3 = rectF.top;
                                        float f4 = f3 + ((rectF.bottom - f3) / 2.0f);
                                        ResourcesProgressBar resourcesProgressBar2 = qcy.A07;
                                        if (resourcesProgressBar2 != null) {
                                            A0A.topMargin = (int) (f4 - (((float) resourcesProgressBar2.getMeasuredHeight()) / 2.0f));
                                            ResourcesProgressBar resourcesProgressBar3 = qcy.A07;
                                            if (resourcesProgressBar3 != null) {
                                                resourcesProgressBar3.requestLayout();
                                                RFH rfh = qcy.A06;
                                                if (rfh != null) {
                                                    C7927Qcy.A00(rfh, qcy);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, com.facebook.smartcapture.view.SelfieCaptureActivity] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i != 1) {
            return;
        }
        if (i2 == -1) {
            setResult(i2, intent);
            finish();
        } else if (i2 == 1003) {
            onBackPressed();
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.app.Activity, com.facebook.smartcapture.view.SelfieCaptureActivity] */
    public final void onAttachedToWindow() {
        SelfieCaptureActivity.super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            window.addFlags(128);
        }
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [androidx.activity.ComponentActivity, android.view.View$OnLayoutChangeListener, android.content.Context, com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, com.facebook.smartcapture.view.SelfieCaptureActivity, androidx.fragment.app.FragmentActivity] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0078  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = 1021090856(0x3cdc9c28, float:0.02692993)
            int r3 = X.AnonymousClass0fD.A00(r0)
            r11 = r17
            boolean r0 = X.Pxj.A1V(r11)
            if (r0 != 0) goto L_0x0019
            r11.finish()
            r0 = -1323214790(0xffffffffb121583a, float:-2.3478735E-9)
        L_0x0015:
            X.AnonymousClass0fD.A07(r0, r3)
            return
        L_0x0019:
            r0 = r18
            super.onCreate(r0)
            r0 = 2131629343(0x7f0e151f, float:1.8886004E38)
            r11.setContentView(r0)
            r0 = 2131429434(0x7f0b083a, float:1.848054E38)
            android.view.View r0 = r11.findViewById(r0)
            if (r0 == 0) goto L_0x01eb
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r11.A05 = r0
            r0 = 2131432935(0x7f0b15e7, float:1.8487641E38)
            android.view.View r0 = r11.findViewById(r0)
            if (r0 == 0) goto L_0x01e4
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r11.A00 = r0
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "parentContainer"
        L_0x0043:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004b:
            r0.addOnLayoutChangeListener(r11)
            com.facebook.smartcapture.ui.SelfieCaptureUi r0 = r11.A05
            r9 = 0
            if (r0 != 0) goto L_0x00aa
            java.lang.String r0 = "SmartCaptureUi is null"
        L_0x0055:
            r11.A05(r0, r9)
        L_0x0058:
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r11.A02()
            com.facebook.smartcapture.config.ChallengeProvider r13 = r0.A05
            X.0qQ.A0A(r13)
            X.S3Y r12 = r11.A02
            com.facebook.smartcapture.flow.SelfieCaptureConfig r14 = r11.A02()
            com.facebook.smartcapture.logging.SelfieCaptureLogger r15 = com.facebook.smartcapture.view.BaseSelfieCaptureActivity.A00(r11)
            X.Slo r10 = new X.Slo
            r16 = r11
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r11.A03 = r10
            X.Qcp r0 = r11.A04
            if (r0 == 0) goto L_0x0170
            X.Qcy r0 = (X.C7927Qcy) r0
            X.Sqf r2 = r0.A0P
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r10.A0J
            java.lang.Boolean r0 = r0.A0F
            r1 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r1)
            if (r0 != 0) goto L_0x0088
            r1 = 0
        L_0x0088:
            r2.A00 = r1
            android.content.res.Resources r6 = r11.A00
            X.Qcp r0 = r11.A04
            if (r0 == 0) goto L_0x0170
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            r0 = 2131951844(0x7f1300e4, float:1.9540114E38)
            X.AnonymousClass7TF.A1M(r2, r0)
            r0 = 2131951828(0x7f1300d4, float:1.9540082E38)
            X.AnonymousClass7TF.A1M(r2, r0)
            r0 = 2131951810(0x7f1300c2, float:1.9540045E38)
            X.AnonymousClass7TF.A1M(r2, r0)
            if (r6 == 0) goto L_0x01df
            goto L_0x0174
        L_0x00aa:
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r11.A02()
            com.facebook.smartcapture.config.ChallengeProvider r0 = r0.A05
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = "ChallengeProvider is null"
            goto L_0x0055
        L_0x00b5:
            java.lang.Class<X.Qcy> r0 = X.C7927Qcy.class
            java.lang.Object r0 = r0.newInstance()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            X.Qcp r0 = (X.C7918Qcp) r0     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            r11.A04 = r0     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            java.lang.String r10 = "cameraOverlayFragment"
            if (r0 == 0) goto L_0x015e
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r11.A02()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            com.facebook.smartcapture.config.ChallengeProvider r1 = r0.A05     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            if (r1 == 0) goto L_0x00e4
            X.Qcp r0 = r11.A04     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            if (r0 == 0) goto L_0x015e
            X.Qcy r0 = (X.C7927Qcy) r0     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            X.Rrw r2 = r0.A0O     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            java.util.List r0 = r1.A03     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            X.0qQ.A07(r1)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            java.util.List r0 = r2.A01     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            r0.clear()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            r0.addAll(r1)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
        L_0x00e4:
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r11.A02()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            android.os.Bundle r1 = r0.A03     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            X.Qcp r6 = r11.A04     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            if (r6 == 0) goto L_0x015e
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r11.A02()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            java.lang.String r8 = r0.A0P     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            if (r1 == 0) goto L_0x011a
            java.lang.String r0 = "challenge_use_case"
            java.lang.String r9 = r1.getString(r0)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            java.lang.String r0 = "av_session_id"
            java.lang.String r7 = r1.getString(r0)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            java.lang.String r0 = "flow_id"
            java.lang.String r5 = r1.getString(r0)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            java.lang.String r0 = "product_surface"
            java.lang.String r4 = r1.getString(r0)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
        L_0x010f:
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r11.A02()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            boolean r2 = r0.A0S     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            goto L_0x011e
        L_0x011a:
            r7 = r9
            r5 = r9
            r4 = r9
            goto L_0x010f
        L_0x011e:
            if (r8 == 0) goto L_0x0125
            java.lang.String r0 = "IgSessionManager.SESSION_TOKEN_KEY"
            r1.putString(r0, r8)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
        L_0x0125:
            if (r9 == 0) goto L_0x012c
            java.lang.String r0 = "challenge_use_case"
            r1.putString(r0, r9)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
        L_0x012c:
            if (r7 == 0) goto L_0x0133
            java.lang.String r0 = "av_session_id"
            r1.putString(r0, r7)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
        L_0x0133:
            if (r5 == 0) goto L_0x013a
            java.lang.String r0 = "flow_id"
            r1.putString(r0, r5)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
        L_0x013a:
            if (r4 == 0) goto L_0x0142
            java.lang.String r0 = "product_surface"
            r1.putString(r0, r4)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
        L_0x0142:
            java.lang.String r0 = "should_hide_privacy_disclaimer"
            r1.putBoolean(r0, r2)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            r6.setArguments(r1)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            X.0s1 r2 = X.DbW.A0D(r11)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            r1 = 2131429449(0x7f0b0849, float:1.8480571E38)
            X.Qcp r0 = r11.A04     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            if (r0 == 0) goto L_0x015e
            r2.A0A(r0, r1)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            r2.A00()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            goto L_0x0058
        L_0x015e:
            X.0qQ.A0F(r10)     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
            throw r0     // Catch:{ IllegalAccessException | InstantiationException -> 0x0166 }
        L_0x0166:
            r1 = move-exception
            java.lang.String r0 = r1.getMessage()
            r11.A05(r0, r1)
            goto L_0x0058
        L_0x0170:
            java.lang.String r0 = "cameraOverlayFragment"
            goto L_0x0043
        L_0x0174:
            boolean r0 = X.C9576RdG.A00(r6)     // Catch:{ all -> 0x01d5 }
            if (r0 == 0) goto L_0x01df
            android.content.res.Configuration r0 = X.Pxf.A0G(r11)     // Catch:{ all -> 0x01d5 }
            android.content.res.Configuration r1 = new android.content.res.Configuration     // Catch:{ all -> 0x01d5 }
            r1.<init>(r0)     // Catch:{ all -> 0x01d5 }
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch:{ all -> 0x01d5 }
            r1.setLocale(r0)     // Catch:{ all -> 0x01d5 }
            android.content.Context r0 = r11.createConfigurationContext(r1)     // Catch:{ all -> 0x01d5 }
            android.content.res.Resources r5 = r0.getResources()     // Catch:{ all -> 0x01d5 }
            X.0qQ.A07(r5)     // Catch:{ all -> 0x01d5 }
            java.util.Iterator r7 = r2.iterator()     // Catch:{ all -> 0x01d5 }
        L_0x0197:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x01d5 }
            if (r0 == 0) goto L_0x01df
            int r1 = X.AnonymousClass7TG.A0F(r7)     // Catch:{ all -> 0x01d5 }
            java.lang.String r0 = X.AnonymousClass7TF.A0d(r6, r1)     // Catch:{ all -> 0x01d5 }
            java.lang.String r4 = X.AnonymousClass7TF.A0d(r5, r1)     // Catch:{ all -> 0x01d5 }
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x01d5 }
            if (r0 == 0) goto L_0x0197
            android.content.res.Configuration r0 = r6.getConfiguration()     // Catch:{ all -> 0x01d5 }
            java.util.Locale r0 = r0.locale     // Catch:{ all -> 0x01d5 }
            java.lang.String r1 = r0.getLanguage()     // Catch:{ all -> 0x01d5 }
            X.0qQ.A07(r1)     // Catch:{ all -> 0x01d5 }
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x01d5 }
            java.lang.String r0 = "str"
            r2.put(r0, r4)     // Catch:{ all -> 0x01d5 }
            java.lang.String r0 = "lang"
            r2.put(r0, r1)     // Catch:{ all -> 0x01d5 }
            com.facebook.smartcapture.logging.SelfieCaptureLogger r1 = com.facebook.smartcapture.view.BaseSelfieCaptureActivity.A00(r11)     // Catch:{ all -> 0x01d5 }
            java.lang.String r0 = "locale_mismatch"
            r1.logEvent(r0, r2)     // Catch:{ all -> 0x01d5 }
            goto L_0x0197
        L_0x01d5:
            r0 = move-exception
            java.lang.String r1 = r0.toString()
            java.lang.String r0 = "SCPUtil"
            android.util.Log.e(r0, r1)
        L_0x01df:
            r0 = 14517043(0xdd8333, float:2.034271E-38)
            goto L_0x0015
        L_0x01e4:
            java.lang.String r0 = "Required View not found. Your layout is missing the ID requested."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x01eb:
            java.lang.String r0 = "Required View not found. Your layout is missing the ID requested."
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.view.SelfieCaptureActivity.onCreate(android.os.Bundle):void");
    }

    public final void onDestroy() {
        String str;
        int A002 = AnonymousClass0fD.A00(566402632);
        FrameLayout frameLayout = this.A00;
        if (frameLayout == null) {
            str = "parentContainer";
        } else {
            frameLayout.removeOnLayoutChangeListener(this);
            C12061Slo slo = this.A03;
            if (slo == null) {
                str = "presenter";
            } else {
                slo.A0A = AnonymousClass05K.A00;
                C11257SHr sHr = slo.A08;
                if (sHr != null) {
                    C11176SEc sEc = sHr.A07;
                    if (sEc != null) {
                        AMLFaceTracker aMLFaceTracker = sEc.A00;
                        AMLFaceTracker.NativePeer nativePeer = aMLFaceTracker.A00;
                        if (nativePeer != null) {
                            nativePeer.mHybridData.resetNative();
                        }
                        aMLFaceTracker.A00 = null;
                    }
                    sHr.A07 = null;
                    sHr.A09 = false;
                }
                SelfieCaptureActivity.super.onDestroy();
                AnonymousClass0fD.A07(526286750, A002);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.facebook.smartcapture.view.BaseSelfieCaptureActivity, android.app.Activity, com.facebook.smartcapture.view.SelfieCaptureActivity, androidx.fragment.app.FragmentActivity] */
    public final void onPause() {
        Window window;
        int A002 = AnonymousClass0fD.A00(2118624218);
        C12061Slo slo = this.A03;
        if (slo == null) {
            0qQ.A0F("presenter");
            throw AnonymousClass00P.createAndThrow();
        }
        slo.A0L.logCaptureSessionEnd(slo.A0K.toString());
        if (slo.A0A == AnonymousClass05K.A01) {
            slo.A0A = AnonymousClass05K.A0C;
            C10680RwJ rwJ = slo.A0O;
            if (rwJ != null) {
                rwJ.A01.cancel();
            }
            Q7t q7t = slo.A09;
            if (q7t != null) {
                q7t.A00 = false;
            }
            C12061Slo.A01(slo);
        }
        0s1 A0D = DbW.A0D(this);
        QCN qcn = this.A01;
        0qQ.A0A(qcn);
        A0D.A03(qcn);
        A0D.A0K();
        Boolean bool = A02().A0J;
        if (!(bool == null || !bool.booleanValue() || (window = getWindow()) == null)) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.screenBrightness = -1.0f;
            window.setAttributes(attributes);
        }
        SelfieCaptureActivity.super.onPause();
        AnonymousClass0fD.A07(478531428, A002);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: androidx.fragment.app.FragmentActivity} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r17 = this;
            r0 = 750965260(0x2cc2d20c, float:5.5371315E-12)
            int r1 = X.AnonymousClass0fD.A00(r0)
            r2 = r17
            super.onResume()
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r2.A02()
            com.facebook.smartcapture.config.ChallengeProvider r0 = r0.A05
            r3 = 0
            if (r0 != 0) goto L_0x008b
            java.lang.String r0 = "ChallengeProvider is null"
            r2.A05(r0, r3)
        L_0x001a:
            X.QCN r3 = r2.A01
            X.0qQ.A0A(r3)
            X.Slo r0 = r2.A03
            java.lang.String r7 = "presenter"
            if (r0 == 0) goto L_0x01a5
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r3.A06 = r0
            X.QCN r3 = r2.A01
            X.0qQ.A0A(r3)
            X.Slo r0 = r2.A03
            if (r0 == 0) goto L_0x01a5
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r3.A07 = r0
            X.QCN r3 = r2.A01
            X.0qQ.A0A(r3)
            X.Slo r0 = r2.A03
            if (r0 == 0) goto L_0x01a5
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r3.A05 = r0
            X.Slo r3 = r2.A03
            if (r3 == 0) goto L_0x01a5
            X.QCN r0 = r2.A01
            X.0qQ.A0A(r0)
            X.AUb r0 = r0.A00()
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r0)
            r3.A0C = r0
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r2.A02()
            java.lang.Boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x0138
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0138
            r4 = 1065353216(0x3f800000, float:1.0)
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L_0x007c
            android.view.WindowManager$LayoutParams r0 = r3.getAttributes()
            r0.screenBrightness = r4
            r3.setAttributes(r0)
        L_0x007c:
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r2.A02()
            java.lang.Boolean r0 = r0.A0I
            if (r0 == 0) goto L_0x0138
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0138
            goto L_0x00ff
        L_0x008b:
            java.lang.Integer r8 = r0.A00
            java.lang.Integer r7 = r0.A02
            java.lang.Integer r6 = r0.A01
            X.QCN r9 = new X.QCN
            r9.<init>()
            r2.A01 = r9
            r3 = 1
            r5 = 0
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "initial_camera_facing"
            r4.putInt(r0, r3)
            if (r8 == 0) goto L_0x00af
            int r3 = r8.intValue()
            java.lang.String r0 = "photo_quality"
            r4.putInt(r0, r3)
        L_0x00af:
            if (r7 == 0) goto L_0x00bb
            int r3 = r7.intValue()
            java.lang.String r0 = "video_quality"
            r4.putInt(r0, r3)
        L_0x00bb:
            if (r6 == 0) goto L_0x00ca
            int r3 = r6.intValue()
            r0 = 1923(0x783, float:2.695E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.putInt(r0, r3)
        L_0x00ca:
            java.lang.String r0 = "use_camera2"
            r4.putBoolean(r0, r5)
            r9.setArguments(r4)
            com.facebook.smartcapture.flow.SelfieCaptureConfig r0 = r2.A02()
            com.facebook.smartcapture.capture.SelfieEvidenceRecorderProvider r0 = r0.A04
            com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider r0 = (com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider) r0
            java.lang.String r11 = r0.A04
            long r15 = r0.A01
            java.lang.String r12 = r0.A05
            java.util.ArrayList r13 = r0.A06
            int r14 = r0.A00
            java.lang.Integer r10 = r0.A03
            android.graphics.RectF r8 = r0.A02
            X.S3Y r7 = new X.S3Y
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15)
            r2.A02 = r7
            X.0s1 r3 = X.DbW.A0D(r2)
            r0 = 2131429434(0x7f0b083a, float:1.848054E38)
            r3.A0A(r9, r0)
            r3.A0K()
            goto L_0x001a
        L_0x00ff:
            android.widget.FrameLayout r4 = r2.A00     // Catch:{ InflateException -> 0x0132 }
            if (r4 != 0) goto L_0x010e
            java.lang.String r0 = "parentContainer"
            X.0qQ.A0F(r0)     // Catch:{ InflateException -> 0x0132 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ InflateException -> 0x0132 }
            throw r0     // Catch:{ InflateException -> 0x0132 }
        L_0x010e:
            r3 = 2131972658(0x7f135232, float:1.958233E38)
            r5 = 0
            int[] r0 = X.UWW.A01     // Catch:{ InflateException -> 0x0132 }
            android.content.res.Resources r0 = r4.getResources()     // Catch:{ InflateException -> 0x0132 }
            java.lang.CharSequence r0 = r0.getText(r3)     // Catch:{ InflateException -> 0x0132 }
            X.UWW r4 = X.UWW.A00(r4, r0)     // Catch:{ InflateException -> 0x0132 }
            r3 = -1
            X.U4W r0 = r4.A09     // Catch:{ InflateException -> 0x0132 }
            android.view.View r0 = r0.getChildAt(r5)     // Catch:{ InflateException -> 0x0132 }
            com.google.android.material.snackbar.SnackbarContentLayout r0 = (com.google.android.material.snackbar.SnackbarContentLayout) r0     // Catch:{ InflateException -> 0x0132 }
            android.widget.TextView r0 = r0.A01     // Catch:{ InflateException -> 0x0132 }
            r0.setTextColor(r3)     // Catch:{ InflateException -> 0x0132 }
            r4.A04()     // Catch:{ InflateException -> 0x0132 }
            goto L_0x0138
        L_0x0132:
            r3 = move-exception
            java.lang.String r0 = "Exception thrown in rendering Snackbar!"
            r2.A05(r0, r3)
        L_0x0138:
            X.Slo r6 = r2.A03
            if (r6 == 0) goto L_0x01a5
            X.S3Y r4 = r2.A02
            X.0qQ.A0A(r4)
            r5 = 0
            X.0qQ.A0B(r4, r5)
            com.facebook.smartcapture.logging.InMemoryLogger r3 = r6.A0K
            r3.clear()
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = r6.A0B
            if (r2 == r0) goto L_0x015b
            r6.A0B = r2
            java.lang.String r0 = "INITIAL"
            com.facebook.smartcapture.logging.InMemoryLogger$LogEntryBuilder r0 = r3.addEntry(r0)
            r0.submit()
        L_0x015b:
            X.S4B r0 = new X.S4B
            r0.<init>(r4, r6)
            r4.A02 = r0
            java.lang.ref.WeakReference r0 = X.C51965G9l.A0v(r4)
            r6.A0D = r0
            r6.A03 = r5
            java.lang.ref.WeakReference r0 = r6.A0P
            java.lang.Object r2 = r0.get()
            X.Td6 r2 = (X.C13580Td6) r2
            if (r2 == 0) goto L_0x017b
            X.RFH r0 = r6.A02()
            r2.Dmu(r0)
        L_0x017b:
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r6.A0A = r0
            X.Q7t r2 = r6.A09
            if (r2 == 0) goto L_0x0186
            r0 = 1
            r2.A00 = r0
        L_0x0186:
            X.RwJ r4 = r6.A0O
            if (r4 == 0) goto L_0x0198
            X.Q7e r0 = r4.A01
            r0.cancel()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r4.A00 = r2
            r0.start()
        L_0x0198:
            r2 = 0
            r6.A06 = r2
            r6.A0F = r5
            r0 = 165296091(0x9da37db, float:5.2534117E-33)
            X.AnonymousClass0fD.A07(r0, r1)
            return
        L_0x01a5:
            X.0qQ.A0F(r7)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.smartcapture.view.SelfieCaptureActivity.onResume():void");
    }
}
