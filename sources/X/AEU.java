package X;

import android.content.Context;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.widget.EditText;
import com.instagram.ui.text.TextColorScheme;
import com.instagram.ui.text.TextColors;

public abstract class AEU {
    public static final void A01(EditText editText, TextColorScheme textColorScheme) {
        0qQ.A0B(editText, 1);
        Editable A00 = A00(editText.getHint());
        if (A00 != null) {
            TextColors textColors = textColorScheme.A04;
            if (textColors != null) {
                Context A0S = AnonymousClass7TE.A0S(editText);
                C358848bZ r0 = (C358848bZ) C263324Kh.A00(A00, C358848bZ.class);
                if (r0 == null) {
                    C358848bZ r1 = new C358848bZ(A0S, textColors);
                    r1.A03 = 128;
                    AnonymousClass7TG.A17(A00, r1);
                } else {
                    r0.A00(textColors);
                }
            }
            editText.setHint(A00);
            editText.invalidate();
        }
    }

    public static final void A02(EditText editText, C358868bb r6) {
        AnonymousClass7TG.A1O(r6, editText);
        Editable A00 = A00(editText.getHint());
        if (A00 != null) {
            Context A0S = AnonymousClass7TE.A0S(editText);
            TextPaint paint = editText.getPaint();
            0qQ.A07(paint);
            AnonymousClass91S.A01(A00, r6, false);
            AnonymousClass91U.A02(A0S, A00, r6);
            AnonymousClass91W.A01(A0S, paint, A00, r6);
            AnonymousClass91Y.A00(editText, r6, (C306386Ly) null);
            AnonymousClass91Z.A00(A00, r6);
            editText.setHint(A00);
        }
    }

    public static final Editable A00(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (!(charSequence instanceof Editable)) {
            charSequence = new SpannableStringBuilder(charSequence);
        }
        return (Editable) charSequence;
    }
}
