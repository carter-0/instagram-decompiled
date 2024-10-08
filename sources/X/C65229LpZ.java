package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.model.sharelater.ShareLaterMedia;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.List;

/* renamed from: X.LpZ  reason: case insensitive filesystem */
public final class C65229LpZ implements MVS {
    public static final CallerContext A0R = CallerContext.A01("XpostRowItem");
    public View A00;
    public View A01;
    public ViewGroup A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public TextView A06;
    public IgTextView A07;
    public C60063Jel A08;
    public C60063Jel A09;
    public C60063Jel A0A;
    public IgdsSwitch A0B;
    public GradientSpinnerAvatarView A0C;
    public C60058JeZ A0D;
    public boolean A0E;
    public boolean A0F;
    public final View.OnClickListener A0G;
    public final View.OnClickListener A0H;
    public final AnonymousClass4DH A0I;
    public final UserSession A0J;
    public final KOP A0K;
    public final C66576MXh A0L;
    public final C65799Lzr A0M;
    public final C367188qK A0N;
    public final C347767xL A0O;
    public final String A0P;
    public final AnonymousClass80P A0Q = AnonymousClass80P.TEMP_CAMERA_TOOL;

    public C65229LpZ(AnonymousClass4DH r3, UserSession userSession, KOP kop, C66576MXh mXh, C367188qK r7, String str) {
        0qQ.A0B(r3, 1);
        C51974G9v.A1S(userSession, str, kop, r7, mXh);
        this.A0I = r3;
        this.A0J = userSession;
        this.A0P = str;
        this.A0K = kop;
        this.A0N = r7;
        this.A0L = mXh;
        this.A0O = C347757xK.A00(userSession);
        this.A0F = true;
        this.A0H = LYD.A01(this, 39);
        this.A0G = LYD.A01(this, 38);
        this.A0M = new C65799Lzr(this);
    }

