package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E2f  reason: case insensitive filesystem */
public final class C47433E2f extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AiCharacterQuickCaptureBottomSheetFragment";
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public String A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        View.OnClickListener onClickListener = this.A00;
        if (onClickListener != null) {
            r3.Eiy("Cancel", onClickListener);
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        IgdsHeadline igdsHeadline = (IgdsHeadline) view.findViewById(R.id.ai_character_disclaimer_headline);
        Context requireContext = requireContext();
        requireContext.getResources();
        FGX A022 = FGX.A02(requireContext, true);
        FGX.A03(A022, igdsHeadline, FGX.A00(this, A022, DbV.A05(this).getString(2131952599), DbV.A05(this).getString(2131952597), R.drawable.instagram_app_imessage_pano_outline_24).getString(2131952600), DbV.A05(this).getString(2131952598), R.drawable.instagram_gen_ai_pano_outline_24);
        igdsHeadline.A0D();
        C3021461u r5 = (C3021461u) view.findViewById(R.id.ai_character_disclaimer_bottom_button_layout);
        Context requireContext2 = requireContext();
        Resources resources = requireContext2.getResources();
        r5.setDividerVisible(false);
        r5.setPrimaryAction(resources.getString(2131952603), this.A01);
        r5.setSecondaryAction(resources.getString(2131952602), new FPH(17, (Object) requireContext2, (Object) this, (Object) resources));
        TextView A0d = AnonymousClass7TE.A0d(view, R.id.ai_character_disclaimer_bottom_button_footer_text);
        Context requireContext3 = requireContext();
        Resources resources2 = requireContext3.getResources();
        String A0d2 = AnonymousClass7TF.A0d(resources2, 2131952596);
        C48051ESu eSu = new C48051ESu(requireContext3, this, A0d2, requireContext3.getColor(2Yu.A06(getActivity())));
        SpannableStringBuilder A0C = DbS.A0C(AnonymousClass7TF.A0e(resources2, A0d2, 2131952601));
        AnonymousClass7AV.A05(A0C, eSu, A0d2);
        A0d.setText(A0C);
        A0d.setMovementMethod(AnonymousClass6LK.A00);
    }

    public final String getModuleName() {
        String str = this.A02;
        if (str != null) {
            return str;
        }
        0qQ.A0F("moduleName");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1033765028);
        C47433E2f.super.onCreate(bundle);
        String string = requireArguments().getString("args_previous_module_name");
        if (string != null) {
            this.A02 = string;
            AnonymousClass0fD.A09(1841011209, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("module name required");
        AnonymousClass0fD.A09(849643742, A022);
        throw A0z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-990592128);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.ai_character_disclaimer_sheet_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-108991310, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1096141369);
        super.onDestroyView();
        AnonymousClass0fD.A09(-989147747, A022);
    }
}
