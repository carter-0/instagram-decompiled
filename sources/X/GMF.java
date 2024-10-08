package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.OvershootInterpolator;
import android.view.animation.PathInterpolator;
import android.view.animation.ScaleAnimation;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Set;

public final class GMF {
    public int A00;
    public View.OnClickListener A01;
    public View A02;
    public ViewGroup A03;
    public ViewGroup A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgImageView A07;
    public GradientSpinnerAvatarView A08;
    public Integer A09;
    public String A0A;
    public Integer A0B = AnonymousClass05K.A00;
    public final Context A0C;
    public final Animation A0D;
    public final Animation A0E;
    public final Animation A0F;
    public final Animation A0G;
    public final AnonymousClass0iw A0H;
    public final UserSession A0I;
    public final Integer A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final Set A0N = DbS.A0y();
    public final AnonymousClass0eM A0O = AnonymousClass0eN.A01(new C58179Inj(this, 18));
    public final AnonymousClass0eM A0P = AnonymousClass0eN.A01(new C58179Inj(this, 19));
    public final 0eP A0Q;
    public final ValueAnimator A0R;

    public GMF(Context context, AnonymousClass0iw r28, UserSession userSession, Integer num, String str, String str2, String str3, 0eP r34) {
        this.A0C = context;
        this.A0I = userSession;
        this.A0M = str;
        this.A0H = r28;
        this.A0Q = r34;
        this.A0K = str2;
        this.A0L = str3;
        this.A0J = num;
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        alphaAnimation.setInterpolator(new OvershootInterpolator());
        alphaAnimation.setStartOffset(250);
        alphaAnimation.setDuration(350);
        this.A0D = alphaAnimation;
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setInterpolator(new OvershootInterpolator());
        scaleAnimation.setStartOffset(250);
        scaleAnimation.setDuration(350);
        this.A0E = scaleAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(200);
        this.A0F = alphaAnimation2;
        ScaleAnimation scaleAnimation2 = new ScaleAnimation(1.0f, 0.8f, 1.0f, 0.8f, 1, 0.5f, 1, 0.5f);
        scaleAnimation2.setDuration(200);
        this.A0G = scaleAnimation2;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.setDuration(200);
        ofFloat.setInterpolator(new PathInterpolator(0.17f, 0.17f, 0.0f, 1.0f));
        this.A0R = ofFloat;
    }

    public static final void A00(GMF gmf, Integer num) {
        ViewGroup viewGroup;
        AnonymousClass0eM r0;
        gmf.A0B = num;
        GradientSpinnerAvatarView gradientSpinnerAvatarView = gmf.A08;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setAlpha(1.0f);
        }
        IgTextView igTextView = gmf.A05;
        if (igTextView != null) {
            igTextView.setAlpha(1.0f);
        }
        IgImageView igImageView = gmf.A07;
        if (igImageView != null) {
            igImageView.setAlpha(1.0f);
        }
        IgTextView igTextView2 = gmf.A06;
        if (igTextView2 != null) {
            igTextView2.setAlpha(1.0f);
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gmf.A08;
        if (gradientSpinnerAvatarView2 != null) {
            gradientSpinnerAvatarView2.setRotation(0.0f);
        }
        IgImageView igImageView2 = gmf.A07;
        if (igImageView2 != null) {
            igImageView2.setRotation(0.0f);
        }
        ViewGroup viewGroup2 = gmf.A03;
        if (viewGroup2 != null) {
            0nA.A0f(viewGroup2, -2);
        }
        Integer num2 = gmf.A0B;
        Integer num3 = AnonymousClass05K.A00;
        GradientSpinnerAvatarView gradientSpinnerAvatarView3 = gmf.A08;
        if (num2 == num3) {
            if (gradientSpinnerAvatarView3 != null) {
                gradientSpinnerAvatarView3.setVisibility(0);
            }
            IgTextView igTextView3 = gmf.A05;
            if (igTextView3 != null) {
                igTextView3.setVisibility(0);
            }
            IgImageView igImageView3 = gmf.A07;
            if (igImageView3 != null) {
                igImageView3.setVisibility(8);
            }
            IgTextView igTextView4 = gmf.A06;
            if (igTextView4 != null) {
                igTextView4.setVisibility(8);
            }
            viewGroup = gmf.A04;
            if (viewGroup != null) {
                r0 = gmf.A0P;
            } else {
                return;
            }
        } else {
            if (gradientSpinnerAvatarView3 != null) {
                gradientSpinnerAvatarView3.setVisibility(8);
            }
            IgTextView igTextView5 = gmf.A05;
            if (igTextView5 != null) {
                igTextView5.setVisibility(8);
            }
            IgImageView igImageView4 = gmf.A07;
            if (igImageView4 != null) {
                igImageView4.setVisibility(0);
            }
            IgTextView igTextView6 = gmf.A06;
            if (igTextView6 != null) {
                igTextView6.setVisibility(0);
            }
            viewGroup = gmf.A04;
            if (viewGroup != null) {
                r0 = gmf.A0O;
            } else {
                return;
            }
        }
        0nA.A0Z(viewGroup, DbX.A07(r0));
    }

