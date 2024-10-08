package com.instagram.sponsored.serverrendered;

import X.0Tu;
import X.0qQ;
import X.0sn;
import X.0wb;
import X.0wj;
import X.182;
import X.1KU;
import X.2Su;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass3OA;
import X.AnonymousClass621;
import X.AnonymousClass623;
import X.AnonymousClass6K2;
import X.AnonymousClass6Q5;
import X.AnonymousClass6Q6;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass9J6;
import X.B7C;
import X.C226492gu;
import X.C229382nI;
import X.C257643xj;
import X.C306796Nn;
import X.C307786Rm;
import X.C313306gE;
import X.C315536k3;
import X.C51973G9u;
import X.C52592GYr;
import X.C52593GYs;
import X.C54705HPk;
import X.C55589Hk9;
import X.C56987IKf;
import X.C56992IKk;
import X.DbT;
import X.DbW;
import X.GIB;
import X.GYG;
import X.GYH;
import X.IZB;
import X.JQM;
import X.JRK;
import X.XB5;
import android.animation.Animator;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.showreel.IgShowreelComposition;
import com.instagram.model.showreelnative.IgShowreelNativeAnimationIntf;
import com.instagram.showreel.composition.ui.IgShowreelCompositionView;
import com.instagram.showreelnative.ui.common.ShowreelNativeMediaView;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class ServerRenderedSponsoredContentView extends FrameLayout implements JRK {
    public XB5 A00;
    public IgImageView A01;
    public IgShowreelCompositionView A02;
    public ShowreelNativeMediaView A03;
    public C313306gE A04;
    public C52593GYs A05;
    public JQM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ServerRenderedSponsoredContentView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    public final void A00(Activity activity, C55589Hk9 hk9, AnonymousClass6Q5 r18, UserSession userSession, AnonymousClass3OA r20, boolean z) {
        ShowreelNativeMediaView showreelNativeMediaView;
        ShowreelNativeMediaView showreelNativeMediaView2;
        IgShowreelNativeAnimationIntf BwB;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            removeView(igShowreelCompositionView);
            this.A02 = null;
            IgImageView igImageView = this.A01;
            if (igImageView != null) {
                removeView(igImageView);
                this.A01 = null;
            }
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession2, 36315769555521037L)) {
            setVisibility(0);
        }
        if (this.A03 == null) {
            if (activity == null || !182.A06(r2, userSession2, 36315593460157856L)) {
                showreelNativeMediaView2 = new ShowreelNativeMediaView(AnonymousClass7TE.A0S(this), getIntegrationPoint(), (AnonymousClass623) null, (AnonymousClass621) getConfigProvider());
            } else {
                LayoutInflater layoutInflater = activity.getLayoutInflater();
                0qQ.A07(layoutInflater);
                View A002 = 2Su.A00(layoutInflater, new ViewGroup.LayoutParams(-1, -1), (ViewGroup) null, R.layout.showreel_view);
                0qQ.A0C(A002, "null cannot be cast to non-null type com.instagram.sponsored.serverrendered.IgShowreelView");
                showreelNativeMediaView2 = ((IgShowreelView) A002).A01;
            }
            this.A03 = showreelNativeMediaView2;
            if (showreelNativeMediaView2 != null) {
                C52593GYs gYs = new C52593GYs(showreelNativeMediaView2);
                this.A05 = gYs;
                gYs.A02 = this.A04;
                addView(showreelNativeMediaView2);
                if (182.A06(r2, userSession2, 36313699379644611L)) {
                    showreelNativeMediaView2.setScaleType(ImageView.ScaleType.CENTER_CROP);
                }
                showreelNativeMediaView2.setLayoutParams(new FrameLayout.LayoutParams(-1, -1, 17));
                AnonymousClass6Q5 r0 = r18;
                if (r18 != null) {
                    showreelNativeMediaView2.A0G.A00(r0.A00);
                }
                if (182.A06(r2, userSession2, 36315593460288930L)) {
                    AnonymousClass3OA r4 = r20;
                    C306796Nn r9 = new C306796Nn(new AnonymousClass6Q6(r4.A0S, r4.A0j), 0, 0, 1, 0);
                    C257643xj r02 = r4.A06;
                    if (r02 == null || (BwB = r02.BwB()) == null) {
                        throw AnonymousClass7TE.A0y();
                    }
                    showreelNativeMediaView2.setShowreelAnimation(B7C.A00(BwB), r9, (String) null, 0sn.A00, (Object) null, (Boolean) null, (Animator.AnimatorListener) null, (AnonymousClass9J6) null);
                }
            }
        }
        ShowreelNativeMediaView showreelNativeMediaView3 = this.A03;
        if (showreelNativeMediaView3 != null) {
            showreelNativeMediaView3.A03 = hk9;
        }
        if (z && this.A04 == null) {
            IgImageView igImageView2 = new IgImageView(AnonymousClass7TE.A0S(this));
            GIB.A00(igImageView2, 1KU.A07(userSession2));
            this.A01 = igImageView2;
            addView(igImageView2);
        }
        if (182.A06(r2, userSession2, 36313699379710148L) && (showreelNativeMediaView = this.A03) != null && !0qQ.A0K(showreelNativeMediaView.getParent(), this)) {
            DbT.A1Q(0wj.A01, "not attached view detected", 817902173);
        }
    }

    public final void EHs(UserSession userSession, boolean z, boolean z2, boolean z3) {
        C52593GYs gYs;
        C313306gE r0;
        C313306gE r02;
        0qQ.A0B(userSession, 0);
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView != null) {
            showreelNativeMediaView.reset();
        }
        if (z3 && (r02 = this.A04) != null) {
            r02.A03();
        }
        if (!z2 && (r0 = this.A04) != null) {
            r0.A02();
        }
        this.A06 = null;
        0Tu r3 = 0Tu.A05;
        if ((!182.A06(r3, userSession, 36315769555652111L) || this.A03 != null) && (gYs = this.A05) != null) {
            gYs.A04 = false;
            gYs.A06.removeCallbacks(gYs.A09);
            gYs.A00 = 0;
            gYs.A05 = false;
            gYs.A03 = null;
        }
        if (z && 182.A06(r3, userSession, 36315769555521037L)) {
            setVisibility(8);
        }
    }

    public void setTransformation(AnonymousClass3OA r19, UserSession userSession, C229382nI r21, JQM jqm) {
        IgShowreelCompositionView igShowreelCompositionView;
        IgShowreelComposition Bw9;
        IgShowreelNativeAnimationIntf BwB;
        AnonymousClass3OA r5 = r19;
        UserSession userSession2 = userSession;
        C229382nI r11 = r21;
        boolean A1b = C51973G9u.A1b(r5, userSession2, r11);
        if (r5.A06()) {
            JQM jqm2 = jqm;
            this.A06 = jqm2;
            C306796Nn r12 = new C306796Nn(new AnonymousClass6Q6(r5.A0S, r5.A0j), 0, 0, A1b ? 1 : 0, 0);
            if (r5.A08()) {
                C52593GYs gYs = this.A05;
                if (gYs != null) {
                    gYs.A03 = new C52592GYr(this, jqm2);
                }
                ShowreelNativeMediaView showreelNativeMediaView = this.A03;
                if (showreelNativeMediaView != null) {
                    C257643xj r0 = r5.A06;
                    if (r0 == null || (BwB = r0.BwB()) == null) {
                        throw AnonymousClass7TE.A0z("Required value was null.");
                    }
                    showreelNativeMediaView.setShowreelAnimation(B7C.A00(BwB), r12, (String) null, 0sn.A00, (Object) null, (Boolean) null, this.A05, (AnonymousClass9J6) null);
                }
            } else if (r5.A07() && (igShowreelCompositionView = this.A02) != null) {
                C257643xj r02 = r5.A06;
                if (r02 == null || (Bw9 = r02.Bw9()) == null) {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
                igShowreelCompositionView.setShowreelAnimation(userSession2, Bw9, r12, r11, new C56987IKf(jqm2, A1b ? 1 : 0), (C54705HPk) null, (C307786Rm) null);
            }
        }
    }

    private final C56992IKk getConfigProvider() {
        return (C56992IKk) this.A07.getValue();
    }

    private final AnonymousClass9J6 getIntegrationPoint() {
        return (AnonymousClass9J6) this.A08.getValue();
    }

    public final void CN9(UserSession userSession, String str, boolean z) {
        IZB izb = new IZB(this, z);
        if (this.A04 == null) {
            C313306gE r1 = new C313306gE(AnonymousClass7TE.A0S(this), userSession, izb, str, "clips_viewer_clips_tab");
            this.A04 = r1;
            r1.A00 = null;
            C52593GYs gYs = this.A05;
            if (gYs != null) {
                gYs.A02 = r1;
            }
        }
    }

    public final void Dy7() {
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            igShowreelCompositionView.getCompositionController().Dy7();
        }
    }

    public final void Dy8() {
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            igShowreelCompositionView.getCompositionController().Dy8();
        }
    }

    public final void Dy9() {
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            igShowreelCompositionView.getCompositionController().Dy9();
        }
    }

    public final boolean EIz() {
        C313306gE r1;
        String str;
        C313306gE r12;
        String str2;
        C52593GYs gYs = this.A05;
        if (gYs != null && gYs.A05) {
            ShowreelNativeMediaView showreelNativeMediaView = this.A03;
            if (showreelNativeMediaView != null) {
                showreelNativeMediaView.EIx();
            }
            C52593GYs gYs2 = this.A05;
            if (gYs2 != null && gYs2.A08.isPlaying()) {
                C313306gE r0 = gYs2.A02;
                if (!(r0 == null || r0.A08() || (r12 = gYs2.A02) == null || (str2 = r12.A01) == null)) {
                    C313306gE.A00(r12, str2);
                }
                C52593GYs.A01(gYs2);
            }
        }
        if (!(this.A02 == null || (r1 = this.A04) == null || (str = r1.A01) == null)) {
            C313306gE.A00(r1, str);
        }
        return isPlaying();
    }

    public final void Eqr(float f, int i) {
        C313306gE r0 = this.A04;
        if (r0 != null) {
            r0.A05(f);
        }
    }

    public final IgImageView getAudioIconView() {
        return this.A01;
    }

    public int getCurrentPositionMs() {
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView == null) {
            return 0;
        }
        return (int) (showreelNativeMediaView.getProgress() * ((float) TimeUnit.SECONDS.toMillis(showreelNativeMediaView.getDurationSeconds())));
    }

    public AnonymousClass6K2 getVideoView() {
        IgShowreelCompositionView igShowreelCompositionView = this.A02;
        if (igShowreelCompositionView != null) {
            return igShowreelCompositionView.getCompositionController().getVideoView();
        }
        return null;
    }

    public final boolean isPlaying() {
        ShowreelNativeMediaView showreelNativeMediaView;
        C52593GYs gYs = this.A05;
        if (gYs == null || !gYs.A05 || (showreelNativeMediaView = this.A03) == null || !showreelNativeMediaView.isPlaying()) {
            return false;
        }
        return true;
    }

    public final void pause() {
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView != null) {
            showreelNativeMediaView.pause();
        }
        C313306gE r0 = this.A04;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final void seekTo(int i) {
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView != null) {
            long millis = TimeUnit.SECONDS.toMillis(showreelNativeMediaView.getDurationSeconds());
            if (millis > 0) {
                float f = (((float) i) * 1.0f) / ((float) millis);
                C226492gu keyframesAnimatable = showreelNativeMediaView.A0J.getKeyframesAnimatable();
                if (keyframesAnimatable != null) {
                    keyframesAnimatable.EL2(f);
                }
            }
            C313306gE r0 = this.A04;
            if (r0 != null) {
                r0.A06(i);
            }
        }
    }

    public void setTrackDuration(long j) {
        C52593GYs gYs = this.A05;
        if (gYs != null) {
            gYs.A01 = (int) j;
        }
    }

    public final void stop() {
        ShowreelNativeMediaView showreelNativeMediaView = this.A03;
        if (showreelNativeMediaView != null) {
            showreelNativeMediaView.stop();
        }
    }

    public final void ADT(XB5 xb5, String str) {
        C315536k3 r0;
        boolean A1X = DbW.A1X(str);
        this.A00 = xb5;
        C313306gE r1 = this.A04;
        if (r1 != null) {
            C52593GYs gYs = this.A05;
            if (gYs != null) {
                r0 = gYs.A07;
            } else {
                r0 = null;
            }
            r1.A07(xb5, r0, str, A1X);
        }
    }

    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("setTag (key = [");
            A1A.append(i);
            A1A.append("], tag = [");
            A1A.append(obj);
            0wb.A03("ServerRenderedSponsoredContentView#setTag(2)", AnonymousClass7TG.A0m(this, "]) on ", A1A));
        }
    }

    public final void setAudioIconView(IgImageView igImageView) {
        this.A01 = igImageView;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ServerRenderedSponsoredContentView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A08 = AnonymousClass0eN.A01(GYG.A00);
        this.A07 = AnonymousClass0eN.A01(GYH.A00);
    }

    public void setTag(Object obj) {
        super.setTag(obj);
        if (obj == null) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("setTag (tag = [");
            A1A.append(obj);
            0wb.A03("ServerRenderedSponsoredContentView#setTag(1)", AnonymousClass7TG.A0m(this, "]) on ", A1A));
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ServerRenderedSponsoredContentView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ServerRenderedSponsoredContentView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }
}
