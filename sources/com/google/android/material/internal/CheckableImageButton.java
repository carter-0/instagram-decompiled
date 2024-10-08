package com.google.android.material.internal;

import X.03v;
import X.C14161Tqz;
import X.C14728U4w;
import X.C249703kE;
import X.U7M;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.customview.view.AbsSavedState;
import com.instagram.android.R;

public class CheckableImageButton extends C14728U4w implements Checkable {
    public static final int[] A03 = {16842912};
    public boolean A00;
    public boolean A01;
    public boolean A02;

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C14161Tqz(8);
        public boolean A00;

        public final void writeToParcel(Parcel parcel, int i) {
            CheckableImageButton.super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00 ? 1 : 0);
        }
    }

    public final boolean isChecked() {
        return this.A02;
    }

    public final int[] onCreateDrawableState(int i) {
        if (!this.A02) {
            return super.onCreateDrawableState(i);
        }
        return View.mergeDrawableStates(super.onCreateDrawableState(i + 1), A03);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        setChecked(savedState.A00);
    }

    public void setCheckable(boolean z) {
        if (this.A00 != z) {
            this.A00 = z;
            sendAccessibilityEvent(0);
        }
    }

    public void setChecked(boolean z) {
        if (this.A00 && this.A02 != z) {
            this.A02 = z;
            refreshDrawableState();
            sendAccessibilityEvent(C249703kE.FLAG_MOVED);
        }
    }

    public void setPressable(boolean z) {
        this.A01 = z;
    }

    public void setPressed(boolean z) {
        if (this.A01) {
            super.setPressed(z);
        }
    }

    public final void toggle() {
        setChecked(!this.A02);
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = true;
        this.A01 = true;
        03v.A0B(this, new U7M(this, 2));
    }

    public final Parcelable onSaveInstanceState() {
        AbsSavedState absSavedState = new AbsSavedState(super.onSaveInstanceState());
        absSavedState.A00 = this.A02;
        return absSavedState;
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    public CheckableImageButton(Context context) {
        this(context, (AttributeSet) null);
    }
}
