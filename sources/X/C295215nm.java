package X;

import android.os.Handler;
import android.os.Message;

/* renamed from: X.5nm  reason: invalid class name and case insensitive filesystem */
public final class C295215nm extends Handler {
    public final void handleMessage(Message message) {
        0qQ.A0B(message, 0);
        int i = message.what;
        if (i == 1) {
            Object obj = message.obj;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.ui.touch.TouchAnimator");
            C295205nl.A01((C295205nl) obj);
        } else if (i == 2) {
            Object obj2 = message.obj;
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.common.ui.touch.TouchAnimator");
            C295205nl.A00((C295205nl) obj2);
        }
    }
}
