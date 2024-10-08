package X;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.fbpay.w3c.CardDetails;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class QKQ extends QKG {
    public final Dialog A0F(Bundle bundle) {
        C270254gR r0;
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_autofill_save_payment, (ViewGroup) null);
        long j = requireArguments().getLong("disable_autofill_dismiss_option", 0);
        if (j != 2) {
            C11507SbU.A00(inflate, 5, this);
        } else {
            AnonymousClass7TH.A0R(inflate.findViewById(R.id.autofill_bottomsheet_drag_handle));
        }
        AlertDialog create = new AlertDialog.Builder(getActivity()).setView(inflate).create();
        if (j != 0) {
            create.setCanceledOnTouchOutside(false);
        }
        this.A01.getClass();
        C11265SHz A00 = this.A01.A06("CLICKED_LEARN_MORE").A00();
        inflate.requireViewById(R.id.icon_image_view).setVisibility(8);
        DbT.A1F(inflate, R.id.title_text_view, 8);
        ImageView A0F = DbU.A0F(inflate, R.id.autofill_optimization_illustration_image_view);
        TextView A0G = DbU.A0G(inflate, R.id.autofill_optimization_title_text_view);
        DbU.A13(requireContext(), A0F, R.drawable.ig_illustrations_illo_payments_add);
        TextView A0G2 = DbU.A0G(inflate, R.id.autofill_optimization_value_prop);
        DbT.A1H(A0G2);
        this.A01.getClass();
        if (requireArguments().getBoolean("autofill_show_unified_wallet_disclaimer_enabled", false)) {
            C270254gR r02 = this.A00;
            if (r02 != null) {
                Boolean A0R = AnonymousClass7TF.A0R(0Tu.A05, r02.A04.A00, 36322860551645818L);
                0qQ.A0A(A0R);
                if (A0R.booleanValue()) {
                    A0G2 = DbU.A0G(inflate, R.id.autofill_optimization_value_prop_updated);
                    DbT.A1H(A0G2);
                }
            }
            Activity requireActivity = requireActivity();
            Bundle A02 = this.A01.A04.A02();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            RBW rbw = new RBW(requireActivity, A02, this.A00, A00, DbV.A0n(inflate.getContext(), R.color.igds_link));
            String string = requireActivity.getString(2131953393);
            AnonymousClass7AV.A07(rbw, A0G2, string, spannableStringBuilder.append(requireActivity.getString(2131969054)).append(' ').append(string).append(' ').toString());
        } else {
            SKI.A00(requireActivity(), this.A01.A04.A02(), inflate, A0G2, this.A00, A00, 2131969053, -1, 2131964340, true);
        }
        if (A0G() && Pxj.A0k(this) != null) {
            DbT.A18(requireContext(), A0G, 2131972559);
            inflate.requireViewById(R.id.autofill_optimization_illustration_image_view).setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            int A01 = DbY.A01(requireContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            if (A01 != -1) {
                layoutParams.bottomMargin = A01;
            }
            inflate.requireViewById(R.id.autofill_optimization_title_text_view).setLayoutParams(layoutParams);
            int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_material);
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            if (dimensionPixelSize != -1) {
                layoutParams2.bottomMargin = dimensionPixelSize;
            }
            inflate.requireViewById(R.id.autofill_optimization_value_prop).setLayoutParams(layoutParams2);
        }
        A0G2.setVisibility(0);
        A0F.setVisibility(0);
        A0G.setVisibility(0);
        Parcelable parcelable = requireArguments().getParcelable("contact_info");
        Class<AutofillData> cls = AutofillData.class;
        Parcelable.Creator creator = AutofillData.CREATOR;
        AutofillData autofillData = (AutofillData) 0B0.A01(creator, parcelable, cls);
        if (autofillData != null && ((r0 = this.A00) == null || !r0.A04.A0C(false))) {
            QA2 A002 = SB3.A00(getActivity(), autofillData, true);
            A002.requireViewById(R.id.extra_btn).setVisibility(8);
            DbT.A1F(A002, R.id.radio_icon, 8);
            View requireViewById = inflate.requireViewById(R.id.autofill_contact_info_stub);
            ViewGroup viewGroup = (ViewGroup) inflate.requireViewById(R.id.scrollable_content);
            viewGroup.addView(A002, viewGroup.indexOfChild(requireViewById));
            viewGroup.removeViewInLayout(requireViewById);
            if (Pxj.A0k(this) != null) {
                DbT.A1F(inflate, R.id.autofill_contact_info_title, 0);
            }
        }
        CardDetails cardDetails = (CardDetails) Pxj.A0k(this);
        if (cardDetails != null) {
            QA1 qa1 = new QA1(inflate.getContext());
            qa1.A00(cardDetails);
            JTS.A0x(qa1);
            DbX.A1B(qa1, R.id.radio_icon);
            View requireViewById2 = inflate.requireViewById(R.id.autofill_payment_info_stub);
            ViewGroup viewGroup2 = (ViewGroup) inflate.requireViewById(R.id.scrollable_content);
            viewGroup2.addView(qa1, viewGroup2.indexOfChild(requireViewById2));
            viewGroup2.removeViewInLayout(requireViewById2);
            if (A0G()) {
                View requireViewById3 = inflate.requireViewById(R.id.contact_and_payment_entry_divider);
                View requireViewById4 = inflate.requireViewById(R.id.autofill_payment_info_title);
                requireViewById3.setVisibility(0);
                requireViewById4.setVisibility(0);
                AutofillData autofillData2 = (AutofillData) 0B0.A01(creator, requireArguments().getParcelable("contact_info"), cls);
                if (autofillData2 != null && autofillData2.A03()) {
                    int dimensionPixelSize2 = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                    qa1.setPadding(dimensionPixelSize2, DbV.A05(this).getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material), dimensionPixelSize2, 0);
                    IgdsListCell igdsListCell = (IgdsListCell) inflate.requireViewById(R.id.autofill_save_shipping_as_billing_option);
                    igdsListCell.A0G(C69349Njo.TYPE_SWITCH, true);
                    igdsListCell.A0D(new C11531Sbs(this, 2));
                    this.A02 = true;
                    igdsListCell.setVisibility(0);
                }
            }
        }
        C270254gR r03 = this.A00;
        if (r03 != null && r03.A04.A0C(false)) {
            inflate.requireViewById(R.id.contact_and_payment_entry_divider).setVisibility(8);
            DbT.A1F(inflate, R.id.autofill_payment_info_title, 8);
        }
        boolean z = requireArguments().getBoolean("is_consent_accepted", false);
        if (requireArguments().getBoolean("should_always_show_ads_disclosure", false) || !z) {
            if (autofillData != null) {
                if (cardDetails != null) {
                    ViewStub viewStub = (ViewStub) inflate.requireViewById(R.id.autofill_payment_bottom_disclaimer_stub);
                    SpannableStringBuilder append = DbS.A0C(getString(2131972509)).append(" ").append(A01(inflate));
                    int dimensionPixelSize3 = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    if (dimensionPixelSize3 != -1) {
                        layoutParams3.leftMargin = dimensionPixelSize3;
                        layoutParams3.rightMargin = dimensionPixelSize3;
                    }
                    inflate.requireViewById(R.id.autofill_payment_bottom_disclaimer_stub).setLayoutParams(layoutParams3);
                    TextView textView = (TextView) viewStub.inflate();
                    DbX.A1G(textView, append);
                    textView.setHighlightColor(0);
                    textView.setTextSize(0, DbV.A05(this).getDimension(R.dimen.auth_edit_field_text_size));
                    int dimensionPixelSize4 = DbV.A05(this).getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material);
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
                    if (dimensionPixelSize4 != -1) {
                        layoutParams4.leftMargin = dimensionPixelSize4;
                        layoutParams4.rightMargin = dimensionPixelSize4;
                    }
                    inflate.requireViewById(R.id.not_now_button).setLayoutParams(layoutParams4);
                }
            } else if (cardDetails != null) {
                TextView A0G3 = DbU.A0G(inflate, R.id.ads_and_saved_info_management_text);
                A0G3.setText(DbS.A0C(getString(2131972509)).append(" ").append(getString(2131953395)));
                A0G3.setVisibility(0);
            }
            DbX.A1B(inflate, R.id.divider_view);
            C11497SbK.A01(inflate.requireViewById(R.id.save_button), 12, this);
            C11497SbK.A01(inflate.requireViewById(R.id.not_now_button), 13, this);
            C270254gR r04 = this.A00;
            if (r04 != null && r04.A04.A00()) {
                ViewStub viewStub2 = (ViewStub) inflate.requireViewById(R.id.autofill_payment_save_passkey_view_stub);
                viewStub2.setLayoutResource(R.layout.layout_iab_autofill_payment_save_passkey_view);
                viewStub2.inflate();
                this.A00.A00.A0A.A01 = true;
                CompoundButton compoundButton = (CompoundButton) inflate.requireViewById(R.id.autofill_passkey_opt_in_checkbox);
                C270254gR r05 = this.A00;
                0qQ.A0B(r05, 0);
                compoundButton.setChecked(AnonymousClass7TE.A0q(r05.A03.A00).getBoolean("autofill_passkey_opt_in_cache_key", true));
                compoundButton.setOnCheckedChangeListener(new C11531Sbs(this, 3));
            }
            return create;
        }
        if (getActivity() != null) {
            SpannableStringBuilder A012 = A01(inflate);
            TextView textView2 = (TextView) DbY.A0F(inflate, R.id.autofill_payment_bottom_disclaimer_stub);
            DbX.A1G(textView2, A012);
            textView2.setHighlightColor(0);
        }
        DbX.A1B(inflate, R.id.divider_view);
        C11497SbK.A01(inflate.requireViewById(R.id.save_button), 12, this);
        C11497SbK.A01(inflate.requireViewById(R.id.not_now_button), 13, this);
        C270254gR r042 = this.A00;
        ViewStub viewStub22 = (ViewStub) inflate.requireViewById(R.id.autofill_payment_save_passkey_view_stub);
        viewStub22.setLayoutResource(R.layout.layout_iab_autofill_payment_save_passkey_view);
        viewStub22.inflate();
        this.A00.A00.A0A.A01 = true;
        CompoundButton compoundButton2 = (CompoundButton) inflate.requireViewById(R.id.autofill_passkey_opt_in_checkbox);
        C270254gR r052 = this.A00;
        0qQ.A0B(r052, 0);
        compoundButton2.setChecked(AnonymousClass7TE.A0q(r052.A03.A00).getBoolean("autofill_passkey_opt_in_cache_key", true));
        compoundButton2.setOnCheckedChangeListener(new C11531Sbs(this, 3));
        return create;
    }

    private SpannableStringBuilder A01(View view) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return DbS.A0C("");
        }
        String string = getString(2131969232);
        String string2 = getString(2131969539);
        SpannableStringBuilder A0C = DbS.A0C(getString(2131972510, new Object[]{string, string2}));
        Context context = view.getContext();
        C48053ESw eSw = new C48053ESw(DbV.A0n(context, R.color.igds_link), (Object) activity, (Object) this, 0);
        C48053ESw eSw2 = new C48053ESw(DbV.A0n(context, R.color.igds_link), (Object) activity, (Object) this, 1);
        AnonymousClass7AV.A04(A0C, eSw, string);
        AnonymousClass7AV.A04(A0C, eSw2, string2);
        return A0C;
    }
}
