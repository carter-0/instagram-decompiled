package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.android.R;
import com.instagram.api.schemas.IGLiveBadgeSettings;
import com.instagram.api.schemas.LiveUserPaySupportTier;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.lang.ref.WeakReference;

/* renamed from: X.LMw  reason: case insensitive filesystem */
public final class C64102LMw {
    public static C64102LMw A05;
    public final FragmentActivity A00;
    public final 1a8 A01 = new 1a8(C318146oT.A01);
    public final UserSession A02;
    public final String A03 = "INSTAGRAM_USERPAY_BADGES";
    public final AnonymousClass0eM A04 = MMF.A00(this, 26);

    public static final void A00(LiveUserPaySupportTier liveUserPaySupportTier, C313616gj r31, C64102LMw lMw) {
        C278094wG r1;
        C2816658x r11;
        String str;
        C2816658x r4;
        C62010KVj A002;
        int ordinal;
        String str2;
        Drawable drawable;
        Integer num;
        Integer num2;
        int i;
        int i2;
        Object[] objArr;
        Object obj;
        C62245Kcf kcf;
        0qQ.A0B(liveUserPaySupportTier, 0);
        C313616gj r29 = r31;
        C270194gL r0 = r29.A00;
        C270194gL r24 = r0;
        if (!(r0 == null || (r1 = r0.A03) == null)) {
            UserSession userSession = r29.A0N;
            UserSession userSession2 = userSession;
            boolean A06 = 182.A06(0Tu.A05, userSession, 36312209025926134L);
            C305836Jt r02 = r29.A01;
            if (!(r02 == null || (kcf = r02.A06) == null)) {
                boolean A1V = AnonymousClass7TF.A1V(r1.A01);
                C62289KdN kdN = kcf.A03;
                AnonymousClass7TE.A1Z(new C59673JTe(liveUserPaySupportTier, kdN, (AnonymousClass4D7) null, 32, A1V), C318116oQ.A00(kdN));
            }
            Integer num3 = r1.A04;
            Integer num4 = num3;
            int A042 = C51967G9n.A04(num3, 0) + 1;
            IGLiveBadgeSettings iGLiveBadgeSettings = r1.A00;
            Boolean bool = r1.A03;
            C2816658x r22 = r1.A02;
            LiveUserPaySupportTier liveUserPaySupportTier2 = r1.A01;
            LiveUserPaySupportTier liveUserPaySupportTier3 = liveUserPaySupportTier2;
            Integer valueOf = Integer.valueOf(A042);
            if (r22 != null) {
                r11 = r22.F5b();
            } else {
                r11 = null;
            }
            r24.A03 = new C278094wG(iGLiveBadgeSettings, liveUserPaySupportTier2, r11, bool, valueOf);
            0Tu r6 = 0Tu.A06;
            DbS.A04(r6, userSession2, 36593684002702807L);
            C63492Kxw.A00(userSession2).A00(A042);
            if (num4 != null) {
                int intValue = num4.intValue();
                LEK lek = r29.A08;
                if (lek != null) {
                    if (A06) {
                        UserSession userSession3 = lek.A0A;
                        if (intValue == 1) {
                            num = AnonymousClass05K.A00;
                        } else if (intValue == DbS.A04(r6, userSession3, 36593684002702807L)) {
                            num = AnonymousClass05K.A0C;
                        } else {
                            num = AnonymousClass05K.A01;
                        }
                        LA7 la7 = lek.A04;
                        if (la7 != null) {
                            if (intValue == DbS.A04(r6, userSession3, 36593684002702807L)) {
                                num2 = AnonymousClass05K.A0N;
                            } else {
                                int ordinal2 = liveUserPaySupportTier.ordinal();
                                if (ordinal2 == 1) {
                                    num2 = AnonymousClass05K.A00;
                                } else if (ordinal2 != 2) {
                                    num2 = AnonymousClass05K.A0C;
                                } else {
                                    num2 = AnonymousClass05K.A01;
                                }
                            }
                            int A1U = AnonymousClass7TF.A1U(0, num2, num);
                            View A012 = la7.A02.A01();
                            if (A012 != null) {
                                IgImageView A0Y = JTO.A0Y(A012, R.id.supporter_animation_image_view);
                                Context context = la7.A04;
                                int intValue2 = num2.intValue();
                                if (intValue2 == 0) {
                                    i = R.drawable.instagram_supporter_badge_tier1_animation;
                                } else if (intValue2 != A1U) {
                                    i = R.drawable.instagram_supporter_badge_tier3_animation;
                                    if (intValue2 != 2) {
                                        i = R.drawable.instagram_supporter_badge_background_animation;
                                    }
                                } else {
                                    i = R.drawable.instagram_supporter_badge_tier2_animation;
                                }
                                Drawable drawable2 = context.getDrawable(i);
                                0qQ.A0C(drawable2, "null cannot be cast to non-null type com.facebook.keyframes.network.KeyframesNetworkDrawableLite");
                                C226472gs r13 = (C226472gs) drawable2;
                                r13.EL2(0.0f);
                                r13.A8s(new C59969Jce(A0Y, 3));
                                A0Y.setVisibility(0);
                                A0Y.setImageDrawable(r13);
                                View findViewById = A012.findViewById(R.id.supporter_animation_background);
                                TextView A0d = AnonymousClass7TE.A0d(A012, R.id.supporter_animation_text_view);
                                int intValue3 = num.intValue();
                                Resources resources = context.getResources();
                                if (intValue3 != 0) {
                                    i2 = 2131965376;
                                    if (intValue3 != A1U) {
                                        i2 = 2131965377;
                                        objArr = new Object[A1U];
                                        obj = Integer.valueOf(la7.A00);
                                    }
                                    objArr = new Object[A1U];
                                    obj = la7.A03;
                                } else {
                                    i2 = 2131965378;
                                    objArr = new Object[A1U];
                                    obj = la7.A03;
                                }
                                objArr[0] = obj;
                                String string = resources.getString(i2, objArr);
                                0qQ.A0A(string);
                                A0d.setText(string);
                                A0d.setImportantForAccessibility(A1U);
                                A0d.setContentDescription(A0d.getText());
                                View findViewById2 = A012.findViewById(R.id.supporter_animation_dismiss_button);
                                findViewById2.setImportantForAccessibility(A1U);
                                ViewGroup.LayoutParams layoutParams = A0d.getLayoutParams();
                                0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                                marginLayoutParams.topMargin = (int) (((double) A0Y.A01) * 0.75d);
                                A0d.setLayoutParams(marginLayoutParams);
                                0qQ.A0A(findViewById);
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                                ofFloat.setDuration((long) context.getResources().getInteger(17694720));
                                ofFloat.addUpdateListener(new I82(4, (Object) findViewById, (Object) A0d, (Object) findViewById2));
                                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                                ofFloat2.setDuration(300);
                                ofFloat2.addUpdateListener(new I82(5, (Object) findViewById, (Object) A0d, (Object) findViewById2));
                                AnimatorSet animatorSet = new AnimatorSet();
                                animatorSet.play(ofFloat);
                                r13.E2p();
                                if (num2 == AnonymousClass05K.A0N) {
                                    IgImageView A0Y2 = JTO.A0Y(A012, R.id.supporter_animation_avatar_view);
                                    ImageUrl imageUrl = la7.A01;
                                    if (imageUrl != null) {
                                        A0Y2.setUrl(imageUrl, la7.A05);
                                    }
                                    GradientSpinner gradientSpinner = (GradientSpinner) A012.findViewById(R.id.supporter_animation_avatar_highlight);
                                    gradientSpinner.A02();
                                    gradientSpinner.setActiveStrokeWidth((float) AnonymousClass7TG.A03(gradientSpinner.getContext()));
                                    gradientSpinner.setGradientColors((int) R.style.OrangePurpleGradientPatternStyle);
                                    View findViewById3 = A012.findViewById(R.id.supporter_animation_avatar_container);
                                    0qQ.A0A(findViewById3);
                                    Keyframe ofFloat3 = Keyframe.ofFloat(0.0f, 0.0f);
                                    Keyframe ofFloat4 = Keyframe.ofFloat(0.4f, 1.0f);
                                    Keyframe ofFloat5 = Keyframe.ofFloat(1.0f, 0.9091f);
                                    ofFloat4.setInterpolator(new PathInterpolator(0.0f, 1.0f, 0.15f, 1.0f));
                                    ofFloat5.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.34f, 1.0f));
                                    ValueAnimator ofPropertyValuesHolder = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("scale", new Keyframe[]{ofFloat3, ofFloat4, ofFloat5})});
                                    ofPropertyValuesHolder.setDuration(2500);
                                    C64205LTv.A01(ofPropertyValuesHolder, findViewById3, 19);
                                    ofPropertyValuesHolder.addListener(new U0N(findViewById3, 23));
                                    Keyframe ofFloat6 = Keyframe.ofFloat(0.0f, 0.9091f);
                                    Keyframe ofFloat7 = Keyframe.ofFloat(1.0f, 0.0f);
                                    ofFloat7.setInterpolator(new PathInterpolator(0.66f, 0.0f, 0.9f, 0.0f));
                                    ValueAnimator ofPropertyValuesHolder2 = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[]{PropertyValuesHolder.ofKeyframe("scale", new Keyframe[]{ofFloat6, ofFloat7})});
                                    ofPropertyValuesHolder2.setDuration(300);
                                    C64205LTv.A01(ofPropertyValuesHolder2, findViewById3, 20);
                                    ofPropertyValuesHolder2.addListener(new U0N(findViewById3, 24));
                                    animatorSet.playTogether(new Animator[]{ofFloat, ofPropertyValuesHolder});
                                    animatorSet.addListener(new C14294TtS(4, (Object) findViewById2, (Object) A012, (Object) A0d, (Object) la7));
                                    AnonymousClass0fU.A00(new C18858W9w(0, ofFloat2, ofPropertyValuesHolder2, findViewById2), A012);
                                } else {
                                    AnonymousClass0fU.A00(C64272LXy.A00, A012);
                                    ofFloat2.setStartDelay(3000);
                                    animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
                                    animatorSet.addListener(new U0H(A1U, A012, A0d, la7));
                                }
                                animatorSet.start();
                            }
                        }
                        A002 = C63492Kxw.A00(userSession3);
                        ordinal = liveUserPaySupportTier.ordinal();
                        int A032 = C51967G9n.A03(num, 0);
                        if (A032 == 0) {
                            str2 = "first";
                        } else if (A032 != 2) {
                            str2 = AnonymousClass000.A00(3871);
                        } else {
                            str2 = "milestone";
                        }
                    } else {
                        WeakReference weakReference = lek.A07;
                        if (weakReference != null) {
                            LikeActionView likeActionView = lek.A03;
                            if (likeActionView != null) {
                                likeActionView.setVisibility(0);
                            }
                            LikeActionView likeActionView2 = lek.A03;
                            if (likeActionView2 != null) {
                                Context context2 = lek.A08;
                                Integer A003 = LKL.A00(liveUserPaySupportTier, false);
                                if (A003 != null) {
                                    drawable = JTP.A0E(context2, A003);
                                } else {
                                    drawable = null;
                                }
                                likeActionView2.setImageDrawable(drawable);
                            }
                            C300835xz r12 = new C300835xz();
                            r12.A00(weakReference);
                            r12.A02(false, true, true);
                            A002 = C63492Kxw.A00(lek.A0A);
                            ordinal = liveUserPaySupportTier.ordinal();
                            str2 = NetInfoModule.CONNECTION_TYPE_NONE;
                        }
                    }
                    0Aj A0e = AnonymousClass7TE.A0e(A002.A00, "ig_user_pay_badge_entitlement_show_to_viewer");
                    C64090LMi lMi = A002.A01;
                    C64090LMi.A00(A0e, lMi, "media_id", lMi.A02);
                    A0e.A9F("payment_tier", DbV.A0p(A0e, "product_type", lMi.A03, ordinal));
                    A0e.AAJ("recognition_type", str2);
                    A0e.Cgf();
                }
                if (liveUserPaySupportTier3 == null || liveUserPaySupportTier3.compareTo(liveUserPaySupportTier) < 0) {
                    if (r22 != null) {
                        r4 = r22.F5b();
                    } else {
                        r4 = null;
                    }
                    r24.A03 = new C278094wG(iGLiveBadgeSettings, liveUserPaySupportTier, r4, bool, num4);
                }
            }
            LEK lek2 = r29.A08;
            if (lek2 != null) {
                lek2.A00(AnonymousClass05K.A0N);
            }
            C313776gz A004 = C313776gz.A0K.A00(userSession2, C313666go.VIEWER);
            C61013JvD A0Q = JTQ.A0Q(A004.A01());
            if (!(A0Q == null || (str = A0Q.A08) == null)) {
                DbX.A1W(A004, str, DbV.A0J(r29.A0K), 29);
            }
        }
        C313616gj.A01(r29);
        lMw.A01.A01();
    }

    public C64102LMw(UserSession userSession, FragmentActivity fragmentActivity) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
    }
}
