package X;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.base.IgView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.facepile.IgdsFacepile;

/* renamed from: X.Ums  reason: case insensitive filesystem */
public final class C16011Ums extends C15996Umd implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "LeadAdsThankYouScreenWithMultiSubmitFragment";
    public RecyclerView A00;
    public RecyclerView A01;
    public IgTextView A02;
    public IgTextView A03;
    public IgView A04;
    public CircularImageView A05;
    public IgdsFacepile A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08 = C227642jf.A02(this);
    public final AnonymousClass0eM A09;

    public final String getModuleName() {
        return "lead_ad_question_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v7, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void onViewCreated(View view, Bundle bundle) {
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = DbT.A0a(view, R.id.multi_submit_title);
        this.A02 = DbT.A0a(view, R.id.multi_submit_subtitle);
        this.A00 = DbT.A0I(view, R.id.multi_submit_recycler_view);
        this.A01 = DbT.A0I(view, R.id.multi_submit_thank_you_recycler_view);
        this.A04 = (IgView) view.requireViewById(R.id.horizontal_divider);
        this.A05 = DbU.A0X(view, R.id.lead_ad_multi_submit_circular_imageview);
        this.A06 = (IgdsFacepile) view.requireViewById(R.id.multi_submit_facepile);
        int A022 = JTQ.A02(this.A03);
        IgTextView igTextView = this.A02;
        if (igTextView != null) {
            igTextView.setVisibility(A022);
        }
        IgView igView = this.A04;
        if (igView != null) {
            igView.setVisibility(A022);
        }
        RecyclerView recyclerView = this.A00;
        if (recyclerView != null) {
            recyclerView.setVisibility(A022);
        }
        IgTextView igTextView2 = this.A03;
        if (igTextView2 != null) {
            DbU.A1G(igTextView2, this, 2131964696);
        }
        IgTextView igTextView3 = this.A02;
        if (igTextView3 != null) {
            DbU.A1G(igTextView3, this, 2131964695);
        }
        07U r6 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new C66170MGh(viewLifecycleOwner, r6, this, (AnonymousClass4D7) null, A022), AnonymousClass07a.A00(viewLifecycleOwner));
        AnonymousClass0eM r62 = this.A09;
        UserSession userSession = ((C16038UnR) r62.getValue()).A04;
        2el r0 = this.A03;
        if (r0 != null) {
            C55943Hq7 hq7 = new C55943Hq7(userSession, r0, this);
            Bundle bundle2 = this.mArguments;
            if (bundle2 != null) {
                i = bundle2.getInt("thank_you_page_index");
            } else {
                i = 0;
            }
            hq7.A00(view, C18490Vsl.A05.A00(this.mArguments, C16610Uy6.A0D, ((C16038UnR) r62.getValue()).A04.A05, i + getParentFragmentManager().A0M()));
            IgTextView igTextView4 = this.A01;
            if (igTextView4 != null) {
                C244083ac.A05(igTextView4, C244063aa.TITLE);
            }
            IgTextView igTextView5 = this.A00;
            if (igTextView5 != null) {
                C244083ac.A05(igTextView5, C244063aa.CAPTION);
            }
            ? r1 = this.A05;
            if (r1 != 0) {
                C244083ac.A05(r1, C244063aa.PROFILE_IMAGE);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout = this.A04;
            if (igdsBottomButtonLayout != null) {
                C244083ac.A05(igdsBottomButtonLayout, C244063aa.CTA);
                return;
            }
            return;
        }
        0qQ.A0F("viewpointManager");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(JVH jvh, C16011Ums ums, String str) {
        String obj = C66909Mes.A01(ums, (C266444Yx) jvh.A02).toString();
        String A0e = C13991Tnr.A0e(ums, str, obj, 2131964692);
        C48051ESu eSu = new C48051ESu(ums, C16038UnR.A00((C16038UnR) ums.A09.getValue()), C320236s2.A01(ums.requireArguments(), "mediaID"), ums.requireActivity().getColor(2Yu.A06(ums.getContext())));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(A0e);
        AnonymousClass7AV.A05(spannableStringBuilder, eSu, obj);
        IgTextView igTextView = ums.A00;
        if (igTextView != null) {
            DbT.A1H(igTextView);
        }
        IgTextView igTextView2 = ums.A00;
        if (igTextView2 != null) {
            igTextView2.setText(spannableStringBuilder);
        }
    }

    public C16011Ums() {
        C20696WxS wxS = new C20696WxS(this, 30);
        AnonymousClass0eM A002 = C20696WxS.A00(new C20696WxS(this, 27), 0eO.A02, 28);
        this.A09 = new C227862kA(new C20696WxS(A002, 29), wxS, new C73666Phf(45, (Object) null, A002), new 0Yh(C16038UnR.class));
        0Yh r4 = new 0Yh(C60152JgX.class);
        this.A07 = new C227862kA(new C20696WxS(this, 25), new C20696WxS(this, 26), new C73666Phf(44, (Object) null, this), r4);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-182100232);
        0qQ.A0B(layoutInflater, 0);
        this.A03 = DbY.A0U();
        View inflate = layoutInflater.inflate(R.layout.lead_gen_fragment_thank_you_screen_with_multi_submit, viewGroup, false);
        AnonymousClass0fD.A09(-968846309, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-204922799);
        super.onDestroyView();
        this.A03 = null;
        this.A02 = null;
        this.A00 = null;
        this.A01 = null;
        this.A04 = null;
        this.A05 = null;
        this.A06 = null;
        AnonymousClass0fD.A09(2090065371, A022);
    }
}
