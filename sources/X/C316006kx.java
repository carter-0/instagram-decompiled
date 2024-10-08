package X;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.reels.prompt.model.PromptStickerModel;
import com.instagram.reels.ui.badge.ReelBrandingBadgeView;
import com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView;
import com.instagram.reels.viewer.common.ReelViewGroup;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar;
import com.instagram.ui.widget.textureview.ScalingTextureView;
import com.instagram.xme.threed.view.IgGltfSceneLayoutView;

/* renamed from: X.6kx  reason: invalid class name and case insensitive filesystem */
public final class C316006kx extends C316016ky implements C316056l2, C316066l3, C316076l4, C316086l5, C316096l6, C316106l7 {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public ImageView A05;
    public C14880UDi A06;
    public C53149GjL A07;
    public C255773uh A08;
    public C250973mM A09;
    public AnonymousClass3BQ A0A;
    public AnonymousClass3PN A0B;
    public C309426Yf A0C;
    public ReelBrandingBadgeView A0D;
    public C317116mk A0E;
    public C317106mj A0F;
    public OEM A0G;
    public C317096mi A0H;
    public C317286n1 A0I;
    public boolean A0J;
    public boolean A0K;
    public final int A0L;
    public final Rect A0M;
    public final View A0N;
    public final View A0O;
    public final View A0P;
    public final View A0Q;
    public final View A0R;
    public final View A0S;
    public final View A0T;
    public final View A0U;
    public final ViewStub A0V;
    public final ViewStub A0W;
    public final ViewStub A0X;
    public final ViewStub A0Y;
    public final ViewStub A0Z;
    public final ViewStub A0a;
    public final ViewStub A0b;
    public final TextView A0c;
    public final TextView A0d;
    public final UserSession A0e;
    public final C256003v4 A0f;
    public final IgImageView A0g;
    public final C71662eb A0h;
    public final C71662eb A0i;
    public final C71662eb A0j;
    public final C71662eb A0k;
    public final C71662eb A0l;
    public final C71662eb A0m;
    public final C71662eb A0n;
    public final C71662eb A0o;
    public final C71662eb A0p;
    public final C71662eb A0q;
    public final C252063oV A0r;
    public final C252063oV A0s;
    public final C252063oV A0t;
    public final C252063oV A0u;
    public final C252063oV A0v;
    public final C252063oV A0w;
    public final C252063oV A0x;
    public final C252063oV A0y;
    public final C252063oV A0z;
    public final C252063oV A10;
    public final C252063oV A11;
    public final C256033v7 A12;
    public final C316756mA A13;
    public final C265804Wi A14;
    public final C316736m8 A15;
    public final C316746m9 A16;
    public final C316986mX A17;
    public final C317546nR A18;
    public final C316706m5 A19;
    public final C317016ma A1A;
    public final C316956mU A1B;
    public final C316956mU A1C;
    public final C316956mU A1D;
    public final C316956mU A1E;
    public final C316946mT A1F;
    public final C316946mT A1G;
    public final C316946mT A1H;
    public final C316996mY A1I;
    public final C316766mB A1J;
    public final C316846mJ A1K;
    public final C316836mI A1L;
    public final C316826mH A1M;
    public final C265864Wp A1N;
    public final C265844Wn A1O;
    public final C316906mP A1P;
    public final C316916mQ A1Q;
    public final C316896mO A1R;
    public final C316926mR A1S;
    public final AnonymousClass4X0 A1T;
    public final C265924Wv A1U;
    public final ReelAvatarWithBadgeView A1V;
    public final C316886mN A1W;
    public final C316976mW A1X;
    public final C316716m6 A1Y;
    public final C317086mh A1Z;
    public final C316866mL A1a;
    public final C317536nQ A1b;
    public final C316726m7 A1c;
    public final C316936mS A1d;
    public final C316136lA A1e;
    public final C316116l8 A1f;
    public final C316966mV A1g;
    public final C316876mM A1h;
    public final C316856mK A1i;
    public final C316276lO A1j;
    public final ReelViewGroup A1k;
    public final C317066mf A1l;
    public final C317036mc A1m;
    public final C317026mb A1n;
    public final C317046md A1o;
    public final MediaFrameLayout A1p;
    public final RoundedCornerFrameLayout A1q;
    public final SegmentedProgressBar A1r;
    public final IgGltfSceneLayoutView A1s;
    public final Runnable A1t;
    public final AnonymousClass0eM A1u;

