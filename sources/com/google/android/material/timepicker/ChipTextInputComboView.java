package com.google.android.material.timepicker;

import X.AnonymousClass7TE;
import X.DbU;
import X.JTQ;
import X.JTR;
import X.UWI;
import android.content.Context;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.android.R;

public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public TextWatcher A00;
    public TextView A01;
    public final EditText A02;
    public final Chip A03;
    public final TextInputLayout A04;

    public final boolean isChecked() {
        return this.A03.isChecked();
    }

    public final void setChecked(boolean z) {
        Chip chip = this.A03;
        chip.setChecked(z);
        EditText editText = this.A02;
        int i = 0;
        editText.setVisibility(JTQ.A00(z ? 1 : 0));
        if (z) {
            i = 8;
        }
        chip.setVisibility(i);
        if (isChecked()) {
            editText.requestFocus();
            if (!TextUtils.isEmpty(editText.getText())) {
                JTR.A1F(editText);
            }
        }
    }

    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.A03.setOnClickListener(onClickListener);
    }

    public final void setTag(int i, Object obj) {
        this.A03.setTag(i, obj);
    }

    public final void toggle() {
        this.A03.toggle();
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, this, false);
        this.A03 = chip;
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, this, false);
        this.A04 = textInputLayout;
        EditText editText = textInputLayout.A0F;
        this.A02 = editText;
        editText.setVisibility(4);
        UWI uwi = new UWI(this);
        this.A00 = uwi;
        editText.addTextChangedListener(uwi);
        this.A02.setImeHintLocales(DbU.A05(this).getConfiguration().getLocales());
        addView(chip);
        addView(textInputLayout);
        this.A01 = AnonymousClass7TE.A0d(this, R.id.material_label);
        editText.setSaveEnabled(false);
    }

    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.A02.setImeHintLocales(DbU.A05(this).getConfiguration().getLocales());
    }

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ChipTextInputComboView(Context context) {
        this(context, (AttributeSet) null);
    }
}
