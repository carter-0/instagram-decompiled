package X;

import android.text.SpannableStringBuilder;
import com.instagram.igds.components.button.IgdsButton;

public final class KIM extends 0lr {
    public final int A00;
    public final Object A01;

    public KIM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String obj;
        if (this.A00 != 0) {
            0qQ.A0B(charSequence, 0);
            KIM.super.onTextChanged(charSequence, i, i2, i3);
            IgdsButton igdsButton = ((C62263Kcx) this.A01).A02;
            if (igdsButton != null) {
                igdsButton.setEnabled(AnonymousClass7TF.A1R(charSequence.length()));
                return;
            }
            return;
        }
        0qQ.A0B(charSequence, 0);
        KIM.super.onTextChanged(charSequence, i, i2, i3);
        LEE lee = (LEE) this.A01;
        C60196JhF jhF = (C60196JhF) lee.A08.getValue();
        SpannableStringBuilder A0C = DbS.A0C(charSequence);
        if (lee.A05.A03.size() >= 20) {
            return;
        }
        if (00l.A07(A0C, "@", A0C.length() - 1) == -1 || (obj = A0C.subSequence(00l.A07(A0C, "@", A0C.length() - 1) + 1, A0C.length()).toString()) == null || 00l.A0d(obj, " ", false)) {
            MGU.A02(jhF, C318116oQ.A00(jhF), 13);
            return;
        }
        DbX.A1W(jhF, obj, C318116oQ.A00(jhF), 34);
        C358418as r1 = jhF.A03;
        r1.A00();
        if (obj.length() != 0) {
            r1.A01();
        }
        AnonymousClass7TF.A1O(jhF.A04.A0L, true);
    }
}