    /* JADX WARNING: type inference failed for: r0v156, types: [X.6m9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v159, types: [X.6mA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v107, types: [X.6mh, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C316006kx(android.view.View r21, com.instagram.common.session.UserSession r22) {
        /*
            r20 = this;
            r7 = 1
            r4 = r21
            X.0qQ.A0B(r4, r7)
            r2 = r20
            r2.<init>(r4)
            r2.A0S = r4
            r5 = r22
            r2.A0e = r5
            r0 = 2131435899(0x7f0b217b, float:1.8493653E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.3v7 r0 = X.C256013v5.A00(r0)
            r2.A12 = r0
            r0 = 2131436048(0x7f0b2210, float:1.8493955E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6l8 r0 = new X.6l8
            r0.<init>(r1)
            r2.A1f = r0
            r0 = 2131439662(0x7f0b302e, float:1.8501285E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            r12 = 0
            if (r0 == 0) goto L_0x07c9
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0041:
            X.2eb r6 = new X.2eb
            r6.<init>(r1)
            r2.A0n = r6
            r0 = 2131439706(0x7f0b305a, float:1.8501375E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07c6
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0055:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r2.A0o = r0
            r0 = 2131436016(0x7f0b21f0, float:1.849389E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r3 = 0
            X.3v4 r0 = new X.3v4
            r0.<init>(r1, r3)
            r2.A0f = r0
            X.6l9 r0 = X.C316126l9.A00
            r6.A02 = r0
            r0 = 2131443711(0x7f0b3fff, float:1.8509498E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.1NN r0 = X.1NM.A00(r5)
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            X.3oV r0 = X.2b1.A01(r1, r0, r3)
            r2.A11 = r0
            r0 = 2131433839(0x7f0b196f, float:1.8489475E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.1NN r0 = X.1NM.A00(r5)
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            X.3oV r0 = X.2b1.A01(r1, r0, r3)
            r2.A0v = r0
            r0 = 2131441951(0x7f0b391f, float:1.8505928E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            android.view.View r1 = r0.inflate()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar"
            X.0qQ.A0C(r1, r0)
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r1 = (com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar) r1
            r2.A1r = r1
            r0 = 2131428529(0x7f0b04b1, float:1.8478705E38)
            android.view.View r8 = r4.requireViewById(r0)
            r2.A0N = r8
            android.content.Context r6 = r4.getContext()
            boolean r1 = X.0mk.A02(r6)
            r0 = 2131239778(0x7f082362, float:1.8095873E38)
            if (r1 == 0) goto L_0x00ce
            r0 = 2131239779(0x7f082363, float:1.8095875E38)
        L_0x00ce:
            r8.setBackgroundResource(r0)
            r0 = 2131439472(0x7f0b2f70, float:1.85009E38)
            android.view.View r9 = r4.requireViewById(r0)
            X.0qQ.A07(r9)
            androidx.constraintlayout.widget.ConstraintLayout r9 = (androidx.constraintlayout.widget.ConstraintLayout) r9
            r0 = 2131439462(0x7f0b2f66, float:1.850088E38)
            android.view.View r8 = r4.requireViewById(r0)
            X.0qQ.A07(r8)
            android.view.ViewStub r8 = (android.view.ViewStub) r8
            r0 = 2131435432(0x7f0b1fa8, float:1.8492706E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            com.instagram.ui.mediaactions.LikeActionView r1 = (com.instagram.ui.mediaactions.LikeActionView) r1
            X.6lA r0 = new X.6lA
            r0.<init>(r8, r9, r5, r1)
            r2.A1e = r0
            r0 = 2131439665(0x7f0b3031, float:1.8501292E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout r0 = (com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout) r0
            r2.A1q = r0
            r0 = 2131439628(0x7f0b300c, float:1.8501217E38)
            android.view.View r8 = r4.requireViewById(r0)
            com.instagram.reels.viewer.common.ReelViewGroup r8 = (com.instagram.reels.viewer.common.ReelViewGroup) r8
            r2.A1k = r8
            java.lang.String r0 = "reel_viewer"
            boolean r0 = X.C263454Mb.A00(r5, r0)
            if (r0 != 0) goto L_0x07c3
            r0 = 2131439722(0x7f0b306a, float:1.8501407E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07c0
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0127:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
        L_0x012c:
            r2.A0p = r0
            r0 = 2131439291(0x7f0b2ebb, float:1.8500533E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07bd
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x013b:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r2.A0k = r0
            r0 = 2131432960(0x7f0b1600, float:1.8487692E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07ba
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x014f:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r2.A0l = r0
            r0 = 2131439443(0x7f0b2f53, float:1.8500841E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07b7
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0163:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r2.A0m = r0
            r0 = 2131439727(0x7f0b306f, float:1.8501417E38)
            android.view.View r0 = r4.requireViewById(r0)
            r2.A0U = r0
            r0 = 2131439643(0x7f0b301b, float:1.8501247E38)
            android.view.View r14 = r4.requireViewById(r0)
            r2.A0O = r14
            r0 = 2131439656(0x7f0b3028, float:1.8501273E38)
            android.view.View r0 = r4.requireViewById(r0)
            r2.A0Q = r0
            r0 = 2131439655(0x7f0b3027, float:1.8501271E38)
            android.view.View r0 = r4.requireViewById(r0)
            r2.A0P = r0
            r0 = 2131438523(0x7f0b2bbb, float:1.8498975E38)
            android.view.View r0 = r4.requireViewById(r0)
            r2.A0R = r0
            r0 = 2131439687(0x7f0b3047, float:1.8501336E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView r0 = (com.instagram.reels.ui.views.reelavatar.view.ReelAvatarWithBadgeView) r0
            r2.A1V = r0
            android.widget.ImageView$ScaleType r11 = android.widget.ImageView.ScaleType.CENTER_CROP
            r0.setScaleType(r11)
            r0 = 2131439650(0x7f0b3022, float:1.8501261E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.1NN r0 = X.1NM.A00(r5)
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            X.3oV r0 = X.2b1.A01(r1, r0, r3)
            r2.A0r = r0
            r0 = 2131439720(0x7f0b3068, float:1.8501403E38)
            android.view.View r0 = r4.requireViewById(r0)
            r2.A0T = r0
            r0 = 2131439724(0x7f0b306c, float:1.8501411E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.A0d = r0
            r0 = 2131439723(0x7f0b306b, float:1.850141E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r2.A0c = r0
            r0 = 2131439719(0x7f0b3067, float:1.8501401E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r3, r3)
            r2.A10 = r0
            X.6lO r0 = new X.6lO
            r0.<init>(r4)
            r2.A1j = r0
            r0 = 2131432359(0x7f0b13a7, float:1.8486473E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.1NN r0 = X.1NM.A00(r5)
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            X.3oV r0 = X.2b1.A01(r1, r0, r3)
            r2.A0u = r0
            r0 = 2131439663(0x7f0b302f, float:1.8501287E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.ui.widget.framelayout.MediaFrameLayout r0 = (com.instagram.ui.widget.framelayout.MediaFrameLayout) r0
            r2.A1p = r0
            r0 = 2131433595(0x7f0b187b, float:1.848898E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.xme.threed.view.IgGltfSceneLayoutView r0 = (com.instagram.xme.threed.view.IgGltfSceneLayoutView) r0
            r2.A1s = r0
            r10 = 8
            r0.setVisibility(r10)
            com.instagram.feed.widget.IgProgressImageView r0 = r2.BGP()
            com.instagram.common.ui.widget.imageview.IgImageView r0 = r0.getIgImageView()
            r0.setScaleType(r11)
            com.instagram.feed.widget.IgProgressImageView r1 = r2.BGP()
            r0 = 2130970328(0x7f0406d8, float:1.7549363E38)
            int r0 = X.2Yu.A0H(r6, r0)
            int r0 = r6.getColor(r0)
            r1.setPlaceHolderColor((int) r0)
            com.instagram.feed.widget.IgProgressImageView r1 = r2.BGP()
            r0 = 2131240282(0x7f08255a, float:1.8096895E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            java.lang.String r9 = "Required value was null."
            if (r0 == 0) goto L_0x07d2
            r1.setProgressBarDrawable(r0)
            com.instagram.feed.widget.IgProgressImageView r1 = r2.BGP()
            r0 = 2131240284(0x7f08255c, float:1.8096899E38)
            android.graphics.drawable.Drawable r0 = r6.getDrawable(r0)
            if (r0 == 0) goto L_0x07cc
            r1.setIndeterminateProgressBarDrawable(r0)
            r0 = 2131439660(0x7f0b302c, float:1.8501281E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r2.A0g = r0
            r0.setVisibility(r10)
            r0.setScaleType(r11)
            r0 = 2131439728(0x7f0b3070, float:1.850142E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07b4
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0280:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r2.A0q = r0
            r0 = 2131439444(0x7f0b2f54, float:1.8500843E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r2.A0Z = r0
            r0 = 2131430334(0x7f0b0bbe, float:1.8482366E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r2.A0Y = r0
            r0 = 2131437286(0x7f0b26e6, float:1.8496466E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07b1
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x02aa:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r2.A0j = r0
            r0 = 2131429509(0x7f0b0885, float:1.8480693E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r3, r3)
            r2.A0s = r0
            r0 = 2131439428(0x7f0b2f44, float:1.850081E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r2.A0b = r0
            r0 = 2131439426(0x7f0b2f42, float:1.8500807E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r2.A0W = r0
            r0 = 2131438249(0x7f0b2aa9, float:1.849842E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07ae
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x02e1:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r2.A0i = r0
            r0 = 2131438248(0x7f0b2aa8, float:1.8498418E38)
            android.view.View r1 = r4.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07ab
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x02f5:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r2.A0h = r0
            r0 = 2131432628(0x7f0b14b4, float:1.8487019E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r2.A0a = r0
            r0 = 2131429075(0x7f0b06d3, float:1.8479812E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r2.A0X = r0
            r0 = 2131439388(0x7f0b2f1c, float:1.850073E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.6m5 r0 = new X.6m5
            r0.<init>(r1)
            r2.A19 = r0
            r0 = 2131439414(0x7f0b2f36, float:1.8500782E38)
            android.view.View r9 = r4.findViewById(r0)
            boolean r0 = r9 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07a8
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x0331:
            X.2eb r1 = new X.2eb
            r1.<init>(r9)
            X.6m6 r0 = new X.6m6
            r0.<init>(r1)
            r2.A1Y = r0
            r0 = 2131439603(0x7f0b2ff3, float:1.8501166E38)
            android.view.View r9 = r4.findViewById(r0)
            boolean r0 = r9 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07a5
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x034a:
            X.2eb r1 = new X.2eb
            r1.<init>(r9)
            X.6m7 r0 = new X.6m7
            r0.<init>(r1)
            r2.A1c = r0
            r0 = 2131439359(0x7f0b2eff, float:1.850067E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            X.6m8 r0 = new X.6m8
            r0.<init>(r1)
            r2.A15 = r0
            r0 = 2131439549(0x7f0b2fbd, float:1.8501056E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.4Wn r0 = new X.4Wn
            r0.<init>(r1)
            r2.A1O = r0
            r0 = 2131439550(0x7f0b2fbe, float:1.8501058E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.4Wp r0 = new X.4Wp
            r0.<init>(r1)
            r2.A1N = r0
            r0 = 2131439367(0x7f0b2f07, float:1.8500687E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            X.6m9 r0 = new X.6m9
            r0.<init>()
            r0.A00 = r1
            r2.A16 = r0
            r0 = 2131428810(0x7f0b05ca, float:1.8479275E38)
            android.view.View r9 = r4.findViewById(r0)
            boolean r0 = r9 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x07a2
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x03aa:
            X.2eb r1 = new X.2eb
            r1.<init>(r9)
            X.6mA r0 = new X.6mA
            r0.<init>()
            r0.A00 = r1
            r2.A13 = r0
            r0 = 2131439570(0x7f0b2fd2, float:1.8501099E38)
            android.view.View r9 = r4.findViewById(r0)
            boolean r0 = r9 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x079f
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x03c5:
            X.2eb r1 = new X.2eb
            r1.<init>(r9)
            X.6nQ r0 = new X.6nQ
            r0.<init>(r1)
            r2.A1b = r0
            r0 = 2131439566(0x7f0b2fce, float:1.850109E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.4X0 r0 = new X.4X0
            r0.<init>(r6, r1)
            r2.A1T = r0
            r0 = 2131439435(0x7f0b2f4b, float:1.8500825E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r9 = X.2b1.A01(r0, r3, r3)
            r0 = 2131443002(0x7f0b3d3a, float:1.850806E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            X.6mB r0 = new X.6mB
            r0.<init>(r6, r1, r9)
            r2.A1J = r0
            r0 = 2131439492(0x7f0b2f84, float:1.850094E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.6mH r0 = new X.6mH
            r0.<init>(r6, r1)
            r2.A1M = r0
            r0 = 2131439382(0x7f0b2f16, float:1.8500718E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.6nR r0 = new X.6nR
            r0.<init>(r1)
            r2.A18 = r0
            r0 = 2131439486(0x7f0b2f7e, float:1.8500928E38)
            android.view.View r9 = r4.findViewById(r0)
            boolean r0 = r9 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x079c
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x0430:
            X.2eb r1 = new X.2eb
            r1.<init>(r9)
            X.6mI r0 = new X.6mI
            r0.<init>(r1)
            r2.A1L = r0
            r0 = 2131439487(0x7f0b2f7f, float:1.850093E38)
            android.view.View r9 = r4.findViewById(r0)
            boolean r0 = r9 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0799
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x0449:
            X.2eb r1 = new X.2eb
            r1.<init>(r9)
            X.6mJ r0 = new X.6mJ
            r0.<init>(r6, r1)
            r2.A1K = r0
            r0 = 2131439579(0x7f0b2fdb, float:1.8501117E38)
            android.view.View r9 = r4.findViewById(r0)
            boolean r0 = r9 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0796
            android.view.ViewStub r9 = (android.view.ViewStub) r9
        L_0x0462:
            X.2eb r1 = new X.2eb
            r1.<init>(r9)
            X.6mK r0 = new X.6mK
            r0.<init>(r6, r1)
            r2.A1i = r0
            r0 = 2131439575(0x7f0b2fd7, float:1.850111E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.4Wv r0 = new X.4Wv
            r0.<init>(r1)
            r2.A1U = r0
            X.4Wi r0 = new X.4Wi
            r0.<init>(r4)
            r2.A14 = r0
            r0 = 2131439493(0x7f0b2f85, float:1.8500943E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mL r0 = new X.6mL
            r0.<init>(r1)
            r2.A1a = r0
            r0 = 2131439494(0x7f0b2f86, float:1.8500945E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mM r0 = new X.6mM
            r0.<init>(r1)
            r2.A1h = r0
            r0 = 2131439587(0x7f0b2fe3, float:1.8501133E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.1NN r0 = X.1NM.A00(r5)
            boolean r0 = r0.A01()
            r0 = r0 ^ 1
            X.3oV r0 = X.2b1.A01(r1, r0, r3)
            r2.A0w = r0
            r0 = 2131439624(0x7f0b3008, float:1.8501208E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.6mN r0 = new X.6mN
            r0.<init>(r1)
            r2.A1W = r0
            r0 = 2131439564(0x7f0b2fcc, float:1.8501087E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mO r0 = new X.6mO
            r0.<init>(r8, r1, r5)
            r2.A1R = r0
            r0 = 2131439490(0x7f0b2f82, float:1.8500937E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mP r0 = new X.6mP
            r0.<init>(r1, r8)
            r2.A1P = r0
            r0 = 2131439563(0x7f0b2fcb, float:1.8501085E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mQ r0 = new X.6mQ
            r0.<init>(r1, r8)
            r2.A1Q = r0
            r0 = 2131439605(0x7f0b2ff5, float:1.850117E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mR r0 = new X.6mR
            r0.<init>(r1, r8)
            r2.A1S = r0
            r0 = 2131439606(0x7f0b2ff6, float:1.8501172E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.6mS r0 = new X.6mS
            r0.<init>(r1)
            r2.A1d = r0
            r0 = 2131439471(0x7f0b2f6f, float:1.8500898E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mT r0 = new X.6mT
            r0.<init>(r1)
            r2.A1H = r0
            r0 = 2131439697(0x7f0b3051, float:1.8501356E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mU r0 = new X.6mU
            r0.<init>(r1)
            r2.A1D = r0
            r0 = 2131439445(0x7f0b2f55, float:1.8500845E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mT r0 = new X.6mT
            r0.<init>(r1)
            r2.A1G = r0
            r0 = 2131439651(0x7f0b3023, float:1.8501263E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mU r0 = new X.6mU
            r0.<init>(r1)
            r2.A1C = r0
            r0 = 2131439440(0x7f0b2f50, float:1.8500835E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mT r0 = new X.6mT
            r0.<init>(r1)
            r2.A1F = r0
            r0 = 2131439639(0x7f0b3017, float:1.8501239E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mU r0 = new X.6mU
            r0.<init>(r1)
            r2.A1B = r0
            r0 = 2131439702(0x7f0b3056, float:1.8501367E38)
            android.view.View r1 = r4.requireViewById(r0)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mU r0 = new X.6mU
            r0.<init>(r1)
            r2.A1E = r0
            r0 = 2131439692(0x7f0b304c, float:1.8501346E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mV r0 = new X.6mV
            r0.<init>(r1)
            r2.A1g = r0
            r0 = 2131439642(0x7f0b301a, float:1.8501245E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.6mW r0 = new X.6mW
            r0.<init>(r1)
            r2.A1X = r0
            r0 = 2131441905(0x7f0b38f1, float:1.8505835E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r3, r3)
            r2.A0z = r0
            r0 = 2131441904(0x7f0b38f0, float:1.8505833E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r3, r3)
            r2.A0x = r0
            r0 = 2131441887(0x7f0b38df, float:1.8505798E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r3, r3)
            r2.A0y = r0
            r0 = 2131439472(0x7f0b2f70, float:1.85009E38)
            android.view.View r15 = r4.requireViewById(r0)
            X.0qQ.A07(r15)
            android.view.ViewGroup r15 = (android.view.ViewGroup) r15
            r0 = 2131441948(0x7f0b391c, float:1.8505922E38)
            android.view.View r8 = r4.requireViewById(r0)
            X.0qQ.A07(r8)
            android.view.ViewGroup r8 = (android.view.ViewGroup) r8
            r0 = 2131441887(0x7f0b38df, float:1.8505798E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            r0 = 2131441878(0x7f0b38d6, float:1.850578E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.0qQ.A07(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            X.6mX r13 = new X.6mX
            r19 = r5
            r16 = r8
            r17 = r1
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)
            r2.A17 = r13
            r0 = 2131439450(0x7f0b2f5a, float:1.8500855E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.6mY r0 = new X.6mY
            r0.<init>(r1)
            r2.A1I = r0
            X.0Tu r8 = X.0Tu.A05
            r0 = 36328190599248952(0x81104c00003c38, double:3.037432244622624E-306)
            boolean r0 = X.182.A06(r8, r5, r0)
            if (r0 == 0) goto L_0x0788
            r1 = 44
            X.9Kl r0 = new X.9Kl
            r0.<init>(r2, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r2.A1u = r0
        L_0x0659:
            r0 = 2131439423(0x7f0b2f3f, float:1.85008E38)
            android.view.View r8 = r4.findViewById(r0)
            boolean r0 = r8 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0785
            android.view.ViewStub r8 = (android.view.ViewStub) r8
        L_0x0666:
            X.2eb r1 = new X.2eb
            r1.<init>(r8)
            X.6ma r0 = new X.6ma
            r0.<init>(r1)
            r2.A1A = r0
            r0 = 2131439546(0x7f0b2fba, float:1.850105E38)
            android.view.View r8 = r4.findViewById(r0)
            boolean r0 = r8 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0782
            android.view.ViewStub r8 = (android.view.ViewStub) r8
        L_0x067f:
            X.2eb r1 = new X.2eb
            r1.<init>(r8)
            X.6mb r0 = new X.6mb
            r0.<init>(r5, r1)
            r2.A1n = r0
            r0 = 2131439545(0x7f0b2fb9, float:1.8501048E38)
            android.view.View r8 = r4.findViewById(r0)
            boolean r0 = r8 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x077f
            android.view.ViewStub r8 = (android.view.ViewStub) r8
        L_0x0698:
            X.2eb r1 = new X.2eb
            r1.<init>(r8)
            X.6mc r0 = new X.6mc
            r0.<init>(r1)
            r2.A1m = r0
            r0 = 2131439595(0x7f0b2feb, float:1.850115E38)
            android.view.View r8 = r4.findViewById(r0)
            boolean r0 = r8 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x077c
            android.view.ViewStub r8 = (android.view.ViewStub) r8
        L_0x06b1:
            X.2eb r1 = new X.2eb
            r1.<init>(r8)
            X.6md r0 = new X.6md
            r0.<init>(r1)
            r2.A1o = r0
            r0 = 2131439541(0x7f0b2fb5, float:1.850104E38)
            android.view.View r8 = r4.findViewById(r0)
            boolean r0 = r8 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x0779
            android.view.ViewStub r8 = (android.view.ViewStub) r8
        L_0x06ca:
            X.2eb r1 = new X.2eb
            r1.<init>(r8)
            X.6mf r0 = new X.6mf
            r0.<init>(r1)
            r2.A1l = r0
            boolean r0 = X.1NM.A02(r5)
            if (r0 == 0) goto L_0x06ef
            r0 = 2131441952(0x7f0b3920, float:1.850593E38)
            android.view.View r1 = r4.requireViewById(r0)
            X.0qQ.A07(r1)
            android.view.ViewStub r1 = (android.view.ViewStub) r1
            X.OEM r0 = new X.OEM
            r0.<init>(r1)
            r2.A0G = r0
        L_0x06ef:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.A0M = r0
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r1 = r1.getDimensionPixelSize(r0)
            X.6mg r0 = new X.6mg
            r0.<init>(r2, r1)
            r2.A1t = r0
            r0 = 2131439433(0x7f0b2f49, float:1.850082E38)
            android.view.View r5 = r4.requireViewById(r0)
            X.0qQ.A07(r5)
            android.view.ViewStub r5 = (android.view.ViewStub) r5
            X.0qQ.A0B(r5, r7)
            X.6mh r1 = new X.6mh
            r1.<init>()
            X.2eb r0 = new X.2eb
            r0.<init>(r5)
            r1.A01 = r0
            r2.A1Z = r1
            android.content.res.Resources r1 = r6.getResources()
            r0 = 2131165213(0x7f07001d, float:1.7944637E38)
            float r0 = r1.getDimension(r0)
            int r0 = (int) r0
            r2.A0L = r0
            r0 = 2131439630(0x7f0b300e, float:1.850122E38)
            android.view.View r0 = r4.requireViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r2.A0V = r0
            r0 = 2131439695(0x7f0b304f, float:1.8501352E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.6mi r0 = new X.6mi
            r0.<init>(r1)
            r2.A0H = r0
            r0 = 2131439694(0x7f0b304e, float:1.850135E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r1 = X.2b1.A01(r0, r3, r3)
            X.6mj r0 = new X.6mj
            r0.<init>(r1)
            r2.A0F = r0
            r0 = 2131431397(0x7f0b0fe5, float:1.8484522E38)
            android.view.View r0 = r4.requireViewById(r0)
            r2.A02 = r0
            r0 = 2131432458(0x7f0b140a, float:1.8486674E38)
            android.view.View r0 = r4.requireViewById(r0)
            X.3oV r0 = X.2b1.A01(r0, r3, r3)
            r2.A0t = r0
            return
        L_0x0779:
            r8 = r12
            goto L_0x06ca
        L_0x077c:
            r8 = r12
            goto L_0x06b1
        L_0x077f:
            r8 = r12
            goto L_0x0698
        L_0x0782:
            r8 = r12
            goto L_0x067f
        L_0x0785:
            r8 = r12
            goto L_0x0666
        L_0x0788:
            X.6Ut r1 = new X.6Ut
            r1.<init>(r4)
            X.1Ue r0 = new X.1Ue
            r0.<init>(r1)
            r2.A1u = r0
            goto L_0x0659
        L_0x0796:
            r9 = r12
            goto L_0x0462
        L_0x0799:
            r9 = r12
            goto L_0x0449
        L_0x079c:
            r9 = r12
            goto L_0x0430
        L_0x079f:
            r9 = r12
            goto L_0x03c5
        L_0x07a2:
            r9 = r12
            goto L_0x03aa
        L_0x07a5:
            r9 = r12
            goto L_0x034a
        L_0x07a8:
            r9 = r12
            goto L_0x0331
        L_0x07ab:
            r1 = r12
            goto L_0x02f5
        L_0x07ae:
            r1 = r12
            goto L_0x02e1
        L_0x07b1:
            r1 = r12
            goto L_0x02aa
        L_0x07b4:
            r1 = r12
            goto L_0x0280
        L_0x07b7:
            r1 = r12
            goto L_0x0163
        L_0x07ba:
            r1 = r12
            goto L_0x014f
        L_0x07bd:
            r1 = r12
            goto L_0x013b
        L_0x07c0:
            r1 = r12
            goto L_0x0127
        L_0x07c3:
            r0 = r12
            goto L_0x012c
        L_0x07c6:
            r1 = r12
            goto L_0x0055
        L_0x07c9:
            r1 = r12
            goto L_0x0041
        L_0x07cc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        L_0x07d2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C316006kx.<init>(android.view.View, com.instagram.common.session.UserSession):void");
    }

    public final void DcL(C309426Yf r8, int i) {
        C250973mM r0;
        String str;
        0qQ.A0B(r8, 0);
        if (i == 1) {
            this.A1r.setProgress(r8.A0B);
        } else if (i == 2) {
            C255773uh r4 = this.A08;
            if (r4 == null) {
                C250973mM r1 = this.A09;
                if (r1 != null) {
                    r4 = r1.A08(this.A0e);
                    0wb.A03("STORIES_ORGANIC_ITEM_VIEWABILITY_CHANGED", 002.A0R("ReelItem was null, so used current item from viewModel ", r4.A0e.name()));
                } else {
                    0wb.A03("STORIES_ORGANIC_ITEM_VIEWABILITY_CHANGED", "Both ReelItem and reelViewModel are null");
                    return;
                }
            }
            C317116mk r3 = this.A0E;
            if (r3 != null) {
                C250973mM r12 = this.A09;
                if (r12 != null) {
                    r3.DzT(r4, r12, r8.A18);
                    AnonymousClass4X0 r6 = this.A1T;
                    boolean z = r8.A18;
                    UserSession userSession = this.A0e;
                    0qQ.A0B(userSession, 1);
                    if (r6.A0C && z && 182.A06(0Tu.A05, userSession, 36324316539006954L)) {
                        PromptStickerModel promptStickerModel = r6.A0B;
                        if (promptStickerModel == null) {
                            str = "model";
                        } else {
                            C354808Nl r02 = r6.A0A;
                            if (r02 == null) {
                                str = "sticker";
                            } else {
                                AnonymousClass4X0.A01(userSession, r6, r02, promptStickerModel);
                            }
                        }
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    this.A1J.A05(userSession, r4, r8.A18, false);
                    C316996mY r13 = this.A1I;
                    if (r8.A18 && !r13.A00) {
                        ValueAnimator valueAnimator = r13.A01;
                        if (!valueAnimator.isStarted() && !valueAnimator.isRunning()) {
                            valueAnimator.start();
                        }
                    }
                    0Tu r2 = 0Tu.A05;
                    if ((182.A06(r2, userSession, 36324926424101351L) || 182.A06(r2, userSession, 36324926424232425L)) && (r0 = this.A09) != null) {
                        int A032 = r0.A03(userSession, r4);
                        0xY AR4 = 1Au.A00(userSession).A01.AR4();
                        AR4.E5Z("current_story_owner_story_index", A032);
                        AR4.apply();
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
    }

    public final void A00() {
        ReelAvatarWithBadgeView reelAvatarWithBadgeView = this.A1V;
        reelAvatarWithBadgeView.A01.A09();
        C252063oV r1 = reelAvatarWithBadgeView.A02;
        if (r1.CVM()) {
            r1.getView().A09();
        }
        this.A0d.setText("");
        this.A0c.setText("");
        this.A08 = null;
        this.A0C = null;
        this.A09 = null;
        this.A0B = null;
        BGP().A04();
        this.A0g.A09();
        this.A1r.setProgress(0.0f);
        C316136lA r2 = this.A1e;
        r2.A1L.setText("");
        TextView textView = r2.A1K;
        textView.setText("");
        textView.setCompoundDrawablesRelative((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        r2.A1R.A03(8);
        r2.A17.setVisibility(8);
        r2.A1Q.A03(8);
        r2.A1a.setVisibility(8);
        r2.A1b.setVisibility(8);
        r2.A1d.setVisibility(8);
        r2.A1P.A03(8);
        r2.A1T.A03(8);
        C316156lC r0 = r2.A1m;
        if (r0 != null) {
            r0.A01();
        }
    }

    public final C74500Pvu AjF() {
        return this.A1e.AjF();
    }

    public final IgProgressImageView BGP() {
        View requireViewById = this.A0S.requireViewById(R.id.reel_viewer_image_view);
        0qQ.A07(requireViewById);
        return (IgProgressImageView) requireViewById;
    }

    public final C255773uh Bkg() {
        return this.A08;
    }

    public final FrameLayout Bkk() {
        return this.A1p;
    }

    public final View Bkr() {
        C265864Wp r2 = this.A1N;
        View view = null;
        if (!r2.A09.CVM() || (view = r2.A00) != null) {
            return view;
        }
        0qQ.A0F("stickerContainerView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final ViewGroup Bks() {
        return this.A1O.A02;
    }

    public final ScalingTextureView C5p() {
        C71662eb r0 = this.A0p;
        if (r0 != null) {
            return (ScalingTextureView) r0.A01();
        }
        return null;
    }

    public final void DPI(boolean z) {
        this.A1e.A1o.A01(this.A0e, this.A08, this.A09, z);
        C316766mB r4 = this.A1J;
        if (r4.A0N.CFV() == 0) {
            r4.A03 = 0;
            r4.A01 = 0;
            IgTextView igTextView = r4.A08;
            String str = "scoreView";
            if (igTextView != null) {
                igTextView.setText(String.valueOf(0));
                IgTextView igTextView2 = r4.A08;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(0);
                    IgFrameLayout igFrameLayout = r4.A04;
                    if (igFrameLayout == null) {
                        str = "coinContainerView";
                    } else {
                        igFrameLayout.setVisibility(0);
                        r4.A0C = true;
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DPJ() {
        String str;
        this.A1e.A1o.A00();
        C316766mB r4 = this.A1J;
        if (r4.A0N.CFV() == 0) {
            IgTextView igTextView = r4.A08;
            if (igTextView == null) {
                str = "scoreView";
            } else {
                igTextView.setVisibility(8);
                IgFrameLayout igFrameLayout = r4.A04;
                str = "coinContainerView";
                if (igFrameLayout != null) {
                    igFrameLayout.setVisibility(8);
                    IgFrameLayout igFrameLayout2 = r4.A04;
                    if (igFrameLayout2 != null) {
                        igFrameLayout2.removeAllViews();
                        AnonymousClass5Gv r1 = r4.A09;
                        if (r1 != null) {
                            r1.A08(false);
                        }
                        r4.A09 = null;
                        r4.A0C = false;
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void DcO() {
        C316136lA r2 = this.A1e;
        C309426Yf r1 = r2.A0m;
        if (r1 != null) {
            r1.A0j = false;
            C66951Mfk.A00(r2.AjF());
            r2.A1n.A00();
            C317106mj r22 = this.A0F;
            if (r22 != null) {
                AnonymousClass6NJ r0 = r22.A02;
                if (r0 != null) {
                    ValueAnimator valueAnimator = r0.A03;
                    if (valueAnimator.isRunning()) {
                        valueAnimator.end();
                    }
                }
                AnonymousClass6N0 r02 = r22.A03;
                if (r02 != null) {
                    r02.A00();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void ERT(float f) {
        1Xj r0;
        this.A0U.setAlpha(f);
        this.A0O.setAlpha(f);
        this.A1r.setAlpha(f);
        this.A0P.setAlpha(f);
        C316136lA r02 = this.A1e;
        r02.A00 = f;
        r02.A00();
        C53149GjL gjL = this.A07;
        if (gjL != null) {
            gjL.A08.setAlpha(f);
            View view = gjL.A00;
            if (view != null) {
                view.setAlpha(f);
            }
        }
        C14880UDi uDi = this.A06;
        if (uDi != null) {
            uDi.A04.setAlpha(f);
        }
        C316986mX r1 = this.A17;
        C255773uh r03 = this.A08;
        if (r03 != null && (r0 = r03.A0b) != null && r0.A0C.C11() != null) {
            r1.A09.getView().setAlpha(f);
            r1.A08.getView().setAlpha(f);
        }
    }
}
