package X;

import android.view.View;
import android.view.ViewParent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;

/* renamed from: X.V4i  reason: case insensitive filesystem */
public abstract class C16749V4i {
    public static void A00(View view, EditorInfo editorInfo, InputConnection inputConnection) {
        if (inputConnection != null && editorInfo.hintText == null) {
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            }
        }
    }
}
