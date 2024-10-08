package X;

import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel;

public final class K69 extends AnonymousClass4DH implements AnonymousClass4DR, C227272iw {
    public static final String __redex_internal_original_name = "ClipsPreviewFragment";
    public C63629L0r A00;
    public C66576MXh A01;
    public LWf A02;
    public final String A03 = "clips_share_sheet_preview_page";
    public final AnonymousClass0eM A04 = C227642jf.A02(this);
    public final boolean A05 = true;

    public final void configureActionBar(2da r22) {
        2da r3 = r22;
        0qQ.A0B(r3, 0);
        Integer num = AnonymousClass05K.A00;
        int color = requireContext().getColor(R.color.fds_transparent);
        int color2 = requireContext().getColor(2Yu.A0A(getContext()));
        Drawable drawable = requireContext().getDrawable(R.drawable.clips_viewer_action_bar_gradient_background);
        r3.Eom(2131956805);
        r3.Eu5(new LYF((Object) this, 46), true);
        r3.ErJ(new AnonymousClass57Z((Resources.Theme) null, (ColorFilter) null, (ColorFilter) null, drawable, (Drawable) null, (View.OnClickListener) null, num, color2, color, -2, -2, -2, -2, -2, false));
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String A012 = C320236s2.A01(requireArguments, AnonymousClass000.A00(23));
        String string = requireArguments.getString("ClipsConstants.ARG_CLIPS_CAPTION_PREVIEW");
        AnonymousClass3Q2 A032 = 28K.A00(AnonymousClass7TE.A0l(this.A04)).A03(JTP.A0m(requireArguments, "ClipsConstants.ARG_CLIPS_SHARE_SHEET_PENDING_MEDIA_KEY"));
        LYF.A01(AnonymousClass7TF.A0G(view, R.id.save_draft_button), 47, this);
        LYF.A01(view.requireViewById(R.id.share_button), 48, this);
        C227862kA A0I = DbS.A0I(C59917Jbg.A00(this, 40), new C73669Phi(A012, this, 29), MMY.A00(this, (Object) null, 3), DbS.A0z(ClipsSharingDraftViewModel.class));
        0Yh A0z = DbS.A0z(C60112Jft.class);
        C227862kA A0I2 = DbS.A0I(C59917Jbg.A00(this, 41), C59917Jbg.A00(this, 42), MMY.A00(this, (Object) null, 4), A0z);
        View A0G = AnonymousClass7TF.A0G(view, R.id.clips_viewer_media_info);
        AnonymousClass2gB r2 = ((ClipsSharingDraftViewModel) A0I.getValue()).A00;
        Dba.A15(getViewLifecycleOwner(), r2, new C58802Ixn(this, A032, A0I2, A0G, view, string, 1), 11);
    }

    public final boolean COC() {
        return this.A05;
    }

    public final String getModuleName() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public final boolean onBackPressed() {
        27r A0g = C51971G9r.A0g(this.A04);
        String str = this.A03;
        29R r1 = A0g.A09;
        0qQ.A0B(str, 0);
        1Ln A0N = JTO.A0N(r1);
        if (DbT.A1Y(A0N)) {
            JTO.A1V(A0N);
            JTU.A16(A0N, r1, "PREVIEW_BACK_TO_SHARE_SHEET_BUTTON");
            AnonymousClass283 r12 = r1.A04;
            JTQ.A1B(A0N, r12);
            A0N.A0d(C59725JVj.SHARE_SHEET);
            A0N.A0n(str);
            JTT.A1E(A0N, r12);
            A0N.Cgf();
        }
        return false;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1250953920);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_preview_fragment, viewGroup, false);
        AnonymousClass0fD.A09(2053339048, A022);
        return inflate;
    }

    public final void onPause() {
        STU stu;
        int A022 = AnonymousClass0fD.A02(-658843191);
        K69.super.onPause();
        LWf lWf = this.A02;
        if (!(lWf == null || (stu = lWf.A00) == null)) {
            stu.A05();
        }
        AnonymousClass0fD.A09(-1799036661, A022);
    }

    public final void onResume() {
        STU stu;
        int A022 = AnonymousClass0fD.A02(-1572808784);
        super.onResume();
        LWf lWf = this.A02;
        if (!(lWf == null || (stu = lWf.A00) == null)) {
            stu.A06();
        }
        C317756nm.A03(requireActivity(), this, AnonymousClass7TE.A0l(this.A04), false, false);
        AnonymousClass0fD.A09(1999684667, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1183768467);
        K69.super.onStop();
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A04), false, false);
        AnonymousClass0fD.A09(124086339, A022);
    }
}
