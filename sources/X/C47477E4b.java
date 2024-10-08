package X;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.fanclub.consideration.FanClubConsiderationViewModel;
import com.instagram.igds.components.button.IgdsButton;
import com.instagram.monetization.repository.MonetizationRepository;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.Iterator;

/* renamed from: X.E4b  reason: case insensitive filesystem */
public final class C47477E4b extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "FanClubConsiderationFragment";
    public IgLinearLayout A00;
    public IgLinearLayout A01;
    public IgSimpleImageView A02;
    public IgSimpleImageView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public IgTextView A0B;
    public C252063oV A0C;
    public C252063oV A0D;
    public C252063oV A0E;
    public IgdsButton A0F;
    public IgdsButton A0G;
    public SpinnerImageView A0H;
    public final AnonymousClass0eM A0I = A01(this, 37);
    public final AnonymousClass0eM A0J = A01(this, 38);
    public final AnonymousClass0eM A0K = A01(this, 39);
    public final AnonymousClass0eM A0L = A01(this, 40);
    public final AnonymousClass0eM A0M = A01(this, 41);
    public final AnonymousClass0eM A0N = A01(this, 42);
    public final AnonymousClass0eM A0O = C227642jf.A02(this);
    public final AnonymousClass0eM A0P = A01(this, 43);
    public final AnonymousClass0eM A0Q = A01(this, 47);
    public final AnonymousClass0eM A0R;

    public final void configureActionBar(2da r10) {
        GKO gko;
        0qQ.A0B(r10, 0);
        if (AnonymousClass7TF.A1Z(this.A0P)) {
            r10.Etr(false);
            return;
        }
        r10.Eu4(true);
        r10.setTitle("");
        FanClubConsiderationViewModel A002 = A00(this);
        01N A1H = 0jo.A1H();
        if (A002.A00 == AnonymousClass05K.A0C && !A002.A0M) {
            A1H.add(new C66805Mcr(AnonymousClass05K.A00));
            UserSession userSession = A002.A03;
            MonetizationRepository monetizationRepository = A002.A08;
            if (182.A06(0Tu.A05, userSession, 36314725876763408L) && monetizationRepository.A06) {
                0xa r2 = A002.A09.A01;
                if (!r2.getBoolean("has_seen_consideration_share_screen_promo_sticker_tooltip", false)) {
                    DbX.A1V(r2, "has_seen_consideration_share_screen_promo_sticker_tooltip", true);
                    gko = DbS.A0Q(new Object[0], 2131957100);
                } else {
                    gko = null;
                }
                A1H.add(new C66805Mcr((C266444Yx) gko, AnonymousClass05K.A01, (int) R.drawable.instagram_share_pano_outline_24, 2131961997));
            }
        }
        Iterator it = 0jo.A1I(A1H).iterator();
        while (it.hasNext()) {
            C66805Mcr mcr = (C66805Mcr) it.next();
            AnonymousClass3JR A0K2 = DbS.A0K();
            A0K2.A06 = mcr.A02;
            A0K2.A05 = mcr.A01;
            A0K2.A0G = new FPF(2, (Object) mcr, (Object) this);
            View AA3 = r10.AA3(new AnonymousClass3Jb(A0K2));
            C266444Yx r3 = (C266444Yx) mcr.A03;
            if (r3 != null) {
                AA3.postDelayed(new C51507FvF(AA3, r3, this, AA3.getResources().getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding)), 1000);
            }
        }
    }

    public final String getModuleName() {
        return "FanClubFanOnboardingConsiderationFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        View view2 = this.mView;
        if (view2 != null) {
            SpinnerImageView A0k = DbX.A0k(view2);
            DbS.A1T(A0k);
            this.A0H = A0k;
            this.A01 = (IgLinearLayout) view2.requireViewById(R.id.subscription_info);
            this.A02 = (IgSimpleImageView) view2.requireViewById(R.id.facepile_icon);
            this.A03 = (IgSimpleImageView) view2.requireViewById(R.id.icon_badge);
            this.A0B = DbT.A0a(view2, R.id.fan_club_name_title);
            this.A09 = DbT.A0a(view2, R.id.fan_club_description);
            this.A0A = DbT.A0a(view2, R.id.support_value_prop_description);
            this.A0F = DbU.A0b(view2, R.id.cta_button);
            IgTextView A0a = DbT.A0a(view2, R.id.learn_more_footer);
            this.A07 = A0a;
            if (A0a == null) {
                0qQ.A0F("footer");
                throw AnonymousClass00P.createAndThrow();
            }
            DbT.A1H(A0a);
            this.A0G = DbU.A0b(view2, R.id.secondary_cta_button);
            this.A04 = DbT.A0a(view2, R.id.benefit_header);
            this.A05 = DbT.A0a(view2, R.id.customized_benefits_edit_cta);
            this.A00 = (IgLinearLayout) view2.requireViewById(R.id.bullet_cell_group_container);
            this.A06 = DbT.A0a(view2, R.id.customized_benefits_span);
            this.A0C = DbU.A0Y(view2, R.id.fan_club_consideration_content_preview_section_stub);
            this.A0D = DbU.A0Y(view2, R.id.fan_club_consideration_exclusive_content_view_stub);
            this.A0E = DbU.A0Y(view2, R.id.fan_club_consideration_social_context_section_stub);
            this.A08 = DbT.A0a(view2, R.id.recent_content_text);
            FanClubConsiderationViewModel A002 = A00(this);
            Context requireContext = requireContext();
            Object value = this.A0Q.getValue();
            Object value2 = this.A0L.getValue();
            1Eo.A05(((AnonymousClass12U) A002.A02).A04, new MHF(value, value2, requireContext, A002, (AnonymousClass4D7) null, 40), C318116oQ.A00(A002));
            A00(this);
            String A0l = DbW.A0l(this.A0M);
            if (!C49280EsP.A00.contains(A0l)) {
                DbT.A1Q(0wj.A01, 002.A0R("Unexpected origin: ", A0l), 1062876315);
            }
            07U r10 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r10, this, (AnonymousClass4D7) null, 6), AnonymousClass07a.A00(viewLifecycleOwner));
            return;
        }
        throw DbU.A0h();
    }

    public static final FanClubConsiderationViewModel A00(C47477E4b e4b) {
        return (FanClubConsiderationViewModel) e4b.A0R.getValue();
    }

    public static AnonymousClass0eM A01(Object obj, int i) {
        return AnonymousClass1YB.A00(new C58675Ivk(obj, i));
    }

    public static final boolean A02(C47477E4b e4b) {
        return AnonymousClass7TF.A1Z(e4b.A0P);
    }

    public final UserSession A03() {
        return AnonymousClass7TE.A0l(this.A0O);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A0O);
    }

    public C47477E4b() {
        C58675Ivk ivk = new C58675Ivk(this, 48);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58675Ivk(new C58675Ivk(this, 44), 45));
        this.A0R = DbS.A0I(new C58675Ivk(A002, 46), ivk, new C58187Inr(0, A002, (Object) null), DbS.A0z(FanClubConsiderationViewModel.class));
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            DbX.A1I(this);
        }
    }

    public final boolean onBackPressed() {
        if (!isResumed() || A00(this).A0L.getValue() == EVA.READY_TO_PURCHASE) {
            return false;
        }
        C358248ab A0V = DbW.A0V(this);
        A0V.A09(2131962071);
        A0V.A08(2131962070);
        A0V.A0I((DialogInterface.OnClickListener) null, 2131962069);
        A0V.A0O(C50023FJi.A00(this, 49), C358278ae.RED, 2131962068);
        DbT.A1V(A0V);
        return true;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1068123879);
        0qQ.A0B(layoutInflater, 0);
        boolean A1Z = AnonymousClass7TF.A1Z(this.A0P);
        int i = R.layout.fan_club_consideration;
        if (A1Z) {
            i = R.layout.fan_club_consideration_bottom_sheet;
        }
        View inflate = layoutInflater.inflate(i, viewGroup, false);
        AnonymousClass0fD.A09(717157249, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1123910848);
        FanClubConsiderationViewModel A002 = A00(this);
        if (DbX.A1b(A002.A0I)) {
            L4V l4v = A002.A05;
            l4v.A00.markerEndAtPoint(1062864564, l4v.A01.hashCode(), 4, C48893Elt.A00(AnonymousClass05K.A00));
        }
        if (A002.A0L.getValue() != EVA.READY_TO_PURCHASE) {
            L4V l4v2 = A002.A05;
            l4v2.A00.markerEndAtPoint(1062866800, l4v2.A01.hashCode(), 4, "cancel_during_purchase_flow");
        }
        super.onDestroy();
        AnonymousClass0fD.A09(-546749194, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1824012224);
        SpinnerImageView spinnerImageView = this.A0H;
        if (spinnerImageView == null) {
            0qQ.A0F("spinner");
            throw AnonymousClass00P.createAndThrow();
        }
        spinnerImageView.setLoadingStatus(C255943uy.LOADED);
        C47477E4b.super.onPause();
        AnonymousClass0fD.A09(-1439880434, A022);
    }
}
