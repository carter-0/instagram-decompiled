package X;

import android.text.Editable;
import com.facebook.primitive.textinput.TextInputView;

public abstract class HS7 {
    public static final Object A00(C307896Rx r3, AnonymousClass6Tm r4) {
        C52706GbJ gbJ;
        C276544tV A0P = DbY.A0P(r4, 0);
        Object A02 = r4.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.String");
        String str = (String) A02;
        C307786Rm r0 = r3.A03;
        if (r0 == null || (gbJ = (C52706GbJ) C307476Qg.A06(r0, A0P)) == null) {
            return null;
        }
        0qQ.A0B(str, 0);
        C245983dn.A02((String) null);
        TextInputView textInputView = gbJ.A02;
        if (textInputView == null) {
            return null;
        }
        int selectionStart = textInputView.getSelectionStart();
        int selectionEnd = textInputView.getSelectionEnd();
        Editable text = textInputView.getText();
        if (selectionStart != selectionEnd) {
            text.replace(selectionStart, selectionEnd, str);
        } else {
            text.insert(selectionStart, str);
        }
        textInputView.setText(text);
        textInputView.setSelection(selectionStart + str.length());
        return null;
    }
}
