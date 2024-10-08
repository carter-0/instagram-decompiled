package X;

import android.text.Editable;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;

/* renamed from: X.9Xw  reason: invalid class name */
public final class AnonymousClass9Xw extends InputConnectionWrapper {
    public final /* synthetic */ RawTextInputView A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9Xw(InputConnection inputConnection, RawTextInputView rawTextInputView) {
        super(inputConnection, true);
        this.A00 = rawTextInputView;
    }

    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        C301645zh r0;
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67 && (r0 = this.A00.A01) != null) {
            RawTextInputView rawTextInputView = ((C301635zg) r0).A00;
            Editable text = rawTextInputView.getText();
            int max = Math.max(text.length() - 1, 0);
            CharSequence subSequence = text.subSequence(0, max);
            rawTextInputView.setText(subSequence);
            rawTextInputView.setSelection(max);
            AnonymousClass8G3 r02 = rawTextInputView.A02;
            if (r02 != null) {
                String charSequence = subSequence.toString();
                C41812B1r b1r = ((AnonymousClass8G2) r02).A02;
                if (b1r != null) {
                    b1r.onTextChanged(charSequence);
                }
            }
        }
        return super.sendKeyEvent(keyEvent);
    }
}
