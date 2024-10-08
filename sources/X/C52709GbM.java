package X;

import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import com.facebook.primitive.textinput.TextInputView;

/* renamed from: X.GbM  reason: case insensitive filesystem */
public abstract class C52709GbM {
    public static final C52711GbO A00(TextInputView textInputView) {
        Drawable drawable;
        if (Build.VERSION.SDK_INT >= 29) {
            drawable = textInputView.getTextCursorDrawable();
        } else {
            drawable = null;
        }
        float letterSpacing = textInputView.getLetterSpacing();
        boolean showSoftInputOnFocus = textInputView.getShowSoftInputOnFocus();
        int highlightColor = textInputView.getHighlightColor();
        Editable text = textInputView.getText();
        float textSize = textInputView.getTextSize();
        ColorStateList textColors = textInputView.getTextColors();
        CharSequence hint = textInputView.getHint();
        ColorStateList hintTextColors = textInputView.getHintTextColors();
        int gravity = textInputView.getGravity();
        Rect rect = new Rect(textInputView.getPaddingLeft(), textInputView.getPaddingTop(), textInputView.getPaddingRight(), textInputView.getPaddingBottom());
        C52710GbN gbN = new C52710GbN(textInputView.getShadowDx(), textInputView.getShadowDy(), textInputView.getShadowRadius(), textInputView.getShadowColor(), 1);
        float lineSpacingExtra = textInputView.getLineSpacingExtra();
        float lineSpacingMultiplier = textInputView.getLineSpacingMultiplier();
        Drawable background = textInputView.getBackground();
        int imeOptions = textInputView.getImeOptions();
        int inputType = textInputView.getInputType();
        KeyListener keyListener = textInputView.getKeyListener();
        boolean A00 = textInputView.A00();
        return new C52711GbO(textColors, hintTextColors, rect, textInputView.getTypeface(), drawable, background, text, textInputView.getEllipsize(), keyListener, gbN, hint, textSize, lineSpacingExtra, lineSpacingMultiplier, letterSpacing, highlightColor, gravity, imeOptions, inputType, textInputView.getMaxLines(), A00, showSoftInputOnFocus);
    }
}
