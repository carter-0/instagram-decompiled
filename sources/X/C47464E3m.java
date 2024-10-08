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
import java.util.Map;

/* renamed from: X.E3m  reason: case insensitive filesystem */
public final class C47464E3m extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ChannelJoinFlowNuxFragment";
    public boolean A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C73902Pld(this, 11));
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = AnonymousClass0eN.A01(new C73902Pld(this, 12));
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final View.OnClickListener A0B;

    public final String getModuleName() {
        return "direct_public_chat_joinflow_nux";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        1Av r4;
        boolean z;
        0s0 r2;
        AnonymousClass0YZ[] r1;
        int i;
        C48146EZo eZo;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Context requireContext = requireContext();
        View A0F = AnonymousClass7TF.A0F(view2, R.id.public_chat_joinflow_dismiss_button);
        TextView A0R = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_cta_button);
        TextView A0R2 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_cta_button_subtext);
        ImageView A0J = DbX.A0J(view2, R.id.public_chat_joinflow_header_image);
        TextView A0R3 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_header_title);
        ImageView A0J2 = DbX.A0J(view2, R.id.public_chat_joinflow_info_1_icon);
        TextView A0R4 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_info_1_subtitle);
        IgTextView A0Z = DbX.A0Z(view2, R.id.public_chat_joinflow_info_1_description);
        ImageView A0J3 = DbX.A0J(view2, R.id.public_chat_joinflow_info_2_icon);
        TextView A0R5 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_info_2_subtitle);
        IgTextView A0Z2 = DbX.A0Z(view2, R.id.public_chat_joinflow_info_2_description);
        ImageView A0J4 = DbX.A0J(view2, R.id.public_chat_joinflow_info_3_icon);
        TextView A0R6 = AnonymousClass7TG.A0R(view2, R.id.public_chat_joinflow_info_3_subtitle);
        IgTextView A0Z3 = DbX.A0Z(view2, R.id.public_chat_joinflow_info_3_description);
        FP8.A01(A0F, 28, this);
        AnonymousClass0fU.A00(this.A0B, A0R);
        C47166Drh A012 = ((C46784DlC) this.A0A.getValue()).A01();
        DbU.A13(requireContext, A0J, A012.A03);
        DbZ.A13(A0R3, this, A012.A06);
        DbU.A13(requireContext, A0J2, A012.A00);
        DbZ.A13(A0R4, this, A012.A07);
        AnonymousClass0eM r5 = this.A07;
        C48829Ekr.A00(requireContext, AnonymousClass7TE.A0l(r5), A0Z, A012.A0A);
        DbU.A13(requireContext, A0J3, A012.A01);
        DbZ.A13(A0R5, this, A012.A08);
        C48829Ekr.A00(requireContext, AnonymousClass7TE.A0l(r5), A0Z2, A012.A0B);
        DbU.A13(requireContext, A0J4, A012.A02);
        DbZ.A13(A0R6, this, A012.A09);
        C48829Ekr.A00(requireContext, AnonymousClass7TE.A0l(r5), A0Z3, A012.A0C);
        DbZ.A13(A0R, this, A012.A05);
        C266444Yx r0 = A012.A04;
        if (r0 == null) {
            A0R2.setVisibility(8);
        } else {
            DbZ.A13(A0R2, this, r0);
            A0R2.setVisibility(0);
        }
        DbV.A0G(this).getDecorView().setBackgroundColor(AnonymousClass7TF.A03(requireContext(), R.attr.igds_color_primary_background));
        AnonymousClass0eM r42 = this.A06;
        switch (((C390899s1) r42.getValue()).ordinal()) {
            case 0:
                r4 = DbX.A0h(r5);
                z = true;
                r2 = r4.A38;
                r1 = 1Av.A8a;
                i = 393;
                break;
            case 1:
                0xY AR4 = C314986jA.A00(AnonymousClass7TE.A0l(r5)).A01.AR4();
                AR4.E5T(AnonymousClass000.A00(3226), true);
                AR4.apply();
                C50337FYu A002 = C48796EkJ.A00(AnonymousClass7TE.A0l(r5));
                String A0t = DbS.A0t(this.A04);
                if (A0t != null) {
                    int hashCode = A0t.hashCode();
                    if (hashCode != -1811290548) {
                        if (hashCode != 100344454) {
                            if (hashCode == 468776282 && A0t.equals("ssc_list")) {
                                eZo = C48146EZo.SSC_LIST_IN_SUBSCRIPTION_SETTINGS;
                            } else {
                                return;
                            }
                        } else if (A0t.equals("inbox")) {
                            eZo = C48146EZo.INBOX;
                        } else {
                            return;
                        }
                    } else if (A0t.equals(C66579MXk.A00(1039))) {
                        eZo = C48146EZo.PROFILE_PINNED_CHANNELS;
                    } else {
                        return;
                    }
                    C50337FYu.A02(A002);
                    C50337FYu.A01(C48147EZp.CHANNEL_ROW, eZo, A002, C273654mx.A00(1009), "tap", (Map) null);
                    return;
                }
                return;
            case 2:
            case 3:
                0xY A0p = AnonymousClass7TE.A0p(DbX.A0h(r5));
                A0p.E5T(AnonymousClass000.A00(264), true);
                A0p.apply();
                DbZ.A0R(this.A01).A0Y(DbS.A0t(this.A04), DbS.A0t(this.A08), DbS.A0t(this.A09), AnonymousClass7TF.A1W(r42.getValue(), C390899s1.SUBSCRIBER_BROADCAST_CHANNEL), requireArguments().getBoolean("is_followed_by_user"));
                ((1Ng) this.A05.getValue()).A00(new AnonymousClass7O4(AnonymousClass05K.A00));
                return;
            case 4:
                r4 = DbX.A0h(r5);
                z = true;
                r2 = r4.A3W;
                r1 = 1Av.A8a;
                i = 394;
                break;
            case 5:
                r4 = DbX.A0h(r5);
                z = true;
                r2 = r4.A3X;
                r1 = 1Av.A8a;
                i = 395;
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        AnonymousClass7TF.A1J(r4, r2, r1, i, z);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public final boolean onBackPressed() {
        if (this.A00) {
            return false;
        }
        AnonymousClass0eM r5 = this.A06;
        int ordinal = ((C390899s1) r5.getValue()).ordinal();
        if (ordinal == 2 || ordinal == 3) {
            DbZ.A0R(this.A01).A0a(DbS.A0t(this.A08), DbS.A0t(this.A09), AnonymousClass7TF.A1W(r5.getValue(), C390899s1.SUBSCRIBER_BROADCAST_CHANNEL));
        } else if (ordinal == 0) {
            Oy7 oy7 = (Oy7) this.A03.getValue();
            String A0t = DbS.A0t(this.A08);
            String A0t2 = DbS.A0t(this.A09);
            AnonymousClass7TF.A1H(A0t, A0t2);
            1Ln A0F = 1Ln.A0F(oy7.A00);
            if (DbT.A1Y(A0F)) {
                Dbb.A1G(A0F, oy7.A01);
                DbV.A1M(A0F, C273654mx.A00(2977));
                A0F.A0p(C273654mx.A00(2328));
                Dba.A1E(A0F, "public_chat_nux");
                A0F.A0s(A0t);
                A0F.A0i(AnonymousClass7TE.A10(A0t2));
                A0F.Cgf();
            }
        }
        ((1Ng) this.A05.getValue()).A00(new AnonymousClass7O4(AnonymousClass05K.A01));
        return false;
    }

    public C47464E3m() {
        0eO r3 = 0eO.A02;
        this.A06 = C51804G2n.A01(this, "nux_type", r3, 22);
        this.A08 = AnonymousClass0eN.A00(r3, new C73673Phm("", this, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, 2));
        this.A09 = AnonymousClass0eN.A00(r3, new C73673Phm("", this, "thread_v2_id", 3));
        this.A02 = AnonymousClass0eN.A00(r3, new C73673Phm("", this, "creator_id", 4));
        this.A04 = AnonymousClass0eN.A00(r3, new C73673Phm("", this, "entrypoint", 5));
        C73902Pld pld = new C73902Pld(this, 17);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r3, new C73902Pld(new C73902Pld(this, 14), 15));
        this.A0A = DbS.A0I(new C73902Pld(A002, 16), pld, new C73665Phe(18, A002, (Object) null), DbS.A0z(C46784DlC.class));
        this.A05 = AnonymousClass0eN.A01(new C73902Pld(this, 13));
        this.A0B = FP8.A00(this, 27);
        this.A07 = C227642jf.A02(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-811090119);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_public_chat_join_flow_nux, false);
        AnonymousClass0fD.A09(1889962624, A022);
        return A0D;
    }

    public final void onDetach() {
        int A022 = AnonymousClass0fD.A02(2140133194);
        C47464E3m.super.onDetach();
        if (!this.A00) {
            ((1Ng) this.A05.getValue()).A00(new AnonymousClass7O4(AnonymousClass05K.A01));
        }
        AnonymousClass0fD.A09(-1424947192, A022);
    }
}
