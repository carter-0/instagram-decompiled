package X;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;

/* renamed from: X.Ume  reason: case insensitive filesystem */
public final class C15997Ume extends C15267UYh implements AnonymousClass4DU, AnonymousClass4DR {
    public static final String __redex_internal_original_name = "LeadAdsContextCardFragment";
    public Drawable A00;
    public IgTextView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public CircularImageView A06;
    public IgImageView A07;
    public 2el A08;
    public IgdsBottomButtonLayout A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;

    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r1v13, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        W1T.A00(this);
        super.onViewCreated(view, bundle);
        2el r3 = this.A08;
        if (r3 != null) {
            int i = 0;
            r3.A08(view, AnonymousClass3DZ.A00(this), new AnonymousClass2eo[0]);
            if (!DbX.A1b(((C16037UnQ) A07()).A0A)) {
                C17831Vgk vgk = ((C16037UnQ) A07()).A06;
                vgk.A00.Cgq(DbY.A0B("form_id", vgk.A02), vgk.A01, "lead_gen_full_page_context_card", "full_page_context_card_impression", "impression");
            }
            this.A04 = DbT.A0a(view, R.id.context_card_title_text_view);
            this.A07 = DbT.A0b(view, R.id.background_image);
            this.A06 = DbU.A0X(view, R.id.profile_image);
            this.A05 = DbT.A0a(view, R.id.username_text_view);
            this.A02 = DbT.A0a(view, R.id.follower_number_text_view);
            this.A01 = DbT.A0a(view, R.id.description_text_view);
            this.A09 = C13990Tnq.A0Q(view);
            ? r1 = this.A06;
            if (r1 != 0) {
                WB9.A00(r1, 55, this);
            }
            IgTextView igTextView = this.A05;
            if (igTextView != null) {
                WB9.A00(igTextView, 56, this);
            }
            IgTextView igTextView2 = this.A02;
            if (igTextView2 != null) {
                WB9.A00(igTextView2, 57, this);
            }
            WB9.A00(view.requireViewById(R.id.close_icon), 53, this);
            WB9.A00(view.requireViewById(R.id.bottom_button_layout), 54, this);
            View A0G = AnonymousClass7TF.A0G(view, R.id.gated_content_locked_message_container);
            if (!((C16037UnQ) A07()).A00) {
                i = 8;
            }
            A0G.setVisibility(i);
            if (((C16037UnQ) A07()).A00) {
                C17831Vgk vgk2 = ((C16037UnQ) A07()).A06;
                vgk2.A00.Cgq(DbY.A0B("form_id", vgk2.A02), vgk2.A01, "lead_gen_full_page_context_card", "gated_content_locked_message_impression", "impression");
            }
            this.A03 = DbT.A0a(view, R.id.gated_content_locked_message_text_view);
            DbV.A1F(getViewLifecycleOwner(), ((C16037UnQ) A07()).A02, new C20786Wyx(this, 2), 2);
            C20786Wyx.A00(getViewLifecycleOwner(), ((C16037UnQ) A07()).A01, this, 3, 2);
            C20786Wyx.A00(getViewLifecycleOwner(), ((C16037UnQ) A07()).A03, this, 4, 2);
            AnonymousClass0eM r6 = this.A0B;
            UserSession userSession = ((C16037UnQ) r6.getValue()).A04;
            2el r0 = this.A08;
            if (r0 != null) {
                new C55943Hq7(userSession, r0, this).A00(view, C18490Vsl.A05.A00(this.mArguments, C16610Uy6.A05, ((C16037UnQ) r6.getValue()).A04.A05, getParentFragmentManager().A0M()));
                IgTextView igTextView3 = this.A04;
                if (igTextView3 != null) {
                    C244083ac.A05(igTextView3, C244063aa.TITLE);
                }
                ? r12 = this.A06;
                if (r12 != 0) {
                    C244083ac.A05(r12, C244063aa.PROFILE_IMAGE);
                }
                IgTextView igTextView4 = this.A01;
                if (igTextView4 != null) {
                    C244083ac.A05(igTextView4, C244063aa.CAPTION);
                }
                IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
                if (igdsBottomButtonLayout != null) {
                    C244083ac.A05(igdsBottomButtonLayout, C244063aa.CTA);
                    return;
                }
                return;
            }
        }
        0qQ.A0F("viewpointManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean onBackPressed() {
        AnonymousClass0eM r3 = this.A0B;
        if (((C16037UnQ) r3.getValue()).A0C) {
            return false;
        }
        W1T.A00.A03(this, ((C16037UnQ) r3.getValue()).A04, ((C16037UnQ) r3.getValue()).A0B);
        return true;
    }

    public C15997Ume() {
        C73660PhZ phZ = new C73660PhZ(this, 46);
        C73660PhZ phZ2 = new C73660PhZ(this, 39);
        0eO r4 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r4, new C73660PhZ(phZ2, 40));
        this.A0B = new C227862kA(new C73660PhZ(A002, 41), phZ, new C73666Phf(35, (Object) null, A002), new 0Yh(C16037UnQ.class));
        C73660PhZ phZ3 = new C73660PhZ(this, 45);
        AnonymousClass0eM A003 = AnonymousClass0eN.A00(r4, new C73660PhZ(new C73660PhZ(this, 42), 43));
        this.A0A = new C227862kA(new C73660PhZ(A003, 44), phZ3, new C73666Phf(36, (Object) null, A003), new 0Yh(C14771U8h.class));
    }

    public final AnonymousClass0wW getSession() {
        return ((C16037UnQ) A07()).A04;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1444093507);
        0qQ.A0B(layoutInflater, 0);
        this.A08 = DbY.A0U();
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_context_card, viewGroup, false);
        AnonymousClass0fD.A09(11326036, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1586203603);
        super.onDestroyView();
        this.A04 = null;
        this.A07 = null;
        this.A06 = null;
        this.A05 = null;
        this.A02 = null;
        this.A01 = null;
        this.A09 = null;
        this.A03 = null;
        AnonymousClass0fD.A09(-332170700, A022);
    }
}
