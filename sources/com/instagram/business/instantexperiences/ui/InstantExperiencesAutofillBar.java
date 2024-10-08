package com.instagram.business.instantexperiences.ui;

import X.C11498SbL;
import X.DbU;
import X.DbV;
import X.TeZ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.facebook.android.instantexperiences.autofill.model.BrowserExtensionsAutofillData;
import com.facebook.android.instantexperiences.autofill.model.FbAutofillData;
import com.instagram.android.R;
import java.util.Iterator;
import java.util.List;

public class InstantExperiencesAutofillBar extends RelativeLayout {
    private void setAutofillSelectedOnClickListener(View view, TeZ teZ, BrowserExtensionsAutofillData browserExtensionsAutofillData) {
        view.setOnClickListener(new C11498SbL(14, (Object) this, (Object) teZ, (Object) browserExtensionsAutofillData));
    }

    public final void A00(TeZ teZ, List list) {
        ViewGroup viewGroup = (ViewGroup) requireViewById(R.id.autofill_bar_container);
        viewGroup.removeAllViews();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BrowserExtensionsAutofillData browserExtensionsAutofillData = (BrowserExtensionsAutofillData) ((FbAutofillData) it.next());
            View inflate = DbV.A0D(this).inflate(R.layout.instant_experiences_browser_autofill_bar_list_entry, (ViewGroup) null, false);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.setMargins(0, 0, 20, 0);
            inflate.setLayoutParams(layoutParams);
            TextView A0G = DbU.A0G(inflate, R.id.autofill_bar_list_entry_text);
            A0G.setText(browserExtensionsAutofillData.A00());
            setAutofillSelectedOnClickListener(A0G, teZ, browserExtensionsAutofillData);
            viewGroup.addView(inflate);
        }
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public InstantExperiencesAutofillBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public InstantExperiencesAutofillBar(Context context) {
        super(context);
    }
}
