package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;

/* renamed from: X.5ze  reason: invalid class name and case insensitive filesystem */
public final class C301615ze implements TextWatcher {
    public final /* synthetic */ RawTextInputView A00;

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public C301615ze(RawTextInputView rawTextInputView) {
        this.A00 = rawTextInputView;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AnonymousClass8G3 r0;
        C301605zd r02 = this.A00.A04;
        if (r02 != null && (r0 = ((C301595zc) r02).A00.A02) != null) {
            String charSequence2 = charSequence.toString();
            C41812B1r b1r = ((AnonymousClass8G2) r0).A02;
            if (b1r != null) {
                b1r.onTextChanged(charSequence2);
            }
        }
    }
}
