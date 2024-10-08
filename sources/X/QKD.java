package X;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.fbpay.w3c.views.AutofillTextInputLayout;
import com.instagram.android.R;

public final class QKD extends QKE {
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        String str2;
        Resources resources;
        String string;
        Resources resources2;
        0qQ.A0B(view, 0);
        this.A0C = AnonymousClass7TE.A0d(view, R.id.title);
        this.A0A = AnonymousClass7TE.A0d(view, R.id.description);
        this.A06 = (EditText) view.findViewById(R.id.card_pan_input);
        this.A0F = (AutofillTextInputLayout) view.findViewById(R.id.card_pan_input_layout);
        this.A05 = (EditText) view.findViewById(R.id.card_cvv_input);
        this.A0E = (AutofillTextInputLayout) view.findViewById(R.id.card_cvv_input_layout);
        this.A03 = (Button) view.findViewById(R.id.confirm_button);
        this.A08 = Pxe.A0M(view, R.id.enter_card_details_layout);
        this.A02 = view.findViewById(R.id.progress_layout);
        this.A09 = (ScrollView) view.findViewById(R.id.bottom_sheet_scroll_view);
        this.A07 = (FrameLayout) view.findViewById(R.id.bottom_sheet_layout);
        this.A04 = (Button) view.findViewById(R.id.not_now_button);
        this.A0B = AnonymousClass7TE.A0d(view, R.id.inline_error_message);
        Context context = getContext();
        String str3 = "";
        if (context == null || (str = context.getString(R.string.f0nameremoved)) == null) {
            str = str3;
        }
        this.A0H = str;
        Context context2 = getContext();
        if (context2 == null || (resources2 = context2.getResources()) == null || (str2 = resources2.getString(R.string.f0nameremoved)) == null) {
            str2 = str3;
        }
        this.A0J = str2;
        Context context3 = getContext();
        if (!(context3 == null || (resources = context3.getResources()) == null || (string = resources.getString(R.string.f0nameremoved)) == null)) {
            str3 = string;
        }
        this.A0I = str3;
    }

    public final Dialog A0F(Bundle bundle) {
        View inflate = LayoutInflater.from(requireActivity()).inflate(R.layout.layout_iab_autofill_demask_card_prompt, (ViewGroup) null);
        this.A01 = inflate;
        if (inflate != null) {
            C11507SbU.A00(inflate, 3, this);
        }
        AlertDialog create = new AlertDialog.Builder(requireActivity()).setView(this.A01).create();
        0qQ.A07(create);
        return create;
    }
}
