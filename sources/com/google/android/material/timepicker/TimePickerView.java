package com.google.android.material.timepicker;

import X.AnonymousClass0fD;
import X.C14707U2r;
import X.C17191VLv;
import X.C18887WAz;
import X.C18899WBr;
import X.C270354gb;
import X.JTQ;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.instagram.android.R;

public class TimePickerView extends ConstraintLayout {
    public final View.OnClickListener A00;
    public final Chip A01;
    public final Chip A02;
    public final MaterialButtonToggleGroup A03;
    public final ClockFaceView A04;
    public final ClockHandView A05;

    private void A00() {
        if (this.A03.getVisibility() == 0) {
            C270354gb A0C = JTQ.A0C(this);
            int i = 1;
            if (getLayoutDirection() == 0) {
                i = 2;
            }
            A0C.A09(R.id.material_clock_display, i);
            A0C.A0G(this);
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = new C18887WAz(this, 11);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.A04 = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.A03 = materialButtonToggleGroup;
        materialButtonToggleGroup.A06.add(new C17191VLv(this));
        this.A02 = (Chip) findViewById(R.id.material_minute_tv);
        this.A01 = (Chip) findViewById(R.id.material_hour_tv);
        this.A05 = (ClockHandView) findViewById(R.id.material_clock_hand);
        C18899WBr wBr = new C18899WBr(2, this, new GestureDetector(getContext(), new C14707U2r(this, 0)));
        this.A02.setOnTouchListener(wBr);
        this.A01.setOnTouchListener(wBr);
        Chip chip = this.A02;
        chip.setTag(R.id.selection_type, 12);
        Chip chip2 = this.A01;
        chip2.setTag(R.id.selection_type, 10);
        View.OnClickListener onClickListener = this.A00;
        chip.setOnClickListener(onClickListener);
        chip2.setOnClickListener(onClickListener);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(1296839871);
        super.onAttachedToWindow();
        A00();
        AnonymousClass0fD.A0D(-432852972, A06);
    }

    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            A00();
        }
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context) {
        this(context, (AttributeSet) null);
    }
}
