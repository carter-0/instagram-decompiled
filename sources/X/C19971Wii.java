package X;

import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;

/* renamed from: X.Wii  reason: case insensitive filesystem */
public final class C19971Wii implements Runnable {
    public final /* synthetic */ TextInputLayout A00;

    public C19971Wii(TextInputLayout textInputLayout) {
        this.A00 = textInputLayout;
    }

    public final void run() {
        CheckableImageButton checkableImageButton = this.A00.A1D;
        checkableImageButton.performClick();
        checkableImageButton.jumpDrawablesToCurrentState();
    }
}