    public static final void A01(GMF gmf, Integer num) {
        ViewGroup viewGroup;
        AnonymousClass0eM r0;
        ViewGroup viewGroup2 = gmf.A03;
        if (viewGroup2 != null) {
            int width = viewGroup2.getWidth();
            ValueAnimator valueAnimator = gmf.A0R;
            if (!valueAnimator.isRunning()) {
                if (num == AnonymousClass05K.A00) {
                    GradientSpinnerAvatarView gradientSpinnerAvatarView = gmf.A08;
                    if (gradientSpinnerAvatarView != null) {
                        gradientSpinnerAvatarView.setVisibility(0);
                    }
                    IgTextView igTextView = gmf.A05;
                    if (igTextView != null) {
                        igTextView.setVisibility(0);
                    }
                    GradientSpinnerAvatarView gradientSpinnerAvatarView2 = gmf.A08;
                    if (gradientSpinnerAvatarView2 != null) {
                        gradientSpinnerAvatarView2.setRotation(54.000004f);
                    }
                    viewGroup = gmf.A04;
                    if (viewGroup != null) {
                        r0 = gmf.A0O;
                    }
                    valueAnimator.removeAllListeners();
                    valueAnimator.addUpdateListener(new I7u(gmf, num, width));
                    valueAnimator.addListener(new C62149Kb3(1, num, gmf));
                    valueAnimator.start();
                }
                IgImageView igImageView = gmf.A07;
                if (igImageView != null) {
                    igImageView.setVisibility(0);
                }
                IgTextView igTextView2 = gmf.A06;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                }
                IgImageView igImageView2 = gmf.A07;
                if (igImageView2 != null) {
                    igImageView2.setRotation(-54.000004f);
                }
                viewGroup = gmf.A04;
                if (viewGroup != null) {
                    r0 = gmf.A0P;
                }
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new I7u(gmf, num, width));
                valueAnimator.addListener(new C62149Kb3(1, num, gmf));
                valueAnimator.start();
                0nA.A0Z(viewGroup, DbX.A07(r0));
                valueAnimator.removeAllListeners();
                valueAnimator.addUpdateListener(new I7u(gmf, num, width));
                valueAnimator.addListener(new C62149Kb3(1, num, gmf));
                valueAnimator.start();
            }
        }
    }

    public final void A02(1iA r3, String str) {
        this.A0A = str;
        this.A09 = Integer.valueOf(r3.A00);
        Integer A0l = C51967G9n.A0l(00k.A0u(this.A0N, str) ? 1 : 0);
        if (A0l == this.A0B) {
            A00(this, A0l);
        } else {
            A01(this, A0l);
        }
    }
}
