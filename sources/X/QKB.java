package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.android.R;
import com.instagram.igds.components.textcell.IgdsListCell;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.Locale;

public final class QKB extends QKC {
    public View A00;
    public boolean A01;

    public final Dialog A0F(Bundle bundle) {
        IgRadioGroup igRadioGroup;
        C11265SHz sHz;
        boolean z = requireArguments().getBoolean("is_payment_enabled", false);
        this.A0A = requireArguments().getBoolean("is_reconsent_enabled", false);
        this.A09 = requireArguments().getBoolean("is_consent_accepted", false);
        this.A01 = requireArguments().getBoolean("should_always_show_ads_disclosure", false);
        this.A0B = requireArguments().getBoolean("should_show_fbpay_disclosure", false);
        boolean z2 = this.A0A;
        LinkedHashSet linkedHashSet = null;
        LayoutInflater from = LayoutInflater.from(requireActivity());
        if (z2) {
            View inflate = from.inflate(R.layout.layout_autofill_payment, (ViewGroup) null);
            this.A00 = inflate;
            ViewStub viewStub = (ViewStub) inflate.requireViewById(R.id.autofill_contact_info_stub);
            S5W s5w = this.A01;
            if (s5w != null) {
                sHz = s5w.A00("CLICKED_LEARN_MORE", false).A00();
            } else {
                sHz = null;
            }
            if (this.A01 || !this.A09) {
                SKI.A00(requireActivity(), this.mArguments, this.A00, (TextView) null, this.A02, sHz, 2131972509, R.id.autofill_ads_disclosure_stub, 2131953393, z);
                JTR.A1C(this.A00, R.id.manage_saved_info_caption_stub);
            } else {
                SKI.A00(requireActivity(), this.mArguments, this.A00, (TextView) null, this.A02, sHz, 2131965846, R.id.manage_saved_info_caption_stub, 2131953393, z);
            }
            igRadioGroup = (IgRadioGroup) viewStub.inflate();
            View view = this.A00;
            if (this.A02 != null && A0I(true)) {
                C10860RzL rzL = this.A02.A00;
                0qQ.A0B(rzL, 0);
                Calendar instance = Calendar.getInstance();
                instance.add(6, 30);
                long timeInMillis = instance.getTimeInMillis();
                rzL.A00.A00 = timeInMillis;
                IgdsListCell igdsListCell = (IgdsListCell) view.requireViewById(R.id.automatic_autofill_consent);
                igdsListCell.A0G(C69349Njo.TYPE_SWITCH, true);
                igdsListCell.setTitleTextSize(45.0f);
                igdsListCell.setChecked(true);
                this.A02.A00.A00.A01 = true;
                Locale locale = Locale.getDefault();
                0qQ.A0B(locale, 1);
                String format = new SimpleDateFormat("MM/dd/yyyy, hh:mm a", locale).format(new Date(timeInMillis));
                0qQ.A07(format);
                igdsListCell.A0H(StringFormatUtil.formatStrLocaleSafe(getString(2131956561), format));
                igdsListCell.A0D(new C11531Sbs(this, 0));
                igdsListCell.setVisibility(0);
            }
            C11497SbK.A01(this.A00.requireViewById(R.id.not_now_button), 8, this);
        } else {
            View inflate2 = from.inflate(R.layout.layout_autofill, (ViewGroup) null);
            this.A00 = inflate2;
            igRadioGroup = (IgRadioGroup) inflate2.requireViewById(R.id.autofill_radio_group);
        }
        SKI.A01(this.A00, this.A0B);
        RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = this.A05;
        if (requestAutofillJSBridgeCall != null) {
            linkedHashSet = requestAutofillJSBridgeCall.A01();
        }
        SKI.A02(this, this.A05, igRadioGroup, this.A08, linkedHashSet, this.A0A);
        C11499SbM.A01(this.A00.requireViewById(R.id.done_button), 5, this, igRadioGroup);
        AlertDialog create = new AlertDialog.Builder(requireActivity()).setView(this.A00).create();
        if (this.A00) {
            create.setCanceledOnTouchOutside(false);
        }
        return create;
    }

    public final void onResume() {
        int A02 = AnonymousClass0fD.A02(-2058975640);
        QKB.super.onResume();
        boolean z = this.A00;
        View view = this.A00;
        if (z) {
            AnonymousClass7TH.A0R(view.findViewById(R.id.autofill_bottomsheet_drag_handle));
        } else {
            C11507SbU.A00(view.requireViewById(R.id.autofill_bottomsheet_drag_handle), 0, this);
        }
        AnonymousClass0fD.A09(-1001714845, A02);
    }
}
