package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;

/* renamed from: X.5zf  reason: invalid class name and case insensitive filesystem */
public final class C301625zf implements TextView.OnEditorActionListener {
    public final /* synthetic */ RawTextInputView A00;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        if (i != 6) {
            return false;
        }
        this.A00.A01();
        return false;
    }

    public C301625zf(RawTextInputView rawTextInputView) {
        this.A00 = rawTextInputView;
    }
}
