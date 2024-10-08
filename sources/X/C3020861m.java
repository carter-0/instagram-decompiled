package X;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.ui.widget.edittext.AnimatedHintsTextLayout;

/* renamed from: X.61m  reason: invalid class name and case insensitive filesystem */
public final class C3020861m implements TextWatcher {
    public final /* synthetic */ AnimatedHintsTextLayout A00;

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C3020861m(AnimatedHintsTextLayout animatedHintsTextLayout) {
        this.A00 = animatedHintsTextLayout;
    }

    public final void afterTextChanged(Editable editable) {
        Handler handler = this.A00.A0F;
        handler.sendEmptyMessage(1);
        handler.sendEmptyMessage(0);
    }
}
