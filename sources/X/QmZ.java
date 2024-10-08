package X;

import android.text.SpannableString;
import android.text.style.CharacterStyle;
import java.util.List;

public final class QmZ extends C11232SGr {
    public final List A00;

    public final SpannableString A01(C13612Tde tde, boolean z) {
        CharacterStyle characterStyle;
        0qQ.A0B(tde, 1);
        SpannableString A01 = super.A01(tde, z);
        0qQ.A0C(A01, "null cannot be cast to non-null type android.text.SpannableString");
        for (C10587Ruh ruh : this.A00) {
            int i = ruh.A02;
            if (i >= 0 && (characterStyle = ruh.A00) != null) {
                A01.setSpan(characterStyle, i, i + ruh.A01, 33);
            }
        }
        return A01;
    }

    public QmZ(CharSequence charSequence, List list, List list2) {
        super(charSequence, list);
        this.A00 = list2;
    }
}
