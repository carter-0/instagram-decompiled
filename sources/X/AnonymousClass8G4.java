package X;

import android.view.KeyEvent;
import android.widget.TextView;
import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;

/* renamed from: X.8G4  reason: invalid class name */
public final class AnonymousClass8G4 implements TextView.OnEditorActionListener {
    public final /* synthetic */ AnonymousClass8G2 A00;

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        String str;
        if (i != 6) {
            return false;
        }
        AnonymousClass8G2 r2 = this.A00;
        C41812B1r b1r = r2.A02;
        if (b1r != null) {
            b1r.onExit();
            r2.A02 = null;
        }
        RawTextInputView rawTextInputView = r2.A01;
        if (rawTextInputView == null || (str = rawTextInputView.getText().toString()) == null) {
            str = "";
        }
        C371648yk r0 = r2.A00;
        if (r0 != null) {
            r0.onTextEditComplete(str);
        }
        r2.A00 = null;
        AnonymousClass8G2.A00(r2);
        return false;
    }

    public AnonymousClass8G4(AnonymousClass8G2 r1) {
        this.A00 = r1;
    }
}
