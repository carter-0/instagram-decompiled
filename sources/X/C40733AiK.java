package X;

import com.facebook.cameracore.mediapipeline.services.uicontrol.instagram.RawTextInputView;

/* renamed from: X.AiK  reason: case insensitive filesystem */
public final class C40733AiK implements Runnable {
    public final /* synthetic */ RawTextInputView A00;

    public C40733AiK(RawTextInputView rawTextInputView) {
        this.A00 = rawTextInputView;
    }

    public final void run() {
        RawTextInputView rawTextInputView = this.A00;
        if (!rawTextInputView.A00.showSoftInput(rawTextInputView, 2)) {
            rawTextInputView.A00.toggleSoftInput(2, 0);
            rawTextInputView.A00.showSoftInput(rawTextInputView, 2);
        }
    }
}
