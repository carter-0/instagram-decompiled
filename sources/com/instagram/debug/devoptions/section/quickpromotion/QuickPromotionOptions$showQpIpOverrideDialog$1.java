package com.instagram.debug.devoptions.section.quickpromotion;

import X.0qQ;
import X.2Yu;
import X.DbT;
import X.DbV;
import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.widget.TextView;
import com.instagram.android.R;

public final class QuickPromotionOptions$showQpIpOverrideDialog$1 implements TextWatcher {
    public final /* synthetic */ Context $context;
    public final /* synthetic */ TextView $validation;

    public void afterTextChanged(Editable editable) {
        TextView textView;
        Context context;
        int i;
        0qQ.A0B(editable, 0);
        if (editable.length() == 0) {
            this.$validation.setText(2131958179);
            textView = this.$validation;
            context = this.$context;
            i = R.attr.igds_color_primary_text;
        } else {
            boolean A1b = DbV.A1b(editable, Patterns.IP_ADDRESS);
            TextView textView2 = this.$validation;
            if (A1b) {
                textView2.setText(2131958186);
                textView = this.$validation;
                context = this.$context;
                i = R.attr.igds_color_success;
            } else {
                textView2.setText(2131958181);
                textView = this.$validation;
                context = this.$context;
                i = R.attr.igds_color_error_or_destructive;
            }
        }
        DbT.A17(context, textView, 2Yu.A0H(context, i));
        this.$validation.setVisibility(0);
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public QuickPromotionOptions$showQpIpOverrideDialog$1(TextView textView, Context context) {
        this.$validation = textView;
        this.$context = context;
    }
}
