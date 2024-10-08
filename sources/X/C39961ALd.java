package X;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.ui.text.ConstrainedEditText;

/* renamed from: X.ALd  reason: case insensitive filesystem */
public final class C39961ALd implements TextWatcher {
    public boolean A00;
    public boolean A01;
    public final /* synthetic */ C353798Jc A02;

    public final void afterTextChanged(Editable editable) {
    }

    public C39961ALd(C353798Jc r1) {
        this.A02 = r1;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A00 = TextUtils.isEmpty(charSequence);
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        C353798Jc r3 = this.A02;
        boolean z = !C353798Jc.A0I(r3);
        if (isEmpty != this.A00) {
            ConstrainedEditText constrainedEditText = r3.A0D;
            constrainedEditText.getClass();
            ViewGroup.LayoutParams layoutParams = constrainedEditText.getLayoutParams();
            C353798Jc.A0C(r3);
            C353798Jc.A0G(r3);
            int i4 = -1;
            if (isEmpty) {
                i4 = -2;
            }
            layoutParams.width = i4;
            ConstrainedEditText constrainedEditText2 = r3.A0D;
            constrainedEditText2.getClass();
            constrainedEditText2.setLayoutParams(layoutParams);
        }
        if (z != this.A01) {
            C353798Jc.A08(r3);
            TextView textView = r3.A07;
            textView.getClass();
            textView.setAlpha(1.0f);
        }
        this.A00 = isEmpty;
        this.A01 = z;
    }
}
