package X;

import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.EditText;

/* renamed from: X.F4f  reason: case insensitive filesystem */
public abstract class C49740F4f {
    public static void A00(View view, C307786Rm r3, C276544tV r4) {
        if (Build.VERSION.SDK_INT >= 29) {
            EditText editText = (EditText) view;
            Object A06 = C307476Qg.A06(r3, r4);
            A06.getClass();
            ((EtJ) A06).A00 = editText.getTextCursorDrawable();
            editText.setTextCursorDrawable((Drawable) null);
        }
    }

    public static void A01(View view, C307786Rm r3, C276544tV r4) {
        if (Build.VERSION.SDK_INT >= 29) {
            Object A06 = C307476Qg.A06(r3, r4);
            A06.getClass();
            EtJ etJ = (EtJ) A06;
            ((EditText) view).setTextCursorDrawable(etJ.A00);
            etJ.A00 = null;
        }
    }
}
