package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;

/* renamed from: X.LpO  reason: case insensitive filesystem */
public final class C65218LpO implements MVS {
    public View A00;
    public View A01;
    public IgSimpleImageView A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgdsSwitch A06;
    public final UserSession A07;
    public final C61840KOe A08;
    public final C66576MXh A09;
    public final boolean A0A;
    public final AnonymousClass80P A0B = AnonymousClass80P.TEMP_CAMERA_TOOL;
    public final AnonymousClass4DH A0C;

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        AnonymousClass4DH r3 = this.A0C;
        Context requireContext = r3.requireContext();
        LinearLayout linearLayout = new LinearLayout(requireContext);
        linearLayout.setOrientation(1);
        JTS.A0x(linearLayout);
        View inflate = LayoutInflater.from(requireContext).inflate(R.layout.open_carousel_toggle_row, (ViewGroup) null);
        this.A00 = inflate;
        String str = "openCarouselToggleRow";
        if (inflate != null) {
            linearLayout.addView(inflate);
            View view = this.A00;
            if (view != null) {
                AnonymousClass7TF.A0G(view, R.id.open_carousel_row_icon).setVisibility(0);
                UserSession userSession = this.A07;
                0xa A0q = AnonymousClass7TE.A0q(userSession);
                if (A0q.getInt("open_carousel_share_sheet_new_badge_nux_1", 0) < 3 && 182.A06(0Tu.A05, userSession, 36320279269810330L)) {
                    AnonymousClass7TG.A0g(A0q, "open_carousel_share_sheet_new_badge_nux_1").apply();
                    View view2 = this.A00;
                    if (view2 != null) {
                        Dbb.A0t(view2, R.id.open_carousel_toggle_new_badge, 0);
                    }
                }
                View view3 = this.A00;
                if (view3 != null) {
                    View requireViewById = view3.requireViewById(R.id.open_carousel_post_toggle_row_switch);
                    0qQ.A0C(requireViewById, "null cannot be cast to non-null type com.instagram.igds.components.switchbutton.IgdsSwitch");
                    IgdsSwitch igdsSwitch = (IgdsSwitch) requireViewById;
                    this.A06 = igdsSwitch;
                    if (igdsSwitch == null) {
                        str = "openCarouselToggleButton";
                    } else {
                        igdsSwitch.A07 = new C65369LsA(this, 17);
                        View view4 = this.A00;
                        if (view4 != null) {
                            LYD.A02(view4, 23, this);
                            View view5 = this.A00;
                            if (view5 != null) {
                                View requireViewById2 = view5.requireViewById(R.id.how_it_works_text);
                                0qQ.A0C(requireViewById2, AnonymousClass000.A00(9));
                                LYG.A02(requireViewById2, 51, this, requireContext);
                                if (this.A0A) {
                                    View inflate2 = DbV.A0E(r3).inflate(R.layout.open_carousel_prompt_row, (ViewGroup) null);
                                    this.A01 = inflate2;
                                    str = "promptRow";
                                    if (inflate2 != null) {
                                        LYD.A02(inflate2, 24, this);
                                        View view6 = this.A01;
                                        if (view6 != null) {
                                            this.A04 = DbT.A0a(view6, R.id.open_carousel_prompt_empty_text);
                                            View view7 = this.A01;
                                            if (view7 != null) {
                                                this.A02 = JTP.A0T(view7, R.id.open_carousel_prompt_empty_icon);
                                                View view8 = this.A01;
                                                if (view8 != null) {
                                                    this.A05 = DbT.A0a(view8, R.id.open_carousel_prompt_valid_text);
                                                    View view9 = this.A01;
                                                    if (view9 != null) {
                                                        IgSimpleImageView A0T = JTP.A0T(view9, R.id.open_carousel_prompt_valid_icon);
                                                        LYD.A02(A0T, 25, this);
                                                        this.A03 = A0T;
                                                        View view10 = this.A01;
                                                        if (view10 != null) {
                                                            linearLayout.addView(view10);
                                                            View view11 = this.A01;
                                                            if (view11 != null) {
                                                                view11.setVisibility(8);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                LRh lRh = new LRh(userSession, r3.requireContext());
                                27r A002 = 27p.A00(lRh.A01, lRh.A07, (String) null, (String) null, (String) null, (String) null);
                                C279294yP r32 = C279294yP.FEED;
                                C697329a r2 = A002.A0G;
                                0Aj A0e = AnonymousClass7TE.A0e(r2.A01, "ig_camera_ui_tool_impression");
                                if (A0e.isSampled()) {
                                    JTO.A1O(AnonymousClass80P.ALLOW_TO_ADD_TO_THIS_POST, A0e);
                                    JTO.A1S(A0e, JTP.A0p(r2.A04));
                                    A0e.A8M(r32, "camera_destination");
                                    C51965G9l.A1A(C59725JVj.SHARE_SHEET, A0e);
                                    AnonymousClass7TH.A0U(A0e);
                                    A0e.Cgf();
                                }
                                return linearLayout;
                            }
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final C62674Kka B1s() {
        return null;
    }

    public final AnonymousClass80P BHl() {
        return this.A0B;
    }

    public final void CsQ() {
        if (182.A06(0Tu.A05, this.A07, 36323504790187213L)) {
            this.A08.A0A();
        } else {
            View view = this.A00;
            if (view == null) {
                0qQ.A0F("openCarouselToggleRow");
                throw AnonymousClass00P.createAndThrow();
            }
            view.post(new C65896M3l(this));
        }
        AnonymousClass4DH r0 = this.A0C;
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 37), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public C65218LpO(AnonymousClass4DH r4, UserSession userSession, C61840KOe kOe, C66576MXh mXh) {
        C51974G9v.A1P(r4, userSession, kOe, mXh);
        this.A0C = r4;
        this.A07 = userSession;
        this.A08 = kOe;
        this.A09 = mXh;
        this.A0A = 182.A06(0Tu.A05, userSession, 36320279270858919L);
    }
}
