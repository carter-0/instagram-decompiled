package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.method.KeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* renamed from: X.33y  reason: invalid class name and case insensitive filesystem */
public interface C2364933y {
    boolean A8I(Spannable spannable, int i);

    boolean A8J(Spannable spannable, int i, int i2, int i3);

    boolean A8K(Spannable spannable, int i, boolean z);

    InputConnection AMD(EditorInfo editorInfo, InputConnection inputConnection, EditText editText);

    KeyListener AMI(KeyListener keyListener, EditText editText);

    Drawable B0r(String str, int i);

    Typeface B76(String str);

    void CMS(Context context, 0lg r2, int i);

    boolean CSY();

    CharSequence Cmk(int i, CharSequence charSequence);
}