    public final /* synthetic */ void ADm() {
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A0I;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66171MGi(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 11), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(C65229LpZ lpZ, C299935wF r7) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView;
        GradientSpinnerAvatarView gradientSpinnerAvatarView2;
        AnonymousClass4DH r5 = lpZ.A0I;
        Context requireContext = r5.requireContext();
        if (!C363388je.A03(r7)) {
            Drawable drawable = requireContext.getDrawable(R.drawable.unlinked_facebook_icon);
            if (drawable != null && (gradientSpinnerAvatarView2 = lpZ.A0C) != null) {
                gradientSpinnerAvatarView2.A0D(drawable);
                return;
            }
            return;
        }
        String str = r7.A05;
        if (str == null || str.length() == 0) {
            Drawable drawable2 = requireContext.getDrawable(R.drawable.unlinked_facebook_icon);
            if (!(drawable2 == null || (gradientSpinnerAvatarView = lpZ.A0C) == null)) {
                gradientSpinnerAvatarView.A0D(drawable2);
            }
        } else {
            GradientSpinnerAvatarView gradientSpinnerAvatarView3 = lpZ.A0C;
            if (gradientSpinnerAvatarView3 != null) {
                gradientSpinnerAvatarView3.A0F((AnonymousClass9IV) null, r5, DbS.A0V(str));
            }
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView4 = lpZ.A0C;
        if (gradientSpinnerAvatarView4 != null) {
            gradientSpinnerAvatarView4.setBottomBadgeDrawable(requireContext.getDrawable(R.drawable.avatar_bottom_badge_facebook));
        }
        GradientSpinnerAvatarView gradientSpinnerAvatarView5 = lpZ.A0C;
        if (gradientSpinnerAvatarView5 != null) {
            gradientSpinnerAvatarView5.A01 = 0nA.A04(requireContext, 3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r10 != X.C48153EZv.A05) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C65229LpZ r8, X.C299935wF r9, X.C48153EZv r10) {
        /*
            android.widget.TextView r0 = r8.A04
            int r5 = X.JTQ.A02(r0)
            android.widget.TextView r0 = r8.A03
            if (r0 == 0) goto L_0x000d
            r0.setVisibility(r5)
        L_0x000d:
            com.instagram.common.session.UserSession r6 = r8.A0J
            X.0Tu r7 = X.0Tu.A05
            r0 = 36330544241328817(0x811270000042b1, double:3.038920697351287E-306)
            boolean r2 = X.182.A06(r7, r6, r0)
            if (r2 == 0) goto L_0x0091
            android.widget.TextView r4 = r8.A04
        L_0x001e:
            X.4DH r2 = r8.A0I
            android.content.Context r3 = r2.requireContext()
            boolean r2 = X.C363388je.A03(r9)
            if (r2 != 0) goto L_0x0030
            if (r4 == 0) goto L_0x002f
            r4.setVisibility(r5)
        L_0x002f:
            return
        L_0x0030:
            r2 = 0
            if (r4 == 0) goto L_0x0036
            r4.setVisibility(r2)
        L_0x0036:
            boolean r2 = X.C363388je.A02(r9)
            if (r2 == 0) goto L_0x0041
            X.EZv r2 = X.C48153EZv.A05
            r5 = 1
            if (r10 == r2) goto L_0x0042
        L_0x0041:
            r5 = 0
        L_0x0042:
            X.5w9 r2 = X.AnonymousClass5w8.A05
            X.5nZ r2 = X.JTT.A0S(r6)
            boolean r0 = X.182.A06(r7, r6, r0)
            X.AnonymousClass5w9.A00(r6)
            if (r0 == 0) goto L_0x0079
            java.lang.String r2 = X.C59912Jbb.A02(r3, r2, r5)
        L_0x0055:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            if (r4 == 0) goto L_0x002f
            if (r2 == 0) goto L_0x0072
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0072
            r1 = 2131954369(0x7f130ac1, float:1.9545235E38)
            int r0 = r10.A01
            java.lang.String r0 = r3.getString(r0)
            java.lang.String r0 = X.DbV.A0u(r3, r0, r2, r1)
        L_0x006e:
            r4.setText(r0)
            return
        L_0x0072:
            int r0 = r10.A01
            java.lang.String r0 = r3.getString(r0)
            goto L_0x006e
        L_0x0079:
            java.lang.String r0 = X.C59912Jbb.A02(r3, r2, r5)
            if (r0 != 0) goto L_0x0081
            r2 = 0
            goto L_0x0055
        L_0x0081:
            android.content.res.Resources r2 = r3.getResources()
            r1 = 2131962370(0x7f132a02, float:1.9561463E38)
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            android.text.Spanned r2 = X.0bC.A00(r2, r0, r1)
            goto L_0x0055
        L_0x0091:
            android.widget.TextView r4 = r8.A03
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65229LpZ.A01(X.LpZ, X.5wF, X.EZv):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0026  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C65229LpZ r5, X.C299935wF r6, X.C48153EZv r7) {
        /*
            android.widget.TextView r0 = r5.A05
            int r1 = X.JTQ.A02(r0)
            android.widget.TextView r0 = r5.A06
            if (r0 == 0) goto L_0x000d
            r0.setVisibility(r1)
        L_0x000d:
            boolean r4 = X.C363388je.A03(r6)
            if (r4 == 0) goto L_0x0040
            com.instagram.common.session.UserSession r3 = r5.A0J
            X.0Tu r2 = X.0Tu.A05
            r0 = 36330544241328817(0x811270000042b1, double:3.038920697351287E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0040
            android.widget.TextView r1 = r5.A06
        L_0x0024:
            if (r4 != 0) goto L_0x0034
            android.widget.TextView r1 = r5.A05
            if (r1 == 0) goto L_0x0033
            int r0 = r7.A01
            r1.setText(r0)
        L_0x002f:
            r0 = 0
            r1.setVisibility(r0)
        L_0x0033:
            return
        L_0x0034:
            if (r1 == 0) goto L_0x0033
            com.instagram.common.session.UserSession r0 = r5.A0J
            java.lang.String r0 = r7.A02(r0)
            r1.setText(r0)
            goto L_0x002f
        L_0x0040:
            android.widget.TextView r1 = r5.A05
            goto L_0x0024
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65229LpZ.A02(X.LpZ, X.5wF, X.EZv):void");
    }

    public static final void A03(C65229LpZ lpZ, Integer num) {
        Integer num2 = AnonymousClass05K.A07;
        AnonymousClass4DH r1 = lpZ.A0I;
        if (num == num2) {
            FFO.A02(r1.requireContext(), lpZ.A0J, "share_post_to_threads");
            return;
        }
        C358248ab A0H2 = Dba.A0H(r1);
        A0H2.A09(2131973550);
        A0H2.A0q(C63196Kt3.A00(r1.requireContext(), lpZ.A0J, num));
        Dba.A1L(A0H2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (X.182.A06(X.0Tu.A05, r3, 36324101790576422L) != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r4 = this;
            X.5w9 r0 = X.AnonymousClass5w8.A05
            com.instagram.common.session.UserSession r3 = r4.A0J
            boolean r0 = X.AnonymousClass5w9.A01(r3)
            if (r0 == 0) goto L_0x0018
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324101790576422(0x810c9400032f26, double:3.034846465553805E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0019
        L_0x0018:
            r2 = 1
        L_0x0019:
            com.instagram.common.ui.base.IgTextView r1 = r4.A07
            if (r1 == 0) goto L_0x0025
            r0 = 8
            if (r2 == 0) goto L_0x0022
            r0 = 0
        L_0x0022:
            r1.setVisibility(r0)
        L_0x0025:
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324101790576422(0x810c9400032f26, double:3.034846465553805E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x003c
            com.instagram.common.ui.base.IgTextView r1 = r4.A07
            if (r1 == 0) goto L_0x003c
            r0 = 2131973498(0x7f13557a, float:1.9584034E38)
            r1.setText(r0)
        L_0x003c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65229LpZ.A04():void");
    }

    public final View ANH() {
        View view;
        ViewTreeObserver viewTreeObserver;
        IgdsSwitch shareSwitch;
        IgdsSwitch shareSwitch2;
        AnonymousClass4DH r10 = this.A0I;
        LinearLayout linearLayout = new LinearLayout(r10.requireContext());
        linearLayout.setOrientation(1);
        JTS.A0x(linearLayout);
        this.A02 = linearLayout;
        UserSession userSession = this.A0J;
        if (LTP.A09(userSession)) {
            IgTextView inflate = DbV.A0E(r10).inflate(R.layout.layout_share_sheet_row_item_title, (ViewGroup) null);
            0qQ.A0C(inflate, AnonymousClass000.A00(9));
            IgTextView igTextView = inflate;
            this.A07 = igTextView;
            if (igTextView != null) {
                igTextView.setTextAppearance(R.style.control_option_title_text);
                igTextView.setText(2131973491);
            }
            ViewGroup viewGroup = this.A02;
            if (viewGroup != null) {
                viewGroup.addView(this.A07);
                A04();
                KNM knm = new KNM(r10.requireContext());
                this.A08 = knm;
                View.OnClickListener onClickListener = this.A0G;
                AnonymousClass0fU.A00(onClickListener, knm);
                C60063Jel jel = this.A08;
                if (!(jel == null || (shareSwitch2 = jel.getShareSwitch()) == null)) {
                    shareSwitch2.A07 = C65372LsD.A00;
                    AnonymousClass0fU.A00(this.A0H, shareSwitch2);
                }
                int A022 = JTQ.A02(this.A08);
                KNL knl = new KNL(r10.requireContext());
                this.A0A = knl;
                AnonymousClass0fU.A00(onClickListener, knl);
                C60063Jel jel2 = this.A0A;
                if (!(jel2 == null || (shareSwitch = jel2.getShareSwitch()) == null)) {
                    shareSwitch.A07 = C65373LsE.A00;
                    AnonymousClass0fU.A00(this.A0H, shareSwitch);
                }
                C60063Jel jel3 = this.A0A;
                if (jel3 != null) {
                    jel3.setVisibility(A022);
                }
                if (!(!((LE1) ((JU0) this.A0K.A06.getValue()).A03).A04 || (view = r10.mView) == null || (viewTreeObserver = view.getViewTreeObserver()) == null)) {
                    viewTreeObserver.addOnScrollChangedListener(new LZ5(this, 3));
                }
                C60063Jel jel4 = this.A08;
                ViewGroup viewGroup2 = this.A02;
                if (viewGroup2 != null) {
                    viewGroup2.addView(jel4);
                    C60063Jel jel5 = this.A0A;
                    ViewGroup viewGroup3 = this.A02;
                    if (viewGroup3 != null) {
                        viewGroup3.addView(jel5);
                        C48153EZv eZv = C48153EZv.A05;
                        C249803kO it = C63418Kwe.A00(userSession).iterator();
                        0qQ.A07(it);
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            C48153EZv eZv2 = (C48153EZv) it.next();
                            0qQ.A0A(eZv2);
                            this.A01 = DbV.A0E(r10).inflate(R.layout.widget_share_table_row_threads_unified, (ViewGroup) null);
                            int A023 = AnonymousClass7TG.A02(r10.requireContext());
                            View view2 = this.A01;
                            if (view2 != null) {
                                view2.setPadding(A023, 0, A023, 0);
                                this.A0C = (GradientSpinnerAvatarView) view2.requireViewById(R.id.share_table_profile_picture);
                                this.A05 = DbU.A0G(view2, R.id.share_table_button);
                                this.A06 = DbU.A0G(view2, R.id.share_table_button_v2);
                                this.A03 = DbU.A0G(view2, R.id.row_text);
                                this.A04 = DbU.A0G(view2, R.id.row_text_v2);
                                this.A0B = (IgdsSwitch) view2.requireViewById(R.id.share_switch);
                                View requireViewById = view2.requireViewById(R.id.audience_description_row);
                                this.A00 = requireViewById;
                                AnonymousClass7TH.A0R(requireViewById);
                            }
                            GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0C;
                            if (gradientSpinnerAvatarView != null) {
                                gradientSpinnerAvatarView.A05();
                            }
                            this.A0M.Civ(eZv2.A02);
                            ViewGroup viewGroup4 = this.A02;
                            if (viewGroup4 == null) {
                                break;
                            }
                            viewGroup4.addView(this.A01);
                        }
                    }
                }
            }
            0qQ.A0F("view");
            throw AnonymousClass00P.createAndThrow();
        }
        Context requireContext = r10.requireContext();
        ViewGroup viewGroup5 = this.A02;
        if (viewGroup5 != null) {
            C48153EZv eZv3 = C48153EZv.A05;
            C60058JeZ jeZ = new C60058JeZ(requireContext, viewGroup5, r10, userSession, (ShareLaterMedia) null, this.A0M, "share_sheet", C63418Kwe.A00(userSession), (List) null);
            this.A0D = jeZ;
            ViewGroup viewGroup6 = this.A02;
            if (viewGroup6 != null) {
                viewGroup6.addView(jeZ);
            }
        }
        0qQ.A0F("view");
        throw AnonymousClass00P.createAndThrow();
        ViewGroup viewGroup7 = this.A02;
        if (viewGroup7 != null) {
            return viewGroup7;
        }
        0qQ.A0F("view");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A0Q;
    }
}
