package com.instagram.business.instantexperiences.ui;

import X.0qQ;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C10285Rpj;
import X.C11495SbI;
import X.C11498SbL;
import X.DbX;
import X.Pxe;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

public class InstantExperiencesSaveAutofillDialog extends RelativeLayout {
    public Button A00;
    public Button A01;
    public C10285Rpj A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstantExperiencesSaveAutofillDialog(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context);
        Resources resources = getResources();
        AnonymousClass7TG.A0R(this, R.id.instant_experiences_confirm_dialog_title).setText(resources.getString(2131953400));
        String string = resources.getString(2131953397);
        Button button = this.A00;
        0qQ.A0A(button);
        button.setText(string);
        String string2 = resources.getString(2131953398);
        Button button2 = this.A01;
        0qQ.A0A(button2);
        button2.setText(string2);
    }

    private final void A00(Context context) {
        View.inflate(context, R.layout.instant_experiences_confirmation_dialog, this);
        Button button = (Button) requireViewById(R.id.instant_experiences_confirm_dialog_decline_button);
        this.A01 = button;
        0qQ.A0A(button);
        button.setOnClickListener(new C11495SbI(this, 7));
        Button button2 = (Button) requireViewById(R.id.instant_experiences_confirm_dialog_accept_button);
        this.A00 = button2;
        0qQ.A0A(button2);
        button2.setOnClickListener(new C11495SbI(this, 8));
    }

    public final void setDetailItems(List list) {
        View A0G = AnonymousClass7TF.A0G(this, R.id.instant_experiences_confirm_dialog_details);
        if (list == null || list.isEmpty()) {
            A0G.setVisibility(8);
            return;
        }
        TextView A0R = AnonymousClass7TG.A0R(this, R.id.instant_experiences_confirm_dialog_detail_clickable);
        ViewGroup A0I = DbX.A0I(this, R.id.instant_experiences_confirm_dialog_detail_info_container);
        AnonymousClass7TG.A0R(this, R.id.instant_experiences_confirm_dialog_detail_string).setText(Pxe.A0f(list, 0));
        if (list.size() == 1) {
            A0R.setVisibility(8);
            A0I.setVisibility(8);
        } else {
            A0R.setVisibility(0);
            A0R.setText(getResources().getString(2131953401));
            A0R.setOnClickListener(new C11498SbL(15, (Object) A0I, (Object) A0R, (Object) this));
            A0I.removeAllViews();
            int size = list.size();
            for (int i = 1; i < size; i++) {
                Context context = getContext();
                TextView textView = new TextView(context);
                textView.setText(Pxe.A0f(list, i));
                textView.setTextColor(context.getColor(R.color.grey_5));
                A0I.addView(textView);
            }
        }
        A0G.setVisibility(0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InstantExperiencesSaveAutofillDialog(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context);
    }
}
