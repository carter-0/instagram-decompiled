package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.TextView;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import com.instagram.android.R;
import com.instagram.igds.components.banner.IgdsBanner;
import com.instagram.ui.widget.radiogroup.IgRadioGroup;
import java.util.List;
import java.util.Set;

public abstract class SKI {
    public static void A02(0SM r11, RequestAutofillJSBridgeCall requestAutofillJSBridgeCall, IgRadioGroup igRadioGroup, List list, Set set, boolean z) {
        List list2 = list;
        if (!list.isEmpty()) {
            for (int i = 0; i < list.size(); i++) {
                AutofillData autofillData = (AutofillData) list.get(i);
                if (set != null) {
                    autofillData = C11368SPm.A00(autofillData, set);
                }
                0SM r8 = r11;
                Context requireContext = r11.requireContext();
                autofillData.getClass();
                QA2 A00 = SB3.A00(requireContext, autofillData, z);
                View requireViewById = A00.requireViewById(R.id.extra_btn);
                if (z) {
                    requireViewById.setVisibility(8);
                    Dba.A06(A00).setTextSize(0, (float) DbV.A05(r11).getDimensionPixelSize(R.dimen.account_group_management_row_text_size));
                } else {
                    RequestAutofillJSBridgeCall requestAutofillJSBridgeCall2 = requestAutofillJSBridgeCall;
                    if (requestAutofillJSBridgeCall != null) {
                        AnonymousClass0fU.A00(new C71354Oj9(i, 0, r8, requestAutofillJSBridgeCall2, list2), requireViewById);
                    }
                }
                A00.setTag(autofillData);
                igRadioGroup.addView(A00);
            }
            QA2 qa2 = (QA2) igRadioGroup.getChildAt(0);
            qa2.setChecked(true);
            if (list.size() == 1) {
                DbX.A1B(qa2, R.id.radio_icon);
            }
        }
    }

    public static void A00(Activity activity, Bundle bundle, View view, TextView textView, C270254gR r14, C11265SHz sHz, int i, int i2, int i3, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Activity activity2 = activity;
        RBX rbx = new RBX(activity2, bundle, r14, sHz, DbV.A0n(view.getContext(), R.color.igds_link), z);
        String string = activity2.getString(i3);
        String obj = spannableStringBuilder.append(activity2.getString(i)).append(' ').append(string).append(' ').toString();
        if (textView == null) {
            textView = (TextView) DbY.A0F(view, i2);
        }
        AnonymousClass7AV.A07(rbx, textView, string, obj);
    }

    public static void A01(View view, boolean z) {
        if (z) {
            IgdsBanner igdsBanner = (IgdsBanner) view.requireViewById(R.id.fbpay_disclosure);
            igdsBanner.setBody(Html.fromHtml(view.getResources().getString(2131966481)), false);
            igdsBanner.setVisibility(0);
        }
    }
}
