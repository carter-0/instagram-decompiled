package X;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.mediaactions.LikeActionView;
import com.instagram.ui.widget.bannertoast.BannerToast;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.slidecontentlayout.SlideContentLayout;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import java.util.concurrent.CancellationException;

/* renamed from: X.6Jt  reason: invalid class name and case insensitive filesystem */
public final class C305836Jt extends C316016ky implements C316086l5, C316106l7 {
    public UserSession A00;
    public C270194gL A01;
    public C255773uh A02;
    public C250973mM A03;
    public C309426Yf A04;
    public C62118KaQ A05;
    public C62245Kcf A06;
    public LEJ A07;
    public L9Q A08;
    public C57106IOu A09;
    public C64872LjY A0A;
    public C62254Kco A0B;
    public LBL A0C;
    public C64874Lja A0D;
    public LGN A0E;
    public LEE A0F;
    public LA6 A0G;
    public LRB A0H;
    public C64705Lgb A0I;
    public C62267Kd1 A0J;
    public L5W A0K;
    public C64855LjH A0L;
    public C63821L8c A0M;
    public C63886LAp A0N;
    public LBM A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final View A0T;
    public final ViewGroup A0U;
    public final ViewGroup A0V;
    public final ConstraintLayout A0W;
    public final IgImageView A0X;
    public final C71662eb A0Y;
    public final C71662eb A0Z;
    public final C256033v7 A0a;
    public final IgProgressImageView A0b;
    public final JZR A0c;
    public final AnonymousClass6ZZ A0d;
    public final JZS A0e;
    public final C316116l8 A0f;
    public final C240913Nc A0g;
    public final LikeActionView A0h;
    public final RoundedCornerFrameLayout A0i;
    public final SlideContentLayout A0j;
    public final View A0k;
    public final View A0l;
    public final ViewGroup A0m;
    public final EditText A0n;
    public final FrameLayout A0o;
    public final TextView A0p;
    public final ConstraintLayout A0q;
    public final C71662eb A0r;
    public final C71662eb A0s;
    public final ScalingTextureView A0t;
    public final AnonymousClass0eM A0u = AnonymousClass1YB.A00(new C377079Kl(this, 42));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C305836Jt(View view, UserSession userSession, AnonymousClass6ZZ r10) {
        super(view);
        ViewStub viewStub;
        ViewStub viewStub2;
        ViewStub viewStub3;
        C64855LjH ljH;
        C71662eb r6;
        ScalingTextureView scalingTextureView;
        IgImageView igImageView;
        ViewStub viewStub4;
        0qQ.A0B(view, 1);
        this.A0d = r10;
        this.A00 = userSession;
        View findViewById = view.findViewById(R.id.iglive_reel_layout);
        0qQ.A07(findViewById);
        ViewGroup viewGroup = (ViewGroup) findViewById;
        this.A0V = viewGroup;
        this.A0c = new JZR(view);
        View findViewById2 = view.findViewById(R.id.reel_viewer_zero_rating_data_banner_stub);
        RoundedCornerFrameLayout roundedCornerFrameLayout = null;
        if (findViewById2 instanceof ViewStub) {
            viewStub = (ViewStub) findViewById2;
        } else {
            viewStub = null;
        }
        this.A0Z = new C71662eb(viewStub);
        View findViewById3 = view.findViewById(R.id.iglive_reactions_layout);
        0qQ.A07(findViewById3);
        this.A0T = findViewById3;
        this.A0k = view.findViewById(R.id.iglive_reactions_composer);
        this.A0n = (EditText) view.findViewById(R.id.comment_composer_edit_text);
        View findViewById4 = view.findViewById(R.id.iglive_label_row_layout);
        0qQ.A07(findViewById4);
        this.A0Q = findViewById4;
        View findViewById5 = view.findViewById(R.id.iglive_label_layout);
        0qQ.A07(findViewById5);
        this.A0q = (ConstraintLayout) findViewById5;
        View findViewById6 = view.findViewById(R.id.iglive_label);
        0qQ.A07(findViewById6);
        this.A0p = (TextView) findViewById6;
        View findViewById7 = findViewById4.findViewById(R.id.iglive_view_count_container);
        0qQ.A07(findViewById7);
        this.A0R = findViewById7;
        View findViewById8 = view.findViewById(R.id.iglive_permissions_container);
        0qQ.A07(findViewById8);
        this.A0m = (ViewGroup) findViewById8;
        View findViewById9 = view.findViewById(R.id.supporter_big_heart);
        0qQ.A07(findViewById9);
        this.A0h = (LikeActionView) findViewById9;
        this.A0g = C240903Nb.A00(view, R.id.iglive_expired_view_stub);
        View findViewById10 = view.findViewById(R.id.iglive_reel_content);
        0qQ.A07(findViewById10);
        this.A0P = findViewById10;
        View findViewById11 = view.findViewById(R.id.iglive_confetti_stub);
        if (findViewById11 instanceof ViewStub) {
            viewStub2 = (ViewStub) findViewById11;
        } else {
            viewStub2 = null;
        }
        this.A0r = new C71662eb(viewStub2);
        View findViewById12 = view.findViewById(R.id.iglive_userpay_animation_stub);
        if (findViewById12 instanceof ViewStub) {
            viewStub3 = (ViewStub) findViewById12;
        } else {
            viewStub3 = null;
        }
        this.A0Y = new C71662eb(viewStub3);
        if (C278264wZ.A05(this.A00)) {
            ljH = new C64855LjH(viewGroup, this.A00);
        } else {
            ljH = null;
        }
        this.A0L = ljH;
        ConstraintLayout constraintLayout = (ConstraintLayout) C240903Nb.A00(view, R.id.iglive_media_layout_stub).A00().findViewById(R.id.iglive_surface_view_frame);
        this.A0W = constraintLayout;
        this.A0i = (RoundedCornerFrameLayout) constraintLayout.findViewById(R.id.iglive_media_layout);
        this.A0j = (SlideContentLayout) view.findViewById(R.id.interactivity_question_sticker_container);
        this.A0X = this.A0i.findViewById(R.id.reel_viewer_broadcast_cover);
        if (!C263454Mb.A00(this.A00, "reel_live_viewer")) {
            View findViewById13 = this.A0i.findViewById(R.id.reel_viewer_texture_viewstub);
            if (findViewById13 instanceof ViewStub) {
                viewStub4 = (ViewStub) findViewById13;
            } else {
                viewStub4 = null;
            }
            r6 = new C71662eb(viewStub4);
        } else {
            r6 = null;
        }
        this.A0s = r6;
        this.A0e = new JZS(this.A0i);
        this.A0l = this.A0i.findViewById(R.id.reel_viewer_top_shadow);
        IgProgressImageView igProgressImageView = (IgProgressImageView) this.A0i.findViewById(R.id.reel_viewer_image_view);
        this.A0b = igProgressImageView;
        igProgressImageView.getIgImageView().setScaleType(ImageView.ScaleType.CENTER_CROP);
        IgProgressImageView igProgressImageView2 = this.A0b;
        Context context = view.getContext();
        igProgressImageView2.setPlaceHolderColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_stories_loading_background)));
        IgProgressImageView igProgressImageView3 = this.A0b;
        Drawable drawable = context.getDrawable(R.drawable.video_determinate_progress);
        0qQ.A0A(drawable);
        igProgressImageView3.setProgressBarDrawable(drawable);
        View findViewById14 = this.A0i.findViewById(R.id.media_cover_view_stub);
        0qQ.A0C(findViewById14, "null cannot be cast to non-null type android.view.ViewStub");
        this.A0a = C256013v5.A00((ViewStub) findViewById14);
        View findViewById15 = this.A0i.findViewById(R.id.media_url_share_interstitial_view_stub);
        0qQ.A0C(findViewById15, "null cannot be cast to non-null type android.view.ViewStub");
        this.A0f = new C316116l8((ViewStub) findViewById15);
        if (r6 != null) {
            scalingTextureView = (ScalingTextureView) r6.A01();
        } else {
            scalingTextureView = null;
        }
        this.A0t = scalingTextureView;
        this.A0U = viewGroup;
        this.A0o = C263454Mb.A00(this.A00, "reel_live_viewer") ? this.A0i : roundedCornerFrameLayout;
        C62254Kco kco = this.A0B;
        if (kco != null) {
            igImageView = kco.A0G;
        } else {
            igImageView = null;
        }
        this.A0S = igImageView;
    }

    /* JADX WARNING: type inference failed for: r0v54, types: [X.H80, android.text.TextWatcher] */
    public final void A02(AnonymousClass4DH r10, boolean z) {
        2Fk r1;
        C63821L8c l8c = this.A0M;
        if (l8c != null) {
            ((C60127Jg8) l8c.A03.getValue()).A01.A05(r10.getViewLifecycleOwner());
        }
        LEJ lej = this.A07;
        if (lej != null) {
            ((C60171Jgq) lej.A0B.getValue()).A00.A05(r10.getViewLifecycleOwner());
        }
        C62267Kd1 kd1 = this.A0J;
        if (kd1 != null) {
            kd1.A05(r10);
        }
        C57106IOu iOu = this.A09;
        if (iOu != null) {
            C262204Co r0 = iOu.A01;
            if (r0 != null) {
                r0.AG7((CancellationException) null);
            }
            iOu.A01 = null;
            AnonymousClass0eM r3 = iOu.A0G;
            ((C60291Jio) r3.getValue()).A01.A05(r10.getViewLifecycleOwner());
            C60291Jio jio = (C60291Jio) r3.getValue();
            jio.A0B.A0E.Epw(false);
            jio.A0F.Epw(new C61007Jv6((M0V) null, "", false, false, false));
            EditText editText = iOu.A07;
            editText.setOnFocusChangeListener((View.OnFocusChangeListener) null);
            editText.setOnClickListener((View.OnClickListener) null);
            editText.setOnEditorActionListener((TextView.OnEditorActionListener) null);
            editText.removeTextChangedListener(iOu.A0B);
            editText.setText("");
            editText.setHint(2131956343);
            Animator animator = iOu.A00;
            if (animator != null) {
                animator.removeAllListeners();
            }
            Animator animator2 = iOu.A00;
            if (animator2 != null) {
                animator2.cancel();
            }
        }
        LGN lgn = this.A0E;
        if (lgn != null) {
            lgn.A03();
        }
        C62254Kco kco = this.A0B;
        if (kco != null) {
            C60239Jhw jhw = kco.A01;
            if (!(jhw == null || (r1 = jhw.A00) == null)) {
                r1.A05(r10.getViewLifecycleOwner());
            }
            kco.A01 = null;
        }
        C63886LAp lAp = this.A0N;
        if (lAp != null) {
            C262204Co r02 = lAp.A00;
            if (r02 != null) {
                r02.AG7((CancellationException) null);
            }
            lAp.A00 = null;
            C60275JiW jiW = (C60275JiW) lAp.A07.getValue();
            LAV lav = jiW.A03;
            lav.A00 = null;
            lav.A01 = null;
            jiW.A04.A00 = null;
        }
        LBL lbl = this.A0C;
        if (lbl != null) {
            C262204Co r03 = lbl.A00;
            if (r03 != null) {
                r03.AG7((CancellationException) null);
            }
            lbl.A00 = null;
            C60277JiY jiY = (C60277JiY) lbl.A0D.getValue();
            C318136oS A002 = C318116oQ.A00(jiY);
            MGU mgu = new MGU(jiY, (AnonymousClass4D7) null, 5);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, mgu, A002);
            jiY.A03.A05.A08();
        }
        C62245Kcf kcf = this.A06;
        if (kcf != null) {
            C62289KdN kdN = kcf.A03;
            kdN.A04();
            kcf.A03.A04.A05(kcf.A04.getViewLifecycleOwner());
            if (!z) {
                C60437JlV jlV = kcf.A07;
                jlV.A06.clear();
                jlV.A01();
                kcf.A03.requestLayout();
                ((C240913Nc) kcf.A04.getValue()).A00().setVisibility(8);
                kdN.A04 = false;
                kdN.A02 = false;
                kdN.A03 = false;
                C262204Co r04 = kdN.A01;
                if (r04 != null) {
                    r04.AG7((CancellationException) null);
                }
                kdN.A01 = null;
                C262204Co r05 = kdN.A00;
                if (r05 != null) {
                    r05.AG7((CancellationException) null);
                }
                kdN.A00 = null;
            }
        }
        LEE lee = this.A0F;
        if (lee != null) {
            C262204Co r12 = lee.A00;
            if (r12 != null) {
                r12.AG7((CancellationException) null);
            }
            lee.A00 = null;
            ((C60196JhF) lee.A08.getValue()).A00.A05(lee.A03.getViewLifecycleOwner());
        }
        LA6 la6 = this.A0G;
        if (la6 != null) {
            C262204Co r13 = la6.A00;
            if (r13 != null) {
                r13.AG7((CancellationException) null);
            }
            la6.A00 = null;
            C60214JhX jhX = (C60214JhX) la6.A05.getValue();
            jhX.A01 = false;
            jhX.A00 = false;
        }
        L5W l5w = this.A0K;
        if (l5w != null) {
            C262204Co r14 = l5w.A00;
            if (r14 != null) {
                r14.AG7((CancellationException) null);
            }
            l5w.A00 = null;
        }
        C64874Lja lja = this.A0D;
        if (lja != null) {
            C262204Co r15 = lja.A00;
            if (r15 != null) {
                r15.AG7((CancellationException) null);
            }
            lja.A00 = null;
        }
        LBM lbm = this.A0O;
        if (lbm != null) {
            C60219Jhc jhc = (C60219Jhc) lbm.A09.getValue();
            C63885LAo lAo = jhc.A05;
            AnonymousClass1EO r06 = lAo.A00;
            if (r06 != null) {
                r06.cancel();
            }
            lAo.A00 = null;
            C262204Co r07 = jhc.A00;
            if (r07 != null) {
                r07.AG7((CancellationException) null);
            }
            jhc.A00 = null;
            C262204Co r08 = lbm.A02;
            if (r08 != null) {
                r08.AG7((CancellationException) null);
            }
            lbm.A02 = null;
        }
        C62118KaQ kaQ = this.A05;
        if (kaQ != null) {
            C60248Ji5 ji5 = (C60248Ji5) kaQ.A06.getValue();
            C262204Co r09 = ji5.A01;
            if (r09 != null) {
                r09.AG7((CancellationException) null);
            }
            ji5.A01 = null;
            C262204Co r010 = kaQ.A00;
            if (r010 != null) {
                r010.AG7((CancellationException) null);
            }
            kaQ.A00 = null;
        }
    }

    public final void DcL(C309426Yf r5, int i) {
        C255773uh r2;
        0qQ.A0B(r5, 0);
        C250973mM r3 = this.A03;
        if (r3 != null && (r2 = this.A02) != null && i == 2) {
            this.A0d.DO1(r2, r3, r5.A18);
        }
    }

    public final void A00() {
        JZS jzs = this.A0e;
        if (jzs != null) {
            jzs.A00().A08();
            jzs.A00().setVisibility(8);
        }
    }

    public final void A01() {
        JZS jzs = this.A0e;
        AnonymousClass0eM r1 = jzs.A03;
        if (((C240913Nc) r1.getValue()).A01()) {
            BannerToast bannerToast = (BannerToast) ((C240913Nc) r1.getValue()).A00();
            BannerToast.A00(bannerToast);
            2cs r0 = bannerToast.A00;
            r0.getClass();
            r0.A04();
        }
        jzs.A01.setVisibility(8);
        A00();
    }

    public final void A03(boolean z) {
        View view = this.A0T;
        int i = 0;
        int i2 = 8;
        if (z) {
            i2 = 0;
        }
        view.setVisibility(i2);
        C62254Kco kco = this.A0B;
        if (kco != null) {
            View view2 = kco.A03;
            if (!z) {
                i = 8;
            }
            view2.setVisibility(i);
        }
        0nA.A0N(view);
    }

    public final IgProgressImageView BGP() {
        return this.A0b;
    }

    public final C255773uh Bkg() {
        return this.A02;
    }

    public final FrameLayout Bkk() {
        return this.A0o;
    }

    public final ScalingTextureView C5p() {
        return this.A0t;
    }

    public final void ERT(float f) {
        View view = this.A0T;
        view.setVisibility(0);
        view.setAlpha(f);
    }
}
