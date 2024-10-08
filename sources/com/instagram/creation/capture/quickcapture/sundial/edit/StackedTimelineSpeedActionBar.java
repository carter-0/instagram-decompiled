package com.instagram.creation.capture.quickcapture.sundial.edit;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import X.DbT;
import X.JTT;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.mediabutton.IgdsMediaButton;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class StackedTimelineSpeedActionBar extends ConstraintLayout {
    public SeekBar A00;
    public IgTextView A01;
    public IgdsMediaButton A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StackedTimelineSpeedActionBar(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public final void setSpeedDoneButton(IgdsMediaButton igdsMediaButton) {
        0qQ.A0B(igdsMediaButton, 0);
        this.A02 = igdsMediaButton;
    }

    public final void setSpeedLabel(IgTextView igTextView) {
        0qQ.A0B(igTextView, 0);
        this.A01 = igTextView;
    }

    public final void setSpeedSlider(SeekBar seekBar) {
        0qQ.A0B(seekBar, 0);
        this.A00 = seekBar;
    }

    public final IgdsMediaButton getSpeedDoneButton() {
        IgdsMediaButton igdsMediaButton = this.A02;
        if (igdsMediaButton != null) {
            return igdsMediaButton;
        }
        0qQ.A0F("speedDoneButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final IgTextView getSpeedLabel() {
        IgTextView igTextView = this.A01;
        if (igTextView != null) {
            return igTextView;
        }
        0qQ.A0F("speedLabel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final SeekBar getSpeedSlider() {
        SeekBar seekBar = this.A00;
        if (seekBar != null) {
            return seekBar;
        }
        0qQ.A0F("speedSlider");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0fD.A06(-1560600716);
        super.onFinishInflate();
        setSpeedSlider((SeekBar) requireViewById(R.id.speed_slider));
        setSpeedDoneButton((IgdsMediaButton) requireViewById(R.id.speed_done_button));
        setSpeedLabel(DbT.A0a(this, R.id.speed_label));
        AnonymousClass0fD.A0D(-1286310370, A06);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StackedTimelineSpeedActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
    }

    public /* synthetic */ StackedTimelineSpeedActionBar(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }
}
