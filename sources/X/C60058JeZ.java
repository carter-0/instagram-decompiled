package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.Iterator;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "Avoid adding more logic to this class. Consider com.instagram.creation.sharesheet.rowitems")
/* renamed from: X.JeZ  reason: case insensitive filesystem */
public final class C60058JeZ extends FrameLayout implements CallerContextable {
    public static final CallerContext A0T = CallerContext.A01(__redex_internal_original_name);
    public static final String __redex_internal_original_name = "ShareTable";
    public View A00;
    public TextView A01;
    public TextView A02;
    public LM3 A03;
    public IgdsSwitch A04;
    public GradientSpinnerAvatarView A05;
    public E28 A06;
    public MT7 A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public View A0E;
    public TextView A0F;
    public 1wn A0G;
    public final FragmentActivity A0H;
    public final AnonymousClass4DH A0I;
    public final UserSession A0J;
    public final ShareLaterMedia A0K;
    public final LO1 A0L;
    public final MUP A0M;
    public final String A0N;
    public final List A0O = AnonymousClass7TE.A1C();
    public final List A0P = AnonymousClass7TE.A1C();
    public final View.OnClickListener A0Q = LY5.A00(this, 14);
    public final View A0R;
    public final ViewGroup A0S;

    /* JADX WARNING: type inference failed for: r0v10, types: [X.LO1, java.lang.Object] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60058JeZ(Context context, View view, AnonymousClass4DH r6, UserSession userSession, ShareLaterMedia shareLaterMedia, MUP mup, String str, List list, List list2) {
        super(context);
        0qQ.A0B(mup, 7);
        this.A0I = r6;
        this.A0J = userSession;
        this.A0M = mup;
        this.A0K = shareLaterMedia;
        this.A0N = str;
        this.A0H = r6.requireActivity();
        LayoutInflater A0D2 = DbV.A0D(this);
        A0D2.inflate(R.layout.widget_share_table, this);
        this.A0S = DbU.A0C(this, R.id.share_table_button_container);
        View requireViewById = requireViewById(R.id.share_table_divider);
        this.A0R = requireViewById;
        this.A0L = new Object();
        if (AnonymousClass2o2.A00(userSession)) {
            this.A03 = new LM3(context);
        }
        setupViews(view, A0D2, list, list2);
        requireViewById.setVisibility(8);
    }

    private final void setupShareFragmentForFbPageDestination(C48153EZv eZv) {
        this.A0G = new C64690LgL(4, this, eZv);
        Fragment r3 = new AnonymousClass4DH();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable(AnonymousClass000.A00(479), this.A0K);
        AnonymousClass0Dg.A00(A0a, this.A0J);
        r3.setArguments(A0a);
        0s1 A0D2 = DbW.A0D(this.A0H);
        A0D2.A0B(r3, AnonymousClass000.A00(3972));
        A0D2.A01();
        this.A06 = r3;
    }

    public final void A05(C295095nZ r12, IgdsSwitch igdsSwitch, String str, String str2, boolean z) {
        K51 A002 = C63224KtV.A00(str2);
        C295095nZ r6 = r12;
        IgdsSwitch igdsSwitch2 = igdsSwitch;
        A002.A01 = new Lq0(r12, igdsSwitch, this);
        C331127Pr A0e = DbX.A0e(this.A0J, false);
        FragmentActivity fragmentActivity = this.A0H;
        A0e.A0F = ViewConfiguration.get(fragmentActivity).getScaledPagingTouchSlop();
        A0e.A0U = new C65743Lyx(r6, igdsSwitch2, this, str, str2);
        C331157Pu A003 = A0e.A00();
        if (z) {
            AnonymousClass7TF.A0D().postDelayed(new M9E(A002, A003, this), 500);
        } else {
            A003.A02(fragmentActivity, A002);
        }
    }

    private final void A01() {
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        String str = C363388je.A00(this.A0J).A00(A0T).A05;
        if (str == null || str.length() == 0) {
            Drawable drawable = getContext().getDrawable(R.drawable.unlinked_facebook_icon);
            if (!(drawable == null || (gradientSpinnerAvatarView = this.A05) == null)) {
                gradientSpinnerAvatarView.A0D(drawable);
            }
        } else {
            GradientSpinnerAvatarView gradientSpinnerAvatarView2 = this.A05;
            if (gradientSpinnerAvatarView2 != null) {
                gradientSpinnerAvatarView2.A0F((AnonymousClass9IV) null, this.A0I, DbS.A0V(str));
            }
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView3 = this.A05;
        if (gradientSpinnerAvatarView3 != null) {
            gradientSpinnerAvatarView3.setBottomBadgeDrawable(getContext().getDrawable(R.drawable.avatar_bottom_badge_facebook));
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView4 = this.A05;
        if (gradientSpinnerAvatarView4 != null) {
            gradientSpinnerAvatarView4.A01 = 0nA.A04(AnonymousClass7TE.A0S(this), 3);
        }
    }

    public static final void A02(JZY jzy, C60058JeZ jeZ, boolean z) {
        0bb r3 = new 0bb();
        r3.A03("is_xpost_enabled", Boolean.valueOf(z));
        UserSession userSession = jeZ.A0J;
        JZX.A00(jzy, JZZ.FEED, AnonymousClass818.IG_FEED_COMPOSER_SHARE_TO_FACEBOOK_TOGGLE_ENABLE, r3, userSession);
    }

    public static final void A03(C295095nZ r4, IgdsSwitch igdsSwitch, C60058JeZ jeZ) {
        AnonymousClass5w9 r0 = AnonymousClass5w8.A05;
        UserSession userSession = jeZ.A0J;
        if (JTT.A0S(userSession) != null) {
            r4.A00 = true;
            AnonymousClass5w9.A00(userSession).A0A(r4);
        }
        View view = jeZ.A00;
        if (view != null) {
            view.setVisibility(8);
            if (igdsSwitch != null) {
                if (jeZ.A09 || C363558jv.A00(userSession)) {
                    igdsSwitch.A00();
                }
                igdsSwitch.setClickable(true);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0268, code lost:
        if (r1 != null) goto L_0x026a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026e, code lost:
        if (r5.A0A(r1) != false) goto L_0x0270;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0270, code lost:
        X.0qQ.A0B(r7, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0290, code lost:
        if (X.AnonymousClass7TE.A0q(r7).getInt(X.AnonymousClass000.A00(4774), -1) >= X.AnonymousClass7TE.A0q(r7).getInt(X.AnonymousClass000.A00(5392), 0)) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0296, code lost:
        if (X.C363558jv.A00(r7) == false) goto L_0x01d9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0298, code lost:
        r0 = new X.M84(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001d, code lost:
        if (r8 != X.C48153EZv.A05) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x01a1, code lost:
        if (r1 == false) goto L_0x01a3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setupAppSharingButtons(android.view.View r32, android.view.LayoutInflater r33, X.C48153EZv r34) {
        /*
            r31 = this;
            r9 = r31
            com.instagram.common.session.UserSession r7 = r9.A0J
            X.8jd r0 = X.C363388je.A00(r7)
            com.facebook.common.callercontext.CallerContext r2 = A0T
            X.5wF r0 = r0.A00(r2)
            boolean r0 = X.C363388je.A02(r0)
            r21 = 1
            r6 = 0
            r8 = r34
            if (r0 == 0) goto L_0x001f
            X.EZv r0 = X.C48153EZv.A05
            r20 = 1
            if (r8 == r0) goto L_0x0021
        L_0x001f:
            r20 = 0
        L_0x0021:
            X.2Ly r1 = X.2Lv.A00(r7)
            java.lang.String r19 = "ig_android_linking_cache_feed_composer"
            r0 = r19
            boolean r18 = r1.A00(r2, r0)
            android.view.ViewGroup r17 = r9.A00()
            X.EZv r5 = X.C48153EZv.A05
            r10 = r33
            if (r8 != r5) goto L_0x02f1
            X.8jd r0 = X.C363388je.A00(r7)
            X.5wF r12 = r0.A00(r2)
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.5nZ r4 = X.JTT.A0S(r7)
            boolean r0 = X.C363388je.A02(r12)
            boolean r1 = X.AnonymousClass7TF.A1P(r0)
            X.0Tu r13 = X.0Tu.A05
            r2 = 36330544241328817(0x811270000042b1, double:3.038920697351287E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r13, r7, r2)
            boolean r0 = r0.booleanValue()
            android.content.Context r14 = r9.getContext()
            X.0qQ.A07(r14)
            X.AnonymousClass5w9.A00(r7)
            if (r0 == 0) goto L_0x02d7
            java.lang.String r11 = X.C59912Jbb.A02(r14, r4, r1)
        L_0x006c:
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            android.view.ViewGroup r1 = r9.A00()
            r0 = 2131629883(0x7f0e173b, float:1.88871E38)
            android.view.View r4 = r10.inflate(r0, r1, r6)
            r0 = 2131441241(0x7f0b3659, float:1.8504488E38)
            android.view.View r0 = r4.requireViewById(r0)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = (com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView) r0
            r9.A05 = r0
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r13, r7, r2)
            boolean r1 = r0.booleanValue()
            r0 = 2131441236(0x7f0b3654, float:1.8504478E38)
            if (r1 == 0) goto L_0x0094
            r0 = 2131441239(0x7f0b3657, float:1.8504484E38)
        L_0x0094:
            android.widget.TextView r1 = X.AnonymousClass7TG.A0R(r4, r0)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r13, r7, r2)
            boolean r10 = r0.booleanValue()
            r0 = 2131440500(0x7f0b3374, float:1.8502985E38)
            if (r10 == 0) goto L_0x00a8
            r0 = 2131440502(0x7f0b3376, float:1.850299E38)
        L_0x00a8:
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r4, r0)
            r0 = 2131428210(0x7f0b0372, float:1.8478058E38)
            android.view.View r0 = r4.requireViewById(r0)
            r9.A00 = r0
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A05
            if (r0 == 0) goto L_0x00bc
            r0.A05()
        L_0x00bc:
            boolean r0 = X.C363388je.A03(r12)
            if (r0 != 0) goto L_0x02a6
            r0 = 2131240251(0x7f08253b, float:1.8096832E38)
            android.graphics.drawable.Drawable r1 = r14.getDrawable(r0)
            if (r1 == 0) goto L_0x00d2
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r9.A05
            if (r0 == 0) goto L_0x00d2
            r0.A0D(r1)
        L_0x00d2:
            r0 = 2131441236(0x7f0b3654, float:1.8504478E38)
            android.widget.TextView r1 = X.DbU.A0G(r4, r0)
            r1.setVisibility(r6)
            int r0 = r8.A01
            r1.setText(r0)
            r9.A01 = r1
            r0 = 8
            r10.setVisibility(r0)
        L_0x00e8:
            X.5nZ r12 = X.JTT.A0S(r7)
            android.view.View r0 = r9.A00
            if (r0 == 0) goto L_0x0166
            if (r12 == 0) goto L_0x0166
            boolean r0 = r12.A00
            if (r0 != 0) goto L_0x029f
            X.0qQ.A0B(r7, r6)
            boolean r0 = X.AnonymousClass5w9.A01(r7)
            if (r0 == 0) goto L_0x029f
            r0 = 2131952006(0x7f130186, float:1.9540443E38)
            java.lang.String r16 = X.AnonymousClass7TE.A16(r14, r0)
            r1 = 2131973685(0x7f135635, float:1.9584413E38)
            r0 = r16
            java.lang.String r11 = X.DbY.A0c(r14, r0, r1)
            r0 = 2131428209(0x7f0b0371, float:1.8478056E38)
            android.view.View r10 = X.AnonymousClass7TF.A0G(r4, r0)
            android.widget.TextView r10 = (android.widget.TextView) r10
            r0 = 2131441233(0x7f0b3651, float:1.8504472E38)
            android.view.View r1 = X.AnonymousClass7TF.A0G(r4, r0)
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            X.5w8 r0 = X.AnonymousClass5w9.A00(r7)
            boolean r0 = r0.A0C(r7)
            if (r0 == 0) goto L_0x0141
            r1.setChecked(r6)
            r1.setClickable(r6)
            r0 = 2131441234(0x7f0b3652, float:1.8504474E38)
            android.view.View r15 = X.AnonymousClass7TF.A0G(r4, r0)
            r0 = 39
            X.LYA r0 = X.LYA.A00(r1, r12, r9, r0)
            r15.setOnClickListener(r0)
        L_0x0141:
            int r29 = X.DbV.A02(r14)
            java.lang.Integer r24 = X.AnonymousClass05K.A01
            r14 = 16
            X.04x r15 = new X.04x
            r15.<init>(r14, r11)
            X.K95 r0 = new X.K95
            r22 = r0
            r23 = r15
            r25 = r1
            r26 = r12
            r27 = r9
            r28 = r11
            r30 = r21
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)
            r1 = r16
            X.AnonymousClass7AV.A07(r0, r10, r1, r11)
        L_0x0166:
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r13, r7, r2)
            boolean r1 = r0.booleanValue()
            r0 = 2131441236(0x7f0b3654, float:1.8504478E38)
            if (r1 == 0) goto L_0x0176
            r0 = 2131441239(0x7f0b3657, float:1.8504484E38)
        L_0x0176:
            android.widget.TextView r0 = X.DbU.A0G(r4, r0)
            r9.A0F = r0
        L_0x017c:
            r4.setTag(r8)
            android.view.View$OnClickListener r0 = r9.A0Q
            r4.setOnClickListener(r0)
            r0 = 2131441233(0x7f0b3651, float:1.8504472E38)
            android.view.View r2 = X.AnonymousClass7TF.A0F(r4, r0)
            com.instagram.igds.components.switchbutton.IgdsSwitch r2 = (com.instagram.igds.components.switchbutton.IgdsSwitch) r2
            if (r8 != r5) goto L_0x01a3
            X.0Tu r3 = X.0Tu.A05
            r0 = 36330544241328817(0x811270000042b1, double:3.038920697351287E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r3, r7, r0)
            boolean r1 = r0.booleanValue()
            r0 = 2131440502(0x7f0b3376, float:1.850299E38)
            if (r1 != 0) goto L_0x01a6
        L_0x01a3:
            r0 = 2131440500(0x7f0b3374, float:1.8502985E38)
        L_0x01a6:
            android.widget.TextView r0 = X.AnonymousClass7TG.A0R(r4, r0)
            if (r8 != r5) goto L_0x01b0
            r9.A02 = r0
            r9.A04 = r2
        L_0x01b0:
            if (r20 == 0) goto L_0x01b5
            r9.setupShareFragmentForFbPageDestination(r8)
        L_0x01b5:
            if (r8 != r5) goto L_0x0213
            if (r20 != 0) goto L_0x01d9
            com.instagram.model.sharelater.ShareLaterMedia r1 = r9.A0K
            if (r1 == 0) goto L_0x01c3
            boolean r0 = r5.A0A(r1)
            if (r0 != 0) goto L_0x026a
        L_0x01c3:
            boolean r0 = X.C63419Kwf.A00(r7)
            if (r0 == 0) goto L_0x0268
            r0 = r21
            r9.A08 = r0
            X.M83 r0 = new X.M83
            r0.<init>(r2, r9)
        L_0x01d2:
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r1 = r32
            r1.post(r0)
        L_0x01d9:
            boolean r0 = X.C363558jv.A00(r7)
            if (r0 != 0) goto L_0x01e9
            com.instagram.model.sharelater.ShareLaterMedia r0 = r9.A0K
            if (r0 == 0) goto L_0x0266
            boolean r0 = r5.A0A(r0)
            if (r0 == 0) goto L_0x0266
        L_0x01e9:
            r3 = 1
        L_0x01ea:
            X.JZY r0 = X.JZY.VIEW
            A02(r0, r9, r3)
            boolean r0 = r9.A08
            if (r0 == 0) goto L_0x0264
            java.lang.String r1 = "tooltip_shown_only"
        L_0x01f5:
            java.lang.String r0 = "view"
            X.C63424Kwk.A00(r7, r0, r1, r3)
            X.2Ly r3 = X.2Lv.A00(r7)
            java.lang.Class<X.JeZ> r0 = X.C60058JeZ.class
            com.facebook.common.callercontext.CallerContext r1 = com.facebook.common.callercontext.CallerContext.A00(r0)
            r0 = r19
            boolean r0 = r3.A00(r1, r0)
            if (r0 != 0) goto L_0x0213
            X.EZu r1 = X.C48152EZu.A0E
            java.lang.String r0 = "upsell_impressions"
            X.FFL.A00(r1, r7, r0)
        L_0x0213:
            r1 = 3
            X.LsC r0 = new X.LsC
            r0.<init>(r1, r4, r9, r8)
            r2.A07 = r0
            if (r8 != r5) goto L_0x0241
            com.instagram.model.sharelater.ShareLaterMedia r0 = r9.A0K
            if (r0 == 0) goto L_0x0241
            java.util.List r1 = r0.A06
            if (r1 == 0) goto L_0x0241
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            if (r0 == 0) goto L_0x0241
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf((java.util.Collection) r1)
            if (r1 == 0) goto L_0x0241
            java.lang.String r0 = "FB"
            boolean r1 = r1.contains(r0)
            r0 = r21
            if (r1 != r0) goto L_0x0241
        L_0x023b:
            X.JZY r0 = X.JZY.UNAVAILABLE
            A02(r0, r9, r6)
            return
        L_0x0241:
            if (r18 != 0) goto L_0x0251
            X.0Tu r3 = X.0Tu.A05
            r0 = 36321576350000667(0x810a480006261b, double:3.033249366764565E-306)
            boolean r0 = X.182.A06(r3, r7, r0)
            if (r0 == 0) goto L_0x0251
            goto L_0x023b
        L_0x0251:
            if (r8 != r5) goto L_0x0317
            com.instagram.model.sharelater.ShareLaterMedia r0 = r9.A0K
            if (r0 == 0) goto L_0x0317
            X.3YP r1 = r0.A01
            if (r1 == 0) goto L_0x0317
            X.3YP r0 = X.AnonymousClass3YP.SHARING
            if (r1 == r0) goto L_0x023b
            X.3YP r0 = X.AnonymousClass3YP.SHARED
            if (r1 != r0) goto L_0x0317
            goto L_0x023b
        L_0x0264:
            r1 = 0
            goto L_0x01f5
        L_0x0266:
            r3 = 0
            goto L_0x01ea
        L_0x0268:
            if (r1 == 0) goto L_0x0270
        L_0x026a:
            boolean r0 = r5.A0A(r1)
            if (r0 == 0) goto L_0x01d9
        L_0x0270:
            X.0qQ.A0B(r7, r6)
            X.0xa r3 = X.AnonymousClass7TE.A0q(r7)
            r0 = 4774(0x12a6, float:6.69E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = -1
            int r3 = r3.getInt(r1, r0)
            X.0xa r1 = X.AnonymousClass7TE.A0q(r7)
            r0 = 5392(0x1510, float:7.556E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r0 = r1.getInt(r0, r6)
            if (r3 >= r0) goto L_0x01d9
            boolean r0 = X.C363558jv.A00(r7)
            if (r0 == 0) goto L_0x01d9
            X.M84 r0 = new X.M84
            r0.<init>(r2, r9)
            goto L_0x01d2
        L_0x029f:
            android.view.View r0 = r9.A00
            X.AnonymousClass7TH.A0R(r0)
            goto L_0x0166
        L_0x02a6:
            r9.A01()
            r1.setVisibility(r6)
            java.lang.String r0 = r8.A02(r7)
            r1.setText(r0)
            r10.setVisibility(r6)
            if (r11 == 0) goto L_0x02d0
            int r0 = r11.length()
            if (r0 == 0) goto L_0x02d0
            r1 = 2131954369(0x7f130ac1, float:1.9545235E38)
            int r0 = r8.A01
            java.lang.String r0 = r14.getString(r0)
            java.lang.String r0 = X.DbV.A0u(r14, r0, r11, r1)
        L_0x02cb:
            r10.setText(r0)
            goto L_0x00e8
        L_0x02d0:
            int r0 = r8.A01
            java.lang.String r0 = r14.getString(r0)
            goto L_0x02cb
        L_0x02d7:
            java.lang.String r0 = X.C59912Jbb.A02(r14, r4, r1)
            if (r0 != 0) goto L_0x02e0
            r11 = 0
            goto L_0x006c
        L_0x02e0:
            android.content.res.Resources r4 = r14.getResources()
            r1 = 2131962370(0x7f132a02, float:1.9561463E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            android.text.Spanned r11 = X.0bC.A00(r4, r0, r1)
            goto L_0x006c
        L_0x02f1:
            r1 = 2131629882(0x7f0e173a, float:1.8887097E38)
            r0 = r17
            android.view.View r4 = r10.inflate(r1, r0, r6)
            r0 = 2131441236(0x7f0b3654, float:1.8504478E38)
            android.widget.TextView r10 = X.AnonymousClass7TG.A0R(r4, r0)
            android.content.res.Resources r3 = r9.getResources()
            r2 = 2131973691(0x7f13563b, float:1.9584425E38)
            android.content.Context r1 = r9.getContext()
            int r0 = r8.A01
            java.lang.String r0 = r1.getString(r0)
            X.DbY.A0y(r3, r10, r0, r2)
            goto L_0x017c
        L_0x0317:
            r2.setTag(r8)
            java.util.List r0 = r9.A0O
            r0.add(r4)
            java.util.List r0 = r9.A0P
            r0.add(r2)
            r0 = r17
            r0.addView(r4)
            r9.A0E = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60058JeZ.setupAppSharingButtons(android.view.View, android.view.LayoutInflater, X.EZv):void");
    }

    private final void setupViews(View view, LayoutInflater layoutInflater, List list, List list2) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C48153EZv eZv = (C48153EZv) it.next();
                setupAppSharingButtons(view, layoutInflater, eZv);
                this.A0M.Civ(eZv.A02);
            }
        } else if (list2 != null) {
            UserSession userSession = this.A0J;
            List A0a = 00k.A0a(C63270KuF.A00(userSession).A00);
            for (Object next : A0a) {
                Iterator it2 = list2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    L6Z l6z = (L6Z) it2.next();
                    if (0qQ.A0K(next, l6z.A02)) {
                        setupOtherIGSharingButton(layoutInflater, l6z);
                        break;
                    }
                }
            }
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                L6Z l6z2 = (L6Z) it3.next();
                String str = l6z2.A02;
                if (!A0a.contains(str)) {
                    setupOtherIGSharingButton(layoutInflater, l6z2);
                    JTR.A1S(str, C63270KuF.A00(userSession).A00);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005c, code lost:
        if (((java.util.Set) r4.A02.getValue()).contains(r1) == false) goto L_0x005e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r8 = this;
            java.util.List r0 = r8.A0P
            java.util.Iterator r7 = r0.iterator()
        L_0x0006:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0068
            java.lang.Object r5 = r7.next()
            android.widget.CompoundButton r5 = (android.widget.CompoundButton) r5
            java.lang.Object r0 = r5.getTag()
            if (r0 == 0) goto L_0x0006
            java.lang.Object r6 = r5.getTag()
            X.DbS.A1Y(r6)
            com.instagram.common.session.UserSession r0 = r8.A0J
            X.Liv r4 = X.C63270KuF.A00(r0)
            r0 = 0
            X.0qQ.A0B(r6, r0)
            X.05G r0 = r4.A01
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0063
            java.util.Iterator r3 = X.C51966G9m.A1H(r0)
            r1 = 0
        L_0x0036:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004d
            java.lang.Object r2 = r3.next()
            X.L6Z r2 = (X.L6Z) r2
            java.lang.String r0 = r2.A02
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0036
            java.lang.String r1 = r2.A00
            goto L_0x0036
        L_0x004d:
            if (r1 == 0) goto L_0x005e
            X.05G r0 = r4.A02
            java.lang.Object r0 = r0.getValue()
            java.util.Set r0 = (java.util.Set) r0
            boolean r1 = r0.contains(r1)
            r0 = 1
            if (r1 != 0) goto L_0x005f
        L_0x005e:
            r0 = 0
        L_0x005f:
            r5.setChecked(r0)
            goto L_0x0006
        L_0x0063:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60058JeZ.A04():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x01c2, code lost:
        if (r0.A02 == true) goto L_0x01c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x01c4, code lost:
        if (r29 == null) goto L_0x01d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c6, code lost:
        r0 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x01cc, code lost:
        if (r10.A0A(r6) == true) goto L_0x00e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x01d9, code lost:
        throw X.AnonymousClass7TE.A0z("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e5, code lost:
        if (X.AnonymousClass5w9.A00(r5).A0C(r5) != false) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e7, code lost:
        r0 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e8, code lost:
        r9.setChecked(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x011a, code lost:
        if (r2.A00 != true) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0190, code lost:
        if (X.0qQ.A0K(r0, r11) == false) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.AnonymousClass3Q3 r29) {
        /*
            r28 = this;
            r7 = r28
            com.instagram.common.session.UserSession r5 = r7.A0J
            X.8jd r0 = X.C363388je.A00(r5)
            com.facebook.common.callercontext.CallerContext r4 = A0T
            X.5wF r0 = r0.A00(r4)
            boolean r18 = X.C363388je.A02(r0)
            java.util.List r0 = r7.A0O
            java.util.Iterator r8 = r0.iterator()
            r17 = 0
        L_0x001a:
            boolean r0 = r8.hasNext()
            java.lang.String r3 = "null cannot be cast to non-null type com.instagram.share.base.SharingAccount"
            java.lang.String r16 = "Required value was null."
            r6 = r29
            if (r0 == 0) goto L_0x004c
            android.view.View r3 = X.JTO.A0H(r8)
            java.lang.Object r2 = r3.getTag()
            if (r2 == 0) goto L_0x0047
            X.EZv r2 = (X.C48153EZv) r2
            boolean r1 = r2.A08(r5, r6)
            r0 = 1050253722(0x3e99999a, float:0.3)
            if (r1 == 0) goto L_0x003d
            r0 = 1065353216(0x3f800000, float:1.0)
        L_0x003d:
            r3.setAlpha(r0)
            X.EZv r0 = X.C48153EZv.A05
            if (r2 != r0) goto L_0x001a
            r17 = r3
            goto L_0x001a
        L_0x0047:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x004c:
            X.5w9 r0 = X.AnonymousClass5w8.A05
            X.5nZ r2 = X.JTT.A0S(r5)
            java.util.List r0 = r7.A0P
            java.util.Iterator r15 = r0.iterator()
        L_0x0058:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x01da
            java.lang.Object r9 = r15.next()
            android.widget.CompoundButton r9 = (android.widget.CompoundButton) r9
            java.lang.Object r10 = r9.getTag()
            X.0qQ.A0C(r10, r3)
            X.EZv r10 = (X.C48153EZv) r10
            java.lang.String r11 = r10.A02(r5)
            X.EZv r8 = X.C48153EZv.A05
            r12 = 8
            if (r10 != r8) goto L_0x01b7
            if (r11 == 0) goto L_0x01b7
            int r0 = r11.length()
            if (r0 == 0) goto L_0x01b7
            X.0Tu r13 = X.0Tu.A05
            r0 = 36330544241328817(0x811270000042b1, double:3.038920697351287E-306)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r13, r5, r0)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0174
            r7.A01()
            android.widget.TextView r0 = r7.A01
            if (r0 == 0) goto L_0x009a
            r0.setVisibility(r12)
        L_0x009a:
            android.widget.TextView r0 = r7.A0F
            if (r0 == 0) goto L_0x00a1
            r0.setText(r11)
        L_0x00a1:
            android.widget.TextView r0 = r7.A0F
            X.AnonymousClass7TF.A16(r0)
            X.8jd r0 = X.C363388je.A00(r5)
            X.5wF r0 = r0.A00(r4)
            boolean r0 = X.C363388je.A02(r0)
            android.content.Context r13 = X.AnonymousClass7TE.A0S(r7)
            X.AnonymousClass5w9.A00(r5)
            r12 = 0
            java.lang.String r14 = X.C59912Jbb.A02(r13, r2, r0)
            if (r14 == 0) goto L_0x0169
            int r0 = r14.length()
            if (r0 == 0) goto L_0x0169
            android.widget.TextView r11 = r7.A02
            if (r11 == 0) goto L_0x00d6
            r1 = 2131954369(0x7f130ac1, float:1.9545235E38)
            int r0 = r10.A01
            java.lang.String r0 = r13.getString(r0)
            X.JTR.A18(r13, r11, r0, r14, r1)
        L_0x00d6:
            android.widget.TextView r0 = r7.A02
            if (r0 == 0) goto L_0x00dd
            r0.setVisibility(r12)
        L_0x00dd:
            X.5w8 r0 = X.AnonymousClass5w9.A00(r5)
            boolean r0 = r0.A0C(r5)
            if (r0 == 0) goto L_0x01c4
        L_0x00e7:
            r0 = 0
        L_0x00e8:
            r9.setChecked(r0)
        L_0x00eb:
            android.view.View r1 = r7.A00
            if (r10 != r8) goto L_0x0102
            if (r1 == 0) goto L_0x0102
            if (r2 == 0) goto L_0x00fd
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x00fd
            boolean r0 = r9.isChecked()
            if (r0 != 0) goto L_0x0102
        L_0x00fd:
            r0 = 8
            r1.setVisibility(r0)
        L_0x0102:
            android.view.View r12 = r7.A00
            if (r10 != r8) goto L_0x0058
            if (r17 == 0) goto L_0x0058
            r11 = 0
            X.0qQ.A0B(r5, r11)
            boolean r0 = X.AnonymousClass5w9.A01(r5)
            if (r0 == 0) goto L_0x0058
            if (r12 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x011c
            boolean r8 = r2.A00
            r0 = 1
            r1 = 1
            if (r8 == r0) goto L_0x011d
        L_0x011c:
            r1 = 0
        L_0x011d:
            X.5w8 r0 = X.AnonymousClass5w9.A00(r5)
            boolean r0 = r0.A0C(r5)
            if (r0 != 0) goto L_0x0133
            if (r29 == 0) goto L_0x01d0
            boolean r0 = r10.A0A(r6)
            if (r0 == 0) goto L_0x0058
            if (r2 == 0) goto L_0x0058
            if (r1 != 0) goto L_0x0058
        L_0x0133:
            r12.setVisibility(r11)
            r21 = 0
            android.content.Context r0 = r9.getContext()
            X.0qQ.A07(r0)
            X.AnonymousClass5w9.A00(r5)
            java.lang.String r8 = r7.A0N
            boolean r26 = X.C363558jv.A00(r5)
            if (r2 == 0) goto L_0x0165
            boolean r1 = r2.A05
            X.5nY r0 = r2.A01
            if (r0 == 0) goto L_0x0166
            java.lang.String r24 = r0.name()
        L_0x0154:
            java.lang.String r20 = "default_privacy_instruction_view_impression"
            r19 = r5
            r22 = r21
            r23 = r8
            r25 = r11
            r27 = r1
            X.C295105na.A02(r19, r20, r21, r22, r23, r24, r25, r26, r27)
            goto L_0x0058
        L_0x0165:
            r1 = 0
        L_0x0166:
            r24 = 0
            goto L_0x0154
        L_0x0169:
            int r0 = r10.A01
            java.lang.String r0 = r13.getString(r0)
            X.0qQ.A0A(r0)
            goto L_0x00d6
        L_0x0174:
            android.widget.TextView r0 = r7.A02
            if (r0 == 0) goto L_0x0192
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L_0x0192
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0192
            android.widget.TextView r0 = r7.A02
            if (r0 == 0) goto L_0x01b5
            java.lang.CharSequence r0 = r0.getText()
        L_0x018c:
            boolean r0 = X.0qQ.A0K(r0, r11)
            if (r0 != 0) goto L_0x00dd
        L_0x0192:
            if (r18 != 0) goto L_0x00dd
            android.widget.TextView r13 = r7.A02
            if (r13 == 0) goto L_0x01ac
            android.content.Context r12 = r7.getContext()
            r11 = 2131954369(0x7f130ac1, float:1.9545235E38)
            int r0 = r10.A01
            java.lang.String r1 = r12.getString(r0)
            if (r2 == 0) goto L_0x01b3
            java.lang.String r0 = r2.A04
        L_0x01a9:
            X.JTR.A18(r12, r13, r1, r0, r11)
        L_0x01ac:
            android.widget.TextView r0 = r7.A02
            X.AnonymousClass7TF.A16(r0)
            goto L_0x00dd
        L_0x01b3:
            r0 = 0
            goto L_0x01a9
        L_0x01b5:
            r0 = 0
            goto L_0x018c
        L_0x01b7:
            if (r10 == r8) goto L_0x00dd
            if (r18 == 0) goto L_0x00eb
            X.E28 r0 = r7.A06
            r1 = 1
            if (r0 == 0) goto L_0x00eb
            boolean r0 = r0.A02
            if (r0 != r1) goto L_0x00eb
        L_0x01c4:
            if (r29 == 0) goto L_0x01d5
            boolean r11 = r10.A0A(r6)
            r1 = 1
            r0 = 1
            if (r11 == r1) goto L_0x00e8
            goto L_0x00e7
        L_0x01d0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x01d5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x01da:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60058JeZ.A06(X.3Q3):void");
    }

    private final ViewGroup A00() {
        LayoutInflater A0D2 = DbV.A0D(this);
        ViewGroup viewGroup = this.A0S;
        View A0C2 = DbT.A0C(A0D2, viewGroup, R.layout.widget_share_table_row);
        viewGroup.addView(A0C2);
        return DbX.A0I(A0C2, R.id.share_table_row_button_container);
    }

    private final void setupOtherIGSharingButton(LayoutInflater layoutInflater, L6Z l6z) {
        ViewGroup A002 = A00();
        View A0C2 = DbT.A0C(layoutInflater, A002, R.layout.widget_share_table_row_redesign);
        TextView A0R2 = AnonymousClass7TG.A0R(A0C2, R.id.share_table_button);
        String str = l6z.A02;
        A0R2.setText(str);
        IgdsSwitch igdsSwitch = (IgdsSwitch) AnonymousClass7TF.A0F(A0C2, R.id.share_switch);
        FFL.A00(C48152EZu.A0F, this.A0J, "upsell_impressions");
        igdsSwitch.A07 = new C65371LsC(4, A0C2, this, l6z);
        igdsSwitch.setTag(str);
        this.A0P.add(igdsSwitch);
        A002.addView(A0C2);
        this.A0E = A0C2;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1663264099);
        super.onAttachedToWindow();
        1wn r2 = this.A0G;
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A0J).A01(r2, Lg5.class);
        }
        AnonymousClass0fD.A0D(1867524867, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1462359931);
        super.onDetachedFromWindow();
        1wn r2 = this.A0G;
        if (r2 != null) {
            AnonymousClass1Nd.A00(this.A0J).A02(r2, Lg5.class);
        }
        AnonymousClass0fD.A0D(-143610878, A062);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        View view = this.A0E;
        if (view != null) {
            View view2 = this.A0R;
            view2.measure(View.MeasureSpec.makeMeasureSpec(view2.getLayoutParams().width, SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - view.getMeasuredHeight(), SN3.MAX_SIGNED_POWER_OF_TWO));
        }
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        Iterator it = this.A0O.iterator();
        while (it.hasNext()) {
            JTO.A0H(it).setEnabled(z);
        }
        Iterator it2 = this.A0P.iterator();
        while (it2.hasNext()) {
            JTO.A0H(it2).setEnabled(z);
        }
    }

    public final void setIsShareToCloseFriends(boolean z) {
        this.A0C = z;
    }

    public final void setIsShareToProfileOnly(boolean z) {
        this.A0B = z;
    }

    public final void setOnAppSharingToggleListener(MT7 mt7) {
        this.A07 = mt7;
    }
}
