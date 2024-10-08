package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.E3d  reason: case insensitive filesystem */
public final class C47456E3d extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "BroadcastBottomSheetNuxFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final View.OnClickListener A04 = FP8.A00(this, 24);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final boolean onBackPressed() {
        C313746gw.A00(AnonymousClass7TE.A0l(this.A00)).A0a(DbS.A0t(this.A01), DbS.A0t(this.A02), false);
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        IgdsButton igdsButton = (IgdsButton) AnonymousClass7TF.A0F(view2, R.id.public_chat_joinflow_cta_button);
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_cta_button_subtext);
        ImageView A0J = DbX.A0J(view2, R.id.public_chat_joinflow_header_image);
        TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_header_title);
        ImageView A0J2 = DbX.A0J(view2, R.id.public_chat_joinflow_info_1_icon);
        TextView A0R3 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_info_1_subtitle);
        IgTextView A0Z = DbX.A0Z(view2, R.id.public_chat_joinflow_info_1_description);
        ImageView A0J3 = DbX.A0J(view2, R.id.public_chat_joinflow_info_2_icon);
        TextView A0R4 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_info_2_subtitle);
        IgTextView A0Z2 = DbX.A0Z(view2, R.id.public_chat_joinflow_info_2_description);
        ImageView A0J4 = DbX.A0J(view2, R.id.public_chat_joinflow_info_3_icon);
        TextView A0R5 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_info_3_subtitle);
        IgTextView A0Z3 = DbX.A0Z(view2, R.id.public_chat_joinflow_info_3_description);
        AnonymousClass0fU.A00(this.A04, igdsButton);
        C47166Drh A012 = ((C46784DlC) this.A03.getValue()).A01();
        DbU.A13(requireContext, A0J, A012.A03);
        DbZ.A13(A0R2, this, A012.A06);
        DbU.A13(requireContext, A0J2, A012.A00);
        DbZ.A13(A0R3, this, A012.A07);
        AnonymousClass0eM r4 = this.A00;
        C48829Ekr.A00(requireContext, AnonymousClass7TE.A0l(r4), A0Z, A012.A0A);
        DbU.A13(requireContext, A0J3, A012.A01);
        DbZ.A13(A0R4, this, A012.A08);
        C48829Ekr.A00(requireContext, AnonymousClass7TE.A0l(r4), A0Z2, A012.A0B);
        DbU.A13(requireContext, A0J4, A012.A02);
        DbZ.A13(A0R5, this, A012.A09);
        C48829Ekr.A00(requireContext, AnonymousClass7TE.A0l(r4), A0Z3, A012.A0C);
        igdsButton.setText(Dba.A0Y(this, A012.A05));
        DbU.A1G(A0R, this, 2131954202);
        0xY A0p = AnonymousClass7TE.A0p(DbX.A0h(r4));
        A0p.E5T(AnonymousClass000.A00(264), true);
        A0p.apply();
        C313746gw.A00(AnonymousClass7TE.A0l(r4)).A0Y(C273654mx.A00(380), DbS.A0t(this.A01), DbS.A0t(this.A02), false, false);
    }

    public C47456E3d() {
        0eO r3 = 0eO.A02;
        this.A01 = AnonymousClass0eN.A00(r3, new C73673Phm("", this, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, 0));
        this.A02 = AnonymousClass0eN.A00(r3, new C73673Phm("", this, "thread_v2_id", 1));
        C73902Pld pld = new C73902Pld(this, 5);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C73902Pld(new C73902Pld(this, 2), 3));
        this.A03 = DbS.A0I(new C73902Pld(A002, 4), pld, new C73665Phe(17, A002, (Object) null), DbS.A0z(C46784DlC.class));
        this.A00 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1256902876);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_broadcast_bottom_sheet_nux, false);
        AnonymousClass0fD.A09(1442321299, A022);
        return A0D;
    }
}
